
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class kumanda {

public volatile boolean config_ip = false;
boolean initok = false;
public String ip_config = "noip";
public HashMap<String, String> adres1 = new HashMap<>();
public List<String> adres2 = new ArrayList<>();
public long volumeMin, volumeMax, volumeCurrent;
public boolean volumeMuted;
public String tvModel;
private boolean error = false;
JComboBox cmbSources, cmbChannels;
JSlider slider;
public static logging LOGGER = new logging();
kumanda k;
Ajax ajaxUpdate = new Ajax();

public static void main(String[] args) {

}

kumanda(JComboBox<String> cmbSources, JComboBox<String> cmbChannels, JSlider slider) {
this.cmbChannels = cmbChannels;
this.cmbSources = cmbSources;
this.slider = slider;
k = this;
}

public static boolean validIP(String ip) {
try {
if (ip == null || ip.isEmpty()) {
return false;
}

String[] parts = ip.split("\\.");
if (parts.length != 4) {
return false;
}

for (String s : parts) {
int i = Integer.parseInt(s);
if ((i < 0) || (i > 255)) {
return false;
}
}
return !ip.endsWith(".");
} catch (NumberFormatException ex) {
LOGGER.logger.append("\n NumberFormatEx:ValidIP->" + ex.getMessage());
return false;
}
}

public void volumeInit() {
try {
if (validIP(ip_config)) {
System.out.println("Volume Init:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/audio/volume");
URLConnection con = (URLConnection) url.openConnection();
con.setDoOutput(true);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());

volumeMuted = (boolean) json.get("muted");
volumeCurrent = (long) json.get("current");
volumeMin = (long) json.get("min");
volumeMax = (long) json.get("max");
}
} catch (IOException | ParseException ex) {
bağlantıError("Volume Initialize Error.." + ex.getMessage());
}
}

public void systemInit() {
try {
if (validIP(ip_config)) {
System.out.println("Sistem Init:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/system/model");
URLConnection con = (URLConnection) url.openConnection();
con.setDoOutput(true);

BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());

tvModel = (String) json.get("model");
}
} catch (IOException | ParseException ex) {

LOGGER.logger.append("\n System Initialize Error..");
}
}

public ComboItem[] sourcesInit() {
ComboItem[] sources = null;
try {
if (validIP(ip_config)) {
System.out.println("Sources Init:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/sources");
URLConnection con = (URLConnection) url.openConnection();

con.setDoOutput(true);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());
sources = new ComboItem[json.size()];
int i = 0;
for (Object keyStr : json.keySet()) {
Object keyvalue = ((JSONObject) json.get(keyStr)).get("name");
sources[i] = new ComboItem((String) keyvalue, (String) keyStr);
i++;
}

}
} catch (IOException | ParseException ex) {

LOGGER.logger.append("\n Sources Initialize Error..");
}
return sources;

}

public ComboItem[] channelsInit() {
ComboItem[] channels = null;
try {
if (validIP(ip_config)) {
System.out.println("Kanal Init:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/channels");
URLConnection con = (URLConnection) url.openConnection();
con.setDoOutput(true);

BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());
channels = new ComboItem[json.size()];
int i = 0;
for (Object keyStr : json.keySet()) {
Object keyvalue = json.get(keyStr);
channels[++i] = new ComboItem((String) keyStr, (String) keyvalue);
}
}
} catch (IOException | ParseException ex) {

LOGGER.logger.append("\n Kanal Initialize Error..");

}
return channels;
}

@SuppressWarnings("unchecked")
public void init() {
System.out.println();

LOGGER.logger.append("\n INITIALIZE REMOTE CONTROL:" + ip_config);
volumeInit();
initok = true;
systemInit();
cmbSources.setModel(new DefaultComboBoxModel(sourcesInit()));
cmbSources.setSelectedIndex(-1);
try {
cmbChannels.setModel(new DefaultComboBoxModel(channelsInit()));
cmbChannels.setSelectedIndex(-1);
} catch (Exception e) {

LOGGER.logger.append("\n KANAL YOK.");

}
ajaxUpdate.baslat();

}

public void bağlantıError(String ex) {

if (error) {
System.err.println(ex);

LOGGER.logger.append("\n " + ex);
} else {
ajaxUpdate.durdur();
bağlantıTest();
error = true;
}

}

public void mtAjaxUpdate() {

slider.setValue((int) volumeCurrent());
cmbSources.setSelectedItem(sourceCurrent());
cmbChannels.setSelectedItem(kanalCurrent());
}

void bağlantıTest() {

LOGGER.logger.append("\n CONNECTION RETRY:" + ip_config);
if (validIP(ip_config)) {
if (bağlantı(ip_config)) {
ajaxUpdate.baslat();
error = false;
if (!initok) {
init();
}
}
}
}

private String getDottedDecimalIP(byte[] ipAddr) {
//convert to dotted decimal notation:
String ipAddrStr = "";
for (int i = 0; i < ipAddr.length; i++) {
if (i > 0) {
ipAddrStr += ".";
}
ipAddrStr += ipAddr[i] & 0xFF;
}
return ipAddrStr;
}

private byte[] getLocalIPAddress() {
try {
for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
NetworkInterface intf = en.nextElement();
for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
InetAddress inetAddress = enumIpAddr.nextElement();
if (!inetAddress.isLoopbackAddress()) {
if (inetAddress instanceof Inet4Address) { // fix for Galaxy Nexus. IPv4 is easy to use :-) 
return inetAddress.getAddress();
}
//return inetAddress.getHostAddress().toString(); // Galaxy Nexus returns IPv6 
}
}
}
} catch (SocketException | NullPointerException ex) {
//Log.e("AndroidNetworkAddressFactory", "getLocalIPAddress()", ex); 
}
return null;
}

public void bağlantıBul() {
Runnable THREAD = () -> {
/*InetAddress localhost = null;
try {
localhost = InetAddress.getLocalHost();
} catch (UnknownHostException e1) {

LOGGER.logger.append("\n LAN tarama gerçekleştirilemiyor.");

return;
}
byte[] ip = localhost.getAddress();
 */
byte[] ip = this.getLocalIPAddress();
String str = getDottedDecimalIP(ip);
System.out.println(str);
for (int i = 1; i <= 254; i++) {
final int j = i;  // i as non-final variable cannot be referenced from inner class
if (!config_ip) {
new Thread(() -> {
try {
ip[3] = (byte) j;
InetAddress address = InetAddress.getByAddress(ip);
String output = address.toString().substring(1);
if (address.isReachable(100)) {
config_ip = bağlantı(output);

if (config_ip) {
String metin = config_ip ? "Evet" : "Hayır";
ip_config = output;
LOGGER.logger.append("\n " + output + " cevap veriyor. TV Bilgisi:" + metin);
//adres1.put(output, address.getHostName());
init();
}
}
/*else {
adres2.add(output);
}*/
} catch (IOException ex) {
LOGGER.logger.append("\n " + ex.getMessage());
}
} // new thread for parallel execution
).start();     // dont forget to start the thread
try {
Thread.sleep(100);
} catch (InterruptedException ex) {
LOGGER.logger.append("\n " + ex.getMessage());
}
}
}
};
Thread THR = new Thread(THREAD);
THR.start();
try {
THR.join();
Thread.sleep(1000);
} catch (InterruptedException ex) {
LOGGER.logger.append("\n " + ex.getMessage());
}
}

void yazdır() {
List<String> ById = new ArrayList<>(adres1.keySet());
Collections.sort(ById, (a, b) -> {
int[] aOct = Arrays.stream(a.split("\\.")).mapToInt(Integer::parseInt).toArray();
int[] bOct = Arrays.stream(b.split("\\.")).mapToInt(Integer::parseInt).toArray();
int r = 0;
for (int i = 0; i < aOct.length && i < bOct.length; i++) {
r = Integer.compare(aOct[i], bOct[i]);
if (r != 0) {
return r;
}
}
return r;
});

Collections.sort(adres2, (a, b) -> {
int[] aOct = Arrays.stream(a.split("\\.")).mapToInt(Integer::parseInt).toArray();
int[] bOct = Arrays.stream(b.split("\\.")).mapToInt(Integer::parseInt).toArray();
int r = 0;
for (int i = 0; i < aOct.length && i < bOct.length; i++) {
r = Integer.compare(aOct[i], bOct[i]);
if (r != 0) {
return r;
}
}
return r;
});
// Display the TreeMap which is naturally sorted
ById.forEach((x) -> {
System.out.println("Key = " + x + ", Value = " + adres1.get(x) + " Ulaşıldı.");
});

adres2.forEach((item) -> {
System.err.println(item + " Ulaşılamadı.");
});
}

boolean bağlantı(String ip) {
try {
URL url = new URL("http://" + ip + ":1925/1/system/model");
URLConnection con = (URLConnection) url.openConnection();

con.setDoOutput(true);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());

tvModel = (String) json.get("model");
return true;
} catch (IOException | ParseException ex) {
LOGGER.logger.append("\n " + ip + " numarasına Bağlanılamadı..");
}
return false;

}

void komutGönder(String key) {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\n " + "Send Komut:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/input/key");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("POST");
con.setRequestProperty("Content-Type", "application/json; utf-8");
con.setRequestProperty("Accept", "application/json");
con.setDoOutput(true);
String jsonInputString = "{\"key\": \"" + key + "\"}";
OutputStream os = con.getOutputStream();
byte[] input = jsonInputString.getBytes("utf-8");
os.write(input, 0, input.length);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
}
} catch (IOException ex) {

bağlantıError("Komut Gönderme Error..:" + ex.getMessage());

}
}

public long volumeCurrent() {

if (validIP(ip_config)) {
LOGGER.logger.append("\n Volume Current:" + ip_config);
try {
String requestURL = "http://" + ip_config + ":1925/1/audio/volume";
URL url = new URL(requestURL);
URLConnection con = (URLConnection) url.openConnection();

con.setDoOutput(true);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());

// Veri alınıyor..
volumeMuted = (boolean) json.get("muted");
volumeCurrent = (long) json.get("current");
volumeMin = (long) json.get("min");
volumeMax = (long) json.get("max");
return volumeCurrent;
} catch (IOException | ParseException ex) {

bağlantıError("Volume Current Error:" + ex.getMessage());
}
}
return 0;

}

void volumeSet(int i, boolean mute) {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\n Volume Set:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/audio/volume");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("POST");
con.setRequestProperty("Content-Type", "application/json; utf-8");
con.setRequestProperty("Accept", "application/json");
con.setDoOutput(true);
String jsonInputString = "{\"current\": \"" + i + "\", \"muted\": \"" + mute + "\" }";
OutputStream os = con.getOutputStream();
byte[] input = jsonInputString.getBytes("utf-8");
os.write(input, 0, input.length);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}

}
} catch (IOException ex) {
bağlantıError("Volume Set Error:" + ex.getMessage());

}

}

void sourcesSet(String text) {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\n Sources Set:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/sources/current");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("POST");
con.setRequestProperty("Content-Type", "application/json; utf-8");
con.setRequestProperty("Accept", "application/json");
con.setDoOutput(true);
String jsonInputString = "{\"id\": \"" + text + "\"}";
OutputStream os = con.getOutputStream();
byte[] input = jsonInputString.getBytes("utf-8");
os.write(input, 0, input.length);

BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
}
} catch (IOException ex) {
bağlantıError("Sources Set Data Error..:" + ex.getMessage());

}

}

void channelsSet(String text) {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\n Kanal Set:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/channels/current");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("POST");
con.setRequestProperty("Content-Type", "application/json; utf-8");
con.setRequestProperty("Accept", "application/json");
con.setDoOutput(true);
String jsonInputString = "{\"id\": \"" + text + "\"}";
OutputStream os = con.getOutputStream();
byte[] input = jsonInputString.getBytes("utf-8");
os.write(input, 0, input.length);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}

}
} catch (IOException ex) {
bağlantıError("Channels Set Data Error:" + ex.getMessage());

}

}

public ComboItem sourceCurrent() {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\nSources Current:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/sources/current");
URLConnection con = (URLConnection) url.openConnection();

con.setDoOutput(true);
BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());
Object keyvalue = json.get("id");
return ComboItemBul((String) keyvalue);
}
} catch (IOException | ParseException ex) {
LOGGER.logger.append("\nSources Get Data Error..");

}
return null;

}

public ComboItem kanalCurrent() {
try {
if (validIP(ip_config)) {
LOGGER.logger.append("\n Kanal Current:" + ip_config);
URL url = new URL("http://" + ip_config + ":1925/1/channels/current");
URLConnection con = (URLConnection) url.openConnection();

con.setDoOutput(true);

BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
StringBuilder response = new StringBuilder();
String responseLine = null;
while ((responseLine = br.readLine()) != null) {
response.append(responseLine.trim());
}
JSONParser parser = new JSONParser();
JSONObject json = (JSONObject) parser.parse(response.toString());
String keyvalue = json.get("id").toString();
return new ComboItem("id", (String) keyvalue);
}
} catch (IOException | ParseException ex) {
LOGGER.logger.append("\n Channels Get Data Error..");

}
return null;

}

private ComboItem ComboItemBul(String string) {
ComboItem[] sources;
sources = new ComboItem[cmbSources.getItemCount()];
for (int i = 0; i < cmbSources.getItemCount(); i++) {
sources[i] = (ComboItem) cmbSources.getItemAt(i);
}
for (ComboItem source : sources) {
if (source.getId().equals(string)) {
return source;
}
}
return null;
}

class Ajax implements Runnable {

private boolean dur = false;

public synchronized void durdur() {
dur = true;
}

public synchronized void baslat() {
dur = false;
this.run();
}

private synchronized boolean running() {
return dur == false;
}

@Override
public void run() {
while (running()) {
LOGGER.logger.append("\n Running AjaxUpdate");
k.mtAjaxUpdate();
try {
TimeUnit.SECONDS.sleep(1);
} catch (InterruptedException e) {

LOGGER.logger.append("\n" + e.getMessage());
}

}
}
}

}

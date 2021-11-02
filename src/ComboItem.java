
import java.util.Objects;

public  class ComboItem {

 private final String text;
 private final String id;

 public ComboItem(String text, String id) {
  this.text = text;
  this.id = id;
 }

 @Override
 public String toString() {
  return text;
 }

 public String getText() {
  return text;
 }

 public String getId() {
  return id;
 }
///setselecteditem için aşağıdaki kodları ekledim.

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (!(obj instanceof ComboItem)) {
   return false;
  }

  ComboItem other = (ComboItem) obj;
  return this.text.equals(other.text);
 }

 @Override
 public int hashCode() {
  int hash = 7;
  hash = 67 * hash + Objects.hashCode(this.text);
  return hash;
 }
}

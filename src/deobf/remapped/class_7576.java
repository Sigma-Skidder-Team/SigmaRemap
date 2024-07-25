package remapped;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class class_7576 implements class_1699 {
   private byte[] field_38602;
   private TreeMap<String, String> field_38601 = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);

   public Iterator<String> ࢹ鶲刃셴ꦱ嘖() {
      return Collections.<String>unmodifiableSet(this.field_38601.keySet()).iterator();
   }

   public String 댠ኞ쇽蓳牰픓(String var1) {
      String var4 = this.field_38601.get(var1);
      return var4 != null ? var4 : "";
   }

   public byte[] ࢹ瀧刃Ꮺ哺㔢() {
      return this.field_38602;
   }

   public void 㼜埙頉㥇묙웨(byte[] var1) {
      this.field_38602 = var1;
   }

   public void 綋浣哝卫柿待(String var1, String var2) {
      this.field_38601.put(var1, var2);
   }

   public boolean 퉧䎰뵯蒕娍ኞ(String var1) {
      return this.field_38601.containsKey(var1);
   }
}

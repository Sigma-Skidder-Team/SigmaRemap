package remapped;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class_4199 {
   private String field_20424;
   private String field_20422;
   private Map<String, String> field_20423 = new HashMap<String, String>();

   public String method_19546() {
      return this.field_20424;
   }

   public void method_19549(String var1) {
      this.field_20424 = var1;
   }

   public String method_19542() {
      return this.field_20422;
   }

   public void method_19547(String var1) {
      this.field_20422 = var1;
   }

   public Map<String, String> method_19540() {
      return this.field_20423;
   }

   public void method_19543(String var1) {
      this.field_20423.put(var1, null);
   }

   public void method_19545(String var1, String var2) {
      this.field_20423.put(var1, var2);
   }

   public void method_19544(String var1, int var2) {
      this.field_20423.put(var1, String.valueOf(var2));
   }

   public class_4199() {
   }

   public class_4199(String var1) {
      this.field_20422 = var1;
   }

   public class_4199(String var1, String var2) {
      this.field_20422 = var1;
      this.field_20424 = var2;
   }

   public String method_19541() {
      StringBuilder var3 = new StringBuilder();
      if (this.field_20422 != null) {
         var3.append(this.field_20422 + " ");
      }

      Iterator var4 = this.field_20423.entrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         String var6 = (String)var5.getKey();
         String var7 = (String)var5.getValue();
         if (var7 == null) {
            var7 = "";
         }

         String var8 = String.format("--%s %s", var6, var7).trim();
         if (var6.length() == 1) {
            var8 = String.format("-%s %s", var6, var7).trim();
         }

         var3.append(var8 + " ");
         var4.remove();
      }

      return var3.toString().trim();
   }
}

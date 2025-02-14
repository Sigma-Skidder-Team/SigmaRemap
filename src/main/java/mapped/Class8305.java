package mapped;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Class8305 {
   private String field35700;
   private String field35701;
   private Map<String, String> field35702 = new HashMap<String, String>();

   public String method29052() {
      return this.field35700;
   }

   public void method29053(String var1) {
      this.field35700 = var1;
   }

   public String method29054() {
      return this.field35701;
   }

   public void method29055(String var1) {
      this.field35701 = var1;
   }

   public Map<String, String> method29056() {
      return this.field35702;
   }

   public void method29057(String var1) {
      this.field35702.put(var1, null);
   }

   public void method29058(String var1, String var2) {
      this.field35702.put(var1, var2);
   }

   public void method29059(String var1, int var2) {
      this.field35702.put(var1, String.valueOf(var2));
   }

   public Class8305() {
   }

   public Class8305(String var1) {
      this.field35701 = var1;
   }

   public Class8305(String var1, String var2) {
      this.field35701 = var1;
      this.field35700 = var2;
   }

   public String method29060() {
      StringBuilder var3 = new StringBuilder();
      if (this.field35701 != null) {
         var3.append(this.field35701 + " ");
      }

      Iterator var4 = this.field35702.entrySet().iterator();

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

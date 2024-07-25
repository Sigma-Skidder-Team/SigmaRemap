package remapped;

public class class_4351 extends Thread {
   private static String[] field_21321;
   private String field_21319 = null;
   private class_5100 field_21320 = null;

   public class_4351(String var1, class_5100 var2) {
      this.field_21319 = var1;
      this.field_21320 = var2;
   }

   @Override
   public void run() {
      try {
         byte[] var3 = class_2316.method_10645(this.field_21319, MinecraftClient.method_8510().method_8607());
         this.field_21320.method_23421(this.field_21319, var3, (Throwable)null);
      } catch (Exception var4) {
         this.field_21320.method_23421(this.field_21319, (byte[])null, var4);
      }
   }

   public String method_20208() {
      return this.field_21319;
   }

   public class_5100 method_20206() {
      return this.field_21320;
   }
}

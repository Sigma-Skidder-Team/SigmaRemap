package mapped;

import net.minecraft.client.Minecraft;

public class Class367 extends Thread {
   private static String[] field1610;
   private String field1611 = null;
   private Class8512 field1612 = null;

   public Class367(String var1, Class8512 var2) {
      this.field1611 = var1;
      this.field1612 = var2;
   }

   @Override
   public void run() {
      try {
         byte[] var3 = Class7615.method24949(this.field1611, Minecraft.getInstance().getProxy());
         this.field1612.method30152(this.field1611, var3, (Throwable)null);
      } catch (Exception var4) {
         this.field1612.method30152(this.field1611, (byte[])null, var4);
      }
   }

   public String method1842() {
      return this.field1611;
   }

   public Class8512 method1843() {
      return this.field1612;
   }
}

package mapped;

import net.minecraft.util.ResourceLocation;

public class Class1458 implements Runnable {
   private static String[] field7840;
   private AbstractClientPlayerEntity field7841;
   private ResourceLocation field7842;
   private boolean field7843;

   public Class1458(AbstractClientPlayerEntity var1, ResourceLocation var2) {
      this.field7841 = var1;
      this.field7842 = var2;
   }

   @Override
   public void run() {
   }

   public Class1806 method6460(Class1806 var1) {
      Class1806 var4 = Class8156.method28292(var1);
      this.field7843 = Class8156.method28293(var1, var4);
      return var4;
   }

   public void method6461() {
      if (this.field7841 != null) {
         this.field7841.method5381(this.field7842);
         this.field7841.method5383(this.field7843);
      }

      this.method6462();
   }

   public void method6462() {
      this.field7841 = null;
   }

   public boolean method6463() {
      return this.field7843;
   }
}

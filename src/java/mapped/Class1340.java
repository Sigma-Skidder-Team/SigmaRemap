package mapped;

import net.minecraft.util.text.ITextComponent;

public final class Class1340 implements Class1339 {
   private long field7112 = Util.milliTime();

   @Override
   public void displaySavingString(ITextComponent var1) {
   }

   @Override
   public void method6417(ITextComponent var1) {
   }

   @Override
   public void method6419(int var1) {
      if (Util.milliTime() - this.field7112 >= 1000L) {
         this.field7112 = Util.milliTime();
         MinecraftServer.method1453().info("Converting... {}%", var1);
      }
   }

   @Override
   public void method6420() {
   }

   @Override
   public void method6418(ITextComponent var1) {
   }
}

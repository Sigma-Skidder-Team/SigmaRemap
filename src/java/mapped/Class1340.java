package mapped;

import net.minecraft.util.text.ITextComponent;

public final class Class1340 implements Class1339 {
   private long field7112 = Util.method38487();

   @Override
   public void method6416(ITextComponent var1) {
   }

   @Override
   public void method6417(ITextComponent var1) {
   }

   @Override
   public void method6419(int var1) {
      if (Util.method38487() - this.field7112 >= 1000L) {
         this.field7112 = Util.method38487();
         Class314.method1453().info("Converting... {}%", var1);
      }
   }

   @Override
   public void method6420() {
   }

   @Override
   public void method6418(ITextComponent var1) {
   }
}

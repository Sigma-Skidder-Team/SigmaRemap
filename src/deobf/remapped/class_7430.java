package remapped;

import net.minecraft.util.text.ITextComponent;

public abstract class class_7430 extends class_7114 {
   public class_7430(int var1, int var2, int var3, int var4, ITextComponent var5) {
      super(var1, var2, var3, var4, var5);
   }

   public abstract void method_33827();

   @Override
   public void method_32694(double var1, double var3) {
      this.method_33827();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!this.field_36675 || !this.field_36677) {
         return false;
      } else if (var1 != 257 && var1 != 32 && var1 != 335) {
         return false;
      } else {
         this.method_32692(MinecraftClient.method_8510().method_8590());
         this.method_33827();
         return true;
      }
   }
}

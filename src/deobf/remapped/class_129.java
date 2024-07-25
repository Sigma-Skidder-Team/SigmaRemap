package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_129 extends class_7114 {
   public double field_319;

   public class_129(int var1, int var2, int var3, int var4, ITextComponent var5, double var6) {
      super(var1, var2, var3, var4, var5);
      this.field_319 = var6;
   }

   @Override
   public int method_32684(boolean var1) {
      return 0;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return new TranslationTextComponent("gui.narrate.slider", this.method_32685());
   }

   @Override
   public void method_32706(class_7966 var1, class_1893 var2, int var3, int var4) {
      var2.method_8577().method_35674(field_36678);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      int var7 = (!this.method_32703() ? 1 : 2) * 20;
      this.method_9781(var1, this.field_36670 + (int)(this.field_319 * (double)(this.field_36671 - 8)), this.field_36674, 0, 46 + var7, 4, 20);
      this.method_9781(var1, this.field_36670 + (int)(this.field_319 * (double)(this.field_36671 - 8)) + 4, this.field_36674, 196, 46 + var7, 4, 20);
   }

   @Override
   public void method_32694(double var1, double var3) {
      this.method_398(var1);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      boolean var6 = var1 == 263;
      if (var6 || var1 == 262) {
         float var7 = !var6 ? 1.0F : -1.0F;
         this.method_397(this.field_319 + (double)(var7 / (float)(this.field_36671 - 8)));
      }

      return false;
   }

   private void method_398(double var1) {
      this.method_397((var1 - (double)(this.field_36670 + 4)) / (double)(this.field_36671 - 8));
   }

   private void method_397(double var1) {
      double var5 = this.field_319;
      this.field_319 = class_9299.method_42827(var1, 0.0, 1.0);
      if (var5 != this.field_319) {
         this.method_399();
      }

      this.method_396();
   }

   @Override
   public void method_32697(double var1, double var3, double var5, double var7) {
      this.method_398(var1);
      super.method_32697(var1, var3, var5, var7);
   }

   @Override
   public void method_32692(class_3541 var1) {
   }

   @Override
   public void method_32704(double var1, double var3) {
      super.method_32692(class_1893.method_8510().method_8590());
   }

   public abstract void method_396();

   public abstract void method_399();
}

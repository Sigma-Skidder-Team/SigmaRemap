package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class1236 extends Class1197 {
   public double field6584;

   public Class1236(int var1, int var2, int var3, int var4, ITextComponent var5, double var6) {
      super(var1, var2, var3, var4, var5);
      this.field6584 = var6;
   }

   @Override
   public int method5729(boolean var1) {
      return 0;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return new TranslationTextComponent("gui.narrate.slider", this.method5745());
   }

   @Override
   public void method5731(Class9332 var1, Minecraft var2, int var3, int var4) {
      var2.getTextureManager().bindTexture(field6474);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      int var7 = (!this.method5737() ? 1 : 2) * 20;
      this.method5696(var1, this.field6477 + (int)(this.field6584 * (double)(this.field6475 - 8)), this.field6478, 0, 46 + var7, 4, 20);
      this.method5696(var1, this.field6477 + (int)(this.field6584 * (double)(this.field6475 - 8)) + 4, this.field6478, 196, 46 + var7, 4, 20);
   }

   @Override
   public void method5732(double var1, double var3) {
      this.method5816(var1);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      boolean var6 = var1 == 263;
      if (var6 || var1 == 262) {
         float var7 = !var6 ? 1.0F : -1.0F;
         this.method5817(this.field6584 + (double)(var7 / (float)(this.field6475 - 8)));
      }

      return false;
   }

   private void method5816(double var1) {
      this.method5817((var1 - (double)(this.field6477 + 4)) / (double)(this.field6475 - 8));
   }

   private void method5817(double var1) {
      double var5 = this.field6584;
      this.field6584 = MathHelper.method37778(var1, 0.0, 1.0);
      if (var5 != this.field6584) {
         this.method5812();
      }

      this.method5813();
   }

   @Override
   public void method5734(double var1, double var3, double var5, double var7) {
      this.method5816(var1);
      super.method5734(var1, var3, var5, var7);
   }

   @Override
   public void method5739(Class274 var1) {
   }

   @Override
   public void method5733(double var1, double var3) {
      super.method5739(Minecraft.getInstance().method1546());
   }

   public abstract void method5813();

   public abstract void method5812();
}

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class853 extends Class851<Class5829> implements Class854 {
   private static final ResourceLocation field4754 = new ResourceLocation("textures/gui/container/crafting_table.png");
   private static final ResourceLocation field4755 = new ResourceLocation("textures/gui/recipe_button.png");
   private final Class1254 field4756 = new Class1254();
   private boolean field4757;

   public Class853(Class5829 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field4757 = this.field4564 < 379;
      this.field4756.method5833(this.field4564, this.field4565, this.field4562, this.field4757, this.field4727);
      this.field4734 = this.field4756.method5837(this.field4757, this.field4564, this.field4721);
      this.field4561.add(this.field4756);
      this.method5536(this.field4756);
      this.<Class1243>method2455(new Class1243(this.field4734 + 5, this.field4565 / 2 - 49, 20, 18, 0, 0, 19, field4755, var1 -> {
         this.field4756.method5834(this.field4757);
         this.field4756.method5838();
         this.field4734 = this.field4756.method5837(this.field4757, this.field4564, this.field4721);
         ((Class1243)var1).method5819(this.field4734 + 5, this.field4565 / 2 - 49);
      }));
      this.field4723 = 29;
   }

   @Override
   public void method1919() {
      super.method1919();
      this.field4756.method5844();
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      if (this.field4756.method5839() && this.field4757) {
         this.method2618(var1, var4, var2, var3);
         this.field4756.method1923(var1, var2, var3, var4);
      } else {
         this.field4756.method1923(var1, var2, var3, var4);
         super.method1923(var1, var2, var3, var4);
         this.field4756.method5850(var1, this.field4734, this.field4735, true, var4);
      }

      this.method2615(var1, var2, var3);
      this.field4756.method5846(var1, this.field4734, this.field4735, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4754);
      int var7 = this.field4734;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
   }

   @Override
   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field4757 || !this.field4756.method5839()) && super.method2625(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field4756.method1958(var1, var3, var5)) {
         this.method5534(this.field4756);
         return true;
      } else {
         return this.field4757 && this.field4756.method5839() ? true : super.method1958(var1, var3, var5);
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field4721) || var3 >= (double)(var6 + this.field4722);
      return this.field4756.method5852(var1, var3, this.field4734, this.field4735, this.field4721, this.field4722, var7) && var10;
   }

   @Override
   public void method2626(Class5839 var1, int var2, int var3, Class2259 var4) {
      super.method2626(var1, var2, var3, var4);
      this.field4756.method5841(var1);
   }

   @Override
   public void method2631() {
      this.field4756.method5856();
   }

   @Override
   public void onClose() {
      this.field4756.method5836();
      super.onClose();
   }

   @Override
   public Class1254 method2632() {
      return this.field4756;
   }
}
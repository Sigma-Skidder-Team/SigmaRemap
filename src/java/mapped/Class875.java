package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class875<T extends Class5823> extends Class851<T> implements Class876 {
   private static String[] field4850;
   private ResourceLocation field4851;

   public Class875(T var1, PlayerInventory var2, ITextComponent var3, ResourceLocation var4) {
      super((T)var1, var2, var3);
      this.field4851 = var4;
   }

   public void method2716() {
   }

   @Override
   public void method1921() {
      super.method1921();
      this.method2716();
      this.field4727.method18127(this);
   }

   @Override
   public void onClose() {
      super.onClose();
      this.field4727.method18128(this);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);
      RenderSystem.disableBlend();
      this.method2717(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   public void method2717(MatrixStack var1, int var2, int var3, float var4) {
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(this.field4851);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      this.method5696(var1, var7 + 59, var8 + 20, 0, this.field4722 + (!this.field4727.method18131(0).method18266() ? 16 : 0), 110, 16);
      if ((this.field4727.method18131(0).method18266() || this.field4727.method18131(1).method18266()) && !this.field4727.method18131(2).method18266()) {
         this.method5696(var1, var7 + 99, var8 + 45, this.field4721, 0, 28, 21);
      }
   }

   @Override
   public void method2718(Class5812 var1, NonNullList<ItemStack> var2) {
      this.method2720(var1, 0, var1.method18131(0).method18265());
   }

   @Override
   public void method2719(Class5812 var1, int var2, int var3) {
   }

   @Override
   public void method2720(Class5812 var1, int var2, ItemStack var3) {
   }
}

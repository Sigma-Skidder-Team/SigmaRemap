package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class874 extends Class851<Class5817> {
   private static final ResourceLocation field4849 = new ResourceLocation("textures/gui/container/dispenser.png");

   public Class874(Class5817 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field4723 = (this.field4721 - this.field4568.method38821(this.field4560)) / 2;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4849);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
   }
}

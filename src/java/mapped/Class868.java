package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class868 extends Class851<Class5813> implements Class867<Class5813> {
   private static final ResourceLocation field4815 = new ResourceLocation("textures/gui/container/generic_54.png");
   private final int field4816;

   public Class868(Class5813 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field4567 = false;
      short var6 = 222;
      byte var7 = 114;
      this.field4816 = var1.method18165();
      this.field4722 = 114 + this.field4816 * 18;
      this.field4726 = this.field4722 - 94;
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
      this.field4562.getTextureManager().bindTexture(field4815);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4816 * 18 + 17);
      this.method5696(var1, var7, var8 + this.field4816 * 18 + 17, 0, 126, this.field4721, 96);
   }
}

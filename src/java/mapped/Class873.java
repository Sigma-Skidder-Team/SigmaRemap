package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class873 extends Class851<Class5814> {
   private static final ResourceLocation field4848 = new ResourceLocation("textures/gui/container/shulker_box.png");

   public Class873(Class5814 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field4722++;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4848);
      int var7 = (this.width - this.field4721) / 2;
      int var8 = (this.height - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
   }
}

package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class1126 extends Class851<Class5815> {
   private static final ResourceLocation field6165 = new ResourceLocation("textures/gui/container/grindstone.png");

   public Class1126(Class5815 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.method2618(var1, var4, var2, var3);
      super.render(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field6165);
      int var7 = (this.width - this.field4721) / 2;
      int var8 = (this.height - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      if ((this.field4727.method18131(0).method18266() || this.field4727.method18131(1).method18266()) && !this.field4727.method18131(2).method18266()) {
         this.method5696(var1, var7 + 92, var8 + 31, this.field4721, 0, 28, 21);
      }
   }
}

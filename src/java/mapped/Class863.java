package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class Class863 extends Class851<Class5819> {
   private static final ResourceLocation field4794 = new ResourceLocation("textures/gui/container/brewing_stand.png");
   private static final int[] field4795 = new int[]{29, 24, 20, 16, 11, 6, 0};

   public Class863(Class5819 var1, PlayerInventory var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void init() {
      super.init();
      this.field4723 = (this.field4721 - this.fontRenderer.method38821(this.title)) / 2;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      super.render(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field4794);
      int var7 = (this.width - this.field4721) / 2;
      int var8 = (this.height - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      int var9 = this.field4727.method18174();
      int var10 = MathHelper.method37775((18 * var9 + 20 - 1) / 20, 0, 18);
      if (var10 > 0) {
         this.method5696(var1, var7 + 60, var8 + 44, 176, 29, var10, 4);
      }

      int var11 = this.field4727.method18175();
      if (var11 > 0) {
         int var12 = (int)(28.0F * (1.0F - (float)var11 / 400.0F));
         if (var12 > 0) {
            this.method5696(var1, var7 + 97, var8 + 16, 176, 0, 9, var12);
         }

         var12 = field4795[var11 / 2 % 7];
         if (var12 > 0) {
            this.method5696(var1, var7 + 63, var8 + 14 + 29 - var12, 185, 29 - var12, 12, var12);
         }
      }
   }
}

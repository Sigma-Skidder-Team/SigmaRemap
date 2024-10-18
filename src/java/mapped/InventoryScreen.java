package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.TranslationTextComponent;

public class InventoryScreen extends Class860<PlayerContainer> implements Class854 {
   private static final ResourceLocation field4765 = new ResourceLocation("textures/gui/recipe_button.png");
   private float field4766;
   private float field4767;
   private final Class1254 field4768 = new Class1254();
   private boolean field4769;
   private boolean field4770;
   private boolean field4771;

   public InventoryScreen(PlayerEntity var1) {
      super(var1.container, var1.inventory, new TranslationTextComponent("container.crafting"));
      this.passEvents = true;
      this.field4723 = 97;
   }

   @Override
   public void tick() {
      if (!this.mc.playerController.isInCreativeMode()) {
         this.field4768.method5844();
      } else {
         this.mc.displayGuiScreen(new CreativeScreen(this.mc.player));
      }
   }

   @Override
   public void init() {
      if (!this.mc.playerController.isInCreativeMode()) {
         super.init();
         this.field4770 = this.width < 379;
         this.field4768.method5833(this.width, this.height, this.mc, this.field4770, this.field4727);
         this.field4769 = true;
         this.field4734 = this.field4768.method5837(this.field4770, this.width, this.xSize);
         this.children.add(this.field4768);
         this.setFocusedDefault(this.field4768);
         this.<Class1243>addButton(new Class1243(this.field4734 + 104, this.height / 2 - 22, 20, 18, 0, 0, 19, field4765, var1 -> {
            this.field4768.method5834(this.field4770);
            this.field4768.method5838();
            this.field4734 = this.field4768.method5837(this.field4770, this.width, this.xSize);
            ((Class1243)var1).method5819(this.field4734 + 104, this.height / 2 - 22);
            this.field4771 = true;
         }));
      } else {
         this.mc.displayGuiScreen(new CreativeScreen(this.mc.player));
      }
   }

   @Override
   public void method2617(MatrixStack var1, int var2, int var3) {
      this.font.func_243248_b(var1, this.title, (float)this.field4723, (float)this.field4724, 4210752);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field4772 = !this.field4768.method5839();
      if (this.field4768.method5839() && this.field4770) {
         this.drawGuiContainerBackgroundLayer(var1, var4, var2, var3);
         this.field4768.render(var1, var2, var3, var4);
      } else {
         this.field4768.render(var1, var2, var3, var4);
         super.render(var1, var2, var3, var4);
         this.field4768.method5850(var1, this.field4734, this.field4735, false, var4);
      }

      this.renderHoveredTooltip(var1, var2, var3);
      this.field4768.method5846(var1, this.field4734, this.field4735, var2, var3);
      this.field4766 = (float)var2;
      this.field4767 = (float)var3;
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(INVENTORY_BACKGROUND);
      int var7 = this.field4734;
      int var8 = this.field4735;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      drawEntityOnScreen(var7 + 51, var8 + 75, 30, (float)(var7 + 51) - this.field4766, (float)(var8 + 75 - 50) - this.field4767, this.mc.player);
   }

   public static void drawEntityOnScreen(int posX, int posY, int scale, float mouseX, float mouseY, LivingEntity livingEntity) {
      float f = (float)Math.atan((double)(mouseX / 40.0F));
      float f1 = (float)Math.atan((double)(mouseY / 40.0F));
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)posX, (float)posY, 1050.0F);
      RenderSystem.scalef(1.0F, 1.0F, -1.0F);
      MatrixStack matrixstack = new MatrixStack();
      matrixstack.translate(0.0D, 0.0D, 1000.0D);
      matrixstack.scale((float)scale, (float)scale, (float)scale);
      Quaternion quaternion = Vector3f.ZP.rotationDegrees(180.0F);
      Quaternion quaternion1 = Vector3f.XP.rotationDegrees(f1 * 20.0F);
      quaternion.multiply(quaternion1);
      matrixstack.rotate(quaternion);
      float f2 = livingEntity.renderYawOffset;
      float f3 = livingEntity.rotationYaw;
      float f4 = livingEntity.rotationPitch;
      float f5 = livingEntity.prevRotationYawHead;
      float f6 = livingEntity.rotationYawHead;
      livingEntity.renderYawOffset = 180.0F + f * 20.0F;
      livingEntity.rotationYaw = 180.0F + f * 40.0F;
      livingEntity.rotationPitch = -f1 * 20.0F;
      livingEntity.rotationYawHead = livingEntity.rotationYaw;
      livingEntity.prevRotationYawHead = livingEntity.rotationYaw;
      EntityRendererManager entityrenderermanager = Minecraft.getInstance().getRenderManager();
      quaternion1.conjugate();
      entityrenderermanager.setCameraOrientation(quaternion1);
      entityrenderermanager.setRenderShadow(false);
      Class7735 irendertypebuffer$impl = Minecraft.getInstance().getRenderTypeBuffers().getBufferSource();
      RenderSystem.runAsFancy(() ->
      {
         entityrenderermanager.renderEntityStatic(livingEntity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, matrixstack, irendertypebuffer$impl, 15728880);
      });
      irendertypebuffer$impl.finish();
      entityrenderermanager.setRenderShadow(true);
      livingEntity.renderYawOffset = f2;
      livingEntity.rotationYaw = f3;
      livingEntity.rotationPitch = f4;
      livingEntity.prevRotationYawHead = f5;
      livingEntity.rotationYawHead = f6;
      RenderSystem.popMatrix();
   }

   @Override
   public boolean method2625(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.field4770 || !this.field4768.method5839()) && super.method2625(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field4768.mouseClicked(var1, var3, var5)) {
         this.setListener(this.field4768);
         return true;
      } else {
         return this.field4770 && this.field4768.method5839() ? false : super.mouseClicked(var1, var3, var5);
      }
   }

   @Override
   public boolean mouseReleased(double var1, double var3, int var5) {
      if (!this.field4771) {
         return super.mouseReleased(var1, var3, var5);
      } else {
         this.field4771 = false;
         return true;
      }
   }

   @Override
   public boolean method2623(double var1, double var3, int var5, int var6, int var7) {
      boolean var10 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.xSize) || var3 >= (double)(var6 + this.ySize);
      return this.field4768.method5852(var1, var3, this.field4734, this.field4735, this.xSize, this.ySize, var7) && var10;
   }

   @Override
   public void method2626(Slot var1, int var2, int var3, ClickType var4) {
      super.method2626(var1, var2, var3, var4);
      this.field4768.method5841(var1);
   }

   @Override
   public void method2631() {
      this.field4768.method5856();
   }

   @Override
   public void onClose() {
      if (this.field4769) {
         this.field4768.method5836();
      }

      super.onClose();
   }

   @Override
   public Class1254 method2632() {
      return this.field4768;
   }
}

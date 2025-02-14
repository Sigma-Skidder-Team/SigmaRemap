package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;

public class Class1125 extends ContainerScreen<Class5827> {
   private static final ResourceLocation field6161 = new ResourceLocation("textures/gui/container/horse.png");
   private final AbstractHorseEntity field6162;
   private float field6163;
   private float field6164;

   public Class1125(Class5827 var1, PlayerInventory var2, AbstractHorseEntity var3) {
      super(var1, var2, var3.getDisplayName());
      this.field6162 = var3;
      this.passEvents = false;
   }

   @Override
   public void drawGuiContainerBackgroundLayer(MatrixStack var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(field6161);
      int var7 = (this.width - this.xSize) / 2;
      int var8 = (this.height - this.ySize) / 2;
      this.blit(var1, var7, var8, 0, 0, this.xSize, this.ySize);
      if (this.field6162 instanceof Class1066) {
         Class1066 var9 = (Class1066)this.field6162;
         if (var9.method4927()) {
            this.blit(var1, var7 + 79, var8 + 17, 0, this.ySize, var9.method4897() * 18, 54);
         }
      }

      if (this.field6162.method4901()) {
         this.blit(var1, var7 + 7, var8 + 35 - 18, 18, this.ySize + 54, 18, 18);
      }

      if (this.field6162.method4898()) {
         if (!(this.field6162 instanceof LlamaEntity)) {
            this.blit(var1, var7 + 7, var8 + 35, 0, this.ySize + 54, 18, 18);
         } else {
            this.blit(var1, var7 + 7, var8 + 35, 36, this.ySize + 54, 18, 18);
         }
      }

      InventoryScreen.drawEntityOnScreen(var7 + 51, var8 + 60, 17, (float)(var7 + 51) - this.field6163, (float)(var8 + 75 - 50) - this.field6164, this.field6162);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6163 = (float)var2;
      this.field6164 = (float)var3;
      super.render(var1, var2, var3, var4);
      this.renderHoveredTooltip(var1, var2, var3);
   }
}

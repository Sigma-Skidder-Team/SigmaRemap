package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class Class4295 extends Class4278 {
   private static String[] field20736;
   public boolean field20809;
   private ItemStack field20810;
   private Minecraft field20811 = Minecraft.getInstance();

   public Class4295(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20810 = new ItemStack(Item.getItemById(var7));
   }

   @Override
   public void method13089(int var1, int var2, int var3) {
      this.method13176(!this.field20809);
      super.method13089(var1, var2, var3);
   }

   public boolean method13175() {
      return this.field20809;
   }

   public void method13176(boolean var1) {
      this.field20809 = var1;
   }

   @Override
   public void draw(float var1) {
      if (!this.field20809) {
         RenderUtil.drawRect(
            (float)this.xA,
            (float)this.yA,
            (float)(this.xA + this.widthA),
            (float)(this.yA + this.heightA),
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
      } else {
         RenderUtil.drawRect(
            (float)this.xA,
            (float)this.yA,
            (float)(this.xA + this.widthA),
            (float)(this.yA + this.heightA),
            MultiUtilities.applyAlpha(-3487030, var1 * 0.5F)
         );
      }

      RenderUtil.method11428(
         (float)(this.xA - 1),
         (float)(this.yA - 1),
         (float)(this.xA + this.widthA),
         (float)(this.yA + this.heightA),
         MultiUtilities.applyAlpha(-921103, var1)
      );
      if (this.field20810.getItem() != null) {
         this.method13177();
      }
   }

   private void method13177() {
      GL11.glPushMatrix();
      float var3 = 0.062F;
      GL11.glTranslatef((float)this.xA, (float)this.yA, 0.0F);
      GL11.glScalef(
         (float)this.widthA * var3 - 0.25F * (float)this.widthA / 40.0F, (float)this.heightA * var3 - 0.25F * (float)this.heightA / 40.0F, 1.0F
      );
      GL11.glTranslatef((float)(-this.xA), (float)(-this.yA), 0.0F);
      GL11.glEnable(2929);
      RenderHelper.enableStandardItemLighting();
      this.field20811.getItemRenderer().renderItemIntoGUI(this.field20810, this.xA + 1, this.yA + 1);
      RenderHelper.disableStandardItemLighting();
      GL11.glDisable(2929);
      GL11.glPopMatrix();
   }
}

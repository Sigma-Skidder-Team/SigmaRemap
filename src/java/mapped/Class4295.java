package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class Class4295 extends Class4278 {
   private static String[] field20736;
   public boolean field20809;
   private ItemStack field20810;
   private Minecraft field20811 = Minecraft.getInstance();

   public Class4295(IconPanel var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20810 = new ItemStack(Item.method11702(var7));
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
            (float)this.x,
            (float)this.y,
            (float)(this.x + this.width),
            (float)(this.y + this.height),
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
      } else {
         RenderUtil.drawRect(
            (float)this.x,
            (float)this.y,
            (float)(this.x + this.width),
            (float)(this.y + this.height),
            ColorUtils.applyAlpha(-3487030, var1 * 0.5F)
         );
      }

      RenderUtil.method11428(
         (float)(this.x - 1),
         (float)(this.y - 1),
         (float)(this.x + this.width),
         (float)(this.y + this.height),
         ColorUtils.applyAlpha(-921103, var1)
      );
      if (this.field20810.getItem() != null) {
         this.method13177();
      }
   }

   private void method13177() {
      GL11.glPushMatrix();
      float var3 = 0.062F;
      GL11.glTranslatef((float)this.x, (float)this.y, 0.0F);
      GL11.glScalef(
         (float)this.width * var3 - 0.25F * (float)this.width / 40.0F, (float)this.height * var3 - 0.25F * (float)this.height / 40.0F, 1.0F
      );
      GL11.glTranslatef((float)(-this.x), (float)(-this.y), 0.0F);
      GL11.glEnable(2929);
      Class7516.method24498();
      this.field20811.getItemRenderer().method791(this.field20810, this.x + 1, this.y + 1);
      Class7516.method24499();
      GL11.glDisable(2929);
      GL11.glPopMatrix();
   }
}

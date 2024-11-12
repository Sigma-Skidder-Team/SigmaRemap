package mapped;

import org.newdawn.slick.TrueTypeFont;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import org.newdawn.slick.opengl.Texture;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class4376 extends PNGIconButton implements Class4238 {
   private static String[] field21381;
   public boolean field21382 = false;
   public Animation field21383 = new Animation(90, 90, Direction.BACKWARDS);

   public Class4376(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Texture var7, ColorHelper var8, String var9, TrueTypeFont var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public Class4376(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Texture var7, ColorHelper var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4376(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Texture var7, ColorHelper var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4376(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, var7, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field21382 = this.method13298();
      this.field21383.changeDirection(!this.field21382 ? Direction.BACKWARDS : Direction.FORWARDS);
   }

   @Override
   public void draw(float var1) {
      float var4 = 1.0F + this.field21383.calcPercent() * 0.2F;
      float var5 = !this.method13212() ? 0.0F : 0.1F;
      int var6 = (int)((float)this.getWidthA() * var4);
      int var7 = (int)((float)this.getHeightA() * var4);
      int var8 = this.getXA() - (var6 - this.getWidthA()) / 2;
      int var9 = (int)((float)(this.getYA() - (var7 - this.getHeightA()) / 2) - (float)(this.getHeightA() / 2) * (var4 - 1.0F));
      float[] var10 = MultiUtilities.method17701(this.method13025().getWidth(), this.method13025().getHeight(), (float)var6, (float)var7);
      RenderUtil.drawPortalBackground(
         this.method13271() + var8 - this.xA,
         this.method13272() + var9 - this.yA,
         this.method13271() + var8 - this.xA + var6,
         this.method13272() + var9 - this.yA + var7
      );
      RenderUtil.drawImage(
         (float)var8 + var10[0],
         (float)var9 + var10[1],
         var10[2],
         var10[3],
         this.method13025(),
         MultiUtilities.applyAlpha(MultiUtilities.method17690(this.textColor.method19405(), this.textColor.method19403(), 1.0F - var5), var1)
      );
      if (this.getTypedText() != null) {
         RenderUtil.drawString(
            this.getFont(),
            (float)(var8 + var6 / 2),
            (float)(var9 + var7 / 2),
            this.getTypedText(),
            MultiUtilities.applyAlpha(this.textColor.getTextColor(), var1),
            this.textColor.method19411(),
            this.textColor.method19413()
         );
      }

      RenderUtil.endScissor();
      TrueTypeFont var11 = this.getFont();
      if (var4 > 1.0F) {
         float var12 = (var4 - 1.0F) / (this.method13032() - 1.0F);
         GL11.glPushMatrix();
         String var13 = this.getTypedText() != null ? this.getTypedText() : this.field20891;
         GL11.glTranslatef(
            (float)(this.getXA() + this.getWidthA() / 2 - var11.getWidth(var13) / 2), (float)(this.getYA() + this.getHeightA() - 40), 0.0F
         );
         GL11.glScalef(var4 / this.method13032(), var4 / this.method13032(), var4 / this.method13032());
         GL11.glAlphaFunc(519, 0.0F);
         RenderUtil.drawImage(
            (1.0F - var4 / this.method13032()) * (float)var11.getWidth(var13) / 2.0F + 1.0F - (float)var11.getWidth(var13) / 2.0F,
            (float)var11.getHeight(var13) / 3.0F,
            (float)(var11.getWidth(var13) * 2),
            (float)var11.getHeight(var13) * 3.0F,
            ResourceList.shadowPNG,
            var12 * 0.6F
         );
         RenderUtil.drawString(
            var11,
            (1.0F - var4 / this.method13032()) * (float)var11.getWidth(var13) / 2.0F + 1.0F,
            40.0F,
            var13,
            MultiUtilities.applyAlpha(this.method13307().method19405(), var12 * 0.6F)
         );
         GL11.glPopMatrix();
      }

      super.method13226(var1);
   }

   @Override
   public float method13032() {
      return 1.2F;
   }

   @Override
   public float method13033() {
      return 0.07F * (30.0F / (float) Minecraft.getFps());
   }
}

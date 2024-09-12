package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4250 extends Class4247 {
   private Class4279 field20608;
   private Class4279 field20609;
   public int field20610 = 30;
   private Animation field20611 = new Animation(300, 300);

   public Class4250(IconPanel var1, String var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20610 = var7;
      this.addToList(this.field20608 = new Class4279(this, 10, "pos1"));
      this.addToList(this.field20609 = new Class4279(this, 10, "pos2"));
      this.method13249((var1x, var2x) -> this.method13037());
      this.method13041(var8, var9, var10, var11);
   }

   public float[] method13040() {
      int var3 = this.field20610;
      float var4 = (float)(this.width - var3 * 2);
      float var5 = (float)(this.field20608.getX() - var3) / var4;
      float var6 = 1.0F - (float)(this.field20608.getY() - var3) / var4;
      float var7 = (float)(this.field20609.getX() - var3) / var4;
      float var8 = 1.0F - (float)(this.field20609.getY() - var3) / var4;
      return new float[]{var5, var6, var7, var8};
   }

   public void method13041(float var1, float var2, float var3, float var4) {
      float var7 = (float)(this.width - this.field20610 * 2);
      this.field20608.method13144((float)this.field20610 + var7 * var1, (float)this.field20610 + var7 * (1.0F - var2));
      this.field20609.method13144((float)this.field20610 + var7 * var3, (float)this.field20610 + var7 * (1.0F - var4));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      this.field20611.changeDirection(Direction.FORWARDS);
      if (this.field20611.calcPercent() == 1.0F) {
         this.field20611 = new Animation(1500, 0);
      }

      float[] var4 = this.method13040();
      int var5 = this.field20610;
      float var6 = (float)(this.width - var5 * 2);
      float var7 = var4[0];
      float var8 = var4[1];
      float var9 = var4[2];
      float var10 = var4[3];
      RenderUtil.drawRect(
         (float)(this.x + var5),
         (float)(this.y + var5),
         (float)(this.width - var5 * 2),
         (float)(this.height - var5 * 2),
         3.0F,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F * var1)
      );
      ArrayList var11 = new ArrayList();
      var11.add(new Class9778(0.0, 0.0));
      var11.add(new Class9778((double)var7, (double)var8));
      var11.add(new Class9778((double)var9, (double)var10));
      var11.add(new Class9778(1.0, 1.0));
      MathUtils var12 = new MathUtils((double)(1.0F / var6 * 2.0F));
      double var13 = var12.method30789(var11, Math.min(0.8F, this.field20611.calcPercent()) * 1.25F);
      RenderUtil.method11438(
         (float)((double)this.x + (double)var6 * var13 + (double)var5),
         (float)(this.y - var5 / 2 + this.height),
         14.0F,
         ColorUtils.applyAlpha(ClientColors.DARK_BLUE_GREY.getColor, var1)
      );
      List<Class9778> var15 = var12.method30790(var11);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.x + var5), (float)(this.y + var5), 0.0F);
      GL11.glLineWidth(1.0F);
      GL11.glColor4d(0.0, 0.0, 0.0, (double)(0.6F * var1));
      GL11.glAlphaFunc(519, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12936);
      GL11.glEnable(2848);
      GL11.glBegin(3);
      GL11.glVertex2f(0.0F, var6);

      for (Class9778 var17 : var15) {
         GL11.glVertex2d(var17.method38553() * (double)var6, (1.0 - var17.method38554()) * (double)var6);
      }

      GL11.glVertex2f(var6, 0.0F);
      GL11.glEnd();
      GL11.glLineWidth(3.0F);
      GL11.glColor4d(0.0, 0.2F, 0.4F, 0.2F);
      GL11.glBegin(3);
      GL11.glVertex2f(0.0F, var6);
      GL11.glVertex2f((float)(this.field20608.getX() - var5 + 5), (float)(this.field20608.getY() - var5 + 5));
      GL11.glEnd();
      GL11.glBegin(3);
      GL11.glVertex2f(var6, 0.0F);
      GL11.glVertex2f((float)(this.field20609.getX() - var5 + 5), (float)(this.field20609.getY() - var5 + 5));
      GL11.glEnd();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      GL11.glPopMatrix();
      super.draw(var1);
   }
}

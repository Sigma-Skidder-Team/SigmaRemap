package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
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

   public Class4250(Class4305 var1, String var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20610 = var7;
      this.method13230(this.field20608 = new Class4279(this, 10, "pos1"));
      this.method13230(this.field20609 = new Class4279(this, 10, "pos2"));
      this.method13249((var1x, var2x) -> this.method13037());
      this.method13041(var8, var9, var10, var11);
   }

   public float[] method13040() {
      int var3 = this.field20610;
      float var4 = (float)(this.field20897 - var3 * 2);
      float var5 = (float)(this.field20608.method13263() - var3) / var4;
      float var6 = 1.0F - (float)(this.field20608.method13265() - var3) / var4;
      float var7 = (float)(this.field20609.method13263() - var3) / var4;
      float var8 = 1.0F - (float)(this.field20609.method13265() - var3) / var4;
      return new float[]{var5, var6, var7, var8};
   }

   public void method13041(float var1, float var2, float var3, float var4) {
      float var7 = (float)(this.field20897 - this.field20610 * 2);
      this.field20608.method13144((float)this.field20610 + var7 * var1, (float)this.field20610 + var7 * (1.0F - var2));
      this.field20609.method13144((float)this.field20610 + var7 * var3, (float)this.field20610 + var7 * (1.0F - var4));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      this.field20611.changeDirection(Direction.FORWARDS);
      if (this.field20611.calcPercent() == 1.0F) {
         this.field20611 = new Animation(1500, 0);
      }

      float[] var4 = this.method13040();
      int var5 = this.field20610;
      float var6 = (float)(this.field20897 - var5 * 2);
      float var7 = var4[0];
      float var8 = var4[1];
      float var9 = var4[2];
      float var10 = var4[3];
      RenderUtil.method11475(
         (float)(this.field20895 + var5),
         (float)(this.field20896 + var5),
         (float)(this.field20897 - var5 * 2),
         (float)(this.field20898 - var5 * 2),
         3.0F,
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.05F * var1)
      );
      ArrayList var11 = new ArrayList();
      var11.add(new Class9778(0.0, 0.0));
      var11.add(new Class9778((double)var7, (double)var8));
      var11.add(new Class9778((double)var9, (double)var10));
      var11.add(new Class9778(1.0, 1.0));
      Class8603 var12 = new Class8603((double)(1.0F / var6 * 2.0F));
      double var13 = var12.method30789(var11, Math.min(0.8F, this.field20611.calcPercent()) * 1.25F);
      RenderUtil.method11438(
         (float)((double)this.field20895 + (double)var6 * var13 + (double)var5),
         (float)(this.field20896 - var5 / 2 + this.field20898),
         14.0F,
         Class5628.method17688(ClientColors.DARK_BLUE_GREY.getColor, var1)
      );
      List<Class9778> var15 = var12.method30790(var11);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.field20895 + var5), (float)(this.field20896 + var5), 0.0F);
      GL11.glLineWidth(1.0F);
      GL11.glColor4d(0.0, 0.0, 0.0, (double)(0.6F * var1));
      GL11.glAlphaFunc(519, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
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
      GL11.glVertex2f((float)(this.field20608.method13263() - var5 + 5), (float)(this.field20608.method13265() - var5 + 5));
      GL11.glEnd();
      GL11.glBegin(3);
      GL11.glVertex2f(var6, 0.0F);
      GL11.glVertex2f((float)(this.field20609.method13263() - var5 + 5), (float)(this.field20609.method13265() - var5 + 5));
      GL11.glEnd();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      GL11.glPopMatrix();
      super.method13027(var1);
   }
}

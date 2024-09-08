package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class4376 extends Class4235 implements Class4238 {
   private static String[] field21381;
   public boolean field21382 = false;
   public Animation field21383 = new Animation(90, 90, Direction.BACKWARDS);

   public Class4376(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public Class4376(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4376(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4376(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, var7, new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor));
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
      int var6 = (int)((float)this.method13267() * var4);
      int var7 = (int)((float)this.method13269() * var4);
      int var8 = this.method13263() - (var6 - this.method13267()) / 2;
      int var9 = (int)((float)(this.method13265() - (var7 - this.method13269()) / 2) - (float)(this.method13269() / 2) * (var4 - 1.0F));
      float[] var10 = ColorUtils.method17701(this.method13025().getWidth(), this.method13025().getHeight(), (float)var6, (float)var7);
      RenderUtil.method11420(
         this.method13271() + var8 - this.field20895,
         this.method13272() + var9 - this.field20896,
         this.method13271() + var8 - this.field20895 + var6,
         this.method13272() + var9 - this.field20896 + var7
      );
      RenderUtil.method11449(
         (float)var8 + var10[0],
         (float)var9 + var10[1],
         var10[2],
         var10[3],
         this.method13025(),
         ColorUtils.applyAlpha(ColorUtils.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var5), var1)
      );
      if (this.method13303() != null) {
         RenderUtil.method11440(
            this.method13305(),
            (float)(var8 + var6 / 2),
            (float)(var9 + var7 / 2),
            this.method13303(),
            ColorUtils.applyAlpha(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      RenderUtil.endScissor();
      ClientResource var11 = this.method13305();
      if (var4 > 1.0F) {
         float var12 = (var4 - 1.0F) / (this.method13032() - 1.0F);
         GL11.glPushMatrix();
         String var13 = this.method13303() != null ? this.method13303() : this.field20891;
         GL11.glTranslatef(
            (float)(this.method13263() + this.method13267() / 2 - var11.method23942(var13) / 2), (float)(this.method13265() + this.method13269() - 40), 0.0F
         );
         GL11.glScalef(var4 / this.method13032(), var4 / this.method13032(), var4 / this.method13032());
         GL11.glAlphaFunc(519, 0.0F);
         RenderUtil.method11454(
            (1.0F - var4 / this.method13032()) * (float)var11.method23942(var13) / 2.0F + 1.0F - (float)var11.method23942(var13) / 2.0F,
            (float)var11.method23941(var13) / 3.0F,
            (float)(var11.method23942(var13) * 2),
            (float)var11.method23941(var13) * 3.0F,
            ResourcesDecrypter.shadowPNG,
            var12 * 0.6F
         );
         RenderUtil.drawString(
            var11,
            (1.0F - var4 / this.method13032()) * (float)var11.method23942(var13) / 2.0F + 1.0F,
            40.0F,
            var13,
            ColorUtils.applyAlpha(this.method13307().method19405(), var12 * 0.6F)
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

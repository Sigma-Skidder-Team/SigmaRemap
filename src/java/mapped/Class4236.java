package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4236 extends Class4235 implements Class4238 {
   private static String[] field20573;
   public float field20576;
   public boolean field20577 = false;
   public Animation field20578 = new Animation(160, 140, Direction.BACKWARDS);

   public Class4236(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public Class4236(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public Class4236(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Class4236(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, var7, new Class6387(Class1979.field12896.field12910, Class1979.field12896.field12910));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field20577 = this.method13298();
      if (!this.field20577) {
         if (this.method13029()) {
            this.field20578.changeDirection(Direction.BACKWARDS);
            this.method13292(false);
         }
      } else {
         this.field20578.changeDirection(Direction.FORWARDS);
         this.method13292(true);
      }
   }

   public boolean method13029() {
      return Math.abs(this.method13030() - this.method13031()) < 0.6F;
   }

   public float method13030() {
      return Class8603.method30791(this.field20578.calcPercent(), 0.24, 0.88, 0.3, 1.0);
   }

   public float method13031() {
      return Class8603.method30791(this.field20578.calcPercent(), 0.45, 0.02, 0.59, 0.28);
   }

   @Override
   public void method13027(float var1) {
      float var4 = !this.method13212() ? 0.0F : 0.1F;
      float var5 = this.method13030();
      if (this.field20578.method25319() == Direction.BACKWARDS) {
         var5 = this.method13031();
      }

      int var6 = (int)((double)this.method13267() * (1.0 + (double)var5 * 0.2));
      int var7 = (int)((double)this.method13269() * (1.0 + (double)var5 * 0.2));
      int var8 = this.method13263() - (var6 - this.method13267()) / 2;
      int var9 = (int)((double)(this.method13265() - (var7 - this.method13269()) / 2) - (double)((float)(this.method13269() / 2) * var5) * 0.2);
      float[] var10 = Class5628.method17701(this.method13025().getWidth(), this.method13025().getHeight(), (float)var6, (float)var7);
      byte var11 = 85;
      Class3192.method11449(
         (float)var8 + var10[0] - (float)var11,
         (float)var9 + var10[1] - (float)var11,
         var10[2] + (float)(var11 * 2),
         var10[3] + (float)(var11 * 2),
         ResourcesDecrypter.shadowPNG,
         Class5628.method17688(Class1979.field12896.field12910, this.field20578.calcPercent() * 0.7F * var1)
      );
      Class3192.method11449(
         (float)var8 + var10[0],
         (float)var9 + var10[1],
         var10[2],
         var10[3],
         this.method13025(),
         Class5628.method17688(Class5628.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var4), var1)
      );
      if (this.method13303() != null) {
         Class3192.method11440(
            this.method13305(),
            (float)(var8 + var6 / 2),
            (float)(var9 + var7 / 2),
            this.method13303(),
            Class5628.method17688(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      ClientResource var12 = this.method13305();
      float var13 = 0.8F + var5 * 0.2F;
      if (var5 > 0.0F) {
         GL11.glPushMatrix();
         String var14 = this.method13303() != null ? this.method13303() : this.field20891;
         GL11.glTranslatef(
            (float)(this.method13263() + this.method13267() / 2 - var12.method23942(var14) / 2), (float)(this.method13265() + this.method13269() - 40), 0.0F
         );
         GL11.glScalef(var13, var13, var13);
         GL11.glAlphaFunc(519, 0.0F);
         Class3192.method11454(
            (1.0F - var13) * (float)var12.method23942(var14) / 2.0F + 1.0F - (float)var12.method23942(var14) / 2.0F,
            (float)var12.method23941(var14) / 3.0F,
            (float)(var12.method23942(var14) * 2),
            (float)var12.method23941(var14) * 3.0F,
            ResourcesDecrypter.shadowPNG,
            var5 * 0.6F * var1
         );
         Class3192.method11439(
            var12,
            (1.0F - var13) * (float)var12.method23942(var14) / 2.0F + 1.0F,
            40.0F,
            var14,
            Class5628.method17688(this.method13307().method19405(), var5 * 0.6F * var1)
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

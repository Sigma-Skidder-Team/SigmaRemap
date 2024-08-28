package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.timer.Timer;
import org.lwjgl.opengl.GL11;

public class Class4285 extends Class4278 {
   private static String[] field20736;
   public Timer field20769 = new Timer();
   public float field20770 = 0.0F;

   public Class4285(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20769.method27118();
   }

   @Override
   public void method13027(float var1) {
      this.field20770 = this.field20770 + (this.method13295() ? 0.2F : -0.2F);
      this.field20770 = Math.min(1.0F, Math.max(0.0F, this.field20770));
      float var4 = (float)(this.field20769.method27121() / 75L % 12L);
      if (this.field20770 != 0.0F) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(this.field20895 + this.field20897 / 2), (float)(this.field20896 + this.field20898 / 2), 0.0F);
         GL11.glRotatef(var4 * 30.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-this.field20895 - this.field20897 / 2), (float)(-this.field20896 - this.field20898 / 2), 0.0F);
         Class3192.method11449(
            (float)this.field20895,
            (float)this.field20896,
            (float)this.field20897,
            (float)this.field20898,
            ResourcesDecrypter.loadingIndicatorPNG,
            Class5628.method17688(Class1979.field12891.field12910, this.field20770 * var1)
         );
         GL11.glPopMatrix();
      }
   }
}

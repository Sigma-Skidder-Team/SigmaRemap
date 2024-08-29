package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

public class Class4244 extends Class4240 {
   private static String[] field20594;
   public static final Class6387 field20595 = new Class6387(ClientColors.DARK_BLUE_GREY.getColor, Class5628.method17691(ClientColors.DARK_BLUE_GREY.getColor, 0.1F));

   public Class4244(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field20595);
   }

   @Override
   public void method13027(float var1) {
      if (var1 != 0.0F) {
         if (!this.method13295()) {
            float var10000 = 0.3F;
         } else if (!this.method13216()) {
            if (!this.method13212()) {
               Math.max(var1 * this.field20584, 0.0F);
            } else {
               float var5 = 1.5F;
            }
         } else {
            float var6 = 0.0F;
         }

         Class3192.method11474(
            (float)this.method13263(),
            (float)this.method13265(),
            (float)this.method13267(),
            (float)this.method13269(),
            5.0F,
            Class5628.method17688(this.field20914.method19405(), var1)
         );
         if (this.method13303() != null) {
            Class3192.method11440(
               this.method13305(),
               (float)(this.method13263() + this.method13267() / 2),
               (float)(this.method13265() + this.method13269() / 2),
               this.method13303(),
               Class5628.method17688(this.field20914.method19409(), var1),
               this.field20914.method19411(),
               this.field20914.method19413()
            );
         }

         GL11.glPushMatrix();
         super.method13226(var1);
         GL11.glPopMatrix();
      }
   }
}

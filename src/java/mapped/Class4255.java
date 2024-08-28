package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

public class Class4255 extends Class4247 {
   private static String[] field20632;
   public Texture field20633;
   public Texture field20634;

   public Class4255(Class4305 var1, String var2, int var3, int var4, int var5, int var6, String var7, Texture var8, Texture var9) {
      super(var1, var2, var3, var4, var5, var6, Class6387.field27961, var7, false);
      this.field20633 = var8;
      this.field20634 = var9;
   }

   @Override
   public void method13027(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      Class3192.method11449(
         (float)(this.field20895 + (this.field20897 - 64) / 2),
         (float)(this.field20896 + 10),
         64.0F,
         64.0F,
         !this.method13298() ? this.field20633 : this.field20634,
         Class1979.field12896.field12910
      );
      int var4 = this.method13267() / 2 + this.field20895;
      int var5 = this.method13269() / 2 + this.field20896;
      Class3192.method11439(
         Class7925.field33945,
         (float)(this.field20895 + (this.method13267() - Class7925.field33945.method23942(this.field20912)) / 2),
         (float)(this.field20896 + this.method13269() - 50),
         this.field20912,
         !this.method13298() ? -14869219 : -319475
      );
      super.method13027(var1);
   }
}

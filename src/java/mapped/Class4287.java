package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

public class Class4287 extends Class4278 {
   private static String[] field20736;
   public static Class6387 field20778 = new Class6387(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   public boolean field20779 = false;

   public Class4287(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public Class4287(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void method13027(float var1) {
      if (this.field20779) {
         GL11.glAlphaFunc(518, 0.01F);
         Class3192.method11439(
            ResourceRegistry.JelloLightFont18_1,
            (float)this.method13263(),
            (float)this.method13265(),
            this.method13303(),
            Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var1)
         );
         GL11.glAlphaFunc(519, 0.0F);
      }

      if (this.field20912 != null) {
         Class3192.method11439(
            this.method13305(),
            (float)this.method13263(),
            (float)this.method13265(),
            this.method13303(),
            Class5628.method17688(this.field20914.method19409(), var1 * Class5628.method17710(this.field20914.method19409()))
         );
      }
   }
}

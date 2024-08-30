package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Setting;

public class Class4248 extends Class4247 {
   private static String[] field20604;
   public final Setting field20605;

   public Class4248(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Setting var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20605 = var7;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11426(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269()),
         -3618616
      );
      RenderUtil.drawString(ClassicDecryption.regular17, (float)(this.method13263() + 5), (float)(this.method13265() - 2), this.field20605.method18626(), -14540254);
   }
}

package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;

public class Class4279 extends Class4278 {
   public Class4250 field20737;

   public Class4279(Class4250 var1, int var2, String var3) {
      super(var1, "bezierButton-" + var3, 0, 0, var2, var2, true);
      this.method13215(true);
      this.field20886 = true;
      this.field20737 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      int var5 = this.field20737.getWidthA() - this.field20737.field20610;
      int var6 = this.field20737.getHeightA() - this.getHeightA();
      int var7 = this.field20737.field20610;
      if (this.getXA() > var5) {
         this.setXA(var5);
      }

      if (this.getYA() > var6) {
         this.setYA(var6);
      }

      if (this.getXA() < var7) {
         this.setXA(var7);
      }
   }

   public void method13144(float var1, float var2) {
      this.xA = (int)var1;
      this.yA = (int)var2;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11438(
         (float)(this.xA + 5),
         (float)(this.yA + 5),
         10.0F,
         MultiUtilities.applyAlpha(!this.method13216() ? ClientColors.DARK_GREEN.getColor : ClientColors.DARK_BLUE_GREY.getColor, var1)
      );
      super.draw(var1);
   }
}

package mapped;

import com.mentalfrostbyte.jello.util.ColorUtils;

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
      int var5 = this.field20737.getWidth() - this.field20737.field20610;
      int var6 = this.field20737.getHeight() - this.getHeight();
      int var7 = this.field20737.field20610;
      if (this.getX() > var5) {
         this.setX(var5);
      }

      if (this.getY() > var6) {
         this.setY(var6);
      }

      if (this.getX() < var7) {
         this.setX(var7);
      }
   }

   public void method13144(float var1, float var2) {
      this.x = (int)var1;
      this.y = (int)var2;
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11438(
         (float)(this.x + 5),
         (float)(this.y + 5),
         10.0F,
         ColorUtils.applyAlpha(!this.method13216() ? ClientColors.DARK_GREEN.getColor : ClientColors.DARK_BLUE_GREY.getColor, var1)
      );
      super.draw(var1);
   }
}

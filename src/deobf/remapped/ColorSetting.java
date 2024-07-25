package remapped;

import java.awt.Color;

public class ColorSetting extends Setting<Integer> {
   public boolean field_5001 = false;

   public ColorSetting(String var1, String var2, int var3, boolean var4) {
      super(var1, var2, class_5195.field_26727, var3);
      this.field_5001 = var4;
   }

   public ColorSetting(String var1, String var2, int var3) {
      super(var1, var2, class_5195.field_26727, var3);
   }

   @Override
   public class_1293 method_23042(class_1293 var1) {
      this.field_25890 = class_3332.method_15289(var1, "value", this.method_23039());
      this.field_5001 = class_3332.method_15294(var1, "rainbow", false);
      return var1;
   }

   public boolean method_4268() {
      return this.field_5001;
   }

   public void method_4271(boolean var1) {
      this.field_5001 = var1;
   }

   @Override
   public class_1293 method_23035(class_1293 var1) {
      var1.method_5820("name", this.method_23032());
      var1.method_5820("value", this.method_4270());
      var1.method_5823("rainbow", this.field_5001);
      return var1;
   }

   public Integer method_4269() {
      if (!this.field_5001) {
         return this.field_25890;
      } else {
         Color var3 = new Color(this.field_25890);
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         return Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, var4[1], var4[2]).getRGB();
      }
   }

   public Integer method_4270() {
      return this.field_25890;
   }
}

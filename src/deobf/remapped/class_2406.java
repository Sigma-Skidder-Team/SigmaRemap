package remapped;

import java.awt.Color;

public class class_2406 extends class_1859 {
   public int field_11988;
   public class_7862 field_11984;
   public class_7862 field_11986;
   public class_7862 field_11985;

   public class_2406(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_11988 = var7;
      Color var10 = new Color(var7);
      float[] var11 = Color.RGBtoHSB(var10.getRed(), var10.getGreen(), var10.getBlue(), null);
      this.method_32148(this.field_11984 = new class_7862(this, "redSlider", 14, 10, var5 - 28, 8, var7, var10.getRed()));
      this.method_32148(this.field_11986 = new class_7862(this, "greenSlider", 14, 20, var5 - 28, 8, var7, var10.getGreen()));
      this.method_32148(this.field_11985 = new class_7862(this, "blueSlider", 14, 30, var5 - 28, 8, var7, var10.getBlue()));
      this.field_11984.method_8236(var1x -> this.method_10943());
      this.field_11986.method_8236(var1x -> this.method_10943());
      this.field_11985.method_8236(var1x -> this.method_10943());
   }

   public void method_10941(int var1) {
      if (var1 != this.field_11988) {
         Color var4 = new Color(var1);
         this.field_11984.method_35597(var1);
         this.field_11986.method_35597(var1);
         this.field_11985.method_35597(var1);
         this.field_11984.method_35598(var4.getRed());
         this.field_11986.method_35598(var4.getGreen());
         this.field_11985.method_35598(var4.getBlue());
         this.field_11988 = var1;
      }
   }

   public int method_10942() {
      return this.field_11988;
   }

   private void method_10943() {
      this.method_10941(new Color(this.field_11984.method_35596(), this.field_11986.method_35596(), this.field_11985.method_35596()).getRGB());
      this.method_8235();
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
   }
}

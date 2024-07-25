package remapped;

import java.awt.Color;
import java.util.List;

public class class_8918 extends class_9196 {
   private float field_45728 = 1.0F;
   private float field_45730 = 3.0F;

   public class_8918() {
      this.method_42394(new class_6385(this, null));
   }

   public float method_41015() {
      return this.field_45730;
   }

   public void method_41017(float var1) {
      this.field_45730 = var1;
   }

   public float method_41013() {
      return this.field_45728;
   }

   public void method_41016(float var1) {
      this.field_45728 = var1;
   }

   public class_8918(int var1, Color var2) {
      super(var1, var2);
   }

   @Override
   public String toString() {
      return "Outline (Zigzag)";
   }

   @Override
   public List method_42259() {
      List var3 = super.method_42259();
      var3.add(
         class_8391.method_38657(
            "Wavelength",
            this.field_45730,
            1.0F,
            100.0F,
            "This setting controls the wavelength of the outline. The smaller the value, the more segments will be used to draw the outline."
         )
      );
      var3.add(
         class_8391.method_38657(
            "Amplitude",
            this.field_45728,
            0.5F,
            50.0F,
            "This setting controls the amplitude of the outline. The bigger the value, the more the zigzags will vary."
         )
      );
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      super.method_42258(var1);

      for (class_2278 var5 : var1) {
         if (!var5.method_10496().equals("Wavelength")) {
            if (var5.method_10496().equals("Amplitude")) {
               this.field_45728 = (Float)var5.method_10500();
            }
         } else {
            this.field_45730 = (Float)var5.method_10500();
         }
      }
   }
}

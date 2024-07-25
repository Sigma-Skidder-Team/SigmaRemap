package remapped;

import java.awt.Color;
import java.util.List;

public class class_8648 extends class_9196 {
   private float field_44312 = 1.0F;
   private float field_44310 = 1.0F;

   public class_8648() {
      this.method_42394(new class_800(this, null));
   }

   public float method_39666() {
      return this.field_44312;
   }

   public void method_39662(float var1) {
      this.field_44312 = var1;
   }

   public float method_39667() {
      return this.field_44310;
   }

   public void method_39664(float var1) {
      this.field_44310 = var1;
   }

   public class_8648(int var1, Color var2) {
      super(var1, var2);
   }

   @Override
   public String toString() {
      return "Outline (Wobble)";
   }

   @Override
   public List method_42259() {
      List var3 = super.method_42259();
      var3.remove(2);
      var3.add(
         class_8391.method_38657(
            "Detail",
            this.field_44312,
            1.0F,
            50.0F,
            "This setting controls how detailed the outline will be. Smaller numbers cause the outline to have more detail."
         )
      );
      var3.add(class_8391.method_38657("Amplitude", this.field_44310, 0.5F, 50.0F, "This setting controls the amplitude of the outline."));
      return var3;
   }

   @Override
   public void method_42258(List var1) {
      super.method_42258(var1);

      for (class_2278 var5 : var1) {
         if (!var5.method_10496().equals("Detail")) {
            if (var5.method_10496().equals("Amplitude")) {
               this.field_44310 = (Float)var5.method_10500();
            }
         } else {
            this.field_44312 = (Float)var5.method_10500();
         }
      }
   }
}

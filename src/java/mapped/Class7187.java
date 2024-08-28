package mapped;

import java.awt.Color;
import java.util.List;

public class Class7187 extends Class7185 {
   private float field30870 = 1.0F;
   private float field30871 = 3.0F;

   public Class7187() {
      this.method22548(new Class6621(this));
   }

   public float method22556() {
      return this.field30871;
   }

   public void method22557(float var1) {
      this.field30871 = var1;
   }

   public float method22558() {
      return this.field30870;
   }

   public void method22559(float var1) {
      this.field30870 = var1;
   }

   public Class7187(int var1, Color var2) {
      super(var1, var2);
   }

   @Override
   public String toString() {
      return "Outline (Zigzag)";
   }

   @Override
   public List method22540() {
      List var3 = super.method22540();
      var3.add(
         Class9439.method36286(
            "Wavelength",
            this.field30871,
            1.0F,
            100.0F,
            "This setting controls the wavelength of the outline. The smaller the value, the more segments will be used to draw the outline."
         )
      );
      var3.add(
         Class9439.method36286(
            "Amplitude",
            this.field30870,
            0.5F,
            50.0F,
            "This setting controls the amplitude of the outline. The bigger the value, the more the zigzags will vary."
         )
      );
      return var3;
   }

   @Override
   public void method22541(List<Class5438> var1) {
      super.method22541(var1);

      for (Class5438 var5 : var1) {
         if (!var5.method17103().equals("Wavelength")) {
            if (var5.method17103().equals("Amplitude")) {
               this.field30870 = (Float)var5.method17100();
            }
         } else {
            this.field30871 = (Float)var5.method17100();
         }
      }
   }

   // $VF: synthetic method
   public static float method22560(Class7187 var0) {
      return var0.field30871;
   }

   // $VF: synthetic method
   public static float method22561(Class7187 var0) {
      return var0.field30870;
   }
}

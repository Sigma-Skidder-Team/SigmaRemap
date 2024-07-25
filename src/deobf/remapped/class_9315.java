package remapped;

public class class_9315 {
   private class_6750 field_47562;
   private class_8862 field_47567;
   private Float field_47565;
   private Float field_47559;
   private Float field_47560;
   private class_101 field_47566 = class_101.field_239;
   private Float field_47558;
   private class_2625 field_47561;
   private class_6068 field_47563;
   private class_2025 field_47568;

   public class_9315 method_42998(class_6750 var1) {
      this.field_47562 = var1;
      return this;
   }

   public class_9315 method_43005(class_8862 var1) {
      this.field_47567 = var1;
      return this;
   }

   public class_9315 method_43007(float var1) {
      this.field_47565 = var1;
      return this;
   }

   public class_9315 method_43003(float var1) {
      this.field_47559 = var1;
      return this;
   }

   public class_9315 method_42999(float var1) {
      this.field_47560 = var1;
      return this;
   }

   public class_9315 method_43008(float var1) {
      this.field_47558 = var1;
      return this;
   }

   public class_9315 method_43002(class_2625 var1) {
      this.field_47561 = var1;
      return this;
   }

   public class_9315 method_43004(class_6068 var1) {
      this.field_47563 = var1;
      return this;
   }

   public class_9315 method_43001(class_2025 var1) {
      this.field_47568 = var1;
      return this;
   }

   public class_9315 method_43006(class_101 var1) {
      this.field_47566 = var1;
      return this;
   }

   public class_6325 method_42997() {
      if (this.field_47562 != null
         && this.field_47567 != null
         && this.field_47565 != null
         && this.field_47559 != null
         && this.field_47560 != null
         && this.field_47558 != null
         && this.field_47561 != null
         && this.field_47563 != null
         && this.field_47568 != null) {
         return new class_6325(
            new class_1310(this.field_47562, this.field_47560, this.field_47566, this.field_47558, null),
            this.field_47567,
            this.field_47565,
            this.field_47559,
            this.field_47561,
            this.field_47568,
            this.field_47563,
            null
         );
      } else {
         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
      }
   }

   @Override
   public String toString() {
      return "BiomeBuilder{\nprecipitation="
         + this.field_47562
         + ",\nbiomeCategory="
         + this.field_47567
         + ",\ndepth="
         + this.field_47565
         + ",\nscale="
         + this.field_47559
         + ",\ntemperature="
         + this.field_47560
         + ",\ntemperatureModifier="
         + this.field_47566
         + ",\ndownfall="
         + this.field_47558
         + ",\nspecialEffects="
         + this.field_47561
         + ",\nmobSpawnSettings="
         + this.field_47563
         + ",\ngenerationSettings="
         + this.field_47568
         + ",\n"
         + '}';
   }
}

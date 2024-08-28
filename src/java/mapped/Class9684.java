package mapped;

public class Class9684 {
   private Class87 field45277;
   private Class100 field45278;
   private Float field45279;
   private Float field45280;
   private Float field45281;
   private Class93 field45282 = Class93.field241;
   private Float field45283;
   private Class7752 field45284;
   private Class8835 field45285;
   private Class7478 field45286;

   public Class9684 method37911(Class87 var1) {
      this.field45277 = var1;
      return this;
   }

   public Class9684 method37912(Class100 var1) {
      this.field45278 = var1;
      return this;
   }

   public Class9684 method37913(float var1) {
      this.field45279 = var1;
      return this;
   }

   public Class9684 method37914(float var1) {
      this.field45280 = var1;
      return this;
   }

   public Class9684 method37915(float var1) {
      this.field45281 = var1;
      return this;
   }

   public Class9684 method37916(float var1) {
      this.field45283 = var1;
      return this;
   }

   public Class9684 method37917(Class7752 var1) {
      this.field45284 = var1;
      return this;
   }

   public Class9684 method37918(Class8835 var1) {
      this.field45285 = var1;
      return this;
   }

   public Class9684 method37919(Class7478 var1) {
      this.field45286 = var1;
      return this;
   }

   public Class9684 method37920(Class93 var1) {
      this.field45282 = var1;
      return this;
   }

   public Biome method37921() {
      if (this.field45277 != null
         && this.field45278 != null
         && this.field45279 != null
         && this.field45280 != null
         && this.field45281 != null
         && this.field45283 != null
         && this.field45284 != null
         && this.field45285 != null
         && this.field45286 != null) {
         return new Biome(
            new Class7035(this.field45277, this.field45281, this.field45282, this.field45283, null),
            this.field45278,
            this.field45279,
            this.field45280,
            this.field45284,
            this.field45286,
            this.field45285,
            null
         );
      } else {
         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
      }
   }

   @Override
   public String toString() {
      return "BiomeBuilder{\nprecipitation="
         + this.field45277
         + ",\nbiomeCategory="
         + this.field45278
         + ",\ndepth="
         + this.field45279
         + ",\nscale="
         + this.field45280
         + ",\ntemperature="
         + this.field45281
         + ",\ntemperatureModifier="
         + this.field45282
         + ",\ndownfall="
         + this.field45283
         + ",\nspecialEffects="
         + this.field45284
         + ",\nmobSpawnSettings="
         + this.field45285
         + ",\ngenerationSettings="
         + this.field45286
         + ",\n"
         + '}';
   }
}

package mapped;

import net.minecraft.entity.EntityType;

public class Class7552 {
   private static String[] field32376;
   private Class8924 field32377 = Class8924.field40401;
   private Class8884 field32378 = Class8884.field40200;
   private Class8576 field32379 = Class8576.field38559;
   private Class9415 field32380 = Class9415.field43676;
   private Class8811 field32381 = Class8811.field39645;
   private Class9157 field32382 = Class9157.field42036;
   private Class6597 field32383 = Class6597.field29027;
   private Class9281 field32384 = Class9281.field42697;
   private Class8713 field32385 = Class8713.field39324;
   private Class6671 field32386 = Class6671.field29242;
   private Class6671 field32387 = Class6671.field29242;
   private String field32388;
   private ResourceLocation field32389;

   public static Class7552 method24700() {
      return new Class7552();
   }

   public Class7552 method24701(EntityType<?> var1) {
      this.field32377 = Class8924.method32627(var1);
      return this;
   }

   public Class7552 method24702(ITag<EntityType<?>> var1) {
      this.field32377 = Class8924.method32628(var1);
      return this;
   }

   public Class7552 method24703(ResourceLocation var1) {
      this.field32389 = var1;
      return this;
   }

   public Class7552 method24704(Class8924 var1) {
      this.field32377 = var1;
      return this;
   }

   public Class7552 method24705(Class8884 var1) {
      this.field32378 = var1;
      return this;
   }

   public Class7552 method24706(Class8576 var1) {
      this.field32379 = var1;
      return this;
   }

   public Class7552 method24707(Class9415 var1) {
      this.field32380 = var1;
      return this;
   }

   public Class7552 method24708(Class8811 var1) {
      this.field32381 = var1;
      return this;
   }

   public Class7552 method24709(Class9157 var1) {
      this.field32382 = var1;
      return this;
   }

   public Class7552 method24710(Class6597 var1) {
      this.field32383 = var1;
      return this;
   }

   public Class7552 method24711(Class9281 var1) {
      this.field32384 = var1;
      return this;
   }

   public Class7552 method24712(Class8713 var1) {
      this.field32385 = var1;
      return this;
   }

   public Class7552 method24713(Class6671 var1) {
      this.field32386 = var1;
      return this;
   }

   public Class7552 method24714(Class6671 var1) {
      this.field32387 = var1;
      return this;
   }

   public Class7552 method24715(String var1) {
      this.field32388 = var1;
      return this;
   }

   public Class7552 method24716(ResourceLocation var1) {
      this.field32389 = var1;
      return this;
   }

   public Class6671 method24717() {
      return new Class6671(
         this.field32377,
         this.field32378,
         this.field32379,
         this.field32380,
         this.field32381,
         this.field32382,
         this.field32383,
         this.field32384,
         this.field32385,
         this.field32386,
         this.field32387,
         this.field32388,
         this.field32389
      );
   }
}

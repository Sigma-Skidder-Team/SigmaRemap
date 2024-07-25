package remapped;

public class class_4918 implements class_5909 {
   private static String[] field_25453;
   private class_1440 field_25455 = new class_1440(0.0F, 0.0F);
   private class_1440 field_25449;
   private class_1440 field_25451;
   private class_8709 field_25454;
   private class_8709 field_25452;
   private boolean field_25450 = false;

   public class_4918(float var1, float var2, class_8709 var3, float var4, float var5, class_8709 var6) {
      this(var1, var2, var3, var4, var5, var6, false);
   }

   public class_4918(float var1, float var2, class_8709 var3, float var4, float var5, class_8709 var6, boolean var7) {
      this(new class_1440(var1, var2), var3, new class_1440(var4, var5), var6, var7);
   }

   public class_4918(class_1440 var1, class_8709 var2, class_1440 var3, class_8709 var4, boolean var5) {
      this.field_25449 = new class_1440(var1);
      this.field_25451 = new class_1440(var3);
      this.field_25454 = new class_8709(var2);
      this.field_25452 = new class_8709(var4);
      this.field_25450 = var5;
   }

   public class_4918 method_22518() {
      return new class_4918(this.field_25449, this.field_25452, this.field_25451, this.field_25454, this.field_25450);
   }

   public void method_22524(boolean var1) {
      this.field_25450 = var1;
   }

   public class_1440 method_22515() {
      return this.field_25449;
   }

   public class_1440 method_22516() {
      return this.field_25451;
   }

   public class_8709 method_22517() {
      return this.field_25454;
   }

   public class_8709 method_22527() {
      return this.field_25452;
   }

   public void method_22521(float var1, float var2) {
      this.method_22522(new class_1440(var1, var2));
   }

   public void method_22522(class_1440 var1) {
      this.field_25449 = new class_1440(var1);
   }

   public void method_22525(float var1, float var2) {
      this.method_22526(new class_1440(var1, var2));
   }

   public void method_22526(class_1440 var1) {
      this.field_25451 = new class_1440(var1);
   }

   public void method_22519(class_8709 var1) {
      this.field_25454 = new class_8709(var1);
   }

   public void method_22523(class_8709 var1) {
      this.field_25452 = new class_8709(var1);
   }

   @Override
   public class_8709 method_27016(class_3316 var1, float var2, float var3) {
      return !this.field_25450 ? this.method_22520(var2, var3) : this.method_22520(var2 - var1.method_15241(), var3 - var1.method_15222());
   }

   public class_8709 method_22520(float var1, float var2) {
      float var5 = this.field_25451.method_6610() - this.field_25449.method_6610();
      float var6 = this.field_25451.method_6613() - this.field_25449.method_6613();
      float var7 = -var6;
      float var9 = var5 * var5 - var7 * var6;
      if (var9 != 0.0F) {
         float var10 = var7 * (this.field_25449.method_6613() - var2) - var5 * (this.field_25449.method_6610() - var1);
         var10 /= var9;
         float var11 = var5 * (this.field_25449.method_6613() - var2) - var6 * (this.field_25449.method_6610() - var1);
         var11 /= var9;
         float var12 = var10;
         if (var10 < 0.0F) {
            var12 = 0.0F;
         }

         if (var12 > 1.0F) {
            var12 = 1.0F;
         }

         float var13 = 1.0F - var12;
         class_8709 var14 = new class_8709(1, 1, 1, 1);
         var14.field_44663 = var12 * this.field_25452.field_44663 + var13 * this.field_25454.field_44663;
         var14.field_44648 = var12 * this.field_25452.field_44648 + var13 * this.field_25454.field_44648;
         var14.field_44649 = var12 * this.field_25452.field_44649 + var13 * this.field_25454.field_44649;
         var14.field_44645 = var12 * this.field_25452.field_44645 + var13 * this.field_25454.field_44645;
         return var14;
      } else {
         return class_8709.field_44647;
      }
   }

   @Override
   public class_1440 method_27015(class_3316 var1, float var2, float var3) {
      return this.field_25455;
   }
}

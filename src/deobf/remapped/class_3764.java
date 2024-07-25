package remapped;

public class class_3764 extends class_7690 {
   private static String[] field_18404;
   private final class_7907 field_18409;
   private final class_8107 field_18405;
   private final class_6555 field_18411;
   private float field_18413;
   private float field_18412;
   private float field_18407;
   private int field_18406;
   private int field_18416;
   private int field_18410;
   private float field_18408;
   private float field_18415;
   private float field_18414;

   public class_3764(class_7907 var1, class_8107 var2, class_6555 var3) {
      this.field_18409 = var1;
      this.field_18405 = var2.method_36824();
      this.field_18405.method_36809();
      this.field_18411 = var3.method_29882();
      this.field_18411.method_29886();
      this.method_17434();
   }

   private void method_17434() {
      this.field_18413 = 0.0F;
      this.field_18412 = 0.0F;
      this.field_18407 = 0.0F;
      this.field_18406 = 0;
      this.field_18416 = 10;
      this.field_18410 = 15728880;
      this.field_18408 = 0.0F;
      this.field_18415 = 1.0F;
      this.field_18414 = 0.0F;
   }

   @Override
   public void method_35735() {
      class_2426 var3 = new class_2426(this.field_18408, this.field_18415, this.field_18414);
      var3.method_11059(this.field_18411);
      Direction var4 = Direction.method_1045(var3.method_11057(), var3.method_11061(), var3.method_11055());
      class_2637 var5 = new class_2637(this.field_18413, this.field_18412, this.field_18407, 1.0F);
      var5.method_11929(this.field_18405);
      var5.method_11928(class_2426.field_12074.method_11074(180.0F));
      var5.method_11928(class_2426.field_12080.method_11074(-90.0F));
      var5.method_11928(var4.method_1026());
      float var6 = -var5.method_11923();
      float var7 = -var5.method_11922();
      this.field_18409
         .method_35761((double)this.field_18413, (double)this.field_18412, (double)this.field_18407)
         .method_35742(1.0F, 1.0F, 1.0F, 1.0F)
         .method_35745(var6, var7)
         .method_35738(this.field_18406, this.field_18416)
         .method_35747(this.field_18410)
         .method_35755(this.field_18408, this.field_18415, this.field_18414)
         .method_35735();
      this.method_17434();
   }

   @Override
   public class_7907 method_35761(double var1, double var3, double var5) {
      this.field_18413 = (float)var1;
      this.field_18412 = (float)var3;
      this.field_18407 = (float)var5;
      return this;
   }

   @Override
   public class_7907 method_35743(int var1, int var2, int var3, int var4) {
      return this;
   }

   @Override
   public class_7907 method_35745(float var1, float var2) {
      return this;
   }

   @Override
   public class_7907 method_35738(int var1, int var2) {
      this.field_18406 = var1;
      this.field_18416 = var2;
      return this;
   }

   @Override
   public class_7907 method_35748(int var1, int var2) {
      this.field_18410 = var1 | var2 << 16;
      return this;
   }

   @Override
   public class_7907 method_35755(float var1, float var2, float var3) {
      this.field_18408 = var1;
      this.field_18415 = var2;
      this.field_18414 = var3;
      return this;
   }
}

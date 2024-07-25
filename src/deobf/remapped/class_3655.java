package remapped;

public class class_3655 implements class_7462 {
   private static String[] field_17807;
   private final double field_17806;
   private double field_17809;
   private double field_17804;
   private double field_17808;
   private double field_17810;
   private class_4190 field_17811;

   public class_3655(class_2098 var1, double var2) {
      this.field_17805 = var1;
      this.field_17806 = var2;
      this.method_16992();
   }

   @Override
   public double method_33955() {
      return this.field_17809;
   }

   @Override
   public double method_33953() {
      return this.field_17808;
   }

   @Override
   public double method_33961() {
      return this.field_17804;
   }

   @Override
   public double method_33958() {
      return this.field_17810;
   }

   @Override
   public double method_33959() {
      return this.field_17806;
   }

   @Override
   public class_4044 method_33956() {
      return class_4044.field_19624;
   }

   @Override
   public double method_33954() {
      return 0.0;
   }

   @Override
   public long method_33960() {
      return 0L;
   }

   @Override
   public double method_33964() {
      return this.field_17806;
   }

   private void method_16992() {
      this.field_17809 = Math.max(this.field_17805.method_9807() - this.field_17806 / 2.0, (double)(-class_2098.method_9837(this.field_17805)));
      this.field_17804 = Math.max(this.field_17805.method_9835() - this.field_17806 / 2.0, (double)(-class_2098.method_9837(this.field_17805)));
      this.field_17808 = Math.min(this.field_17805.method_9807() + this.field_17806 / 2.0, (double)class_2098.method_9837(this.field_17805));
      this.field_17810 = Math.min(this.field_17805.method_9835() + this.field_17806 / 2.0, (double)class_2098.method_9837(this.field_17805));
      this.field_17811 = class_3370.method_15533(
         class_3370.field_16614,
         class_3370.method_15522(
            Math.floor(this.method_33955()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.method_33961()),
            Math.ceil(this.method_33953()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.method_33958())
         ),
         class_8529.field_43656
      );
   }

   @Override
   public void method_33952() {
      this.method_16992();
   }

   @Override
   public void method_33957() {
      this.method_16992();
   }

   @Override
   public class_7462 method_33963() {
      return this;
   }

   @Override
   public class_4190 method_33962() {
      return this.field_17811;
   }
}

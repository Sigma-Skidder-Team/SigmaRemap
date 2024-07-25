package remapped;

public class class_5270 implements class_7462 {
   private static String[] field_26940;
   private final double field_26939;
   private final double field_26942;
   private final long field_26937;
   private final long field_26941;
   private final double field_26938;

   private class_5270(class_2098 var1, double var2, double var4, long var6) {
      this.field_26943 = var1;
      this.field_26939 = var2;
      this.field_26942 = var4;
      this.field_26938 = (double)var6;
      this.field_26941 = class_9665.method_44650();
      this.field_26937 = this.field_26941 + var6;
   }

   @Override
   public double method_33955() {
      return Math.max(this.field_26943.method_9807() - this.method_33959() / 2.0, (double)(-class_2098.method_9837(this.field_26943)));
   }

   @Override
   public double method_33961() {
      return Math.max(this.field_26943.method_9835() - this.method_33959() / 2.0, (double)(-class_2098.method_9837(this.field_26943)));
   }

   @Override
   public double method_33953() {
      return Math.min(this.field_26943.method_9807() + this.method_33959() / 2.0, (double)class_2098.method_9837(this.field_26943));
   }

   @Override
   public double method_33958() {
      return Math.min(this.field_26943.method_9835() + this.method_33959() / 2.0, (double)class_2098.method_9837(this.field_26943));
   }

   @Override
   public double method_33959() {
      double var3 = (double)(class_9665.method_44650() - this.field_26941) / this.field_26938;
      return !(var3 < 1.0) ? this.field_26942 : class_9299.method_42794(var3, this.field_26939, this.field_26942);
   }

   @Override
   public double method_33954() {
      return Math.abs(this.field_26939 - this.field_26942) / (double)(this.field_26937 - this.field_26941);
   }

   @Override
   public long method_33960() {
      return this.field_26937 - class_9665.method_44650();
   }

   @Override
   public double method_33964() {
      return this.field_26942;
   }

   @Override
   public class_4044 method_33956() {
      return !(this.field_26942 < this.field_26939) ? class_4044.field_19626 : class_4044.field_19621;
   }

   @Override
   public void method_33957() {
   }

   @Override
   public void method_33952() {
   }

   @Override
   public class_7462 method_33963() {
      Object var10000;
      if (this.method_33960() > 0L) {
         var10000 = this;
      } else {
         class_2098 var10002 = this.field_26943;
         this.field_26943.getClass();
         var10000 = new class_3655(var10002, this.field_26942);
      }

      return (class_7462)var10000;
   }

   @Override
   public class_4190 method_33962() {
      return class_3370.method_15533(
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
}

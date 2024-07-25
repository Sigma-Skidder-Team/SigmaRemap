package remapped;

public class class_1042 extends class_3558 {
   private static String[] field_5744;
   private int field_5745;

   private class_1042(class_2547 var1) {
      super(var1);
      this.field_5743 = var1;
   }

   @Override
   public boolean method_16795() {
      if (super.method_16795()) {
         if (this.field_5743.method_17809() != null) {
            return this.field_5743.method_17809().method_37145() != this.field_5745
               ? this.field_5743.field_41768.method_43368(this.field_5743.method_37075()).method_44286((float)class_423.field_1789.ordinal())
               : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_5745 = this.field_5743.method_17809().method_37145();
   }

   @Override
   public int method_16545() {
      return 20;
   }

   @Override
   public int method_16541() {
      return 180;
   }

   @Override
   public void method_16543() {
      this.field_5743.method_17809().method_26558(new class_2250(Effects.field_19736, 400));
   }

   @Override
   public SoundEvent method_16540() {
      return SoundEvents.field_2397;
   }

   @Override
   public class_248 method_16544() {
      return class_248.field_874;
   }
}

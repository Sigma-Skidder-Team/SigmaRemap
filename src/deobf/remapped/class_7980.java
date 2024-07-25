package remapped;

public class class_7980 extends class_4138<class_704> {
   private static String[] field_40870;

   public class_7980(class_6092 var1, class_6092 var2) {
      super(var2, class_704.class, true);
      this.field_40869 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_40869.field_41768.method_43370() != class_423.field_1790 ? super.method_16795() : false;
   }

   @Override
   public class_4092 method_19212(double var1) {
      Direction var5 = ((class_6092)this.field_4915).method_27914();
      if (var5.method_1029() != class_9249.field_47215) {
         return var5.method_1029() != class_9249.field_47219
            ? this.field_4915.method_37241().method_18899(var1, 4.0, var1)
            : this.field_4915.method_37241().method_18899(var1, var1, 4.0);
      } else {
         return this.field_4915.method_37241().method_18899(4.0, var1, var1);
      }
   }
}

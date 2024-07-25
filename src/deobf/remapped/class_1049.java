package remapped;

public class class_1049 extends class_4138<class_5834> {
   private static String[] field_5760;

   public class_1049(class_6092 var1) {
      super(var1, class_5834.class, 10, true, false, var0 -> var0 instanceof class_1869);
   }

   @Override
   public boolean method_16795() {
      return this.field_4915.method_37095() != null ? super.method_16795() : false;
   }

   @Override
   public class_4092 method_19212(double var1) {
      class_240 var5 = ((class_6092)this.field_4915).method_27914();
      if (var5.method_1029() != class_9249.field_47215) {
         return var5.method_1029() != class_9249.field_47219
            ? this.field_4915.method_37241().method_18899(var1, 4.0, var1)
            : this.field_4915.method_37241().method_18899(var1, var1, 4.0);
      } else {
         return this.field_4915.method_37241().method_18899(4.0, var1, var1);
      }
   }
}

package remapped;

public class class_6213 extends class_5932 {
   private class_4368 field_31745 = null;

   public class_6213(class_4368 var1, int var2, int var3, int var4, int var5) {
      super(var1.ordinal(), var2, var3, var4, var5, method_28416(var1));
      this.field_31745 = var1;
   }

   public class_4368 method_28415() {
      return this.field_31745;
   }

   private static String method_28416(class_4368 var0) {
      String var3 = class_6956.method_31803(var0.method_20249()) + ": ";
      switch (var0) {
         case field_21421:
            return var3 + class_1789.method_7970(class_6588.field_33631);
         case field_21408:
            return var3 + class_1789.method_7966(class_6588.field_33603);
         case field_21419:
            return var3 + class_1789.method_7966(class_6588.field_33634);
         case field_21420:
            return var3 + class_1789.method_7964(class_6588.field_33825);
         case field_21418:
            return var3 + class_1789.method_7964(class_6588.field_33763);
         case field_21407:
            return var3 + class_1789.method_7971(class_6588.field_33751);
         case field_21413:
            return var3 + class_1789.method_7966(class_6588.field_33964);
         case field_21404:
            return var3 + class_6588.field_33652.method_28244();
         case field_21411:
            return var3 + class_6588.field_33723.method_28244();
         case field_21410:
            return var3 + class_1789.method_7966(class_6588.field_33962);
         case field_21425:
            return var3 + class_1789.method_7966(class_6588.field_33794);
         default:
            return var3 + class_6588.method_30119(var0);
      }
   }

   public void method_28417() {
      this.method_27121(method_28416(this.field_31745));
   }

   @Override
   public boolean method_32702(int var1) {
      return true;
   }
}

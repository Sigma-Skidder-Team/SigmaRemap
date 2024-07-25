package remapped;

public class class_1600 implements class_7279 {
   private static String[] field_8330;
   private final class_5093 field_8329;
   private final class_1331 field_8331;

   private class_1600(class_5093 var1, class_1331 var2) {
      this.field_8329 = var1;
      this.field_8331 = var2;
   }

   @Override
   public class_2190 method_33269() {
      return class_5110.field_26354;
   }

   public boolean test(class_2792 var1) {
      class_1343 var4 = var1.<class_1343>method_12698(class_8712.field_44671);
      return var4 != null
         && this.field_8329
            .method_23401(
               var1.method_12694(),
               var4.method_61() + (double)this.field_8331.method_12173(),
               var4.method_60() + (double)this.field_8331.method_12165(),
               var4.method_62() + (double)this.field_8331.method_12185()
            );
   }

   public static class_5704 method_7177(class_6352 var0) {
      return () -> new class_1600(var0.method_29097(), class_1331.field_7306);
   }

   public static class_5704 method_7179(class_6352 var0, class_1331 var1) {
      return () -> new class_1600(var0.method_29097(), var1);
   }
}

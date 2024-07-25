package remapped;

public class class_8543 extends class_2830 {
   private static String[] field_43728;
   public static final class_4190 field_43731 = class_6414.method_29292(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final class_1425 field_43729;
   private final int field_43730;

   public class_8543(class_1425 var1, int var2, class_3073 var3) {
      super(var3);
      this.field_43729 = var1;
      if (!var1.method_6535()) {
         this.field_43730 = var2 * 20;
      } else {
         this.field_43730 = var2;
      }
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      class_1343 var7 = var1.method_8353(var2, var3);
      return field_43731.method_19496(var7.field_7336, var7.field_7333, var7.field_7334);
   }

   @Override
   public class_7971 method_10772() {
      return class_7971.field_40824;
   }

   public class_1425 method_39321() {
      return this.field_43729;
   }

   public int method_39322() {
      return this.field_43730;
   }
}

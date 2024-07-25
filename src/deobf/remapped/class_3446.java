package remapped;

import com.google.common.base.Preconditions;

public class class_3446 {
   private static class_7642 field_16916;
   private static class_7405 field_16918;

   public static void method_15887(class_7405 var0) {
      field_16916 = var0.method_33737();
      field_16918 = var0;
   }

   public static class_8332 method_15885() {
      Preconditions.checkArgument(field_16916 != null, "ViaVersion has not loaded the Platform");
      return field_16916.method_34632();
   }

   public static class_5714 method_15884() {
      Preconditions.checkArgument(field_16916 != null, "ViaVersion has not loaded the Platform");
      return field_16916.method_34626();
   }

   public static class_7642 method_15886() {
      return field_16916;
   }

   public static class_7405 method_15883() {
      return field_16918;
   }
}

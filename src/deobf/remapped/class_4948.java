package remapped;

public class class_4948 {
   private static String[] field_25608;
   public static final class_6581 field_25609 = class_6325::method_28872;
   public static final class_6581 field_25610 = (var0, var1, var3) -> var0.method_28864();
   public static final class_6581 field_25607 = (var0, var1, var3) -> var0.method_28860();

   private static int method_22671(class_5561 var0, class_1331 var1, class_6581 var2) {
      return var0.method_25262(var1, var2);
   }

   public static int method_22673(class_5561 var0, class_1331 var1) {
      return method_22671(var0, var1, field_25609);
   }

   public static int method_22672(class_5561 var0, class_1331 var1) {
      return method_22671(var0, var1, field_25610);
   }

   public static int method_22674(class_5561 var0, class_1331 var1) {
      return method_22671(var0, var1, field_25607);
   }
}

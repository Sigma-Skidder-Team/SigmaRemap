package remapped;

import java.util.stream.Collectors;

public class class_8410 {
   private static String[] field_43016;
   private static volatile class_6437 field_43017 = class_6437.method_29388(
      class_9349.<class_6414>method_43138(
         class_2351.method_10756().stream().collect(Collectors.toMap(class_8813::method_40487, var0 -> (class_2307<class_6414>)var0))
      ),
      class_9349.<class_2451>method_43138(
         class_391.method_1890().stream().collect(Collectors.toMap(class_8813::method_40487, var0 -> (class_2307<class_2451>)var0))
      ),
      class_9349.<class_2340>method_43138(
         class_6503.method_29650().stream().collect(Collectors.toMap(class_8813::method_40487, var0 -> (class_2307<class_2340>)var0))
      ),
      class_9349.<EntityType<?>>method_43138(
         class_5218.method_23901().stream().collect(Collectors.toMap(class_8813::method_40487, var0 -> (class_2307<EntityType<?>>)var0))
      )
   );

   public static class_6437 method_38721() {
      return field_43017;
   }

   public static void method_38722(class_6437 var0) {
      field_43017 = var0;
   }
}

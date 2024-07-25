package remapped;

import java.util.stream.Collectors;

public class class_8410 {
   private static String[] field_43016;
   private static volatile ITagCollectionSupplier field_43017 = ITagCollectionSupplier.method_29388(
      ITagCollection.<class_6414>method_43138(
         class_2351.method_10756().stream().collect(Collectors.toMap(INamedTag::method_40487, var0 -> (class_2307<class_6414>)var0))
      ),
      ITagCollection.<class_2451>method_43138(
         class_391.method_1890().stream().collect(Collectors.toMap(INamedTag::method_40487, var0 -> (class_2307<class_2451>)var0))
      ),
      ITagCollection.<class_2340>method_43138(
         class_6503.method_29650().stream().collect(Collectors.toMap(INamedTag::method_40487, var0 -> (class_2307<class_2340>)var0))
      ),
      ITagCollection.<EntityType<?>>method_43138(
         EntityTypeTags.getAllTags().stream().collect(Collectors.toMap(INamedTag::method_40487, var0 -> (class_2307<EntityType<?>>)var0))
      )
   );

   public static ITagCollectionSupplier method_38721() {
      return field_43017;
   }

   public static void method_38722(ITagCollectionSupplier var0) {
      field_43017 = var0;
   }
}

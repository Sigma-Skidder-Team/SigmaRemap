package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_6033 implements class_4530 {
   field_30811("air"),
   field_30813("liquid");

   public static final Codec<class_6033> field_30810 = class_4530.<class_6033>method_21048(class_6033::values, class_6033::method_27509);
   private static final Map<String, class_6033> field_30814 = Arrays.<class_6033>stream(values())
      .collect(Collectors.toMap(class_6033::method_27510, var0 -> (class_6033)var0));
   private final String field_30812;

   private class_6033(String var3) {
      this.field_30812 = var3;
   }

   public String method_27510() {
      return this.field_30812;
   }

   @Nullable
   public static class_6033 method_27509(String var0) {
      return field_30814.get(var0);
   }

   @Override
   public String method_21049() {
      return this.field_30812;
   }
}

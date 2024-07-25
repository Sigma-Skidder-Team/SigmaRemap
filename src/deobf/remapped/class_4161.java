package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_4161 implements class_4530 {
   field_20226("warm"),
   field_20229("cold");

   public static final Codec<class_4161> field_20227 = class_4530.<class_4161>method_21048(class_4161::values, class_4161::method_19302);
   private static final Map<String, class_4161> field_20228 = Arrays.<class_4161>stream(values())
      .collect(Collectors.toMap(class_4161::method_19303, var0 -> (class_4161)var0));
   private final String field_20224;

   private class_4161(String var3) {
      this.field_20224 = var3;
   }

   public String method_19303() {
      return this.field_20224;
   }

   @Nullable
   public static class_4161 method_19302(String var0) {
      return field_20228.get(var0);
   }

   @Override
   public String method_21049() {
      return this.field_20224;
   }
}

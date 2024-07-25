package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_4184 implements class_4530 {
   field_20366("none"),
   field_20370("dark_forest"),
   field_20365("swamp");

   private final String field_20367;
   public static final Codec<class_4184> field_20369 = class_4530.<class_4184>method_21048(class_4184::values, class_4184::method_19464);
   private static final Map<String, class_4184> field_20371 = Arrays.<class_4184>stream(values())
      .collect(Collectors.toMap(class_4184::method_19462, var0 -> (class_4184)var0));

   public abstract int method_19463(double var1, double var3, int var5);

   private class_4184(String var3) {
      this.field_20367 = var3;
   }

   public String method_19462() {
      return this.field_20367;
   }

   @Override
   public String method_21049() {
      return this.field_20367;
   }

   public static class_4184 method_19464(String var0) {
      return field_20371.get(var0);
   }
}

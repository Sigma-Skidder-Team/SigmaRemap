package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_1143 implements class_4530 {
   field_6470("normal"),
   field_6469("mesa");

   public static final Codec<class_1143> field_6468 = class_4530.<class_1143>method_21048(class_1143::values, class_1143::method_5007);
   private static final Map<String, class_1143> field_6467 = Arrays.<class_1143>stream(values())
      .collect(Collectors.toMap(class_1143::method_5006, var0 -> (class_1143)var0));
   private final String field_6464;

   private class_1143(String var3) {
      this.field_6464 = var3;
   }

   public String method_5006() {
      return this.field_6464;
   }

   private static class_1143 method_5007(String var0) {
      return field_6467.get(var0);
   }

   public static class_1143 method_5008(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : field_6470;
   }

   @Override
   public String method_21049() {
      return this.field_6464;
   }
}

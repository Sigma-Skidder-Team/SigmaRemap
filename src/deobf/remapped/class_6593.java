package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_6593 implements class_4530 {
   field_34019("standard"),
   field_34013("desert"),
   field_34023("jungle"),
   field_34015("swamp"),
   field_34018("mountain"),
   field_34020("ocean"),
   field_34016("nether");

   public static final Codec<class_6593> field_34021 = class_4530.<class_6593>method_21048(class_6593::values, class_6593::method_30362);
   private static final Map<String, class_6593> field_34014 = Arrays.<class_6593>stream(values())
      .collect(Collectors.toMap(class_6593::method_30364, var0 -> (class_6593)var0));
   private final String field_34024;

   private class_6593(String var3) {
      this.field_34024 = var3;
   }

   public String method_30364() {
      return this.field_34024;
   }

   public static class_6593 method_30362(String var0) {
      return field_34014.get(var0);
   }

   @Override
   public String method_21049() {
      return this.field_34024;
   }
}

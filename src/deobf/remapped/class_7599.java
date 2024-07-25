package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum class_7599 implements class_4530 {
   field_38703("terrain_matching", ImmutableList.of(new class_4943(class_3801.field_18598, -1))),
   field_38708("rigid", ImmutableList.of());

   public static final Codec<class_7599> field_38705 = class_4530.<class_7599>method_21048(class_7599::values, class_7599::method_34509);
   private static final Map<String, class_7599> field_38704 = Arrays.<class_7599>stream(values())
      .collect(Collectors.toMap(class_7599::method_34507, var0 -> (class_7599)var0));
   private final String field_38701;
   private final ImmutableList<class_2103> field_38702;

   private class_7599(String var3, ImmutableList<class_2103> var4) {
      this.field_38701 = var3;
      this.field_38702 = var4;
   }

   public String method_34507() {
      return this.field_38701;
   }

   public static class_7599 method_34509(String var0) {
      return field_38704.get(var0);
   }

   public ImmutableList<class_2103> method_34508() {
      return this.field_38702;
   }

   @Override
   public String method_21049() {
      return this.field_38701;
   }
}

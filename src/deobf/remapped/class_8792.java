package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public enum class_8792 {
   field_44983("integer"),
   field_44982("hearts");

   private final String field_44981;
   private static final Map<String, class_8792> field_44984;

   private class_8792(String var3) {
      this.field_44981 = var3;
   }

   public String method_40390() {
      return this.field_44981;
   }

   public static class_8792 method_40389(String var0) {
      return field_44984.getOrDefault(var0, field_44983);
   }

   static {
      Builder var4 = ImmutableMap.builder();

      for (class_8792 var10 : values()) {
         var4.put(var10.field_44981, var10);
      }

      field_44984 = var4.build();
   }
}

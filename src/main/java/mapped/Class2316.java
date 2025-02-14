package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import java.util.Map;

public enum Class2316 {
   field15868("integer"),
   field15869("hearts");

   private final String field15870;
   private static final Map<String, Class2316> field15871;
   private static final Class2316[] field15872 = new Class2316[]{field15868, field15869};

   private Class2316(String var3) {
      this.field15870 = var3;
   }

   public String method9088() {
      return this.field15870;
   }

   public static Class2316 method9089(String var0) {
      return field15871.getOrDefault(var0, field15868);
   }

   static {
      Builder var4 = ImmutableMap.builder();

      for (Class2316 var10 : values()) {
         var4.put(var10.field15870, var10);
      }

      field15871 = var4.build();
   }
}

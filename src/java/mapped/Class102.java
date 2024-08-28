package mapped;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class102 implements Class83 {
   field307("normal"),
   field308("mesa");

   public static final Codec<Class102> field309 = Class83.<Class102>method258(Class102::values, Class102::method292);
   private static final Map<String, Class102> field310 = Arrays.<Class102>stream(values())
      .collect(Collectors.toMap(Class102::method291, var0 -> (Class102)var0));
   private final String field311;
   private static final Class102[] field312 = new Class102[]{field307, field308};

   private Class102(String var3) {
      this.field311 = var3;
   }

   public String method291() {
      return this.field311;
   }

   private static Class102 method292(String var0) {
      return field310.get(var0);
   }

   public static Class102 method293(int var0) {
      return var0 >= 0 && var0 < values().length ? values()[var0] : field307;
   }

   @Override
   public String method257() {
      return this.field311;
   }
}

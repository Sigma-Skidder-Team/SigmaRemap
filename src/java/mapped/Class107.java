package mapped;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class107 implements Class83 {
   field336("standard"),
   field337("desert"),
   field338("jungle"),
   field339("swamp"),
   field340("mountain"),
   field341("ocean"),
   field342("nether");

   public static final Codec<Class107> field343 = Class83.<Class107>method258(Class107::values, Class107::method297);
   private static final Map<String, Class107> field344 = Arrays.<Class107>stream(values())
      .collect(Collectors.toMap(Class107::method296, var0 -> (Class107)var0));
   private final String field345;
   private static final Class107[] field346 = new Class107[]{field336, field337, field338, field339, field340, field341, field342};

   private Class107(String var3) {
      this.field345 = var3;
   }

   public String method296() {
      return this.field345;
   }

   public static Class107 method297(String var0) {
      return field344.get(var0);
   }

   @Override
   public String method257() {
      return this.field345;
   }
}

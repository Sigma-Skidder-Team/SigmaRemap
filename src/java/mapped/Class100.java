package mapped;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class100 implements Class83 {
   field274("none"),
   field275("taiga"),
   field276("extreme_hills"),
   field277("jungle"),
   field278("mesa"),
   field279("plains"),
   field280("savanna"),
   field281("icy"),
   field282("the_end"),
   field283("beach"),
   field284("forest"),
   field285("ocean"),
   field286("desert"),
   field287("river"),
   field288("swamp"),
   field289("mushroom"),
   field290("nether");

   public static final Codec<Class100> field291 = Class83.<Class100>method258(Class100::values, Class100::method281);
   private static final Map<String, Class100> field292 = Arrays.<Class100>stream(values())
      .collect(Collectors.toMap(Class100::method280, var0 -> (Class100)var0));
   private final String field293;
   private static final Class100[] field294 = new Class100[]{
      field274,
      field275,
      field276,
      field277,
      field278,
      field279,
      field280,
      field281,
      field282,
      field283,
      field284,
      field285,
      field286,
      field287,
      field288,
      field289,
      field290
   };

   private Class100(String var3) {
      this.field293 = var3;
   }

   public String method280() {
      return this.field293;
   }

   public static Class100 method281(String var0) {
      return field292.get(var0);
   }

   @Override
   public String method257() {
      return this.field293;
   }
}

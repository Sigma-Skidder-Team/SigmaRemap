package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.function.Predicate;

public enum Class101 implements Class83 {
   field295("WORLD_SURFACE_WG", Class2029.field13170, Class7527.method24587()),
   field296("WORLD_SURFACE", Class2029.field13172, Class7527.method24587()),
   field297("OCEAN_FLOOR_WG", Class2029.field13170, Class7527.method24588()),
   field298("OCEAN_FLOOR", Class2029.field13171, Class7527.method24588()),
   field299("MOTION_BLOCKING", Class2029.field13172, var0 -> var0.method23384().method31087() || !var0.method23449().method23474()),
   field300(
      "MOTION_BLOCKING_NO_LEAVES",
      Class2029.field13171,
      var0 -> (var0.method23384().method31087() || !var0.method23449().method23474()) && !(var0.getBlock() instanceof Class3465)
   );

   public static final Codec<Class101> field301 = Class83.<Class101>method258(Class101::values, Class101::method286);
   private final String field302;
   private final Class2029 field303;
   private final Predicate<BlockState> field304;
   private static final Map<String, Class101> field305 = Util.<Map<String, Class101>>make(Maps.newHashMap(), var0 -> {
      for (Class101 var6 : values()) {
         var0.put(var6.field302, var6);
      }
   });
   private static final Class101[] field306 = new Class101[]{field295, field296, field297, field298, field299, field300};

   private Class101(String var3, Class2029 var4, Predicate<BlockState> var5) {
      this.field302 = var3;
      this.field303 = var4;
      this.field304 = var5;
   }

   public String method283() {
      return this.field302;
   }

   public boolean method284() {
      return this.field303 == Class2029.field13172;
   }

   public boolean method285() {
      return this.field303 != Class2029.field13170;
   }

   @Nullable
   public static Class101 method286(String var0) {
      return field305.get(var0);
   }

   public Predicate<BlockState> method287() {
      return this.field304;
   }

   @Override
   public String method257() {
      return this.field302;
   }
}

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public final class Class9564 {
   public static final Class9564 field44540 = method37067("desert");
   public static final Class9564 field44541 = method37067("jungle");
   public static final Class9564 field44542 = method37067("plains");
   public static final Class9564 field44543 = method37067("savanna");
   public static final Class9564 field44544 = method37067("snow");
   public static final Class9564 field44545 = method37067("swamp");
   public static final Class9564 field44546 = method37067("taiga");
   private final String field44547;
   private static final Map<RegistryKey<Biome>, Class9564> field44548 = Util.<Map<RegistryKey<Biome>, Class9564>>make(
      Maps.newHashMap(), var0 -> {
         var0.put(Class9495.field44158, field44540);
         var0.put(Class9495.field44160, field44540);
         var0.put(Class9495.field44123, field44540);
         var0.put(Class9495.field44138, field44540);
         var0.put(Class9495.field44174, field44540);
         var0.put(Class9495.field44191, field44540);
         var0.put(Class9495.field44193, field44540);
         var0.put(Class9495.field44192, field44540);
         var0.put(Class9495.field44159, field44540);
         var0.put(Class9495.field44194, field44541);
         var0.put(Class9495.field44195, field44541);
         var0.put(Class9495.field44142, field44541);
         var0.put(Class9495.field44144, field44541);
         var0.put(Class9495.field44143, field44541);
         var0.put(Class9495.field44180, field44541);
         var0.put(Class9495.field44181, field44541);
         var0.put(Class9495.field44157, field44543);
         var0.put(Class9495.field44156, field44543);
         var0.put(Class9495.field44189, field44543);
         var0.put(Class9495.field44190, field44543);
         var0.put(Class9495.field44171, field44544);
         var0.put(Class9495.field44131, field44544);
         var0.put(Class9495.field44132, field44544);
         var0.put(Class9495.field44179, field44544);
         var0.put(Class9495.field44147, field44544);
         var0.put(Class9495.field44134, field44544);
         var0.put(Class9495.field44151, field44544);
         var0.put(Class9495.field44152, field44544);
         var0.put(Class9495.field44185, field44544);
         var0.put(Class9495.field44133, field44544);
         var0.put(Class9495.field44127, field44545);
         var0.put(Class9495.field44178, field44545);
         var0.put(Class9495.field44186, field44546);
         var0.put(Class9495.field44187, field44546);
         var0.put(Class9495.field44153, field44546);
         var0.put(Class9495.field44154, field44546);
         var0.put(Class9495.field44175, field44546);
         var0.put(Class9495.field44188, field44546);
         var0.put(Class9495.field44141, field44546);
         var0.put(Class9495.field44124, field44546);
         var0.put(Class9495.field44126, field44546);
         var0.put(Class9495.field44140, field44546);
         var0.put(Class9495.field44177, field44546);
         var0.put(Class9495.field44155, field44546);
      }
   );

   private Class9564(String var1) {
      this.field44547 = var1;
   }

   @Override
   public String toString() {
      return this.field44547;
   }

   private static Class9564 method37067(String var0) {
      return Registry.<Class9564, Class9564>register(Registry.field16089, new ResourceLocation(var0), new Class9564(var0));
   }

   public static Class9564 method37068(Optional<RegistryKey<Biome>> var0) {
      return var0.<Class9564>flatMap(var0x -> Optional.ofNullable(field44548.get(var0x))).orElse(field44542);
   }
}

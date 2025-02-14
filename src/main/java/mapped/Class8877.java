package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Optional;

public class Class8877 {
   private static final BiMap<String, Integer> field40179 = HashBiMap.create();

   private static void method32296(String var0) {
      field40179.put(var0, field40179.size());
   }

   public static int method32297(String var0) {
      return field40179.containsKey(var0) ? 25100288 | (Integer)field40179.get(var0) & 65535 : -1;
   }

   public static Optional<String> method32298(int var0) {
      return var0 >> 16 == 383 ? Optional.<String>ofNullable((String)field40179.inverse().get(var0 & 65535)) : Optional.<String>empty();
   }

   static {
      method32296("minecraft:bat");
      method32296("minecraft:blaze");
      method32296("minecraft:cave_spider");
      method32296("minecraft:chicken");
      method32296("minecraft:cow");
      method32296("minecraft:creeper");
      method32296("minecraft:donkey");
      method32296("minecraft:elder_guardian");
      method32296("minecraft:enderman");
      method32296("minecraft:endermite");
      method32296("minecraft:evocation_illager");
      method32296("minecraft:ghast");
      method32296("minecraft:guardian");
      method32296("minecraft:horse");
      method32296("minecraft:husk");
      method32296("minecraft:llama");
      method32296("minecraft:magma_cube");
      method32296("minecraft:mooshroom");
      method32296("minecraft:mule");
      method32296("minecraft:ocelot");
      method32296("minecraft:parrot");
      method32296("minecraft:pig");
      method32296("minecraft:polar_bear");
      method32296("minecraft:rabbit");
      method32296("minecraft:sheep");
      method32296("minecraft:shulker");
      method32296("minecraft:silverfish");
      method32296("minecraft:skeleton");
      method32296("minecraft:skeleton_horse");
      method32296("minecraft:slime");
      method32296("minecraft:spider");
      method32296("minecraft:squid");
      method32296("minecraft:stray");
      method32296("minecraft:vex");
      method32296("minecraft:villager");
      method32296("minecraft:vindication_illager");
      method32296("minecraft:witch");
      method32296("minecraft:wither_skeleton");
      method32296("minecraft:wolf");
      method32296("minecraft:zombie");
      method32296("minecraft:zombie_horse");
      method32296("minecraft:zombie_pigman");
      method32296("minecraft:zombie_villager");
   }
}

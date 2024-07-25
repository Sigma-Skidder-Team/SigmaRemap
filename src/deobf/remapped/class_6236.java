package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Optional;

public class class_6236 {
   private static final BiMap<String, Integer> field_31913 = HashBiMap.create();

   private static void method_28484(String var0) {
      field_31913.put(var0, field_31913.size());
   }

   public static int method_28483(String var0) {
      return field_31913.containsKey(var0) ? 25100288 | (Integer)field_31913.get(var0) & 65535 : -1;
   }

   public static Optional<String> method_28485(int var0) {
      return var0 >> 16 == 383 ? Optional.<String>ofNullable((String)field_31913.inverse().get(var0 & 65535)) : Optional.<String>empty();
   }

   static {
      method_28484("minecraft:bat");
      method_28484("minecraft:blaze");
      method_28484("minecraft:cave_spider");
      method_28484("minecraft:chicken");
      method_28484("minecraft:cow");
      method_28484("minecraft:creeper");
      method_28484("minecraft:donkey");
      method_28484("minecraft:elder_guardian");
      method_28484("minecraft:enderman");
      method_28484("minecraft:endermite");
      method_28484("minecraft:evocation_illager");
      method_28484("minecraft:ghast");
      method_28484("minecraft:guardian");
      method_28484("minecraft:horse");
      method_28484("minecraft:husk");
      method_28484("minecraft:llama");
      method_28484("minecraft:magma_cube");
      method_28484("minecraft:mooshroom");
      method_28484("minecraft:mule");
      method_28484("minecraft:ocelot");
      method_28484("minecraft:parrot");
      method_28484("minecraft:pig");
      method_28484("minecraft:polar_bear");
      method_28484("minecraft:rabbit");
      method_28484("minecraft:sheep");
      method_28484("minecraft:shulker");
      method_28484("minecraft:silverfish");
      method_28484("minecraft:skeleton");
      method_28484("minecraft:skeleton_horse");
      method_28484("minecraft:slime");
      method_28484("minecraft:spider");
      method_28484("minecraft:squid");
      method_28484("minecraft:stray");
      method_28484("minecraft:vex");
      method_28484("minecraft:villager");
      method_28484("minecraft:vindication_illager");
      method_28484("minecraft:witch");
      method_28484("minecraft:wither_skeleton");
      method_28484("minecraft:wolf");
      method_28484("minecraft:zombie");
      method_28484("minecraft:zombie_horse");
      method_28484("minecraft:zombie_pigman");
      method_28484("minecraft:zombie_villager");
   }
}

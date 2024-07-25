package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class class_3048 {
   private static final BiMap<String, String> field_14941 = HashBiMap.create();

   public static void method_13920(class_5531 var0) {
      method_13921(var0, false);
   }

   public static void method_13921(class_5531 var0, boolean var1) {
      class_5287 var4 = var0.<class_5287>method_25123("id");
      if (var4 instanceof class_887) {
         class_887 var5 = (class_887)var4;
         String var6 = !var1 ? (String)field_14941.get(var5.method_3809()) : (String)field_14941.inverse().get(var5.method_3809());
         if (var6 != null) {
            var5.method_3808(var6);
         }
      }
   }

   public static void method_13916(class_5531 var0) {
      method_13917(var0, false);
   }

   public static void method_13917(class_5531 var0, boolean var1) {
      if (var0 != null) {
         class_5287 var4 = var0.<class_5287>method_25123("SpawnData");
         if (var4 != null) {
            method_13921((class_5531)var4, var1);
         }
      }
   }

   public static void method_13922(class_9530 var0) {
      method_13923(var0, false);
   }

   public static void method_13923(class_9530 var0, boolean var1) {
      if (method_13915(var0)) {
         method_13921(var0.method_43959().<class_5531>method_25123("EntityTag"), var1);
      }

      if (var0 != null && var0.method_43967() <= 0) {
         var0.method_43961((byte)1);
      }
   }

   public static void method_13918(class_9530 var0) {
      method_13919(var0, false);
   }

   public static void method_13919(class_9530 var0, boolean var1) {
      if (method_13915(var0)) {
         class_5531 var4 = var0.method_43959().<class_5531>method_25123("EntityTag");
         class_5287 var5 = var4.<class_5287>method_25123("id");
         if (var5 instanceof class_887) {
            class_887 var6 = (class_887)var5;
            String var7 = !var1 ? (String)field_14941.inverse().get(var6.method_3809()) : (String)field_14941.get(var6.method_3809());
            if (var7 != null) {
               var6.method_3808(var7);
            }
         }
      }
   }

   private static boolean method_13915(class_9530 var0) {
      if (var0 != null && var0.method_43963() == 383) {
         class_5531 var3 = var0.method_43959();
         if (var3 == null) {
            return false;
         } else {
            class_5287 var4 = var3.<class_5287>method_25123("EntityTag");
            return var4 instanceof class_5531 && ((class_5531)var4).method_25123("id") instanceof class_887;
         }
      } else {
         return false;
      }
   }

   static {
      field_14941.put("AreaEffectCloud", "minecraft:area_effect_cloud");
      field_14941.put("ArmorStand", "minecraft:armor_stand");
      field_14941.put("Arrow", "minecraft:arrow");
      field_14941.put("Bat", "minecraft:bat");
      field_14941.put("Blaze", "minecraft:blaze");
      field_14941.put("Boat", "minecraft:boat");
      field_14941.put("CaveSpider", "minecraft:cave_spider");
      field_14941.put("Chicken", "minecraft:chicken");
      field_14941.put("Cow", "minecraft:cow");
      field_14941.put("Creeper", "minecraft:creeper");
      field_14941.put("Donkey", "minecraft:donkey");
      field_14941.put("DragonFireball", "minecraft:dragon_fireball");
      field_14941.put("ElderGuardian", "minecraft:elder_guardian");
      field_14941.put("EnderCrystal", "minecraft:ender_crystal");
      field_14941.put("EnderDragon", "minecraft:ender_dragon");
      field_14941.put("Enderman", "minecraft:enderman");
      field_14941.put("Endermite", "minecraft:endermite");
      field_14941.put("EntityHorse", "minecraft:horse");
      field_14941.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
      field_14941.put("FallingSand", "minecraft:falling_block");
      field_14941.put("Fireball", "minecraft:fireball");
      field_14941.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
      field_14941.put("Ghast", "minecraft:ghast");
      field_14941.put("Giant", "minecraft:giant");
      field_14941.put("Guardian", "minecraft:guardian");
      field_14941.put("Husk", "minecraft:husk");
      field_14941.put("Item", "minecraft:item");
      field_14941.put("ItemFrame", "minecraft:item_frame");
      field_14941.put("LavaSlime", "minecraft:magma_cube");
      field_14941.put("LeashKnot", "minecraft:leash_knot");
      field_14941.put("MinecartChest", "minecraft:chest_minecart");
      field_14941.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
      field_14941.put("MinecartFurnace", "minecraft:furnace_minecart");
      field_14941.put("MinecartHopper", "minecraft:hopper_minecart");
      field_14941.put("MinecartRideable", "minecraft:minecart");
      field_14941.put("MinecartSpawner", "minecraft:spawner_minecart");
      field_14941.put("MinecartTNT", "minecraft:tnt_minecart");
      field_14941.put("Mule", "minecraft:mule");
      field_14941.put("MushroomCow", "minecraft:mooshroom");
      field_14941.put("Ozelot", "minecraft:ocelot");
      field_14941.put("Painting", "minecraft:painting");
      field_14941.put("Pig", "minecraft:pig");
      field_14941.put("PigZombie", "minecraft:zombie_pigman");
      field_14941.put("PolarBear", "minecraft:polar_bear");
      field_14941.put("PrimedTnt", "minecraft:tnt");
      field_14941.put("Rabbit", "minecraft:rabbit");
      field_14941.put("Sheep", "minecraft:sheep");
      field_14941.put("Shulker", "minecraft:shulker");
      field_14941.put("ShulkerBullet", "minecraft:shulker_bullet");
      field_14941.put("Silverfish", "minecraft:silverfish");
      field_14941.put("Skeleton", "minecraft:skeleton");
      field_14941.put("SkeletonHorse", "minecraft:skeleton_horse");
      field_14941.put("Slime", "minecraft:slime");
      field_14941.put("SmallFireball", "minecraft:small_fireball");
      field_14941.put("Snowball", "minecraft:snowball");
      field_14941.put("SnowMan", "minecraft:snowman");
      field_14941.put("SpectralArrow", "minecraft:spectral_arrow");
      field_14941.put("Spider", "minecraft:spider");
      field_14941.put("Squid", "minecraft:squid");
      field_14941.put("Stray", "minecraft:stray");
      field_14941.put("ThrownEgg", "minecraft:egg");
      field_14941.put("ThrownEnderpearl", "minecraft:ender_pearl");
      field_14941.put("ThrownExpBottle", "minecraft:xp_bottle");
      field_14941.put("ThrownPotion", "minecraft:potion");
      field_14941.put("Villager", "minecraft:villager");
      field_14941.put("VillagerGolem", "minecraft:villager_golem");
      field_14941.put("Witch", "minecraft:witch");
      field_14941.put("WitherBoss", "minecraft:wither");
      field_14941.put("WitherSkeleton", "minecraft:wither_skeleton");
      field_14941.put("WitherSkull", "minecraft:wither_skull");
      field_14941.put("Wolf", "minecraft:wolf");
      field_14941.put("XPOrb", "minecraft:xp_orb");
      field_14941.put("Zombie", "minecraft:zombie");
      field_14941.put("ZombieHorse", "minecraft:zombie_horse");
      field_14941.put("ZombieVillager", "minecraft:zombie_villager");
   }
}

package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Class7922 {
   private static final BiMap<String, String> field33917 = HashBiMap.create();

   public static void method26585(Class72 var0) {
      method26586(var0, false);
   }

   public static void method26586(Class72 var0, boolean var1) {
      Class61 var4 = var0.<Class61>method235("id");
      if (var4 instanceof Class71) {
         Class71 var5 = (Class71)var4;
         String var6 = !var1 ? (String)field33917.get(var5.method205()) : (String)field33917.inverse().get(var5.method205());
         if (var6 != null) {
            var5.method231(var6);
         }
      }
   }

   public static void method26587(Class72 var0) {
      method26588(var0, false);
   }

   public static void method26588(Class72 var0, boolean var1) {
      if (var0 != null) {
         Class61 var4 = var0.<Class61>method235("SpawnData");
         if (var4 != null) {
            method26586((Class72)var4, var1);
         }
      }
   }

   public static void method26589(Class9738 var0) {
      method26590(var0, false);
   }

   public static void method26590(Class9738 var0, boolean var1) {
      if (method26593(var0)) {
         method26586(var0.method38167().<Class72>method235("EntityTag"), var1);
      }

      if (var0 != null && var0.method38163() <= 0) {
         var0.method38164((byte)1);
      }
   }

   public static void method26591(Class9738 var0) {
      method26592(var0, false);
   }

   public static void method26592(Class9738 var0, boolean var1) {
      if (method26593(var0)) {
         Class72 var4 = var0.method38167().<Class72>method235("EntityTag");
         Class61 var5 = var4.<Class61>method235("id");
         if (var5 instanceof Class71) {
            Class71 var6 = (Class71)var5;
            String var7 = !var1 ? (String)field33917.inverse().get(var6.method205()) : (String)field33917.get(var6.method205());
            if (var7 != null) {
               var6.method231(var7);
            }
         }
      }
   }

   private static boolean method26593(Class9738 var0) {
      if (var0 != null && var0.method38161() == 383) {
         Class72 var3 = var0.method38167();
         if (var3 == null) {
            return false;
         } else {
            Class61 var4 = var3.<Class61>method235("EntityTag");
            return var4 instanceof Class72 && ((Class72)var4).method235("id") instanceof Class71;
         }
      } else {
         return false;
      }
   }

   static {
      field33917.put("AreaEffectCloud", "minecraft:area_effect_cloud");
      field33917.put("ArmorStand", "minecraft:armor_stand");
      field33917.put("Arrow", "minecraft:arrow");
      field33917.put("Bat", "minecraft:bat");
      field33917.put("Blaze", "minecraft:blaze");
      field33917.put("Boat", "minecraft:boat");
      field33917.put("CaveSpider", "minecraft:cave_spider");
      field33917.put("Chicken", "minecraft:chicken");
      field33917.put("Cow", "minecraft:cow");
      field33917.put("Creeper", "minecraft:creeper");
      field33917.put("Donkey", "minecraft:donkey");
      field33917.put("DragonFireball", "minecraft:dragon_fireball");
      field33917.put("ElderGuardian", "minecraft:elder_guardian");
      field33917.put("EnderCrystal", "minecraft:ender_crystal");
      field33917.put("EnderDragon", "minecraft:ender_dragon");
      field33917.put("Enderman", "minecraft:enderman");
      field33917.put("Endermite", "minecraft:endermite");
      field33917.put("EntityHorse", "minecraft:horse");
      field33917.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
      field33917.put("FallingSand", "minecraft:falling_block");
      field33917.put("Fireball", "minecraft:fireball");
      field33917.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
      field33917.put("Ghast", "minecraft:ghast");
      field33917.put("Giant", "minecraft:giant");
      field33917.put("Guardian", "minecraft:guardian");
      field33917.put("Husk", "minecraft:husk");
      field33917.put("Item", "minecraft:item");
      field33917.put("ItemFrame", "minecraft:item_frame");
      field33917.put("LavaSlime", "minecraft:magma_cube");
      field33917.put("LeashKnot", "minecraft:leash_knot");
      field33917.put("MinecartChest", "minecraft:chest_minecart");
      field33917.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
      field33917.put("MinecartFurnace", "minecraft:furnace_minecart");
      field33917.put("MinecartHopper", "minecraft:hopper_minecart");
      field33917.put("MinecartRideable", "minecraft:minecart");
      field33917.put("MinecartSpawner", "minecraft:spawner_minecart");
      field33917.put("MinecartTNT", "minecraft:tnt_minecart");
      field33917.put("Mule", "minecraft:mule");
      field33917.put("MushroomCow", "minecraft:mooshroom");
      field33917.put("Ozelot", "minecraft:ocelot");
      field33917.put("Painting", "minecraft:painting");
      field33917.put("Pig", "minecraft:pig");
      field33917.put("PigZombie", "minecraft:zombie_pigman");
      field33917.put("PolarBear", "minecraft:polar_bear");
      field33917.put("PrimedTnt", "minecraft:tnt");
      field33917.put("Rabbit", "minecraft:rabbit");
      field33917.put("Sheep", "minecraft:sheep");
      field33917.put("Shulker", "minecraft:shulker");
      field33917.put("ShulkerBullet", "minecraft:shulker_bullet");
      field33917.put("Silverfish", "minecraft:silverfish");
      field33917.put("Skeleton", "minecraft:skeleton");
      field33917.put("SkeletonHorse", "minecraft:skeleton_horse");
      field33917.put("Slime", "minecraft:slime");
      field33917.put("SmallFireball", "minecraft:small_fireball");
      field33917.put("Snowball", "minecraft:snowball");
      field33917.put("SnowMan", "minecraft:snowman");
      field33917.put("SpectralArrow", "minecraft:spectral_arrow");
      field33917.put("Spider", "minecraft:spider");
      field33917.put("Squid", "minecraft:squid");
      field33917.put("Stray", "minecraft:stray");
      field33917.put("ThrownEgg", "minecraft:egg");
      field33917.put("ThrownEnderpearl", "minecraft:ender_pearl");
      field33917.put("ThrownExpBottle", "minecraft:xp_bottle");
      field33917.put("ThrownPotion", "minecraft:potion");
      field33917.put("Villager", "minecraft:villager");
      field33917.put("VillagerGolem", "minecraft:villager_golem");
      field33917.put("Witch", "minecraft:witch");
      field33917.put("WitherBoss", "minecraft:wither");
      field33917.put("WitherSkeleton", "minecraft:wither_skeleton");
      field33917.put("WitherSkull", "minecraft:wither_skull");
      field33917.put("Wolf", "minecraft:wolf");
      field33917.put("XPOrb", "minecraft:xp_orb");
      field33917.put("Zombie", "minecraft:zombie");
      field33917.put("ZombieHorse", "minecraft:zombie_horse");
      field33917.put("ZombieVillager", "minecraft:zombie_villager");
   }
}

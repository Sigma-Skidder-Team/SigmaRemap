package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class class_5825 {
   private static final Map<String, Integer> field_29571 = new HashMap<String, Integer>();
   private static final Map<Integer, String> field_29573 = new HashMap<Integer, String>();
   private static final Map<String, Integer> field_29574 = new HashMap<String, Integer>();
   private static final Map<Integer, String> field_29575 = new HashMap<Integer, String>();
   private static final Int2IntMap field_29572 = new Int2IntOpenHashMap(36, 1.0F);

   public static void method_26373(class_9530 var0) {
      if (var0 != null) {
         if (var0.method_43963() == 383 && var0.method_43962() == 0) {
            class_5531 var3 = var0.method_43959();
            int var4 = 0;
            if (var3 != null && var3.method_25123("EntityTag") instanceof class_5531) {
               class_5531 var5 = var3.<class_5531>method_25123("EntityTag");
               if (var5.method_25123("id") instanceof class_887) {
                  class_887 var6 = var5.<class_887>method_25123("id");
                  if (field_29571.containsKey(var6.method_3809())) {
                     var4 = field_29571.get(var6.method_3809());
                  }
               }

               var3.method_25126("EntityTag");
            }

            var0.method_43960(var3);
            var0.method_43966((short)var4);
         }

         if (var0.method_43963() == 373) {
            class_5531 var7 = var0.method_43959();
            int var9 = 0;
            if (var7 != null && var7.method_25123("Potion") instanceof class_887) {
               class_887 var11 = var7.<class_887>method_25123("Potion");
               String var13 = var11.method_3809().replace("minecraft:", "");
               if (field_29574.containsKey(var13)) {
                  var9 = field_29574.get(var13);
               }

               var7.method_25126("Potion");
            }

            var0.method_43960(var7);
            var0.method_43966((short)var9);
         }

         if (var0.method_43963() == 438) {
            class_5531 var8 = var0.method_43959();
            int var10 = 0;
            var0.method_43965(373);
            if (var8 != null && var8.method_25123("Potion") instanceof class_887) {
               class_887 var12 = var8.<class_887>method_25123("Potion");
               String var14 = var12.method_3809().replace("minecraft:", "");
               if (field_29574.containsKey(var14)) {
                  var10 = field_29574.get(var14) + 8192;
               }

               var8.method_25126("Potion");
            }

            var0.method_43960(var8);
            var0.method_43966((short)var10);
         }
      }
   }

   public static void method_26374(class_9530 var0) {
      int var3 = var0.method_43963();
      if (var3 == 387) {
         class_5531 var4 = var0.method_43959();
         class_913 var5 = var4.<class_913>method_25123("pages");
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.method_3917(); var6++) {
               class_5287 var7 = var5.<class_5287>method_3918(var6);
               if (var7 instanceof class_887) {
                  class_887 var8 = (class_887)var7;
                  String var9 = var8.method_3809();
                  if (!var9.replaceAll(" ", "").isEmpty()) {
                     var9 = method_26378(var9);
                  } else {
                     var9 = "\"" + method_26378(var9) + "\"";
                  }

                  var8.method_3808(var9);
               }
            }
         }
      }
   }

   private static String method_26378(String var0) {
      return var0.startsWith(" ") ? "§r" + var0 : var0;
   }

   public static void method_26375(class_9530 var0) {
      if (var0 != null) {
         if (var0.method_43963() == 383 && var0.method_43962() != 0) {
            class_5531 var3 = var0.method_43959();
            if (var3 == null) {
               var3 = new class_5531("tag");
            }

            class_5531 var4 = new class_5531("EntityTag");
            String var5 = field_29573.get(Integer.valueOf(var0.method_43962()));
            if (var5 != null) {
               class_887 var6 = new class_887("id", var5);
               var4.<class_887>method_25122(var6);
               var3.<class_5531>method_25122(var4);
            }

            var0.method_43960(var3);
            var0.method_43966((short)0);
         }

         if (var0.method_43963() == 373) {
            class_5531 var7 = var0.method_43959();
            if (var7 == null) {
               var7 = new class_5531("tag");
            }

            if (var0.method_43962() >= 16384) {
               var0.method_43965(438);
               var0.method_43966((short)(var0.method_43962() - 8192));
            }

            String var9 = method_26370(var0.method_43962());
            class_887 var12 = new class_887("Potion", "minecraft:" + var9);
            var7.<class_887>method_25122(var12);
            var0.method_43960(var7);
            var0.method_43966((short)0);
         }

         if (var0.method_43963() == 387) {
            class_5531 var8 = var0.method_43959();
            if (var8 == null) {
               var8 = new class_5531("tag");
            }

            class_913 var10 = var8.<class_913>method_25123("pages");
            if (var10 == null) {
               var10 = new class_913("pages", Collections.<class_5287>singletonList(new class_887(class_6890.method_31574("").toString())));
               var8.<class_913>method_25122(var10);
               var0.method_43960(var8);
               return;
            }

            for (int var13 = 0; var13 < var10.method_3917(); var13++) {
               if (var10.method_3918(var13) instanceof class_887) {
                  class_887 var14 = var10.<class_887>method_3918(var13);
                  var14.method_3808(class_6890.method_31574(var14.method_3809()).toString());
               }
            }

            var0.method_43960(var8);
         }
      }
   }

   public static String method_26370(short var0) {
      String var3 = field_29575.get(Integer.valueOf(var0));
      if (var3 != null) {
         return var3;
      } else if (var0 == 0) {
         return "water";
      } else {
         int var4;
         boolean var6;
         boolean var7;
         boolean var8;
         boolean var9;
         String var10;
         var4 = var0 & 15;
         int var5 = var0 & 63;
         var6 = (var0 & 32) > 0;
         var7 = (var0 & 64) > 0;
         var8 = true;
         var9 = true;
         label67:
         switch (var4) {
            case 1:
               var10 = "regeneration";
               break;
            case 2:
               var10 = "swiftness";
               break;
            case 3:
               var10 = "fire_resistance";
               var8 = false;
               break;
            case 4:
               var10 = "poison";
               break;
            case 5:
               var10 = "healing";
               var9 = false;
               break;
            case 6:
               var10 = "night_vision";
               var8 = false;
               break;
            case 7:
            default:
               var8 = false;
               var9 = false;
               switch (var5) {
                  case 0:
                     var10 = "mundane";
                     break label67;
                  case 16:
                     var10 = "awkward";
                     break label67;
                  case 32:
                     var10 = "thick";
                     break label67;
                  default:
                     var10 = "empty";
                     break label67;
               }
            case 8:
               var10 = "weakness";
               var8 = false;
               break;
            case 9:
               var10 = "strength";
               break;
            case 10:
               var10 = "slowness";
               var8 = false;
               break;
            case 11:
               var10 = "leaping";
               break;
            case 12:
               var10 = "harming";
               var9 = false;
               break;
            case 13:
               var10 = "water_breathing";
               var8 = false;
               break;
            case 14:
               var10 = "invisibility";
               var8 = false;
         }

         if (var4 > 0) {
            if (var8 && var6) {
               var10 = "strong_" + var10;
            } else if (var9 && var7) {
               var10 = "long_" + var10;
            }
         }

         return var10;
      }
   }

   public static int method_26376(int var0) {
      if (var0 >= 16384) {
         var0 -= 8192;
      }

      int var3 = field_29572.get(var0);
      if (var3 == -1) {
         var0 = field_29574.get(method_26370((short)var0));
         return (var3 = field_29572.get(var0)) == -1 ? 0 : var3;
      } else {
         return var3;
      }
   }

   private static void method_26372(int var0, String var1) {
      field_29573.put(var0, var1);
      field_29571.put(var1, var0);
   }

   private static void method_26377(int var0, String var1) {
      field_29572.put(var0, field_29575.size());
      field_29575.put(var0, var1);
      field_29574.put(var1, var0);
   }

   static {
      method_26372(1, "Item");
      method_26372(2, "XPOrb");
      method_26372(7, "ThrownEgg");
      method_26372(8, "LeashKnot");
      method_26372(9, "Painting");
      method_26372(10, "Arrow");
      method_26372(11, "Snowball");
      method_26372(12, "Fireball");
      method_26372(13, "SmallFireball");
      method_26372(14, "ThrownEnderpearl");
      method_26372(15, "EyeOfEnderSignal");
      method_26372(16, "ThrownPotion");
      method_26372(17, "ThrownExpBottle");
      method_26372(18, "ItemFrame");
      method_26372(19, "WitherSkull");
      method_26372(20, "PrimedTnt");
      method_26372(21, "FallingSand");
      method_26372(22, "FireworksRocketEntity");
      method_26372(30, "ArmorStand");
      method_26372(40, "MinecartCommandBlock");
      method_26372(41, "Boat");
      method_26372(42, "MinecartRideable");
      method_26372(43, "MinecartChest");
      method_26372(44, "MinecartFurnace");
      method_26372(45, "MinecartTNT");
      method_26372(46, "MinecartHopper");
      method_26372(47, "MinecartSpawner");
      method_26372(48, "Mob");
      method_26372(49, "Monster");
      method_26372(50, "Creeper");
      method_26372(51, "Skeleton");
      method_26372(52, "Spider");
      method_26372(53, "Giant");
      method_26372(54, "Zombie");
      method_26372(55, "Slime");
      method_26372(56, "Ghast");
      method_26372(57, "PigZombie");
      method_26372(58, "Enderman");
      method_26372(59, "CaveSpider");
      method_26372(60, "Silverfish");
      method_26372(61, "Blaze");
      method_26372(62, "LavaSlime");
      method_26372(63, "EnderDragon");
      method_26372(64, "WitherBoss");
      method_26372(65, "Bat");
      method_26372(66, "Witch");
      method_26372(67, "Endermite");
      method_26372(68, "Guardian");
      method_26372(90, "Pig");
      method_26372(91, "Sheep");
      method_26372(92, "Cow");
      method_26372(93, "Chicken");
      method_26372(94, "Squid");
      method_26372(95, "Wolf");
      method_26372(96, "MushroomCow");
      method_26372(97, "SnowMan");
      method_26372(98, "Ozelot");
      method_26372(99, "VillagerGolem");
      method_26372(100, "EntityHorse");
      method_26372(101, "Rabbit");
      method_26372(120, "Villager");
      method_26372(200, "EnderCrystal");
      method_26377(-1, field_29570[27]);
      method_26377(0, field_29570[10]);
      method_26377(64, field_29570[24]);
      method_26377(32, field_29570[26]);
      method_26377(16, field_29570[25]);
      method_26377(8198, field_29570[16]);
      method_26377(8262, "long_night_vision");
      method_26377(8206, field_29570[23]);
      method_26377(8270, "long_invisibility");
      method_26377(8203, field_29570[20]);
      method_26377(8267, "long_leaping");
      method_26377(8235, "strong_leaping");
      method_26377(8195, field_29570[13]);
      method_26377(8259, "long_fire_resistance");
      method_26377(8194, field_29570[12]);
      method_26377(8258, "long_swiftness");
      method_26377(8226, "strong_swiftness");
      method_26377(8202, field_29570[19]);
      method_26377(8266, "long_slowness");
      method_26377(8205, field_29570[22]);
      method_26377(8269, "long_water_breathing");
      method_26377(8261, field_29570[15]);
      method_26377(8229, "strong_healing");
      method_26377(8204, field_29570[21]);
      method_26377(8236, "strong_harming");
      method_26377(8196, field_29570[14]);
      method_26377(8260, "long_poison");
      method_26377(8228, "strong_poison");
      method_26377(8193, field_29570[11]);
      method_26377(8257, "long_regeneration");
      method_26377(8225, "strong_regeneration");
      method_26377(8201, field_29570[18]);
      method_26377(8265, "long_strength");
      method_26377(8233, "strong_strength");
      method_26377(8200, field_29570[17]);
      method_26377(8264, "long_weakness");
   }
}

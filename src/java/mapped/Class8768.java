package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Class8768 {
    private static final Map<String, Integer> field39461 = new HashMap<String, Integer>();
    private static final Map<Integer, String> field39462 = new HashMap<Integer, String>();
    private static final Map<String, Integer> field39463 = new HashMap<String, Integer>();
    private static final Map<Integer, String> field39464 = new HashMap<Integer, String>();
    private static final Int2IntMap field39465 = new Int2IntOpenHashMap(36, 1.0F);

    public static void method31625(Class9738 var0) {
        if (var0 != null) {
            if (var0.method38161() == 383 && var0.method38165() == 0) {
                Class72 var3 = var0.method38167();
                int var4 = 0;
                if (var3 != null && var3.method235("EntityTag") instanceof Class72) {
                    Class72 var5 = var3.<Class72>method235("EntityTag");
                    if (var5.method235("id") instanceof Class71) {
                        Class71 var6 = var5.<Class71>method235("id");
                        if (field39461.containsKey(var6.method205())) {
                            var4 = field39461.get(var6.method205());
                        }
                    }

                    var3.method237("EntityTag");
                }

                var0.method38168(var3);
                var0.method38166((short) var4);
            }

            if (var0.method38161() == 373) {
                Class72 var7 = var0.method38167();
                int var9 = 0;
                if (var7 != null && var7.method235("Potion") instanceof Class71) {
                    Class71 var11 = var7.<Class71>method235("Potion");
                    String var13 = var11.method205().replace("minecraft:", "");
                    if (field39463.containsKey(var13)) {
                        var9 = field39463.get(var13);
                    }

                    var7.method237("Potion");
                }

                var0.method38168(var7);
                var0.method38166((short) var9);
            }

            if (var0.method38161() == 438) {
                Class72 var8 = var0.method38167();
                int var10 = 0;
                var0.method38162(373);
                if (var8 != null && var8.method235("Potion") instanceof Class71) {
                    Class71 var12 = var8.<Class71>method235("Potion");
                    String var14 = var12.method205().replace("minecraft:", "");
                    if (field39463.containsKey(var14)) {
                        var10 = field39463.get(var14) + 8192;
                    }

                    var8.method237("Potion");
                }

                var0.method38168(var8);
                var0.method38166((short) var10);
            }
        }
    }

    public static void method31626(Class9738 var0) {
        int var3 = var0.method38161();
        if (var3 == 387) {
            Class72 var4 = var0.method38167();
            Class60 var5 = var4.<Class60>method235("pages");
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.method202(); var6++) {
                    Class61 var7 = var5.<Class61>method201(var6);
                    if (var7 instanceof Class71) {
                        Class71 var8 = (Class71) var7;
                        String var9 = var8.method205();
                        if (!var9.replaceAll(" ", "").isEmpty()) {
                            var9 = method31627(var9);
                        } else {
                            var9 = "\"" + method31627(var9) + "\"";
                        }

                        var8.method231(var9);
                    }
                }
            }
        }
    }

    private static String method31627(String var0) {
        return var0.startsWith(" ") ? "§r" + var0 : var0;
    }

    public static void method31628(Class9738 var0) {
        if (var0 != null) {
            if (var0.method38161() == 383 && var0.method38165() != 0) {
                Class72 var3 = var0.method38167();
                if (var3 == null) {
                    var3 = new Class72("tag");
                }

                Class72 var4 = new Class72("EntityTag");
                String var5 = field39462.get(Integer.valueOf(var0.method38165()));
                if (var5 != null) {
                    Class71 var6 = new Class71("id", var5);
                    var4.<Class71>method236(var6);
                    var3.<Class72>method236(var4);
                }

                var0.method38168(var3);
                var0.method38166((short) 0);
            }

            if (var0.method38161() == 373) {
                Class72 var7 = var0.method38167();
                if (var7 == null) {
                    var7 = new Class72("tag");
                }

                if (var0.method38165() >= 16384) {
                    var0.method38162(438);
                    var0.method38166((short) (var0.method38165() - 8192));
                }

                String var9 = method31629(var0.method38165());
                Class71 var12 = new Class71("Potion", "minecraft:" + var9);
                var7.<Class71>method236(var12);
                var0.method38168(var7);
                var0.method38166((short) 0);
            }

            if (var0.method38161() == 387) {
                Class72 var8 = var0.method38167();
                if (var8 == null) {
                    var8 = new Class72("tag");
                }

                Class60 var10 = var8.<Class60>method235("pages");
                if (var10 == null) {
                    var10 = new Class60("pages", Collections.<Class61>singletonList(new Class71(Class6363.method19381("").toString())));
                    var8.<Class60>method236(var10);
                    var0.method38168(var8);
                    return;
                }

                for (int var13 = 0; var13 < var10.method202(); var13++) {
                    if (var10.method201(var13) instanceof Class71) {
                        Class71 var14 = var10.<Class71>method201(var13);
                        var14.method231(Class6363.method19381(var14.method205()).toString());
                    }
                }

                var0.method38168(var8);
            }
        }
    }

    public static String method31629(short var0) {
        String var3 = field39464.get(Integer.valueOf(var0));
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

    public static int method31630(int var0) {
        if (var0 >= 16384) {
            var0 -= 8192;
        }

        int var3 = field39465.get(var0);
        if (var3 == -1) {
            var0 = field39463.get(method31629((short) var0));
            return (var3 = field39465.get(var0)) == -1 ? 0 : var3;
        } else {
            return var3;
        }
    }

    private static void method31631(int var0, String var1) {
        field39462.put(var0, var1);
        field39461.put(var1, var0);
    }

    private static void method31632(int var0, String var1) {
        field39465.put(var0, field39464.size());
        field39464.put(var0, var1);
        field39463.put(var1, var0);
    }

    static {
        method31631(1, "Item");
        method31631(2, "XPOrb");
        method31631(7, "ThrownEgg");
        method31631(8, "LeashKnot");
        method31631(9, "Painting");
        method31631(10, "Arrow");
        method31631(11, "Snowball");
        method31631(12, "Fireball");
        method31631(13, "SmallFireball");
        method31631(14, "ThrownEnderpearl");
        method31631(15, "EyeOfEnderSignal");
        method31631(16, "ThrownPotion");
        method31631(17, "ThrownExpBottle");
        method31631(18, "ItemFrame");
        method31631(19, "WitherSkull");
        method31631(20, "PrimedTnt");
        method31631(21, "FallingSand");
        method31631(22, "FireworksRocketEntity");
        method31631(30, "ArmorStand");
        method31631(40, "MinecartCommandBlock");
        method31631(41, "Boat");
        method31631(42, "MinecartRideable");
        method31631(43, "MinecartChest");
        method31631(44, "MinecartFurnace");
        method31631(45, "MinecartTNT");
        method31631(46, "MinecartHopper");
        method31631(47, "MinecartSpawner");
        method31631(48, "Mob");
        method31631(49, "Monster");
        method31631(50, "Creeper");
        method31631(51, "Skeleton");
        method31631(52, "Spider");
        method31631(53, "Giant");
        method31631(54, "Zombie");
        method31631(55, "Slime");
        method31631(56, "Ghast");
        method31631(57, "PigZombie");
        method31631(58, "Enderman");
        method31631(59, "CaveSpider");
        method31631(60, "Silverfish");
        method31631(61, "Blaze");
        method31631(62, "LavaSlime");
        method31631(63, "EnderDragon");
        method31631(64, "WitherBoss");
        method31631(65, "Bat");
        method31631(66, "Witch");
        method31631(67, "Endermite");
        method31631(68, "Guardian");
        method31631(90, "Pig");
        method31631(91, "Sheep");
        method31631(92, "Cow");
        method31631(93, "Chicken");
        method31631(94, "Squid");
        method31631(95, "Wolf");
        method31631(96, "MushroomCow");
        method31631(97, "SnowMan");
        method31631(98, "Ozelot");
        method31631(99, "VillagerGolem");
        method31631(100, "EntityHorse");
        method31631(101, "Rabbit");
        method31631(120, "Villager");
        method31631(200, "EnderCrystal");
        method31632(-1, "empty");
        method31632(0, "water");
        method31632(64, "mundane");
        method31632(32, "thick");
        method31632(16, "awkward");
        method31632(8198, "night_vision");
        method31632(8262, "long_night_vision");
        method31632(8206, "invisibility");
        method31632(8270, "long_invisibility");
        method31632(8203, "leaping");
        method31632(8267, "long_leaping");
        method31632(8235, "strong_leaping");
        method31632(8195, "fire_resistance");
        method31632(8259, "long_fire_resistance");
        method31632(8194, "swiftness");
        method31632(8258, "long_swiftness");
        method31632(8226, "strong_swiftness");
        method31632(8202, "slowness");
        method31632(8266, "long_slowness");
        method31632(8205, "water_breathing");
        method31632(8269, "long_water_breathing");
        method31632(8261, "healing");
        method31632(8229, "strong_healing");
        method31632(8204, "harming");
        method31632(8236, "strong_harming");
        method31632(8196, "poison");
        method31632(8260, "long_poison");
        method31632(8228, "strong_poison");
        method31632(8193, "regeneration");
        method31632(8257, "long_regeneration");
        method31632(8225, "strong_regeneration");
        method31632(8201, "strength");
        method31632(8265, "long_strength");
        method31632(8233, "strong_strength");
        method31632(8200, "weakness");
        method31632(8264, "long_weakness");
    }
}

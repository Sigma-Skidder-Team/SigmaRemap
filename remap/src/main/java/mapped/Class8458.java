// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.Map;

public class Class8458
{
    private static final Map<String, Integer> field34728;
    private static final Map<Integer, String> field34729;
    private static final Map<String, Integer> field34730;
    private static final Map<Integer, String> field34731;
    private static final Map<Integer, Integer> field34732;
    
    public static void method28224(final Class7562 class7562) {
        if (class7562 != null) {
            if (class7562.method23740() == 383) {
                if (class7562.method23742() == 0) {
                    final Class74 method23743 = class7562.method23743();
                    int intValue = 0;
                    if (method23743 != null) {
                        if (method23743.method419("EntityTag") instanceof Class74) {
                            final Class74 class7563 = method23743.method419("EntityTag");
                            if (class7563.method419("id") instanceof Class71) {
                                final Class71 class7564 = class7563.method419("id");
                                if (Class8458.field34728.containsKey(class7564.method406())) {
                                    intValue = Class8458.field34728.get(class7564.method406());
                                }
                            }
                            method23743.method421("EntityTag");
                        }
                    }
                    class7562.method23747(method23743);
                    class7562.method23746((short)intValue);
                }
            }
            if (class7562.method23740() == 373) {
                final Class74 method23744 = class7562.method23743();
                int intValue2 = 0;
                if (method23744 != null) {
                    if (method23744.method419("Potion") instanceof Class71) {
                        final String replace = method23744.method419("Potion").method406().replace("minecraft:", "");
                        if (Class8458.field34730.containsKey(replace)) {
                            intValue2 = Class8458.field34730.get(replace);
                        }
                        method23744.method421("Potion");
                    }
                }
                class7562.method23747(method23744);
                class7562.method23746((short)intValue2);
            }
            if (class7562.method23740() == 438) {
                final Class74 method23745 = class7562.method23743();
                int n = 0;
                class7562.method23744(373);
                if (method23745 != null) {
                    if (method23745.method419("Potion") instanceof Class71) {
                        final String replace2 = method23745.method419("Potion").method406().replace("minecraft:", "");
                        if (Class8458.field34730.containsKey(replace2)) {
                            n = Class8458.field34730.get(replace2) + 8192;
                        }
                        method23745.method421("Potion");
                    }
                }
                class7562.method23747(method23745);
                class7562.method23746((short)n);
            }
        }
    }
    
    public static void method28225(final Class7562 class7562) {
        if (class7562.method23740() != 387) {
            return;
        }
        final Class60 class7563 = class7562.method23743().method419("pages");
        if (class7563 != null) {
            for (int i = 0; i < class7563.method371(); ++i) {
                final Class61 method370 = class7563.method370(i);
                if (method370 instanceof Class71) {
                    final Class71 class7564 = (Class71)method370;
                    final String method371 = class7564.method406();
                    String s;
                    if (!method371.replaceAll(" ", "").isEmpty()) {
                        s = method28226(method371);
                    }
                    else {
                        s = "\"" + method28226(method371) + "\"";
                    }
                    class7564.method407(s);
                }
            }
        }
    }
    
    private static String method28226(String string) {
        if (string.startsWith(" ")) {
            string = "§r" + string;
            return string;
        }
        return string;
    }
    
    public static void method28227(final Class7562 class7562) {
        if (class7562 != null) {
            if (class7562.method23740() == 383) {
                if (class7562.method23742() != 0) {
                    Class74 method23743 = class7562.method23743();
                    if (method23743 == null) {
                        method23743 = new Class74("tag");
                    }
                    final Class74 class7563 = new Class74("EntityTag");
                    final String s = Class8458.field34729.get((int)class7562.method23742());
                    if (s != null) {
                        class7563.method420(new Class71("id", s));
                        method23743.method420(class7563);
                    }
                    class7562.method23747(method23743);
                    class7562.method23746((short)0);
                }
            }
            if (class7562.method23740() == 373) {
                Class74 method23744 = class7562.method23743();
                if (method23744 == null) {
                    method23744 = new Class74("tag");
                }
                if (class7562.method23742() >= 16384) {
                    class7562.method23744(438);
                    class7562.method23746((short)(class7562.method23742() - 8192));
                }
                method23744.method420(new Class71("Potion", "minecraft:" + method28228(class7562.method23742())));
                class7562.method23747(method23744);
                class7562.method23746((short)0);
            }
            if (class7562.method23740() == 387) {
                Class74 method23745 = class7562.method23743();
                if (method23745 == null) {
                    method23745 = new Class74("tag");
                }
                final Class60 class7564 = method23745.method419("pages");
                if (class7564 == null) {
                    method23745.method420(new Class60("pages", Collections.singletonList(new Class71(Class5224.method16340("")))));
                    class7562.method23747(method23745);
                    return;
                }
                for (int i = 0; i < class7564.method371(); ++i) {
                    if (class7564.method370(i) instanceof Class71) {
                        final Class71 class7565 = class7564.method370(i);
                        class7565.method407(Class5224.method16340(class7565.method406()));
                    }
                }
                class7562.method23747(method23745);
            }
        }
    }
    
    public static String method28228(final short i) {
        final String s = Class8458.field34731.get((int)i);
        if (s != null) {
            return s;
        }
        if (i == 0) {
            return "water";
        }
        final int n = i & 0xF;
        final int n2 = i & 0x3F;
        final boolean b = (i & 0x20) > 0;
        final boolean b2 = (i & 0x40) > 0;
        boolean b3 = true;
        boolean b4 = true;
        String s2 = null;
        Label_0353: {
            switch (n) {
                case 1: {
                    s2 = "regeneration";
                    break;
                }
                case 2: {
                    s2 = "swiftness";
                    break;
                }
                case 3: {
                    s2 = "fire_resistance";
                    b3 = false;
                    break;
                }
                case 4: {
                    s2 = "poison";
                    break;
                }
                case 5: {
                    s2 = "healing";
                    b4 = false;
                    break;
                }
                case 6: {
                    s2 = "night_vision";
                    b3 = false;
                    break;
                }
                case 8: {
                    s2 = "weakness";
                    b3 = false;
                    break;
                }
                case 9: {
                    s2 = "strength";
                    break;
                }
                case 10: {
                    s2 = "slowness";
                    b3 = false;
                    break;
                }
                case 11: {
                    s2 = "leaping";
                    break;
                }
                case 12: {
                    s2 = "harming";
                    b4 = false;
                    break;
                }
                case 13: {
                    s2 = "water_breathing";
                    b3 = false;
                    break;
                }
                case 14: {
                    s2 = "invisibility";
                    b3 = false;
                    break;
                }
                default: {
                    b3 = false;
                    b4 = false;
                    switch (n2) {
                        case 0: {
                            s2 = "mundane";
                            break Label_0353;
                        }
                        case 16: {
                            s2 = "awkward";
                            break Label_0353;
                        }
                        case 32: {
                            s2 = "thick";
                            break Label_0353;
                        }
                        default: {
                            s2 = "empty";
                            break Label_0353;
                        }
                    }
                    break;
                }
            }
        }
        if (n > 0) {
            if (b3 && b) {
                s2 = "strong_" + s2;
            }
            else if (b4 && b2) {
                s2 = "long_" + s2;
            }
        }
        return s2;
    }
    
    public static int method28229(int intValue) {
        if (intValue >= 16384) {
            intValue -= 8192;
        }
        final Integer n = Class8458.field34732.get(intValue);
        if (n == null) {
            intValue = Class8458.field34730.get(method28228((short)intValue));
            final Integer n2;
            return ((n2 = Class8458.field34732.get(intValue)) == null) ? 0 : n2;
        }
        return n;
    }
    
    private static void method28230(final Integer n, final String s) {
        Class8458.field34729.put(n, s);
        Class8458.field34728.put(s, n);
    }
    
    private static void method28231(final Integer n, final String s) {
        Class8458.field34732.put(n, Class8458.field34731.size());
        Class8458.field34731.put(n, s);
        Class8458.field34730.put(s, n);
    }
    
    static {
        field34728 = new HashMap<String, Integer>();
        field34729 = new HashMap<Integer, String>();
        field34730 = new HashMap<String, Integer>();
        field34731 = new HashMap<Integer, String>();
        field34732 = new HashMap<Integer, Integer>();
        method28230(1, "Item");
        method28230(2, "XPOrb");
        method28230(7, "ThrownEgg");
        method28230(8, "LeashKnot");
        method28230(9, "Painting");
        method28230(10, "Arrow");
        method28230(11, "Snowball");
        method28230(12, "Fireball");
        method28230(13, "SmallFireball");
        method28230(14, "ThrownEnderpearl");
        method28230(15, "EyeOfEnderSignal");
        method28230(16, "ThrownPotion");
        method28230(17, "ThrownExpBottle");
        method28230(18, "ItemFrame");
        method28230(19, "WitherSkull");
        method28230(20, "PrimedTnt");
        method28230(21, "FallingSand");
        method28230(22, "FireworksRocketEntity");
        method28230(30, "ArmorStand");
        method28230(40, "MinecartCommandBlock");
        method28230(41, "Boat");
        method28230(42, "MinecartRideable");
        method28230(43, "MinecartChest");
        method28230(44, "MinecartFurnace");
        method28230(45, "MinecartTNT");
        method28230(46, "MinecartHopper");
        method28230(47, "MinecartSpawner");
        method28230(48, "Mob");
        method28230(49, "Monster");
        method28230(50, "Creeper");
        method28230(51, "Skeleton");
        method28230(52, "Spider");
        method28230(53, "Giant");
        method28230(54, "Zombie");
        method28230(55, "Slime");
        method28230(56, "Ghast");
        method28230(57, "PigZombie");
        method28230(58, "Enderman");
        method28230(59, "CaveSpider");
        method28230(60, "Silverfish");
        method28230(61, "Blaze");
        method28230(62, "LavaSlime");
        method28230(63, "EnderDragon");
        method28230(64, "WitherBoss");
        method28230(65, "Bat");
        method28230(66, "Witch");
        method28230(67, "Endermite");
        method28230(68, "Guardian");
        method28230(90, "Pig");
        method28230(91, "Sheep");
        method28230(92, "Cow");
        method28230(93, "Chicken");
        method28230(94, "Squid");
        method28230(95, "Wolf");
        method28230(96, "MushroomCow");
        method28230(97, "SnowMan");
        method28230(98, "Ozelot");
        method28230(99, "VillagerGolem");
        method28230(100, "EntityHorse");
        method28230(101, "Rabbit");
        method28230(120, "Villager");
        method28230(200, "EnderCrystal");
        method28231(-1, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[27]);
        method28231(0, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[10]);
        method28231(64, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[24]);
        method28231(32, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[26]);
        method28231(16, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[25]);
        method28231(8198, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[16]);
        method28231(8262, "long_night_vision");
        method28231(8206, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[23]);
        method28231(8270, "long_invisibility");
        method28231(8203, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[20]);
        method28231(8267, "long_leaping");
        method28231(8235, "strong_leaping");
        method28231(8195, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[13]);
        method28231(8259, "long_fire_resistance");
        method28231(8194, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[12]);
        method28231(8258, "long_swiftness");
        method28231(8226, "strong_swiftness");
        method28231(8202, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[19]);
        method28231(8266, "long_slowness");
        method28231(8205, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[22]);
        method28231(8269, "long_water_breathing");
        method28231(8261, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[15]);
        method28231(8229, "strong_healing");
        method28231(8204, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[21]);
        method28231(8236, "strong_harming");
        method28231(8196, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[14]);
        method28231(8260, "long_poison");
        method28231(8228, "strong_poison");
        method28231(8193, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[11]);
        method28231(8257, "long_regeneration");
        method28231(8225, "strong_regeneration");
        method28231(8201, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[18]);
        method28231(8265, "long_strength");
        method28231(8233, "strong_strength");
        method28231(8200, Class8458.\ud7eb\u3edf\u98e8\ubb1a\u6f94\u88ec[17]);
        method28231(8264, "long_weakness");
    }
}

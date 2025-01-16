// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.Arrays;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Map;

public class Class9404
{
    private static Class8988[][] field40346;
    private static Class8988[][] field40347;
    private static Map field40348;
    private static Class8163 field40349;
    private static boolean field40350;
    private static boolean field40351;
    public static final int field40352 = 16384;
    public static final int field40353 = 63;
    public static final int field40354 = 64;
    public static final String field40355 = "texture.potion_overlay";
    public static final String field40356 = "texture.potion_bottle_splash";
    public static final String field40357 = "texture.potion_bottle_drinkable";
    public static final String field40358 = "item/potion_overlay";
    public static final String field40359 = "item/potion_bottle_splash";
    public static final String field40360 = "item/potion_bottle_drinkable";
    private static final int[][] field40361;
    private static final Map<String, Integer> field40362;
    private static final String field40363 = "normal";
    private static final String field40364 = "splash";
    private static final String field40365 = "linger";
    
    public static void method34943() {
        Class9404.field40346 = null;
        Class9404.field40347 = null;
        Class9404.field40350 = true;
        if (Config.method28987()) {
            method34944("optifine/cit.properties");
            final Class1727[] method28903 = Config.method28903();
            for (int i = method28903.length - 1; i >= 0; --i) {
                method34945(method28903[i]);
            }
            method34945(Config.method28905());
            if (Class9404.field40346.length <= 0) {
                Class9404.field40346 = null;
            }
            if (Class9404.field40347.length <= 0) {
                Class9404.field40347 = null;
            }
        }
    }
    
    private static void method34944(final String str) {
        try {
            final InputStream method28897 = Config.method28897(new ResourceLocation(str));
            if (method28897 == null) {
                return;
            }
            Config.method28847("CustomItems: Loading " + str);
            final Class27 class27 = new Class27();
            class27.load(method28897);
            method28897.close();
            Class9404.field40350 = Config.method28935(class27.getProperty("useGlint"), true);
        }
        catch (final FileNotFoundException ex) {}
        catch (final IOException ex2) {
            ex2.printStackTrace();
        }
    }
    
    private static void method34945(final Class1727 class1727) {
        String[] method32777 = Class9084.method32777(class1727, "optifine/cit/", ".properties", null);
        final Map<String, Class8988> method32778 = method34953(class1727);
        if (method32778.size() > 0) {
            final Set<String> keySet = method32778.keySet();
            method32777 = (String[]) Config.method28984(method32777, keySet.toArray(new String[keySet.size()]));
        }
        Arrays.sort(method32777);
        final List<List<Class8988>> method32779 = method34960(Class9404.field40346);
        final List<List<Class8988>> method32780 = method34960(Class9404.field40347);
        for (int i = 0; i < method32777.length; ++i) {
            final String str = method32777[i];
            Config.method28847("CustomItems: " + str);
            try {
                Class8988 class1728 = null;
                if (method32778.containsKey(str)) {
                    class1728 = method32778.get(str);
                }
                if (class1728 == null) {
                    final InputStream method32781 = class1727.method6097(Class346.field2137, new ResourceLocation(str));
                    if (method32781 == null) {
                        Config.warn("CustomItems file not found: " + str);
                        continue;
                    }
                    final Class27 class1729 = new Class27();
                    class1729.load(method32781);
                    class1728 = new Class8988(class1729, str);
                }
                if (class1728.method32012(str)) {
                    method34962(class1728, method32779);
                    method34963(class1728, method32780);
                }
            }
            catch (final FileNotFoundException ex) {
                Config.warn("CustomItems file not found: " + str);
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
        Class9404.field40346 = method34961(method32779);
        Class9404.field40347 = method34961(method32780);
        final Comparator method32782 = method34946();
        for (int j = 0; j < Class9404.field40346.length; ++j) {
            final Class8988[] a = Class9404.field40346[j];
            if (a != null) {
                Arrays.sort(a, method32782);
            }
        }
        for (int k = 0; k < Class9404.field40347.length; ++k) {
            final Class8988[] a2 = Class9404.field40347[k];
            if (a2 != null) {
                Arrays.sort(a2, method32782);
            }
        }
    }
    
    private static Comparator method34946() {
        return new Class4434();
    }
    
    public static void method34947(final Class1774 class1774) {
        final Iterator<Class8988> iterator = method34951().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32014(class1774);
        }
    }
    
    public static void method34948(final Class1774 class1774) {
        final Iterator<Class8988> iterator = method34951().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32015(class1774);
        }
    }
    
    public static void method34949(final Class7637 class7637) {
        final Iterator<Class8988> iterator = method34951().iterator();
        while (iterator.hasNext()) {
            iterator.next().method32031(class7637);
        }
    }
    
    public static void method34950() {
        for (final Class8988 class8988 : method34951()) {
            if (class8988.field37883 != 1) {
                continue;
            }
            class8988.method32018(Config.method29001(), Class9404.field40349);
            class8988.method32032();
        }
    }
    
    private static List<Class8988> method34951() {
        final ArrayList list = new ArrayList();
        method34952(Class9404.field40346, list);
        method34952(Class9404.field40347, list);
        return list;
    }
    
    private static void method34952(final Class8988[][] array, final List<Class8988> list) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class8988[] array2 = array[i];
                if (array2 != null) {
                    for (int j = 0; j < array2.length; ++j) {
                        final Class8988 class8988 = array2[j];
                        if (class8988 != null) {
                            list.add(class8988);
                        }
                    }
                }
            }
        }
    }
    
    private static Map<String, Class8988> method34953(final Class1727 class1727) {
        final HashMap hashMap = new HashMap();
        hashMap.putAll(method34954(class1727, "normal", Registry.field211.getKey(Items.field31441)));
        hashMap.putAll(method34954(class1727, "splash", Registry.field211.getKey(Items.field31579)));
        hashMap.putAll(method34954(class1727, "linger", Registry.field211.getKey(Items.field31582)));
        return hashMap;
    }
    
    private static Map<String, Class8988> method34954(final Class1727 class1727, final String str, final ResourceLocation class1728) {
        final HashMap hashMap = new HashMap();
        final String string = str + "/";
        final String[] array = { "optifine/cit/potion/" + string, "optifine/cit/Potion/" + string };
        final String[] array2 = { ".png" };
        final String[] method32778 = Class9084.method32778(class1727, array, array2);
        for (int i = 0; i < method32778.length; ++i) {
            final String s = method32778[i];
            final Properties method32779 = method34955(Class9518.method35526(s, array, array2), str, class1728, s);
            if (method32779 != null) {
                final String string2 = Class9518.method35524(s, array2) + ".properties";
                hashMap.put(string2, new Class8988(method32779, string2));
            }
        }
        return hashMap;
    }
    
    private static Properties method34955(final String s, final String s2, ResourceLocation method503, final String str) {
        if (Class9518.method35516(s, new String[] { "_n", "_s" })) {
            return null;
        }
        if (s.equals("empty") && s2.equals("normal")) {
            method503 = Registry.field211.getKey(Items.field31442);
            final Class27 class27 = new Class27();
            class27.put("type", "item");
            class27.put("items", method503.toString());
            return class27;
        }
        final int[] array = method34956().get(s);
        if (array != null) {
            final StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                int j = array[i];
                if (s2.equals("splash")) {
                    j |= 0x4000;
                }
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(j);
            }
            int k = 16447;
            if (s.equals("water") || s.equals("mundane")) {
                k |= 0x40;
            }
            final Class27 class28 = new Class27();
            class28.put("type", "item");
            class28.put("items", method503.toString());
            class28.put("damage", sb.toString());
            class28.put("damageMask", "" + k);
            if (!s2.equals("splash")) {
                class28.put("texture.potion_bottle_drinkable", s);
            }
            else {
                class28.put("texture.potion_bottle_splash", s);
            }
            return class28;
        }
        Config.warn("Potion not found for image: " + str);
        return null;
    }
    
    private static Map method34956() {
        if (Class9404.field40348 == null) {
            (Class9404.field40348 = new LinkedHashMap()).put("water", method34958(0, 0));
            Class9404.field40348.put("awkward", method34958(0, 1));
            Class9404.field40348.put("thick", method34958(0, 2));
            Class9404.field40348.put("potent", method34958(0, 3));
            Class9404.field40348.put("regeneration", method34957(1));
            Class9404.field40348.put("movespeed", method34957(2));
            Class9404.field40348.put("fireresistance", method34957(3));
            Class9404.field40348.put("poison", method34957(4));
            Class9404.field40348.put("heal", method34957(5));
            Class9404.field40348.put("nightvision", method34957(6));
            Class9404.field40348.put("clear", method34958(7, 0));
            Class9404.field40348.put("bungling", method34958(7, 1));
            Class9404.field40348.put("charming", method34958(7, 2));
            Class9404.field40348.put("rank", method34958(7, 3));
            Class9404.field40348.put("weakness", method34957(8));
            Class9404.field40348.put("damageboost", method34957(9));
            Class9404.field40348.put("moveslowdown", method34957(10));
            Class9404.field40348.put("leaping", method34957(11));
            Class9404.field40348.put("harm", method34957(12));
            Class9404.field40348.put("waterbreathing", method34957(13));
            Class9404.field40348.put("invisibility", method34957(14));
            Class9404.field40348.put("thin", method34958(15, 0));
            Class9404.field40348.put("debonair", method34958(15, 1));
            Class9404.field40348.put("sparkling", method34958(15, 2));
            Class9404.field40348.put("stinky", method34958(15, 3));
            Class9404.field40348.put("mundane", method34958(0, 4));
            Class9404.field40348.put("speed", Class9404.field40348.get("movespeed"));
            Class9404.field40348.put("fire_resistance", Class9404.field40348.get("fireresistance"));
            Class9404.field40348.put("instant_health", Class9404.field40348.get("heal"));
            Class9404.field40348.put("night_vision", Class9404.field40348.get("nightvision"));
            Class9404.field40348.put("strength", Class9404.field40348.get("damageboost"));
            Class9404.field40348.put("slowness", Class9404.field40348.get("moveslowdown"));
            Class9404.field40348.put("instant_damage", Class9404.field40348.get("harm"));
            Class9404.field40348.put("water_breathing", Class9404.field40348.get("waterbreathing"));
        }
        return Class9404.field40348;
    }
    
    private static int[] method34957(final int n) {
        return new int[] { n, n + 16, n + 32, n + 48 };
    }
    
    private static int[] method34958(final int n, final int n2) {
        return new int[] { n + n2 * 16 };
    }
    
    private static int method34959(final String str) {
        final String string = "effect." + str;
        for (final ResourceLocation class1932 : Registry.field207.method507()) {
            if (!Registry.field207.method510(class1932)) {
                continue;
            }
            final Class5328 class1933 = Registry.field207.getOrDefault(class1932);
            if (!string.equals(class1933.method16455())) {
                continue;
            }
            return Class5328.method16451(class1933);
        }
        return -1;
    }
    
    private static List<List<Class8988>> method34960(final Class8988[][] array) {
        final ArrayList list = new ArrayList();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class8988[] a = array[i];
                Object o = null;
                if (a != null) {
                    o = new ArrayList(Arrays.asList(a));
                }
                list.add(o);
            }
        }
        return list;
    }
    
    private static Class8988[][] method34961(final List list) {
        final Class8988[][] array = new Class8988[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                final Class8988[] a = (Class8988[])list2.toArray(new Class8988[list2.size()]);
                Arrays.sort(a, new Class4438());
                array[i] = a;
            }
        }
        return array;
    }
    
    private static void method34962(final Class8988 class8988, final List<List<Class8988>> list) {
        if (class8988.field37884 != null) {
            for (int i = 0; i < class8988.field37884.length; ++i) {
                final int j = class8988.field37884[i];
                if (j > 0) {
                    method34965(class8988, list, j);
                }
                else {
                    Config.warn("Invalid item ID: " + j);
                }
            }
        }
    }
    
    private static void method34963(final Class8988 class8988, final List<List<Class8988>> list) {
        if (class8988.field37883 == 2) {
            if (class8988.field37893 != null) {
                for (int n = method34964() + 1, i = 0; i < n; ++i) {
                    if (Config.method28978(i, class8988.field37893)) {
                        method34965(class8988, list, i);
                    }
                }
            }
        }
    }
    
    private static int method34964() {
        int n;
        for (n = 0; Registry.field209.method499(n) != null; ++n) {}
        return n;
    }
    
    private static void method34965(final Class8988 class8988, final List<List<Class8988>> list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList();
            list.set(i, list2);
        }
        list2.add(class8988);
    }
    
    public static Class6313 method34966(final ItemStack class8321, final Class6313 class8322, final ResourceLocation class8323, final boolean b) {
        if (!b && class8322.method18693()) {
            return class8322;
        }
        if (Class9404.field40346 == null) {
            return class8322;
        }
        final Class8988 method34970 = method34970(class8321, 1);
        if (method34970 != null) {
            final Class6313 method34971 = method34970.method32030(class8323, b);
            return (method34971 == null) ? class8322 : method34971;
        }
        return class8322;
    }
    
    public static boolean method34967(final ItemStack class8321, final Class2215 class8322, final String s) {
        if (Class9404.field40346 == null) {
            return false;
        }
        final ResourceLocation method34968 = method34968(class8321, class8322, s);
        if (method34968 != null) {
            Config.method28895().method5849(method34968);
            return true;
        }
        return false;
    }
    
    private static ResourceLocation method34968(final ItemStack class8321, final Class2215 class8322, final String str) {
        final Class8988 method34970 = method34970(class8321, 3);
        if (method34970 == null) {
            return null;
        }
        if (method34970.field37904 == null) {
            return method34970.field37903;
        }
        final Item method34971 = class8321.getItem();
        if (method34971 instanceof Class4055) {
            final String method34972 = ((Class4055)method34971).method12258().method8101();
            final int i = (class8322 != Class2215.field13603) ? 1 : 2;
            final StringBuffer sb = new StringBuffer();
            sb.append("texture.");
            sb.append(method34972);
            sb.append("_layer_");
            sb.append(i);
            if (str != null) {
                sb.append("_");
                sb.append(str);
            }
            final ResourceLocation class8323 = method34970.field37904.get(sb.toString());
            return (class8323 != null) ? class8323 : method34970.field37903;
        }
        return null;
    }
    
    public static ResourceLocation method34969(final ItemStack class8321, final ResourceLocation class8322) {
        if (Class9404.field40346 == null) {
            return class8322;
        }
        final Class8988 method34970 = method34970(class8321, 4);
        if (method34970 != null) {
            return (method34970.field37903 != null) ? method34970.field37903 : class8322;
        }
        return class8322;
    }
    
    private static Class8988 method34970(final ItemStack class8321, final int n) {
        if (Class9404.field40346 == null) {
            return null;
        }
        if (class8321 != null) {
            final int method11696 = Item.method11696(class8321.getItem());
            if (method11696 >= 0) {
                if (method11696 < Class9404.field40346.length) {
                    final Class8988[] array = Class9404.field40346[method11696];
                    if (array != null) {
                        for (int i = 0; i < array.length; ++i) {
                            final Class8988 class8322 = array[i];
                            if (class8322.field37883 == n && method34971(class8322, class8321, null)) {
                                return class8322;
                            }
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    private static boolean method34971(final Class8988 class8988, final ItemStack class8989, final int[][] array) {
        final Item method27622 = class8989.getItem();
        if (class8988.field37889 != null) {
            int method27623 = method34972(class8989);
            if (method27623 < 0) {
                return false;
            }
            if (class8988.field37891 != 0) {
                method27623 &= class8988.field37891;
            }
            if (class8988.field37890) {
                method27623 = (int)(method27623 * 100 / (double)method27622.method11709());
            }
            if (!class8988.field37889.method24697(method27623)) {
                return false;
            }
        }
        if (class8988.field37892 != null && !class8988.field37892.method24697(class8989.method27690())) {
            return false;
        }
        int[][] array2 = array;
        if (class8988.field37893 != null) {
            if (array == null) {
                array2 = method34976(class8989);
            }
            int n = 0;
            for (int i = 0; i < array2.length; ++i) {
                if (Config.method28978(array2[i][0], class8988.field37893)) {
                    n = 1;
                    break;
                }
            }
            if (n == 0) {
                return false;
            }
        }
        if (class8988.field37894 != null) {
            if (array2 == null) {
                array2 = method34976(class8989);
            }
            int n2 = 0;
            for (int j = 0; j < array2.length; ++j) {
                if (class8988.field37894.method24697(array2[j][1])) {
                    n2 = 1;
                    break;
                }
            }
            if (n2 == 0) {
                return false;
            }
        }
        if (class8988.field37895 != null) {
            final CompoundNBT method27624 = class8989.method27657();
            for (int k = 0; k < class8988.field37895.length; ++k) {
                if (!class8988.field37895[k].method32117(method27624)) {
                    return false;
                }
            }
        }
        if (class8988.field37896 != 0) {
            if (class8988.field37896 == 1 && Class9404.field40351) {
                return false;
            }
            if (class8988.field37896 == 2) {
                if (!Class9404.field40351) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static int method34972(final ItemStack class8321) {
        return (class8321.getItem() instanceof Class4089) ? method34973(class8321) : class8321.method27632();
    }
    
    private static int method34973(final ItemStack class8321) {
        final CompoundNBT method27657 = class8321.method27657();
        if (method27657 == null) {
            return 0;
        }
        final String method27658 = method27657.getString("Potion");
        if (method27658 == null || method27658.equals("")) {
            return 0;
        }
        final Integer n = Class9404.field40362.get(method27658);
        if (n != null) {
            int intValue = n;
            if (class8321.getItem() == Items.field31579) {
                intValue |= 0x4000;
            }
            return intValue;
        }
        return -1;
    }
    
    private static Map<String, Integer> method34974() {
        final HashMap hashMap = new HashMap();
        method34975("water", 0, false, hashMap);
        method34975("awkward", 16, false, hashMap);
        method34975("thick", 32, false, hashMap);
        method34975("mundane", 64, false, hashMap);
        method34975("regeneration", 1, true, hashMap);
        method34975("swiftness", 2, true, hashMap);
        method34975("fire_resistance", 3, true, hashMap);
        method34975("poison", 4, true, hashMap);
        method34975("healing", 5, true, hashMap);
        method34975("night_vision", 6, true, hashMap);
        method34975("weakness", 8, true, hashMap);
        method34975("strength", 9, true, hashMap);
        method34975("slowness", 10, true, hashMap);
        method34975("leaping", 11, true, hashMap);
        method34975("harming", 12, true, hashMap);
        method34975("water_breathing", 13, true, hashMap);
        method34975("invisibility", 14, true, hashMap);
        return hashMap;
    }
    
    private static void method34975(final String str, int i, final boolean b, final Map<String, Integer> map) {
        if (b) {
            i |= 0x2000;
        }
        map.put("minecraft:" + str, i);
        if (b) {
            map.put("minecraft:strong_" + str, i | 0x20);
            map.put("minecraft:long_" + str, i | 0x40);
        }
    }
    
    private static int[][] method34976(final ItemStack class8321) {
        ListNBT class8322;
        if (class8321.getItem() != Items.field31534) {
            class8322 = class8321.method27662();
        }
        else {
            final Class4034 class8323 = (Class4034) Items.field31534;
            class8322 = Class4034.method12225(class8321);
        }
        final ListNBT class8324 = class8322;
        if (class8324 != null && class8324.size() > 0) {
            final int[][] array = new int[class8324.size()][2];
            for (int i = 0; i < class8324.size(); ++i) {
                final CompoundNBT method346 = class8324.method346(i);
                final String method347 = method346.getString("id");
                final int method348 = method346.getInt("lvl");
                final Class6257 method349 = Class7552.method23716(method347);
                if (method349 != null) {
                    array[i][0] = Registry.field209.getId(method349);
                    array[i][1] = method348;
                }
            }
            return array;
        }
        return Class9404.field40361;
    }
    
    public static boolean method34977(final ItemRenderer class1796, final ItemStack class1797, final Class6313 class1798) {
        if (Class9404.field40347 == null) {
            return false;
        }
        if (class1797 == null) {
            return false;
        }
        final int[][] method34976 = method34976(class1797);
        if (method34976.length > 0) {
            Set<Integer> set = null;
            boolean b = false;
            final Class1663 method34977 = Config.method28895();
            for (int i = 0; i < method34976.length; ++i) {
                final int j = method34976[i][0];
                if (j >= 0) {
                    if (j < Class9404.field40347.length) {
                        final Class8988[] array = Class9404.field40347[j];
                        if (array != null) {
                            for (int k = 0; k < array.length; ++k) {
                                final Class8988 class1799 = array[k];
                                if (set == null) {
                                    set = new HashSet<Integer>();
                                }
                                if (set.add(j)) {
                                    if (method34971(class1799, class1797, method34976)) {
                                        if (class1799.field37903 != null) {
                                            method34977.method5849(class1799.field37903);
                                            final float method34978 = class1799.method32028(method34977);
                                            if (!b) {
                                                b = true;
                                                Class8933.method31517(false);
                                                Class8933.method31516(514);
                                                Class8933.method31506();
                                                Class8933.method31633(5890);
                                            }
                                            Class9540.method35616(class1799.field37897, 1.0f);
                                            Class8933.method31635();
                                            Class8933.method31640(method34978, method34978, method34978);
                                            Class8933.method31642(class1799.field37898 * (Util.method27837() % 3000L) / 3000.0f / 8.0f, 0.0f, 0.0f);
                                            Class8933.method31639(class1799.field37899, 0.0f, 0.0f, 1.0f);
                                            Class8933.method31636();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (b) {
                Class8933.method31503();
                Class8933.method31519();
                Class8933.method31520(770, 771);
                Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
                Class8933.method31633(5888);
                Class8933.method31505();
                Class8933.method31516(515);
                Class8933.method31517(true);
                method34977.method5849(Class1774.field9853);
            }
            return b;
        }
        return false;
    }
    
    public static boolean method34978(final LivingEntity class511, final ItemStack class512, final Class5845 class513, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (Class9404.field40347 == null) {
            return false;
        }
        if (Config.method28955() && Class9216.field39049) {
            return false;
        }
        if (class512 == null) {
            return false;
        }
        final int[][] method34976 = method34976(class512);
        if (method34976.length > 0) {
            Set<Integer> set = null;
            boolean b = false;
            final Class1663 method34977 = Config.method28895();
            for (int i = 0; i < method34976.length; ++i) {
                final int j = method34976[i][0];
                if (j >= 0) {
                    if (j < Class9404.field40347.length) {
                        final Class8988[] array = Class9404.field40347[j];
                        if (array != null) {
                            for (int k = 0; k < array.length; ++k) {
                                final Class8988 class514 = array[k];
                                if (set == null) {
                                    set = new HashSet<Integer>();
                                }
                                if (set.add(j)) {
                                    if (method34971(class514, class512, method34976)) {
                                        if (class514.field37903 != null) {
                                            method34977.method5849(class514.field37903);
                                            final float method34978 = class514.method32028(method34977);
                                            if (!b) {
                                                b = true;
                                                if (Config.method28955()) {
                                                    Class7778.method24968();
                                                }
                                                Class8933.method31519();
                                                Class8933.method31516(514);
                                                Class8933.method31517(false);
                                            }
                                            Class9540.method35616(class514.field37897, 1.0f);
                                            Class8933.method31506();
                                            Class8933.method31633(5890);
                                            Class8933.method31634();
                                            Class8933.method31639(class514.field37899, 0.0f, 0.0f, 1.0f);
                                            final float n8 = method34978 / 8.0f;
                                            Class8933.method31640(n8, n8 / 2.0f, n8);
                                            Class8933.method31642(0.0f, class514.field37898 * (Util.method27837() % 3000L) / 3000.0f / 8.0f, 0.0f);
                                            Class8933.method31633(5888);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (b) {
                Class8933.method31503();
                Class8933.method31519();
                Class8933.method31520(770, 771);
                Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
                Class8933.method31633(5890);
                Class8933.method31634();
                Class8933.method31633(5888);
                Class8933.method31505();
                Class8933.method31517(true);
                Class8933.method31516(515);
                Class8933.method31518();
                if (Config.method28955()) {
                    Class7778.method24969();
                }
            }
            return b;
        }
        return false;
    }
    
    public static boolean method34979() {
        return Class9404.field40350;
    }
    
    public static void method34980(final boolean field40351) {
        Class9404.field40351 = field40351;
    }
    
    static {
        Class9404.field40346 = null;
        Class9404.field40347 = null;
        Class9404.field40348 = null;
        Class9404.field40349 = new Class8163();
        Class9404.field40350 = true;
        Class9404.field40351 = false;
        field40361 = new int[0][];
        field40362 = method34974();
    }
}

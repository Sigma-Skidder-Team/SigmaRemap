// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

import net.minecraft.util.Direction;
import org.lwjgl.opengl.GL11;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.Properties;
import java.util.Map;

public class Class8988
{
    public String field37881;
    public String field37882;
    public int field37883;
    public int[] field37884;
    public String field37885;
    public Map<String, String> field37886;
    public String field37887;
    public Map<String, String> field37888;
    public Class7740 field37889;
    public boolean field37890;
    public int field37891;
    public Class7740 field37892;
    public int[] field37893;
    public Class7740 field37894;
    public Class8998[] field37895;
    public int field37896;
    public int field37897;
    public float field37898;
    public float field37899;
    public int field37900;
    public float field37901;
    public int field37902;
    public Class1932 field37903;
    public Map field37904;
    public Class1912 field37905;
    public Map field37906;
    public Class6313 field37907;
    public Map<String, Class6313> field37908;
    public Class6313 field37909;
    public Map<String, Class6313> field37910;
    private int field37911;
    private int field37912;
    public static final int field37913 = 0;
    public static final int field37914 = 1;
    public static final int field37915 = 2;
    public static final int field37916 = 3;
    public static final int field37917 = 4;
    public static final int field37918 = 0;
    public static final int field37919 = 1;
    public static final int field37920 = 2;
    public static final String field37921 = "inventory";
    
    public Class8988(final Properties properties, final String s) {
        this.field37881 = null;
        this.field37882 = null;
        this.field37883 = 1;
        this.field37884 = null;
        this.field37885 = null;
        this.field37886 = null;
        this.field37887 = null;
        this.field37888 = null;
        this.field37889 = null;
        this.field37890 = false;
        this.field37891 = 0;
        this.field37892 = null;
        this.field37893 = null;
        this.field37894 = null;
        this.field37895 = null;
        this.field37896 = 0;
        this.field37897 = 1;
        this.field37898 = 0.0f;
        this.field37899 = 0.0f;
        this.field37900 = 0;
        this.field37901 = 1.0f;
        this.field37902 = 0;
        this.field37903 = null;
        this.field37904 = null;
        this.field37905 = null;
        this.field37906 = null;
        this.field37907 = null;
        this.field37908 = null;
        this.field37909 = null;
        this.field37910 = null;
        this.field37911 = 0;
        this.field37912 = 0;
        this.field37881 = method31993(s);
        this.field37882 = method31994(s);
        this.field37883 = this.method31995(properties.getProperty("type"));
        this.field37884 = this.method31996(properties.getProperty("items"), properties.getProperty("matchItems"));
        this.field37888 = method32002(properties, this.field37882);
        this.field37887 = method32001(properties.getProperty("model"), s, this.field37882, this.field37883, this.field37888);
        this.field37886 = method31999(properties, this.field37882);
        this.field37885 = method31998(properties.getProperty("texture"), properties.getProperty("tile"), properties.getProperty("source"), s, this.field37882, this.field37883, this.field37886, this.field37888 == null && this.field37887 == null);
        final String property = properties.getProperty("damage");
        if (property != null) {
            this.field37890 = property.contains("%");
            this.field37889 = this.method32007(property.replace("%", ""));
            this.field37891 = this.method32004(properties.getProperty("damageMask"), 0);
        }
        this.field37892 = this.method32007(properties.getProperty("stackSize"));
        this.field37893 = this.method32006(method31992(properties, "enchantmentIDs", "enchantments"), new Class8945());
        this.field37894 = this.method32007(properties.getProperty("enchantmentLevels"));
        this.field37895 = this.method32009(properties);
        this.field37896 = this.method32011(properties.getProperty("hand"));
        this.field37897 = Class9540.method35615(properties.getProperty("blend"));
        this.field37898 = this.method32005(properties.getProperty("speed"), 0.0f);
        this.field37899 = this.method32005(properties.getProperty("rotation"), 0.0f);
        this.field37900 = this.method32004(properties.getProperty("layer"), 0);
        this.field37902 = this.method32004(properties.getProperty("weight"), 0);
        this.field37901 = this.method32005(properties.getProperty("duration"), 1.0f);
    }
    
    private static String method31992(final Properties properties, final String... array) {
        for (int i = 0; i < array.length; ++i) {
            final String property = properties.getProperty(array[i]);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
    
    private static String method31993(final String s) {
        String s2 = s;
        final int lastIndex = s.lastIndexOf(47);
        if (lastIndex >= 0) {
            s2 = s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s2.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s2 = s2.substring(0, lastIndex2);
        }
        return s2;
    }
    
    private static String method31994(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex >= 0) ? s.substring(0, lastIndex) : "";
    }
    
    private int method31995(final String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("item")) {
            return 1;
        }
        if (str.equals("enchantment")) {
            return 2;
        }
        if (str.equals("armor")) {
            return 3;
        }
        if (!str.equals("elytra")) {
            Class8571.method28848("Unknown method: " + str);
            return 0;
        }
        return 4;
    }
    
    private int[] method31996(String trim, final String s) {
        if (trim == null) {
            trim = s;
        }
        if (trim != null) {
            trim = trim.trim();
            final TreeSet set = new TreeSet();
            final String[] method28937 = Class8571.method28937(trim, " ");
            for (int i = 0; i < method28937.length; ++i) {
                final String s2 = method28937[i];
                final Class3820 method28938 = this.method31997(s2);
                if (method28938 != null) {
                    final int method28939 = Class3820.method11696(method28938);
                    if (method28939 >= 0) {
                        set.add(new Integer(method28939));
                    }
                    else {
                        Class8571.method28848("Item ID not found: " + s2);
                    }
                }
                else {
                    Class8571.method28848("Item not found: " + s2);
                }
            }
            final Integer[] array = (Integer[])set.toArray(new Integer[set.size()]);
            final int[] array2 = new int[array.length];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = array[j];
            }
            return array2;
        }
        return null;
    }
    
    private Class3820 method31997(final String s) {
        final Class1932 class1932 = new Class1932(s);
        if (Class90.field211.method510(class1932)) {
            return Class90.field211.method505(class1932);
        }
        return null;
    }
    
    private static String method31998(String s, final String s2, final String s3, final String s4, final String s5, final int n, final Map<String, String> map, final boolean b) {
        if (s == null) {
            s = s2;
        }
        if (s == null) {
            s = s3;
        }
        if (s != null) {
            final String suffix = ".png";
            if (s.endsWith(suffix)) {
                s = s.substring(0, s.length() - suffix.length());
            }
            s = method32000(s, s5);
            return s;
        }
        if (n == 3) {
            return null;
        }
        if (map != null) {
            final String s6 = map.get("texture.bow_standby");
            if (s6 != null) {
                return s6;
            }
        }
        if (b) {
            String s7 = s4;
            final int lastIndex = s4.lastIndexOf(47);
            if (lastIndex >= 0) {
                s7 = s4.substring(lastIndex + 1);
            }
            final int lastIndex2 = s7.lastIndexOf(46);
            if (lastIndex2 >= 0) {
                s7 = s7.substring(0, lastIndex2);
            }
            return method32000(s7, s5);
        }
        return null;
    }
    
    private static Map method31999(final Properties properties, final String s) {
        final Map method32010 = method32010(properties, "texture.");
        if (method32010.size() > 0) {
            final Set keySet = method32010.keySet();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final String s2 : keySet) {
                linkedHashMap.put(s2, method32000((String)method32010.get(s2), s));
            }
            return linkedHashMap;
        }
        return null;
    }
    
    private static String method32000(String str, final String s) {
        str = Class8969.method31832(str, s);
        if (!str.startsWith(s)) {
            if (!str.startsWith("textures/")) {
                if (!str.startsWith("optifine/")) {
                    str = s + "/" + str;
                }
            }
        }
        if (str.endsWith(".png")) {
            str = str.substring(0, str.length() - 4);
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str;
    }
    
    private static String method32001(String s, final String s2, final String s3, final int n, final Map<String, String> map) {
        if (s != null) {
            final String suffix = ".json";
            if (s.endsWith(suffix)) {
                s = s.substring(0, s.length() - suffix.length());
            }
            s = method32003(s, s3);
            return s;
        }
        if (n != 3) {
            if (map != null) {
                final String s4 = map.get("model.bow_standby");
                if (s4 != null) {
                    return s4;
                }
            }
            return s;
        }
        return null;
    }
    
    private static Map method32002(final Properties properties, final String s) {
        final Map method32010 = method32010(properties, "model.");
        if (method32010.size() > 0) {
            final Set keySet = method32010.keySet();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final String s2 : keySet) {
                linkedHashMap.put(s2, method32003((String)method32010.get(s2), s));
            }
            return linkedHashMap;
        }
        return null;
    }
    
    private static String method32003(String str, final String s) {
        str = Class8969.method31832(str, s);
        final boolean b = str.startsWith("block/") || str.startsWith("item/");
        if (!str.startsWith(s)) {
            if (!b) {
                if (!str.startsWith("optifine/")) {
                    str = s + "/" + str;
                }
            }
        }
        final String suffix = ".json";
        if (str.endsWith(suffix)) {
            str = str.substring(0, str.length() - suffix.length());
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str;
    }
    
    private int method32004(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int method28933 = Class8571.method28933(trim, Integer.MIN_VALUE);
        if (method28933 != Integer.MIN_VALUE) {
            return method28933;
        }
        Class8571.method28848("Invalid integer: " + trim);
        return n;
    }
    
    private float method32005(String trim, final float n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final float method28934 = Class8571.method28934(trim, Float.MIN_VALUE);
        if (method28934 != Float.MIN_VALUE) {
            return method28934;
        }
        Class8571.method28848("Invalid float: " + trim);
        return n;
    }
    
    private int[] method32006(final String s, final Class8946 class8946) {
        if (s != null) {
            final String[] method28937 = Class8571.method28937(s, " ");
            final ArrayList list = new ArrayList();
            for (int i = 0; i < method28937.length; ++i) {
                final String str = method28937[i];
                final int method28938 = class8946.method31737(str, Integer.MIN_VALUE);
                if (method28938 != Integer.MIN_VALUE) {
                    list.add(method28938);
                }
                else {
                    Class8571.method28848("Invalid value: " + str);
                }
            }
            return Class8571.method29008((Integer[])list.toArray(new Integer[list.size()]));
        }
        return null;
    }
    
    private Class7740 method32007(final String str) {
        if (str != null) {
            final String[] method28937 = Class8571.method28937(str, " ");
            final Class7740 class7740 = new Class7740();
            for (int i = 0; i < method28937.length; ++i) {
                final Class7356 method28938 = this.method32008(method28937[i]);
                if (method28938 == null) {
                    Class8571.method28848("Invalid range list: " + str);
                    return null;
                }
                class7740.method24696(method28938);
            }
            return class7740;
        }
        return null;
    }
    
    private Class7356 method32008(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() - trim.replace("-", "").length() > 1) {
            Class8571.method28848("Invalid range: " + trim);
            return null;
        }
        final String[] method28937 = Class8571.method28937(trim, "- ");
        final int[] array = new int[method28937.length];
        for (int i = 0; i < method28937.length; ++i) {
            final int method28938 = Class8571.method28933(method28937[i], -1);
            if (method28938 < 0) {
                Class8571.method28848("Invalid range: " + trim);
                return null;
            }
            array[i] = method28938;
        }
        if (array.length != 1) {
            if (array.length != 2) {
                Class8571.method28848("Invalid range: " + trim);
                return null;
            }
            return new Class7356(Math.min(array[0], array[1]), Math.max(array[0], array[1]));
        }
        else {
            final int n = array[0];
            if (!trim.startsWith("-")) {
                return trim.endsWith("-") ? new Class7356(n, 65535) : new Class7356(n, n);
            }
            return new Class7356(0, n);
        }
    }
    
    private Class8998[] method32009(final Properties properties) {
        final String s = "nbt.";
        final Map method32010 = method32010(properties, s);
        if (method32010.size() > 0) {
            final ArrayList list = new ArrayList();
            for (final String s2 : method32010.keySet()) {
                list.add(new Class8998(s2.substring(s.length()), (String)method32010.get(s2)));
            }
            return (Class8998[])list.toArray(new Class8998[list.size()]);
        }
        return null;
    }
    
    private static Map method32010(final Properties properties, final String prefix) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final String key : properties.keySet()) {
            final String property = properties.getProperty(key);
            if (!key.startsWith(prefix)) {
                continue;
            }
            linkedHashMap.put(key, property);
        }
        return linkedHashMap;
    }
    
    private int method32011(String lowerCase) {
        if (lowerCase == null) {
            return 0;
        }
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("any")) {
            return 0;
        }
        if (lowerCase.equals("main")) {
            return 1;
        }
        if (!lowerCase.equals("off")) {
            Class8571.method28848("Invalid hand: " + lowerCase);
            return 0;
        }
        return 2;
    }
    
    public boolean method32012(final String s) {
        if (this.field37881 == null || this.field37881.length() <= 0) {
            Class8571.method28848("No name found: " + s);
            return false;
        }
        if (this.field37882 == null) {
            Class8571.method28848("No base path found: " + s);
            return false;
        }
        if (this.field37883 == 0) {
            Class8571.method28848("No type defined: " + s);
            return false;
        }
        if (this.field37883 == 4) {
            if (this.field37884 == null) {
                this.field37884 = new int[] { Class3820.method11696(Class7739.field31584) };
            }
        }
        Label_0091: {
            if (this.field37883 != 1) {
                if (this.field37883 != 3) {
                    if (this.field37883 != 4) {
                        break Label_0091;
                    }
                }
            }
            if (this.field37884 == null) {
                this.field37884 = this.method32013();
            }
            if (this.field37884 == null) {
                Class8571.method28848("No items defined: " + s);
                return false;
            }
        }
        if (this.field37885 == null) {
            if (this.field37886 == null) {
                if (this.field37887 == null) {
                    if (this.field37888 == null) {
                        Class8571.method28848("No texture or model specified: " + s);
                        return false;
                    }
                }
            }
        }
        if (this.field37883 == 2 && this.field37893 == null) {
            Class8571.method28848("No enchantmentIDs specified: " + s);
            return false;
        }
        return true;
    }
    
    private int[] method32013() {
        final Class3820 method31997 = this.method31997(this.field37881);
        if (method31997 != null) {
            final int method31998 = Class3820.method11696(method31997);
            return (int[])((method31998 >= 0) ? new int[] { method31998 } : null);
        }
        return null;
    }
    
    public void method32014(final Class1774 class1774) {
        if (this.field37885 != null) {
            this.field37903 = this.method32016(this.field37885);
            if (this.field37883 == 1) {
                this.field37905 = class1774.method6359(this.method32017(this.field37903));
            }
        }
        if (this.field37886 != null) {
            this.field37904 = new HashMap();
            this.field37906 = new HashMap();
            for (final String s : this.field37886.keySet()) {
                final Class1932 method32016 = this.method32016(this.field37886.get(s));
                this.field37904.put(s, method32016);
                if (this.field37883 != 1) {
                    continue;
                }
                this.field37906.put(s, class1774.method6359(this.method32017(method32016)));
            }
        }
    }
    
    public void method32015(final Class1774 class1774) {
        if (this.field37905 != null) {
            this.field37905 = class1774.method6338(this.field37905.method7503());
        }
        if (this.field37906 != null) {
            for (final String s : this.field37906.keySet()) {
                final Class1912 class1775 = this.field37906.get(s);
                if (class1775 == null) {
                    continue;
                }
                final Class1932 method7503 = class1775.method7503();
                final Class1912 method7504 = class1774.method6338(method7503);
                if (method7504 == null || method7504 instanceof Class1913) {
                    Class8571.method28848("Missing CIT sprite: " + method7503 + ", properties: " + this.field37882);
                }
                this.field37906.put(s, method7504);
            }
        }
    }
    
    private Class1932 method32016(final String s) {
        if (s != null) {
            final Class1932 class1932 = new Class1932(s);
            final String method7798 = class1932.method7798();
            String s2 = class1932.method7797();
            if (!s2.contains("/")) {
                s2 = "textures/item/" + s2;
            }
            final String string = s2 + ".png";
            final Class1932 class1933 = new Class1932(method7798, string);
            if (!Class8571.method28900(class1933)) {
                Class8571.method28848("File not found: " + string);
            }
            return class1933;
        }
        return null;
    }
    
    private Class1932 method32017(final Class1932 class1932) {
        return new Class1932(class1932.method7798(), Class9518.method35518(Class9518.method35517(class1932.method7797(), "textures/"), ".png"));
    }
    
    public void method32018(final Class1774 class1774, final Class8163 class1775) {
        if (this.field37885 != null || this.field37886 != null) {
            final String[] method32023 = this.method32023();
            final boolean method32024 = this.method32020();
            this.field37907 = method32021(class1774, class1775, method32023, method32024);
            if (this.field37883 == 1) {
                if (this.field37886 != null) {
                    for (final String s : this.field37886.keySet()) {
                        final String s2 = this.field37886.get(s);
                        final String method32025 = Class9518.method35517(s, "texture.");
                        if (!this.method32019(method32025)) {
                            continue;
                        }
                        final Class6313 method32026 = method32021(class1774, class1775, new String[] { s2 }, method32024);
                        if (this.field37908 == null) {
                            this.field37908 = new HashMap<String, Class6313>();
                        }
                        this.field37908.put("item/" + method32025, method32026);
                    }
                }
            }
        }
    }
    
    private boolean method32019(final String s) {
        if (!s.startsWith("bow")) {
            if (!s.startsWith("crossbow")) {
                if (!s.startsWith("fishing_rod")) {
                    if (!s.startsWith("shield")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean method32020() {
        return true;
    }
    
    private static Class6313 method32021(final Class1774 class1774, final Class8163 class1775, final String[] array, final boolean b) {
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = Class9518.method35517(array[i], "textures/");
        }
        return method32026(class1774, class1775.method26985(Class8988::method32022, method32025(array2)), b);
    }
    
    public static Class1912 method32022(final Class3687 class3687) {
        return Class869.method5277().method5322().method6457(class3687.method11330()).method6338(class3687.method11331());
    }
    
    private String[] method32023() {
        if (this.field37883 == 1) {
            if (this.field37884.length == 1) {
                final Class3820 method11697 = Class3820.method11697(this.field37884[0]);
                boolean b = false;
                Label_0083: {
                    if (method11697 != Class7739.field31441) {
                        if (method11697 != Class7739.field31579) {
                            if (method11697 != Class7739.field31582) {
                                b = false;
                                break Label_0083;
                            }
                        }
                    }
                    b = true;
                }
                if (b) {
                    if (this.field37889 != null) {
                        if (this.field37889.method24698() > 0) {
                            final boolean b2 = (this.field37889.method24699(0).method22598() & 0x4000) != 0x0;
                            final String method11698 = this.method32024(this.field37886, "texture.potion_overlay", "item/potion_overlay");
                            String s;
                            if (!b2) {
                                s = this.method32024(this.field37886, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
                            }
                            else {
                                s = this.method32024(this.field37886, "texture.potion_bottle_splash", "item/potion_bottle_splash");
                            }
                            return new String[] { method11698, s };
                        }
                    }
                }
                if (method11697 instanceof Class4055) {
                    final Class4055 class4055 = (Class4055)method11697;
                    if (class4055.method12258() == Class2034.field11592) {
                        final String str = "leather";
                        String str2 = "helmet";
                        final Class2215 method11699 = class4055.method12257();
                        if (method11699 == Class2215.field13605) {
                            str2 = "helmet";
                        }
                        if (method11699 == Class2215.field13604) {
                            str2 = "chestplate";
                        }
                        if (method11699 == Class2215.field13603) {
                            str2 = "leggings";
                        }
                        if (method11699 == Class2215.field13602) {
                            str2 = "boots";
                        }
                        final String string = str + "_" + str2;
                        return new String[] { this.method32024(this.field37886, "texture." + string, "item/" + string), this.method32024(this.field37886, "texture." + string + "_overlay", "item/" + string + "_overlay") };
                    }
                }
            }
        }
        return new String[] { this.field37885 };
    }
    
    private String method32024(final Map<String, String> map, final String s, final String s2) {
        if (map != null) {
            final String s3 = map.get(s);
            return (s3 != null) ? s3 : s2;
        }
        return s2;
    }
    
    private static Class7685 method32025(final String[] array) {
        final StringBuffer sb = new StringBuffer();
        sb.append("{\"parent\": \"builtin/generated\",\"textures\": {");
        for (int i = 0; i < array.length; ++i) {
            final String str = array[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append("\"layer" + i + "\": \"" + str + "\"");
        }
        sb.append("}}");
        return Class7685.method24386(sb.toString());
    }
    
    private static Class6313 method32026(final Class1774 class1774, final Class7685 class1775, final boolean b) {
        final Class2122 field12371 = Class2122.field12371;
        final Class7878 method25530 = new Class7878(class1775, Class9168.field38839, false).method25530(class1775.method24395("particle").method11332());
        for (final Class9219 class1776 : class1775.method24387()) {
            for (final Direction class1777 : class1776.field39556.keySet()) {
                Class8111 class1778 = class1776.field39556.get(class1777);
                if (!b) {
                    class1778 = new Class8111(class1778.field33423, -1, class1778.field33425, class1778.field33426);
                }
                final Class8754 method25531 = method32027(class1776, class1778, class1775.method24395(class1778.field33425).method11332(), class1777, field12371);
                if (class1778.field33423 != null) {
                    method25530.method25528(Direction.rotateFace(field12371.method8274().method34328(), class1778.field33423), method25531);
                }
                else {
                    method25530.method25529(method25531);
                }
            }
        }
        return method25530.method25531();
    }
    
    private static Class8754 method32027(final Class9219 class9219, final Class8111 class9220, final Class1912 class9221, final Direction class9222, final Class2122 class9223) {
        return new Class6225().method18519(class9219.field39554, class9219.field39555, class9220, class9221, class9222, class9223, class9219.field39557, class9219.field39558, class9221.method7503());
    }
    
    @Override
    public String toString() {
        return "" + this.field37882 + "/" + this.field37881 + ", type: " + this.field37883 + ", items: [" + Class8571.method28890(this.field37884) + "], textture: " + this.field37885;
    }
    
    public float method32028(final Class1663 class1663) {
        if (this.field37911 <= 0) {
            if (this.field37903 != null) {
                final int method5869 = class1663.method5853(this.field37903).method5869();
                final int method5870 = Class8933.method31667();
                Class8933.method31617(method5869);
                this.field37911 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
                Class8933.method31617(method5870);
            }
            if (this.field37911 <= 0) {
                this.field37911 = 16;
            }
        }
        return (float)this.field37911;
    }
    
    public float method32029(final Class1663 class1663) {
        if (this.field37912 <= 0) {
            if (this.field37903 != null) {
                final int method5869 = class1663.method5853(this.field37903).method5869();
                final int method5870 = Class8933.method31667();
                Class8933.method31617(method5869);
                this.field37912 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
                Class8933.method31617(method5870);
            }
            if (this.field37912 <= 0) {
                this.field37912 = 16;
            }
        }
        return (float)this.field37912;
    }
    
    public Class6313 method32030(final Class1932 class1932, final boolean b) {
        Class6313 class1933;
        Map<String, Class6313> map;
        if (!b) {
            class1933 = this.field37907;
            map = this.field37908;
        }
        else {
            class1933 = this.field37909;
            map = this.field37910;
        }
        if (class1932 != null) {
            if (map != null) {
                final Class6313 class1934 = map.get(class1932.method7797());
                if (class1934 != null) {
                    return class1934;
                }
            }
        }
        return class1933;
    }
    
    public void method32031(final Class7637 class7637) {
        if (this.field37887 != null) {
            method32033(class7637, this.field37887);
        }
        if (this.field37883 == 1) {
            if (this.field37888 != null) {
                for (final String s : this.field37888.keySet()) {
                    final String s2 = this.field37888.get(s);
                    if (!this.method32019(Class9518.method35517(s, "model."))) {
                        continue;
                    }
                    method32033(class7637, s2);
                }
            }
        }
    }
    
    public void method32032() {
        final Class1790 method28860 = Class8571.method28860();
        final Class6313 method28861 = method28860.method6452();
        if (this.field37887 != null) {
            final Class1933 class1933 = new Class1933(method32035(this.field37887), "inventory");
            this.field37909 = method28860.method6451(class1933);
            if (this.field37909 == method28861) {
                Class8571.method28848("Custom Items: Model not found " + class1933.method7797());
                this.field37909 = null;
            }
        }
        if (this.field37883 == 1) {
            if (this.field37888 != null) {
                for (final String s : this.field37888.keySet()) {
                    final String s2 = this.field37888.get(s);
                    final String method28862 = Class9518.method35517(s, "model.");
                    if (!this.method32019(method28862)) {
                        continue;
                    }
                    final Class1933 class1934 = new Class1933(method32035(s2), "inventory");
                    final Class6313 method28863 = method28860.method6451(class1934);
                    if (method28863 != method28861) {
                        if (this.field37910 == null) {
                            this.field37910 = new HashMap<String, Class6313>();
                        }
                        this.field37910.put("item/" + method28862, method28863);
                    }
                    else {
                        Class8571.method28848("Custom Items: Model not found " + class1934.method7797());
                    }
                }
            }
        }
    }
    
    private static void method32033(final Class7637 class7637, final String s) {
        final Class1933 obj = new Class1933(method32035(s), "inventory");
        if (Class9570.field41391.method22623()) {
            try {
                final Object method22630 = Class9570.field41394.method22630();
                method32034(method22630, "vanillaLoader is null");
                final Object method22631 = Class9570.method35826(method22630, Class9570.field41395, obj);
                method32034(method22631, "iModel is null");
                final Map map = (Map)Class9570.method35828(class7637, Class9570.field41392);
                method32034(map, "stateModels is null");
                map.put(obj, method22631);
                final Set set = (Set)Class9570.field41397.method22630();
                method32034(set, "registryTextures is null");
                final Collection collection = (Collection)Class9570.method35826(method22631, Class9570.field41343, new Object[0]);
                method32034(collection, "modelTextures is null");
                set.addAll(collection);
            }
            catch (final Exception ex) {
                Class8571.method28848("Error registering model: " + obj + ", " + ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
        else {
            class7637.method24018(obj);
        }
    }
    
    private static void method32034(final Object o, final String s) throws NullPointerException {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    private static Class1932 method32035(final String str) {
        return (Class9570.field41391.method22623() && !str.startsWith("optifine/")) ? new Class1932("models/" + str) : new Class1932(str);
    }
}

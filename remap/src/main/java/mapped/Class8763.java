// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Properties;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Set;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.commons.lang3.tuple.ImmutablePair;
import java.util.HashMap;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import org.apache.commons.lang3.tuple.Pair;
import java.util.Random;

public class Class8763
{
    private static String field36792;
    private static Class7718 field36793;
    private static Class7718 field36794;
    private static Class7718 field36795;
    private static Class7718 field36796;
    private static Class7718 field36797;
    private static Class7718[] field36798;
    private static Class7718[][] field36799;
    private static Class7718 field36800;
    private static Class9292 field36801;
    private static Class7718 field36802;
    private static Class9292 field36803;
    private static Class7718 field36804;
    private static Class9292 field36805;
    private static Class7718 field36806;
    private static Class9292 field36807;
    private static Class8265[] field36808;
    private static int field36809;
    private static Class7718 field36810;
    private static Class7718 field36811;
    private static int field36812;
    private static Class7718 field36813;
    private static Class7718 field36814;
    private static Class7718 field36815;
    private static Class7718 field36816;
    private static Class7718 field36817;
    private static boolean field36818;
    private static int field36819;
    private static int field36820;
    private static int field36821;
    private static int field36822;
    private static int field36823;
    private static int field36824;
    private static Vec3d field36825;
    private static Vec3d field36826;
    private static Vec3d field36827;
    private static int[] field36828;
    private static int[] field36829;
    private static float[][] field36830;
    private static float[][] field36831;
    private static int[] field36832;
    private static int[] field36833;
    private static int[] field36834;
    private static final Class7096 field36835;
    private static final Class7096 field36836;
    public static Random field36837;
    private static final Class7712 field36838;
    private static final Class7712 field36839;
    private static final Class7712 field36840;
    private static final Class7712 field36841;
    private static final Class7712 field36842;
    
    public static void method30319() {
        Class8763.field36792 = "vanilla";
        Class8763.field36793 = null;
        Class8763.field36795 = null;
        Class8763.field36794 = null;
        Class8763.field36797 = null;
        Class8763.field36796 = null;
        Class8763.field36800 = null;
        Class8763.field36802 = null;
        Class8763.field36804 = null;
        Class8763.field36806 = null;
        Class8763.field36810 = null;
        Class8763.field36811 = null;
        Class8763.field36812 = -1;
        Class8763.field36813 = null;
        Class8763.field36814 = null;
        Class8763.field36817 = null;
        Class8763.field36808 = null;
        Class8763.field36819 = -1;
        Class8763.field36820 = -1;
        Class8763.field36821 = -1;
        Class8763.field36822 = -1;
        Class8763.field36823 = -1;
        Class8763.field36824 = -1;
        Class8763.field36825 = null;
        Class8763.field36826 = null;
        Class8763.field36827 = null;
        Class8763.field36798 = null;
        Class8763.field36799 = null;
        Class8763.field36818 = true;
        Class8763.field36828 = null;
        Class8763.field36829 = null;
        Class8763.field36830 = null;
        Class8763.field36831 = null;
        Class8763.field36832 = null;
        method30381(Class8763.field36833);
        Class8763.field36834 = null;
        Class8763.field36792 = method30320("optifine/color.properties", "palette.format", Class7718.field30700, "vanilla");
        final String s = "optifine/colormap/";
        Class8763.field36793 = method30333(s, new String[] { "water.png", "watercolorx.png" }, 256, 256);
        method30335();
        if (Config.method28945()) {
            Class8763.field36794 = method30333(s, new String[] { "pine.png", "pinecolor.png" }, 256, 256);
            Class8763.field36795 = method30333(s, new String[] { "birch.png", "birchcolor.png" }, 256, 256);
            Class8763.field36797 = method30333(s, new String[] { "swampgrass.png", "swampgrasscolor.png" }, 256, 256);
            Class8763.field36796 = method30333(s, new String[] { "swampfoliage.png", "swampfoliagecolor.png" }, 256, 256);
            Class8763.field36800 = method30333(s, new String[] { "sky0.png", "skycolor0.png" }, 256, 256);
            Class8763.field36802 = method30333(s, new String[] { "fog0.png", "fogcolor0.png" }, 256, 256);
            Class8763.field36804 = method30333(s, new String[] { "underwater.png", "underwatercolor.png" }, 256, 256);
            Class8763.field36806 = method30333(s, new String[] { "underlava.png", "underlavacolor.png" }, 256, 256);
            Class8763.field36810 = method30333(s, new String[] { "redstone.png", "redstonecolor.png" }, 16, 1);
            Class8763.field36811 = method30334(s + "xporb.png", -1, -1);
            Class8763.field36813 = method30334(s + "durability.png", -1, -1);
            Class8763.field36814 = method30333(s, new String[] { "stem.png", "stemcolor.png" }, 8, 1);
            Class8763.field36816 = method30334(s + "pumpkinstem.png", 8, 1);
            Class8763.field36815 = method30334(s + "melonstem.png", 8, 1);
            Class8763.field36817 = method30333(s, new String[] { "myceliumparticle.png", "myceliumparticlecolor.png" }, -1, -1);
            final Pair<Class8265[], Integer> method30321 = method30321();
            Class8763.field36808 = method30321.getLeft();
            Class8763.field36809 = method30321.getRight();
            method30323("optifine/color.properties");
            Class8763.field36799 = method30325(new String[] { s + "custom/", s + "blocks/" }, Class8763.field36798, 256, 256);
            method30335();
        }
    }
    
    private static String method30320(final String s, final String str, final String[] a, final String s2) {
        try {
            final InputStream method28897 = Config.method28897(new ResourceLocation(s));
            if (method28897 == null) {
                return s2;
            }
            final Class27 class27 = new Class27();
            class27.load(method28897);
            method28897.close();
            final String property = class27.getProperty(str);
            if (property == null) {
                return s2;
            }
            if (!Arrays.asList(a).contains(property)) {
                method30383("Invalid value: " + str + "=" + property);
                method30383("Expected values: " + Config.method28888(a));
                return s2;
            }
            method30382(str + "=" + property);
            return property;
        }
        catch (final FileNotFoundException ex) {
            return s2;
        }
        catch (final IOException ex2) {
            ex2.printStackTrace();
            return s2;
        }
    }
    
    private static Pair<Class8265[], Integer> method30321() {
        final String s = "optifine/lightmap/world";
        final String s2 = ".png";
        final String[] method32775 = Class9084.method32775(s, s2);
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < method32775.length; ++i) {
            final String str = method32775[i];
            final String method32776 = Class9518.method35527(str, s, s2);
            final int method32777 = Config.method28933(method32776, Integer.MIN_VALUE);
            if (method32777 != Integer.MIN_VALUE) {
                hashMap.put(method32777, str);
            }
            else {
                method30383("Invalid dimension ID: " + method32776 + ", path: " + str);
            }
        }
        final Set keySet = hashMap.keySet();
        final Integer[] array = (Integer[])keySet.toArray(new Integer[keySet.size()]);
        Arrays.sort(array);
        if (array.length > 0) {
            final int intValue = array[0];
            final Class7718[] array2 = new Class7718[array[array.length - 1] - intValue + 1];
            for (int j = 0; j < array.length; ++j) {
                final Integer n = array[j];
                final String str2 = (String)hashMap.get(n);
                final Class7718 method32778 = method30334(str2, -1, -1);
                if (method32778 != null) {
                    if (method32778.method24638() >= 16) {
                        array2[n - intValue] = method32778;
                    }
                    else {
                        method30383("Invalid lightmap width: " + method32778.method24638() + ", path: " + str2);
                    }
                }
            }
            final Class8265[] array3 = new Class8265[array2.length];
            for (int k = 0; k < array2.length; ++k) {
                final Class7718 class7718 = array2[k];
                if (class7718 != null) {
                    final String field30681 = class7718.field30681;
                    final String field30682 = class7718.field30682;
                    final Class7718 method32779 = method30334(field30682 + "/" + field30681 + "_rain.png", -1, -1);
                    final Class7718 method32780 = method30334(field30682 + "/" + field30681 + "_thunder.png", -1, -1);
                    array3[k] = new Class8265(new Class9432(class7718), (method32779 == null) ? null : new Class9432(method32779), (method32780 == null) ? null : new Class9432(method32780));
                }
            }
            return (Pair<Class8265[], Integer>)new ImmutablePair(array3, intValue);
        }
        return (Pair<Class8265[], Integer>)new ImmutablePair(null, 0);
    }
    
    private static int method30322(final String s, final int n) {
        try {
            final InputStream method28897 = Config.method28897(new ResourceLocation(s));
            if (method28897 == null) {
                return n;
            }
            final BufferedImage read = ImageIO.read(method28897);
            method28897.close();
            return (read == null) ? n : read.getHeight();
        }
        catch (final IOException ex) {
            return n;
        }
    }
    
    private static void method30323(final String s) {
        try {
            final InputStream method28897 = Config.method28897(new ResourceLocation(s));
            if (method28897 == null) {
                return;
            }
            method30382("Loading " + s);
            final Class27 class27 = new Class27();
            class27.load(method28897);
            method28897.close();
            Class8763.field36819 = method30329(class27, new String[] { "particle.water", "drop.water" });
            Class8763.field36820 = method30330(class27, "particle.portal");
            Class8763.field36821 = method30330(class27, "lilypad");
            Class8763.field36822 = method30330(class27, "text.xpbar");
            Class8763.field36823 = method30330(class27, "text.boss");
            Class8763.field36824 = method30330(class27, "text.sign");
            Class8763.field36825 = method30332(class27, "fog.nether");
            Class8763.field36826 = method30332(class27, "fog.end");
            Class8763.field36827 = method30332(class27, "sky.end");
            Class8763.field36798 = method30324(class27, s);
            Class8763.field36828 = method30364(class27, s, "egg.shell.", "Spawn egg shell");
            Class8763.field36829 = method30364(class27, s, "egg.spots.", "Spawn egg spot");
            Class8763.field36830 = method30367(class27, s, "collar.", "Wolf collar");
            Class8763.field36831 = method30367(class27, s, "sheep.", "Sheep");
            Class8763.field36832 = method30371(class27, s, "text.code.", "Text");
            final int[] method28898 = method30373(class27, s, "map.", "Map");
            if (method28898 != null) {
                if (Class8763.field36833 == null) {
                    Class8763.field36833 = method30380();
                }
                method30381(method28898);
            }
            Class8763.field36834 = method30374(class27, s, "potion.", "Potion");
            Class8763.field36812 = Config.method28933(class27.getProperty("xporb.time"), -1);
        }
        catch (final FileNotFoundException ex) {}
        catch (final IOException ex2) {
            Config.warn("Error parsing: " + s);
            Config.warn(ex2.getClass().getName() + ": " + ex2.getMessage());
        }
    }
    
    private static Class7718[] method30324(final Properties properties, final String s) {
        final ArrayList list = new ArrayList();
        final String prefix = "palette.block.";
        final HashMap hashMap = new HashMap();
        for (final String key : properties.keySet()) {
            final String property = properties.getProperty(key);
            if (!key.startsWith(prefix)) {
                continue;
            }
            hashMap.put(key, property);
        }
        final String[] array = (String[])hashMap.keySet().toArray(new String[hashMap.size()]);
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            final String property2 = properties.getProperty(s2);
            method30382("Block palette: " + s2 + " = " + property2);
            final String method31832 = Class8969.method31832(s2.substring(prefix.length()), Class8969.method31833(s));
            final Class7718 method31833 = method30334(method31832, 256, 256);
            if (method31833 != null) {
                final Class8802[] method31834 = new Class8652("CustomColors").method29442(property2);
                if (method31834 != null && method31834.length > 0) {
                    for (int j = 0; j < method31834.length; ++j) {
                        method31833.method24641(method31834[j]);
                    }
                    list.add(method31833);
                }
                else {
                    method30383("Invalid match blocks: " + property2);
                }
            }
            else {
                method30383("Colormap not found: " + method31832);
            }
        }
        if (list.size() > 0) {
            return (Class7718[])list.toArray(new Class7718[list.size()]);
        }
        return null;
    }
    
    private static Class7718[][] method30325(final String[] array, final Class7718[] array2, final int n, final int n2) {
        final String[] method32776 = Class9084.method32776(array, new String[] { ".properties" });
        Arrays.sort(method32776);
        final ArrayList list = new ArrayList();
        for (int i = 0; i < method32776.length; ++i) {
            final String str = method32776[i];
            method30382("Block colormap: " + str);
            try {
                final InputStream method32777 = Config.method28897(new ResourceLocation("minecraft", str));
                if (method32777 == null) {
                    method30383("File not found: " + str);
                }
                else {
                    final Class27 class27 = new Class27();
                    class27.load(method32777);
                    final Class7718 class28 = new Class7718(class27, str, n, n2, Class8763.field36792);
                    if (class28.method24619(str) && class28.method24620(str)) {
                        method30326(class28, list);
                    }
                }
            }
            catch (final FileNotFoundException ex) {
                method30383("File not found: " + str);
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
        if (array2 != null) {
            for (int j = 0; j < array2.length; ++j) {
                method30326(array2[j], list);
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return method30328(list);
    }
    
    private static void method30326(final Class7718 class7718, final List list) {
        final int[] method24644 = class7718.method24644();
        if (method24644 != null && method24644.length > 0) {
            for (int i = 0; i < method24644.length; ++i) {
                final int j = method24644[i];
                if (j >= 0) {
                    method30327(class7718, list, j);
                }
                else {
                    method30383("Invalid block ID: " + j);
                }
            }
        }
        else {
            method30383("No match blocks: " + Config.method28890(method24644));
        }
    }
    
    private static void method30327(final Class7718 class7718, final List list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList();
            list.set(i, list2);
        }
        list2.add(class7718);
    }
    
    private static Class7718[][] method30328(final List list) {
        final Class7718[][] array = new Class7718[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (Class7718[])list2.toArray(new Class7718[list2.size()]);
            }
        }
        return array;
    }
    
    private static int method30329(final Properties properties, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            final int method30330 = method30330(properties, array[i]);
            if (method30330 >= 0) {
                return method30330;
            }
        }
        return -1;
    }
    
    private static int method30330(final Properties properties, final String str) {
        final String property = properties.getProperty(str);
        if (property == null) {
            return -1;
        }
        final String trim = property.trim();
        final int method30331 = method30331(trim);
        if (method30331 >= 0) {
            method30382(str + " = " + trim);
            return method30331;
        }
        method30383("Invalid color: " + str + " = " + trim);
        return method30331;
    }
    
    private static int method30331(String trim) {
        if (trim == null) {
            return -1;
        }
        trim = trim.trim();
        try {
            return Integer.parseInt(trim, 16) & 0xFFFFFF;
        }
        catch (final NumberFormatException ex) {
            return -1;
        }
    }
    
    private static Vec3d method30332(final Properties properties, final String s) {
        final int method30330 = method30330(properties, s);
        if (method30330 >= 0) {
            return new Vec3d((method30330 >> 16 & 0xFF) / 255.0f, (method30330 >> 8 & 0xFF) / 255.0f, (method30330 & 0xFF) / 255.0f);
        }
        return null;
    }
    
    private static Class7718 method30333(final String str, final String[] array, final int n, final int n2) {
        for (int i = 0; i < array.length; ++i) {
            final Class7718 method30334 = method30334(str + array[i], n, n2);
            if (method30334 != null) {
                return method30334;
            }
        }
        return null;
    }
    
    public static Class7718 method30334(final String s, final int n, final int n2) {
        try {
            if (!Config.method28900(new ResourceLocation(s))) {
                return null;
            }
            method30382("Colormap " + s);
            final Class27 class27 = new Class27();
            String method35519 = Class9518.method35519(s, ".png", ".properties");
            final ResourceLocation class28 = new ResourceLocation(method35519);
            if (Config.method28900(class28)) {
                final InputStream method35520 = Config.method28897(class28);
                class27.load(method35520);
                method35520.close();
                method30382("Colormap properties: " + method35519);
            }
            else {
                class27.put("format", Class8763.field36792);
                class27.put("source", s);
                method35519 = s;
            }
            final Class7718 class29 = new Class7718(class27, method35519, n, n2, Class8763.field36792);
            return class29.method24619(method35519) ? class29 : null;
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void method30335() {
        boolean field36818 = false;
        Label_0052: {
            if (Class8763.field36795 == null) {
                if (Class8763.field36794 == null) {
                    if (Class8763.field36797 == null) {
                        if (Class8763.field36796 == null) {
                            if (Config.method28940()) {
                                field36818 = true;
                                break Label_0052;
                            }
                        }
                    }
                }
            }
            field36818 = false;
        }
        Class8763.field36818 = field36818;
    }
    
    public static int method30336(final Class8754 class8754, final Class7096 class8755, final Class1856 class8756, BlockPos class8757, final Class9145 class8758) {
        final Block method21696 = class8755.method21696();
        Class7096 class8759 = class8755;
        if (Class8763.field36799 != null) {
            if (!class8754.method30292()) {
                if (method21696 == Blocks.GRASS_BLOCK) {
                    class8759 = Class8763.field36835;
                }
                if (method21696 == Blocks.REDSTONE_WIRE) {
                    return -1;
                }
            }
            if (method21696 instanceof Class3870) {
                if (class8755.method21772(Class3870.field17513) == Class182.field564) {
                    class8757 = class8757.method1139();
                    class8759 = class8756.getBlockState(class8757);
                }
            }
            final Class7718 method21697 = method30338(class8759);
            if (method21697 != null) {
                if (Config.method28943() && !method21697.method24617()) {
                    return method30339(class8755, class8756, class8757, method21697, class8758.method33383());
                }
                return method21697.method24632(class8756, class8757);
            }
        }
        if (!class8754.method30292()) {
            return -1;
        }
        if (method21696 == Blocks.field29393) {
            return method30351(class8756, class8757);
        }
        if (method21696 == Blocks.REDSTONE_WIRE) {
            return method30344(class8758.method33382());
        }
        if (method21696 instanceof Class3873) {
            return method30360(class8755, class8756, class8757, class8758);
        }
        if (!Class8763.field36818) {
            if (method21696 != Blocks.GRASS_BLOCK) {
                if (method21696 != Blocks.field29553) {
                    if (!(method21696 instanceof Class3870)) {
                        if (!(method21696 instanceof Class3870)) {
                            if (!(method21696 instanceof Class3972)) {
                                if (method21696 == Blocks.field29388) {
                                    final Class7712 class8760 = Class8763.field36839;
                                    return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                                }
                                return -1;
                            }
                            else {
                                if (method21696 == Blocks.field29205) {
                                    final Class7712 class8760 = Class8763.field36839;
                                    return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                                }
                                if (method21696 == Blocks.field29206) {
                                    final Class7712 class8760 = Class8763.field36840;
                                    return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                                }
                                if (method21696 != Blocks.field29207) {
                                    final Class7712 class8760 = Class8763.field36839;
                                    return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                                }
                                final Class7712 class8760 = Class8763.field36841;
                                return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                            }
                        }
                        else {
                            final Class7712 class8760 = Class8763.field36838;
                            if (class8755.method21772(Class3870.field17513) != Class182.field564) {
                                return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                            }
                            class8757 = class8757.method1139();
                            return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
                        }
                    }
                }
            }
            final Class7712 class8760 = Class8763.field36838;
            return (Config.method28943() && !class8760.method24617()) ? method30339(class8755, class8756, class8757, class8760, class8758.method33383()) : class8760.method24616(class8759, class8756, class8757);
        }
        return -1;
    }
    
    public static Biome method30337(final Class1856 class1856, final BlockPos class1857) {
        Biome class1858 = Class7984.method26045(class1856, class1857);
        if (class1858 == Class7102.field27638 || class1858 == Class7102.field27689) {
            if (!Config.method28940()) {
                class1858 = Class7102.field27633;
            }
        }
        return class1858;
    }
    
    private static Class7718 method30338(final Class7096 class7096) {
        if (Class8763.field36799 == null) {
            return null;
        }
        if (!(class7096 instanceof Class7096)) {
            return null;
        }
        final int method21691 = class7096.method21691();
        if (method21691 < 0 || method21691 >= Class8763.field36799.length) {
            return null;
        }
        final Class7718[] array = Class8763.field36799[method21691];
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class7718 class7097 = array[i];
                if (class7097.method24627(class7096)) {
                    return class7097;
                }
            }
            return null;
        }
        return null;
    }
    
    private static int method30339(final Class7096 class7096, final Class1856 class7097, final BlockPos class7098, final Class7712 class7099, final Class384 class7100) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        final int method1074 = class7098.getX();
        final int method1075 = class7098.getY();
        final int method1076 = class7098.getZ();
        final int method1077 = Config.method28944();
        final int n4 = method1077 * 2 + 1;
        final int n5 = n4 * n4;
        for (int i = method1074 - method1077; i <= method1074 + method1077; ++i) {
            for (int j = method1076 - method1077; j <= method1076 + method1077; ++j) {
                class7100.method1279(i, method1075, j);
                final int method1078 = class7099.method24616(class7096, class7097, class7100);
                n += (method1078 >> 16 & 0xFF);
                n2 += (method1078 >> 8 & 0xFF);
                n3 += (method1078 & 0xFF);
            }
        }
        return n / n5 << 16 | n2 / n5 << 8 | n3 / n5;
    }
    
    public static int method30340(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858, final Class9145 class1859) {
        class1857.method21696();
        Class7712 class1860 = method30338(class1857);
        if (class1860 == null) {
            if (class1857.method21697() == Material.WATER) {
                class1860 = Class8763.field36842;
            }
        }
        if (class1860 != null) {
            return (Config.method28943() && !class1860.method24617()) ? method30339(class1857, class1856, class1858, class1860, class1859.method33383()) : class1860.method24616(class1857, class1856, class1858);
        }
        return method30341().method25441(class1857, class1856, class1858, 0);
    }
    
    public static Class7860 method30341() {
        return Minecraft.getInstance().method5316();
    }
    
    public static void method30342(final Class6173 class6173) {
        if (Class8763.field36820 >= 0) {
            final int field36820 = Class8763.field36820;
            class6173.method18435((field36820 >> 16 & 0xFF) / 255.0f, (field36820 >> 8 & 0xFF) / 255.0f, (field36820 & 0xFF) / 255.0f);
        }
    }
    
    public static void method30343(final Class6173 class6173) {
        if (Class8763.field36817 != null) {
            final int method24628 = Class8763.field36817.method24628();
            class6173.method18435((method24628 >> 16 & 0xFF) / 255.0f, (method24628 >> 8 & 0xFF) / 255.0f, (method24628 & 0xFF) / 255.0f);
        }
    }
    
    private static int method30344(final Class7096 class7096) {
        if (Class8763.field36810 != null) {
            return Class8763.field36810.method24629(method30346(class7096, 15));
        }
        return -1;
    }
    
    public static void method30345(final Class6173 class6173, final Class1856 class6174, final double n, final double n2, final double n3) {
        if (Class8763.field36810 != null) {
            final int method24629 = Class8763.field36810.method24629(method30346(class6174.getBlockState(new BlockPos(n, n2, n3)), 15));
            class6173.method18435((method24629 >> 16 & 0xFF) / 255.0f, (method24629 >> 8 & 0xFF) / 255.0f, (method24629 & 0xFF) / 255.0f);
        }
    }
    
    private static int method30346(final Class7096 class7096, final int n) {
        if (!(class7096.method21696() instanceof Class3999)) {
            return n;
        }
        final Integer method21772 = class7096.method21772((IProperty<Integer>)Class3999.field18026);
        if (method21772 instanceof Integer) {
            return method21772;
        }
        return n;
    }
    
    public static float method30347(final float n) {
        if (Class8763.field36812 > 0) {
            return n * (628.0f / Class8763.field36812);
        }
        return n;
    }
    
    public static int method30348(final float n) {
        if (Class8763.field36811 != null) {
            return Class8763.field36811.method24629((int)Math.round((MathHelper.sin(n) + 1.0f) * (Class8763.field36811.method24637() - 1) / 2.0));
        }
        return -1;
    }
    
    public static int method30349(final float n, final int n2) {
        if (Class8763.field36813 != null) {
            return Class8763.field36813.method24629((int)(n * Class8763.field36813.method24637()));
        }
        return n2;
    }
    
    public static void method30350(final Class6173 class6173, final Class1856 class6174, final double n, final double n2, final double n3, final Class9145 class6175) {
        if (Class8763.field36793 == null) {
            if (Class8763.field36799 == null) {
                if (Class8763.field36819 < 0) {
                    return;
                }
            }
        }
        final BlockPos class6176 = new BlockPos(n, n2, n3);
        class6175.method33373(Class8763.field36836, class6176);
        final int method30340 = method30340(class6174, Class8763.field36836, class6176, class6175);
        final int n4 = method30340 >> 16 & 0xFF;
        final int n5 = method30340 >> 8 & 0xFF;
        final int n6 = method30340 & 0xFF;
        float n7 = n4 / 255.0f;
        float n8 = n5 / 255.0f;
        float n9 = n6 / 255.0f;
        if (Class8763.field36819 >= 0) {
            final int n10 = Class8763.field36819 >> 16 & 0xFF;
            final int n11 = Class8763.field36819 >> 8 & 0xFF;
            final int n12 = Class8763.field36819 & 0xFF;
            n7 *= n10 / 255.0f;
            n8 *= n11 / 255.0f;
            n9 *= n12 / 255.0f;
        }
        class6173.method18435(n7, n8, n9);
    }
    
    private static int method30351(final Class1856 class1856, final BlockPos class1857) {
        return (Class8763.field36821 >= 0) ? Class8763.field36821 : method30341().method25441(Blocks.field29393.getDefaultState(), class1856, class1857, 0);
    }
    
    private static Vec3d method30352(final Vec3d class5487) {
        return (Class8763.field36825 != null) ? Class8763.field36825 : class5487;
    }
    
    private static Vec3d method30353(final Vec3d class5487) {
        return (Class8763.field36826 != null) ? Class8763.field36826 : class5487;
    }
    
    private static Vec3d method30354(final Vec3d class5487) {
        return (Class8763.field36827 != null) ? Class8763.field36827 : class5487;
    }
    
    public static Vec3d method30355(final Vec3d class5487, final Class1856 class5488, final double n, final double n2, final double n3) {
        if (Class8763.field36800 != null) {
            final int method24634 = Class8763.field36800.method24634(class5488, n, n2, n3, 3);
            return Class8763.field36801.method34320((method24634 >> 16 & 0xFF) / 255.0f * ((float)class5487.x / 0.5f), (method24634 >> 8 & 0xFF) / 255.0f * ((float)class5487.y / 0.66275f), (method24634 & 0xFF) / 255.0f * (float)class5487.z);
        }
        return class5487;
    }
    
    private static Vec3d method30356(final Vec3d class5487, final Class1856 class5488, final double n, final double n2, final double n3) {
        if (Class8763.field36802 != null) {
            final int method24634 = Class8763.field36802.method24634(class5488, n, n2, n3, 3);
            return Class8763.field36803.method34320((method24634 >> 16 & 0xFF) / 255.0f * ((float)class5487.x / 0.753f), (method24634 >> 8 & 0xFF) / 255.0f * ((float)class5487.y / 0.8471f), (method24634 & 0xFF) / 255.0f * (float)class5487.z);
        }
        return class5487;
    }
    
    public static Vec3d method30357(final Class1856 class1856, final double n, final double n2, final double n3) {
        return method30359(class1856, n, n2, n3, Class8763.field36804, Class8763.field36805);
    }
    
    public static Vec3d method30358(final Class1856 class1856, final double n, final double n2, final double n3) {
        return method30359(class1856, n, n2, n3, Class8763.field36806, Class8763.field36807);
    }
    
    public static Vec3d method30359(final Class1856 class1856, final double n, final double n2, final double n3, final Class7718 class1857, final Class9292 class1858) {
        if (class1857 != null) {
            final int method24634 = class1857.method24634(class1856, n, n2, n3, 3);
            return class1858.method34320((method24634 >> 16 & 0xFF) / 255.0f, (method24634 >> 8 & 0xFF) / 255.0f, (method24634 & 0xFF) / 255.0f);
        }
        return null;
    }
    
    private static int method30360(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class9145 class7099) {
        Class7718 class7100 = Class8763.field36814;
        final Block method21696 = class7096.method21696();
        if (method21696 == Blocks.field29386) {
            if (Class8763.field36816 != null) {
                class7100 = Class8763.field36816;
            }
        }
        if (method21696 == Blocks.field29387) {
            if (Class8763.field36815 != null) {
                class7100 = Class8763.field36815;
            }
        }
        if (class7100 == null) {
            return -1;
        }
        if (method21696 instanceof Class3873) {
            return class7100.method24629(class7096.method21772((IProperty<Integer>)Class3873.field17516));
        }
        return -1;
    }
    
    public static boolean method30361(final ClientWorld clientWorld, final float n, final Class1846 class1849, final boolean b, final float n2) {
        if (clientWorld == null) {
            return false;
        }
        if (Class8763.field36808 == null) {
            return false;
        }
        final int n3 = clientWorld.dimension.getType().method1270() - Class8763.field36809;
        if (n3 >= 0 && n3 < Class8763.field36808.length) {
            final Class8265 class1850 = Class8763.field36808[n3];
            return class1850 != null && class1850.method27449(clientWorld, n, class1849, b, n2);
        }
        return false;
    }
    
    public static Vec3d method30362(final Vec3d class5487, final World class5488, final Entity class5489, final float n) {
        final DimensionType method20487 = class5488.dimension.getType();
        final Minecraft method20488 = Minecraft.getInstance();
        if (method20487 == DimensionType.field2224) {
            return method30352(class5487);
        }
        if (method20487 != DimensionType.field2223) {
            return (method20487 != DimensionType.field2225) ? class5487 : method30353(class5487);
        }
        return method30356(class5487, method20488.world, class5489.getPosX(), class5489.getPosY() + 1.0, class5489.getPosZ());
    }
    
    public static Vec3d method30363(final Vec3d class5487, final World class5488, final Entity class5489, final float n) {
        final DimensionType method20487 = class5488.dimension.getType();
        final Minecraft method20488 = Minecraft.getInstance();
        if (method20487 != DimensionType.field2223) {
            return (method20487 != DimensionType.field2225) ? class5487 : method30354(class5487);
        }
        return method30355(class5487, method20488.world, class5489.getPosX(), class5489.getPosY() + 1.0, class5489.getPosZ());
    }
    
    private static int[] method30364(final Properties properties, final String s, final String prefix, final String str) {
        final ArrayList list = new ArrayList();
        final Set<Object> keySet = properties.keySet();
        int i = 0;
        for (final String str2 : keySet) {
            final String property = properties.getProperty(str2);
            if (str2.startsWith(prefix)) {
                final String method35517 = Class9518.method35517(str2, prefix);
                int n = Class9543.method35627(method35517);
                try {
                    if (n < 0) {
                        n = Class9543.method35626(new ResourceLocation(method35517).toString());
                    }
                }
                catch (final Class2357 class2357) {
                    Config.warn("ResourceLocationException: " + class2357.getMessage());
                }
                if (n < 0) {
                    method30383("Invalid spawn egg name: " + str2);
                }
                else {
                    final int method35518 = method30331(property);
                    if (method35518 < 0) {
                        method30383("Invalid spawn egg color: " + str2 + " = " + property);
                    }
                    else {
                        while (list.size() <= n) {
                            list.add(-1);
                        }
                        list.set(n, method35518);
                        ++i;
                    }
                }
            }
        }
        if (i <= 0) {
            return null;
        }
        method30382(str + " colors: " + i);
        final int[] array = new int[list.size()];
        for (int j = 0; j < array.length; ++j) {
            array[j] = (int)list.get(j);
        }
        return array;
    }
    
    private static int method30365(final Class3831 class3831, final ItemStack class3832, final int n, final int n2) {
        if (Class8763.field36828 == null && Class8763.field36829 == null) {
            return n2;
        }
        final EntityType<?> method11773 = class3831.method11773(class3832.method27657());
        if (method11773 == null) {
            return n2;
        }
        final int method11774 = Registry.field210.getId(method11773);
        if (method11774 < 0) {
            return n2;
        }
        final int[] array = (n != 0) ? Class8763.field36829 : Class8763.field36828;
        if (array == null) {
            return n2;
        }
        if (method11774 >= 0 && method11774 < array.length) {
            final int n3 = array[method11774];
            return (n3 >= 0) ? n3 : n2;
        }
        return n2;
    }
    
    public static int method30366(final ItemStack class8321, final int n, final int n2) {
        if (class8321 == null) {
            return n2;
        }
        final Item method27622 = class8321.getItem();
        if (method27622 != null) {
            return (method27622 instanceof Class3831) ? method30365((Class3831)method27622, class8321, n, n2) : n2;
        }
        return n2;
    }
    
    private static float[][] method30367(final Properties properties, final String s, final String prefix, final String str) {
        final Class181[] values = Class181.values();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < values.length; ++i) {
            final Class181 class181 = values[i];
            hashMap.put(class181.getName(), class181);
        }
        hashMap.put("lightBlue", Class181.field540);
        hashMap.put("silver", Class181.field545);
        final float[][] array = new float[values.length][];
        int j = 0;
        for (final String s2 : properties.keySet()) {
            final String property = properties.getProperty(s2);
            if (!s2.startsWith(prefix)) {
                continue;
            }
            final Class181 class182 = (Class181)hashMap.get(Class9518.method35517(s2, prefix));
            final int method30331 = method30331(property);
            if (class182 != null && method30331 >= 0) {
                array[class182.ordinal()] = new float[] { (method30331 >> 16 & 0xFF) / 255.0f, (method30331 >> 8 & 0xFF) / 255.0f, (method30331 & 0xFF) / 255.0f };
                ++j;
            }
            else {
                method30383("Invalid color: " + s2 + " = " + property);
            }
        }
        if (j > 0) {
            method30382(str + " colors: " + j);
            return array;
        }
        return null;
    }
    
    private static float[] method30368(final Class181 class181, final float[][] array, final float[] array2) {
        if (array == null) {
            return array2;
        }
        if (class181 != null) {
            final float[] array3 = array[class181.ordinal()];
            return (array3 != null) ? array3 : array2;
        }
        return array2;
    }
    
    public static float[] method30369(final Class181 class181, final float[] array) {
        return method30368(class181, Class8763.field36830, array);
    }
    
    public static float[] method30370(final Class181 class181, final float[] array) {
        return method30368(class181, Class8763.field36831, array);
    }
    
    private static int[] method30371(final Properties properties, final String s, final String prefix, final String str) {
        final int[] a = new int[32];
        Arrays.fill(a, -1);
        int i = 0;
        for (final String s2 : properties.keySet()) {
            final String property = properties.getProperty(s2);
            if (!s2.startsWith(prefix)) {
                continue;
            }
            final int method28933 = Config.method28933(Class9518.method35517(s2, prefix), -1);
            final int method28934 = method30331(property);
            if (method28933 >= 0) {
                if (method28933 < a.length) {
                    if (method28934 >= 0) {
                        a[method28933] = method28934;
                        ++i;
                        continue;
                    }
                }
            }
            method30383("Invalid color: " + s2 + " = " + property);
        }
        if (i > 0) {
            method30382(str + " colors: " + i);
            return a;
        }
        return null;
    }
    
    public static int method30372(final int n, final int n2) {
        if (Class8763.field36832 == null) {
            return n2;
        }
        if (n >= 0 && n < Class8763.field36832.length) {
            final int n3 = Class8763.field36832[n];
            return (n3 >= 0) ? n3 : n2;
        }
        return n2;
    }
    
    private static int[] method30373(final Properties properties, final String s, final String prefix, final String str) {
        final int[] a = new int[MaterialColor.COLORS.length];
        Arrays.fill(a, -1);
        int i = 0;
        for (final String s2 : properties.keySet()) {
            final String property = properties.getProperty(s2);
            if (!s2.startsWith(prefix)) {
                continue;
            }
            final int method30379 = method30379(Class9518.method35517(s2, prefix));
            final int method30380 = method30331(property);
            if (method30379 >= 0) {
                if (method30379 < a.length) {
                    if (method30380 >= 0) {
                        a[method30379] = method30380;
                        ++i;
                        continue;
                    }
                }
            }
            method30383("Invalid color: " + s2 + " = " + property);
        }
        if (i > 0) {
            method30382(str + " colors: " + i);
            return a;
        }
        return null;
    }
    
    private static int[] method30374(final Properties properties, final String s, final String prefix, final String str) {
        final int[] a = new int[method30375()];
        Arrays.fill(a, -1);
        int i = 0;
        for (final String s2 : properties.keySet()) {
            final String property = properties.getProperty(s2);
            if (!s2.startsWith(prefix)) {
                continue;
            }
            final int method30376 = method30376(s2);
            final int method30377 = method30331(property);
            if (method30376 >= 0) {
                if (method30376 < a.length) {
                    if (method30377 >= 0) {
                        a[method30376] = method30377;
                        ++i;
                        continue;
                    }
                }
            }
            method30383("Invalid color: " + s2 + " = " + property);
        }
        if (i > 0) {
            method30382(str + " colors: " + i);
            return a;
        }
        return null;
    }
    
    private static int method30375() {
        int n = 0;
        final Iterator<ResourceLocation> iterator = Registry.field207.method507().iterator();
        while (iterator.hasNext()) {
            final int method16451 = Class5328.method16451(Class7711.method24615(iterator.next()));
            if (method16451 <= n) {
                continue;
            }
            n = method16451;
        }
        return n;
    }
    
    private static int method30376(String method35520) {
        if (!method35520.equals("potion.water")) {
            method35520 = Class9518.method35520(method35520, "potion.", "effect.");
            final Iterator<ResourceLocation> iterator = Registry.field207.method507().iterator();
            while (iterator.hasNext()) {
                final Class5328 method35521 = Class7711.method24615(iterator.next());
                if (!method35521.method16455().equals(method35520)) {
                    continue;
                }
                return Class5328.method16451(method35521);
            }
            return -1;
        }
        return 0;
    }
    
    public static int method30377(final Class5328 class5328, final int n) {
        int method16451 = 0;
        if (class5328 != null) {
            method16451 = Class5328.method16451(class5328);
        }
        return method30378(method16451, n);
    }
    
    public static int method30378(final int n, final int n2) {
        if (Class8763.field36834 == null) {
            return n2;
        }
        if (n >= 0 && n < Class8763.field36834.length) {
            final int n3 = Class8763.field36834[n];
            return (n3 >= 0) ? n3 : n2;
        }
        return n2;
    }
    
    private static int method30379(final String s) {
        if (s == null) {
            return -1;
        }
        if (s.equals("air")) {
            return MaterialColor.AIR.colorIndex;
        }
        if (s.equals("grass")) {
            return MaterialColor.GRASS.colorIndex;
        }
        if (s.equals("sand")) {
            return MaterialColor.SAND.colorIndex;
        }
        if (s.equals("cloth")) {
            return MaterialColor.WOOL.colorIndex;
        }
        if (s.equals("tnt")) {
            return MaterialColor.TNT.colorIndex;
        }
        if (s.equals("ice")) {
            return MaterialColor.ICE.colorIndex;
        }
        if (s.equals("iron")) {
            return MaterialColor.IRON.colorIndex;
        }
        if (s.equals("foliage")) {
            return MaterialColor.FOLIAGE.colorIndex;
        }
        if (s.equals("clay")) {
            return MaterialColor.CLAY.colorIndex;
        }
        if (s.equals("dirt")) {
            return MaterialColor.DIRT.colorIndex;
        }
        if (s.equals("stone")) {
            return MaterialColor.STONE.colorIndex;
        }
        if (s.equals("water")) {
            return MaterialColor.WATER.colorIndex;
        }
        if (s.equals("wood")) {
            return MaterialColor.WOOD.colorIndex;
        }
        if (s.equals("quartz")) {
            return MaterialColor.QUARTZ.colorIndex;
        }
        if (s.equals("gold")) {
            return MaterialColor.GOLD.colorIndex;
        }
        if (s.equals("diamond")) {
            return MaterialColor.DIAMOND.colorIndex;
        }
        if (s.equals("lapis")) {
            return MaterialColor.LAPIS.colorIndex;
        }
        if (s.equals("emerald")) {
            return MaterialColor.EMERALD.colorIndex;
        }
        if (s.equals("podzol")) {
            return MaterialColor.OBSIDIAN.colorIndex;
        }
        if (s.equals("netherrack")) {
            return MaterialColor.NETHERRACK.colorIndex;
        }
        if (s.equals("snow") || s.equals("white")) {
            return MaterialColor.SNOW.colorIndex;
        }
        if (s.equals("adobe") || s.equals("orange")) {
            return MaterialColor.ADOBE.colorIndex;
        }
        if (s.equals("magenta")) {
            return MaterialColor.MAGENTA.colorIndex;
        }
        if (s.equals("light_blue") || s.equals("lightBlue")) {
            return MaterialColor.LIGHT_BLUE.colorIndex;
        }
        if (s.equals("yellow")) {
            return MaterialColor.YELLOW.colorIndex;
        }
        if (s.equals("lime")) {
            return MaterialColor.LIME.colorIndex;
        }
        if (s.equals("pink")) {
            return MaterialColor.PINK.colorIndex;
        }
        if (s.equals("gray")) {
            return MaterialColor.GRAY.colorIndex;
        }
        if (s.equals("silver")) {
            return MaterialColor.LIGHT_GRAY.colorIndex;
        }
        if (s.equals("cyan")) {
            return MaterialColor.CYAN.colorIndex;
        }
        if (s.equals("purple")) {
            return MaterialColor.PURPLE.colorIndex;
        }
        if (s.equals("blue")) {
            return MaterialColor.BLUE.colorIndex;
        }
        if (s.equals("brown")) {
            return MaterialColor.BROWN.colorIndex;
        }
        if (s.equals("green")) {
            return MaterialColor.GREEN.colorIndex;
        }
        if (!s.equals("red")) {
            return s.equals("black") ? MaterialColor.BLACK.colorIndex : -1;
        }
        return MaterialColor.RED.colorIndex;
    }
    
    private static int[] method30380() {
        final MaterialColor[] field37031 = MaterialColor.COLORS;
        final int[] a = new int[field37031.length];
        Arrays.fill(a, -1);
        for (int n = 0; n < field37031.length && n < a.length; ++n) {
            final MaterialColor MaterialColor = field37031[n];
            if (MaterialColor != null) {
                a[n] = MaterialColor.colorValue;
            }
        }
        return a;
    }
    
    private static void method30381(final int[] array) {
        if (array != null) {
            final MaterialColor[] field37031 = MaterialColor.COLORS;
            int n = 0;
            for (int n2 = 0; n2 < field37031.length && n2 < array.length; ++n2) {
                final MaterialColor MaterialColor = field37031[n2];
                if (MaterialColor != null) {
                    final int field37032 = array[n2];
                    if (field37032 >= 0) {
                        if (MaterialColor.colorValue != field37032) {
                            MaterialColor.colorValue = field37032;
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                Minecraft.getInstance().method5290().method5859();
            }
        }
    }
    
    private static void method30382(final String str) {
        Config.method28847("CustomColors: " + str);
    }
    
    private static void method30383(final String str) {
        Config.warn("CustomColors: " + str);
    }
    
    public static int method30384(final int n) {
        return (Class8763.field36822 >= 0) ? Class8763.field36822 : n;
    }
    
    public static int method30385(final int n) {
        return (Class8763.field36823 >= 0) ? Class8763.field36823 : n;
    }
    
    public static int method30386(final int n) {
        if (n == 0) {
            return (Class8763.field36824 >= 0) ? Class8763.field36824 : n;
        }
        return n;
    }
    
    static {
        Class8763.field36792 = Class8763.\u92f9\u708b\u3ff0\ub0ad\u7a60\u156e[0];
        Class8763.field36793 = null;
        Class8763.field36794 = null;
        Class8763.field36795 = null;
        Class8763.field36796 = null;
        Class8763.field36797 = null;
        Class8763.field36798 = null;
        Class8763.field36799 = null;
        Class8763.field36800 = null;
        Class8763.field36801 = new Class9292();
        Class8763.field36802 = null;
        Class8763.field36803 = new Class9292();
        Class8763.field36804 = null;
        Class8763.field36805 = new Class9292();
        Class8763.field36806 = null;
        Class8763.field36807 = new Class9292();
        Class8763.field36808 = null;
        Class8763.field36809 = 0;
        Class8763.field36810 = null;
        Class8763.field36811 = null;
        Class8763.field36812 = -1;
        Class8763.field36813 = null;
        Class8763.field36814 = null;
        Class8763.field36815 = null;
        Class8763.field36816 = null;
        Class8763.field36817 = null;
        Class8763.field36818 = true;
        Class8763.field36819 = -1;
        Class8763.field36820 = -1;
        Class8763.field36821 = -1;
        Class8763.field36822 = -1;
        Class8763.field36823 = -1;
        Class8763.field36824 = -1;
        Class8763.field36825 = null;
        Class8763.field36826 = null;
        Class8763.field36827 = null;
        Class8763.field36828 = null;
        Class8763.field36829 = null;
        Class8763.field36830 = null;
        Class8763.field36831 = null;
        Class8763.field36832 = null;
        Class8763.field36833 = null;
        Class8763.field36834 = null;
        field36835 = Blocks.DIRT.getDefaultState();
        field36836 = Blocks.field29173.getDefaultState();
        Class8763.field36837 = new Random();
        field36838 = new Class7716();
        field36839 = new Class7715();
        field36840 = new Class7713();
        field36841 = new Class7717();
        field36842 = new Class7714();
    }
}

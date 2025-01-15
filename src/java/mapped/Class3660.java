// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.LinkedHashSet;
import com.google.gson.JsonElement;
import java.util.Map;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Collection;
import com.google.gson.JsonParser;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class Class3660
{
    private static Class9386[][] field16942;
    private static boolean field16943;
    private static Class27 field16944;
    private static boolean field16945;
    
    public static int method11269(final Class7096 class7096) {
        final Class9386 method11272 = method11272(class7096.method21691(), class7096.method21692());
        return (method11272 == null) ? -1 : method11272.method34891();
    }
    
    public static boolean method11270() {
        return Class3660.field16943;
    }
    
    public static int method11271(final Class7096 class7096) {
        if (Class3660.field16943) {
            final Class9386 method11272 = method11272(class7096.method21691(), class7096.method21692());
            return (method11272 == null) ? 0 : method11272.method34892();
        }
        return 0;
    }
    
    public static Class9386 method11272(final int n, final int n2) {
        if (Class3660.field16942 == null) {
            return null;
        }
        if (n < 0 || n >= Class3660.field16942.length) {
            return null;
        }
        final Class9386[] array = Class3660.field16942[n];
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class9386 class9386 = array[i];
                if (class9386.method34894(n, n2)) {
                    return class9386;
                }
            }
            return null;
        }
        return null;
    }
    
    public static Class9386[] method11273(final int n) {
        if (Class3660.field16942 == null) {
            return null;
        }
        if (n >= 0 && n < Class3660.field16942.length) {
            return Class3660.field16942[n];
        }
        return null;
    }
    
    public static void method11274() {
        if (Class3660.field16945) {
            Class3660.field16945 = false;
            method11275(Class9216.method33710());
        }
    }
    
    public static void method11275(final Class7038 class7038) {
        method11286();
        if (class7038 != null) {
            if (!(class7038 instanceof Class7041)) {
                if (Class9570.field41383.method22605() && Class869.method5277().method5291() == null) {
                    Class8571.method28847("[Shaders] Delayed loading of block mappings after resources are loaded");
                    Class3660.field16945 = true;
                }
                else {
                    List<List<Class9386>> method11280 = new ArrayList<List<Class9386>>();
                    final String s = "/shaders/block.properties";
                    final InputStream method11281 = class7038.method21531(s);
                    if (method11281 != null) {
                        method11277(method11281, s, method11280);
                    }
                    method11276(method11280);
                    if (method11280.size() <= 0) {
                        method11280 = method11280();
                        Class3660.field16943 = true;
                    }
                    Class3660.field16942 = method11279(method11280);
                }
            }
        }
    }
    
    private static void method11276(final List<List<Class9386>> list) {
        final String[] method24308 = Class7667.method24308();
        for (int i = 0; i < method24308.length; ++i) {
            final String s = method24308[i];
            try {
                final Class1932 class1932 = new Class1932(s, "shaders/block.properties");
                method11277(Class8571.method28897(class1932), class1932.toString(), list);
            }
            catch (final IOException ex) {}
        }
    }
    
    private static void method11277(InputStream method26733, final String s, final List<List<Class9386>> list) {
        if (method26733 != null) {
            try {
                method26733 = Class8121.method26733(method26733, s);
                final Class27 class27 = new Class27();
                class27.load(method26733);
                method26733.close();
                Class8571.method28847("[Shaders] Parsing block mappings: " + s);
                final Class8652 class28 = new Class8652("Shaders");
                for (final String s2 : class27.keySet()) {
                    final String property = class27.getProperty(s2);
                    if (s2.startsWith("layer.")) {
                        if (Class3660.field16944 == null) {
                            Class3660.field16944 = new Class27();
                        }
                        Class3660.field16944.put(s2, property);
                    }
                    else {
                        final String prefix = "block.";
                        if (!s2.startsWith(prefix)) {
                            Class8571.method28848("[Shaders] Invalid block ID: " + s2);
                        }
                        else {
                            final int method26734 = Class8571.method28933(Class9518.method35517(s2, prefix), -1);
                            if (method26734 < 0) {
                                Class8571.method28848("[Shaders] Invalid block ID: " + s2);
                            }
                            else {
                                final Class8802[] method26735 = class28.method29442(property);
                                if (method26735 != null && method26735.length >= 1) {
                                    method11278(list, new Class9386(method26734, method26735));
                                }
                                else {
                                    Class8571.method28848("[Shaders] Invalid block ID mapping: " + s2 + "=" + property);
                                }
                            }
                        }
                    }
                }
            }
            catch (final IOException ex) {
                Class8571.method28848("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static void method11278(final List<List<Class9386>> list, final Class9386 class9386) {
        final int[] method34895 = class9386.method34895();
        for (int i = 0; i < method34895.length; ++i) {
            final int j = method34895[i];
            while (j >= list.size()) {
                list.add(null);
            }
            List<Class9386> list2 = list.get(j);
            if (list2 == null) {
                list2 = new ArrayList<Class9386>();
                list.set(j, list2);
            }
            list2.add(new Class9386(class9386.method34891(), class9386.method34896(j)));
        }
    }
    
    private static Class9386[][] method11279(final List<List<Class9386>> list) {
        final Class9386[][] array = new Class9386[list.size()][];
        for (int i = 0; i < array.length; ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (Class9386[])list2.toArray(new Class9386[list2.size()]);
            }
        }
        return array;
    }
    
    private static List<List<Class9386>> method11280() {
        try {
            final String s = "flattening_ids.txt";
            Class8571.method28847("Using legacy block aliases: " + s);
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            int i = 0;
            final InputStream method28821 = Class8571.method28821("/" + s);
            if (method28821 == null) {
                return list;
            }
            final String[] method28822 = Class8571.method28957(method28821);
            for (int j = 0; j < method28822.length; ++j) {
                final int n = j + 1;
                final String str = method28822[j];
                if (str.trim().length() > 0) {
                    list2.add(str);
                    if (!str.startsWith("#")) {
                        if (str.startsWith("alias")) {
                            final String[] method28823 = Class8571.method28937(str, " ");
                            final String str2 = method28823[1];
                            final String string = "{Name:'" + method28823[2] + "'";
                            final List list3 = (List)list2.stream().filter(s2 -> s2.startsWith(prefix)).collect(Collectors.toList());
                            if (list3.size() <= 0) {
                                Class8571.method28848("Block not processed: " + str);
                            }
                            else {
                                final Iterator iterator = list3.iterator();
                                while (iterator.hasNext()) {
                                    final String replace = ((String)iterator.next()).replace(string, "{Name:'" + str2 + "'");
                                    list2.add(replace);
                                    method11281(replace, n, list);
                                    ++i;
                                }
                            }
                        }
                        else {
                            method11281(str, n, list);
                            ++i;
                        }
                    }
                }
            }
            Class8571.method28847("Legacy block aliases: " + i);
            return list;
        }
        catch (final IOException ex) {
            Class8571.method28848("Error loading legacy block aliases: " + ex.getClass().getName() + ": " + ex.getMessage());
            return new ArrayList<List<Class9386>>();
        }
    }
    
    private static void method11281(final String s, final int n, final List<List<Class9386>> list) {
        final String[] method28937 = Class8571.method28937(s, " ");
        if (method28937.length != 4) {
            Class8571.method28848("Invalid flattening line: " + s);
        }
        else {
            final String s2 = method28937[0];
            final String s3 = method28937[1];
            final int method28938 = Class8571.method28933(method28937[2], Integer.MIN_VALUE);
            final int method28939 = Class8571.method28933(method28937[3], Integer.MIN_VALUE);
            if (method28938 >= 0 && method28939 >= 0) {
                try {
                    final JsonObject asJsonObject = new JsonParser().parse(s2).getAsJsonObject();
                    final String asString = asJsonObject.get("Name").getAsString();
                    final Class3833 method28940 = Class6770.method20650(new Class1932(asString));
                    if (method28940 == null) {
                        Class8571.method28848("Invalid block name (" + n + "): " + asString);
                        return;
                    }
                    final Class7096 method28941 = method28940.method11878();
                    final Collection<Class7111<?>> collection = method28941.method21770();
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final JsonObject jsonObject = (JsonObject)asJsonObject.get("Properties");
                    if (jsonObject != null) {
                        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
                            final String str = entry.getKey();
                            final String asString2 = ((JsonElement)entry.getValue()).getAsString();
                            final Class7111 method28942 = Class6779.method20704(str, (Collection<Class7111>)collection);
                            if (method28942 == null) {
                                Class8571.method28848("Invalid property (" + n + "): " + str);
                            }
                            else {
                                final Comparable method28943 = Class8652.method29449(method28942, asString2);
                                if (method28943 == null) {
                                    Class8571.method28848("Invalid property value (" + n + "): " + asString2);
                                }
                                else {
                                    linkedHashMap.put(method28942, method28943);
                                }
                            }
                        }
                    }
                    final int method28944 = method28941.method21691();
                    while (list.size() <= method28944) {
                        list.add(null);
                    }
                    List<Class9386> list2 = list.get(method28944);
                    if (list2 == null) {
                        list2 = new ArrayList<Class9386>(Class6770.method20652(method28940));
                        list.set(method28944, list2);
                    }
                    method11282(list2, method28938, method28939, method11283(method28941.method21696(), method28941.method21691(), linkedHashMap));
                }
                catch (final Exception ex) {
                    Class8571.method28848("Error parsing: " + s);
                }
            }
            else {
                Class8571.method28848("Invalid blockID or metadata (" + n + "): " + method28938 + ":" + method28939);
            }
        }
    }
    
    private static void method11282(final List<Class9386> list, final int n, final int n2, final Class8802 class8802) {
        for (final Class9386 class8803 : list) {
            if (class8803.method34891() != n) {
                continue;
            }
            if (class8803.method34892() != n2) {
                continue;
            }
            final Class8802[] method34893 = class8803.method34893();
            for (int i = 0; i < method34893.length; ++i) {
                final Class8802 class8804 = method34893[i];
                if (class8804.method30709() == class8802.method30709()) {
                    class8804.method30714(class8802.method30710());
                    return;
                }
            }
        }
        list.add(new Class9386(n, n2, new Class8802[] { class8802 }));
    }
    
    private static Class8802 method11283(final Class3833 class3833, final int n, final Map<Class7111, Comparable> map) {
        final ArrayList list = new ArrayList();
        final Set<Class7111> keySet = map.keySet();
        for (final Class7096 class3834 : Class6770.method20654(class3833)) {
            int n2 = 1;
            for (final Class7111 class3835 : keySet) {
                if (!((Class7097<Object, Object>)class3834).method21771((Class7111<Comparable>)class3835)) {
                    n2 = 0;
                    break;
                }
                if (map.get(class3835).equals(((Class7097<Object, Object>)class3834).method21772((Class7111<Comparable>)class3835))) {
                    continue;
                }
                n2 = 0;
                break;
            }
            if (n2 == 0) {
                continue;
            }
            list.add(class3834);
        }
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            set.add(((Class7096)iterator3.next()).method21692());
        }
        return new Class8802(n, Class8571.method29008((Integer[])set.toArray(new Integer[set.size()])));
    }
    
    private static void method11284() {
        final Iterator<Class1932> iterator = Class90.field208.method507().iterator();
        while (iterator.hasNext()) {
            final Class3833 obj = Class90.field208.method505(iterator.next());
            final int method21691 = obj.method11878().method21691();
            if (method11273(method21691) != null) {
                for (final Class7096 obj2 : Class6770.method20654(obj)) {
                    if (method11272(method21691, obj2.method21692()) != null) {
                        continue;
                    }
                    Class8571.method28848("State has no alias: " + obj2);
                }
            }
            else {
                Class8571.method28848("Block has no alias: " + obj);
            }
        }
    }
    
    public static Class27 method11285() {
        return Class3660.field16944;
    }
    
    public static void method11286() {
        Class3660.field16942 = null;
        Class3660.field16943 = false;
        Class3660.field16944 = null;
    }
    
    public static int method11287(final Class7096 class7096) {
        if (!Class3660.field16943) {
            return class7096.method21710().ordinal();
        }
        if (!(class7096.method21696() instanceof Class3859)) {
            final Class2115 method21710 = class7096.method21710();
            return (method21710 != Class2115.field12306 && method21710 != Class2115.field12307) ? method21710.ordinal() : (method21710.ordinal() + 1);
        }
        return 1;
    }
    
    static {
        Class3660.field16942 = null;
        Class3660.field16943 = false;
        Class3660.field16944 = null;
    }
}

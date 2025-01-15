// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;

import java.util.HashMap;
import com.google.gson.JsonElement;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.common.annotations.VisibleForTesting;
import java.util.HashSet;
import com.google.gson.JsonSyntaxException;
import com.google.common.collect.Sets;
import java.util.Map;

public class Class3664 implements Class3663
{
    private final int field16946;
    private final int field16947;
    private final Class2265<Class120> field16948;
    private final ItemStack field16949;
    private final Class1932 field16950;
    private final String field16951;
    
    public Class3664(final Class1932 field16950, final String field16951, final int field16952, final int field16953, final Class2265<Class120> field16954, final ItemStack field16955) {
        this.field16950 = field16950;
        this.field16951 = field16951;
        this.field16946 = field16952;
        this.field16947 = field16953;
        this.field16948 = field16954;
        this.field16949 = field16955;
    }
    
    @Override
    public Class1932 method11298() {
        return this.field16950;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24733;
    }
    
    @Override
    public String method11296() {
        return this.field16951;
    }
    
    @Override
    public ItemStack method11292() {
        return this.field16949;
    }
    
    @Override
    public Class2265<Class120> method11294() {
        return this.field16948;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= this.field16946 && n2 >= this.field16947;
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        for (int i = 0; i <= class473.method2418() - this.field16946; ++i) {
            for (int j = 0; j <= class473.method2417() - this.field16947; ++j) {
                if (this.method11302(class473, i, j, true)) {
                    return true;
                }
                if (this.method11302(class473, i, j, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method11302(final Class473 class473, final int n, final int n2, final boolean b) {
        for (int i = 0; i < class473.method2418(); ++i) {
            for (int j = 0; j < class473.method2417(); ++j) {
                final int n3 = i - n;
                final int n4 = j - n2;
                Class120 field374 = Class120.field374;
                if (n3 >= 0) {
                    if (n4 >= 0) {
                        if (n3 < this.field16946) {
                            if (n4 < this.field16947) {
                                if (!b) {
                                    field374 = this.field16948.get(n3 + n4 * this.field16946);
                                }
                                else {
                                    field374 = this.field16948.get(this.field16946 - n3 - 1 + n4 * this.field16946);
                                }
                            }
                        }
                    }
                }
                if (!field374.test(class473.method2157(i + j * class473.method2418()))) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public ItemStack method11303(final Class473 class473) {
        return this.method11292().method27641();
    }
    
    public int method11304() {
        return this.field16946;
    }
    
    public int method11305() {
        return this.field16947;
    }
    
    private static Class2265<Class120> method11306(final String[] array, final Map<String, Class120> map, final int n, final int n2) {
        final Class2265<Class120> method8507 = Class2265.method8507(n * n2, Class120.field374);
        final HashSet hashSet = Sets.newHashSet((Iterable)map.keySet());
        hashSet.remove(" ");
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length(); ++j) {
                final String substring = array[i].substring(j, j + 1);
                final Class120 class120 = map.get(substring);
                if (class120 == null) {
                    throw new JsonSyntaxException("Pattern references symbol '" + substring + "' but it's not defined in the key");
                }
                hashSet.remove(substring);
                method8507.set(j + n * i, class120);
            }
        }
        if (hashSet.isEmpty()) {
            return method8507;
        }
        throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + hashSet);
    }
    
    @VisibleForTesting
    public static String[] method11307(final String... array) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            min = Math.min(min, method11308(s));
            final int method11309 = method11309(s);
            max = Math.max(max, method11309);
            if (method11309 >= 0) {
                n2 = 0;
            }
            else {
                if (n == i) {
                    ++n;
                }
                ++n2;
            }
        }
        if (array.length != n2) {
            final String[] array2 = new String[array.length - n2 - n];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = array[j + n].substring(min, max + 1);
            }
            return array2;
        }
        return new String[0];
    }
    
    private static int method11308(final String s) {
        int index;
        for (index = 0; index < s.length() && s.charAt(index) == ' '; ++index) {}
        return index;
    }
    
    private static int method11309(final String s) {
        int index;
        for (index = s.length() - 1; index >= 0 && s.charAt(index) == ' '; --index) {}
        return index;
    }
    
    private static String[] method11310(final JsonArray jsonArray) {
        final String[] array = new String[jsonArray.size()];
        if (array.length > 3) {
            throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
        }
        if (array.length != 0) {
            for (int i = 0; i < array.length; ++i) {
                final String method35894 = Class9583.method35894(jsonArray.get(i), "pattern[" + i + "]");
                if (method35894.length() > 3) {
                    throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
                }
                if (i > 0 && array[0].length() != method35894.length()) {
                    throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
                }
                array[i] = method35894;
            }
            return array;
        }
        throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
    }
    
    private static Map<String, Class120> method11311(final JsonObject jsonObject) {
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
            if (entry.getKey().length() != 1) {
                throw new JsonSyntaxException("Invalid key entry: '" + entry.getKey() + "' is an invalid symbol (must be 1 character only).");
            }
            if (" ".equals(entry.getKey())) {
                throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
            }
            hashMap.put(entry.getKey(), Class120.method622((JsonElement)entry.getValue()));
        }
        hashMap.put(" ", Class120.field374);
        return hashMap;
    }
    
    public static ItemStack method11312(final JsonObject jsonObject) {
        final Class3820 class3820 = Class90.field211.method506(new Class1932(Class9583.method35895(jsonObject, "item"))).orElseThrow(() -> {
            new JsonSyntaxException("Unknown item '" + str + "'");
            return;
        });
        if (!jsonObject.has("data")) {
            return new ItemStack(class3820, Class9583.method35910(jsonObject, "count", 1));
        }
        throw new JsonParseException("Disallowed data tag found");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import com.google.common.collect.Maps;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Class350 implements Comparable<Class350>
{
    private static final Map<String, Class350> field2154;
    private static final Map<Class7985, Class350> field2155;
    private static final Set<String> field2156;
    private static final Map<String, Integer> field2157;
    private final String field2158;
    private final Class7985 field2159;
    private final String field2160;
    public Class7985 field2161;
    public boolean field2162;
    private int field2163;
    
    public static void method1051(final Class7985 class7985) {
        final Class350 class7986 = Class350.field2155.get(class7985);
        if (class7986 != null) {
            final Class350 class7987 = class7986;
            ++class7987.field2163;
        }
    }
    
    public static void method1052(final Class7985 class7985, final boolean b) {
        final Class350 class7986 = Class350.field2155.get(class7985);
        if (class7986 != null) {
            class7986.method1071(b);
        }
    }
    
    public static void method1053() {
        for (final Class350 class350 : Class350.field2154.values()) {
            if (class350.field2161.method26046() != Class2136.field12467) {
                continue;
            }
            if (class350.field2161.method26047() == Class8341.field34248.method26047()) {
                continue;
            }
            class350.method1071(Class8341.method27798(Minecraft.getInstance().method5332().getHandle(), class350.field2161.method26047()));
        }
    }
    
    public static void method1054() {
        final Iterator<Class350> iterator = Class350.field2154.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method1059();
        }
    }
    
    public static void method1055() {
        Class350.field2155.clear();
        for (final Class350 class350 : Class350.field2154.values()) {
            Class350.field2155.put(class350.field2161, class350);
        }
    }
    
    public Class350(final String s, final int n, final String s2) {
        this(s, Class2136.field12467, n, s2);
    }
    
    public Class350(final String field2158, final Class2136 class2136, final int n, final String field2159) {
        this.field2158 = field2158;
        this.field2161 = class2136.method8289(n);
        this.field2159 = this.field2161;
        this.field2160 = field2159;
        Class350.field2154.put(field2158, this);
        Class350.field2155.put(this.field2161, this);
        Class350.field2156.add(field2159);
    }
    
    public boolean method1056() {
        return this.field2162;
    }
    
    public String method1057() {
        return this.field2160;
    }
    
    public boolean method1058() {
        if (this.field2163 != 0) {
            --this.field2163;
            return true;
        }
        return false;
    }
    
    private void method1059() {
        this.field2163 = 0;
        this.method1071(false);
    }
    
    public String method1060() {
        return this.field2158;
    }
    
    public Class7985 method1061() {
        return this.field2159;
    }
    
    public void method1062(final Class7985 field2161) {
        this.field2161 = field2161;
    }
    
    @Override
    public int compareTo(final Class350 class350) {
        return this.field2160.equals(class350.field2160) ? Class8822.method30773(this.field2158, new Object[0]).compareTo(Class8822.method30773(class350.field2158, new Object[0])) : Class350.field2157.get(this.field2160).compareTo(Class350.field2157.get(class350.field2160));
    }
    
    public static Supplier<String> method1063(final String s) {
        final Class350 class350 = Class350.field2154.get(s);
        return (class350 != null) ? class350::method1068 : (() -> s2);
    }
    
    public boolean method1064(final Class350 class350) {
        return this.field2161.equals(class350.field2161);
    }
    
    public boolean method1065() {
        return this.field2161.equals(Class8341.field34248);
    }
    
    public boolean method1066(final int n, final int n2) {
        if (n != Class8341.field34248.method26047()) {
            return this.field2161.method26046() == Class2136.field12467 && this.field2161.method26047() == n;
        }
        return this.field2161.method26046() == Class2136.field12468 && this.field2161.method26047() == n2;
    }
    
    public boolean method1067(final int n) {
        return this.field2161.method26046() == Class2136.field12469 && this.field2161.method26047() == n;
    }
    
    public String method1068() {
        final String method26048 = this.field2161.method26048();
        final int method26049 = this.field2161.method26047();
        String s = null;
        switch (Class4105.field18206[this.field2161.method26046().ordinal()]) {
            case 1: {
                s = Class8341.method27804(method26049);
                break;
            }
            case 2: {
                s = Class8341.method27805(method26049);
                break;
            }
            case 3: {
                final String method26050 = Class8822.method30773(method26048, new Object[0]);
                s = (Objects.equals(method26050, method26048) ? Class8822.method30773(Class2136.field12469.method8290(), method26049 + 1) : method26050);
                break;
            }
        }
        return (s == null) ? Class8822.method30773(method26048, new Object[0]) : s;
    }
    
    public boolean method1069() {
        return this.field2161.equals(this.field2159);
    }
    
    public String method1070() {
        return this.field2161.method26048();
    }
    
    public void method1071(final boolean field2162) {
        this.field2162 = field2162;
    }
    
    static {
        field2154 = Maps.newHashMap();
        field2155 = Maps.newHashMap();
        field2156 = Sets.newHashSet();
        field2157 = Util.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put("key.categories.movement", 1);
            hashMap.put("key.categories.gameplay", 2);
            hashMap.put("key.categories.inventory", 3);
            hashMap.put("key.categories.creative", 4);
            hashMap.put("key.categories.multiplayer", 5);
            hashMap.put("key.categories.ui", 6);
            hashMap.put("key.categories.misc", 7);
        });
    }
}

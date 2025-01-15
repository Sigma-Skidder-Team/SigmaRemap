// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Comparator;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import java.util.Map;

public class Class6125 implements Class6113
{
    private static String[] field24865;
    private final Class869 field24866;
    private final Map<Long, Map<Class354, Integer>> field24867;
    
    public Class6125(final Class869 field24866) {
        this.field24867 = Maps.newTreeMap((Comparator)Ordering.natural().reverse());
        this.field24866 = field24866;
    }
    
    public void method18346(final long n, final Class354 class354) {
        Map hashMap = this.field24867.get(n);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
            this.field24867.put(n, hashMap);
        }
        Integer value = (Integer)hashMap.get(class354);
        if (value == null) {
            value = 0;
        }
        hashMap.put(class354, value + 1);
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final long method6754 = this.field24866.field4683.method6754();
        final HashSet hashSet = Sets.newHashSet();
        final HashMap hashMap = Maps.newHashMap();
        final Class4150 method6755 = class7352.method25214(Class6332.method18791());
        final Iterator<Map.Entry<Long, Map<Class354, Integer>>> iterator = this.field24867.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<Long, V> entry = (Map.Entry<Long, V>)iterator.next();
            final Long n4 = entry.getKey();
            final Map map = (Map)entry.getValue();
            final long n5 = method6754 - n4;
            if (n5 <= 200L) {
                for (final Map.Entry<Class354, V> entry2 : map.entrySet()) {
                    final Class354 class7353 = entry2.getKey();
                    final Integer n6 = (Integer)entry2.getValue();
                    if (!hashSet.add(class7353)) {
                        continue;
                    }
                    final Class6221 method6756 = new Class6221(Class354.field2173).method18496(0.002).method18511(0.0025 * n5).method18499(class7353.method1074(), class7353.method1075(), class7353.method1076()).method18499(-n, -n2, -n3);
                    Class1656.method5730(method6755, method6756.field25073, method6756.field25074, method6756.field25075, method6756.field25076, method6756.field25077, method6756.field25078, 1.0f, 1.0f, 1.0f, 1.0f);
                    hashMap.put(class7353, n6);
                }
            }
            else {
                iterator.remove();
            }
        }
        for (final Map.Entry<Class354, V> entry3 : hashMap.entrySet()) {
            final Class354 class7354 = entry3.getKey();
            Class7282.method22338(String.valueOf(entry3.getValue()), class7354.method1074(), class7354.method1075(), class7354.method1076(), -1);
        }
    }
}

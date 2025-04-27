// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.common.collect.Sets;
import java.util.concurrent.ConcurrentHashMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;
import java.util.HashMap;
import com.google.common.collect.Range;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Class8626
{
    public static final Class5207 field36205;
    public static int field36206;
    private static final Map<Integer, Map<Integer, Class5207>> field36207;
    private static final Map<Class7803<Integer, Integer>, List<Class7803<Integer, Class5207>>> field36208;
    private static final List<Class5207> field36209;
    private static final Set<Integer> field36210;
    private static final List<Class7803<Range<Integer>, Class5207>> field36211;
    
    public static void method29273(final Class5207 class5207, final List<Integer> list, final Integer n) {
        if (Class8626.field36208.size() > 0) {
            Class8626.field36208.clear();
        }
        for (final Integer n2 : list) {
            if (!Class8626.field36207.containsKey(n2)) {
                Class8626.field36207.put(n2, new HashMap<Integer, Class5207>());
            }
            Class8626.field36207.get(n2).put(n, class5207);
        }
        if (!Class8563.method28793().method34754()) {
            Class8626.field36209.add(class5207);
        }
        else {
            class5207.method16310();
            class5207.method16311(Class8563.method28794().method33549());
            method29275();
        }
    }
    
    public static void method29274(final Class5207 class5207, final Range<Integer> range) {
        Class8626.field36211.add(new Class7803<Range<Integer>, Class5207>(range, class5207));
        if (!Class8563.method28793().method34754()) {
            Class8626.field36209.add(class5207);
        }
        else {
            class5207.method16310();
            class5207.method16311(Class8563.method28794().method33549());
            method29275();
        }
    }
    
    public static void method29275() {
        Class8626.field36210.clear();
        Class8626.field36210.add(Class8626.field36206);
        for (final Class7906 class7906 : Class7906.method25611()) {
            final List<Class7803<Integer, Class5207>> method29280 = method29280(class7906.method25613(), Class8626.field36206);
            if (method29280 != null) {
                Class8626.field36210.add(class7906.method25613());
                final Iterator<Class7803<Integer, Class5207>> iterator2 = method29280.iterator();
                while (iterator2.hasNext()) {
                    Class8626.field36210.add(iterator2.next().method25203());
                }
            }
        }
    }
    
    public static SortedSet<Integer> method29276() {
        return Collections.unmodifiableSortedSet(new TreeSet<Integer>(Class8626.field36210));
    }
    
    public static boolean method29277() {
        final Iterator<Map<Integer, Class5207>> iterator = Class8626.field36207.values().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().containsKey(Class8626.field36206)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public static void method29278() {
        for (final Class5207 class5207 : Class8626.field36209) {
            class5207.method16310();
            class5207.method16311(Class8563.method28794().method33549());
        }
    }
    
    private static List<Class7803<Integer, Class5207>> method29279(final List<Class7803<Integer, Class5207>> c, final int i, final int j) {
        if (i == j) {
            return null;
        }
        if (c.size() > 50) {
            return null;
        }
        final Map map = Class8626.field36207.get(i);
        if (map == null) {
            return null;
        }
        final Class5207 class5207 = (Class5207)map.get(j);
        if (class5207 == null) {
            List list = null;
            for (final Map.Entry<Integer, V> entry : map.entrySet()) {
                if (entry.getKey().equals(j)) {
                    continue;
                }
                final Class7803 class5208 = new Class7803<Integer, Class5207>(entry.getKey(), entry.getValue());
                if (c.contains(class5208)) {
                    continue;
                }
                final ArrayList<Class7803> list2 = new ArrayList<Class7803>(c);
                list2.add(class5208);
                final List<Class7803<Integer, Class5207>> method29279 = method29279((List<Class7803<Integer, Class5207>>)list2, entry.getKey(), j);
                if (method29279 == null) {
                    continue;
                }
                if (list != null && list.size() <= method29279.size()) {
                    continue;
                }
                list = method29279;
            }
            return list;
        }
        c.add(new Class7803(j, class5207));
        return c;
    }
    
    public static List<Class7803<Integer, Class5207>> method29280(final int i, final int j) {
        final Class7803 class7803 = new Class7803(i, j);
        final List list = Class8626.field36208.get(class7803);
        if (list == null) {
            final List<Class7803<Integer, Class5207>> method29279 = method29279(new ArrayList<Class7803<Integer, Class5207>>(), i, j);
            if (method29279 != null) {
                Class8626.field36208.put(class7803, method29279);
            }
            return method29279;
        }
        return list;
    }
    
    public static Class5207 method29281(final int n) {
        for (final Class7803 class7803 : Lists.reverse((List)Class8626.field36211)) {
            if (!((Range)class7803.method25203()).contains(n)) {
                continue;
            }
            return (Class5207)class7803.method25204();
        }
        throw new IllegalStateException("No Base Protocol for " + n);
    }
    
    public static boolean method29282(final Class5207 class5207) {
        final Iterator<Class7803<Range<Integer>, Class5207>> iterator = Class8626.field36211.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method25204() != class5207) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    static {
        field36205 = new Class5218();
        Class8626.field36206 = -1;
        field36207 = new ConcurrentHashMap<Integer, Map<Integer, Class5207>>();
        field36208 = new ConcurrentHashMap<Class7803<Integer, Integer>, List<Class7803<Integer, Class5207>>>();
        field36209 = Lists.newCopyOnWriteArrayList();
        field36210 = Sets.newConcurrentHashSet();
        field36211 = Lists.newCopyOnWriteArrayList();
        method29274(Class8626.field36205, (Range<Integer>)Range.lessThan((Comparable)Integer.MIN_VALUE));
        method29274(new Class5216(), Range.all());
        method29273(new Class5224(), Collections.singletonList(Class7906.field32453.method25613()), Class7906.field32452.method25613());
        method29273(new Class5212(), Arrays.asList(Class7906.field32454.method25613(), Class7906.field32455.method25613()), Class7906.field32453.method25613());
        method29273(new Class5229(), Collections.singletonList(Class7906.field32456.method25613()), Class7906.field32455.method25613());
        method29273(new Class5225(), Collections.singletonList(Class7906.field32453.method25613()), Class7906.field32455.method25613());
        method29273(new Class5230(), Arrays.asList(Class7906.field32454.method25613(), Class7906.field32455.method25613()), Class7906.field32456.method25613());
        method29273(new Class5223(), Collections.singletonList(Class7906.field32457.method25613()), Class7906.field32456.method25613());
        method29273(new Class5226(), Collections.singletonList(Class7906.field32458.method25613()), Class7906.field32457.method25613());
        method29273(new Class5227(), Collections.singletonList(Class7906.field32459.method25613()), Class7906.field32458.method25613());
        method29273(new Class5211(), Collections.singletonList(Class7906.field32460.method25613()), Class7906.field32459.method25613());
        method29273(new Class5231(), Collections.singletonList(Class7906.field32461.method25613()), Class7906.field32460.method25613());
        method29273(new Class5214(), Collections.singletonList(Class7906.field32462.method25613()), Class7906.field32461.method25613());
        method29273(new Class5215(), Collections.singletonList(Class7906.field32463.method25613()), Class7906.field32462.method25613());
        method29273(new Class5220(), Collections.singletonList(Class7906.field32464.method25613()), Class7906.field32463.method25613());
        method29273(new Class5217(), Collections.singletonList(Class7906.field32465.method25613()), Class7906.field32464.method25613());
        method29273(new Class5213(), Collections.singletonList(Class7906.field32466.method25613()), Class7906.field32465.method25613());
        method29273(new Class5206(), Collections.singletonList(Class7906.field32467.method25613()), Class7906.field32466.method25613());
        method29273(new Class5222(), Collections.singletonList(Class7906.field32468.method25613()), Class7906.field32467.method25613());
        method29273(new Class5219(), Collections.singletonList(Class7906.field32469.method25613()), Class7906.field32468.method25613());
        method29273(new Class5210(), Collections.singletonList(Class7906.field32470.method25613()), Class7906.field32469.method25613());
        method29273(new Class5209(), Collections.singletonList(Class7906.field32471.method25613()), Class7906.field32470.method25613());
        method29273(new Class5208(), Collections.singletonList(Class7906.field32472.method25613()), Class7906.field32471.method25613());
        method29273(new Class5228(), Collections.singletonList(Class7906.field32473.method25613()), Class7906.field32472.method25613());
    }
}

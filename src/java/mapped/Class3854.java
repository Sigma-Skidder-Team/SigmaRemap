// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class Class3854 extends Class3833 implements Class3856
{
    private static String[] field17464;
    public static final Class7113 field17465;
    public static final Class7113 field17466;
    public static final Class7113 field17467;
    public static final Class7113 field17468;
    public static final Class7113 field17469;
    public static final Map<Class179, Class7113> field17470;
    public final Class7702[] field17471;
    public final Class7702[] field17472;
    private final Object2IntMap<Class7096> field17473;
    
    public Class3854(final float n, final float n2, final float n3, final float n4, final float n5, final Class9288 class9288) {
        super(class9288);
        this.field17473 = (Object2IntMap<Class7096>)new Object2IntOpenHashMap();
        this.field17471 = this.method11914(n, n2, n5, 0.0f, n5);
        this.field17472 = this.method11914(n, n2, n3, 0.0f, n4);
    }
    
    public Class7702[] method11914(final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = 8.0f - n;
        final float n7 = 8.0f + n;
        final float n8 = 8.0f - n2;
        final float n9 = 8.0f + n2;
        final Class7702 method11778 = Class3833.method11778(n6, 0.0, n6, n7, n3, n7);
        final Class7702 method11779 = Class3833.method11778(n8, n4, 0.0, n9, n5, n9);
        final Class7702 method11780 = Class3833.method11778(n8, n4, n8, n9, n5, 16.0);
        final Class7702 method11781 = Class3833.method11778(0.0, n4, n8, n9, n5, n9);
        final Class7702 method11782 = Class3833.method11778(n8, n4, n8, 16.0, n5, n9);
        final Class7702 method11783 = Class7698.method24492(method11779, method11782);
        final Class7702 method11784 = Class7698.method24492(method11780, method11781);
        final Class7702[] array = { Class7698.method24486(), method11780, method11781, method11784, method11779, Class7698.method24492(method11780, method11779), Class7698.method24492(method11781, method11779), Class7698.method24492(method11784, method11779), method11782, Class7698.method24492(method11780, method11782), Class7698.method24492(method11781, method11782), Class7698.method24492(method11784, method11782), method11783, Class7698.method24492(method11780, method11783), Class7698.method24492(method11781, method11783), Class7698.method24492(method11784, method11783) };
        for (int i = 0; i < 16; ++i) {
            array[i] = Class7698.method24492(method11778, array[i]);
        }
        return array;
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return !class7096.method21772((Class7111<Boolean>)Class3854.field17469);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return this.field17472[this.method11916(class7096)];
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return this.field17471[this.method11916(class7096)];
    }
    
    private static int method11915(final Class179 class179) {
        return 1 << class179.method780();
    }
    
    public int method11916(final Class7096 class7096) {
        return this.field17473.computeIntIfAbsent((Object)class7096, class7097 -> {
            int n = 0;
            if (!(!class7097.method21772((Class7111<Boolean>)Class3854.field17465))) {
                n |= method11915(Class179.field513);
            }
            if (!(!class7097.method21772((Class7111<Boolean>)Class3854.field17466))) {
                n |= method11915(Class179.field516);
            }
            if (!(!class7097.method21772((Class7111<Boolean>)Class3854.field17467))) {
                n |= method11915(Class179.field514);
            }
            if (!(!class7097.method21772((Class7111<Boolean>)Class3854.field17468))) {
                n |= method11915(Class179.field515);
            }
            return n;
        });
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3854.field17469) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        switch (Class8247.field33879[class7097.ordinal()]) {
            case 1: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3854.field17465, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17467))).method21773((Class7111<Comparable>)Class3854.field17466, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17468))).method21773((Class7111<Comparable>)Class3854.field17467, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17465))).method21773((Class7111<Comparable>)Class3854.field17468, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17466));
            }
            case 2: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3854.field17465, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17466))).method21773((Class7111<Comparable>)Class3854.field17466, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17467))).method21773((Class7111<Comparable>)Class3854.field17467, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17468))).method21773((Class7111<Comparable>)Class3854.field17468, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17465));
            }
            case 3: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3854.field17465, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17468))).method21773((Class7111<Comparable>)Class3854.field17466, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17465))).method21773((Class7111<Comparable>)Class3854.field17467, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17466))).method21773((Class7111<Comparable>)Class3854.field17468, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17467));
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        switch (Class8247.field33880[class7097.ordinal()]) {
            case 1: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3854.field17465, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17467))).method21773((Class7111<Comparable>)Class3854.field17467, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17465));
            }
            case 2: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3854.field17466, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17468))).method21773((Class7111<Comparable>)Class3854.field17468, (Comparable)class7096.method21772((Class7111<V>)Class3854.field17466));
            }
            default: {
                return super.method11791(class7096, class7097);
            }
        }
    }
    
    static {
        field17465 = Class3967.field17921;
        field17466 = Class3967.field17922;
        field17467 = Class3967.field17923;
        field17468 = Class3967.field17924;
        field17469 = Class8970.field37747;
        field17470 = Class3967.field17927.entrySet().stream().filter(entry -> entry.getKey().method790().method601()).collect((Collector<? super Object, ?, Map<Class179, Class7113>>)Class8349.method27834());
    }
}

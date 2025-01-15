// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

public class Class3967 extends Class3833
{
    private static String[] field17919;
    private static final Class179[] field17920;
    public static final Class7113 field17921;
    public static final Class7113 field17922;
    public static final Class7113 field17923;
    public static final Class7113 field17924;
    public static final Class7113 field17925;
    public static final Class7113 field17926;
    public static final Map<Class179, Class7113> field17927;
    public final Class7702[] field17928;
    
    public Class3967(final float n, final Class9288 class9288) {
        super(class9288);
        this.field17928 = this.method12103(n);
    }
    
    private Class7702[] method12103(final float n) {
        final float n2 = 0.5f - n;
        final float n3 = 0.5f + n;
        final Class7702 method11778 = Class3833.method11778(n2 * 16.0f, n2 * 16.0f, n2 * 16.0f, n3 * 16.0f, n3 * 16.0f, n3 * 16.0f);
        final Class7702[] array = new Class7702[Class3967.field17920.length];
        for (int i = 0; i < Class3967.field17920.length; ++i) {
            final Class179 class179 = Class3967.field17920[i];
            array[i] = Class7698.method24488(0.5 + Math.min(-n, class179.method785() * 0.5), 0.5 + Math.min(-n, class179.method786() * 0.5), 0.5 + Math.min(-n, class179.method787() * 0.5), 0.5 + Math.max(n, class179.method785() * 0.5), 0.5 + Math.max(n, class179.method786() * 0.5), 0.5 + Math.max(n, class179.method787() * 0.5));
        }
        final Class7702[] array2 = new Class7702[64];
        for (int j = 0; j < 64; ++j) {
            Class7702 method11779 = method11778;
            for (int k = 0; k < Class3967.field17920.length; ++k) {
                if ((j & 1 << k) != 0x0) {
                    method11779 = Class7698.method24492(method11779, array[k]);
                }
            }
            array2[j] = method11779;
        }
        return array2;
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return false;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return this.field17928[this.method12104(class7096)];
    }
    
    public int method12104(final Class7096 class7096) {
        int n = 0;
        for (int i = 0; i < Class3967.field17920.length; ++i) {
            if (class7096.method21772((Class7111<Boolean>)Class3967.field17927.get(Class3967.field17920[i]))) {
                n |= 1 << i;
            }
        }
        return n;
    }
    
    static {
        field17920 = Class179.values();
        field17921 = Class8970.field37752;
        field17922 = Class8970.field37753;
        field17923 = Class8970.field37754;
        field17924 = Class8970.field37755;
        field17925 = Class8970.field37750;
        field17926 = Class8970.field37751;
        field17927 = Class8349.method27851(Maps.newEnumMap((Class)Class179.class), enumMap -> {
            enumMap.put(Class179.field513, Class3967.field17921);
            enumMap.put(Class179.field516, Class3967.field17922);
            enumMap.put(Class179.field514, Class3967.field17923);
            enumMap.put(Class179.field515, Class3967.field17924);
            enumMap.put(Class179.field512, Class3967.field17925);
            enumMap.put(Class179.field511, Class3967.field17926);
        });
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class6124 implements Class6113
{
    private static String[] field24860;
    private final Class869 field24861;
    private final Map<Class383, Map<String, Class6997>> field24862;
    private final Map<Class383, Map<String, Class6997>> field24863;
    private final Map<Class383, Map<String, Boolean>> field24864;
    
    public Class6124(final Class869 field24861) {
        this.field24862 = Maps.newIdentityHashMap();
        this.field24863 = Maps.newIdentityHashMap();
        this.field24864 = Maps.newIdentityHashMap();
        this.field24861 = field24861;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final Class6092 method5833 = this.field24861.field4644.method5833();
        final Class383 method5834 = this.field24861.field4683.method6789().method20487();
        final BlockPos class7353 = new BlockPos(method5833.method18161().x, 0.0, method5833.method18161().z);
        final Class4150 method5835 = class7352.method25214(Class6332.method18791());
        if (this.field24862.containsKey(method5834)) {
            for (final Class6997 class7354 : this.field24862.get(method5834).values()) {
                if (!class7353.withinDistance(class7354.method21420(), 500.0)) {
                    continue;
                }
                Class1656.method5730(method5835, class7354.field27293 - n, class7354.field27294 - n2, class7354.field27295 - n3, class7354.field27296 + 1 - n, class7354.field27297 + 1 - n2, class7354.field27298 + 1 - n3, 1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (this.field24863.containsKey(method5834)) {
            for (final Map.Entry<String, V> entry : this.field24863.get(method5834).entrySet()) {
                final String s = entry.getKey();
                final Class6997 class7355 = (Class6997)entry.getValue();
                final Boolean b = (Boolean)this.field24864.get(method5834).get(s);
                if (!class7353.withinDistance(class7355.method21420(), 500.0)) {
                    continue;
                }
                if (!b) {
                    Class1656.method5730(method5835, class7355.field27293 - n, class7355.field27294 - n2, class7355.field27295 - n3, class7355.field27296 + 1 - n, class7355.field27297 + 1 - n2, class7355.field27298 + 1 - n3, 0.0f, 0.0f, 1.0f, 1.0f);
                }
                else {
                    Class1656.method5730(method5835, class7355.field27293 - n, class7355.field27294 - n2, class7355.field27295 - n3, class7355.field27296 + 1 - n, class7355.field27297 + 1 - n2, class7355.field27298 + 1 - n3, 0.0f, 1.0f, 0.0f, 1.0f);
                }
            }
        }
    }
    
    public void method18345(final Class6997 class6997, final List<Class6997> list, final List<Boolean> list2, final Class383 class6998) {
        if (!this.field24862.containsKey(class6998)) {
            this.field24862.put(class6998, Maps.newHashMap());
        }
        if (!this.field24863.containsKey(class6998)) {
            this.field24863.put(class6998, Maps.newHashMap());
            this.field24864.put(class6998, Maps.newHashMap());
        }
        this.field24862.get(class6998).put(class6997.toString(), class6997);
        for (int i = 0; i < list.size(); ++i) {
            final Class6997 class6999 = list.get(i);
            final Boolean b = list2.get(i);
            this.field24863.get(class6998).put(class6999.toString(), class6999);
            this.field24864.get(class6998).put(class6999.toString(), b);
        }
    }
    
    @Override
    public void method18270() {
        this.field24862.clear();
        this.field24863.clear();
        this.field24864.clear();
    }
}

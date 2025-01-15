// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class Class6119 implements Class6113
{
    private static String[] field24836;
    private final Class869 field24837;
    private final Map<Integer, List<Class7472>> field24838;
    
    @Override
    public void method18270() {
        this.field24838.clear();
    }
    
    public void method18313(final int i, final List<Class7472> list) {
        this.field24838.put(i, list);
    }
    
    public Class6119(final Class869 field24837) {
        this.field24838 = Maps.newHashMap();
        this.field24837 = field24837;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        this.field24837.field4644.method5833();
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30041();
        this.field24838.forEach((p1, list) -> {
            final Class6092 class7354;
            final Object o = new BlockPos(class7354.method18161().x, 0.0, class7354.method18161().z);
            int i = 0;
            while (i < list.size()) {
                final Class7472 class7355 = list.get(i);
                if (!(!class7353.method1081(class7355.field28861, 160.0))) {
                    Class7282.method22339(class7355.field28863, class7355.field28861.getX() + 0.5, class7355.field28861.getY() + 2.0 + i * 0.25, class7355.field28861.getZ() + 0.5, class7355.field28864 ? -16711936 : -3355444);
                }
                ++i;
            }
            return;
        });
        Class8726.method30008();
        Class8726.method30040();
        Class8726.method30060();
    }
}

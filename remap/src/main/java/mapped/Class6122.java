// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class6122 implements Class6113
{
    private final Minecraft field24850;
    private double field24851;
    private final int field24852 = 12;
    private Class8112 field24853;
    
    public Class6122(final Minecraft field24850) {
        this.field24851 = Double.MIN_VALUE;
        this.field24850 = field24850;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final double field24851 = (double) Util.method27838();
        if (field24851 - this.field24851 > 3.0E9) {
            this.field24851 = field24851;
            final Class1655 method5285 = this.field24850.method5285();
            if (method5285 == null) {
                this.field24853 = null;
            }
            else {
                this.field24853 = new Class8112(this, method5285, n, n3, null);
            }
        }
        if (this.field24853 != null) {
            Class8726.method30011();
            Class8726.method30117();
            Class8726.method30072(2.0f);
            Class8726.method30041();
            Class8726.method30010(false);
            final Map<?, ?> map = Class8112.method26664(this.field24853).getNow(null);
            final double n4 = this.field24850.field4644.method5833().method18161().y * 0.85;
            for (final Map.Entry<Class7859, V> entry : Class8112.method26665(this.field24853).entrySet()) {
                final Class7859 class7353 = entry.getKey();
                String string = (String)entry.getValue();
                if (map != null) {
                    string += (String)map.get(class7353);
                }
                final String[] split = string.split("\n");
                int n5 = 0;
                final String[] array = split;
                for (int length = array.length, i = 0; i < length; ++i) {
                    Class7282.method22340(array[i], (class7353.field32290 << 4) + 8, n4 + n5, (class7353.field32291 << 4) + 8, -1, 0.15f);
                    n5 -= 2;
                }
            }
            Class8726.method30010(true);
            Class8726.method30040();
            Class8726.method30012();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import net.minecraft.util.math.BlockPos;

public class Class7533
{
    private static String[] field29911;
    private boolean field29912;
    private final Long2IntLinkedOpenHashMap field29913;
    private final Long2FloatLinkedOpenHashMap field29914;
    
    private Class7533() {
        this.field29913 = Util.method27850(() -> {
            final Class36 class36 = new Class36(this, 100, 0.25f);
            class36.defaultReturnValue(Integer.MAX_VALUE);
            return class36;
        });
        this.field29914 = Util.method27850(() -> {
            final Class28 class37 = new Class28(this, 100, 0.25f);
            class37.defaultReturnValue(Float.NaN);
            return class37;
        });
    }
    
    public void method23606() {
        this.field29912 = true;
    }
    
    public void method23607() {
        this.field29912 = false;
        this.field29913.clear();
        this.field29914.clear();
    }
    
    public int method23608(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        final long method1132 = class7098.toLong();
        if (this.field29912) {
            final int value = this.field29913.get(method1132);
            if (value != Integer.MAX_VALUE) {
                return value;
            }
        }
        final int method1133 = Class1656.method5777(class7097, class7096, class7098);
        if (this.field29912) {
            if (this.field29913.size() == 100) {
                this.field29913.removeFirstInt();
            }
            this.field29913.put(method1132, method1133);
        }
        return method1133;
    }
    
    public float method23609(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        final long method1132 = class7098.toLong();
        if (this.field29912) {
            final float value = this.field29914.get(method1132);
            if (!Float.isNaN(value)) {
                return value;
            }
        }
        final float method1133 = class7096.method21712(class7097, class7098);
        if (this.field29912) {
            if (this.field29914.size() == 100) {
                this.field29914.removeFirstFloat();
            }
            this.field29914.put(method1132, method1133);
        }
        return method1133;
    }
}

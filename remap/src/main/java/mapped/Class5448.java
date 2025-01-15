// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.Vec3d;

public class Class5448 extends Class5419<Class787>
{
    private static String[] field22675;
    private final float field22676;
    private final int field22677;
    private final int field22678;
    
    public Class5448(final float n) {
        this(n, 10, 7);
    }
    
    public Class5448(final float field22676, final int field22677, final int field22678) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22676 = field22676;
        this.field22677 = field22677;
        this.field22678 = field22678;
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        final BlockPos class1851 = new BlockPos(class1850);
        if (!class1849.method6922(class1851)) {
            final Class353 method1089 = Class353.method1089(class1851);
            final Class353 method1090 = Class6793.method20792(class1849, method1089, 2);
            if (method1090 == method1089) {
                this.method16635(class1850);
            }
            else {
                this.method16634(class1850, method1090);
            }
        }
        else {
            this.method16635(class1850);
        }
    }
    
    private void method16634(final Class787 class787, final Class353 class788) {
        class787.method2618().method1197(Class8233.field33809, Optional.ofNullable(Class7775.method24905(class787, this.field22677, this.field22678, new Vec3d(class788.method1114()))).map(class789 -> new Class6949(class789, this.field22676, 0)));
    }
    
    private void method16635(final Class787 class787) {
        class787.method2618().method1197(Class8233.field33809, Optional.ofNullable(Class7775.method24902(class787, this.field22677, this.field22678)).map(class788 -> new Class6949(class788, this.field22676, 0)));
    }
}

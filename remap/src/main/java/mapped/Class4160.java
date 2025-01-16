// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;

public class Class4160 extends Class4158<Class440>
{
    private static String[] field18544;
    private final Class5876<?> field18545;
    
    public Class4160(final Class5876<?> field18545, final Class9550 class9550) {
        super(class9550);
        this.field18545 = field18545;
    }
    
    public void method12465(final Class440 class440, final float n, final Class7351 class441, final Class7807 class442, final int n2, final int n3) {
        Direction field512 = Direction.UP;
        if (class440.hasWorld()) {
            final Class7096 method6701 = class440.method2186().getBlockState(class440.getPos());
            if (method6701.method21696() instanceof Class3942) {
                field512 = method6701.method21772(Class3942.field17832);
            }
        }
        final Class181 method6702 = class440.method2252();
        Class3687 field513;
        if (method6702 != null) {
            field513 = Class8752.field36751.get(method6702.method813());
        }
        else {
            field513 = Class8752.field36750;
        }
        class441.method22567();
        class441.method22564(0.5, 0.5, 0.5);
        class441.method22565(0.9995f, 0.9995f, 0.9995f);
        class441.method22566(field512.getRotation());
        class441.method22565(1.0f, -1.0f, -1.0f);
        class441.method22564(0.0, -1.0, 0.0);
        final Class4150 method6703 = field513.method11334(class442, Class6332::method18770);
        this.field18545.method17622().method18643(class441, method6703, n2, n3);
        class441.method22564(0.0, -class440.method2251(n) * 0.5f, 0.0);
        class441.method22566(Vector3f.YP.rotationDegrees(270.0f * class440.method2251(n)));
        this.field18545.method17623().method18643(class441, method6703, n2, n3);
        class441.method22568();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

import java.util.List;

public enum Class2234
{
    field13720((Vec3i)null),
    field13721(new Vec3i(-1, 0, 0)),
    field13722(new Vec3i(1, 0, 0)),
    field13723(new Vec3i(0, 0, -1)),
    field13724(new Vec3i(0, 0, 1)),
    field13725(new Vec3i(0, 1, 0)),
    field13726(new Vec3i(0, -1, 0));
    
    public Vec3i field13727;
    
    private Class2234(final Vec3i field13727) {
        this.field13727 = field13727;
    }
    
    public static List<Class2234> method8428() {
        return new Class58();
    }
    
    public static List<Class2234> method8429() {
        return new Class55();
    }
}

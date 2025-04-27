// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class8230 extends Class8228
{
    public static final Class8230 field33794;
    
    private Class8230() {
        super(Class261.field1246);
    }
    
    @Override
    public List<Class9038> method27253(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final Random random) {
        return Collections.emptyList();
    }
    
    @Override
    public MutableBoundingBox method27254(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797) {
        return MutableBoundingBox.getNewBoundingBox();
    }
    
    @Override
    public boolean method27255(final Class1795 class1795, final Class1851 class1796, final Class6346<?> class1797, final BlockPos class1798, final Class2052 class1799, final MutableBoundingBox class1800, final Random random) {
        return true;
    }
    
    @Override
    public Class7755 method27257() {
        return Class7755.field31691;
    }
    
    @Override
    public <T> Dynamic<T> method27258(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.emptyMap());
    }
    
    @Override
    public String toString() {
        return "Empty";
    }
    
    static {
        field33794 = new Class8230();
    }
}

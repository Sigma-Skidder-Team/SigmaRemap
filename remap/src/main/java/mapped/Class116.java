// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.function.Predicate;

public class Class116 implements Predicate<Class7990>
{
    private static String[] field360;
    private final Class7096 field361;
    private final Set<IProperty<?>> field362;
    private final CompoundNBT field363;
    
    public Class116(final Class7096 field361, final Set<IProperty<?>> field362, final CompoundNBT field363) {
        this.field361 = field361;
        this.field362 = field362;
        this.field363 = field363;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final Class7096 method26065 = class7990.method26065();
        if (method26065.method21696() != this.field361.method21696()) {
            return false;
        }
        for (final IProperty class7991 : this.field362) {
            if (((StateHolder<Object, Object>)method26065).get((IProperty<Comparable>)class7991) == this.field361.method21772((IProperty<Comparable>)class7991)) {
                continue;
            }
            return false;
        }
        if (this.field363 != null) {
            final TileEntity method26066 = class7990.method26066();
            return method26066 != null && Class9346.method34642(this.field363, method26066.method2180(new CompoundNBT()), true);
        }
        return true;
    }
}

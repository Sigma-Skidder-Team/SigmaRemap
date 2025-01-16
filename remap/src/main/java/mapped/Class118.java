// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.function.Predicate;

public class Class118 implements Predicate<Class7990>
{
    private final BlockState field366;
    private final Set<IProperty<?>> field367;
    private final CompoundNBT field368;
    
    public Class118(final BlockState field366, final Set<IProperty<?>> field367, final CompoundNBT field368) {
        this.field366 = field366;
        this.field367 = field367;
        this.field368 = field368;
    }
    
    public BlockState method609() {
        return this.field366;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final BlockState method26065 = class7990.method26065();
        if (method26065.getBlock() != this.field366.getBlock()) {
            return false;
        }
        for (final IProperty class7991 : this.field367) {
            if (((StateHolder<Object, Object>)method26065).get((IProperty<Comparable>)class7991) == this.field366.get((IProperty<Comparable>)class7991)) {
                continue;
            }
            return false;
        }
        if (this.field368 != null) {
            final TileEntity method26066 = class7990.method26066();
            return method26066 != null && Class9346.method34642(this.field368, method26066.method2180(new CompoundNBT()), true);
        }
        return true;
    }
    
    public boolean method610(final Class1849 class1849, final BlockPos class1850, final int n) {
        if (class1849.setBlockState(class1850, this.field366, n)) {
            if (this.field368 != null) {
                final TileEntity method6727 = class1849.getTileEntity(class1850);
                if (method6727 != null) {
                    final CompoundNBT method6728 = this.field368.copy();
                    method6728.putInt("x", class1850.getX());
                    method6728.putInt("y", class1850.getY());
                    method6728.putInt("z", class1850.getZ());
                    method6727.method2179(method6728);
                }
            }
            return true;
        }
        return false;
    }
}

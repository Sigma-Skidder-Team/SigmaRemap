// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.function.Predicate;

public class Class119 implements Predicate<Class7990>
{
    private static String[] field369;
    private final Class7909<Block> field370;
    private final CompoundNBT field371;
    private final Map<String, String> field372;
    
    private Class119(final Class7909<Block> field370, final Map<String, String> field371, final CompoundNBT field372) {
        this.field370 = field370;
        this.field372 = field371;
        this.field371 = field372;
    }
    
    @Override
    public boolean test(final Class7990 class7990) {
        final BlockState method26065 = class7990.method26065();
        if (!method26065.method21755(this.field370)) {
            return false;
        }
        for (final Map.Entry<String, V> entry : this.field372.entrySet()) {
            final IProperty<?> method26066 = method26065.getBlock().getStateContainer().getProperty(entry.getKey());
            if (method26066 == null) {
                return false;
            }
            final Comparable comparable = (Comparable)method26066.parseValue((String)entry.getValue()).orElse((Object)null);
            if (comparable == null) {
                return false;
            }
            if (((StateHolder<Object, Object>)method26065).get(method26066) == comparable) {
                continue;
            }
            return false;
        }
        if (this.field371 != null) {
            final TileEntity method26067 = class7990.method26066();
            return method26067 != null && Class9346.method34642(this.field371, method26067.method2180(new CompoundNBT()), true);
        }
        return true;
    }
}

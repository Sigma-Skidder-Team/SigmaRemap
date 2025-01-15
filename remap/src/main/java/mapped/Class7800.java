// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Iterator;
import java.util.List;

public class Class7800 extends Class7799
{
    private static String[] field31962;
    public final List<Entity> field31963;
    
    public Class7800(final List<Entity> field31963) {
        this.field31963 = field31963;
    }
    
    @Override
    public boolean method25201(final Class8797 class8797) {
        final Iterator<Entity> iterator = this.field31963.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method1735(class8797.method30686()) >= 5.0) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public double method25202(final Class8797 class8797) {
        double n = 0.0;
        final Iterator<Entity> iterator = this.field31963.iterator();
        while (iterator.hasNext()) {
            final double method1735 = iterator.next().method1735(class8797.method30686());
            if (method1735 >= n) {
                continue;
            }
            n = method1735;
        }
        return n;
    }
}

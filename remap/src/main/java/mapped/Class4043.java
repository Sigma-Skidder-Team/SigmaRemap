// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

import java.util.Map;
import javax.annotation.Nullable;

public class Class4043 extends Class4036
{
    private static String[] field18137;
    public final Class3833 field18138;
    
    public Class4043(final Class3833 class3833, final Class3833 field18138, final Class8959 class3834) {
        super(class3833, class3834);
        this.field18138 = field18138;
    }
    
    @Nullable
    @Override
    public Class7096 method12233(final Class7074 class7074) {
        final Class7096 method11846 = this.field18138.method11846(class7074);
        Class7096 class7075 = null;
        final World method11847 = class7074.method21654();
        final BlockPos method11848 = class7074.method21639();
        for (final Direction class7076 : class7074.method21643()) {
            if (class7076 != Direction.UP) {
                final Class7096 class7077 = (class7076 != Direction.DOWN) ? method11846 : this.method12240().method11846(class7074);
                if (class7077 != null) {
                    if (class7077.method21752(method11847, method11848)) {
                        class7075 = class7077;
                        break;
                    }
                }
            }
        }
        return (class7075 != null && method11847.method6974(class7075, method11848, ISelectionContext.dummy())) ? class7075 : null;
    }
    
    @Override
    public void method12241(final Map<Class3833, Item> map, final Item class3820) {
        super.method12241(map, class3820);
        map.put(this.field18138, class3820);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class Class4028 extends Class4027
{
    private static String[] field18121;
    
    public Class4028(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, BlockState>)this.field17406.method32903()).method21773(Class4028.field18120, Axis.Y));
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        class1849.method1705(n, 0.2f);
    }
}

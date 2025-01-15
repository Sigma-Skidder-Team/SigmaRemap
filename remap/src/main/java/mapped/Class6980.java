// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.HashSet;
import java.util.Set;

public class Class6980 extends Class6977
{
    private static String[] field27274;
    
    public Class6980() {
        super(Class3855.class);
    }
    
    @Override
    public Set<Class9488> method21399(final BlockPos field27548, final Class7096 class7096, final Class7614 class7097) {
        final HashSet set = new HashSet();
        final Class7074 class7098 = new Class7074(this.field27275.field4683, this.field27275.field4684, Class316.field1877, new Class8321(class7096.method21696()), new Class7005(new Vec3d(0.0, 0.0, 0.0), Direction.DOWN, field27548, false));
        class7098.field27548 = field27548;
        class7098.field27549 = false;
        set.add(new Class9488(field27548, class7096.method21696().method11846(class7098)));
        return set;
    }
}

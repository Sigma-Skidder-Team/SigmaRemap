// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class4004 extends Block
{
    private static String[] field18048;
    
    public Class4004(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        class7099.setMotionMultiplier(class7096, new Vec3d(0.25, 0.05000000074505806, 0.25));
    }
}

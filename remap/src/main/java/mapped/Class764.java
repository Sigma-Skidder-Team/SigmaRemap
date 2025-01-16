// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class764 extends Class763
{
    private static String[] field4134;
    
    public Class764(final EntityType<? extends Class764> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 10.440001f;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(100.0);
        this.method2710(Class8107.field33408).method23941(0.5);
        this.method2710(Class8107.field33410).method23941(50.0);
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return class355.method6963(class354) - 0.5f;
    }
}

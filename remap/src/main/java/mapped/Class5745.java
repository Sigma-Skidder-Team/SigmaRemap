// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class5745 extends Class5714
{
    private static String[] field23331;
    private final double field23332;
    private final Vec3d field23333;
    
    public Class5745(final double field23332, final Vec3d field23333) {
        this.field23332 = field23332;
        this.field23333 = field23333;
    }
    
    public double method17049() {
        return this.field23332;
    }
    
    public void method17050(final double field22771) {
        this.setCancelled(true);
        this.field23333.y = field22771;
    }
    
    public double method17051() {
        return this.field23333.y;
    }
    
    public Vec3d method17052() {
        return this.field23333;
    }
}

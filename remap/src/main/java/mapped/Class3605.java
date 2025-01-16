// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class Class3605 extends Class3446
{
    private static String[] field16786;
    private final Class791 field16787;
    
    public Class3605(final Class791 field16787) {
        this.field16787 = field16787;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581, Class2139.field12582));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16787.method2625() || this.field16787.method4396()) {
            if (this.field16787.onGround) {
                if (this.field16787.method4414()) {
                    final float n = this.field16787.rotationYaw * 0.017453292f;
                    int n2 = 0;
                    int n3 = 0;
                    final float n4 = -MathHelper.sin(n);
                    final float method35639 = MathHelper.cos(n);
                    if (Math.abs(n4) > 0.5) {
                        n2 += (int)(n4 / Math.abs(n4));
                    }
                    if (Math.abs(method35639) > 0.5) {
                        n3 += (int)(method35639 / Math.abs(method35639));
                    }
                    return this.field16787.world.getBlockState(new BlockPos(this.field16787).add(n2, -1, n3)).method21706() || (this.field16787.method4396() && Class791.method4425(this.field16787).nextInt(60) == 1) || Class791.method4426(this.field16787).nextInt(500) == 1;
                }
                return false;
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16787.method4390(true);
    }
    
    @Override
    public boolean method11014() {
        return false;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class5789 extends Class5784
{
    private static String[] field23781;
    private Vec3d field23782;
    private int field23783;
    
    public Class5789(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17246() {
        if (this.field23783++ % 10 == 0) {
            this.field23764.field2391.method6709(Class8432.field34618, this.field23764.getPosX() + (this.field23764.method2633().nextFloat() - 0.5f) * 8.0f, this.field23764.getPosY() + 2.0 + (this.field23764.method2633().nextFloat() - 0.5f) * 4.0f, this.field23764.getPosZ() + (this.field23764.method2633().nextFloat() - 0.5f) * 8.0f, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void method17247() {
        ++this.field23783;
        if (this.field23782 == null) {
            final BlockPos method6958 = this.field23764.field2391.method6958(Class2020.field11525, Class4551.field20031);
            this.field23782 = new Vec3d(method6958.getX(), method6958.getY(), method6958.getZ());
        }
        final double method6959 = this.field23782.squareDistanceTo(this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ());
        if (method6959 >= 100.0) {
            if (method6959 <= 22500.0) {
                if (!this.field23764.field2405) {
                    if (!this.field23764.field2406) {
                        this.field23764.method2665(1.0f);
                        return;
                    }
                }
            }
        }
        this.field23764.method2665(0.0f);
    }
    
    @Override
    public void method17249() {
        this.field23782 = null;
        this.field23783 = 0;
    }
    
    @Override
    public float method17251() {
        return 3.0f;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23782;
    }
    
    @Override
    public Class7193<Class5789> method17253() {
        return Class7193.field27957;
    }
}

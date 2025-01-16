// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class477 extends TileEntity implements Class476, Class439
{
    private static String[] field2778;
    public float field2779;
    public float field2780;
    public int field2781;
    private int field2782;
    
    public Class477() {
        super(Class5412.field22544);
    }
    
    @Override
    public void method2229() {
        if (++this.field2782 % 20 * 4 == 0) {
            this.field2656.method6763(this.field2657, Blocks.field29409, 1, this.field2781);
        }
        this.field2780 = this.field2779;
        final int method1074 = this.field2657.getX();
        final int method1075 = this.field2657.getY();
        final int method1076 = this.field2657.getZ();
        if (this.field2781 > 0) {
            if (this.field2779 == 0.0f) {
                this.field2656.method6706(null, method1074 + 0.5, method1075 + 0.5, method1076 + 0.5, Class8520.field35152, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
            }
        }
        Label_0192: {
            if (this.field2781 == 0 && this.field2779 > 0.0f) {
                break Label_0192;
            }
            if (this.field2781 > 0) {
                if (this.field2779 < 1.0f) {
                    break Label_0192;
                }
            }
            return;
        }
        final float field2779 = this.field2779;
        if (this.field2781 <= 0) {
            this.field2779 -= 0.1f;
        }
        else {
            this.field2779 += 0.1f;
        }
        if (this.field2779 > 1.0f) {
            this.field2779 = 1.0f;
        }
        if (this.field2779 < 0.5f) {
            if (field2779 >= 0.5f) {
                this.field2656.method6706(null, method1074 + 0.5, method1075 + 0.5, method1076 + 0.5, Class8520.field35151, Class286.field1582, 0.5f, this.field2656.rand.nextFloat() * 0.1f + 0.9f);
            }
        }
        if (this.field2779 >= 0.0f) {
            return;
        }
        this.field2779 = 0.0f;
    }
    
    @Override
    public boolean method2200(final int n, final int field2781) {
        if (n != 1) {
            return super.method2200(n, field2781);
        }
        this.field2781 = field2781;
        return true;
    }
    
    @Override
    public void method2198() {
        this.method2201();
        super.method2198();
    }
    
    public void method2426() {
        ++this.field2781;
        this.field2656.method6763(this.field2657, Blocks.field29409, 1, this.field2781);
    }
    
    public void method2427() {
        --this.field2781;
        this.field2656.method6763(this.field2657, Blocks.field29409, 1, this.field2781);
    }
    
    public boolean method2428(final PlayerEntity playerEntity) {
        return this.field2656.getTileEntity(this.field2657) == this && playerEntity.method1733(this.field2657.getX() + 0.5, this.field2657.getY() + 0.5, this.field2657.getZ() + 0.5) <= 64.0;
    }
    
    @Override
    public float method2423(final float n) {
        return MathHelper.method35700(n, this.field2780, this.field2779);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class867 extends Class865
{
    private static String[] field4619;
    public final /* synthetic */ Class500 field4620;
    
    public Class867(final Class500 field4620) {
        this.field4620 = field4620;
    }
    
    @Override
    public void method5211(final String s) {
        super.method5211(s);
        this.field4620.method2161();
    }
    
    @Override
    public Class1849 method5216() {
        return (Class1849)this.field4620.field2656;
    }
    
    @Override
    public void method5217() {
        final BlockState method6701 = this.field4620.field2656.getBlockState(this.field4620.field2657);
        this.method5216().method6693(this.field4620.field2657, method6701, method6701, 3);
    }
    
    @Override
    public Vec3d method5222() {
        return new Vec3d(this.field4620.field2657.getX() + 0.5, this.field4620.field2657.getY() + 0.5, this.field4620.field2657.getZ() + 0.5);
    }
    
    @Override
    public Class7492 method5223() {
        return new Class7492(this, new Vec3d(this.field4620.field2657.getX() + 0.5, this.field4620.field2657.getY() + 0.5, this.field4620.field2657.getZ() + 0.5), Vec2f.ZERO, this.method5216(), 2, this.method5214().getString(), this.method5214(), this.method5216().getServer(), null);
    }
}

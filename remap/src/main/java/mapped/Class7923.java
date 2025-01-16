// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class7923 implements Class7924
{
    private static String[] field32541;
    private final double field32542;
    private final double field32543;
    private final long field32544;
    private final long field32545;
    private final double field32546;
    public final /* synthetic */ WorldBorder field32547;
    
    private Class7923(final WorldBorder field32547, final double field32548, final double field32549, final long n) {
        this.field32547 = field32547;
        this.field32542 = field32548;
        this.field32543 = field32549;
        this.field32546 = (double)n;
        this.field32545 = Class8349.method27837();
        this.field32544 = this.field32545 + n;
    }
    
    @Override
    public double method25675() {
        return Math.max(this.field32547.method34777() - this.method25679() / 2.0, -WorldBorder.method34812(this.field32547));
    }
    
    @Override
    public double method25676() {
        return Math.max(this.field32547.method34778() - this.method25679() / 2.0, -WorldBorder.method34812(this.field32547));
    }
    
    @Override
    public double method25677() {
        return Math.min(this.field32547.method34777() + this.method25679() / 2.0, WorldBorder.method34812(this.field32547));
    }
    
    @Override
    public double method25678() {
        return Math.min(this.field32547.method34778() + this.method25679() / 2.0, WorldBorder.method34812(this.field32547));
    }
    
    @Override
    public double method25679() {
        final double n = (Class8349.method27837() - this.field32545) / this.field32546;
        return (n >= 1.0) ? this.field32543 : MathHelper.method35701(n, this.field32542, this.field32543);
    }
    
    @Override
    public double method25680() {
        return Math.abs(this.field32542 - this.field32543) / (this.field32544 - this.field32545);
    }
    
    @Override
    public long method25681() {
        return this.field32544 - Class8349.method27837();
    }
    
    @Override
    public double method25682() {
        return this.field32543;
    }
    
    @Override
    public Class2096 method25683() {
        return (this.field32543 >= this.field32542) ? Class2096.field12142 : Class2096.field12143;
    }
    
    @Override
    public void method25684() {
    }
    
    @Override
    public void method25685() {
    }
    
    @Override
    public Class7924 method25686() {
        Class7924 class7924;
        if (this.method25681() > 0L) {
            class7924 = this;
        }
        else {
            final WorldBorder field32547;
            class7924 = new Class7925(field32547, this.field32543);
            field32547 = this.field32547;
            field32547.getClass();
        }
        return class7924;
    }
    
    @Override
    public VoxelShape method25687() {
        return VoxelShapes.method24494(VoxelShapes.field30599, VoxelShapes.method24488(Math.floor(this.method25675()), Double.NEGATIVE_INFINITY, Math.floor(this.method25676()), Math.ceil(this.method25677()), Double.POSITIVE_INFINITY, Math.ceil(this.method25678())), Class9306.field39920);
    }
}

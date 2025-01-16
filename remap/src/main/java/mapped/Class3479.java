// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.EnumSet;

public abstract class Class3479 extends Class3446
{
    public final Class787 field16390;
    public final double field16391;
    public int field16392;
    public int field16393;
    private int field16394;
    public BlockPos field16395;
    private boolean field16396;
    private final int field16397;
    private final int field16398;
    public int field16399;
    
    public Class3479(final Class787 class787, final double n, final int n2) {
        this(class787, n, n2, 1);
    }
    
    public Class3479(final Class787 field16390, final double field16391, final int field16392, final int field16393) {
        this.field16395 = BlockPos.ZERO;
        this.field16390 = field16390;
        this.field16391 = field16391;
        this.field16397 = field16392;
        this.field16399 = 0;
        this.field16398 = field16393;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12582));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16392 <= 0) {
            this.field16392 = this.method11044(this.field16390);
            return this.method11049();
        }
        --this.field16392;
        return false;
    }
    
    public int method11044(final Class787 class787) {
        return 200 + class787.method2633().nextInt(200);
    }
    
    @Override
    public boolean method11017() {
        if (this.field16393 >= -this.field16394) {
            if (this.field16393 <= 1200) {
                if (this.method11050(this.field16390.world, this.field16395)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.method11045();
        this.field16393 = 0;
        this.field16394 = this.field16390.method2633().nextInt(this.field16390.method2633().nextInt(1200) + 1200) + 1200;
    }
    
    public void method11045() {
        this.field16390.method4150().method24724((float)this.field16395.getX() + 0.5, this.field16395.getY() + 1, (float)this.field16395.getZ() + 0.5, this.field16391);
    }
    
    public double method11046() {
        return 1.0;
    }
    
    @Override
    public void method11016() {
        if (this.field16395.method1137().withinDistance(this.field16390.method1934(), this.method11046())) {
            this.field16396 = true;
            --this.field16393;
        }
        else {
            this.field16396 = false;
            ++this.field16393;
            if (this.method11047()) {
                this.field16390.method4150().method24724((float)this.field16395.getX() + 0.5, this.field16395.getY() + 1, (float)this.field16395.getZ() + 0.5, this.field16391);
            }
        }
    }
    
    public boolean method11047() {
        return this.field16393 % 40 == 0;
    }
    
    public boolean method11048() {
        return this.field16396;
    }
    
    public boolean method11049() {
        final int field16397 = this.field16397;
        final int field16398 = this.field16398;
        final BlockPos class354 = new BlockPos(this.field16390);
        final Mutable field16399 = new Mutable();
        for (int i = this.field16399; i <= field16398; i = ((i <= 0) ? (1 - i) : (-i))) {
            for (int j = 0; j < field16397; ++j) {
                for (int k = 0; k <= j; k = ((k <= 0) ? (1 - k) : (-k))) {
                    for (int l = (k < j && k > -j) ? j : 0; l <= j; l = ((l <= 0) ? (1 - l) : (-l))) {
                        field16399.method1287(class354).method1292(k, i - 1, l);
                        if (this.field16390.method4197(field16399) && this.method11050(this.field16390.world, field16399)) {
                            this.field16395 = field16399;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public abstract boolean method11050(final Class1852 p0, final BlockPos p1);
}

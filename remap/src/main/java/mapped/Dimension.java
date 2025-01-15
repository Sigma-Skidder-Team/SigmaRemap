// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import javax.annotation.Nullable;

public abstract class Dimension
{
    public static final float[] field26491;
    public final World field26492;
    private final DimensionType field26493;
    public boolean field26494;
    public boolean field26495;
    public final float[] field26496;
    private final float[] field26497;
    
    public Dimension(final World field26492, final DimensionType field26493, final float n) {
        this.field26496 = new float[16];
        this.field26497 = new float[4];
        this.field26492 = field26492;
        this.field26493 = field26493;
        for (int i = 0; i <= 15; ++i) {
            final float n2 = i / 15.0f;
            this.field26496[i] = MathHelper.method35700(n, n2 / (4.0f - 3.0f * n2), 1.0f);
        }
    }
    
    public int method20496(final long n) {
        return (int)(n / 24000L % 8L + 8L) % 8;
    }
    
    @Nullable
    public float[] method20497(final float n, final float n2) {
        final float n3 = MathHelper.cos(n * 6.2831855f) - 0.0f;
        if (n3 >= -0.4f && n3 <= 0.4f) {
            final float n4 = (n3 + 0.0f) / 0.4f * 0.5f + 0.5f;
            final float n5 = 1.0f - (1.0f - MathHelper.sin(n4 * 3.1415927f)) * 0.99f;
            final float n6 = n5 * n5;
            this.field26497[0] = n4 * 0.3f + 0.7f;
            this.field26497[1] = n4 * n4 * 0.7f + 0.2f;
            this.field26497[2] = n4 * n4 * 0.0f + 0.2f;
            this.field26497[3] = n6;
            return this.field26497;
        }
        return null;
    }
    
    public float method20498() {
        return 128.0f;
    }
    
    public boolean method20499() {
        return true;
    }
    
    @Nullable
    public BlockPos method20500() {
        return null;
    }
    
    public double method20501() {
        return (this.field26492.method6764().method29570() != Class9505.field40893) ? 0.03125 : 1.0;
    }
    
    public boolean method20502() {
        return this.field26494;
    }
    
    public boolean method20503() {
        return this.field26493.method1277();
    }
    
    public boolean method20504() {
        return this.field26495;
    }
    
    public float method20505(final int n) {
        return this.field26496[n];
    }
    
    public WorldBorder createWorldBorder() {
        return new WorldBorder();
    }
    
    public void method20507() {
    }
    
    public void method20508() {
    }
    
    public abstract Class6346<?> method20488();
    
    @Nullable
    public abstract BlockPos method20489(final Class7859 p0, final boolean p1);
    
    @Nullable
    public abstract BlockPos method20490(final int p0, final int p1, final boolean p2);
    
    public abstract float method20491(final long p0, final float p1);
    
    public abstract boolean method20492();
    
    public abstract Vec3d method20493(final float p0, final float p1);
    
    public abstract boolean method20494();
    
    public abstract boolean method20495(final int p0, final int p1);
    
    public abstract DimensionType getType();
    
    static {
        field26491 = new float[] { 1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f };
    }
}

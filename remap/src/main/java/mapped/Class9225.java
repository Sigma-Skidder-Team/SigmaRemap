// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.chunk.Chunk;

import javax.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class Class9225
{
    private static String[] field39562;
    public final AtomicReferenceArray<Chunk> field39563;
    private final int field39564;
    private final int field39565;
    private volatile int field39566;
    private volatile int field39567;
    private int field39568;
    public final /* synthetic */ Class1907 field39569;
    
    private Class9225(final Class1907 field39569, final int field39570) {
        this.field39569 = field39569;
        this.field39564 = field39570;
        this.field39565 = field39570 * 2 + 1;
        this.field39563 = new AtomicReferenceArray<Chunk>(this.field39565 * this.field39565);
    }
    
    public int method34012(final int x, final int x2) {
        return Math.floorMod(x2, this.field39565) * this.field39565 + Math.floorMod(x, this.field39565);
    }
    
    public void method34013(final int i, final Chunk newValue) {
        final Chunk class1862 = this.field39563.getAndSet(i, newValue);
        if (class1862 != null) {
            --this.field39568;
            Class1907.method7421(this.field39569).method6811(class1862);
        }
        if (newValue != null) {
            ++this.field39568;
        }
    }
    
    public Chunk method34014(final int i, final Chunk expectedValue, final Chunk newValue) {
        if (this.field39563.compareAndSet(i, expectedValue, newValue)) {
            if (newValue == null) {
                --this.field39568;
            }
        }
        Class1907.method7421(this.field39569).method6811(expectedValue);
        return expectedValue;
    }
    
    private boolean method34015(final int n, final int n2) {
        return Math.abs(n - this.field39566) <= this.field39564 && Math.abs(n2 - this.field39567) <= this.field39564;
    }
    
    @Nullable
    public Chunk method34016(final int i) {
        return this.field39563.get(i);
    }
}

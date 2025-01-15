// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.IntConsumer;

import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.Validate;

public class Class9217
{
    private final long[] field39426;
    private final int field39427;
    private final long field39428;
    private final int field39429;
    
    public Class9217(final int n, final int n2) {
        this(n, n2, new long[MathHelper.method35683(n2 * n, 64) / 64]);
    }
    
    public Class9217(final int field39427, final int field39428, final long[] field39429) {
        Validate.inclusiveBetween(1L, 32L, (long)field39427);
        this.field39429 = field39428;
        this.field39427 = field39427;
        this.field39426 = field39429;
        this.field39428 = (1L << field39427) - 1L;
        final int i = MathHelper.method35683(field39428 * field39427, 64) / 64;
        if (field39429.length == i) {
            return;
        }
        throw Class8349.method27859(new RuntimeException("Invalid length given for storage, got: " + field39429.length + " but expected: " + i));
    }
    
    public int method33925(final int n, final int n2) {
        Validate.inclusiveBetween(0L, (long)(this.field39429 - 1), (long)n);
        Validate.inclusiveBetween(0L, this.field39428, (long)n2);
        final int n3 = n * this.field39427;
        final int n4 = n3 >> 6;
        final int n5 = (n + 1) * this.field39427 - 1 >> 6;
        final int n6 = n3 ^ n4 << 6;
        int n7 = 0x0 | (int)(this.field39426[n4] >>> n6 & this.field39428);
        this.field39426[n4] = ((this.field39426[n4] & ~(this.field39428 << n6)) | ((long)n2 & this.field39428) << n6);
        if (n4 != n5) {
            final int n8 = 64 - n6;
            final int n9 = this.field39427 - n8;
            n7 |= (int)(this.field39426[n5] << n8 & this.field39428);
            this.field39426[n5] = (this.field39426[n5] >>> n9 << n9 | ((long)n2 & this.field39428) >> n8);
        }
        return n7;
    }
    
    public void method33926(final int n, final int n2) {
        Validate.inclusiveBetween(0L, (long)(this.field39429 - 1), (long)n);
        Validate.inclusiveBetween(0L, this.field39428, (long)n2);
        final int n3 = n * this.field39427;
        final int n4 = n3 >> 6;
        final int n5 = (n + 1) * this.field39427 - 1 >> 6;
        final int n6 = n3 ^ n4 << 6;
        this.field39426[n4] = ((this.field39426[n4] & ~(this.field39428 << n6)) | ((long)n2 & this.field39428) << n6);
        if (n4 != n5) {
            final int n7 = 64 - n6;
            final int n8 = this.field39427 - n7;
            this.field39426[n5] = (this.field39426[n5] >>> n8 << n8 | ((long)n2 & this.field39428) >> n7);
        }
    }
    
    public int method33927(final int n) {
        Validate.inclusiveBetween(0L, (long)(this.field39429 - 1), (long)n);
        final int n2 = n * this.field39427;
        final int n3 = n2 >> 6;
        final int n4 = (n + 1) * this.field39427 - 1 >> 6;
        final int n5 = n2 ^ n3 << 6;
        if (n3 != n4) {
            return (int)((this.field39426[n3] >>> n5 | this.field39426[n4] << 64 - n5) & this.field39428);
        }
        return (int)(this.field39426[n3] >>> n5 & this.field39428);
    }
    
    public long[] method33928() {
        return this.field39426;
    }
    
    public int method33929() {
        return this.field39429;
    }
    
    public int method33930() {
        return this.field39427;
    }
    
    public void method33931(final IntConsumer intConsumer) {
        final int length = this.field39426.length;
        if (length != 0) {
            int n = 0;
            long n2 = this.field39426[0];
            long n3 = (length <= 1) ? 0L : this.field39426[1];
            for (int i = 0; i < this.field39429; ++i) {
                final int n4 = i * this.field39427;
                final int n5 = n4 >> 6;
                final int n6 = (i + 1) * this.field39427 - 1 >> 6;
                final int n7 = n4 ^ n5 << 6;
                if (n5 != n) {
                    n2 = n3;
                    n3 = ((n5 + 1 >= length) ? 0L : this.field39426[n5 + 1]);
                    n = n5;
                }
                if (n5 != n6) {
                    intConsumer.accept((int)((n2 >>> n7 | n3 << 64 - n7) & this.field39428));
                }
                else {
                    intConsumer.accept((int)(n2 >>> n7 & this.field39428));
                }
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7553
{
    public static final Class7553 field29956;
    private final long field29957;
    private long field29958;
    
    public Class7553(final long field29957) {
        this.field29957 = field29957;
    }
    
    public void method23718(final long n) {
        this.field29958 += n / 8L;
        if (this.field29958 <= this.field29957) {
            return;
        }
        throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.field29958 + "bytes where max allowed: " + this.field29957);
    }
    
    static {
        field29956 = new Class7554(0L);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class RetryCallException extends RealmsServiceException
{
    public final int field_224985_e;
    
    public RetryCallException(final int field14073) {
        super(503, "Retry operation", -1, "");
        if (field14073 >= 0 && field14073 <= 120) {
            this.field_224985_e = field14073;
        }
        else {
            this.field_224985_e = 5;
        }
    }
}

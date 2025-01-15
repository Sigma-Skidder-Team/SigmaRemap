// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1686 extends Class1685
{
    private boolean field9531;
    public final /* synthetic */ Class7812 field9530;
    
    public Class1686(final Class7812 field9530) {
        this.field9530 = field9530;
        super(field9530, null);
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long lng) throws IOException {
        if (lng < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + lng);
        }
        if (this.field9529) {
            throw new IllegalStateException("closed");
        }
        if (this.field9531) {
            return -1L;
        }
        final long method6014 = this.field9530.field32012.method6014(class1680, lng);
        if (method6014 != -1L) {
            return method6014;
        }
        this.method6041(this.field9531 = true);
        return -1L;
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9529) {
            if (!this.field9531) {
                this.method6041(false);
            }
            this.field9529 = true;
        }
    }
}

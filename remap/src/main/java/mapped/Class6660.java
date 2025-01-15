// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class6660 implements Class6661
{
    private final InputStream field26317;
    
    public Class6660(final InputStream field26317) {
        if (field26317 != null) {
            this.field26317 = field26317;
            return;
        }
        throw new NullPointerException("in");
    }
    
    @Override
    public int method20244(final byte[] b, final int off, final int len) throws IOException {
        return this.field26317.read(b, off, len);
    }
    
    @Override
    public boolean method20245() {
        return true;
    }
    
    @Override
    public boolean method20246() {
        return false;
    }
    
    @Override
    public long method20247() {
        return -1L;
    }
    
    @Override
    public long method20248(final long n) {
        return -1L;
    }
    
    @Override
    public long method20249() {
        return -1L;
    }
}

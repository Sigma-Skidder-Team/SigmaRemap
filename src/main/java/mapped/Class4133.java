// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4133 implements Class4119
{
    public final /* synthetic */ Class6065 field18256;
    
    private Class4133(final Class6065 field18256) {
        this.field18256 = field18256;
    }
    
    @Override
    public void method12368() throws IOException {
        throw new Class2395("expecting nothing, but got " + Class6065.method18093(this.field18256));
    }
}

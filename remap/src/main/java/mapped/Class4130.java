// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4130 implements Class4119
{
    public final /* synthetic */ Class6065 field18252;
    
    private Class4130(final Class6065 field18252) {
        this.field18252 = field18252;
    }
    
    @Override
    public void method12368() throws IOException {
        Label_0058: {
            if (!Class6065.method18102(this.field18252)) {
                if (Class6065.method18109(this.field18252) <= Class6065.method18110(this.field18252)) {
                    if (!Class6065.method18112(this.field18252)) {
                        break Label_0058;
                    }
                }
            }
            this.field18252.method18082();
        }
        this.field18252.method18081(":", true, false, false);
        Class6065.method18104(this.field18252).method24253(new Class4136(this.field18252, null));
        Class6065.method18105(this.field18252, false, true, false);
    }
}

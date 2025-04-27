// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4132 implements Class4119
{
    private final boolean field18254;
    public final /* synthetic */ Class6065 field18255;
    
    public Class4132(final Class6065 field18255, final boolean field18256) {
        this.field18255 = field18255;
        this.field18254 = field18256;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!this.field18254 && Class6065.method18093(this.field18255) instanceof Class6289) {
            Class6065.method18106(this.field18255, Class6065.method18107(this.field18255).method24254());
            Class6065.method18094(this.field18255, Class6065.method18104(this.field18255).method24254());
        }
        else {
            this.field18255.method18082();
            if (!Class6065.method18113(this.field18255)) {
                this.field18255.method18081("?", true, false, true);
                Class6065.method18104(this.field18255).method24253(new Class4134(this.field18255, null));
                Class6065.method18105(this.field18255, false, true, false);
            }
            else {
                Class6065.method18104(this.field18255).method24253(new Class4135(this.field18255, null));
                Class6065.method18105(this.field18255, false, true, true);
            }
        }
    }
}

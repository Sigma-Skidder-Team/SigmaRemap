// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4121 implements Class4119
{
    private boolean field18238;
    public final /* synthetic */ Class6065 field18239;
    
    public Class4121(final Class6065 field18239, final boolean field18240) {
        this.field18239 = field18239;
        this.field18238 = field18240;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!this.field18238 && Class6065.method18093(this.field18239) instanceof Class6290) {
            Class6065.method18106(this.field18239, Class6065.method18107(this.field18239).method24254());
            Class6065.method18094(this.field18239, Class6065.method18104(this.field18239).method24254());
        }
        else {
            this.field18239.method18082();
            Class6065.method18115(this.field18239, Class6065.method18114(this.field18239));
            this.field18239.method18081("-", true, false, true);
            Class6065.method18104(this.field18239).method24253(new Class4121(this.field18239, false));
            Class6065.method18105(this.field18239, false, false, false);
        }
    }
}

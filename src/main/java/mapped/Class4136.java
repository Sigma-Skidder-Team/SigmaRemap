// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4136 implements Class4119
{
    public final /* synthetic */ Class6065 field18259;
    
    private Class4136(final Class6065 field18259) {
        this.field18259 = field18259;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18259) instanceof Class6289)) {
            this.field18259.method18081(",", false, false, false);
            Label_0205: {
                if (!Class6065.method18102(this.field18259)) {
                    if (Class6065.method18109(this.field18259) <= Class6065.method18110(this.field18259) || !Class6065.method18111(this.field18259)) {
                        if (!Class6065.method18112(this.field18259)) {
                            break Label_0205;
                        }
                    }
                }
                this.field18259.method18082();
            }
            if (!Class6065.method18102(this.field18259) && Class6065.method18113(this.field18259)) {
                Class6065.method18104(this.field18259).method24253(new Class4120(this.field18259, null));
                Class6065.method18105(this.field18259, false, true, true);
            }
            else {
                this.field18259.method18081("?", true, false, false);
                Class6065.method18104(this.field18259).method24253(new Class4130(this.field18259, null));
                Class6065.method18105(this.field18259, false, true, false);
            }
        }
        else {
            Class6065.method18106(this.field18259, Class6065.method18107(this.field18259).method24254());
            Class6065.method18108(this.field18259);
            if (Class6065.method18102(this.field18259)) {
                this.field18259.method18081(",", false, false, false);
                this.field18259.method18082();
            }
            if (Class6065.method18112(this.field18259)) {
                this.field18259.method18082();
            }
            this.field18259.method18081("}", false, false, false);
            Class6065.method18094(this.field18259, Class6065.method18104(this.field18259).method24254());
        }
    }
}

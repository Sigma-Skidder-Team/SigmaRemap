// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4124 implements Class4119
{
    public final /* synthetic */ Class6065 field18244;
    
    private Class4124(final Class6065 field18244) {
        this.field18244 = field18244;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18244) instanceof Class6290)) {
            Label_0133: {
                if (!Class6065.method18102(this.field18244)) {
                    if (Class6065.method18109(this.field18244) <= Class6065.method18110(this.field18244) || !Class6065.method18111(this.field18244)) {
                        if (!Class6065.method18112(this.field18244)) {
                            break Label_0133;
                        }
                    }
                }
                this.field18244.method18082();
            }
            Class6065.method18104(this.field18244).method24253(new Class4129(this.field18244, null));
            Class6065.method18105(this.field18244, false, false, false);
        }
        else {
            Class6065.method18106(this.field18244, Class6065.method18107(this.field18244).method24254());
            Class6065.method18108(this.field18244);
            this.field18244.method18081("]", false, false, false);
            Class6065.method18094(this.field18244, Class6065.method18104(this.field18244).method24254());
        }
    }
}

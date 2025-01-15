// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4129 implements Class4119
{
    public final /* synthetic */ Class6065 field18251;
    
    private Class4129(final Class6065 field18251) {
        this.field18251 = field18251;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18251) instanceof Class6290)) {
            this.field18251.method18081(",", false, false, false);
            Label_0205: {
                if (!Class6065.method18102(this.field18251)) {
                    if (Class6065.method18109(this.field18251) <= Class6065.method18110(this.field18251) || !Class6065.method18111(this.field18251)) {
                        if (!Class6065.method18112(this.field18251)) {
                            break Label_0205;
                        }
                    }
                }
                this.field18251.method18082();
            }
            Class6065.method18104(this.field18251).method24253(new Class4129(this.field18251));
            Class6065.method18105(this.field18251, false, false, false);
        }
        else {
            Class6065.method18106(this.field18251, Class6065.method18107(this.field18251).method24254());
            Class6065.method18108(this.field18251);
            if (Class6065.method18102(this.field18251)) {
                this.field18251.method18081(",", false, false, false);
                this.field18251.method18082();
            }
            this.field18251.method18081("]", false, false, false);
            if (Class6065.method18112(this.field18251)) {
                this.field18251.method18082();
            }
            Class6065.method18094(this.field18251, Class6065.method18104(this.field18251).method24254());
        }
    }
}

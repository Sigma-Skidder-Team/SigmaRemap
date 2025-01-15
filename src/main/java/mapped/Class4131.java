// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4131 implements Class4119
{
    public final /* synthetic */ Class6065 field18253;
    
    private Class4131(final Class6065 field18253) {
        this.field18253 = field18253;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18253) instanceof Class6299)) {
            throw new Class2395("expected DocumentEndEvent, but got " + Class6065.method18093(this.field18253));
        }
        this.field18253.method18082();
        if (((Class6299)Class6065.method18093(this.field18253)).method18631()) {
            this.field18253.method18081("...", true, false, false);
            this.field18253.method18082();
        }
        this.field18253.method18078();
        Class6065.method18094(this.field18253, new Class4127(this.field18253, false));
    }
}

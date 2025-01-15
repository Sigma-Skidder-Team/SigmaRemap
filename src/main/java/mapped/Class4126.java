// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4126 implements Class4119
{
    public final /* synthetic */ Class6065 field18247;
    
    private Class4126(final Class6065 field18247) {
        this.field18247 = field18247;
    }
    
    @Override
    public void method12368() throws IOException {
        if (!(Class6065.method18093(this.field18247) instanceof Class6286)) {
            throw new Class2395("expected StreamStartEvent, but got " + Class6065.method18093(this.field18247));
        }
        this.field18247.method18079();
        Class6065.method18094(this.field18247, new Class4123(this.field18247, null));
    }
}

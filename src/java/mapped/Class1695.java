// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1695 extends Class1692
{
    private static String[] field9560;
    public final /* synthetic */ Class7810 field9561;
    
    public Class1695(final Class7810 field9561, final Class1682 class1682) {
        this.field9561 = field9561;
        super(class1682);
    }
    
    @Override
    public void close() throws IOException {
        this.field9561.field31999.method31368(false, this.field9561);
        super.close();
    }
}

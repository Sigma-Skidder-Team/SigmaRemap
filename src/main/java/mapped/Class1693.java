// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1693 extends Class1692
{
    private static String[] field9555;
    public final /* synthetic */ Class1668 field9556;
    public final /* synthetic */ Class1763 field9557;
    
    public Class1693(final Class1763 field9557, final Class1682 class1682, final Class1668 field9558) {
        this.field9557 = field9557;
        this.field9556 = field9558;
        super(class1682);
    }
    
    @Override
    public void close() throws IOException {
        this.field9556.close();
        super.close();
    }
}

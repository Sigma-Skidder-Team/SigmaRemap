// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1705 extends Class1704
{
    private static String[] field9587;
    public final /* synthetic */ Class9541 field9588;
    
    public Class1705(final Class9541 field9588, final Class1676 class1676) {
        this.field9588 = field9588;
        super(class1676);
    }
    
    @Override
    public void method6057(final IOException ex) {
        synchronized (this.field9588.field41075) {
            this.field9588.method35618();
        }
    }
}

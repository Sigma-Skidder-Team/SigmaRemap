// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public class Class1205 implements Runnable
{
    private static String[] field6531;
    public final /* synthetic */ UUID field6532;
    public final /* synthetic */ String field6533;
    public final /* synthetic */ Class6108 field6534;
    
    public Class1205(final Class6108 field6534, final UUID field6535, final String field6536) {
        this.field6534 = field6534;
        this.field6532 = field6535;
        this.field6533 = field6536;
    }
    
    @Override
    public void run() {
        if (!Class8563.method28793().method34753(this.field6532, Class300.method955('&', this.field6533))) {
            this.field6534.method18220().close();
        }
    }
}

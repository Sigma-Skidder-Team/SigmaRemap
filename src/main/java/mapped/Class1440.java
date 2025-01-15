// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public final class Class1440 implements Runnable
{
    private static String[] field7974;
    public final /* synthetic */ UUID field7975;
    
    public Class1440(final UUID field7975) {
        this.field7975 = field7975;
    }
    
    @Override
    public void run() {
        final String method20532 = Class6743.method20532(false);
        if (method20532 != null) {
            Class8563.method28793().method34747(new Class1100(this, method20532));
        }
    }
}

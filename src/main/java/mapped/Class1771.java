// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.IOException;

public class Class1771 extends Class1767
{
    private static String[] field9845;
    
    public Class1771() {
        super(Class568.method3319());
    }
    
    public Class1674 method6324(final Class6582 class6582) {
        final Class1728 method25740 = Class869.method5277().method5293().method25740();
        try (final InputStream method25741 = method25740.method6097(Class346.field2137, Class568.method3319())) {
            return new Class1674(null, Class1846.method6637(method25741));
        }
        catch (final IOException ex) {
            return new Class1674(ex);
        }
    }
}

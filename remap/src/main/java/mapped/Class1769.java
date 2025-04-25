// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.IOException;

public class Class1769 extends Class1767
{
    private static String[] field9828;
    
    public Class1769() {
        super(Class567.method3312());
    }
    
    @Override
    public Class1674 method6297(final Class6582 class6582) {
        final Class1728 method25740 = Minecraft.getInstance().method5293().method25740();
        try (final InputStream method25741 = method25740.method6097(Class346.field2137, Class567.method3312())) {
            return new Class1674(null, Class1846.method6637(method25741));
        }
        catch (final IOException ex) {
            return new Class1674(ex);
        }
    }
}

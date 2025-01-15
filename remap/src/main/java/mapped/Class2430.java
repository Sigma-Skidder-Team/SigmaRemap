// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PrivilegedAction;

public class Class2430 implements PrivilegedAction
{
    private static String[] field14372;
    public final /* synthetic */ Class8014 field14373;
    
    public Class2430(final Class8014 field14373) {
        this.field14373 = field14373;
    }
    
    @Override
    public Object run() {
        try {
            if (Class8014.method26258(this.field14373) != null) {
                Class8014.method26259(this.field14373, new Class7764(Class8014.method26260(this.field14373), Class8014.method26258(this.field14373)));
            }
            else {
                Class8014.method26259(this.field14373, new Class7764(Class8014.method26260(this.field14373)));
            }
        }
        catch (final Class2324 class2324) {
            Class8452.method28203(class2324);
            Class8014.method26261(this.field14373, null);
        }
        return null;
    }
}

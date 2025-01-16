// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class1202 implements Runnable
{
    public final /* synthetic */ Class9057 field6515;
    
    private Class1202(final Class9057 field6515) {
        this.field6515 = field6515;
    }
    
    @Override
    public void run() {
        if (Class9057.method32607(this.field6515)) {
            this.method5617();
        }
    }
    
    private void method5617() {
        try {
            final RealmsClient method35444 = RealmsClient.func_224911_a();
            if (method35444 != null) {
                final List<RealmsServer> field28626 = method35444.method35448().field28626;
                if (field28626 != null) {
                    Class9057.method32612(this.field6515, field28626);
                    Class9057.method32613(this.field6515, field28626);
                    Class9057.method32609(this.field6515).put(Class2099.field12163, true);
                }
                else {
                    Class9057.method32610().warn("Realms server list was null or empty");
                }
            }
        }
        catch (final Exception ex) {
            Class9057.method32609(this.field6515).put(Class2099.field12163, true);
            Class9057.method32610().error("Couldn't get server list", (Throwable)ex);
        }
    }
}

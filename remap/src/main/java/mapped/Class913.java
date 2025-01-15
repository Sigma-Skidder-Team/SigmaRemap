// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class Class913 extends Thread
{
    public final /* synthetic */ String field4873;
    public final /* synthetic */ int field4874;
    public final /* synthetic */ Class694 field4875;
    
    public Class913(final Class694 field4875, final String name, final String field4876, final int field4877) {
        this.field4875 = field4875;
        this.field4873 = field4876;
        this.field4874 = field4877;
        super(name);
    }
    
    @Override
    public void run() {
        InetAddress byName = null;
        try {
            if (Class694.method3875(this.field4875)) {
                return;
            }
            byName = InetAddress.getByName(this.field4873);
            Class694.method3876(this.field4875, NetworkManager.method11183(byName, this.field4874, this.field4875.field3150.field4648.method17129()));
            Class694.method3877(this.field4875).method11173(new Class5808(Class694.method3877(this.field4875), this.field4875.field3150, Class694.method3878(this.field4875), class2250 -> Class694.method3880(this.field4875, class2250)));
            Class694.method3877(this.field4875).method11174(new Class4398(this.field4873, this.field4874, Class2208.field13457));
            Class694.method3877(this.field4875).method11174(new Class4327(this.field4875.field3150.method5287().method33694()));
        }
        catch (final UnknownHostException ex) {
            if (Class694.method3875(this.field4875)) {
                return;
            }
            goto Label_0171;
        }
        catch (final Exception ex2) {
            if (Class694.method3875(this.field4875)) {
                return;
            }
            Class694.method3879().error("Couldn't connect to server", (Throwable)ex2);
            if (byName == null) {
                ex2.toString();
            }
            else {
                ex2.toString().replaceAll(byName + ":" + this.field4874, "");
            }
            this.field4875.field3150.execute(() -> {
                final Class869 field3150 = this.field4875.field3150;
                new(mapped.Class735.class)();
                Class694.method3878(this.field4875);
                new Class2259("disconnect.genericReason", new Object[] { s });
                final Class2259 class2251;
                final Class527 class2253;
                final String s2;
                new Class735(class2253, s2, class2251);
                final Class527 class2252;
                field3150.method5244(class2252);
            });
        }
    }
}

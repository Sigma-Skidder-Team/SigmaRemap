// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class Class921 extends Thread
{
    public final /* synthetic */ String field4898;
    public final /* synthetic */ int field4899;
    public final /* synthetic */ Class9019 field4900;
    
    public Class921(final Class9019 field4900, final String name, final String field4901, final int field4902) {
        this.field4900 = field4900;
        this.field4898 = field4901;
        this.field4899 = field4902;
        super(name);
    }
    
    @Override
    public void run() {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName(this.field4898);
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32311(this.field4900, Class3641.method11183(byName, this.field4899, Class869.method5277().field4648.method17129()));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11173(new Class5808(Class9019.method32312(this.field4900), Class869.method5277(), Class9019.method32313(this.field4900).method15403(), p0 -> {}));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11174(new Class4398(this.field4898, this.field4899, Class2208.field13457));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11174(new Class4327(Class869.method5277().method5287().method33694()));
        }
        catch (final UnknownHostException ex) {
            Class7847.method25371();
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            goto Label_0200;
        }
        catch (final Exception ex2) {
            Class7847.method25371();
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32314().error("Couldn't connect to world", (Throwable)ex2);
            String s = ex2.toString();
            if (byName != null) {
                s = s.replaceAll(byName + ":" + this.field4899, "");
            }
            Class7847.method25362(new Class5070(Class9019.method32313(this.field4900), "connect.failed", new Class2259("disconnect.genericReason", new Object[] { s })));
        }
    }
}

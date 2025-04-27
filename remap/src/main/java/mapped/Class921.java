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
            Class9019.method32311(this.field4900, NetworkManager.method11183(byName, this.field4899, Minecraft.getInstance().gameSettings.method17129()));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11173(new ClientLoginNetHandler(Class9019.method32312(this.field4900), Minecraft.getInstance(), Class9019.method32313(this.field4900).method15403(), p0 -> {}));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11174(new Class4398(this.field4898, this.field4899, Class2208.field13457));
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32312(this.field4900).method11174(new Class4327(Minecraft.getInstance().method5287().getProfile()));
        }
        catch (final UnknownHostException ex) {
            Realms.method25371();
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            goto Label_0200;
        }
        catch (final Exception ex2) {
            Realms.method25371();
            if (Class9019.method32310(this.field4900)) {
                return;
            }
            Class9019.method32314().error("Couldn't connect to world", (Throwable)ex2);
            String s = ex2.toString();
            if (byName != null) {
                s = s.replaceAll(byName + ":" + this.field4899, "");
            }
            Realms.setScreen(new Class5070(Class9019.method32313(this.field4900), "connect.failed", new Class2259("disconnect.genericReason", s)));
        }
    }
}

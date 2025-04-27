// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.net.InetAddress;

public class Class921 extends Thread {
    public final /* synthetic */ String field4898;
    public final /* synthetic */ int field4899;
    public final /* synthetic */ Class9019 field4900;

    public Class921(final Class9019 field4900, final String name, final String field4901, final int field4902) {
        super(name);
        this.field4900 = field4900;
        this.field4898 = field4901;
        this.field4899 = field4902;
    }

    @Override
    public void run() {
        InetAddress byName = null;
        try {
            byName = InetAddress.getByName(this.field4898);
        } catch (final UnknownHostException ex) {
            Realms.method25371();
        } catch (final Exception ex2) {
            Realms.method25371();
            String s = ex2.toString();
            if (byName != null) {
                s = s.replaceAll(byName + ":" + this.field4899, "");
            }
        }
    }
}

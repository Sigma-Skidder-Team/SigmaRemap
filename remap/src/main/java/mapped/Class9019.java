// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9019
{
    private static final Logger field38057;
    private final RealmsScreen field38058;
    private volatile boolean field38059;
    private NetworkManager field38060;
    
    public Class9019(final RealmsScreen field38058) {
        this.field38058 = field38058;
    }
    
    public void method32307(final String s, final int n) {
        Realms.method25369(true);
        Realms.narrateNow(Realms.method25379("mco.connect.success"));
        new Class921(this, "Realms-connect-task", s, n).start();
    }
    
    public void method32308() {
        this.field38059 = true;
        if (this.field38060 != null) {
            if (this.field38060.method11187()) {
                this.field38060.method11181(new Class2259("disconnect.genericReason"));
                this.field38060.method11193();
            }
        }
    }
    
    public void method32309() {
        if (this.field38060 != null) {
            if (!this.field38060.method11187()) {
                this.field38060.method11193();
            }
            else {
                this.field38060.method11179();
            }
        }
    }
    
    static {
        field38057 = LogManager.getLogger();
    }
}

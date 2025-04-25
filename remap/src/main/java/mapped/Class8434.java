// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

import java.util.Date;
import java.util.HashMap;

public class Class8434
{
    private static String[] field34664;
    private Minecraft field34665;
    private HashMap<Integer, Date> field34666;
    
    public Class8434() {
        this.field34665 = Minecraft.getInstance();
        this.field34666 = new HashMap<Integer, Date>();
    }
    
    public void method28160() {
        Client.getInstance().getEventBus().register2(this);
    }
    
    @EventListener
    private void method28161(final Class5723 class5723) {
        if (class5723.method16998() instanceof Class4272) {
            final Class4272 class5724 = (Class4272)class5723.method16998();
            if (class5724.method12819() != 0) {
                return;
            }
            this.field34666.put(class5724.method12820(), new Date());
        }
    }
    
    public long method28162(final int n) {
        if (n == -1) {
            return 0L;
        }
        if (this.field34666.containsKey(n)) {
            return System.currentTimeMillis() - this.field34666.get(n).getTime();
        }
        return 2147483647L;
    }
}

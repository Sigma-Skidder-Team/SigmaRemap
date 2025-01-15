// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class4671 implements Class4659
{
    public final /* synthetic */ Class4666 field20199;
    
    public Class4671(final Class4666 field20199) {
        this.field20199 = field20199;
    }
    
    @Override
    public void method13945(final Object... array) {
        if (!this.field20199.field20183[0]) {
            final Class8437 class8437 = (Class8437)array[0];
            if ("pong".equals(class8437.field34678) && "probe".equals(class8437.field34679)) {
                if (Class4968.method15143().isLoggable(Level.FINE)) {
                    Class4968.method15143().fine(String.format("probe transport '%s' pong", this.field20199.field20184));
                }
                Class4968.method15144(this.field20199.field20186, true);
                this.field20199.field20186.method14942("upgrading", this.field20199.field20185[0]);
                if (null == this.field20199.field20185[0]) {
                    return;
                }
                Class4968.method15145("websocket".equals(this.field20199.field20185[0].field21319));
                if (Class4968.method15143().isLoggable(Level.FINE)) {
                    Class4968.method15143().fine(String.format("pausing current transport '%s'", this.field20199.field20186.field21422.field21319));
                }
                ((Class4965)this.field20199.field20186.field21422).method15016(new Class1314(this));
            }
            else {
                if (Class4968.method15143().isLoggable(Level.FINE)) {
                    Class4968.method15143().fine(String.format("probe transport '%s' failed", this.field20199.field20184));
                }
                final Class2347 class8438 = new Class2347("probe error");
                class8438.field14130 = this.field20199.field20185[0].field21319;
                this.field20199.field20186.method14942("upgradeError", class8438);
            }
        }
    }
}

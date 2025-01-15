// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class1068 implements Runnable
{
    public final /* synthetic */ Class939 field5749;
    
    public Class1068(final Class939 field5749) {
        this.field5749 = field5749;
    }
    
    @Override
    public void run() {
        if (Class4968.method15143().isLoggable(Level.FINE)) {
            Class4968.method15143().fine(String.format("writing ping packet - expecting pong within %sms", Class4968.method15148(this.field5749.field4953)));
        }
        Class4968.method15149(this.field5749.field4953);
        Class4968.method15132(this.field5749.field4953, Class4968.method15148(this.field5749.field4953));
    }
}

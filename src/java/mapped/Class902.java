// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class902 extends Thread
{
    public final /* synthetic */ Class5079 field4853;
    
    public Class902(final Class5079 field4853, final String name) {
        this.field4853 = field4853;
        super(name);
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        try {
            if (method35444.method35454()) {
                Class9513.method35447();
                Class5079.method15819().info("Switched to local");
                Class5079.method15822().method32593();
            }
        }
        catch (final Class2330 obj) {
            Class5079.method15819().error("Couldn't connect to Realms: " + obj);
        }
        catch (final IOException ex) {
            Class5079.method15819().error("Couldn't parse response connecting to Realms: " + ex.getMessage());
        }
    }
}

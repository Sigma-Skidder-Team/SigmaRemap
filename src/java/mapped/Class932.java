// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class932 extends Thread
{
    public final /* synthetic */ Class5079 field4919;
    
    public Class932(final Class5079 field4919, final String name) {
        this.field4919 = field4919;
        super(name);
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        try {
            if (method35444.method35453()) {
                Class5079.method15819().info("Realms is available for this user");
                Class5079.method15820(true);
            }
            else {
                Class5079.method15819().info("Realms is not available for this user");
                Class5079.method15820(false);
                Class7847.method25362(new Class5068(Class5079.method15811(this.field4919)));
            }
            Class5079.method15821(true);
        }
        catch (final Class2330 class2330) {
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)class2330.toString());
            Class7847.method25362(new Class5074(class2330, Class5079.method15811(this.field4919)));
        }
        catch (final IOException ex) {
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)ex.getMessage());
            Class7847.method25362(new Class5074(ex.getMessage(), Class5079.method15811(this.field4919)));
        }
    }
}

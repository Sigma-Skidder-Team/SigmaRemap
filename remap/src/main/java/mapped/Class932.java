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
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            if (method35444.method35453()) {
                Class5079.method15819().info("Realms is available for this user");
                Class5079.method15820(true);
            }
            else {
                Class5079.method15819().info("Realms is not available for this user");
                Class5079.method15820(false);
                Realms.setScreen(new Class5068(Class5079.method15811(this.field4919)));
            }
            Class5079.method15821(true);
        }
        catch (final RealmsServiceException class2330) {
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)class2330.toString());
            Realms.setScreen(new RealmsGenericErrorScreen(class2330, Class5079.method15811(this.field4919)));
        }
        catch (final IOException ex) {
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)ex.getMessage());
            Realms.setScreen(new RealmsGenericErrorScreen(ex.getMessage(), Class5079.method15811(this.field4919)));
        }
    }
}

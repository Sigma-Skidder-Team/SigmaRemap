// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class908 extends Thread
{
    public final /* synthetic */ Class5079 field4863;
    
    public Class908(final Class5079 field4863, final String name) {
        this.field4863 = field4863;
        super(name);
    }
    
    @Override
    public void run() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            final Class2112 method35445 = method35444.method35455();
            if (method35445.equals(Class2112.field12287)) {
                Class5079.method15815(new Class5090(Class5079.method15811(this.field4863), true));
                Realms.setScreen(Class5079.method15816());
            }
            else if (method35445.equals(Class2112.field12288)) {
                Class5079.method15815(new Class5090(Class5079.method15811(this.field4863), false));
                Realms.setScreen(Class5079.method15816());
            }
            else {
                Class5079.method15817(this.field4863);
            }
        }
        catch (final RealmsServiceException class2330) {
            Class5079.method15818(false);
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)class2330.toString());
            if (class2330.field14069 == 401) {
                Class5079.method15815(new RealmsGenericErrorScreen(RealmsScreen.getLocalizedString("mco.error.invalid.session.title"), "Please login to your account through the launcher to use Realms", Class5079.method15811(this.field4863)));
                Realms.setScreen(Class5079.method15816());
            }
            else {
                Realms.setScreen(new RealmsGenericErrorScreen(class2330, Class5079.method15811(this.field4863)));
            }
        }
        catch (final IOException ex) {
            Class5079.method15818(false);
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)ex.getMessage());
            Realms.setScreen(new RealmsGenericErrorScreen(ex.getMessage(), Class5079.method15811(this.field4863)));
        }
    }
}

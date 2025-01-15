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
        final Class9513 method35444 = Class9513.method35444();
        try {
            final Class2112 method35445 = method35444.method35455();
            if (method35445.equals(Class2112.field12287)) {
                Class5079.method15815(new Class5090(Class5079.method15811(this.field4863), true));
                Class7847.method25362(Class5079.method15816());
            }
            else if (method35445.equals(Class2112.field12288)) {
                Class5079.method15815(new Class5090(Class5079.method15811(this.field4863), false));
                Class7847.method25362(Class5079.method15816());
            }
            else {
                Class5079.method15817(this.field4863);
            }
        }
        catch (final Class2330 class2330) {
            Class5079.method15818(false);
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)class2330.toString());
            if (class2330.field14069 == 401) {
                Class5079.method15815(new Class5074(Class5046.method15438("mco.error.invalid.session.title"), "Please login to your account through the launcher to use Realms", Class5079.method15811(this.field4863)));
                Class7847.method25362(Class5079.method15816());
            }
            else {
                Class7847.method25362(new Class5074(class2330, Class5079.method15811(this.field4863)));
            }
        }
        catch (final IOException ex) {
            Class5079.method15818(false);
            Class5079.method15819().error("Couldn't connect to realms: ", (Object)ex.getMessage());
            Class7847.method25362(new Class5074(ex.getMessage(), Class5079.method15811(this.field4863)));
        }
    }
}

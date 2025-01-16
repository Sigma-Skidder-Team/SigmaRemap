// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class927 extends Thread
{
    public final /* synthetic */ RealmsMainScreen field4911;
    
    public Class927(final RealmsMainScreen field4911, final String name) {
        this.field4911 = field4911;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            final RealmsServer method15807 = RealmsMainScreen.method15807(this.field4911, RealmsMainScreen.method15806(this.field4911));
            if (method15807 != null) {
                RealmsClient.func_224911_a().method35457(method15807.id);
                RealmsMainScreen.method15822().method32604(method15807);
                RealmsMainScreen.method15823(this.field4911).remove(method15807);
                RealmsMainScreen.method15824(this.field4911).method15535().removeIf(class2331 -> class2331 instanceof Class626 && ((Class626)class2331).field3607.id == RealmsMainScreen.method15806(this.field4911));
                RealmsMainScreen.method15824(this.field4911).method15519(-1);
                RealmsMainScreen.method15825(this.field4911, null);
                RealmsMainScreen.method15826(this.field4911, -1L);
                RealmsMainScreen.method15827(this.field4911).method16917(false);
            }
        }
        catch (final RealmsServiceException class2330) {
            RealmsMainScreen.method15819().error("Couldn't configure world");
            Realms.setScreen(new RealmsGenericErrorScreen(class2330, this.field4911));
        }
    }
}

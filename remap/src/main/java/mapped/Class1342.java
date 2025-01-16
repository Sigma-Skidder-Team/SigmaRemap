// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1342 extends LongRunningTask
{
    private final Class7437 field7348;
    private final RealmsScreen field7349;
    private final boolean field7350;
    private final RealmsScreen field7351;
    
    public Class1342(final Class7437 field7348, final RealmsScreen field7349, final RealmsScreen field7350, final boolean field7351) {
        this.field7348 = field7348;
        this.field7349 = field7349;
        this.field7350 = field7351;
        this.field7351 = field7350;
    }
    
    @Override
    public void run() {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.configure.world.opening"));
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        for (int i = 0; i < 25; ++i) {
            if (this.func_224988_a()) {
                return;
            }
            try {
                if (method35444.method35468(this.field7348.field28675)) {
                    if (this.field7349 instanceof RealmsConfigureWorldScreen) {
                        ((RealmsConfigureWorldScreen)this.field7349).method15707();
                    }
                    this.field7348.field28679 = Class2153.field12792;
                    if (this.field7350) {
                        ((Class5079)this.field7351).method15781(this.field7348, this.field7349);
                    }
                    else {
                        Realms.setScreen(this.field7349);
                    }
                    break;
                }
                continue;
            }
            catch (final RetryCallException class2331) {
                if (this.func_224988_a()) {
                    return;
                }
                goto Label_0138;
            }
            catch (final Exception ex) {
                if (this.func_224988_a()) {
                    return;
                }
            }
            final Exception ex;
            RealmsTasks.getLogger().error("Failed to open server", (Throwable)ex);
            this.func_224986_a("Failed to open the server");
        }
    }
}

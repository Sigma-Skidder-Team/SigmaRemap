// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class Class1341 extends LongRunningTask
{
    private final RealmsServer field7344;
    private final RealmsScreen field7345;
    private final RealmsMainScreen field7346;
    private final ReentrantLock field7347;
    
    public Class1341(final RealmsMainScreen field7346, final RealmsScreen field7347, final RealmsServer field7348, final ReentrantLock field7349) {
        this.field7345 = field7347;
        this.field7346 = field7346;
        this.field7344 = field7348;
        this.field7347 = field7349;
    }
    
    @Override
    public void run() {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.connect.connecting"));
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        boolean b = false;
        boolean b2 = false;
        int field14073 = 5;
        Class7428 method35445 = null;
        boolean b3 = false;
        boolean b4 = false;
        for (int n = 0; n < 40 && !this.func_224988_a(); ++n) {
            try {
                method35445 = method35444.method35451(this.field7344.id);
                b = true;
            }
            catch (final RetryCallException class2331) {
                field14073 = class2331.field_224985_e;
            }
            catch (final RealmsServiceException class2332) {
                if (class2332.field14071 == 6002) {
                    b3 = true;
                }
                else if (class2332.field14071 == 6006) {
                    b4 = true;
                }
                else {
                    b2 = true;
                    this.func_224986_a(class2332.toString());
                    RealmsTasks.getLogger().error("Couldn't connect to world", class2332);
                }
                break;
            }
            catch (final IOException ex) {
                RealmsTasks.getLogger().error("Couldn't parse response connecting to world", ex);
            }
            catch (final Exception ex2) {
                b2 = true;
                RealmsTasks.getLogger().error("Couldn't connect to world", ex2);
                this.func_224986_a(ex2.getLocalizedMessage());
                break;
            }
            if (b) {
                break;
            }
            this.method5628(field14073);
        }
        if (b3) {
            Realms.setScreen(new Class5091(this.field7345, this.field7346, this.field7344));
        }
        else if (b4) {
            if (this.field7344.field28681.equals(Realms.method25357())) {
                final Class5087 class2333 = new Class5087(this.field7345, this.field7346, this.field7344.id);
                if (this.field7344.field28687.equals(Class271.field1472)) {
                    class2333.method15930(RealmsScreen.getLocalizedString("mco.brokenworld.minigame.title"));
                }
                Realms.setScreen(class2333);
            }
            else {
                Realms.setScreen(new RealmsGenericErrorScreen(RealmsScreen.getLocalizedString("mco.brokenworld.nonowner.title"), RealmsScreen.getLocalizedString("mco.brokenworld.nonowner.error"), this.field7345));
            }
        }
        else if (!this.func_224988_a() && !b2) {
            if (b) {
                if (method35445.field28642 != null && method35445.field28643 != null) {
                    Realms.setScreen(new Class5084(new Class5048(this.field7345, method35445, this.field7347), Class2039.field11628, RealmsScreen.getLocalizedString("mco.configure.world.resourcepack.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.resourcepack.question.line2"), true, 100));
                }
                else {
                    final Class5049 class2334 = new Class5049(this.field7345, new Class1343(this.field7345, method35445));
                    class2334.method15466();
                    Realms.setScreen(class2334);
                }
            }
            else {
                this.func_224986_a(RealmsScreen.getLocalizedString("mco.errorMessage.connectionFailure"));
            }
        }
    }
    
    private void method5628(final int n) {
        try {
            Thread.sleep(n * 1000L);
        }
        catch (final InterruptedException ex) {
            RealmsTasks.getLogger().warn(ex.getLocalizedMessage());
        }
    }
}

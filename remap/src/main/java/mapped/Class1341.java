// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public class Class1341 extends Class1334
{
    private final Class7437 field7344;
    private final Class5046 field7345;
    private final Class5079 field7346;
    private final ReentrantLock field7347;
    
    public Class1341(final Class5079 field7346, final Class5046 field7347, final Class7437 field7348, final ReentrantLock field7349) {
        this.field7345 = field7347;
        this.field7346 = field7346;
        this.field7344 = field7348;
        this.field7347 = field7349;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.connect.connecting"));
        final Class9513 method35444 = Class9513.method35444();
        boolean b = false;
        boolean b2 = false;
        int field14073 = 5;
        Class7428 method35445 = null;
        boolean b3 = false;
        boolean b4 = false;
        for (int n = 0; n < 40 && !this.method5622(); ++n) {
            try {
                method35445 = method35444.method35451(this.field7344.field28675);
                b = true;
            }
            catch (final Class2331 class2331) {
                field14073 = class2331.field14073;
            }
            catch (final Class2330 class2332) {
                if (class2332.field14071 == 6002) {
                    b3 = true;
                }
                else if (class2332.field14071 == 6006) {
                    b4 = true;
                }
                else {
                    b2 = true;
                    this.method5620(class2332.toString());
                    Class8593.method29100().error("Couldn't connect to world", (Throwable)class2332);
                }
                break;
            }
            catch (final IOException ex) {
                Class8593.method29100().error("Couldn't parse response connecting to world", (Throwable)ex);
            }
            catch (final Exception ex2) {
                b2 = true;
                Class8593.method29100().error("Couldn't connect to world", (Throwable)ex2);
                this.method5620(ex2.getLocalizedMessage());
                break;
            }
            if (b) {
                break;
            }
            this.method5628(field14073);
        }
        if (b3) {
            Class7847.method25362(new Class5091(this.field7345, this.field7346, this.field7344));
        }
        else if (b4) {
            if (this.field7344.field28681.equals(Class7847.method25357())) {
                final Class5087 class2333 = new Class5087(this.field7345, this.field7346, this.field7344.field28675);
                if (this.field7344.field28687.equals(Class271.field1472)) {
                    class2333.method15930(Class5046.method15438("mco.brokenworld.minigame.title"));
                }
                Class7847.method25362(class2333);
            }
            else {
                Class7847.method25362(new Class5074(Class5046.method15438("mco.brokenworld.nonowner.title"), Class5046.method15438("mco.brokenworld.nonowner.error"), this.field7345));
            }
        }
        else if (!this.method5622() && !b2) {
            if (b) {
                if (method35445.field28642 != null && method35445.field28643 != null) {
                    Class7847.method25362(new Class5084(new Class5048(this.field7345, method35445, this.field7347), Class2039.field11628, Class5046.method15438("mco.configure.world.resourcepack.question.line1"), Class5046.method15438("mco.configure.world.resourcepack.question.line2"), true, 100));
                }
                else {
                    final Class5049 class2334 = new Class5049(this.field7345, new Class1343(this.field7345, method35445));
                    class2334.method15466();
                    Class7847.method25362(class2334);
                }
            }
            else {
                this.method5620(Class5046.method15438("mco.errorMessage.connectionFailure"));
            }
        }
    }
    
    private void method5628(final int n) {
        try {
            Thread.sleep(n * 1000);
        }
        catch (final InterruptedException ex) {
            Class8593.method29100().warn(ex.getLocalizedMessage());
        }
    }
}

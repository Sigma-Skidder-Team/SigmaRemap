// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1336 extends Class1334
{
    private final long field7323;
    private final Class7430 field7324;
    private final Class5076 field7325;
    
    public Class1336(final long field7323, final Class7430 field7324, final Class5076 field7325) {
        this.field7323 = field7323;
        this.field7324 = field7324;
        this.field7325 = field7325;
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        this.method5621(Class5046.method15438("mco.minigame.world.starting.screen.title"));
        for (int i = 0; i < 25; ++i) {
            try {
                if (this.method5622()) {
                    return;
                }
                if (method35444.method35465(this.field7323, this.field7324.field28649)) {
                    Class7847.method25362(this.field7325);
                    break;
                }
                continue;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0083;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            Class8593.method29100().error("Couldn't start mini game!");
            final Exception ex;
            this.method5620(ex.toString());
        }
    }
}

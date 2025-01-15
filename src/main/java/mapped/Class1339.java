// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1339 extends Class1334
{
    private final Class7437 field7334;
    private final Class5076 field7335;
    
    public Class1339(final Class7437 field7334, final Class5076 field7335) {
        this.field7334 = field7334;
        this.field7335 = field7335;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.configure.world.closing"));
        final Class9513 method35444 = Class9513.method35444();
        for (int i = 0; i < 25; ++i) {
            if (this.method5622()) {
                return;
            }
            try {
                if (method35444.method35469(this.field7334.field28675)) {
                    this.field7335.method15707();
                    this.field7334.field28679 = Class2153.field12791;
                    Class7847.method25362(this.field7335);
                    break;
                }
                continue;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0096;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            final Exception ex;
            Class8593.method29100().error("Failed to close server", (Throwable)ex);
            this.method5620("Failed to close the server");
        }
    }
}

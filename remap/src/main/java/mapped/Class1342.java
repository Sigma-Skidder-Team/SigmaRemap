// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1342 extends Class1334
{
    private final Class7437 field7348;
    private final Class5046 field7349;
    private final boolean field7350;
    private final Class5046 field7351;
    
    public Class1342(final Class7437 field7348, final Class5046 field7349, final Class5046 field7350, final boolean field7351) {
        this.field7348 = field7348;
        this.field7349 = field7349;
        this.field7350 = field7351;
        this.field7351 = field7350;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.configure.world.opening"));
        final Class9513 method35444 = Class9513.method35444();
        for (int i = 0; i < 25; ++i) {
            if (this.method5622()) {
                return;
            }
            try {
                if (method35444.method35468(this.field7348.field28675)) {
                    if (this.field7349 instanceof Class5076) {
                        ((Class5076)this.field7349).method15707();
                    }
                    this.field7348.field28679 = Class2153.field12792;
                    if (this.field7350) {
                        ((Class5079)this.field7351).method15781(this.field7348, this.field7349);
                    }
                    else {
                        Class7847.method25362(this.field7349);
                    }
                    break;
                }
                continue;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0138;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            final Exception ex;
            Class8593.method29100().error("Failed to open server", (Throwable)ex);
            this.method5620("Failed to open the server");
        }
    }
}

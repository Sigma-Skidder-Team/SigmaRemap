// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1340 extends Class1334
{
    private final String field7336;
    private final Class7430 field7337;
    private final int field7338;
    private final boolean field7339;
    private final long field7340;
    private final Class5046 field7341;
    private int field7342;
    private String field7343;
    
    public Class1340(final long field7340, final Class5046 field7341, final Class7430 field7342) {
        this.field7342 = -1;
        this.field7343 = Class5046.method15438("mco.reset.world.resetting.screen.title");
        this.field7336 = null;
        this.field7337 = field7342;
        this.field7338 = -1;
        this.field7339 = true;
        this.field7340 = field7340;
        this.field7341 = field7341;
    }
    
    public Class1340(final long field7340, final Class5046 field7341, final String field7342, final int field7343, final boolean field7344) {
        this.field7342 = -1;
        this.field7343 = Class5046.method15438("mco.reset.world.resetting.screen.title");
        this.field7336 = field7342;
        this.field7337 = null;
        this.field7338 = field7343;
        this.field7339 = field7344;
        this.field7340 = field7340;
        this.field7341 = field7341;
    }
    
    public void method5626(final int field7342) {
        this.field7342 = field7342;
    }
    
    public void method5627(final String field7343) {
        this.field7343 = field7343;
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        this.method5621(this.field7343);
        if (0 < 25) {
            try {
                if (this.method5622()) {
                    return;
                }
                if (this.field7337 != null) {
                    method35444.method35471(this.field7340, this.field7337.field28649);
                }
                else {
                    method35444.method35470(this.field7340, this.field7336, this.field7338, this.field7339);
                }
                if (this.method5622()) {
                    return;
                }
                if (this.field7342 == -1) {
                    Class7847.method25362(this.field7341);
                }
                else {
                    this.field7341.method15437(true, this.field7342);
                }
                return;
            }
            catch (final Class2331 class2331) {
                if (this.method5622()) {
                    return;
                }
                goto Label_0135;
            }
            catch (final Exception ex) {
                if (this.method5622()) {
                    return;
                }
            }
            Class8593.method29100().error("Couldn't reset world");
            final Exception ex;
            this.method5620(ex.toString());
        }
    }
}

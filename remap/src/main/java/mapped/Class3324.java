// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3324 extends Class3167
{
    public Class3324() {
        super(Class8013.field32986, "Regen", "Regenerates hearts faster than ever (1.8 only)");
        this.method9881(new Class4996("Packet amount", "Number of packets sent", 50.0f, Float.class, 1.0f, 100.0f, 1.0f));
        this.method9881(new Class4999("Only OnGround", "Regen only when on ground", false));
    }
    
    @Class6753
    private void method10527(final Class5743 class5743) {
        if (this.method9906()) {
            if (!Class3324.field15514.player.field3025.field27304) {
                if (Class3324.field15514.player.method2877().method33491() > 17) {
                    if (Class3324.field15514.player.method2664() < 20.0f) {
                        if (Class3324.field15514.player.method2664() != 0.0f) {
                            if (Class3324.field15514.player.onGround || !this.method9883("Only OnGround")) {
                                for (int n = 0; n < this.method9886("Packet amount"); ++n) {
                                    Class3324.field15514.method5269().method17292(new Class4353(Class3324.field15514.player.onGround));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3275 extends Class3167
{
    private double[] field15769;
    private boolean field15770;
    
    public Class3275() {
        super(Class8013.field32985, "AutoSprint", "Sprints for you");
        this.field15769 = new double[] { 0.0, 0.0 };
        this.method9881(new Class4999("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }
    
    @Class6753
    public void method10320(final Class5743 class5743) {
        if (this.method9906()) {
            final Class3167 field15743 = ((Class3247)Class9463.method35173().method35189().method21551(Class3260.class)).field15743;
            if (field15743 != null) {
                if (field15743.method9906()) {
                    if (field15743 instanceof Class3212) {
                        if (!field15743.method9883("Haphe (AACAP)")) {
                            return;
                        }
                    }
                }
            }
            if (Class3275.field15514.player.field2970 > 0.0f && !((Class3260)Class9463.method35173().method35189().method21551(Class3260.class)).method10278()) {
                Class3275.field15514.player.method1816(true);
            }
            else {
                Class3275.field15514.player.method1816(false);
            }
        }
    }
    
    @Class6753
    public void method10321(final Class5735 class5735) {
        if (this.method9906()) {
            if (Class3275.field15514.player.field2970 > 0.0f) {
                if (!Class3275.field15514.player.method2756() || Class3275.field15514.player.method2766().getItem() != Items.field31279) {
                    if (!((Class3260)Class9463.method35173().method35189().method21551(Class3260.class)).method10278()) {
                        class5735.field23300 = (float)((Class3275.field15514.player.method2710(Class8107.field33408).method23940() + 0.029999999329447746 + 0.015f * Class7482.method23139()) / Class3275.field15514.player.field3025.method21427() + 1.0) / 2.0f;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10322(final Class5750 class5750) {
        if (this.method9906() && this.method9883("Keep Sprint")) {
            if (!class5750.method17059()) {
                if (this.field15769.length == 2) {
                    final double n = this.field15769[0] - Class3275.field15514.player.getMotion().x;
                    final double n2 = this.field15769[1] - Class3275.field15514.player.getMotion().z;
                    if (n != 0.0 || n2 != 0.0) {
                        Class3275.field15514.player.setMotion(this.field15769[0], Class3275.field15514.player.getMotion().y, this.field15769[1]);
                    }
                    if (this.field15770) {
                        if (!Class3275.field15514.player.method1815()) {
                            Class3275.field15514.player.method1816(true);
                        }
                    }
                }
            }
            else {
                this.field15769[0] = Class3275.field15514.player.getMotion().x;
                this.field15769[1] = Class3275.field15514.player.getMotion().z;
                this.field15770 = Class3275.field15514.player.method1815();
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3218 extends Class3167
{
    private double field15667;
    private float field15668;
    private float field15669;
    private boolean field15670;
    private float field15671;
    private float field15672;
    public int field15673;
    
    public Class3218() {
        super(Class8013.field32990, "TestSpeed", "Legit Sprint jumping.");
        this.field15672 = 1.0f;
        this.field15673 = 0;
        this.method9881(new Class4999("Sprint", "Sprints when walking", true));
        this.method9881(new Class4999("AutoJump", "Automatically jumps for you.", true));
    }
    
    @Class6753
    public void method10141(final Class5744 class5744) {
        if (this.method9906()) {
            if (Class3218.field15514.field4684 != null) {
                if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                    if (Class3218.field15514.field4684.onGround) {
                        if (class5744.method17046()) {
                            class5744.method17037(class5744.method17036() + 1.0E-14);
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10142(final Class5717 class5717) {
        if (this.method9906()) {
            if (Class3218.field15514.field4684.onGround) {
                if (Class3218.field15514.field4684.collidedVertically) {
                    if (Class3218.field15514.field4684.field2970 != 0.0f || Class3218.field15514.field4684.field2968 != 0.0f) {
                        if (this.method9883("AutoJump")) {
                            Class3218.field15514.field4684.method2725();
                            class5717.method16973(Class3218.field15514.field4684.getMotion().x);
                            class5717.method16975(Class3218.field15514.field4684.getMotion().y);
                            class5717.method16977(Class3218.field15514.field4684.getMotion().z);
                        }
                    }
                }
            }
            final double field22771 = class5717.method16978().y;
            class5717.method16978().y = 0.0;
            final double method16752 = class5717.method16978().length();
            class5717.method16978().y = field22771;
            this.field15671 = Class7482.method23153(class5717, method16752, Class7482.method23144()[0], this.field15671, 45.0f);
            if (this.field15668 != 0.0f || this.field15669 != 0.0f) {
                this.field15668 *= (float)0.85;
                this.field15669 *= (float)0.85;
                this.field15672 = Math.min(1.0f, this.field15672 + 0.1f);
            }
            if (Class3218.field15514.field4684.onGround) {
                if (!this.field15670) {
                    this.field15668 = 0.0f;
                    this.field15669 = 0.0f;
                    this.field15672 = Math.min(1.0f, this.field15672 + 0.33f);
                }
            }
            this.field15670 = false;
            ++this.field15673;
        }
    }
    
    @Class6753
    @Class6759
    public void method10143(final Class5722 class5722) {
        if (this.method9906()) {
            if (!Class3295.method10433()) {
                if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                    if (Class3218.field15514.field4648.field23439.method1056() && Class9463.method35173().method35189().method21551(Class3260.class).method9906()) {
                        return;
                    }
                    this.field15671 = Class7482.method23144()[0];
                    this.field15673 = 0;
                    class5722.method16996(class5722.method16994().length() * 1.0499999523162842);
                }
            }
        }
    }
    
    @Class6753
    private void method10144(final Class5723 class5723) {
        if (this.method9906()) {
            if (Class3218.field15514.field4684 != null) {
                if (class5723.method16998() instanceof Class4273) {
                    if (((Class4273)class5723.method16998()).method12822() != Class3218.field15514.field4684.getEntityId()) {}
                }
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3221 extends Class3167
{
    private boolean field15679;
    
    public Class3221() {
        super(Class8013.field32990, "NoSlow", "Stops slowdown when using an item");
        this.method9881(new Class5001("Mode", "NoSlow mode", 0, new String[] { "Vanilla", "NCP" }));
    }
    
    @Class6753
    private void method10155(final Class5728 class5728) {
        if (this.method9906()) {
            class5728.method16961(true);
        }
    }
    
    @Class6753
    private void method10156(final Class5744 class5744) {
        if (this.method9906()) {
            final boolean method9898 = Class9463.method35173().method35189().method21551(Class3376.class).method9898();
            final boolean b = Class3221.field15514.field4684.getHeldItemMainhand() != null && Class3221.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4077;
            if (!class5744.method17046()) {
                if (b) {
                    if (Class3221.field15514.field4648.field23445.method1056()) {
                        if (!this.field15679) {
                            if (!method9898) {
                                if (this.method9887("Mode").equals("NCP")) {
                                    Class6430.method19163();
                                    this.field15679 = true;
                                    return;
                                }
                            }
                        }
                    }
                }
                if (!b) {
                    if (this.field15679) {
                        this.field15679 = false;
                    }
                }
            }
            else if (!this.method9887("Mode").equals("NCP")) {
                if (this.field15679) {
                    if (!Class3221.field15514.field4648.field23445.method1056()) {
                        this.field15679 = false;
                    }
                }
            }
            else if (this.field15679) {
                if (Class3221.field15514.field4648.field23445.method1056()) {
                    if (!method9898) {
                        if (b) {
                            Class6430.method19164();
                        }
                        this.field15679 = false;
                    }
                }
            }
        }
    }
}

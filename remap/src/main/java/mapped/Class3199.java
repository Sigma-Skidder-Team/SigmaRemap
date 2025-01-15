// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3199 extends Class3167
{
    public Class3199() {
        super(Class8013.field32987, "FastPlace", "Allows you to place blocks faster");
        this.method9881(new Class4999("Reduce Delay", "Makes block placement faster, but not too much!", true));
    }
    
    @Class6753
    private void method10040(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (Class3199.field15514.field4684.getHeldItemMainhand() == null) {
            return;
        }
        if (Class3199.field15514.field4684.getHeldItemMainhand().getItem() instanceof Class4036) {
            if (!this.method9883("Reduce Delay")) {
                Class3199.field15514.field4692 = 0;
            }
            else {
                final Class869 field15514 = Class3199.field15514;
                --field15514.field4692;
            }
        }
    }
}

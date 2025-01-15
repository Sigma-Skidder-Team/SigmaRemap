// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3382 extends Class3167
{
    public Class3382() {
        super(Class8013.field32990, "Vanilla", "Step for Vanilla");
        this.method9881(new Class4996("Maximum heigh", "Maximum heigh", 2.0f, Float.class, 1.0f, 10.0f, 0.5f));
    }
    
    @Class6753
    private void method10795(final Class5738 class5738) {
        if (this.method9906() && Class3382.field15514.field4684 != null) {
            if (!class5738.method17027()) {
                Class3382.field15514.field4684.stepHeight = this.method9886("Maximum heigh");
            }
            else {
                Class3382.field15514.field4684.stepHeight = 0.5f;
            }
        }
    }
}

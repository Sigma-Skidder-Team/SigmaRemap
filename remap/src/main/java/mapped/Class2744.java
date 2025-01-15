// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2744 extends Class2466
{
    public final /* synthetic */ Class2779 field14933;
    
    public Class2744(final Class2779 field14933) {
        this.field14933 = field14933;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class7562 class8700 = class8699.method29824(Class5260.field22334);
        Class8378.method27920(class8700);
        if (Class8563.method28792().method23306()) {
            if (class8700 == null) {
                return;
            }
            final Class74 method23743 = class8700.method23743();
            if (method23743 == null) {
                return;
            }
            final Class61 method23744 = method23743.method419("pages");
            if (!(method23744 instanceof Class60)) {
                return;
            }
            final Class60 class8701 = (Class60)method23744;
            if (class8701.method371() <= 50) {
                return;
            }
            class8701.method366(class8701.method365().subList(0, 50));
        }
    }
}

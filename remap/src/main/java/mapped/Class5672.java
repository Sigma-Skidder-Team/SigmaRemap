// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5672 extends Class5611
{
    public final /* synthetic */ Class5083 field23092;
    
    public Class5672(final Class5083 field23092, final int n, final int n2, final int n3, final String s) {
        this.field23092 = field23092;
        super(n, n2, n3, s);
    }
    
    @Override
    public void method16932() {
        final String string = "https://aka.ms/ExtendJavaRealms?subscriptionId=" + Class5083.method15866(this.field23092).field28676 + "&profileId=" + Realms.method25357();
        Realms.method25376(string);
        Class8428.method28148(string);
    }
}

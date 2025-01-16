// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5685 extends Class5611
{
    private static String[] field23114;
    public final /* synthetic */ Class5073 field23115;
    
    public Class5685(final Class5073 field23115, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23115 = field23115;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new RealmsMainScreen(Class5073.method15669(this.field23115)));
    }
}

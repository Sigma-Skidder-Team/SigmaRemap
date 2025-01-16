// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5661 extends Class5611
{
    private static String[] field23071;
    public final /* synthetic */ RealmsConfigureWorldScreen field23072;
    
    public Class5661(final RealmsConfigureWorldScreen field23072, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23072 = field23072;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5078(this.field23072, RealmsConfigureWorldScreen.method15718(this.field23072).clone(), this.field23072.func_224407_b()));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5688 extends Class5611
{
    public final /* synthetic */ Class5089 field23120;
    
    public Class5688(final Class5089 field23120, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23120 = field23120;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        if (!Class5089.method15963(this.field23120).field28679.equals(Class2153.field12792)) {
            Class5089.method15962(this.field23120).method15705(false, this.field23120);
        }
        else {
            Realms.setScreen(new Class5084(this.field23120, Class2039.field11628, RealmsScreen.getLocalizedString("mco.configure.world.close.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.close.question.line2"), true, 5));
        }
    }
}

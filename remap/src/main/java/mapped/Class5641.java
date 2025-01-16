// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5641 extends Class5611
{
    public final /* synthetic */ Class5083 field23033;
    
    public Class5641(final Class5083 field23033, final int n, final int n2, final int n3, final String s) {
        this.field23033 = field23033;
        super(n, n2, n3, s);
    }
    
    @Override
    public void method16932() {
        Realms.setScreen(new Class5084(this.field23033, Class2039.field11627, RealmsScreen.getLocalizedString("mco.configure.world.delete.question.line1"), RealmsScreen.getLocalizedString("mco.configure.world.delete.question.line2"), true, 1));
    }
}

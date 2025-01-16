// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5621 extends Class5611
{
    public final /* synthetic */ RealmsConfigureWorldScreen field23000;
    
    public Class5621(final RealmsConfigureWorldScreen field23000, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23000 = field23000;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        final Class5045 class5045 = new Class5045(this.field23000, Class271.field1472);
        class5045.method15366(RealmsScreen.getLocalizedString("mco.template.title.minigame"));
        Realms.setScreen(class5045);
    }
}

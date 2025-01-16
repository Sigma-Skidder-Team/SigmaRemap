// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5632 extends Class5631
{
    public final /* synthetic */ Class5078 field23022;
    
    public Class5632(final Class5078 field23022, final int n, final int n2, final String s, final long n3, final String s2, final Class236 class236) {
        this.field23022 = field23022;
        super(field23022, n, n2, s, n3, s2, class236);
    }
    
    @Override
    public void method16932() {
        final Class5045 class5045 = new Class5045(this.field23022, Class271.field1475, Class5078.method15742(this.field23022));
        class5045.method15366(RealmsScreen.getLocalizedString("mco.reset.world.inspiration"));
        Realms.setScreen(class5045);
    }
}

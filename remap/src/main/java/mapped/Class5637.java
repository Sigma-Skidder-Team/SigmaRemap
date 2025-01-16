// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5637 extends Class5631
{
    public final /* synthetic */ Class5078 field23021;
    
    public Class5637(final Class5078 field23021, final int n, final int n2, final String s, final long n3, final String s2, final Class236 class236) {
        this.field23021 = field23021;
        super(field23021, n, n2, s, n3, s2, class236);
    }
    
    @Override
    public void method16932() {
        final Class5045 class5045 = new Class5045(this.field23021, Class271.field1474, Class5078.method15741(this.field23021));
        class5045.method15366(RealmsScreen.getLocalizedString("mco.reset.world.experience"));
        Realms.setScreen(class5045);
    }
}

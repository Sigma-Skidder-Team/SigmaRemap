// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5636 extends Class5631
{
    public final /* synthetic */ Class5078 field23027;
    
    public Class5636(final Class5078 field23027, final int n, final int n2, final String s, final long n3, final String s2, final Class236 class236) {
        this.field23027 = field23027;
        super(field23027, n, n2, s, n3, s2, class236);
    }
    
    @Override
    public void method16932() {
        final Class5045 class5045 = new Class5045(this.field23027, Class271.field1473, Class5078.method15740(this.field23027));
        class5045.method15366(RealmsScreen.getLocalizedString("mco.reset.world.adventure"));
        Realms.setScreen(class5045);
    }
}

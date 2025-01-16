// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5625 extends Class5611
{
    public final /* synthetic */ Class5087 field23007;
    
    public Class5625(final Class5087 field23007, final int n, final int n2, final String s) {
        this.field23007 = field23007;
        super(n, n2, Class7869.method25488(8), 80, 20, s);
    }
    
    @Override
    public void method16932() {
        final int i = Class5087.method15944().indexOf(this.method16924()) + 1;
        if (!Class5087.method15943(this.field23007).field28683.get(i).field28611) {
            Class5087.method15945(this.field23007, i);
        }
        else {
            final Class5078 class5078 = new Class5078(this.field23007, Class5087.method15943(this.field23007), this.field23007, RealmsScreen.getLocalizedString("mco.configure.world.switch.slot"), RealmsScreen.getLocalizedString("mco.configure.world.switch.slot.subtitle"), 10526880, RealmsScreen.getLocalizedString("gui.cancel"));
            class5078.method15722(i);
            class5078.method15723(RealmsScreen.getLocalizedString("mco.create.world.reset.title"));
            class5078.method15721(14);
            Realms.setScreen(class5078);
        }
    }
}

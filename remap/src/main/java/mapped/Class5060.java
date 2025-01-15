// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5060 extends Class5056
{
    public final /* synthetic */ Class5069 field21709;
    
    public Class5060(final Class5069 field21709) {
        this.field21709 = field21709;
        super(Class5069.method15616(field21709) + 10, Class7869.method25488(12) + 20, Class7869.method25488(1), Class7869.method25488(12) + 20, 13);
    }
    
    public void method15544(final Class7427 class7427) {
        final Class5069 field21709 = this.field21709;
        field21709.getClass();
        this.method15511(new Class627(field21709, class7427));
    }
    
    @Override
    public int method15531() {
        return (int)(this.method15515() * 1.0);
    }
    
    @Override
    public boolean method15532() {
        return this.field21709.method15447(this);
    }
    
    @Override
    public boolean method15368(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            if (n < this.method15524()) {
                if (n2 >= this.method15525()) {
                    if (n2 <= this.method15526()) {
                        final int method15615 = Class5069.method15615(this.field21709);
                        final int n4 = Class5069.method15615(this.field21709) + Class5069.method15616(this.field21709);
                        final int n5 = (int)Math.floor(n2 - this.method15525()) - this.method15527() + this.method15530() - 4;
                        final int n6 = n5 / this.method15528();
                        if (n >= method15615) {
                            if (n <= n4) {
                                if (n6 >= 0) {
                                    if (n5 >= 0) {
                                        if (n6 < this.method15521()) {
                                            this.method15533(n6);
                                            this.method15520(n5, n6, n, n2, this.method15515());
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return super.method15368(n, n2, n3);
    }
    
    @Override
    public void method15520(final int n, final int n2, final double n3, final double n4, final int n5) {
        if (n2 >= 0) {
            if (n2 <= Class5069.method15609(this.field21709).field28682.size()) {
                if (Class5069.method15621(this.field21709) != null) {
                    if (!Class5069.method15621(this.field21709).equals(Class5046.method15438("mco.configure.world.invites.ops.tooltip")) && !Class5069.method15621(this.field21709).equals(Class5046.method15438("mco.configure.world.invites.normal.tooltip"))) {
                        if (Class5069.method15621(this.field21709).equals(Class5046.method15438("mco.configure.world.invites.remove.tooltip"))) {
                            Class5069.method15611(this.field21709, n2);
                        }
                    }
                    else if (!Class5069.method15609(this.field21709).field28682.get(n2).method22854()) {
                        Class5069.method15613(this.field21709, n2);
                    }
                    else {
                        Class5069.method15612(this.field21709, n2);
                    }
                }
            }
        }
    }
    
    @Override
    public void method15533(final int n) {
        this.method15519(n);
        if (n != -1) {
            Class7847.method25381(Class5046.method15439("narrator.select", Class5069.method15609(this.field21709).field28682.get(n).method22850()));
        }
        this.method15545(n);
    }
    
    public void method15545(final int n) {
        Class5069.method15622(this.field21709, n);
        Class5069.method15623(this.field21709);
    }
    
    @Override
    public void method15522() {
        this.field21709.method15413();
    }
    
    @Override
    public int method15524() {
        return Class5069.method15615(this.field21709) + this.method15515() - 5;
    }
    
    @Override
    public int method15521() {
        return (Class5069.method15609(this.field21709) != null) ? Class5069.method15609(this.field21709).field28682.size() : 1;
    }
    
    @Override
    public int method15523() {
        return this.method15521() * 13;
    }
}

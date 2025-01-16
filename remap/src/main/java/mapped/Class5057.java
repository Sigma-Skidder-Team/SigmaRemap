// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5057 extends Class5056
{
    public final /* synthetic */ Class5071 field21706;
    
    public Class5057(final Class5071 field21706) {
        this.field21706 = field21706;
        super(field21706.width() - 150, field21706.height(), 32, field21706.height() - 15, 36);
    }
    
    public void method15539(final Backup class7426) {
        final Class5071 field21706 = this.field21706;
        field21706.getClass();
        this.method15511(new Class631(field21706, class7426));
    }
    
    @Override
    public int method15531() {
        return (int)(this.method15515() * 0.93);
    }
    
    @Override
    public boolean method15532() {
        return this.field21706.method15447(this);
    }
    
    @Override
    public int method15521() {
        return Class5071.method15640(this.field21706).size();
    }
    
    @Override
    public int method15523() {
        return this.method15521() * 36;
    }
    
    @Override
    public void method15522() {
        this.field21706.method15413();
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            if (n < this.method15524()) {
                if (n2 >= this.method15525()) {
                    if (n2 <= this.method15526()) {
                        final int n4 = this.method15515() / 2 - 92;
                        final int method15515 = this.method15515();
                        final int n5 = (int)Math.floor(n2 - this.method15525()) - this.method15527() + this.method15530();
                        final int n6 = n5 / this.method15528();
                        if (n >= n4) {
                            if (n <= method15515) {
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
            return false;
        }
        return false;
    }
    
    @Override
    public int method15524() {
        return this.method15515() - 5;
    }
    
    @Override
    public void method15520(final int n, final int n2, final double n3, final double n4, final int n5) {
        final int n6 = this.method15515() - 35;
        final int n7 = n2 * this.method15528() + 36 - this.method15530();
        final int n8 = n6 + 10;
        final int n9 = n7 - 3;
        if (n3 >= n6) {
            if (n3 <= n6 + 9) {
                if (n4 >= n7) {
                    if (n4 <= n7 + 9) {
                        if (Class5071.method15640(this.field21706).get(n2).field28633.isEmpty()) {
                            return;
                        }
                        Class5071.method15646(this.field21706, -1);
                        Class5071.method15648(this.method15530());
                        Realms.setScreen(new Class5051(this.field21706, Class5071.method15640(this.field21706).get(n2)));
                        return;
                    }
                }
            }
        }
        if (n3 >= n8) {
            if (n3 < n8 + 13) {
                if (n4 >= n9) {
                    if (n4 < n9 + 15) {
                        Class5071.method15648(this.method15530());
                        Class5071.method15645(this.field21706, n2);
                    }
                }
            }
        }
    }
    
    @Override
    public void method15533(final int n) {
        this.method15519(n);
        if (n != -1) {
            Realms.narrateNow(RealmsScreen.method15439("narrator.select", Class5071.method15640(this.field21706).get(n).field28629.toString()));
        }
        this.method15540(n);
    }
    
    public void method15540(final int n) {
        Class5071.method15646(this.field21706, n);
        Class5071.method15649(this.field21706);
    }
}

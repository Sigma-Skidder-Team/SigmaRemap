// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5061 extends Class5056<Class624>
{
    public final /* synthetic */ Class5079 field21710;
    
    public Class5061(final Class5079 field21710) {
        this.field21710 = field21710;
        super(field21710.width(), field21710.height(), 32, field21710.height() - 40, 36);
    }
    
    @Override
    public boolean method15532() {
        return this.field21710.method15447(this);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 257) {
            if (n != 32) {
                if (n != 335) {
                    return false;
                }
            }
        }
        final Class624 method15534 = this.method15534();
        return (method15534 != null) ? method15534.mouseClicked(0.0, 0.0, 0) : super.keyPressed(n, n2, n3);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            if (n < this.method15524()) {
                if (n2 >= this.method15525()) {
                    if (n2 <= this.method15526()) {
                        final int method15538 = Class5079.method15824(this.field21710).method15538();
                        final int method15539 = this.method15524();
                        final int n4 = (int)Math.floor(n2 - this.method15525()) - this.method15527() + this.method15530() - 4;
                        final int n5 = n4 / this.method15528();
                        if (n >= method15538) {
                            if (n <= method15539) {
                                if (n5 >= 0) {
                                    if (n4 >= 0) {
                                        if (n5 < this.method15521()) {
                                            this.method15520(n4, n5, n, n2, this.method15515());
                                            Class5079.method15851(this.field21710, Class5079.method15852(this.field21710) + 7);
                                            this.method15533(n5);
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
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void method15533(final int n) {
        this.method15519(n);
        if (n != -1) {
            RealmsServer class7437;
            if (!this.field21710.method15744()) {
                if (n >= Class5079.method15823(this.field21710).size()) {
                    Class5079.method15826(this.field21710, -1L);
                    return;
                }
                class7437 = Class5079.method15823(this.field21710).get(n);
            }
            else if (n != 0) {
                if (n - 1 >= Class5079.method15823(this.field21710).size()) {
                    Class5079.method15826(this.field21710, -1L);
                    return;
                }
                class7437 = Class5079.method15823(this.field21710).get(n - 1);
            }
            else {
                Realms.method25383(RealmsScreen.getLocalizedString("mco.trial.message.line1"), RealmsScreen.getLocalizedString("mco.trial.message.line2"));
                class7437 = null;
            }
            Class5079.method15825(this.field21710, class7437);
            if (class7437 != null) {
                if (class7437.state != RealmsServer.Status.field12793) {
                    Class5079.method15826(this.field21710, class7437.id);
                    if (Class5079.method15852(this.field21710) >= 10) {
                        if (Class5079.method15827(this.field21710).method16916()) {
                            this.field21710.method15781(Class5079.method15807(this.field21710, Class5079.method15806(this.field21710)), this.field21710);
                        }
                    }
                    Realms.narrateNow(RealmsScreen.method15439("narrator.select", class7437.field28677));
                }
                else {
                    Realms.narrateNow(RealmsScreen.getLocalizedString("mco.selectServer.uninitialized") + RealmsScreen.getLocalizedString("mco.gui.button"));
                    Class5079.method15826(this.field21710, -1L);
                }
            }
            else {
                Class5079.method15826(this.field21710, -1L);
            }
        }
    }
    
    @Override
    public void method15520(final int n, int n2, final double n3, final double n4, final int n5) {
        if (this.field21710.method15744()) {
            if (n2 == 0) {
                Class5079.method15833(this.field21710, true);
                return;
            }
            --n2;
        }
        if (n2 < Class5079.method15823(this.field21710).size()) {
            final RealmsServer class7437 = Class5079.method15823(this.field21710).get(n2);
            if (class7437 != null) {
                if (class7437.state != RealmsServer.Status.field12793) {
                    Class5079.method15826(this.field21710, class7437.id);
                }
                else {
                    Class5079.method15826(this.field21710, -1L);
                    Realms.setScreen(new Class5082(class7437, this.field21710));
                }
                if (Class5079.method15853(this.field21710) != null && Class5079.method15853(this.field21710).equals(RealmsScreen.getLocalizedString("mco.selectServer.configure"))) {
                    Class5079.method15826(this.field21710, class7437.id);
                    Class5079.method15808(this.field21710, class7437);
                }
                else if (Class5079.method15853(this.field21710) != null && Class5079.method15853(this.field21710).equals(RealmsScreen.getLocalizedString("mco.selectServer.leave"))) {
                    Class5079.method15826(this.field21710, class7437.id);
                    Class5079.method15813(this.field21710, class7437);
                }
                else if (Class5079.method15844(this.field21710, class7437)) {
                    if (class7437.field28684) {
                        if (Class5079.method15854(this.field21710)) {
                            Class5079.method15812(this.field21710);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public int method15523() {
        return this.method15521() * 36;
    }
    
    @Override
    public int method15531() {
        return 300;
    }
}

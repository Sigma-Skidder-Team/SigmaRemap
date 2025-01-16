// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class5068 extends RealmsScreen
{
    private final RealmsScreen field21729;
    
    public Class5068(final RealmsScreen field21729) {
        this.field21729 = field21729;
    }
    
    @Override
    public void init() {
        Realms.narrateNow(RealmsScreen.getLocalizedString("mco.account.privacyinfo"));
        final String method15438 = RealmsScreen.getLocalizedString("mco.account.update");
        final String method15439 = RealmsScreen.getLocalizedString("gui.back");
        final int n = Math.max(this.method15424(method15438), this.method15424(method15439)) + 30;
        final String method15440 = RealmsScreen.getLocalizedString("mco.account.privacy.info");
        final int n2 = (int)(this.method15424(method15440) * 1.2);
        this.buttonsAdd(new Class5618(this, 1, this.width() / 2 - n2 / 2, Class7869.method25488(11), n2, 20, method15440));
        this.buttonsAdd(new Class5674(this, 1, this.width() / 2 - (n + 5), Class7869.method25488(13), n, 20, method15438));
        this.buttonsAdd(new Class5639(this, 0, this.width() / 2 + 5, Class7869.method25488(13), n, 20, method15439));
    }
    
    @Override
    public void tick() {
        super.tick();
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        final List<String> method15440 = this.method15440("mco.account.privacyinfo", (int)Math.round(this.width() * 0.9));
        int n4 = 15;
        final Iterator<String> iterator = method15440.iterator();
        while (iterator.hasNext()) {
            this.drawCenteredString(iterator.next(), this.width() / 2, n4, 16777215);
            n4 += 15;
        }
        super.render(n, n2, n3);
    }
}

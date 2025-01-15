// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class5068 extends Class5046
{
    private final Class5046 field21729;
    
    public Class5068(final Class5046 field21729) {
        this.field21729 = field21729;
    }
    
    @Override
    public void method15369() {
        Class7847.method25381(Class5046.method15438("mco.account.privacyinfo"));
        final String method15438 = Class5046.method15438("mco.account.update");
        final String method15439 = Class5046.method15438("gui.back");
        final int n = Math.max(this.method15424(method15438), this.method15424(method15439)) + 30;
        final String method15440 = Class5046.method15438("mco.account.privacy.info");
        final int n2 = (int)(this.method15424(method15440) * 1.2);
        this.method15431(new Class5618(this, 1, this.method15421() / 2 - n2 / 2, Class7869.method25488(11), n2, 20, method15440));
        this.method15431(new Class5674(this, 1, this.method15421() / 2 - (n + 5), Class7869.method25488(13), n, 20, method15438));
        this.method15431(new Class5639(this, 0, this.method15421() / 2 + 5, Class7869.method25488(13), n, 20, method15439));
    }
    
    @Override
    public void method15375() {
        super.method15375();
    }
    
    @Override
    public boolean method15368(final double n, final double n2, final int n3) {
        return super.method15368(n, n2, n3);
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        final List<String> method15440 = this.method15440("mco.account.privacyinfo", (int)Math.round(this.method15421() * 0.9));
        int n4 = 15;
        final Iterator<String> iterator = method15440.iterator();
        while (iterator.hasNext()) {
            this.method15405(iterator.next(), this.method15421() / 2, n4, 16777215);
            n4 += 15;
        }
        super.method15383(n, n2, n3);
    }
}

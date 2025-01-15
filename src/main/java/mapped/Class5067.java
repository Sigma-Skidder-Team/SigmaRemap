// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class5067 extends Class5046
{
    public Class5046 field21722;
    public String field21723;
    private final String field21724;
    public String field21725;
    public String field21726;
    public int field21727;
    private int field21728;
    
    public Class5067(final Class5046 field21722, final String field21723, final String field21724, final int field21725) {
        this.field21722 = field21722;
        this.field21723 = field21723;
        this.field21724 = field21724;
        this.field21727 = field21725;
        this.field21725 = Class5046.method15438("gui.yes");
        this.field21726 = Class5046.method15438("gui.no");
    }
    
    @Override
    public void method15369() {
        this.method15431(new Class5638(this, 0, this.method15421() / 2 - 105, Class7869.method25488(9), 100, 20, this.field21725));
        this.method15431(new Class5655(this, 1, this.method15421() / 2 + 5, Class7869.method25488(9), 100, 20, this.field21726));
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(this.field21723, this.method15421() / 2, Class7869.method25488(3), 16777215);
        this.method15405(this.field21724, this.method15421() / 2, Class7869.method25488(5), 16777215);
        super.method15383(n, n2, n3);
    }
    
    @Override
    public void method15375() {
        super.method15375();
        final int field21728 = this.field21728 - 1;
        this.field21728 = field21728;
        if (field21728 == 0) {
            final Iterator<Class5610<?>> iterator = this.method15432().iterator();
            while (iterator.hasNext()) {
                iterator.next().method16917(true);
            }
        }
    }
}

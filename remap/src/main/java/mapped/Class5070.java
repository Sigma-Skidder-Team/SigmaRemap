// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.List;

public class Class5070 extends Class5046
{
    private final String field21745;
    private final ITextComponent field21746;
    private List<String> field21747;
    private final Class5046 field21748;
    private int field21749;
    
    public Class5070(final Class5046 field21748, final String s, final ITextComponent field21749) {
        this.field21748 = field21748;
        this.field21745 = Class5046.method15438(s);
        this.field21746 = field21749;
    }
    
    @Override
    public void method15369() {
        Class7847.method25369(false);
        Class7847.method25371();
        Class7847.method25381(this.field21745 + ": " + this.field21746.getString());
        this.field21747 = this.method15426(this.field21746.method8461(), this.method15421() - 50);
        this.field21749 = this.field21747.size() * this.method15423();
        this.method15431(new Class5620(this, 0, this.method15421() / 2 - 100, this.method15422() / 2 + this.field21749 / 2 + this.method15423(), Class5046.method15438("gui.back")));
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        Class7847.method25362(this.field21748);
        return true;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(this.field21745, this.method15421() / 2, this.method15422() / 2 - this.field21749 / 2 - this.method15423() * 2, 11184810);
        int n4 = this.method15422() / 2 - this.field21749 / 2;
        if (this.field21747 != null) {
            final Iterator<String> iterator = this.field21747.iterator();
            while (iterator.hasNext()) {
                this.method15405(iterator.next(), this.method15421() / 2, n4, 16777215);
                n4 += this.method15423();
            }
        }
        super.method15383(n, n2, n3);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5084 extends Class5046
{
    private final Class2039 field21901;
    private final String field21902;
    private final String field21903;
    public final Class5081 field21904;
    public final String field21905;
    public final String field21906;
    private final String field21907;
    public final int field21908;
    private final boolean field21909;
    
    public Class5084(final Class5081 field21904, final Class2039 field21905, final String field21906, final String field21907, final boolean field21908, final int field21909) {
        this.field21904 = field21904;
        this.field21908 = field21909;
        this.field21901 = field21905;
        this.field21902 = field21906;
        this.field21903 = field21907;
        this.field21909 = field21908;
        this.field21905 = Class5046.method15438("gui.yes");
        this.field21906 = Class5046.method15438("gui.no");
        this.field21907 = Class5046.method15438("mco.gui.ok");
    }
    
    @Override
    public void method15369() {
        Class7847.method25383(this.field21901.field11630, this.field21902, this.field21903);
        if (!this.field21909) {
            this.method15431(new Class5613(this, 0, this.method15421() / 2 - 50, Class7869.method25488(8), 100, 20, this.field21907));
        }
        else {
            this.method15431(new Class5668(this, 0, this.method15421() / 2 - 105, Class7869.method25488(8), 100, 20, this.field21905));
            this.method15431(new Class5614(this, 1, this.method15421() / 2 + 5, Class7869.method25488(8), 100, 20, this.field21906));
        }
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        this.field21904.method15437(false, this.field21908);
        return true;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(this.field21901.field11630, this.method15421() / 2, Class7869.method25488(2), this.field21901.field11629);
        this.method15405(this.field21902, this.method15421() / 2, Class7869.method25488(4), 16777215);
        this.method15405(this.field21903, this.method15421() / 2, Class7869.method25488(6), 16777215);
        super.method15383(n, n2, n3);
    }
}

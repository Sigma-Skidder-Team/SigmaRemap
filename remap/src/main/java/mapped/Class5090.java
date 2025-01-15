// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5090 extends Class5046
{
    private final Class5046 field22001;
    private final boolean field22002;
    
    public Class5090(final Class5046 field22001, final boolean field22002) {
        this.field22001 = field22001;
        this.field22002 = field22002;
    }
    
    @Override
    public void method15369() {
        this.method15431(new Class5687(this, 0, this.method15421() / 2 - 100, Class7869.method25488(12), Class5046.method15438("gui.back")));
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(Class5046.method15438(this.field22002 ? "mco.client.outdated.title" : "mco.client.incompatible.title"), this.method15421() / 2, Class7869.method25488(3), 16711680);
        for (int n4 = this.field22002 ? 2 : 3, i = 0; i < n4; ++i) {
            this.method15405(Class5046.method15438((this.field22002 ? "mco.client.outdated.msg.line" : "mco.client.incompatible.msg.line") + (i + 1)), this.method15421() / 2, Class7869.method25488(5) + i * 12, 16777215);
        }
        super.method15383(n, n2, n3);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 257) {
            if (n != 335) {
                if (n != 256) {
                    return super.method15376(n, n2, n3);
                }
            }
        }
        Class7847.method25362(this.field22001);
        return true;
    }
}

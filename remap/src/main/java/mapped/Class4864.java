// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4864 extends Class4863
{
    private static String[] field20591;
    private boolean field20829;
    private boolean field20830;
    
    public Class4864(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false, new Class7920(Class9493.field40804, 20, 40, 18, Class267.field1427, 200, 1));
        this.method14585();
    }
    
    private void method14585() {
        this.method14583().method25659(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14583().method25643();
        this.method14589(this.method14583().method25644());
    }
    
    public boolean method14586() {
        return this.field20829;
    }
    
    public void method14587(final boolean field20829) {
        this.field20829 = field20829;
    }
    
    public boolean method14588() {
        return this.field20830;
    }
    
    public void method14589(final boolean b) {
        this.method14590(b, true);
    }
    
    public void method14590(final boolean field20830, final boolean b) {
        if (field20830 != this.method14588()) {
            while (true) {
                Label_0041: {
                    if (field20830 && !this.method14583().method25644()) {
                        break Label_0041;
                    }
                    if (!field20830) {
                        if (this.method14583().method25644()) {
                            break Label_0041;
                        }
                    }
                    this.field20830 = field20830;
                    if (!b) {
                        return;
                    }
                    this.method14517();
                    return;
                }
                this.method14583().method25643();
                continue;
            }
        }
    }
}

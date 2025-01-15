// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5055 extends Class5054
{
    private static String[] field21703;
    public final /* synthetic */ Class5051 field21704;
    
    public Class5055(final Class5051 field21704) {
        this.field21704 = field21704;
        super(field21704.method15421(), field21704.method15422(), 32, field21704.method15422() - 64, 36);
    }
    
    @Override
    public int method15501() {
        return Class5051.method15487(this.field21704).field28633.size();
    }
    
    @Override
    public boolean method15503(final int n) {
        return false;
    }
    
    @Override
    public int method15505() {
        return this.method15501() * 36;
    }
    
    @Override
    public void method15504() {
    }
    
    @Override
    public void method15499(final int n, final int n2, final int n3, final int n4, final Class7710 class7710, final int n5, final int n6) {
        final String s = Class5051.method15488(this.field21704).get(n);
        this.field21704.method15407(s, this.method15498() / 2 - 40, n3, 10526880);
        this.field21704.method15407(Class5051.method15489(this.field21704, s, Class5051.method15487(this.field21704).field28633.get(s)), this.method15498() / 2 - 40, n3 + 12, 16777215);
    }
}

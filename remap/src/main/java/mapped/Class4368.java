// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4368 implements Class4252<Class5813>
{
    private static String[] field19565;
    private int field19566;
    private int field19567;
    
    public Class4368() {
    }
    
    public Class4368(final int field19566, final int field19567) {
        this.field19566 = field19566;
        this.field19567 = field19567;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19566 = class8654.method29501();
        this.field19567 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19566);
        class8654.method29505(this.field19567);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17451(this);
    }
    
    public int method13134() {
        return this.field19566;
    }
    
    public int method13135() {
        return this.field19567;
    }
}

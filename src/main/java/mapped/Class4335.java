// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4335 implements Class4252<Class5800>
{
    private static String[] field19412;
    private Class354 field19413;
    
    public Class4335() {
    }
    
    public Class4335(final Class354 field19413) {
        this.field19413 = field19413;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19413 = class8654.method29494();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19413);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17298(this);
    }
    
    public Class354 method13017() {
        return this.field19413;
    }
}

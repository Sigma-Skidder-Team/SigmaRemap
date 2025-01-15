// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4307 implements Class4252<Class5813>
{
    private static String[] field19311;
    private Class316 field19312;
    
    public Class4307() {
    }
    
    public Class4307(final Class316 field19312) {
        this.field19312 = field19312;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19312 = class8654.method29499(Class316.class);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19312);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17438(this);
    }
    
    public Class316 method12950() {
        return this.field19312;
    }
}

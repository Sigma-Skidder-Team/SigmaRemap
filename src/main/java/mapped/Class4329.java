// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4329 implements Class4252<Class5813>
{
    private static String[] field19384;
    private Class7005 field19385;
    private Class316 field19386;
    
    public Class4329() {
    }
    
    public Class4329(final Class316 field19386, final Class7005 field19387) {
        this.field19386 = field19386;
        this.field19385 = field19387;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19386 = class8654.method29499(Class316.class);
        this.field19385 = class8654.method29520();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19386);
        class8654.method29521(this.field19385);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17437(this);
    }
    
    public Class316 method12999() {
        return this.field19386;
    }
    
    public Class7005 method13000() {
        return this.field19385;
    }
}

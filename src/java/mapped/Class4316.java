// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4316 implements Class4252<Class5800>
{
    private static String[] field19343;
    private Class316 field19344;
    
    public Class4316() {
    }
    
    public Class4316(final Class316 field19344) {
        this.field19344 = field19344;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19344 = class8654.method29499(Class316.class);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19344);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17354(this);
    }
    
    public Class316 method12972() {
        return this.field19344;
    }
}

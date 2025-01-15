// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4291 implements Class4252<Class5813>
{
    private static String[] field19245;
    private boolean field19246;
    
    public Class4291() {
    }
    
    public Class4291(final boolean field19246) {
        this.field19246 = field19246;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17459(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19246 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeBoolean(this.field19246);
    }
    
    public boolean method12890() {
        return this.field19246;
    }
}

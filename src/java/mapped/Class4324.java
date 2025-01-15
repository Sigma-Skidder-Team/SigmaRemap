// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4324 implements Class4252<Class5813>
{
    private static String[] field19367;
    private int field19368;
    
    public Class4324() {
    }
    
    public Class4324(final int field19368) {
        this.field19368 = field19368;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19368 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19368);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17453(this);
    }
    
    public int method12988() {
        return this.field19368;
    }
}

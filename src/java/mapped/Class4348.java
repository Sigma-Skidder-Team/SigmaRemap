// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4348 implements Class4252<Class5813>
{
    private static String[] field19474;
    private int field19475;
    
    public Class4348() {
    }
    
    public Class4348(final int field19475) {
        this.field19475 = field19475;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19475 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19475);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17443(this);
    }
    
    public int method13058() {
        return this.field19475;
    }
}

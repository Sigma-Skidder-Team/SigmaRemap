// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4303 implements Class4252<Class5813>
{
    private static String[] field19299;
    private long field19300;
    
    public Class4303() {
    }
    
    public Class4303(final long field19300) {
        this.field19300 = field19300;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17428(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19300 = class8654.readLong();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeLong(this.field19300);
    }
    
    public long method12942() {
        return this.field19300;
    }
}

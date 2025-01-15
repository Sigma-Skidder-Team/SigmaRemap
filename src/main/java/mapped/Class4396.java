// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4396 implements Class4252<Class5800>
{
    private static String[] field19690;
    private long field19691;
    
    public Class4396() {
    }
    
    public Class4396(final long field19691) {
        this.field19691 = field19691;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17342(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19691 = class8654.readLong();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeLong(this.field19691);
    }
    
    public long method13223() {
        return this.field19691;
    }
}

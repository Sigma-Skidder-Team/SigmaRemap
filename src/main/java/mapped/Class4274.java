// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4274 implements Class4252<Class5811>
{
    private static String[] field19168;
    private long field19169;
    
    public Class4274() {
    }
    
    public Class4274(final long field19169) {
        this.field19169 = field19169;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19169 = class8654.readLong();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeLong(this.field19169);
    }
    
    public void method12826(final Class5811 class5811) {
        class5811.method17416(this);
    }
}

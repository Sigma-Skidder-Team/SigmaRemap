// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4345 implements Class4252<Class5800>
{
    private static String[] field19462;
    private long field19463;
    private long field19464;
    
    public Class4345() {
    }
    
    public Class4345(final long field19463, final long field19464, final boolean b) {
        this.field19463 = field19463;
        this.field19464 = field19464;
        if (!b) {
            this.field19464 = -this.field19464;
            if (this.field19464 == 0L) {
                this.field19464 = -1L;
            }
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19463 = class8654.readLong();
        this.field19464 = class8654.readLong();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeLong(this.field19463);
        class8654.writeLong(this.field19464);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17297(this);
    }
    
    public long method13048() {
        return this.field19463;
    }
    
    public long method13049() {
        return this.field19464;
    }
}

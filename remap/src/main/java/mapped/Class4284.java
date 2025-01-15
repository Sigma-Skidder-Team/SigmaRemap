// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4284 implements Class4252<Class5800>
{
    private static String[] field19219;
    private int field19220;
    
    public Class4284() {
    }
    
    public Class4284(final int field19220) {
        this.field19220 = field19220;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17316(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19220 = class8654.readUnsignedByte();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19220);
    }
}

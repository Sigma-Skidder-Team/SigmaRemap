// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4357 implements Class4252<Class5800>
{
    private static String[] field19509;
    private BlockPos field19510;
    private int field19511;
    private Class51 field19512;
    
    public Class4357() {
    }
    
    public Class4357(final BlockPos field19510, final int field19511, final Class51 field19512) {
        this.field19510 = field19510;
        this.field19511 = field19511;
        this.field19512 = field19512;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19510 = class8654.method29494();
        this.field19511 = class8654.readUnsignedByte();
        this.field19512 = class8654.method29508();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19510);
        class8654.writeByte((byte)this.field19511);
        class8654.method29507(this.field19512);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17313(this);
    }
    
    public BlockPos method13084() {
        return this.field19510;
    }
    
    public int method13085() {
        return this.field19511;
    }
    
    public Class51 method13086() {
        return this.field19512;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4393 implements Class4252<Class5800>
{
    private static String[] field19672;
    private int field19673;
    private short field19674;
    private boolean field19675;
    
    public Class4393() {
    }
    
    public Class4393(final int field19673, final short field19674, final boolean field19675) {
        this.field19673 = field19673;
        this.field19674 = field19674;
        this.field19675 = field19675;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17310(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19673 = class8654.readUnsignedByte();
        this.field19674 = class8654.readShort();
        this.field19675 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19673);
        class8654.writeShort(this.field19674);
        class8654.writeBoolean(this.field19675);
    }
    
    public int method13208() {
        return this.field19673;
    }
    
    public short method13209() {
        return this.field19674;
    }
    
    public boolean method13210() {
        return this.field19675;
    }
}

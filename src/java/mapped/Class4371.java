// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4371 extends Class4370
{
    private static String[] field19578;
    
    public Class4371() {
        this.field19576 = true;
        this.field19577 = true;
    }
    
    public Class4371(final int n, final short field19570, final short field19571, final short field19572, final byte field19573, final byte field19574, final boolean field19575) {
        super(n);
        this.field19570 = field19570;
        this.field19571 = field19571;
        this.field19572 = field19572;
        this.field19573 = field19573;
        this.field19574 = field19574;
        this.field19575 = field19575;
        this.field19576 = true;
        this.field19577 = true;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        super.method12754(class8654);
        this.field19570 = class8654.readShort();
        this.field19571 = class8654.readShort();
        this.field19572 = class8654.readShort();
        this.field19573 = class8654.readByte();
        this.field19574 = class8654.readByte();
        this.field19575 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        super.method12755(class8654);
        class8654.writeShort(this.field19570);
        class8654.writeShort(this.field19571);
        class8654.writeShort(this.field19572);
        class8654.writeByte(this.field19573);
        class8654.writeByte(this.field19574);
        class8654.writeBoolean(this.field19575);
    }
}

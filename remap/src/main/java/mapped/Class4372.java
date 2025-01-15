// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4372 extends Class4370
{
    private static String[] field19579;
    
    public Class4372() {
        this.field19577 = true;
    }
    
    public Class4372(final int n, final short field19570, final short field19571, final short field19572, final boolean field19573) {
        super(n);
        this.field19570 = field19570;
        this.field19571 = field19571;
        this.field19572 = field19572;
        this.field19575 = field19573;
        this.field19577 = true;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        super.method12754(class8654);
        this.field19570 = class8654.readShort();
        this.field19571 = class8654.readShort();
        this.field19572 = class8654.readShort();
        this.field19575 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        super.method12755(class8654);
        class8654.writeShort(this.field19570);
        class8654.writeShort(this.field19571);
        class8654.writeShort(this.field19572);
        class8654.writeBoolean(this.field19575);
    }
}

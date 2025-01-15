// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4373 extends Class4370
{
    private static String[] field19580;
    
    public Class4373() {
        this.field19576 = true;
    }
    
    public Class4373(final int n, final byte field19573, final byte field19574, final boolean field19575) {
        super(n);
        this.field19573 = field19573;
        this.field19574 = field19574;
        this.field19576 = true;
        this.field19575 = field19575;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        super.method12754(class8654);
        this.field19573 = class8654.readByte();
        this.field19574 = class8654.readByte();
        this.field19575 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        super.method12755(class8654);
        class8654.writeByte(this.field19573);
        class8654.writeByte(this.field19574);
        class8654.writeBoolean(this.field19575);
    }
}

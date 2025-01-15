// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4390 implements Class4252<Class5802>
{
    private int field19666;
    private Class8654 field19667;
    
    public Class4390() {
    }
    
    public Class4390(final int field19666, final Class8654 field19667) {
        this.field19666 = field19666;
        this.field19667 = field19667;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19666 = class8654.method29501();
        if (!class8654.readBoolean()) {
            this.field19667 = null;
        }
        else {
            final int readableBytes = class8654.readableBytes();
            if (readableBytes < 0 || readableBytes > 1048576) {
                throw new IOException("Payload may not be larger than 1048576 bytes");
            }
            this.field19667 = new Class8654(class8654.readBytes(readableBytes));
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19666);
        if (this.field19667 == null) {
            class8654.writeBoolean(false);
        }
        else {
            class8654.writeBoolean(true);
            class8654.writeBytes(this.field19667.copy());
        }
    }
    
    public void method12990(final Class5802 class5802) {
        class5802.method17390(this);
    }
}

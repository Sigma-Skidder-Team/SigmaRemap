// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4315 implements Class4252<Class5800>
{
    private static String[] field19340;
    private Class2113 field19341;
    private boolean field19342;
    
    public Class4315() {
    }
    
    public Class4315(final Class2113 field19341, final boolean field19342) {
        this.field19341 = field19341;
        this.field19342 = field19342;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17335(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19341 = Class2113.method8237(class8654.readUnsignedByte());
        this.field19342 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19341.method8235());
        class8654.writeBoolean(this.field19342);
    }
    
    public boolean method12970() {
        return this.field19342;
    }
    
    public Class2113 method12971() {
        return this.field19341;
    }
}

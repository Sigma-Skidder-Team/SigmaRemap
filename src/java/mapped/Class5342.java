// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

public class Class5342 implements Class5336
{
    private static String[] field22398;
    private int field22399;
    private int field22400;
    
    public Class5342(final int field22399, final int field22400) {
        this.field22399 = field22399;
        this.field22400 = field22400;
    }
    
    @Override
    public int method16480() {
        return 32;
    }
    
    @Override
    public int method16481() {
        return this.field22400;
    }
    
    @Override
    public ByteBuffer method16485() {
        return BufferUtils.createByteBuffer(this.method16483() * this.method16482() * 4);
    }
    
    @Override
    public int method16482() {
        return Class7649.method24232(this.field22400);
    }
    
    @Override
    public int method16483() {
        return Class7649.method24232(this.field22399);
    }
    
    @Override
    public int method16484() {
        return this.field22399;
    }
}

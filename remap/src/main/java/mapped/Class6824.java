// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.gui.MiniMap;
import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

public class Class6824
{
    private static String[] field26809;
    public Class1862 field26810;
    public ByteBuffer field26811;
    public boolean field26812;
    
    public Class6824(final Class1862 field26810) {
        this.field26810 = field26810;
        this.field26811 = BufferUtils.createByteBuffer(768);
        this.method20911();
    }
    
    public void method20911() {
        this.field26811 = BufferUtils.createByteBuffer(768);
        final int n = this.field26810.method7019().field32290 * 16;
        final int n2 = this.field26810.method7019().field32291 * 16;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final BlockPos class354 = new BlockPos(n + i, 64, n2 + j);
                final int method10409 = MiniMap.method10409(new BlockPos(class354.getX(), this.field26810.method7017(Class2020.field11522).method35713(i, j) - 1, class354.getZ()));
                this.field26811.put((byte)(method10409 >> 16 & 0xFF));
                this.field26811.put((byte)(method10409 >> 8 & 0xFF));
                this.field26811.put((byte)(method10409 & 0xFF));
            }
        }
        this.field26811.flip();
        this.field26812 = this.method20913();
    }
    
    public void method20912() {
        if (!this.field26812) {
            if (this.method20913()) {
                this.method20911();
            }
        }
    }
    
    private boolean method20913() {
        final Class1862 method6686 = MiniMap.method10410().field4683.method6686(this.field26810.method7019().field32290, this.field26810.method7019().field32291 + 1);
        final Class1862 method6687 = MiniMap.method10411().field4683.method6686(this.field26810.method7019().field32290, this.field26810.method7019().field32291 - 1);
        if (method6686 != null) {
            if (method6686.field10145) {
                if (method6687 != null) {
                    if (method6687.field10145) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method20914(final Class1862 class1862) {
        return class1862.method7019().field32290 == this.field26810.method7019().field32290 && class1862.method7019().field32291 == this.field26810.method7019().field32291;
    }
}

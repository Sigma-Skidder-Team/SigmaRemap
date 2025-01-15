// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4384 implements Class4252<Class5800>
{
    private static String[] field19640;
    private int field19641;
    private byte field19642;
    private byte field19643;
    private int field19644;
    private byte field19645;
    
    public Class4384() {
    }
    
    public Class4384(final int field19641, final Class1948 class1948) {
        this.field19641 = field19641;
        this.field19642 = (byte)(Class5328.method16451(class1948.method7906()) & 0xFF);
        this.field19643 = (byte)(class1948.method7908() & 0xFF);
        if (class1948.method7907() <= 32767) {
            this.field19644 = class1948.method7907();
        }
        else {
            this.field19644 = 32767;
        }
        this.field19645 = 0;
        if (class1948.method7909()) {
            this.field19645 |= 0x1;
        }
        if (class1948.method7910()) {
            this.field19645 |= 0x2;
        }
        if (class1948.method7911()) {
            this.field19645 |= 0x4;
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19641 = class8654.method29501();
        this.field19642 = class8654.readByte();
        this.field19643 = class8654.readByte();
        this.field19644 = class8654.method29501();
        this.field19645 = class8654.readByte();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19641);
        class8654.writeByte(this.field19642);
        class8654.writeByte(this.field19643);
        class8654.method29505(this.field19644);
        class8654.writeByte(this.field19645);
    }
    
    public boolean method13185() {
        return this.field19644 == 32767;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17332(this);
    }
    
    public int method13186() {
        return this.field19641;
    }
    
    public byte method13187() {
        return this.field19642;
    }
    
    public byte method13188() {
        return this.field19643;
    }
    
    public int method13189() {
        return this.field19644;
    }
    
    public boolean method13190() {
        return (this.field19645 & 0x2) == 0x2;
    }
    
    public boolean method13191() {
        return (this.field19645 & 0x1) == 0x1;
    }
    
    public boolean method13192() {
        return (this.field19645 & 0x4) == 0x4;
    }
}

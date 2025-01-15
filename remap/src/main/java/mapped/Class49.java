// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class49 extends NumberNBT
{
    public static final INBTType<Class49> field119;
    private final long field120;
    
    private Class49(final long field120) {
        this.field120 = field120;
    }
    
    public static Class49 method288(final long n) {
        return (n >= -128L && n <= 1024L) ? Class7458.field28767[(int)n + 128] : new Class49(n);
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.field120);
    }
    
    @Override
    public byte getId() {
        return 4;
    }
    
    @Override
    public INBTType<Class49> getType() {
        return Class49.field119;
    }
    
    @Override
    public String toString() {
        return this.field120 + "L";
    }
    
    public Class49 method289() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class49 && this.field120 == ((Class49)o).field120);
    }
    
    @Override
    public int hashCode() {
        return (int)(this.field120 ^ this.field120 >>> 32);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field120)).appendSibling(new StringTextComponent("L").applyTextStyle(Class49.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(Class49.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long method270() {
        return this.field120;
    }
    
    @Override
    public int method271() {
        return (int)(this.field120 & -1L);
    }
    
    @Override
    public short method272() {
        return (short)(this.field120 & 0xFFFFL);
    }
    
    @Override
    public byte method273() {
        return (byte)(this.field120 & 0xFFL);
    }
    
    @Override
    public double method274() {
        return (double)this.field120;
    }
    
    @Override
    public float method275() {
        return (float)this.field120;
    }
    
    @Override
    public Number method276() {
        return this.field120;
    }
    
    static {
        field119 = new Class6067();
    }
}

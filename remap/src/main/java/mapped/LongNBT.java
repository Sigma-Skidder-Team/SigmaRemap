// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class LongNBT extends NumberNBT
{
    public static final INBTType<LongNBT> TYPE;
    private final long field120;
    
    private LongNBT(final long field120) {
        this.field120 = field120;
    }
    
    public static LongNBT method288(final long n) {
        return (n >= -128L && n <= 1024L) ? Class7458.field28767[(int)n + 128] : new LongNBT(n);
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
    public INBTType<LongNBT> getType() {
        return LongNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return this.field120 + "L";
    }
    
    public LongNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof LongNBT && this.field120 == ((LongNBT)o).field120);
    }
    
    @Override
    public int hashCode() {
        return (int)(this.field120 ^ this.field120 >>> 32);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field120)).appendSibling(new StringTextComponent("L").applyTextStyle(LongNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(LongNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long getLong() {
        return this.field120;
    }
    
    @Override
    public int getInt() {
        return (int)(this.field120 & -1L);
    }
    
    @Override
    public short getShort() {
        return (short)(this.field120 & 0xFFFFL);
    }
    
    @Override
    public byte getByte() {
        return (byte)(this.field120 & 0xFFL);
    }
    
    @Override
    public double getDouble() {
        return (double)this.field120;
    }
    
    @Override
    public float getFloat() {
        return (float)this.field120;
    }
    
    @Override
    public Number getAsNumber() {
        return this.field120;
    }
    
    static {
        TYPE = new Class6067();
    }
}

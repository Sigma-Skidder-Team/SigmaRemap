// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import mapped.*;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class IntNBT extends NumberNBT
{
    public static final INBTType<IntNBT> TYPE;
    private final int data;
    
    private IntNBT(final int field109) {
        this.data = field109;
    }
    
    public static IntNBT valueOf(final int n) {
        return (n >= -128 && n <= 1024) ? Class8849.field37206[n + 128] : new IntNBT(n);
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.data);
    }
    
    @Override
    public byte getId() {
        return 3;
    }
    
    @Override
    public INBTType<IntNBT> getType() {
        return IntNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
    
    public IntNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof IntNBT && this.data == ((IntNBT)o).data);
    }
    
    @Override
    public int hashCode() {
        return this.data;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.data)).applyTextStyle(IntNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long method270() {
        return this.data;
    }
    
    @Override
    public int method271() {
        return this.data;
    }
    
    @Override
    public short method272() {
        return (short)(this.data & 0xFFFF);
    }
    
    @Override
    public byte method273() {
        return (byte)(this.data & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.data;
    }
    
    @Override
    public float method275() {
        return (float)this.data;
    }
    
    @Override
    public Number method276() {
        return this.data;
    }
    
    static {
        TYPE = new Class6075();
    }
}

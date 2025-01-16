// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class DoubleNBT extends NumberNBT
{
    public static final DoubleNBT field104;
    public static final INBTType<DoubleNBT> TYPE;
    private final double field106;
    
    private DoubleNBT(final double field106) {
        this.field106 = field106;
    }
    
    public static DoubleNBT method277(final double n) {
        return (n != 0.0) ? new DoubleNBT(n) : DoubleNBT.field104;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.field106);
    }
    
    @Override
    public byte getId() {
        return 6;
    }
    
    @Override
    public INBTType<DoubleNBT> getType() {
        return DoubleNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return this.field106 + "d";
    }
    
    public DoubleNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof DoubleNBT && this.field106 == ((DoubleNBT)o).field106);
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field106);
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field106)).appendSibling(new StringTextComponent("d").applyTextStyle(DoubleNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(DoubleNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long getLong() {
        return (long)Math.floor(this.field106);
    }
    
    @Override
    public int getInt() {
        return MathHelper.floor(this.field106);
    }
    
    @Override
    public short getShort() {
        return (short)(MathHelper.floor(this.field106) & 0xFFFF);
    }
    
    @Override
    public byte getByte() {
        return (byte)(MathHelper.floor(this.field106) & 0xFF);
    }
    
    @Override
    public double getDouble() {
        return this.field106;
    }
    
    @Override
    public float getFloat() {
        return (float)this.field106;
    }
    
    @Override
    public Number getAsNumber() {
        return this.field106;
    }
    
    static {
        field104 = new DoubleNBT(0.0);
        TYPE = new Class6069();
    }
}

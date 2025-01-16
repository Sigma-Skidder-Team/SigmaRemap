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

public class FloatNBT extends NumberNBT
{
    public static final FloatNBT field110;
    public static final INBTType<FloatNBT> TYPE;
    private final float field112;
    
    private FloatNBT(final float field112) {
        this.field112 = field112;
    }
    
    public static FloatNBT method281(final float n) {
        return (n != 0.0f) ? new FloatNBT(n) : FloatNBT.field110;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.field112);
    }
    
    @Override
    public byte getId() {
        return 5;
    }
    
    @Override
    public INBTType<FloatNBT> getType() {
        return FloatNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return this.field112 + "f";
    }
    
    public FloatNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof FloatNBT && this.field112 == ((FloatNBT)o).field112);
    }
    
    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.field112);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field112)).appendSibling(new StringTextComponent("f").applyTextStyle(FloatNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(FloatNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long getLong() {
        return (long)this.field112;
    }
    
    @Override
    public int getInt() {
        return MathHelper.method35642(this.field112);
    }
    
    @Override
    public short getShort() {
        return (short)(MathHelper.method35642(this.field112) & 0xFFFF);
    }
    
    @Override
    public byte getByte() {
        return (byte)(MathHelper.method35642(this.field112) & 0xFF);
    }
    
    @Override
    public double getDouble() {
        return this.field112;
    }
    
    @Override
    public float getFloat() {
        return this.field112;
    }
    
    @Override
    public Number getAsNumber() {
        return this.field112;
    }
    
    static {
        field110 = new FloatNBT(0.0f);
        TYPE = new Class6077();
    }
}

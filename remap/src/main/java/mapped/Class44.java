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

public class Class44 extends NumberNBT
{
    public static final Class44 field104;
    public static final INBTType<Class44> field105;
    private final double field106;
    
    private Class44(final double field106) {
        this.field106 = field106;
    }
    
    public static Class44 method277(final double n) {
        return (n != 0.0) ? new Class44(n) : Class44.field104;
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
    public INBTType<Class44> getType() {
        return Class44.field105;
    }
    
    @Override
    public String toString() {
        return this.field106 + "d";
    }
    
    public Class44 method278() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class44 && this.field106 == ((Class44)o).field106);
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field106);
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field106)).appendSibling(new StringTextComponent("d").applyTextStyle(Class44.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(Class44.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long method270() {
        return (long)Math.floor(this.field106);
    }
    
    @Override
    public int method271() {
        return MathHelper.floor(this.field106);
    }
    
    @Override
    public short method272() {
        return (short)(MathHelper.floor(this.field106) & 0xFFFF);
    }
    
    @Override
    public byte method273() {
        return (byte)(MathHelper.floor(this.field106) & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.field106;
    }
    
    @Override
    public float method275() {
        return (float)this.field106;
    }
    
    @Override
    public Number method276() {
        return this.field106;
    }
    
    static {
        field104 = new Class44(0.0);
        field105 = new Class6069();
    }
}

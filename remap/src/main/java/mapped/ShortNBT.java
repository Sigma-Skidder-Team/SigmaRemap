// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class ShortNBT extends NumberNBT
{
    public static final INBTType<ShortNBT> TYPE;
    private final short field118;
    
    private ShortNBT(final short field118) {
        this.field118 = field118;
    }
    
    public static ShortNBT method286(final short n) {
        return (n >= -128 && n <= 1024) ? Class8018.field33027[n + 128] : new ShortNBT(n);
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.field118);
    }
    
    @Override
    public byte getId() {
        return 2;
    }
    
    @Override
    public INBTType<ShortNBT> getType() {
        return ShortNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return this.field118 + "s";
    }
    
    public ShortNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ShortNBT && this.field118 == ((ShortNBT)o).field118);
    }
    
    @Override
    public int hashCode() {
        return this.field118;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field118)).appendSibling(new StringTextComponent("s").applyTextStyle(ShortNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(ShortNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long getLong() {
        return this.field118;
    }
    
    @Override
    public int getInt() {
        return this.field118;
    }
    
    @Override
    public short getShort() {
        return this.field118;
    }
    
    @Override
    public byte getByte() {
        return (byte)(this.field118 & 0xFF);
    }
    
    @Override
    public double getDouble() {
        return this.field118;
    }
    
    @Override
    public float getFloat() {
        return this.field118;
    }
    
    @Override
    public Number getAsNumber() {
        return this.field118;
    }
    
    static {
        TYPE = new Class6076();
    }
}

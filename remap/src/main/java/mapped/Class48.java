// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class48 extends NumberNBT
{
    public static final INBTType<Class48> field117;
    private final short field118;
    
    private Class48(final short field118) {
        this.field118 = field118;
    }
    
    public static Class48 method286(final short n) {
        return (n >= -128 && n <= 1024) ? Class8018.field33027[n + 128] : new Class48(n);
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
    public INBTType<Class48> getType() {
        return Class48.field117;
    }
    
    @Override
    public String toString() {
        return this.field118 + "s";
    }
    
    public Class48 method287() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class48 && this.field118 == ((Class48)o).field118);
    }
    
    @Override
    public int hashCode() {
        return this.field118;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field118)).appendSibling(new StringTextComponent("s").applyTextStyle(Class48.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(Class48.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long method270() {
        return this.field118;
    }
    
    @Override
    public int method271() {
        return this.field118;
    }
    
    @Override
    public short method272() {
        return this.field118;
    }
    
    @Override
    public byte method273() {
        return (byte)(this.field118 & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.field118;
    }
    
    @Override
    public float method275() {
        return this.field118;
    }
    
    @Override
    public Number method276() {
        return this.field118;
    }
    
    static {
        field117 = new Class6076();
    }
}

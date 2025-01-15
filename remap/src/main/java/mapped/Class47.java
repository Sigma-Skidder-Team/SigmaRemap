// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class47 extends NumberNBT
{
    public static final INBTType<Class47> field113;
    public static final Class47 field114;
    public static final Class47 field115;
    private final byte field116;
    
    private Class47(final byte field116) {
        this.field116 = field116;
    }
    
    public static Class47 method283(final byte b) {
        return Class8548.method28694()[128 + b];
    }
    
    public static Class47 method284(final boolean b) {
        return b ? Class47.field115 : Class47.field114;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.field116);
    }
    
    @Override
    public byte getId() {
        return 1;
    }
    
    @Override
    public INBTType<Class47> getType() {
        return Class47.field113;
    }
    
    @Override
    public String toString() {
        return this.field116 + "b";
    }
    
    public Class47 method285() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class47 && this.field116 == ((Class47)o).field116);
    }
    
    @Override
    public int hashCode() {
        return this.field116;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.field116)).appendSibling(new StringTextComponent("b").applyTextStyle(Class47.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(Class47.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long method270() {
        return this.field116;
    }
    
    @Override
    public int method271() {
        return this.field116;
    }
    
    @Override
    public short method272() {
        return this.field116;
    }
    
    @Override
    public byte method273() {
        return this.field116;
    }
    
    @Override
    public double method274() {
        return this.field116;
    }
    
    @Override
    public float method275() {
        return this.field116;
    }
    
    @Override
    public Number method276() {
        return this.field116;
    }
    
    static {
        field113 = new Class6072();
        field114 = method283((byte)0);
        field115 = method283((byte)1);
    }
}

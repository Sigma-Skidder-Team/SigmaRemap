// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;

import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

public class ByteNBT extends NumberNBT
{
    public static final INBTType<ByteNBT> TYPE = new INBTType<ByteNBT>()
    {
        public ByteNBT func_225649_b_(DataInput p_225649_1_, int p_225649_2_, NBTSizeTracker p_225649_3_) throws IOException
        {
            p_225649_3_.read(72L);
            return ByteNBT.valueOf(p_225649_1_.readByte());
        }
        public String func_225648_a_()
        {
            return "BYTE";
        }
        public String func_225650_b_()
        {
            return "TAG_Byte";
        }
        public boolean func_225651_c_()
        {
            return true;
        }
    };
    public static final ByteNBT ZERO = valueOf((byte)0);
    public static final ByteNBT ONE = valueOf((byte)1);
    private final byte data;
    
    private ByteNBT(final byte field116) {
        this.data = field116;
    }

    public static ByteNBT valueOf(byte p_229671_0_)
    {
        return ByteNBT.Cache.CACHE[128 + p_229671_0_];
    }
    
    public static ByteNBT method284(final boolean b) {
        return b ? ByteNBT.ONE : ByteNBT.ZERO;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.data);
    }
    
    @Override
    public byte getId() {
        return 1;
    }
    
    @Override
    public INBTType<ByteNBT> getType() {
        return ByteNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return this.data + "b";
    }
    
    public ByteNBT copy() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ByteNBT && this.data == ((ByteNBT)o).data);
    }
    
    @Override
    public int hashCode() {
        return this.data;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent(String.valueOf(this.data)).appendSibling(new StringTextComponent("b").applyTextStyle(ByteNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).applyTextStyle(ByteNBT.SYNTAX_HIGHLIGHTING_NUMBER);
    }
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    @Override
    public int getInt() {
        return this.data;
    }
    
    @Override
    public short getShort() {
        return this.data;
    }
    
    @Override
    public byte getByte() {
        return this.data;
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    @Override
    public float getFloat() {
        return this.data;
    }
    
    @Override
    public Number getAsNumber() {
        return this.data;
    }

    static class Cache
    {
        private static final ByteNBT[] CACHE = new ByteNBT[256];

        static
        {
            for (int i = 0; i < CACHE.length; ++i)
            {
                CACHE[i] = new ByteNBT((byte)(i - 128));
            }
        }
    }
}

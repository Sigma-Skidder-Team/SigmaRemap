// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.CollectionNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.NumberNBT;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;

public class ByteArrayNBT extends CollectionNBT<ByteNBT>
{
    public static final INBTType<ByteArrayNBT> TYPE;
    private byte[] data;
    
    public ByteArrayNBT(final byte[] field97) {
        this.data = field97;
    }
    
    public ByteArrayNBT(final List<Byte> list) {
        this(toArray(list));
    }
    
    private static byte[] toArray(final List<Byte> list) {
        final byte[] array = new byte[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            final Byte b = list.get(i);
            array[i] = (byte)((b != null) ? ((byte)b) : 0);
        }
        return array;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.data.length);
        dataOutput.write(this.data);
    }
    
    @Override
    public byte getId() {
        return 7;
    }
    
    @Override
    public INBTType<ByteArrayNBT> getType() {
        return ByteArrayNBT.TYPE;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[B;");
        for (int i = 0; i < this.data.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.data[i]).append('B');
        }
        return sb.append(']').toString();
    }
    
    @Override
    public INBT copy() {
        final byte[] array = new byte[this.data.length];
        System.arraycopy(this.data, 0, array, 0, this.data.length);
        return new ByteArrayNBT(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ByteArrayNBT && Arrays.equals(this.data, ((ByteArrayNBT)o).data));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.data);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final ITextComponent method8469 = new StringTextComponent("B").applyTextStyle(ByteArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
        final ITextComponent method8470 = new StringTextComponent("[").appendSibling(method8469).appendText(";");
        for (int i = 0; i < this.data.length; ++i) {
            method8470.appendText(" ").appendSibling(new StringTextComponent(String.valueOf(this.data[i])).applyTextStyle(ByteArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER)).appendSibling(method8469);
            if (i != this.data.length - 1) {
                method8470.appendText(",");
            }
        }
        method8470.appendText("]");
        return method8470;
    }
    
    public byte[] getByteArray() {
        return this.data;
    }
    
    @Override
    public int size() {
        return this.data.length;
    }
    
    @Override
    public ByteNBT get(final int n) {
        return ByteNBT.valueOf(this.data[n]);
    }
    
    @Override
    public ByteNBT set(final int n, final ByteNBT class47) {
        final byte b = this.data[n];
        this.data[n] = class47.getByte();
        return ByteNBT.valueOf(b);
    }
    
    @Override
    public void add(final int n, final ByteNBT class47) {
        this.data = ArrayUtils.add(this.data, n, class47.getByte());
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.data[n] = ((NumberNBT)class41).getByte();
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.data = ArrayUtils.add(this.data, n, ((NumberNBT)class41).getByte());
        return true;
    }
    
    @Override
    public ByteNBT remove(final int n) {
        final byte b = this.data[n];
        this.data = ArrayUtils.remove(this.data, n);
        return ByteNBT.valueOf(b);
    }
    
    @Override
    public void clear() {
        this.data = new byte[0];
    }
    
    static {
        TYPE = new Class6081();
    }
}

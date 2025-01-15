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

public class Class40 extends CollectionNBT<Class47>
{
    public static final INBTType<Class40> field96;
    private byte[] field97;
    
    public Class40(final byte[] field97) {
        this.field97 = field97;
    }
    
    public Class40(final List<Byte> list) {
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
        dataOutput.writeInt(this.field97.length);
        dataOutput.write(this.field97);
    }
    
    @Override
    public byte getId() {
        return 7;
    }
    
    @Override
    public INBTType<Class40> getType() {
        return Class40.field96;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[B;");
        for (int i = 0; i < this.field97.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field97[i]).append('B');
        }
        return sb.append(']').toString();
    }
    
    @Override
    public INBT copy() {
        final byte[] array = new byte[this.field97.length];
        System.arraycopy(this.field97, 0, array, 0, this.field97.length);
        return new Class40(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class40 && Arrays.equals(this.field97, ((Class40)o).field97));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.field97);
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final ITextComponent method8469 = new StringTextComponent("B").applyTextStyle(Class40.SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
        final ITextComponent method8470 = new StringTextComponent("[").appendSibling(method8469).appendText(";");
        for (int i = 0; i < this.field97.length; ++i) {
            method8470.appendText(" ").appendSibling(new StringTextComponent(String.valueOf(this.field97[i])).applyTextStyle(Class40.SYNTAX_HIGHLIGHTING_NUMBER)).appendSibling(method8469);
            if (i != this.field97.length - 1) {
                method8470.appendText(",");
            }
        }
        method8470.appendText("]");
        return method8470;
    }
    
    public byte[] method266() {
        return this.field97;
    }
    
    @Override
    public int size() {
        return this.field97.length;
    }
    
    @Override
    public Class47 get(final int n) {
        return Class47.method283(this.field97[n]);
    }
    
    @Override
    public Class47 set(final int n, final Class47 class47) {
        final byte b = this.field97[n];
        this.field97[n] = class47.method273();
        return Class47.method283(b);
    }
    
    @Override
    public void add(final int n, final Class47 class47) {
        this.field97 = ArrayUtils.add(this.field97, n, class47.method273());
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.field97[n] = ((NumberNBT)class41).method273();
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.field97 = ArrayUtils.add(this.field97, n, ((NumberNBT)class41).method273());
        return true;
    }
    
    @Override
    public Class47 remove(final int n) {
        final byte b = this.field97[n];
        this.field97 = ArrayUtils.remove(this.field97, n);
        return Class47.method283(b);
    }
    
    @Override
    public void clear() {
        this.field97 = new byte[0];
    }
    
    static {
        field96 = new Class6081();
    }
}

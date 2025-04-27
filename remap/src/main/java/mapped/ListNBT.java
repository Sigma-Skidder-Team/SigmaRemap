// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.Arrays;
import com.google.common.base.Strings;
import java.util.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Iterator;
import java.io.DataOutput;
import com.google.common.collect.Lists;
import java.util.List;
import it.unimi.dsi.fastutil.bytes.ByteSet;
import net.minecraft.nbt.*;
import net.minecraft.util.text.ITextComponent;

public class ListNBT extends CollectionNBT<INBT>
{
    public static final INBTType<ListNBT> TYPE;
    private static final ByteSet field129;
    private final List<INBT> field130;
    private byte field131;
    
    private ListNBT(final List<INBT> field130, final byte field131) {
        this.field130 = field130;
        this.field131 = field131;
    }
    
    public ListNBT() {
        this(Lists.newArrayList(), (byte)0);
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        if (!this.field130.isEmpty()) {
            this.field131 = this.field130.get(0).getId();
        }
        else {
            this.field131 = 0;
        }
        dataOutput.writeByte(this.field131);
        dataOutput.writeInt(this.field130.size());
        final Iterator<INBT> iterator = this.field130.iterator();
        while (iterator.hasNext()) {
            iterator.next().write(dataOutput);
        }
    }
    
    @Override
    public byte getId() {
        return 9;
    }
    
    @Override
    public INBTType<ListNBT> getType() {
        return ListNBT.TYPE;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.field130.size(); ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.field130.get(i));
        }
        return sb.append(']').toString();
    }
    
    private void method345() {
        if (this.field130.isEmpty()) {
            this.field131 = 0;
        }
    }
    
    @Override
    public INBT remove(final int n) {
        final INBT class41 = this.field130.remove(n);
        this.method345();
        return class41;
    }
    
    @Override
    public boolean isEmpty() {
        return this.field130.isEmpty();
    }
    
    public CompoundNBT method346(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 10) {
                    return (CompoundNBT)class41;
                }
            }
        }
        return new CompoundNBT();
    }
    
    public ListNBT method347(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 9) {
                    return (ListNBT)class41;
                }
            }
        }
        return new ListNBT();
    }
    
    public short method348(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 2) {
                    return ((ShortNBT)class41).getShort();
                }
            }
        }
        return 0;
    }
    
    public int method349(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 3) {
                    return ((IntNBT)class41).getInt();
                }
            }
        }
        return 0;
    }
    
    public int[] method350(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 11) {
                    return ((IntArrayNBT)class41).getIntArray();
                }
            }
        }
        return new int[0];
    }
    
    public double method351(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 6) {
                    return ((DoubleNBT)class41).getDouble();
                }
            }
        }
        return 0.0;
    }
    
    public float method352(final int n) {
        if (n >= 0) {
            if (n < this.field130.size()) {
                final INBT class41 = this.field130.get(n);
                if (class41.getId() == 5) {
                    return ((FloatNBT)class41).getFloat();
                }
            }
        }
        return 0.0f;
    }
    
    public String method353(final int n) {
        if (n >= 0 && n < this.field130.size()) {
            final INBT class41 = this.field130.get(n);
            return (class41.getId() != 8) ? class41.toString() : class41.getString();
        }
        return "";
    }
    
    @Override
    public int size() {
        return this.field130.size();
    }
    
    @Override
    public INBT get(final int n) {
        return this.field130.get(n);
    }
    
    @Override
    public INBT set(final int n, final INBT class41) {
        final INBT value = this.get(n);
        if (this.func_218659_a(n, class41)) {
            return value;
        }
        throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", class41.getId(), this.field131));
    }
    
    @Override
    public void add(final int n, final INBT class41) {
        if (this.func_218660_b(n, class41)) {
            return;
        }
        throw new UnsupportedOperationException(String.format("Trying to add tag of type %d to list of %d", class41.getId(), this.field131));
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!this.method354(class41)) {
            return false;
        }
        this.field130.set(n, class41);
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!this.method354(class41)) {
            return false;
        }
        this.field130.add(n, class41);
        return true;
    }
    
    private boolean method354(final INBT class41) {
        if (class41.getId() == 0) {
            return false;
        }
        if (this.field131 != 0) {
            return this.field131 == class41.getId();
        }
        this.field131 = class41.getId();
        return true;
    }
    
    public ListNBT copy() {
        return new ListNBT(Lists.newArrayList((Iterable)(NBTTypes.func_229710_a_(this.field131).func_225651_c_() ? this.field130 : Iterables.transform(this.field130, INBT::copy))), this.field131);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ListNBT && Objects.equals(this.field130, ((ListNBT)o).field130));
    }
    
    @Override
    public int hashCode() {
        return this.field130.hashCode();
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        if (this.isEmpty()) {
            return new StringTextComponent("[]");
        }
        if (ListNBT.field129.contains(this.field131) && this.size() <= 8) {
            final StringTextComponent class2260 = new StringTextComponent("[");
            for (int i = 0; i < this.field130.size(); ++i) {
                if (i != 0) {
                    class2260.appendText(", ");
                }
                class2260.appendSibling(this.field130.get(i).toFormattedComponent());
            }
            class2260.appendText("]");
            return class2260;
        }
        final StringTextComponent class2261 = new StringTextComponent("[");
        if (!s.isEmpty()) {
            class2261.appendText("\n");
        }
        final String value = String.valueOf(',');
        for (int j = 0; j < this.field130.size(); ++j) {
            final StringTextComponent class2262 = new StringTextComponent(Strings.repeat(s, n + 1));
            class2262.appendSibling(this.field130.get(j).toFormattedComponent(s, n + 1));
            if (j != this.field130.size() - 1) {
                class2262.appendText(value).appendText(s.isEmpty() ? " " : "\n");
            }
            class2261.appendSibling(class2262);
        }
        if (!s.isEmpty()) {
            class2261.appendText("\n").appendText(Strings.repeat(s, n));
        }
        class2261.appendText("]");
        return class2261;
    }
    
    public int getTagType() {
        return this.field131;
    }
    
    @Override
    public void clear() {
        this.field130.clear();
        this.field131 = 0;
    }
    
    static {
        TYPE = new Class6074();
        field129 = new ByteOpenHashSet((Collection)Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}

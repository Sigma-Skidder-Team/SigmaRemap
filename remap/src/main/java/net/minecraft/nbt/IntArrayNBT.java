// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import mapped.*;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;
import java.util.List;

public class IntArrayNBT extends CollectionNBT<IntNBT>
{
    public static final INBTType<IntArrayNBT> TYPE;
    private int[] intArray;
    
    public IntArrayNBT(final int[] field133) {
        this.intArray = field133;
    }
    
    public IntArrayNBT(final List<Integer> list) {
        this(toArray(list));
    }
    
    private static int[] toArray(final List<Integer> list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            final Integer n = list.get(i);
            array[i] = ((n != null) ? n : 0);
        }
        return array;
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.intArray.length);
        final int[] field133 = this.intArray;
        for (int length = field133.length, i = 0; i < length; ++i) {
            dataOutput.writeInt(field133[i]);
        }
    }
    
    @Override
    public byte getId() {
        return 11;
    }
    
    @Override
    public INBTType<IntArrayNBT> getType() {
        return IntArrayNBT.TYPE;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[I;");
        for (int i = 0; i < this.intArray.length; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(this.intArray[i]);
        }
        return sb.append(']').toString();
    }
    
    public IntArrayNBT copy() {
        final int[] array = new int[this.intArray.length];
        System.arraycopy(this.intArray, 0, array, 0, this.intArray.length);
        return new IntArrayNBT(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof IntArrayNBT && Arrays.equals(this.intArray, ((IntArrayNBT)o).intArray));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.intArray);
    }
    
    public int[] getIntArray() {
        return this.intArray;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        final ITextComponent method8457 = new StringTextComponent("[").appendSibling(new StringTextComponent("I").applyTextStyle(IntArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER_TYPE)).appendText(";");
        for (int i = 0; i < this.intArray.length; ++i) {
            method8457.appendText(" ").appendSibling(new StringTextComponent(String.valueOf(this.intArray[i])).applyTextStyle(IntArrayNBT.SYNTAX_HIGHLIGHTING_NUMBER));
            if (i != this.intArray.length - 1) {
                method8457.appendText(",");
            }
        }
        method8457.appendText("]");
        return method8457;
    }
    
    @Override
    public int size() {
        return this.intArray.length;
    }
    
    @Override
    public IntNBT get(final int n) {
        return IntNBT.valueOf(this.intArray[n]);
    }
    
    @Override
    public IntNBT set(final int n, final IntNBT class45) {
        final int n2 = this.intArray[n];
        this.intArray[n] = class45.getInt();
        return IntNBT.valueOf(n2);
    }
    
    @Override
    public void add(final int n, final IntNBT class45) {
        this.intArray = ArrayUtils.add(this.intArray, n, class45.getInt());
    }
    
    @Override
    public boolean func_218659_a(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.intArray[n] = ((NumberNBT)class41).getInt();
        return true;
    }
    
    @Override
    public boolean func_218660_b(final int n, final INBT class41) {
        if (!(class41 instanceof NumberNBT)) {
            return false;
        }
        this.intArray = ArrayUtils.add(this.intArray, n, ((NumberNBT)class41).getInt());
        return true;
    }
    
    @Override
    public IntNBT remove(final int n) {
        final int n2 = this.intArray[n];
        this.intArray = ArrayUtils.remove(this.intArray, n);
        return IntNBT.valueOf(n2);
    }
    
    @Override
    public void clear() {
        this.intArray = new int[0];
    }
    
    static {
        TYPE = new Class6079();
    }
}

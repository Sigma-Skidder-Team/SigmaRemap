// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.IntArrayNBT;

import java.io.IOException;
import java.io.DataInput;

public final class Class6079 implements INBTType<IntArrayNBT>
{
    public IntArrayNBT func_225649_b_(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(192L);
        final int int1 = dataInput.readInt();
        class7553.read(32L * int1);
        final int[] array = new int[int1];
        for (int i = 0; i < int1; ++i) {
            array[i] = dataInput.readInt();
        }
        return new IntArrayNBT(array);
    }
    
    @Override
    public String func_225648_a_() {
        return "INT[]";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Int_Array";
    }
}

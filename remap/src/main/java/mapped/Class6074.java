// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;

public final class Class6074 implements INBTType<ListNBT>
{
    public ListNBT method18129(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(296L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        final byte byte1 = dataInput.readByte();
        final int int1 = dataInput.readInt();
        if (byte1 == 0 && int1 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        class7553.read(32L * int1);
        final INBTType<?> method24059 = NBTTypes.func_229710_a_(byte1);
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(int1);
        for (int i = 0; i < int1; ++i) {
            arrayListWithCapacity.add(method24059.func_225649_b_(dataInput, n + 1, class7553));
        }
        return new ListNBT(arrayListWithCapacity, byte1, null);
    }
    
    @Override
    public String func_225648_a_() {
        return "LIST";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_List";
    }
}

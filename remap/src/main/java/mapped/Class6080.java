// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6080 implements INBTType<Class39>
{
    public Class39 method18135(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(192L);
        final int int1 = dataInput.readInt();
        class7553.read(64L * int1);
        final long[] array = new long[int1];
        for (int i = 0; i < int1; ++i) {
            array[i] = dataInput.readLong();
        }
        return new Class39(array);
    }
    
    @Override
    public String func_225648_a_() {
        return "LONG[]";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Long_Array";
    }
}

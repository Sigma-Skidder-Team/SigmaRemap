// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6081 implements INBTType<Class40>
{
    public Class40 method18136(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(192L);
        final int int1 = dataInput.readInt();
        class7553.read(8L * int1);
        final byte[] array = new byte[int1];
        dataInput.readFully(array);
        return new Class40(array);
    }
    
    @Override
    public String func_225648_a_() {
        return "BYTE[]";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Byte_Array";
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6072 implements INBTType<ByteNBT>
{
    public ByteNBT method18127(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(72L);
        return ByteNBT.valueOf(dataInput.readByte());
    }
    
    @Override
    public String func_225648_a_() {
        return "BYTE";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Byte";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

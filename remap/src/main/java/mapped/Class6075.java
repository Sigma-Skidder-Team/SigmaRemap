// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.IntNBT;

import java.io.IOException;
import java.io.DataInput;

public final class Class6075 implements INBTType<IntNBT>
{
    public IntNBT method18130(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(96L);
        return IntNBT.valueOf(dataInput.readInt());
    }
    
    @Override
    public String func_225648_a_() {
        return "INT";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Int";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

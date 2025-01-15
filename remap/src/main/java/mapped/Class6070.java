// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBTType;

import java.io.DataInput;

public final class Class6070 implements INBTType<EndNBT>
{
    public EndNBT method18126(final DataInput dataInput, final int n, final NBTSizeTracker class7553) {
        class7553.read(64L);
        return EndNBT.INSTANCE;
    }
    
    @Override
    public String func_225648_a_() {
        return "END";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_End";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

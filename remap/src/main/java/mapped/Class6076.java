// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6076 implements INBTType<ShortNBT>
{
    public ShortNBT method18131(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(80L);
        return ShortNBT.method286(dataInput.readShort());
    }
    
    @Override
    public String func_225648_a_() {
        return "SHORT";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Short";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

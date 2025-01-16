// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6069 implements INBTType<DoubleNBT>
{
    public DoubleNBT method18125(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(128L);
        return DoubleNBT.method277(dataInput.readDouble());
    }
    
    @Override
    public String func_225648_a_() {
        return "DOUBLE";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Double";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

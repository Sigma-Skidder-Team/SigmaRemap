// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6067 implements INBTType<Class49>
{
    public Class49 method18119(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(128L);
        return Class49.method288(dataInput.readLong());
    }
    
    @Override
    public String func_225648_a_() {
        return "LONG";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Long";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

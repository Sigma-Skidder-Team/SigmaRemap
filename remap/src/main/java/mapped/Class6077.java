// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6077 implements INBTType<Class46>
{
    public Class46 method18132(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(96L);
        return Class46.method281(dataInput.readFloat());
    }
    
    @Override
    public String func_225648_a_() {
        return "FLOAT";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_Float";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

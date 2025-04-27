// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6078 implements INBTType<StringNBT>
{
    public StringNBT method18133(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        class7553.read(288L);
        final String utf = dataInput.readUTF();
        class7553.read(16L * utf.length());
        return StringNBT.method290(utf);
    }
    
    @Override
    public String func_225648_a_() {
        return "STRING";
    }
    
    @Override
    public String func_225650_b_() {
        return "TAG_String";
    }
    
    @Override
    public boolean func_225651_c_() {
        return true;
    }
}

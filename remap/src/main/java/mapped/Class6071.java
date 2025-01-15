// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBTType;

import java.io.IOException;
import java.io.DataInput;

public final class Class6071 implements INBTType<EndNBT>
{
    public final /* synthetic */ int field24694;
    
    public Class6071(final int field24694) {
        this.field24694 = field24694;
    }
    
    public EndNBT method18126(final DataInput dataInput, final int n, final NBTSizeTracker class7553) throws IOException {
        throw new IllegalArgumentException("Invalid tag id: " + this.field24694);
    }
    
    @Override
    public String func_225648_a_() {
        return "INVALID[" + this.field24694 + "]";
    }
    
    @Override
    public String func_225650_b_() {
        return "UNKNOWN_" + this.field24694;
    }
}

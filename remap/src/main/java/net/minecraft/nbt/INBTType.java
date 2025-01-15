// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import mapped.NBTSizeTracker;

import java.io.IOException;
import java.io.DataInput;

public interface INBTType<T extends INBT>
{
    T func_225649_b_(final DataInput p0, final int p1, final NBTSizeTracker p2) throws IOException;
    
    default boolean func_225651_c_() {
        return false;
    }
    
    String func_225648_a_();
    
    String func_225650_b_();

    static INBTType<EndNBT> func_229707_a_(final int p_229707_0_)
    {
        return new INBTType<EndNBT>()
        {
            public EndNBT func_225649_b_(DataInput p_225649_1_, int p_225649_2_, NBTSizeTracker p_225649_3_) throws IOException
            {
                throw new IllegalArgumentException("Invalid tag id: " + p_229707_0_);
            }
            public String func_225648_a_()
            {
                return "INVALID[" + p_229707_0_ + "]";
            }
            public String func_225650_b_()
            {
                return "UNKNOWN_" + p_229707_0_;
            }
        };
    }
}

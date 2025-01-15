// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import mapped.StringTextComponent;
import mapped.NBTSizeTracker;
import net.minecraft.util.text.ITextComponent;

import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

public class EndNBT implements INBT
{
    public static final INBTType<EndNBT> TYPE = new INBTType<EndNBT>()
    {
        public EndNBT func_225649_b_(DataInput p_225649_1_, int p_225649_2_, NBTSizeTracker p_225649_3_)
        {
            p_225649_3_.read(64L);
            return EndNBT.INSTANCE;
        }
        public String func_225648_a_()
        {
            return "END";
        }
        public String func_225650_b_()
        {
            return "TAG_End";
        }
        public boolean func_225651_c_()
        {
            return true;
        }
    };
    public static final EndNBT INSTANCE = new EndNBT();
    
    private EndNBT() {
    }
    
    @Override
    public void write(final DataOutput dataOutput) throws IOException {
    }
    
    @Override
    public byte getId() {
        return 0;
    }
    
    @Override
    public INBTType<EndNBT> getType() {
        return EndNBT.TYPE;
    }
    
    @Override
    public String toString() {
        return "END";
    }
    
    public EndNBT copy() {
        return this;
    }
    
    @Override
    public ITextComponent toFormattedComponent(final String s, final int n) {
        return new StringTextComponent("");
    }
}

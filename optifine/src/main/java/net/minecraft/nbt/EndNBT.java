package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

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

    private EndNBT()
    {
    }

    public void write(DataOutput output) throws IOException
    {
    }

    public byte getId()
    {
        return 0;
    }

    public INBTType<EndNBT> getType()
    {
        return TYPE;
    }

    public String toString()
    {
        return "END";
    }

    public EndNBT copy()
    {
        return this;
    }

    public ITextComponent toFormattedComponent(String indentation, int indentDepth)
    {
        return new StringTextComponent("");
    }
}

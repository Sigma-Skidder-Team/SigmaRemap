// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;

public interface Class5414
{
    void method16525(final CompoundNBT p0) throws CommandSyntaxException;
    
    CompoundNBT method16526() throws CommandSyntaxException;
    
    ITextComponent method16527();
    
    ITextComponent method16528(final INBT p0);
    
    ITextComponent method16529(final NBTPath p0, final double p1, final int p2);
}

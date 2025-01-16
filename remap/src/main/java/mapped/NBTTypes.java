// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.nbt.IntNBT;

public class NBTTypes
{
    private static final INBTType<?>[] field_229709_a_;

    public static INBTType<?> func_229710_a_(final int n) {
        return (n >= 0 && n < NBTTypes.field_229709_a_.length) ? NBTTypes.field_229709_a_[n] : INBTType.func_229707_a_(n);
    }

    static {
        field_229709_a_ = new INBTType[] { EndNBT.TYPE, ByteNBT.TYPE, ShortNBT.TYPE, IntNBT.TYPE, LongNBT.TYPE, FloatNBT.TYPE, DoubleNBT.TYPE, ByteArrayNBT.TYPE, StringNBT.TYPE, ListNBT.TYPE, CompoundNBT.TYPE, IntArrayNBT.TYPE, LongArrayNBT.TYPE};
    }
}

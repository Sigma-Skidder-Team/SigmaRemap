// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.INBTType;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.nbt.IntNBT;

public class Class7638
{
    private static String[] field30274;
    private static final INBTType<?>[] field30275;
    
    public static INBTType<?> method24059(final int n) {
        return (n >= 0 && n < Class7638.field30275.length) ? Class7638.field30275[n] : INBTType.func_229707_a_(n);
    }
    
    static {
        field30275 = new INBTType[] { EndNBT.TYPE, Class47.field113, Class48.field117, IntNBT.TYPE, Class49.field119, Class46.field111, Class44.field105, Class40.field96, Class50.field121, Class52.field128, Class51.field126, IntArrayNBT.TYPE, Class39.field94 };
    }
}

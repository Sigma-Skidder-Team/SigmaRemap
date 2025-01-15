// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Arrays;

public class Class8521
{
    private Class1932 field35774;
    private float[] field35775;
    
    public Class8521(final Class1932 field35774, final float[] array) {
        this.field35774 = field35774;
        Arrays.sort(this.field35775 = array.clone());
    }
    
    public Integer method28533(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Class8967 method11700 = class8321.method27622().method11700(this.field35774);
        if (method11700 != null) {
            return Arrays.binarySearch(this.field35775, method11700.method31812(class8321, class8322, class8323));
        }
        return null;
    }
    
    public Class1932 method28534() {
        return this.field35774;
    }
    
    public float[] method28535() {
        return this.field35775;
    }
    
    @Override
    public String toString() {
        return "location: " + this.field35774 + ", values: [" + Class8571.method28892(this.field35775) + "]";
    }
}

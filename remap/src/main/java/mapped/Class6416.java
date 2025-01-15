// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.dispenser.IPosition;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class6416 extends Class6409
{
    private static String[] field25523;
    public final /* synthetic */ Class6425 field25528;
    
    public Class6416(final Class6425 field25528) {
        this.field25528 = field25528;
    }
    
    @Override
    public Class401 method19093(final World class1847, final IPosition class1848, final ItemStack class1849) {
        return Class8349.method27851(new Class415(class1847, class1848.getX(), class1848.getY(), class1848.getZ()), class1851 -> class1851.method2022(class1850));
    }
    
    @Override
    public float method19094() {
        return super.method19094() * 0.5f;
    }
    
    @Override
    public float method19095() {
        return super.method19095() * 1.25f;
    }
}

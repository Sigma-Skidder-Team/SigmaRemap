// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.dispenser.IPosition;

public class Class6415 extends Class6409
{
    private static String[] field25523;
    public final /* synthetic */ Class6424 field25527;
    
    public Class6415(final Class6424 field25527) {
        this.field25527 = field25527;
    }
    
    @Override
    public Class401 method19093(final Class1847 class1847, final IPosition class1848, final Class8321 class1849) {
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

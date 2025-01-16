// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6158 extends Class6157
{
    private static String[] field24907;
    
    private Class6158(final World class1847, final double n, final double n2, final double n3, final Fluid class1848, final IParticleData class1849) {
        super(class1847, n, n2, n3, class1848, class1849, null);
    }
    
    @Override
    public void method18421() {
        this.field24953 = 1.0f;
        this.field24954 = 16.0f / (40 - this.field24951 + 16);
        this.field24955 = 4.0f / (40 - this.field24951 + 8);
        super.method18421();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6207 extends Class6206
{
    private static String[] field25042;
    
    private Class6207(final World class1847, final double n, final double n2, final double n3, final Fluid class1848, final IParticleData class1849) {
        super(class1847, n, n2, n3, class1848, class1849, null);
    }
    
    @Override
    public void method18422() {
        if (this.field24943) {
            this.method18439();
            this.field24932.addParticle(this.field25041, this.field24936, this.field24937, this.field24938, 0.0, 0.0, 0.0);
            this.field24932.method6708(this.field24936 + 0.5, this.field24937, this.field24938 + 0.5, Class8520.field35020, Class286.field1582, 0.3f + this.field24932.rand.nextFloat() * 2.0f / 3.0f, 1.0f, false);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6206 extends Class6205
{
    private static String[] field25040;
    public final IParticleData field25041;
    
    private Class6206(final World class1847, final double n, final double n2, final double n3, final Fluid class1848, final IParticleData field25041) {
        super(class1847, n, n2, n3, class1848, null);
        this.field25041 = field25041;
    }
    
    @Override
    public void method18422() {
        if (this.field24943) {
            this.method18439();
            this.field24932.addParticle(this.field25041, this.field24936, this.field24937, this.field24938, 0.0, 0.0, 0.0);
        }
    }
}

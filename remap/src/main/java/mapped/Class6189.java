// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6189 extends Class6188
{
    private static String[] field25003;
    
    private Class6189(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class7805 class1848) {
        super(class1847, n, n2, n3, n4, n5, n6, class1848);
        this.field24952 = 0.5f;
    }
    
    @Override
    public void method18420() {
        super.method18420();
        this.field24940 -= 0.004 + 0.04 * this.field24952;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6200 extends Class6197
{
    private static String[] field25022;
    
    private Class6200(final World class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class7805 class1848) {
        super(class1847, n, n2, n3, class1848, -0.05f);
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.field24930 *= 0.75f;
        this.field24951 = 60 + this.field24949.nextInt(12);
        this.method18429(class1848);
        if (this.field24949.nextInt(4) != 0) {
            this.method18435(0.1f + this.field24949.nextFloat() * 0.2f, 0.4f + this.field24949.nextFloat() * 0.3f, this.field24949.nextFloat() * 0.2f);
        }
        else {
            this.method18435(0.6f + this.field24949.nextFloat() * 0.2f, 0.6f + this.field24949.nextFloat() * 0.3f, this.field24949.nextFloat() * 0.2f);
        }
        this.method18457(0.6f);
    }
}

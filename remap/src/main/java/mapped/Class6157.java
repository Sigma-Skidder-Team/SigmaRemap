// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6157 extends Class6156
{
    private static String[] field24907;
    private final Class6909 field24909;
    
    private Class6157(final World class1847, final double n, final double n2, final double n3, final Class7255 class1848, final Class6909 field24909) {
        super(class1847, n, n2, n3, class1848, null);
        this.field24909 = field24909;
        this.field24952 *= 0.02f;
        this.field24951 = 40;
    }
    
    @Override
    public void method18421() {
        if (this.field24951-- <= 0) {
            this.method18439();
            this.field24932.method6709(this.field24909, this.field24936, this.field24937, this.field24938, this.field24939, this.field24940, this.field24941);
        }
    }
    
    @Override
    public void method18422() {
        this.field24939 *= 0.02;
        this.field24940 *= 0.02;
        this.field24941 *= 0.02;
    }
}
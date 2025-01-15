// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6178 extends Class6175
{
    private static String[] field24966;
    private int field24976;
    private final int field24977 = 8;
    
    private Class6178(final World class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
    }
    
    @Override
    public void method18420() {
        for (int i = 0; i < 6; ++i) {
            final double n = this.field24936 + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 4.0;
            final double n2 = this.field24937 + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 4.0;
            final double n3 = this.field24938 + (this.field24949.nextDouble() - this.field24949.nextDouble()) * 4.0;
            final World field24932 = this.field24932;
            final Class6908 field24933 = Class8432.field34619;
            final double n4 = n;
            final double n5 = n2;
            final double n6 = n3;
            final float n7 = (float)this.field24976;
            this.getClass();
            field24932.method6709(field24933, n4, n5, n6, n7 / 8.0f, 0.0, 0.0);
        }
        ++this.field24976;
        final int field24934 = this.field24976;
        this.getClass();
        if (field24934 == 8) {
            this.method18439();
        }
    }
}

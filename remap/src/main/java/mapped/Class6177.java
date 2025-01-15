// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class6177 extends Class6175
{
    private static String[] field24971;
    private final Entity field24972;
    private int field24973;
    private final int field24974;
    private final Class6909 field24975;
    
    public Class6177(final Class1847 class1847, final Entity class1848, final Class6909 class1849) {
        this(class1847, class1848, class1849, 3);
    }
    
    public Class6177(final Class1847 class1847, final Entity class1848, final Class6909 class1849, final int n) {
        this(class1847, class1848, class1849, n, class1848.method1935());
    }
    
    private Class6177(final Class1847 class1847, final Entity field24972, final Class6909 field24973, final int field24974, final Vec3d class1848) {
        super(class1847, field24972.method1938(), field24972.method1942(0.5), field24972.method1945(), class1848.field22770, class1848.field22771, class1848.field22772);
        this.field24972 = field24972;
        this.field24974 = field24974;
        this.field24975 = field24973;
        this.method18420();
    }
    
    @Override
    public void method18420() {
        for (int i = 0; i < 16; ++i) {
            final double n = this.field24949.nextFloat() * 2.0f - 1.0f;
            final double n2 = this.field24949.nextFloat() * 2.0f - 1.0f;
            final double n3 = this.field24949.nextFloat() * 2.0f - 1.0f;
            if (n * n + n2 * n2 + n3 * n3 <= 1.0) {
                this.field24932.method6710(this.field24975, false, this.field24972.method1939(n / 4.0), this.field24972.method1942(0.5 + n2 / 4.0), this.field24972.method1946(n3 / 4.0), n, n2 + 0.2, n3);
            }
        }
        ++this.field24973;
        if (this.field24973 >= this.field24974) {
            this.method18439();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6187 extends Class6159
{
    private static String[] field24999;
    private final Class7805 field25000;
    
    private Class6187(final World class1847, final double n, final double n2, final double n3, final double n4, final Class7805 field25000) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24951 = 6 + this.field24949.nextInt(4);
        final float field25001 = this.field24949.nextFloat() * 0.6f + 0.4f;
        this.field24953 = field25001;
        this.field24954 = field25001;
        this.field24955 = field25001;
        this.field24930 = 2.0f * (1.0f - (float)n4 * 0.5f);
        this.method18429(this.field25000 = field25000);
    }
    
    @Override
    public int method18419(final float n) {
        return 15728880;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field25000);
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25661;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class6167 extends Class6159
{
    private static String[] field24923;
    private final float field24924;
    private final float field24925;
    
    private Class6167(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final ItemStack class1848) {
        this(class1847, n, n2, n3, class1848);
        this.field24939 *= 0.10000000149011612;
        this.field24940 *= 0.10000000149011612;
        this.field24941 *= 0.10000000149011612;
        this.field24939 += n4;
        this.field24940 += n5;
        this.field24941 += n6;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25658;
    }
    
    public Class6167(final World class1847, final double n, final double n2, final double n3, final ItemStack class1848) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.method18423(Class869.method5277().method5307().method6534(class1848, class1847, null).method18696());
        this.field24952 = 1.0f;
        this.field24930 /= 2.0f;
        this.field24924 = this.field24949.nextFloat() * 3.0f;
        this.field24925 = this.field24949.nextFloat() * 3.0f;
    }
    
    @Override
    public float method18424() {
        return this.field24910.method7499((this.field24924 + 1.0f) / 4.0f * 16.0f);
    }
    
    @Override
    public float method18425() {
        return this.field24910.method7499(this.field24924 / 4.0f * 16.0f);
    }
    
    @Override
    public float method18426() {
        return this.field24910.method7502(this.field24925 / 4.0f * 16.0f);
    }
    
    @Override
    public float method18427() {
        return this.field24910.method7502((this.field24925 + 1.0f) / 4.0f * 16.0f);
    }
}

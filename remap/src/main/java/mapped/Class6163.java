// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6163 extends Class6159
{
    private static String[] field24917;
    
    private Class6163(final World class1847, final double n, final double n2, final double n3, final Class3832 class1848) {
        super(class1847, n, n2, n3);
        this.method18423(Minecraft.method5277().getItemRenderer().method6529().method22204(class1848));
        this.field24952 = 0.0f;
        this.field24951 = 80;
        this.field24944 = false;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25658;
    }
    
    @Override
    public float method18430(final float n) {
        return 0.5f;
    }
}

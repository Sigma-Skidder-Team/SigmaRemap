// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3563 extends Class3555<Class511>
{
    private static String[] field16651;
    
    public Class3563(final Class841 class841) {
        super(class841, Class511.class, 10, true, false, class842 -> class842 instanceof Class762);
    }
    
    @Override
    public boolean method11013() {
        return this.field16602.method1825() != null && super.method11013();
    }
    
    @Override
    public Class6221 method11103(final double n) {
        final Direction method5018 = ((Class841)this.field16602).method5018();
        if (method5018.getAxis() != Axis.X) {
            return (method5018.getAxis() != Axis.Z) ? this.field16602.method1886().method18495(n, 4.0, n) : this.field16602.method1886().method18495(n, n, 4.0);
        }
        return this.field16602.method1886().method18495(4.0, n, n);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public enum Class2185
{
    field12960, 
    field12961, 
    field12962;
    
    public static Class2185 method8352(final World class1847, final float n) {
        if (class1847.method6766(n) <= 0.5f) {
            return (class1847.method6768(n) <= 0.5f) ? Class2185.field12960 : Class2185.field12961;
        }
        return Class2185.field12962;
    }
}

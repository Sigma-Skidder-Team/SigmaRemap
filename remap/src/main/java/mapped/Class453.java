// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import javax.annotation.Nullable;

public interface Class453 extends Class446
{
    public static final Class7702 field2701 = Class3833.method11778(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
    public static final Class7702 field2702 = Class3833.method11778(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
    public static final Class7702 field2703 = Class7698.method24492(Class453.field2701, Class453.field2702);
    
    default Class7702 method2285() {
        return Class453.field2703;
    }
    
    @Nullable
    World method2186();
    
    double method2286();
    
    double method2287();
    
    double method2288();
}

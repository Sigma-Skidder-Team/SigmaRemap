// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;

public class Class7984
{
    private static String[] field32856;
    
    public static ResourceLocation method26041(final Class3090 class3090) {
        return Registry.field217.getKey(class3090);
    }
    
    public static Class3090 method26042(final ResourceLocation class1932) {
        return Registry.field217.method510(class1932) ? Registry.field217.getOrDefault(class1932) : null;
    }
    
    public static Class3090 method26043(final ResourceLocation class1932) {
        return Registry.field217.getOrDefault(class1932);
    }
    
    public static Set<ResourceLocation> method26044() {
        return Registry.field217.method507();
    }
    
    public static Class3090 method26045(final Class1856 class1856, final BlockPos class1857) {
        Class3090 class1858 = Class7102.field27633;
        if (!(class1856 instanceof Class1857)) {
            if (class1856 instanceof Class1852) {
                class1858 = ((Class1852)class1856).method6959(class1857);
            }
        }
        else {
            class1858 = ((Class1857)class1856).method6999(class1857);
        }
        return class1858;
    }
}

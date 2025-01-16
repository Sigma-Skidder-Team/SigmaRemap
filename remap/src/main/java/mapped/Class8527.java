// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class8527
{
    private static final Map<ResourceLocation, Class6529<?>> field35799;
    private static final Map<Class<?>, Class6529<?>> field35800;
    
    private static void method28606(final Class6529<?> class6529) {
        Class8527.field35799.put(class6529.method19754(), class6529);
        Class8527.field35800.put(class6529.method19755(), class6529);
    }
    
    static {
        field35799 = Maps.newHashMap();
        field35800 = Maps.newHashMap();
        method28606(Class6369.method19021(new ResourceLocation("alternatives"), Class6370.class, Class6370::new));
        method28606(Class6369.method19021(new ResourceLocation("sequence"), Class6372.class, Class6372::new));
        method28606(Class6369.method19021(new ResourceLocation("group"), Class6371.class, Class6371::new));
        method28606(new Class6527());
        method28606(new Class6535());
        method28606(new Class6533());
        method28606(new Class6532());
        method28606(new Class6534());
    }
}

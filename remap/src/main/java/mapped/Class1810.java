// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class1810 extends Class1799<Class786, Class5874<Class786>>
{
    private static final Map<Class2195, ResourceLocation> field9981;
    
    public Class1810(final Class4778<Class786, Class5874<Class786>> class4778) {
        super(class4778);
    }
    
    public void method6570(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class786 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!class7353.method1823()) {
            final Class2195 method4337 = class7353.method4337();
            if (method4337 != Class2195.field13358) {
                Class1799.method6558(((Class1799<T, Class5845<Class786>>)this).method6559(), Class1810.field9981.get(method4337), class7351, class7352, n, class7353, 1.0f, 1.0f, 1.0f);
            }
        }
    }
    
    static {
        field9981 = (Map)ImmutableMap.of(Class2195.field13359, new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_low.png"), Class2195.field13360, new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_medium.png"), (Object)Class2195.field13361, (Object)new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_high.png"));
    }
}

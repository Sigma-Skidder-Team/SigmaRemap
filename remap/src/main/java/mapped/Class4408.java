// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.Dynamic;

public class Class4408 implements Class4407
{
    private final Class7096 field19738;
    private final Class7096 field19739;
    private final Class7096 field19740;
    
    public Class4408(final Class7096 field19738, final Class7096 field19739, final Class7096 field19740) {
        this.field19738 = field19738;
        this.field19739 = field19739;
        this.field19740 = field19740;
    }
    
    @Override
    public Class7096 method13338() {
        return this.field19738;
    }
    
    @Override
    public Class7096 method13339() {
        return this.field19739;
    }
    
    public Class7096 method13340() {
        return this.field19740;
    }
    
    public static Class4408 method13341(final Dynamic<?> dynamic) {
        return new Class4408(dynamic.get("top_material").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()), dynamic.get("under_material").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()), dynamic.get("underwater_material").map((Function)Class7096::method21764).orElse(Class7521.field29147.method11878()));
    }
}

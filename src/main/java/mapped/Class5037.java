// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class5037 extends Class5033
{
    public Class5037(final Schema schema, final boolean b) {
        super("EntityElderGuardianSplitFix", schema, b);
    }
    
    @Override
    public Pair<String, Dynamic<?>> method15323(final String a, final Dynamic<?> dynamic) {
        return (Pair<String, Dynamic<?>>)Pair.of((Object)((Objects.equals(a, "Guardian") && dynamic.get("Elder").asBoolean(false)) ? "ElderGuardian" : a), (Object)dynamic);
    }
}

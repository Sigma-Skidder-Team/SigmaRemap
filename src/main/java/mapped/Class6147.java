// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import java.util.Locale;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class6147 extends Class6132
{
    private static final Map<String, String> field24881;
    
    public Class6147(final Schema schema, final boolean b) {
        super(schema, b, "EntityPaintingMotiveFix", Class9451.field40626, "minecraft:painting");
    }
    
    public Dynamic<?> method18377(final Dynamic<?> dynamic) {
        final Optional string = dynamic.get("Motive").asString();
        if (!string.isPresent()) {
            return dynamic;
        }
        final String lowerCase = string.get().toLowerCase(Locale.ROOT);
        return (Dynamic<?>)dynamic.set("Motive", dynamic.createString(new Class1932(Class6147.field24881.getOrDefault(lowerCase, lowerCase)).toString()));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18377);
    }
    
    static {
        field24881 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("donkeykong", "donkey_kong");
            hashMap.put("burningskull", "burning_skull");
            hashMap.put("skullandroses", "skull_and_roses");
        });
    }
}

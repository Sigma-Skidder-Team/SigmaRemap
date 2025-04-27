// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6141 extends Class6132
{
    public Class6141(final Schema schema, final boolean b) {
        super(schema, b, "OminousBannerBlockEntityRenameFix", Class9451.field40621, "minecraft:banner");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18366);
    }
    
    private Dynamic<?> method18366(final Dynamic<?> dynamic) {
        final Optional string = dynamic.get("CustomName").asString();
        if (!string.isPresent()) {
            return dynamic;
        }
        return dynamic.set("CustomName", dynamic.createString(((String)string.get()).replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")));
    }
}

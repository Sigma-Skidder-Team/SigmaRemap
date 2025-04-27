// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6144 extends Class6132
{
    public Class6144(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntityBannerColorFix", Class9451.field40621, "minecraft:banner");
    }
    
    public Dynamic<?> method18370(final Dynamic<?> dynamic) {
        return dynamic.update("Base", dynamic2 -> dynamic2.createInt(15 - dynamic2.asInt(0))).update("Patterns", dynamic3 -> DataFixUtils.orElse((Optional)dynamic3.asStreamOpt().map(stream -> stream.map(dynamic4 -> dynamic4.update("Color", dynamic5 -> dynamic5.createInt(15 - dynamic5.asInt(0))))).map(dynamic3::createList), (Object)dynamic3));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18370);
    }
}

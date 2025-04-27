// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.util.Pair;
import java.util.stream.Stream;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public abstract class Class5476 extends DataFix
{
    public Class5476(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40620.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40620))) {
            return this.fixTypeEverywhere("POI rename", named, p0 -> pair -> pair.mapSecond((Function)this::method16717));
        }
        throw new IllegalStateException("Poi type is not what was expected.");
    }
    
    private <T> Dynamic<T> method16717(final Dynamic<T> dynamic) {
        return dynamic.update("Sections", dynamic2 -> dynamic2.updateMapValues(pair -> pair.mapSecond(dynamic3 -> dynamic3.update("Records", dynamic4 -> DataFixUtils.orElse((Optional)this.method16718((Dynamic<Object>)dynamic4), (Object)dynamic4)))));
    }
    
    private <T> Optional<Dynamic<T>> method16718(final Dynamic<T> dynamic) {
        return dynamic.asStreamOpt().map(stream -> dynamic2.createList((Stream)stream.map(dynamic3 -> dynamic3.update("type", dynamic4 -> DataFixUtils.orElse((Optional)dynamic4.asString().map(this::method16719).map(dynamic4::createString), (Object)dynamic4)))));
    }
    
    public abstract String method16719(final String p0);
}

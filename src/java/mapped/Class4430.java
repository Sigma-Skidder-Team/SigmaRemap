// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class4430 extends DataFix
{
    public Class4430(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.writeFixAndRead("SavedDataVillageCropFix", this.getInputSchema().getType(Class9451.field40630), this.getOutputSchema().getType(Class9451.field40630), (Function)this::method13406);
    }
    
    private <T> Dynamic<T> method13406(final Dynamic<T> dynamic) {
        return (Dynamic<T>)dynamic.update("Children", (Function)Class4430::method13407);
    }
    
    private static <T> Dynamic<T> method13407(final Dynamic<T> other) {
        return (Dynamic<T>)other.asStreamOpt().map(Class4430::method13408).map((Function<? super Object, ? extends com.mojang.datafixers.Dynamic<?>>)other::createList).orElse(other);
    }
    
    private static Stream<? extends Dynamic<?>> method13408(final Stream<? extends Dynamic<?>> stream) {
        return stream.map(dynamic -> {
            dynamic.get("id").asString("");
            final String s;
            if (!"ViF".equals(s)) {
                return "ViDF".equals(s) ? method13410((com.mojang.datafixers.Dynamic<Object>)dynamic) : dynamic;
            }
            else {
                return method13409((com.mojang.datafixers.Dynamic<Object>)dynamic);
            }
        });
    }
    
    private static <T> Dynamic<T> method13409(final Dynamic<T> dynamic) {
        return method13411(method13411(dynamic, "CA"), "CB");
    }
    
    private static <T> Dynamic<T> method13410(final Dynamic<T> dynamic) {
        return method13411(method13411(method13411(method13411(dynamic, "CA"), "CB"), "CC"), "CD");
    }
    
    private static <T> Dynamic<T> method13411(final Dynamic<T> dynamic, final String s) {
        return (Dynamic<T>)(dynamic.get(s).asNumber().isPresent() ? dynamic.set(s, (Dynamic)Class7922.method25672(dynamic.get(s).asInt(0) << 4)) : dynamic);
    }
}

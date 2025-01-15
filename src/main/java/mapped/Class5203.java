// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.function.Predicate;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class5203 extends DataFix
{
    public Class5203(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.writeFixAndRead("IglooMetadataRemovalFix", this.getInputSchema().getType(Class9451.field40630), this.getOutputSchema().getType(Class9451.field40630), (Function)Class5203::method16288);
    }
    
    private static <T> Dynamic<T> method16288(final Dynamic<T> dynamic) {
        return (Dynamic<T>)(dynamic.get("Children").asStreamOpt().map(stream -> stream.allMatch(Class5203::method16290)).orElse(false) ? dynamic.set("id", dynamic.createString("Igloo")).remove("Children") : dynamic.update("Children", (Function)Class5203::method16289));
    }
    
    private static <T> Dynamic<T> method16289(final Dynamic<T> other) {
        return (Dynamic<T>)other.asStreamOpt().map(stream -> stream.filter(dynamic -> !method16290((Dynamic<?>)dynamic))).map((Function<? super Object, ? extends com.mojang.datafixers.Dynamic<?>>)other::createList).orElse(other);
    }
    
    private static boolean method16290(final Dynamic<?> dynamic) {
        return dynamic.get("id").asString("").equals("Iglu");
    }
}

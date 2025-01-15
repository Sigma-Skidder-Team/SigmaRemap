// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.google.common.annotations.VisibleForTesting;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.google.common.base.Splitter;
import com.mojang.datafixers.DataFix;

public class Class9539 extends DataFix
{
    private static final Splitter field41056;
    private static final Splitter field41057;
    private static final Splitter field41058;
    private static final Splitter field41059;
    private static final Splitter field41060;
    
    public Class9539(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", this.getInputSchema().getType(Class9451.field40611), typed -> typed.update(DSL.remainderFinder(), (Function)this::method35610));
    }
    
    private Dynamic<?> method35610(final Dynamic<?> dynamic) {
        return (Dynamic<?>)(dynamic.get("generatorName").asString("").equalsIgnoreCase("flat") ? dynamic.update("generatorOptions", dynamic2 -> DataFixUtils.orElse((Optional)dynamic2.asString().map(this::method35611).map(dynamic2::createString), (Object)dynamic2)) : dynamic);
    }
    
    @VisibleForTesting
    public String method35611(final String s) {
        if (s.isEmpty()) {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
        }
        final Iterator iterator = Class9539.field41056.split((CharSequence)s).iterator();
        final String s2 = (String)iterator.next();
        int n2;
        String s3;
        if (!iterator.hasNext()) {
            n2 = 0;
            s3 = s2;
        }
        else {
            n2 = NumberUtils.toInt(s2, 0);
            s3 = (String)iterator.next();
        }
        if (n2 >= 0 && n2 <= 3) {
            final StringBuilder sb = new StringBuilder();
            sb.append(StreamSupport.stream(Class9539.field41057.split((CharSequence)s3).spliterator(), false).map(s4 -> {
                final int n2;
                final Object o = (n2 >= 3) ? Class9539.field41059 : Class9539.field41058;
                splitter.splitToList((CharSequence)s4);
                final List list;
                String s5;
                if (list.size() != 2) {
                    s5 = list.get(0);
                }
                else {
                    NumberUtils.toInt((String)list.get(0));
                    s5 = list.get(1);
                }
                Class9539.field41060.splitToList((CharSequence)s5);
                final List list2;
                list2.get(0).equals("minecraft");
                final int n3;
                final String str = list2.get(n3);
                if (n != 3) {
                    final Object o2 = NumberUtils.toInt(str, 0);
                }
                else {
                    final Object o2 = Class8476.method28285("minecraft:" + str);
                }
                final int n5;
                final int n4 = (list2.size() <= n5) ? 0 : NumberUtils.toInt((String)list2.get(n5), 0);
                final StringBuilder sb2 = new StringBuilder();
                final int i;
                String string;
                if (i != 1) {
                    string = i + "*";
                }
                else {
                    string = "";
                }
                final int n6;
                return sb2.append(string).append(Class7922.method25672(n6 << 4 | n4).get("Name").asString("")).toString();
            }).collect((Collector<? super Object, ?, String>)Collectors.joining(",")));
            while (iterator.hasNext()) {
                sb.append(';').append((String)iterator.next());
            }
            return sb.toString();
        }
        return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
    }
    
    static {
        field41056 = Splitter.on(';').limit(5);
        field41057 = Splitter.on(',');
        field41058 = Splitter.on('x').limit(2);
        field41059 = Splitter.on('*').limit(2);
        field41060 = Splitter.on(':').limit(3);
    }
}

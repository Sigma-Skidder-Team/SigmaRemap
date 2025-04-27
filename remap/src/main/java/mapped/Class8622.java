// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.OpticFinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.List;
import com.mojang.datafixers.Typed;
import java.util.Map;
import java.util.Optional;
import com.google.common.collect.Maps;
import java.util.function.Function;
import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List$ListType;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8622 extends DataFix
{
    public Class8622(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type fieldType = this.getOutputSchema().getType(Class9451.field40613).findFieldType("Level");
        final Type fieldType2 = fieldType.findFieldType("TileEntities");
        if (fieldType2 instanceof List$ListType) {
            return this.method29259((Type<?>)fieldType, (com.mojang.datafixers.types.templates.List$ListType<Object>)fieldType2);
        }
        throw new IllegalStateException("Tile entity type is not a list type.");
    }
    
    private <TE> TypeRewriteRule method29259(final Type<?> type, final List$ListType<TE> list$ListType) {
        return TypeRewriteRule.seq(this.fixTypeEverywhere("InjectBedBlockEntityType", (Type)this.getInputSchema().findChoiceType(Class9451.field40621), (Type)this.getOutputSchema().findChoiceType(Class9451.field40621), p0 -> pair -> pair), this.fixTypeEverywhereTyped("BedBlockEntityInjecter", this.getOutputSchema().getType(Class9451.field40613), typed -> {
            DSL.fieldFinder("Level", type2);
            DSL.fieldFinder("TileEntities", list$ListType2);
            list$ListType2.getElement();
            typed.getTyped(opticFinder);
            final Typed typed2;
            final Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
            dynamic.get("xPos").asInt(0);
            dynamic.get("zPos").asInt(0);
            Lists.newArrayList((Iterable)typed2.getOrCreate(opticFinder2));
            dynamic.get("Sections").asList(Function.identity());
            int i = 0;
            final List list;
            final ArrayList list2;
            while (i < list.size()) {
                final Dynamic dynamic2 = list.get(i);
                dynamic2.get("Y").asInt(0);
                dynamic2.get("Blocks").asStream().map(dynamic3 -> dynamic3.asInt(0));
                final Stream stream;
                ((Iterable<Object>)stream::iterator).iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    if (416 == (iterator.next() & 0xFF) << 4) {
                        Maps.newHashMap();
                        final HashMap hashMap;
                        hashMap.put(dynamic2.createString("id"), dynamic2.createString("minecraft:bed"));
                        final int n;
                        final int n2;
                        hashMap.put(dynamic2.createString("x"), dynamic2.createInt(n + (n2 << 4)));
                        final int n3;
                        final int n4;
                        hashMap.put(dynamic2.createString("y"), dynamic2.createInt(n3 + (n4 << 4)));
                        final int n5;
                        final int n6;
                        hashMap.put(dynamic2.createString("z"), dynamic2.createInt(n5 + (n6 << 4)));
                        hashMap.put(dynamic2.createString("color"), dynamic2.createShort((short)14));
                        list2.add(((Optional)type3.read(dynamic2.createMap(hashMap)).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity.")));
                    }
                    int n7 = 0;
                    ++n7;
                }
                ++i;
            }
            return list2.isEmpty() ? typed : typed.set(opticFinder, typed2.set(opticFinder2, (Object)list2));
        }));
    }
}

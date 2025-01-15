// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
import java.nio.ByteBuffer;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8676 extends DataFix
{
    public Class8676(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40613);
        this.getOutputSchema().getType(Class9451.field40613);
        type.findFieldType("Level");
        return TypeRewriteRule.seq(this.fixTypeEverywhereTyped("ChunkToProtoChunkFix", type, this.getOutputSchema().getType(Class9451.field40613), typed -> {
            final Type type3;
            DSL.fieldFinder("Level", type3);
            final Type type4;
            type4.findFieldType("Level");
            DSL.fieldFinder("TileTicks", type3.findFieldType("TileTicks"));
            return typed.updateTyped(opticFinder, type2, typed2 -> {
                typed2.getOptionalTyped(opticFinder2).map(Typed::write).flatMap(Dynamic::asStreamOpt);
                final Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
                final boolean b = dynamic.get("TerrainPopulated").asBoolean((boolean)(0 != 0)) && (!dynamic.get("LightPopulated").asNumber().isPresent() || dynamic.get("LightPopulated").asBoolean((boolean)(0 != 0)));
                dynamic.set("Status", dynamic.createString(b ? "mobs_spawned" : "empty"));
                final Dynamic dynamic2;
                dynamic2.set("hasLegacyStructureData", dynamic2.createBoolean((boolean)(1 != 0)));
                Dynamic write;
                if (!b) {
                    final Dynamic dynamic3;
                    write = dynamic3;
                }
                else {
                    Dynamic dynamic3 = null;
                    dynamic3.get("Biomes").asByteBufferOpt();
                    final Optional optional;
                    if (!(!optional.isPresent())) {
                        final ByteBuffer byteBuffer = optional.get();
                        int[] array;
                        int i = 0;
                        for (array = new int[256]; i < array.length; ++i) {
                            if (i < byteBuffer.capacity()) {
                                array[i] = (byteBuffer.get(i) & 0xFF);
                            }
                        }
                        dynamic3 = dynamic3.set("Biomes", dynamic3.createIntList(Arrays.stream(array)));
                    }
                    final List list = IntStream.range(0, 16).mapToObj(p1 -> dynamic4.createList((Stream)Stream.empty())).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
                    final Optional optional2;
                    if (!(!optional2.isPresent())) {
                        optional2.get().forEach(dynamic6 -> {
                            dynamic6.get("x").asInt(0);
                            dynamic6.get("y").asInt(0);
                            final int n2;
                            final int n3;
                            list2.set(n2 >> 4, list2.get(n2 >> 4).merge(dynamic5.createShort(method29711(n3, n2, dynamic6.get("z").asInt(0)))));
                            return;
                        });
                        dynamic3 = dynamic3.set("ToBeTicked", dynamic3.createList((Stream)list.stream()));
                    }
                    write = typed2.set(DSL.remainderFinder(), (Object)dynamic3).write();
                }
                return (Typed)((Optional)type5.readTyped(write).getSecond()).orElseThrow(() -> new IllegalStateException("Could not read the new chunk"));
            });
        }), this.writeAndRead("Structure biome inject", this.getInputSchema().getType(Class9451.field40630), this.getOutputSchema().getType(Class9451.field40630)));
    }
    
    private static short method29711(final int n, final int n2, final int n3) {
        return (short)((n & 0xF) | (n2 & 0xF) << 4 | (n3 & 0xF) << 8);
    }
}

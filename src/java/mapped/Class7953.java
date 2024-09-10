package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.*;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;

import java.util.List;

public class Class7953 extends DataFix {
    public Class7953(Schema var1, boolean var2) {
        super(var1, var2);
    }

    private static <A> Type<Pair<A, Dynamic<?>>> method27037(String var0, Type<A> var1) {
        return DSL.and(DSL.field(var0, var1), DSL.remainderType());
    }

    private static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> method27038(String var0, Type<A> var1) {
        return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.remainderType());
    }

    private static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> method27039(String var0, Type<A1> var1, String var2, Type<A2> var3) {
        return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.optional(DSL.field(var2, var3)), DSL.remainderType());
    }

    public TypeRewriteRule makeRule() {
        Schema var3 = this.getInputSchema();
        TaggedChoiceType var4 = new TaggedChoiceType(
                "type",
                DSL.string(),
                ImmutableMap.of(
                        "minecraft:debug",
                        DSL.remainderType(),
                        "minecraft:flat",
                        method27038(
                                "settings",
                                method27039("biome", var3.getType(TypeReferences.field35399), "layers", DSL.list(method27038("block", var3.getType(TypeReferences.field35392))))
                        ),
                        "minecraft:noise",
                        method27039(
                                "biome_source",
                                DSL.taggedChoiceType(
                                        "type",
                                        DSL.string(),
                                        ImmutableMap.of(
                                                "minecraft:fixed",
                                                method27037("biome", var3.getType(TypeReferences.field35399)),
                                                "minecraft:multi_noise",
                                                DSL.list(method27037("biome", var3.getType(TypeReferences.field35399))),
                                                "minecraft:checkerboard",
                                                method27037("biomes", DSL.list(var3.getType(TypeReferences.field35399))),
                                                "minecraft:vanilla_layered",
                                                DSL.remainderType(),
                                                "minecraft:the_end",
                                                DSL.remainderType()
                                        )
                                ),
                                "settings",
                                DSL.or(DSL.string(), method27039("default_block", var3.getType(TypeReferences.field35392), "default_fluid", var3.getType(TypeReferences.field35392)))
                        )
                )
        );
        CompoundListType<String, ?> var5 = DSL.compoundList(Class3639.method12354(), method27037("generator", var4));
        Type<?> var6 = DSL.and(var5, DSL.remainderType());
        Type<?> var7 = var3.getType(TypeReferences.field35400);
        FieldFinder<?> var8 = new FieldFinder("dimensions", var6);
        if (var7.findFieldType("dimensions").equals(var6)) {
            OpticFinder<? extends List<? extends Pair<String, ?>>> var9 = var5.finder();
            return this.fixTypeEverywhereTyped("MissingDimensionFix", var7, var4x -> var4x.updateTyped(var8, var4xx -> var4xx.updateTyped(var9, var3xxx -> {
                if (var3xxx.getValue() instanceof List) {
                    if (!((List) var3xxx.getValue()).isEmpty()) {
                        return var3xxx;
                    } else {
                        Dynamic<?> var6x = var4x.get(DSL.remainderFinder());
                        Dynamic<?> var7x = this.method27040(var6x);
                        return DataFixUtils.orElse(var5.readTyped(var7x).result().map(Pair::getFirst), var3xxx);
                    }
                } else {
                    throw new IllegalStateException("List exptected");
                }
            })));
        } else {
            throw new IllegalStateException();
        }
    }

    private <T> Dynamic<T> method27040(Dynamic<T> var1) {
        long var4 = var1.get("seed").asLong(0L);
        return new Dynamic(var1.getOps(), Class9605.method37320(var1, var4, Class9605.<T>method37319(var1, var4), false));
    }
}

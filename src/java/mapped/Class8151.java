package mapped;

import com.mojang.datafixers.*;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Class8151 extends DataFix {
    private static final Logger field35080 = LogManager.getLogger();

    public Class8151(Schema var1, boolean var2) {
        super(var1, var2);
    }

    public TypeRewriteRule makeRule() {
        Type<?> var3 = this.getOutputSchema().getType(TypeReferences.field35378);
        Type<?> var4 = var3.findFieldType("Level");
        Type<?> var5 = var4.findFieldType("TileEntities");
        if (var5 instanceof ListType) {
            ListType<?> var6 = (ListType) var5;
            OpticFinder<? extends List<?>> var7 = DSL.fieldFinder("TileEntities", var6);
            Type<?> var8 = this.getInputSchema().getType(TypeReferences.field35378);
            OpticFinder<?> var9 = var8.findField("Level");
            OpticFinder<?> var10 = var9.type().findField("Sections");
            Type<?> var11 = var10.type();
            if (var11 instanceof ListType) {
                Type<?> var12 = ((ListType) var11).getElement();
                OpticFinder<?> var13 = DSL.typeFinder(var12);
                return TypeRewriteRule.seq(
                        new Class7335(this.getOutputSchema(), "AddTrappedChestFix", TypeReferences.field35386).makeRule(),
                        this.fixTypeEverywhereTyped(
                                "Trapped Chest fix",
                                var8,
                                var5x -> var5x.updateTyped(
                                        var9,
                                        var4xx -> {
                                            Optional<? extends Typed<?>> var7x = var4xx.getOptionalTyped(var10);
                                            if (!var7x.isPresent()) {
                                                return var4xx;
                                            } else {
                                                List<? extends Typed<?>> var8x =  var7x.get().getAllTyped(var13);
                                                IntOpenHashSet var9x = new IntOpenHashSet();

                                                for (Typed<?> var11x : var8x) {
                                                    Class7454 var12x = new Class7454(var11x, this.getInputSchema());
                                                    if (!var12x.method24091()) {
                                                        for (int var13x = 0; var13x < 4096; var13x++) {
                                                            int var14 = var12x.method24092(var13x);
                                                            if (var12x.method24106(var14)) {
                                                                var9x.add(var12x.method24094() << 12 | var13x);
                                                            }
                                                        }
                                                    }
                                                }

                                                Dynamic<?> var15 = var4xx.get(DSL.remainderFinder());
                                                int var16 = var15.get("xPos").asInt(0);
                                                int var17 = var15.get("zPos").asInt(0);
                                                TaggedChoiceType<String> var18 = (TaggedChoiceType<String>) this.getInputSchema().findChoiceType(TypeReferences.field35386);
                                                return var4xx.updateTyped(
                                                        var7,
                                                        var4xxx -> var4xxx.updateTyped(
                                                                var18.finder(),
                                                                var4xxxx -> {
                                                                    Dynamic var7xx = var4xxxx.getOrCreate(DSL.remainderFinder());
                                                                    int var8xx = var7xx.get("x").asInt(0) - (var16 << 4);
                                                                    int var9xx = var7xx.get("y").asInt(0);
                                                                    int var10x = var7xx.get("z").asInt(0) - (var17 << 4);
                                                                    return !var9x.contains(Class9508.method36709(var8xx, var9xx, var10x))
                                                                            ? var4xxxx
                                                                            : var4xxxx.update(var18.finder(), var0xx -> var0xx.mapFirst(var0xxx -> {
                                                                        if (!Objects.equals(var0xxx, "minecraft:chest")) {
                                                                            field35080.warn("Block Entity was expected to be a chest");
                                                                        }

                                                                        return "minecraft:trapped_chest";
                                                                    }));
                                                                }
                                                        )
                                                );
                                            }
                                        }
                                )
                        )
                );
            } else {
                throw new IllegalStateException("Expecting sections to be a list.");
            }
        } else {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
    }
}

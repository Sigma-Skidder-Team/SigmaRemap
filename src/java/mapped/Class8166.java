// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.OpticFinder;
import java.util.Iterator;
import java.util.List;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Optional;
import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.List$ListType;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import org.apache.logging.log4j.Logger;
import com.mojang.datafixers.DataFix;

public class Class8166 extends DataFix
{
    private static final Logger field33649;
    
    public Class8166(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type fieldType = this.getOutputSchema().getType(Class9451.field40613).findFieldType("Level").findFieldType("TileEntities");
        if (!(fieldType instanceof List$ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        DSL.fieldFinder("TileEntities", (Type)fieldType);
        final Type type = this.getInputSchema().getType(Class9451.field40613);
        if (type.findField("Level").type().findField("Sections").type() instanceof List$ListType) {
            return TypeRewriteRule.seq(new Class8481(this.getOutputSchema(), "AddTrappedChestFix", Class9451.field40621).makeRule(), this.fixTypeEverywhereTyped("Trapped Chest fix", type, typed -> {
                final List$ListType list$ListType;
                DSL.typeFinder(list$ListType.getElement());
                return typed.updateTyped(opticFinder, typed2 -> {
                    typed2.getOptionalTyped(opticFinder2);
                    final Optional optional;
                    if (optional.isPresent()) {
                        optional.get().getAllTyped(opticFinder3);
                        final IntSet set = (IntSet)new IntOpenHashSet();
                        final List list;
                        list.iterator();
                        final Iterator iterator;
                        while (iterator.hasNext()) {
                            final Class8186 class8186 = new Class8186((Typed<?>)iterator.next(), this.getInputSchema());
                            if (class8186.method27105()) {
                                continue;
                            }
                            else {
                                int i = 0;
                                while (i < 4096) {
                                    if (!(!class8186.method27102(class8186.method27106(i)))) {
                                        set.add(class8186.method27108() << 12 | i);
                                    }
                                    ++i;
                                }
                            }
                        }
                        final Dynamic dynamic2 = (Dynamic)typed2.get(DSL.remainderFinder());
                        return typed2.updateTyped(opticFinder4, typed3 -> {
                            this.getInputSchema().findChoiceType(Class9451.field40621);
                            final Dynamic dynamic2;
                            dynamic2.get("xPos").asInt(0);
                            dynamic2.get("zPos").asInt(0);
                            return typed3.updateTyped(taggedChoice$TaggedChoiceType.finder(), typed4 -> {
                                final Dynamic dynamic3 = (Dynamic)typed4.getOrCreate(DSL.remainderFinder());
                                return set2.contains(Class8463.method28237(dynamic3.get("x").asInt(0) - (n << 4), dynamic3.get("y").asInt(0), dynamic3.get("z").asInt(0) - (n2 << 4))) ? typed4.update(taggedChoice$TaggedChoiceType2.finder(), pair -> pair.mapFirst(a -> {
                                    if (!Objects.equals(a, "minecraft:chest")) {
                                        Class8166.field33649.warn("Block Entity was expected to be a chest");
                                    }
                                    return "minecraft:trapped_chest";
                                })) : typed4;
                            });
                        });
                    }
                    else {
                        return typed2;
                    }
                });
            }));
        }
        throw new IllegalStateException("Expecting sections to be a list.");
    }
    
    static {
        field33649 = LogManager.getLogger();
    }
}

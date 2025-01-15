// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.dimension.DimensionType;

import java.util.function.Consumer;

public class Class5909 implements Consumer<Consumer<Class8863>>
{
    @Override
    public void accept(final Consumer<Class8863> consumer) {
        final Class8863 method18014 = Class6056.method18001().method18002(Class6056.method18001().method18005(Class7521.field29403, new Class2259("advancements.end.root.title", new Object[0]), new Class2259("advancements.end.root.description", new Object[0]), new Class1932("textures/gui/advancements/backgrounds/end.png"), Class1993.field11162, false, false, false).method18009("entered_end", Class4225.method12712(DimensionType.field2225)).method18014(consumer, "end/root")).method18005(Class7521.field29463, new Class2259("advancements.end.kill_dragon.title", new Object[0]), new Class2259("advancements.end.kill_dragon.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("killed_dragon", Class4233.method12728(Class5754.method17068().method17069(EntityType.field28976))).method18014(consumer, "end/kill_dragon");
        final Class8863 method18015 = Class6056.method18001().method18002(method18014).method18005(Class7739.field31436, new Class2259("advancements.end.enter_end_gateway.title", new Object[0]), new Class2259("advancements.end.enter_end_gateway.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("entered_end_gateway", Class4236.method12737(Class7521.field29638)).method18014(consumer, "end/enter_end_gateway");
        Class6056.method18001().method18002(method18014).method18005(Class7739.field31572, new Class2259("advancements.end.respawn_dragon.title", new Object[0]), new Class2259("advancements.end.respawn_dragon.description", new Object[0]), null, Class1993.field11164, true, true, false).method18009("summoned_dragon", Class4216.method12693(Class5754.method17068().method17069(EntityType.field28976))).method18014(consumer, "end/respawn_dragon");
        final Class8863 method18016 = Class6056.method18001().method18002(method18015).method18005(Class7521.field29632, new Class2259("advancements.end.find_end_city.title", new Object[0]), new Class2259("advancements.end.find_end_city.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("in_city", Class4217.method12695(Class8697.method29810(Class4535.field19970))).method18014(consumer, "end/find_end_city");
        Class6056.method18001().method18002(method18014).method18005(Class7739.field31578, new Class2259("advancements.end.dragon_breath.title", new Object[0]), new Class2259("advancements.end.dragon_breath.description", new Object[0]), null, Class1993.field11164, true, true, false).method18009("dragon_breath", Class4228.method12718(Class7739.field31578)).method18014(consumer, "end/dragon_breath");
        Class6056.method18001().method18002(method18016).method18005(Class7739.field31591, new Class2259("advancements.end.levitate.title", new Object[0]), new Class2259("advancements.end.levitate.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(50)).method18009("levitated", Class4221.method12703(Class8817.method30756(Class8683.method29735(50.0f)))).method18014(consumer, "end/levitate");
        Class6056.method18001().method18002(method18016).method18005(Class7739.field31584, new Class2259("advancements.end.elytra.title", new Object[0]), new Class2259("advancements.end.elytra.description", new Object[0]), null, Class1993.field11164, true, true, false).method18009("elytra", Class4228.method12718(Class7739.field31584)).method18014(consumer, "end/elytra");
        Class6056.method18001().method18002(method18014).method18005(Class7521.field29404, new Class2259("advancements.end.dragon_egg.title", new Object[0]), new Class2259("advancements.end.dragon_egg.description", new Object[0]), null, Class1993.field11164, true, true, false).method18009("dragon_egg", Class4228.method12718(Class7521.field29404)).method18014(consumer, "end/dragon_egg");
    }
}

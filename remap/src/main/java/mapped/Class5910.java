// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.dimension.DimensionType;

import java.util.function.Consumer;

public class Class5910 implements Consumer<Consumer<Class8863>>
{
    @Override
    public void accept(final Consumer<Class8863> consumer) {
        final Class8863 method18014 = Class6056.method18001().method18005(Class7521.field29644, new Class2259("advancements.nether.root.title", new Object[0]), new Class2259("advancements.nether.root.description", new Object[0]), new ResourceLocation("textures/gui/advancements/backgrounds/nether.png"), Class1993.field11162, false, false, false).method18009("entered_nether", Class4225.method12712(DimensionType.field2224)).method18014(consumer, "nether/root");
        final Class8863 method18015 = Class6056.method18001().method18002(method18014).method18005(Items.field31511, new Class2259("advancements.nether.return_to_sender.title", new Object[0]), new Class2259("advancements.nether.return_to_sender.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(50)).method18009("killed_ghast", Class4233.method12730(Class5754.method17068().method17069(EntityType.field28986), Class8135.method26811().method26812(true).method26814(Class5754.method17068().method17069(EntityType.field28994)))).method18014(consumer, "nether/return_to_sender");
        final Class8863 method18016 = Class6056.method18001().method18002(method18014).method18005(Class7521.field29394, new Class2259("advancements.nether.find_fortress.title", new Object[0]), new Class2259("advancements.nether.find_fortress.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("fortress", Class4217.method12695(Class8697.method29810(Class4535.field19969))).method18014(consumer, "nether/find_fortress");
        Class6056.method18001().method18002(method18014).method18005(Items.field31521, new Class2259("advancements.nether.fast_travel.title", new Object[0]), new Class2259("advancements.nether.fast_travel.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18009("travelled", Class4245.method12751(Class8817.method30755(Class8683.method29735(7000.0f)))).method18014(consumer, "nether/fast_travel");
        Class6056.method18001().method18002(method18015).method18005(Items.field31438, new Class2259("advancements.nether.uneasy_alliance.title", new Object[0]), new Class2259("advancements.nether.uneasy_alliance.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18009("killed_ghast", Class4233.method12728(Class5754.method17068().method17069(EntityType.field28986).method17074(Class8697.method29809(DimensionType.field2223)))).method18014(consumer, "nether/uneasy_alliance");
        final Class8863 method18017 = Class6056.method18001().method18002(Class6056.method18001().method18002(method18016).method18005(Class7521.field29455, new Class2259("advancements.nether.get_wither_skull.title", new Object[0]), new Class2259("advancements.nether.get_wither_skull.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("wither_skull", Class4228.method12718(Class7521.field29455)).method18014(consumer, "nether/get_wither_skull")).method18005(Items.field31530, new Class2259("advancements.nether.summon_wither.title", new Object[0]), new Class2259("advancements.nether.summon_wither.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("summoned", Class4216.method12693(Class5754.method17068().method17069(EntityType.field29048))).method18014(consumer, "nether/summon_wither");
        final Class8863 method18018 = Class6056.method18001().method18002(method18016).method18005(Items.field31437, new Class2259("advancements.nether.obtain_blaze_rod.title", new Object[0]), new Class2259("advancements.nether.obtain_blaze_rod.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("blaze_rod", Class4228.method12718(Items.field31437)).method18014(consumer, "nether/obtain_blaze_rod");
        Class6056.method18001().method18002(Class6056.method18001().method18002(method18017).method18005(Class7521.field29417, new Class2259("advancements.nether.create_beacon.title", new Object[0]), new Class2259("advancements.nether.create_beacon.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("beacon", Class4222.method12705(Class8685.method29754(1))).method18014(consumer, "nether/create_beacon")).method18005(Class7521.field29417, new Class2259("advancements.nether.create_full_beacon.title", new Object[0]), new Class2259("advancements.nether.create_full_beacon.description", new Object[0]), null, Class1993.field11164, true, true, false).method18009("beacon", Class4222.method12705(Class8685.method29753(4))).method18014(consumer, "nether/create_full_beacon");
        Class6056.method18001().method18002(Class6056.method18001().method18002(Class6056.method18001().method18002(method18018).method18005(Items.field31441, new Class2259("advancements.nether.brew_potion.title", new Object[0]), new Class2259("advancements.nether.brew_potion.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("potion", Class4232.method12726()).method18014(consumer, "nether/brew_potion")).method18005(Items.field31358, new Class2259("advancements.nether.all_potions.title", new Object[0]), new Class2259("advancements.nether.all_potions.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18009("all_effects", Class4223.method12707(Class8003.method26191().method26192(Class9439.field40474).method26192(Class9439.field40475).method26192(Class9439.field40478).method26192(Class9439.field40481).method26192(Class9439.field40483).method26192(Class9439.field40485).method26192(Class9439.field40486).method26192(Class9439.field40487).method26192(Class9439.field40489).method26192(Class9439.field40491).method26192(Class9439.field40492).method26192(Class9439.field40501).method26192(Class9439.field40484))).method18014(consumer, "nether/all_potions")).method18005(Items.field31349, new Class2259("advancements.nether.all_effects.title", new Object[0]), new Class2259("advancements.nether.all_effects.description", new Object[0]), null, Class1993.field11163, true, true, true).method18007(Class6467.method19353(1000)).method18009("all_effects", Class4223.method12707(Class8003.method26191().method26192(Class9439.field40474).method26192(Class9439.field40475).method26192(Class9439.field40478).method26192(Class9439.field40481).method26192(Class9439.field40483).method26192(Class9439.field40485).method26192(Class9439.field40486).method26192(Class9439.field40487).method26192(Class9439.field40489).method26192(Class9439.field40491).method26192(Class9439.field40492).method26192(Class9439.field40493).method26192(Class9439.field40476).method26192(Class9439.field40477).method26192(Class9439.field40498).method26192(Class9439.field40497).method26192(Class9439.field40495).method26192(Class9439.field40490).method26192(Class9439.field40482).method26192(Class9439.field40484).method26192(Class9439.field40501).method26192(Class9439.field40502).method26192(Class9439.field40503).method26192(Class9439.field40488).method26192(Class9439.field40504).method26192(Class9439.field40505))).method18014(consumer, "nether/all_effects");
    }
}

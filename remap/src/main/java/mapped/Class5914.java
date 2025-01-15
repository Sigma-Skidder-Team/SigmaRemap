// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.function.Consumer;

public class Class5914 implements Consumer<Consumer<Class8863>>
{
    private static final EntityType<?>[] field24294;
    private static final Item[] field24295;
    private static final Item[] field24296;
    private static final Item[] field24297;
    
    @Override
    public void accept(final Consumer<Class8863> consumer) {
        final Class8863 method18014 = Class6056.method18001().method18005(Class7521.field29529, new Class2259("advancements.husbandry.root.title", new Object[0]), new Class2259("advancements.husbandry.root.description", new Object[0]), new Class1932("textures/gui/advancements/backgrounds/husbandry.png"), Class1993.field11162, false, false, false).method18009("consumed_item", Class4224.method12709()).method18014(consumer, "husbandry/root");
        final Class8863 method18015 = Class6056.method18001().method18002(method18014).method18005(Items.field31315, new Class2259("advancements.husbandry.plant_seed.title", new Object[0]), new Class2259("advancements.husbandry.plant_seed.description", new Object[0]), null, Class1993.field11162, true, true, false).method18011(Class6526.field25976).method18009("wheat", Class4235.method12735(Class7521.field29297)).method18009("pumpkin_stem", Class4235.method12735(Class7521.field29386)).method18009("melon_stem", Class4235.method12735(Class7521.field29387)).method18009("beetroots", Class4235.method12735(Class7521.field29636)).method18009("nether_wart", Class4235.method12735(Class7521.field29397)).method18014(consumer, "husbandry/plant_seed");
        final Class8863 method18016 = Class6056.method18001().method18002(method18014).method18005(Items.field31315, new Class2259("advancements.husbandry.breed_an_animal.title", new Object[0]), new Class2259("advancements.husbandry.breed_an_animal.description", new Object[0]), null, Class1993.field11162, true, true, false).method18011(Class6526.field25976).method18009("bred", Class4218.method12699()).method18014(consumer, "husbandry/breed_an_animal");
        this.method17780(Class6056.method18001()).method18002(method18015).method18005(Items.field31278, new Class2259("advancements.husbandry.balanced_diet.title", new Object[0]), new Class2259("advancements.husbandry.balanced_diet.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18014(consumer, "husbandry/balanced_diet");
        Class6056.method18001().method18002(method18015).method18005(Items.field31312, new Class2259("advancements.husbandry.break_diamond_hoe.title", new Object[0]), new Class2259("advancements.husbandry.break_diamond_hoe.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18009("broke_hoe", Class4230.method12722(Class9425.method35024().method35025(Items.field31312).method35029(), Class8685.method29753(0))).method18014(consumer, "husbandry/break_diamond_hoe");
        final Class8863 method18017 = Class6056.method18001().method18002(method18014).method18005(Items.field31551, new Class2259("advancements.husbandry.tame_an_animal.title", new Object[0]), new Class2259("advancements.husbandry.tame_an_animal.description", new Object[0]), null, Class1993.field11162, true, true, false).method18009("tamed_animal", Class4214.method12688()).method18014(consumer, "husbandry/tame_an_animal");
        this.method17781(Class6056.method18001()).method18002(method18016).method18005(Items.field31522, new Class2259("advancements.husbandry.breed_all_animals.title", new Object[0]), new Class2259("advancements.husbandry.breed_all_animals.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(100)).method18014(consumer, "husbandry/bred_all_animals");
        this.method17782(Class6056.method18001()).method18002(this.method17783(Class6056.method18001()).method18002(method18014).method18011(Class6526.field25976).method18005(Items.field31376, new Class2259("advancements.husbandry.fishy_business.title", new Object[0]), new Class2259("advancements.husbandry.fishy_business.description", new Object[0]), null, Class1993.field11162, true, true, false).method18014(consumer, "husbandry/fishy_business")).method18011(Class6526.field25976).method18005(Items.field31359, new Class2259("advancements.husbandry.tactical_fishing.title", new Object[0]), new Class2259("advancements.husbandry.tactical_fishing.description", new Object[0]), null, Class1993.field11162, true, true, false).method18014(consumer, "husbandry/tactical_fishing");
        this.method17784(Class6056.method18001()).method18002(method18017).method18005(Items.field31379, new Class2259("advancements.husbandry.complete_catalogue.title", new Object[0]), new Class2259("advancements.husbandry.complete_catalogue.description", new Object[0]), null, Class1993.field11163, true, true, false).method18007(Class6467.method19353(50)).method18014(consumer, "husbandry/complete_catalogue");
        Class6056.method18001().method18002(method18014).method18009("safely_harvest_honey", Class4227.method12715(Class9021.method32318().method32319(Class7188.field27931), Class9425.method35024().method35025(Items.field31442))).method18005(Items.field31635, new Class2259("advancements.husbandry.safely_harvest_honey.title", new Object[0]), new Class2259("advancements.husbandry.safely_harvest_honey.description", new Object[0]), null, Class1993.field11162, true, true, false).method18014(consumer, "husbandry/safely_harvest_honey");
        Class6056.method18001().method18002(method18014).method18009("silk_touch_nest", Class4241.method12747(Class7521.field29823, Class9425.method35024().method35028(new Class9167(Class7882.field32366, Class8685.method29754(1))), Class8685.method29753(3))).method18005(Class7521.field29823, new Class2259("advancements.husbandry.silk_touch_nest.title", new Object[0]), new Class2259("advancements.husbandry.silk_touch_nest.description", new Object[0]), null, Class1993.field11162, true, true, false).method18014(consumer, "husbandry/silk_touch_nest");
    }
    
    private Class6056 method17780(final Class6056 class6056) {
        for (final Item class6057 : Class5914.field24297) {
            class6056.method18009(Class90.field211.method503(class6057).method7797(), Class4224.method12710(class6057));
        }
        return class6056;
    }
    
    private Class6056 method17781(final Class6056 class6056) {
        for (final EntityType<?> class6057 : Class5914.field24294) {
            class6056.method18009(EntityType.method23354(class6057).toString(), Class4218.method12700(Class5754.method17068().method17069(class6057)));
        }
        return class6056;
    }
    
    private Class6056 method17782(final Class6056 class6056) {
        for (final Item class6057 : Class5914.field24296) {
            class6056.method18009(Class90.field211.method503(class6057).method7797(), Class4243.method12749(Class9425.method35024().method35025(class6057).method35029()));
        }
        return class6056;
    }
    
    private Class6056 method17783(final Class6056 class6056) {
        for (final Item class6057 : Class5914.field24295) {
            class6056.method18009(Class90.field211.method503(class6057).method7797(), Class4231.method12724(Class9342.field40107, Class8172.field33663, Class9425.method35024().method35025(class6057).method35029()));
        }
        return class6056;
    }
    
    private Class6056 method17784(final Class6056 class6056) {
        Class800.field4290.forEach((p1, class6058) -> class6057.method18009(class6058.method7797(), Class4214.method12689(Class5754.method17068().method17071(class6058).method17082())));
        return class6056;
    }
    
    static {
        field24294 = new EntityType[] { EntityType.field28989, EntityType.field29019, EntityType.field28968, EntityType.field29007, EntityType.field29012, EntityType.field28966, EntityType.field29051, EntityType.field29008, EntityType.field29017, EntityType.field28996, EntityType.field29035, EntityType.field28964, EntityType.field29010, EntityType.field28985, EntityType.field28961 };
        field24295 = new Item[] { Items.field31379, Items.field31381, Items.field31382, Items.field31380 };
        field24296 = new Item[] { Items.field31361, Items.field31362, Items.field31359, Items.field31360 };
        field24297 = new Item[] { Items.field31278, Items.field31301, Items.field31316, Items.field31338, Items.field31339, Items.field31341, Items.field31342, Items.field31379, Items.field31380, Items.field31381, Items.field31382, Items.field31383, Items.field31384, Items.field31424, Items.field31427, Items.field31431, Items.field31432, Items.field31433, Items.field31434, Items.field31435, Items.field31443, Items.field31517, Items.field31518, Items.field31519, Items.field31520, Items.field31522, Items.field31531, Items.field31541, Items.field31542, Items.field31543, Items.field31554, Items.field31555, Items.field31573, Items.field31575, Items.field31577, Items.field31428, Items.field31612, Items.field31630, Items.field31635 };
    }
}

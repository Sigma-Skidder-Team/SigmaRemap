package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Map;

public class Class8476 extends DataFix {
   private static final Map<String, String> field36336 = DataFixUtils.<Map<String, String>>make(Maps.newHashMap(), var0 -> {
      var0.put("AreaEffectCloud", "minecraft:area_effect_cloud");
      var0.put("ArmorStand", "minecraft:armor_stand");
      var0.put("Arrow", "minecraft:arrow");
      var0.put("Bat", "minecraft:bat");
      var0.put("Blaze", "minecraft:blaze");
      var0.put("Boat", "minecraft:boat");
      var0.put("CaveSpider", "minecraft:cave_spider");
      var0.put("Chicken", "minecraft:chicken");
      var0.put("Cow", "minecraft:cow");
      var0.put("Creeper", "minecraft:creeper");
      var0.put("Donkey", "minecraft:donkey");
      var0.put("DragonFireball", "minecraft:dragon_fireball");
      var0.put("ElderGuardian", "minecraft:elder_guardian");
      var0.put("EnderCrystal", "minecraft:ender_crystal");
      var0.put("EnderDragon", "minecraft:ender_dragon");
      var0.put("Enderman", "minecraft:enderman");
      var0.put("Endermite", "minecraft:endermite");
      var0.put("EyeOfEnderSignal", "minecraft:eye_of_ender_signal");
      var0.put("FallingSand", "minecraft:falling_block");
      var0.put("Fireball", "minecraft:fireball");
      var0.put("FireworksRocketEntity", "minecraft:fireworks_rocket");
      var0.put("Ghast", "minecraft:ghast");
      var0.put("Giant", "minecraft:giant");
      var0.put("Guardian", "minecraft:guardian");
      var0.put("Horse", "minecraft:horse");
      var0.put("Husk", "minecraft:husk");
      var0.put("Item", "minecraft:item");
      var0.put("ItemFrame", "minecraft:item_frame");
      var0.put("LavaSlime", "minecraft:magma_cube");
      var0.put("LeashKnot", "minecraft:leash_knot");
      var0.put("MinecartChest", "minecraft:chest_minecart");
      var0.put("MinecartCommandBlock", "minecraft:commandblock_minecart");
      var0.put("MinecartFurnace", "minecraft:furnace_minecart");
      var0.put("MinecartHopper", "minecraft:hopper_minecart");
      var0.put("MinecartRideable", "minecraft:minecart");
      var0.put("MinecartSpawner", "minecraft:spawner_minecart");
      var0.put("MinecartTNT", "minecraft:tnt_minecart");
      var0.put("Mule", "minecraft:mule");
      var0.put("MushroomCow", "minecraft:mooshroom");
      var0.put("Ozelot", "minecraft:ocelot");
      var0.put("Painting", "minecraft:painting");
      var0.put("Pig", "minecraft:pig");
      var0.put("PigZombie", "minecraft:zombie_pigman");
      var0.put("PolarBear", "minecraft:polar_bear");
      var0.put("PrimedTnt", "minecraft:tnt");
      var0.put("Rabbit", "minecraft:rabbit");
      var0.put("Sheep", "minecraft:sheep");
      var0.put("Shulker", "minecraft:shulker");
      var0.put("ShulkerBullet", "minecraft:shulker_bullet");
      var0.put("Silverfish", "minecraft:silverfish");
      var0.put("Skeleton", "minecraft:skeleton");
      var0.put("SkeletonHorse", "minecraft:skeleton_horse");
      var0.put("Slime", "minecraft:slime");
      var0.put("SmallFireball", "minecraft:small_fireball");
      var0.put("SnowMan", "minecraft:snowman");
      var0.put("Snowball", "minecraft:snowball");
      var0.put("SpectralArrow", "minecraft:spectral_arrow");
      var0.put("Spider", "minecraft:spider");
      var0.put("Squid", "minecraft:squid");
      var0.put("Stray", "minecraft:stray");
      var0.put("ThrownEgg", "minecraft:egg");
      var0.put("ThrownEnderpearl", "minecraft:ender_pearl");
      var0.put("ThrownExpBottle", "minecraft:xp_bottle");
      var0.put("ThrownPotion", "minecraft:potion");
      var0.put("Villager", "minecraft:villager");
      var0.put("VillagerGolem", "minecraft:villager_golem");
      var0.put("Witch", "minecraft:witch");
      var0.put("WitherBoss", "minecraft:wither");
      var0.put("WitherSkeleton", "minecraft:wither_skeleton");
      var0.put("WitherSkull", "minecraft:wither_skull");
      var0.put("Wolf", "minecraft:wolf");
      var0.put("XPOrb", "minecraft:xp_orb");
      var0.put("Zombie", "minecraft:zombie");
      var0.put("ZombieHorse", "minecraft:zombie_horse");
      var0.put("ZombieVillager", "minecraft:zombie_villager");
   });

   public Class8476(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> var3 = (TaggedChoiceType<String>) this.getInputSchema().findChoiceType(Class8239.field35391);
      TaggedChoiceType<String> var4 = (TaggedChoiceType<String>) this.getOutputSchema().findChoiceType(Class8239.field35391);
      Type var5 = this.getInputSchema().getType(Class8239.field35387);
      Type var6 = this.getOutputSchema().getType(Class8239.field35387);
      return TypeRewriteRule.seq(
         this.convertUnchecked("item stack entity name hook converter", var5, var6),
         this.fixTypeEverywhere("EntityIdFix", var3, var4, var0 -> var0x -> var0x.mapFirst(var0xx -> field36336.getOrDefault(var0xx, var0xx)))
      );
   }
}

package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;

import net.minecraft.util.datafix.TypeReferences;
import org.apache.commons.lang3.StringUtils;

public class Class7499 extends DataFix {
   private static final Set<String> field32216 = ImmutableSet.<String> builder()
      .add("stat.craftItem.minecraft.spawn_egg")
      .add("stat.useItem.minecraft.spawn_egg")
      .add("stat.breakItem.minecraft.spawn_egg")
      .add("stat.pickup.minecraft.spawn_egg")
      .add("stat.drop.minecraft.spawn_egg")
      .build();
   private static final Map<String, String> field32217 = ImmutableMap.<String, String> builder()
      .put("stat.leaveGame", "minecraft:leave_game")
      .put("stat.playOneMinute", "minecraft:play_one_minute")
      .put("stat.timeSinceDeath", "minecraft:time_since_death")
      .put("stat.sneakTime", "minecraft:sneak_time")
      .put("stat.walkOneCm", "minecraft:walk_one_cm")
      .put("stat.crouchOneCm", "minecraft:crouch_one_cm")
      .put("stat.sprintOneCm", "minecraft:sprint_one_cm")
      .put("stat.swimOneCm", "minecraft:swim_one_cm")
      .put("stat.fallOneCm", "minecraft:fall_one_cm")
      .put("stat.climbOneCm", "minecraft:climb_one_cm")
      .put("stat.flyOneCm", "minecraft:fly_one_cm")
      .put("stat.diveOneCm", "minecraft:dive_one_cm")
      .put("stat.minecartOneCm", "minecraft:minecart_one_cm")
      .put("stat.boatOneCm", "minecraft:boat_one_cm")
      .put("stat.pigOneCm", "minecraft:pig_one_cm")
      .put("stat.horseOneCm", "minecraft:horse_one_cm")
      .put("stat.aviateOneCm", "minecraft:aviate_one_cm")
      .put("stat.jump", "minecraft:jump")
      .put("stat.drop", "minecraft:drop")
      .put("stat.damageDealt", "minecraft:damage_dealt")
      .put("stat.damageTaken", "minecraft:damage_taken")
      .put("stat.deaths", "minecraft:deaths")
      .put("stat.mobKills", "minecraft:mob_kills")
      .put("stat.animalsBred", "minecraft:animals_bred")
      .put("stat.playerKills", "minecraft:player_kills")
      .put("stat.fishCaught", "minecraft:fish_caught")
      .put("stat.talkedToVillager", "minecraft:talked_to_villager")
      .put("stat.tradedWithVillager", "minecraft:traded_with_villager")
      .put("stat.cakeSlicesEaten", "minecraft:eat_cake_slice")
      .put("stat.cauldronFilled", "minecraft:fill_cauldron")
      .put("stat.cauldronUsed", "minecraft:use_cauldron")
      .put("stat.armorCleaned", "minecraft:clean_armor")
      .put("stat.bannerCleaned", "minecraft:clean_banner")
      .put("stat.brewingstandInteraction", "minecraft:interact_with_brewingstand")
      .put("stat.beaconInteraction", "minecraft:interact_with_beacon")
      .put("stat.dropperInspected", "minecraft:inspect_dropper")
      .put("stat.hopperInspected", "minecraft:inspect_hopper")
      .put("stat.dispenserInspected", "minecraft:inspect_dispenser")
      .put("stat.noteblockPlayed", "minecraft:play_noteblock")
      .put("stat.noteblockTuned", "minecraft:tune_noteblock")
      .put("stat.flowerPotted", "minecraft:pot_flower")
      .put("stat.trappedChestTriggered", "minecraft:trigger_trapped_chest")
      .put("stat.enderchestOpened", "minecraft:open_enderchest")
      .put("stat.itemEnchanted", "minecraft:enchant_item")
      .put("stat.recordPlayed", "minecraft:play_record")
      .put("stat.furnaceInteraction", "minecraft:interact_with_furnace")
      .put("stat.craftingTableInteraction", "minecraft:interact_with_crafting_table")
      .put("stat.chestOpened", "minecraft:open_chest")
      .put("stat.sleepInBed", "minecraft:sleep_in_bed")
      .put("stat.shulkerBoxOpened", "minecraft:open_shulker_box")
      .build();
   private static final Map<String, String> field32218 = ImmutableMap.<String, String>builder()
      .put("stat.craftItem", "minecraft:crafted")
      .put("stat.useItem", "minecraft:used")
      .put("stat.breakItem", "minecraft:broken")
      .put("stat.pickup", "minecraft:picked_up")
      .put("stat.drop", "minecraft:dropped")
      .build();
   private static final Map<String, String> field32219 = ImmutableMap.<String, String>builder()
      .put("stat.entityKilledBy", "minecraft:killed_by")
      .put("stat.killEntity", "minecraft:killed")
      .build();
   private static final Map<String, String> field32220 = ImmutableMap.<String, String>builder()
      .put("Bat", "minecraft:bat")
      .put("Blaze", "minecraft:blaze")
      .put("CaveSpider", "minecraft:cave_spider")
      .put("Chicken", "minecraft:chicken")
      .put("Cow", "minecraft:cow")
      .put("Creeper", "minecraft:creeper")
      .put("Donkey", "minecraft:donkey")
      .put("ElderGuardian", "minecraft:elder_guardian")
      .put("Enderman", "minecraft:enderman")
      .put("Endermite", "minecraft:endermite")
      .put("EvocationIllager", "minecraft:evocation_illager")
      .put("Ghast", "minecraft:ghast")
      .put("Guardian", "minecraft:guardian")
      .put("Horse", "minecraft:horse")
      .put("Husk", "minecraft:husk")
      .put("Llama", "minecraft:llama")
      .put("LavaSlime", "minecraft:magma_cube")
      .put("MushroomCow", "minecraft:mooshroom")
      .put("Mule", "minecraft:mule")
      .put("Ozelot", "minecraft:ocelot")
      .put("Parrot", "minecraft:parrot")
      .put("Pig", "minecraft:pig")
      .put("PolarBear", "minecraft:polar_bear")
      .put("Rabbit", "minecraft:rabbit")
      .put("Sheep", "minecraft:sheep")
      .put("Shulker", "minecraft:shulker")
      .put("Silverfish", "minecraft:silverfish")
      .put("SkeletonHorse", "minecraft:skeleton_horse")
      .put("Skeleton", "minecraft:skeleton")
      .put("Slime", "minecraft:slime")
      .put("Spider", "minecraft:spider")
      .put("Squid", "minecraft:squid")
      .put("Stray", "minecraft:stray")
      .put("Vex", "minecraft:vex")
      .put("Villager", "minecraft:villager")
      .put("VindicationIllager", "minecraft:vindication_illager")
      .put("Witch", "minecraft:witch")
      .put("WitherSkeleton", "minecraft:wither_skeleton")
      .put("Wolf", "minecraft:wolf")
      .put("ZombieHorse", "minecraft:zombie_horse")
      .put("PigZombie", "minecraft:zombie_pigman")
      .put("ZombieVillager", "minecraft:zombie_villager")
      .put("Zombie", "minecraft:zombie")
      .build();

   public Class7499(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getOutputSchema().getType(TypeReferences.STATS);
      return this.fixTypeEverywhereTyped(
         "StatsCounterFix",
         this.getInputSchema().getType(TypeReferences.STATS),
         var3,
         var2 -> {
            Dynamic<?> var5 = var2.get(DSL.remainderFinder());
            Map<Dynamic<?>, Dynamic<?>>  var6 = Maps.newHashMap();
            Optional<? extends Map<? extends Dynamic<?>, ? extends Dynamic<?>>> var7 = var5.getMapValues().result();
            if (!var7.isPresent()) {
               return (Typed)((Pair)var3.readTyped(var5.emptyMap().set("stats", var5.createMap(var6)))
                     .result()
                     .orElseThrow(() -> new IllegalStateException("Could not parse new stats object.")))
                  .getFirst();
            } else {
               for (Entry var9 : var7.get().entrySet()) {
                  if (((Dynamic)var9.getValue()).asNumber().result().isPresent()) {
                     String var10 = ((Dynamic)var9.getKey()).asString("");
                     if (!field32216.contains(var10)) {
                        String var12;
                        String var13;
                        if (!field32217.containsKey(var10)) {
                           int var11 = StringUtils.ordinalIndexOf(var10, ".", 2);
                           if (var11 < 0) {
                              continue;
                           }

                           String var14 = var10.substring(0, var11);
                           if (!"stat.mineBlock".equals(var14)) {
                              if (!field32218.containsKey(var14)) {
                                 if (!field32219.containsKey(var14)) {
                                    continue;
                                 }

                                 var12 = field32219.get(var14);
                                 String var15 = var10.substring(var11 + 1).replace('.', ':');
                                 var13 = field32220.getOrDefault(var15, var15);
                              } else {
                                 var12 = field32218.get(var14);
                                 String var19 = var10.substring(var11 + 1).replace('.', ':');
                                 String var16 = this.method24451(var19);
                                 var13 = var16 != null ? var16 : var19;
                              }
                           } else {
                              var12 = "minecraft:mined";
                              var13 = this.method24452(var10.substring(var11 + 1).replace('.', ':'));
                           }
                        } else {
                           var12 = "minecraft:custom";
                           var13 = field32217.get(var10);
                        }

                        Dynamic var17 = var5.createString(var12);
                        Dynamic var18 = var6.computeIfAbsent(var17, var1x -> var5.emptyMap());
                        var6.put(var17, var18.set(var13, (Dynamic)var9.getValue()));
                     }
                  }
               }

               return (Typed)((Pair)var3.readTyped(var5.emptyMap().set("stats", var5.createMap(var6)))
                     .result()
                     .orElseThrow(() -> new IllegalStateException("Could not parse new stats object.")))
                  .getFirst();
            }
         }
      );
   }

   @Nullable
   public String method24451(String var1) {
      return Class7774.method25754(var1, 0);
   }

   public String method24452(String var1) {
      return Class9398.method35689(var1);
   }
}

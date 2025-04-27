// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.util.Optional;
import com.mojang.datafixers.Typed;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Set;
import com.mojang.datafixers.DataFix;

public class Class8719 extends DataFix
{
    private static final Set<String> field36630;
    private static final Map<String, String> field36631;
    private static final Map<String, String> field36632;
    private static final Map<String, String> field36633;
    private static final Map<String, String> field36634;
    
    public Class8719(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("StatsCounterFix", this.getInputSchema().getType(Class9451.field40617), this.getOutputSchema().getType(Class9451.field40617), typed -> {
            final Dynamic dynamic = typed.get(DSL.remainderFinder());
            Maps.newHashMap();
            dynamic.getMapValues();
            final Optional optional;
            if (!optional.isPresent()) {
                final HashMap hashMap;
                return (Typed)((Optional)type.readTyped(dynamic.emptyMap().set("stats", dynamic.createMap(hashMap))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse new stats object."));
            }
            else {
                optional.get().entrySet().iterator();
                final HashMap hashMap;
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Map.Entry<K, Dynamic> entry = iterator.next();
                    if (!entry.getValue().asNumber().isPresent()) {
                        continue;
                    }
                    else {
                        ((Dynamic)entry.getKey()).asString("");
                        final String s;
                        if (Class8719.field36630.contains(s)) {
                            continue;
                        }
                        else {
                            String s2 = null;
                            String method29944;
                            if (!Class8719.field36631.containsKey(s)) {
                                StringUtils.ordinalIndexOf(s, ".", 2);
                                final int endIndex;
                                if (endIndex < 0) {
                                    continue;
                                }
                                else {
                                    s.substring(0, endIndex);
                                    final String anObject;
                                    if (!"stat.mineBlock".equals(anObject)) {
                                        if (!Class8719.field36632.containsKey(anObject)) {
                                            if (!Class8719.field36633.containsKey(anObject)) {
                                                continue;
                                            }
                                            else {
                                                s2 = Class8719.field36633.get(anObject);
                                                s.substring(endIndex + 1).replace('.', ':');
                                                final String s3;
                                                method29944 = Class8719.field36634.getOrDefault(s3, s3);
                                            }
                                        }
                                        else {
                                            s2 = Class8719.field36632.get(anObject);
                                            s.substring(endIndex + 1).replace('.', ':');
                                            final String s4;
                                            this.method29943(s4);
                                            final String s5;
                                            method29944 = ((s5 != null) ? s5 : s4);
                                        }
                                    }
                                    else {
                                        method29944 = this.method29944(s.substring(endIndex + 1).replace('.', ':'));
                                    }
                                }
                            }
                            else {
                                method29944 = Class8719.field36631.get(s);
                            }
                            dynamic.createString(s2);
                            final Dynamic key;
                            hashMap.put(key, ((Dynamic)hashMap.computeIfAbsent(key, p1 -> dynamic2.emptyMap())).set(method29944, entry.getValue()));
                        }
                    }
                }
                return (Typed)((Optional)type.readTyped(dynamic.emptyMap().set("stats", dynamic.createMap(hashMap))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse new stats object."));
            }
        });
    }
    
    @Nullable
    public String method29943(final String s) {
        return Class8987.method31988(s, 0);
    }
    
    public String method29944(final String s) {
        return Class7922.method25669(s);
    }
    
    static {
        field36630 = (Set)ImmutableSet.builder().add("stat.craftItem.minecraft.spawn_egg").add("stat.useItem.minecraft.spawn_egg").add("stat.breakItem.minecraft.spawn_egg").add("stat.pickup.minecraft.spawn_egg").add("stat.drop.minecraft.spawn_egg").build();
        field36631 = (Map)ImmutableMap.builder().put("stat.leaveGame", "minecraft:leave_game").put("stat.playOneMinute", "minecraft:play_one_minute").put("stat.timeSinceDeath", "minecraft:time_since_death").put("stat.sneakTime", "minecraft:sneak_time").put("stat.walkOneCm", "minecraft:walk_one_cm").put("stat.crouchOneCm", "minecraft:crouch_one_cm").put("stat.sprintOneCm", "minecraft:sprint_one_cm").put("stat.swimOneCm", "minecraft:swim_one_cm").put("stat.fallOneCm", "minecraft:fall_one_cm").put("stat.climbOneCm", "minecraft:climb_one_cm").put("stat.flyOneCm", "minecraft:fly_one_cm").put("stat.diveOneCm", "minecraft:dive_one_cm").put("stat.minecartOneCm", "minecraft:minecart_one_cm").put("stat.boatOneCm", "minecraft:boat_one_cm").put("stat.pigOneCm", "minecraft:pig_one_cm").put("stat.horseOneCm", "minecraft:horse_one_cm").put("stat.aviateOneCm", "minecraft:aviate_one_cm").put("stat.jump", "minecraft:jump").put("stat.drop", "minecraft:drop").put("stat.damageDealt", "minecraft:damage_dealt").put("stat.damageTaken", "minecraft:damage_taken").put("stat.deaths", "minecraft:deaths").put("stat.mobKills", "minecraft:mob_kills").put("stat.animalsBred", "minecraft:animals_bred").put("stat.playerKills", "minecraft:player_kills").put("stat.fishCaught", "minecraft:fish_caught").put("stat.talkedToVillager", "minecraft:talked_to_villager").put("stat.tradedWithVillager", "minecraft:traded_with_villager").put("stat.cakeSlicesEaten", "minecraft:eat_cake_slice").put("stat.cauldronFilled", "minecraft:fill_cauldron").put("stat.cauldronUsed", "minecraft:use_cauldron").put("stat.armorCleaned", "minecraft:clean_armor").put("stat.bannerCleaned", "minecraft:clean_banner").put("stat.brewingstandInteraction", "minecraft:interact_with_brewingstand").put("stat.beaconInteraction", "minecraft:interact_with_beacon").put("stat.dropperInspected", "minecraft:inspect_dropper").put("stat.hopperInspected", "minecraft:inspect_hopper").put("stat.dispenserInspected", "minecraft:inspect_dispenser").put("stat.noteblockPlayed", "minecraft:play_noteblock").put("stat.noteblockTuned", "minecraft:tune_noteblock").put("stat.flowerPotted", "minecraft:pot_flower").put("stat.trappedChestTriggered", "minecraft:trigger_trapped_chest").put("stat.enderchestOpened", "minecraft:open_enderchest").put("stat.itemEnchanted", "minecraft:enchant_item").put("stat.recordPlayed", "minecraft:play_record").put("stat.furnaceInteraction", "minecraft:interact_with_furnace").put("stat.craftingTableInteraction", "minecraft:interact_with_crafting_table").put("stat.chestOpened", "minecraft:open_chest").put("stat.sleepInBed", "minecraft:sleep_in_bed").put("stat.shulkerBoxOpened", "minecraft:open_shulker_box").build();
        field36632 = (Map)ImmutableMap.builder().put("stat.craftItem", "minecraft:crafted").put("stat.useItem", "minecraft:used").put("stat.breakItem", "minecraft:broken").put("stat.pickup", "minecraft:picked_up").put("stat.drop", "minecraft:dropped").build();
        field36633 = (Map)ImmutableMap.builder().put("stat.entityKilledBy", "minecraft:killed_by").put("stat.killEntity", "minecraft:killed").build();
        field36634 = (Map)ImmutableMap.builder().put("Bat", "minecraft:bat").put("Blaze", "minecraft:blaze").put("CaveSpider", "minecraft:cave_spider").put("Chicken", "minecraft:chicken").put("Cow", "minecraft:cow").put("Creeper", "minecraft:creeper").put("Donkey", "minecraft:donkey").put("ElderGuardian", "minecraft:elder_guardian").put("Enderman", "minecraft:enderman").put("Endermite", "minecraft:endermite").put("EvocationIllager", "minecraft:evocation_illager").put("Ghast", "minecraft:ghast").put("Guardian", "minecraft:guardian").put("Horse", "minecraft:horse").put("Husk", "minecraft:husk").put("Llama", "minecraft:llama").put("LavaSlime", "minecraft:magma_cube").put("MushroomCow", "minecraft:mooshroom").put("Mule", "minecraft:mule").put("Ozelot", "minecraft:ocelot").put("Parrot", "minecraft:parrot").put("Pig", "minecraft:pig").put("PolarBear", "minecraft:polar_bear").put("Rabbit", "minecraft:rabbit").put("Sheep", "minecraft:sheep").put("Shulker", "minecraft:shulker").put("Silverfish", "minecraft:silverfish").put("SkeletonHorse", "minecraft:skeleton_horse").put("Skeleton", "minecraft:skeleton").put("Slime", "minecraft:slime").put("Spider", "minecraft:spider").put("Squid", "minecraft:squid").put("Stray", "minecraft:stray").put("Vex", "minecraft:vex").put("Villager", "minecraft:villager").put("VindicationIllager", "minecraft:vindication_illager").put("Witch", "minecraft:witch").put("WitherSkeleton", "minecraft:wither_skeleton").put("Wolf", "minecraft:wolf").put("ZombieHorse", "minecraft:zombie_horse").put("PigZombie", "minecraft:zombie_pigman").put("ZombieVillager", "minecraft:zombie_villager").put("Zombie", "minecraft:zombie").build();
    }
}

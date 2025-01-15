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
            final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
            Maps.newHashMap();
            dynamic.getMapValues();
            final Optional optional;
            if (!optional.isPresent()) {
                final HashMap hashMap;
                return (Typed)((Optional)type.readTyped(dynamic.emptyMap().set("stats", dynamic.createMap((Map)hashMap))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse new stats object."));
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
                                StringUtils.ordinalIndexOf((CharSequence)s, (CharSequence)".", 2);
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
                            hashMap.put(key, ((Dynamic)hashMap.computeIfAbsent(key, p1 -> dynamic2.emptyMap())).set(method29944, (Dynamic)entry.getValue()));
                        }
                    }
                }
                return (Typed)((Optional)type.readTyped(dynamic.emptyMap().set("stats", dynamic.createMap((Map)hashMap))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse new stats object."));
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
        field36630 = (Set)ImmutableSet.builder().add((Object)"stat.craftItem.minecraft.spawn_egg").add((Object)"stat.useItem.minecraft.spawn_egg").add((Object)"stat.breakItem.minecraft.spawn_egg").add((Object)"stat.pickup.minecraft.spawn_egg").add((Object)"stat.drop.minecraft.spawn_egg").build();
        field36631 = (Map)ImmutableMap.builder().put((Object)"stat.leaveGame", (Object)"minecraft:leave_game").put((Object)"stat.playOneMinute", (Object)"minecraft:play_one_minute").put((Object)"stat.timeSinceDeath", (Object)"minecraft:time_since_death").put((Object)"stat.sneakTime", (Object)"minecraft:sneak_time").put((Object)"stat.walkOneCm", (Object)"minecraft:walk_one_cm").put((Object)"stat.crouchOneCm", (Object)"minecraft:crouch_one_cm").put((Object)"stat.sprintOneCm", (Object)"minecraft:sprint_one_cm").put((Object)"stat.swimOneCm", (Object)"minecraft:swim_one_cm").put((Object)"stat.fallOneCm", (Object)"minecraft:fall_one_cm").put((Object)"stat.climbOneCm", (Object)"minecraft:climb_one_cm").put((Object)"stat.flyOneCm", (Object)"minecraft:fly_one_cm").put((Object)"stat.diveOneCm", (Object)"minecraft:dive_one_cm").put((Object)"stat.minecartOneCm", (Object)"minecraft:minecart_one_cm").put((Object)"stat.boatOneCm", (Object)"minecraft:boat_one_cm").put((Object)"stat.pigOneCm", (Object)"minecraft:pig_one_cm").put((Object)"stat.horseOneCm", (Object)"minecraft:horse_one_cm").put((Object)"stat.aviateOneCm", (Object)"minecraft:aviate_one_cm").put((Object)"stat.jump", (Object)"minecraft:jump").put((Object)"stat.drop", (Object)"minecraft:drop").put((Object)"stat.damageDealt", (Object)"minecraft:damage_dealt").put((Object)"stat.damageTaken", (Object)"minecraft:damage_taken").put((Object)"stat.deaths", (Object)"minecraft:deaths").put((Object)"stat.mobKills", (Object)"minecraft:mob_kills").put((Object)"stat.animalsBred", (Object)"minecraft:animals_bred").put((Object)"stat.playerKills", (Object)"minecraft:player_kills").put((Object)"stat.fishCaught", (Object)"minecraft:fish_caught").put((Object)"stat.talkedToVillager", (Object)"minecraft:talked_to_villager").put((Object)"stat.tradedWithVillager", (Object)"minecraft:traded_with_villager").put((Object)"stat.cakeSlicesEaten", (Object)"minecraft:eat_cake_slice").put((Object)"stat.cauldronFilled", (Object)"minecraft:fill_cauldron").put((Object)"stat.cauldronUsed", (Object)"minecraft:use_cauldron").put((Object)"stat.armorCleaned", (Object)"minecraft:clean_armor").put((Object)"stat.bannerCleaned", (Object)"minecraft:clean_banner").put((Object)"stat.brewingstandInteraction", (Object)"minecraft:interact_with_brewingstand").put((Object)"stat.beaconInteraction", (Object)"minecraft:interact_with_beacon").put((Object)"stat.dropperInspected", (Object)"minecraft:inspect_dropper").put((Object)"stat.hopperInspected", (Object)"minecraft:inspect_hopper").put((Object)"stat.dispenserInspected", (Object)"minecraft:inspect_dispenser").put((Object)"stat.noteblockPlayed", (Object)"minecraft:play_noteblock").put((Object)"stat.noteblockTuned", (Object)"minecraft:tune_noteblock").put((Object)"stat.flowerPotted", (Object)"minecraft:pot_flower").put((Object)"stat.trappedChestTriggered", (Object)"minecraft:trigger_trapped_chest").put((Object)"stat.enderchestOpened", (Object)"minecraft:open_enderchest").put((Object)"stat.itemEnchanted", (Object)"minecraft:enchant_item").put((Object)"stat.recordPlayed", (Object)"minecraft:play_record").put((Object)"stat.furnaceInteraction", (Object)"minecraft:interact_with_furnace").put((Object)"stat.craftingTableInteraction", (Object)"minecraft:interact_with_crafting_table").put((Object)"stat.chestOpened", (Object)"minecraft:open_chest").put((Object)"stat.sleepInBed", (Object)"minecraft:sleep_in_bed").put((Object)"stat.shulkerBoxOpened", (Object)"minecraft:open_shulker_box").build();
        field36632 = (Map)ImmutableMap.builder().put((Object)"stat.craftItem", (Object)"minecraft:crafted").put((Object)"stat.useItem", (Object)"minecraft:used").put((Object)"stat.breakItem", (Object)"minecraft:broken").put((Object)"stat.pickup", (Object)"minecraft:picked_up").put((Object)"stat.drop", (Object)"minecraft:dropped").build();
        field36633 = (Map)ImmutableMap.builder().put((Object)"stat.entityKilledBy", (Object)"minecraft:killed_by").put((Object)"stat.killEntity", (Object)"minecraft:killed").build();
        field36634 = (Map)ImmutableMap.builder().put((Object)"Bat", (Object)"minecraft:bat").put((Object)"Blaze", (Object)"minecraft:blaze").put((Object)"CaveSpider", (Object)"minecraft:cave_spider").put((Object)"Chicken", (Object)"minecraft:chicken").put((Object)"Cow", (Object)"minecraft:cow").put((Object)"Creeper", (Object)"minecraft:creeper").put((Object)"Donkey", (Object)"minecraft:donkey").put((Object)"ElderGuardian", (Object)"minecraft:elder_guardian").put((Object)"Enderman", (Object)"minecraft:enderman").put((Object)"Endermite", (Object)"minecraft:endermite").put((Object)"EvocationIllager", (Object)"minecraft:evocation_illager").put((Object)"Ghast", (Object)"minecraft:ghast").put((Object)"Guardian", (Object)"minecraft:guardian").put((Object)"Horse", (Object)"minecraft:horse").put((Object)"Husk", (Object)"minecraft:husk").put((Object)"Llama", (Object)"minecraft:llama").put((Object)"LavaSlime", (Object)"minecraft:magma_cube").put((Object)"MushroomCow", (Object)"minecraft:mooshroom").put((Object)"Mule", (Object)"minecraft:mule").put((Object)"Ozelot", (Object)"minecraft:ocelot").put((Object)"Parrot", (Object)"minecraft:parrot").put((Object)"Pig", (Object)"minecraft:pig").put((Object)"PolarBear", (Object)"minecraft:polar_bear").put((Object)"Rabbit", (Object)"minecraft:rabbit").put((Object)"Sheep", (Object)"minecraft:sheep").put((Object)"Shulker", (Object)"minecraft:shulker").put((Object)"Silverfish", (Object)"minecraft:silverfish").put((Object)"SkeletonHorse", (Object)"minecraft:skeleton_horse").put((Object)"Skeleton", (Object)"minecraft:skeleton").put((Object)"Slime", (Object)"minecraft:slime").put((Object)"Spider", (Object)"minecraft:spider").put((Object)"Squid", (Object)"minecraft:squid").put((Object)"Stray", (Object)"minecraft:stray").put((Object)"Vex", (Object)"minecraft:vex").put((Object)"Villager", (Object)"minecraft:villager").put((Object)"VindicationIllager", (Object)"minecraft:vindication_illager").put((Object)"Witch", (Object)"minecraft:witch").put((Object)"WitherSkeleton", (Object)"minecraft:wither_skeleton").put((Object)"Wolf", (Object)"minecraft:wolf").put((Object)"ZombieHorse", (Object)"minecraft:zombie_horse").put((Object)"PigZombie", (Object)"minecraft:zombie_pigman").put((Object)"ZombieVillager", (Object)"minecraft:zombie_villager").put((Object)"Zombie", (Object)"minecraft:zombie").build();
    }
}

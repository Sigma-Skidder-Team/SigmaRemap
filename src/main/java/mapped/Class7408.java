// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Class7408
{
    private static Map<String, String> field28541;
    
    public static String method22767(final String s) {
        final String s2 = Class7408.field28541.get(s);
        return (s2 == null) ? s.toLowerCase(Locale.ROOT) : s2;
    }
    
    static {
        (Class7408.field28541 = new HashMap<String, String>()).put("block.cloth.break", "block.wool.break");
        Class7408.field28541.put("block.cloth.fall", "block.wool.fall");
        Class7408.field28541.put("block.cloth.hit", "block.wool.hit");
        Class7408.field28541.put("block.cloth.place", "block.wool.place");
        Class7408.field28541.put("block.cloth.step", "block.wool.step");
        Class7408.field28541.put("block.enderchest.close", "block.ender_chest.close");
        Class7408.field28541.put("block.enderchest.open", "block.ender_chest.open");
        Class7408.field28541.put("block.metal_pressureplate.click_off", "block.metal_pressure_plate.click_off");
        Class7408.field28541.put("block.metal_pressureplate.click_on", "block.metal_pressure_plate.click_on");
        Class7408.field28541.put("block.note.basedrum", "block.note_block.basedrum");
        Class7408.field28541.put("block.note.bass", "block.note_block.bass");
        Class7408.field28541.put("block.note.bell", "block.note_block.bell");
        Class7408.field28541.put("block.note.chime", "block.note_block.chime");
        Class7408.field28541.put("block.note.flute", "block.note_block.flute");
        Class7408.field28541.put("block.note.guitar", "block.note_block.guitar");
        Class7408.field28541.put("block.note.harp", "block.note_block.harp");
        Class7408.field28541.put("block.note.hat", "block.note_block.hat");
        Class7408.field28541.put("block.note.pling", "block.note_block.pling");
        Class7408.field28541.put("block.note.snare", "block.note_block.snare");
        Class7408.field28541.put("block.note.xylophone", "block.note_block.xylophone");
        Class7408.field28541.put("block.slime.break", "block.slime_block.break");
        Class7408.field28541.put("block.slime.fall", "block.slime_block.fall");
        Class7408.field28541.put("block.slime.hit", "block.slime_block.hit");
        Class7408.field28541.put("block.slime.place", "block.slime_block.place");
        Class7408.field28541.put("block.slime.step", "block.slime_block.step");
        Class7408.field28541.put("block.stone_pressureplate.click_off", "block.stone_pressure_plate.click_off");
        Class7408.field28541.put("block.stone_pressureplate.click_on", "block.stone_pressure_plate.click_on");
        Class7408.field28541.put("block.waterlily.place", "block.lily_pad.place");
        Class7408.field28541.put("block.wood_pressureplate.click_off", "block.wooden_pressure_plate.click_off");
        Class7408.field28541.put("block.wood_button.click_on", "block.wooden_button.click_on");
        Class7408.field28541.put("block.wood_button.click_off", "block.wooden_button.click_off");
        Class7408.field28541.put("block.wood_pressureplate.click_on", "block.wooden_pressure_plate.click_on");
        Class7408.field28541.put("entity.armorstand.break", "entity.armor_stand.break");
        Class7408.field28541.put("entity.armorstand.fall", "entity.armor_stand.fall");
        Class7408.field28541.put("entity.armorstand.hit", "entity.armor_stand.hit");
        Class7408.field28541.put("entity.armorstand.place", "entity.armor_stand.place");
        Class7408.field28541.put("entity.bobber.retrieve", "entity.fishing_bobber.retrieve");
        Class7408.field28541.put("entity.bobber.splash", "entity.fishing_bobber.splash");
        Class7408.field28541.put("entity.bobber.throw", "entity.fishing_bobber.throw");
        Class7408.field28541.put("entity.enderdragon.ambient", "entity.ender_dragon.ambient");
        Class7408.field28541.put("entity.enderdragon.death", "entity.ender_dragon.death");
        Class7408.field28541.put("entity.enderdragon.flap", "entity.ender_dragon.flap");
        Class7408.field28541.put("entity.enderdragon.growl", "entity.ender_dragon.growl");
        Class7408.field28541.put("entity.enderdragon.hurt", "entity.ender_dragon.hurt");
        Class7408.field28541.put("entity.enderdragon.shoot", "entity.ender_dragon.shoot");
        Class7408.field28541.put("entity.enderdragon_fireball.explode", "entity.dragon_fireball.explode");
        Class7408.field28541.put("entity.endereye.death", "entity.ender_eye.death");
        Class7408.field28541.put("entity.endereye.launch", "entity.ender_eye.launch");
        Class7408.field28541.put("entity.endermen.ambient", "entity.enderman.ambient");
        Class7408.field28541.put("entity.endermen.death", "entity.enderman.death");
        Class7408.field28541.put("entity.endermen.hurt", "entity.enderman.hurt");
        Class7408.field28541.put("entity.endermen.scream", "entity.enderman.scream");
        Class7408.field28541.put("entity.endermen.stare", "entity.enderman.stare");
        Class7408.field28541.put("entity.endermen.teleport", "entity.enderman.teleport");
        Class7408.field28541.put("entity.enderpearl.throw", "entity.ender_pearl.throw");
        Class7408.field28541.put("entity.evocation_illager.ambient", "entity.evoker.ambient");
        Class7408.field28541.put("entity.evocation_illager.cast_spell", "entity.evoker.cast_spell");
        Class7408.field28541.put("entity.evocation_illager.death", "entity.evoker.death");
        Class7408.field28541.put("entity.evocation_illager.hurt", "entity.evoker.hurt");
        Class7408.field28541.put("entity.evocation_illager.prepare_attack", "entity.evoker.prepare_attack");
        Class7408.field28541.put("entity.evocation_illager.prepare_summon", "entity.evoker.prepare_summon");
        Class7408.field28541.put("entity.evocation_illager.prepare_wololo", "entity.evoker.prepare_wololo");
        Class7408.field28541.put("entity.firework.blast", "entity.firework_rocket.blast");
        Class7408.field28541.put("entity.firework.blast_far", "entity.firework_rocket.blast_far");
        Class7408.field28541.put("entity.firework.large_blast", "entity.firework_rocket.large_blast");
        Class7408.field28541.put("entity.firework.large_blast_far", "entity.firework_rocket.large_blast_far");
        Class7408.field28541.put("entity.firework.launch", "entity.firework_rocket.launch");
        Class7408.field28541.put("entity.firework.shoot", "entity.firework_rocket.shoot");
        Class7408.field28541.put("entity.firework.twinkle", "entity.firework_rocket.twinkle");
        Class7408.field28541.put("entity.firework.twinkle_far", "entity.firework_rocket.twinkle_far");
        Class7408.field28541.put("entity.illusion_illager.ambient", "entity.illusioner.ambient");
        Class7408.field28541.put("entity.illusion_illager.cast_spell", "entity.illusioner.cast_spell");
        Class7408.field28541.put("entity.illusion_illager.death", "entity.illusioner.death");
        Class7408.field28541.put("entity.illusion_illager.hurt", "entity.illusioner.hurt");
        Class7408.field28541.put("entity.illusion_illager.mirror_move", "entity.illusioner.mirror_move");
        Class7408.field28541.put("entity.illusion_illager.prepare_blindness", "entity.illusioner.prepare_blindness");
        Class7408.field28541.put("entity.illusion_illager.prepare_mirror", "entity.illusioner.prepare_mirror");
        Class7408.field28541.put("entity.irongolem.attack", "entity.iron_golem.attack");
        Class7408.field28541.put("entity.irongolem.death", "entity.iron_golem.death");
        Class7408.field28541.put("entity.irongolem.hurt", "entity.iron_golem.hurt");
        Class7408.field28541.put("entity.irongolem.step", "entity.iron_golem.step");
        Class7408.field28541.put("entity.itemframe.add_item", "entity.item_frame.add_item");
        Class7408.field28541.put("entity.itemframe.break", "entity.item_frame.break");
        Class7408.field28541.put("entity.itemframe.place", "entity.item_frame.place");
        Class7408.field28541.put("entity.itemframe.remove_item", "entity.item_frame.remove_item");
        Class7408.field28541.put("entity.itemframe.rotate_item", "entity.item_frame.rotate_item");
        Class7408.field28541.put("entity.leashknot.break", "entity.leash_knot.break");
        Class7408.field28541.put("entity.leashknot.place", "entity.leash_knot.place");
        Class7408.field28541.put("entity.lightning.impact", "entity.lightning_bolt.impact");
        Class7408.field28541.put("entity.lightning.thunder", "entity.lightning_bolt.thunder");
        Class7408.field28541.put("entity.lingeringpotion.throw", "entity.lingering_potion.throw");
        Class7408.field28541.put("entity.magmacube.death", "entity.magma_cube.death");
        Class7408.field28541.put("entity.magmacube.hurt", "entity.magma_cube.hurt");
        Class7408.field28541.put("entity.magmacube.jump", "entity.magma_cube.jump");
        Class7408.field28541.put("entity.magmacube.squish", "entity.magma_cube.squish");
        Class7408.field28541.put("entity.parrot.imitate.enderdragon", "entity.parrot.imitate.ender_dragon");
        Class7408.field28541.put("entity.parrot.imitate.evocation_illager", "entity.parrot.imitate.evoker");
        Class7408.field28541.put("entity.parrot.imitate.illusion_illager", "entity.parrot.imitate.illusioner");
        Class7408.field28541.put("entity.parrot.imitate.magmacube", "entity.parrot.imitate.magma_cube");
        Class7408.field28541.put("entity.parrot.imitate.vindication_illager", "entity.parrot.imitate.vindicator");
        Class7408.field28541.put("entity.player.splash.highspeed", "entity.player.splash.high_speed");
        Class7408.field28541.put("entity.polar_bear.baby_ambient", "entity.polar_bear.ambient_baby");
        Class7408.field28541.put("entity.small_magmacube.death", "entity.magma_cube.death_small");
        Class7408.field28541.put("entity.small_magmacube.hurt", "entity.magma_cube.hurt_small");
        Class7408.field28541.put("entity.small_magmacube.squish", "entity.magma_cube.squish_small");
        Class7408.field28541.put("entity.small_slime.death", "entity.slime.death_small");
        Class7408.field28541.put("entity.small_slime.hurt", "entity.slime.hurt_small");
        Class7408.field28541.put("entity.small_slime.jump", "entity.slime.jump_small");
        Class7408.field28541.put("entity.small_slime.squish", "entity.slime.squish_small");
        Class7408.field28541.put("entity.snowman.ambient", "entity.snow_golem.ambient");
        Class7408.field28541.put("entity.snowman.death", "entity.snow_golem.death");
        Class7408.field28541.put("entity.snowman.hurt", "entity.snow_golem.hurt");
        Class7408.field28541.put("entity.snowman.shoot", "entity.snow_golem.shoot");
        Class7408.field28541.put("entity.villager.trading", "entity.villager.trade");
        Class7408.field28541.put("entity.vindication_illager.ambient", "entity.vindicator.ambient");
        Class7408.field28541.put("entity.vindication_illager.death", "entity.vindicator.death");
        Class7408.field28541.put("entity.vindication_illager.hurt", "entity.vindicator.hurt");
        Class7408.field28541.put("entity.zombie.attack_door_wood", "entity.zombie.attack_wooden_door");
        Class7408.field28541.put("entity.zombie.break_door_wood", "entity.zombie.break_wooden_door");
        Class7408.field28541.put("entity.zombie_pig.ambient", "entity.zombie_pigman.ambient");
        Class7408.field28541.put("entity.zombie_pig.angry", "entity.zombie_pigman.angry");
        Class7408.field28541.put("entity.zombie_pig.death", "entity.zombie_pigman.death");
        Class7408.field28541.put("entity.zombie_pig.hurt", "entity.zombie_pigman.hurt");
        Class7408.field28541.put("record.11", "music_disc.11");
        Class7408.field28541.put("record.13", "music_disc.13");
        Class7408.field28541.put("record.blocks", "music_disc.blocks");
        Class7408.field28541.put("record.cat", "music_disc.cat");
        Class7408.field28541.put("record.chirp", "music_disc.chirp");
        Class7408.field28541.put("record.far", "music_disc.far");
        Class7408.field28541.put("record.mall", "music_disc.mall");
        Class7408.field28541.put("record.mellohi", "music_disc.mellohi");
        Class7408.field28541.put("record.stal", "music_disc.stal");
        Class7408.field28541.put("record.strad", "music_disc.strad");
        Class7408.field28541.put("record.wait", "music_disc.wait");
        Class7408.field28541.put("record.ward", "music_disc.ward");
    }
}

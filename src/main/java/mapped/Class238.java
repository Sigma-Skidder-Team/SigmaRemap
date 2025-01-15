// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum Class238
{
    field915("mob.horse.zombie.idle", "entity.zombie_horse.ambient", Class1991.field11147), 
    field916("note.snare", "block.note.snare", Class1991.field11143), 
    field917("random.wood_click", "block.wood_button.click_on", Class1991.field11145), 
    field918("dig.gravel", "block.gravel.place", Class1991.field11145), 
    field919("random.bowhit", "block.tripwire.detach", Class1991.field11147), 
    field920("dig.glass", "block.glass.break", Class1991.field11145), 
    field921("mob.zombie.say", "entity.zombie.ambient", Class1991.field11146), 
    field922("mob.pig.death", "entity.pig.death", Class1991.field11147), 
    field923("mob.horse.donkey.hit", "entity.donkey.hurt", Class1991.field11147), 
    field924("game.neutral.swim", "entity.player.swim", Class1991.field11147), 
    field925("game.player.swim", "entity.player.swim", Class1991.field11148), 
    field926("mob.endermen.idle", "entity.endermen.ambient", Class1991.field11146), 
    field927("portal.portal", "block.portal.ambient", Class1991.field11145), 
    field928("random.fizz", "entity.generic.extinguish_fire", Class1991.field11145), 
    field929("note.harp", "block.note.harp", Class1991.field11143), 
    field930("step.snow", "block.snow.step", Class1991.field11147), 
    field931("random.successful_hit", "entity.arrow.hit_player", Class1991.field11148), 
    field932("mob.zombiepig.zpighurt", "entity.zombie_pig.hurt", Class1991.field11146), 
    field933("mob.wolf.howl", "entity.wolf.howl", Class1991.field11147), 
    field934("fireworks.launch", "entity.firework.launch", Class1991.field11149), 
    field935("mob.cow.hurt", "entity.cow.death", Class1991.field11147), 
    field936("fireworks.largeBlast", "entity.firework.large_blast", Class1991.field11149), 
    field937("mob.blaze.hit", "entity.blaze.hurt", Class1991.field11146), 
    field938("mob.villager.death", "entity.villager.death", Class1991.field11147), 
    field939("mob.blaze.death", "entity.blaze.death", Class1991.field11146), 
    field940("mob.horse.zombie.death", "entity.zombie_horse.death", Class1991.field11147), 
    field941("mob.silverfish.kill", "entity.endermite.death", Class1991.field11146), 
    field942("mob.wolf.panting", "entity.wolf.pant", Class1991.field11147), 
    field943("note.bass", "block.note.bass", Class1991.field11143), 
    field944("dig.stone", "block.glass.place", Class1991.field11145), 
    field945("mob.endermen.stare", "entity.endermen.stare", Class1991.field11146), 
    field946("game.player.swim.splash", "entity.generic.splash", Class1991.field11145), 
    field947("mob.slime.small", "block.slime.hit", Class1991.field11146), 
    field948("mob.ghast.death", "entity.ghast.death", Class1991.field11146), 
    field949("mob.guardian.attack", "entity.guardian.attack", Class1991.field11146), 
    field950("random.click", "block.wood_pressureplate.click_on", Class1991.field11145), 
    field951("mob.zombiepig.zpig", "entity.zombie_pig.ambient", Class1991.field11146), 
    field952("game.player.die", "entity.player.death", Class1991.field11148), 
    field953("fireworks.twinkle_far", "entity.firework.twinkle_far", Class1991.field11149), 
    field954("mob.guardian.land.idle", "entity.guardian.ambient_land", Class1991.field11146), 
    field955("dig.grass", "block.grass.place", Class1991.field11145), 
    field956("mob.skeleton.step", "entity.skeleton.step", Class1991.field11146), 
    field957("mob.wither.death", "entity.wither.death", Class1991.field11146), 
    field958("mob.wolf.hurt", "entity.wolf.hurt", Class1991.field11147), 
    field959("mob.horse.leather", "entity.horse.saddle", Class1991.field11147), 
    field960("mob.bat.loop", "entity.bat.loop", Class1991.field11147), 
    field961("mob.ghast.scream", "entity.ghast.hurt", Class1991.field11146), 
    field962("game.player.hurt", "entity.player.death", Class1991.field11148), 
    field963("game.neutral.die", "entity.player.death", Class1991.field11147), 
    field964("mob.creeper.death", "entity.creeper.death", Class1991.field11146), 
    field965("mob.horse.gallop", "entity.horse.gallop", Class1991.field11147), 
    field966("mob.wither.spawn", "entity.wither.spawn", Class1991.field11146), 
    field967("mob.endermen.hit", "entity.endermen.hurt", Class1991.field11146), 
    field968("mob.creeper.say", "entity.creeper.hurt", Class1991.field11146), 
    field969("mob.horse.wood", "entity.horse.step_wood", Class1991.field11147), 
    field970("mob.zombie.unfect", "entity.zombie_villager.converted", Class1991.field11146), 
    field971("random.anvil_use", "block.anvil.use", Class1991.field11145), 
    field972("random.chestclosed", "block.chest.close", Class1991.field11145), 
    field973("mob.sheep.shear", "entity.sheep.shear", Class1991.field11147), 
    field974("random.pop", "entity.item.pickup", Class1991.field11148), 
    field975("mob.bat.death", "entity.bat.death", Class1991.field11147), 
    field976("dig.wood", "block.ladder.break", Class1991.field11145), 
    field977("mob.horse.donkey.death", "entity.donkey.death", Class1991.field11147), 
    field978("fireworks.blast", "entity.firework.blast", Class1991.field11149), 
    field979("mob.zombiepig.zpigangry", "entity.zombie_pig.angry", Class1991.field11146), 
    field980("game.hostile.swim", "entity.player.swim", Class1991.field11146), 
    field981("mob.guardian.flop", "entity.guardian.flop", Class1991.field11146), 
    field982("mob.villager.yes", "entity.villager.yes", Class1991.field11147), 
    field983("mob.ghast.charge", "entity.ghast.warn", Class1991.field11146), 
    field984("creeper.primed", "entity.creeper.primed", Class1991.field11146), 
    field985("dig.sand", "block.sand.break", Class1991.field11145), 
    field986("mob.chicken.say", "entity.chicken.ambient", Class1991.field11147), 
    field987("random.door_close", "block.wooden_door.close", Class1991.field11145), 
    field988("mob.guardian.elder.death", "entity.elder_guardian.death", Class1991.field11146), 
    field989("fireworks.twinkle", "entity.firework.twinkle", Class1991.field11149), 
    field990("mob.horse.skeleton.death", "entity.skeleton_horse.death", Class1991.field11147), 
    field991("ambient.weather.rain", "weather.rain.above", Class1991.field11144), 
    field992("portal.trigger", "block.portal.trigger", Class1991.field11145), 
    field993("random.chestopen", "block.chest.open", Class1991.field11145), 
    field994("mob.horse.land", "entity.horse.land", Class1991.field11147), 
    field995("mob.silverfish.step", "entity.silverfish.step", Class1991.field11146), 
    field996("mob.bat.takeoff", "entity.bat.takeoff", Class1991.field11147), 
    field997("mob.villager.no", "entity.villager.no", Class1991.field11147), 
    field998("game.hostile.hurt.fall.big", "entity.hostile.big_fall", Class1991.field11146), 
    field999("mob.irongolem.walk", "entity.irongolem.step", Class1991.field11147), 
    field1000("note.hat", "block.note.hat", Class1991.field11143), 
    field1001("mob.zombie.metal", "entity.zombie.attack_iron_door", Class1991.field11146), 
    field1002("mob.villager.haggle", "entity.villager.trading", Class1991.field11147), 
    field1003("mob.ghast.fireball", "entity.blaze.shoot", Class1991.field11146), 
    field1004("mob.irongolem.death", "entity.irongolem.death", Class1991.field11147), 
    field1005("random.break", "item.shield.break", Class1991.field11148), 
    field1006("mob.zombie.remedy", "entity.zombie_villager.cure", Class1991.field11146), 
    field1007("random.bow", "entity.splash_potion.throw", Class1991.field11147), 
    field1008("mob.villager.idle", "entity.villager.ambient", Class1991.field11147), 
    field1009("step.cloth", "block.cloth.fall", Class1991.field11147), 
    field1010("mob.silverfish.hit", "entity.endermite.hurt", Class1991.field11146), 
    field1011("liquid.lava", "block.lava.ambient", Class1991.field11145), 
    field1012("game.neutral.hurt.fall.big", "entity.hostile.big_fall", Class1991.field11147), 
    field1013("fire.fire", "block.fire.ambient", Class1991.field11145), 
    field1014("mob.zombie.wood", "entity.zombie.attack_door_wood", Class1991.field11146), 
    field1015("mob.chicken.step", "entity.chicken.step", Class1991.field11147), 
    field1016("mob.guardian.land.hit", "entity.guardian.hurt_land", Class1991.field11146), 
    field1017("mob.chicken.plop", "entity.donkey.chest", Class1991.field11147), 
    field1018("mob.enderdragon.wings", "entity.enderdragon.flap", Class1991.field11146), 
    field1019("step.grass", "block.grass.hit", Class1991.field11147), 
    field1020("mob.horse.breathe", "entity.horse.breathe", Class1991.field11147), 
    field1021("game.player.hurt.fall.big", "entity.hostile.big_fall", Class1991.field11148), 
    field1022("mob.horse.donkey.idle", "entity.donkey.ambient", Class1991.field11147), 
    field1023("mob.spider.step", "entity.spider.step", Class1991.field11146), 
    field1024("game.neutral.hurt", "entity.player.death", Class1991.field11147), 
    field1025("mob.cow.say", "entity.cow.ambient", Class1991.field11147), 
    field1026("mob.horse.jump", "entity.horse.jump", Class1991.field11147), 
    field1027("mob.horse.soft", "entity.horse.step", Class1991.field11147), 
    field1028("game.neutral.swim.splash", "entity.generic.splash", Class1991.field11147), 
    field1029("mob.guardian.hit", "entity.guardian.hurt", Class1991.field11146), 
    field1030("mob.enderdragon.end", "entity.enderdragon.death", Class1991.field11146), 
    field1031("mob.zombie.step", "entity.zombie.step", Class1991.field11146), 
    field1032("mob.enderdragon.growl", "entity.enderdragon.growl", Class1991.field11146), 
    field1033("mob.wolf.shake", "entity.wolf.shake", Class1991.field11147), 
    field1034("mob.endermen.death", "entity.endermen.death", Class1991.field11146), 
    field1035("random.anvil_land", "block.anvil.land", Class1991.field11145), 
    field1036("game.hostile.hurt", "entity.player.death", Class1991.field11146), 
    field1037("minecart.inside", "entity.minecart.inside", Class1991.field11148), 
    field1038("mob.slime.big", "entity.slime.death", Class1991.field11146), 
    field1039("liquid.water", "block.water.ambient", Class1991.field11145), 
    field1040("mob.pig.say", "entity.pig.ambient", Class1991.field11147), 
    field1041("mob.wither.shoot", "entity.wither.shoot", Class1991.field11146), 
    field1042("item.fireCharge.use", "entity.blaze.shoot", Class1991.field11145), 
    field1043("step.sand", "block.sand.fall", Class1991.field11147), 
    field1044("mob.irongolem.hit", "entity.irongolem.hurt", Class1991.field11147), 
    field1045("mob.horse.death", "entity.horse.death", Class1991.field11147), 
    field1046("mob.bat.hurt", "entity.bat.hurt", Class1991.field11147), 
    field1047("mob.ghast.affectionate_scream", "entity.ghast.scream", Class1991.field11146), 
    field1048("mob.guardian.elder.idle", "entity.elder_guardian.ambient", Class1991.field11146), 
    field1049("mob.zombiepig.zpigdeath", "entity.zombie_pig.death", Class1991.field11146), 
    field1050("ambient.weather.thunder", "entity.lightning.thunder", Class1991.field11144), 
    field1051("minecart.base", "entity.minecart.riding", Class1991.field11147), 
    field1052("step.ladder", "block.ladder.hit", Class1991.field11147), 
    field1053("mob.horse.donkey.angry", "entity.donkey.angry", Class1991.field11147), 
    field1054("ambient.cave.cave", "ambient.cave", Class1991.field11149), 
    field1055("fireworks.blast_far", "entity.firework.blast_far", Class1991.field11149), 
    field1056("game.neutral.hurt.fall.small", "entity.generic.small_fall", Class1991.field11147), 
    field1057("game.hostile.swim.splash", "entity.generic.splash", Class1991.field11146), 
    field1058("random.drink", "entity.generic.drink", Class1991.field11148), 
    field1059("game.hostile.die", "entity.player.death", Class1991.field11146), 
    field1060("mob.cat.hiss", "entity.cat.hiss", Class1991.field11147), 
    field1061("note.bd", "block.note.basedrum", Class1991.field11143), 
    field1062("mob.spider.say", "entity.spider.hurt", Class1991.field11146), 
    field1063("step.stone", "block.anvil.hit", Class1991.field11147, true), 
    field1064("random.levelup", "entity.player.levelup", Class1991.field11148), 
    field1065("liquid.lavapop", "block.lava.pop", Class1991.field11145), 
    field1066("mob.sheep.say", "entity.sheep.ambient", Class1991.field11147), 
    field1067("mob.skeleton.say", "entity.skeleton.ambient", Class1991.field11146), 
    field1068("mob.blaze.breathe", "entity.blaze.ambient", Class1991.field11146), 
    field1069("mob.bat.idle", "entity.bat.ambient", Class1991.field11147), 
    field1070("mob.magmacube.big", "entity.magmacube.squish", Class1991.field11146), 
    field1071("mob.horse.idle", "entity.horse.ambient", Class1991.field11147), 
    field1072("game.hostile.hurt.fall.small", "entity.generic.small_fall", Class1991.field11146), 
    field1073("mob.horse.zombie.hit", "entity.zombie_horse.hurt", Class1991.field11147), 
    field1074("mob.irongolem.throw", "entity.irongolem.attack", Class1991.field11147), 
    field1075("dig.cloth", "block.cloth.place", Class1991.field11145), 
    field1076("step.gravel", "block.gravel.hit", Class1991.field11147), 
    field1077("mob.silverfish.say", "entity.silverfish.ambient", Class1991.field11146), 
    field1078("mob.cat.purr", "entity.cat.purr", Class1991.field11147), 
    field1079("mob.zombie.infect", "entity.zombie.infect", Class1991.field11146), 
    field1080("random.eat", "entity.generic.eat", Class1991.field11148), 
    field1081("mob.wolf.bark", "entity.wolf.ambient", Class1991.field11147), 
    field1082("game.tnt.primed", "entity.creeper.primed", Class1991.field11145), 
    field1083("mob.sheep.step", "entity.sheep.step", Class1991.field11147), 
    field1084("mob.zombie.death", "entity.zombie.death", Class1991.field11146), 
    field1085("random.door_open", "block.wooden_door.open", Class1991.field11145), 
    field1086("mob.endermen.portal", "entity.endermen.teleport", Class1991.field11146), 
    field1087("mob.horse.angry", "entity.horse.angry", Class1991.field11147), 
    field1088("mob.wolf.growl", "entity.wolf.growl", Class1991.field11147), 
    field1089("dig.snow", "block.snow.place", Class1991.field11145), 
    field1090("tile.piston.out", "block.piston.extend", Class1991.field11145), 
    field1091("random.burp", "entity.player.burp", Class1991.field11148), 
    field1092("mob.cow.step", "entity.cow.step", Class1991.field11147), 
    field1093("mob.wither.hurt", "entity.wither.hurt", Class1991.field11146), 
    field1094("mob.guardian.land.death", "entity.elder_guardian.death_land", Class1991.field11146), 
    field1095("mob.chicken.hurt", "entity.chicken.death", Class1991.field11147), 
    field1096("mob.wolf.step", "entity.wolf.step", Class1991.field11147), 
    field1097("mob.wolf.death", "entity.wolf.death", Class1991.field11147), 
    field1098("mob.wolf.whine", "entity.wolf.whine", Class1991.field11147), 
    field1099("note.pling", "block.note.pling", Class1991.field11143), 
    field1100("game.player.hurt.fall.small", "entity.generic.small_fall", Class1991.field11148), 
    field1101("mob.cat.purreow", "entity.cat.purreow", Class1991.field11147), 
    field1102("fireworks.largeBlast_far", "entity.firework.large_blast_far", Class1991.field11149), 
    field1103("mob.skeleton.hurt", "entity.skeleton.hurt", Class1991.field11146), 
    field1104("mob.spider.death", "entity.spider.death", Class1991.field11146), 
    field1105("random.anvil_break", "block.anvil.destroy", Class1991.field11145), 
    field1106("mob.wither.idle", "entity.wither.ambient", Class1991.field11146), 
    field1107("mob.guardian.elder.hit", "entity.elder_guardian.hurt", Class1991.field11146), 
    field1108("mob.endermen.scream", "entity.endermen.scream", Class1991.field11146), 
    field1109("mob.cat.hitt", "entity.cat.hurt", Class1991.field11147), 
    field1110("mob.magmacube.small", "entity.small_magmacube.squish", Class1991.field11146), 
    field1111("fire.ignite", "item.flintandsteel.use", Class1991.field11145, true), 
    field1112("mob.enderdragon.hit", "entity.enderdragon.hurt", Class1991.field11146), 
    field1113("mob.zombie.hurt", "entity.zombie.hurt", Class1991.field11146), 
    field1114("random.explode", "block.end_gateway.spawn", Class1991.field11145), 
    field1115("mob.slime.attack", "entity.slime.attack", Class1991.field11146), 
    field1116("mob.magmacube.jump", "entity.magmacube.jump", Class1991.field11146), 
    field1117("random.splash", "entity.bobber.splash", Class1991.field11148), 
    field1118("mob.horse.skeleton.hit", "entity.skeleton_horse.hurt", Class1991.field11147), 
    field1119("mob.ghast.moan", "entity.ghast.ambient", Class1991.field11146), 
    field1120("mob.guardian.curse", "entity.elder_guardian.curse", Class1991.field11146), 
    field1121("game.potion.smash", "block.glass.break", Class1991.field11147), 
    field1122("note.bassattack", "block.note.bass", Class1991.field11143), 
    field1123("gui.button.press", "block.wood_pressureplate.click_on", Class1991.field11141), 
    field1124("random.orb", "entity.experience_orb.pickup", Class1991.field11148), 
    field1125("mob.zombie.woodbreak", "entity.zombie.break_door_wood", Class1991.field11146), 
    field1126("mob.horse.armor", "entity.horse.armor", Class1991.field11147), 
    field1127("tile.piston.in", "block.piston.contract", Class1991.field11145), 
    field1128("mob.cat.meow", "entity.cat.ambient", Class1991.field11147), 
    field1129("mob.pig.step", "entity.pig.step", Class1991.field11147), 
    field1130("step.wood", "block.wood.step", Class1991.field11147), 
    field1131("portal.travel", "block.portal.travel", Class1991.field11148), 
    field1132("mob.guardian.death", "entity.guardian.death", Class1991.field11146), 
    field1133("mob.skeleton.death", "entity.skeleton.death", Class1991.field11146), 
    field1134("mob.horse.hit", "entity.horse.hurt", Class1991.field11147), 
    field1135("mob.villager.hit", "entity.villager.hurt", Class1991.field11147), 
    field1136("mob.horse.skeleton.idle", "entity.skeleton_horse.ambient", Class1991.field11147), 
    field1137("records.chirp", "record.chirp", Class1991.field11143), 
    field1138("mob.rabbit.hurt", "entity.rabbit.hurt", Class1991.field11147), 
    field1139("records.stal", "record.stal", Class1991.field11143), 
    field1140("music.game.nether", "music.nether", Class1991.field11142), 
    field1141("music.menu", "music.menu", Class1991.field11142), 
    field1142("records.mellohi", "record.mellohi", Class1991.field11143), 
    field1143("records.cat", "record.cat", Class1991.field11143), 
    field1144("records.far", "record.far", Class1991.field11143), 
    field1145("music.game.end.dragon", "music.dragon", Class1991.field11142), 
    field1146("mob.rabbit.death", "entity.rabbit.death", Class1991.field11147), 
    field1147("mob.rabbit.idle", "entity.rabbit.ambient", Class1991.field11147), 
    field1148("music.game.end", "music.end", Class1991.field11142), 
    field1149("music.game", "music.game", Class1991.field11142), 
    field1150("mob.guardian.idle", "entity.elder_guardian.ambient", Class1991.field11146), 
    field1151("records.ward", "record.ward", Class1991.field11143), 
    field1152("records.13", "record.13", Class1991.field11143), 
    field1153("mob.rabbit.hop", "entity.rabbit.jump", Class1991.field11147), 
    field1154("records.strad", "record.strad", Class1991.field11143), 
    field1155("records.11", "record.11", Class1991.field11143), 
    field1156("records.mall", "record.mall", Class1991.field11143), 
    field1157("records.blocks", "record.blocks", Class1991.field11143), 
    field1158("records.wait", "record.wait", Class1991.field11143), 
    field1159("music.game.end.credits", "music.credits", Class1991.field11142), 
    field1160("music.game.creative", "music.creative", Class1991.field11142);
    
    private final String field1161;
    private final String field1162;
    private final Class1991 field1163;
    private final boolean field1164;
    private static Map<String, Class238> field1165;
    
    private Class238(final String field1161, final String field1162, final Class1991 field1163) {
        this.field1163 = field1163;
        this.field1162 = field1162;
        this.field1161 = field1161;
        this.field1164 = field1161.startsWith("dig.");
    }
    
    private Class238(final String field1161, final String field1162, final Class1991 field1163, final boolean b) {
        this.field1163 = field1163;
        this.field1162 = field1162;
        this.field1161 = field1161;
        this.field1164 = (field1161.startsWith("dig.") || b);
    }
    
    public static Class238 method877(String lowerCase) {
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        return Class238.field1165.get(lowerCase);
    }
    
    public String method878() {
        return this.field1161;
    }
    
    public String method879() {
        return this.field1162;
    }
    
    public Class1991 method880() {
        return this.field1163;
    }
    
    public boolean method881() {
        return this.field1164;
    }
    
    static {
        Class238.field1165 = new HashMap<String, Class238>();
        for (final Class238 class238 : values()) {
            Class238.field1165.put(class238.method878(), class238);
        }
    }
}

package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_6124 implements class_754 {
   field_31326(-1, "ENTITY"),
   field_31362(0, field_31326, "AREA_EFFECT_CLOUD"),
   field_31325(17, field_31326, "END_CRYSTAL"),
   field_31361(21, field_31326, "EVOKER_FANGS"),
   field_31348(23, field_31326, "EXPERIENCE_ORB"),
   field_31365(24, field_31326, "EYE_OF_ENDER"),
   field_31396(25, field_31326, "FALLING_BLOCK"),
   field_31322(26, field_31326, "FIREWORK_ROCKET"),
   field_31332(34, field_31326, "ITEM"),
   field_31403(39, field_31326, "LLAMA_SPIT"),
   field_31324(58, field_31326, "TNT"),
   field_31430(63, field_31326, "SHULKER_BULLET"),
   field_31401(101, field_31326, "FISHING_BOBBER"),
   field_31334(-1, field_31326, "LIVINGENTITY"),
   field_31447(1, field_31334, "ARMOR_STAND"),
   field_31372(100, field_31334, "PLAYER"),
   field_31424(-1, field_31334, "ABSTRACT_INSENTIENT"),
   field_31371(18, field_31424, "ENDER_DRAGON"),
   field_31397(-1, field_31424, "ABSTRACT_CREATURE"),
   field_31328(-1, field_31397, "ABSTRACT_AGEABLE"),
   field_31442(84, field_31328, "VILLAGER"),
   field_31318(88, field_31328, "WANDERING_TRADER"),
   field_31423(-1, field_31328, "ABSTRACT_ANIMAL"),
   field_31418(13, field_31424, "DOLPHIN"),
   field_31340(8, field_31423, "CHICKEN"),
   field_31383(10, field_31423, "COW"),
   field_31432(49, field_31383, "MOOSHROOM"),
   field_31370(52, field_31424, "PANDA"),
   field_31349(54, field_31423, "PIG"),
   field_31421(57, field_31423, "POLAR_BEAR"),
   field_31427(59, field_31423, "RABBIT"),
   field_31352(61, field_31423, "SHEEP"),
   field_31443(77, field_31423, "TURTLE"),
   field_31433(27, field_31423, "FOX"),
   field_31330(-1, field_31423, "ABSTRACT_TAMEABLE_ANIMAL"),
   field_31414(6, field_31330, "CAT"),
   field_31411(50, field_31330, "OCELOT"),
   field_31449(93, field_31330, "WOLF"),
   field_31357(-1, field_31330, "ABSTRACT_PARROT"),
   field_31342(53, field_31357, "PARROT"),
   field_31341(-1, field_31423, "ABSTRACT_HORSE"),
   field_31350(-1, field_31341, "CHESTED_HORSE"),
   field_31369(12, field_31350, "DONKEY"),
   field_31379(48, field_31350, "MULE"),
   field_31346(38, field_31350, "LLAMA"),
   field_31431(75, field_31350, "TRADER_LLAMA"),
   field_31344(31, field_31341, "HORSE"),
   field_31399(66, field_31341, "SKELETON_HORSE"),
   field_31400(95, field_31341, "ZOMBIE_HORSE"),
   field_31392(-1, field_31397, "ABSTRACT_GOLEM"),
   field_31363(69, field_31392, "SNOW_GOLEM"),
   field_31381(85, field_31392, "IRON_GOLEM"),
   field_31408(62, field_31392, "SHULKER"),
   field_31373(-1, field_31397, "ABSTRACT_FISHES"),
   field_31335(9, field_31373, "COD"),
   field_31356(55, field_31373, "PUFFERFISH"),
   field_31317(60, field_31373, "SALMON"),
   field_31376(76, field_31373, "TROPICAL_FISH"),
   field_31428(-1, field_31397, "ABSTRACT_MONSTER"),
   field_31426(4, field_31428, "BLAZE"),
   field_31429(11, field_31428, "CREEPER"),
   field_31436(20, field_31428, "ENDERMITE"),
   field_31391(19, field_31428, "ENDERMAN"),
   field_31360(29, field_31428, "GIANT"),
   field_31419(64, field_31428, "SILVERFISH"),
   field_31364(83, field_31428, "VEX"),
   field_31395(89, field_31428, "WITCH"),
   field_31375(90, field_31428, "WITHER"),
   field_31343(98, field_31428, "RAVAGER"),
   field_31347(-1, field_31428, "ABSTRACT_ILLAGER_BASE"),
   field_31393(-1, field_31347, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field_31389(22, field_31393, "EVOKER"),
   field_31319(33, field_31393, "ILLUSIONER"),
   field_31374(86, field_31347, "VINDICATOR"),
   field_31377(87, field_31347, "PILLAGER"),
   field_31331(-1, field_31428, "ABSTRACT_SKELETON"),
   field_31413(65, field_31331, "SKELETON"),
   field_31382(74, field_31331, "STRAY"),
   field_31358(91, field_31331, "WITHER_SKELETON"),
   field_31378(30, field_31428, "GUARDIAN"),
   field_31338(16, field_31378, "ELDER_GUARDIAN"),
   field_31416(72, field_31428, "SPIDER"),
   field_31327(7, field_31416, "CAVE_SPIDER"),
   field_31437(94, field_31428, "ZOMBIE"),
   field_31438(15, field_31437, "DROWNED"),
   field_31333(32, field_31437, "HUSK"),
   field_31434(56, field_31437, "ZOMBIE_PIGMAN"),
   field_31354(96, field_31437, "ZOMBIE_VILLAGER"),
   field_31446(-1, field_31424, "ABSTRACT_FLYING"),
   field_31329(28, field_31446, "GHAST"),
   field_31435(97, field_31446, "PHANTOM"),
   field_31410(-1, field_31424, "ABSTRACT_AMBIENT"),
   field_31323(3, field_31410, "BAT"),
   field_31336(-1, field_31424, "ABSTRACT_WATERMOB"),
   field_31409(73, field_31336, "SQUID"),
   field_31380(67, field_31424, "SLIME"),
   field_31406(40, field_31380, "MAGMA_CUBE"),
   field_31388(-1, field_31326, "ABSTRACT_HANGING"),
   field_31448(37, field_31388, "LEASH_KNOT"),
   field_31386(35, field_31388, "ITEM_FRAME"),
   field_31359(51, field_31388, "PAINTING"),
   field_31394(-1, field_31326, "ABSTRACT_LIGHTNING"),
   field_31316(99, field_31394, "LIGHTNING_BOLT"),
   field_31337(-1, field_31326, "ABSTRACT_ARROW"),
   field_31405(2, field_31337, "ARROW"),
   field_31404(71, field_31337, "SPECTRAL_ARROW"),
   field_31445(82, field_31337, "TRIDENT"),
   field_31384(-1, field_31326, "ABSTRACT_FIREBALL"),
   field_31353(14, field_31384, "DRAGON_FIREBALL"),
   field_31412(36, field_31384, "FIREBALL"),
   field_31398(68, field_31384, "SMALL_FIREBALL"),
   field_31402(92, field_31384, "WITHER_SKULL"),
   field_31425(-1, field_31326, "PROJECTILE_ABSTRACT"),
   field_31390(70, field_31425, "SNOWBALL"),
   field_31441(79, field_31425, "ENDER_PEARL"),
   field_31422(78, field_31425, "EGG"),
   field_31417(81, field_31425, "POTION"),
   field_31407(80, field_31425, "EXPERIENCE_BOTTLE"),
   field_31321(-1, field_31326, "MINECART_ABSTRACT"),
   field_31351(-1, field_31321, "CHESTED_MINECART_ABSTRACT"),
   field_31367(42, field_31351, "CHEST_MINECART"),
   field_31420(45, field_31351, "HOPPER_MINECART"),
   field_31440(41, field_31321, "MINECART"),
   field_31368(44, field_31321, "FURNACE_MINECART"),
   field_31366(43, field_31321, "COMMAND_BLOCK_MINECART"),
   field_31439(47, field_31321, "TNT_MINECART"),
   field_31339(46, field_31321, "SPAWNER_MINECART"),
   field_31415(5, field_31326, "BOAT");

   private static final Map<Integer, class_6124> field_31345 = new HashMap<Integer, class_6124>();
   private final int field_31387;
   private final class_6124 field_31320;
   private String field_31385;

   private class_6124(int var3, String var4) {
      this.field_31387 = var3;
      this.field_31320 = null;
      this.field_31385 = var4;
   }

   private class_6124(int var3, class_6124 var4, String var5) {
      this.field_31387 = var3;
      this.field_31320 = var4;
      this.field_31385 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_31387;
   }

   public class_6124 method_28144() {
      return this.field_31320;
   }

   public static Optional<class_6124> method_28146(int var0) {
      return var0 != -1 ? Optional.<class_6124>ofNullable(field_31345.get(var0)) : Optional.<class_6124>empty();
   }

   @Override
   public String method_3419() {
      return this.field_31385;
   }

   static {
      for (class_6124 var9 : values()) {
         field_31345.put(var9.field_31387, var9);
      }
   }
}

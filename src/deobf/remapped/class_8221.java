package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_8221 implements class_754 {
   field_42158(-1, "ENTITY"),
   field_42097(0, field_42158, "AREA_EFFECT_CLOUD"),
   field_42111(18, field_42158, "END_CRYSTAL"),
   field_42085(23, field_42158, "EVOKER_FANGS"),
   field_42063(24, field_42158, "EXPERIENCE_ORB"),
   field_42129(25, field_42158, "EYE_OF_ENDER"),
   field_42082(26, field_42158, "FALLING_BLOCK"),
   field_42198(27, field_42158, "FIREWORK_ROCKET"),
   field_42092(37, field_42158, "ITEM"),
   field_42103(43, field_42158, "LLAMA_SPIT"),
   field_42115(63, field_42158, "TNT"),
   field_42071(70, field_42158, "SHULKER_BULLET"),
   field_42062(106, field_42158, "FISHING_BOBBER"),
   field_42134(-1, field_42158, "LIVINGENTITY"),
   field_42079(1, field_42134, "ARMOR_STAND"),
   field_42152(105, field_42134, "PLAYER"),
   field_42185(-1, field_42134, "ABSTRACT_INSENTIENT"),
   field_42165(19, field_42185, "ENDER_DRAGON"),
   field_42095(4, field_42185, "BEE"),
   field_42149(-1, field_42185, "ABSTRACT_CREATURE"),
   field_42088(-1, field_42149, "ABSTRACT_AGEABLE"),
   field_42142(92, field_42088, "VILLAGER"),
   field_42181(94, field_42088, "WANDERING_TRADER"),
   field_42192(-1, field_42088, "ABSTRACT_ANIMAL"),
   field_42072(13, field_42185, "DOLPHIN"),
   field_42112(9, field_42192, "CHICKEN"),
   field_42065(11, field_42192, "COW"),
   field_42094(53, field_42065, "MOOSHROOM"),
   field_42104(56, field_42185, "PANDA"),
   field_42080(59, field_42192, "PIG"),
   field_42128(62, field_42192, "POLAR_BEAR"),
   field_42177(65, field_42192, "RABBIT"),
   field_42197(68, field_42192, "SHEEP"),
   field_42078(90, field_42192, "TURTLE"),
   field_42121(28, field_42192, "FOX"),
   field_42069(-1, field_42192, "ABSTRACT_TAMEABLE_ANIMAL"),
   field_42189(7, field_42069, "CAT"),
   field_42135(54, field_42069, "OCELOT"),
   field_42101(99, field_42069, "WOLF"),
   field_42119(-1, field_42069, "ABSTRACT_PARROT"),
   field_42132(57, field_42119, "PARROT"),
   field_42123(-1, field_42192, "ABSTRACT_HORSE"),
   field_42154(-1, field_42123, "CHESTED_HORSE"),
   field_42098(14, field_42154, "DONKEY"),
   field_42186(52, field_42154, "MULE"),
   field_42074(42, field_42154, "LLAMA"),
   field_42157(88, field_42154, "TRADER_LLAMA"),
   field_42138(33, field_42123, "HORSE"),
   field_42090(73, field_42123, "SKELETON_HORSE"),
   field_42174(102, field_42123, "ZOMBIE_HORSE"),
   field_42091(-1, field_42149, "ABSTRACT_GOLEM"),
   field_42155(76, field_42091, "SNOW_GOLEM"),
   field_42075(36, field_42091, "IRON_GOLEM"),
   field_42139(69, field_42091, "SHULKER"),
   field_42196(-1, field_42149, "ABSTRACT_FISHES"),
   field_42068(10, field_42196, "COD"),
   field_42130(64, field_42196, "PUFFERFISH"),
   field_42160(67, field_42196, "SALMON"),
   field_42131(89, field_42196, "TROPICAL_FISH"),
   field_42145(-1, field_42149, "ABSTRACT_MONSTER"),
   field_42161(5, field_42145, "BLAZE"),
   field_42180(12, field_42145, "CREEPER"),
   field_42143(21, field_42145, "ENDERMITE"),
   field_42159(20, field_42145, "ENDERMAN"),
   field_42141(30, field_42145, "GIANT"),
   field_42106(71, field_42145, "SILVERFISH"),
   field_42163(91, field_42145, "VEX"),
   field_42125(95, field_42145, "WITCH"),
   field_42178(96, field_42145, "WITHER"),
   field_42153(66, field_42145, "RAVAGER"),
   field_42172(60, field_42145, "PIGLIN"),
   field_42108(32, field_42192, "HOGLIN"),
   field_42077(82, field_42192, "STRIDER"),
   field_42081(100, field_42145, "ZOGLIN"),
   field_42195(-1, field_42145, "ABSTRACT_ILLAGER_BASE"),
   field_42070(-1, field_42195, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field_42168(22, field_42070, "EVOKER"),
   field_42060(35, field_42070, "ILLUSIONER"),
   field_42184(93, field_42195, "VINDICATOR"),
   field_42127(61, field_42195, "PILLAGER"),
   field_42118(-1, field_42145, "ABSTRACT_SKELETON"),
   field_42190(72, field_42118, "SKELETON"),
   field_42182(81, field_42118, "STRAY"),
   field_42156(97, field_42118, "WITHER_SKELETON"),
   field_42089(31, field_42145, "GUARDIAN"),
   field_42137(17, field_42089, "ELDER_GUARDIAN"),
   field_42117(79, field_42145, "SPIDER"),
   field_42167(8, field_42117, "CAVE_SPIDER"),
   field_42096(101, field_42145, "ZOMBIE"),
   field_42114(16, field_42096, "DROWNED"),
   field_42067(34, field_42096, "HUSK"),
   field_42187(104, field_42096, "ZOMBIFIED_PIGLIN"),
   field_42093(103, field_42096, "ZOMBIE_VILLAGER"),
   field_42102(-1, field_42185, "ABSTRACT_FLYING"),
   field_42193(29, field_42102, "GHAST"),
   field_42086(58, field_42102, "PHANTOM"),
   field_42109(-1, field_42185, "ABSTRACT_AMBIENT"),
   field_42064(3, field_42109, "BAT"),
   field_42166(-1, field_42185, "ABSTRACT_WATERMOB"),
   field_42146(80, field_42166, "SQUID"),
   field_42179(74, field_42185, "SLIME"),
   field_42140(44, field_42179, "MAGMA_CUBE"),
   field_42173(-1, field_42158, "ABSTRACT_HANGING"),
   field_42188(40, field_42173, "LEASH_KNOT"),
   field_42084(38, field_42173, "ITEM_FRAME"),
   field_42151(55, field_42173, "PAINTING"),
   field_42066(-1, field_42158, "ABSTRACT_LIGHTNING"),
   field_42120(41, field_42066, "LIGHTNING_BOLT"),
   field_42169(-1, field_42158, "ABSTRACT_ARROW"),
   field_42150(2, field_42169, "ARROW"),
   field_42170(78, field_42169, "SPECTRAL_ARROW"),
   field_42164(87, field_42169, "TRIDENT"),
   field_42083(-1, field_42158, "ABSTRACT_FIREBALL"),
   field_42175(15, field_42083, "DRAGON_FIREBALL"),
   field_42100(39, field_42083, "FIREBALL"),
   field_42171(75, field_42083, "SMALL_FIREBALL"),
   field_42136(98, field_42083, "WITHER_SKULL"),
   field_42107(-1, field_42158, "PROJECTILE_ABSTRACT"),
   field_42110(77, field_42107, "SNOWBALL"),
   field_42133(84, field_42107, "ENDER_PEARL"),
   field_42124(83, field_42107, "EGG"),
   field_42144(86, field_42107, "POTION"),
   field_42061(85, field_42107, "EXPERIENCE_BOTTLE"),
   field_42162(-1, field_42158, "MINECART_ABSTRACT"),
   field_42099(-1, field_42162, "CHESTED_MINECART_ABSTRACT"),
   field_42073(46, field_42099, "CHEST_MINECART"),
   field_42122(49, field_42099, "HOPPER_MINECART"),
   field_42194(45, field_42162, "MINECART"),
   field_42191(48, field_42162, "FURNACE_MINECART"),
   field_42105(47, field_42162, "COMMAND_BLOCK_MINECART"),
   field_42087(51, field_42162, "TNT_MINECART"),
   field_42116(50, field_42162, "SPAWNER_MINECART"),
   field_42148(6, field_42158, "BOAT");

   private static final Map<Integer, class_8221> field_42183 = new HashMap<Integer, class_8221>();
   private final int field_42113;
   private final class_8221 field_42126;
   private String field_42176;

   private class_8221(int var3, String var4) {
      this.field_42113 = var3;
      this.field_42126 = null;
      this.field_42176 = var4;
   }

   private class_8221(int var3, class_8221 var4, String var5) {
      this.field_42113 = var3;
      this.field_42126 = var4;
      this.field_42176 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_42113;
   }

   public class_8221 method_37629() {
      return this.field_42126;
   }

   public static Optional<class_8221> method_37627(int var0) {
      return var0 != -1 ? Optional.<class_8221>ofNullable(field_42183.get(var0)) : Optional.<class_8221>empty();
   }

   @Override
   public String method_3419() {
      return this.field_42176;
   }

   static {
      for (class_8221 var9 : values()) {
         field_42183.put(var9.field_42113, var9);
      }
   }
}

package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1874 implements Class1867 {
   field10873(-1, "ENTITY"),
   field10874(0, field10873, "AREA_EFFECT_CLOUD"),
   field10875(18, field10873, "END_CRYSTAL"),
   field10876(23, field10873, "EVOKER_FANGS"),
   field10877(24, field10873, "EXPERIENCE_ORB"),
   field10878(25, field10873, "EYE_OF_ENDER"),
   field10879(26, field10873, "FALLING_BLOCK"),
   field10880(27, field10873, "FIREWORK_ROCKET"),
   field10881(37, field10873, "ITEM"),
   field10882(43, field10873, "LLAMA_SPIT"),
   field10883(64, field10873, "TNT"),
   field10884(71, field10873, "SHULKER_BULLET"),
   field10885(107, field10873, "FISHING_BOBBER"),
   field10886(-1, field10873, "LIVINGENTITY"),
   field10887(1, field10886, "ARMOR_STAND"),
   field10888(106, field10886, "PLAYER"),
   field10889(-1, field10886, "ABSTRACT_INSENTIENT"),
   field10890(19, field10889, "ENDER_DRAGON"),
   field10891(4, field10889, "BEE"),
   field10892(-1, field10889, "ABSTRACT_CREATURE"),
   field10893(-1, field10892, "ABSTRACT_AGEABLE"),
   field10894(93, field10893, "VILLAGER"),
   field10895(95, field10893, "WANDERING_TRADER"),
   field10896(-1, field10893, "ABSTRACT_ANIMAL"),
   field10897(13, field10889, "DOLPHIN"),
   field10898(9, field10896, "CHICKEN"),
   field10899(11, field10896, "COW"),
   field10900(53, field10899, "MOOSHROOM"),
   field10901(56, field10889, "PANDA"),
   field10902(59, field10896, "PIG"),
   field10903(63, field10896, "POLAR_BEAR"),
   field10904(66, field10896, "RABBIT"),
   field10905(69, field10896, "SHEEP"),
   field10906(91, field10896, "TURTLE"),
   field10907(28, field10896, "FOX"),
   field10908(-1, field10896, "ABSTRACT_TAMEABLE_ANIMAL"),
   field10909(7, field10908, "CAT"),
   field10910(54, field10908, "OCELOT"),
   field10911(100, field10908, "WOLF"),
   field10912(-1, field10908, "ABSTRACT_PARROT"),
   field10913(57, field10912, "PARROT"),
   field10914(-1, field10896, "ABSTRACT_HORSE"),
   field10915(-1, field10914, "CHESTED_HORSE"),
   field10916(14, field10915, "DONKEY"),
   field10917(52, field10915, "MULE"),
   field10918(42, field10915, "LLAMA"),
   field10919(89, field10915, "TRADER_LLAMA"),
   field10920(33, field10914, "HORSE"),
   field10921(74, field10914, "SKELETON_HORSE"),
   field10922(103, field10914, "ZOMBIE_HORSE"),
   field10923(-1, field10892, "ABSTRACT_GOLEM"),
   field10924(77, field10923, "SNOW_GOLEM"),
   field10925(36, field10923, "IRON_GOLEM"),
   field10926(70, field10923, "SHULKER"),
   field10927(-1, field10892, "ABSTRACT_FISHES"),
   field10928(10, field10927, "COD"),
   field10929(65, field10927, "PUFFERFISH"),
   field10930(68, field10927, "SALMON"),
   field10931(90, field10927, "TROPICAL_FISH"),
   field10932(-1, field10892, "ABSTRACT_MONSTER"),
   field10933(5, field10932, "BLAZE"),
   field10934(12, field10932, "CREEPER"),
   field10935(21, field10932, "ENDERMITE"),
   field10936(20, field10932, "ENDERMAN"),
   field10937(30, field10932, "GIANT"),
   field10938(72, field10932, "SILVERFISH"),
   field10939(92, field10932, "VEX"),
   field10940(96, field10932, "WITCH"),
   field10941(97, field10932, "WITHER"),
   field10942(67, field10932, "RAVAGER"),
   field10943(-1, field10932, "ABSTRACT_PIGLIN"),
   field10944(60, field10943, "PIGLIN"),
   field10945(61, field10943, "PIGLIN_BRUTE"),
   field10946(32, field10896, "HOGLIN"),
   field10947(83, field10896, "STRIDER"),
   field10948(101, field10932, "ZOGLIN"),
   field10949(-1, field10932, "ABSTRACT_ILLAGER_BASE"),
   field10950(-1, field10949, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field10951(22, field10950, "EVOKER"),
   field10952(35, field10950, "ILLUSIONER"),
   field10953(94, field10949, "VINDICATOR"),
   field10954(62, field10949, "PILLAGER"),
   field10955(-1, field10932, "ABSTRACT_SKELETON"),
   field10956(73, field10955, "SKELETON"),
   field10957(82, field10955, "STRAY"),
   field10958(98, field10955, "WITHER_SKELETON"),
   field10959(31, field10932, "GUARDIAN"),
   field10960(17, field10959, "ELDER_GUARDIAN"),
   field10961(80, field10932, "SPIDER"),
   field10962(8, field10961, "CAVE_SPIDER"),
   field10963(102, field10932, "ZOMBIE"),
   field10964(16, field10963, "DROWNED"),
   field10965(34, field10963, "HUSK"),
   field10966(105, field10963, "ZOMBIFIED_PIGLIN"),
   field10967(104, field10963, "ZOMBIE_VILLAGER"),
   field10968(-1, field10889, "ABSTRACT_FLYING"),
   field10969(29, field10968, "GHAST"),
   field10970(58, field10968, "PHANTOM"),
   field10971(-1, field10889, "ABSTRACT_AMBIENT"),
   field10972(3, field10971, "BAT"),
   field10973(-1, field10889, "ABSTRACT_WATERMOB"),
   field10974(81, field10973, "SQUID"),
   field10975(75, field10889, "SLIME"),
   field10976(44, field10975, "MAGMA_CUBE"),
   field10977(-1, field10873, "ABSTRACT_HANGING"),
   field10978(40, field10977, "LEASH_KNOT"),
   field10979(38, field10977, "ITEM_FRAME"),
   field10980(55, field10977, "PAINTING"),
   field10981(-1, field10873, "ABSTRACT_LIGHTNING"),
   field10982(41, field10981, "LIGHTNING_BOLT"),
   field10983(-1, field10873, "ABSTRACT_ARROW"),
   field10984(2, field10983, "ARROW"),
   field10985(79, field10983, "SPECTRAL_ARROW"),
   field10986(88, field10983, "TRIDENT"),
   field10987(-1, field10873, "ABSTRACT_FIREBALL"),
   field10988(15, field10987, "DRAGON_FIREBALL"),
   field10989(39, field10987, "FIREBALL"),
   field10990(76, field10987, "SMALL_FIREBALL"),
   field10991(99, field10987, "WITHER_SKULL"),
   field10992(-1, field10873, "PROJECTILE_ABSTRACT"),
   field10993(78, field10992, "SNOWBALL"),
   field10994(85, field10992, "ENDER_PEARL"),
   field10995(84, field10992, "EGG"),
   field10996(87, field10992, "POTION"),
   field10997(86, field10992, "EXPERIENCE_BOTTLE"),
   field10998(-1, field10873, "MINECART_ABSTRACT"),
   field10999(-1, field10998, "CHESTED_MINECART_ABSTRACT"),
   field11000(46, field10999, "CHEST_MINECART"),
   field11001(49, field10999, "HOPPER_MINECART"),
   field11002(45, field10998, "MINECART"),
   field11003(48, field10998, "FURNACE_MINECART"),
   field11004(47, field10998, "COMMAND_BLOCK_MINECART"),
   field11005(51, field10998, "TNT_MINECART"),
   field11006(50, field10998, "SPAWNER_MINECART"),
   field11007(6, field10873, "BOAT");

   private static final Map<Integer, Class1874> field11008 = new HashMap<Integer, Class1874>();
   private final int field11009;
   private final Class1874 field11010;
   private String field11011;
   private static final Class1874[] field11012 = new Class1874[]{
      field10873,
      field10874,
      field10875,
      field10876,
      field10877,
      field10878,
      field10879,
      field10880,
      field10881,
      field10882,
      field10883,
      field10884,
      field10885,
      field10886,
      field10887,
      field10888,
      field10889,
      field10890,
      field10891,
      field10892,
      field10893,
      field10894,
      field10895,
      field10896,
      field10897,
      field10898,
      field10899,
      field10900,
      field10901,
      field10902,
      field10903,
      field10904,
      field10905,
      field10906,
      field10907,
      field10908,
      field10909,
      field10910,
      field10911,
      field10912,
      field10913,
      field10914,
      field10915,
      field10916,
      field10917,
      field10918,
      field10919,
      field10920,
      field10921,
      field10922,
      field10923,
      field10924,
      field10925,
      field10926,
      field10927,
      field10928,
      field10929,
      field10930,
      field10931,
      field10932,
      field10933,
      field10934,
      field10935,
      field10936,
      field10937,
      field10938,
      field10939,
      field10940,
      field10941,
      field10942,
      field10943,
      field10944,
      field10945,
      field10946,
      field10947,
      field10948,
      field10949,
      field10950,
      field10951,
      field10952,
      field10953,
      field10954,
      field10955,
      field10956,
      field10957,
      field10958,
      field10959,
      field10960,
      field10961,
      field10962,
      field10963,
      field10964,
      field10965,
      field10966,
      field10967,
      field10968,
      field10969,
      field10970,
      field10971,
      field10972,
      field10973,
      field10974,
      field10975,
      field10976,
      field10977,
      field10978,
      field10979,
      field10980,
      field10981,
      field10982,
      field10983,
      field10984,
      field10985,
      field10986,
      field10987,
      field10988,
      field10989,
      field10990,
      field10991,
      field10992,
      field10993,
      field10994,
      field10995,
      field10996,
      field10997,
      field10998,
      field10999,
      field11000,
      field11001,
      field11002,
      field11003,
      field11004,
      field11005,
      field11006,
      field11007
   };

   private Class1874(int var3, String var4) {
      this.field11009 = var3;
      this.field11010 = null;
      this.field11011 = var4;
   }

   private Class1874(int var3, Class1874 var4, String var5) {
      this.field11009 = var3;
      this.field11010 = var4;
      this.field11011 = var5;
   }

   @Override
   public int method8121() {
      return this.field11009;
   }

   public Class1874 method8125() {
      return this.field11010;
   }

   public static Optional<Class1874> method8135(int var0) {
      return var0 != -1 ? Optional.<Class1874>ofNullable(field11008.get(var0)) : Optional.<Class1874>empty();
   }

   @Override
   public String method8124() {
      return this.field11011;
   }

   static {
      for (Class1874 var9 : values()) {
         field11008.put(var9.field11009, var9);
      }
   }
}
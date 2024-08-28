package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1868 implements Class1867 {
   field10176(-1, "ENTITY"),
   field10177(1, field10176, "DROPPED_ITEM"),
   field10178(2, field10176, "EXPERIENCE_ORB"),
   field10179(8, field10176, "LEASH_HITCH"),
   field10180(9, field10176, "PAINTING"),
   field10181(10, field10176, "ARROW"),
   field10182(11, field10176, "SNOWBALL"),
   field10183(12, field10176, "FIREBALL"),
   field10184(13, field10176, "SMALL_FIREBALL"),
   field10185(14, field10176, "ENDER_PEARL"),
   field10186(15, field10176, "ENDER_SIGNAL"),
   field10187(17, field10176, "THROWN_EXP_BOTTLE"),
   field10188(18, field10176, "ITEM_FRAME"),
   field10189(19, field10176, "WITHER_SKULL"),
   field10190(20, field10176, "PRIMED_TNT"),
   field10191(21, field10176, "FALLING_BLOCK"),
   field10192(22, field10176, "FIREWORK"),
   field10193(24, field10181, "SPECTRAL_ARROW"),
   field10194(25, field10176, "SHULKER_BULLET"),
   field10195(26, field10183, "DRAGON_FIREBALL"),
   field10196(33, field10176, "EVOCATION_FANGS"),
   field10197(-1, field10176, "ENTITY_LIVING"),
   field10198(-1, field10197, "ENTITY_INSENTIENT"),
   field10199(-1, field10198, "ENTITY_AGEABLE"),
   field10200(-1, field10199, "ENTITY_TAMEABLE_ANIMAL"),
   field10201(-1, field10197, "ENTITY_HUMAN"),
   field10202(30, field10197, "ARMOR_STAND"),
   field10203(34, field10198, "EVOCATION_ILLAGER"),
   field10204(35, field10198, "VEX"),
   field10205(36, field10198, "VINDICATION_ILLAGER"),
   field10206(-1, field10176, "MINECART_ABSTRACT"),
   field10207(40, field10206, "MINECART_COMMAND"),
   field10208(41, field10176, "BOAT"),
   field10209(42, field10206, "MINECART_RIDEABLE"),
   field10210(43, field10206, "MINECART_CHEST"),
   field10211(44, field10206, "MINECART_FURNACE"),
   field10212(45, field10206, "MINECART_TNT"),
   field10213(46, field10206, "MINECART_HOPPER"),
   field10214(47, field10206, "MINECART_MOB_SPAWNER"),
   field10215(50, field10198, "CREEPER"),
   field10216(-1, field10198, "ABSTRACT_SKELETON"),
   field10217(51, field10216, "SKELETON"),
   field10218(5, field10216, "WITHER_SKELETON"),
   field10219(6, field10216, "STRAY"),
   field10220(52, field10198, "SPIDER"),
   field10221(53, field10198, "GIANT"),
   field10222(54, field10198, "ZOMBIE"),
   field10223(23, field10222, "HUSK"),
   field10224(27, field10222, "ZOMBIE_VILLAGER"),
   field10225(55, field10198, "SLIME"),
   field10226(56, field10198, "GHAST"),
   field10227(57, field10222, "PIG_ZOMBIE"),
   field10228(58, field10198, "ENDERMAN"),
   field10229(59, field10220, "CAVE_SPIDER"),
   field10230(60, field10198, "SILVERFISH"),
   field10231(61, field10198, "BLAZE"),
   field10232(62, field10225, "MAGMA_CUBE"),
   field10233(63, field10198, "ENDER_DRAGON"),
   field10234(64, field10198, "WITHER"),
   field10235(65, field10198, "BAT"),
   field10236(66, field10198, "WITCH"),
   field10237(67, field10198, "ENDERMITE"),
   field10238(68, field10198, "GUARDIAN"),
   field10239(4, field10238, "ELDER_GUARDIAN"),
   field10240(99, field10198, "IRON_GOLEM"),
   field10241(69, field10240, "SHULKER"),
   field10242(90, field10199, "PIG"),
   field10243(91, field10199, "SHEEP"),
   field10244(92, field10199, "COW"),
   field10245(93, field10199, "CHICKEN"),
   field10246(94, field10198, "SQUID"),
   field10247(95, field10200, "WOLF"),
   field10248(96, field10244, "MUSHROOM_COW"),
   field10249(97, field10240, "SNOWMAN"),
   field10250(98, field10200, "OCELOT"),
   field10251(-1, field10199, "ABSTRACT_HORSE"),
   field10252(100, field10251, "HORSE"),
   field10253(28, field10251, "SKELETON_HORSE"),
   field10254(29, field10251, "ZOMBIE_HORSE"),
   field10255(-1, field10251, "CHESTED_HORSE"),
   field10256(31, field10255, "DONKEY"),
   field10257(32, field10255, "MULE"),
   field10258(103, field10255, "LIAMA"),
   field10259(101, field10199, "RABBIT"),
   field10260(102, field10199, "POLAR_BEAR"),
   field10261(120, field10199, "VILLAGER"),
   field10262(200, field10176, "ENDER_CRYSTAL"),
   field10263(-1, field10176, "SPLASH_POTION"),
   field10264(-1, field10263, "LINGERING_POTION"),
   field10265(-1, field10176, "AREA_EFFECT_CLOUD"),
   field10266(-1, field10176, "EGG"),
   field10267(-1, field10176, "FISHING_HOOK"),
   field10268(-1, field10176, "LIGHTNING"),
   field10269(-1, field10176, "WEATHER"),
   field10270(-1, field10201, "PLAYER"),
   field10271(-1, field10176, "COMPLEX_PART"),
   field10272(-1, field10176, "LIAMA_SPIT");

   private static final Map<Integer, Class1868> field10273 = new HashMap<Integer, Class1868>();
   private final int field10274;
   private final Class1868 field10275;
   private String field10276;
   private static final Class1868[] field10277 = new Class1868[]{
      field10176,
      field10177,
      field10178,
      field10179,
      field10180,
      field10181,
      field10182,
      field10183,
      field10184,
      field10185,
      field10186,
      field10187,
      field10188,
      field10189,
      field10190,
      field10191,
      field10192,
      field10193,
      field10194,
      field10195,
      field10196,
      field10197,
      field10198,
      field10199,
      field10200,
      field10201,
      field10202,
      field10203,
      field10204,
      field10205,
      field10206,
      field10207,
      field10208,
      field10209,
      field10210,
      field10211,
      field10212,
      field10213,
      field10214,
      field10215,
      field10216,
      field10217,
      field10218,
      field10219,
      field10220,
      field10221,
      field10222,
      field10223,
      field10224,
      field10225,
      field10226,
      field10227,
      field10228,
      field10229,
      field10230,
      field10231,
      field10232,
      field10233,
      field10234,
      field10235,
      field10236,
      field10237,
      field10238,
      field10239,
      field10240,
      field10241,
      field10242,
      field10243,
      field10244,
      field10245,
      field10246,
      field10247,
      field10248,
      field10249,
      field10250,
      field10251,
      field10252,
      field10253,
      field10254,
      field10255,
      field10256,
      field10257,
      field10258,
      field10259,
      field10260,
      field10261,
      field10262,
      field10263,
      field10264,
      field10265,
      field10266,
      field10267,
      field10268,
      field10269,
      field10270,
      field10271,
      field10272
   };

   private Class1868(int var3, String var4) {
      this.field10274 = var3;
      this.field10275 = null;
      this.field10276 = var4;
   }

   private Class1868(int var3, Class1868 var4, String var5) {
      this.field10274 = var3;
      this.field10275 = var4;
      this.field10276 = var5;
   }

   @Override
   public int method8121() {
      return this.field10274;
   }

   public Class1868 method8125() {
      return this.field10275;
   }

   public static Optional<Class1868> method8129(int var0) {
      return var0 != -1 ? Optional.<Class1868>ofNullable(field10273.get(var0)) : Optional.<Class1868>empty();
   }

   @Override
   public String method8124() {
      return this.field10276;
   }

   static {
      for (Class1868 var9 : values()) {
         field10273.put(var9.field10274, var9);
      }
   }
}

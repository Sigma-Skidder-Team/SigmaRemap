package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1871 implements Class1867 {
   field10550(-1, "ENTITY"),
   field10551(1, field10550, "DROPPED_ITEM"),
   field10552(2, field10550, "EXPERIENCE_ORB"),
   field10553(8, field10550, "LEASH_HITCH"),
   field10554(9, field10550, "PAINTING"),
   field10555(10, field10550, "ARROW"),
   field10556(11, field10550, "SNOWBALL"),
   field10557(12, field10550, "FIREBALL"),
   field10558(13, field10550, "SMALL_FIREBALL"),
   field10559(14, field10550, "ENDER_PEARL"),
   field10560(15, field10550, "ENDER_SIGNAL"),
   field10561(17, field10550, "THROWN_EXP_BOTTLE"),
   field10562(18, field10550, "ITEM_FRAME"),
   field10563(19, field10550, "WITHER_SKULL"),
   field10564(20, field10550, "PRIMED_TNT"),
   field10565(21, field10550, "FALLING_BLOCK"),
   field10566(22, field10550, "FIREWORK"),
   field10567(24, field10555, "SPECTRAL_ARROW"),
   field10568(25, field10550, "SHULKER_BULLET"),
   field10569(26, field10557, "DRAGON_FIREBALL"),
   field10570(33, field10550, "EVOCATION_FANGS"),
   field10571(-1, field10550, "ENTITY_LIVING"),
   field10572(-1, field10571, "ENTITY_INSENTIENT"),
   field10573(-1, field10572, "ENTITY_AGEABLE"),
   field10574(-1, field10573, "ENTITY_TAMEABLE_ANIMAL"),
   field10575(-1, field10571, "ENTITY_HUMAN"),
   field10576(30, field10571, "ARMOR_STAND"),
   field10577(-1, field10572, "ENTITY_ILLAGER_ABSTRACT"),
   field10578(34, field10577, "EVOCATION_ILLAGER"),
   field10579(35, field10572, "VEX"),
   field10580(36, field10577, "VINDICATION_ILLAGER"),
   field10581(37, field10578, "ILLUSION_ILLAGER"),
   field10582(-1, field10550, "MINECART_ABSTRACT"),
   field10583(40, field10582, "MINECART_COMMAND"),
   field10584(41, field10550, "BOAT"),
   field10585(42, field10582, "MINECART_RIDEABLE"),
   field10586(43, field10582, "MINECART_CHEST"),
   field10587(44, field10582, "MINECART_FURNACE"),
   field10588(45, field10582, "MINECART_TNT"),
   field10589(46, field10582, "MINECART_HOPPER"),
   field10590(47, field10582, "MINECART_MOB_SPAWNER"),
   field10591(50, field10572, "CREEPER"),
   field10592(-1, field10572, "ABSTRACT_SKELETON"),
   field10593(51, field10592, "SKELETON"),
   field10594(5, field10592, "WITHER_SKELETON"),
   field10595(6, field10592, "STRAY"),
   field10596(52, field10572, "SPIDER"),
   field10597(53, field10572, "GIANT"),
   field10598(54, field10572, "ZOMBIE"),
   field10599(23, field10598, "HUSK"),
   field10600(27, field10598, "ZOMBIE_VILLAGER"),
   field10601(55, field10572, "SLIME"),
   field10602(56, field10572, "GHAST"),
   field10603(57, field10598, "PIG_ZOMBIE"),
   field10604(58, field10572, "ENDERMAN"),
   field10605(59, field10596, "CAVE_SPIDER"),
   field10606(60, field10572, "SILVERFISH"),
   field10607(61, field10572, "BLAZE"),
   field10608(62, field10601, "MAGMA_CUBE"),
   field10609(63, field10572, "ENDER_DRAGON"),
   field10610(64, field10572, "WITHER"),
   field10611(65, field10572, "BAT"),
   field10612(66, field10572, "WITCH"),
   field10613(67, field10572, "ENDERMITE"),
   field10614(68, field10572, "GUARDIAN"),
   field10615(4, field10614, "ELDER_GUARDIAN"),
   field10616(99, field10572, "IRON_GOLEM"),
   field10617(69, field10616, "SHULKER"),
   field10618(90, field10573, "PIG"),
   field10619(91, field10573, "SHEEP"),
   field10620(92, field10573, "COW"),
   field10621(93, field10573, "CHICKEN"),
   field10622(94, field10572, "SQUID"),
   field10623(95, field10574, "WOLF"),
   field10624(96, field10620, "MUSHROOM_COW"),
   field10625(97, field10616, "SNOWMAN"),
   field10626(98, field10574, "OCELOT"),
   field10627(105, field10574, "PARROT"),
   field10628(-1, field10573, "ABSTRACT_HORSE"),
   field10629(100, field10628, "HORSE"),
   field10630(28, field10628, "SKELETON_HORSE"),
   field10631(29, field10628, "ZOMBIE_HORSE"),
   field10632(-1, field10628, "CHESTED_HORSE"),
   field10633(31, field10632, "DONKEY"),
   field10634(32, field10632, "MULE"),
   field10635(103, field10632, "LIAMA"),
   field10636(101, field10573, "RABBIT"),
   field10637(102, field10573, "POLAR_BEAR"),
   field10638(120, field10573, "VILLAGER"),
   field10639(200, field10550, "ENDER_CRYSTAL"),
   field10640(-1, field10550, "SPLASH_POTION"),
   field10641(-1, field10640, "LINGERING_POTION"),
   field10642(-1, field10550, "AREA_EFFECT_CLOUD"),
   field10643(-1, field10550, "EGG"),
   field10644(-1, field10550, "FISHING_HOOK"),
   field10645(-1, field10550, "LIGHTNING"),
   field10646(-1, field10550, "WEATHER"),
   field10647(-1, field10575, "PLAYER"),
   field10648(-1, field10550, "COMPLEX_PART"),
   field10649(-1, field10550, "LIAMA_SPIT");

   private static final Map<Integer, Class1871> field10650 = new HashMap<Integer, Class1871>();
   private final int field10651;
   private final Class1871 field10652;
   private String field10653;
   private static final Class1871[] field10654 = new Class1871[]{
      field10550,
      field10551,
      field10552,
      field10553,
      field10554,
      field10555,
      field10556,
      field10557,
      field10558,
      field10559,
      field10560,
      field10561,
      field10562,
      field10563,
      field10564,
      field10565,
      field10566,
      field10567,
      field10568,
      field10569,
      field10570,
      field10571,
      field10572,
      field10573,
      field10574,
      field10575,
      field10576,
      field10577,
      field10578,
      field10579,
      field10580,
      field10581,
      field10582,
      field10583,
      field10584,
      field10585,
      field10586,
      field10587,
      field10588,
      field10589,
      field10590,
      field10591,
      field10592,
      field10593,
      field10594,
      field10595,
      field10596,
      field10597,
      field10598,
      field10599,
      field10600,
      field10601,
      field10602,
      field10603,
      field10604,
      field10605,
      field10606,
      field10607,
      field10608,
      field10609,
      field10610,
      field10611,
      field10612,
      field10613,
      field10614,
      field10615,
      field10616,
      field10617,
      field10618,
      field10619,
      field10620,
      field10621,
      field10622,
      field10623,
      field10624,
      field10625,
      field10626,
      field10627,
      field10628,
      field10629,
      field10630,
      field10631,
      field10632,
      field10633,
      field10634,
      field10635,
      field10636,
      field10637,
      field10638,
      field10639,
      field10640,
      field10641,
      field10642,
      field10643,
      field10644,
      field10645,
      field10646,
      field10647,
      field10648,
      field10649
   };

   private Class1871(int var3, String var4) {
      this.field10651 = var3;
      this.field10652 = null;
      this.field10653 = var4;
   }

   private Class1871(int var3, Class1871 var4, String var5) {
      this.field10651 = var3;
      this.field10652 = var4;
      this.field10653 = var5;
   }

   @Override
   public int method8121() {
      return this.field10651;
   }

   public Class1871 method8125() {
      return this.field10652;
   }

   public static Optional<Class1871> method8132(int var0) {
      return var0 != -1 ? Optional.<Class1871>ofNullable(field10650.get(var0)) : Optional.<Class1871>empty();
   }

   @Override
   public String method8124() {
      return this.field10653;
   }

   static {
      for (Class1871 var9 : values()) {
         field10650.put(var9.field10651, var9);
      }
   }
}

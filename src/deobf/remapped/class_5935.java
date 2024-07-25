package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_5935 implements class_754 {
   field_30172(-1, "ENTITY"),
   field_30169(1, field_30172, "DROPPED_ITEM"),
   field_30230(2, field_30172, "EXPERIENCE_ORB"),
   field_30214(8, field_30172, "LEASH_HITCH"),
   field_30215(9, field_30172, "PAINTING"),
   field_30200(10, field_30172, "ARROW"),
   field_30251(11, field_30172, "SNOWBALL"),
   field_30249(12, field_30172, "FIREBALL"),
   field_30177(13, field_30172, "SMALL_FIREBALL"),
   field_30224(14, field_30172, "ENDER_PEARL"),
   field_30178(15, field_30172, "ENDER_SIGNAL"),
   field_30184(17, field_30172, "THROWN_EXP_BOTTLE"),
   field_30211(18, field_30172, "ITEM_FRAME"),
   field_30186(19, field_30172, "WITHER_SKULL"),
   field_30204(20, field_30172, "PRIMED_TNT"),
   field_30256(21, field_30172, "FALLING_BLOCK"),
   field_30191(22, field_30172, "FIREWORK"),
   field_30260(24, field_30200, "SPECTRAL_ARROW"),
   field_30209(25, field_30172, "SHULKER_BULLET"),
   field_30201(26, field_30249, "DRAGON_FIREBALL"),
   field_30220(33, field_30172, "EVOCATION_FANGS"),
   field_30266(-1, field_30172, "ENTITY_LIVING"),
   field_30253(-1, field_30266, "ENTITY_INSENTIENT"),
   field_30203(-1, field_30253, "ENTITY_AGEABLE"),
   field_30219(-1, field_30203, "ENTITY_TAMEABLE_ANIMAL"),
   field_30257(-1, field_30266, "ENTITY_HUMAN"),
   field_30170(30, field_30266, "ARMOR_STAND"),
   field_30270(-1, field_30253, "ENTITY_ILLAGER_ABSTRACT"),
   field_30234(34, field_30270, "EVOCATION_ILLAGER"),
   field_30272(35, field_30253, "VEX"),
   field_30171(36, field_30270, "VINDICATION_ILLAGER"),
   field_30205(37, field_30234, "ILLUSION_ILLAGER"),
   field_30258(-1, field_30172, "MINECART_ABSTRACT"),
   field_30179(40, field_30258, "MINECART_COMMAND"),
   field_30192(41, field_30172, "BOAT"),
   field_30185(42, field_30258, "MINECART_RIDEABLE"),
   field_30182(43, field_30258, "MINECART_CHEST"),
   field_30197(44, field_30258, "MINECART_FURNACE"),
   field_30273(45, field_30258, "MINECART_TNT"),
   field_30241(46, field_30258, "MINECART_HOPPER"),
   field_30223(47, field_30258, "MINECART_MOB_SPAWNER"),
   field_30213(50, field_30253, "CREEPER"),
   field_30195(-1, field_30253, "ABSTRACT_SKELETON"),
   field_30198(51, field_30195, "SKELETON"),
   field_30254(5, field_30195, "WITHER_SKELETON"),
   field_30187(6, field_30195, "STRAY"),
   field_30229(52, field_30253, "SPIDER"),
   field_30216(53, field_30253, "GIANT"),
   field_30244(54, field_30253, "ZOMBIE"),
   field_30238(23, field_30244, "HUSK"),
   field_30235(27, field_30244, "ZOMBIE_VILLAGER"),
   field_30261(55, field_30253, "SLIME"),
   field_30252(56, field_30253, "GHAST"),
   field_30274(57, field_30244, "PIG_ZOMBIE"),
   field_30188(58, field_30253, "ENDERMAN"),
   field_30222(59, field_30229, "CAVE_SPIDER"),
   field_30237(60, field_30253, "SILVERFISH"),
   field_30208(61, field_30253, "BLAZE"),
   field_30175(62, field_30261, "MAGMA_CUBE"),
   field_30221(63, field_30253, "ENDER_DRAGON"),
   field_30239(64, field_30253, "WITHER"),
   field_30227(65, field_30253, "BAT"),
   field_30233(66, field_30253, "WITCH"),
   field_30248(67, field_30253, "ENDERMITE"),
   field_30183(68, field_30253, "GUARDIAN"),
   field_30190(4, field_30183, "ELDER_GUARDIAN"),
   field_30247(99, field_30253, "IRON_GOLEM"),
   field_30269(69, field_30247, "SHULKER"),
   field_30180(90, field_30203, "PIG"),
   field_30232(91, field_30203, "SHEEP"),
   field_30202(92, field_30203, "COW"),
   field_30194(93, field_30203, "CHICKEN"),
   field_30265(94, field_30253, "SQUID"),
   field_30217(95, field_30219, "WOLF"),
   field_30199(96, field_30202, "MUSHROOM_COW"),
   field_30181(97, field_30247, "SNOWMAN"),
   field_30212(98, field_30219, "OCELOT"),
   field_30193(105, field_30219, "PARROT"),
   field_30196(-1, field_30203, "ABSTRACT_HORSE"),
   field_30206(100, field_30196, "HORSE"),
   field_30242(28, field_30196, "SKELETON_HORSE"),
   field_30255(29, field_30196, "ZOMBIE_HORSE"),
   field_30174(-1, field_30196, "CHESTED_HORSE"),
   field_30189(31, field_30174, "DONKEY"),
   field_30262(32, field_30174, "MULE"),
   field_30207(103, field_30174, "LIAMA"),
   field_30263(101, field_30203, "RABBIT"),
   field_30271(102, field_30203, "POLAR_BEAR"),
   field_30173(120, field_30203, "VILLAGER"),
   field_30250(200, field_30172, "ENDER_CRYSTAL"),
   field_30176(-1, field_30172, "SPLASH_POTION"),
   field_30246(-1, field_30176, "LINGERING_POTION"),
   field_30218(-1, field_30172, "AREA_EFFECT_CLOUD"),
   field_30228(-1, field_30172, "EGG"),
   field_30240(-1, field_30172, "FISHING_HOOK"),
   field_30236(-1, field_30172, "LIGHTNING"),
   field_30259(-1, field_30172, "WEATHER"),
   field_30264(-1, field_30257, "PLAYER"),
   field_30226(-1, field_30172, "COMPLEX_PART"),
   field_30231(-1, field_30172, "LIAMA_SPIT");

   private static final Map<Integer, class_5935> field_30267 = new HashMap<Integer, class_5935>();
   private final int field_30268;
   private final class_5935 field_30225;
   private String field_30243;

   private class_5935(int var3, String var4) {
      this.field_30268 = var3;
      this.field_30225 = null;
      this.field_30243 = var4;
   }

   private class_5935(int var3, class_5935 var4, String var5) {
      this.field_30268 = var3;
      this.field_30225 = var4;
      this.field_30243 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_30268;
   }

   public class_5935 method_27136() {
      return this.field_30225;
   }

   public static Optional<class_5935> method_27135(int var0) {
      return var0 != -1 ? Optional.<class_5935>ofNullable(field_30267.get(var0)) : Optional.<class_5935>empty();
   }

   @Override
   public String method_3419() {
      return this.field_30243;
   }

   static {
      for (class_5935 var9 : values()) {
         field_30267.put(var9.field_30268, var9);
      }
   }
}

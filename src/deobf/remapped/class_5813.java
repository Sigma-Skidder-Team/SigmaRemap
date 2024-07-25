package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_5813 implements class_754 {
   field_29426(-1, "ENTITY"),
   field_29414(1, field_29426, "DROPPED_ITEM"),
   field_29356(2, field_29426, "EXPERIENCE_ORB"),
   field_29373(8, field_29426, "LEASH_HITCH"),
   field_29405(9, field_29426, "PAINTING"),
   field_29425(10, field_29426, "ARROW"),
   field_29438(11, field_29426, "SNOWBALL"),
   field_29370(12, field_29426, "FIREBALL"),
   field_29422(13, field_29426, "SMALL_FIREBALL"),
   field_29420(14, field_29426, "ENDER_PEARL"),
   field_29393(15, field_29426, "ENDER_SIGNAL"),
   field_29387(17, field_29426, "THROWN_EXP_BOTTLE"),
   field_29384(18, field_29426, "ITEM_FRAME"),
   field_29395(19, field_29426, "WITHER_SKULL"),
   field_29431(20, field_29426, "PRIMED_TNT"),
   field_29408(21, field_29426, "FALLING_BLOCK"),
   field_29369(22, field_29426, "FIREWORK"),
   field_29357(23, field_29425, "TIPPED_ARROW"),
   field_29432(24, field_29425, "SPECTRAL_ARROW"),
   field_29364(25, field_29426, "SHULKER_BULLET"),
   field_29371(26, field_29370, "DRAGON_FIREBALL"),
   field_29424(-1, field_29426, "ENTITY_LIVING"),
   field_29382(-1, field_29424, "ENTITY_INSENTIENT"),
   field_29400(-1, field_29382, "ENTITY_AGEABLE"),
   field_29423(-1, field_29400, "ENTITY_TAMEABLE_ANIMAL"),
   field_29409(-1, field_29424, "ENTITY_HUMAN"),
   field_29362(30, field_29424, "ARMOR_STAND"),
   field_29368(-1, field_29426, "MINECART_ABSTRACT"),
   field_29372(40, field_29368, "MINECART_COMMAND"),
   field_29421(41, field_29426, "BOAT"),
   field_29416(42, field_29368, "MINECART_RIDEABLE"),
   field_29399(43, field_29368, "MINECART_CHEST"),
   field_29418(44, field_29368, "MINECART_FURNACE"),
   field_29401(45, field_29368, "MINECART_TNT"),
   field_29419(46, field_29368, "MINECART_HOPPER"),
   field_29386(47, field_29368, "MINECART_MOB_SPAWNER"),
   field_29377(50, field_29382, "CREEPER"),
   field_29412(51, field_29382, "SKELETON"),
   field_29429(52, field_29382, "SPIDER"),
   field_29359(53, field_29382, "GIANT"),
   field_29440(54, field_29382, "ZOMBIE"),
   field_29392(55, field_29382, "SLIME"),
   field_29383(56, field_29382, "GHAST"),
   field_29358(57, field_29440, "PIG_ZOMBIE"),
   field_29378(58, field_29382, "ENDERMAN"),
   field_29434(59, field_29429, "CAVE_SPIDER"),
   field_29406(60, field_29382, "SILVERFISH"),
   field_29411(61, field_29382, "BLAZE"),
   field_29397(62, field_29392, "MAGMA_CUBE"),
   field_29361(63, field_29382, "ENDER_DRAGON"),
   field_29396(64, field_29382, "WITHER"),
   field_29428(65, field_29382, "BAT"),
   field_29415(66, field_29382, "WITCH"),
   field_29379(67, field_29382, "ENDERMITE"),
   field_29385(68, field_29382, "GUARDIAN"),
   field_29437(99, field_29382, "IRON_GOLEM"),
   field_29439(69, field_29437, "SHULKER"),
   field_29436(90, field_29400, "PIG"),
   field_29410(91, field_29400, "SHEEP"),
   field_29435(92, field_29400, "COW"),
   field_29413(93, field_29400, "CHICKEN"),
   field_29433(94, field_29382, "SQUID"),
   field_29367(95, field_29423, "WOLF"),
   field_29355(96, field_29435, "MUSHROOM_COW"),
   field_29394(97, field_29437, "SNOWMAN"),
   field_29390(98, field_29423, "OCELOT"),
   field_29398(100, field_29400, "HORSE"),
   field_29389(101, field_29400, "RABBIT"),
   field_29391(102, field_29400, "POLAR_BEAR"),
   field_29376(120, field_29400, "VILLAGER"),
   field_29430(200, field_29426, "ENDER_CRYSTAL"),
   field_29375(-1, field_29426, "SPLASH_POTION"),
   field_29381(-1, field_29375, "LINGERING_POTION"),
   field_29363(-1, field_29426, "AREA_EFFECT_CLOUD"),
   field_29365(-1, field_29426, "EGG"),
   field_29380(-1, field_29426, "FISHING_HOOK"),
   field_29403(-1, field_29426, "LIGHTNING"),
   field_29360(-1, field_29426, "WEATHER"),
   field_29404(-1, field_29409, "PLAYER"),
   field_29417(-1, field_29426, "COMPLEX_PART");

   private static final Map<Integer, class_5813> field_29427 = new HashMap<Integer, class_5813>();
   private final int field_29366;
   private final class_5813 field_29388;
   private String field_29402;

   private class_5813(int var3, String var4) {
      this.field_29366 = var3;
      this.field_29388 = null;
      this.field_29402 = var4;
   }

   private class_5813(int var3, class_5813 var4, String var5) {
      this.field_29366 = var3;
      this.field_29388 = var4;
      this.field_29402 = var5;
   }

   public static Optional<class_5813> method_26323(int var0) {
      return var0 != -1 ? Optional.<class_5813>ofNullable(field_29427.get(var0)) : Optional.<class_5813>empty();
   }

   @Override
   public int method_3416() {
      return this.field_29366;
   }

   public class_5813 method_26324() {
      return this.field_29388;
   }

   @Override
   public String method_3419() {
      return this.field_29402;
   }

   static {
      for (class_5813 var9 : values()) {
         field_29427.put(var9.field_29366, var9);
      }
   }
}

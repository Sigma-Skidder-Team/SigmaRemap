package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_6548 implements class_754 {
   field_33340(-1, "ENTITY"),
   field_33337(1, field_33340, "DROPPED_ITEM"),
   field_33360(2, field_33340, "EXPERIENCE_ORB"),
   field_33320(8, field_33340, "LEASH_HITCH"),
   field_33323(9, field_33340, "PAINTING"),
   field_33359(10, field_33340, "ARROW"),
   field_33286(11, field_33340, "SNOWBALL"),
   field_33343(12, field_33340, "FIREBALL"),
   field_33380(13, field_33340, "SMALL_FIREBALL"),
   field_33284(14, field_33340, "ENDER_PEARL"),
   field_33384(15, field_33340, "ENDER_SIGNAL"),
   field_33300(17, field_33340, "THROWN_EXP_BOTTLE"),
   field_33317(18, field_33340, "ITEM_FRAME"),
   field_33282(19, field_33340, "WITHER_SKULL"),
   field_33290(20, field_33340, "PRIMED_TNT"),
   field_33353(21, field_33340, "FALLING_BLOCK"),
   field_33292(22, field_33340, "FIREWORK"),
   field_33358(24, field_33359, "SPECTRAL_ARROW"),
   field_33371(25, field_33340, "SHULKER_BULLET"),
   field_33313(26, field_33343, "DRAGON_FIREBALL"),
   field_33327(33, field_33340, "EVOCATION_FANGS"),
   field_33297(-1, field_33340, "ENTITY_LIVING"),
   field_33341(-1, field_33297, "ENTITY_INSENTIENT"),
   field_33298(-1, field_33341, "ENTITY_AGEABLE"),
   field_33375(-1, field_33298, "ENTITY_TAMEABLE_ANIMAL"),
   field_33288(-1, field_33297, "ENTITY_HUMAN"),
   field_33367(30, field_33297, "ARMOR_STAND"),
   field_33362(34, field_33341, "EVOCATION_ILLAGER"),
   field_33378(35, field_33341, "VEX"),
   field_33333(36, field_33341, "VINDICATION_ILLAGER"),
   field_33305(-1, field_33340, "MINECART_ABSTRACT"),
   field_33348(40, field_33305, "MINECART_COMMAND"),
   field_33329(41, field_33340, "BOAT"),
   field_33338(42, field_33305, "MINECART_RIDEABLE"),
   field_33345(43, field_33305, "MINECART_CHEST"),
   field_33381(44, field_33305, "MINECART_FURNACE"),
   field_33383(45, field_33305, "MINECART_TNT"),
   field_33379(46, field_33305, "MINECART_HOPPER"),
   field_33374(47, field_33305, "MINECART_MOB_SPAWNER"),
   field_33363(50, field_33341, "CREEPER"),
   field_33294(-1, field_33341, "ABSTRACT_SKELETON"),
   field_33357(51, field_33294, "SKELETON"),
   field_33311(5, field_33294, "WITHER_SKELETON"),
   field_33364(6, field_33294, "STRAY"),
   field_33299(52, field_33341, "SPIDER"),
   field_33365(53, field_33341, "GIANT"),
   field_33356(54, field_33341, "ZOMBIE"),
   field_33291(23, field_33356, "HUSK"),
   field_33295(27, field_33356, "ZOMBIE_VILLAGER"),
   field_33285(55, field_33341, "SLIME"),
   field_33346(56, field_33341, "GHAST"),
   field_33308(57, field_33356, "PIG_ZOMBIE"),
   field_33372(58, field_33341, "ENDERMAN"),
   field_33354(59, field_33299, "CAVE_SPIDER"),
   field_33328(60, field_33341, "SILVERFISH"),
   field_33361(61, field_33341, "BLAZE"),
   field_33316(62, field_33285, "MAGMA_CUBE"),
   field_33322(63, field_33341, "ENDER_DRAGON"),
   field_33319(64, field_33341, "WITHER"),
   field_33309(65, field_33341, "BAT"),
   field_33330(66, field_33341, "WITCH"),
   field_33314(67, field_33341, "ENDERMITE"),
   field_33377(68, field_33341, "GUARDIAN"),
   field_33351(4, field_33377, "ELDER_GUARDIAN"),
   field_33289(99, field_33341, "IRON_GOLEM"),
   field_33331(69, field_33289, "SHULKER"),
   field_33369(90, field_33298, "PIG"),
   field_33352(91, field_33298, "SHEEP"),
   field_33306(92, field_33298, "COW"),
   field_33335(93, field_33298, "CHICKEN"),
   field_33349(94, field_33341, "SQUID"),
   field_33339(95, field_33375, "WOLF"),
   field_33373(96, field_33306, "MUSHROOM_COW"),
   field_33301(97, field_33289, "SNOWMAN"),
   field_33368(98, field_33375, "OCELOT"),
   field_33332(-1, field_33298, "ABSTRACT_HORSE"),
   field_33350(100, field_33332, "HORSE"),
   field_33318(28, field_33332, "SKELETON_HORSE"),
   field_33310(29, field_33332, "ZOMBIE_HORSE"),
   field_33366(-1, field_33332, "CHESTED_HORSE"),
   field_33355(31, field_33366, "DONKEY"),
   field_33293(32, field_33366, "MULE"),
   field_33315(103, field_33366, "LIAMA"),
   field_33307(101, field_33298, "RABBIT"),
   field_33344(102, field_33298, "POLAR_BEAR"),
   field_33321(120, field_33298, "VILLAGER"),
   field_33347(200, field_33340, "ENDER_CRYSTAL"),
   field_33303(-1, field_33340, "SPLASH_POTION"),
   field_33334(-1, field_33303, "LINGERING_POTION"),
   field_33287(-1, field_33340, "AREA_EFFECT_CLOUD"),
   field_33324(-1, field_33340, "EGG"),
   field_33325(-1, field_33340, "FISHING_HOOK"),
   field_33283(-1, field_33340, "LIGHTNING"),
   field_33312(-1, field_33340, "WEATHER"),
   field_33336(-1, field_33288, "PLAYER"),
   field_33370(-1, field_33340, "COMPLEX_PART"),
   field_33342(-1, field_33340, "LIAMA_SPIT");

   private static final Map<Integer, class_6548> field_33326 = new HashMap<Integer, class_6548>();
   private final int field_33296;
   private final class_6548 field_33304;
   private String field_33382;

   private class_6548(int var3, String var4) {
      this.field_33296 = var3;
      this.field_33304 = null;
      this.field_33382 = var4;
   }

   private class_6548(int var3, class_6548 var4, String var5) {
      this.field_33296 = var3;
      this.field_33304 = var4;
      this.field_33382 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_33296;
   }

   public class_6548 method_29872() {
      return this.field_33304;
   }

   public static Optional<class_6548> method_29873(int var0) {
      return var0 != -1 ? Optional.<class_6548>ofNullable(field_33326.get(var0)) : Optional.<class_6548>empty();
   }

   @Override
   public String method_3419() {
      return this.field_33382;
   }

   static {
      for (class_6548 var9 : values()) {
         field_33326.put(var9.field_33296, var9);
      }
   }
}

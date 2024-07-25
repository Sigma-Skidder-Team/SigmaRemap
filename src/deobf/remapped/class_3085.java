package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_3085 implements class_754 {
   field_15175(-1, "ENTITY"),
   field_15266(0, field_15175, "AREA_EFFECT_CLOUD"),
   field_15232(18, field_15175, "END_CRYSTAL"),
   field_15164(22, field_15175, "EVOKER_FANGS"),
   field_15211(24, field_15175, "EXPERIENCE_ORB"),
   field_15267(25, field_15175, "EYE_OF_ENDER"),
   field_15247(26, field_15175, "FALLING_BLOCK"),
   field_15222(27, field_15175, "FIREWORK_ROCKET"),
   field_15225(35, field_15175, "ITEM"),
   field_15255(40, field_15175, "LLAMA_SPIT"),
   field_15287(59, field_15175, "TNT"),
   field_15238(64, field_15175, "SHULKER_BULLET"),
   field_15291(102, field_15175, "FISHING_BOBBER"),
   field_15190(-1, field_15175, "LIVINGENTITY"),
   field_15192(1, field_15190, "ARMOR_STAND"),
   field_15191(101, field_15190, "PLAYER"),
   field_15249(-1, field_15190, "ABSTRACT_INSENTIENT"),
   field_15214(19, field_15249, "ENDER_DRAGON"),
   field_15195(4, field_15249, "BEE"),
   field_15188(-1, field_15249, "ABSTRACT_CREATURE"),
   field_15177(-1, field_15188, "ABSTRACT_AGEABLE"),
   field_15217(85, field_15177, "VILLAGER"),
   field_15242(89, field_15177, "WANDERING_TRADER"),
   field_15209(-1, field_15177, "ABSTRACT_ANIMAL"),
   field_15251(14, field_15249, "DOLPHIN"),
   field_15186(9, field_15209, "CHICKEN"),
   field_15268(11, field_15209, "COW"),
   field_15271(50, field_15268, "MOOSHROOM"),
   field_15216(53, field_15249, "PANDA"),
   field_15295(55, field_15209, "PIG"),
   field_15196(58, field_15209, "POLAR_BEAR"),
   field_15172(60, field_15209, "RABBIT"),
   field_15280(62, field_15209, "SHEEP"),
   field_15281(78, field_15209, "TURTLE"),
   field_15265(28, field_15209, "FOX"),
   field_15199(-1, field_15209, "ABSTRACT_TAMEABLE_ANIMAL"),
   field_15168(7, field_15199, "CAT"),
   field_15170(51, field_15199, "OCELOT"),
   field_15206(94, field_15199, "WOLF"),
   field_15200(-1, field_15199, "ABSTRACT_PARROT"),
   field_15272(54, field_15200, "PARROT"),
   field_15169(-1, field_15209, "ABSTRACT_HORSE"),
   field_15252(-1, field_15169, "CHESTED_HORSE"),
   field_15239(13, field_15252, "DONKEY"),
   field_15294(49, field_15252, "MULE"),
   field_15269(39, field_15252, "LLAMA"),
   field_15293(76, field_15252, "TRADER_LLAMA"),
   field_15243(32, field_15169, "HORSE"),
   field_15162(67, field_15169, "SKELETON_HORSE"),
   field_15189(96, field_15169, "ZOMBIE_HORSE"),
   field_15173(-1, field_15188, "ABSTRACT_GOLEM"),
   field_15180(70, field_15173, "SNOW_GOLEM"),
   field_15224(86, field_15173, "IRON_GOLEM"),
   field_15197(63, field_15173, "SHULKER"),
   field_15263(-1, field_15188, "ABSTRACT_FISHES"),
   field_15205(10, field_15263, "COD"),
   field_15215(56, field_15263, "PUFFERFISH"),
   field_15275(61, field_15263, "SALMON"),
   field_15285(77, field_15263, "TROPICAL_FISH"),
   field_15286(-1, field_15188, "ABSTRACT_MONSTER"),
   field_15187(5, field_15286, "BLAZE"),
   field_15235(12, field_15286, "CREEPER"),
   field_15219(21, field_15286, "ENDERMITE"),
   field_15248(20, field_15286, "ENDERMAN"),
   field_15208(30, field_15286, "GIANT"),
   field_15233(65, field_15286, "SILVERFISH"),
   field_15171(84, field_15286, "VEX"),
   field_15230(90, field_15286, "WITCH"),
   field_15283(91, field_15286, "WITHER"),
   field_15256(99, field_15286, "RAVAGER"),
   field_15201(-1, field_15286, "ABSTRACT_ILLAGER_BASE"),
   field_15227(-1, field_15201, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field_15226(23, field_15227, "EVOKER"),
   field_15207(34, field_15227, "ILLUSIONER"),
   field_15210(87, field_15201, "VINDICATOR"),
   field_15259(88, field_15201, "PILLAGER"),
   field_15245(-1, field_15286, "ABSTRACT_SKELETON"),
   field_15273(66, field_15245, "SKELETON"),
   field_15185(75, field_15245, "STRAY"),
   field_15166(92, field_15245, "WITHER_SKELETON"),
   field_15276(31, field_15286, "GUARDIAN"),
   field_15183(17, field_15276, "ELDER_GUARDIAN"),
   field_15246(73, field_15286, "SPIDER"),
   field_15289(8, field_15246, "CAVE_SPIDER"),
   field_15288(95, field_15286, "ZOMBIE"),
   field_15240(16, field_15288, "DROWNED"),
   field_15184(33, field_15288, "HUSK"),
   field_15292(57, field_15288, "ZOMBIE_PIGMAN"),
   field_15237(97, field_15288, "ZOMBIE_VILLAGER"),
   field_15277(-1, field_15249, "ABSTRACT_FLYING"),
   field_15244(29, field_15277, "GHAST"),
   field_15213(98, field_15277, "PHANTOM"),
   field_15221(-1, field_15249, "ABSTRACT_AMBIENT"),
   field_15278(3, field_15221, "BAT"),
   field_15178(-1, field_15249, "ABSTRACT_WATERMOB"),
   field_15236(74, field_15178, "SQUID"),
   field_15234(68, field_15249, "SLIME"),
   field_15290(41, field_15234, "MAGMA_CUBE"),
   field_15262(-1, field_15175, "ABSTRACT_HANGING"),
   field_15179(38, field_15262, "LEASH_KNOT"),
   field_15220(36, field_15262, "ITEM_FRAME"),
   field_15176(52, field_15262, "PAINTING"),
   field_15167(-1, field_15175, "ABSTRACT_LIGHTNING"),
   field_15203(100, field_15167, "LIGHTNING_BOLT"),
   field_15257(-1, field_15175, "ABSTRACT_ARROW"),
   field_15296(2, field_15257, "ARROW"),
   field_15163(72, field_15257, "SPECTRAL_ARROW"),
   field_15258(83, field_15257, "TRIDENT"),
   field_15274(-1, field_15175, "ABSTRACT_FIREBALL"),
   field_15165(15, field_15274, "DRAGON_FIREBALL"),
   field_15229(37, field_15274, "FIREBALL"),
   field_15250(69, field_15274, "SMALL_FIREBALL"),
   field_15254(93, field_15274, "WITHER_SKULL"),
   field_15202(-1, field_15175, "PROJECTILE_ABSTRACT"),
   field_15231(71, field_15202, "SNOWBALL"),
   field_15198(80, field_15202, "ENDER_PEARL"),
   field_15194(79, field_15202, "EGG"),
   field_15182(82, field_15202, "POTION"),
   field_15204(81, field_15202, "EXPERIENCE_BOTTLE"),
   field_15223(-1, field_15175, "MINECART_ABSTRACT"),
   field_15284(-1, field_15223, "CHESTED_MINECART_ABSTRACT"),
   field_15212(43, field_15284, "CHEST_MINECART"),
   field_15261(46, field_15284, "HOPPER_MINECART"),
   field_15270(42, field_15223, "MINECART"),
   field_15253(45, field_15223, "FURNACE_MINECART"),
   field_15260(44, field_15223, "COMMAND_BLOCK_MINECART"),
   field_15228(48, field_15223, "TNT_MINECART"),
   field_15264(47, field_15223, "SPAWNER_MINECART"),
   field_15181(6, field_15175, "BOAT");

   private static final Map<Integer, class_3085> field_15193 = new HashMap<Integer, class_3085>();
   private final int field_15241;
   private final class_3085 field_15218;
   private String field_15174;

   private class_3085(int var3, String var4) {
      this.field_15241 = var3;
      this.field_15218 = null;
      this.field_15174 = var4;
   }

   private class_3085(int var3, class_3085 var4, String var5) {
      this.field_15241 = var3;
      this.field_15218 = var4;
      this.field_15174 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_15241;
   }

   public class_3085 method_14155() {
      return this.field_15218;
   }

   public static Optional<class_3085> method_14156(int var0) {
      return var0 != -1 ? Optional.<class_3085>ofNullable(field_15193.get(var0)) : Optional.<class_3085>empty();
   }

   @Override
   public String method_3419() {
      return this.field_15174;
   }

   static {
      for (class_3085 var9 : values()) {
         field_15193.put(var9.field_15241, var9);
      }
   }
}

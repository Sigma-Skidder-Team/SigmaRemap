package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_9880 implements class_754 {
   field_49950(-1, "ENTITY"),
   field_49977(0, field_49950, "AREA_EFFECT_CLOUD"),
   field_50058(18, field_49950, "END_CRYSTAL"),
   field_50044(23, field_49950, "EVOKER_FANGS"),
   field_50070(24, field_49950, "EXPERIENCE_ORB"),
   field_49990(25, field_49950, "EYE_OF_ENDER"),
   field_50008(26, field_49950, "FALLING_BLOCK"),
   field_50047(27, field_49950, "FIREWORK_ROCKET"),
   field_49998(37, field_49950, "ITEM"),
   field_49975(43, field_49950, "LLAMA_SPIT"),
   field_49968(64, field_49950, "TNT"),
   field_49956(71, field_49950, "SHULKER_BULLET"),
   field_50029(107, field_49950, "FISHING_BOBBER"),
   field_49967(-1, field_49950, "LIVINGENTITY"),
   field_50061(1, field_49967, "ARMOR_STAND"),
   field_49982(106, field_49967, "PLAYER"),
   field_49949(-1, field_49967, "ABSTRACT_INSENTIENT"),
   field_49959(19, field_49949, "ENDER_DRAGON"),
   field_49992(4, field_49949, "BEE"),
   field_49963(-1, field_49949, "ABSTRACT_CREATURE"),
   field_49957(-1, field_49963, "ABSTRACT_AGEABLE"),
   field_49953(93, field_49957, "VILLAGER"),
   field_50067(95, field_49957, "WANDERING_TRADER"),
   field_49996(-1, field_49957, "ABSTRACT_ANIMAL"),
   field_50025(13, field_49949, "DOLPHIN"),
   field_50007(9, field_49996, "CHICKEN"),
   field_50064(11, field_49996, "COW"),
   field_49942(53, field_50064, "MOOSHROOM"),
   field_49997(56, field_49949, "PANDA"),
   field_50033(59, field_49996, "PIG"),
   field_50056(63, field_49996, "POLAR_BEAR"),
   field_49994(66, field_49996, "RABBIT"),
   field_49989(69, field_49996, "SHEEP"),
   field_49973(91, field_49996, "TURTLE"),
   field_49993(28, field_49996, "FOX"),
   field_50001(-1, field_49996, "ABSTRACT_TAMEABLE_ANIMAL"),
   field_50028(7, field_50001, "CAT"),
   field_49958(54, field_50001, "OCELOT"),
   field_50019(100, field_50001, "WOLF"),
   field_50002(-1, field_50001, "ABSTRACT_PARROT"),
   field_49981(57, field_50002, "PARROT"),
   field_50031(-1, field_49996, "ABSTRACT_HORSE"),
   field_49961(-1, field_50031, "CHESTED_HORSE"),
   field_50023(14, field_49961, "DONKEY"),
   field_50076(52, field_49961, "MULE"),
   field_50081(42, field_49961, "LLAMA"),
   field_50080(89, field_49961, "TRADER_LLAMA"),
   field_50054(33, field_50031, "HORSE"),
   field_50082(74, field_50031, "SKELETON_HORSE"),
   field_49955(103, field_50031, "ZOMBIE_HORSE"),
   field_50005(-1, field_49963, "ABSTRACT_GOLEM"),
   field_50036(77, field_50005, "SNOW_GOLEM"),
   field_50004(36, field_50005, "IRON_GOLEM"),
   field_50066(70, field_50005, "SHULKER"),
   field_50072(-1, field_49963, "ABSTRACT_FISHES"),
   field_50079(10, field_50072, "COD"),
   field_50000(65, field_50072, "PUFFERFISH"),
   field_49965(68, field_50072, "SALMON"),
   field_49944(90, field_50072, "TROPICAL_FISH"),
   field_50078(-1, field_49963, "ABSTRACT_MONSTER"),
   field_50052(5, field_50078, "BLAZE"),
   field_50037(12, field_50078, "CREEPER"),
   field_49995(21, field_50078, "ENDERMITE"),
   field_49972(20, field_50078, "ENDERMAN"),
   field_49979(30, field_50078, "GIANT"),
   field_49987(72, field_50078, "SILVERFISH"),
   field_50012(92, field_50078, "VEX"),
   field_50055(96, field_50078, "WITCH"),
   field_49951(97, field_50078, "WITHER"),
   field_50021(67, field_50078, "RAVAGER"),
   field_50068(-1, field_50078, "ABSTRACT_PIGLIN"),
   field_49984(60, field_50068, "PIGLIN"),
   field_50009(61, field_50068, "PIGLIN_BRUTE"),
   field_50051(32, field_49996, "HOGLIN"),
   field_50020(83, field_49996, "STRIDER"),
   field_49954(101, field_50078, "ZOGLIN"),
   field_50032(-1, field_50078, "ABSTRACT_ILLAGER_BASE"),
   field_50073(-1, field_50032, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field_50030(22, field_50073, "EVOKER"),
   field_50060(35, field_50073, "ILLUSIONER"),
   field_50016(94, field_50032, "VINDICATOR"),
   field_50075(62, field_50032, "PILLAGER"),
   field_50063(-1, field_50078, "ABSTRACT_SKELETON"),
   field_50045(73, field_50063, "SKELETON"),
   field_49964(82, field_50063, "STRAY"),
   field_49947(98, field_50063, "WITHER_SKELETON"),
   field_50077(31, field_50078, "GUARDIAN"),
   field_50049(17, field_50077, "ELDER_GUARDIAN"),
   field_50059(80, field_50078, "SPIDER"),
   field_50027(8, field_50059, "CAVE_SPIDER"),
   field_50053(102, field_50078, "ZOMBIE"),
   field_49962(16, field_50053, "DROWNED"),
   field_50035(34, field_50053, "HUSK"),
   field_49991(105, field_50053, "ZOMBIFIED_PIGLIN"),
   field_50003(104, field_50053, "ZOMBIE_VILLAGER"),
   field_50071(-1, field_49949, "ABSTRACT_FLYING"),
   field_50038(29, field_50071, "GHAST"),
   field_50014(58, field_50071, "PHANTOM"),
   field_50018(-1, field_49949, "ABSTRACT_AMBIENT"),
   field_50042(3, field_50018, "BAT"),
   field_50069(-1, field_49949, "ABSTRACT_WATERMOB"),
   field_50013(81, field_50069, "SQUID"),
   field_49980(75, field_49949, "SLIME"),
   field_49976(44, field_49980, "MAGMA_CUBE"),
   field_50062(-1, field_49950, "ABSTRACT_HANGING"),
   field_50040(40, field_50062, "LEASH_KNOT"),
   field_49945(38, field_50062, "ITEM_FRAME"),
   field_49966(55, field_50062, "PAINTING"),
   field_49971(-1, field_49950, "ABSTRACT_LIGHTNING"),
   field_49986(41, field_49971, "LIGHTNING_BOLT"),
   field_49999(-1, field_49950, "ABSTRACT_ARROW"),
   field_50050(2, field_49999, "ARROW"),
   field_50041(79, field_49999, "SPECTRAL_ARROW"),
   field_50034(88, field_49999, "TRIDENT"),
   field_50048(-1, field_49950, "ABSTRACT_FIREBALL"),
   field_49943(15, field_50048, "DRAGON_FIREBALL"),
   field_49970(39, field_50048, "FIREBALL"),
   field_50057(76, field_50048, "SMALL_FIREBALL"),
   field_50017(99, field_50048, "WITHER_SKULL"),
   field_49988(-1, field_49950, "PROJECTILE_ABSTRACT"),
   field_50010(78, field_49988, "SNOWBALL"),
   field_50074(85, field_49988, "ENDER_PEARL"),
   field_50065(84, field_49988, "EGG"),
   field_50006(87, field_49988, "POTION"),
   field_49985(86, field_49988, "EXPERIENCE_BOTTLE"),
   field_50024(-1, field_49950, "MINECART_ABSTRACT"),
   field_50046(-1, field_50024, "CHESTED_MINECART_ABSTRACT"),
   field_49969(46, field_50046, "CHEST_MINECART"),
   field_49948(49, field_50046, "HOPPER_MINECART"),
   field_49960(45, field_50024, "MINECART"),
   field_50011(48, field_50024, "FURNACE_MINECART"),
   field_50039(47, field_50024, "COMMAND_BLOCK_MINECART"),
   field_50043(51, field_50024, "TNT_MINECART"),
   field_50022(50, field_50024, "SPAWNER_MINECART"),
   field_50026(6, field_49950, "BOAT");

   private static final Map<Integer, class_9880> field_49978 = new HashMap<Integer, class_9880>();
   private final int field_49974;
   private final class_9880 field_49983;
   private String field_49946;

   private class_9880(int var3, String var4) {
      this.field_49974 = var3;
      this.field_49983 = null;
      this.field_49946 = var4;
   }

   private class_9880(int var3, class_9880 var4, String var5) {
      this.field_49974 = var3;
      this.field_49983 = var4;
      this.field_49946 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_49974;
   }

   public class_9880 method_45524() {
      return this.field_49983;
   }

   public static Optional<class_9880> method_45526(int var0) {
      return var0 != -1 ? Optional.<class_9880>ofNullable(field_49978.get(var0)) : Optional.<class_9880>empty();
   }

   @Override
   public String method_3419() {
      return this.field_49946;
   }

   static {
      for (class_9880 var9 : values()) {
         field_49978.put(var9.field_49974, var9);
      }
   }
}

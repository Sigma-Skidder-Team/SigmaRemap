package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum class_4630 implements class_754 {
   field_22548(-1, "ENTITY"),
   field_22627(0, field_22548, "AREA_EFFECT_CLOUD"),
   field_22513(16, field_22548, "END_CRYSTAL"),
   field_22550(20, field_22548, "EVOKER_FANGS"),
   field_22565(22, field_22548, "EXPERIENCE_ORB"),
   field_22574(23, field_22548, "EYE_OF_ENDER"),
   field_22605(24, field_22548, "FALLING_BLOCK"),
   field_22570(25, field_22548, "FIREWORK_ROCKET"),
   field_22561(32, field_22548, "ITEM"),
   field_22539(37, field_22548, "LLAMA_SPIT"),
   field_22616(55, field_22548, "TNT"),
   field_22579(60, field_22548, "SHULKER_BULLET"),
   field_22618(93, field_22548, "FISHING_BOBBER"),
   field_22596(-1, field_22548, "LIVINGENTITY"),
   field_22559(1, field_22596, "ARMOR_STAND"),
   field_22626(92, field_22596, "PLAYER"),
   field_22564(-1, field_22596, "ABSTRACT_INSENTIENT"),
   field_22557(17, field_22564, "ENDER_DRAGON"),
   field_22619(-1, field_22564, "ABSTRACT_CREATURE"),
   field_22593(-1, field_22619, "ABSTRACT_AGEABLE"),
   field_22566(79, field_22593, "VILLAGER"),
   field_22537(-1, field_22593, "ABSTRACT_ANIMAL"),
   field_22562(7, field_22537, "CHICKEN"),
   field_22633(9, field_22537, "COW"),
   field_22533(47, field_22633, "MOOSHROOM"),
   field_22612(51, field_22537, "PIG"),
   field_22527(54, field_22537, "POLAR_BEAR"),
   field_22517(56, field_22537, "RABBIT"),
   field_22589(58, field_22537, "SHEEP"),
   field_22622(73, field_22537, "TURTLE"),
   field_22632(-1, field_22537, "ABSTRACT_TAMEABLE_ANIMAL"),
   field_22604(48, field_22632, "OCELOT"),
   field_22585(86, field_22632, "WOLF"),
   field_22577(-1, field_22632, "ABSTRACT_PARROT"),
   field_22629(50, field_22577, "PARROT"),
   field_22608(-1, field_22537, "ABSTRACT_HORSE"),
   field_22531(-1, field_22608, "CHESTED_HORSE"),
   field_22625(11, field_22531, "DONKEY"),
   field_22540(46, field_22531, "MULE"),
   field_22636(36, field_22531, "LLAMA"),
   field_22538(29, field_22608, "HORSE"),
   field_22628(63, field_22608, "SKELETON_HORSE"),
   field_22581(88, field_22608, "ZOMBIE_HORSE"),
   field_22578(-1, field_22619, "ABSTRACT_GOLEM"),
   field_22549(66, field_22578, "SNOW_GOLEM"),
   field_22598(80, field_22578, "IRON_GOLEM"),
   field_22594(59, field_22578, "SHULKER"),
   field_22613(-1, field_22619, "ABSTRACT_FISHES"),
   field_22523(8, field_22613, "COD"),
   field_22511(52, field_22613, "PUFFERFISH"),
   field_22597(57, field_22613, "SALMON"),
   field_22528(72, field_22613, "TROPICAL_FISH"),
   field_22637(-1, field_22619, "ABSTRACT_MONSTER"),
   field_22609(4, field_22637, "BLAZE"),
   field_22519(10, field_22637, "CREEPER"),
   field_22584(19, field_22637, "ENDERMITE"),
   field_22535(18, field_22637, "ENDERMAN"),
   field_22630(27, field_22637, "GIANT"),
   field_22590(61, field_22637, "SILVERFISH"),
   field_22558(78, field_22637, "VEX"),
   field_22520(82, field_22637, "WITCH"),
   field_22530(83, field_22637, "WITHER"),
   field_22620(-1, field_22637, "ABSTRACT_ILLAGER_BASE"),
   field_22532(-1, field_22620, "ABSTRACT_EVO_ILLU_ILLAGER"),
   field_22601(21, field_22532, "EVOKER"),
   field_22541(31, field_22532, "ILLUSIONER"),
   field_22545(81, field_22620, "VINDICATOR"),
   field_22555(-1, field_22637, "ABSTRACT_SKELETON"),
   field_22554(62, field_22555, "SKELETON"),
   field_22591(71, field_22555, "STRAY"),
   field_22631(84, field_22555, "WITHER_SKELETON"),
   field_22543(28, field_22637, "GUARDIAN"),
   field_22563(15, field_22543, "ELDER_GUARDIAN"),
   field_22524(69, field_22637, "SPIDER"),
   field_22600(6, field_22524, "CAVE_SPIDER"),
   field_22512(87, field_22637, "ZOMBIE"),
   field_22603(14, field_22512, "DROWNED"),
   field_22551(30, field_22512, "HUSK"),
   field_22516(53, field_22512, "ZOMBIE_PIGMAN"),
   field_22569(89, field_22512, "ZOMBIE_VILLAGER"),
   field_22634(-1, field_22564, "ABSTRACT_FLYING"),
   field_22599(26, field_22634, "GHAST"),
   field_22553(90, field_22634, "PHANTOM"),
   field_22576(-1, field_22564, "ABSTRACT_AMBIENT"),
   field_22595(3, field_22576, "BAT"),
   field_22614(-1, field_22564, "ABSTRACT_WATERMOB"),
   field_22623(70, field_22614, "SQUID"),
   field_22602(12, field_22614, "DOLPHIN"),
   field_22536(64, field_22564, "SLIME"),
   field_22573(38, field_22536, "MAGMA_CUBE"),
   field_22560(-1, field_22548, "ABSTRACT_HANGING"),
   field_22588(35, field_22560, "LEASH_KNOT"),
   field_22552(33, field_22560, "ITEM_FRAME"),
   field_22580(49, field_22560, "PAINTING"),
   field_22546(-1, field_22548, "ABSTRACT_LIGHTNING"),
   field_22611(91, field_22546, "LIGHTNING_BOLT"),
   field_22544(-1, field_22548, "ABSTRACT_ARROW"),
   field_22615(2, field_22544, "ARROW"),
   field_22547(68, field_22544, "SPECTRAL_ARROW"),
   field_22586(94, field_22544, "TRIDENT"),
   field_22572(-1, field_22548, "ABSTRACT_FIREBALL"),
   field_22521(13, field_22572, "DRAGON_FIREBALL"),
   field_22571(34, field_22572, "FIREBALL"),
   field_22518(65, field_22572, "SMALL_FIREBALL"),
   field_22582(85, field_22572, "WITHER_SKULL"),
   field_22610(-1, field_22548, "PROJECTILE_ABSTRACT"),
   field_22529(67, field_22610, "SNOWBALL"),
   field_22567(75, field_22610, "ENDER_PEARL"),
   field_22635(74, field_22610, "EGG"),
   field_22606(77, field_22610, "POTION"),
   field_22592(76, field_22610, "EXPERIENCE_BOTTLE"),
   field_22621(-1, field_22548, "MINECART_ABSTRACT"),
   field_22583(-1, field_22621, "CHESTED_MINECART_ABSTRACT"),
   field_22607(40, field_22583, "CHEST_MINECART"),
   field_22515(43, field_22583, "HOPPER_MINECART"),
   field_22514(39, field_22621, "MINECART"),
   field_22526(42, field_22621, "FURNACE_MINECART"),
   field_22542(41, field_22621, "COMMAND_BLOCK_MINECART"),
   field_22522(45, field_22621, "TNT_MINECART"),
   field_22575(44, field_22621, "SPAWNER_MINECART"),
   field_22534(5, field_22548, "BOAT");

   private static final Map<Integer, class_4630> field_22568 = new HashMap<Integer, class_4630>();
   private final int field_22525;
   private final class_4630 field_22587;
   private String field_22624;

   private class_4630(int var3, String var4) {
      this.field_22525 = var3;
      this.field_22587 = null;
      this.field_22624 = var4;
   }

   private class_4630(int var3, class_4630 var4, String var5) {
      this.field_22525 = var3;
      this.field_22587 = var4;
      this.field_22624 = var5;
   }

   @Override
   public int method_3416() {
      return this.field_22525;
   }

   public class_4630 method_21425() {
      return this.field_22587;
   }

   public static Optional<class_4630> method_21424(int var0) {
      return var0 != -1 ? Optional.<class_4630>ofNullable(field_22568.get(var0)) : Optional.<class_4630>empty();
   }

   @Override
   public String method_3419() {
      return this.field_22624;
   }

   static {
      for (class_4630 var9 : values()) {
         field_22568.put(var9.field_22525, var9);
      }
   }
}

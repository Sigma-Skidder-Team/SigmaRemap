package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1872 implements Class1867 {
   field10655(-1, "ENTITY"),
   field10656(1, field10655, "DROPPED_ITEM"),
   field10657(2, field10655, "EXPERIENCE_ORB"),
   field10658(8, field10655, "LEASH_HITCH"),
   field10659(9, field10655, "PAINTING"),
   field10660(10, field10655, "ARROW"),
   field10661(11, field10655, "SNOWBALL"),
   field10662(12, field10655, "FIREBALL"),
   field10663(13, field10655, "SMALL_FIREBALL"),
   field10664(14, field10655, "ENDER_PEARL"),
   field10665(15, field10655, "ENDER_SIGNAL"),
   field10666(17, field10655, "THROWN_EXP_BOTTLE"),
   field10667(18, field10655, "ITEM_FRAME"),
   field10668(19, field10655, "WITHER_SKULL"),
   field10669(20, field10655, "PRIMED_TNT"),
   field10670(21, field10655, "FALLING_BLOCK"),
   field10671(22, field10655, "FIREWORK"),
   field10672(23, field10660, "TIPPED_ARROW"),
   field10673(24, field10660, "SPECTRAL_ARROW"),
   field10674(25, field10655, "SHULKER_BULLET"),
   field10675(26, field10662, "DRAGON_FIREBALL"),
   field10676(-1, field10655, "ENTITY_LIVING"),
   field10677(-1, field10676, "ENTITY_INSENTIENT"),
   field10678(-1, field10677, "ENTITY_AGEABLE"),
   field10679(-1, field10678, "ENTITY_TAMEABLE_ANIMAL"),
   field10680(-1, field10676, "ENTITY_HUMAN"),
   field10681(30, field10676, "ARMOR_STAND"),
   field10682(-1, field10655, "MINECART_ABSTRACT"),
   field10683(40, field10682, "MINECART_COMMAND"),
   field10684(41, field10655, "BOAT"),
   field10685(42, field10682, "MINECART_RIDEABLE"),
   field10686(43, field10682, "MINECART_CHEST"),
   field10687(44, field10682, "MINECART_FURNACE"),
   field10688(45, field10682, "MINECART_TNT"),
   field10689(46, field10682, "MINECART_HOPPER"),
   field10690(47, field10682, "MINECART_MOB_SPAWNER"),
   field10691(50, field10677, "CREEPER"),
   field10692(51, field10677, "SKELETON"),
   field10693(52, field10677, "SPIDER"),
   field10694(53, field10677, "GIANT"),
   field10695(54, field10677, "ZOMBIE"),
   field10696(55, field10677, "SLIME"),
   field10697(56, field10677, "GHAST"),
   field10698(57, field10695, "PIG_ZOMBIE"),
   field10699(58, field10677, "ENDERMAN"),
   field10700(59, field10693, "CAVE_SPIDER"),
   field10701(60, field10677, "SILVERFISH"),
   field10702(61, field10677, "BLAZE"),
   field10703(62, field10696, "MAGMA_CUBE"),
   field10704(63, field10677, "ENDER_DRAGON"),
   field10705(64, field10677, "WITHER"),
   field10706(65, field10677, "BAT"),
   field10707(66, field10677, "WITCH"),
   field10708(67, field10677, "ENDERMITE"),
   field10709(68, field10677, "GUARDIAN"),
   field10710(99, field10677, "IRON_GOLEM"),
   field10711(69, field10710, "SHULKER"),
   field10712(90, field10678, "PIG"),
   field10713(91, field10678, "SHEEP"),
   field10714(92, field10678, "COW"),
   field10715(93, field10678, "CHICKEN"),
   field10716(94, field10677, "SQUID"),
   field10717(95, field10679, "WOLF"),
   field10718(96, field10714, "MUSHROOM_COW"),
   field10719(97, field10710, "SNOWMAN"),
   field10720(98, field10679, "OCELOT"),
   field10721(100, field10678, "HORSE"),
   field10722(101, field10678, "RABBIT"),
   field10723(102, field10678, "POLAR_BEAR"),
   field10724(120, field10678, "VILLAGER"),
   field10725(200, field10655, "ENDER_CRYSTAL"),
   field10726(-1, field10655, "SPLASH_POTION"),
   field10727(-1, field10726, "LINGERING_POTION"),
   field10728(-1, field10655, "AREA_EFFECT_CLOUD"),
   field10729(-1, field10655, "EGG"),
   field10730(-1, field10655, "FISHING_HOOK"),
   field10731(-1, field10655, "LIGHTNING"),
   field10732(-1, field10655, "WEATHER"),
   field10733(-1, field10680, "PLAYER"),
   field10734(-1, field10655, "COMPLEX_PART");

   private static final Map<Integer, Class1872> field10735 = new HashMap<Integer, Class1872>();
   private final int field10736;
   private final Class1872 field10737;
   private String field10738;
   private static final Class1872[] field10739 = new Class1872[]{
      field10655,
      field10656,
      field10657,
      field10658,
      field10659,
      field10660,
      field10661,
      field10662,
      field10663,
      field10664,
      field10665,
      field10666,
      field10667,
      field10668,
      field10669,
      field10670,
      field10671,
      field10672,
      field10673,
      field10674,
      field10675,
      field10676,
      field10677,
      field10678,
      field10679,
      field10680,
      field10681,
      field10682,
      field10683,
      field10684,
      field10685,
      field10686,
      field10687,
      field10688,
      field10689,
      field10690,
      field10691,
      field10692,
      field10693,
      field10694,
      field10695,
      field10696,
      field10697,
      field10698,
      field10699,
      field10700,
      field10701,
      field10702,
      field10703,
      field10704,
      field10705,
      field10706,
      field10707,
      field10708,
      field10709,
      field10710,
      field10711,
      field10712,
      field10713,
      field10714,
      field10715,
      field10716,
      field10717,
      field10718,
      field10719,
      field10720,
      field10721,
      field10722,
      field10723,
      field10724,
      field10725,
      field10726,
      field10727,
      field10728,
      field10729,
      field10730,
      field10731,
      field10732,
      field10733,
      field10734
   };

   private Class1872(int var3, String var4) {
      this.field10736 = var3;
      this.field10737 = null;
      this.field10738 = var4;
   }

   private Class1872(int var3, Class1872 var4, String var5) {
      this.field10736 = var3;
      this.field10737 = var4;
      this.field10738 = var5;
   }

   public static Optional<Class1872> method8133(int var0) {
      return var0 != -1 ? Optional.<Class1872>ofNullable(field10735.get(var0)) : Optional.<Class1872>empty();
   }

   @Override
   public int method8121() {
      return this.field10736;
   }

   public Class1872 method8125() {
      return this.field10737;
   }

   @Override
   public String method8124() {
      return this.field10738;
   }

   static {
      for (Class1872 var9 : values()) {
         field10735.put(var9.field10736, var9);
      }
   }
}

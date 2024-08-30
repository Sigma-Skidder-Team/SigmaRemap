package mapped;

public class Class8137 {
   public static final Class8812 field34976 = method28212("empty", new Class8812());
   public static final Class8812 field34977 = method28212("water", new Class8812());
   public static final Class8812 field34978 = method28212("mundane", new Class8812());
   public static final Class8812 field34979 = method28212("thick", new Class8812());
   public static final Class8812 field34980 = method28212("awkward", new Class8812());
   public static final Class8812 field34981 = method28212("night_vision", new Class8812(new Class2023(Effects.NIGHT_VISION, 3600)));
   public static final Class8812 field34982 = method28212("long_night_vision", new Class8812("night_vision", new Class2023(Effects.NIGHT_VISION, 9600)));
   public static final Class8812 field34983 = method28212("invisibility", new Class8812(new Class2023(Effects.INVISIBILITY, 3600)));
   public static final Class8812 field34984 = method28212("long_invisibility", new Class8812("invisibility", new Class2023(Effects.INVISIBILITY, 9600)));
   public static final Class8812 field34985 = method28212("leaping", new Class8812(new Class2023(Effects.JUMP_BOOST, 3600)));
   public static final Class8812 field34986 = method28212("long_leaping", new Class8812("leaping", new Class2023(Effects.JUMP_BOOST, 9600)));
   public static final Class8812 field34987 = method28212("strong_leaping", new Class8812("leaping", new Class2023(Effects.JUMP_BOOST, 1800, 1)));
   public static final Class8812 field34988 = method28212("fire_resistance", new Class8812(new Class2023(Effects.FIRE_RESISTANCE, 3600)));
   public static final Class8812 field34989 = method28212("long_fire_resistance", new Class8812("fire_resistance", new Class2023(Effects.FIRE_RESISTANCE, 9600)));
   public static final Class8812 field34990 = method28212("swiftness", new Class8812(new Class2023(Effects.SPEED, 3600)));
   public static final Class8812 field34991 = method28212("long_swiftness", new Class8812("swiftness", new Class2023(Effects.SPEED, 9600)));
   public static final Class8812 field34992 = method28212("strong_swiftness", new Class8812("swiftness", new Class2023(Effects.SPEED, 1800, 1)));
   public static final Class8812 field34993 = method28212("slowness", new Class8812(new Class2023(Effects.SLOWNESS, 1800)));
   public static final Class8812 field34994 = method28212("long_slowness", new Class8812("slowness", new Class2023(Effects.SLOWNESS, 4800)));
   public static final Class8812 field34995 = method28212("strong_slowness", new Class8812("slowness", new Class2023(Effects.SLOWNESS, 400, 3)));
   public static final Class8812 field34996 = method28212(
      "turtle_master", new Class8812("turtle_master", new Class2023(Effects.SLOWNESS, 400, 3), new Class2023(Effects.RESISTANCE, 400, 2))
   );
   public static final Class8812 field34997 = method28212(
      "long_turtle_master", new Class8812("turtle_master", new Class2023(Effects.SLOWNESS, 800, 3), new Class2023(Effects.RESISTANCE, 800, 2))
   );
   public static final Class8812 field34998 = method28212(
      "strong_turtle_master", new Class8812("turtle_master", new Class2023(Effects.SLOWNESS, 400, 5), new Class2023(Effects.RESISTANCE, 400, 3))
   );
   public static final Class8812 field34999 = method28212("water_breathing", new Class8812(new Class2023(Effects.WATER_BREATHING, 3600)));
   public static final Class8812 field35000 = method28212("long_water_breathing", new Class8812("water_breathing", new Class2023(Effects.WATER_BREATHING, 9600)));
   public static final Class8812 field35001 = method28212("healing", new Class8812(new Class2023(Effects.INSTANT_HEALTH, 1)));
   public static final Class8812 field35002 = method28212("strong_healing", new Class8812("healing", new Class2023(Effects.INSTANT_HEALTH, 1, 1)));
   public static final Class8812 field35003 = method28212("harming", new Class8812(new Class2023(Effects.INSTANT_DAMAGE, 1)));
   public static final Class8812 field35004 = method28212("strong_harming", new Class8812("harming", new Class2023(Effects.INSTANT_DAMAGE, 1, 1)));
   public static final Class8812 field35005 = method28212("poison", new Class8812(new Class2023(Effects.POISON, 900)));
   public static final Class8812 field35006 = method28212("long_poison", new Class8812("poison", new Class2023(Effects.POISON, 1800)));
   public static final Class8812 field35007 = method28212("strong_poison", new Class8812("poison", new Class2023(Effects.POISON, 432, 1)));
   public static final Class8812 field35008 = method28212("regeneration", new Class8812(new Class2023(Effects.REGENERATION, 900)));
   public static final Class8812 field35009 = method28212("long_regeneration", new Class8812("regeneration", new Class2023(Effects.REGENERATION, 1800)));
   public static final Class8812 field35010 = method28212("strong_regeneration", new Class8812("regeneration", new Class2023(Effects.REGENERATION, 450, 1)));
   public static final Class8812 field35011 = method28212("strength", new Class8812(new Class2023(Effects.STRENGTH, 3600)));
   public static final Class8812 field35012 = method28212("long_strength", new Class8812("strength", new Class2023(Effects.STRENGTH, 9600)));
   public static final Class8812 field35013 = method28212("strong_strength", new Class8812("strength", new Class2023(Effects.STRENGTH, 1800, 1)));
   public static final Class8812 field35014 = method28212("weakness", new Class8812(new Class2023(Effects.WEAKNESS, 1800)));
   public static final Class8812 field35015 = method28212("long_weakness", new Class8812("weakness", new Class2023(Effects.WEAKNESS, 4800)));
   public static final Class8812 field35016 = method28212("luck", new Class8812("luck", new Class2023(Effects.LUCK, 6000)));
   public static final Class8812 field35017 = method28212("slow_falling", new Class8812(new Class2023(Effects.SLOW_FALLING, 1800)));
   public static final Class8812 field35018 = method28212("long_slow_falling", new Class8812("slow_falling", new Class2023(Effects.SLOW_FALLING, 4800)));

   private static Class8812 method28212(String var0, Class8812 var1) {
      return Registry.<Class8812>method9194(Registry.field16076, var0, var1);
   }
}

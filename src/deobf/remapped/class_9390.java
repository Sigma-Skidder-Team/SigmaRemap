package remapped;

public class class_9390 {
   private static final class_857 field_47990 = var0 -> {
      int var3 = var0.<Integer>method_23242(class_8039.field_41179);
      String var4x;
      switch (var3) {
         case -1:
            var4x = "minecraft:the_nether";
            break;
         case 0:
            var4x = "minecraft:overworld";
            break;
         case 1:
            var4x = "minecraft:the_end";
            break;
         default:
            class_3446.method_15886().method_34617().warning("Invalid dimension id: " + var3);
            var4x = "minecraft:overworld";
      }

      var0.method_23236(class_8039.field_41171, var4x);
      var0.method_23236(class_8039.field_41171, var4x);
   };
   public static final class_5531 field_47988 = new class_5531(field_47991[0]);
   private static final String[] field_47989 = new String[]{field_47991[2], field_47991[19], field_47991[21]};

   private static class_5531 method_43438() {
      class_5531 var2 = new class_5531("");
      var2.<class_887>method_25122(new class_887("name", "minecraft:overworld"));
      var2.<class_1456>method_25122(new class_1456("has_ceiling", (byte)0));
      method_43442(var2);
      return var2;
   }

   private static class_5531 method_43444() {
      class_5531 var2 = new class_5531("");
      var2.<class_887>method_25122(new class_887("name", "minecraft:overworld_caves"));
      var2.<class_1456>method_25122(new class_1456("has_ceiling", (byte)1));
      method_43442(var2);
      return var2;
   }

   private static void method_43442(class_5531 var0) {
      var0.<class_1456>method_25122(new class_1456("piglin_safe", (byte)0));
      var0.<class_1456>method_25122(new class_1456("natural", (byte)1));
      var0.<class_520>method_25122(new class_520("ambient_light", 0.0F));
      var0.<class_887>method_25122(new class_887("infiniburn", "minecraft:infiniburn_overworld"));
      var0.<class_1456>method_25122(new class_1456("respawn_anchor_works", (byte)0));
      var0.<class_1456>method_25122(new class_1456("has_skylight", (byte)1));
      var0.<class_1456>method_25122(new class_1456("bed_works", (byte)1));
      var0.<class_1456>method_25122(new class_1456("has_raids", (byte)1));
      var0.<class_5232>method_25122(new class_5232("logical_height", 256));
      var0.<class_1456>method_25122(new class_1456("shrunk", (byte)0));
      var0.<class_1456>method_25122(new class_1456("ultrawarm", (byte)0));
   }

   private static class_5531 method_43437() {
      class_5531 var2 = new class_5531("");
      var2.<class_1456>method_25122(new class_1456("piglin_safe", (byte)1));
      var2.<class_1456>method_25122(new class_1456("natural", (byte)0));
      var2.<class_520>method_25122(new class_520("ambient_light", 0.1F));
      var2.<class_887>method_25122(new class_887("infiniburn", "minecraft:infiniburn_nether"));
      var2.<class_1456>method_25122(new class_1456("respawn_anchor_works", (byte)1));
      var2.<class_1456>method_25122(new class_1456("has_skylight", (byte)0));
      var2.<class_1456>method_25122(new class_1456("bed_works", (byte)0));
      var2.<class_8735>method_25122(new class_8735("fixed_time", 18000L));
      var2.<class_1456>method_25122(new class_1456("has_raids", (byte)0));
      var2.<class_887>method_25122(new class_887("name", "minecraft:the_nether"));
      var2.<class_5232>method_25122(new class_5232("logical_height", 128));
      var2.<class_1456>method_25122(new class_1456("shrunk", (byte)1));
      var2.<class_1456>method_25122(new class_1456("ultrawarm", (byte)1));
      var2.<class_1456>method_25122(new class_1456("has_ceiling", (byte)1));
      return var2;
   }

   private static class_5531 method_43441() {
      class_5531 var2 = new class_5531("");
      var2.<class_1456>method_25122(new class_1456("piglin_safe", (byte)0));
      var2.<class_1456>method_25122(new class_1456("natural", (byte)0));
      var2.<class_520>method_25122(new class_520("ambient_light", 0.0F));
      var2.<class_887>method_25122(new class_887("infiniburn", "minecraft:infiniburn_end"));
      var2.<class_1456>method_25122(new class_1456("respawn_anchor_works", (byte)0));
      var2.<class_1456>method_25122(new class_1456("has_skylight", (byte)0));
      var2.<class_1456>method_25122(new class_1456("bed_works", (byte)0));
      var2.<class_8735>method_25122(new class_8735("fixed_time", 6000L));
      var2.<class_1456>method_25122(new class_1456("has_raids", (byte)1));
      var2.<class_887>method_25122(new class_887("name", "minecraft:the_end"));
      var2.<class_5232>method_25122(new class_5232("logical_height", 256));
      var2.<class_1456>method_25122(new class_1456("shrunk", (byte)0));
      var2.<class_1456>method_25122(new class_1456("ultrawarm", (byte)0));
      var2.<class_1456>method_25122(new class_1456("has_ceiling", (byte)0));
      return var2;
   }

   public static void method_43439(class_757 var0) {
      class_6732 var3 = var0.<class_6732>method_18997(class_6732.class);
      var0.method_19014(class_2786.field_13662, class_3680.field_18020, new class_9536());
      var3.method_33121(class_2786.field_13594, class_8221.field_42082);
      var3.method_33124(class_2786.field_13618);
      var3.method_33125(class_2786.field_13602, class_8221.field_42152);
      var3.method_33128(class_2786.field_13656, class_7498.field_38252);
      var3.method_33112(class_2786.field_13676);
      var0.method_19015(class_2786.field_13629, new class_7477());
      var0.method_19015(class_2786.field_13600, new class_7014());
      var0.method_19015(class_2786.field_13671, new class_1178(var0));
      var0.method_18992(class_4805.field_24011, new class_5462());
   }

   static {
      class_913 var4 = new class_913("dimension", class_5531.class);
      var4.method_3919(method_43438());
      var4.method_3919(method_43444());
      var4.method_3919(method_43437());
      var4.method_3919(method_43441());
      field_47988.<class_913>method_25122(var4);
   }
}

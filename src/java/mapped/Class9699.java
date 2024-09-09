package mapped;

public class Class9699 {
   private static final Class2982 field45342 = var0 -> {
      int var3 = var0.<Integer>method30559(Class4750.field22526);
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
            ViaVersion3.method27613().method27366().warning("Invalid dimension id: " + var3);
            var4x = "minecraft:overworld";
      }

      var0.method30560(Class4750.field22539, var4x);
      var0.method30560(Class4750.field22539, var4x);
   };
   public static final Class72 field45343 = new Class72("");
   private static final String[] field45344 = {"minecraft:overworld", "minecraft:the_nether", "minecraft:the_end"};

   private static Class72 method37999() {
      Class72 var2 = new Class72("");
      var2.<Class71>method236(new Class71("name", "minecraft:overworld"));
      var2.<Class69>method236(new Class69("has_ceiling", (byte)0));
      method38001(var2);
      return var2;
   }

   private static Class72 method38000() {
      Class72 var2 = new Class72("");
      var2.<Class71>method236(new Class71("name", "minecraft:overworld_caves"));
      var2.<Class69>method236(new Class69("has_ceiling", (byte)1));
      method38001(var2);
      return var2;
   }

   private static void method38001(Class72 var0) {
      var0.<Class69>method236(new Class69("piglin_safe", (byte)0));
      var0.<Class69>method236(new Class69("natural", (byte)1));
      var0.<Class70>method236(new Class70("ambient_light", 0.0F));
      var0.<Class71>method236(new Class71("infiniburn", "minecraft:infiniburn_overworld"));
      var0.<Class69>method236(new Class69("respawn_anchor_works", (byte)0));
      var0.<Class69>method236(new Class69("has_skylight", (byte)1));
      var0.<Class69>method236(new Class69("bed_works", (byte)1));
      var0.<Class69>method236(new Class69("has_raids", (byte)1));
      var0.<Class66>method236(new Class66("logical_height", 256));
      var0.<Class69>method236(new Class69("shrunk", (byte)0));
      var0.<Class69>method236(new Class69("ultrawarm", (byte)0));
   }

   private static Class72 method38002() {
      Class72 var2 = new Class72("");
      var2.<Class69>method236(new Class69("piglin_safe", (byte)1));
      var2.<Class69>method236(new Class69("natural", (byte)0));
      var2.<Class70>method236(new Class70("ambient_light", 0.1F));
      var2.<Class71>method236(new Class71("infiniburn", "minecraft:infiniburn_nether"));
      var2.<Class69>method236(new Class69("respawn_anchor_works", (byte)1));
      var2.<Class69>method236(new Class69("has_skylight", (byte)0));
      var2.<Class69>method236(new Class69("bed_works", (byte)0));
      var2.<Class75>method236(new Class75("fixed_time", 18000L));
      var2.<Class69>method236(new Class69("has_raids", (byte)0));
      var2.<Class71>method236(new Class71("name", "minecraft:the_nether"));
      var2.<Class66>method236(new Class66("logical_height", 128));
      var2.<Class69>method236(new Class69("shrunk", (byte)1));
      var2.<Class69>method236(new Class69("ultrawarm", (byte)1));
      var2.<Class69>method236(new Class69("has_ceiling", (byte)1));
      return var2;
   }

   private static Class72 method38003() {
      Class72 var2 = new Class72("");
      var2.<Class69>method236(new Class69("piglin_safe", (byte)0));
      var2.<Class69>method236(new Class69("natural", (byte)0));
      var2.<Class70>method236(new Class70("ambient_light", 0.0F));
      var2.<Class71>method236(new Class71("infiniburn", "minecraft:infiniburn_end"));
      var2.<Class69>method236(new Class69("respawn_anchor_works", (byte)0));
      var2.<Class69>method236(new Class69("has_skylight", (byte)0));
      var2.<Class69>method236(new Class69("bed_works", (byte)0));
      var2.<Class75>method236(new Class75("fixed_time", 6000L));
      var2.<Class69>method236(new Class69("has_raids", (byte)1));
      var2.<Class71>method236(new Class71("name", "minecraft:the_end"));
      var2.<Class66>method236(new Class66("logical_height", 256));
      var2.<Class69>method236(new Class69("shrunk", (byte)0));
      var2.<Class69>method236(new Class69("ultrawarm", (byte)0));
      var2.<Class69>method236(new Class69("has_ceiling", (byte)0));
      return var2;
   }

   public static void method38004(Class6356 var0) {
      Class6911 var3 = var0.<Class6911>method19373(Class6911.class);
      var0.method19361(Class1916.field11535, Class1917.field11628, new Class3974());
      var3.method21093(Class1916.field11533, Class1869.field10284);
      var3.method21092(Class1916.field11536);
      var3.method21094(Class1916.field11538, Class1869.field10293);
      var3.method21097(Class1916.field11601, Class9218.field42416);
      var3.method21095(Class1916.field11589);
      var0.method19360(Class1916.field11592, new Class3993());
      var0.method19360(Class1916.field11571, new Class3794());
      var0.method19360(Class1916.field11622, new Class4038(var0));
      var0.method19364(Class1926.field11997, new Class3935());
   }

   // $VF: synthetic method
   public static Class2982 method38006() {
      return field45342;
   }

   // $VF: synthetic method
   public static String[] method38007() {
      return field45344;
   }

   static {
      Class60 var4 = new Class60("dimension", Class72.class);
      var4.method199(method37999());
      var4.method199(method38000());
      var4.method199(method38002());
      var4.method199(method38003());
      field45343.<Class60>method236(var4);
   }
}

package mapped;

import net.minecraft.util.registry.Registry;

public class Class9078 {
   public static final Class9078 field41530 = method33824("kebab", 16, 16);
   public static final Class9078 field41531 = method33824("aztec", 16, 16);
   public static final Class9078 field41532 = method33824("alban", 16, 16);
   public static final Class9078 field41533 = method33824("aztec2", 16, 16);
   public static final Class9078 field41534 = method33824("bomb", 16, 16);
   public static final Class9078 field41535 = method33824("plant", 16, 16);
   public static final Class9078 field41536 = method33824("wasteland", 16, 16);
   public static final Class9078 field41537 = method33824("pool", 32, 16);
   public static final Class9078 field41538 = method33824("courbet", 32, 16);
   public static final Class9078 field41539 = method33824("sea", 32, 16);
   public static final Class9078 field41540 = method33824("sunset", 32, 16);
   public static final Class9078 field41541 = method33824("creebet", 32, 16);
   public static final Class9078 field41542 = method33824("wanderer", 16, 32);
   public static final Class9078 field41543 = method33824("graham", 16, 32);
   public static final Class9078 field41544 = method33824("match", 32, 32);
   public static final Class9078 field41545 = method33824("bust", 32, 32);
   public static final Class9078 field41546 = method33824("stage", 32, 32);
   public static final Class9078 field41547 = method33824("void", 32, 32);
   public static final Class9078 field41548 = method33824("skull_and_roses", 32, 32);
   public static final Class9078 field41549 = method33824("wither", 32, 32);
   public static final Class9078 field41550 = method33824("fighters", 64, 32);
   public static final Class9078 field41551 = method33824("pointer", 64, 64);
   public static final Class9078 field41552 = method33824("pigscene", 64, 64);
   public static final Class9078 field41553 = method33824("burning_skull", 64, 64);
   public static final Class9078 field41554 = method33824("skeleton", 64, 48);
   public static final Class9078 field41555 = method33824("donkey_kong", 64, 48);
   private final int field41556;
   private final int field41557;

   private static Class9078 method33824(String var0, int var1, int var2) {
      return Registry.<Class9078>register(Registry.field16079, var0, new Class9078(var1, var2));
   }

   public Class9078(int var1, int var2) {
      this.field41556 = var1;
      this.field41557 = var2;
   }

   public int method33825() {
      return this.field41556;
   }

   public int method33826() {
      return this.field41557;
   }
}

package mapped;

import java.util.Arrays;
import java.util.Comparator;

public enum Class2207 {
   field14425(0, "options.off"),
   field14426(1, "options.attack.crosshair"),
   field14427(2, "options.attack.hotbar");

   private static final Class2207[] field14428 = Arrays.<Class2207>stream(values())
      .sorted(Comparator.comparingInt(Class2207::method8922))
      .<Class2207>toArray(Class2207[]::new);
   private final int field14429;
   private final String field14430;
   private static final Class2207[] field14431 = new Class2207[]{field14425, field14426, field14427};

   private Class2207(int var3, String var4) {
      this.field14429 = var3;
      this.field14430 = var4;
   }

   public int method8922() {
      return this.field14429;
   }

   public String method8923() {
      return this.field14430;
   }

   public static Class2207 method8924(int var0) {
      return field14428[Class9679.method37788(var0, field14428.length)];
   }
}

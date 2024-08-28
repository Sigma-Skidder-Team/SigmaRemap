package mapped;

import java.util.Arrays;
import java.util.Optional;

public enum Class92 implements Class83 {
   field237("rollable"),
   field238("aligned");

   private final String field239;
   private static final Class92[] field240 = new Class92[]{field237, field238};

   private Class92(String var3) {
      this.field239 = var3;
   }

   @Override
   public String method257() {
      return this.field239;
   }

   public static Optional<Class92> method269(String var0) {
      return Arrays.<Class92>stream(values()).filter(var1 -> var1.method257().equals(var0)).findFirst();
   }
}

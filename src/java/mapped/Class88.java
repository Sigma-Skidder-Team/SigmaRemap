package mapped;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class88 implements Class83 {
   field230("none") {
      @Override
      public int method265(double d, double d2, int n) {
         return n;
      }
   },
   field231("dark_forest") {
      @Override
      public int method265(double d, double d2, int n) {
         return (n & 0xFEFEFE) + 2634762 >> 1;
      }
   },
   field232("swamp") {
      @Override
      public int method265(double d, double d2, int n) {
         double d3 = Class8907.field40314.method25315(d * 0.0225, d2 * 0.0225, false);
         return !(d3 < -0.1) ? 6975545 : 5011004;
      }
   };

   private final String field233;
   public static final Codec<Class88> field234 = Class83.<Class88>method258(Class88::values, Class88::method267);
   private static final Map<String, Class88> field235 = Arrays.<Class88>stream(values()).collect(Collectors.toMap(Class88::method266, var0 -> (Class88)var0));
   private static final Class88[] field236 = new Class88[]{field230, field231, field232};

   public abstract int method265(double var1, double var3, int var5);

   private Class88(String var3) {
      this.field233 = var3;
   }

   public String method266() {
      return this.field233;
   }

   @Override
   public String method257() {
      return this.field233;
   }

   public static Class88 method267(String var0) {
      return field235.get(var0);
   }
}

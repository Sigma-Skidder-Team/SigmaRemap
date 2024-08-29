package mapped;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class93 implements Class83 {
   field241("none") {
      @Override
      public float method271(BlockPos var1, float var2) {
         return var2;
      }
   },

   field242("frozen") {
      @Override
      public float method271(BlockPos class1999, float f) {
         double d;
         double d2 = Biome.method32549().method25315((double)class1999.getX() * 0.05, (double)class1999.getZ() * 0.05, false) * 7.0;
         double d3 = d2 + (d = Biome.field40314.method25315((double)class1999.getX() * 0.2, (double)class1999.getZ() * 0.2, false));
         if (!(d3 < 0.3)) {
            return f;
         }
         double d4 = Biome.field40314.method25315((double)class1999.getX() * 0.09, (double)class1999.getZ() * 0.09, false);
         if (d4 < 0.8) return 0.2f;
         return f;
      }
   };

   private final String field243;
   public static final Codec<Class93> field244 = Class83.<Class93>method258(Class93::values, Class93::method273);
   private static final Map<String, Class93> field245 = Arrays.<Class93>stream(values()).collect(Collectors.toMap(Class93::method272, var0 -> (Class93)var0));
   private static final Class93[] field246 = new Class93[]{field241, field242};

   public abstract float method271(BlockPos var1, float var2);

   private Class93(String var3) {
      this.field243 = var3;
   }

   public String method272() {
      return this.field243;
   }

   @Override
   public String method257() {
      return this.field243;
   }

   public static Class93 method273(String var0) {
      return field245.get(var0);
   }
}

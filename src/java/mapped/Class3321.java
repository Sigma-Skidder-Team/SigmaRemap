package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3321 extends Class3257 {
   private static String[] field18829;
   private static final Map<Class112, Class3321> field18830 = Maps.newEnumMap(Class112.class);
   private final Class112 field18831;

   public Class3321(Class112 var1, Class5643 var2) {
      super(var2);
      this.field18831 = var1;
      field18830.put(var1, this);
   }

   @Override
   public Class2274 method11716(Class8848 var1, PlayerEntity var2, Class880 var3, Class79 var4) {
      if (var3 instanceof Class1019) {
         Class1019 var7 = (Class1019)var3;
         if (var7.method3066() && !var7.method4519() && var7.method4517() != this.field18831) {
            if (!var2.field5024.field9020) {
               var7.method4518(this.field18831);
               var1.method32182(1);
            }

            return Class2274.method9002(var2.field5024.field9020);
         }
      }

      return Class2274.field14820;
   }

   public Class112 method11876() {
      return this.field18831;
   }

   public static Class3321 method11877(Class112 var0) {
      return field18830.get(var0);
   }
}

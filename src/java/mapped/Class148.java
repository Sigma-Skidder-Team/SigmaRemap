package mapped;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class148 extends Class128 {
   private static String[] field491;
   private final List<Class6884> field492;

   public Class148(Class122[] var1, List<Class6884> var2) {
      super(var1);
      this.field492 = ImmutableList.copyOf(var2);
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38625;
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      Random var5 = var2.method26088();

      for (Class6884 var7 : this.field492) {
         UUID var8 = Class6884.method20964(var7);
         if (var8 == null) {
            var8 = UUID.randomUUID();
         }

         Class2106 var9 = Util.<Class2106>method38518(Class6884.method20965(var7), var5);
         var1.method32172(
            Class6884.method20966(var7),
            new Class9689(var8, Class6884.method20967(var7), (double)Class6884.method20968(var7).method20924(var5), Class6884.method20969(var7)),
            var9
         );
      }

      return var1;
   }

   // $VF: synthetic method
   public static List<Class6884> method451(Class148 var0) {
      return var0.field492;
   }
}

package mapped;

import java.util.Random;

public class Class6582 implements Class6580 {
   private static String[] field28996;

   public Class6582() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      return Class9312.method35193(var1)[Direction.NORTH.method533()] && !Class9312.method35195(Class9312.method35191(var1)[Direction.NORTH.method533()]);
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312 var6 = var2;
      if (!Class9312.method35193(var2)[Direction.NORTH.method533()] || Class9312.method35195(Class9312.method35191(var2)[Direction.NORTH.method533()])) {
         var6 = Class9312.method35191(var2)[Direction.SOUTH.method533()];
      }

      Class9312.method35194(var6, true);
      Class9312.method35194(Class9312.method35191(var6)[Direction.NORTH.method533()], true);
      return new Class4219(var1, var6);
   }
}

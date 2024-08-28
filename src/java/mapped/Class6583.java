package mapped;

import java.util.Random;

public class Class6583 implements Class6580 {
   private static String[] field28997;

   public Class6583() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      if (Class9312.method35193(var1)[Direction.NORTH.method533()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.NORTH.method533()])
         && Class9312.method35193(var1)[Direction.field673.method533()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.field673.method533()])) {
         Class9312 var4 = Class9312.method35191(var1)[Direction.NORTH.method533()];
         return Class9312.method35193(var4)[Direction.field673.method533()]
            && !Class9312.method35195(Class9312.method35191(var4)[Direction.field673.method533()]);
      } else {
         return false;
      }
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.NORTH.method533()], true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.field673.method533()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(var2)[Direction.NORTH.method533()])[Direction.field673.method533()], true);
      return new Class4220(var1, var2);
   }
}

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class6584 implements Class6580 {
   private static String[] field28998;

   public Class6584() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      if (Class9312.method35193(var1)[Direction.EAST.getIndex()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.EAST.getIndex()])
         && Class9312.method35193(var1)[Direction.UP.getIndex()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.UP.getIndex()])) {
         Class9312 var4 = Class9312.method35191(var1)[Direction.EAST.getIndex()];
         return Class9312.method35193(var4)[Direction.UP.getIndex()]
            && !Class9312.method35195(Class9312.method35191(var4)[Direction.UP.getIndex()]);
      } else {
         return false;
      }
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.EAST.getIndex()], true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.UP.getIndex()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(var2)[Direction.EAST.getIndex()])[Direction.UP.getIndex()], true);
      return new Class4218(var1, var2);
   }
}

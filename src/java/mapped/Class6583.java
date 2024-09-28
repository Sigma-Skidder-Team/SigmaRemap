package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class6583 implements Class6580 {
   private static String[] field28997;

   public Class6583() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      if (Class9312.method35193(var1)[Direction.NORTH.getIndex()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.NORTH.getIndex()])
         && Class9312.method35193(var1)[Direction.UP.getIndex()]
         && !Class9312.method35195(Class9312.method35191(var1)[Direction.UP.getIndex()])) {
         Class9312 var4 = Class9312.method35191(var1)[Direction.NORTH.getIndex()];
         return Class9312.method35193(var4)[Direction.UP.getIndex()]
            && !Class9312.method35195(Class9312.method35191(var4)[Direction.UP.getIndex()]);
      } else {
         return false;
      }
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.NORTH.getIndex()], true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.UP.getIndex()], true);
      Class9312.method35194(Class9312.method35191(Class9312.method35191(var2)[Direction.NORTH.getIndex()])[Direction.UP.getIndex()], true);
      return new Class4220(var1, var2);
   }
}

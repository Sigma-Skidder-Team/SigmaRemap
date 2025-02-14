package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class6585 implements Class6580 {
   private static String[] field28999;

   public Class6585() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      return Class9312.method35193(var1)[Direction.EAST.getIndex()] && !Class9312.method35195(Class9312.method35191(var1)[Direction.EAST.getIndex()]);
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.EAST.getIndex()], true);
      return new Class4223(var1, var2);
   }
}

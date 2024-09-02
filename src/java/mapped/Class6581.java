package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class6581 implements Class6580 {
   private static String[] field28995;

   public Class6581() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      return !Class9312.method35193(var1)[Direction.WEST.getIndex()]
         && !Class9312.method35193(var1)[Direction.EAST.getIndex()]
         && !Class9312.method35193(var1)[Direction.NORTH.getIndex()]
         && !Class9312.method35193(var1)[Direction.SOUTH.getIndex()]
         && !Class9312.method35193(var1)[Direction.field673.getIndex()];
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      return new Class4214(var1, var2);
   }
}

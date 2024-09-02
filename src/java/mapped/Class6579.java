package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class6579 implements Class6580 {
   private static String[] field28994;

   public Class6579() {
   }

   @Override
   public boolean method19958(Class9312 var1) {
      return Class9312.method35193(var1)[Direction.field673.getIndex()] && !Class9312.method35195(Class9312.method35191(var1)[Direction.field673.getIndex()]);
   }

   @Override
   public Class4213 method19959(Direction var1, Class9312 var2, Random var3) {
      Class9312.method35194(var2, true);
      Class9312.method35194(Class9312.method35191(var2)[Direction.field673.getIndex()], true);
      return new Class4221(var1, var2);
   }
}

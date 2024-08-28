package mapped;

import javax.annotation.Nullable;

public class Class2740 extends Class2736 {
   private static String[] field17257;

   public Class2740(Class1046 var1, double var2, int var4) {
      super(var1, var2, var4);
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      Vector3d var3 = Class8037.method27581(this.field17258, 10, 7);
      int var4 = 0;

      while (
         var3 != null
            && !this.field17258.field5024.method6738(new BlockPos(var3)).method23440(this.field17258.field5024, new BlockPos(var3), Class1947.field12615)
            && var4++ < 10
      ) {
         var3 = Class8037.method27581(this.field17258, 10, 7);
      }

      return var3;
   }
}

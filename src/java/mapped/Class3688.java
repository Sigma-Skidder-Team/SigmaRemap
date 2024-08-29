package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3688 extends Class3676<Class1042> {
   private static String[] field19705;
   private final float field19706;
   private final int field19707;

   public Class3688(float var1, int var2) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485));
      this.field19706 = var1;
      this.field19707 = var2;
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      return !var1.method6952(var2.getPosition());
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      Class1653 var7 = var1.method6951();
      int var8 = var7.method6677(Class2002.method8390(var2.getPosition()));
      Vector3d var9 = null;

      for (int var10 = 0; var10 < 5; var10++) {
         Vector3d var11 = Class8037.method27584(var2, 15, 7, var1x -> (double)(-var1.method6955(Class2002.method8390(var1x))));
         if (var11 != null) {
            int var12 = var7.method6677(Class2002.method8390(new BlockPos(var11)));
            if (var12 < var8) {
               var9 = var11;
               break;
            }

            if (var12 == var8) {
               var9 = var11;
            }
         }
      }

      if (var9 != null) {
         var2.method2992().method21406(Class8830.field39824, new Class8999(var9, this.field19706, this.field19707));
      }
   }
}

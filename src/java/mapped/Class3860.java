package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class3860 extends Class3758 {
   private static String[] field20088;
   public final ViaVersion7 field20089;

   public Class3860(ViaVersion7 var1) {
      this.field20089 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         var1.method30578();
         int var4 = var1.<Integer>method30559(Class4750.field22526);
         int var5 = var1.<Integer>method30559(Class4750.field22526);
         long var6 = 0L;
         var6 |= ((long)var4 & 4194303L) << 42;
         var6 |= ((long)var5 & 4194303L) << 20;
         List[] var8 = new List[16];
         Class6949[] var9 = var1.<Class6949[]>method30559(Class4750.field22564);

         for (Class6949 var13 : var9) {
            int var14 = var13.method21454() >> 4;
            List var15 = var8[var14];
            if (var15 == null) {
               var8[var14] = var15 = new ArrayList();
            }

            int var16 = field20089.method19376().method18528(var13.method21452());
            var15.add(new Class6948(var13.method21448(), var13.method21449(), var13.method21450(), var16));
         }

         for (int var19 = 0; var19 < var8.length; var19++) {
            List<Class6949> var20 = var8[var19];
            if (var20 != null) {
               Class8563 var21 = var1.method30573(Class1936.field12551.method8194());
               var21.method30560(Class4750.field22530, var6 | (long)var19 & 1048575L);
               var21.method30560(Class4750.field22524, false);
               var21.method30560(Class4750.field22566, var20.toArray(Class8267.method28835()));
               var21.method30568(Class6357.class, true, true);
            }
         }
      });
   }
}

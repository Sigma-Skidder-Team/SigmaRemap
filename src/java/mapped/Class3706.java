package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3706 extends Class3676<Class1042> {
   private static String[] field19769;
   private long field19770;

   public Class3706() {
      super(ImmutableMap.of(Class8830.field39814, Class2217.field14484, Class8830.field39825, Class2217.field14486));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      if (var1.method6783() - this.field19770 >= 300L) {
         if (var1.field9016.nextInt(2) != 0) {
            return false;
         } else {
            this.field19770 = var1.method6783();
            Class9378 var5 = var2.method2992().<Class9378>method21410(Class8830.field39814).get();
            return var5.method35578() == var1.method6813() && var5.method35579().method8317(var2.getPositionVec(), 1.73);
         }
      } else {
         return false;
      }
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      Class6947<Class1042> var7 = var2.method2992();
      var7.method21406(Class8830.field39845, var3);
      var7.method21410(Class8830.field39814).ifPresent(var1x -> var7.method21406(Class8830.field39825, new Class7863(var1x.method35579())));
      var2.method4694();
      this.method12585(var1, var2);
      if (var2.method4690()) {
         var2.method4687();
      }
   }

   public void method12585(ServerWorld var1, Class1042 var2) {
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      Optional var7 = var2.method2992().<Class9378>method21410(Class8830.field39814);
      if (!var7.isPresent()) {
         return false;
      } else {
         Class9378 var8 = (Class9378)var7.get();
         return var8.method35578() == var1.method6813() && var8.method35579().method8317(var2.getPositionVec(), 1.73);
      }
   }
}
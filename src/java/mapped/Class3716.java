package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3716 extends Class3676<Class880> {
   private static String[] field19790;
   private final int field19791;
   private final int field19792;
   private int field19793;

   public Class3716(int var1, int var2) {
      super(ImmutableMap.of(Class8830.field39839, Class2217.field14484, Class8830.field39840, Class2217.field14484));
      this.field19792 = var1 * 20;
      this.field19793 = 0;
      this.field19791 = var2;
   }

   @Override
   public void method12502(ServerWorld var1, Class880 var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      Optional var8 = var7.<Long>method21410(Class8830.field39840);
      boolean var9 = (Long)var8.get() + 300L <= var3;
      if (this.field19793 <= this.field19792 && !var9) {
         BlockPos var10 = var7.<Class9378>method21410(Class8830.field39839).get().method35579();
         if (var10.method8316(var2.method3432(), (double)this.field19791)) {
            this.field19793++;
         }
      } else {
         var7.method21405(Class8830.field39840);
         var7.method21405(Class8830.field39839);
         var7.method21422(var1.method6784(), var1.method6783());
         this.field19793 = 0;
      }
   }
}

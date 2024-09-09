package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3753 extends Class3676<Class1042> {
   private static String[] field19907;
   public final float field19908;

   public Class3753(float var1) {
      super(ImmutableMap.of(Class8830.field39815, Class2217.field14484), 1200);
      this.field19908 = var1;
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      return var2.getBrain()
         .method21418()
         .<Boolean>map(var0 -> var0 == Activity.field40220 || var0 == Activity.field40221 || var0 == Activity.field40222)
         .orElse(true);
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return var2.getBrain().method21404(Class8830.field39815);
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      Class6983.method21577(var2, var2.getBrain().<Class9378>method21410(Class8830.field39815).get().method35579(), this.field19908, 1);
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      Optional<Class9378> var7 = var2.getBrain().<Class9378>method21410(Class8830.field39815);
      var7.ifPresent(var1x -> {
         BlockPos var4 = var1x.method35579();
         ServerWorld var5 = var1.getServer().method1318(var1x.method35578());
         if (var5 != null) {
            Class1653 var6 = var5.method6951();
            if (var6.method6675(var4, var0x -> true)) {
               var6.method6674(var4);
            }

            Class7393.method23615(var1, var4);
         }
      });
      var2.getBrain().method21405(Class8830.field39815);
   }
}

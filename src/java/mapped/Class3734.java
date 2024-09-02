package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class Class3734 extends Class3676<Class1042> {
   private static String[] field19848;

   public Class3734() {
      super(ImmutableMap.of(Class8830.field39814, Class2217.field14485));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      Class7921 var5 = var2.method4674();
      return var5.method26571() != Class8395.field36011 && var5.method26571() != Class8395.field36022 && var2.method4721() == 0 && var5.method26572() <= 1;
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      var2.method4695(var2.method4674().method26574(Class8395.field36011));
      var2.method4677(var1);
   }
}

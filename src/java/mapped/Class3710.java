package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3710 extends Class3676<Class1042> {
   private static String[] field19775;
   private final float field19776;

   public Class3710(float var1) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14486, Class8830.field39825, Class2217.field14486), Integer.MAX_VALUE);
      this.field19776 = var1;
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      PlayerEntity var5 = var2.method4740();
      return var2.isAlive() && var5 != null && !var2.method3250() && !var2.velocityChanged && var2.getDistanceSq(var5) <= 16.0 && var5.field4905 != null;
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.method12508(var1, var2);
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      this.method12590(var2);
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      Class6947 var7 = var2.method2992();
      var7.method21405(Class8830.field39824);
      var7.method21405(Class8830.field39825);
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      this.method12590(var2);
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   private void method12590(Class1042 var1) {
      Class6947 var4 = var1.method2992();
      var4.method21406(Class8830.field39824, new Class8999(new Class7865(var1.method4740(), false), this.field19776, 2));
      var4.method21406(Class8830.field39825, new Class7865(var1.method4740(), true));
   }
}

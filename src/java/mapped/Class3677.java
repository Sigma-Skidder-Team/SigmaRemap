package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class Class3677 extends Class3676<Class1042> {
   private Class7699 field19689;

   public Class3677(int var1, int var2) {
      super(ImmutableMap.of(), var1, var2);
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      BlockPos var5 = var2.method3432();
      this.field19689 = var1.method6957(var5);
      return this.field19689 != null && this.field19689.method25392() && Class3686.method12533(var1, var2, var5);
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.field19689 != null && !this.field19689.method25391();
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      this.field19689 = null;
      var2.method2992().method21422(var1.method6784(), var1.method6783());
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      Random var7 = var2.method3013();
      if (var7.nextInt(100) == 0) {
         var2.method4750();
      }

      if (var7.nextInt(200) == 0 && Class3686.method12533(var1, var2, var2.method3432())) {
         Class112 var8 = Util.<Class112>method38518(Class112.values(), var7);
         int var9 = var7.nextInt(3);
         ItemStack var10 = this.method12510(var8, var9);
         Class888 var11 = new Class888(var2.field5024, var2, var2.getPosX(), var2.method3442(), var2.getPosZ(), var10);
         var2.field5024.method6916(var11);
      }
   }

   private ItemStack method12510(Class112 var1, int var2) {
      ItemStack var5 = new ItemStack(Class8514.field38068, 1);
      ItemStack var6 = new ItemStack(Class8514.field38069);
      Class39 var7 = var6.method32144("Explosion");
      ArrayList var8 = Lists.newArrayList();
      var8.add(var1.method313());
      var7.method112("Colors", var8);
      var7.method100("Type", (byte)Class2119.field13811.method8800());
      Class39 var9 = var5.method32144("Fireworks");
      Class41 var10 = new Class41();
      Class39 var11 = var6.method32145("Explosion");
      if (var11 != null) {
         var10.add(var11);
      }

      var9.method100("Flight", (byte)var2);
      if (!var10.isEmpty()) {
         var9.method99("Explosions", var10);
      }

      return var5;
   }
}

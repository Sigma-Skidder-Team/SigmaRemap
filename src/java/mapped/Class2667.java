package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class2667 extends Class2661 {
   private static String[] field17040;
   public final BeeEntity field17022;

   private Class2667(BeeEntity var1) {
      super(var1, null);
      this.field17022 = var1;
   }

   @Override
   public boolean method10860() {
      return BeeEntity.method4492(this.field17022) == 0 && !this.field17022.method4432() && BeeEntity.method4452(this.field17022);
   }

   @Override
   public boolean method10861() {
      return false;
   }

   @Override
   public void method10804() {
      BeeEntity.method4467(this.field17022, 200);
      List<BlockPos> var3 = this.method10882();
      if (!var3.isEmpty()) {
         for (BlockPos var5 : var3) {
            if (!Class2664.method10879(BeeEntity.method4493(this.field17022), var5)) {
               BeeEntity.method4454(this.field17022, var5);
               return;
            }
         }

         Class2664.method10880(BeeEntity.method4493(this.field17022));
         BeeEntity.method4454(this.field17022, (BlockPos)var3.get(0));
      }
   }

   private List<BlockPos> method10882() {
      BlockPos var3 = this.field17022.getPosition();
      Class1653 var4 = ((ServerWorld)this.field17022.world).method6951();
      Stream<Class9343> var5 = var4.method6666(var0 -> var0 == Class4913.field22768 || var0 == Class4913.field22769, var3, 20, Class2093.field13637);
      return var5.map(Class9343::method35355)
         .filter(var1 -> BeeEntity.method4494(this.field17022, var1))
         .sorted(Comparator.comparingDouble(var1 -> var1.distanceSq(var3)))
         .collect(Collectors.<BlockPos>toList());
   }

   // $VF: synthetic method
   public Class2667(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class Class3725 extends Class3676<Class1042> {
   private static String[] field19814;
   private long field19815;
   private long field19816;
   private int field19817;
   private Optional<BlockPos> field19818 = Optional.<BlockPos>empty();

   public Class3725() {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14485, Class8830.field39824, Class2217.field14485));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      if (var2.ticksExisted % 10 == 0 && (this.field19816 == 0L || this.field19816 + 160L <= (long)var2.ticksExisted)) {
         if (var2.method4752().method3634(Items.field37934) > 0) {
            this.field19818 = this.method12625(var1, var2);
            return this.field19818.isPresent();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.field19817 < 80 && this.field19818.isPresent();
   }

   private Optional<BlockPos> method12625(ServerWorld var1, Class1042 var2) {
      Mutable var5 = new Mutable();
      Optional var6 = Optional.empty();
      int var7 = 0;

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               var5.method8378(var2.getPosition(), var8, var9, var10);
               if (this.method12626(var5, var1)) {
                  if (var1.field9016.nextInt(++var7) == 0) {
                     var6 = Optional.<BlockPos>of(var5.method8353());
                  }
               }
            }
         }
      }

      return var6;
   }

   private boolean method12626(BlockPos var1, ServerWorld var2) {
      BlockState var5 = var2.getBlockState(var1);
      Block var6 = var5.getBlock();
      return var6 instanceof Class3480 && !((Class3480)var6).method12179(var5);
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      this.method12627(var2);
      var2.method2944(Class2106.field13731, new ItemStack(Items.field37934));
      this.field19815 = var3;
      this.field19817 = 0;
   }

   private void method12627(Class1042 var1) {
      this.field19818.ifPresent(var1x -> {
         Class7863 var4 = new Class7863(var1x);
         var1.method2992().method21406(Class8830.field39825, var4);
         var1.method2992().method21406(Class8830.field39824, new Class8999(var4, 0.5F, 1));
      });
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      var2.method2944(Class2106.field13731, ItemStack.EMPTY);
      this.field19816 = (long)var2.ticksExisted;
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      BlockPos var7 = this.field19818.get();
      if (var3 >= this.field19815 && var7.method8317(var2.getPositionVec(), 1.0)) {
         ItemStack var8 = ItemStack.EMPTY;
         Class927 var9 = var2.method4752();
         int var10 = var9.method3629();

         for (int var11 = 0; var11 < var10; var11++) {
            ItemStack var12 = var9.method3618(var11);
            if (var12.getItem() == Items.field37934) {
               var8 = var12;
               break;
            }
         }

         if (!var8.isEmpty() && Class3336.method11883(var8, var1, var7)) {
            var1.method6999(2005, var7, 0);
            this.field19818 = this.method12625(var1, var2);
            this.method12627(var2);
            this.field19815 = var3 + 40L;
         }

         this.field19817++;
      }
   }
}

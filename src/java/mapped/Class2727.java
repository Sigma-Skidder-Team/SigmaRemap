package mapped;

import java.util.EnumSet;

public class Class2727 extends Class2595 {
   private static String[] field17233;
   private final Class1046 field17234;

   public Class2727(Class1046 var1) {
      this.field17234 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return this.field17234.method3351() < 140;
   }

   @Override
   public boolean method10806() {
      return this.method10803();
   }

   @Override
   public boolean method10808() {
      return false;
   }

   @Override
   public void method10804() {
      this.method10938();
   }

   private void method10938() {
      Iterable<BlockPos> var3 = BlockPos.method8364(
         Class9679.method37769(this.field17234.getPosX() - 1.0),
         Class9679.method37769(this.field17234.getPosY()),
         Class9679.method37769(this.field17234.getPosZ() - 1.0),
         Class9679.method37769(this.field17234.getPosX() + 1.0),
         Class9679.method37769(this.field17234.getPosY() + 8.0),
         Class9679.method37769(this.field17234.getPosZ() + 1.0)
      );
      BlockPos var4 = null;

      for (BlockPos var6 : var3) {
         if (this.method10939(this.field17234.field5024, var6)) {
            var4 = var6;
            break;
         }
      }

      if (var4 == null) {
         var4 = new BlockPos(this.field17234.getPosX(), this.field17234.getPosY() + 8.0, this.field17234.getPosZ());
      }

      this.field17234.method4230().method21654((double)var4.method8304(), (double)(var4.getY() + 1), (double)var4.method8306(), 1.0);
   }

   @Override
   public void method10805() {
      this.method10938();
      this.field17234.method3265(0.02F, new Vector3d((double)this.field17234.field4982, (double)this.field17234.field4983, (double)this.field17234.field4984));
      this.field17234.move(Class2107.field13742, this.field17234.method3433());
   }

   private boolean method10939(Class1662 var1, BlockPos var2) {
      Class7380 var5 = var1.method6738(var2);
      return (var1.method6739(var2).method23474() || var5.method23448(Class8487.field37013)) && var5.method23440(var1, var2, Class1947.field12614);
   }
}

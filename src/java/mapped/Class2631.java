package mapped;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import java.util.EnumSet;

public class Class2631 extends Class2628 {
   private static String[] field16942;
   private final CatEntity field16943;

   public Class2631(CatEntity var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.field16943 = var1;
      this.field16937 = -2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return this.field16943.method4393() && !this.field16943.method4402() && !this.field16943.method5253() && super.method10803();
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16943.method4396(false);
   }

   @Override
   public int method10833(CreatureEntity var1) {
      return 40;
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16943.method5252(false);
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field16943.method4396(false);
      if (this.method10838()) {
         if (!this.field16943.method5253()) {
            this.field16943.method5252(true);
         }
      } else {
         this.field16943.method5252(false);
      }
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      return var1.method7007(var2.up()) && var1.getBlockState(var2).getBlock().isIn(BlockTags.field32770);
   }
}

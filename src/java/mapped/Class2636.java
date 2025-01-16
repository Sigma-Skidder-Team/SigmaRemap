package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorldReader;

public class Class2636 extends Class2628 {
   private static String[] field16955;
   public int field16956;
   public final FoxEntity field16957;

   public Class2636(FoxEntity var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.field16957 = var1;
   }

   @Override
   public double method10835() {
      return 2.0;
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 100 == 0;
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      BlockState var5 = var1.getBlockState(var2);
      return var5.isIn(Blocks.SWEET_BERRY_BUSH) && var5.<Integer>get(Class3484.field19342) >= 2;
   }

   @Override
   public void method10805() {
      if (!this.method10838()) {
         if (!this.method10838() && FoxEntity.method5164(this.field16957).nextFloat() < 0.05F) {
            this.field16957.playSound(SoundEvents.field26596, 1.0F, 1.0F);
         }
      } else if (this.field16956 < 40) {
         this.field16956++;
      } else {
         this.method10845();
      }

      super.method10805();
   }

   public void method10845() {
      if (this.field16957.world.getGameRules().getBoolean(GameRules.field24224)) {
         BlockState var3 = this.field16957.world.getBlockState(this.field16933);
         if (var3.isIn(Blocks.SWEET_BERRY_BUSH)) {
            int var4 = var3.<Integer>get(Class3484.field19342);
            var3.with(Class3484.field19342, Integer.valueOf(1));
            int var5 = 1 + this.field16957.world.rand.nextInt(2) + (var4 != 3 ? 0 : 1);
            ItemStack var6 = this.field16957.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
            if (var6.isEmpty()) {
               this.field16957.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.field38170));
               var5--;
            }

            if (var5 > 0) {
               Block.method11557(this.field16957.world, this.field16933, new ItemStack(Items.field38170, var5));
            }

            this.field16957.playSound(SoundEvents.field27144, 1.0F, 1.0F);
            this.field16957.world.setBlockState(this.field16933, var3.with(Class3484.field19342, Integer.valueOf(1)), 2);
         }
      }
   }

   @Override
   public boolean method10803() {
      return !this.field16957.isSleeping() && super.method10803();
   }

   @Override
   public void method10804() {
      this.field16956 = 0;
      this.field16957.method5130(false);
      super.method10804();
   }
}

package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.IntStream;

public class Class940 extends Class939 implements Class930, ITickableTileEntity {
   private static final int[] field5304 = IntStream.range(0, 27).toArray();
   private NonNullList<ItemStack> field5305 = NonNullList.<ItemStack>method68(27, ItemStack.EMPTY);
   private int field5306;
   private Class2126 field5307 = Class2126.field13872;
   private float field5308;
   private float field5309;
   private DyeColor field5310;
   private boolean field5311;

   public Class940(DyeColor var1) {
      super(TileEntityType.field21443);
      this.field5310 = var1;
   }

   public Class940() {
      this((DyeColor)null);
      this.field5311 = true;
   }

   @Override
   public void tick() {
      this.method3745();
      if (this.field5307 == Class2126.field13873 || this.field5307 == Class2126.field13875) {
         this.method3750();
      }
   }

   public void method3745() {
      this.field5309 = this.field5308;
      switch (Class9671.field45162[this.field5307.ordinal()]) {
         case 1:
            this.field5308 = 0.0F;
            break;
         case 2:
            this.field5308 += 0.1F;
            if (this.field5308 >= 1.0F) {
               this.method3750();
               this.field5307 = Class2126.field13874;
               this.field5308 = 1.0F;
               this.method3752();
            }
            break;
         case 3:
            this.field5308 -= 0.1F;
            if (this.field5308 <= 0.0F) {
               this.field5307 = Class2126.field13872;
               this.field5308 = 0.0F;
               this.method3752();
            }
            break;
         case 4:
            this.field5308 = 1.0F;
      }
   }

   public Class2126 method3746() {
      return this.field5307;
   }

   public AxisAlignedBB method3747(BlockState var1) {
      return this.method3748(var1.<Direction>get(ShulkerBoxBlock.field18939));
   }

   public AxisAlignedBB method3748(Direction var1) {
      float var4 = this.method3755(1.0F);
      return VoxelShapes.method27426()
         .getBoundingBox()
         .expand(
            (double)(0.5F * var4 * (float)var1.getXOffset()), (double)(0.5F * var4 * (float)var1.getYOffset()), (double)(0.5F * var4 * (float)var1.getZOffset())
         );
   }

   private AxisAlignedBB method3749(Direction var1) {
      Direction var4 = var1.getOpposite();
      return this.method3748(var1).contract((double)var4.getXOffset(), (double)var4.getYOffset(), (double)var4.getZOffset());
   }

   private void method3750() {
      BlockState var3 = this.world.getBlockState(this.getPos());
      if (var3.getBlock() instanceof ShulkerBoxBlock) {
         Direction var4 = var3.<Direction>get(ShulkerBoxBlock.field18939);
         AxisAlignedBB var5 = this.method3749(var4).offset(this.pos);
         List var6 = this.world.method7181((Entity)null, var5);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = (Entity)var6.get(var7);
               if (var8.method3422() != PushReaction.field15865) {
                  double var9 = 0.0;
                  double var11 = 0.0;
                  double var13 = 0.0;
                  AxisAlignedBB var15 = var8.getBoundingBox();
                  switch (Class9671.field45163[var4.getAxis().ordinal()]) {
                     case 1:
                        if (var4.getAxisDirection() == Direction.AxisDirection.POSITIVE) {
                           var9 = var5.maxX - var15.minX;
                        } else {
                           var9 = var15.maxX - var5.minX;
                        }

                        var9 += 0.01;
                        break;
                     case 2:
                        if (var4.getAxisDirection() == Direction.AxisDirection.POSITIVE) {
                           var11 = var5.maxY - var15.minY;
                        } else {
                           var11 = var15.maxY - var5.minY;
                        }

                        var11 += 0.01;
                        break;
                     case 3:
                        if (var4.getAxisDirection() == Direction.AxisDirection.POSITIVE) {
                           var13 = var5.maxZ - var15.minZ;
                        } else {
                           var13 = var15.maxZ - var5.minZ;
                        }

                        var13 += 0.01;
                  }

                  var8.move(
                     MoverType.field13745, new Vector3d(var9 * (double)var4.getXOffset(), var11 * (double)var4.getYOffset(), var13 * (double)var4.getZOffset())
                  );
               }
            }
         }
      }
   }

   @Override
   public int getSizeInventory() {
      return this.field5305.size();
   }

   @Override
   public boolean receiveClientEvent(int var1, int var2) {
      if (var1 != 1) {
         return super.receiveClientEvent(var1, var2);
      } else {
         this.field5306 = var2;
         if (var2 == 0) {
            this.field5307 = Class2126.field13875;
            this.method3752();
         }

         if (var2 == 1) {
            this.field5307 = Class2126.field13873;
            this.method3752();
         }

         return true;
      }
   }

   private void method3752() {
      this.getBlockState().method23424(this.method3734(), this.getPos(), 3);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         if (this.field5306 < 0) {
            this.field5306 = 0;
         }

         this.field5306++;
         this.world.addBlockEvent(this.pos, this.getBlockState().getBlock(), 1, this.field5306);
         if (this.field5306 == 1) {
            this.world
               .playSound((PlayerEntity)null, this.pos, SoundEvents.field27045, SoundCategory.field14732, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         this.field5306--;
         this.world.addBlockEvent(this.pos, this.getBlockState().getBlock(), 1, this.field5306);
         if (this.field5306 <= 0) {
            this.world
               .playSound((PlayerEntity)null, this.pos, SoundEvents.field27044, SoundCategory.field14732, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.shulkerBox");
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.method3753(var2);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      return this.method3754(var1);
   }

   public void method3753(CompoundNBT var1) {
      this.field5305 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.checkLootAndRead(var1) && var1.contains("Items", 9)) {
         ItemStackHelper.loadAllItems(var1, this.field5305);
      }
   }

   public CompoundNBT method3754(CompoundNBT var1) {
      if (!this.checkLootAndWrite(var1)) {
         ItemStackHelper.method26566(var1, this.field5305, false);
      }

      return var1;
   }

   @Override
   public NonNullList<ItemStack> getItems() {
      return this.field5305;
   }

   @Override
   public void setItems(NonNullList<ItemStack> var1) {
      this.field5305 = var1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return field5304;
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return !(Block.method11537(var2.getItem()) instanceof ShulkerBoxBlock);
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      return true;
   }

   public float method3755(float var1) {
      return MathHelper.lerp(var1, this.field5309, this.field5308);
   }

   @Nullable
   public DyeColor method3756() {
      if (this.field5311) {
         this.field5310 = ShulkerBoxBlock.method11955(this.getBlockState().getBlock());
         this.field5311 = false;
      }

      return this.field5310;
   }

   @Override
   public Container createMenu(int var1, PlayerInventory var2) {
      return new Class5814(var1, var2, this);
   }

   public boolean method3757() {
      return this.field5307 == Class2126.field13872;
   }

   @Override
   public ITextComponent getDefaultName2() {
      return new TranslationTextComponent("container.shulkerBox");
   }
}

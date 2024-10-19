package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Class936 extends Class939 implements Class937, ITickableTileEntity {
   private NonNullList<ItemStack> field5293 = NonNullList.<ItemStack>method68(5, ItemStack.EMPTY);
   private int field5294 = -1;
   private long field5295;

   public Class936() {
      super(TileEntityType.field21437);
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5293 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.checkLootAndRead(var2)) {
         ItemStackHelper.loadAllItems(var2, this.field5293);
      }

      this.field5294 = var2.getInt("TransferCooldown");
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.checkLootAndWrite(var1)) {
         ItemStackHelper.saveAllItems(var1, this.field5293);
      }

      var1.putInt("TransferCooldown", this.field5294);
      return var1;
   }

   @Override
   public int getSizeInventory() {
      return this.field5293.size();
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      this.method3743((PlayerEntity)null);
      return ItemStackHelper.method26563(this.getItems(), var1, var2);
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.method3743((PlayerEntity)null);
      this.getItems().set(var1, var2);
      if (var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.hopper");
   }

   @Override
   public void tick() {
      if (this.world != null && !this.world.isRemote) {
         this.field5294--;
         this.field5295 = this.world.getGameTime();
         if (!this.method3722()) {
            this.method3721(0);
            this.method3699(() -> method3705(this));
         }
      }
   }

   private boolean method3699(Supplier<Boolean> var1) {
      if (this.world != null && !this.world.isRemote) {
         if (!this.method3722() && this.getBlockState().<Boolean>get(Class3362.field18914)) {
            boolean var4 = false;
            if (!this.isEmpty()) {
               var4 = this.method3701();
            }

            if (!this.method3700()) {
               var4 |= var1.get();
            }

            if (var4) {
               this.method3721(8);
               this.markDirty();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean method3700() {
      for (ItemStack var4 : this.field5293) {
         if (var4.isEmpty() || var4.getCount() != var4.getMaxStackSize()) {
            return false;
         }
      }

      return true;
   }

   private boolean method3701() {
      IInventory var3 = this.method3712();
      if (var3 != null) {
         Direction var4 = this.getBlockState().<Direction>get(Class3362.field18913).getOpposite();
         if (!this.method3703(var3, var4)) {
            for (int var5 = 0; var5 < this.getSizeInventory(); var5++) {
               if (!this.getStackInSlot(var5).isEmpty()) {
                  ItemStack var6 = this.getStackInSlot(var5).copy();
                  ItemStack var7 = method3708(this, var3, this.decrStackSize(var5, 1), var4);
                  if (var7.isEmpty()) {
                     var3.markDirty();
                     return true;
                  }

                  this.setInventorySlotContents(var5, var6);
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static IntStream method3702(IInventory var0, Direction var1) {
      return !(var0 instanceof Class930) ? IntStream.range(0, var0.getSizeInventory()) : IntStream.of(((Class930)var0).method3653(var1));
   }

   private boolean method3703(IInventory var1, Direction var2) {
      return method3702(var1, var2).allMatch(var1x -> {
         ItemStack var4 = var1.getStackInSlot(var1x);
         return var4.getCount() >= var4.getMaxStackSize();
      });
   }

   private static boolean method3704(IInventory var0, Direction var1) {
      return method3702(var0, var1).allMatch(var1x -> var0.getStackInSlot(var1x).isEmpty());
   }

   public static boolean method3705(Class937 var0) {
      IInventory var3 = method3713(var0);
      if (var3 != null) {
         Direction var6 = Direction.DOWN;
         return !method3704(var3, var6) ? method3702(var3, var6).anyMatch(var3x -> method3706(var0, var3, var3x, var6)) : false;
      } else {
         for (ItemEntity var5 : method3714(var0)) {
            if (method3707(var0, var5)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean method3706(Class937 var0, IInventory var1, int var2, Direction var3) {
      ItemStack var6 = var1.getStackInSlot(var2);
      if (!var6.isEmpty() && method3710(var1, var6, var2, var3)) {
         ItemStack var7 = var6.copy();
         ItemStack var8 = method3708(var1, var0, var1.decrStackSize(var2, 1), (Direction)null);
         if (var8.isEmpty()) {
            var1.markDirty();
            return true;
         }

         var1.setInventorySlotContents(var2, var7);
      }

      return false;
   }

   public static boolean method3707(IInventory var0, ItemEntity var1) {
      boolean var4 = false;
      ItemStack var5 = var1.method4124().copy();
      ItemStack var6 = method3708((IInventory)null, var0, var5, (Direction)null);
      if (!var6.isEmpty()) {
         var1.method4125(var6);
      } else {
         var4 = true;
         var1.remove();
      }

      return var4;
   }

   public static ItemStack method3708(IInventory var0, IInventory var1, ItemStack var2, Direction var3) {
      if (var1 instanceof Class930 && var3 != null) {
         Class930 var9 = (Class930)var1;
         int[] var10 = var9.method3653(var3);

         for (int var8 = 0; var8 < var10.length && !var2.isEmpty(); var8++) {
            var2 = method3711(var0, var1, var2, var10[var8], var3);
         }
      } else {
         int var6 = var1.getSizeInventory();

         for (int var7 = 0; var7 < var6 && !var2.isEmpty(); var7++) {
            var2 = method3711(var0, var1, var2, var7, var3);
         }
      }

      return var2;
   }

   private static boolean method3709(IInventory var0, ItemStack var1, int var2, Direction var3) {
      return !var0.isItemValidForSlot(var2, var1) ? false : !(var0 instanceof Class930) || ((Class930)var0).method3654(var2, var1, var3);
   }

   private static boolean method3710(IInventory var0, ItemStack var1, int var2, Direction var3) {
      return !(var0 instanceof Class930) || ((Class930)var0).method3655(var2, var1, var3);
   }

   private static ItemStack method3711(IInventory var0, IInventory var1, ItemStack var2, int var3, Direction var4) {
      ItemStack var7 = var1.getStackInSlot(var3);
      if (method3709(var1, var2, var3, var4)) {
         boolean var8 = false;
         boolean var9 = var1.isEmpty();
         if (!var7.isEmpty()) {
            if (method3717(var7, var2)) {
               int var10 = var2.getMaxStackSize() - var7.getCount();
               int var11 = Math.min(var2.getCount(), var10);
               var2.shrink(var11);
               var7.grow(var11);
               var8 = var11 > 0;
            }
         } else {
            var1.setInventorySlotContents(var3, var2);
            var2 = ItemStack.EMPTY;
            var8 = true;
         }

         if (var8) {
            if (var9 && var1 instanceof Class936) {
               Class936 var13 = (Class936)var1;
               if (!var13.method3723()) {
                  int var14 = 0;
                  if (var0 instanceof Class936) {
                     Class936 var12 = (Class936)var0;
                     if (var13.field5295 >= var12.field5295) {
                        var14 = 1;
                     }
                  }

                  var13.method3721(8 - var14);
               }
            }

            var1.markDirty();
         }
      }

      return var2;
   }

   @Nullable
   private IInventory method3712() {
      Direction var3 = this.getBlockState().<Direction>get(Class3362.field18913);
      return method3715(this.method3734(), this.pos.offset(var3));
   }

   @Nullable
   public static IInventory method3713(Class937 var0) {
      return method3716(var0.method3734(), var0.method3718(), var0.method3719() + 1.0, var0.method3720());
   }

   public static List<ItemEntity> method3714(Class937 var0) {
      return var0.method3733()
         .method19521()
         .stream()
         .flatMap(
            var1 -> var0.method3734()
                  .getEntitiesInAABBexcluding(
                     ItemEntity.class, var1.offset(var0.method3718() - 0.5, var0.method3719() - 0.5, var0.method3720() - 0.5), EntityPredicates.IS_ALIVE
                  )
                  .stream()
         )
         .collect(Collectors.<ItemEntity>toList());
   }

   @Nullable
   public static IInventory method3715(World var0, BlockPos var1) {
      return method3716(var0, (double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5);
   }

   @Nullable
   public static IInventory method3716(World var0, double var1, double var3, double var5) {
      Object var9 = null;
      BlockPos var10 = new BlockPos(var1, var3, var5);
      BlockState var11 = var0.getBlockState(var10);
      Block var12 = var11.getBlock();
      if (!(var12 instanceof Class3476)) {
         if (var12.isTileEntityProvider()) {
            TileEntity var13 = var0.getTileEntity(var10);
            if (var13 instanceof IInventory) {
               var9 = (IInventory)var13;
               if (var9 instanceof ChestTileEntity && var12 instanceof ChestBlock) {
                  var9 = ChestBlock.method11911((ChestBlock)var12, var11, var0, var10, true);
               }
            }
         }
      } else {
         var9 = ((Class3476)var12).method12169(var11, var0, var10);
      }

      if (var9 == null) {
         List var14 = var0.getEntitiesInAABBexcluding(
            (Entity)null, new AxisAlignedBB(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), EntityPredicates.field34760
         );
         if (!var14.isEmpty()) {
            var9 = (IInventory)var14.get(var0.rand.nextInt(var14.size()));
         }
      }

      return (IInventory)var9;
   }

   private static boolean method3717(ItemStack var0, ItemStack var1) {
      if (var0.getItem() == var1.getItem()) {
         if (var0.method32117() == var1.method32117()) {
            return var0.getCount() <= var0.getMaxStackSize() ? ItemStack.method32127(var0, var1) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public double method3718() {
      return (double)this.pos.getX() + 0.5;
   }

   @Override
   public double method3719() {
      return (double)this.pos.getY() + 0.5;
   }

   @Override
   public double method3720() {
      return (double)this.pos.getZ() + 0.5;
   }

   private void method3721(int var1) {
      this.field5294 = var1;
   }

   private boolean method3722() {
      return this.field5294 > 0;
   }

   private boolean method3723() {
      return this.field5294 > 8;
   }

   @Override
   public NonNullList<ItemStack> getItems() {
      return this.field5293;
   }

   @Override
   public void setItems(NonNullList<ItemStack> var1) {
      this.field5293 = var1;
   }

   public void method3726(Entity var1) {
      if (var1 instanceof ItemEntity) {
         BlockPos var4 = this.getPos();
         if (VoxelShapes.compare(
            VoxelShapes.create(var1.getBoundingBox().offset((double)(-var4.getX()), (double)(-var4.getY()), (double)(-var4.getZ()))),
            this.method3733(),
            IBooleanFunction.AND
         )) {
            this.method3699(() -> method3707(this, (ItemEntity)var1));
         }
      }
   }

   @Override
   public Container createMenu(int var1, PlayerInventory var2) {
      return new Class5816(var1, var2, this);
   }

   @Override
   public ITextComponent getDefaultName2() {
      return null;
   }
}

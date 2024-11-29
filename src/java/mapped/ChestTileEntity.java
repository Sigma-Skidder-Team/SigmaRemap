package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ChestTileEntity extends Class939 implements Class942, ITickableTileEntity {
   private NonNullList<ItemStack> chestContents = NonNullList.<ItemStack>method68(27, ItemStack.EMPTY);
   public float lidAngle;
   public float prevLidAngle;
   public int numPlayersUsing;
   private int ticksSinceSync;

   public ChestTileEntity(TileEntityType<?> var1) {
      super(var1);
   }

   public ChestTileEntity() {
      this(TileEntityType.CHEST);
   }

   @Override
   public int getSizeInventory() {
      return 27;
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.chest");
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.chestContents = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.checkLootAndRead(var2)) {
         ItemStackHelper.loadAllItems(var2, this.chestContents);
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (!this.checkLootAndWrite(var1)) {
         ItemStackHelper.saveAllItems(var1, this.chestContents);
      }

      return var1;
   }

   @Override
   public void tick() {
      int var3 = this.pos.getX();
      int var4 = this.pos.getY();
      int var5 = this.pos.getZ();
      this.ticksSinceSync++;
      this.numPlayersUsing = calculatePlayersUsingSync(this.world, this, this.ticksSinceSync, var3, var4, var5, this.numPlayersUsing);
      this.prevLidAngle = this.lidAngle;
      float var6 = 0.1F;
      if (this.numPlayersUsing > 0 && this.lidAngle == 0.0F) {
         this.playSound(SoundEvents.BLOCK_CHEST_OPEN);
      }

      if (this.numPlayersUsing == 0 && this.lidAngle > 0.0F || this.numPlayersUsing > 0 && this.lidAngle < 1.0F) {
         float var7 = this.lidAngle;
         if (this.numPlayersUsing <= 0) {
            this.lidAngle -= 0.1F;
         } else {
            this.lidAngle += 0.1F;
         }

         if (this.lidAngle > 1.0F) {
            this.lidAngle = 1.0F;
         }

         float var8 = 0.5F;
         if (this.lidAngle < 0.5F && var7 >= 0.5F) {
            this.playSound(SoundEvents.field26447);
         }

         if (this.lidAngle < 0.0F) {
            this.lidAngle = 0.0F;
         }
      }
   }

   public static int calculatePlayersUsingSync(World var0, Class932 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var0.isRemote && var6 != 0 && (var2 + var3 + var4 + var5) % 200 == 0) {
         var6 = calculatePlayersUsing(var0, var1, var3, var4, var5);
      }

      return var6;
   }

   public static int calculatePlayersUsing(World var0, Class932 var1, int var2, int var3, int var4) {
      int var7 = 0;
      float var8 = 5.0F;

      for (PlayerEntity var10 : var0.<PlayerEntity>getEntitiesWithinAABB(
         PlayerEntity.class,
         new AxisAlignedBB(
            (double)((float)var2 - 5.0F),
            (double)((float)var3 - 5.0F),
            (double)((float)var4 - 5.0F),
            (double)((float)(var2 + 1) + 5.0F),
            (double)((float)(var3 + 1) + 5.0F),
            (double)((float)(var4 + 1) + 5.0F)
         )
      )) {
         if (var10.openContainer instanceof ChestContainer) {
            IInventory var11 = ((ChestContainer)var10.openContainer).getLowerChestInventory();
            if (var11 == var1 || var11 instanceof Class990 && ((Class990)var11).isPartOfLargeChest(var1)) {
               var7++;
            }
         }
      }

      return var7;
   }

   private void playSound(SoundEvent var1) {
      ChestType var4 = this.getBlockState().<ChestType>get(ChestBlock.TYPE);
      if (var4 != ChestType.LEFT) {
         double var5 = (double)this.pos.getX() + 0.5;
         double var7 = (double)this.pos.getY() + 0.5;
         double var9 = (double)this.pos.getZ() + 0.5;
         if (var4 == ChestType.RIGHT) {
            Direction var11 = ChestBlock.getDirectionToAttached(this.getBlockState());
            var5 += (double)var11.getXOffset() * 0.5;
            var9 += (double)var11.getZOffset() * 0.5;
         }

         this.world.playSound((PlayerEntity)null, var5, var7, var9, var1, Class2266.field14732, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean receiveClientEvent(int var1, int var2) {
      if (var1 != 1) {
         return super.receiveClientEvent(var1, var2);
      } else {
         this.numPlayersUsing = var2;
         return true;
      }
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         if (this.numPlayersUsing < 0) {
            this.numPlayersUsing = 0;
         }

         this.numPlayersUsing++;
         this.onOpenOrClose();
      }
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         this.numPlayersUsing--;
         this.onOpenOrClose();
      }
   }

   public void onOpenOrClose() {
      Block var3 = this.getBlockState().getBlock();
      if (var3 instanceof ChestBlock) {
         this.world.addBlockEvent(this.pos, var3, 1, this.numPlayersUsing);
         this.world.notifyNeighborsOfStateChange(this.pos, var3);
      }
   }

   @Override
   public NonNullList<ItemStack> getItems() {
      return this.chestContents;
   }

   @Override
   public void setItems(NonNullList<ItemStack> var1) {
      this.chestContents = var1;
   }

   @Override
   public float getLidAngle(float var1) {
      return MathHelper.lerp(var1, this.prevLidAngle, this.lidAngle);
   }

   public static int getPlayersUsing(IBlockReader var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      if (var4.getBlock().isTileEntityProvider()) {
         TileEntity var5 = var0.getTileEntity(var1);
         if (var5 instanceof ChestTileEntity) {
            return ((ChestTileEntity)var5).numPlayersUsing;
         }
      }

      return 0;
   }

   public static void swapContents(ChestTileEntity var0, ChestTileEntity var1) {
      NonNullList<ItemStack> var4 = var0.getItems();
      var0.setItems(var1.getItems());
      var1.setItems(var4);
   }

   @Override
   public Container createMenu(int var1, PlayerInventory var2) {
      return ChestContainer.method18162(var1, var2, this);
   }

   /**
    * This does NOT have a mapping (this method doesn't even exist in the original src apparently)
    */
   @Override
   public ITextComponent getDefaultName2() {
      return new TranslationTextComponent("container.chest");
   }
}

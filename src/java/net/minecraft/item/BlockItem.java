package net.minecraft.item;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class BlockItem extends Item {
   /** @deprecated */
   private final Block field18801;

   public BlockItem(Block var1, Properties var2) {
      super(var2);
      this.field18801 = var1;
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      ActionResultType var4 = this.method11834(new BlockItemUseContext(var1));
      return !var4.isSuccessOrConsume() && this.isFood() ? this.method11700(var1.getWorld(), var1.method18358(), var1.method18359()).method20694() : var4;
   }

   public ActionResultType method11834(BlockItemUseContext var1) {
      if (!var1.method18346()) {
         return ActionResultType.FAIL;
      } else {
         BlockItemUseContext var4 = this.method11836(var1);
         if (var4 != null) {
            BlockState var5 = this.method11838(var4);
            if (var5 == null) {
               return ActionResultType.FAIL;
            } else if (this.method11843(var4, var5)) {
               BlockPos var6 = var4.getPos();
               World var7 = var4.getWorld();
               PlayerEntity var8 = var4.method18358();
               ItemStack var9 = var4.method18357();
               BlockState var10 = var7.getBlockState(var6);
               Block var11 = var10.getBlock();
               if (var11 == var5.getBlock()) {
                  var10 = this.method11839(var6, var7, var9, var10);
                  this.method11837(var6, var7, var8, var9, var10);
                  var11.method11563(var7, var6, var10, var8, var9);
                  if (var8 instanceof ServerPlayerEntity) {
                     CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var8, var6, var9);
                  }
               }

               SoundType var12 = var10.getSoundType();
               var7.playSound(var8, var6, this.method11835(var10), SoundCategory.field14732, (var12.getVolume() + 1.0F) / 2.0F, var12.getPitch() * 0.8F);
               if (var8 == null || !var8.abilities.isCreativeMode) {
                  var9.shrink(1);
               }

               return ActionResultType.method9002(var7.isRemote);
            } else {
               return ActionResultType.FAIL;
            }
         } else {
            return ActionResultType.FAIL;
         }
      }
   }

   public SoundEvent method11835(BlockState var1) {
      return var1.getSoundType().getPlaceSound();
   }

   @Nullable
   public BlockItemUseContext method11836(BlockItemUseContext var1) {
      return var1;
   }

   public boolean method11837(BlockPos var1, World var2, PlayerEntity var3, ItemStack var4, BlockState var5) {
      return method11844(var2, var3, var1, var4);
   }

   @Nullable
   public BlockState method11838(BlockItemUseContext var1) {
      BlockState var4 = this.method11845().getStateForPlacement(var1);
      return var4 != null && this.method11841(var1, var4) ? var4 : null;
   }

   private BlockState method11839(BlockPos var1, World var2, ItemStack var3, BlockState var4) {
      BlockState var7 = var4;
      CompoundNBT var8 = var3.getTag();
      if (var8 != null) {
         CompoundNBT var9 = var8.getCompound("BlockStateTag");
         StateContainer var10 = var4.getBlock().getStateContainer();

         for (String var12 : var9.keySet()) {
            Property var13 = var10.getProperty(var12);
            if (var13 != null) {
               String var14 = var9.get(var12).getString();
               var7 = method11840(var7, var13, var14);
            }
         }
      }

      if (var7 != var4) {
         var2.setBlockState(var1, var7, 2);
      }

      return var7;
   }

   private static <T extends Comparable<T>> BlockState method11840(BlockState var0, Property<T> var1, String var2) {
      return var1.parseValue(var2).<BlockState>map(var2x -> var0.with(var1, var2x)).orElse(var0);
   }

   public boolean method11841(BlockItemUseContext var1, BlockState var2) {
      PlayerEntity var5 = var1.method18358();
      ISelectionContext var6 = var5 != null ? ISelectionContext.forEntity(var5) : ISelectionContext.method14947();
      return (!this.method11842() || var2.isValidPosition(var1.getWorld(), var1.getPos())) && var1.getWorld().placedBlockCollides(var2, var1.getPos(), var6);
   }

   public boolean method11842() {
      return true;
   }

   public boolean method11843(BlockItemUseContext var1, BlockState var2) {
      return var1.getWorld().setBlockState(var1.getPos(), var2, 11);
   }

   public static boolean method11844(World var0, PlayerEntity var1, BlockPos var2, ItemStack var3) {
      MinecraftServer var6 = var0.getServer();
      if (var6 == null) {
         return false;
      } else {
         CompoundNBT var7 = var3.method32145("BlockEntityTag");
         if (var7 != null) {
            TileEntity var8 = var0.getTileEntity(var2);
            if (var8 != null) {
               if (!var0.isRemote && var8.method3783() && (var1 == null || !var1.canUseCommandBlock())) {
                  return false;
               }

               CompoundNBT var9 = var8.write(new CompoundNBT());
               CompoundNBT var10 = var9.copy();
               var9.merge(var7);
               var9.putInt("x", var2.getX());
               var9.putInt("y", var2.getY());
               var9.putInt("z", var2.getZ());
               if (!var9.equals(var10)) {
                  var8.read(var0.getBlockState(var2), var9);
                  var8.markDirty();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public String getTranslationKey() {
      return this.method11845().getTranslationKey();
   }

   @Override
   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (this.method11738(var1)) {
         this.method11845().method11570(var1, var2);
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11730(var1, var2, var3, var4);
      this.method11845().method11583(var1, var2, var3, var4);
   }

   public Block method11845() {
      return this.field18801;
   }

   public void method11846(Map<Block, Item> var1, Item var2) {
      var1.put(this.method11845(), var2);
   }
}

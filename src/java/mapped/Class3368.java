package mapped;

import java.util.List;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3368 extends Class3241 {
   public static final Class8552<Direction> field18939 = Class3433.field19198;
   public static final ResourceLocation field18940 = new ResourceLocation("contents");
   private final Class112 field18941;

   public Class3368(Class112 var1, AbstractBlock var2) {
      super(var2);
      this.field18941 = var1;
      this.method11578(this.field18612.method35393().method23465(field18939, Direction.field673));
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class940(this.field18941);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         if (!var4.isSpectator()) {
            TileEntity var9 = var2.getTileEntity(var3);
            if (!(var9 instanceof Class940)) {
               return ActionResultType.field14820;
            } else {
               Class940 var10 = (Class940)var9;
               boolean var11;
               if (var10.method3746() != Class2126.field13872) {
                  var11 = true;
               } else {
                  Direction var12 = var1.<Direction>method23463(field18939);
                  var11 = var2.hasNoCollisions(Class8919.method32596(var3, var12));
               }

               if (var11) {
                  var4.method2766(var10);
                  var4.method2911(Stats.field40163);
                  Class4388.method13832(var4, true);
               }

               return ActionResultType.field14819;
            }
         } else {
            return ActionResultType.field14819;
         }
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18939, var1.method18354());
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18939);
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      TileEntity var7 = var1.getTileEntity(var2);
      if (var7 instanceof Class940) {
         Class940 var8 = (Class940)var7;
         if (!var1.isRemote && var4.isCreative() && !var8.isEmpty()) {
            ItemStack var9 = method11958(this.method11957());
            CompoundNBT var10 = var8.method3754(new CompoundNBT());
            if (!var10.method134()) {
               var9.setTagInfo("BlockEntityTag", var10);
            }

            if (var8.method3381()) {
               var9.method32150(var8.method3380());
            }

            ItemEntity var11 = new ItemEntity(var1, (double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5, var9);
            var11.setDefaultPickupDelay();
            var1.addEntity(var11);
         } else {
            var8.method3743(var4);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      TileEntity var5 = var2.<TileEntity>method36459(Class9525.field44337);
      if (var5 instanceof Class940) {
         Class940 var6 = (Class940)var5;
         var2 = var2.method36456(field18940, (var1x, var2x) -> {
            for (int var5x = 0; var5x < var6.getSizeInventory(); var5x++) {
               var2x.accept(var6.getStackInSlot(var5x));
            }
         });
      }

      return super.method11697(var1, var2);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class940) {
            ((Class940)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class940) {
            var2.updateComparatorOutputLevel(var3, var1.getBlock());
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method11583(ItemStack var1, IBlockReader var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11583(var1, var2, var3, var4);
      CompoundNBT var7 = var1.method32145("BlockEntityTag");
      if (var7 != null) {
         if (var7.contains("LootTable", 8)) {
            var3.add(new StringTextComponent("???????"));
         }

         if (var7.contains("Items", 9)) {
            NonNullList<ItemStack> var8 = NonNullList.method68(27, ItemStack.EMPTY);
            Class7920.method26567(var7, var8);
            int var9 = 0;
            int var10 = 0;

            for (ItemStack var12 : var8) {
               if (!var12.isEmpty()) {
                  var10++;
                  if (var9 <= 4) {
                     var9++;
                     IFormattableTextComponent var13 = var12.method32149().deepCopy();
                     var13.appendString(" x").appendString(String.valueOf(var12.getCount()));
                     var3.add(var13);
                  }
               }
            }

            if (var10 - var9 > 0) {
               var3.add(new TranslationTextComponent("container.shulkerBox.more", var10 - var9).mergeStyle(TextFormatting.ITALIC));
            }
         }
      }
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      TileEntity var7 = var2.getTileEntity(var3);
      return !(var7 instanceof Class940) ? VoxelShapes.method27426() : VoxelShapes.create(((Class940)var7).method3747(var1));
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstoneFromInventory((IInventory)var2.getTileEntity(var3));
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      ItemStack var6 = super.getItem(var1, var2, var3);
      Class940 var7 = (Class940)var1.getTileEntity(var2);
      CompoundNBT var8 = var7.method3754(new CompoundNBT());
      if (!var8.method134()) {
         var6.setTagInfo("BlockEntityTag", var8);
      }

      return var6;
   }

   @Nullable
   public static Class112 method11954(Item var0) {
      return method11955(Block.method11537(var0));
   }

   @Nullable
   public static Class112 method11955(Block var0) {
      return !(var0 instanceof Class3368) ? null : ((Class3368)var0).method11957();
   }

   public static Block method11956(Class112 var0) {
      if (var0 == null) {
         return Blocks.field36896;
      } else {
         switch (Class7797.field33491[var0.ordinal()]) {
            case 1:
               return Blocks.field36897;
            case 2:
               return Blocks.field36898;
            case 3:
               return Blocks.field36899;
            case 4:
               return Blocks.field36900;
            case 5:
               return Blocks.field36901;
            case 6:
               return Blocks.field36902;
            case 7:
               return Blocks.field36903;
            case 8:
               return Blocks.field36904;
            case 9:
               return Blocks.field36905;
            case 10:
               return Blocks.field36906;
            case 11:
            default:
               return Blocks.field36907;
            case 12:
               return Blocks.field36908;
            case 13:
               return Blocks.field36909;
            case 14:
               return Blocks.field36910;
            case 15:
               return Blocks.field36911;
            case 16:
               return Blocks.field36912;
         }
      }
   }

   @Nullable
   public Class112 method11957() {
      return this.field18941;
   }

   public static ItemStack method11958(Class112 var0) {
      return new ItemStack(method11956(var0));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18939, var2.method252(var1.<Direction>method23463(field18939)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18939)));
   }
}

package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Class924 extends Class932 implements Class930, Class923, Class925, ITickableTileEntity {
   private static final int[] field5244 = new int[]{0};
   private static final int[] field5245 = new int[]{2, 1};
   private static final int[] field5246 = new int[]{1};
   public NonNullList<ItemStack> field5247 = NonNullList.<ItemStack>method68(3, ItemStack.EMPTY);
   private int field5248;
   private int field5249;
   private int field5250;
   private int field5251;
   public final Class8202 field5252 = new Class8204(this);
   private final Object2IntOpenHashMap<ResourceLocation> field5253 = new Object2IntOpenHashMap();
   public final IRecipeType<? extends Class4847> field5254;

   public Class924(TileEntityType<?> var1, IRecipeType<? extends Class4847> var2) {
      super(var1);
      this.field5254 = var2;
   }

   public static Map<Item, Integer> method3640() {
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      method3643(var2, Items.LAVA_BUCKET, 20000);
      method3643(var2, Blocks.field36795, 16000);
      method3643(var2, Items.field37967, 2400);
      method3643(var2, Items.field37798, 1600);
      method3643(var2, Items.field37799, 1600);
      method3642(var2, ItemTags.field26085, 300);
      method3642(var2, ItemTags.field26071, 300);
      method3642(var2, ItemTags.field26077, 300);
      method3642(var2, ItemTags.field26078, 150);
      method3642(var2, ItemTags.field26081, 300);
      method3642(var2, ItemTags.field26080, 300);
      method3643(var2, Blocks.OAK_FENCE, 300);
      method3643(var2, Blocks.field36868, 300);
      method3643(var2, Blocks.field36867, 300);
      method3643(var2, Blocks.field36869, 300);
      method3643(var2, Blocks.field36871, 300);
      method3643(var2, Blocks.field36870, 300);
      method3643(var2, Blocks.OAK_FENCE_GATE, 300);
      method3643(var2, Blocks.field36863, 300);
      method3643(var2, Blocks.field36862, 300);
      method3643(var2, Blocks.field36864, 300);
      method3643(var2, Blocks.field36866, 300);
      method3643(var2, Blocks.field36865, 300);
      method3643(var2, Blocks.NOTE_BLOCK, 300);
      method3643(var2, Blocks.field36525, 300);
      method3643(var2, Blocks.LECTERN, 300);
      method3643(var2, Blocks.JUKEBOX, 300);
      method3643(var2, Blocks.CHEST, 300);
      method3643(var2, Blocks.TRAPPED_CHEST, 300);
      method3643(var2, Blocks.CRAFTING_TABLE, 300);
      method3643(var2, Blocks.field36720, 300);
      method3642(var2, ItemTags.field26094, 300);
      method3643(var2, Items.BOW, 300);
      method3643(var2, Items.field37906, 300);
      method3643(var2, Blocks.LADDER, 300);
      method3642(var2, ItemTags.field26115, 200);
      method3643(var2, Items.field37806, 200);
      method3643(var2, Items.field37805, 200);
      method3643(var2, Items.field37809, 200);
      method3643(var2, Items.field37808, 200);
      method3643(var2, Items.field37807, 200);
      method3642(var2, ItemTags.field26076, 200);
      method3642(var2, ItemTags.field26113, 1200);
      method3642(var2, ItemTags.field26070, 100);
      method3642(var2, ItemTags.field26073, 100);
      method3643(var2, Items.field37835, 100);
      method3642(var2, ItemTags.field26083, 100);
      method3643(var2, Items.field37836, 100);
      method3642(var2, ItemTags.field26075, 67);
      method3643(var2, Blocks.field36963, 4001);
      method3643(var2, Items.CROSSBOW, 300);
      method3643(var2, Blocks.field37009, 50);
      method3643(var2, Blocks.DEAD_BUSH, 100);
      method3643(var2, Blocks.field37053, 400);
      method3643(var2, Blocks.LOOM, 300);
      method3643(var2, Blocks.BARREL, 300);
      method3643(var2, Blocks.CARTOGRAPHY_TABLE, 300);
      method3643(var2, Blocks.FLETCHING_TABLE, 300);
      method3643(var2, Blocks.SMITHING_TABLE, 300);
      method3643(var2, Blocks.COMPOSTER, 300);
      return var2;
   }

   private static boolean method3641(Item var0) {
      return ItemTags.field26111.contains(var0);
   }

   private static void method3642(Map<Item, Integer> var0, ITag<Item> var1, int var2) {
      for (Item var6 : var1.getAllElements()) {
         if (!method3641(var6)) {
            var0.put(var6, var2);
         }
      }
   }

   private static void method3643(Map<Item, Integer> var0, IItemProvider var1, int var2) {
      Item var5 = var1.asItem();
      if (!method3641(var5)) {
         var0.put(var5, var2);
      } else if (SharedConstants.developmentMode) {
         throw (IllegalStateException) Util.pauseDevMode(
            new IllegalStateException(
               "A developer tried to explicitly make fire resistant item "
                  + var5.method11731((ItemStack)null).getString()
                  + " a furnace fuel. That will not work!"
            )
         );
      }
   }

   private boolean method3644() {
      return this.field5248 > 0;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5247 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      ItemStackHelper.loadAllItems(var2, this.field5247);
      this.field5248 = var2.getShort("BurnTime");
      this.field5250 = var2.getShort("CookTime");
      this.field5251 = var2.getShort("CookTimeTotal");
      this.field5249 = this.method3650(this.field5247.get(1));
      CompoundNBT var5 = var2.getCompound("RecipesUsed");

      for (String var7 : var5.keySet()) {
         this.field5253.put(new ResourceLocation(var7), var5.getInt(var7));
      }
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.putShort("BurnTime", (short)this.field5248);
      var1.putShort("CookTime", (short)this.field5250);
      var1.putShort("CookTimeTotal", (short)this.field5251);
      ItemStackHelper.saveAllItems(var1, this.field5247);
      CompoundNBT var4 = new CompoundNBT();
      this.field5253.forEach((var1x, var2) -> var4.putInt(var1x.toString(), var2));
      var1.put("RecipesUsed", var4);
      return var1;
   }

   @Override
   public void tick() {
      boolean var3 = this.method3644();
      boolean var4 = false;
      if (this.method3644()) {
         this.field5248--;
      }

      if (!this.world.isRemote) {
         ItemStack var5 = this.field5247.get(1);
         if (this.method3644() || !var5.isEmpty() && !this.field5247.get(0).isEmpty()) {
            IRecipe var6 = this.world.getRecipeManager().method1030(this.field5254, this, this.world).orElse(null);
            if (!this.method3644() && this.method3648(var6)) {
               this.field5248 = this.method3650(var5);
               this.field5249 = this.field5248;
               if (this.method3644()) {
                  var4 = true;
                  if (!var5.isEmpty()) {
                     Item var7 = var5.getItem();
                     var5.shrink(1);
                     if (var5.isEmpty()) {
                        Item var8 = var7.method11722();
                        this.field5247.set(1, var8 != null ? new ItemStack(var8) : ItemStack.EMPTY);
                     }
                  }
               }
            }

            if (this.method3644() && this.method3648(var6)) {
               this.field5250++;
               if (this.field5250 == this.field5251) {
                  this.field5250 = 0;
                  this.field5251 = this.method3651();
                  this.method3649(var6);
                  var4 = true;
               }
            } else {
               this.field5250 = 0;
            }
         } else if (!this.method3644() && this.field5250 > 0) {
            this.field5250 = MathHelper.clamp(this.field5250 - 2, 0, this.field5251);
         }

         if (var3 != this.method3644()) {
            var4 = true;
            this.world
               .setBlockState(this.pos, this.world.getBlockState(this.pos).with(Class3350.field18876, Boolean.valueOf(this.method3644())), 3);
         }
      }

      if (var4) {
         this.markDirty();
      }
   }

   public boolean method3648(IRecipe<?> var1) {
      if (!this.field5247.get(0).isEmpty() && var1 != null) {
         ItemStack var4 = var1.getRecipeOutput();
         if (!var4.isEmpty()) {
            ItemStack var5 = this.field5247.get(2);
            if (var5.isEmpty()) {
               return true;
            } else if (var5.method32132(var4)) {
               return var5.getCount() < this.getInventoryStackLimit() && var5.getCount() < var5.getMaxStackSize() ? true : var5.getCount() < var4.getMaxStackSize();
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method3649(IRecipe<?> var1) {
      if (var1 != null && this.method3648(var1)) {
         ItemStack var4 = this.field5247.get(0);
         ItemStack var5 = var1.getRecipeOutput();
         ItemStack var6 = this.field5247.get(2);
         if (!var6.isEmpty()) {
            if (var6.getItem() == var5.getItem()) {
               var6.grow(1);
            }
         } else {
            this.field5247.set(2, var5.copy());
         }

         if (!this.world.isRemote) {
            this.method3636(var1);
         }

         if (var4.getItem() == Blocks.field36453.asItem()
            && !this.field5247.get(1).isEmpty()
            && this.field5247.get(1).getItem() == Items.BUCKET) {
            this.field5247.set(1, new ItemStack(Items.WATER_BUCKET));
         }

         var4.shrink(1);
      }
   }

   public int method3650(ItemStack var1) {
      if (!var1.isEmpty()) {
         Item var4 = var1.getItem();
         return method3640().getOrDefault(var4, 0);
      } else {
         return 0;
      }
   }

   public int method3651() {
      return this.world.getRecipeManager().method1030(this.field5254, this, this.world).<Integer>map(Class4847::method14977).orElse(200);
   }

   public static boolean method3652(ItemStack var0) {
      return method3640().containsKey(var0.getItem());
   }

   @Override
   public int[] method3653(Direction var1) {
      if (var1 != Direction.DOWN) {
         return var1 != Direction.UP ? field5246 : field5244;
      } else {
         return field5245;
      }
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return this.isItemValidForSlot(var1, var2);
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      if (var3 == Direction.DOWN && var1 == 1) {
         Item var6 = var2.getItem();
         if (var6 != Items.WATER_BUCKET && var6 != Items.BUCKET) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int getSizeInventory() {
      return this.field5247.size();
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5247) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      return this.field5247.get(var1);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      return ItemStackHelper.method26563(this.field5247, var1, var2);
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      return ItemStackHelper.method26564(this.field5247, var1);
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      ItemStack var5 = this.field5247.get(var1);
      boolean var6 = !var2.isEmpty() && var2.method32132(var5) && ItemStack.method32127(var2, var5);
      this.field5247.set(var1, var2);
      if (var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      if (var1 == 0 && !var6) {
         this.field5251 = this.method3651();
         this.field5250 = 0;
         this.markDirty();
      }
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return this.world.getTileEntity(this.pos) == this
         ? var1.getDistanceNearest((double)this.pos.getX() + 0.5, (double)this.pos.getY() + 0.5, (double)this.pos.getZ() + 0.5)
            <= 64.0
         : false;
   }

   @Override
   public boolean isItemValidForSlot(int var1, ItemStack var2) {
      if (var1 != 2) {
         if (var1 != 1) {
            return true;
         } else {
            ItemStack var5 = this.field5247.get(1);
            return method3652(var2) || var2.getItem() == Items.BUCKET && var5.getItem() != Items.BUCKET;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method3625() {
      this.field5247.clear();
   }

   @Override
   public void method3636(IRecipe<?> var1) {
      if (var1 != null) {
         ResourceLocation var4 = var1.getId();
         this.field5253.addTo(var4, 1);
      }
   }

   @Nullable
   @Override
   public IRecipe<?> method3637() {
      return null;
   }

   @Override
   public void method3638(PlayerEntity var1) {
   }

   public void method3656(PlayerEntity var1) {
      List var4 = this.method3657(var1.world, var1.getPositionVec());
      var1.method2778(var4);
      this.field5253.clear();
   }

   public List<IRecipe<?>> method3657(World var1, Vector3d var2) {
      ArrayList var5 = Lists.newArrayList();
      ObjectIterator var6 = this.field5253.object2IntEntrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         var1.getRecipeManager().method1035((ResourceLocation)var7.getKey()).ifPresent(var4 -> {
            var5.add(var4);
            method3658(var1, var2, var7.getIntValue(), ((Class4847)var4).method14976());
         });
      }

      return var5;
   }

   private static void method3658(World var0, Vector3d var1, int var2, float var3) {
      int var6 = MathHelper.floor((float)var2 * var3);
      float var7 = MathHelper.method37807((float)var2 * var3);
      if (var7 != 0.0F && Math.random() < (double)var7) {
         var6++;
      }

      while (var6 > 0) {
         int var8 = ExperienceOrbEntity.getXPSplit(var6);
         var6 -= var8;
         var0.addEntity(new ExperienceOrbEntity(var0, var1.x, var1.y, var1.z, var8));
      }
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5247) {
         var1.method19117(var5);
      }
   }

   // $VF: synthetic method
   public static int method3662(Class924 var0) {
      return var0.field5248;
   }

   // $VF: synthetic method
   public static int method3663(Class924 var0) {
      return var0.field5249;
   }

   // $VF: synthetic method
   public static int method3664(Class924 var0) {
      return var0.field5250;
   }

   // $VF: synthetic method
   public static int method3665(Class924 var0) {
      return var0.field5251;
   }

   // $VF: synthetic method
   public static int method3666(Class924 var0, int var1) {
      return var0.field5248 = var1;
   }

   // $VF: synthetic method
   public static int method3667(Class924 var0, int var1) {
      return var0.field5249 = var1;
   }

   // $VF: synthetic method
   public static int method3668(Class924 var0, int var1) {
      return var0.field5250 = var1;
   }

   // $VF: synthetic method
   public static int method3669(Class924 var0, int var1) {
      return var0.field5251 = var1;
   }
}

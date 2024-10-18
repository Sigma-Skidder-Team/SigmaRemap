package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class Class5825 extends Class5823 {
   private static String[] field25521;
   private final World field25522;
   private Class4846 field25523;
   private final List<Class4846> field25524;

   public Class5825(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5825(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.SMITHING, var1, var2, var3);
      this.field25522 = var2.field5444.world;
      this.field25524 = this.field25522.getRecipeManager().<IInventory, Class4846>method1031(Class7207.field30941);
   }

   @Override
   public boolean method18191(BlockState var1) {
      return var1.isIn(Blocks.SMITHING_TABLE);
   }

   @Override
   public boolean method18189(PlayerEntity var1, boolean var2) {
      return this.field25523 != null && this.field25523.method14963(this.field25513, this.field25522);
   }

   @Override
   public ItemStack method18190(PlayerEntity var1, ItemStack var2) {
      var2.method32136(var1.world, var1, var2.getCount());
      this.field25512.method3638(var1);
      this.method18200(0);
      this.method18200(1);
      this.field25514.method31716((var0, var1x) -> var0.playEvent(1044, var1x, 0));
      return var2;
   }

   private void method18200(int var1) {
      ItemStack var4 = this.field25513.getStackInSlot(var1);
      var4.shrink(1);
      this.field25513.setInventorySlotContents(var1, var4);
   }

   @Override
   public void method18192() {
      List var3 = this.field25522.getRecipeManager().<IInventory, Class4846>method1032(Class7207.field30941, this.field25513, this.field25522);
      if (!var3.isEmpty()) {
         this.field25523 = (Class4846)var3.get(0);
         ItemStack var4 = this.field25523.method14962(this.field25513);
         this.field25512.method3636(this.field25523);
         this.field25512.setInventorySlotContents(0, var4);
      } else {
         this.field25512.setInventorySlotContents(0, ItemStack.EMPTY);
      }
   }

   @Override
   public boolean method18193(ItemStack var1) {
      return this.field25524.stream().anyMatch(var1x -> var1x.method14972(var1));
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return var2.field25578 != this.field25512 && super.canMergeSlot(var1, var2);
   }
}

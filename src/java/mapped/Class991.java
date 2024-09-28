package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class991 extends Class919 {
   private static String[] field5477;

   public Class991(EntityType<? extends Class991> var1, World var2) {
      super(var1, var2);
   }

   public Class991(World var1, double var2, double var4, double var6) {
      super(EntityType.field41051, var2, var4, var6, var1);
   }

   @Override
   public void method3586(DamageSource var1) {
      super.method3586(var1);
      if (this.world.getGameRules().getBoolean(Class5462.field24229)) {
         this.entityDropItem(Blocks.CHEST);
      }
   }

   @Override
   public int getSizeInventory() {
      return 27;
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.CHEST;
   }

   @Override
   public BlockState method3604() {
      return Blocks.CHEST.method11579().with(Class3348.field18865, Direction.NORTH);
   }

   @Override
   public int method3606() {
      return 8;
   }

   @Override
   public Container method3628(int var1, PlayerInventory var2) {
      return ChestContainer.method18162(var1, var2, this);
   }

   @Override
   public ITextComponent method2954() {
      return null;
   }
}

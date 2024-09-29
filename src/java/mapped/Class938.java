package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class938 extends Class919 implements Class937 {
   private boolean field5299 = true;
   private int field5300 = -1;
   private final BlockPos field5301 = BlockPos.ZERO;

   public Class938(EntityType<? extends Class938> var1, World var2) {
      super(var1, var2);
   }

   public Class938(World var1, double var2, double var4, double var6) {
      super(EntityType.field41054, var2, var4, var6, var1);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.HOPPER;
   }

   @Override
   public BlockState method3604() {
      return Blocks.HOPPER.getDefaultState();
   }

   @Override
   public int method3606() {
      return 1;
   }

   @Override
   public int getSizeInventory() {
      return 5;
   }

   @Override
   public void method3589(int var1, int var2, int var3, boolean var4) {
      boolean var7 = !var4;
      if (var7 != this.method3735()) {
         this.method3736(var7);
      }
   }

   public boolean method3735() {
      return this.field5299;
   }

   public void method3736(boolean var1) {
      this.field5299 = var1;
   }

   @Override
   public World method3734() {
      return this.world;
   }

   @Override
   public double method3718() {
      return this.getPosX();
   }

   @Override
   public double method3719() {
      return this.getPosY() + 0.5;
   }

   @Override
   public double method3720() {
      return this.getPosZ();
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.world.isRemote && this.isAlive() && this.method3735()) {
         BlockPos var3 = this.getPosition();
         if (!var3.equals(this.field5301)) {
            this.method3738(0);
         } else {
            this.field5300--;
         }

         if (!this.method3739()) {
            this.method3738(0);
            if (this.method3737()) {
               this.method3738(4);
               this.markDirty();
            }
         }
      }
   }

   public boolean method3737() {
      if (!Class936.method3705(this)) {
         List var3 = this.world.<Entity>getEntitiesInAABBexcluding(ItemEntity.class, this.getBoundingBox().grow(0.25, 0.0, 0.25), Class8088.field34757);
         if (!var3.isEmpty()) {
            Class936.method3707(this, (ItemEntity)var3.get(0));
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method3586(DamageSource var1) {
      super.method3586(var1);
      if (this.world.getGameRules().getBoolean(Class5462.field24229)) {
         this.entityDropItem(Blocks.HOPPER);
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("TransferCooldown", this.field5300);
      var1.putBoolean("Enabled", this.field5299);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5300 = var1.getInt("TransferCooldown");
      this.field5299 = !var1.contains("Enabled") ? true : var1.getBoolean("Enabled");
   }

   public void method3738(int var1) {
      this.field5300 = var1;
   }

   public boolean method3739() {
      return this.field5300 > 0;
   }

   @Override
   public Container method3628(int var1, PlayerInventory var2) {
      return new Class5816(var1, var2, this);
   }

   @Override
   public ITextComponent getDefaultName2() {
      return null;
   }
}

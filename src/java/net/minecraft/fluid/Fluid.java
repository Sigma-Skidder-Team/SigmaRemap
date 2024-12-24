package net.minecraft.fluid;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.ITag;
import net.minecraft.util.Direction;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Fluid {
   public static final ObjectIntIdentityMap<FluidState> STATE_REGISTRY = new ObjectIntIdentityMap<FluidState>();
   public final StateContainer<Fluid, FluidState> field32709;
   private FluidState field32710;

   public Fluid() {
      StateContainer.Builder<Fluid, FluidState> var3 = new StateContainer.Builder<>(this);
      this.method25046(var3);
      this.field32709 = var3.method24739(Fluid::method25049, FluidState::new);
      this.method25048(this.field32709.getBaseState());
   }

   public void method25046(StateContainer.Builder<Fluid, FluidState> var1) {
   }

   public StateContainer<Fluid, FluidState> getStateContainer() {
      return this.field32709;
   }

   public final void method25048(FluidState var1) {
      this.field32710 = var1;
   }

   public final FluidState method25049() {
      return this.field32710;
   }

   public abstract Item method25050();

   public void method25051(World var1, BlockPos var2, FluidState var3, Random var4) {
   }

   public void method25052(World var1, BlockPos var2, FluidState var3) {
   }

   public void method25053(World var1, BlockPos var2, FluidState var3, Random var4) {
   }

   @Nullable
   public IParticleData method25054() {
      return null;
   }

   public abstract boolean method25055(FluidState var1, IBlockReader var2, BlockPos var3, Fluid var4, Direction var5);

   public abstract Vector3d method25056(IBlockReader var1, BlockPos var2, FluidState var3);

   public abstract int getTickRate(IWorldReader var1);

   public boolean method25058() {
      return false;
   }

   public boolean method25059() {
      return false;
   }

   public abstract float method25060();

   public abstract float method25061(FluidState var1, IBlockReader var2, BlockPos var3);

   public abstract float method25062(FluidState var1);

   public abstract BlockState method25063(FluidState var1);

   public abstract boolean method25064(FluidState var1);

   public abstract int method25065(FluidState var1);

   public boolean method25066(Fluid var1) {
      return var1 == this;
   }

   public boolean method25067(ITag<Fluid> var1) {
      return var1.contains(this);
   }

   public abstract VoxelShape method25068(FluidState var1, IBlockReader var2, BlockPos var3);
}

package net.minecraft.fluid;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.state.StateHolder;
import net.minecraft.state.Property;
import net.minecraft.tags.ITag;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.block.BlockState;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public final class FluidState extends StateHolder<Fluid, FluidState> {
   private static String[] field31583;
   public static final Codec<FluidState> field31584 = method23469(Registry.FLUID, Fluid::method25049).stable();

   public FluidState(Fluid var1, ImmutableMap<Property<?>, Comparable<?>> var2, MapCodec<FluidState> var3) {
      super(var1, var2, var3);
   }

   public Fluid getFluid() {
      return this.field31579;
   }

   public boolean isSource() {
      return this.getFluid().method25064(this);
   }

   public boolean isEmpty() {
      return this.getFluid().method25059();
   }

   public float method23475(IBlockReader var1, BlockPos var2) {
      return this.getFluid().method25061(this, var1, var2);
   }

   public float method23476() {
      return this.getFluid().method25062(this);
   }

   public int method23477() {
      return this.getFluid().method25065(this);
   }

   public boolean method23478(IBlockReader var1, BlockPos var2) {
      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            BlockPos var7 = var2.add(var5, 0, var6);
            FluidState var8 = var1.getFluidState(var7);
            if (!var8.getFluid().method25066(this.getFluid()) && !var1.getBlockState(var7).method23409(var1, var7)) {
               return true;
            }
         }
      }

      return false;
   }

   public void method23479(World var1, BlockPos var2) {
      this.getFluid().method25052(var1, var2, this);
   }

   public void method23480(World var1, BlockPos var2, Random var3) {
      this.getFluid().method25051(var1, var2, this, var3);
   }

   public boolean method23481() {
      return this.getFluid().method25058();
   }

   public void method23482(World var1, BlockPos var2, Random var3) {
      this.getFluid().method25053(var1, var2, this, var3);
   }

   public Vector3d method23483(IBlockReader var1, BlockPos var2) {
      return this.getFluid().method25056(var1, var2, this);
   }

   public BlockState getBlockState() {
      return this.getFluid().method25063(this);
   }

   @Nullable
   public IParticleData method23485() {
      return this.getFluid().method25054();
   }

   public boolean method23486(ITag<Fluid> var1) {
      return this.getFluid().method25067(var1);
   }

   public float method23487() {
      return this.getFluid().method25060();
   }

   public boolean method23488(IBlockReader var1, BlockPos var2, Fluid var3, Direction var4) {
      return this.getFluid().method25055(this, var1, var2, var3, var4);
   }

   public VoxelShape method23489(IBlockReader var1, BlockPos var2) {
      return this.getFluid().method25068(this, var1, var2);
   }
}

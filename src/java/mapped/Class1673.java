package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class Class1673 extends Class1672 {
   private final Chunk field9109;

   public Class1673(Chunk var1) {
      super(var1.method7072(), Class8922.field40388);
      this.field9109 = var1;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.field9109.getTileEntity(var1);
   }

   @Nullable
   @Override
   public BlockState getBlockState(BlockPos var1) {
      return this.field9109.getBlockState(var1);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.field9109.getFluidState(var1);
   }

   @Override
   public int method7033() {
      return this.field9109.method7033();
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      return null;
   }

   @Override
   public void method7062(BlockPos var1, TileEntity var2) {
   }

   @Override
   public void method7063(Entity var1) {
   }

   @Override
   public void method7111(ChunkStatus var1) {
   }

   @Override
   public Class7038[] method7067() {
      return this.field9109.method7067();
   }

   @Nullable
   @Override
   public Class196 method7112() {
      return this.field9109.method7131();
   }

   @Override
   public void method7069(Class101 var1, long[] var2) {
   }

   private Class101 method7126(Class101 var1) {
      if (var1 != Class101.field295) {
         return var1 != Class101.field297 ? var1 : Class101.field298;
      } else {
         return Class101.field296;
      }
   }

   @Override
   public int method7071(Class101 var1, int var2, int var3) {
      return this.field9109.method7071(this.method7126(var1), var2, var3);
   }

   @Override
   public Class7481 method7072() {
      return this.field9109.method7072();
   }

   @Override
   public void method7073(long var1) {
   }

   @Nullable
   @Override
   public Class5444<?> method7097(Structure<?> var1) {
      return this.field9109.method7097(var1);
   }

   @Override
   public void method7098(Structure<?> var1, Class5444<?> var2) {
   }

   @Override
   public Map<Structure<?>, Class5444<?>> method7074() {
      return this.field9109.method7074();
   }

   @Override
   public void method7075(Map<Structure<?>, Class5444<?>> var1) {
   }

   @Override
   public LongSet method7099(Structure<?> var1) {
      return this.field9109.method7099(var1);
   }

   @Override
   public void method7100(Structure<?> var1, long var2) {
   }

   @Override
   public Map<Structure<?>, LongSet> method7101() {
      return this.field9109.method7101();
   }

   @Override
   public void method7102(Map<Structure<?>, LongSet> var1) {
   }

   @Override
   public Class1684 method7077() {
      return this.field9109.method7077();
   }

   @Override
   public void method7078(boolean var1) {
   }

   @Override
   public boolean method7079() {
      return false;
   }

   @Override
   public ChunkStatus method7080() {
      return this.field9109.method7080();
   }

   @Override
   public void method7081(BlockPos var1) {
   }

   @Override
   public void method7082(BlockPos var1) {
   }

   @Override
   public void method7085(CompoundNBT var1) {
   }

   @Nullable
   @Override
   public CompoundNBT method7086(BlockPos var1) {
      return this.field9109.method7086(var1);
   }

   @Nullable
   @Override
   public CompoundNBT method7087(BlockPos var1) {
      return this.field9109.method7087(var1);
   }

   @Override
   public void method7110(Class1684 var1) {
   }

   @Override
   public Stream<BlockPos> method7088() {
      return this.field9109.method7088();
   }

   @Override
   public Class6806<Block> method7089() {
      return new Class6806<Block>(var0 -> var0.method11579().isAir(), this.method7072());
   }

   @Override
   public Class6806<Fluid> method7090() {
      return new Class6806<Fluid>(var0 -> var0 == Class9479.field44064, this.method7072());
   }

   @Override
   public BitSet method7116(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public BitSet method7117(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   public Chunk method7127() {
      return this.field9109;
   }

   @Override
   public boolean method7095() {
      return this.field9109.method7095();
   }

   @Override
   public void method7096(boolean var1) {
      this.field9109.method7096(var1);
   }
}

package net.minecraft.tileentity;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

import javax.annotation.Nullable;

public abstract class TileEntity {
   private static final Logger field5322 = LogManager.getLogger();
   private final TileEntityType<?> field5323;
   public World field5324;
   public BlockPos field5325 = BlockPos.ZERO;
   public boolean field5326;
   private BlockState field5327;
   private boolean field5328;

   public TileEntity(TileEntityType<?> var1) {
      this.field5323 = var1;
   }

   @Nullable
   public World method3734() {
      return this.field5324;
   }

   public void method3769(World var1, BlockPos var2) {
      this.field5324 = var1;
      this.field5325 = var2.toImmutable();
   }

   public boolean method3770() {
      return this.field5324 != null;
   }

   public void method3645(BlockState var1, CompoundNBT var2) {
      this.field5325 = new BlockPos(var2.getInt("x"), var2.getInt("y"), var2.getInt("z"));
   }

   public CompoundNBT write(CompoundNBT var1) {
      return this.method3771(var1);
   }

   private CompoundNBT method3771(CompoundNBT var1) {
      ResourceLocation var4 = TileEntityType.method13793(this.method3786());
      if (var4 != null) {
         var1.method109("id", var4.toString());
         var1.putInt("x", this.field5325.getX());
         var1.putInt("y", this.field5325.getY());
         var1.putInt("z", this.field5325.getZ());
         return var1;
      } else {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      }
   }

   @Nullable
   public static TileEntity method3772(BlockState var0, CompoundNBT var1) {
      String var4 = var1.getString("id");
      return Registry.field16078.method9187(new ResourceLocation(var4)).<TileEntity>map(var1x -> {
         try {
            return var1x.method13795();
         } catch (Throwable var5) {
            field5322.error("Failed to create block entity {}", var4, var5);
            return null;
         }
      }).<TileEntity>map(var3 -> {
         try {
            var3.method3645(var0, var1);
            return (TileEntity)var3;
         } catch (Throwable var7) {
            field5322.error("Failed to load data for block entity {}", var4, var7);
            return null;
         }
      }).orElseGet(() -> {
         field5322.warn("Skipping BlockEntity with id {}", var4);
         return null;
      });
   }

   public void markDirty() {
      if (this.field5324 != null) {
         this.field5327 = this.field5324.getBlockState(this.field5325);
         this.field5324.method6775(this.field5325, this);
         if (!this.field5327.isAir()) {
            this.field5324.updateComparatorOutputLevel(this.field5325, this.field5327.getBlock());
         }
      }
   }

   public double method3773() {
      return 64.0;
   }

   public BlockPos getPos() {
      return this.field5325;
   }

   public BlockState method3775() {
      if (this.field5327 == null) {
         this.field5327 = this.field5324.getBlockState(this.field5325);
      }

      return this.field5327;
   }

   @Nullable
   public SUpdateTileEntityPacket method3776() {
      return null;
   }

   public CompoundNBT method3777() {
      return this.method3771(new CompoundNBT());
   }

   public boolean method3778() {
      return this.field5326;
   }

   public void method3765() {
      this.field5326 = true;
   }

   public void method3779() {
      this.field5326 = false;
   }

   public boolean method3751(int var1, int var2) {
      return false;
   }

   public void method3780() {
      this.field5327 = null;
   }

   public void method3781(CrashReportCategory var1) {
      var1.addDetail("Name", () -> Registry.field16078.getKey(this.method3786()) + " // " + this.getClass().getCanonicalName());
      if (this.field5324 != null) {
         CrashReportCategory.addBlockInfo(var1, this.field5325, this.method3775());
         CrashReportCategory.addBlockInfo(var1, this.field5325, this.field5324.getBlockState(this.field5325));
      }
   }

   public void method3782(BlockPos var1) {
      this.field5325 = var1.toImmutable();
   }

   public boolean method3783() {
      return false;
   }

   public void method3784(Class80 var1) {
   }

   public void method3785(Class2089 var1) {
   }

   public TileEntityType<?> method3786() {
      return this.field5323;
   }

   public void method3787() {
      if (!this.field5328) {
         this.field5328 = true;
         field5322.warn("Block entity invalid: {} @ {}", new Supplier[]{() -> Registry.field16078.getKey(this.method3786()), this::getPos});
      }
   }
}

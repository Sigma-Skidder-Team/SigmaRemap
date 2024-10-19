package net.minecraft.tileentity;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
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
   public World world;
   public BlockPos pos = BlockPos.ZERO;
   public boolean field5326;
   private BlockState field5327;
   private boolean field5328;

   public TileEntity(TileEntityType<?> var1) {
      this.field5323 = var1;
   }

   @Nullable
   public World method3734() {
      return this.world;
   }

   public void method3769(World var1, BlockPos var2) {
      this.world = var1;
      this.pos = var2.toImmutable();
   }

   public boolean method3770() {
      return this.world != null;
   }

   public void read(BlockState var1, CompoundNBT var2) {
      this.pos = new BlockPos(var2.getInt("x"), var2.getInt("y"), var2.getInt("z"));
   }

   public CompoundNBT write(CompoundNBT var1) {
      return this.method3771(var1);
   }

   private CompoundNBT method3771(CompoundNBT var1) {
      ResourceLocation var4 = TileEntityType.method13793(this.method3786());
      if (var4 != null) {
         var1.putString("id", var4.toString());
         var1.putInt("x", this.pos.getX());
         var1.putInt("y", this.pos.getY());
         var1.putInt("z", this.pos.getZ());
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
            var3.read(var0, var1);
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
      if (this.world != null) {
         this.field5327 = this.world.getBlockState(this.pos);
         this.world.method6775(this.pos, this);
         if (!this.field5327.isAir()) {
            this.world.updateComparatorOutputLevel(this.pos, this.field5327.getBlock());
         }
      }
   }

   public double method3773() {
      return 64.0;
   }

   public BlockPos getPos() {
      return this.pos;
   }

   public BlockState getBlockState() {
      if (this.field5327 == null) {
         this.field5327 = this.world.getBlockState(this.pos);
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

   public boolean receiveClientEvent(int var1, int var2) {
      return false;
   }

   public void method3780() {
      this.field5327 = null;
   }

   public void method3781(CrashReportCategory var1) {
      var1.addDetail("Name", () -> Registry.field16078.getKey(this.method3786()) + " // " + this.getClass().getCanonicalName());
      if (this.world != null) {
         CrashReportCategory.addBlockInfo(var1, this.pos, this.getBlockState());
         CrashReportCategory.addBlockInfo(var1, this.pos, this.world.getBlockState(this.pos));
      }
   }

   public void method3782(BlockPos var1) {
      this.pos = var1.toImmutable();
   }

   public boolean method3783() {
      return false;
   }

   public void method3784(Rotation var1) {
   }

   public void method3785(Mirror var1) {
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

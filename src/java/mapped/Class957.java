package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Class957 extends Class956 implements ITickableTileEntity {
   private static final Logger field5371 = LogManager.getLogger();
   private long field5372;
   private int field5373;
   private BlockPos field5374;
   private boolean field5375;

   public Class957() {
      super(TileEntityType.field21441);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.method103("Age", this.field5372);
      if (this.field5374 != null) {
         var1.put("ExitPortal", Class8354.method29284(this.field5374));
      }

      if (this.field5375) {
         var1.putBoolean("ExactTeleport", this.field5375);
      }

      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5372 = var2.getLong("Age");
      if (var2.contains("ExitPortal", 10)) {
         this.field5374 = Class8354.method29283(var2.getCompound("ExitPortal"));
      }

      this.field5375 = var2.getBoolean("ExactTeleport");
   }

   @Override
   public double method3773() {
      return 256.0;
   }

   @Override
   public void tick() {
      boolean var3 = this.method3872();
      boolean var4 = this.method3873();
      this.field5372++;
      if (!var4) {
         if (!this.world.isRemote) {
            List var5 = this.world.<Entity>getEntitiesInAABBexcluding(Entity.class, new AxisAlignedBB(this.getPos()), Class957::method3871);
            if (!var5.isEmpty()) {
               this.method3877((Entity)var5.get(this.world.rand.nextInt(var5.size())));
            }

            if (this.field5372 % 2400L == 0L) {
               this.method3876();
            }
         }
      } else {
         this.field5373--;
      }

      if (var3 != this.method3872() || var4 != this.method3873()) {
         this.markDirty();
      }
   }

   public static boolean method3871(Entity var0) {
      return Class8088.field34763.test(var0) && !var0.method3415().method3219();
   }

   public boolean method3872() {
      return this.field5372 < 200L;
   }

   public boolean method3873() {
      return this.field5373 > 0;
   }

   public float method3874(float var1) {
      return MathHelper.clamp(((float)this.field5372 + var1) / 200.0F, 0.0F, 1.0F);
   }

   public float method3875(float var1) {
      return 1.0F - MathHelper.clamp(((float)this.field5373 - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 8, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public void method3876() {
      if (!this.world.isRemote) {
         this.field5373 = 40;
         this.world.addBlockEvent(this.getPos(), this.getBlockState().getBlock(), 1, 0);
         this.markDirty();
      }
   }

   @Override
   public boolean receiveClientEvent(int var1, int var2) {
      if (var1 != 1) {
         return super.receiveClientEvent(var1, var2);
      } else {
         this.field5373 = 40;
         return true;
      }
   }

   public void method3877(Entity var1) {
      if (this.world instanceof ServerWorld && !this.method3873()) {
         this.field5373 = 100;
         if (this.field5374 == null && this.world.getDimensionKey() == World.THE_END) {
            this.method3879((ServerWorld)this.world);
         }

         if (this.field5374 != null) {
            BlockPos var4 = !this.field5375 ? this.method3878() : this.field5374;
            Entity var5;
            if (!(var1 instanceof Class895)) {
               var5 = var1.method3415();
            } else {
               Entity var6 = ((Class895)var1).method3460();
               if (var6 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44468.method15169((ServerPlayerEntity)var6, this.world.getBlockState(this.getPos()));
               }

               if (var6 == null) {
                  var5 = var1;
               } else {
                  var5 = var6;
                  var1.remove();
               }
            }

            var5.method3218();
            var5.teleportKeepLoaded((double)var4.getX() + 0.5, (double)var4.getY(), (double)var4.getZ() + 0.5);
         }

         this.method3876();
      }
   }

   private BlockPos method3878() {
      BlockPos var3 = method3880(this.world, this.field5374.add(0, 2, 0), 5, false);
      field5371.debug("Best exit position for portal at {} is {}", this.field5374, var3);
      return var3.up();
   }

   private void method3879(ServerWorld var1) {
      Vector3d var4 = new Vector3d((double)this.getPos().getX(), 0.0, (double)this.getPos().getZ()).method11333();
      Vector3d var5 = var4.scale(1024.0);

      for (int var6 = 16; method3881(var1, var5).getTopFilledSegment() > 0 && var6-- > 0; var5 = var5.add(var4.scale(-16.0))) {
         field5371.debug("Skipping backwards past nonempty chunk at {}", var5);
      }

      for (int var7 = 16; method3881(var1, var5).getTopFilledSegment() == 0 && var7-- > 0; var5 = var5.add(var4.scale(16.0))) {
         field5371.debug("Skipping forward past empty chunk at {}", var5);
      }

      field5371.debug("Found chunk at {}", var5);
      Chunk var8 = method3881(var1, var5);
      this.field5374 = method3882(var8);
      if (this.field5374 != null) {
         field5371.debug("Found block at {}", this.field5374);
      } else {
         this.field5374 = new BlockPos(var5.x + 0.5, 75.0, var5.z + 0.5);
         field5371.debug("Failed to find suitable block, settling on {}", this.field5374);
         Features.field41637.func_242765_a(var1, var1.getChunkProvider().getChunkGenerator(), new Random(this.field5374.method8332()), this.field5374);
      }

      this.field5374 = method3880(var1, this.field5374, 16, true);
      field5371.debug("Creating portal at {}", this.field5374);
      this.field5374 = this.field5374.up(10);
      this.method3883(var1, this.field5374);
      this.markDirty();
   }

   private static BlockPos method3880(IBlockReader var0, BlockPos var1, int var2, boolean var3) {
      BlockPos var6 = null;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            if (var7 != 0 || var8 != 0 || var3) {
               for (int var9 = 255; var9 > (var6 != null ? var6.getY() : 0); var9--) {
                  BlockPos var10 = new BlockPos(var1.getX() + var7, var9, var1.getZ() + var8);
                  BlockState var11 = var0.getBlockState(var10);
                  if (var11.method23456(var0, var10) && (var3 || !var11.isIn(Blocks.BEDROCK))) {
                     var6 = var10;
                     break;
                  }
               }
            }
         }
      }

      return var6 != null ? var6 : var1;
   }

   private static Chunk method3881(World var0, Vector3d var1) {
      return var0.getChunk(MathHelper.floor(var1.x / 16.0), MathHelper.floor(var1.z / 16.0));
   }

   @Nullable
   private static BlockPos method3882(Chunk var0) {
      ChunkPos var3 = var0.getPos();
      BlockPos var4 = new BlockPos(var3.getX(), 30, var3.getZ());
      int var5 = var0.getTopFilledSegment() + 16 - 1;
      BlockPos var6 = new BlockPos(var3.getXEnd(), var5, var3.getZEnd());
      BlockPos var7 = null;
      double var8 = 0.0;

      for (BlockPos var11 : BlockPos.method8359(var4, var6)) {
         BlockState var12 = var0.getBlockState(var11);
         BlockPos var13 = var11.up();
         BlockPos var14 = var11.up(2);
         if (var12.isIn(Blocks.field36651) && !var0.getBlockState(var13).method23456(var0, var13) && !var0.getBlockState(var14).method23456(var0, var14)) {
            double var15 = var11.method8320(0.0, 0.0, 0.0, true);
            if (var7 == null || var15 < var8) {
               var7 = var11;
               var8 = var15;
            }
         }
      }

      return var7;
   }

   private void method3883(ServerWorld var1, BlockPos var2) {
      Class2898.field17964.method11216(Class4701.method14745(this.getPos(), false)).func_242765_a(var1, var1.getChunkProvider().getChunkGenerator(), new Random(), var2);
   }

   @Override
   public boolean method3870(Direction var1) {
      return Block.method11546(this.getBlockState(), this.world, this.getPos(), var1);
   }

   public int method3884() {
      int var3 = 0;

      for (Direction var7 : Direction.values()) {
         var3 += !this.method3870(var7) ? 0 : 1;
      }

      return var3;
   }

   public void method3885(BlockPos var1, boolean var2) {
      this.field5375 = var2;
      this.field5374 = var1;
   }
}

package net.minecraft.tileentity;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class CommandBlockTileEntity extends TileEntity {
   private boolean powered;
   private boolean auto;
   private boolean conditionMet;
   private boolean sendToClient;
   private final CommandBlockLogic commandBlockLogic = new Class913(this);

   public CommandBlockTileEntity() {
      super(TileEntityType.COMMAND_BLOCK);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      this.commandBlockLogic.method3560(var1);
      var1.putBoolean("powered", this.isPowered());
      var1.putBoolean("conditionMet", this.isConditionMet());
      var1.putBoolean("auto", this.isAuto());
      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.commandBlockLogic.method3561(var2);
      this.powered = var2.getBoolean("powered");
      this.conditionMet = var2.getBoolean("conditionMet");
      this.method4013(var2.getBoolean("auto"));
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      if (!this.method4018()) {
         return null;
      } else {
         this.method4019(false);
         CompoundNBT var3 = this.write(new CompoundNBT());
         return new SUpdateTileEntityPacket(this.pos, 2, var3);
      }
   }

   @Override
   public boolean method3783() {
      return true;
   }

   public CommandBlockLogic method4009() {
      return this.commandBlockLogic;
   }

   public void method4010(boolean var1) {
      this.powered = var1;
   }

   public boolean isPowered() {
      return this.powered;
   }

   public boolean isAuto() {
      return this.auto;
   }

   public void method4013(boolean var1) {
      boolean var4 = this.auto;
      this.auto = var1;
      if (!var4 && var1 && !this.powered && this.world != null && this.method4020() != Mode.field13323) {
         this.method4015();
      }
   }

   public void method4014() {
      Mode var3 = this.method4020();
      if (var3 == Mode.field13324 && (this.powered || this.auto) && this.world != null) {
         this.method4015();
      }
   }

   private void method4015() {
      Block var3 = this.getBlockState().getBlock();
      if (var3 instanceof CommandBlockBlock) {
         this.method4017();
         this.world.method6860().scheduleTick(this.pos, var3, 1);
      }
   }

   public boolean isConditionMet() {
      return this.conditionMet;
   }

   public boolean method4017() {
      this.conditionMet = true;
      if (this.method4021()) {
         BlockPos var3 = this.pos.offset(this.world.getBlockState(this.pos).<Direction>get(CommandBlockBlock.field18893).getOpposite());
         if (!(this.world.getBlockState(var3).getBlock() instanceof CommandBlockBlock)) {
            this.conditionMet = false;
         } else {
            TileEntity var4 = this.world.getTileEntity(var3);
            this.conditionMet = var4 instanceof CommandBlockTileEntity && ((CommandBlockTileEntity)var4).method4009().method3557() > 0;
         }
      }

      return this.conditionMet;
   }

   public boolean method4018() {
      return this.sendToClient;
   }

   public void method4019(boolean var1) {
      this.sendToClient = var1;
   }

   public Mode method4020() {
      BlockState var3 = this.getBlockState();
      if (!var3.isIn(Blocks.COMMAND_BLOCK)) {
         if (!var3.isIn(Blocks.field36887)) {
            return !var3.isIn(Blocks.field36888) ? Mode.field13325 : Mode.field13323;
         } else {
            return Mode.field13324;
         }
      } else {
         return Mode.field13325;
      }
   }

   public boolean method4021() {
      BlockState var3 = this.world.getBlockState(this.getPos());
      return !(var3.getBlock() instanceof CommandBlockBlock) ? false : var3.<Boolean>get(CommandBlockBlock.field18894);
   }

   @Override
   public void method3779() {
      this.method3780();
      super.method3779();
   }

   public static class Class913 extends CommandBlockLogic {
      private static String[] field5202;
      public final CommandBlockTileEntity field5203;

      public Class913(CommandBlockTileEntity var1) {
         this.field5203 = var1;
      }

      @Override
      public void method3562(String var1) {
         super.method3562(var1);
         this.field5203.markDirty();
      }

      @Override
      public ServerWorld method3567() {
         return (ServerWorld)this.field5203.world;
      }

      @Override
      public void method3568() {
         BlockState var3 = this.field5203.world.getBlockState(this.field5203.pos);
         this.method3567().notifyBlockUpdate(this.field5203.pos, var3, var3, 3);
      }

      @Override
      public Vector3d method3573() {
         return Vector3d.method11328(this.field5203.pos);
      }

      @Override
      public CommandSource method3574() {
         return new CommandSource(
            this,
            Vector3d.method11328(this.field5203.pos),
            Vector2f.ZERO,
            this.method3567(),
            2,
            this.method3565().getString(),
            this.method3565(),
            this.method3567().getServer(),
            (Entity)null
         );
      }
   }

   public enum Mode {
      field13323,
      field13324,
      field13325;
   }
}

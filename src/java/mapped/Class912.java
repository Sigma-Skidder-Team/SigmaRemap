package mapped;

import net.minecraft.command.CommandSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

public class Class912 extends CommandBlockLogic {
   private static String[] field5200;
   public final Class918 field5201;

   public Class912(Class918 var1) {
      this.field5201 = var1;
   }

   @Override
   public ServerWorld method3567() {
      return (ServerWorld)this.field5201.world;
   }

   @Override
   public void method3568() {
      this.field5201.getDataManager().method35446(Class918.method3615(), this.method3563());
      this.field5201.getDataManager().method35446(Class918.method3616(), this.method3559());
   }

   @Override
   public Vector3d method3573() {
      return this.field5201.getPositionVec();
   }

   public Class918 method3577() {
      return this.field5201;
   }

   @Override
   public CommandSource method3574() {
      return new CommandSource(
         this,
         this.field5201.getPositionVec(),
         this.field5201.getPitchYaw(),
         this.method3567(),
         2,
         this.method3565().getString(),
         this.field5201.getDisplayName(),
         this.method3567().getServer(),
         this.field5201
      );
   }
}

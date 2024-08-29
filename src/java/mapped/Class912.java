package mapped;

public class Class912 extends Class911 {
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
      this.field5201.method3210().method35446(Class918.method3615(), this.method3563());
      this.field5201.method3210().method35446(Class918.method3616(), this.method3559());
   }

   @Override
   public Vector3d method3573() {
      return this.field5201.getPositionVec();
   }

   public Class918 method3577() {
      return this.field5201;
   }

   @Override
   public Class6619 method3574() {
      return new Class6619(
         this,
         this.field5201.getPositionVec(),
         this.field5201.method3321(),
         this.method3567(),
         2,
         this.method3565().getString(),
         this.field5201.getDisplayName(),
         this.method3567().method6715(),
         this.field5201
      );
   }
}

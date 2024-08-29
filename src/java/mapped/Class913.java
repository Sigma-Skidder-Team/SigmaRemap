package mapped;

import net.minecraft.entity.Entity;

public class Class913 extends Class911 {
   private static String[] field5202;
   public final Class969 field5203;

   public Class913(Class969 var1) {
      this.field5203 = var1;
   }

   @Override
   public void method3562(String var1) {
      super.method3562(var1);
      this.field5203.method3622();
   }

   @Override
   public ServerWorld method3567() {
      return (ServerWorld)this.field5203.field5324;
   }

   @Override
   public void method3568() {
      BlockState var3 = this.field5203.field5324.getBlockState(this.field5203.field5325);
      this.method3567().notifyBlockUpdate(this.field5203.field5325, var3, var3, 3);
   }

   @Override
   public Vector3d method3573() {
      return Vector3d.method11328(this.field5203.field5325);
   }

   @Override
   public Class6619 method3574() {
      return new Class6619(
         this,
         Vector3d.method11328(this.field5203.field5325),
         Class8513.field37212,
         this.method3567(),
         2,
         this.method3565().getString(),
         this.method3565(),
         this.method3567().getServer(),
         (Entity)null
      );
   }
}

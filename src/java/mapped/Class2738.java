package mapped;

import javax.annotation.Nullable;

public class Class2738 extends Class2737 {
   private static String[] field17267;

   public Class2738(Class1046 var1, double var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      Vector3d var3 = null;
      if (this.field17258.method3250()) {
         var3 = Class8037.method27583(this.field17258, 15, 15);
      }

      if (this.field17258.method3013().nextFloat() >= this.field17266) {
         var3 = this.method10946();
      }

      return var3 != null ? var3 : super.method10943();
   }

   @Nullable
   private Vector3d method10946() {
      BlockPos var3 = this.field17258.getPosition();
      Mutable var4 = new Mutable();
      Mutable var5 = new Mutable();

      for (BlockPos var7 : BlockPos.method8364(
         MathHelper.floor(this.field17258.getPosX() - 3.0),
         MathHelper.floor(this.field17258.getPosY() - 6.0),
         MathHelper.floor(this.field17258.getPosZ() - 3.0),
         MathHelper.floor(this.field17258.getPosX() + 3.0),
         MathHelper.floor(this.field17258.getPosY() + 6.0),
         MathHelper.floor(this.field17258.getPosZ() + 3.0)
      )) {
         if (!var3.equals(var7)) {
            Block var8 = this.field17258.world.getBlockState(var5.method8377(var7, Direction.DOWN)).getBlock();
            boolean var9 = var8 instanceof Class3465 || var8.method11540(BlockTags.field32751);
            if (var9 && this.field17258.world.method7007(var7) && this.field17258.world.method7007(var4.method8377(var7, Direction.field673))) {
               return Vector3d.method11330(var7);
            }
         }
      }

      return null;
   }
}

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public enum Class2227 {
   field14567(Direction.DOWN),
   field14568(Direction.field673),
   field14569(Direction.NORTH),
   field14570(Direction.SOUTH),
   field14571(Direction.WEST),
   field14572(Direction.EAST),
   field14573(Direction.NORTH, Direction.WEST),
   field14574(Direction.NORTH, Direction.EAST),
   field14575(Direction.SOUTH, Direction.WEST),
   field14576(Direction.SOUTH, Direction.EAST),
   field14577(Direction.DOWN, Direction.NORTH),
   field14578(Direction.DOWN, Direction.SOUTH),
   field14579(Direction.field673, Direction.NORTH),
   field14580(Direction.field673, Direction.SOUTH),
   field14581(Direction.DOWN, Direction.WEST),
   field14582(Direction.DOWN, Direction.EAST),
   field14583(Direction.field673, Direction.WEST),
   field14584(Direction.field673, Direction.EAST);

   private Direction field14585;
   private Direction field14586;
   private static final Class2227[] field14587 = new Class2227[]{
      field14567,
      field14568,
      field14569,
      field14570,
      field14571,
      field14572,
      field14573,
      field14574,
      field14575,
      field14576,
      field14577,
      field14578,
      field14579,
      field14580,
      field14581,
      field14582,
      field14583,
      field14584
   };

   private Class2227(Direction var3) {
      this.field14585 = var3;
   }

   private Class2227(Direction var3, Direction var4) {
      this.field14585 = var3;
      this.field14586 = var4;
   }

   public Direction method8963() {
      return this.field14585;
   }

   public Direction method8964() {
      return this.field14586;
   }

   public BlockPos method8965(BlockPos var1) {
      var1 = var1.method8350(this.field14585, 1);
      if (this.field14586 != null) {
         var1 = var1.method8350(this.field14586, 1);
      }

      return var1;
   }

   public int method8966() {
      int var3 = this.field14585.method539();
      if (this.field14586 != null) {
         var3 += this.field14586.method539();
      }

      return var3;
   }

   public int method8967() {
      int var3 = this.field14585.method540();
      if (this.field14586 != null) {
         var3 += this.field14586.method540();
      }

      return var3;
   }

   public int method8968() {
      int var3 = this.field14585.method541();
      if (this.field14586 != null) {
         var3 += this.field14586.method541();
      }

      return var3;
   }

   public boolean method8969() {
      return this.field14586 != null;
   }
}

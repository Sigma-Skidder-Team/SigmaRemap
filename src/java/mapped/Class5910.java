package mapped;

public class Class5910 extends Class5909 {
   private static String[] field25716;
   private final Direction field25719;

   public Class5910(World var1, BlockPos var2, Direction var3, ItemStack var4, Direction var5) {
      super(var1, (PlayerEntity)null, Hand.field182, var4, new Class8711(Vector3d.method11330(var2), var5, var2, false));
      this.field25719 = var3;
   }

   @Override
   public BlockPos method18345() {
      return this.method18353().method31423();
   }

   @Override
   public boolean method18346() {
      return this.method18360().method6738(this.method18353().method31423()).method23441(this);
   }

   @Override
   public boolean method18347() {
      return this.method18346();
   }

   @Override
   public Direction method18348() {
      return Direction.field672;
   }

   @Override
   public Direction[] method18349() {
      switch (Class8228.field35345[this.field25719.ordinal()]) {
         case 1:
         default:
            return new Direction[]{Direction.field672, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.field673};
         case 2:
            return new Direction[]{Direction.field672, Direction.field673, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
         case 3:
            return new Direction[]{Direction.field672, Direction.NORTH, Direction.EAST, Direction.WEST, Direction.field673, Direction.SOUTH};
         case 4:
            return new Direction[]{Direction.field672, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.field673, Direction.NORTH};
         case 5:
            return new Direction[]{Direction.field672, Direction.WEST, Direction.SOUTH, Direction.field673, Direction.NORTH, Direction.EAST};
         case 6:
            return new Direction[]{Direction.field672, Direction.EAST, Direction.SOUTH, Direction.field673, Direction.NORTH, Direction.WEST};
      }
   }

   @Override
   public Direction method18350() {
      return this.field25719.method544() != Class113.field414 ? this.field25719 : Direction.NORTH;
   }

   @Override
   public boolean method18351() {
      return false;
   }

   @Override
   public float method18352() {
      return (float)(this.field25719.method534() * 90);
   }
}
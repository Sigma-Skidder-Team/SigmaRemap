package mapped;

public enum Class81 {
   field191(Direction.field672, false),
   field192(Direction.field673, false),
   field193(Direction.NORTH, false),
   field194(Direction.SOUTH, false),
   field195(Direction.WEST, false),
   field196(Direction.EAST, false),
   field197(Direction.field672, true),
   field198(Direction.field673, true),
   field199(Direction.NORTH, true),
   field200(Direction.SOUTH, true),
   field201(Direction.WEST, true),
   field202(Direction.EAST, true);

   private final int field203;
   private static final Class81[] field204 = new Class81[]{
      field191, field192, field193, field194, field195, field196, field197, field198, field199, field200, field201, field202
   };

   private Class81(Direction var3, boolean var4) {
      this.field203 = var3.method533() + (!var4 ? 0 : Direction.values().length);
   }

   // $VF: synthetic method
   public static int method256(Class81 var0) {
      return var0.field203;
   }
}

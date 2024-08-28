package mapped;

public class Class6463 {
   private static String[] field28400;
   public BlockPos field28401;
   public float field28402 = -1.0F;
   public Class108 field28403 = Class108.field347;

   public Class6463(BlockPos var1) {
      this.field28401 = var1;
      this.field28403 = Class108.method300(Class5255.method16415().field1338.method6738(var1.method8313()));
   }

   public int method19640() {
      switch (Class7303.field31300[this.field28403.ordinal()]) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         case 7:
            return 6;
         case 8:
            return 7;
         case 9:
            return 8;
         case 10:
            return 9;
         case 11:
            return 10;
         case 12:
            return 11;
         case 13:
            return 12;
         case 14:
            return 13;
         case 15:
            return 14;
         case 16:
            return 15;
         default:
            return 0;
      }
   }
}

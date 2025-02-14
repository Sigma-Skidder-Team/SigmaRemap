package mapped;

public class Class1831 implements Class1828 {
   private static String[] field9829;
   private static final int[] field9830 = new int[]{2, 4, 3, 6, 1, 5};
   private static final int[] field9831 = new int[]{2, 2, 2, 35, 35, 1};
   private static final int[] field9832 = new int[]{4, 29, 3, 1, 27, 6};
   private static final int[] field9833 = new int[]{4, 3, 5, 1};
   private static final int[] field9834 = new int[]{12, 12, 12, 30};
   private int[] field9835 = field9831;

   public Class1831(boolean var1) {
      if (var1) {
         this.field9835 = field9830;
      }
   }

   @Override
   public int method8082(Class6661 var1, int var2) {
      int var5 = (var2 & 3840) >> 8;
      var2 &= -3841;
      if (!Class9320.method35218(var2) && var2 != 14) {
         switch (var2) {
            case 1:
               if (var5 > 0) {
                  return var1.method20312(3) == 0 ? 39 : 38;
               }

               return this.field9835[var1.method20312(this.field9835.length)];
            case 2:
               if (var5 > 0) {
                  return 21;
               }

               return field9832[var1.method20312(field9832.length)];
            case 3:
               if (var5 > 0) {
                  return 32;
               }

               return field9833[var1.method20312(field9833.length)];
            case 4:
               return field9834[var1.method20312(field9834.length)];
            default:
               return 14;
         }
      } else {
         return var2;
      }
   }
}

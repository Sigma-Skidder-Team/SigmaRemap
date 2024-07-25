package remapped;

public class class_3215 implements class_7887 {
   private static String[] field_16032;
   private static final int[] field_16031 = new int[]{2, 4, 3, 6, 1, 5};
   private static final int[] field_16036 = new int[]{2, 2, 2, 35, 35, 1};
   private static final int[] field_16034 = new int[]{4, 29, 3, 1, 27, 6};
   private static final int[] field_16035 = new int[]{4, 3, 5, 1};
   private static final int[] field_16037 = new int[]{12, 12, 12, 30};
   private int[] field_16033 = field_16036;

   public class_3215(boolean var1) {
      if (var1) {
         this.field_16033 = field_16031;
      }
   }

   @Override
   public int method_35665(class_2431 var1, int var2) {
      int var5 = (var2 & 3840) >> 8;
      var2 &= -3841;
      if (!class_7930.method_35851(var2) && var2 != 14) {
         switch (var2) {
            case 1:
               if (var5 > 0) {
                  return var1.method_11082(3) == 0 ? 39 : 38;
               }

               return this.field_16033[var1.method_11082(this.field_16033.length)];
            case 2:
               if (var5 > 0) {
                  return 21;
               }

               return field_16034[var1.method_11082(field_16034.length)];
            case 3:
               if (var5 > 0) {
                  return 32;
               }

               return field_16035[var1.method_11082(field_16035.length)];
            case 4:
               return field_16037[var1.method_11082(field_16037.length)];
            default:
               return 14;
         }
      } else {
         return var2;
      }
   }
}

package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_3016 extends class_4482 {
   private static final class_2391[] field_14805 = new class_2391[]{
      class_2391.field_11927, class_2391.field_11921, class_2391.field_11930, class_2391.field_11928
   };
   private static final int[] field_14806 = new int[]{3, 2, 1, 0};

   public static List<class_3590> method_13788() {
      ArrayList var2 = new ArrayList(2);
      var2.add(new class_3016("cobbleWallConnections").method_20812("minecraft:cobblestone_wall"));
      var2.add(new class_3016("cobbleWallConnections").method_20812("minecraft:mossy_cobblestone_wall"));
      return var2;
   }

   public class_3016(String var1) {
      super(var1);
   }

   @Override
   public byte method_20811(class_9297 var1) {
      byte var4 = super.method_20811(var1);
      if (var1.method_42778("up").equals("true")) {
         var4 = (byte)(var4 | 16);
      }

      return var4;
   }

   @Override
   public byte method_20810(class_1455 var1, class_9371 var2, int var3) {
      byte var6 = super.method_20810(var1, var2, var3);
      if (this.method_13785(var1, var2)) {
         var6 = (byte)(var6 | 16);
      }

      return var6;
   }

   public boolean method_13785(class_1455 var1, class_9371 var2) {
      if (!this.method_13787(this.method_338(var1, var2.method_43341(class_2391.field_11922)))
         && !this.method_13787(this.method_338(var1, var2.method_43341(class_2391.field_11924)))) {
         int var5 = this.method_13786(var1, var2);
         if (var5 != 0 && var5 != 15) {
            for (int var6 = 0; var6 < field_14805.length; var6++) {
               if ((var5 & 1 << var6) != 0 && (var5 & 1 << field_14806[var6]) == 0) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private int method_13786(class_1455 var1, class_9371 var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < field_14805.length; var6++) {
         if (this.method_13787(this.method_338(var1, var2.method_43341(field_14805[var6])))) {
            var5 |= 1 << var6;
         }
      }

      return var5;
   }

   private boolean method_13787(int var1) {
      return this.method_20813().contains(var1);
   }
}

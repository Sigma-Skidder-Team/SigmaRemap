package remapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public enum class_9058 implements class_7126 {
   field_46372;

   private static final IntSet field_46371 = new IntOpenHashSet(new int[]{26, 11, 12, 13, 140, 30, 31, 158, 10});
   private static final IntSet field_46369 = new IntOpenHashSet(new int[]{168, 169, 21, 22, 23, 149, 151});

   @Override
   public int method_32737(class_2431 var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 14) {
         if (!field_46369.contains(var6)) {
            if (var6 != 3 && var6 != 34 && var6 != 20) {
               if (!field_46371.contains(var6)) {
                  if (var6 != 37 && var6 != 38) {
                     if (!class_7930.method_35851(var6)
                        && var6 != 7
                        && var6 != 6
                        && (class_7930.method_35851(var2) || class_7930.method_35851(var3) || class_7930.method_35851(var4) || class_7930.method_35851(var5))) {
                        return 16;
                     }
                  } else if (!class_7930.method_35851(var2)
                     && !class_7930.method_35851(var3)
                     && !class_7930.method_35851(var4)
                     && !class_7930.method_35851(var5)
                     && (!this.method_41601(var2) || !this.method_41601(var3) || !this.method_41601(var4) || !this.method_41601(var5))) {
                     return 2;
                  }
               } else if (!class_7930.method_35851(var6)
                  && (class_7930.method_35851(var2) || class_7930.method_35851(var3) || class_7930.method_35851(var4) || class_7930.method_35851(var5))) {
                  return 26;
               }
            } else if (!class_7930.method_35851(var6)
               && (class_7930.method_35851(var2) || class_7930.method_35851(var3) || class_7930.method_35851(var4) || class_7930.method_35851(var5))) {
               return 25;
            }
         } else {
            if (method_41602(var2) && method_41602(var3) && method_41602(var4) && method_41602(var5)) {
               if (!class_7930.method_35851(var2) && !class_7930.method_35851(var3) && !class_7930.method_35851(var4) && !class_7930.method_35851(var5)) {
                  return var6;
               }

               return 16;
            }

            return 23;
         }
      } else if (class_7930.method_35854(var2) || class_7930.method_35854(var3) || class_7930.method_35854(var4) || class_7930.method_35854(var5)) {
         return 15;
      }

      return var6;
   }

   private static boolean method_41602(int var0) {
      return field_46369.contains(var0) || var0 == 4 || var0 == 5 || class_7930.method_35851(var0);
   }

   private boolean method_41601(int var1) {
      return var1 == 37 || var1 == 38 || var1 == 39 || var1 == 165 || var1 == 166 || var1 == 167;
   }
}

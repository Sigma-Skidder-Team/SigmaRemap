package remapped;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class class_1521 {
   private static String[] field_8096;
   private static final int field_8089 = (int)Math.pow(16.0, 0.0);
   private static final int field_8094 = (int)Math.pow(16.0, 1.0);
   private static final int field_8092 = (int)Math.pow(16.0, 2.0);
   private static final class_240[] field_8091 = class_240.values();
   private final BitSet field_8090 = new BitSet(4096);
   private static final int[] field_8093 = class_9665.<int[]>method_44659(new int[1352], var0 -> {
      boolean var3 = false;
      byte var4 = 15;
      int var5 = 0;

      for (int var6 = 0; var6 < 16; var6++) {
         for (int var7 = 0; var7 < 16; var7++) {
            for (int var8 = 0; var8 < 16; var8++) {
               if (var6 == 0 || var6 == 15 || var7 == 0 || var7 == 15 || var8 == 0 || var8 == 15) {
                  var0[var5++] = method_6947(var6, var7, var8);
               }
            }
         }
      }
   });
   private int field_8095 = 4096;

   public void method_6944(class_1331 var1) {
      this.field_8090.set(method_6948(var1), true);
      this.field_8095--;
   }

   private static int method_6948(class_1331 var0) {
      return method_6947(var0.method_12173() & 15, var0.method_12165() & 15, var0.method_12185() & 15);
   }

   private static int method_6947(int var0, int var1, int var2) {
      return var0 << 0 | var1 << 8 | var2 << 4;
   }

   public class_6807 method_6945() {
      class_6807 var3 = new class_6807();
      if (4096 - this.field_8095 >= 256) {
         if (this.field_8095 != 0) {
            for (int var7 : field_8093) {
               if (!this.field_8090.get(var7)) {
                  var3.method_31245(this.method_6949(var7));
               }
            }
         } else {
            var3.method_31248(false);
         }
      } else {
         var3.method_31248(true);
      }

      return var3;
   }

   private Set<class_240> method_6949(int var1) {
      EnumSet var4 = EnumSet.<class_240>noneOf(class_240.class);
      IntArrayFIFOQueue var5 = new IntArrayFIFOQueue(384);
      var5.enqueue(var1);
      this.field_8090.set(var1, true);

      while (!var5.isEmpty()) {
         int var6 = var5.dequeueInt();
         this.method_6946(var6, var4);

         for (class_240 var10 : field_8091) {
            int var11 = this.method_6943(var6, var10);
            if (var11 >= 0 && !this.field_8090.get(var11)) {
               this.field_8090.set(var11, true);
               var5.enqueue(var11);
            }
         }
      }

      return var4;
   }

   private void method_6946(int var1, Set<class_240> var2) {
      int var5 = var1 >> 0 & 15;
      if (var5 != 0) {
         if (var5 == 15) {
            var2.add(class_240.field_804);
         }
      } else {
         var2.add(class_240.field_809);
      }

      int var6 = var1 >> 8 & 15;
      if (var6 != 0) {
         if (var6 == 15) {
            var2.add(class_240.field_817);
         }
      } else {
         var2.add(class_240.field_802);
      }

      int var7 = var1 >> 4 & 15;
      if (var7 != 0) {
         if (var7 == 15) {
            var2.add(class_240.field_800);
         }
      } else {
         var2.add(class_240.field_818);
      }
   }

   private int method_6943(int var1, class_240 var2) {
      switch (var2) {
         case field_802:
            if ((var1 >> 8 & 15) == 0) {
               return -1;
            }

            return var1 - field_8092;
         case field_817:
            if ((var1 >> 8 & 15) == 15) {
               return -1;
            }

            return var1 + field_8092;
         case field_818:
            if ((var1 >> 4 & 15) == 0) {
               return -1;
            }

            return var1 - field_8094;
         case field_800:
            if ((var1 >> 4 & 15) == 15) {
               return -1;
            }

            return var1 + field_8094;
         case field_809:
            if ((var1 >> 0 & 15) == 0) {
               return -1;
            }

            return var1 - field_8089;
         case field_804:
            if ((var1 >> 0 & 15) == 15) {
               return -1;
            }

            return var1 + field_8089;
         default:
            return -1;
      }
   }
}

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;
import java.util.function.Predicate;

public class Class7527 {
   private static String[] field32307;
   private static final Predicate<BlockState> field32308 = var0 -> !var0.isAir();
   private static final Predicate<BlockState> field32309 = var0 -> var0.method23384().method31087();
   private final Class7776 field32310 = new Class7776(9, 256);
   private final Predicate<BlockState> field32311;
   private final IChunk field32312;

   public Class7527(IChunk var1, Class101 var2) {
      this.field32311 = var2.method287();
      this.field32312 = var1;
   }

   public static void method24577(IChunk var0, Set<Class101> var1) {
      int var4 = var1.size();
      ObjectArrayList var5 = new ObjectArrayList(var4);
      ObjectListIterator var6 = var5.iterator();
      int var7 = var0.method7065() + 16;
      Mutable var8 = new Mutable();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            for (Class101 var12 : var1) {
               var5.add(var0.method7070(var12));
            }

            for (int var14 = var7 - 1; var14 >= 0; var14--) {
               var8.method8372(var9, var14, var10);
               BlockState var15 = var0.getBlockState(var8);
               if (!var15.method23448(Blocks.AIR)) {
                  while (var6.hasNext()) {
                     Class7527 var13 = (Class7527)var6.next();
                     if (var13.field32311.test(var15)) {
                        var13.method24581(var9, var10, var14 + 1);
                        var6.remove();
                     }
                  }

                  if (var5.isEmpty()) {
                     break;
                  }

                  var6.back(var4);
               }
            }
         }
      }
   }

   public boolean method24578(int var1, int var2, int var3, BlockState var4) {
      int var7 = this.method24579(var1, var3);
      if (var2 <= var7 - 2) {
         return false;
      } else {
         if (!this.field32311.test(var4)) {
            if (var7 - 1 == var2) {
               Mutable var8 = new Mutable();

               for (int var9 = var2 - 1; var9 >= 0; var9--) {
                  var8.method8372(var1, var9, var3);
                  if (this.field32311.test(this.field32312.getBlockState(var8))) {
                     this.method24581(var1, var3, var9 + 1);
                     return true;
                  }
               }

               this.method24581(var1, var3, 0);
               return true;
            }
         } else if (var2 >= var7) {
            this.method24581(var1, var3, var2 + 1);
            return true;
         }

         return false;
      }
   }

   public int method24579(int var1, int var2) {
      return this.method24580(method24584(var1, var2));
   }

   private int method24580(int var1) {
      return this.field32310.method25762(var1);
   }

   private void method24581(int var1, int var2, int var3) {
      this.field32310.method25761(method24584(var1, var2), var3);
   }

   public void method24582(long[] var1) {
      System.arraycopy(var1, 0, this.field32310.method25763(), 0, var1.length);
   }

   public long[] method24583() {
      return this.field32310.method25763();
   }

   private static int method24584(int var0, int var1) {
      return var0 + var1 * 16;
   }

   // $VF: synthetic method
   public static Predicate method24587() {
      return field32308;
   }

   // $VF: synthetic method
   public static Predicate method24588() {
      return field32309;
   }
}

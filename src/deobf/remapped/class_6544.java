package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;

public class class_6544 {
   private final class_159 field_33274;
   private final String field_33273;
   private final List<class_9083> field_33271 = Lists.newArrayList();
   private StackTraceElement[] field_33272 = new StackTraceElement[0];

   public class_6544(class_159 var1, String var2) {
      this.field_33274 = var1;
      this.field_33273 = var2;
   }

   public static String method_29844(double var0, double var2, double var4) {
      return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", var0, var2, var4, method_29846(new class_1331(var0, var2, var4)));
   }

   public static String method_29846(class_1331 var0) {
      return method_29845(var0.method_12173(), var0.method_12165(), var0.method_12185());
   }

   public static String method_29845(int var0, int var1, int var2) {
      StringBuilder var5 = new StringBuilder();

      try {
         var5.append(String.format("World: (%d,%d,%d)", var0, var1, var2));
      } catch (Throwable var18) {
         var5.append("(Error finding world loc)");
      }

      var5.append(", ");

      try {
         int var6 = var0 >> 4;
         int var7 = var2 >> 4;
         int var8 = var0 & 15;
         int var9 = var1 >> 4;
         int var10 = var2 & 15;
         int var11 = var6 << 4;
         int var12 = var7 << 4;
         int var13 = (var6 + 1 << 4) - 1;
         int var14 = (var7 + 1 << 4) - 1;
         var5.append(
            String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", var8, var9, var10, var6, var7, var11, var12, var13, var14)
         );
      } catch (Throwable var17) {
         var5.append("(Error finding chunk loc)");
      }

      var5.append(", ");

      try {
         int var19 = var0 >> 9;
         int var20 = var2 >> 9;
         int var21 = var19 << 5;
         int var22 = var20 << 5;
         int var23 = (var19 + 1 << 5) - 1;
         int var24 = (var20 + 1 << 5) - 1;
         int var25 = var19 << 9;
         int var26 = var20 << 9;
         int var27 = (var19 + 1 << 9) - 1;
         int var15 = (var20 + 1 << 9) - 1;
         var5.append(
            String.format(
               "Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)",
               var19,
               var20,
               var21,
               var22,
               var23,
               var24,
               var25,
               var26,
               var27,
               var15
            )
         );
      } catch (Throwable var16) {
         var5.append("(Error finding world loc)");
      }

      return var5.toString();
   }

   public class_6544 method_29851(String var1, class_5703<String> var2) {
      try {
         this.method_29850(var1, var2.call());
      } catch (Throwable var6) {
         this.method_29848(var1, var6);
      }

      return this;
   }

   public class_6544 method_29850(String var1, Object var2) {
      this.field_33271.add(new class_9083(var1, var2));
      return this;
   }

   public void method_29848(String var1, Throwable var2) {
      this.method_29850(var1, var2);
   }

   public int method_29847(int var1) {
      StackTraceElement[] var4 = Thread.currentThread().getStackTrace();
      if (var4.length > 0) {
         this.field_33272 = new StackTraceElement[var4.length - 3 - var1];
         System.arraycopy(var4, 3 + var1, this.field_33272, 0, this.field_33272.length);
         return this.field_33272.length;
      } else {
         return 0;
      }
   }

   public boolean method_29852(StackTraceElement var1, StackTraceElement var2) {
      if (this.field_33272.length != 0 && var1 != null) {
         StackTraceElement var5 = this.field_33272[0];
         if (var5.isNativeMethod() == var1.isNativeMethod()
            && var5.getClassName().equals(var1.getClassName())
            && var5.getFileName().equals(var1.getFileName())
            && var5.getMethodName().equals(var1.getMethodName())) {
            if (var2 != null != this.field_33272.length > 1) {
               return false;
            } else if (var2 != null && !this.field_33272[1].equals(var2)) {
               return false;
            } else {
               this.field_33272[0] = var1;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_29854(int var1) {
      StackTraceElement[] var4 = new StackTraceElement[this.field_33272.length - var1];
      System.arraycopy(this.field_33272, 0, var4, 0, var4.length);
      this.field_33272 = var4;
   }

   public void method_29855(StringBuilder var1) {
      var1.append("-- ").append(this.field_33273).append(" --\n");
      var1.append("Details:");

      for (class_9083 var5 : this.field_33271) {
         var1.append("\n\t");
         var1.append(var5.method_41815());
         var1.append(": ");
         var1.append(var5.method_41813());
      }

      if (this.field_33272 != null && this.field_33272.length > 0) {
         var1.append("\nStacktrace:");

         for (StackTraceElement var7 : this.field_33272) {
            var1.append("\n\tat ");
            var1.append(var7);
         }
      }
   }

   public StackTraceElement[] method_29849() {
      return this.field_33272;
   }

   public static void method_29843(class_6544 var0, class_1331 var1, class_2522 var2) {
      if (var2 != null) {
         var0.method_29851("Block", var2::toString);
      }

      var0.method_29851("Block location", () -> method_29846(var1));
   }
}

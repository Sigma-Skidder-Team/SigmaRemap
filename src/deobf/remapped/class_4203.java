package remapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public final class class_4203 {
   public final String field_20435;
   public final long[] field_20439;
   public final File[] field_20441;
   public final File[] field_20442;
   public boolean field_20438;
   public class_1469 field_20443;
   public long field_20440;

   public class_4203(class_3034 var1, String var2) {
      this.field_20436 = var1;
      this.field_20435 = var2;
      this.field_20439 = new long[var1.field_14884];
      this.field_20441 = new File[var1.field_14884];
      this.field_20442 = new File[var1.field_14884];
      StringBuilder var5 = new StringBuilder(var2).append('.');
      int var6 = var5.length();

      for (int var7 = 0; var7 < var1.field_14884; var7++) {
         var5.append(var7);
         this.field_20441[var7] = new File(var1.field_14869, var5.toString());
         var5.append(".tmp");
         this.field_20442[var7] = new File(var1.field_14869, var5.toString());
         var5.setLength(var6);
      }
   }

   public void method_19567(String[] var1) throws IOException {
      if (var1.length != this.field_20436.field_14884) {
         throw this.method_19568(var1);
      } else {
         try {
            for (int var4 = 0; var4 < var1.length; var4++) {
               this.field_20439[var4] = Long.parseLong(var1[var4]);
            }
         } catch (NumberFormatException var5) {
            throw this.method_19568(var1);
         }
      }
   }

   public void method_19564(class_3947 var1) throws IOException {
      for (long var7 : this.field_20439) {
         var1.method_18253(32).method_18238(var7);
      }
   }

   private IOException method_19568(String[] var1) throws IOException {
      throw new IOException("unexpected journal line: " + Arrays.toString((Object[])var1));
   }

   public class_8748 method_19565() {
      if (!Thread.holdsLock(this.field_20436)) {
         throw new AssertionError();
      } else {
         class_5322[] var3 = new class_5322[this.field_20436.field_14884];
         long[] var4 = (long[])this.field_20439.clone();

         try {
            for (int var5 = 0; var5 < this.field_20436.field_14884; var5++) {
               var3[var5] = this.field_20436.field_14891.method_28081(this.field_20441[var5]);
            }

            return new class_8748(this.field_20436, this.field_20435, this.field_20440, var3, var4);
         } catch (FileNotFoundException var8) {
            for (int var6 = 0; var6 < this.field_20436.field_14884 && var3[var6] != null; var6++) {
               class_8515.method_39200(var3[var6]);
            }

            try {
               this.field_20436.method_13848(this);
            } catch (IOException var7) {
            }

            return null;
         }
      }
   }
}

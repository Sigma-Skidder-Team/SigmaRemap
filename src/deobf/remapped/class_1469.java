package remapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class class_1469 {
   private static String[] field_7886;
   public final class_4203 field_7888;
   public final boolean[] field_7889;
   private boolean field_7885;

   public class_1469(class_3034 var1, class_4203 var2) {
      this.field_7887 = var1;
      this.field_7888 = var2;
      this.field_7889 = !var2.field_20438 ? new boolean[var1.field_14884] : null;
   }

   public void method_6787() {
      if (this.field_7888.field_20443 == this) {
         for (int var3 = 0; var3 < this.field_7887.field_14884; var3++) {
            try {
               this.field_7887.field_14891.method_28078(this.field_7888.field_20442[var3]);
            } catch (IOException var5) {
            }
         }

         this.field_7888.field_20443 = null;
      }
   }

   public class_5322 method_6789(int var1) {
      synchronized (this.field_7887) {
         if (this.field_7885) {
            throw new IllegalStateException();
         } else if (this.field_7888.field_20438 && this.field_7888.field_20443 == this) {
            class_5322 var10000;
            try {
               var10000 = this.field_7887.field_14891.method_28081(this.field_7888.field_20441[var1]);
            } catch (FileNotFoundException var7) {
               return null;
            }

            return var10000;
         } else {
            return null;
         }
      }
   }

   public class_4131 method_6784(int var1) {
      synchronized (this.field_7887) {
         if (this.field_7885) {
            throw new IllegalStateException();
         } else if (this.field_7888.field_20443 != this) {
            return class_1259.method_5656();
         } else {
            if (!this.field_7888.field_20438) {
               this.field_7889[var1] = true;
            }

            File var5 = this.field_7888.field_20442[var1];

            class_4131 var6;
            try {
               var6 = this.field_7887.field_14891.method_28079(var5);
            } catch (FileNotFoundException var9) {
               return class_1259.method_5656();
            }

            return new class_5034(this, var6);
         }
      }
   }

   public void method_6785() throws IOException {
      synchronized (this.field_7887) {
         if (this.field_7885) {
            throw new IllegalStateException();
         } else {
            if (this.field_7888.field_20443 == this) {
               this.field_7887.method_13859(this, true);
            }

            this.field_7885 = true;
         }
      }
   }

   public void method_6783() throws IOException {
      synchronized (this.field_7887) {
         if (this.field_7885) {
            throw new IllegalStateException();
         } else {
            if (this.field_7888.field_20443 == this) {
               this.field_7887.method_13859(this, false);
            }

            this.field_7885 = true;
         }
      }
   }

   public void method_6786() {
      synchronized (this.field_7887) {
         if (!this.field_7885 && this.field_7888.field_20443 == this) {
            try {
               this.field_7887.method_13859(this, false);
            } catch (IOException var6) {
            }
         }
      }
   }
}

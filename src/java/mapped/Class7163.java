package mapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class Class7163 {
   private static String[] field30810;
   public final Class8316 field30811;
   public final boolean[] field30812;
   private boolean field30813;
   public final Class1756 field30814;

   public Class7163(Class1756 var1, Class8316 var2) {
      this.field30814 = var1;
      this.field30811 = var2;
      this.field30812 = !var2.field35725 ? new boolean[var1.field9514] : null;
   }

   public void method22495() {
      if (this.field30811.field35726 == this) {
         for (int var3 = 0; var3 < this.field30814.field9514; var3++) {
            try {
               this.field30814.field9507.method31550(this.field30811.field35724[var3]);
            } catch (IOException var5) {
            }
         }

         this.field30811.field35726 = null;
      }
   }

   public Class1737 method22496(int var1) {
      synchronized (this.field30814) {
         if (this.field30813) {
            throw new IllegalStateException();
         } else if (this.field30811.field35725 && this.field30811.field35726 == this) {
            Class1737 var10000;
            try {
               var10000 = this.field30814.field9507.method31547(this.field30811.field35723[var1]);
            } catch (FileNotFoundException var7) {
               return null;
            }

            return var10000;
         } else {
            return null;
         }
      }
   }

   public Class1716 method22497(int var1) {
      synchronized (this.field30814) {
         if (this.field30813) {
            throw new IllegalStateException();
         } else if (this.field30811.field35726 != this) {
            return Class7001.method21708();
         } else {
            if (!this.field30811.field35725) {
               this.field30812[var1] = true;
            }

            File var5 = this.field30811.field35724[var1];

            Class1716 var6;
            try {
               var6 = this.field30814.field9507.method31548(var5);
            } catch (FileNotFoundException var9) {
               return Class7001.method21708();
            }

            return new Class1727(this, var6);
         }
      }
   }

   public void method22498() throws IOException {
      synchronized (this.field30814) {
         if (this.field30813) {
            throw new IllegalStateException();
         } else {
            if (this.field30811.field35726 == this) {
               this.field30814.method7689(this, true);
            }

            this.field30813 = true;
         }
      }
   }

   public void method22499() throws IOException {
      synchronized (this.field30814) {
         if (this.field30813) {
            throw new IllegalStateException();
         } else {
            if (this.field30811.field35726 == this) {
               this.field30814.method7689(this, false);
            }

            this.field30813 = true;
         }
      }
   }

   public void method22500() {
      synchronized (this.field30814) {
         if (!this.field30813 && this.field30811.field35726 == this) {
            try {
               this.field30814.method7689(this, false);
            } catch (IOException var6) {
            }
         }
      }
   }
}

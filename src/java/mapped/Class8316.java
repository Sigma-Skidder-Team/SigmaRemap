package mapped;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public final class Class8316 {
   public final String field35721;
   public final long[] field35722;
   public final File[] field35723;
   public final File[] field35724;
   public boolean field35725;
   public Class7163 field35726;
   public long field35727;
   public final Class1756 field35728;

   public Class8316(Class1756 var1, String var2) {
      this.field35728 = var1;
      this.field35721 = var2;
      this.field35722 = new long[var1.field9514];
      this.field35723 = new File[var1.field9514];
      this.field35724 = new File[var1.field9514];
      StringBuilder var5 = new StringBuilder(var2).append('.');
      int var6 = var5.length();

      for (int var7 = 0; var7 < var1.field9514; var7++) {
         var5.append(var7);
         this.field35723[var7] = new File(var1.field9508, var5.toString());
         var5.append(".tmp");
         this.field35724[var7] = new File(var1.field9508, var5.toString());
         var5.setLength(var6);
      }
   }

   public void method29096(String[] var1) throws IOException {
      if (var1.length != this.field35728.field9514) {
         throw this.method29098(var1);
      } else {
         try {
            for (int var4 = 0; var4 < var1.length; var4++) {
               this.field35722[var4] = Long.parseLong(var1[var4]);
            }
         } catch (NumberFormatException var5) {
            throw this.method29098(var1);
         }
      }
   }

   public void method29097(Class1733 var1) throws IOException {
      for (long var7 : this.field35722) {
         var1.method7570(32).method7577(var7);
      }
   }

   private IOException method29098(String[] var1) throws IOException {
      throw new IOException("unexpected journal line: " + Arrays.toString((Object[])var1));
   }

   public Class1792 method29099() {
      if (!Thread.holdsLock(this.field35728)) {
         throw new AssertionError();
      } else {
         Class1737[] var3 = new Class1737[this.field35728.field9514];
         long[] var4 = (long[])this.field35722.clone();

         try {
            for (int var5 = 0; var5 < this.field35728.field9514; var5++) {
               var3[var5] = this.field35728.field9507.method31547(this.field35723[var5]);
            }

            return new Class1792(this.field35728, this.field35721, this.field35727, var3, var4);
         } catch (FileNotFoundException var8) {
            for (int var6 = 0; var6 < this.field35728.field9514 && var3[var6] != null; var6++) {
               Class9474.method36535(var3[var6]);
            }

            try {
               this.field35728.method7692(this);
            } catch (IOException var7) {
            }

            return null;
         }
      }
   }
}

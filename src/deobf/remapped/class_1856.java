package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class class_1856 {
   private final class_6041 field_9410;
   public final class_9557 field_9406;
   private final class_9587 field_9408;
   private final boolean field_9405;
   private final List<class_7553> field_9411;
   private URL field_9407;
   private int field_9409;
   public class_9849 field_9413;
   public class_8626 field_9412;
   public class_623 field_9404;

   public class_1856(class_7641 var1, class_6041 var2) {
      this.field_9410 = var2;
      this.field_9406 = (class_9557)var1.method_34607(1953196132L);
      class_7641 var5 = var1.method_34607(1835297121L);
      this.field_9408 = (class_9587)var5.method_34607(1835296868L);
      class_7641 var6 = var5.method_34607(1835626086L);
      class_7641 var7 = var6.method_34607(1684631142L);
      class_5760 var8 = (class_5760)var7.method_34607(1685218662L);
      if (var8.method_34608(1970433056L)) {
         class_9839 var9 = (class_9839)var8.method_34607(1970433056L);
         this.field_9405 = var9.method_45333();
         if (!this.field_9405) {
            try {
               this.field_9407 = new URL(var9.method_45334());
            } catch (MalformedURLException var11) {
               Logger.getLogger("MP4 API").log(Level.WARNING, "Parsing URL-Box failed: {0}, url: {1}", new String[]{var11.toString(), var9.method_45334()});
               this.field_9407 = null;
            }
         }
      } else {
         this.field_9405 = true;
         this.field_9407 = null;
      }

      class_7641 var12 = var6.method_34607(1937007212L);
      if (var12.method_34614()) {
         this.field_9411 = new ArrayList<class_7553>();
         this.method_8220(var12);
      } else {
         this.field_9411 = Collections.<class_7553>emptyList();
      }

      this.field_9409 = 0;
   }

   private void method_8220(class_7641 var1) {
      double var4 = (double)this.field_9408.method_44275();
      class_4923 var6 = this.method_8214();
      long[] var7 = ((class_2416)var1.method_34607(1937011578L)).method_11024();
      class_6898 var8;
      if (!var1.method_34608(1937007471L)) {
         var8 = (class_6898)var1.method_34607(1668232756L);
      } else {
         var8 = (class_6898)var1.method_34607(1937007471L);
      }

      long[] var9 = var8.method_31595();
      class_2499 var10 = (class_2499)var1.method_34607(1937011555L);
      long[] var11 = var10.method_11412();
      long[] var12 = var10.method_11413();
      class_5959 var13 = (class_5959)var1.method_34607(1937011827L);
      long[] var14 = var13.method_27229();
      long[] var15 = var13.method_27230();
      long[] var16 = new long[var7.length];
      long var17 = 0L;
      int var19 = 0;

      for (int var20 = 0; var20 < var14.length; var20++) {
         for (int var24 = 0; (long)var24 < var14[var20]; var24++) {
            var16[var19 + var24] = var17;
            var17 += var15[var20];
         }

         var19 = (int)((long)var19 + var14[var20]);
      }

      int var29 = 0;
      long var21 = 0L;

      for (int var23 = 0; var23 < var11.length; var23++) {
         int var31;
         if (var23 >= var11.length - 1) {
            var31 = var9.length;
         } else {
            var31 = (int)var11[var23 + 1] - 1;
         }

         for (int var25 = (int)var11[var23] - 1; var25 < var31; var25++) {
            var21 = var9[var25];

            for (int var26 = 0; (long)var26 < var12[var23]; var26++) {
               double var27 = (double)var16[var29] / var4;
               this.field_9411.add(new class_7553(var6, var21, var7[var29], var27));
               var21 += var7[var29];
               var29++;
            }
         }
      }

      Collections.sort(this.field_9411);
   }

   public void method_8205(class_6507 var1) {
      class_4920 var4 = var1.method_29655();

      for (class_1237 var7 : var4.method_5495()) {
         for (class_1237 var10 : var7.method_5495()) {
            switch (var10.method_5497()) {
               case 5:
                  this.field_9413 = (class_9849)var10;
            }
         }
      }
   }

   public <T> void method_8209(class_7641 var1, Class<T> var2) {
      try {
         Object var5 = var2.newInstance();
         if (var1.getClass().isInstance(var5)) {
            System.out.println("true");
         }
      } catch (InstantiationException var7) {
         var7.printStackTrace();
      } catch (IllegalAccessException var8) {
         var8.printStackTrace();
      }
   }

   public abstract class_4923 method_8214();

   public abstract class_4926 method_8217();

   public boolean method_8204() {
      return this.field_9406.method_44090();
   }

   public boolean method_8206() {
      return this.field_9406.method_44081();
   }

   public boolean method_8213() {
      return this.field_9406.method_44085();
   }

   public Date method_8207() {
      return class_8076.method_36683(this.field_9406.method_44080());
   }

   public Date method_8208() {
      return class_8076.method_36683(this.field_9406.method_44091());
   }

   public Locale method_8215() {
      return new Locale(this.field_9408.method_44278());
   }

   public boolean method_8216() {
      return this.field_9405;
   }

   public URL method_8202() {
      return this.field_9407;
   }

   public byte[] method_8200() {
      return this.field_9413.method_45359();
   }

   public class_8626 method_8201() {
      return this.field_9412;
   }

   public class_623 method_8203() {
      return this.field_9404;
   }

   public boolean method_8219() {
      return this.field_9409 < this.field_9411.size();
   }

   public class_7553 method_8199() throws IOException {
      class_7553 var3 = null;
      if (this.method_8219()) {
         var3 = this.field_9411.get(this.field_9409);
         if (var3.method_34373() < this.field_9410.method_27526()) {
            this.field_9410.method_27540();
         }

         long var4 = var3.method_34373() - this.field_9410.method_27526();
         if (var4 > 0L) {
            this.field_9410.method_27527(var4);
         } else if (var4 < 0L) {
            if (!this.field_9410.method_27523()) {
               Logger.getLogger("MP4 API")
                  .log(
                     Level.WARNING,
                     "readNextFrame failed: frame {0} already skipped, offset:{1}, stream:{2}",
                     new Object[]{this.field_9409, var3.method_34373(), this.field_9410.method_27526()}
                  );
               throw new IOException("frame already skipped and no random access");
            }

            this.field_9410.method_27536(var3.method_34373());
         }

         byte[] var6 = new byte[(int)var3.method_34370()];

         try {
            this.field_9410.method_27525(var6);
         } catch (EOFException var8) {
            Logger.getLogger("MP4 API")
               .log(Level.WARNING, "readNextFrame failed: tried to read {0} bytes at {1}", new Long[]{var3.method_34370(), this.field_9410.method_27526()});
            throw var8;
         }

         var3.method_34369(var6);
         this.field_9409++;
      }

      return var3;
   }

   public double method_8211(double var1) {
      if (var1 > this.method_8212()) {
         return this.method_8218();
      } else {
         class_7553 var5 = null;

         for (int var6 = 0; var6 < this.field_9411.size(); var6++) {
            var5 = this.field_9411.get(var6++);
            if (var5.method_34371() > var1) {
               this.field_9409 = var6;
               break;
            }
         }

         return var5 != null ? var5.method_34371() : -1.0;
      }
   }

   public double method_8212() {
      double var3 = 0.0;
      Object var5 = null;

      for (int var6 = 0; var6 < this.field_9411.size(); var6++) {
         var5 = this.field_9411.get(var6++);

         try {
            if (((class_7553)var5).method_34373() <= this.field_9410.method_27526() + this.field_9410.method_27528()) {
               var3 = Math.max(((class_7553)var5).method_34371(), var3);
            }
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

      return var3;
   }

   public double method_8218() {
      return this.field_9411.get(Math.min(this.field_9409, this.field_9411.size() - 1)).method_34371();
   }
}

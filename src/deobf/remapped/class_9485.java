package remapped;

import java.io.EOFException;
import java.io.IOException;

public final class class_9485 implements class_9328 {
   private static final int field_48342 = 0;
   private static final int field_48338 = 1;
   private static final int field_48340 = 2;
   private static final int field_48336 = 3;
   private static final int field_48335 = 4;
   private static final int field_48337 = 5;
   private static final int field_48343 = 6;
   public final class_8075 field_48345;
   public final class_327 field_48334;
   public final class_8067 field_48346;
   public final class_3947 field_48344;
   public int field_48339 = 0;

   public class_9485(class_8075 var1, class_327 var2, class_8067 var3, class_3947 var4) {
      this.field_48345 = var1;
      this.field_48334 = var2;
      this.field_48346 = var3;
      this.field_48344 = var4;
   }

   @Override
   public class_4131 method_43067(class_3918 var1, long var2) {
      if (!"chunked".equalsIgnoreCase(var1.method_18135("Transfer-Encoding"))) {
         if (var2 == -1L) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
         } else {
            return this.method_43810(var2);
         }
      } else {
         return this.method_43816();
      }
   }

   @Override
   public void method_43065() {
      class_1617 var3 = this.field_48334.method_1522();
      if (var3 != null) {
         var3.method_7215();
      }
   }

   @Override
   public void method_43066(class_3918 var1) throws IOException {
      String var4 = class_5947.method_27187(var1, this.field_48334.method_1522().method_21597().method_11561().type());
      this.method_43818(var1.method_18138(), var4);
   }

   @Override
   public class_8856 method_43063(class_7839 var1) throws IOException {
      class_5322 var4 = this.method_43811(var1);
      return new class_2536(var1.method_35479(), class_1259.method_5671(var4));
   }

   private class_5322 method_43811(class_7839 var1) throws IOException {
      if (class_4464.method_20709(var1)) {
         if (!"chunked".equalsIgnoreCase(var1.method_35472("Transfer-Encoding"))) {
            long var4 = class_4464.method_20718(var1);
            return var4 == -1L ? this.method_43814() : this.method_43819(var4);
         } else {
            return this.method_43817(var1.method_35474().method_18136());
         }
      } else {
         return this.method_43819(0L);
      }
   }

   public boolean method_43813() {
      return this.field_48339 == 6;
   }

   @Override
   public void method_43069() throws IOException {
      this.field_48344.flush();
   }

   @Override
   public void method_43064() throws IOException {
      this.field_48344.flush();
   }

   public void method_43818(class_8121 var1, String var2) throws IOException {
      if (this.field_48339 != 0) {
         throw new IllegalStateException("state: " + this.field_48339);
      } else {
         this.field_48344.method_18250(var2).method_18250("\r\n");
         int var5 = 0;

         for (int var6 = var1.method_36948(); var5 < var6; var5++) {
            this.field_48344.method_18250(var1.method_36954(var5)).method_18250(": ").method_18250(var1.method_36953(var5)).method_18250("\r\n");
         }

         this.field_48344.method_18250("\r\n");
         this.field_48339 = 1;
      }
   }

   @Override
   public class_7775 method_43068(boolean var1) throws IOException {
      if (this.field_48339 != 1 && this.field_48339 != 3) {
         throw new IllegalStateException("state: " + this.field_48339);
      } else {
         try {
            class_9669 var4 = class_9669.method_44716(this.field_48346.method_36584());
            class_7775 var7 = new class_7775()
               .method_35269(var4.field_49247)
               .method_35267(var4.field_49248)
               .method_35281(var4.field_49252)
               .method_35271(this.method_43815());
            if (var1 && var4.field_49248 == 100) {
               return null;
            } else {
               this.field_48339 = 4;
               return var7;
            }
         } catch (EOFException var6) {
            IOException var5 = new IOException("unexpected end of stream on " + this.field_48334);
            var5.initCause(var6);
            throw var5;
         }
      }
   }

   public class_8121 method_43815() throws IOException {
      class_7414 var3 = new class_7414();

      String var4;
      while ((var4 = this.field_48346.method_36584()).length() != 0) {
         class_1850.field_9389.method_8186(var3, var4);
      }

      return var3.method_33781();
   }

   public class_4131 method_43816() {
      if (this.field_48339 == 1) {
         this.field_48339 = 2;
         return new class_1088(this);
      } else {
         throw new IllegalStateException("state: " + this.field_48339);
      }
   }

   public class_4131 method_43810(long var1) {
      if (this.field_48339 == 1) {
         this.field_48339 = 2;
         return new class_5925(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field_48339);
      }
   }

   public class_5322 method_43819(long var1) throws IOException {
      if (this.field_48339 == 4) {
         this.field_48339 = 5;
         return new class_3462(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field_48339);
      }
   }

   public class_5322 method_43817(class_1672 var1) throws IOException {
      if (this.field_48339 == 4) {
         this.field_48339 = 5;
         return new class_3879(this, var1);
      } else {
         throw new IllegalStateException("state: " + this.field_48339);
      }
   }

   public class_5322 method_43814() throws IOException {
      if (this.field_48339 == 4) {
         if (this.field_48334 != null) {
            this.field_48339 = 5;
            this.field_48334.method_1527();
            return new class_8542(this);
         } else {
            throw new IllegalStateException("streamAllocation == null");
         }
      } else {
         throw new IllegalStateException("state: " + this.field_48339);
      }
   }

   public void method_43820(class_8880 var1) {
      class_245 var4 = var1.method_40856();
      var1.method_40855(class_245.field_857);
      var4.method_1077();
      var4.method_1075();
   }
}

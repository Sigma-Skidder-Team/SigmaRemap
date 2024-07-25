package remapped;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

public final class class_8555 implements Closeable, Flushable {
   private static final int field_43771 = 201105;
   private static final int field_43766 = 0;
   private static final int field_43765 = 1;
   private static final int field_43763 = 2;
   public final class_4957 field_43770 = new class_8900(this);
   public final class_3034 field_43762;
   public int field_43764;
   public int field_43767;
   private int field_43772;
   private int field_43761;
   private int field_43768;

   public class_8555(File var1, long var2) {
      this(var1, var2, class_6112.field_31257);
   }

   public class_8555(File var1, long var2, class_6112 var4) {
      this.field_43762 = class_3034.method_13851(var4, var1, 201105, 2, var2);
   }

   public static String method_39359(class_1672 var0) {
      return class_9091.method_41889(var0.toString()).method_41890().method_41900();
   }

   @Nullable
   public class_7839 method_39364(class_3918 var1) {
      String var4 = method_39359(var1.method_18136());

      class_8748 var5;
      try {
         var5 = this.field_43762.method_13839(var4);
         if (var5 == null) {
            return null;
         }
      } catch (IOException var9) {
         return null;
      }

      class_7278 var7;
      try {
         var7 = new class_7278(var5.method_40153(0));
      } catch (IOException var8) {
         class_8515.method_39200(var5);
         return null;
      }

      class_7839 var6 = var7.method_33267(var5);
      if (!var7.method_33263(var1, var6)) {
         class_8515.method_39200(var6.method_35481());
         return null;
      } else {
         return var6;
      }
   }

   @Nullable
   public class_9474 method_39367(class_7839 var1) {
      String var4 = var1.method_35474().method_18137();
      if (class_3493.method_16061(var1.method_35474().method_18137())) {
         try {
            this.method_39355(var1.method_35474());
         } catch (IOException var8) {
         }

         return null;
      } else if (!var4.equals("GET")) {
         return null;
      } else if (class_4464.method_20707(var1)) {
         return null;
      } else {
         class_7278 var5 = new class_7278(var1);
         class_1469 var6 = null;

         try {
            var6 = this.field_43762.method_13844(method_39359(var1.method_35474().method_18136()));
            if (var6 == null) {
               return null;
            } else {
               var5.method_33265(var6);
               return new class_650(this, var6);
            }
         } catch (IOException var9) {
            this.method_39370(var6);
            return null;
         }
      }
   }

   public void method_39355(class_3918 var1) throws IOException {
      this.field_43762.method_13860(method_39359(var1.method_18136()));
   }

   public void method_39357(class_7839 var1, class_7839 var2) {
      class_7278 var5 = new class_7278(var2);
      class_8748 var6 = ((class_2367)var1.method_35481()).field_11861;
      class_1469 var7 = null;

      try {
         var7 = var6.method_40152();
         if (var7 != null) {
            var5.method_33265(var7);
            var7.method_6785();
         }
      } catch (IOException var9) {
         this.method_39370(var7);
      }
   }

   private void method_39370(class_1469 var1) {
      try {
         if (var1 != null) {
            var1.method_6783();
         }
      } catch (IOException var5) {
      }
   }

   public void method_39360() throws IOException {
      this.field_43762.method_13850();
   }

   public void method_39366() throws IOException {
      this.field_43762.method_13853();
   }

   public void method_39372() throws IOException {
      this.field_43762.method_13858();
   }

   public Iterator<String> method_39363() throws IOException {
      return new class_171(this);
   }

   public synchronized int method_39374() {
      return this.field_43767;
   }

   public synchronized int method_39354() {
      return this.field_43764;
   }

   public long method_39369() throws IOException {
      return this.field_43762.method_13854();
   }

   public long method_39375() {
      return this.field_43762.method_13843();
   }

   @Override
   public void flush() throws IOException {
      this.field_43762.flush();
   }

   @Override
   public void close() throws IOException {
      this.field_43762.close();
   }

   public File method_39358() {
      return this.field_43762.method_13840();
   }

   public boolean method_39373() {
      return this.field_43762.method_13842();
   }

   public synchronized void method_39356(class_9227 var1) {
      this.field_43768++;
      if (var1.field_47173 == null) {
         if (var1.field_47172 != null) {
            this.field_43761++;
         }
      } else {
         this.field_43772++;
      }
   }

   public synchronized void method_39368() {
      this.field_43761++;
   }

   public synchronized int method_39362() {
      return this.field_43772;
   }

   public synchronized int method_39353() {
      return this.field_43761;
   }

   public synchronized int method_39365() {
      return this.field_43768;
   }

   public static int method_39361(class_8067 var0) throws IOException {
      try {
         long var3 = var0.method_36579();
         String var5 = var0.method_36584();
         if (var3 >= 0L && var3 <= 2147483647L && var5.isEmpty()) {
            return (int)var3;
         } else {
            throw new IOException("expected an int but was \"" + var3 + var5 + "\"");
         }
      } catch (NumberFormatException var7) {
         throw new IOException(var7.getMessage());
      }
   }
}

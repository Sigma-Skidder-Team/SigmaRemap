package remapped;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;

public final class class_327 {
   public final class_497 field_1221;
   private class_2535 field_1228;
   private final class_8467 field_1226;
   private final Object field_1220;
   private final class_6678 field_1219;
   private int field_1227;
   private class_1617 field_1229;
   private boolean field_1225;
   private boolean field_1218;
   private class_9328 field_1224;

   public class_327(class_8467 var1, class_497 var2, Object var3) {
      this.field_1226 = var1;
      this.field_1221 = var2;
      this.field_1219 = new class_6678(var2, this.method_1517());
      this.field_1220 = var3;
   }

   public class_9328 method_1520(class_8075 var1, boolean var2) {
      int var5 = var1.method_36652();
      int var6 = var1.method_36671();
      int var7 = var1.method_36657();
      boolean var8 = var1.method_36668();

      try {
         class_1617 var9 = this.method_1513(var5, var6, var7, var8, var2);
         class_9328 var10 = var9.method_7208(var1, this);
         synchronized (this.field_1226) {
            this.field_1224 = var10;
            return var10;
         }
      } catch (IOException var14) {
         throw new class_8380(var14);
      }
   }

   private class_1617 method_1513(int var1, int var2, int var3, boolean var4, boolean var5) throws IOException {
      while (true) {
         class_1617 var8 = this.method_1526(var1, var2, var3, var4);
         synchronized (this.field_1226) {
            if (var8.field_8393 == 0) {
               return var8;
            }
         }

         if (var8.method_7213(var5)) {
            return var8;
         }

         this.method_1527();
      }
   }

   private class_1617 method_1526(int var1, int var2, int var3, boolean var4) throws IOException {
      class_2535 var9;
      synchronized (this.field_1226) {
         if (this.field_1225) {
            throw new IllegalStateException("released");
         }

         if (this.field_1224 != null) {
            throw new IllegalStateException("codec != null");
         }

         if (this.field_1218) {
            throw new IOException("Canceled");
         }

         class_1617 var8 = this.field_1229;
         if (var8 != null && !var8.field_8399) {
            return var8;
         }

         class_1850.field_9389.method_8190(this.field_1226, this.field_1221, this, null);
         if (this.field_1229 != null) {
            return this.field_1229;
         }

         var9 = this.field_1228;
      }

      if (var9 == null) {
         var9 = this.field_1219.method_30639();
      }

      class_1617 var16;
      synchronized (this.field_1226) {
         if (this.field_1218) {
            throw new IOException("Canceled");
         }

         class_1850.field_9389.method_8190(this.field_1226, this.field_1221, this, var9);
         if (this.field_1229 != null) {
            this.field_1228 = var9;
            return this.field_1229;
         }

         this.field_1228 = var9;
         this.field_1227 = 0;
         var16 = new class_1617(this.field_1226, var9);
         this.method_1514(var16);
      }

      var16.method_7210(var1, var2, var3, var4);
      this.method_1517().method_25984(var16.method_21597());
      Socket var18 = null;
      synchronized (this.field_1226) {
         class_1850.field_9389.method_8189(this.field_1226, var16);
         if (var16.method_7214()) {
            var18 = class_1850.field_9389.method_8175(this.field_1226, this.field_1221, this);
            var16 = this.field_1229;
         }
      }

      class_8515.method_39202(var18);
      return var16;
   }

   public void method_1518(boolean var1, class_9328 var2) {
      Socket var6;
      synchronized (this.field_1226) {
         if (var2 == null || var2 != this.field_1224) {
            throw new IllegalStateException("expected " + this.field_1224 + " but was " + var2);
         }

         if (!var1) {
            this.field_1229.field_8393++;
         }

         var6 = this.method_1515(var1, false, true);
      }

      class_8515.method_39202(var6);
   }

   public class_9328 method_1521() {
      synchronized (this.field_1226) {
         return this.field_1224;
      }
   }

   private class_5740 method_1517() {
      return class_1850.field_9389.method_8183(this.field_1226);
   }

   public synchronized class_1617 method_1522() {
      return this.field_1229;
   }

   public void method_1528() {
      Socket var4;
      synchronized (this.field_1226) {
         var4 = this.method_1515(false, true, false);
      }

      class_8515.method_39202(var4);
   }

   public void method_1527() {
      Socket var4;
      synchronized (this.field_1226) {
         var4 = this.method_1515(true, false, false);
      }

      class_8515.method_39202(var4);
   }

   private Socket method_1515(boolean var1, boolean var2, boolean var3) {
      assert Thread.holdsLock(this.field_1226);

      if (var3) {
         this.field_1224 = null;
      }

      if (var2) {
         this.field_1225 = true;
      }

      Socket var6 = null;
      if (this.field_1229 != null) {
         if (var1) {
            this.field_1229.field_8399 = true;
         }

         if (this.field_1224 == null && (this.field_1225 || this.field_1229.field_8399)) {
            this.method_1529(this.field_1229);
            if (this.field_1229.field_8404.isEmpty()) {
               this.field_1229.field_8395 = System.nanoTime();
               if (class_1850.field_9389.method_8180(this.field_1226, this.field_1229)) {
                  var6 = this.field_1229.method_21599();
               }
            }

            this.field_1229 = null;
         }
      }

      return var6;
   }

   public void method_1516() {
      class_9328 var4;
      class_1617 var5;
      synchronized (this.field_1226) {
         this.field_1218 = true;
         var4 = this.field_1224;
         var5 = this.field_1229;
      }

      if (var4 != null) {
         var4.method_43065();
      } else if (var5 != null) {
         var5.method_7215();
      }
   }

   public void method_1525(IOException var1) {
      boolean var4 = false;
      Socket var7;
      synchronized (this.field_1226) {
         if (var1 instanceof class_7199) {
            class_7199 var6 = (class_7199)var1;
            if (var6.field_37006 == class_1692.field_8761) {
               this.field_1227++;
            }

            if (var6.field_37006 != class_1692.field_8761 || this.field_1227 > 1) {
               var4 = true;
               this.field_1228 = null;
            }
         } else if (this.field_1229 != null && (!this.field_1229.method_7214() || var1 instanceof class_5765)) {
            var4 = true;
            if (this.field_1229.field_8393 == 0) {
               if (this.field_1228 != null && var1 != null) {
                  this.field_1219.method_30638(this.field_1228, var1);
               }

               this.field_1228 = null;
            }
         }

         var7 = this.method_1515(var4, false, true);
      }

      class_8515.method_39202(var7);
   }

   public void method_1514(class_1617 var1) {
      assert Thread.holdsLock(this.field_1226);

      if (this.field_1229 == null) {
         this.field_1229 = var1;
         var1.field_8404.add(new class_9570(this, this.field_1220));
      } else {
         throw new IllegalStateException();
      }
   }

   private void method_1529(class_1617 var1) {
      int var4 = 0;

      for (int var5 = var1.field_8404.size(); var4 < var5; var4++) {
         Reference var6 = var1.field_8404.get(var4);
         if (var6.get() == this) {
            var1.field_8404.remove(var4);
            return;
         }
      }

      throw new IllegalStateException();
   }

   public Socket method_1524(class_1617 var1) {
      assert Thread.holdsLock(this.field_1226);

      if (this.field_1224 == null && this.field_1229.field_8404.size() == 1) {
         Reference var4 = this.field_1229.field_8404.get(0);
         Socket var5 = this.method_1515(true, false, false);
         this.field_1229 = var1;
         var1.field_8404.add(var4);
         return var5;
      } else {
         throw new IllegalStateException();
      }
   }

   public boolean method_1519() {
      return this.field_1228 != null || this.field_1219.method_30642();
   }

   @Override
   public String toString() {
      class_1617 var3 = this.method_1522();
      return var3 == null ? this.field_1221.toString() : var3.toString();
   }
}

package mapped;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;

public final class Class5751 {
   public final Class6165 field25179;
   private Class7723 field25180;
   private final Class9457 field25181;
   private final Object field25182;
   private final Class9009 field25183;
   private int field25184;
   private Class7263 field25185;
   private boolean field25186;
   private boolean field25187;
   private Class7932 field25188;
   public static final boolean field25189 = !Class5751.class.desiredAssertionStatus();

   public Class5751(Class9457 var1, Class6165 var2, Object var3) {
      this.field25181 = var1;
      this.field25179 = var2;
      this.field25183 = new Class9009(var2, this.method17931());
      this.field25182 = var3;
   }

   public Class7932 method17926(Class2391 var1, boolean var2) {
      int var5 = var1.method9802();
      int var6 = var1.method9803();
      int var7 = var1.method9804();
      boolean var8 = var1.method9821();

      try {
         Class7263 var9 = this.method17927(var5, var6, var7, var8, var2);
         Class7932 var10 = var9.method22810(var1, this);
         synchronized (this.field25181) {
            this.field25188 = var10;
            return var10;
         }
      } catch (IOException var14) {
         throw new Class2503(var14);
      }
   }

   private Class7263 method17927(int var1, int var2, int var3, boolean var4, boolean var5) throws IOException {
      while (true) {
         Class7263 var8 = this.method17928(var1, var2, var3, var4);
         synchronized (this.field25181) {
            if (var8.field31164 == 0) {
               return var8;
            }
         }

         if (var8.method22815(var5)) {
            return var8;
         }

         this.method17934();
      }
   }

   private Class7263 method17928(int var1, int var2, int var3, boolean var4) throws IOException {
      Class7723 var9;
      synchronized (this.field25181) {
         if (this.field25186) {
            throw new IllegalStateException("released");
         }

         if (this.field25188 != null) {
            throw new IllegalStateException("codec != null");
         }

         if (this.field25187) {
            throw new IOException("Canceled");
         }

         Class7263 var8 = this.field25185;
         if (var8 != null && !var8.field31163) {
            return var8;
         }

         Class6605.field29047.method20018(this.field25181, this.field25179, this, null);
         if (this.field25185 != null) {
            return this.field25185;
         }

         var9 = this.field25180;
      }

      if (var9 == null) {
         var9 = this.field25183.method33285();
      }

      Class7263 var16;
      synchronized (this.field25181) {
         if (this.field25187) {
            throw new IOException("Canceled");
         }

         Class6605.field29047.method20018(this.field25181, this.field25179, this, var9);
         if (this.field25185 != null) {
            this.field25180 = var9;
            return this.field25185;
         }

         this.field25180 = var9;
         this.field25184 = 0;
         var16 = new Class7263(this.field25181, var9);
         this.method17938(var16);
      }

      var16.method22801(var1, var2, var3, var4);
      this.method17931().method31545(var16.method22812());
      Socket var18 = null;
      synchronized (this.field25181) {
         Class6605.field29047.method20021(this.field25181, var16);
         if (var16.method22819()) {
            var18 = Class6605.field29047.method20020(this.field25181, this.field25179, this);
            var16 = this.field25185;
         }
      }

      Class9474.method36536(var18);
      return var16;
   }

   public void method17929(boolean var1, Class7932 var2) {
      Socket var6;
      synchronized (this.field25181) {
         if (var2 == null || var2 != this.field25188) {
            throw new IllegalStateException("expected " + this.field25188 + " but was " + var2);
         }

         if (!var1) {
            this.field25185.field31164++;
         }

         var6 = this.method17935(var1, false, true);
      }

      Class9474.method36536(var6);
   }

   public Class7932 method17930() {
      synchronized (this.field25181) {
         return this.field25188;
      }
   }

   private Class8743 method17931() {
      return Class6605.field29047.method20022(this.field25181);
   }

   public synchronized Class7263 method17932() {
      return this.field25185;
   }

   public void method17933() {
      Socket var4;
      synchronized (this.field25181) {
         var4 = this.method17935(false, true, false);
      }

      Class9474.method36536(var4);
   }

   public void method17934() {
      Socket var4;
      synchronized (this.field25181) {
         var4 = this.method17935(true, false, false);
      }

      Class9474.method36536(var4);
   }

   private Socket method17935(boolean var1, boolean var2, boolean var3) {
      if (!field25189 && !Thread.holdsLock(this.field25181)) {
         throw new AssertionError();
      } else {
         if (var3) {
            this.field25188 = null;
         }

         if (var2) {
            this.field25186 = true;
         }

         Socket var6 = null;
         if (this.field25185 != null) {
            if (var1) {
               this.field25185.field31163 = true;
            }

            if (this.field25188 == null && (this.field25186 || this.field25185.field31163)) {
               this.method17939(this.field25185);
               if (this.field25185.field31166.isEmpty()) {
                  this.field25185.field31167 = System.nanoTime();
                  if (Class6605.field29047.method20017(this.field25181, this.field25185)) {
                     var6 = this.field25185.method22814();
                  }
               }

               this.field25185 = null;
            }
         }

         return var6;
      }
   }

   public void method17936() {
      Class7932 var4;
      Class7263 var5;
      synchronized (this.field25181) {
         this.field25187 = true;
         var4 = this.field25188;
         var5 = this.field25185;
      }

      if (var4 != null) {
         var4.method26673();
      } else if (var5 != null) {
         var5.method22813();
      }
   }

   public void method17937(IOException var1) {
      boolean var4 = false;
      Socket var7;
      synchronized (this.field25181) {
         if (var1 instanceof Class2461) {
            Class2461 var6 = (Class2461)var1;
            if (var6.field16543 == Class2077.field13531) {
               this.field25184++;
            }

            if (var6.field16543 != Class2077.field13531 || this.field25184 > 1) {
               var4 = true;
               this.field25180 = null;
            }
         } else if (this.field25185 != null && (!this.field25185.method22819() || var1 instanceof Class2458)) {
            var4 = true;
            if (this.field25185.field31164 == 0) {
               if (this.field25180 != null && var1 != null) {
                  this.field25183.method33286(this.field25180, var1);
               }

               this.field25180 = null;
            }
         }

         var7 = this.method17935(var4, false, true);
      }

      Class9474.method36536(var7);
   }

   public void method17938(Class7263 var1) {
      if (!field25189 && !Thread.holdsLock(this.field25181)) {
         throw new AssertionError();
      } else if (this.field25185 == null) {
         this.field25185 = var1;
         var1.field31166.add(new Class2(this, this.field25182));
      } else {
         throw new IllegalStateException();
      }
   }

   private void method17939(Class7263 var1) {
      int var4 = 0;

      for (int var5 = var1.field31166.size(); var4 < var5; var4++) {
         Reference var6 = var1.field31166.get(var4);
         if (var6.get() == this) {
            var1.field31166.remove(var4);
            return;
         }
      }

      throw new IllegalStateException();
   }

   public Socket method17940(Class7263 var1) {
      if (!field25189 && !Thread.holdsLock(this.field25181)) {
         throw new AssertionError();
      } else if (this.field25188 == null && this.field25185.field31166.size() == 1) {
         Reference var4 = this.field25185.field31166.get(0);
         Socket var5 = this.method17935(true, false, false);
         this.field25185 = var1;
         var1.field31166.add(var4);
         return var5;
      } else {
         throw new IllegalStateException();
      }
   }

   public boolean method17941() {
      return this.field25180 != null || this.field25183.method33284();
   }

   @Override
   public String toString() {
      Class7263 var3 = this.method17932();
      return var3 == null ? this.field25179.toString() : var3.toString();
   }
}

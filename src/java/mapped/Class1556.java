package mapped;

import java.io.IOException;
import java.util.List;

public class Class1556 extends Class1555 implements Class1557 {
   public final Class1791 field8439;
   public final Class1767 field8440;

   public Class1556(Class1767 var1, Class1791 var2) {
      super("OkHttp %s", var1.field9558);
      this.field8440 = var1;
      this.field8439 = var2;
   }

   @Override
   public void method6472() {
      Class2077 var3 = Class2077.field13529;
      Class2077 var4 = Class2077.field13529;

      try {
         this.field8439.method7813(this);

         while (this.field8439.method7814(false, this)) {
         }

         var3 = Class2077.field13527;
         var4 = Class2077.field13532;
      } catch (IOException var14) {
         var3 = Class2077.field13528;
         var4 = Class2077.field13528;
      } finally {
         try {
            this.field8440.close(var3, var4);
         } catch (IOException var13) {
         }

         Class9474.method36535(this.field8439);
      }
   }

   @Override
   public void method6473(boolean var1, int var2, Class1735 var3, int var4) throws IOException {
      if (!this.field8440.method7729(var2)) {
         Class9698 var7 = this.field8440.method7707(var2);
         if (var7 != null) {
            var7.method37992(var3, var4);
            if (var1) {
               var7.method37993();
            }
         } else {
            this.field8440.method7716(var2, Class2077.field13528);
            var3.method7627((long)var4);
         }
      } else {
         this.field8440.method7732(var2, var3, var4, var1);
      }
   }

   @Override
   public void method6474(boolean var1, int var2, int var3, List<Class8350> var4) {
      if (this.field8440.method7729(var2)) {
         this.field8440.method7731(var2, var4, var1);
      } else {
         Class9698 var8;
         synchronized (this.field8440) {
            if (this.field8440.field9561) {
               return;
            }

            var8 = this.field8440.method7707(var2);
            if (var8 == null) {
               if (var2 <= this.field8440.field9559) {
                  return;
               }

               if (var2 % 2 == this.field8440.field9560 % 2) {
                  return;
               }

               Class9698 var9 = new Class9698(var2, this.field8440, false, var1, var4);
               this.field8440.field9559 = var2;
               this.field8440.field9557.put(var2, var9);
               Class1767.field9554.execute(new Class1565(this, "OkHttp %s stream %d", new Object[]{this.field8440.field9558, var2}, var9));
               return;
            }
         }

         var8.method37991(var4);
         if (var1) {
            var8.method37993();
         }
      }
   }

   @Override
   public void method6475(int var1, Class2077 var2) {
      if (!this.field8440.method7729(var1)) {
         Class9698 var5 = this.field8440.method7708(var1);
         if (var5 != null) {
            var5.method37994(var2);
         }
      } else {
         this.field8440.method7733(var1, var2);
      }
   }

   @Override
   public void method6476(boolean var1, Class8702 var2) {
      long var5 = 0L;
      Class9698[] var7 = null;
      synchronized (this.field8440) {
         int var9 = this.field8440.field9570.method31385();
         if (var1) {
            this.field8440.field9570.method31375();
         }

         this.field8440.field9570.method31386(var2);
         this.method6477(var2);
         int var10 = this.field8440.field9570.method31385();
         if (var10 != -1 && var10 != var9) {
            var5 = (long)(var10 - var9);
            if (!this.field8440.field9571) {
               this.field8440.method7715(var5);
               this.field8440.field9571 = true;
            }

            if (!this.field8440.field9557.isEmpty()) {
               var7 = this.field8440.field9557.values().<Class9698>toArray(new Class9698[this.field8440.field9557.size()]);
            }
         }

         Class1767.field9554.execute(new Class1567(this, "OkHttp %s settings", this.field8440.field9558));
      }

      if (var7 != null && var5 != 0L) {
         for (Class9698 var11 : var7) {
            synchronized (var11) {
               var11.method37996(var5);
            }
         }
      }
   }

   private void method6477(Class8702 var1) {
      Class1767.field9554.execute(new Class1558(this, "OkHttp %s ACK Settings", new Object[]{this.field8440.field9558}, var1));
   }

   @Override
   public void method6478() {
   }

   @Override
   public void method6479(boolean var1, int var2, int var3) {
      if (!var1) {
         this.field8440.method7720(true, var2, var3, null);
      } else {
         Class9224 var6 = this.field8440.method7722(var2);
         if (var6 != null) {
            var6.method34700();
         }
      }
   }

   @Override
   public void method6480(int var1, Class2077 var2, Class2003 var3) {
      if (var3.method8458() > 0) {
      }

      Class9698[] var7;
      synchronized (this.field8440) {
         var7 = this.field8440.field9557.values().<Class9698>toArray(new Class9698[this.field8440.field9557.size()]);
         this.field8440.field9561 = true;
      }

      for (Class9698 var10 : var7) {
         if (var10.method37976() > var1 && var10.method37978()) {
            var10.method37994(Class2077.field13531);
            this.field8440.method7708(var10.method37976());
         }
      }
   }

   @Override
   public void method6481(int var1, long var2) {
      if (var1 == 0) {
         synchronized (this.field8440) {
            this.field8440.field9567 += var2;
            this.field8440.notifyAll();
         }
      } else {
         Class9698 var11 = this.field8440.method7707(var1);
         if (var11 != null) {
            synchronized (var11) {
               var11.method37996(var2);
            }
         }
      }
   }

   @Override
   public void method6482(int var1, int var2, int var3, boolean var4) {
   }

   @Override
   public void method6483(int var1, int var2, List<Class8350> var3) {
      this.field8440.method7730(var2, var3);
   }

   @Override
   public void method6484(int var1, String var2, Class2003 var3, String var4, int var5, long var6) {
   }
}

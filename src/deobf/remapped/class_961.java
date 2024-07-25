package remapped;

import java.io.IOException;
import java.util.List;

public class class_961 extends class_5548 implements class_7554 {
   public final class_5487 field_4934;

   public class_961(class_2695 var1, class_5487 var2) {
      super("OkHttp %s", var1.field_13202);
      this.field_4935 = var1;
      this.field_4934 = var2;
   }

   @Override
   public void method_25227() {
      class_1692 var3 = class_1692.field_8756;
      class_1692 var4 = class_1692.field_8756;

      try {
         this.field_4934.method_24933(this);

         while (this.field_4934.method_24931(false, this)) {
         }

         var3 = class_1692.field_8759;
         var4 = class_1692.field_8762;
      } catch (IOException var14) {
         var3 = class_1692.field_8760;
         var4 = class_1692.field_8760;
      } finally {
         try {
            this.field_4935.close(var3, var4);
         } catch (IOException var13) {
         }

         class_8515.method_39200(this.field_4934);
      }
   }

   public void 샱瀳䆧鞞뵯柿(boolean var1, int var2, class_8067 var3, int var4) throws IOException {
      if (!this.field_4935.method_12114(var2)) {
         class_9388 var7 = this.field_4935.method_12123(var2);
         if (var7 != null) {
            var7.method_43420(var3, var4);
            if (var1) {
               var7.method_43424();
            }
         } else {
            this.field_4935.method_12129(var2, class_1692.field_8760);
            var3.method_36583((long)var4);
         }
      } else {
         this.field_4935.method_12131(var2, var3, var4, var1);
      }
   }

   public void 属洝玑쟗湗ꁈ(boolean var1, int var2, int var3, List<class_4331> var4) {
      if (this.field_4935.method_12114(var2)) {
         this.field_4935.method_12137(var2, var4, var1);
      } else {
         class_9388 var8;
         synchronized (this.field_4935) {
            if (this.field_4935.field_13204) {
               return;
            }

            var8 = this.field_4935.method_12123(var2);
            if (var8 == null) {
               if (var2 <= this.field_4935.field_13207) {
                  return;
               }

               if (var2 % 2 == this.field_4935.field_13200 % 2) {
                  return;
               }

               class_9388 var9 = new class_9388(var2, this.field_4935, false, var1, var4);
               this.field_4935.field_13207 = var2;
               this.field_4935.field_13192.put(var2, var9);
               class_2695.field_13193.execute(new class_4174(this, "OkHttp %s stream %d", new Object[]{this.field_4935.field_13202, var2}, var9));
               return;
            }
         }

         var8.method_43416(var4);
         if (var1) {
            var8.method_43424();
         }
      }
   }

   public void 햠뼢眓浣퉧哺(int var1, class_1692 var2) {
      if (!this.field_4935.method_12114(var1)) {
         class_9388 var5 = this.field_4935.method_12136(var1);
         if (var5 != null) {
            var5.method_43425(var2);
         }
      } else {
         this.field_4935.method_12128(var1, var2);
      }
   }

   public void 쿨ࡅ䬾亟뗴䢶(boolean var1, class_5605 var2) {
      long var5 = 0L;
      class_9388[] var7 = null;
      synchronized (this.field_4935) {
         int var9 = this.field_4935.field_13190.method_25452();
         if (var1) {
            this.field_4935.field_13190.method_25445();
         }

         this.field_4935.field_13190.method_25456(var2);
         this.method_4226(var2);
         int var10 = this.field_4935.field_13190.method_25452();
         if (var10 != -1 && var10 != var9) {
            var5 = (long)(var10 - var9);
            if (!this.field_4935.field_13198) {
               this.field_4935.method_12134(var5);
               this.field_4935.field_13198 = true;
            }

            if (!this.field_4935.field_13192.isEmpty()) {
               var7 = this.field_4935.field_13192.values().<class_9388>toArray(new class_9388[this.field_4935.field_13192.size()]);
            }
         }

         class_2695.field_13193.execute(new class_4822(this, "OkHttp %s settings", this.field_4935.field_13202));
      }

      if (var7 != null && var5 != 0L) {
         for (class_9388 var11 : var7) {
            synchronized (var11) {
               var11.method_43410(var5);
            }
         }
      }
   }

   private void method_4226(class_5605 var1) {
      class_2695.field_13193.execute(new class_8717(this, "OkHttp %s ACK Settings", new Object[]{this.field_4935.field_13202}, var1));
   }

   public void 蕃䢿Ꮺᜄ蓳햠() {
   }

   public void 䆧Ꮤ䈔쬷鶲괠(boolean var1, int var2, int var3) {
      if (!var1) {
         this.field_4935.method_12135(true, var2, var3, null);
      } else {
         class_7533 var6 = this.field_4935.method_12122(var2);
         if (var6 != null) {
            var6.method_34321();
         }
      }
   }

   public void 岋홵捉펊㢸浣(int var1, class_1692 var2, class_9091 var3) {
      if (var3.method_41902() > 0) {
      }

      class_9388[] var7;
      synchronized (this.field_4935) {
         var7 = this.field_4935.field_13192.values().<class_9388>toArray(new class_9388[this.field_4935.field_13192.size()]);
         this.field_4935.field_13204 = true;
      }

      for (class_9388 var10 : var7) {
         if (var10.method_43409() > var1 && var10.method_43423()) {
            var10.method_43425(class_1692.field_8761);
            this.field_4935.method_12136(var10.method_43409());
         }
      }
   }

   public void 㹔蚳㥇㮃쬫셴(int var1, long var2) {
      if (var1 == 0) {
         synchronized (this.field_4935) {
            this.field_4935.field_13187 += var2;
            this.field_4935.notifyAll();
         }
      } else {
         class_9388 var11 = this.field_4935.method_12123(var1);
         if (var11 != null) {
            synchronized (var11) {
               var11.method_43410(var2);
            }
         }
      }
   }

   public void Ꮀ뎫汌䣓鏟䡸(int var1, int var2, int var3, boolean var4) {
   }

   public void 佉杭䩜ᙽ婯㱙(int var1, int var2, List<class_4331> var3) {
      this.field_4935.method_12140(var2, var3);
   }

   public void 䩜Ꮀ뎫䬹㕠鏟(int var1, String var2, class_9091 var3, String var4, int var5, long var6) {
   }
}

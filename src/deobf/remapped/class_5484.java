package remapped;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class class_5484 extends class_446 {
   private int field_27953 = 250;
   private int field_27948 = 40;
   private int field_27927 = 64;
   private int field_27941 = 94;
   private String field_27936 = "Music Player";
   public static URL field_27944;
   private class_2612 field_27937;
   private class_2612 field_27939;
   private class_7038 field_27945;
   private class_2026 field_27956 = SigmaMainClass.getInstance().method_3300();
   public static Map<String, class_8896> field_27926 = new LinkedHashMap<String, class_8896>();
   public static String field_27946;
   public static class_8896 field_27942;
   private class_6220 field_27928;
   private class_6220 field_27955;
   private class_6220 field_27950;
   private class_6220 field_27954;
   private class_4936 field_27938;
   private int field_27931;
   private class_8343 field_27943;
   private class_7038 field_27929;
   public class_1461 field_27934;
   public class_5915 field_27932;
   public static class_8896[] field_27930;
   private static CookieManager field_27952 = new CookieManager();
   public static long field_27935 = 0L;
   public float field_27951 = 0.0F;
   public float field_27940 = 0.0F;
   private class_2440 field_27949 = new class_2440(80, 150, class_4043.field_19618);
   public boolean field_27933 = false;

   public class_5484(class_7038 var1, String var2) {
      super(var1, var2, 875, 55, 800, 600, false);
      field_27935 = System.nanoTime();
      this.method_32142(800);
      this.method_32158(600);
      this.method_32175(Math.abs(this.method_32132()));
      this.method_32117(Math.abs(this.method_32173()));
      this.method_32148(
         this.field_27937 = new class_2612(this, "musictabs", 0, this.field_27927 + 14, this.field_27953, this.method_32137() - 64 - this.field_27941)
      );
      this.method_32148(
         this.field_27945 = new class_2612(
            this, "musiccontrols", this.field_27953, this.method_32137() - this.field_27941, this.method_32109() - this.field_27953, this.field_27941
         )
      );
      this.method_32148(this.field_27929 = new class_7038(this, "reShowView", 0, 0, 1, this.method_32137()));
      class_6899 var5;
      this.method_32148(var5 = new class_6899(this, "spectrumButton", 15, this.field_36257 - 140, 40, 40, this.field_27956.method_9498()));
      var5.method_32187(true);
      var5.method_32100((var1x, var2x) -> {
         this.field_27956.method_9480(!this.field_27956.method_9498());
         ((class_6899)var1x).method_31596(this.field_27956.method_9498());
      });
      this.field_27937.method_32105(false);
      var5.method_32105(false);
      this.field_27945.method_32105(false);
      this.field_27929.method_32105(false);
      class_590 var6 = new class_590(1250067, -15329770).method_2765(class_1255.field_6918.field_6917).method_2775(class_6206.field_31726);
      ArrayList var7 = new ArrayList();
      class_5484 var8 = this;
      int var9 = 0;

      for (class_8896 var13 : field_27930) {
         var7.add(new Thread(() -> {
            if (!field_27926.containsKey(var13.field_45629) && !var13.field_45630) {
               var13.field_45630 = true;
               var13.method_40951();

               for (int var6x = 0; var13.field_45627.size() == 0 && var6x < 4; var6x++) {
                  try {
                     Thread.sleep(4000L);
                  } catch (InterruptedException var8x) {
                  }

                  var13.method_40951();
               }

               field_27926.put(var13.field_45629, var13);
            }

            this.method_32102(new class_5073(this, var13, var6, var8));
         }));
         var9++;
         ((Thread)var7.get(var7.size() - 1)).start();
      }

      int var15 = (this.method_32109() - this.field_27953 - 38) / 2;
      this.field_27945
         .method_32148(
            this.field_27928 = new class_122(
               this.field_27945, "play", var15, 27, 38, 38, NotificationIcons.field_11037, new class_590(class_1255.field_6918.field_6917), null
            )
         );
      this.field_27945
         .method_32148(
            this.field_27955 = new class_122(
               this.field_27945, "pause", var15, 27, 38, 38, NotificationIcons.field_11000, new class_590(class_1255.field_6918.field_6917), null
            )
         );
      this.field_27945
         .method_32148(
            this.field_27950 = new class_122(
               this.field_27945, "forwards", var15 + 114, 23, 46, 46, NotificationIcons.field_11046, new class_590(class_1255.field_6918.field_6917), null
            )
         );
      this.field_27945
         .method_32148(
            this.field_27954 = new class_122(
               this.field_27945, "backwards", var15 - 114, 23, 46, 46, NotificationIcons.field_11040, new class_590(class_1255.field_6918.field_6917), null
            )
         );
      this.field_27945.method_32148(this.field_27938 = new class_4936(this.field_27945, "volume", this.method_32109() - this.field_27953 - 19, 14, 4, 40));
      class_9395 var16;
      this.field_27945.method_32148(var16 = new class_9395(this.field_27945, "repeat", 14, 34, 27, 20, this.field_27956.method_9501()));
      var16.method_8236(var2x -> this.field_27956.method_9475(var16.method_43466()));
      this.method_32148(
         this.field_27932 = new class_5915(this, "progress", this.field_27953, this.method_32137() - 5, this.method_32109() - this.field_27953, 5)
      );
      this.field_27932.method_32187(true);
      this.field_27932.method_32105(false);
      this.field_27929.method_32187(true);
      this.field_27929.method_32184((var1x, var2x) -> {
         this.field_27933 = true;
         this.field_27951 = (float)this.method_32132();
         this.field_27940 = (float)this.method_32173();
      });
      this.field_27955.method_32104(false);
      this.field_27928.method_32104(false);
      this.field_27928.method_32100((var1x, var2x) -> this.field_27956.method_9496(true));
      this.field_27955.method_32100((var1x, var2x) -> this.field_27956.method_9496(false));
      this.field_27950.method_32100((var1x, var2x) -> this.field_27956.method_9474());
      this.field_27954.method_32100((var1x, var2x) -> this.field_27956.method_9473());
      this.field_27938.method_22638(var1x -> this.field_27956.method_9509((int)((1.0F - this.field_27938.method_22637()) * 100.0F)));
      this.field_27938.method_22635(1.0F - (float)this.field_27956.method_9503() / 100.0F);
      this.method_32148(
         this.field_27934 = new class_1461(
            this, "search", this.field_27953, 0, this.method_32109() - this.field_27953, this.method_32137() - this.field_27941, "Search..."
         )
      );
      this.field_27934.method_32104(true);
      this.field_27934.method_32105(false);
   }

   private void method_24927(class_2612 var1) {
      if (this.field_27939 != null) {
         this.field_27939.method_32104(false);
      }

      var1.method_32104(true);
      this.field_27936 = var1.method_32165();
      this.field_27939 = var1;
      this.field_27934.method_32104(false);
      this.field_27939.field_12900 = 65;
   }

   private void method_24920(class_8896 var1, class_7144 var2) {
      if (!((class_734)this.method_32167()).method_3358()) {
         this.field_27956.method_9489(var1, var2);
         field_27942 = var1;
      }
   }

   private void method_24928(class_7144 var1) {
      field_27946 = var1.field_36798;
      field_27946 = field_27946.replaceAll("\\(.*\\)", "");
      field_27946 = field_27946.replaceAll("\\[.*\\]", "");
   }

   @Override
   public void method_32145(int var1, int var2) {
      long var5 = System.nanoTime() - field_27935;
      float var7 = Math.min(10.0F, Math.max(0.0F, (float)var5 / 1.810361E7F));
      field_27935 = System.nanoTime();
      super.method_32145(var1, var2);
      if (this.field_36283 instanceof class_734) {
         if (!this.method_1535()) {
            if ((this.field_36267 || this.field_27933) && !this.method_1537() && !this.method_1535()) {
               this.field_27933 = true;
               int var11 = this.field_36283.method_32109() - 20 - this.method_32109();
               int var13 = (this.field_36283.method_32137() - this.method_32137()) / 2;
               float var10 = this.field_27951 - (float)var11;
               this.field_27951 = Math.max(this.field_27951 - (this.field_27951 - (float)var11) * 0.25F * var7, (float)var11);
               if (!(this.field_27940 - (float)var13 > 0.0F)) {
                  Math.min(this.field_27940 = this.field_27940 - (this.field_27940 - (float)var13) * 0.2F * var7, (float)var13);
               } else {
                  Math.max(this.field_27940 = this.field_27940 - (this.field_27940 - (float)var13) * 0.2F * var7, (float)var13);
               }

               if (!(this.field_27951 - (float)var11 < 0.0F)) {
                  if (this.field_27951 - (float)var11 - (float)this.method_32109() > 0.0F) {
                     this.field_27951 = (float)var11;
                  }
               } else {
                  this.field_27951 = (float)var11;
               }

               this.method_32175((int)this.field_27951);
               this.method_32117((int)this.field_27940);
               if (Math.abs(this.field_27951 - (float)var11) < 2.0F && Math.abs(this.field_27940 - (float)var13) < 2.0F) {
                  this.method_1533(true);
                  this.field_27933 = false;
               }
            } else if (this.method_32132() + this.method_32109() > this.field_36283.method_32109() || this.method_32132() < 0 || this.method_32173() < 0) {
               if (this.field_27951 == 0.0F || this.field_27940 == 0.0F) {
                  this.field_27951 = (float)this.method_32132();
                  this.field_27940 = (float)this.method_32173();
               }

               int var8 = this.field_36283.method_32109() - 40;
               int var9 = (this.field_36283.method_32137() - this.method_32137()) / 2;
               this.field_27951 = Math.min(this.field_27951 - (this.field_27951 - (float)var8) * 0.25F * var7, (float)var8);
               if (!(this.field_27940 - (float)var9 > 0.0F)) {
                  Math.min(this.field_27940 = this.field_27940 - (this.field_27940 - (float)var9) * 0.2F * var7, (float)var9);
               } else {
                  Math.max(this.field_27940 = this.field_27940 - (this.field_27940 - (float)var9) * 0.2F * var7, (float)var9);
               }

               if (!(this.field_27951 - (float)var8 > 0.0F)) {
                  if (this.field_27951 - (float)var8 + (float)this.method_32109() < 0.0F) {
                     this.field_27951 = (float)var8;
                  }
               } else {
                  this.field_27951 = (float)var8;
               }

               if (Math.abs(this.field_27951 - (float)var8) < 2.0F && Math.abs(this.field_27940 - (float)var9) < 2.0F) {
                  this.field_27951 = (float)this.method_32132();
                  this.field_27940 = (float)this.method_32173();
               }

               this.method_32175((int)this.field_27951);
               this.method_32117((int)this.field_27940);
               this.method_1533(false);
               this.method_1536(false);
            }
         } else {
            int var12 = var1 - this.field_20332 - (this.field_36283 == null ? 0 : this.field_36283.method_32155());
            short var14 = 200;
            if (var12 + this.method_32109() > this.field_36283.method_32109() + var14 && var1 - this.field_20345 > 70) {
               int var15 = var12 - this.method_32132() - var14;
               this.method_32175((int)((float)this.method_32132() + (float)var15 * 0.5F));
               this.field_27951 = (float)this.method_32132();
               this.field_27940 = (float)this.method_32173();
            }
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      super.method_32190();
      super.method_32130();
      this.field_27929.method_32142(this.method_32132() + this.method_32109() <= this.field_36283.method_32109() ? 0 : 41);
      this.field_27949
         .method_11119(
            this.method_32132() + this.method_32109() > this.field_36283.method_32109() && !this.field_27933 ? class_4043.field_19620 : class_4043.field_19618
         );
      var1 *= 0.5F + (1.0F - this.field_27949.method_11123()) * 0.5F;
      if (this.field_27956.method_9486()) {
         this.field_27928.method_32104(false);
         this.field_27955.method_32104(true);
      } else {
         this.field_27928.method_32104(true);
         this.field_27955.method_32104(false);
      }

      class_73.method_94(
         (float)(this.method_32132() + this.field_27953),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137() - this.field_27941),
         class_314.method_1444(-14277082, var1 * 0.8F)
      );
      class_73.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.field_27953),
         (float)(this.method_32173() + this.method_32137() - this.field_27941),
         class_314.method_1444(-16777216, var1 * 0.95F)
      );
      this.method_24924(var1);
      this.method_24918(var1);
      this.method_24921(var1);
      byte var4 = 55;
      class_73.method_87(
         class_5320.field_27153,
         (float)(var4 + this.method_32132()),
         (float)(this.method_32173() + 20),
         "Jello",
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      class_73.method_87(
         class_5320.field_27152,
         (float)(var4 + this.method_32132() + 80),
         (float)(this.method_32173() + 40),
         "music",
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      class_73.method_128((float)this.method_32132(), (float)this.method_32173(), (float)this.method_32109(), (float)this.method_32137(), 14.0F, var1);
      super.method_32178(var1);
      if (this.field_27939 != null) {
         this.method_24926(var1);
      }
   }

   private void method_24921(float var1) {
      int var4 = (int)this.field_27956.method_9466();
      int var5 = this.field_27956.method_9483();
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + this.field_27953 + 14),
         (float)(this.method_32173() + this.method_32137() - 10) - 22.0F * var1,
         class_7763.method_35222(var4),
         class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
      );
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.method_32132() + this.method_32109() - 14 - class_5320.field_27138.method_18547(class_7763.method_35222(var5))),
         (float)(this.method_32173() + this.method_32137() - 10) - 22.0F * var1,
         class_7763.method_35222(var5),
         class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
      );
   }

   private void method_24924(float var1) {
      class_8343 var4 = this.field_27956.method_9500();
      class_8343 var5 = this.field_27956.method_9506();
      if (var4 != null && var5 != null) {
         class_73.method_99(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - this.field_27941),
            (float)this.method_32109(),
            (float)this.field_27941,
            var5,
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
         );
         class_73.method_94(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - this.field_27941),
            (float)(this.method_32132() + this.method_32109()),
            (float)(this.method_32173() + this.method_32137() - 5),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
         class_73.method_94(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - 5),
            (float)(this.method_32132() + this.field_27953),
            (float)(this.method_32173() + this.method_32137()),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
         class_73.method_99(
            (float)(this.method_32132() + (this.field_27953 - 114) / 2),
            (float)(this.method_32173() + this.method_32137() - 170),
            114.0F,
            114.0F,
            var4,
            class_314.method_1444(class_1255.field_6918.field_6917, var1)
         );
         class_73.method_128(
            (float)(this.method_32132() + (this.field_27953 - 114) / 2), (float)(this.method_32173() + this.method_32137() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      } else {
         class_73.method_99(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - this.field_27941),
            (float)this.method_32109(),
            (float)this.field_27941,
            NotificationIcons.field_11041,
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
         );
         class_73.method_94(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - this.field_27941),
            (float)(this.method_32132() + this.method_32109()),
            (float)(this.method_32173() + this.method_32137() - 5),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
         class_73.method_94(
            (float)this.method_32132(),
            (float)(this.method_32173() + this.method_32137() - 5),
            (float)(this.method_32132() + this.field_27953),
            (float)(this.method_32173() + this.method_32137()),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.43F * var1)
         );
         class_73.method_99(
            (float)(this.method_32132() + (this.field_27953 - 114) / 2),
            (float)(this.method_32173() + this.method_32137() - 170),
            114.0F,
            114.0F,
            NotificationIcons.field_11009,
            class_314.method_1444(class_1255.field_6918.field_6917, var1)
         );
         class_73.method_128(
            (float)(this.method_32132() + (this.field_27953 - 114) / 2), (float)(this.method_32173() + this.method_32137() - 170), 114.0F, 114.0F, 14.0F, var1
         );
      }
   }

   private void method_24918(float var1) {
      if (this.field_27956.method_9487() != null) {
         String[] var4 = this.field_27956.method_9487().split(" - ");
         byte var5 = 30;
         if (var4.length <= 1) {
            this.method_24919(var1, var4[0].length() != 0 ? var4[0] : "Jello Music", this.field_27953 - var5 * 2, 12, 0);
         } else {
            this.method_24919(var1, var4[1], this.field_27953 - var5 * 2, 0, 0);
            this.method_24919(var1, var4[0], this.field_27953 - var5 * 2, 20, -1000);
         }
      }
   }

   private void method_24919(float var1, String var2, int var3, int var4, int var5) {
      Date var8 = new Date();
      float var9 = (float)((var8.getTime() + (long)var5) % 8500L) / 8500.0F;
      if (!(var9 < 0.4F)) {
         var9 -= 0.4F;
         var9 = (float)((double)var9 * 1.6666666666666667);
      } else {
         var9 = 0.0F;
      }

      var9 = class_9681.method_44754(var9, 0.0F, 1.0F, 1.0F);
      int var10 = class_5320.field_27138.method_18547(var2);
      int var11 = Math.min(var3, var10);
      int var12 = class_5320.field_27138.method_15654();
      int var13 = this.method_32132() + (this.field_27953 - var11) / 2;
      int var14 = this.method_32173() + this.method_32137() - 50 + var4;
      int var15 = Math.max(0, var10 - var11) * 2;
      if (var10 <= var3) {
         var9 = 0.0F;
      }

      class_73.method_150(var13, var14, var13 + var11, var14 + var12, true);
      class_73.method_87(
         class_5320.field_27138,
         (float)var13 - (float)var10 * var9 - 50.0F * var9,
         (float)var14,
         var2,
         class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1 * Math.min(1.0F, Math.max(0.0F, 1.0F - var9 * 0.75F)))
      );
      if (var9 > 0.0F) {
         class_73.method_87(
            class_5320.field_27138,
            (float)var13 - (float)var10 * var9 + (float)var10,
            (float)var14,
            var2,
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * var1)
         );
      }

      class_73.method_141();
   }

   private void method_24926(float var1) {
      this.field_27939.method_32187(false);
      if (this.field_27931 != this.field_27939.method_11853()) {
         try {
            if (this.field_27943 != null) {
               this.field_27943.method_38413();
            }

            this.field_27943 = class_6568.method_30015(
               "blur",
               class_7849.method_35506(
                  this.method_32132() + this.field_27953, this.method_32173(), this.method_32109() - this.field_27953, this.field_27927, 10, 10
               )
            );
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

      float var4 = this.field_27931 < 50 ? (float)this.field_27931 / 50.0F : 1.0F;
      if (this.field_27943 != null) {
         class_73.method_153(
            (float)this.field_27953,
            0.0F,
            (float)(this.method_32109() - this.field_27953),
            (float)this.field_27927,
            this.field_27943,
            class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1)
         );
      }

      class_73.method_94(
         (float)this.field_27953,
         0.0F,
         (float)this.method_32109(),
         (float)this.field_27927,
         class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1 * 0.2F)
      );
      class_73.method_87(
         class_5320.field_27141,
         (float)((this.method_32109() - class_5320.field_27141.method_18547(this.field_27936) + this.field_27953) / 2),
         16.0F + (1.0F - var4) * 14.0F,
         this.field_27936,
         class_314.method_1444(class_1255.field_6918.field_6917, var4)
      );
      class_73.method_87(
         class_5320.field_27155,
         (float)((this.method_32109() - class_5320.field_27155.method_18547(this.field_27936) + this.field_27953) / 2),
         16.0F + (1.0F - var4) * 14.0F,
         this.field_27936,
         class_314.method_1444(class_1255.field_6918.field_6917, 1.0F - var4)
      );
      class_73.method_99(
         (float)this.field_27953,
         (float)this.field_27927,
         (float)(this.method_32109() - this.field_27953),
         20.0F,
         NotificationIcons.field_10992,
         class_314.method_1444(class_1255.field_6918.field_6917, var4 * var1 * 0.5F)
      );
      this.field_27931 = this.field_27939.method_11853();
   }

   static {
      class_8896[] var4 = new class_8896[]{
         new class_8896("Trap Nation", "UUa10nxShhzNrCE1o2ZOPztg", class_9023.field_46153),
         new class_8896("Chill Nation", "UUM9KEEuzacwVlkt9JfJad7g", class_9023.field_46153),
         new class_8896("VEVO", "PL9tY0BWXOZFu8MzzbNVtUvHs0cQ_gZ03m", class_9023.field_46153),
         new class_8896("Rap Nation", "UU8QfB1wbfrNwNFHQxfyNJsw", class_9023.field_46153),
         new class_8896("MrSuicideSheep", "UU5nc_ZtjKW1htCVZVRxlQAQ", class_9023.field_46153),
         new class_8896("Trap City", "UU65afEgL62PGFWXY7n6CUbA", class_9023.field_46153),
         new class_8896("CloudKid", "UUSa8IUd1uEjlREMa21I3ZPQ", class_9023.field_46153),
         new class_8896("NCS", "UU_aEa8K-EOJ3D6gOs7HcyNg", class_9023.field_46153)
      };
      field_27930 = var4;
   }
}

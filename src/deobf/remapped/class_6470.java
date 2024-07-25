package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Locale.Category;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.opengl.GL11;

public class class_6470 extends class_2596 {
   public static long field_32965 = 0L;
   private int field_32971 = 0;
   private int field_32974 = 0;
   private boolean field_32964 = true;
   public AnotherSigmaMainMenu field_32978;
   public ChangelogClass field_32967;
   public class_7852 field_32959;
   public class_2440 field_32963 = new class_2440(200, 200, class_4043.field_19618);
   public class_2440 field_32975 = new class_2440(200, 200, class_4043.field_19618);
   private class_2440 field_32960 = new class_2440(325, 325);
   private class_2440 field_32968 = new class_2440(800, 800);
   private static class_8343 field_32961;
   public List<class_3670> field_32962 = new ArrayList<class_3670>();
   public static String[] field_32972 = new String[]{
      "Goodbye.",
      "See you soon.",
      "Bye!",
      "Au revoir",
      "See you!",
      "Ciao!",
      "Adios",
      "Farewell",
      "See you later!",
      "Have a good day!",
      "See you arround.",
      "See you tomorrow!",
      "Goodbye, friend.",
      "Logging out.",
      "Signing off!",
      "Shutting down.",
      "Was good to see you!"
   };
   public static String[] field_32977 = new String[]{
      "The two hardest things to say in life are hello for the first time and goodbye for the last.",
      "Don’t cry because it’s over, smile because it happened.",
      "It’s time to say goodbye, but I think goodbyes are sad and I’d much rather say hello. Hello to a new adventure.",
      "We’ll meet again, Don’t know where, don’t know when, But I know we’ll meet again, some sunny day.",
      "This is not a goodbye but a 'see you soon'.",
      "You are my hardest goodbye.",
      "Goodbyes are not forever, are not the end; it simply means I’ll miss you until we meet again.",
      "Good friends never say goodbye. They simply say \"See you soon\".",
      "Every goodbye always makes the next hello closer.",
      "Where's the good in goodbye?",
      "And I'm sorry, so sorry. But, I have to say goodbye."
   };
   public static String field_32979;
   public static String field_32970;
   public static float field_32966;
   public class_9618 field_32969;
   public class_9618 field_32976;

   public class_6470() {
      super("Main Screen");
      this.method_32105(false);
      field_32965 = System.nanoTime();
      if (field_32961 == null) {
         field_32961 = class_2209.method_10229("com/mentalfrostbyte/gui/resources/" + class_2209.method_10230(), 0.075F, 8);
      }

      this.field_32960.method_11119(class_4043.field_19618);
      this.field_32968.method_11119(class_4043.field_19618);
      int var3 = MinecraftClient.getInstance().field_9602.method_43166() * MinecraftClient.getInstance().field_9602.method_43163() / 14000;
      Random var4 = new Random();

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var4.nextInt(MinecraftClient.getInstance().field_9602.method_43166());
         int var7 = var4.nextInt(MinecraftClient.getInstance().field_9602.method_43163());
         int var8 = 7 + var4.nextInt(5);
         int var9 = (1 + var4.nextInt(4)) * (!var4.nextBoolean() ? 1 : -1);
         int var10 = 1 + var4.nextInt(2);
         this.field_32962.add(new class_3670(this, Integer.toString(var5), var6, var7, var8, var9, var10));
      }

      this.method_32148(this.field_32978 = new AnotherSigmaMainMenu(this, "main", 0, 0, this.field_36278, this.field_36257));
      this.method_32148(this.field_32967 = new ChangelogClass(this, "changelog", 0, 0, this.field_36278, this.field_36257));
      this.method_32148(this.field_32959 = new class_7852(this, "redeem", 0, 0, this.field_36278, this.field_36257));
      this.field_32967.method_32119(false);
      this.field_32967.method_32091(true);
      this.field_32959.method_32119(false);
      this.field_32959.method_32091(true);
   }

   public void method_29470() {
      this.field_32963.method_11119(class_4043.field_19618);
      this.field_32967.method_32119(false);
      this.field_32959.method_32119(false);
      this.field_32959.method_32187(false);
      this.field_32959.method_32091(true);
   }

   public void method_29473() {
      this.field_32963.method_11119(class_4043.field_19620);
      this.field_32975.method_11119(class_4043.field_19620);
   }

   public void method_29472() {
      this.field_32963.method_11119(class_4043.field_19620);
      this.field_32967.method_32119(true);
   }

   public void method_29468() {
      this.field_32963.method_11119(class_4043.field_19620);
      this.field_32959.method_32119(true);
      this.field_32959.method_32187(true);
      this.field_32959.method_32091(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      for (class_7038 var6 : this.field_32962) {
         var6.method_32145(var1, var2);
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = class_3483.method_15985(this.field_32963.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.field_32963.method_11128() == class_4043.field_19618) {
         var4 = class_3483.method_15984(this.field_32963.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      float var5 = 0.07F * var4;
      this.field_32978.method_32111(1.0F - var5, 1.0F - var5);
      this.field_32978.method_32119(this.field_32963.method_11123() == 0.0F);
      long var6 = System.nanoTime() - field_32965;
      field_32966 = Math.min(10.0F, Math.max(0.0F, (float)var6 / 1.810361E7F / 2.0F));
      field_32965 = System.nanoTime();
      int var8 = -this.method_32189();
      float var9 = (float)this.method_32129() / (float)this.method_32109() * -114.0F;
      if (this.field_32964) {
         this.field_32971 = (int)var9;
         this.field_32974 = var8;
         this.field_32964 = false;
      }

      float var10 = var9 - (float)this.field_32971;
      float var11 = (float)(var8 - this.field_32974);
      if (MinecraftClient.getInstance().field_9610 != null) {
         if (var9 != (float)this.field_32971) {
            this.field_32971 = (int)((float)this.field_32971 + var10 * field_32966);
         }

         if (var8 != this.field_32974) {
            this.field_32974 = (int)((float)this.field_32974 + var11 * field_32966);
         }
      } else {
         this.field_32960.method_11119(class_4043.field_19620);
         this.field_32968.method_11119(class_4043.field_19620);
         float var12 = 0.5F - (float)this.field_32974 / (float) MinecraftClient.getInstance().field_9602.method_43166() * -1.0F;
         float var13 = 1.0F - this.field_32960.method_11123();
         float var14 = 1.0F - this.field_32968.method_11123();
         float var15 = var14 * var14;
         if (!SigmaMainClass.method_3328().method_3323()) {
            var15 = 0.0F;
         }

         float var16 = (float)this.method_32109() / 1920.0F;
         int var17 = (int)(600.0F * var16);
         int var18 = (int)(450.0F * var16);
         byte var19 = 0;
         class_73.method_96(
            (float)this.field_32974 - (float)var17 * var12,
            (float)this.field_32971,
            (float)(this.method_32109() * 2 + var17),
            (float)(this.method_32137() + 114),
            class_2209.field_11039
         );
         class_73.method_96(
            (float)this.field_32974 - (float)var18 * var12,
            (float)this.field_32971,
            (float)(this.method_32109() * 2 + var18),
            (float)(this.method_32137() + 114),
            class_2209.field_10998
         );

         for (class_7038 var21 : this.field_32962) {
            GL11.glPushMatrix();
            var21.method_32178(var1);
            GL11.glPopMatrix();
         }

         class_73.method_96(
            (float)this.field_32974 - (float)var19 * var12,
            (float)this.field_32971,
            (float)(this.method_32109() * 2 + var19),
            (float)(this.method_32137() + 114),
            class_2209.field_11033
         );
         class_8343 var26 = class_2209.field_11032;
         int var28 = var26.method_38415();
         int var22 = var26.method_38421();
         if (class_6763.field_34898 > 1.0F) {
            var26 = class_2209.field_11058;
         }

         class_73.method_102(
            (float)this.field_32974,
            (float)(this.field_32971 - 50),
            (float)(this.method_32109() * 2),
            (float)(this.method_32137() + 200),
            field_32961,
            class_314.method_1444(class_1255.field_6918.field_6917, var4),
            false
         );
         class_73.method_103(
            0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6929.field_6917, var4 * 0.3F)
         );

         for (class_7038 var24 : this.method_32134()) {
            if (var24.method_32126()) {
               GL11.glPushMatrix();
               if (var24 instanceof ChangelogClass) {
                  if (var4 > 0.0F) {
                     var24.method_32178(var1);
                  }
               } else {
                  var24.method_32178(var1 * (1.0F - var4));
               }

               GL11.glPopMatrix();
            }
         }

         if (var14 > 0.0F && SigmaMainClass.method_3328().method_3323()) {
            class_6340.method_29014(var13, 1.0F);
            SigmaMainClass.method_3328().method_3320(false);
         }

         field_32966 *= 0.7F;
         field_32966 = Math.min(field_32966, 1.0F);
         if (!this.field_32964 && (var14 == 0.0F || this.field_32971 != 0 || this.field_32974 != 0)) {
            if (var9 != (float)this.field_32971) {
               this.field_32971 = (int)((float)this.field_32971 + var10 * field_32966);
            }

            if (var8 != this.field_32974) {
               this.field_32974 = (int)((float)this.field_32974 + var11 * field_32966);
            }
         }

         if (this.field_32975.method_11128() == class_4043.field_19620) {
            class_73.method_88(
               class_5320.field_27144,
               (float)(this.field_36278 / 2),
               (float)(this.field_36257 / 2 - 30),
               field_32979,
               class_314.method_1444(class_1255.field_6918.field_6917, this.field_32975.method_11123()),
               class_6206.field_31726,
               class_6206.field_31726
            );
            class_73.method_88(
               class_5320.field_27139,
               (float)(this.field_36278 / 2),
               (float)(this.field_36257 / 2 + 30),
               "\"" + field_32970 + "\"",
               class_314.method_1444(class_1255.field_6918.field_6917, this.field_32975.method_11123() * 0.5F),
               class_6206.field_31726,
               class_6206.field_31726
            );
         }
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         this.method_29470();
      }
   }

   public void method_29471() {
      if (this.field_32969 == null) {
         this.method_32102(() -> {
            ArrayList var3 = new ArrayList();
            var3.add(new class_8888(class_2880.field_14100, "Agora", 45));
            var3.add(new class_8888(class_2880.field_14098, "Agora is not yet available...", 35));
            var3.add(new class_8888(class_2880.field_14103, "Ok", 55));
            this.method_32150(this.field_32969 = new class_9618(this, "music", true, "Dependencies.", var3.<class_8888>toArray(new class_8888[0])));
            this.field_32969.method_44409(var1 -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method_32102(() -> {
                        this.method_32179(this.field_32969);
                        this.field_32969 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field_32969.method_44406(true);
         });
      }
   }

   public void method_29469() {
      if (this.field_32976 == null) {
         this.method_32102(() -> {
            ArrayList var3 = new ArrayList();
            var3.add(new class_8888(class_2880.field_14100, "Logout", 45));
            var3.add(new class_8888(class_2880.field_14098, "Are you sure?", 35));
            var3.add(new class_8888(class_2880.field_14103, "Yes", 55));
            this.method_32150(this.field_32976 = new class_9618(this, "music", true, "Dependencies.", var3.<class_8888>toArray(new class_8888[0])));
            this.field_32976.method_44409(var1 -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method_32102(() -> {
                        this.method_32179(this.field_32976);
                        this.field_32976 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field_32976.method_8236(var0 -> SigmaMainClass.method_3328().method_3332().method_23089());
            this.field_32976.method_44406(true);
         });
      }
   }

   static {
      Locale var4 = Locale.getDefault(Category.DISPLAY);
      if (var4 == Locale.FRANCE || var4 == Locale.FRENCH) {
         field_32977 = (String[])ArrayUtils.addAll(
            field_32977, new String[]{"Mon salut jamais dans la fuite, avant d'm'éteindre, faut m'débrancher", "Prêt à partir pour mon honneur"}
         );
      }

      field_32979 = field_32972[new Random().nextInt(field_32972.length)];
      field_32970 = field_32977[new Random().nextInt(field_32977.length)];
   }
}

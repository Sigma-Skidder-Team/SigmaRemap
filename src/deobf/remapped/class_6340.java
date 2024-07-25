package remapped;

import java.util.Optional;
import java.util.function.Consumer;
import org.lwjgl.opengl.GL11;

public class class_6340 extends class_7621 {
   private static final class_4639 field_32380 = new class_4639("textures/gui/title/mojang.png");
   private final MinecraftClient field_32368;
   private final class_4302 field_32373;
   private final Consumer<Optional<Throwable>> field_32375;
   private final boolean field_32378;
   private float field_32377;
   private long field_32364 = -1L;
   private long field_32366 = -1L;
   private int field_32365 = 0;
   private int field_32370 = 16777215;
   private int field_32376 = 14821431;
   private boolean field_32367 = false;
   public static class_8343 field_32372;
   public static class_8343 field_32369;
   public static class_8343 field_32371;
   private float field_32379;

   public class_6340(MinecraftClient var1, class_4302 var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.field_32368 = var1;
      this.field_32373 = var2;
      this.field_32375 = var3;
      this.field_32378 = var4;
   }

   public static void method_29017() {
      field_32372 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/sigma/logo.png");
      field_32369 = class_2209.method_10231("com/mentalfrostbyte/gui/resources/loading/back.png");
      field_32371 = class_2209.method_10229("com/mentalfrostbyte/gui/resources/loading/back.png", 0.25F, 25);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      int var7 = this.field_32368.field_9602.method_43165();
      int var8 = this.field_32368.field_9602.method_43177();
      long var9 = class_9665.method_44650();
      if (this.field_32378 && (this.field_32373.method_19968() || this.field_32368.field_9623 != null) && this.field_32366 == -1L) {
         this.field_32366 = var9;
      }

      float var11 = this.field_32364 > -1L ? (float)(var9 - this.field_32364) / 200.0F : -1.0F;
      float var12 = this.field_32366 > -1L ? (float)(var9 - this.field_32366) / 100.0F : -1.0F;
      float var13 = 1.0F;
      int var14 = (this.field_32368.field_9602.method_43165() - 256) / 2;
      int var15 = (this.field_32368.field_9602.method_43177() - 256) / 2;
      float var16 = this.field_32373.method_19969();
      this.field_32377 = this.field_32377 * 0.95F + var16 * 0.050000012F;
      GL11.glPushMatrix();
      float var17 = 1111.0F;
      if (this.field_32368.field_9602.method_43166() != 0) {
         var17 = (float)(this.field_32368.field_9602.method_43178() / this.field_32368.field_9602.method_43166());
      }

      float var18 = (float)this.field_32368.field_9602.method_43164(this.field_32368.field_9577.field_45484, this.field_32368.method_8578()) * var17;
      GL11.glScalef(1.0F / var18, 1.0F / var18, 0.0F);
      method_29014(var13, this.field_32377);
      GL11.glPopMatrix();
      if (var11 >= 2.0F) {
         this.field_32368.method_8494(null);
      }

      if (this.field_32364 == -1L && this.field_32373.method_19970() && (!this.field_32378 || var12 >= 2.0F)) {
         try {
            this.field_32373.method_19966();
            this.field_32375.accept(Optional.<Throwable>empty());
         } catch (Throwable var20) {
            this.field_32375.accept(Optional.<Throwable>of(var20));
         }

         this.field_32364 = class_9665.method_44650();
         if (this.field_32368.field_9623 != null) {
            this.field_32368
               .field_9623
               .method_1164(this.field_32368, this.field_32368.method_8552().method_43165(), this.field_32368.method_8552().method_43177());
         }
      }
   }

   public static void method_29014(float var0, float var1) {
      if (field_32372 == null) {
         method_29017();
      }

      GL11.glEnable(3008);
      GL11.glEnable(3042);
      class_73.method_97(
         0.0F, 0.0F, (float) MinecraftClient.getInstance().field_9602.method_43166(), (float) MinecraftClient.getInstance().field_9602.method_43163(), field_32371, var0
      );
      class_73.method_103(
         0.0F,
         0.0F,
         (float) MinecraftClient.getInstance().field_9602.method_43166(),
         (float) MinecraftClient.getInstance().field_9602.method_43163(),
         class_314.method_1444(0, 0.75F)
      );
      short var4 = 455;
      byte var5 = 78;
      int var6 = (MinecraftClient.getInstance().field_9602.method_43166() - var4) / 2;
      int var7 = Math.round((float)((MinecraftClient.getInstance().field_9602.method_43163() - var5) / 2) - 14.0F * var0);
      float var8 = 0.75F + var0 * var0 * var0 * var0 * 0.25F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(MinecraftClient.getInstance().field_9602.method_43166() / 2), (float)(MinecraftClient.getInstance().field_9602.method_43163() / 2), 0.0F);
      GL11.glScalef(var8, var8, 0.0F);
      GL11.glTranslatef(
         (float)(-MinecraftClient.getInstance().field_9602.method_43166() / 2), (float)(-MinecraftClient.getInstance().field_9602.method_43163() / 2), 0.0F
      );
      class_73.method_99((float)var6, (float)var7, (float)var4, (float)var5, field_32372, class_314.method_1444(class_1255.field_6918.field_6917, var0));
      float var9 = Math.min(1.0F, var1 * 1.02F);
      float var10 = 1.0F - var0;
      byte var11 = 80;
      if (var0 == 1.0F) {
         class_73.method_108(
            (float)var6, (float)(var7 + var5 + var11), (float)var4, 20.0F, 10.0F, class_314.method_1444(class_1255.field_6918.field_6917, 0.3F * var0)
         );
         class_73.method_108(
            (float)(var6 + 1),
            (float)(var7 + var5 + var11 + 1),
            (float)(var4 - 2),
            18.0F,
            9.0F,
            class_314.method_1444(class_1255.field_6929.field_6917, 1.0F * var0)
         );
      }

      class_73.method_108(
         (float)(var6 + 2),
         (float)(var7 + var5 + var11 + 2),
         (float)((int)((float)(var4 - 4) * var9)),
         16.0F,
         8.0F,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.9F * var0)
      );
      GL11.glPopMatrix();
   }

   @Override
   public boolean method_34549() {
      return true;
   }

   public void method_29015() {
      this.field_32365 = 16777215;
      this.field_32370 = 16777215;
      this.field_32376 = 14821431;
   }

   private static int method_29016(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public boolean method_29019() {
      return this.field_32367;
   }
}

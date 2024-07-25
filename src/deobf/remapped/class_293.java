package remapped;

import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class class_293 {
   private static final Identifier field_1066 = new Identifier("textures/entity/end_portal.png");

   public static void method_1308(class_2336 var0, double var1, double var3, double var5) {
      var0.method_10688(var1, var3, var5);
   }

   public static void method_1320() {
      if (class_6588.field_33804) {
         class_6588.field_33947 = true;
         class_6588.method_30236(class_6588.field_33884);
      }
   }

   public static void method_1300() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33884);
      }
   }

   public static void method_1311() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33884);
      }
   }

   public static void method_1324() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33784);
      }
   }

   public static void method_1304() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33975);
      }
   }

   public static void method_1307() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33784);
      }
   }

   public static void method_1318(GameRenderer var0, class_7966 var1, Camera var2, float var3) {
      if (!class_6588.field_33945) {
         boolean var6 = class_6588.method_30123();
         boolean var7 = class_6588.method_30246();
         if (!var6 || !var7) {
            class_6588.method_30141();
            class_6588.method_30116(var1, false);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            class_6588.method_30234(var6, var7);
            var0.method_35924(var1, var2, var3, true, false, false);
            class_6588.method_30100(var1);
            class_6588.method_30254(!var6, !var7);
            class_6588.method_30234(false, false);
         }
      }
   }

   public static void method_1310(GameRenderer var0, class_7966 var1, Camera var2, float var3) {
      if (!class_6588.field_33945 && !class_6588.method_30321()) {
         class_6588.method_30141();
         class_1920.method_8829();
         class_6588.method_30116(var1, true);
         GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         class_6588.method_30234(class_6588.method_30281(), class_6588.method_30298());
         var0.method_35924(var1, var2, var3, true, false, true);
         class_6588.method_30100(var1);
         class_6588.method_30254(true, true);
         class_6588.method_30234(false, false);
      }
   }

   public static void method_1301(class_9164 var0, float var1, class_7966 var2, class_3758 var3, class_5989 var4, int var5, boolean var6) {
      class_1920.method_8867(true);
      if (var6) {
         class_1920.method_8862(519);
         var2.method_36063();
         IntBuffer var9 = class_6588.field_33601;
         class_6588.method_30190(class_6588.field_33745);
         class_6588.field_33830 = true;
         var0.method_42243(var1, var2, var3, var4, var5);
         class_6588.field_33830 = false;
         class_6588.method_30190(var9);
         var2.method_36064();
      }

      class_1920.method_8862(515);
      GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.method_42243(var1, var2, var3, var4, var5);
   }

   public static void method_1314(GameRenderer var0, class_7966 var1, Camera var2, float var3) {
      if (!class_6588.field_33945) {
         class_6588.method_30239();
         var0.method_35924(var1, var2, var3, false, true, false);
         class_6588.method_30128();
      }
   }

   public static void method_1325() {
      if (class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33901);
         if (class_6588.field_33901.method_13759() == class_6588.field_33884.method_13759()) {
            class_6588.method_30190(class_6588.field_33694);
            class_1920.method_8867(false);
         }
      }
   }

   public static void method_1313() {
      if (class_6588.field_33804) {
         class_1920.method_8867(true);
         class_6588.method_30236(class_6588.field_33784);
      }
   }

   public static void method_1322(GameRenderer var0, Camera var1, int var2, float var3, long var4) {
      if (class_6588.field_33846 > 0 && --class_6588.field_33861 <= 0) {
         MinecraftClient var8 = MinecraftClient.getInstance();
         var8.method_8562().method_16050("shadow pass");
         WorldRenderer var9 = var8.worldRenderer;
         class_6588.field_33945 = true;
         class_6588.field_33861 = class_6588.field_33897;
         class_6588.method_30273("pre shadow");
         GL30.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL30.glMatrixMode(5888);
         GL11.glPushMatrix();
         var8.method_8562().method_16050("shadow clear");
         EXTFramebufferObject.glBindFramebufferEXT(36160, class_6588.field_33779);
         class_6588.method_30273("shadow bind sfb");
         var8.method_8562().method_16050("shadow camera");
         method_1309(var1, var8, var3);
         class_7966 var10 = new class_7966();
         class_6588.method_30214(var10, var1, var3);
         class_6588.method_30273("shadow camera");
         class_6588.method_30236(class_6588.field_33598);
         GL30.glDrawBuffers(class_6588.field_33742);
         class_6588.method_30273("shadow drawbuffers");
         GL30.glReadBuffer(0);
         class_6588.method_30273("shadow readbuffer");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, class_6588.field_33788.get(0), 0);
         if (class_6588.field_33722 != 0) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, class_6588.field_33739.get(0), 0);
         }

         class_6588.method_30142("shadow fb");
         GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL30.glClear(class_6588.field_33722 == 0 ? 256 : 16640);
         class_6588.method_30273("shadow clear");
         var8.method_8562().method_16050("shadow frustum");
         class_8934 var11 = new class_8934();
         var8.method_8562().method_16050("shadow culling");
         class_1343 var12 = var1.method_41627();
         var11.method_10820(var12.field_7336, var12.field_7333, var12.field_7334);
         class_1920.method_8932(7425);
         class_1920.method_8745();
         class_1920.method_8862(515);
         class_1920.method_8867(true);
         class_1920.method_8895(true, true, true, true);
         class_1920.method_8772(new class_9777(false));
         class_1920.method_8831(new class_3525(false));
         var8.method_8562().method_16050("shadow prepareterrain");
         var8.method_8577().method_35674(class_8359.field_42824);
         var8.method_8562().method_16050("shadow setupterrain");
         int var13 = var8.worldRenderer.method_20049();
         var9.method_20016(var1, var11, false, var13, var8.field_9632.method_37221());
         var8.method_8562().method_16050("shadow updatechunks");
         var8.method_8562().method_16050("shadow terrain");
         double var14 = var12.method_61();
         double var16 = var12.method_60();
         double var18 = var12.method_62();
         class_1920.method_8842(5888);
         class_1920.method_8757();
         class_1920.method_8801();
         var9.method_20045(class_6727.field_34745, var10, var14, var16, var18);
         class_6588.method_30273("shadow terrain solid");
         class_1920.method_8741();
         var9.method_20045(class_6727.field_34746, var10, var14, var16, var18);
         class_6588.method_30273("shadow terrain cutoutmipped");
         var8.method_8577().method_35679(class_8359.field_42824).method_37049(false, false);
         var9.method_20045(class_6727.field_34743, var10, var14, var16, var18);
         class_6588.method_30273("shadow terrain cutout");
         var8.method_8577().method_35679(class_8359.field_42824).method_37057();
         class_1920.method_8932(7424);
         class_1920.method_8785(516, 0.1F);
         class_1920.method_8842(5888);
         class_1920.method_8761();
         class_1920.method_8757();
         var8.method_8562().method_16050("shadow entities");
         WorldRenderer var20 = var8.worldRenderer;
         EntityRenderDispatcher var21 = var8.method_8587();
         class_3758 var22 = var20.method_20017().method_13796();
         boolean var23 = class_6588.field_33945 && !var8.field_9632.method_37221();

         for (class_1261 var25 : var20.method_20037()) {
            class_3511 var26 = var25.field_6947;
            class_2654 var27 = var26.method_16174();

            for (Entity var29 : var27.method_11979()[var26.method_16189().method_12165() / 16]) {
               if ((var21.method_28135(var29, var11, var14, var16, var18) || var29.method_37315(var8.field_9632))
                  && (
                     var29 != var1.method_41633()
                        || var23
                        || var1.method_41648()
                        || var1.method_41633() instanceof class_5834 && ((class_5834)var1.method_41633()).method_26507()
                  )
                  && (!(var29 instanceof class_5989) || var1.method_41633() == var29)) {
                  var20.field_21016 = var29;
                  class_6588.method_30181(var29);
                  var20.method_20009(var29, var14, var16, var18, var3, var10, var22);
                  var20.field_21016 = null;
               }
            }
         }

         var20.method_20032(var10);
         var22.method_17416(RenderLayer.method_16734(class_8359.field_42824));
         var22.method_17416(RenderLayer.method_16747(class_8359.field_42824));
         var22.method_17416(RenderLayer.method_16755(class_8359.field_42824));
         var22.method_17416(RenderLayer.method_16730(class_8359.field_42824));
         class_6588.method_30260();
         class_6588.method_30189();
         class_3913.method_18117();
         boolean var33 = class_7860.field_40135.method_3596();
         class_8934 var34 = var11;

         for (class_1261 var36 : var20.method_20075()) {
            List var37 = var36.field_6947.method_16150().method_40699();
            if (!var37.isEmpty()) {
               for (class_3757 var30 : var37) {
                  if (var33) {
                     class_4092 var31 = (class_4092)class_7860.method_35555(var30, class_7860.field_40135);
                     if (var31 != null && !var34.method_10824(var31)) {
                        continue;
                     }
                  }

                  class_6588.method_30117(var30);
                  class_1331 var32 = var30.method_17399();
                  var10.method_36063();
                  var10.method_36065((double)var32.method_12173() - var14, (double)var32.method_12165() - var16, (double)var32.method_12185() - var18);
                  class_3569.field_17468.method_16586(var30, var3, var10, var22);
                  var10.method_36064();
               }
            }
         }

         var20.method_20032(var10);
         var22.method_17416(RenderLayer.method_16751());
         var22.method_17416(class_5276.method_24074());
         var22.method_17416(class_5276.method_24083());
         var22.method_17416(class_5276.method_24070());
         var22.method_17416(class_5276.method_24071());
         var22.method_17416(class_5276.method_24080());
         var22.method_17416(class_5276.method_24082());
         var22.method_17415();
         class_6588.method_30256();
         class_6588.method_30273("shadow entities");
         class_1920.method_8842(5888);
         class_1920.method_8761();
         class_1920.method_8867(true);
         class_1920.method_8775();
         class_1920.method_8918();
         class_1920.method_8903();
         class_1920.method_8816(770, 771, 1, 0);
         class_1920.method_8785(516, 0.1F);
         if (class_6588.field_33846 >= 2) {
            class_1920.method_8899(33989);
            class_6588.method_30273("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, class_6588.field_33976, class_6588.field_33907);
            class_6588.method_30273("copy shadow depth");
            class_1920.method_8899(33984);
         }

         class_1920.method_8775();
         class_1920.method_8867(true);
         var8.method_8577().method_35674(class_8359.field_42824);
         class_1920.method_8932(7425);
         class_6588.method_30273("shadow pre-translucent");
         GL30.glDrawBuffers(class_6588.field_33742);
         class_6588.method_30273("shadow drawbuffers pre-translucent");
         class_6588.method_30142("shadow pre-translucent");
         if (class_6588.method_30172()) {
            var8.method_8562().method_16050("shadow translucent");
            var9.method_20045(class_6727.field_34740, var10, var14, var16, var18);
            class_6588.method_30273("shadow translucent");
         }

         class_1920.method_8855();
         class_1920.method_8932(7424);
         class_1920.method_8867(true);
         class_1920.method_8903();
         class_1920.method_8775();
         GL30.glFlush();
         class_6588.method_30273("shadow flush");
         class_6588.field_33945 = false;
         var8.method_8562().method_16050("shadow postprocess");
         if (class_6588.field_33761) {
            if (class_6588.field_33846 >= 1) {
               if (class_6588.field_33795[0]) {
                  class_1920.method_8899(33988);
                  class_1920.method_8791(class_6588.field_33788.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !class_6588.field_33746[0] ? 9987 : 9984);
               }

               if (class_6588.field_33846 >= 2 && class_6588.field_33795[1]) {
                  class_1920.method_8899(33989);
                  class_1920.method_8791(class_6588.field_33788.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !class_6588.field_33746[1] ? 9987 : 9984);
               }

               class_1920.method_8899(33984);
            }

            if (class_6588.field_33722 >= 1) {
               if (class_6588.field_33841[0]) {
                  class_1920.method_8899(33997);
                  class_1920.method_8791(class_6588.field_33739.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !class_6588.field_33629[0] ? 9987 : 9984);
               }

               if (class_6588.field_33722 >= 2 && class_6588.field_33841[1]) {
                  class_1920.method_8899(33998);
                  class_1920.method_8791(class_6588.field_33739.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !class_6588.field_33629[1] ? 9987 : 9984);
               }

               class_1920.method_8899(33984);
            }
         }

         class_6588.method_30273("shadow postprocess");
         EXTFramebufferObject.glBindFramebufferEXT(36160, class_6588.field_33619);
         GL11.glViewport(0, 0, class_6588.field_33803, class_6588.field_33764);
         class_6588.field_33601 = null;
         var8.method_8577().method_35674(class_8359.field_42824);
         class_6588.method_30236(class_6588.field_33884);
         GL30.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5888);
         class_6588.method_30273("shadow end");
      }
   }

   public static void method_1309(Camera var0, MinecraftClient var1, float var2) {
      var0.method_41643(
         var1.field_9601,
         (Entity)(var1.method_8516() != null ? var1.method_8516() : var1.field_9632),
         !var1.field_9577.method_40867().method_42383(),
         var1.field_9577.method_40867().method_42384(),
         var2
      );
   }

   public static void method_1326(RenderLayer var0) {
      if (var0 == class_6727.field_34745) {
         method_1320();
      }

      if (var0 == class_6727.field_34746) {
         method_1300();
      }

      if (var0 == class_6727.field_34743) {
         method_1311();
      }

      if (var0 == class_6727.field_34740) {
         method_1304();
      }

      if (class_6588.method_30222(var0)) {
         class_1920.method_8765();
      }

      if (class_3776.method_17486()) {
         GL20.glEnableVertexAttribArray(class_6588.field_33801);
         GL20.glEnableVertexAttribArray(class_6588.field_33817);
         GL20.glEnableVertexAttribArray(class_6588.field_33899);
      }
   }

   public static void method_1323(RenderLayer var0) {
      if (class_3776.method_17486()) {
         GL20.glDisableVertexAttribArray(class_6588.field_33801);
         GL20.glDisableVertexAttribArray(class_6588.field_33817);
         GL20.glDisableVertexAttribArray(class_6588.field_33899);
      }

      if (class_6588.method_30222(var0)) {
         class_1920.method_8903();
      }
   }

   public static void method_1316(RenderLayer var0, class_9633 var1) {
      if (class_6588.field_33804 && !class_6588.field_33945) {
         if (!var0.method_16733()) {
            if (!var0.method_24421().equals("eyes")) {
               if (!var0.method_24421().equals("crumbling")) {
                  if (var0 == RenderLayer.field_17558) {
                     class_6588.method_30195();
                  }
               } else {
                  method_1325();
               }
            } else {
               class_6588.method_30278();
            }
         } else {
            method_1302();
         }
      }
   }

   public static void method_1303(RenderLayer var0, class_9633 var1) {
      if (class_6588.field_33804 && !class_6588.field_33945) {
         if (!var0.method_16733()) {
            if (!var0.method_24421().equals("eyes")) {
               if (!var0.method_24421().equals("crumbling")) {
                  if (var0 == RenderLayer.field_17558) {
                     class_6588.method_30104();
                  }
               } else {
                  method_1313();
               }
            } else {
               class_6588.method_30249();
            }
         } else {
            method_1315();
         }
      }
   }

   public static void method_1299() {
      byte var2 = 16;
      GL20.glVertexAttribPointer(class_6588.field_33801, 2, 5126, false, 64, 36L);
      GL20.glVertexAttribPointer(class_6588.field_33817, 4, 5122, false, 64, 44L);
      GL20.glVertexAttribPointer(class_6588.field_33899, 3, 5122, false, 64, 52L);
   }

   public static void method_1327() {
      class_6588.method_30236(class_6588.field_33963);
   }

   public static void method_1317() {
   }

   public static void method_1321() {
   }

   public static void method_1312() {
   }

   public static void method_1319() {
      class_1920.method_8775();
   }

   public static void method_1302() {
      class_6588.method_30236(class_6588.field_33812);
   }

   public static void method_1315() {
      if (!class_6588.field_33804) {
         class_6588.method_30236(class_6588.field_33936);
      } else if (class_6588.method_30247() && class_6588.method_30279()) {
         class_6588.method_30236(class_6588.field_33790);
      } else {
         class_6588.method_30236(class_6588.field_33713);
      }
   }

   public static boolean method_1305(class_9795 var0, float var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (!class_6588.field_33945 && class_6588.field_33770.method_13759() == 0) {
         return false;
      } else {
         class_1920.method_8912();
         class_6279 var9 = var3.method_36058();
         class_8107 var10 = var9.method_28620();
         class_6555 var11 = var9.method_28618();
         class_7907 var12 = var4.method_11645(RenderLayer.method_16734(field_1066));
         float var13 = 0.5F;
         float var14 = var13 * 0.15F;
         float var15 = var13 * 0.3F;
         float var16 = var13 * 0.4F;
         float var17 = 0.0F;
         float var18 = 0.2F;
         float var19 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
         float var20 = 0.0F;
         float var21 = 0.0F;
         float var22 = 0.0F;
         if (var0.method_45197(Direction.field_800)) {
            class_2700 var23 = Direction.field_800.method_1037();
            float var24 = (float)var23.method_12173();
            float var25 = (float)var23.method_12165();
            float var26 = (float)var23.method_12185();
            float var27 = var11.method_29896(var24, var25, var26);
            float var28 = var11.method_29897(var24, var25, var26);
            float var29 = var11.method_29887(var24, var25, var26);
            var12.method_35762(var10, var20, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var27, var28, var29)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var27, var28, var29)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var27, var28, var29)
               .method_35735();
            var12.method_35762(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var27, var28, var29)
               .method_35735();
         }

         if (var0.method_45197(Direction.field_818)) {
            class_2700 var30 = Direction.field_818.method_1037();
            float var35 = (float)var30.method_12173();
            float var40 = (float)var30.method_12165();
            float var45 = (float)var30.method_12185();
            float var50 = var11.method_29896(var35, var40, var45);
            float var55 = var11.method_29897(var35, var40, var45);
            float var60 = var11.method_29887(var35, var40, var45);
            var12.method_35762(var10, var20, var21 + 1.0F, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var50, var55, var60)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var50, var55, var60)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var50, var55, var60)
               .method_35735();
            var12.method_35762(var10, var20, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var50, var55, var60)
               .method_35735();
         }

         if (var0.method_45197(Direction.field_804)) {
            class_2700 var31 = Direction.field_804.method_1037();
            float var36 = (float)var31.method_12173();
            float var41 = (float)var31.method_12165();
            float var46 = (float)var31.method_12185();
            float var51 = var11.method_29896(var36, var41, var46);
            float var56 = var11.method_29897(var36, var41, var46);
            float var61 = var11.method_29887(var36, var41, var46);
            var12.method_35762(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var51, var56, var61)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var51, var56, var61)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var51, var56, var61)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var51, var56, var61)
               .method_35735();
         }

         if (var0.method_45197(Direction.field_809)) {
            class_2700 var32 = Direction.field_809.method_1037();
            float var37 = (float)var32.method_12173();
            float var42 = (float)var32.method_12165();
            float var47 = (float)var32.method_12185();
            float var52 = var11.method_29896(var37, var42, var47);
            float var57 = var11.method_29897(var37, var42, var47);
            float var62 = var11.method_29887(var37, var42, var47);
            var12.method_35762(var10, var20, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var52, var57, var62)
               .method_35735();
            var12.method_35762(var10, var20, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var52, var57, var62)
               .method_35735();
            var12.method_35762(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var52, var57, var62)
               .method_35735();
            var12.method_35762(var10, var20, var21 + 1.0F, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var52, var57, var62)
               .method_35735();
         }

         if (var0.method_45197(Direction.field_802)) {
            class_2700 var33 = Direction.field_802.method_1037();
            float var38 = (float)var33.method_12173();
            float var43 = (float)var33.method_12165();
            float var48 = (float)var33.method_12185();
            float var53 = var11.method_29896(var38, var43, var48);
            float var58 = var11.method_29897(var38, var43, var48);
            float var63 = var11.method_29887(var38, var43, var48);
            var12.method_35762(var10, var20, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var53, var58, var63)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var53, var58, var63)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var53, var58, var63)
               .method_35735();
            var12.method_35762(var10, var20, var21, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var53, var58, var63)
               .method_35735();
         }

         if (var0.method_45197(Direction.field_817)) {
            class_2700 var34 = Direction.field_817.method_1037();
            float var39 = (float)var34.method_12173();
            float var44 = (float)var34.method_12165();
            float var49 = (float)var34.method_12185();
            float var54 = var11.method_29896(var39, var44, var49);
            float var59 = var11.method_29897(var39, var44, var49);
            float var64 = var11.method_29887(var39, var44, var49);
            var12.method_35762(var10, var20, var21 + var2, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var54, var59, var64)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21 + var2, var22 + 1.0F)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var17 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var54, var59, var64)
               .method_35735();
            var12.method_35762(var10, var20 + 1.0F, var21 + var2, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var18 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var54, var59, var64)
               .method_35735();
            var12.method_35762(var10, var20, var21 + var2, var22)
               .method_35742(var14, var15, var16, 1.0F)
               .method_35745(var18 + var19, var17 + var19)
               .method_35737(var6)
               .method_35747(var5)
               .method_35755(var54, var59, var64)
               .method_35735();
         }

         class_1920.method_8927();
         return true;
      }
   }
}

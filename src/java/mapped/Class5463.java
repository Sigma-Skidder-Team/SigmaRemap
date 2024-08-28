package mapped;

import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class Class5463 {
   private static final ResourceLocation field24257 = new ResourceLocation("textures/entity/end_portal.png");

   public static void method17147(Class7624 var0, double var1, double var3, double var5) {
      var0.method24979(var1, var3, var5);
   }

   public static void method17148() {
      if (Class8981.field40605) {
         Class8981.field40668 = true;
         Class8981.method33021(Class8981.field40823);
      }
   }

   public static void method17149() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40823);
      }
   }

   public static void method17150() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40823);
      }
   }

   public static void method17151() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40819);
      }
   }

   public static void method17152() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40840);
      }
   }

   public static void method17153() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40819);
      }
   }

   public static void method17154(Class214 var0, Class9332 var1, Class9624 var2, float var3) {
      if (!Class8981.field40609) {
         boolean var6 = Class8981.method33149();
         boolean var7 = Class8981.method33150();
         if (!var6 || !var7) {
            Class8981.method33097();
            Class8981.method33105(var1, false);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            Class8981.method33155(var6, var7);
            var0.method747(var1, var2, var3, true, false, false);
            Class8981.method33106(var1);
            Class8981.method33156(!var6, !var7);
            Class8981.method33155(false, false);
         }
      }
   }

   public static void method17155(Class214 var0, Class9332 var1, Class9624 var2, float var3) {
      if (!Class8981.field40609 && !Class8981.method33151()) {
         Class8981.method33097();
         Class7414.method23715();
         Class8981.method33105(var1, true);
         GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Class8981.method33155(Class8981.method33157(), Class8981.method33158());
         var0.method747(var1, var2, var3, true, false, true);
         Class8981.method33106(var1);
         Class8981.method33156(true, true);
         Class8981.method33155(false, false);
      }
   }

   public static void method17156(Class9641 var0, float var1, Class9332 var2, Class7735 var3, ClientPlayerEntity var4, int var5, boolean var6) {
      Class7414.method23713(true);
      if (var6) {
         Class7414.method23712(519);
         var2.method35294();
         IntBuffer var9 = Class8981.field40852;
         Class8981.method33020(Class8981.field40978);
         Class8981.field40617 = true;
         var0.method37590(var1, var2, var3, var4, var5);
         Class8981.field40617 = false;
         Class8981.method33020(var9);
         var2.method35295();
      }

      Class7414.method23712(515);
      GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var0.method37590(var1, var2, var3, var4, var5);
   }

   public static void method17157(Class214 var0, Class9332 var1, Class9624 var2, float var3) {
      if (!Class8981.field40609) {
         Class8981.method33107();
         var0.method747(var1, var2, var3, false, true, false);
         Class8981.method33108();
      }
   }

   public static void method17158() {
      if (Class8981.field40605) {
         Class8981.method33021(Class8981.field40827);
         if (Class8981.field40827.method26485() == Class8981.field40823.method26485()) {
            Class8981.method33020(Class8981.field40979);
            Class7414.method23713(false);
         }
      }
   }

   public static void method17159() {
      if (Class8981.field40605) {
         Class7414.method23713(true);
         Class8981.method33021(Class8981.field40819);
      }
   }

   public static void method17160(Class214 var0, Class9624 var1, int var2, float var3, long var4) {
      if (Class8981.field40804 > 0 && --Class8981.field40793 <= 0) {
         Minecraft var8 = Minecraft.getInstance();
         var8.method1574().method22506("shadow pass");
         Class264 var9 = var8.field1287;
         Class8981.field40609 = true;
         Class8981.field40793 = Class8981.field40783;
         Class8981.method32984("pre shadow");
         GL30.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL30.glMatrixMode(5888);
         GL11.glPushMatrix();
         var8.method1574().method22506("shadow clear");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Class8981.field40808);
         Class8981.method32984("shadow bind sfb");
         var8.method1574().method22506("shadow camera");
         method17161(var1, var8, var3);
         Class9332 var10 = new Class9332();
         Class8981.method33053(var10, var1, var3);
         Class8981.method32984("shadow camera");
         Class8981.method33021(Class8981.field40814);
         GL30.glDrawBuffers(Class8981.field40977);
         Class8981.method32984("shadow drawbuffers");
         GL30.glReadBuffer(0);
         Class8981.method32984("shadow readbuffer");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Class8981.field40975.get(0), 0);
         if (Class8981.field40803 != 0) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Class8981.field40974.get(0), 0);
         }

         Class8981.method32983("shadow fb");
         GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL30.glClear(Class8981.field40803 == 0 ? 256 : 16640);
         Class8981.method32984("shadow clear");
         var8.method1574().method22506("shadow frustum");
         Class7649 var11 = new Class7649();
         var8.method1574().method22506("shadow culling");
         Vector3d var12 = var1.method37504();
         var11.method25119(var12.field18048, var12.field18049, var12.field18050);
         Class7414.method23818(7425);
         Class7414.method23711();
         Class7414.method23712(515);
         Class7414.method23713(true);
         Class7414.method23822(true, true, true, true);
         Class7414.method23878(new Class9816(false));
         Class7414.method23874(new Class8069(false));
         var8.method1574().method22506("shadow prepareterrain");
         var8.getTextureManager().bindTexture(Class289.field1102);
         var8.method1574().method22506("shadow setupterrain");
         int var13 = var8.field1287.method936();
         var9.method874(var1, var11, false, var13, var8.field1339.method2800());
         var8.method1574().method22506("shadow updatechunks");
         var8.method1574().method22506("shadow terrain");
         double var14 = var12.method11320();
         double var16 = var12.method11321();
         double var18 = var12.method11322();
         Class7414.method23830(5888);
         Class7414.method23832();
         Class7414.method23695();
         var9.method880(Class9025.field41288, var10, var14, var16, var18);
         Class8981.method32984("shadow terrain solid");
         Class7414.method23696();
         var9.method880(Class9025.field41289, var10, var14, var16, var18);
         Class8981.method32984("shadow terrain cutoutmipped");
         var8.getTextureManager().method1076(Class289.field1102).method1130(false, false);
         var9.method880(Class9025.field41290, var10, var14, var16, var18);
         Class8981.method32984("shadow terrain cutout");
         var8.getTextureManager().method1076(Class289.field1102).method1137();
         Class7414.method23818(7424);
         Class7414.method23697(516, 0.1F);
         Class7414.method23830(5888);
         Class7414.method23833();
         Class7414.method23832();
         var8.method1574().method22506("shadow entities");
         Class264 var20 = var8.field1287;
         Class8853 var21 = var8.method1554();
         Class7735 var22 = var20.method937().method26536();
         boolean var23 = Class8981.field40609 && !var8.field1339.method2800();

         for (Class7002 var25 : var20.method938()) {
            Class8066 var26 = var25.field30281;
            Class1674 var27 = var26.method27740();

            for (Entity var29 : var27.method7146()[var26.method27718().getY() / 16]) {
               if ((var21.method32218(var29, var11, var14, var16, var18) || var29.method3417(var8.field1339))
                  && (
                     var29 != var1.method37509()
                        || var23
                        || var1.method37511()
                        || var1.method37509() instanceof Class880 && ((Class880)var1.method37509()).method3176()
                  )
                  && (!(var29 instanceof ClientPlayerEntity) || var1.method37509() == var29)) {
                  var20.field1000 = var29;
                  Class8981.method33079(var29);
                  var20.method879(var29, var14, var16, var18, var3, var10, var22);
                  var20.field1000 = null;
               }
            }
         }

         var20.method878(var10);
         var22.method25603(Class4520.method14309(Class289.field1102));
         var22.method25603(Class4520.method14310(Class289.field1102));
         var22.method25603(Class4520.method14312(Class289.field1102));
         var22.method25603(Class4520.method14319(Class289.field1102));
         Class8981.method33083();
         Class8981.method33089();
         Class5947.method18475();
         boolean var33 = Class9299.field42943.method20214();
         Class7649 var34 = var11;

         for (Class7002 var36 : var20.method939()) {
            List<Class944> var37 = var36.field30281.method27715().method24111();
            if (!var37.isEmpty()) {
               for (Class944 var30 : var37) {
                  if (var33) {
                     Class6488 var31 = (Class6488)Class9299.method35070(var30, Class9299.field42943);
                     if (var31 != null && !var34.method25122(var31)) {
                        continue;
                     }
                  }

                  Class8981.method33090(var30);
                  BlockPos var32 = var30.method3774();
                  var10.method35294();
                  var10.method35291((double)var32.method8304() - var14, (double)var32.getY() - var16, (double)var32.method8306() - var18);
                  Class8086.field34743.method27962(var30, var3, var10, var22);
                  var10.method35295();
               }
            }
         }

         var20.method878(var10);
         var22.method25603(Class4520.method14300());
         var22.method25603(Class8624.method30906());
         var22.method25603(Class8624.method30907());
         var22.method25603(Class8624.method30902());
         var22.method25603(Class8624.method30903());
         var22.method25603(Class8624.method30904());
         var22.method25603(Class8624.method30905());
         var22.method25602();
         Class8981.method33093();
         Class8981.method32984("shadow entities");
         Class7414.method23830(5888);
         Class7414.method23833();
         Class7414.method23713(true);
         Class7414.method23714();
         Class7414.method23879();
         Class7414.method23787();
         Class7414.method23717(770, 771, 1, 0);
         Class7414.method23697(516, 0.1F);
         if (Class8981.field40804 >= 2) {
            Class7414.method23803(33989);
            Class8981.method32984("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Class8981.field40785, Class8981.field40786);
            Class8981.method32984("copy shadow depth");
            Class7414.method23803(33984);
         }

         Class7414.method23714();
         Class7414.method23713(true);
         var8.getTextureManager().bindTexture(Class289.field1102);
         Class7414.method23818(7425);
         Class8981.method32984("shadow pre-translucent");
         GL30.glDrawBuffers(Class8981.field40977);
         Class8981.method32984("shadow drawbuffers pre-translucent");
         Class8981.method32983("shadow pre-translucent");
         if (Class8981.method32996()) {
            var8.method1574().method22506("shadow translucent");
            var9.method880(Class9025.field41291, var10, var14, var16, var18);
            Class8981.method32984("shadow translucent");
         }

         Class7414.method23875();
         Class7414.method23818(7424);
         Class7414.method23713(true);
         Class7414.method23787();
         Class7414.method23714();
         GL30.glFlush();
         Class8981.method32984("shadow flush");
         Class8981.field40609 = false;
         var8.method1574().method22506("shadow postprocess");
         if (Class8981.field40599) {
            if (Class8981.field40804 >= 1) {
               if (Class8981.field40858[0]) {
                  Class7414.method23803(33988);
                  Class7414.method23814(Class8981.field40975.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !Class8981.field40859[0] ? 9987 : 9984);
               }

               if (Class8981.field40804 >= 2 && Class8981.field40858[1]) {
                  Class7414.method23803(33989);
                  Class7414.method23814(Class8981.field40975.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !Class8981.field40859[1] ? 9987 : 9984);
               }

               Class7414.method23803(33984);
            }

            if (Class8981.field40803 >= 1) {
               if (Class8981.field40860[0]) {
                  Class7414.method23803(33997);
                  Class7414.method23814(Class8981.field40974.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !Class8981.field40861[0] ? 9987 : 9984);
               }

               if (Class8981.field40803 >= 2 && Class8981.field40860[1]) {
                  Class7414.method23803(33998);
                  Class7414.method23814(Class8981.field40974.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL30.glTexParameteri(3553, 10241, !Class8981.field40861[1] ? 9987 : 9984);
               }

               Class7414.method23803(33984);
            }
         }

         Class8981.method32984("shadow postprocess");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Class8981.field40807);
         GL11.glViewport(0, 0, Class8981.field40603, Class8981.field40604);
         Class8981.field40852 = null;
         var8.getTextureManager().bindTexture(Class289.field1102);
         Class8981.method33021(Class8981.field40823);
         GL30.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL30.glMatrixMode(5888);
         Class8981.method32984("shadow end");
      }
   }

   public static void method17161(Class9624 var0, Minecraft var1, float var2) {
      var0.method37497(
         var1.field1338,
         (Entity)(var1.method1550() != null ? var1.method1550() : var1.field1339),
         !var1.field1299.method37173().method8246(),
         var1.field1299.method37173().method8247(),
         var2
      );
   }

   public static void method17162(Class4520 var0) {
      if (var0 == Class9025.field41288) {
         method17148();
      }

      if (var0 == Class9025.field41289) {
         method17149();
      }

      if (var0 == Class9025.field41290) {
         method17150();
      }

      if (var0 == Class9025.field41291) {
         method17152();
      }

      if (Class8981.method33001(var0)) {
         Class7414.method23788();
      }

      if (Class8157.method28310()) {
         GL20.glEnableVertexAttribArray(Class8981.field40671);
         GL20.glEnableVertexAttribArray(Class8981.field40672);
         GL20.glEnableVertexAttribArray(Class8981.field40670);
      }
   }

   public static void method17163(Class4520 var0) {
      if (Class8157.method28310()) {
         GL20.glDisableVertexAttribArray(Class8981.field40671);
         GL20.glDisableVertexAttribArray(Class8981.field40672);
         GL20.glDisableVertexAttribArray(Class8981.field40670);
      }

      if (Class8981.method33001(var0)) {
         Class7414.method23787();
      }
   }

   public static void method17164(Class4520 var0, Class5425 var1) {
      if (Class8981.field40605 && !Class8981.field40609) {
         if (!var0.method14367()) {
            if (!var0.method14234().equals("eyes")) {
               if (!var0.method14234().equals("crumbling")) {
                  if (var0 == Class4520.field21811) {
                     Class8981.method33119();
                  }
               } else {
                  method17158();
               }
            } else {
               Class8981.method33081();
            }
         } else {
            method17172();
         }
      }
   }

   public static void method17165(Class4520 var0, Class5425 var1) {
      if (Class8981.field40605 && !Class8981.field40609) {
         if (!var0.method14367()) {
            if (!var0.method14234().equals("eyes")) {
               if (!var0.method14234().equals("crumbling")) {
                  if (var0 == Class4520.field21811) {
                     Class8981.method33120();
                  }
               } else {
                  method17159();
               }
            } else {
               Class8981.method33082();
            }
         } else {
            method17173();
         }
      }
   }

   public static void method17166() {
      byte var2 = 16;
      GL20.glVertexAttribPointer(Class8981.field40671, 2, 5126, false, 64, 36L);
      GL20.glVertexAttribPointer(Class8981.field40672, 4, 5122, false, 64, 44L);
      GL20.glVertexAttribPointer(Class8981.field40670, 3, 5122, false, 64, 52L);
   }

   public static void method17167() {
      Class8981.method33021(Class8981.field40829);
   }

   public static void method17168() {
   }

   public static void method17169() {
   }

   public static void method17170() {
   }

   public static void method17171() {
      Class7414.method23714();
   }

   public static void method17172() {
      Class8981.method33021(Class8981.field40833);
   }

   public static void method17173() {
      if (!Class8981.field40605) {
         Class8981.method33021(Class8981.field40813);
      } else if (Class8981.method33161() && Class8981.method33154()) {
         Class8981.method33021(Class8981.field40835);
      } else {
         Class8981.method33021(Class8981.field40831);
      }
   }

   public static boolean method17174(Class956 var0, float var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      if (!Class8981.field40609 && Class8981.field40848.method26485() == 0) {
         return false;
      } else {
         Class7414.method23699();
         Class8892 var9 = var3.method35296();
         Class9367 var10 = var9.method32361();
         Class8967 var11 = var9.method32362();
         Class5422 var12 = var4.method25597(Class4520.method14309(field24257));
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
         if (var0.method3870(Direction.SOUTH)) {
            Class1998 var23 = Direction.SOUTH.method556();
            float var24 = (float)var23.method8304();
            float var25 = (float)var23.getY();
            float var26 = (float)var23.method8306();
            float var27 = var11.method32832(var24, var25, var26);
            float var28 = var11.method32833(var24, var25, var26);
            float var29 = var11.method32834(var24, var25, var26);
            var12.method17040(var10, var20, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .method17031();
            var12.method17040(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var27, var28, var29)
               .method17031();
         }

         if (var0.method3870(Direction.NORTH)) {
            Class1998 var30 = Direction.NORTH.method556();
            float var35 = (float)var30.method8304();
            float var40 = (float)var30.getY();
            float var45 = (float)var30.method8306();
            float var50 = var11.method32832(var35, var40, var45);
            float var55 = var11.method32833(var35, var40, var45);
            float var60 = var11.method32834(var35, var40, var45);
            var12.method17040(var10, var20, var21 + 1.0F, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .method17031();
            var12.method17040(var10, var20, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var50, var55, var60)
               .method17031();
         }

         if (var0.method3870(Direction.EAST)) {
            Class1998 var31 = Direction.EAST.method556();
            float var36 = (float)var31.method8304();
            float var41 = (float)var31.getY();
            float var46 = (float)var31.method8306();
            float var51 = var11.method32832(var36, var41, var46);
            float var56 = var11.method32833(var36, var41, var46);
            float var61 = var11.method32834(var36, var41, var46);
            var12.method17040(var10, var20 + 1.0F, var21 + 1.0F, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21 + 1.0F, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var51, var56, var61)
               .method17031();
         }

         if (var0.method3870(Direction.WEST)) {
            Class1998 var32 = Direction.WEST.method556();
            float var37 = (float)var32.method8304();
            float var42 = (float)var32.getY();
            float var47 = (float)var32.method8306();
            float var52 = var11.method32832(var37, var42, var47);
            float var57 = var11.method32833(var37, var42, var47);
            float var62 = var11.method32834(var37, var42, var47);
            var12.method17040(var10, var20, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .method17031();
            var12.method17040(var10, var20, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .method17031();
            var12.method17040(var10, var20, var21 + 1.0F, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .method17031();
            var12.method17040(var10, var20, var21 + 1.0F, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var52, var57, var62)
               .method17031();
         }

         if (var0.method3870(Direction.field672)) {
            Class1998 var33 = Direction.field672.method556();
            float var38 = (float)var33.method8304();
            float var43 = (float)var33.getY();
            float var48 = (float)var33.method8306();
            float var53 = var11.method32832(var38, var43, var48);
            float var58 = var11.method32833(var38, var43, var48);
            float var63 = var11.method32834(var38, var43, var48);
            var12.method17040(var10, var20, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .method17031();
            var12.method17040(var10, var20, var21, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var53, var58, var63)
               .method17031();
         }

         if (var0.method3870(Direction.field673)) {
            Class1998 var34 = Direction.field673.method556();
            float var39 = (float)var34.method8304();
            float var44 = (float)var34.getY();
            float var49 = (float)var34.method8306();
            float var54 = var11.method32832(var39, var44, var49);
            float var59 = var11.method32833(var39, var44, var49);
            float var64 = var11.method32834(var39, var44, var49);
            var12.method17040(var10, var20, var21 + var2, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21 + var2, var22 + 1.0F)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var17 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .method17031();
            var12.method17040(var10, var20 + 1.0F, var21 + var2, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var18 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .method17031();
            var12.method17040(var10, var20, var21 + var2, var22)
               .method17033(var14, var15, var16, 1.0F)
               .method17027(var18 + var19, var17 + var19)
               .method17035(var6)
               .method17034(var5)
               .method17030(var54, var59, var64)
               .method17031();
         }

         Class7414.method23698();
         return true;
      }
   }
}

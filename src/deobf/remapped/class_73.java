package remapped;

import java.awt.Color;
import java.awt.Rectangle;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Stack;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;

public class class_73 {
   private static String[] field_104;
   private static final boolean field_102 = false;
   private static final MinecraftClient field_108 = MinecraftClient.method_8510();
   public static boolean field_109 = false;
   private static Stack<IntBuffer> field_105 = new Stack<IntBuffer>();
   private static float field_107 = 1.0F;
   private static float field_103 = 1.0F;
   private static float field_106 = 1.0F;

   public static void method_104(int var0, int var1) {
   }

   public static float method_132(float var0, int var1) {
      BigDecimal var4 = new BigDecimal(Float.toString(var0));
      var4 = var4.setScale(var1, 4);
      return var4.floatValue();
   }

   public static Rectangle method_123(Rectangle var0, float var1, float var2) {
      float var5 = (float)var0.x;
      float var6 = (float)var0.y;
      float var7 = (float)var0.width;
      float var8 = (float)var0.height;
      int var9 = Math.round(var7 * var1);
      int var10 = Math.round(var8 * var2);
      float var11 = var7 - (float)var9;
      float var12 = var8 - (float)var10;
      int var13 = Math.round(var5 + var11 / 4.0F);
      int var14 = Math.round(var6 + var12 / 6.0F);
      return new Rectangle(var13, var14, var9, var10);
   }

   public static Rectangle method_84(class_7038 var0) {
      return new Rectangle(var0.method_32132(), var0.method_32173(), var0.method_32109(), var0.method_32137());
   }

   public static void method_151(class_7038 var0) {
      method_150(var0.method_32132(), var0.method_32173(), var0.method_32109() + var0.method_32132(), var0.method_32137() + var0.method_32173(), true);
   }

   public static float[] method_144(int var0, int var1) {
      FloatBuffer var4 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloatv(2982, var4);
      float var5 = var4.get(0) * (float)var0 + var4.get(4) * (float)var1 + var4.get(8) * 0.0F + var4.get(12);
      float var6 = var4.get(1) * (float)var0 + var4.get(5) * (float)var1 + var4.get(9) * 0.0F + var4.get(13);
      float var7 = var4.get(3) * (float)var0 + var4.get(7) * (float)var1 + var4.get(11) * 0.0F + var4.get(15);
      var5 /= var7;
      var6 /= var7;
      return new float[]{(float)Math.round(var5 * method_106()), (float)Math.round(var6 * method_106())};
   }

   public static float method_106() {
      return (float)field_108.field_9602.method_43189();
   }

   public static void method_148(float var0, float var1, float var2, float var3) {
      method_150((int)var0, (int)var1, (int)var2, (int)var3, true);
   }

   public static void method_135(float var0, float var1, float var2, float var3) {
      method_150((int)var0, (int)var1, (int)var0 + (int)var2, (int)var1 + (int)var3, true);
   }

   public static void method_149(int var0, int var1, int var2, int var3) {
      method_150(var0, var1, var2, var3, false);
   }

   public static void method_150(int var0, int var1, int var2, int var3, boolean var4) {
      if (!var4) {
         var0 = (int)((float)var0 * class_6763.field_34898);
         var1 = (int)((float)var1 * class_6763.field_34898);
         var2 = (int)((float)var2 * class_6763.field_34898);
         var3 = (int)((float)var3 * class_6763.field_34898);
      } else {
         float[] var7 = method_144(var0, var1);
         var0 = (int)var7[0];
         var1 = (int)var7[1];
         float[] var8 = method_144(var2, var3);
         var2 = (int)var8[0];
         var3 = (int)var8[1];
      }

      if (GL11.glIsEnabled(3089)) {
         IntBuffer var17 = BufferUtils.createIntBuffer(16);
         GL11.glGetIntegerv(3088, var17);
         field_105.push(var17);
         int var18 = var17.get(0);
         int var9 = MinecraftClient.method_8510().field_9602.method_43198() - var17.get(1) - var17.get(3);
         int var10 = var18 + var17.get(2);
         int var11 = var9 + var17.get(3);
         if (var0 < var18) {
            var0 = var18;
         }

         if (var1 < var9) {
            var1 = var9;
         }

         if (var2 > var10) {
            var2 = var10;
         }

         if (var3 > var11) {
            var3 = var11;
         }

         if (var1 > var3) {
            var3 = var1;
         }

         if (var0 > var2) {
            var2 = var0;
         }
      }

      int var19 = MinecraftClient.method_8510().field_9602.method_43198() - var3;
      int var20 = var2 - var0;
      int var21 = var3 - var1;
      GL11.glEnable(3089);
      if (var20 >= 0 && var21 >= 0) {
         GL11.glScissor(var0, var19, var20, var21);
      }
   }

   public static void method_141() {
      if (field_105.isEmpty()) {
         GL11.glDisable(3089);
      } else {
         IntBuffer var2 = field_105.pop();
         GL11.glScissor(var2.get(0), var2.get(1), var2.get(2), var2.get(3));
      }
   }

   public static void method_112(float var0, float var1, float var2) {
      field_107 = var0;
      field_103 = var1;
      field_106 = var2;
      GL11.glScalef(var0, var1, var2);
   }

   public static void method_103(float var0, float var1, float var2, float var3, int var4) {
      method_94(var0, var1, var0 + var2, var1 + var3, var4);
   }

   public static void method_93(double var0, double var2, double var4, double var6, int var8) {
      method_94((float)var0, (float)var2, (float)var4, (float)var6, var8);
   }

   public static void method_94(float var0, float var1, float var2, float var3, int var4) {
      if (var0 < var2) {
         int var7 = (int)var0;
         var0 = var2;
         var2 = (float)var7;
      }

      if (var1 < var3) {
         int var13 = (int)var1;
         var1 = var3;
         var3 = (float)var13;
      }

      float var14 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var4 & 0xFF) / 255.0F;
      class_8042 var11 = class_8042.method_36499();
      class_9633 var12 = var11.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      class_3542.method_16480(var8, var9, var10, var14);
      var12.method_44471(7, class_7985.field_40915);
      var12.method_35761((double)var0, (double)var3, 0.0).method_35735();
      var12.method_35761((double)var2, (double)var3, 0.0).method_35735();
      var12.method_35761((double)var2, (double)var1, 0.0).method_35735();
      var12.method_35761((double)var0, (double)var1, 0.0).method_35735();
      var11.method_36500();
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_129(float var0, float var1, float var2, float var3, class_4230 var4) {
      if (var0 < var2) {
         int var7 = (int)var0;
         var0 = var2;
         var2 = (float)var7;
      }

      if (var1 < var3) {
         int var8 = (int)var1;
         var1 = var3;
         var3 = (float)var8;
      }

      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      var4.method_19717(true);
      var4.method_19713((int)var0 - (int)var2, (int)var1 - (int)var3);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_109(float var0, float var1, float var2, float var3, int var4) {
      method_110(var0, var1, var2, var3, 1, var4);
   }

   public static void method_110(float var0, float var1, float var2, float var3, int var4, int var5) {
      method_94(var0, var3 - (float)var4, var2 - (float)var4, var3, var5);
      method_94(var0, var1, var2 - (float)var4, var1 + (float)var4, var5);
      method_94(var0, var1 + (float)var4, var0 + (float)var4, var3 - (float)var4, var5);
      method_94(var2 - (float)var4, var1, var2, var3, var5);
   }

   public static void method_140(double var0, double var2, double var4, double var6, double var8, int var10, int var11) {
      method_93(var0 + var8, var2 + var8, var4 - var8, var6 - var8, var10);
      method_93(var0 + var8, var2, var4 - var8, var2 + var8, var11);
      method_93(var0, var2, var0 + var8, var6, var11);
      method_93(var4 - var8, var2, var4, var6, var11);
      method_93(var0 + var8, var6 - var8, var4 - var8, var6, var11);
   }

   public static void method_81(int var0, int var1, int var2, int var3, int var4, int var5) {
      float var8 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var4 & 0xFF) / 255.0F;
      float var12 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var13 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var14 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var15 = (float)(var5 & 0xFF) / 255.0F;
      class_3542.method_16354();
      class_3542.method_16488();
      class_3542.method_16458();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      class_3542.method_16486(7425);
      class_8042 var16 = class_8042.method_36499();
      class_9633 var17 = var16.method_36501();
      var17.method_44471(7, class_7985.field_40903);
      var17.method_35761((double)var2, (double)var1, 0.0).method_35742(var9, var10, var11, var8).method_35735();
      var17.method_35761((double)var0, (double)var1, 0.0).method_35742(var9, var10, var11, var8).method_35735();
      var17.method_35761((double)var0, (double)var3, 0.0).method_35742(var13, var14, var15, var12).method_35735();
      var17.method_35761((double)var2, (double)var3, 0.0).method_35742(var13, var14, var15, var12).method_35735();
      var16.method_36500();
      class_3542.method_16486(7424);
      class_3542.method_16448();
      class_3542.method_16374();
      class_3542.method_16432();
   }

   public static void method_82(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      float var10 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var11 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var12 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var13 = (float)(var4 & 0xFF) / 255.0F;
      float var14 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var15 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var16 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var17 = (float)(var5 & 0xFF) / 255.0F;
      float var18 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var19 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var20 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var21 = (float)(var6 & 0xFF) / 255.0F;
      float var22 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var23 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var24 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var25 = (float)(var7 & 0xFF) / 255.0F;
      class_3542.method_16354();
      class_3542.method_16488();
      class_3542.method_16458();
      class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
      class_3542.method_16486(7425);
      class_8042 var26 = class_8042.method_36499();
      class_9633 var27 = var26.method_36501();
      var27.method_44471(7, class_7985.field_40903);
      var27.method_35761((double)var2, (double)var1, 0.0).method_35742(var15, var16, var17, var14).method_35735();
      var27.method_35761((double)var0, (double)var1, 0.0).method_35742(var11, var12, var13, var10).method_35735();
      var27.method_35761((double)var0, (double)var3, 0.0).method_35742(var23, var24, var25, var22).method_35735();
      var27.method_35761((double)var2, (double)var3, 0.0).method_35742(var19, var20, var21, var18).method_35735();
      var26.method_36500();
      class_3542.method_16486(7424);
      class_3542.method_16448();
      class_3542.method_16374();
      class_3542.method_16432();
   }

   public static void method_146(float var0, float var1, float var2, float var3, int var4, float var5) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glLineWidth(var5);
      float var8 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var9 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var4 & 0xFF) / 255.0F;
      class_8042 var12 = class_8042.method_36499();
      class_9633 var13 = var12.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var9, var10, var11, var8);
      GL11.glEnable(2848);
      var13.method_44471(1, class_7985.field_40903);
      var13.method_35761((double)var0, (double)var1, 0.0);
      var13.method_35761((double)var2, (double)var3, 0.0);
      var12.method_36500();
      GL11.glDisable(2848);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_142(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float var9 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var10 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var12 = (float)(var6 & 0xFF) / 255.0F;
      class_8042 var13 = class_8042.method_36499();
      class_9633 var14 = var13.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var10, var11, var12, var9);
      GL11.glBegin(6);
      GL11.glVertex2f(var0, var1);
      GL11.glVertex2f(var4, var5);
      GL11.glVertex2f(var2, var3);
      GL11.glVertex2f(var0, var1);
      GL11.glEnd();
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_152(float var0, float var1, float var2, int var3, int var4) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      class_8042 var7 = class_8042.method_36499();
      class_9633 var8 = var7.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      GL11.glColor4fv(class_314.method_1412(var3));
      GL11.glEnable(2881);
      GL11.glBegin(4);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 + var2 / 2.0F);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 - var2 / 2.0F);
      GL11.glVertex2f(var0 - var2 / 2.0F, var1);
      GL11.glEnd();
      GL11.glLineWidth(2.0F);
      GL11.glColor4fv(class_314.method_1412(var4));
      GL11.glBegin(3);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 + var2 / 2.0F);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 - var2 / 2.0F);
      GL11.glEnd();
      GL11.glBegin(3);
      GL11.glVertex2f(var0 - var2 / 2.0F, var1);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 - var2 / 2.0F);
      GL11.glEnd();
      GL11.glBegin(3);
      GL11.glVertex2f(var0 + var2 / 2.0F, var1 + var2 / 2.0F);
      GL11.glVertex2f(var0 - var2 / 2.0F, var1);
      GL11.glEnd();
      GL11.glDisable(2881);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_124(float var0, float var1, float var2, int var3) {
      method_134(var0, var1, 0.0F, 360.0F, var2 - 1.0F, var3);
   }

   public static void method_136(float var0, float var1, float var2, float var3, int var4) {
      method_122(var0, var1, 0.0F, 360.0F, var2 - 1.0F, var3 - 1.0F, var4);
   }

   public static void method_121(float var0, float var1, float var2, int var3) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float var6 = (float)(var3 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var3 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var3 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var3 & 0xFF) / 255.0F;
      class_8042 var10 = class_8042.method_36499();
      class_9633 var11 = var10.method_36501();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var7, var8, var9, var6);
      GL11.glEnable(2832);
      GL11.glEnable(3042);
      GL11.glPointSize(var2 * class_6763.field_34898);
      GL11.glBegin(0);
      GL11.glVertex2f(var0, var1);
      GL11.glEnd();
      GL11.glDisable(2832);
      GL11.glDisable(3042);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_87(class_3384 var0, float var1, float var2, String var3, int var4) {
      method_89(var0, var1, var2, var3, var4, class_6206.field_31724, class_6206.field_31723, false);
   }

   public static void method_88(class_3384 var0, float var1, float var2, String var3, int var4, class_6206 var5, class_6206 var6) {
      method_89(var0, var1, var2, var3, var4, var5, var6, false);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_89(class_3384 var0, float var1, float var2, String var3, int var4, class_6206 var5, class_6206 var6, boolean var7) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      int var10 = 0;
      int var11 = 0;
      switch (var5) {
         case field_31726:
            var10 = -var0.method_18547(var3) / 2;
            break;
         case field_31722:
            var10 = -var0.method_18547(var3);
      }

      switch (var6) {
         case field_31726:
            var11 = -var0.method_18548(var3) / 2;
            break;
         case field_31720:
            var11 = -var0.method_18548(var3);
      }

      float var12 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var13 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var14 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var15 = (float)(var4 & 0xFF) / 255.0F;
      GL11.glPushMatrix();
      boolean var16 = false;
      if ((double)class_6763.field_34898 == 2.0) {
         if (var0 == class_5320.field_27152) {
            var0 = class_5320.field_27153;
         } else if (var0 == class_5320.field_27141) {
            var0 = class_5320.field_27151;
         } else if (var0 == class_5320.field_27145) {
            var0 = class_5320.field_27150;
         } else if (var0 == class_5320.field_27138) {
            var0 = class_5320.field_27157;
         } else if (var0 == class_5320.field_27139) {
            var0 = class_5320.field_27140;
         } else if (var0 == class_5320.field_27154) {
            var0 = class_5320.field_27160;
         } else if (var0 == class_5320.field_27161) {
            var0 = class_5320.field_27147;
         } else if (var0 == class_5320.field_27155) {
            var0 = class_5320.field_27144;
         } else {
            var16 = true;
         }

         if (!var16) {
            float[] var17 = method_144((int)var1, (int)var2);
            int var18 = (int)var17[0];
            int var19 = (int)var17[1];
            GL11.glTranslatef(var1, var2, 0.0F);
            GL11.glScalef(1.0F / class_6763.field_34898, 1.0F / class_6763.field_34898, 1.0F / class_6763.field_34898);
            GL11.glTranslatef(-var1, -var2, 0.0F);
            var10 = (int)((float)var10 * class_6763.field_34898);
            var11 = (int)((float)var11 * class_6763.field_34898);
         }
      }

      class_3542.method_16488();
      GL11.glBlendFunc(770, 771);
      if (var7) {
         var0.method_18545((float)Math.round(var1 + (float)var10), (float)(Math.round(var2 + (float)var11) + 2), var3, new class_8709(0.0F, 0.0F, 0.0F, 0.35F));
      }

      if (var3 != null) {
         var0.method_18545((float)Math.round(var1 + (float)var10), (float)Math.round(var2 + (float)var11), var3, new class_8709(var13, var14, var15, var12));
      }

      class_3542.method_16448();
      GL11.glPopMatrix();
   }

   public static void method_90(class_3786 var0, float var1, float var2, String var3, int var4) {
      method_92(var0, var1, var2, var3, var4, class_6206.field_31724, class_6206.field_31723, false);
   }

   public static void method_91(class_3786 var0, float var1, float var2, String var3, int var4, class_6206 var5, class_6206 var6) {
      method_92(var0, var1, var2, var3, var4, var5, var6, false);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_92(class_3786 var0, float var1, float var2, String var3, int var4, class_6206 var5, class_6206 var6, boolean var7) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      int var10 = 0;
      int var11 = 0;
      switch (var5) {
         case field_31726:
            var10 = -var0.method_18547(var3) / 2;
            break;
         case field_31722:
            var10 = -var0.method_18547(var3);
      }

      switch (var6) {
         case field_31726:
            var11 = -var0.method_18548(var3) / 2;
            break;
         case field_31720:
            var11 = -var0.method_18548(var3);
      }

      float var12 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var13 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var14 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var15 = (float)(var4 & 0xFF) / 255.0F;
      class_3542.method_16488();
      GL11.glBlendFunc(770, 771);
      class_9162.method_42217();
      var0.method_18545((float)Math.round(var1 + (float)var10), (float)Math.round(var2 + (float)var11), var3, new class_8709(var13, var14, var15, var12));
      class_3542.method_16448();
   }

   public static void method_134(float var0, float var1, float var2, float var3, float var4, int var5) {
      method_122(var0, var1, var2, var3, var4, var4, var5);
   }

   public static void method_122(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float var9 = 0.0F;
      if (var2 > var3) {
         var9 = var3;
         var3 = var2;
         var2 = var9;
      }

      float var10 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var13 = (float)(var6 & 0xFF) / 255.0F;
      class_8042 var14 = class_8042.method_36499();
      class_9633 var15 = var14.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var11, var12, var13, var10);
      if (var10 > 0.5F) {
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glBegin(3);

         for (float var16 = var3; var16 >= var2; var16 -= 4.0F) {
            float var17 = (float)Math.cos((double)var16 * Math.PI / 180.0) * var4 * 1.001F;
            float var18 = (float)Math.sin((double)var16 * Math.PI / 180.0) * var5 * 1.001F;
            GL11.glVertex2f(var0 + var17, var1 + var18);
         }

         GL11.glEnd();
         GL11.glDisable(2848);
      }

      GL11.glBegin(6);

      for (float var20 = var3; var20 >= var2; var20 -= 4.0F) {
         float var21 = (float)Math.cos((double)var20 * Math.PI / 180.0) * var4;
         float var22 = (float)Math.sin((double)var20 * Math.PI / 180.0) * var5;
         GL11.glVertex2f(var0 + var21, var1 + var22);
      }

      GL11.glEnd();
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_105(float var0, float var1, float[] var2, float[] var3, int var4) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      float var7 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var4 & 0xFF) / 255.0F;
      class_8042 var11 = class_8042.method_36499();
      class_9633 var12 = var11.method_36501();
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var8, var9, var10, var7);
      GL11.glBegin(6);

      for (int var13 = var2.length - 1; var13 >= 0; var13--) {
         GL11.glVertex2f(var0 + var2[var13], var1 + var3[var13]);
      }

      GL11.glEnd();
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_153(float var0, float var1, float var2, float var3, class_8343 var4, int var5) {
      method_101(var0, var1, var2, var3, var4, var5, 0.0F, 0.0F, (float)var4.method_38415(), (float)var4.method_38421(), true);
      method_101(var0, var1, var2, var3, var4, var5, 0.0F, 0.0F, (float)var4.method_38415(), (float)var4.method_38421(), false);
   }

   public static void method_99(float var0, float var1, float var2, float var3, class_8343 var4, int var5) {
      method_101(var0, var1, var2, var3, var4, var5, 0.0F, 0.0F, (float)var4.method_38415(), (float)var4.method_38421(), true);
   }

   public static void method_102(float var0, float var1, float var2, float var3, class_8343 var4, int var5, boolean var6) {
      method_101(var0, var1, var2, var3, var4, var5, 0.0F, 0.0F, (float)var4.method_38415(), (float)var4.method_38421(), var6);
   }

   public static void method_100(float var0, float var1, float var2, float var3, class_8343 var4, int var5, float var6, float var7, float var8, float var9) {
      method_101(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, true);
   }

   public static void method_101(
      float var0, float var1, float var2, float var3, class_8343 var4, int var5, float var6, float var7, float var8, float var9, boolean var10
   ) {
      if (var4 != null) {
         class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
         var0 = (float)Math.round(var0);
         var2 = (float)Math.round(var2);
         var1 = (float)Math.round(var1);
         var3 = (float)Math.round(var3);
         float var13 = (float)(var5 >> 24 & 0xFF) / 255.0F;
         float var14 = (float)(var5 >> 16 & 0xFF) / 255.0F;
         float var15 = (float)(var5 >> 8 & 0xFF) / 255.0F;
         float var16 = (float)(var5 & 0xFF) / 255.0F;
         class_3542.method_16488();
         class_3542.method_16354();
         class_3542.method_16424(770, 771, 1, 0);
         class_3542.method_16480(var14, var15, var16, var13);
         GL11.glEnable(3042);
         GL11.glEnable(3553);
         var4.method_38419();
         float var17 = var2 / (float)var4.method_38420() / (var2 / (float)var4.method_38415());
         float var18 = var3 / (float)var4.method_38422() / (var3 / (float)var4.method_38421());
         float var19 = var8 / (float)var4.method_38415() * var17;
         float var20 = var9 / (float)var4.method_38421() * var18;
         float var21 = var6 / (float)var4.method_38415() * var17;
         float var22 = var7 / (float)var4.method_38421() * var18;
         if (!var10) {
            GL11.glTexParameteri(3553, 10240, 9729);
         } else {
            GL11.glTexParameteri(3553, 10240, 9728);
         }

         GL11.glBegin(7);
         GL11.glTexCoord2f(var21, var22);
         GL11.glVertex2f(var0, var1);
         GL11.glTexCoord2f(var21, var22 + var20);
         GL11.glVertex2f(var0, var1 + var3);
         GL11.glTexCoord2f(var21 + var19, var22 + var20);
         GL11.glVertex2f(var0 + var2, var1 + var3);
         GL11.glTexCoord2f(var21 + var19, var22);
         GL11.glVertex2f(var0 + var2, var1);
         GL11.glEnd();
         GL11.glDisable(3553);
         GL11.glDisable(3042);
         class_3542.method_16432();
         class_3542.method_16448();
      }
   }

   public static void method_138(
      float var0, float var1, float var2, float var3, ByteBuffer var4, int var5, float var6, float var7, float var8, float var9, boolean var10, boolean var11
   ) {
      if (var4 != null) {
         class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
         var0 = (float)Math.round(var0);
         var2 = (float)Math.round(var2);
         var1 = (float)Math.round(var1);
         var3 = (float)Math.round(var3);
         float var14 = (float)(var5 >> 24 & 0xFF) / 255.0F;
         float var15 = (float)(var5 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var5 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var5 & 0xFF) / 255.0F;
         class_3542.method_16488();
         class_3542.method_16354();
         class_3542.method_16424(770, 771, 1, 0);
         class_3542.method_16480(var15, var16, var17, var14);
         GL11.glEnable(3042);
         GL11.glEnable(3553);
         GL11.glPixelStorei(3312, 0);
         GL11.glPixelStorei(3313, 0);
         GL11.glPixelStorei(3314, 0);
         GL11.glPixelStorei(3315, 0);
         GL11.glPixelStorei(3316, 0);
         GL11.glPixelStorei(3317, 4);
         GL11.glTexParameteri(3553, 10240, 9728);
         int var18 = GL11.glGenTextures();
         GL11.glTexImage2D(3553, 0, 6407, (int)var8, (int)var9, 0, 6407, 5121, var4);
         float var19 = var8 / var8 * 1.0F;
         float var20 = var9 / var9 * 1.0F;
         float var21 = var6 / var8 * 1.0F;
         float var22 = var7 / var9 * 1.0F;
         GL11.glBegin(7);
         GL11.glTexCoord2f(var21 + (!var10 ? 0.0F : var19), var22 + (!var11 ? 0.0F : var20));
         GL11.glVertex2f(var0, var1);
         GL11.glTexCoord2f(var21 + (!var10 ? 0.0F : var19), var22 + (!var11 ? var20 : 0.0F));
         GL11.glVertex2f(var0, var1 + var3);
         GL11.glTexCoord2f(var21 + (!var10 ? var19 : 0.0F), var22 + (!var11 ? var20 : 0.0F));
         GL11.glVertex2f(var0 + var2, var1 + var3);
         GL11.glTexCoord2f(var21 + (!var10 ? var19 : 0.0F), var22 + (!var11 ? 0.0F : var20));
         GL11.glVertex2f(var0 + var2, var1);
         GL11.glEnd();
         GL11.glDisable(3553);
         GL11.glDisable(3042);
         class_3542.method_16432();
         class_3542.method_16448();
      }
   }

   public static void method_97(float var0, float var1, float var2, float var3, class_8343 var4, float var5) {
      method_99(var0, var1, var2, var3, var4, class_314.method_1444(class_1255.field_6918.field_6917, var5));
   }

   public static void method_96(float var0, float var1, float var2, float var3, class_8343 var4) {
      method_99(var0, var1, var2, var3, var4, -1);
   }

   public static void method_98(float var0, float var1, float var2, float var3, class_8343 var4, float var5, float var6, float var7, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef(var0 + var2 / 2.0F, var1 + var3 / 2.0F, 0.0F);
      GL11.glRotatef(var5, var6, var7, var8);
      GL11.glTranslatef(-var0 - var2 / 2.0F, -var1 - var3 / 2.0F, 0.0F);
      method_96(var0, var1, var2, var3, var4);
      GL11.glPopMatrix();
   }

   public static void method_137(float var0, float var1, float var2, float var3, int var4, float var5, float var6, float var7, float var8) {
      class_3542.method_16480(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      var0 = (float)Math.round(var0);
      var2 = (float)Math.round(var2);
      var1 = (float)Math.round(var1);
      var3 = (float)Math.round(var3);
      float var11 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var4 & 0xFF) / 255.0F;
      class_3542.method_16488();
      class_3542.method_16354();
      class_3542.method_16424(770, 771, 1, 0);
      class_3542.method_16480(var12, var13, var14, var11);
      GL11.glEnable(3042);
      GL11.glEnable(3553);
      GL11.glPixelStorei(3312, 0);
      GL11.glPixelStorei(3313, 0);
      GL11.glPixelStorei(3314, 0);
      GL11.glPixelStorei(3315, 0);
      GL11.glPixelStorei(3316, 0);
      GL11.glPixelStorei(3317, 4);
      int var15 = GL11.glGenTextures();
      float var16 = var7 / var7 * 1.0F;
      float var17 = var8 / var8 * 1.0F;
      float var18 = var5 / var7 * 1.0F;
      float var19 = var6 / var8 * 1.0F;
      GL11.glBegin(7);
      GL11.glTexCoord2f(var18, var19);
      GL11.glVertex2f(var0, var1);
      GL11.glTexCoord2f(var18, var19 + var17);
      GL11.glVertex2f(var0, var1 + var3);
      GL11.glTexCoord2f(var18 + var16, var19 + var17);
      GL11.glVertex2f(var0 + var2, var1 + var3);
      GL11.glTexCoord2f(var18 + var16, var19);
      GL11.glVertex2f(var0 + var2, var1);
      GL11.glEnd();
      GL11.glDisable(3553);
      GL11.glDisable(3042);
      class_3542.method_16432();
      class_3542.method_16448();
   }

   public static void method_119(float var0, float var1, float var2, int var3) {
      float var6 = (float)System.nanoTime() / 5000000.0F % 360.0F;

      for (int var7 = 0; var7 < 360; var7 = (int)((float)var7 + 51.42857F)) {
         float var8 = (float)Math.cos((double)((float)var7 + var6) * Math.PI / 180.0) * var2;
         float var9 = (float)Math.sin((double)((float)var7 + var6) * Math.PI / 180.0) * var2;
         method_124(var0 + var8, var1 + var9, var2 / 4.0F, var3);
      }
   }

   public static void method_83(class_8194 var0, int var1) {
      if (var0 != null) {
         float var4 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var5 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var6 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var7 = (float)(var1 & 0xFF) / 255.0F;
         GL11.glColor4f(var5, var6, var7, var4);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glLineWidth(1.8F * class_6763.field_34898);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glEnd();
         GL11.glBegin(7);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glEnd();
         GL11.glEnable(3553);
         GL11.glEnable(2896);
         GL11.glDisable(2848);
         GL11.glDisable(3042);
      }
   }

   public static void method_118(class_8194 var0, int var1, float var2) {
      if (var0 != null) {
         float var5 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var6 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(var1 & 0xFF) / 255.0F;
         GL11.glColor4f(var6, var7, var8, var5);
         GL11.glPointSize(var2);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glLineWidth(1.8F * class_6763.field_34898);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         GL11.glBegin(0);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glEnable(3553);
         GL11.glEnable(2896);
         GL11.glDisable(2848);
         GL11.glDisable(3042);
      }
   }

   public static void method_131(class_8194 var0, int var1) {
      method_130(var0, 2.8F, var1);
   }

   public static void method_130(class_8194 var0, float var1, int var2) {
      if (var0 != null) {
         float var5 = (float)(var2 >> 24 & 0xFF) / 255.0F;
         float var6 = (float)(var2 >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(var2 >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(var2 & 0xFF) / 255.0F;
         GL11.glColor4f(var6, var7, var8, var5);
         GL11.glDisable(3553);
         GL11.glDisable(2896);
         GL11.glLineWidth(var1);
         GL11.glEnable(2848);
         GL11.glEnable(3042);
         GL11.glBegin(3);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(3);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glEnd();
         GL11.glBegin(1);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41935);
         GL11.glVertex3d(var0.field_41939, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41939, var0.field_41940, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41938, var0.field_41936);
         GL11.glVertex3d(var0.field_41941, var0.field_41940, var0.field_41936);
         GL11.glEnd();
         GL11.glEnable(3553);
         GL11.glEnable(2896);
         GL11.glDisable(2848);
         GL11.glDisable(3042);
      }
   }

   public static void method_128(float var0, float var1, float var2, float var3, float var4, float var5) {
      GL11.glAlphaFunc(519, 0.0F);
      int var8 = class_314.method_1444(class_1255.field_6918.field_6917, var5);
      method_99(var0 - var4, var1 - var4, var4, var4, class_2209.field_11057, var8);
      method_99(var0 + var2, var1 - var4, var4, var4, class_2209.field_11051, var8);
      method_99(var0 - var4, var1 + var3, var4, var4, class_2209.field_11013, var8);
      method_99(var0 + var2, var1 + var3, var4, var4, class_2209.field_11038, var8);
      method_102(var0 - var4, var1, var4, var3, class_2209.field_11010, var8, false);
      method_102(var0 + var2, var1, var4, var3, class_2209.field_11018, var8, false);
      method_102(var0, var1 - var4, var2, var4, class_2209.field_10997, var8, false);
      method_102(var0, var1 + var3, var2, var4, class_2209.field_10992, var8, false);
   }

   public static void method_147(float var0, float var1, float var2, float var3, float var4, float var5) {
      int var8 = class_314.method_1444(class_1255.field_6918.field_6917, var5);
      method_102(var0, var1, var4, var3, class_2209.field_11018, var8, false);
      method_102(var0 + var2 - var4, var1, var4, var3, class_2209.field_11010, var8, false);
      method_102(var0, var1, var2, var4, class_2209.field_10992, var8, false);
      method_102(var0, var1 + var3 - var4, var2, var4, class_2209.field_10997, var8, false);
   }

   public static void method_115(int var0, int var1, int var2, int var3, int var4) {
      method_116(var0, var1, var2, var3, var4, var0, var1);
   }

   public static void method_116(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      byte var9 = 36;
      byte var10 = 10;
      int var11 = var9 - var10;
      method_94((float)(var0 + var10), (float)(var1 + var10), (float)(var0 + var2 - var10), (float)(var1 + var3 - var10), var4);
      method_99((float)(var0 - var11), (float)(var1 - var11), (float)var9, (float)var9, class_2209.field_10996, var4);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 + var2 - var9 / 2), (float)(var1 + var9 / 2), 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var2 - var9 / 2), (float)(-var1 - var9 / 2), 0.0F);
      method_99((float)(var0 + var2 - var11), (float)(var1 - var11), (float)var9, (float)var9, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 + var2 - var9 / 2), (float)(var1 + var3 + var9 / 2), 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var2 - var9 / 2), (float)(-var1 - var3 - var9 / 2), 0.0F);
      method_99((float)(var0 + var2 - var11), (float)(var1 + var10 + var3), (float)var9, (float)var9, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 - var9 / 2), (float)(var1 + var3 + var9 / 2), 0.0F);
      GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var9 / 2), (float)(-var1 - var3 - var9 / 2), 0.0F);
      method_99((float)(var0 + var10), (float)(var1 + var10 + var3), (float)var9, (float)var9, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      method_149(var5 - var9, var6 + var10, var5 - var11 + var9, var6 - var10 + var3);

      for (byte var12 = 0; var12 < var3; var12 += var9) {
         method_99((float)(var0 - var11), (float)(var1 + var10 + var12), (float)var9, (float)var9, class_2209.field_11034, var4);
      }

      method_141();
      method_149(var5, var6 - var11, var5 + var2 - var10, var6 + var10);

      for (byte var13 = 0; var13 < var2; var13 += var9) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var9 / 2), (float)(var1 + var9 / 2), 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var9 / 2), (float)(-var1 - var9 / 2), 0.0F);
         method_99((float)(var0 - var11), (float)(var1 - var10 - var13), (float)var9, (float)var9, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
      method_149(var5 + var2 - var10, var6 - var11, var0 + var2 + var11, var6 + var3 - var10);

      for (byte var14 = 0; var14 < var3; var14 += var9) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var9 / 2), (float)(var1 + var9 / 2), 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var9 / 2), (float)(-var1 - var9 / 2), 0.0F);
         method_99((float)(var0 - var2 + var10), (float)(var1 - var10 - var14), (float)var9, (float)var9, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
      method_149(var5 - var10, var6 - var11 + var3 - var9, var5 + var2 - var10, var6 + var3 + var10 * 2);

      for (byte var15 = 0; var15 < var2; var15 += var9) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var9 / 2), (float)(var1 + var9 / 2), 0.0F);
         GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var9 / 2), (float)(-var1 - var9 / 2), 0.0F);
         method_99((float)(var0 - var3 + var10), (float)(var1 + var10 + var15), (float)var9, (float)var9, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
   }

   public static void method_120(int var0, int var1, int var2, int var3, int var4) {
      byte var7 = 36;
      byte var8 = 10;
      int var9 = var7 - var8;
      method_94((float)(var0 + var8), (float)(var1 + var8), (float)(var0 + var2 - var8), (float)(var1 + var3 - var8), var4);
      method_99((float)(var0 - var9), (float)(var1 - var9), (float)var7, (float)var7, class_2209.field_10996, var4);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 + var2 - var7 / 2), (float)(var1 + var7 / 2), 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var2 - var7 / 2), (float)(-var1 - var7 / 2), 0.0F);
      method_99((float)(var0 + var2 - var9), (float)(var1 - var9), (float)var7, (float)var7, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 + var2 - var7 / 2), (float)(var1 + var3 + var7 / 2), 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var2 - var7 / 2), (float)(-var1 - var3 - var7 / 2), 0.0F);
      method_99((float)(var0 + var2 - var9), (float)(var1 + var8 + var3), (float)var7, (float)var7, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(var0 - var7 / 2), (float)(var1 + var3 + var7 / 2), 0.0F);
      GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var0 - var7 / 2), (float)(-var1 - var3 - var7 / 2), 0.0F);
      method_99((float)(var0 + var8), (float)(var1 + var8 + var3), (float)var7, (float)var7, class_2209.field_10996, var4);
      GL11.glPopMatrix();
      method_150(var0 - var7, var1 + var8, var0 - var9 + var7, var1 - var8 + var3, true);

      for (byte var10 = 0; var10 < var3; var10 += var7) {
         method_99((float)(var0 - var9), (float)(var1 + var8 + var10) - 0.4F, (float)var7, (float)var7 + 0.4F, class_2209.field_11034, var4);
      }

      method_141();
      method_150(var0, var1 - var9, var0 + var2 - var8, var1 + var8, true);

      for (byte var11 = 0; var11 < var2; var11 += var7) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var7 / 2), (float)(var1 + var7 / 2), 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var7 / 2), (float)(-var1 - var7 / 2), 0.0F);
         method_99((float)(var0 - var9), (float)(var1 - var8 - var11) - 0.4F, (float)var7, (float)var7 + 0.4F, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
      method_150(var0 + var2 - var8, var1 - var9, var0 + var2 + var9, var1 + var3 - var8, true);

      for (byte var12 = 0; var12 < var3; var12 += var7) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var7 / 2), (float)(var1 + var7 / 2), 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var7 / 2), (float)(-var1 - var7 / 2), 0.0F);
         method_99((float)(var0 - var2 + var8), (float)(var1 - var8 - var12) - 0.4F, (float)var7, (float)var7 + 0.4F, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
      method_150(var0 - var8, var1 - var9 + var3 - var7, var0 + var2 - var8, var1 + var3 + var8 * 2, true);

      for (byte var13 = 0; var13 < var2; var13 += var7) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(var0 + var7 / 2), (float)(var1 + var7 / 2), 0.0F);
         GL11.glRotatef(270.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef((float)(-var0 - var7 / 2), (float)(-var1 - var7 / 2), 0.0F);
         method_99((float)(var0 - var3 + var8), (float)(var1 + var8 + var13) - 0.4F, (float)var7, (float)var7 + 0.4F, class_2209.field_11034, var4);
         GL11.glPopMatrix();
      }

      method_141();
   }

   public static void method_127() {
      class_4230 var2 = MinecraftClient.method_8510().method_8584();
      if (var2 != null && var2.field_20532 > -1) {
         method_95(var2);
         var2.field_20532 = -1;
      }
   }

   public static void method_95(class_4230 var0) {
      EXTFramebufferObject.glDeleteRenderbuffersEXT(var0.field_20532);
      int var3 = EXTFramebufferObject.glGenRenderbuffersEXT();
      EXTFramebufferObject.glBindRenderbufferEXT(36161, var3);
      EXTFramebufferObject.glRenderbufferStorageEXT(
         36161, 34041, MinecraftClient.method_8510().field_9602.method_43178(), MinecraftClient.method_8510().field_9602.method_43198()
      );
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36128, 36161, var3);
      EXTFramebufferObject.glFramebufferRenderbufferEXT(36160, 36096, 36161, var3);
   }

   public static void method_117(float var0, float var1, float var2) {
      method_107();
      method_121(var0, var1, var2 * 2.0F, -1);
      method_85(class_3118.field_15505);
   }

   public static void method_86(float var0, float var1, float var2, float var3, float var4) {
      method_107();
      method_111(var0, var1, var2, var3, var4, -1);
      method_85(class_3118.field_15505);
   }

   public static void method_111(float var0, float var1, float var2, float var3, float var4, int var5) {
      method_124(var0 + var4, var1 + var4, var4, var5);
      method_124(var0 - var4 + var2, var1 + var4, var4, var5);
      method_124(var0 + var4, var1 - var4 + var3, var4, var5);
      method_124(var0 - var4 + var2, var1 - var4 + var3, var4, var5);
      method_94(var0, var1 + var4, var0 + var2, var1 + var3 - var4, var5);
      method_94(var0 + var4, var1, var0 + var2 - var4, var1 + var3, var5);
   }

   public static void method_133(float var0, float var1, float var2, float var3, float var4, int var5) {
      method_94(var0, var1 + var4, var0 + var2, var1 + var3 - var4, var5);
      method_94(var0 + var4, var1, var0 + var2 - var4, var1 + var4, var5);
      method_94(var0 + var4, var1 + var3 - var4, var0 + var2 - var4, var1 + var3, var5);
      float var8 = var4 * class_6763.field_34898;
      method_148(var0, var1, var0 + var4, var1 + var4);
      method_124(var0 + var4, var1 + var4, var4, var5);
      method_141();
      method_148(var0 + var2 - var4, var1, var0 + var2, var1 + var4);
      method_124(var0 - var4 + var2, var1 + var4, var4, var5);
      method_141();
      method_148(var0, var1 + var3 - var4, var0 + var4, var1 + var3);
      method_124(var0 + var4, var1 - var4 + var3, var4, var5);
      method_141();
      method_148(var0 + var2 - var4, var1 + var3 - var4, var0 + var2, var1 + var3);
      method_124(var0 - var4 + var2, var1 - var4 + var3, var4, var5);
      method_141();
   }

   public static void method_139(float var0, float var1, float var2, float var3, float var4, int var5) {
      method_94(var0, var1 + var4, var0 + var2, var1 + var3 - var4, var5);
      method_94(var0 + var4, var1, var0 + var2 - var4, var1 + var3, var5);
      FloatBuffer var8 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloatv(2982, var8);
      float var9 = 1.0F;
      method_121(var0 + var4, var1 + var4, var4 * 2.0F * var9, var5);
      method_121(var0 - var4 + var2, var1 + var4, var4 * 2.0F * var9, var5);
      method_121(var0 + var4, var1 - var4 + var3, var4 * 2.0F * var9, var5);
      method_121(var0 - var4 + var2, var1 - var4 + var3, var4 * 2.0F * var9, var5);
   }

   public static void method_108(float var0, float var1, float var2, float var3, float var4, int var5) {
      method_94(var0, var1 + var4, var0 + var2, var1 + var3 - var4, var5);
      method_94(var0 + var4, var1, var0 + var2 - var4, var1 + var4, var5);
      method_94(var0 + var4, var1 + var3 - var4, var0 + var2 - var4, var1 + var3, var5);
      method_148(var0, var1, var0 + var4, var1 + var4);
      method_121(var0 + var4, var1 + var4, var4 * 2.0F, var5);
      method_141();
      method_148(var0 + var2 - var4, var1, var0 + var2, var1 + var4);
      method_121(var0 - var4 + var2, var1 + var4, var4 * 2.0F, var5);
      method_141();
      method_148(var0, var1 + var3 - var4, var0 + var4, var1 + var3);
      method_121(var0 + var4, var1 - var4 + var3, var4 * 2.0F, var5);
      method_141();
      method_148(var0 + var2 - var4, var1 + var3 - var4, var0 + var2, var1 + var3);
      method_121(var0 - var4 + var2, var1 - var4 + var3, var4 * 2.0F, var5);
      method_141();
   }

   public static void method_107() {
      GL11.glPushMatrix();
      method_127();
      GL11.glEnable(2960);
      GL11.glColorMask(false, false, false, false);
      GL11.glDepthMask(false);
      GL11.glStencilFunc(512, 1, 1);
      GL11.glStencilOp(7681, 7680, 7680);
      GL11.glStencilMask(1);
      GL11.glClear(1024);
      field_109 = true;
   }

   public static void method_85(class_3118 var0) {
      GL11.glColorMask(true, true, true, true);
      GL11.glDepthMask(true);
      GL11.glStencilMask(0);
      GL11.glStencilFunc(var0 != class_3118.field_15505 ? 517 : 514, 1, 1);
   }

   public static void method_145() {
      GL11.glStencilMask(-1);
      GL11.glDisable(2960);
      GL11.glPopMatrix();
      field_109 = false;
   }

   public static void method_126(class_6098 var0, int var1, int var2, int var3, int var4) {
      if (var0 != null) {
         class_7889 var10000 = field_108.method_8577();
         field_108.method_8577();
         var10000.method_35674(class_7889.field_40364);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var1, (float)var2, 0.0F);
         GL11.glScalef((float)var3 / 16.0F, (float)var4 / 16.0F, 0.0F);
         class_8765 var7 = field_108.method_8511();
         if (var0.field_31206 == 0) {
            var0 = new class_6098(var0.method_27960());
         }

         class_2451 var8 = var0.method_27960();
         class_6414 var9 = class_6414.method_29269(var8);
         boolean var10 = false;
         class_2083.method_9716();
         GL11.glLightModelfv(2899, new float[]{0.4F, 0.4F, 0.4F, 1.0F});
         class_3542.method_16481();
         class_3542.method_16487();
         class_3542.method_16488();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDepthFunc(519);
         var7.method_40264(var0, 0, 0);
         GL11.glDepthFunc(515);
         class_3542.method_16489();
         GL11.glAlphaFunc(519, 0.0F);
         class_3542.method_16420(33986, 240.0F, 240.0F);
         class_3542.method_16491();
         class_9162.method_42212();
         var10000 = field_108.method_8577();
         field_108.method_8577();
         var10000.method_35674(class_7889.field_40364);
         class_2083.method_9717();
      }
   }

   public static void method_125(class_6098 var0, int var1, int var2, float var3) {
      GL11.glPushMatrix();
      class_3542.method_16463(5888);
      class_3542.method_16476();
      field_108.method_8511().field_44875 -= 1101.0F;
      class_3542.method_16356(1.0 / field_108.field_9602.method_43189(), 1.0 / field_108.field_9602.method_43189(), 1.0);
      class_3542.method_16413((float)var1, (float)var2, 0.0F);
      class_3542.method_16403(var3 / 16.0F, var3 / 16.0F, 1.0F);
      field_108.method_8511().method_40264(var0, 0, 0);
      field_108.method_8511().field_44875 += 1101.0F;
      class_9162.method_42212();
      class_7889 var6 = field_108.method_8577();
      field_108.method_8577();
      var6.method_35674(class_7889.field_40364);
      GL11.glPopMatrix();
   }

   public static Color method_114(int var0, int var1, Color var2) {
      var0 = (int)((float)var0 * class_6763.field_34898);
      var1 = (int)((float)var1 * class_6763.field_34898);
      ByteBuffer var5 = ByteBuffer.allocateDirect(3);
      GL11.glPixelStorei(3317, 1);
      GL11.glReadPixels(var0, MinecraftClient.method_8510().field_9602.method_43198() - var1, 1, 1, 6407, 5120, var5);
      return new Color(var5.get(0) * 2, var5.get(1) * 2, var5.get(2) * 2, 1);
   }

   public static double[] method_143(double var0, double var2, double var4) {
      FloatBuffer var8 = BufferUtils.createFloatBuffer(3);
      IntBuffer var9 = BufferUtils.createIntBuffer(16);
      FloatBuffer var10 = BufferUtils.createFloatBuffer(16);
      FloatBuffer var11 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloatv(2982, var10);
      GL11.glGetFloatv(2983, var11);
      GL11.glGetIntegerv(2978, var9);
      boolean var12 = class_314.method_1398((float)var0, (float)var2, (float)var4, var10, var11, var9, var8);
      return !var12
         ? null
         : new double[]{
            (double)(var8.get(0) / class_6763.field_34898),
            (double)(((float)field_108.field_9596.field_20534 - var8.get(1)) / class_6763.field_34898),
            (double)var8.get(2)
         };
   }
}

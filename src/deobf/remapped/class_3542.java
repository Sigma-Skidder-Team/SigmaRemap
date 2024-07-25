package remapped;

import com.google.common.collect.Queues;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

public class class_3542 {
   private static final Logger field_17323 = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<class_156> field_17329 = Queues.newConcurrentLinkedQueue();
   private static final class_8042 field_17322 = new class_8042();
   public static final float field_17328 = 0.1F;
   private static final int field_17325 = 1024;
   private static boolean field_17326;
   private static Thread field_17324;
   private static Thread field_17321;
   private static int field_17327 = -1;
   private static boolean field_17331;
   private static double field_17330 = Double.MIN_VALUE;

   public static void method_16370() {
      if (field_17321 == null && field_17324 != Thread.currentThread()) {
         field_17321 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean method_16366() {
      return Thread.currentThread() == field_17321;
   }

   public static boolean method_16440() {
      return field_17331 || method_16366();
   }

   public static void method_16390(boolean var0) {
      boolean var3 = field_17321 == Thread.currentThread();
      if (field_17324 == null && field_17321 != null && var3 != var0) {
         field_17324 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean method_16429() {
      return true;
   }

   public static boolean method_16363() {
      return field_17331 || method_16429();
   }

   public static void method_16431(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean method_16395() {
      return true;
   }

   public static void method_16474(class_156 var0) {
      field_17329.add(var0);
   }

   public static void method_16415(long var0) {
      GLFW.glfwPollEvents();
      method_16482();
      class_8042.method_36499().method_36501().method_44463();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   public static void method_16482() {
      field_17326 = true;

      while (!field_17329.isEmpty()) {
         class_156 var2 = field_17329.poll();
         var2.method_621();
      }

      field_17326 = false;
   }

   public static void method_16422(int var0) {
      double var3 = field_17330 + 1.0 / (double)var0;

      double var5;
      for (var5 = GLFW.glfwGetTime(); var5 < var3; var5 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout(var3 - var5);
      }

      field_17330 = var5;
   }

   @Deprecated
   public static void method_16451() {
      method_16431(class_3542::method_16429);
      class_1920.method_8934();
   }

   @Deprecated
   public static void method_16444() {
      method_16431(class_3542::method_16429);
      class_1920.method_8885();
   }

   @Deprecated
   public static void method_16399() {
      method_16431(class_3542::method_16429);
      class_1920.method_8875();
   }

   @Deprecated
   public static void method_16458() {
      method_16431(class_3542::method_16429);
      class_1920.method_8801();
   }

   @Deprecated
   public static void method_16374() {
      method_16431(class_3542::method_16429);
      class_1920.method_8741();
   }

   @Deprecated
   public static void method_16442(int var0, float var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8785(var0, var1);
   }

   @Deprecated
   public static void method_16389() {
      method_16431(class_3542::method_16429);
      class_1920.method_8927();
   }

   @Deprecated
   public static void method_16487() {
      method_16431(class_3542::method_16429);
      class_1920.method_8912();
   }

   @Deprecated
   public static void method_16481() {
      method_16431(class_3542::method_16429);
      class_1920.method_8819();
   }

   @Deprecated
   public static void method_16435() {
      method_16431(class_3542::method_16429);
      class_1920.method_8798();
   }

   @Deprecated
   public static void method_16368(int var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8811(var0, var1);
   }

   @Deprecated
   public static void method_16465(float var0, float var1, float var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8820(var0, var1, var2);
   }

   public static void method_16491() {
      method_16431(class_3542::method_16429);
      class_1920.method_8786();
   }

   public static void method_16428() {
      method_16431(class_3542::method_16363);
      class_1920.method_8745();
   }

   public static void method_16452(int var0, int var1, int var2, int var3) {
      method_16431(class_3542::method_16363);
      class_1920.method_8767();
      class_1920.method_8850(var0, var1, var2, var3);
   }

   public static void method_16372() {
      method_16431(class_3542::method_16363);
      class_1920.method_8929();
   }

   public static void method_16457(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8862(var0);
   }

   public static void method_16387(boolean var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8867(var0);
   }

   public static void method_16488() {
      method_16431(class_3542::method_16429);
      class_1920.method_8829();
   }

   public static void method_16448() {
      method_16431(class_3542::method_16429);
      class_1920.method_8775();
   }

   public static void method_16398(class_5033 var0, class_8535 var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8787(var0.field_26044, var1.field_43689);
   }

   public static void method_16397(int var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8787(var0, var1);
   }

   public static void method_16425(class_5033 var0, class_8535 var1, class_5033 var2, class_8535 var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8816(var0.field_26044, var1.field_43689, var2.field_26044, var3.field_43689);
   }

   public static void method_16424(int var0, int var1, int var2, int var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8816(var0, var1, var2, var3);
   }

   public static void method_16401(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8896(var0);
   }

   public static void method_16447(float var0, float var1, float var2, float var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8868(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_16353() {
      method_16431(class_3542::method_16429);
      class_1920.method_8907();
   }

   @Deprecated
   public static void method_16367() {
      method_16431(class_3542::method_16429);
      class_1920.method_8804();
   }

   @Deprecated
   public static void method_16365(class_5084 var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8892(var0.field_26253);
   }

   @Deprecated
   public static void method_16364(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8892(var0);
   }

   @Deprecated
   public static void method_16460(float var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8784(var0);
   }

   @Deprecated
   public static void method_16419(float var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8851(var0);
   }

   @Deprecated
   public static void method_16470(float var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8749(var0);
   }

   @Deprecated
   public static void method_16434(int var0, float var1, float var2, float var3, float var4) {
      method_16431(class_3542::method_16429);
      class_1920.method_8919(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void method_16467(int var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8768(var0, var1);
   }

   public static void method_16361() {
      method_16431(class_3542::method_16429);
      class_1920.method_8903();
   }

   public static void method_16393() {
      method_16431(class_3542::method_16429);
      class_1920.method_8765();
   }

   public static void method_16441(int var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8818(var0, var1);
   }

   public static void method_16464() {
      method_16431(class_3542::method_16429);
      class_1920.method_8792();
   }

   public static void method_16382() {
      method_16431(class_3542::method_16429);
      class_1920.method_8861();
   }

   public static void method_16380() {
      method_16431(class_3542::method_16429);
      class_1920.method_8863();
   }

   public static void method_16371() {
      method_16431(class_3542::method_16429);
      class_1920.method_8894();
   }

   public static void method_16475(float var0, float var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8924(var0, var1);
   }

   public static void method_16466() {
      method_16431(class_3542::method_16429);
      class_1920.method_8790();
   }

   public static void method_16409() {
      method_16431(class_3542::method_16429);
      class_1920.method_8813();
   }

   public static void method_16407(class_2603 var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8769(var0.field_12865);
   }

   public static void method_16492(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8899(var0);
   }

   public static void method_16432() {
      method_16431(class_3542::method_16429);
      class_1920.method_8843();
   }

   public static void method_16354() {
      method_16431(class_3542::method_16429);
      class_1920.method_8848();
   }

   public static void method_16490(int var0, int var1, int var2) {
      class_1920.method_8879(var0, var1, var2);
   }

   public static void method_16362(int var0) {
      method_16431(class_3542::method_16363);
      class_1920.method_8904(var0);
   }

   public static void method_16446(int var0) {
      class_1920.method_8791(var0);
   }

   @Deprecated
   public static void method_16486(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8932(var0);
   }

   @Deprecated
   public static void method_16381() {
      method_16431(class_3542::method_16429);
      class_1920.method_8908();
   }

   @Deprecated
   public static void method_16443() {
      method_16431(class_3542::method_16429);
      class_1920.method_8778();
   }

   public static void method_16392(int var0, int var1, int var2, int var3) {
      method_16431(class_3542::method_16363);
      class_1920.method_8930(var0, var1, var2, var3);
   }

   public static void method_16405(boolean var0, boolean var1, boolean var2, boolean var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8895(var0, var1, var2, var3);
   }

   public static void method_16388(int var0, int var1, int var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8773(var0, var1, var2);
   }

   public static void method_16453(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8821(var0);
   }

   public static void method_16386(int var0, int var1, int var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8914(var0, var1, var2);
   }

   public static void method_16377(double var0) {
      method_16431(class_3542::method_16363);
      class_1920.method_8913(var0);
   }

   public static void method_16391(float var0, float var1, float var2, float var3) {
      method_16431(class_3542::method_16363);
      class_1920.method_8880(var0, var1, var2, var3);
   }

   public static void method_16455(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8839(var0);
   }

   public static void method_16402(int var0, boolean var1) {
      method_16431(class_3542::method_16363);
      class_1920.method_8794(var0, var1);
   }

   @Deprecated
   public static void method_16463(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8842(var0);
   }

   @Deprecated
   public static void method_16476() {
      method_16431(class_3542::method_16429);
      class_1920.method_8865();
   }

   @Deprecated
   public static void method_16438() {
      method_16431(class_3542::method_16429);
      class_1920.method_8757();
   }

   @Deprecated
   public static void method_16489() {
      method_16431(class_3542::method_16429);
      class_1920.method_8761();
   }

   @Deprecated
   public static void method_16376(double var0, double var2, double var4, double var6, double var8, double var10) {
      method_16431(class_3542::method_16429);
      class_1920.method_8781(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method_16410(float var0, float var1, float var2, float var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8824(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_16403(float var0, float var1, float var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8854(var0, var1, var2);
   }

   @Deprecated
   public static void method_16356(double var0, double var2, double var4) {
      method_16431(class_3542::method_16429);
      class_1920.method_8771(var0, var2, var4);
   }

   @Deprecated
   public static void method_16413(float var0, float var1, float var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8897(var0, var1, var2);
   }

   @Deprecated
   public static void method_16483(double var0, double var2, double var4) {
      method_16431(class_3542::method_16429);
      class_1920.method_8876(var0, var2, var4);
   }

   @Deprecated
   public static void method_16358(class_8107 var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8838(var0);
   }

   @Deprecated
   public static void method_16480(float var0, float var1, float var2, float var3) {
      method_16431(class_3542::method_16429);
      class_1920.method_8789(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method_16404(float var0, float var1, float var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8789(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void method_16473() {
      method_16431(class_3542::method_16429);
      class_1920.method_8836();
   }

   public static void method_16400(int var0, int var1, int var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8812(var0, var1, var2);
   }

   public static void method_16484(float var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8823(var0);
   }

   public static void method_16360(int var0, int var1) {
      method_16431(class_3542::method_16363);
      class_1920.method_8763(var0, var1);
   }

   public static void method_16450(int var0, float var1) {
      class_1920.method_8755(var0, var1);
   }

   public static void method_16471(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      method_16431(class_3542::method_16429);
      class_1920.method_8898(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void method_16411(int var0, Consumer<String> var1) {
      method_16431(class_3542::method_16429);
      var1.accept(class_1920.method_8928(var0));
   }

   public static String method_16385() {
      method_16431(class_3542::method_16395);
      return String.format("LWJGL version %s", class_3776.method_17478());
   }

   public static String method_16461() {
      method_16431(class_3542::method_16395);
      return class_3776.method_17479();
   }

   public static LongSupplier method_16454() {
      method_16431(class_3542::method_16395);
      return class_3776.method_17488();
   }

   public static void method_16478(int var0, boolean var1) {
      method_16431(class_3542::method_16395);
      class_3776.method_17494(var0, var1);
   }

   public static void method_16416(GLFWErrorCallbackI var0) {
      method_16431(class_3542::method_16395);
      class_3776.method_17489(var0);
   }

   public static void method_16412(int var0) {
      method_16431(class_3542::method_16429);
      class_3776.method_17480(var0, true, true, true);
   }

   public static void method_16396() {
      method_16431(class_3542::method_16429);
      class_3776.method_17490();
   }

   @Deprecated
   public static void method_16420(int var0, float var1, float var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8796(var0, var1, var2);
   }

   public static String method_16369() {
      method_16431(class_3542::method_16429);
      return class_3776.method_17481();
   }

   public static void method_16406(int var0, int var1, int var2, int var3) {
      method_16431(class_3542::method_16395);
      class_1920.method_8843();
      class_1920.method_8932(7425);
      class_1920.method_8913(1.0);
      class_1920.method_8745();
      class_1920.method_8862(515);
      class_1920.method_8741();
      class_1920.method_8785(516, 0.1F);
      class_1920.method_8842(5889);
      class_1920.method_8865();
      class_1920.method_8842(5888);
      class_1920.method_8930(var0, var1, var2, var3);
   }

   public static int method_16477() {
      method_16431(class_3542::method_16395);
      if (field_17327 == -1) {
         int var2 = class_1920.method_8860(3379);

         for (int var3 = Math.max(32768, var2); var3 >= 1024; var3 >>= 1) {
            class_1920.method_8886(32868, 0, 6408, var3, var3, 0, 6408, 5121, (IntBuffer)null);
            int var4 = class_1920.method_8911(32868, 0, 4096);
            if (var4 != 0) {
               field_17327 = var3;
               return var3;
            }
         }

         field_17327 = Math.max(var2, 1024);
         field_17323.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", field_17327);
      }

      return field_17327;
   }

   public static void method_16418(int var0, Supplier<Integer> var1) {
      class_1920.method_8760(var0, (Integer)var1.get());
   }

   public static void method_16417(int var0, ByteBuffer var1, int var2) {
      method_16431(class_3542::method_16440);
      class_1920.method_8803(var0, var1, var2);
   }

   public static void method_16462(int var0) {
      method_16431(class_3542::method_16429);
      class_1920.method_8825(var0);
   }

   public static void method_16414(int var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8752(var0, var1);
   }

   public static void method_16379(int var0, IntBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8753(var0, var1);
   }

   public static void method_16427(int var0, IntBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8901(var0, var1);
   }

   public static void method_16384(int var0, IntBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8774(var0, var1);
   }

   public static void method_16469(int var0, IntBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8852(var0, var1);
   }

   public static void method_16378(int var0, FloatBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8915(var0, var1);
   }

   public static void method_16426(int var0, FloatBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8799(var0, var1);
   }

   public static void method_16383(int var0, FloatBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8743(var0, var1);
   }

   public static void method_16468(int var0, FloatBuffer var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8882(var0, var1);
   }

   public static void method_16423(int var0, boolean var1, FloatBuffer var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8834(var0, var1, var2);
   }

   public static void method_16394(int var0, boolean var1, FloatBuffer var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8770(var0, var1, var2);
   }

   public static void method_16375(int var0, boolean var1, FloatBuffer var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8740(var0, var1, var2);
   }

   public static void method_16472() {
      method_16431(class_3542::method_16429);
      class_1920.method_8849();
   }

   public static void method_16485() {
      method_16431(class_3542::method_16429);
      class_1920.method_8814();
   }

   public static void method_16459(IntSupplier var0, int var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8805(var0.getAsInt(), var1);
   }

   public static void method_16439() {
      method_16431(class_3542::method_16429);
      class_1920.method_8764();
   }

   public static void method_16359(class_2426 var0, class_2426 var1, class_8107 var2) {
      method_16431(class_3542::method_16429);
      class_1920.method_8783(var0, var1, var2);
   }

   public static void method_16436(class_2426 var0, class_2426 var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8921(var0, var1);
   }

   public static void method_16357(class_2426 var0, class_2426 var1) {
      method_16431(class_3542::method_16429);
      class_1920.method_8806(var0, var1);
   }

   public static void method_16408() {
      method_16431(class_3542::method_16429);
      class_1920.method_8873();
   }

   public static void method_16445() {
      method_16431(class_3542::method_16429);
      class_1920.method_8736();
   }

   public static void method_16479() {
      method_16431(class_3542::method_16429);
      class_1920.method_8909();
   }

   public static void method_16456() {
      field_17331 = true;
   }

   public static void method_16421() {
      field_17331 = false;
      if (!field_17329.isEmpty()) {
         method_16482();
      }

      if (!field_17329.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   public static void method_16355(Consumer<Integer> var0) {
      if (method_16366()) {
         var0.accept(class_1920.method_8817());
      } else {
         method_16474(() -> var0.accept(class_1920.method_8817()));
      }
   }

   public static class_8042 method_16373() {
      method_16431(class_3542::method_16366);
      return field_17322;
   }

   public static void method_16437() {
      method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
   }

   public static void method_16433() {
      method_16442(516, 0.1F);
   }

   @Deprecated
   public static void method_16430(Runnable var0) {
      boolean var3 = MinecraftClient.method_8497();
      if (var3) {
         GameOptions var4 = MinecraftClient.getInstance().gameOptions;
         class_4615 var5 = var4.field_45397;
         var4.field_45397 = class_4615.field_22437;
         var0.run();
         var4.field_45397 = var5;
      } else {
         var0.run();
      }
   }
}

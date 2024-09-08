package mapped;

import com.google.common.collect.Queues;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;

public class RenderSystem {
   private static final Logger field34654 = LogManager.getLogger();
   private static final ConcurrentLinkedQueue<Class4504> field34655 = Queues.newConcurrentLinkedQueue();
   private static final Tessellator field34656 = new Tessellator();
   public static final float field34657 = 0.1F;
   private static final int field34658 = 1024;
   private static boolean field34659;
   private static Thread field34660;
   private static Thread field34661;
   private static int field34662 = -1;
   private static boolean field34663;
   private static double field34664 = Double.MIN_VALUE;

   public static void method27802() {
      if (field34661 == null && field34660 != Thread.currentThread()) {
         field34661 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize render thread");
      }
   }

   public static boolean isOnRenderThread() {
      return Thread.currentThread() == field34661;
   }

   public static boolean method27804() {
      return field34663 || isOnRenderThread();
   }

   public static void method27805(boolean var0) {
      boolean var3 = field34661 == Thread.currentThread();
      if (field34660 == null && field34661 != null && var3 != var0) {
         field34660 = Thread.currentThread();
      } else {
         throw new IllegalStateException("Could not initialize tick thread");
      }
   }

   public static boolean method27806() {
      return true;
   }

   public static boolean method27807() {
      return field34663 || method27806();
   }

   public static void assertThread(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean isInInitPhase() {
      return true;
   }

   public static void method27810(Class4504 var0) {
      field34655.add(var0);
   }

   public static void flipFrame(long var0) {
      GLFW.glfwPollEvents();
      method27812();
      Tessellator.getInstance().getBuffer().method17071();
      GLFW.glfwSwapBuffers(var0);
      GLFW.glfwPollEvents();
   }

   public static void method27812() {
      field34659 = true;

      while (!field34655.isEmpty()) {
         Class4504 var2 = field34655.poll();
         var2.method14222();
      }

      field34659 = false;
   }

   public static void limitDisplayFPS(int var0) {
      double var3 = field34664 + 1.0 / (double)var0;

      double var5;
      for (var5 = GLFW.glfwGetTime(); var5 < var3; var5 = GLFW.glfwGetTime()) {
         GLFW.glfwWaitEventsTimeout(var3 - var5);
      }

      field34664 = var5;
   }

   @Deprecated
   public static void method27814() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23692();
   }

   @Deprecated
   public static void method27815() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23693();
   }

   @Deprecated
   public static void method27816() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23694();
   }

   @Deprecated
   public static void method27817() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23695();
   }

   @Deprecated
   public static void disableAlphaTest() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23696();
   }

   @Deprecated
   public static void method27819(int var0, float var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23697(var0, var1);
   }

   @Deprecated
   public static void method27820() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23698();
   }

   @Deprecated
   public static void method27821() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23699();
   }

   @Deprecated
   public static void method27822() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23701();
   }

   @Deprecated
   public static void method27823() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23702();
   }

   @Deprecated
   public static void method27824(int var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23703(var0, var1);
   }

   @Deprecated
   public static void method27825(float var0, float var1, float var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23706(var0, var1, var2);
   }

   public static void disableDepthTest() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23710();
   }

   public static void enableDepthTest() {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23711();
   }

   public static void enableScissor(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23708();
      GlStateManager.method23709(var0, var1, var2, var3);
   }

   public static void disableScissor() {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23707();
   }

   public static void depthFunc(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23712(var0);
   }

   public static void depthMask(boolean var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23713(var0);
   }

   public static void enableBlend() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23715();
   }

   public static void disableBlend() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23714();
   }

   public static void method27834(GlStateManager.SourceFactor var0, DestFactor var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23716(var0.field16001, var1.field12937);
   }

   public static void method27835(int var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23716(var0, var1);
   }

   public static void blendFuncSeparate(GlStateManager.SourceFactor var0, DestFactor var1, GlStateManager.SourceFactor var2, DestFactor var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23717(var0.field16001, var1.field12937, var2.field16001, var3.field12937);
   }

   public static void method27837(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23717(var0, var1, var2, var3);
   }

   public static void method27838(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23719(var0);
   }

   public static void method27839(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23718(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27840() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23779();
   }

   @Deprecated
   public static void method27841() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23780();
   }

   @Deprecated
   public static void method27842(Class2135 var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23781(var0.field13987);
   }

   @Deprecated
   public static void method27843(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23781(var0);
   }

   @Deprecated
   public static void method27844(float var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23782(var0);
   }

   @Deprecated
   public static void method27845(float var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23783(var0);
   }

   @Deprecated
   public static void method27846(float var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23784(var0);
   }

   @Deprecated
   public static void method27847(int var0, float var1, float var2, float var3, float var4) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23785(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void method27848(int var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23786(var0, var1);
   }

   public static void enableCull() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23787();
   }

   public static void method27850() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23788();
   }

   public static void method27851(int var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23789(var0, var1);
   }

   public static void method27852() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23790();
   }

   public static void method27853() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23791();
   }

   public static void method27854() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23792();
   }

   public static void method27855() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23793();
   }

   public static void method27856(float var0, float var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23794(var0, var1);
   }

   public static void method27857() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23795();
   }

   public static void method27858() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23796();
   }

   public static void method27859(Class2270 var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23797(var0.field14772);
   }

   public static void method27860(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23803(var0);
   }

   public static void enableTexture() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23804();
   }

   public static void disableTexture() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23805();
   }

   public static void method27863(int var0, int var1, int var2) {
      GlStateManager.method23808(var0, var1, var2);
   }

   public static void method27864(int var0) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23812(var0);
   }

   public static void method27865(int var0) {
      GlStateManager.method23814(var0);
   }

   @Deprecated
   public static void method27866(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23818(var0);
   }

   @Deprecated
   public static void method27867() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23819();
   }

   @Deprecated
   public static void method27868() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23820();
   }

   public static void method27869(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23821(var0, var1, var2, var3);
   }

   public static void method27870(boolean var0, boolean var1, boolean var2, boolean var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23822(var0, var1, var2, var3);
   }

   public static void method27871(int var0, int var1, int var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23823(var0, var1, var2);
   }

   public static void method27872(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23824(var0);
   }

   public static void method27873(int var0, int var1, int var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23825(var0, var1, var2);
   }

   public static void method27874(double var0) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23826(var0);
   }

   public static void method27875(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23827(var0, var1, var2, var3);
   }

   public static void method27876(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23828(var0);
   }

   public static void clear(int var0, boolean var1) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23829(var0, var1);
   }

   @Deprecated
   public static void matrixMode(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23830(var0);
   }

   @Deprecated
   public static void loadIdentity() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23831();
   }

   @Deprecated
   public static void pushMatrix() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23832();
   }

   @Deprecated
   public static void popMatrix() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23833();
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23835(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method27883(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23836(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23837(var0, var1, var2);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23838(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23839(var0, var1, var2);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23840(var0, var2, var4);
   }

   @Deprecated
   public static void method27888(Matrix4f var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23842(var0);
   }

   @Deprecated
   public static void color4f(float var0, float var1, float var2, float var3) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23843(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27890(float var0, float var1, float var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23843(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void method27891() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23844();
   }

   public static void method27892(int var0, int var1, int var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23854(var0, var1, var2);
   }

   public static void lineWidth(float var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23855(var0);
   }

   public static void method27894(int var0, int var1) {
      assertThread(RenderSystem::method27807);
      GlStateManager.method23856(var0, var1);
   }

   public static void method27895(int var0, float var1) {
      GlStateManager.method23857(var0, var1);
   }

   public static void method27896(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23858(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void method27897(int var0, Consumer<String> var1) {
      assertThread(RenderSystem::method27806);
      var1.accept(GlStateManager.method23860(var0));
   }

   public static String getBackendDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return String.format("LWJGL version %s", Class8157.method28297());
   }

   public static String getApiDescription() {
      assertThread(RenderSystem::isInInitPhase);
      return Class8157.method28295();
   }

   public static LongSupplier initBackendSystem() {
      assertThread(RenderSystem::isInInitPhase);
      return Class8157.method28298();
   }

   public static void initRenderer(int var0, boolean var1) {
      assertThread(RenderSystem::isInInitPhase);
      Class8157.method28302(var0, var1);
   }

   public static void setErrorCallback(GLFWErrorCallbackI var0) {
      assertThread(RenderSystem::isInInitPhase);
      Class8157.method28299(var0);
   }

   public static void method27903(int var0) {
      assertThread(RenderSystem::method27806);
      Class8157.method28305(var0, true, true, true);
   }

   public static void method27904() {
      assertThread(RenderSystem::method27806);
      Class8157.method28301();
   }

   @Deprecated
   public static void method27905(int var0, float var1, float var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23761(var0, var1, var2);
   }

   public static String getCapsString() {
      assertThread(RenderSystem::method27806);
      return Class8157.method28303();
   }

   public static void setupDefaultState(int var0, int var1, int var2, int var3) {
      assertThread(RenderSystem::isInInitPhase);
      GlStateManager.method23804();
      GlStateManager.method23818(7425);
      GlStateManager.method23826(1.0);
      GlStateManager.method23711();
      GlStateManager.method23712(515);
      GlStateManager.method23696();
      GlStateManager.method23697(516, 0.1F);
      GlStateManager.method23830(5889);
      GlStateManager.method23831();
      GlStateManager.method23830(5888);
      GlStateManager.method23821(var0, var1, var2, var3);
   }

   public static int method27908() {
      assertThread(RenderSystem::isInInitPhase);
      if (field34662 == -1) {
         int var2 = GlStateManager.method23861(3379);

         for (int var3 = Math.max(32768, var2); var3 >= 1024; var3 >>= 1) {
            GlStateManager.method23815(32868, 0, 6408, var3, var3, 0, 6408, 5121, (IntBuffer)null);
            int var4 = GlStateManager.method23809(32868, 0, 4096);
            if (var4 != 0) {
               field34662 = var3;
               return var3;
            }
         }

         field34662 = Math.max(var2, 1024);
         field34654.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", field34662);
      }

      return field34662;
   }

   public static void method27909(int var0, Supplier<Integer> var1) {
      GlStateManager.method23747(var0, (Integer)var1.get());
   }

   public static void method27910(int var0, ByteBuffer var1, int var2) {
      assertThread(RenderSystem::method27804);
      GlStateManager.method23748(var0, var1, var2);
   }

   public static void method27911(int var0) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23749(var0);
   }

   public static void method27912(int var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23734(var0, var1);
   }

   public static void method27913(int var0, IntBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23733(var0, var1);
   }

   public static void method27914(int var0, IntBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23736(var0, var1);
   }

   public static void method27915(int var0, IntBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23738(var0, var1);
   }

   public static void method27916(int var0, IntBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23740(var0, var1);
   }

   public static void method27917(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23735(var0, var1);
   }

   public static void method27918(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23737(var0, var1);
   }

   public static void method27919(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23739(var0, var1);
   }

   public static void method27920(int var0, FloatBuffer var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23741(var0, var1);
   }

   public static void method27921(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23742(var0, var1, var2);
   }

   public static void method27922(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23743(var0, var1, var2);
   }

   public static void method27923(int var0, boolean var1, FloatBuffer var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23744(var0, var1, var2);
   }

   public static void method27924() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23765();
   }

   public static void method27925() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23766();
   }

   public static void method27926(IntSupplier var0, int var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23767(var0.getAsInt(), var1);
   }

   public static void method27927() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23768();
   }

   public static void method27928(Vector3f var0, Vector3f var1, Matrix4f var2) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23772(var0, var1, var2);
   }

   public static void method27929(Vector3f var0, Vector3f var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23773(var0, var1);
   }

   public static void method27930(Vector3f var0, Vector3f var1) {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23774(var0, var1);
   }

   public static void method27931() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23778();
   }

   public static void method27932() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23776();
   }

   public static void method27933() {
      assertThread(RenderSystem::method27806);
      GlStateManager.method23777();
   }

   public static void method27934() {
      field34663 = true;
   }

   public static void method27935() {
      field34663 = false;
      if (!field34655.isEmpty()) {
         method27812();
      }

      if (!field34655.isEmpty()) {
         throw new IllegalStateException("Recorded to render queue during initialization");
      }
   }

   public static void method27936(Consumer<Integer> var0) {
      if (isOnRenderThread()) {
         var0.accept(GlStateManager.method23746());
      } else {
         method27810(() -> var0.accept(GlStateManager.method23746()));
      }
   }

   public static Tessellator method27937() {
      assertThread(RenderSystem::isOnRenderThread);
      return field34656;
   }

   public static void defaultBlendFunc() {
      blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12936);
   }

   public static void method27939() {
      method27819(516, 0.1F);
   }

   @Deprecated
   public static void runAsFancy(Runnable var0) {
      boolean var3 = Minecraft.isFabulousGraphicsEnabled();
      if (var3) {
         GameSettings var4 = Minecraft.getInstance().gameSettings;
         GraphicsFanciness var5 = var4.graphicFanciness;
         var4.graphicFanciness = GraphicsFanciness.FANCY;
         var0.run();
         var4.graphicFanciness = var5;
      } else {
         var0.run();
      }
   }
}

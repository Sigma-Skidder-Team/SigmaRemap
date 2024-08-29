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

   public static boolean method27803() {
      return Thread.currentThread() == field34661;
   }

   public static boolean method27804() {
      return field34663 || method27803();
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

   public static void method27808(Supplier<Boolean> var0) {
      if (!(Boolean)var0.get()) {
         throw new IllegalStateException("Rendersystem called from wrong thread");
      }
   }

   public static boolean method27809() {
      return true;
   }

   public static void method27810(Class4504 var0) {
      field34655.add(var0);
   }

   public static void method27811(long var0) {
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
      method27808(RenderSystem::method27806);
      Class7414.method23692();
   }

   @Deprecated
   public static void method27815() {
      method27808(RenderSystem::method27806);
      Class7414.method23693();
   }

   @Deprecated
   public static void method27816() {
      method27808(RenderSystem::method27806);
      Class7414.method23694();
   }

   @Deprecated
   public static void method27817() {
      method27808(RenderSystem::method27806);
      Class7414.method23695();
   }

   @Deprecated
   public static void disableAlphaTest() {
      method27808(RenderSystem::method27806);
      Class7414.method23696();
   }

   @Deprecated
   public static void method27819(int var0, float var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23697(var0, var1);
   }

   @Deprecated
   public static void method27820() {
      method27808(RenderSystem::method27806);
      Class7414.method23698();
   }

   @Deprecated
   public static void method27821() {
      method27808(RenderSystem::method27806);
      Class7414.method23699();
   }

   @Deprecated
   public static void method27822() {
      method27808(RenderSystem::method27806);
      Class7414.method23701();
   }

   @Deprecated
   public static void method27823() {
      method27808(RenderSystem::method27806);
      Class7414.method23702();
   }

   @Deprecated
   public static void method27824(int var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23703(var0, var1);
   }

   @Deprecated
   public static void method27825(float var0, float var1, float var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23706(var0, var1, var2);
   }

   public static void disableDepthTest() {
      method27808(RenderSystem::method27806);
      Class7414.method23710();
   }

   public static void enableDepthTest() {
      method27808(RenderSystem::method27807);
      Class7414.method23711();
   }

   public static void enableScissor(int var0, int var1, int var2, int var3) {
      method27808(RenderSystem::method27807);
      Class7414.method23708();
      Class7414.method23709(var0, var1, var2, var3);
   }

   public static void disableScissor() {
      method27808(RenderSystem::method27807);
      Class7414.method23707();
   }

   public static void depthFunc(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23712(var0);
   }

   public static void depthMask(boolean var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23713(var0);
   }

   public static void enableBlend() {
      method27808(RenderSystem::method27806);
      Class7414.method23715();
   }

   public static void disableBlend() {
      method27808(RenderSystem::method27806);
      Class7414.method23714();
   }

   public static void method27834(Class2339 var0, Class1981 var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23716(var0.field16001, var1.field12937);
   }

   public static void method27835(int var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23716(var0, var1);
   }

   public static void method27836(Class2339 var0, Class1981 var1, Class2339 var2, Class1981 var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23717(var0.field16001, var1.field12937, var2.field16001, var3.field12937);
   }

   public static void method27837(int var0, int var1, int var2, int var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23717(var0, var1, var2, var3);
   }

   public static void method27838(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23719(var0);
   }

   public static void method27839(float var0, float var1, float var2, float var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23718(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27840() {
      method27808(RenderSystem::method27806);
      Class7414.method23779();
   }

   @Deprecated
   public static void method27841() {
      method27808(RenderSystem::method27806);
      Class7414.method23780();
   }

   @Deprecated
   public static void method27842(Class2135 var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23781(var0.field13987);
   }

   @Deprecated
   public static void method27843(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23781(var0);
   }

   @Deprecated
   public static void method27844(float var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23782(var0);
   }

   @Deprecated
   public static void method27845(float var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23783(var0);
   }

   @Deprecated
   public static void method27846(float var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23784(var0);
   }

   @Deprecated
   public static void method27847(int var0, float var1, float var2, float var3, float var4) {
      method27808(RenderSystem::method27806);
      Class7414.method23785(var0, new float[]{var1, var2, var3, var4});
   }

   @Deprecated
   public static void method27848(int var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23786(var0, var1);
   }

   public static void enableCull() {
      method27808(RenderSystem::method27806);
      Class7414.method23787();
   }

   public static void method27850() {
      method27808(RenderSystem::method27806);
      Class7414.method23788();
   }

   public static void method27851(int var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23789(var0, var1);
   }

   public static void method27852() {
      method27808(RenderSystem::method27806);
      Class7414.method23790();
   }

   public static void method27853() {
      method27808(RenderSystem::method27806);
      Class7414.method23791();
   }

   public static void method27854() {
      method27808(RenderSystem::method27806);
      Class7414.method23792();
   }

   public static void method27855() {
      method27808(RenderSystem::method27806);
      Class7414.method23793();
   }

   public static void method27856(float var0, float var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23794(var0, var1);
   }

   public static void method27857() {
      method27808(RenderSystem::method27806);
      Class7414.method23795();
   }

   public static void method27858() {
      method27808(RenderSystem::method27806);
      Class7414.method23796();
   }

   public static void method27859(Class2270 var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23797(var0.field14772);
   }

   public static void method27860(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23803(var0);
   }

   public static void enableTexture() {
      method27808(RenderSystem::method27806);
      Class7414.method23804();
   }

   public static void disableTexture() {
      method27808(RenderSystem::method27806);
      Class7414.method23805();
   }

   public static void method27863(int var0, int var1, int var2) {
      Class7414.method23808(var0, var1, var2);
   }

   public static void method27864(int var0) {
      method27808(RenderSystem::method27807);
      Class7414.method23812(var0);
   }

   public static void method27865(int var0) {
      Class7414.method23814(var0);
   }

   @Deprecated
   public static void method27866(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23818(var0);
   }

   @Deprecated
   public static void method27867() {
      method27808(RenderSystem::method27806);
      Class7414.method23819();
   }

   @Deprecated
   public static void method27868() {
      method27808(RenderSystem::method27806);
      Class7414.method23820();
   }

   public static void method27869(int var0, int var1, int var2, int var3) {
      method27808(RenderSystem::method27807);
      Class7414.method23821(var0, var1, var2, var3);
   }

   public static void method27870(boolean var0, boolean var1, boolean var2, boolean var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23822(var0, var1, var2, var3);
   }

   public static void method27871(int var0, int var1, int var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23823(var0, var1, var2);
   }

   public static void method27872(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23824(var0);
   }

   public static void method27873(int var0, int var1, int var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23825(var0, var1, var2);
   }

   public static void method27874(double var0) {
      method27808(RenderSystem::method27807);
      Class7414.method23826(var0);
   }

   public static void method27875(float var0, float var1, float var2, float var3) {
      method27808(RenderSystem::method27807);
      Class7414.method23827(var0, var1, var2, var3);
   }

   public static void method27876(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23828(var0);
   }

   public static void clear(int var0, boolean var1) {
      method27808(RenderSystem::method27807);
      Class7414.method23829(var0, var1);
   }

   @Deprecated
   public static void matrixMode(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23830(var0);
   }

   @Deprecated
   public static void loadIdentity() {
      method27808(RenderSystem::method27806);
      Class7414.method23831();
   }

   @Deprecated
   public static void pushMatrix() {
      method27808(RenderSystem::method27806);
      Class7414.method23832();
   }

   @Deprecated
   public static void popMatrix() {
      method27808(RenderSystem::method27806);
      Class7414.method23833();
   }

   @Deprecated
   public static void ortho(double var0, double var2, double var4, double var6, double var8, double var10) {
      method27808(RenderSystem::method27806);
      Class7414.method23835(var0, var2, var4, var6, var8, var10);
   }

   @Deprecated
   public static void method27883(float var0, float var1, float var2, float var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23836(var0, var1, var2, var3);
   }

   @Deprecated
   public static void scalef(float var0, float var1, float var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23837(var0, var1, var2);
   }

   @Deprecated
   public static void scaled(double var0, double var2, double var4) {
      method27808(RenderSystem::method27806);
      Class7414.method23838(var0, var2, var4);
   }

   @Deprecated
   public static void translatef(float var0, float var1, float var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23839(var0, var1, var2);
   }

   @Deprecated
   public static void translated(double var0, double var2, double var4) {
      method27808(RenderSystem::method27806);
      Class7414.method23840(var0, var2, var4);
   }

   @Deprecated
   public static void method27888(Class9367 var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23842(var0);
   }

   @Deprecated
   public static void method27889(float var0, float var1, float var2, float var3) {
      method27808(RenderSystem::method27806);
      Class7414.method23843(var0, var1, var2, var3);
   }

   @Deprecated
   public static void method27890(float var0, float var1, float var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23843(var0, var1, var2, 1.0F);
   }

   @Deprecated
   public static void method27891() {
      method27808(RenderSystem::method27806);
      Class7414.method23844();
   }

   public static void method27892(int var0, int var1, int var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23854(var0, var1, var2);
   }

   public static void lineWidth(float var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23855(var0);
   }

   public static void method27894(int var0, int var1) {
      method27808(RenderSystem::method27807);
      Class7414.method23856(var0, var1);
   }

   public static void method27895(int var0, float var1) {
      Class7414.method23857(var0, var1);
   }

   public static void method27896(int var0, int var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      method27808(RenderSystem::method27806);
      Class7414.method23858(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void method27897(int var0, Consumer<String> var1) {
      method27808(RenderSystem::method27806);
      var1.accept(Class7414.method23860(var0));
   }

   public static String getBackendDescription() {
      method27808(RenderSystem::method27809);
      return String.format("LWJGL version %s", Class8157.method28297());
   }

   public static String getApiDescription() {
      method27808(RenderSystem::method27809);
      return Class8157.method28295();
   }

   public static LongSupplier initBackendSystem() {
      method27808(RenderSystem::method27809);
      return Class8157.method28298();
   }

   public static void initRenderer(int var0, boolean var1) {
      method27808(RenderSystem::method27809);
      Class8157.method28302(var0, var1);
   }

   public static void setErrorCallback(GLFWErrorCallbackI var0) {
      method27808(RenderSystem::method27809);
      Class8157.method28299(var0);
   }

   public static void method27903(int var0) {
      method27808(RenderSystem::method27806);
      Class8157.method28305(var0, true, true, true);
   }

   public static void method27904() {
      method27808(RenderSystem::method27806);
      Class8157.method28301();
   }

   @Deprecated
   public static void method27905(int var0, float var1, float var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23761(var0, var1, var2);
   }

   public static String getCapsString() {
      method27808(RenderSystem::method27806);
      return Class8157.method28303();
   }

   public static void setupDefaultState(int var0, int var1, int var2, int var3) {
      method27808(RenderSystem::method27809);
      Class7414.method23804();
      Class7414.method23818(7425);
      Class7414.method23826(1.0);
      Class7414.method23711();
      Class7414.method23712(515);
      Class7414.method23696();
      Class7414.method23697(516, 0.1F);
      Class7414.method23830(5889);
      Class7414.method23831();
      Class7414.method23830(5888);
      Class7414.method23821(var0, var1, var2, var3);
   }

   public static int method27908() {
      method27808(RenderSystem::method27809);
      if (field34662 == -1) {
         int var2 = Class7414.method23861(3379);

         for (int var3 = Math.max(32768, var2); var3 >= 1024; var3 >>= 1) {
            Class7414.method23815(32868, 0, 6408, var3, var3, 0, 6408, 5121, (IntBuffer)null);
            int var4 = Class7414.method23809(32868, 0, 4096);
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
      Class7414.method23747(var0, (Integer)var1.get());
   }

   public static void method27910(int var0, ByteBuffer var1, int var2) {
      method27808(RenderSystem::method27804);
      Class7414.method23748(var0, var1, var2);
   }

   public static void method27911(int var0) {
      method27808(RenderSystem::method27806);
      Class7414.method23749(var0);
   }

   public static void method27912(int var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23734(var0, var1);
   }

   public static void method27913(int var0, IntBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23733(var0, var1);
   }

   public static void method27914(int var0, IntBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23736(var0, var1);
   }

   public static void method27915(int var0, IntBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23738(var0, var1);
   }

   public static void method27916(int var0, IntBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23740(var0, var1);
   }

   public static void method27917(int var0, FloatBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23735(var0, var1);
   }

   public static void method27918(int var0, FloatBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23737(var0, var1);
   }

   public static void method27919(int var0, FloatBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23739(var0, var1);
   }

   public static void method27920(int var0, FloatBuffer var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23741(var0, var1);
   }

   public static void method27921(int var0, boolean var1, FloatBuffer var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23742(var0, var1, var2);
   }

   public static void method27922(int var0, boolean var1, FloatBuffer var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23743(var0, var1, var2);
   }

   public static void method27923(int var0, boolean var1, FloatBuffer var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23744(var0, var1, var2);
   }

   public static void method27924() {
      method27808(RenderSystem::method27806);
      Class7414.method23765();
   }

   public static void method27925() {
      method27808(RenderSystem::method27806);
      Class7414.method23766();
   }

   public static void method27926(IntSupplier var0, int var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23767(var0.getAsInt(), var1);
   }

   public static void method27927() {
      method27808(RenderSystem::method27806);
      Class7414.method23768();
   }

   public static void method27928(Class7680 var0, Class7680 var1, Class9367 var2) {
      method27808(RenderSystem::method27806);
      Class7414.method23772(var0, var1, var2);
   }

   public static void method27929(Class7680 var0, Class7680 var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23773(var0, var1);
   }

   public static void method27930(Class7680 var0, Class7680 var1) {
      method27808(RenderSystem::method27806);
      Class7414.method23774(var0, var1);
   }

   public static void method27931() {
      method27808(RenderSystem::method27806);
      Class7414.method23778();
   }

   public static void method27932() {
      method27808(RenderSystem::method27806);
      Class7414.method23776();
   }

   public static void method27933() {
      method27808(RenderSystem::method27806);
      Class7414.method23777();
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
      if (method27803()) {
         var0.accept(Class7414.method23746());
      } else {
         method27810(() -> var0.accept(Class7414.method23746()));
      }
   }

   public static Tessellator method27937() {
      method27808(RenderSystem::method27803);
      return field34656;
   }

   public static void method27938() {
      method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
   }

   public static void method27939() {
      method27819(516, 0.1F);
   }

   @Deprecated
   public static void method27940(Runnable var0) {
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

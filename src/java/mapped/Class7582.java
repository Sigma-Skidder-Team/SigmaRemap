package mapped;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;

public class Class7582 {
   private static final Logger field32552 = LogManager.getLogger();
   public static final ByteBuffer field32553 = Class7137.method22266(64);
   public static final FloatBuffer field32554 = field32553.asFloatBuffer();
   public static final IntBuffer field32555 = field32553.asIntBuffer();
   private static final Joiner field32556 = Joiner.on('\n');
   private static final Joiner field32557 = Joiner.on("; ");
   private static final Map<Integer, String> field32558 = Maps.newHashMap();
   private static final List<Integer> field32559 = ImmutableList.of(37190, 37191, 37192, 33387);
   private static final List<Integer> field32560 = ImmutableList.of(37190, 37191, 37192);
   private static final Map<String, List<String>> field32561 = Maps.newHashMap();

   private static String method24814(int var0) {
      return "Unknown (0x" + Integer.toHexString(var0).toUpperCase() + ")";
   }

   private static String method24815(int var0) {
      switch (var0) {
         case 33350:
            return "API";
         case 33351:
            return "WINDOW SYSTEM";
         case 33352:
            return "SHADER COMPILER";
         case 33353:
            return "THIRD PARTY";
         case 33354:
            return "APPLICATION";
         case 33355:
            return "OTHER";
         default:
            return method24814(var0);
      }
   }

   private static String method24816(int var0) {
      switch (var0) {
         case 33356:
            return "ERROR";
         case 33357:
            return "DEPRECATED BEHAVIOR";
         case 33358:
            return "UNDEFINED BEHAVIOR";
         case 33359:
            return "PORTABILITY";
         case 33360:
            return "PERFORMANCE";
         case 33361:
            return "OTHER";
         case 33384:
            return "MARKER";
         default:
            return method24814(var0);
      }
   }

   private static String method24817(int var0) {
      switch (var0) {
         case 33387:
            return "NOTIFICATION";
         case 37190:
            return "HIGH";
         case 37191:
            return "MEDIUM";
         case 37192:
            return "LOW";
         default:
            return method24814(var0);
      }
   }

   private static void method24818(int var0, int var1, int var2, int var3, int var4, long var5, long var7) {
      if (!Class7944.method26921() || var0 != 33352) {
         Minecraft var11 = Minecraft.getInstance();
         if ((var11 == null || var11.method1580() == null || !var11.method1580().method8053()) && Class9084.method33877(var2)) {
            String var12 = method24815(var0);
            String var13 = method24816(var1);
            String var14 = method24817(var3);
            String var15 = GLDebugMessageCallback.getMessage(var4, var5);
            var15 = Class9402.method35776(var15, " \n\r\t");
            String var16 = String.format("OpenGL %s %s: %s (%s)", var12, var13, var2, var15);
            Exception var17 = new Exception("Stack trace");
            StackTraceElement[] var18 = var17.getStackTrace();
            StackTraceElement[] var19 = var18.length <= 2 ? var18 : Arrays.<StackTraceElement>copyOfRange(var18, 2, var18.length);
            var17.setStackTrace(var19);
            if (var1 != 33356) {
               field32552.info(var16, var17);
            } else {
               field32552.error(var16, var17);
            }

            if (Class7944.method26981() && Class4379.method13743("ShowGlErrorDebug", 10000L)) {
               String var20 = Class7944.method26985(var2);
               if (var2 == 0 || Class7944.equals(var20, "Unknown")) {
                  var20 = var15;
               }

               String var21 = Class9088.method33883("of.message.openglError", var2, var20);
               Minecraft.getInstance().ingameGUI.getChatGUI().method5930(new StringTextComponent(var21));
            }
         }
      }
   }

   private static void method24819(int var0, String var1) {
      field32558.merge(var0, var1, (var0x, var1x) -> var0x + "/" + var1x);
   }

   public static void method24820(int var0, boolean var1) {
      RenderSystem.method27808(RenderSystem::method27809);
      if (var0 > 0) {
         GLCapabilities var4 = GL.getCapabilities();
         if (!var4.GL_KHR_debug) {
            if (var4.GL_ARB_debug_output) {
               if (var1) {
                  GL11.glEnable(33346);
               }

               for (int var5 = 0; var5 < field32560.size(); var5++) {
                  boolean var6 = var5 < var0;
                  ARBDebugOutput.glDebugMessageControlARB(4352, 4352, field32560.get(var5), (int[])null, var6);
               }

               ARBDebugOutput.glDebugMessageCallbackARB(
                  Class8157.<GLDebugMessageARBCallbackI>method28308(GLDebugMessageARBCallback.create(Class7582::method24818), Class8317::method29101), 0L
               );
            }
         } else {
            GL11.glEnable(37600);
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var7 = 0; var7 < field32559.size(); var7++) {
               boolean var8 = var7 < var0;
               KHRDebug.glDebugMessageControl(4352, 4352, field32559.get(var7), (int[])null, var8);
            }

            KHRDebug.glDebugMessageCallback(
               Class8157.<GLDebugMessageCallbackI>method28308(GLDebugMessageCallback.create(Class7582::method24818), Class8317::method29101), 0L
            );
         }
      }
   }

   static {
      method24819(256, "GL11.GL_ACCUM");
      method24819(257, "GL11.GL_LOAD");
      method24819(258, "GL11.GL_RETURN");
      method24819(259, "GL11.GL_MULT");
      method24819(260, "GL11.GL_ADD");
      method24819(512, "GL11.GL_NEVER");
      method24819(513, "GL11.GL_LESS");
      method24819(514, "GL11.GL_EQUAL");
      method24819(515, "GL11.GL_LEQUAL");
      method24819(516, "GL11.GL_GREATER");
      method24819(517, "GL11.GL_NOTEQUAL");
      method24819(518, "GL11.GL_GEQUAL");
      method24819(519, "GL11.GL_ALWAYS");
      method24819(0, "GL11.GL_POINTS");
      method24819(1, "GL11.GL_LINES");
      method24819(2, "GL11.GL_LINE_LOOP");
      method24819(3, "GL11.GL_LINE_STRIP");
      method24819(4, "GL11.GL_TRIANGLES");
      method24819(5, "GL11.GL_TRIANGLE_STRIP");
      method24819(6, "GL11.GL_TRIANGLE_FAN");
      method24819(7, "GL11.GL_QUADS");
      method24819(8, "GL11.GL_QUAD_STRIP");
      method24819(9, "GL11.GL_POLYGON");
      method24819(0, "GL11.GL_ZERO");
      method24819(1, "GL11.GL_ONE");
      method24819(768, "GL11.GL_SRC_COLOR");
      method24819(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
      method24819(770, "GL11.GL_SRC_ALPHA");
      method24819(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
      method24819(772, "GL11.GL_DST_ALPHA");
      method24819(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
      method24819(774, "GL11.GL_DST_COLOR");
      method24819(775, "GL11.GL_ONE_MINUS_DST_COLOR");
      method24819(776, "GL11.GL_SRC_ALPHA_SATURATE");
      method24819(32769, "GL14.GL_CONSTANT_COLOR");
      method24819(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
      method24819(32771, "GL14.GL_CONSTANT_ALPHA");
      method24819(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
      method24819(1, "GL11.GL_TRUE");
      method24819(0, "GL11.GL_FALSE");
      method24819(12288, "GL11.GL_CLIP_PLANE0");
      method24819(12289, "GL11.GL_CLIP_PLANE1");
      method24819(12290, "GL11.GL_CLIP_PLANE2");
      method24819(12291, "GL11.GL_CLIP_PLANE3");
      method24819(12292, "GL11.GL_CLIP_PLANE4");
      method24819(12293, "GL11.GL_CLIP_PLANE5");
      method24819(5120, "GL11.GL_BYTE");
      method24819(5121, "GL11.GL_UNSIGNED_BYTE");
      method24819(5122, "GL11.GL_SHORT");
      method24819(5123, "GL11.GL_UNSIGNED_SHORT");
      method24819(5124, "GL11.GL_INT");
      method24819(5125, "GL11.GL_UNSIGNED_INT");
      method24819(5126, "GL11.GL_FLOAT");
      method24819(5127, "GL11.GL_2_BYTES");
      method24819(5128, "GL11.GL_3_BYTES");
      method24819(5129, "GL11.GL_4_BYTES");
      method24819(5130, "GL11.GL_DOUBLE");
      method24819(0, "GL11.GL_NONE");
      method24819(1024, "GL11.GL_FRONT_LEFT");
      method24819(1025, "GL11.GL_FRONT_RIGHT");
      method24819(1026, "GL11.GL_BACK_LEFT");
      method24819(1027, "GL11.GL_BACK_RIGHT");
      method24819(1028, "GL11.GL_FRONT");
      method24819(1029, "GL11.GL_BACK");
      method24819(1030, "GL11.GL_LEFT");
      method24819(1031, "GL11.GL_RIGHT");
      method24819(1032, "GL11.GL_FRONT_AND_BACK");
      method24819(1033, "GL11.GL_AUX0");
      method24819(1034, "GL11.GL_AUX1");
      method24819(1035, "GL11.GL_AUX2");
      method24819(1036, "GL11.GL_AUX3");
      method24819(0, "GL11.GL_NO_ERROR");
      method24819(1280, "GL11.GL_INVALID_ENUM");
      method24819(1281, "GL11.GL_INVALID_VALUE");
      method24819(1282, "GL11.GL_INVALID_OPERATION");
      method24819(1283, "GL11.GL_STACK_OVERFLOW");
      method24819(1284, "GL11.GL_STACK_UNDERFLOW");
      method24819(1285, "GL11.GL_OUT_OF_MEMORY");
      method24819(1536, "GL11.GL_2D");
      method24819(1537, "GL11.GL_3D");
      method24819(1538, "GL11.GL_3D_COLOR");
      method24819(1539, "GL11.GL_3D_COLOR_TEXTURE");
      method24819(1540, "GL11.GL_4D_COLOR_TEXTURE");
      method24819(1792, "GL11.GL_PASS_THROUGH_TOKEN");
      method24819(1793, "GL11.GL_POINT_TOKEN");
      method24819(1794, "GL11.GL_LINE_TOKEN");
      method24819(1795, "GL11.GL_POLYGON_TOKEN");
      method24819(1796, "GL11.GL_BITMAP_TOKEN");
      method24819(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
      method24819(1798, "GL11.GL_COPY_PIXEL_TOKEN");
      method24819(1799, "GL11.GL_LINE_RESET_TOKEN");
      method24819(2048, "GL11.GL_EXP");
      method24819(2049, "GL11.GL_EXP2");
      method24819(2304, "GL11.GL_CW");
      method24819(2305, "GL11.GL_CCW");
      method24819(2560, "GL11.GL_COEFF");
      method24819(2561, "GL11.GL_ORDER");
      method24819(2562, "GL11.GL_DOMAIN");
      method24819(2816, "GL11.GL_CURRENT_COLOR");
      method24819(2817, "GL11.GL_CURRENT_INDEX");
      method24819(2818, "GL11.GL_CURRENT_NORMAL");
      method24819(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
      method24819(2820, "GL11.GL_CURRENT_RASTER_COLOR");
      method24819(2821, "GL11.GL_CURRENT_RASTER_INDEX");
      method24819(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
      method24819(2823, "GL11.GL_CURRENT_RASTER_POSITION");
      method24819(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
      method24819(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
      method24819(2832, "GL11.GL_POINT_SMOOTH");
      method24819(2833, "GL11.GL_POINT_SIZE");
      method24819(2834, "GL11.GL_POINT_SIZE_RANGE");
      method24819(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
      method24819(2848, "GL11.GL_LINE_SMOOTH");
      method24819(2849, "GL11.GL_LINE_WIDTH");
      method24819(2850, "GL11.GL_LINE_WIDTH_RANGE");
      method24819(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
      method24819(2852, "GL11.GL_LINE_STIPPLE");
      method24819(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
      method24819(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
      method24819(2864, "GL11.GL_LIST_MODE");
      method24819(2865, "GL11.GL_MAX_LIST_NESTING");
      method24819(2866, "GL11.GL_LIST_BASE");
      method24819(2867, "GL11.GL_LIST_INDEX");
      method24819(2880, "GL11.GL_POLYGON_MODE");
      method24819(2881, "GL11.GL_POLYGON_SMOOTH");
      method24819(2882, "GL11.GL_POLYGON_STIPPLE");
      method24819(2883, "GL11.GL_EDGE_FLAG");
      method24819(2884, "GL11.GL_CULL_FACE");
      method24819(2885, "GL11.GL_CULL_FACE_MODE");
      method24819(2886, "GL11.GL_FRONT_FACE");
      method24819(2896, "GL11.GL_LIGHTING");
      method24819(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
      method24819(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
      method24819(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
      method24819(2900, "GL11.GL_SHADE_MODEL");
      method24819(2901, "GL11.GL_COLOR_MATERIAL_FACE");
      method24819(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
      method24819(2903, "GL11.GL_COLOR_MATERIAL");
      method24819(2912, "GL11.GL_FOG");
      method24819(2913, "GL11.GL_FOG_INDEX");
      method24819(2914, "GL11.GL_FOG_DENSITY");
      method24819(2915, "GL11.GL_FOG_START");
      method24819(2916, "GL11.GL_FOG_END");
      method24819(2917, "GL11.GL_FOG_MODE");
      method24819(2918, "GL11.GL_FOG_COLOR");
      method24819(2928, "GL11.GL_DEPTH_RANGE");
      method24819(2929, "GL11.GL_DEPTH_TEST");
      method24819(2930, "GL11.GL_DEPTH_WRITEMASK");
      method24819(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
      method24819(2932, "GL11.GL_DEPTH_FUNC");
      method24819(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
      method24819(2960, "GL11.GL_STENCIL_TEST");
      method24819(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
      method24819(2962, "GL11.GL_STENCIL_FUNC");
      method24819(2963, "GL11.GL_STENCIL_VALUE_MASK");
      method24819(2964, "GL11.GL_STENCIL_FAIL");
      method24819(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
      method24819(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
      method24819(2967, "GL11.GL_STENCIL_REF");
      method24819(2968, "GL11.GL_STENCIL_WRITEMASK");
      method24819(2976, "GL11.GL_MATRIX_MODE");
      method24819(2977, "GL11.GL_NORMALIZE");
      method24819(2978, "GL11.GL_VIEWPORT");
      method24819(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
      method24819(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
      method24819(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
      method24819(2982, "GL11.GL_MODELVIEW_MATRIX");
      method24819(2983, "GL11.GL_PROJECTION_MATRIX");
      method24819(2984, "GL11.GL_TEXTURE_MATRIX");
      method24819(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
      method24819(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
      method24819(3008, "GL11.GL_ALPHA_TEST");
      method24819(3009, "GL11.GL_ALPHA_TEST_FUNC");
      method24819(3010, "GL11.GL_ALPHA_TEST_REF");
      method24819(3024, "GL11.GL_DITHER");
      method24819(3040, "GL11.GL_BLEND_DST");
      method24819(3041, "GL11.GL_BLEND_SRC");
      method24819(3042, "GL11.GL_BLEND");
      method24819(3056, "GL11.GL_LOGIC_OP_MODE");
      method24819(3057, "GL11.GL_INDEX_LOGIC_OP");
      method24819(3058, "GL11.GL_COLOR_LOGIC_OP");
      method24819(3072, "GL11.GL_AUX_BUFFERS");
      method24819(3073, "GL11.GL_DRAW_BUFFER");
      method24819(3074, "GL11.GL_READ_BUFFER");
      method24819(3088, "GL11.GL_SCISSOR_BOX");
      method24819(3089, "GL11.GL_SCISSOR_TEST");
      method24819(3104, "GL11.GL_INDEX_CLEAR_VALUE");
      method24819(3105, "GL11.GL_INDEX_WRITEMASK");
      method24819(3106, "GL11.GL_COLOR_CLEAR_VALUE");
      method24819(3107, "GL11.GL_COLOR_WRITEMASK");
      method24819(3120, "GL11.GL_INDEX_MODE");
      method24819(3121, "GL11.GL_RGBA_MODE");
      method24819(3122, "GL11.GL_DOUBLEBUFFER");
      method24819(3123, "GL11.GL_STEREO");
      method24819(3136, "GL11.GL_RENDER_MODE");
      method24819(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
      method24819(3153, "GL11.GL_POINT_SMOOTH_HINT");
      method24819(3154, "GL11.GL_LINE_SMOOTH_HINT");
      method24819(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
      method24819(3156, "GL11.GL_FOG_HINT");
      method24819(3168, "GL11.GL_TEXTURE_GEN_S");
      method24819(3169, "GL11.GL_TEXTURE_GEN_T");
      method24819(3170, "GL11.GL_TEXTURE_GEN_R");
      method24819(3171, "GL11.GL_TEXTURE_GEN_Q");
      method24819(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
      method24819(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
      method24819(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
      method24819(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
      method24819(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
      method24819(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
      method24819(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
      method24819(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
      method24819(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
      method24819(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
      method24819(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
      method24819(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
      method24819(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
      method24819(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
      method24819(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
      method24819(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
      method24819(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
      method24819(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
      method24819(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
      method24819(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
      method24819(3312, "GL11.GL_UNPACK_SWAP_BYTES");
      method24819(3313, "GL11.GL_UNPACK_LSB_FIRST");
      method24819(3314, "GL11.GL_UNPACK_ROW_LENGTH");
      method24819(3315, "GL11.GL_UNPACK_SKIP_ROWS");
      method24819(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
      method24819(3317, "GL11.GL_UNPACK_ALIGNMENT");
      method24819(3328, "GL11.GL_PACK_SWAP_BYTES");
      method24819(3329, "GL11.GL_PACK_LSB_FIRST");
      method24819(3330, "GL11.GL_PACK_ROW_LENGTH");
      method24819(3331, "GL11.GL_PACK_SKIP_ROWS");
      method24819(3332, "GL11.GL_PACK_SKIP_PIXELS");
      method24819(3333, "GL11.GL_PACK_ALIGNMENT");
      method24819(3344, "GL11.GL_MAP_COLOR");
      method24819(3345, "GL11.GL_MAP_STENCIL");
      method24819(3346, "GL11.GL_INDEX_SHIFT");
      method24819(3347, "GL11.GL_INDEX_OFFSET");
      method24819(3348, "GL11.GL_RED_SCALE");
      method24819(3349, "GL11.GL_RED_BIAS");
      method24819(3350, "GL11.GL_ZOOM_X");
      method24819(3351, "GL11.GL_ZOOM_Y");
      method24819(3352, "GL11.GL_GREEN_SCALE");
      method24819(3353, "GL11.GL_GREEN_BIAS");
      method24819(3354, "GL11.GL_BLUE_SCALE");
      method24819(3355, "GL11.GL_BLUE_BIAS");
      method24819(3356, "GL11.GL_ALPHA_SCALE");
      method24819(3357, "GL11.GL_ALPHA_BIAS");
      method24819(3358, "GL11.GL_DEPTH_SCALE");
      method24819(3359, "GL11.GL_DEPTH_BIAS");
      method24819(3376, "GL11.GL_MAX_EVAL_ORDER");
      method24819(3377, "GL11.GL_MAX_LIGHTS");
      method24819(3378, "GL11.GL_MAX_CLIP_PLANES");
      method24819(3379, "GL11.GL_MAX_TEXTURE_SIZE");
      method24819(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
      method24819(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
      method24819(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
      method24819(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
      method24819(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
      method24819(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
      method24819(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
      method24819(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
      method24819(3408, "GL11.GL_SUBPIXEL_BITS");
      method24819(3409, "GL11.GL_INDEX_BITS");
      method24819(3410, "GL11.GL_RED_BITS");
      method24819(3411, "GL11.GL_GREEN_BITS");
      method24819(3412, "GL11.GL_BLUE_BITS");
      method24819(3413, "GL11.GL_ALPHA_BITS");
      method24819(3414, "GL11.GL_DEPTH_BITS");
      method24819(3415, "GL11.GL_STENCIL_BITS");
      method24819(3416, "GL11.GL_ACCUM_RED_BITS");
      method24819(3417, "GL11.GL_ACCUM_GREEN_BITS");
      method24819(3418, "GL11.GL_ACCUM_BLUE_BITS");
      method24819(3419, "GL11.GL_ACCUM_ALPHA_BITS");
      method24819(3440, "GL11.GL_NAME_STACK_DEPTH");
      method24819(3456, "GL11.GL_AUTO_NORMAL");
      method24819(3472, "GL11.GL_MAP1_COLOR_4");
      method24819(3473, "GL11.GL_MAP1_INDEX");
      method24819(3474, "GL11.GL_MAP1_NORMAL");
      method24819(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
      method24819(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
      method24819(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
      method24819(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
      method24819(3479, "GL11.GL_MAP1_VERTEX_3");
      method24819(3480, "GL11.GL_MAP1_VERTEX_4");
      method24819(3504, "GL11.GL_MAP2_COLOR_4");
      method24819(3505, "GL11.GL_MAP2_INDEX");
      method24819(3506, "GL11.GL_MAP2_NORMAL");
      method24819(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
      method24819(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
      method24819(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
      method24819(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
      method24819(3511, "GL11.GL_MAP2_VERTEX_3");
      method24819(3512, "GL11.GL_MAP2_VERTEX_4");
      method24819(3536, "GL11.GL_MAP1_GRID_DOMAIN");
      method24819(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
      method24819(3538, "GL11.GL_MAP2_GRID_DOMAIN");
      method24819(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
      method24819(3552, "GL11.GL_TEXTURE_1D");
      method24819(3553, "GL11.GL_TEXTURE_2D");
      method24819(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
      method24819(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
      method24819(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
      method24819(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
      method24819(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
      method24819(4096, "GL11.GL_TEXTURE_WIDTH");
      method24819(4097, "GL11.GL_TEXTURE_HEIGHT");
      method24819(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
      method24819(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
      method24819(4101, "GL11.GL_TEXTURE_BORDER");
      method24819(4352, "GL11.GL_DONT_CARE");
      method24819(4353, "GL11.GL_FASTEST");
      method24819(4354, "GL11.GL_NICEST");
      method24819(16384, "GL11.GL_LIGHT0");
      method24819(16385, "GL11.GL_LIGHT1");
      method24819(16386, "GL11.GL_LIGHT2");
      method24819(16387, "GL11.GL_LIGHT3");
      method24819(16388, "GL11.GL_LIGHT4");
      method24819(16389, "GL11.GL_LIGHT5");
      method24819(16390, "GL11.GL_LIGHT6");
      method24819(16391, "GL11.GL_LIGHT7");
      method24819(4608, "GL11.GL_AMBIENT");
      method24819(4609, "GL11.GL_DIFFUSE");
      method24819(4610, "GL11.GL_SPECULAR");
      method24819(4611, "GL11.GL_POSITION");
      method24819(4612, "GL11.GL_SPOT_DIRECTION");
      method24819(4613, "GL11.GL_SPOT_EXPONENT");
      method24819(4614, "GL11.GL_SPOT_CUTOFF");
      method24819(4615, "GL11.GL_CONSTANT_ATTENUATION");
      method24819(4616, "GL11.GL_LINEAR_ATTENUATION");
      method24819(4617, "GL11.GL_QUADRATIC_ATTENUATION");
      method24819(4864, "GL11.GL_COMPILE");
      method24819(4865, "GL11.GL_COMPILE_AND_EXECUTE");
      method24819(5376, "GL11.GL_CLEAR");
      method24819(5377, "GL11.GL_AND");
      method24819(5378, "GL11.GL_AND_REVERSE");
      method24819(5379, "GL11.GL_COPY");
      method24819(5380, "GL11.GL_AND_INVERTED");
      method24819(5381, "GL11.GL_NOOP");
      method24819(5382, "GL11.GL_XOR");
      method24819(5383, "GL11.GL_OR");
      method24819(5384, "GL11.GL_NOR");
      method24819(5385, "GL11.GL_EQUIV");
      method24819(5386, "GL11.GL_INVERT");
      method24819(5387, "GL11.GL_OR_REVERSE");
      method24819(5388, "GL11.GL_COPY_INVERTED");
      method24819(5389, "GL11.GL_OR_INVERTED");
      method24819(5390, "GL11.GL_NAND");
      method24819(5391, "GL11.GL_SET");
      method24819(5632, "GL11.GL_EMISSION");
      method24819(5633, "GL11.GL_SHININESS");
      method24819(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
      method24819(5635, "GL11.GL_COLOR_INDEXES");
      method24819(5888, "GL11.GL_MODELVIEW");
      method24819(5889, "GL11.GL_PROJECTION");
      method24819(5890, "GL11.GL_TEXTURE");
      method24819(6144, "GL11.GL_COLOR");
      method24819(6145, "GL11.GL_DEPTH");
      method24819(6146, "GL11.GL_STENCIL");
      method24819(6400, "GL11.GL_COLOR_INDEX");
      method24819(6401, "GL11.GL_STENCIL_INDEX");
      method24819(6402, "GL11.GL_DEPTH_COMPONENT");
      method24819(6403, "GL11.GL_RED");
      method24819(6404, "GL11.GL_GREEN");
      method24819(6405, "GL11.GL_BLUE");
      method24819(6406, "GL11.GL_ALPHA");
      method24819(6407, "GL11.GL_RGB");
      method24819(6408, "GL11.GL_RGBA");
      method24819(6409, "GL11.GL_LUMINANCE");
      method24819(6410, "GL11.GL_LUMINANCE_ALPHA");
      method24819(6656, "GL11.GL_BITMAP");
      method24819(6912, "GL11.GL_POINT");
      method24819(6913, "GL11.GL_LINE");
      method24819(6914, "GL11.GL_FILL");
      method24819(7168, "GL11.GL_RENDER");
      method24819(7169, "GL11.GL_FEEDBACK");
      method24819(7170, "GL11.GL_SELECT");
      method24819(7424, "GL11.GL_FLAT");
      method24819(7425, "GL11.GL_SMOOTH");
      method24819(7680, "GL11.GL_KEEP");
      method24819(7681, "GL11.GL_REPLACE");
      method24819(7682, "GL11.GL_INCR");
      method24819(7683, "GL11.GL_DECR");
      method24819(7936, "GL11.GL_VENDOR");
      method24819(7937, "GL11.GL_RENDERER");
      method24819(7938, "GL11.GL_VERSION");
      method24819(7939, "GL11.GL_EXTENSIONS");
      method24819(8192, "GL11.GL_S");
      method24819(8193, "GL11.GL_T");
      method24819(8194, "GL11.GL_R");
      method24819(8195, "GL11.GL_Q");
      method24819(8448, "GL11.GL_MODULATE");
      method24819(8449, "GL11.GL_DECAL");
      method24819(8704, "GL11.GL_TEXTURE_ENV_MODE");
      method24819(8705, "GL11.GL_TEXTURE_ENV_COLOR");
      method24819(8960, "GL11.GL_TEXTURE_ENV");
      method24819(9216, "GL11.GL_EYE_LINEAR");
      method24819(9217, "GL11.GL_OBJECT_LINEAR");
      method24819(9218, "GL11.GL_SPHERE_MAP");
      method24819(9472, "GL11.GL_TEXTURE_GEN_MODE");
      method24819(9473, "GL11.GL_OBJECT_PLANE");
      method24819(9474, "GL11.GL_EYE_PLANE");
      method24819(9728, "GL11.GL_NEAREST");
      method24819(9729, "GL11.GL_LINEAR");
      method24819(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
      method24819(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
      method24819(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
      method24819(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
      method24819(10240, "GL11.GL_TEXTURE_MAG_FILTER");
      method24819(10241, "GL11.GL_TEXTURE_MIN_FILTER");
      method24819(10242, "GL11.GL_TEXTURE_WRAP_S");
      method24819(10243, "GL11.GL_TEXTURE_WRAP_T");
      method24819(10496, "GL11.GL_CLAMP");
      method24819(10497, "GL11.GL_REPEAT");
      method24819(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
      method24819(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
      method24819(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
      method24819(10753, "GL11.GL_POLYGON_OFFSET_POINT");
      method24819(10754, "GL11.GL_POLYGON_OFFSET_LINE");
      method24819(32823, "GL11.GL_POLYGON_OFFSET_FILL");
      method24819(32827, "GL11.GL_ALPHA4");
      method24819(32828, "GL11.GL_ALPHA8");
      method24819(32829, "GL11.GL_ALPHA12");
      method24819(32830, "GL11.GL_ALPHA16");
      method24819(32831, "GL11.GL_LUMINANCE4");
      method24819(32832, "GL11.GL_LUMINANCE8");
      method24819(32833, "GL11.GL_LUMINANCE12");
      method24819(32834, "GL11.GL_LUMINANCE16");
      method24819(32835, "GL11.GL_LUMINANCE4_ALPHA4");
      method24819(32836, "GL11.GL_LUMINANCE6_ALPHA2");
      method24819(32837, "GL11.GL_LUMINANCE8_ALPHA8");
      method24819(32838, "GL11.GL_LUMINANCE12_ALPHA4");
      method24819(32839, "GL11.GL_LUMINANCE12_ALPHA12");
      method24819(32840, "GL11.GL_LUMINANCE16_ALPHA16");
      method24819(32841, "GL11.GL_INTENSITY");
      method24819(32842, "GL11.GL_INTENSITY4");
      method24819(32843, "GL11.GL_INTENSITY8");
      method24819(32844, "GL11.GL_INTENSITY12");
      method24819(32845, "GL11.GL_INTENSITY16");
      method24819(10768, "GL11.GL_R3_G3_B2");
      method24819(32847, "GL11.GL_RGB4");
      method24819(32848, "GL11.GL_RGB5");
      method24819(32849, "GL11.GL_RGB8");
      method24819(32850, "GL11.GL_RGB10");
      method24819(32851, "GL11.GL_RGB12");
      method24819(32852, "GL11.GL_RGB16");
      method24819(32853, "GL11.GL_RGBA2");
      method24819(32854, "GL11.GL_RGBA4");
      method24819(32855, "GL11.GL_RGB5_A1");
      method24819(32856, "GL11.GL_RGBA8");
      method24819(32857, "GL11.GL_RGB10_A2");
      method24819(32858, "GL11.GL_RGBA12");
      method24819(32859, "GL11.GL_RGBA16");
      method24819(32860, "GL11.GL_TEXTURE_RED_SIZE");
      method24819(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
      method24819(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
      method24819(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
      method24819(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
      method24819(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
      method24819(32867, "GL11.GL_PROXY_TEXTURE_1D");
      method24819(32868, "GL11.GL_PROXY_TEXTURE_2D");
      method24819(32870, "GL11.GL_TEXTURE_PRIORITY");
      method24819(32871, "GL11.GL_TEXTURE_RESIDENT");
      method24819(32872, "GL11.GL_TEXTURE_BINDING_1D");
      method24819(32873, "GL11.GL_TEXTURE_BINDING_2D");
      method24819(32884, "GL11.GL_VERTEX_ARRAY");
      method24819(32885, "GL11.GL_NORMAL_ARRAY");
      method24819(32886, "GL11.GL_COLOR_ARRAY");
      method24819(32887, "GL11.GL_INDEX_ARRAY");
      method24819(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
      method24819(32889, "GL11.GL_EDGE_FLAG_ARRAY");
      method24819(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
      method24819(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
      method24819(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
      method24819(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
      method24819(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
      method24819(32897, "GL11.GL_COLOR_ARRAY_SIZE");
      method24819(32898, "GL11.GL_COLOR_ARRAY_TYPE");
      method24819(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
      method24819(32901, "GL11.GL_INDEX_ARRAY_TYPE");
      method24819(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
      method24819(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
      method24819(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
      method24819(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
      method24819(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
      method24819(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
      method24819(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
      method24819(32912, "GL11.GL_COLOR_ARRAY_POINTER");
      method24819(32913, "GL11.GL_INDEX_ARRAY_POINTER");
      method24819(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
      method24819(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
      method24819(10784, "GL11.GL_V2F");
      method24819(10785, "GL11.GL_V3F");
      method24819(10786, "GL11.GL_C4UB_V2F");
      method24819(10787, "GL11.GL_C4UB_V3F");
      method24819(10788, "GL11.GL_C3F_V3F");
      method24819(10789, "GL11.GL_N3F_V3F");
      method24819(10790, "GL11.GL_C4F_N3F_V3F");
      method24819(10791, "GL11.GL_T2F_V3F");
      method24819(10792, "GL11.GL_T4F_V4F");
      method24819(10793, "GL11.GL_T2F_C4UB_V3F");
      method24819(10794, "GL11.GL_T2F_C3F_V3F");
      method24819(10795, "GL11.GL_T2F_N3F_V3F");
      method24819(10796, "GL11.GL_T2F_C4F_N3F_V3F");
      method24819(10797, "GL11.GL_T4F_C4F_N3F_V4F");
      method24819(3057, "GL11.GL_LOGIC_OP");
      method24819(4099, "GL11.GL_TEXTURE_COMPONENTS");
      method24819(32874, "GL12.GL_TEXTURE_BINDING_3D");
      method24819(32875, "GL12.GL_PACK_SKIP_IMAGES");
      method24819(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
      method24819(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
      method24819(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
      method24819(32879, "GL12.GL_TEXTURE_3D");
      method24819(32880, "GL12.GL_PROXY_TEXTURE_3D");
      method24819(32881, "GL12.GL_TEXTURE_DEPTH");
      method24819(32882, "GL12.GL_TEXTURE_WRAP_R");
      method24819(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
      method24819(32992, "GL12.GL_BGR");
      method24819(32993, "GL12.GL_BGRA");
      method24819(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
      method24819(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
      method24819(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
      method24819(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
      method24819(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
      method24819(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
      method24819(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
      method24819(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
      method24819(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
      method24819(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
      method24819(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
      method24819(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
      method24819(32826, "GL12.GL_RESCALE_NORMAL");
      method24819(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
      method24819(33273, "GL12.GL_SINGLE_COLOR");
      method24819(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
      method24819(33071, "GL12.GL_CLAMP_TO_EDGE");
      method24819(33082, "GL12.GL_TEXTURE_MIN_LOD");
      method24819(33083, "GL12.GL_TEXTURE_MAX_LOD");
      method24819(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
      method24819(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
      method24819(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
      method24819(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
      method24819(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
      method24819(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
      method24819(33984, "GL13.GL_TEXTURE0");
      method24819(33985, "GL13.GL_TEXTURE1");
      method24819(33986, "GL13.GL_TEXTURE2");
      method24819(33987, "GL13.GL_TEXTURE3");
      method24819(33988, "GL13.GL_TEXTURE4");
      method24819(33989, "GL13.GL_TEXTURE5");
      method24819(33990, "GL13.GL_TEXTURE6");
      method24819(33991, "GL13.GL_TEXTURE7");
      method24819(33992, "GL13.GL_TEXTURE8");
      method24819(33993, "GL13.GL_TEXTURE9");
      method24819(33994, "GL13.GL_TEXTURE10");
      method24819(33995, "GL13.GL_TEXTURE11");
      method24819(33996, "GL13.GL_TEXTURE12");
      method24819(33997, "GL13.GL_TEXTURE13");
      method24819(33998, "GL13.GL_TEXTURE14");
      method24819(33999, "GL13.GL_TEXTURE15");
      method24819(34000, "GL13.GL_TEXTURE16");
      method24819(34001, "GL13.GL_TEXTURE17");
      method24819(34002, "GL13.GL_TEXTURE18");
      method24819(34003, "GL13.GL_TEXTURE19");
      method24819(34004, "GL13.GL_TEXTURE20");
      method24819(34005, "GL13.GL_TEXTURE21");
      method24819(34006, "GL13.GL_TEXTURE22");
      method24819(34007, "GL13.GL_TEXTURE23");
      method24819(34008, "GL13.GL_TEXTURE24");
      method24819(34009, "GL13.GL_TEXTURE25");
      method24819(34010, "GL13.GL_TEXTURE26");
      method24819(34011, "GL13.GL_TEXTURE27");
      method24819(34012, "GL13.GL_TEXTURE28");
      method24819(34013, "GL13.GL_TEXTURE29");
      method24819(34014, "GL13.GL_TEXTURE30");
      method24819(34015, "GL13.GL_TEXTURE31");
      method24819(34016, "GL13.GL_ACTIVE_TEXTURE");
      method24819(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
      method24819(34018, "GL13.GL_MAX_TEXTURE_UNITS");
      method24819(34065, "GL13.GL_NORMAL_MAP");
      method24819(34066, "GL13.GL_REFLECTION_MAP");
      method24819(34067, "GL13.GL_TEXTURE_CUBE_MAP");
      method24819(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
      method24819(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
      method24819(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
      method24819(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
      method24819(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
      method24819(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
      method24819(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
      method24819(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
      method24819(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
      method24819(34025, "GL13.GL_COMPRESSED_ALPHA");
      method24819(34026, "GL13.GL_COMPRESSED_LUMINANCE");
      method24819(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
      method24819(34028, "GL13.GL_COMPRESSED_INTENSITY");
      method24819(34029, "GL13.GL_COMPRESSED_RGB");
      method24819(34030, "GL13.GL_COMPRESSED_RGBA");
      method24819(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
      method24819(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
      method24819(34465, "GL13.GL_TEXTURE_COMPRESSED");
      method24819(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
      method24819(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
      method24819(32925, "GL13.GL_MULTISAMPLE");
      method24819(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
      method24819(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
      method24819(32928, "GL13.GL_SAMPLE_COVERAGE");
      method24819(32936, "GL13.GL_SAMPLE_BUFFERS");
      method24819(32937, "GL13.GL_SAMPLES");
      method24819(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
      method24819(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
      method24819(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
      method24819(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
      method24819(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
      method24819(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
      method24819(34160, "GL13.GL_COMBINE");
      method24819(34161, "GL13.GL_COMBINE_RGB");
      method24819(34162, "GL13.GL_COMBINE_ALPHA");
      method24819(34176, "GL13.GL_SOURCE0_RGB");
      method24819(34177, "GL13.GL_SOURCE1_RGB");
      method24819(34178, "GL13.GL_SOURCE2_RGB");
      method24819(34184, "GL13.GL_SOURCE0_ALPHA");
      method24819(34185, "GL13.GL_SOURCE1_ALPHA");
      method24819(34186, "GL13.GL_SOURCE2_ALPHA");
      method24819(34192, "GL13.GL_OPERAND0_RGB");
      method24819(34193, "GL13.GL_OPERAND1_RGB");
      method24819(34194, "GL13.GL_OPERAND2_RGB");
      method24819(34200, "GL13.GL_OPERAND0_ALPHA");
      method24819(34201, "GL13.GL_OPERAND1_ALPHA");
      method24819(34202, "GL13.GL_OPERAND2_ALPHA");
      method24819(34163, "GL13.GL_RGB_SCALE");
      method24819(34164, "GL13.GL_ADD_SIGNED");
      method24819(34165, "GL13.GL_INTERPOLATE");
      method24819(34023, "GL13.GL_SUBTRACT");
      method24819(34166, "GL13.GL_CONSTANT");
      method24819(34167, "GL13.GL_PRIMARY_COLOR");
      method24819(34168, "GL13.GL_PREVIOUS");
      method24819(34478, "GL13.GL_DOT3_RGB");
      method24819(34479, "GL13.GL_DOT3_RGBA");
      method24819(33069, "GL13.GL_CLAMP_TO_BORDER");
      method24819(33169, "GL14.GL_GENERATE_MIPMAP");
      method24819(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
      method24819(33189, "GL14.GL_DEPTH_COMPONENT16");
      method24819(33190, "GL14.GL_DEPTH_COMPONENT24");
      method24819(33191, "GL14.GL_DEPTH_COMPONENT32");
      method24819(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
      method24819(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
      method24819(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
      method24819(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
      method24819(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
      method24819(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
      method24819(33873, "GL14.GL_FOG_COORDINATE");
      method24819(33874, "GL14.GL_FRAGMENT_DEPTH");
      method24819(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
      method24819(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
      method24819(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
      method24819(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
      method24819(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
      method24819(33062, "GL14.GL_POINT_SIZE_MIN");
      method24819(33063, "GL14.GL_POINT_SIZE_MAX");
      method24819(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
      method24819(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
      method24819(33880, "GL14.GL_COLOR_SUM");
      method24819(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
      method24819(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
      method24819(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
      method24819(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
      method24819(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
      method24819(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
      method24819(32968, "GL14.GL_BLEND_DST_RGB");
      method24819(32969, "GL14.GL_BLEND_SRC_RGB");
      method24819(32970, "GL14.GL_BLEND_DST_ALPHA");
      method24819(32971, "GL14.GL_BLEND_SRC_ALPHA");
      method24819(34055, "GL14.GL_INCR_WRAP");
      method24819(34056, "GL14.GL_DECR_WRAP");
      method24819(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
      method24819(34049, "GL14.GL_TEXTURE_LOD_BIAS");
      method24819(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
      method24819(33648, "GL14.GL_MIRRORED_REPEAT");
      method24819(32773, "ARBImaging.GL_BLEND_COLOR");
      method24819(32777, "ARBImaging.GL_BLEND_EQUATION");
      method24819(32774, "GL14.GL_FUNC_ADD");
      method24819(32778, "GL14.GL_FUNC_SUBTRACT");
      method24819(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
      method24819(32775, "GL14.GL_MIN");
      method24819(32776, "GL14.GL_MAX");
      method24819(34962, "GL15.GL_ARRAY_BUFFER");
      method24819(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
      method24819(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
      method24819(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
      method24819(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
      method24819(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
      method24819(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
      method24819(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
      method24819(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
      method24819(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
      method24819(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
      method24819(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
      method24819(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
      method24819(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
      method24819(35040, "GL15.GL_STREAM_DRAW");
      method24819(35041, "GL15.GL_STREAM_READ");
      method24819(35042, "GL15.GL_STREAM_COPY");
      method24819(35044, "GL15.GL_STATIC_DRAW");
      method24819(35045, "GL15.GL_STATIC_READ");
      method24819(35046, "GL15.GL_STATIC_COPY");
      method24819(35048, "GL15.GL_DYNAMIC_DRAW");
      method24819(35049, "GL15.GL_DYNAMIC_READ");
      method24819(35050, "GL15.GL_DYNAMIC_COPY");
      method24819(35000, "GL15.GL_READ_ONLY");
      method24819(35001, "GL15.GL_WRITE_ONLY");
      method24819(35002, "GL15.GL_READ_WRITE");
      method24819(34660, "GL15.GL_BUFFER_SIZE");
      method24819(34661, "GL15.GL_BUFFER_USAGE");
      method24819(35003, "GL15.GL_BUFFER_ACCESS");
      method24819(35004, "GL15.GL_BUFFER_MAPPED");
      method24819(35005, "GL15.GL_BUFFER_MAP_POINTER");
      method24819(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
      method24819(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
      method24819(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
   }
}

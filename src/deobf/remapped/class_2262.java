package remapped;

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

public class class_2262 {
   private static final Logger field_11250 = LogManager.getLogger();
   public static final ByteBuffer field_11254 = class_1423.method_6528(64);
   public static final FloatBuffer field_11256 = field_11254.asFloatBuffer();
   public static final IntBuffer field_11249 = field_11254.asIntBuffer();
   private static final Joiner field_11252 = Joiner.on('\n');
   private static final Joiner field_11253 = Joiner.on("; ");
   private static final Map<Integer, String> field_11251 = Maps.newHashMap();
   private static final List<Integer> field_11248 = ImmutableList.of(37190, 37191, 37192, 33387);
   private static final List<Integer> field_11247 = ImmutableList.of(37190, 37191, 37192);
   private static final Map<String, List<String>> field_11255 = Maps.newHashMap();

   private static String method_10392(int var0) {
      return "Unknown (0x" + Integer.toHexString(var0).toUpperCase() + ")";
   }

   private static String method_10393(int var0) {
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
            return method_10392(var0);
      }
   }

   private static String method_10396(int var0) {
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
            return method_10392(var0);
      }
   }

   private static String method_10391(int var0) {
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
            return method_10392(var0);
      }
   }

   private static void method_10394(int var0, int var1, int var2, int var3, int var4, long var5, long var7) {
      if (!Config.method_14424() || var0 != 33352) {
         MinecraftClient var11 = MinecraftClient.getInstance();
         if ((var11 == null || var11.getMainWindow() == null || !var11.getMainWindow().method_43168()) && class_6941.method_31754(var2)) {
            String var12 = method_10393(var0);
            String var13 = method_10396(var1);
            String var14 = method_10391(var3);
            String var15 = GLDebugMessageCallback.getMessage(var4, var5);
            var15 = class_8251.method_37830(var15, " \n\r\t");
            String var16 = String.format("OpenGL %s %s: %s (%s)", var12, var13, var2, var15);
            Exception var17 = new Exception("Stack trace");
            StackTraceElement[] var18 = var17.getStackTrace();
            StackTraceElement[] var19 = var18.length <= 2 ? var18 : Arrays.<StackTraceElement>copyOfRange(var18, 2, var18.length);
            var17.setStackTrace(var19);
            if (var1 != 33356) {
               field_11250.info(var16, var17);
            } else {
               field_11250.error(var16, var17);
            }

            if (Config.method_14294() && class_124.method_386("ShowGlErrorDebug", 10000L)) {
               String var20 = Config.method_14316(var2);
               if (var2 == 0 || Config.equals(var20, "Unknown")) {
                  var20 = var15;
               }

               String var21 = class_6956.method_31803("of.message.openglError", var2, var20);
               MinecraftClient.getInstance().field_9614.method_13991().method_18676(new StringTextComponent(var21));
            }
         }
      }
   }

   private static void method_10397(int var0, String var1) {
      field_11251.merge(var0, var1, (var0x, var1x) -> var0x + "/" + var1x);
   }

   public static void method_10390(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var0 > 0) {
         GLCapabilities var4 = GL.getCapabilities();
         if (!var4.GL_KHR_debug) {
            if (var4.GL_ARB_debug_output) {
               if (var1) {
                  GL11.glEnable(33346);
               }

               for (int var5 = 0; var5 < field_11247.size(); var5++) {
                  boolean var6 = var5 < var0;
                  ARBDebugOutput.glDebugMessageControlARB(4352, 4352, field_11247.get(var5), (int[])null, var6);
               }

               ARBDebugOutput.glDebugMessageCallbackARB(
                  class_3776.<GLDebugMessageARBCallbackI>method_17484(GLDebugMessageARBCallback.create(class_2262::method_10394), class_4208::method_19579), 0L
               );
            }
         } else {
            GL11.glEnable(37600);
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var7 = 0; var7 < field_11248.size(); var7++) {
               boolean var8 = var7 < var0;
               KHRDebug.glDebugMessageControl(4352, 4352, field_11248.get(var7), (int[])null, var8);
            }

            KHRDebug.glDebugMessageCallback(
               class_3776.<GLDebugMessageCallbackI>method_17484(GLDebugMessageCallback.create(class_2262::method_10394), class_4208::method_19579), 0L
            );
         }
      }
   }

   static {
      method_10397(256, "GL11.GL_ACCUM");
      method_10397(257, "GL11.GL_LOAD");
      method_10397(258, "GL11.GL_RETURN");
      method_10397(259, "GL11.GL_MULT");
      method_10397(260, "GL11.GL_ADD");
      method_10397(512, "GL11.GL_NEVER");
      method_10397(513, "GL11.GL_LESS");
      method_10397(514, "GL11.GL_EQUAL");
      method_10397(515, "GL11.GL_LEQUAL");
      method_10397(516, "GL11.GL_GREATER");
      method_10397(517, "GL11.GL_NOTEQUAL");
      method_10397(518, "GL11.GL_GEQUAL");
      method_10397(519, "GL11.GL_ALWAYS");
      method_10397(0, "GL11.GL_POINTS");
      method_10397(1, "GL11.GL_LINES");
      method_10397(2, "GL11.GL_LINE_LOOP");
      method_10397(3, "GL11.GL_LINE_STRIP");
      method_10397(4, "GL11.GL_TRIANGLES");
      method_10397(5, "GL11.GL_TRIANGLE_STRIP");
      method_10397(6, "GL11.GL_TRIANGLE_FAN");
      method_10397(7, "GL11.GL_QUADS");
      method_10397(8, "GL11.GL_QUAD_STRIP");
      method_10397(9, "GL11.GL_POLYGON");
      method_10397(0, "GL11.GL_ZERO");
      method_10397(1, "GL11.GL_ONE");
      method_10397(768, "GL11.GL_SRC_COLOR");
      method_10397(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
      method_10397(770, "GL11.GL_SRC_ALPHA");
      method_10397(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
      method_10397(772, "GL11.GL_DST_ALPHA");
      method_10397(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
      method_10397(774, "GL11.GL_DST_COLOR");
      method_10397(775, "GL11.GL_ONE_MINUS_DST_COLOR");
      method_10397(776, "GL11.GL_SRC_ALPHA_SATURATE");
      method_10397(32769, "GL14.GL_CONSTANT_COLOR");
      method_10397(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
      method_10397(32771, "GL14.GL_CONSTANT_ALPHA");
      method_10397(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
      method_10397(1, "GL11.GL_TRUE");
      method_10397(0, "GL11.GL_FALSE");
      method_10397(12288, "GL11.GL_CLIP_PLANE0");
      method_10397(12289, "GL11.GL_CLIP_PLANE1");
      method_10397(12290, "GL11.GL_CLIP_PLANE2");
      method_10397(12291, "GL11.GL_CLIP_PLANE3");
      method_10397(12292, "GL11.GL_CLIP_PLANE4");
      method_10397(12293, "GL11.GL_CLIP_PLANE5");
      method_10397(5120, "GL11.GL_BYTE");
      method_10397(5121, "GL11.GL_UNSIGNED_BYTE");
      method_10397(5122, "GL11.GL_SHORT");
      method_10397(5123, "GL11.GL_UNSIGNED_SHORT");
      method_10397(5124, "GL11.GL_INT");
      method_10397(5125, "GL11.GL_UNSIGNED_INT");
      method_10397(5126, "GL11.GL_FLOAT");
      method_10397(5127, "GL11.GL_2_BYTES");
      method_10397(5128, "GL11.GL_3_BYTES");
      method_10397(5129, "GL11.GL_4_BYTES");
      method_10397(5130, "GL11.GL_DOUBLE");
      method_10397(0, "GL11.GL_NONE");
      method_10397(1024, "GL11.GL_FRONT_LEFT");
      method_10397(1025, "GL11.GL_FRONT_RIGHT");
      method_10397(1026, "GL11.GL_BACK_LEFT");
      method_10397(1027, "GL11.GL_BACK_RIGHT");
      method_10397(1028, "GL11.GL_FRONT");
      method_10397(1029, "GL11.GL_BACK");
      method_10397(1030, "GL11.GL_LEFT");
      method_10397(1031, "GL11.GL_RIGHT");
      method_10397(1032, "GL11.GL_FRONT_AND_BACK");
      method_10397(1033, "GL11.GL_AUX0");
      method_10397(1034, "GL11.GL_AUX1");
      method_10397(1035, "GL11.GL_AUX2");
      method_10397(1036, "GL11.GL_AUX3");
      method_10397(0, "GL11.GL_NO_ERROR");
      method_10397(1280, "GL11.GL_INVALID_ENUM");
      method_10397(1281, "GL11.GL_INVALID_VALUE");
      method_10397(1282, "GL11.GL_INVALID_OPERATION");
      method_10397(1283, "GL11.GL_STACK_OVERFLOW");
      method_10397(1284, "GL11.GL_STACK_UNDERFLOW");
      method_10397(1285, "GL11.GL_OUT_OF_MEMORY");
      method_10397(1536, "GL11.GL_2D");
      method_10397(1537, "GL11.GL_3D");
      method_10397(1538, "GL11.GL_3D_COLOR");
      method_10397(1539, "GL11.GL_3D_COLOR_TEXTURE");
      method_10397(1540, "GL11.GL_4D_COLOR_TEXTURE");
      method_10397(1792, "GL11.GL_PASS_THROUGH_TOKEN");
      method_10397(1793, "GL11.GL_POINT_TOKEN");
      method_10397(1794, "GL11.GL_LINE_TOKEN");
      method_10397(1795, "GL11.GL_POLYGON_TOKEN");
      method_10397(1796, "GL11.GL_BITMAP_TOKEN");
      method_10397(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
      method_10397(1798, "GL11.GL_COPY_PIXEL_TOKEN");
      method_10397(1799, "GL11.GL_LINE_RESET_TOKEN");
      method_10397(2048, "GL11.GL_EXP");
      method_10397(2049, "GL11.GL_EXP2");
      method_10397(2304, "GL11.GL_CW");
      method_10397(2305, "GL11.GL_CCW");
      method_10397(2560, "GL11.GL_COEFF");
      method_10397(2561, "GL11.GL_ORDER");
      method_10397(2562, "GL11.GL_DOMAIN");
      method_10397(2816, "GL11.GL_CURRENT_COLOR");
      method_10397(2817, "GL11.GL_CURRENT_INDEX");
      method_10397(2818, "GL11.GL_CURRENT_NORMAL");
      method_10397(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
      method_10397(2820, "GL11.GL_CURRENT_RASTER_COLOR");
      method_10397(2821, "GL11.GL_CURRENT_RASTER_INDEX");
      method_10397(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
      method_10397(2823, "GL11.GL_CURRENT_RASTER_POSITION");
      method_10397(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
      method_10397(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
      method_10397(2832, "GL11.GL_POINT_SMOOTH");
      method_10397(2833, "GL11.GL_POINT_SIZE");
      method_10397(2834, "GL11.GL_POINT_SIZE_RANGE");
      method_10397(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
      method_10397(2848, "GL11.GL_LINE_SMOOTH");
      method_10397(2849, "GL11.GL_LINE_WIDTH");
      method_10397(2850, "GL11.GL_LINE_WIDTH_RANGE");
      method_10397(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
      method_10397(2852, "GL11.GL_LINE_STIPPLE");
      method_10397(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
      method_10397(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
      method_10397(2864, "GL11.GL_LIST_MODE");
      method_10397(2865, "GL11.GL_MAX_LIST_NESTING");
      method_10397(2866, "GL11.GL_LIST_BASE");
      method_10397(2867, "GL11.GL_LIST_INDEX");
      method_10397(2880, "GL11.GL_POLYGON_MODE");
      method_10397(2881, "GL11.GL_POLYGON_SMOOTH");
      method_10397(2882, "GL11.GL_POLYGON_STIPPLE");
      method_10397(2883, "GL11.GL_EDGE_FLAG");
      method_10397(2884, "GL11.GL_CULL_FACE");
      method_10397(2885, "GL11.GL_CULL_FACE_MODE");
      method_10397(2886, "GL11.GL_FRONT_FACE");
      method_10397(2896, "GL11.GL_LIGHTING");
      method_10397(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
      method_10397(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
      method_10397(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
      method_10397(2900, "GL11.GL_SHADE_MODEL");
      method_10397(2901, "GL11.GL_COLOR_MATERIAL_FACE");
      method_10397(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
      method_10397(2903, "GL11.GL_COLOR_MATERIAL");
      method_10397(2912, "GL11.GL_FOG");
      method_10397(2913, "GL11.GL_FOG_INDEX");
      method_10397(2914, "GL11.GL_FOG_DENSITY");
      method_10397(2915, "GL11.GL_FOG_START");
      method_10397(2916, "GL11.GL_FOG_END");
      method_10397(2917, "GL11.GL_FOG_MODE");
      method_10397(2918, "GL11.GL_FOG_COLOR");
      method_10397(2928, "GL11.GL_DEPTH_RANGE");
      method_10397(2929, "GL11.GL_DEPTH_TEST");
      method_10397(2930, "GL11.GL_DEPTH_WRITEMASK");
      method_10397(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
      method_10397(2932, "GL11.GL_DEPTH_FUNC");
      method_10397(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
      method_10397(2960, "GL11.GL_STENCIL_TEST");
      method_10397(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
      method_10397(2962, "GL11.GL_STENCIL_FUNC");
      method_10397(2963, "GL11.GL_STENCIL_VALUE_MASK");
      method_10397(2964, "GL11.GL_STENCIL_FAIL");
      method_10397(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
      method_10397(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
      method_10397(2967, "GL11.GL_STENCIL_REF");
      method_10397(2968, "GL11.GL_STENCIL_WRITEMASK");
      method_10397(2976, "GL11.GL_MATRIX_MODE");
      method_10397(2977, "GL11.GL_NORMALIZE");
      method_10397(2978, "GL11.GL_VIEWPORT");
      method_10397(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
      method_10397(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
      method_10397(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
      method_10397(2982, "GL11.GL_MODELVIEW_MATRIX");
      method_10397(2983, "GL11.GL_PROJECTION_MATRIX");
      method_10397(2984, "GL11.GL_TEXTURE_MATRIX");
      method_10397(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
      method_10397(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
      method_10397(3008, "GL11.GL_ALPHA_TEST");
      method_10397(3009, "GL11.GL_ALPHA_TEST_FUNC");
      method_10397(3010, "GL11.GL_ALPHA_TEST_REF");
      method_10397(3024, "GL11.GL_DITHER");
      method_10397(3040, "GL11.GL_BLEND_DST");
      method_10397(3041, "GL11.GL_BLEND_SRC");
      method_10397(3042, "GL11.GL_BLEND");
      method_10397(3056, "GL11.GL_LOGIC_OP_MODE");
      method_10397(3057, "GL11.GL_INDEX_LOGIC_OP");
      method_10397(3058, "GL11.GL_COLOR_LOGIC_OP");
      method_10397(3072, "GL11.GL_AUX_BUFFERS");
      method_10397(3073, "GL11.GL_DRAW_BUFFER");
      method_10397(3074, "GL11.GL_READ_BUFFER");
      method_10397(3088, "GL11.GL_SCISSOR_BOX");
      method_10397(3089, "GL11.GL_SCISSOR_TEST");
      method_10397(3104, "GL11.GL_INDEX_CLEAR_VALUE");
      method_10397(3105, "GL11.GL_INDEX_WRITEMASK");
      method_10397(3106, "GL11.GL_COLOR_CLEAR_VALUE");
      method_10397(3107, "GL11.GL_COLOR_WRITEMASK");
      method_10397(3120, "GL11.GL_INDEX_MODE");
      method_10397(3121, "GL11.GL_RGBA_MODE");
      method_10397(3122, "GL11.GL_DOUBLEBUFFER");
      method_10397(3123, "GL11.GL_STEREO");
      method_10397(3136, "GL11.GL_RENDER_MODE");
      method_10397(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
      method_10397(3153, "GL11.GL_POINT_SMOOTH_HINT");
      method_10397(3154, "GL11.GL_LINE_SMOOTH_HINT");
      method_10397(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
      method_10397(3156, "GL11.GL_FOG_HINT");
      method_10397(3168, "GL11.GL_TEXTURE_GEN_S");
      method_10397(3169, "GL11.GL_TEXTURE_GEN_T");
      method_10397(3170, "GL11.GL_TEXTURE_GEN_R");
      method_10397(3171, "GL11.GL_TEXTURE_GEN_Q");
      method_10397(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
      method_10397(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
      method_10397(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
      method_10397(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
      method_10397(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
      method_10397(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
      method_10397(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
      method_10397(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
      method_10397(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
      method_10397(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
      method_10397(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
      method_10397(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
      method_10397(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
      method_10397(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
      method_10397(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
      method_10397(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
      method_10397(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
      method_10397(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
      method_10397(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
      method_10397(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
      method_10397(3312, "GL11.GL_UNPACK_SWAP_BYTES");
      method_10397(3313, "GL11.GL_UNPACK_LSB_FIRST");
      method_10397(3314, "GL11.GL_UNPACK_ROW_LENGTH");
      method_10397(3315, "GL11.GL_UNPACK_SKIP_ROWS");
      method_10397(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
      method_10397(3317, "GL11.GL_UNPACK_ALIGNMENT");
      method_10397(3328, "GL11.GL_PACK_SWAP_BYTES");
      method_10397(3329, "GL11.GL_PACK_LSB_FIRST");
      method_10397(3330, "GL11.GL_PACK_ROW_LENGTH");
      method_10397(3331, "GL11.GL_PACK_SKIP_ROWS");
      method_10397(3332, "GL11.GL_PACK_SKIP_PIXELS");
      method_10397(3333, "GL11.GL_PACK_ALIGNMENT");
      method_10397(3344, "GL11.GL_MAP_COLOR");
      method_10397(3345, "GL11.GL_MAP_STENCIL");
      method_10397(3346, "GL11.GL_INDEX_SHIFT");
      method_10397(3347, "GL11.GL_INDEX_OFFSET");
      method_10397(3348, "GL11.GL_RED_SCALE");
      method_10397(3349, "GL11.GL_RED_BIAS");
      method_10397(3350, "GL11.GL_ZOOM_X");
      method_10397(3351, "GL11.GL_ZOOM_Y");
      method_10397(3352, "GL11.GL_GREEN_SCALE");
      method_10397(3353, "GL11.GL_GREEN_BIAS");
      method_10397(3354, "GL11.GL_BLUE_SCALE");
      method_10397(3355, "GL11.GL_BLUE_BIAS");
      method_10397(3356, "GL11.GL_ALPHA_SCALE");
      method_10397(3357, "GL11.GL_ALPHA_BIAS");
      method_10397(3358, "GL11.GL_DEPTH_SCALE");
      method_10397(3359, "GL11.GL_DEPTH_BIAS");
      method_10397(3376, "GL11.GL_MAX_EVAL_ORDER");
      method_10397(3377, "GL11.GL_MAX_LIGHTS");
      method_10397(3378, "GL11.GL_MAX_CLIP_PLANES");
      method_10397(3379, "GL11.GL_MAX_TEXTURE_SIZE");
      method_10397(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
      method_10397(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
      method_10397(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
      method_10397(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
      method_10397(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
      method_10397(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
      method_10397(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
      method_10397(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
      method_10397(3408, "GL11.GL_SUBPIXEL_BITS");
      method_10397(3409, "GL11.GL_INDEX_BITS");
      method_10397(3410, "GL11.GL_RED_BITS");
      method_10397(3411, "GL11.GL_GREEN_BITS");
      method_10397(3412, "GL11.GL_BLUE_BITS");
      method_10397(3413, "GL11.GL_ALPHA_BITS");
      method_10397(3414, "GL11.GL_DEPTH_BITS");
      method_10397(3415, "GL11.GL_STENCIL_BITS");
      method_10397(3416, "GL11.GL_ACCUM_RED_BITS");
      method_10397(3417, "GL11.GL_ACCUM_GREEN_BITS");
      method_10397(3418, "GL11.GL_ACCUM_BLUE_BITS");
      method_10397(3419, "GL11.GL_ACCUM_ALPHA_BITS");
      method_10397(3440, "GL11.GL_NAME_STACK_DEPTH");
      method_10397(3456, "GL11.GL_AUTO_NORMAL");
      method_10397(3472, "GL11.GL_MAP1_COLOR_4");
      method_10397(3473, "GL11.GL_MAP1_INDEX");
      method_10397(3474, "GL11.GL_MAP1_NORMAL");
      method_10397(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
      method_10397(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
      method_10397(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
      method_10397(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
      method_10397(3479, "GL11.GL_MAP1_VERTEX_3");
      method_10397(3480, "GL11.GL_MAP1_VERTEX_4");
      method_10397(3504, "GL11.GL_MAP2_COLOR_4");
      method_10397(3505, "GL11.GL_MAP2_INDEX");
      method_10397(3506, "GL11.GL_MAP2_NORMAL");
      method_10397(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
      method_10397(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
      method_10397(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
      method_10397(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
      method_10397(3511, "GL11.GL_MAP2_VERTEX_3");
      method_10397(3512, "GL11.GL_MAP2_VERTEX_4");
      method_10397(3536, "GL11.GL_MAP1_GRID_DOMAIN");
      method_10397(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
      method_10397(3538, "GL11.GL_MAP2_GRID_DOMAIN");
      method_10397(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
      method_10397(3552, "GL11.GL_TEXTURE_1D");
      method_10397(3553, "GL11.GL_TEXTURE_2D");
      method_10397(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
      method_10397(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
      method_10397(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
      method_10397(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
      method_10397(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
      method_10397(4096, "GL11.GL_TEXTURE_WIDTH");
      method_10397(4097, "GL11.GL_TEXTURE_HEIGHT");
      method_10397(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
      method_10397(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
      method_10397(4101, "GL11.GL_TEXTURE_BORDER");
      method_10397(4352, "GL11.GL_DONT_CARE");
      method_10397(4353, "GL11.GL_FASTEST");
      method_10397(4354, "GL11.GL_NICEST");
      method_10397(16384, "GL11.GL_LIGHT0");
      method_10397(16385, "GL11.GL_LIGHT1");
      method_10397(16386, "GL11.GL_LIGHT2");
      method_10397(16387, "GL11.GL_LIGHT3");
      method_10397(16388, "GL11.GL_LIGHT4");
      method_10397(16389, "GL11.GL_LIGHT5");
      method_10397(16390, "GL11.GL_LIGHT6");
      method_10397(16391, "GL11.GL_LIGHT7");
      method_10397(4608, "GL11.GL_AMBIENT");
      method_10397(4609, "GL11.GL_DIFFUSE");
      method_10397(4610, "GL11.GL_SPECULAR");
      method_10397(4611, "GL11.GL_POSITION");
      method_10397(4612, "GL11.GL_SPOT_DIRECTION");
      method_10397(4613, "GL11.GL_SPOT_EXPONENT");
      method_10397(4614, "GL11.GL_SPOT_CUTOFF");
      method_10397(4615, "GL11.GL_CONSTANT_ATTENUATION");
      method_10397(4616, "GL11.GL_LINEAR_ATTENUATION");
      method_10397(4617, "GL11.GL_QUADRATIC_ATTENUATION");
      method_10397(4864, "GL11.GL_COMPILE");
      method_10397(4865, "GL11.GL_COMPILE_AND_EXECUTE");
      method_10397(5376, "GL11.GL_CLEAR");
      method_10397(5377, "GL11.GL_AND");
      method_10397(5378, "GL11.GL_AND_REVERSE");
      method_10397(5379, "GL11.GL_COPY");
      method_10397(5380, "GL11.GL_AND_INVERTED");
      method_10397(5381, "GL11.GL_NOOP");
      method_10397(5382, "GL11.GL_XOR");
      method_10397(5383, "GL11.GL_OR");
      method_10397(5384, "GL11.GL_NOR");
      method_10397(5385, "GL11.GL_EQUIV");
      method_10397(5386, "GL11.GL_INVERT");
      method_10397(5387, "GL11.GL_OR_REVERSE");
      method_10397(5388, "GL11.GL_COPY_INVERTED");
      method_10397(5389, "GL11.GL_OR_INVERTED");
      method_10397(5390, "GL11.GL_NAND");
      method_10397(5391, "GL11.GL_SET");
      method_10397(5632, "GL11.GL_EMISSION");
      method_10397(5633, "GL11.GL_SHININESS");
      method_10397(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
      method_10397(5635, "GL11.GL_COLOR_INDEXES");
      method_10397(5888, "GL11.GL_MODELVIEW");
      method_10397(5889, "GL11.GL_PROJECTION");
      method_10397(5890, "GL11.GL_TEXTURE");
      method_10397(6144, "GL11.GL_COLOR");
      method_10397(6145, "GL11.GL_DEPTH");
      method_10397(6146, "GL11.GL_STENCIL");
      method_10397(6400, "GL11.GL_COLOR_INDEX");
      method_10397(6401, "GL11.GL_STENCIL_INDEX");
      method_10397(6402, "GL11.GL_DEPTH_COMPONENT");
      method_10397(6403, "GL11.GL_RED");
      method_10397(6404, "GL11.GL_GREEN");
      method_10397(6405, "GL11.GL_BLUE");
      method_10397(6406, "GL11.GL_ALPHA");
      method_10397(6407, "GL11.GL_RGB");
      method_10397(6408, "GL11.GL_RGBA");
      method_10397(6409, "GL11.GL_LUMINANCE");
      method_10397(6410, "GL11.GL_LUMINANCE_ALPHA");
      method_10397(6656, "GL11.GL_BITMAP");
      method_10397(6912, "GL11.GL_POINT");
      method_10397(6913, "GL11.GL_LINE");
      method_10397(6914, "GL11.GL_FILL");
      method_10397(7168, "GL11.GL_RENDER");
      method_10397(7169, "GL11.GL_FEEDBACK");
      method_10397(7170, "GL11.GL_SELECT");
      method_10397(7424, "GL11.GL_FLAT");
      method_10397(7425, "GL11.GL_SMOOTH");
      method_10397(7680, "GL11.GL_KEEP");
      method_10397(7681, "GL11.GL_REPLACE");
      method_10397(7682, "GL11.GL_INCR");
      method_10397(7683, "GL11.GL_DECR");
      method_10397(7936, "GL11.GL_VENDOR");
      method_10397(7937, "GL11.GL_RENDERER");
      method_10397(7938, "GL11.GL_VERSION");
      method_10397(7939, "GL11.GL_EXTENSIONS");
      method_10397(8192, "GL11.GL_S");
      method_10397(8193, "GL11.GL_T");
      method_10397(8194, "GL11.GL_R");
      method_10397(8195, "GL11.GL_Q");
      method_10397(8448, "GL11.GL_MODULATE");
      method_10397(8449, "GL11.GL_DECAL");
      method_10397(8704, "GL11.GL_TEXTURE_ENV_MODE");
      method_10397(8705, "GL11.GL_TEXTURE_ENV_COLOR");
      method_10397(8960, "GL11.GL_TEXTURE_ENV");
      method_10397(9216, "GL11.GL_EYE_LINEAR");
      method_10397(9217, "GL11.GL_OBJECT_LINEAR");
      method_10397(9218, "GL11.GL_SPHERE_MAP");
      method_10397(9472, "GL11.GL_TEXTURE_GEN_MODE");
      method_10397(9473, "GL11.GL_OBJECT_PLANE");
      method_10397(9474, "GL11.GL_EYE_PLANE");
      method_10397(9728, "GL11.GL_NEAREST");
      method_10397(9729, "GL11.GL_LINEAR");
      method_10397(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
      method_10397(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
      method_10397(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
      method_10397(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
      method_10397(10240, "GL11.GL_TEXTURE_MAG_FILTER");
      method_10397(10241, "GL11.GL_TEXTURE_MIN_FILTER");
      method_10397(10242, "GL11.GL_TEXTURE_WRAP_S");
      method_10397(10243, "GL11.GL_TEXTURE_WRAP_T");
      method_10397(10496, "GL11.GL_CLAMP");
      method_10397(10497, "GL11.GL_REPEAT");
      method_10397(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
      method_10397(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
      method_10397(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
      method_10397(10753, "GL11.GL_POLYGON_OFFSET_POINT");
      method_10397(10754, "GL11.GL_POLYGON_OFFSET_LINE");
      method_10397(32823, "GL11.GL_POLYGON_OFFSET_FILL");
      method_10397(32827, "GL11.GL_ALPHA4");
      method_10397(32828, "GL11.GL_ALPHA8");
      method_10397(32829, "GL11.GL_ALPHA12");
      method_10397(32830, "GL11.GL_ALPHA16");
      method_10397(32831, "GL11.GL_LUMINANCE4");
      method_10397(32832, "GL11.GL_LUMINANCE8");
      method_10397(32833, "GL11.GL_LUMINANCE12");
      method_10397(32834, "GL11.GL_LUMINANCE16");
      method_10397(32835, "GL11.GL_LUMINANCE4_ALPHA4");
      method_10397(32836, "GL11.GL_LUMINANCE6_ALPHA2");
      method_10397(32837, "GL11.GL_LUMINANCE8_ALPHA8");
      method_10397(32838, "GL11.GL_LUMINANCE12_ALPHA4");
      method_10397(32839, "GL11.GL_LUMINANCE12_ALPHA12");
      method_10397(32840, "GL11.GL_LUMINANCE16_ALPHA16");
      method_10397(32841, "GL11.GL_INTENSITY");
      method_10397(32842, "GL11.GL_INTENSITY4");
      method_10397(32843, "GL11.GL_INTENSITY8");
      method_10397(32844, "GL11.GL_INTENSITY12");
      method_10397(32845, "GL11.GL_INTENSITY16");
      method_10397(10768, "GL11.GL_R3_G3_B2");
      method_10397(32847, "GL11.GL_RGB4");
      method_10397(32848, "GL11.GL_RGB5");
      method_10397(32849, "GL11.GL_RGB8");
      method_10397(32850, "GL11.GL_RGB10");
      method_10397(32851, "GL11.GL_RGB12");
      method_10397(32852, "GL11.GL_RGB16");
      method_10397(32853, "GL11.GL_RGBA2");
      method_10397(32854, "GL11.GL_RGBA4");
      method_10397(32855, "GL11.GL_RGB5_A1");
      method_10397(32856, "GL11.GL_RGBA8");
      method_10397(32857, "GL11.GL_RGB10_A2");
      method_10397(32858, "GL11.GL_RGBA12");
      method_10397(32859, "GL11.GL_RGBA16");
      method_10397(32860, "GL11.GL_TEXTURE_RED_SIZE");
      method_10397(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
      method_10397(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
      method_10397(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
      method_10397(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
      method_10397(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
      method_10397(32867, "GL11.GL_PROXY_TEXTURE_1D");
      method_10397(32868, "GL11.GL_PROXY_TEXTURE_2D");
      method_10397(32870, "GL11.GL_TEXTURE_PRIORITY");
      method_10397(32871, "GL11.GL_TEXTURE_RESIDENT");
      method_10397(32872, "GL11.GL_TEXTURE_BINDING_1D");
      method_10397(32873, "GL11.GL_TEXTURE_BINDING_2D");
      method_10397(32884, "GL11.GL_VERTEX_ARRAY");
      method_10397(32885, "GL11.GL_NORMAL_ARRAY");
      method_10397(32886, "GL11.GL_COLOR_ARRAY");
      method_10397(32887, "GL11.GL_INDEX_ARRAY");
      method_10397(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
      method_10397(32889, "GL11.GL_EDGE_FLAG_ARRAY");
      method_10397(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
      method_10397(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
      method_10397(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
      method_10397(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
      method_10397(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
      method_10397(32897, "GL11.GL_COLOR_ARRAY_SIZE");
      method_10397(32898, "GL11.GL_COLOR_ARRAY_TYPE");
      method_10397(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
      method_10397(32901, "GL11.GL_INDEX_ARRAY_TYPE");
      method_10397(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
      method_10397(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
      method_10397(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
      method_10397(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
      method_10397(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
      method_10397(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
      method_10397(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
      method_10397(32912, "GL11.GL_COLOR_ARRAY_POINTER");
      method_10397(32913, "GL11.GL_INDEX_ARRAY_POINTER");
      method_10397(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
      method_10397(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
      method_10397(10784, "GL11.GL_V2F");
      method_10397(10785, "GL11.GL_V3F");
      method_10397(10786, "GL11.GL_C4UB_V2F");
      method_10397(10787, "GL11.GL_C4UB_V3F");
      method_10397(10788, "GL11.GL_C3F_V3F");
      method_10397(10789, "GL11.GL_N3F_V3F");
      method_10397(10790, "GL11.GL_C4F_N3F_V3F");
      method_10397(10791, "GL11.GL_T2F_V3F");
      method_10397(10792, "GL11.GL_T4F_V4F");
      method_10397(10793, "GL11.GL_T2F_C4UB_V3F");
      method_10397(10794, "GL11.GL_T2F_C3F_V3F");
      method_10397(10795, "GL11.GL_T2F_N3F_V3F");
      method_10397(10796, "GL11.GL_T2F_C4F_N3F_V3F");
      method_10397(10797, "GL11.GL_T4F_C4F_N3F_V4F");
      method_10397(3057, "GL11.GL_LOGIC_OP");
      method_10397(4099, "GL11.GL_TEXTURE_COMPONENTS");
      method_10397(32874, "GL12.GL_TEXTURE_BINDING_3D");
      method_10397(32875, "GL12.GL_PACK_SKIP_IMAGES");
      method_10397(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
      method_10397(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
      method_10397(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
      method_10397(32879, "GL12.GL_TEXTURE_3D");
      method_10397(32880, "GL12.GL_PROXY_TEXTURE_3D");
      method_10397(32881, "GL12.GL_TEXTURE_DEPTH");
      method_10397(32882, "GL12.GL_TEXTURE_WRAP_R");
      method_10397(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
      method_10397(32992, "GL12.GL_BGR");
      method_10397(32993, "GL12.GL_BGRA");
      method_10397(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
      method_10397(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
      method_10397(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
      method_10397(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
      method_10397(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
      method_10397(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
      method_10397(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
      method_10397(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
      method_10397(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
      method_10397(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
      method_10397(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
      method_10397(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
      method_10397(32826, "GL12.GL_RESCALE_NORMAL");
      method_10397(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
      method_10397(33273, "GL12.GL_SINGLE_COLOR");
      method_10397(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
      method_10397(33071, "GL12.GL_CLAMP_TO_EDGE");
      method_10397(33082, "GL12.GL_TEXTURE_MIN_LOD");
      method_10397(33083, "GL12.GL_TEXTURE_MAX_LOD");
      method_10397(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
      method_10397(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
      method_10397(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
      method_10397(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
      method_10397(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
      method_10397(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
      method_10397(33984, "GL13.GL_TEXTURE0");
      method_10397(33985, "GL13.GL_TEXTURE1");
      method_10397(33986, "GL13.GL_TEXTURE2");
      method_10397(33987, "GL13.GL_TEXTURE3");
      method_10397(33988, "GL13.GL_TEXTURE4");
      method_10397(33989, "GL13.GL_TEXTURE5");
      method_10397(33990, "GL13.GL_TEXTURE6");
      method_10397(33991, "GL13.GL_TEXTURE7");
      method_10397(33992, "GL13.GL_TEXTURE8");
      method_10397(33993, "GL13.GL_TEXTURE9");
      method_10397(33994, "GL13.GL_TEXTURE10");
      method_10397(33995, "GL13.GL_TEXTURE11");
      method_10397(33996, "GL13.GL_TEXTURE12");
      method_10397(33997, "GL13.GL_TEXTURE13");
      method_10397(33998, "GL13.GL_TEXTURE14");
      method_10397(33999, "GL13.GL_TEXTURE15");
      method_10397(34000, "GL13.GL_TEXTURE16");
      method_10397(34001, "GL13.GL_TEXTURE17");
      method_10397(34002, "GL13.GL_TEXTURE18");
      method_10397(34003, "GL13.GL_TEXTURE19");
      method_10397(34004, "GL13.GL_TEXTURE20");
      method_10397(34005, "GL13.GL_TEXTURE21");
      method_10397(34006, "GL13.GL_TEXTURE22");
      method_10397(34007, "GL13.GL_TEXTURE23");
      method_10397(34008, "GL13.GL_TEXTURE24");
      method_10397(34009, "GL13.GL_TEXTURE25");
      method_10397(34010, "GL13.GL_TEXTURE26");
      method_10397(34011, "GL13.GL_TEXTURE27");
      method_10397(34012, "GL13.GL_TEXTURE28");
      method_10397(34013, "GL13.GL_TEXTURE29");
      method_10397(34014, "GL13.GL_TEXTURE30");
      method_10397(34015, "GL13.GL_TEXTURE31");
      method_10397(34016, "GL13.GL_ACTIVE_TEXTURE");
      method_10397(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
      method_10397(34018, "GL13.GL_MAX_TEXTURE_UNITS");
      method_10397(34065, "GL13.GL_NORMAL_MAP");
      method_10397(34066, "GL13.GL_REFLECTION_MAP");
      method_10397(34067, "GL13.GL_TEXTURE_CUBE_MAP");
      method_10397(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
      method_10397(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
      method_10397(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
      method_10397(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
      method_10397(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
      method_10397(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
      method_10397(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
      method_10397(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
      method_10397(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
      method_10397(34025, "GL13.GL_COMPRESSED_ALPHA");
      method_10397(34026, "GL13.GL_COMPRESSED_LUMINANCE");
      method_10397(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
      method_10397(34028, "GL13.GL_COMPRESSED_INTENSITY");
      method_10397(34029, "GL13.GL_COMPRESSED_RGB");
      method_10397(34030, "GL13.GL_COMPRESSED_RGBA");
      method_10397(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
      method_10397(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
      method_10397(34465, "GL13.GL_TEXTURE_COMPRESSED");
      method_10397(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
      method_10397(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
      method_10397(32925, "GL13.GL_MULTISAMPLE");
      method_10397(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
      method_10397(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
      method_10397(32928, "GL13.GL_SAMPLE_COVERAGE");
      method_10397(32936, "GL13.GL_SAMPLE_BUFFERS");
      method_10397(32937, "GL13.GL_SAMPLES");
      method_10397(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
      method_10397(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
      method_10397(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
      method_10397(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
      method_10397(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
      method_10397(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
      method_10397(34160, "GL13.GL_COMBINE");
      method_10397(34161, "GL13.GL_COMBINE_RGB");
      method_10397(34162, "GL13.GL_COMBINE_ALPHA");
      method_10397(34176, "GL13.GL_SOURCE0_RGB");
      method_10397(34177, "GL13.GL_SOURCE1_RGB");
      method_10397(34178, "GL13.GL_SOURCE2_RGB");
      method_10397(34184, "GL13.GL_SOURCE0_ALPHA");
      method_10397(34185, "GL13.GL_SOURCE1_ALPHA");
      method_10397(34186, "GL13.GL_SOURCE2_ALPHA");
      method_10397(34192, "GL13.GL_OPERAND0_RGB");
      method_10397(34193, "GL13.GL_OPERAND1_RGB");
      method_10397(34194, "GL13.GL_OPERAND2_RGB");
      method_10397(34200, "GL13.GL_OPERAND0_ALPHA");
      method_10397(34201, "GL13.GL_OPERAND1_ALPHA");
      method_10397(34202, "GL13.GL_OPERAND2_ALPHA");
      method_10397(34163, "GL13.GL_RGB_SCALE");
      method_10397(34164, "GL13.GL_ADD_SIGNED");
      method_10397(34165, "GL13.GL_INTERPOLATE");
      method_10397(34023, "GL13.GL_SUBTRACT");
      method_10397(34166, "GL13.GL_CONSTANT");
      method_10397(34167, "GL13.GL_PRIMARY_COLOR");
      method_10397(34168, "GL13.GL_PREVIOUS");
      method_10397(34478, "GL13.GL_DOT3_RGB");
      method_10397(34479, "GL13.GL_DOT3_RGBA");
      method_10397(33069, "GL13.GL_CLAMP_TO_BORDER");
      method_10397(33169, "GL14.GL_GENERATE_MIPMAP");
      method_10397(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
      method_10397(33189, "GL14.GL_DEPTH_COMPONENT16");
      method_10397(33190, "GL14.GL_DEPTH_COMPONENT24");
      method_10397(33191, "GL14.GL_DEPTH_COMPONENT32");
      method_10397(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
      method_10397(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
      method_10397(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
      method_10397(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
      method_10397(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
      method_10397(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
      method_10397(33873, "GL14.GL_FOG_COORDINATE");
      method_10397(33874, "GL14.GL_FRAGMENT_DEPTH");
      method_10397(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
      method_10397(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
      method_10397(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
      method_10397(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
      method_10397(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
      method_10397(33062, "GL14.GL_POINT_SIZE_MIN");
      method_10397(33063, "GL14.GL_POINT_SIZE_MAX");
      method_10397(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
      method_10397(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
      method_10397(33880, "GL14.GL_COLOR_SUM");
      method_10397(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
      method_10397(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
      method_10397(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
      method_10397(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
      method_10397(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
      method_10397(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
      method_10397(32968, "GL14.GL_BLEND_DST_RGB");
      method_10397(32969, "GL14.GL_BLEND_SRC_RGB");
      method_10397(32970, "GL14.GL_BLEND_DST_ALPHA");
      method_10397(32971, "GL14.GL_BLEND_SRC_ALPHA");
      method_10397(34055, "GL14.GL_INCR_WRAP");
      method_10397(34056, "GL14.GL_DECR_WRAP");
      method_10397(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
      method_10397(34049, "GL14.GL_TEXTURE_LOD_BIAS");
      method_10397(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
      method_10397(33648, "GL14.GL_MIRRORED_REPEAT");
      method_10397(32773, "ARBImaging.GL_BLEND_COLOR");
      method_10397(32777, "ARBImaging.GL_BLEND_EQUATION");
      method_10397(32774, "GL14.GL_FUNC_ADD");
      method_10397(32778, "GL14.GL_FUNC_SUBTRACT");
      method_10397(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
      method_10397(32775, "GL14.GL_MIN");
      method_10397(32776, "GL14.GL_MAX");
      method_10397(34962, "GL15.GL_ARRAY_BUFFER");
      method_10397(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
      method_10397(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
      method_10397(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
      method_10397(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
      method_10397(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
      method_10397(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
      method_10397(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
      method_10397(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
      method_10397(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
      method_10397(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
      method_10397(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
      method_10397(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
      method_10397(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
      method_10397(35040, "GL15.GL_STREAM_DRAW");
      method_10397(35041, "GL15.GL_STREAM_READ");
      method_10397(35042, "GL15.GL_STREAM_COPY");
      method_10397(35044, "GL15.GL_STATIC_DRAW");
      method_10397(35045, "GL15.GL_STATIC_READ");
      method_10397(35046, "GL15.GL_STATIC_COPY");
      method_10397(35048, "GL15.GL_DYNAMIC_DRAW");
      method_10397(35049, "GL15.GL_DYNAMIC_READ");
      method_10397(35050, "GL15.GL_DYNAMIC_COPY");
      method_10397(35000, "GL15.GL_READ_ONLY");
      method_10397(35001, "GL15.GL_WRITE_ONLY");
      method_10397(35002, "GL15.GL_READ_WRITE");
      method_10397(34660, "GL15.GL_BUFFER_SIZE");
      method_10397(34661, "GL15.GL_BUFFER_USAGE");
      method_10397(35003, "GL15.GL_BUFFER_ACCESS");
      method_10397(35004, "GL15.GL_BUFFER_MAPPED");
      method_10397(35005, "GL15.GL_BUFFER_MAP_POINTER");
      method_10397(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
      method_10397(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
      method_10397(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
   }
}

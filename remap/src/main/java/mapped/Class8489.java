// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;
import java.util.function.Consumer;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL;
import java.util.Arrays;
import org.lwjgl.opengl.GLDebugMessageCallback;
import java.util.List;
import java.util.Map;
import com.google.common.base.Joiner;
import java.nio.IntBuffer;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.Logger;

public class Class8489
{
    private static final Logger field34836;
    public static final ByteBuffer field34837;
    public static final FloatBuffer field34838;
    public static final IntBuffer field34839;
    private static final Joiner field34840;
    private static final Joiner field34841;
    private static final Map<Integer, String> field34842;
    private static final List<Integer> field34843;
    private static final List<Integer> field34844;
    private static final Map<String, List<String>> field34845;
    
    private static String method28347(final int i) {
        return "Unknown (0x" + Integer.toHexString(i).toUpperCase() + ")";
    }
    
    private static String method28348(final int n) {
        switch (n) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WINDOW SYSTEM";
            }
            case 33352: {
                return "SHADER COMPILER";
            }
            case 33353: {
                return "THIRD PARTY";
            }
            case 33354: {
                return "APPLICATION";
            }
            case 33355: {
                return "OTHER";
            }
            default: {
                return method28347(n);
            }
        }
    }
    
    private static String method28349(final int n) {
        switch (n) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED BEHAVIOR";
            }
            case 33358: {
                return "UNDEFINED BEHAVIOR";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
            case 33384: {
                return "MARKER";
            }
            default: {
                return method28347(n);
            }
        }
    }
    
    private static String method28350(final int n) {
        switch (n) {
            case 33387: {
                return "NOTIFICATION";
            }
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
            default: {
                return method28347(n);
            }
        }
    }
    
    private static void method28351(final int n, final int n2, final int n3, final int n4, final int n5, final long n6, final long n7) {
        if (!Config.method28955() || n != 33352) {
            final Class869 method5277 = Class869.method5277();
            if (method5277 != null) {
                if (method5277.method5332() != null) {
                    if (method5277.method5332().method7704()) {
                        return;
                    }
                }
            }
            if (Class8492.method28378(n3)) {
                final String method5278 = method28348(n);
                final String method5279 = method28349(n2);
                method28350(n4);
                final String method5280 = Class9518.method35531(GLDebugMessageCallback.getMessage(n5, n6), " \n\r\t");
                final String format = String.format("OpenGL %s %s: %s (%s)", method5278, method5279, n3, method5280);
                final Exception ex = new Exception("Stack trace");
                final StackTraceElement[] stackTrace = ex.getStackTrace();
                ex.setStackTrace((stackTrace.length <= 2) ? stackTrace : Arrays.copyOfRange(stackTrace, 2, stackTrace.length));
                if (n2 != 33356) {
                    Class8489.field34836.info(format, (Throwable)ex);
                }
                else {
                    Class8489.field34836.error(format, (Throwable)ex);
                }
                if (Config.method29013()) {
                    if (Class9419.method35020("ShowGlErrorDebug", 10000L)) {
                        String method5281 = Config.method29017(n3);
                        if (n3 == 0 || Config.equals(method5281, "Unknown")) {
                            method5281 = method5280;
                        }
                        Class869.method5277().field4647.method3807().method3761(new StringTextComponent(Class8822.method30773("of.message.openglError", n3, method5281)));
                    }
                }
            }
        }
    }
    
    private static void method28352(final int i, final String value) {
        Class8489.field34842.merge(i, value, (str, str2) -> str + "/" + str2);
    }
    
    public static void method28353(final int n, final boolean b) {
        Class8726.method29989(Class8726::method29990);
        if (n > 0) {
            final GLCapabilities capabilities = GL.getCapabilities();
            if (!capabilities.GL_KHR_debug) {
                if (capabilities.GL_ARB_debug_output) {
                    if (b) {
                        GL11.glEnable(33346);
                    }
                    for (int i = 0; i < Class8489.field34844.size(); ++i) {
                        ARBDebugOutput.glDebugMessageControlARB(4352, 4352, (int)Class8489.field34844.get(i), (int[])null, i < n);
                    }
                    ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)Class8543.method28675((GLDebugMessageARBCallbackI)GLDebugMessageARBCallback.create(Class8489::method28351), (Consumer<GLDebugMessageARBCallbackI>)Class7308::method22415), 0L);
                }
            }
            else {
                GL11.glEnable(37600);
                if (b) {
                    GL11.glEnable(33346);
                }
                for (int j = 0; j < Class8489.field34843.size(); ++j) {
                    KHRDebug.glDebugMessageControl(4352, 4352, (int)Class8489.field34843.get(j), (int[])null, j < n);
                }
                KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)Class8543.method28675((GLDebugMessageCallbackI)GLDebugMessageCallback.create(Class8489::method28351), (Consumer<GLDebugMessageCallbackI>)Class7308::method22415), 0L);
            }
        }
    }
    
    static {
        field34836 = LogManager.getLogger();
        field34837 = Class9078.method32715(64);
        field34838 = Class8489.field34837.asFloatBuffer();
        field34839 = Class8489.field34837.asIntBuffer();
        field34840 = Joiner.on('\n');
        field34841 = Joiner.on("; ");
        field34842 = Maps.newHashMap();
        field34843 = (List)ImmutableList.of((Object)37190, (Object)37191, (Object)37192, (Object)33387);
        field34844 = (List)ImmutableList.of((Object)37190, (Object)37191, (Object)37192);
        field34845 = Maps.newHashMap();
        method28352(256, "GL11.GL_ACCUM");
        method28352(257, "GL11.GL_LOAD");
        method28352(258, "GL11.GL_RETURN");
        method28352(259, "GL11.GL_MULT");
        method28352(260, "GL11.GL_ADD");
        method28352(512, "GL11.GL_NEVER");
        method28352(513, "GL11.GL_LESS");
        method28352(514, "GL11.GL_EQUAL");
        method28352(515, "GL11.GL_LEQUAL");
        method28352(516, "GL11.GL_GREATER");
        method28352(517, "GL11.GL_NOTEQUAL");
        method28352(518, "GL11.GL_GEQUAL");
        method28352(519, "GL11.GL_ALWAYS");
        method28352(0, "GL11.GL_POINTS");
        method28352(1, "GL11.GL_LINES");
        method28352(2, "GL11.GL_LINE_LOOP");
        method28352(3, "GL11.GL_LINE_STRIP");
        method28352(4, "GL11.GL_TRIANGLES");
        method28352(5, "GL11.GL_TRIANGLE_STRIP");
        method28352(6, "GL11.GL_TRIANGLE_FAN");
        method28352(7, "GL11.GL_QUADS");
        method28352(8, "GL11.GL_QUAD_STRIP");
        method28352(9, "GL11.GL_POLYGON");
        method28352(0, "GL11.GL_ZERO");
        method28352(1, "GL11.GL_ONE");
        method28352(768, "GL11.GL_SRC_COLOR");
        method28352(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
        method28352(770, "GL11.GL_SRC_ALPHA");
        method28352(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
        method28352(772, "GL11.GL_DST_ALPHA");
        method28352(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
        method28352(774, "GL11.GL_DST_COLOR");
        method28352(775, "GL11.GL_ONE_MINUS_DST_COLOR");
        method28352(776, "GL11.GL_SRC_ALPHA_SATURATE");
        method28352(32769, "GL14.GL_CONSTANT_COLOR");
        method28352(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
        method28352(32771, "GL14.GL_CONSTANT_ALPHA");
        method28352(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
        method28352(1, "GL11.GL_TRUE");
        method28352(0, "GL11.GL_FALSE");
        method28352(12288, "GL11.GL_CLIP_PLANE0");
        method28352(12289, "GL11.GL_CLIP_PLANE1");
        method28352(12290, "GL11.GL_CLIP_PLANE2");
        method28352(12291, "GL11.GL_CLIP_PLANE3");
        method28352(12292, "GL11.GL_CLIP_PLANE4");
        method28352(12293, "GL11.GL_CLIP_PLANE5");
        method28352(5120, "GL11.GL_BYTE");
        method28352(5121, "GL11.GL_UNSIGNED_BYTE");
        method28352(5122, "GL11.GL_SHORT");
        method28352(5123, "GL11.GL_UNSIGNED_SHORT");
        method28352(5124, "GL11.GL_INT");
        method28352(5125, "GL11.GL_UNSIGNED_INT");
        method28352(5126, "GL11.GL_FLOAT");
        method28352(5127, "GL11.GL_2_BYTES");
        method28352(5128, "GL11.GL_3_BYTES");
        method28352(5129, "GL11.GL_4_BYTES");
        method28352(5130, "GL11.GL_DOUBLE");
        method28352(0, "GL11.GL_NONE");
        method28352(1024, "GL11.GL_FRONT_LEFT");
        method28352(1025, "GL11.GL_FRONT_RIGHT");
        method28352(1026, "GL11.GL_BACK_LEFT");
        method28352(1027, "GL11.GL_BACK_RIGHT");
        method28352(1028, "GL11.GL_FRONT");
        method28352(1029, "GL11.GL_BACK");
        method28352(1030, "GL11.GL_LEFT");
        method28352(1031, "GL11.GL_RIGHT");
        method28352(1032, "GL11.GL_FRONT_AND_BACK");
        method28352(1033, "GL11.GL_AUX0");
        method28352(1034, "GL11.GL_AUX1");
        method28352(1035, "GL11.GL_AUX2");
        method28352(1036, "GL11.GL_AUX3");
        method28352(0, "GL11.GL_NO_ERROR");
        method28352(1280, "GL11.GL_INVALID_ENUM");
        method28352(1281, "GL11.GL_INVALID_VALUE");
        method28352(1282, "GL11.GL_INVALID_OPERATION");
        method28352(1283, "GL11.GL_STACK_OVERFLOW");
        method28352(1284, "GL11.GL_STACK_UNDERFLOW");
        method28352(1285, "GL11.GL_OUT_OF_MEMORY");
        method28352(1536, "GL11.GL_2D");
        method28352(1537, "GL11.GL_3D");
        method28352(1538, "GL11.GL_3D_COLOR");
        method28352(1539, "GL11.GL_3D_COLOR_TEXTURE");
        method28352(1540, "GL11.GL_4D_COLOR_TEXTURE");
        method28352(1792, "GL11.GL_PASS_THROUGH_TOKEN");
        method28352(1793, "GL11.GL_POINT_TOKEN");
        method28352(1794, "GL11.GL_LINE_TOKEN");
        method28352(1795, "GL11.GL_POLYGON_TOKEN");
        method28352(1796, "GL11.GL_BITMAP_TOKEN");
        method28352(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
        method28352(1798, "GL11.GL_COPY_PIXEL_TOKEN");
        method28352(1799, "GL11.GL_LINE_RESET_TOKEN");
        method28352(2048, "GL11.GL_EXP");
        method28352(2049, "GL11.GL_EXP2");
        method28352(2304, "GL11.GL_CW");
        method28352(2305, "GL11.GL_CCW");
        method28352(2560, "GL11.GL_COEFF");
        method28352(2561, "GL11.GL_ORDER");
        method28352(2562, "GL11.GL_DOMAIN");
        method28352(2816, "GL11.GL_CURRENT_COLOR");
        method28352(2817, "GL11.GL_CURRENT_INDEX");
        method28352(2818, "GL11.GL_CURRENT_NORMAL");
        method28352(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
        method28352(2820, "GL11.GL_CURRENT_RASTER_COLOR");
        method28352(2821, "GL11.GL_CURRENT_RASTER_INDEX");
        method28352(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
        method28352(2823, "GL11.GL_CURRENT_RASTER_POSITION");
        method28352(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
        method28352(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
        method28352(2832, "GL11.GL_POINT_SMOOTH");
        method28352(2833, "GL11.GL_POINT_SIZE");
        method28352(2834, "GL11.GL_POINT_SIZE_RANGE");
        method28352(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
        method28352(2848, "GL11.GL_LINE_SMOOTH");
        method28352(2849, "GL11.GL_LINE_WIDTH");
        method28352(2850, "GL11.GL_LINE_WIDTH_RANGE");
        method28352(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
        method28352(2852, "GL11.GL_LINE_STIPPLE");
        method28352(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
        method28352(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
        method28352(2864, "GL11.GL_LIST_MODE");
        method28352(2865, "GL11.GL_MAX_LIST_NESTING");
        method28352(2866, "GL11.GL_LIST_BASE");
        method28352(2867, "GL11.GL_LIST_INDEX");
        method28352(2880, "GL11.GL_POLYGON_MODE");
        method28352(2881, "GL11.GL_POLYGON_SMOOTH");
        method28352(2882, "GL11.GL_POLYGON_STIPPLE");
        method28352(2883, "GL11.GL_EDGE_FLAG");
        method28352(2884, "GL11.GL_CULL_FACE");
        method28352(2885, "GL11.GL_CULL_FACE_MODE");
        method28352(2886, "GL11.GL_FRONT_FACE");
        method28352(2896, "GL11.GL_LIGHTING");
        method28352(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
        method28352(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
        method28352(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
        method28352(2900, "GL11.GL_SHADE_MODEL");
        method28352(2901, "GL11.GL_COLOR_MATERIAL_FACE");
        method28352(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
        method28352(2903, "GL11.GL_COLOR_MATERIAL");
        method28352(2912, "GL11.GL_FOG");
        method28352(2913, "GL11.GL_FOG_INDEX");
        method28352(2914, "GL11.GL_FOG_DENSITY");
        method28352(2915, "GL11.GL_FOG_START");
        method28352(2916, "GL11.GL_FOG_END");
        method28352(2917, "GL11.GL_FOG_MODE");
        method28352(2918, "GL11.GL_FOG_COLOR");
        method28352(2928, "GL11.GL_DEPTH_RANGE");
        method28352(2929, "GL11.GL_DEPTH_TEST");
        method28352(2930, "GL11.GL_DEPTH_WRITEMASK");
        method28352(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
        method28352(2932, "GL11.GL_DEPTH_FUNC");
        method28352(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
        method28352(2960, "GL11.GL_STENCIL_TEST");
        method28352(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
        method28352(2962, "GL11.GL_STENCIL_FUNC");
        method28352(2963, "GL11.GL_STENCIL_VALUE_MASK");
        method28352(2964, "GL11.GL_STENCIL_FAIL");
        method28352(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
        method28352(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
        method28352(2967, "GL11.GL_STENCIL_REF");
        method28352(2968, "GL11.GL_STENCIL_WRITEMASK");
        method28352(2976, "GL11.GL_MATRIX_MODE");
        method28352(2977, "GL11.GL_NORMALIZE");
        method28352(2978, "GL11.GL_VIEWPORT");
        method28352(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
        method28352(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
        method28352(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
        method28352(2982, "GL11.GL_MODELVIEW_MATRIX");
        method28352(2983, "GL11.GL_PROJECTION_MATRIX");
        method28352(2984, "GL11.GL_TEXTURE_MATRIX");
        method28352(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
        method28352(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
        method28352(3008, "GL11.GL_ALPHA_TEST");
        method28352(3009, "GL11.GL_ALPHA_TEST_FUNC");
        method28352(3010, "GL11.GL_ALPHA_TEST_REF");
        method28352(3024, "GL11.GL_DITHER");
        method28352(3040, "GL11.GL_BLEND_DST");
        method28352(3041, "GL11.GL_BLEND_SRC");
        method28352(3042, "GL11.GL_BLEND");
        method28352(3056, "GL11.GL_LOGIC_OP_MODE");
        method28352(3057, "GL11.GL_INDEX_LOGIC_OP");
        method28352(3058, "GL11.GL_COLOR_LOGIC_OP");
        method28352(3072, "GL11.GL_AUX_BUFFERS");
        method28352(3073, "GL11.GL_DRAW_BUFFER");
        method28352(3074, "GL11.GL_READ_BUFFER");
        method28352(3088, "GL11.GL_SCISSOR_BOX");
        method28352(3089, "GL11.GL_SCISSOR_TEST");
        method28352(3104, "GL11.GL_INDEX_CLEAR_VALUE");
        method28352(3105, "GL11.GL_INDEX_WRITEMASK");
        method28352(3106, "GL11.GL_COLOR_CLEAR_VALUE");
        method28352(3107, "GL11.GL_COLOR_WRITEMASK");
        method28352(3120, "GL11.GL_INDEX_MODE");
        method28352(3121, "GL11.GL_RGBA_MODE");
        method28352(3122, "GL11.GL_DOUBLEBUFFER");
        method28352(3123, "GL11.GL_STEREO");
        method28352(3136, "GL11.GL_RENDER_MODE");
        method28352(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
        method28352(3153, "GL11.GL_POINT_SMOOTH_HINT");
        method28352(3154, "GL11.GL_LINE_SMOOTH_HINT");
        method28352(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
        method28352(3156, "GL11.GL_FOG_HINT");
        method28352(3168, "GL11.GL_TEXTURE_GEN_S");
        method28352(3169, "GL11.GL_TEXTURE_GEN_T");
        method28352(3170, "GL11.GL_TEXTURE_GEN_R");
        method28352(3171, "GL11.GL_TEXTURE_GEN_Q");
        method28352(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
        method28352(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
        method28352(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
        method28352(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
        method28352(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
        method28352(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
        method28352(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
        method28352(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
        method28352(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
        method28352(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
        method28352(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
        method28352(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
        method28352(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
        method28352(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
        method28352(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
        method28352(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
        method28352(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
        method28352(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
        method28352(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
        method28352(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
        method28352(3312, "GL11.GL_UNPACK_SWAP_BYTES");
        method28352(3313, "GL11.GL_UNPACK_LSB_FIRST");
        method28352(3314, "GL11.GL_UNPACK_ROW_LENGTH");
        method28352(3315, "GL11.GL_UNPACK_SKIP_ROWS");
        method28352(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
        method28352(3317, "GL11.GL_UNPACK_ALIGNMENT");
        method28352(3328, "GL11.GL_PACK_SWAP_BYTES");
        method28352(3329, "GL11.GL_PACK_LSB_FIRST");
        method28352(3330, "GL11.GL_PACK_ROW_LENGTH");
        method28352(3331, "GL11.GL_PACK_SKIP_ROWS");
        method28352(3332, "GL11.GL_PACK_SKIP_PIXELS");
        method28352(3333, "GL11.GL_PACK_ALIGNMENT");
        method28352(3344, "GL11.GL_MAP_COLOR");
        method28352(3345, "GL11.GL_MAP_STENCIL");
        method28352(3346, "GL11.GL_INDEX_SHIFT");
        method28352(3347, "GL11.GL_INDEX_OFFSET");
        method28352(3348, "GL11.GL_RED_SCALE");
        method28352(3349, "GL11.GL_RED_BIAS");
        method28352(3350, "GL11.GL_ZOOM_X");
        method28352(3351, "GL11.GL_ZOOM_Y");
        method28352(3352, "GL11.GL_GREEN_SCALE");
        method28352(3353, "GL11.GL_GREEN_BIAS");
        method28352(3354, "GL11.GL_BLUE_SCALE");
        method28352(3355, "GL11.GL_BLUE_BIAS");
        method28352(3356, "GL11.GL_ALPHA_SCALE");
        method28352(3357, "GL11.GL_ALPHA_BIAS");
        method28352(3358, "GL11.GL_DEPTH_SCALE");
        method28352(3359, "GL11.GL_DEPTH_BIAS");
        method28352(3376, "GL11.GL_MAX_EVAL_ORDER");
        method28352(3377, "GL11.GL_MAX_LIGHTS");
        method28352(3378, "GL11.GL_MAX_CLIP_PLANES");
        method28352(3379, "GL11.GL_MAX_TEXTURE_SIZE");
        method28352(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
        method28352(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
        method28352(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
        method28352(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
        method28352(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
        method28352(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
        method28352(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
        method28352(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
        method28352(3408, "GL11.GL_SUBPIXEL_BITS");
        method28352(3409, "GL11.GL_INDEX_BITS");
        method28352(3410, "GL11.GL_RED_BITS");
        method28352(3411, "GL11.GL_GREEN_BITS");
        method28352(3412, "GL11.GL_BLUE_BITS");
        method28352(3413, "GL11.GL_ALPHA_BITS");
        method28352(3414, "GL11.GL_DEPTH_BITS");
        method28352(3415, "GL11.GL_STENCIL_BITS");
        method28352(3416, "GL11.GL_ACCUM_RED_BITS");
        method28352(3417, "GL11.GL_ACCUM_GREEN_BITS");
        method28352(3418, "GL11.GL_ACCUM_BLUE_BITS");
        method28352(3419, "GL11.GL_ACCUM_ALPHA_BITS");
        method28352(3440, "GL11.GL_NAME_STACK_DEPTH");
        method28352(3456, "GL11.GL_AUTO_NORMAL");
        method28352(3472, "GL11.GL_MAP1_COLOR_4");
        method28352(3473, "GL11.GL_MAP1_INDEX");
        method28352(3474, "GL11.GL_MAP1_NORMAL");
        method28352(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
        method28352(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
        method28352(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
        method28352(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
        method28352(3479, "GL11.GL_MAP1_VERTEX_3");
        method28352(3480, "GL11.GL_MAP1_VERTEX_4");
        method28352(3504, "GL11.GL_MAP2_COLOR_4");
        method28352(3505, "GL11.GL_MAP2_INDEX");
        method28352(3506, "GL11.GL_MAP2_NORMAL");
        method28352(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
        method28352(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
        method28352(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
        method28352(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
        method28352(3511, "GL11.GL_MAP2_VERTEX_3");
        method28352(3512, "GL11.GL_MAP2_VERTEX_4");
        method28352(3536, "GL11.GL_MAP1_GRID_DOMAIN");
        method28352(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
        method28352(3538, "GL11.GL_MAP2_GRID_DOMAIN");
        method28352(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
        method28352(3552, "GL11.GL_TEXTURE_1D");
        method28352(3553, "GL11.GL_TEXTURE_2D");
        method28352(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
        method28352(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
        method28352(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
        method28352(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
        method28352(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
        method28352(4096, "GL11.GL_TEXTURE_WIDTH");
        method28352(4097, "GL11.GL_TEXTURE_HEIGHT");
        method28352(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
        method28352(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
        method28352(4101, "GL11.GL_TEXTURE_BORDER");
        method28352(4352, "GL11.GL_DONT_CARE");
        method28352(4353, "GL11.GL_FASTEST");
        method28352(4354, "GL11.GL_NICEST");
        method28352(16384, "GL11.GL_LIGHT0");
        method28352(16385, "GL11.GL_LIGHT1");
        method28352(16386, "GL11.GL_LIGHT2");
        method28352(16387, "GL11.GL_LIGHT3");
        method28352(16388, "GL11.GL_LIGHT4");
        method28352(16389, "GL11.GL_LIGHT5");
        method28352(16390, "GL11.GL_LIGHT6");
        method28352(16391, "GL11.GL_LIGHT7");
        method28352(4608, "GL11.GL_AMBIENT");
        method28352(4609, "GL11.GL_DIFFUSE");
        method28352(4610, "GL11.GL_SPECULAR");
        method28352(4611, "GL11.GL_POSITION");
        method28352(4612, "GL11.GL_SPOT_DIRECTION");
        method28352(4613, "GL11.GL_SPOT_EXPONENT");
        method28352(4614, "GL11.GL_SPOT_CUTOFF");
        method28352(4615, "GL11.GL_CONSTANT_ATTENUATION");
        method28352(4616, "GL11.GL_LINEAR_ATTENUATION");
        method28352(4617, "GL11.GL_QUADRATIC_ATTENUATION");
        method28352(4864, "GL11.GL_COMPILE");
        method28352(4865, "GL11.GL_COMPILE_AND_EXECUTE");
        method28352(5376, "GL11.GL_CLEAR");
        method28352(5377, "GL11.GL_AND");
        method28352(5378, "GL11.GL_AND_REVERSE");
        method28352(5379, "GL11.GL_COPY");
        method28352(5380, "GL11.GL_AND_INVERTED");
        method28352(5381, "GL11.GL_NOOP");
        method28352(5382, "GL11.GL_XOR");
        method28352(5383, "GL11.GL_OR");
        method28352(5384, "GL11.GL_NOR");
        method28352(5385, "GL11.GL_EQUIV");
        method28352(5386, "GL11.GL_INVERT");
        method28352(5387, "GL11.GL_OR_REVERSE");
        method28352(5388, "GL11.GL_COPY_INVERTED");
        method28352(5389, "GL11.GL_OR_INVERTED");
        method28352(5390, "GL11.GL_NAND");
        method28352(5391, "GL11.GL_SET");
        method28352(5632, "GL11.GL_EMISSION");
        method28352(5633, "GL11.GL_SHININESS");
        method28352(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
        method28352(5635, "GL11.GL_COLOR_INDEXES");
        method28352(5888, "GL11.GL_MODELVIEW");
        method28352(5889, "GL11.GL_PROJECTION");
        method28352(5890, "GL11.GL_TEXTURE");
        method28352(6144, "GL11.GL_COLOR");
        method28352(6145, "GL11.GL_DEPTH");
        method28352(6146, "GL11.GL_STENCIL");
        method28352(6400, "GL11.GL_COLOR_INDEX");
        method28352(6401, "GL11.GL_STENCIL_INDEX");
        method28352(6402, "GL11.GL_DEPTH_COMPONENT");
        method28352(6403, "GL11.GL_RED");
        method28352(6404, "GL11.GL_GREEN");
        method28352(6405, "GL11.GL_BLUE");
        method28352(6406, "GL11.GL_ALPHA");
        method28352(6407, "GL11.GL_RGB");
        method28352(6408, "GL11.GL_RGBA");
        method28352(6409, "GL11.GL_LUMINANCE");
        method28352(6410, "GL11.GL_LUMINANCE_ALPHA");
        method28352(6656, "GL11.GL_BITMAP");
        method28352(6912, "GL11.GL_POINT");
        method28352(6913, "GL11.GL_LINE");
        method28352(6914, "GL11.GL_FILL");
        method28352(7168, "GL11.GL_RENDER");
        method28352(7169, "GL11.GL_FEEDBACK");
        method28352(7170, "GL11.GL_SELECT");
        method28352(7424, "GL11.GL_FLAT");
        method28352(7425, "GL11.GL_SMOOTH");
        method28352(7680, "GL11.GL_KEEP");
        method28352(7681, "GL11.GL_REPLACE");
        method28352(7682, "GL11.GL_INCR");
        method28352(7683, "GL11.GL_DECR");
        method28352(7936, "GL11.GL_VENDOR");
        method28352(7937, "GL11.GL_RENDERER");
        method28352(7938, "GL11.GL_VERSION");
        method28352(7939, "GL11.GL_EXTENSIONS");
        method28352(8192, "GL11.GL_S");
        method28352(8193, "GL11.GL_T");
        method28352(8194, "GL11.GL_R");
        method28352(8195, "GL11.GL_Q");
        method28352(8448, "GL11.GL_MODULATE");
        method28352(8449, "GL11.GL_DECAL");
        method28352(8704, "GL11.GL_TEXTURE_ENV_MODE");
        method28352(8705, "GL11.GL_TEXTURE_ENV_COLOR");
        method28352(8960, "GL11.GL_TEXTURE_ENV");
        method28352(9216, "GL11.GL_EYE_LINEAR");
        method28352(9217, "GL11.GL_OBJECT_LINEAR");
        method28352(9218, "GL11.GL_SPHERE_MAP");
        method28352(9472, "GL11.GL_TEXTURE_GEN_MODE");
        method28352(9473, "GL11.GL_OBJECT_PLANE");
        method28352(9474, "GL11.GL_EYE_PLANE");
        method28352(9728, "GL11.GL_NEAREST");
        method28352(9729, "GL11.GL_LINEAR");
        method28352(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
        method28352(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
        method28352(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
        method28352(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
        method28352(10240, "GL11.GL_TEXTURE_MAG_FILTER");
        method28352(10241, "GL11.GL_TEXTURE_MIN_FILTER");
        method28352(10242, "GL11.GL_TEXTURE_WRAP_S");
        method28352(10243, "GL11.GL_TEXTURE_WRAP_T");
        method28352(10496, "GL11.GL_CLAMP");
        method28352(10497, "GL11.GL_REPEAT");
        method28352(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
        method28352(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
        method28352(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
        method28352(10753, "GL11.GL_POLYGON_OFFSET_POINT");
        method28352(10754, "GL11.GL_POLYGON_OFFSET_LINE");
        method28352(32823, "GL11.GL_POLYGON_OFFSET_FILL");
        method28352(32827, "GL11.GL_ALPHA4");
        method28352(32828, "GL11.GL_ALPHA8");
        method28352(32829, "GL11.GL_ALPHA12");
        method28352(32830, "GL11.GL_ALPHA16");
        method28352(32831, "GL11.GL_LUMINANCE4");
        method28352(32832, "GL11.GL_LUMINANCE8");
        method28352(32833, "GL11.GL_LUMINANCE12");
        method28352(32834, "GL11.GL_LUMINANCE16");
        method28352(32835, "GL11.GL_LUMINANCE4_ALPHA4");
        method28352(32836, "GL11.GL_LUMINANCE6_ALPHA2");
        method28352(32837, "GL11.GL_LUMINANCE8_ALPHA8");
        method28352(32838, "GL11.GL_LUMINANCE12_ALPHA4");
        method28352(32839, "GL11.GL_LUMINANCE12_ALPHA12");
        method28352(32840, "GL11.GL_LUMINANCE16_ALPHA16");
        method28352(32841, "GL11.GL_INTENSITY");
        method28352(32842, "GL11.GL_INTENSITY4");
        method28352(32843, "GL11.GL_INTENSITY8");
        method28352(32844, "GL11.GL_INTENSITY12");
        method28352(32845, "GL11.GL_INTENSITY16");
        method28352(10768, "GL11.GL_R3_G3_B2");
        method28352(32847, "GL11.GL_RGB4");
        method28352(32848, "GL11.GL_RGB5");
        method28352(32849, "GL11.GL_RGB8");
        method28352(32850, "GL11.GL_RGB10");
        method28352(32851, "GL11.GL_RGB12");
        method28352(32852, "GL11.GL_RGB16");
        method28352(32853, "GL11.GL_RGBA2");
        method28352(32854, "GL11.GL_RGBA4");
        method28352(32855, "GL11.GL_RGB5_A1");
        method28352(32856, "GL11.GL_RGBA8");
        method28352(32857, "GL11.GL_RGB10_A2");
        method28352(32858, "GL11.GL_RGBA12");
        method28352(32859, "GL11.GL_RGBA16");
        method28352(32860, "GL11.GL_TEXTURE_RED_SIZE");
        method28352(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
        method28352(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
        method28352(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
        method28352(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
        method28352(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
        method28352(32867, "GL11.GL_PROXY_TEXTURE_1D");
        method28352(32868, "GL11.GL_PROXY_TEXTURE_2D");
        method28352(32870, "GL11.GL_TEXTURE_PRIORITY");
        method28352(32871, "GL11.GL_TEXTURE_RESIDENT");
        method28352(32872, "GL11.GL_TEXTURE_BINDING_1D");
        method28352(32873, "GL11.GL_TEXTURE_BINDING_2D");
        method28352(32884, "GL11.GL_VERTEX_ARRAY");
        method28352(32885, "GL11.GL_NORMAL_ARRAY");
        method28352(32886, "GL11.GL_COLOR_ARRAY");
        method28352(32887, "GL11.GL_INDEX_ARRAY");
        method28352(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
        method28352(32889, "GL11.GL_EDGE_FLAG_ARRAY");
        method28352(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
        method28352(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
        method28352(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
        method28352(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
        method28352(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
        method28352(32897, "GL11.GL_COLOR_ARRAY_SIZE");
        method28352(32898, "GL11.GL_COLOR_ARRAY_TYPE");
        method28352(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
        method28352(32901, "GL11.GL_INDEX_ARRAY_TYPE");
        method28352(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
        method28352(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
        method28352(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
        method28352(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
        method28352(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
        method28352(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
        method28352(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
        method28352(32912, "GL11.GL_COLOR_ARRAY_POINTER");
        method28352(32913, "GL11.GL_INDEX_ARRAY_POINTER");
        method28352(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
        method28352(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
        method28352(10784, "GL11.GL_V2F");
        method28352(10785, "GL11.GL_V3F");
        method28352(10786, "GL11.GL_C4UB_V2F");
        method28352(10787, "GL11.GL_C4UB_V3F");
        method28352(10788, "GL11.GL_C3F_V3F");
        method28352(10789, "GL11.GL_N3F_V3F");
        method28352(10790, "GL11.GL_C4F_N3F_V3F");
        method28352(10791, "GL11.GL_T2F_V3F");
        method28352(10792, "GL11.GL_T4F_V4F");
        method28352(10793, "GL11.GL_T2F_C4UB_V3F");
        method28352(10794, "GL11.GL_T2F_C3F_V3F");
        method28352(10795, "GL11.GL_T2F_N3F_V3F");
        method28352(10796, "GL11.GL_T2F_C4F_N3F_V3F");
        method28352(10797, "GL11.GL_T4F_C4F_N3F_V4F");
        method28352(3057, "GL11.GL_LOGIC_OP");
        method28352(4099, "GL11.GL_TEXTURE_COMPONENTS");
        method28352(32874, "GL12.GL_TEXTURE_BINDING_3D");
        method28352(32875, "GL12.GL_PACK_SKIP_IMAGES");
        method28352(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
        method28352(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
        method28352(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
        method28352(32879, "GL12.GL_TEXTURE_3D");
        method28352(32880, "GL12.GL_PROXY_TEXTURE_3D");
        method28352(32881, "GL12.GL_TEXTURE_DEPTH");
        method28352(32882, "GL12.GL_TEXTURE_WRAP_R");
        method28352(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
        method28352(32992, "GL12.GL_BGR");
        method28352(32993, "GL12.GL_BGRA");
        method28352(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
        method28352(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
        method28352(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
        method28352(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
        method28352(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
        method28352(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
        method28352(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
        method28352(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
        method28352(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
        method28352(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
        method28352(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
        method28352(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
        method28352(32826, "GL12.GL_RESCALE_NORMAL");
        method28352(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
        method28352(33273, "GL12.GL_SINGLE_COLOR");
        method28352(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
        method28352(33071, "GL12.GL_CLAMP_TO_EDGE");
        method28352(33082, "GL12.GL_TEXTURE_MIN_LOD");
        method28352(33083, "GL12.GL_TEXTURE_MAX_LOD");
        method28352(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
        method28352(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
        method28352(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
        method28352(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
        method28352(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
        method28352(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
        method28352(33984, "GL13.GL_TEXTURE0");
        method28352(33985, "GL13.GL_TEXTURE1");
        method28352(33986, "GL13.GL_TEXTURE2");
        method28352(33987, "GL13.GL_TEXTURE3");
        method28352(33988, "GL13.GL_TEXTURE4");
        method28352(33989, "GL13.GL_TEXTURE5");
        method28352(33990, "GL13.GL_TEXTURE6");
        method28352(33991, "GL13.GL_TEXTURE7");
        method28352(33992, "GL13.GL_TEXTURE8");
        method28352(33993, "GL13.GL_TEXTURE9");
        method28352(33994, "GL13.GL_TEXTURE10");
        method28352(33995, "GL13.GL_TEXTURE11");
        method28352(33996, "GL13.GL_TEXTURE12");
        method28352(33997, "GL13.GL_TEXTURE13");
        method28352(33998, "GL13.GL_TEXTURE14");
        method28352(33999, "GL13.GL_TEXTURE15");
        method28352(34000, "GL13.GL_TEXTURE16");
        method28352(34001, "GL13.GL_TEXTURE17");
        method28352(34002, "GL13.GL_TEXTURE18");
        method28352(34003, "GL13.GL_TEXTURE19");
        method28352(34004, "GL13.GL_TEXTURE20");
        method28352(34005, "GL13.GL_TEXTURE21");
        method28352(34006, "GL13.GL_TEXTURE22");
        method28352(34007, "GL13.GL_TEXTURE23");
        method28352(34008, "GL13.GL_TEXTURE24");
        method28352(34009, "GL13.GL_TEXTURE25");
        method28352(34010, "GL13.GL_TEXTURE26");
        method28352(34011, "GL13.GL_TEXTURE27");
        method28352(34012, "GL13.GL_TEXTURE28");
        method28352(34013, "GL13.GL_TEXTURE29");
        method28352(34014, "GL13.GL_TEXTURE30");
        method28352(34015, "GL13.GL_TEXTURE31");
        method28352(34016, "GL13.GL_ACTIVE_TEXTURE");
        method28352(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
        method28352(34018, "GL13.GL_MAX_TEXTURE_UNITS");
        method28352(34065, "GL13.GL_NORMAL_MAP");
        method28352(34066, "GL13.GL_REFLECTION_MAP");
        method28352(34067, "GL13.GL_TEXTURE_CUBE_MAP");
        method28352(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
        method28352(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
        method28352(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
        method28352(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
        method28352(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
        method28352(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
        method28352(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
        method28352(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
        method28352(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
        method28352(34025, "GL13.GL_COMPRESSED_ALPHA");
        method28352(34026, "GL13.GL_COMPRESSED_LUMINANCE");
        method28352(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
        method28352(34028, "GL13.GL_COMPRESSED_INTENSITY");
        method28352(34029, "GL13.GL_COMPRESSED_RGB");
        method28352(34030, "GL13.GL_COMPRESSED_RGBA");
        method28352(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
        method28352(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
        method28352(34465, "GL13.GL_TEXTURE_COMPRESSED");
        method28352(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
        method28352(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
        method28352(32925, "GL13.GL_MULTISAMPLE");
        method28352(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
        method28352(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
        method28352(32928, "GL13.GL_SAMPLE_COVERAGE");
        method28352(32936, "GL13.GL_SAMPLE_BUFFERS");
        method28352(32937, "GL13.GL_SAMPLES");
        method28352(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
        method28352(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
        method28352(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
        method28352(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
        method28352(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
        method28352(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
        method28352(34160, "GL13.GL_COMBINE");
        method28352(34161, "GL13.GL_COMBINE_RGB");
        method28352(34162, "GL13.GL_COMBINE_ALPHA");
        method28352(34176, "GL13.GL_SOURCE0_RGB");
        method28352(34177, "GL13.GL_SOURCE1_RGB");
        method28352(34178, "GL13.GL_SOURCE2_RGB");
        method28352(34184, "GL13.GL_SOURCE0_ALPHA");
        method28352(34185, "GL13.GL_SOURCE1_ALPHA");
        method28352(34186, "GL13.GL_SOURCE2_ALPHA");
        method28352(34192, "GL13.GL_OPERAND0_RGB");
        method28352(34193, "GL13.GL_OPERAND1_RGB");
        method28352(34194, "GL13.GL_OPERAND2_RGB");
        method28352(34200, "GL13.GL_OPERAND0_ALPHA");
        method28352(34201, "GL13.GL_OPERAND1_ALPHA");
        method28352(34202, "GL13.GL_OPERAND2_ALPHA");
        method28352(34163, "GL13.GL_RGB_SCALE");
        method28352(34164, "GL13.GL_ADD_SIGNED");
        method28352(34165, "GL13.GL_INTERPOLATE");
        method28352(34023, "GL13.GL_SUBTRACT");
        method28352(34166, "GL13.GL_CONSTANT");
        method28352(34167, "GL13.GL_PRIMARY_COLOR");
        method28352(34168, "GL13.GL_PREVIOUS");
        method28352(34478, "GL13.GL_DOT3_RGB");
        method28352(34479, "GL13.GL_DOT3_RGBA");
        method28352(33069, "GL13.GL_CLAMP_TO_BORDER");
        method28352(33169, "GL14.GL_GENERATE_MIPMAP");
        method28352(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
        method28352(33189, "GL14.GL_DEPTH_COMPONENT16");
        method28352(33190, "GL14.GL_DEPTH_COMPONENT24");
        method28352(33191, "GL14.GL_DEPTH_COMPONENT32");
        method28352(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
        method28352(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
        method28352(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
        method28352(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
        method28352(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
        method28352(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
        method28352(33873, "GL14.GL_FOG_COORDINATE");
        method28352(33874, "GL14.GL_FRAGMENT_DEPTH");
        method28352(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
        method28352(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
        method28352(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
        method28352(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
        method28352(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
        method28352(33062, "GL14.GL_POINT_SIZE_MIN");
        method28352(33063, "GL14.GL_POINT_SIZE_MAX");
        method28352(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
        method28352(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
        method28352(33880, "GL14.GL_COLOR_SUM");
        method28352(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
        method28352(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
        method28352(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
        method28352(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
        method28352(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
        method28352(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
        method28352(32968, "GL14.GL_BLEND_DST_RGB");
        method28352(32969, "GL14.GL_BLEND_SRC_RGB");
        method28352(32970, "GL14.GL_BLEND_DST_ALPHA");
        method28352(32971, "GL14.GL_BLEND_SRC_ALPHA");
        method28352(34055, "GL14.GL_INCR_WRAP");
        method28352(34056, "GL14.GL_DECR_WRAP");
        method28352(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
        method28352(34049, "GL14.GL_TEXTURE_LOD_BIAS");
        method28352(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
        method28352(33648, "GL14.GL_MIRRORED_REPEAT");
        method28352(32773, "ARBImaging.GL_BLEND_COLOR");
        method28352(32777, "ARBImaging.GL_BLEND_EQUATION");
        method28352(32774, "GL14.GL_FUNC_ADD");
        method28352(32778, "GL14.GL_FUNC_SUBTRACT");
        method28352(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
        method28352(32775, "GL14.GL_MIN");
        method28352(32776, "GL14.GL_MAX");
        method28352(34962, "GL15.GL_ARRAY_BUFFER");
        method28352(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
        method28352(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
        method28352(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
        method28352(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
        method28352(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
        method28352(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
        method28352(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
        method28352(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
        method28352(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
        method28352(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
        method28352(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
        method28352(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
        method28352(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
        method28352(35040, "GL15.GL_STREAM_DRAW");
        method28352(35041, "GL15.GL_STREAM_READ");
        method28352(35042, "GL15.GL_STREAM_COPY");
        method28352(35044, "GL15.GL_STATIC_DRAW");
        method28352(35045, "GL15.GL_STATIC_READ");
        method28352(35046, "GL15.GL_STATIC_COPY");
        method28352(35048, "GL15.GL_DYNAMIC_DRAW");
        method28352(35049, "GL15.GL_DYNAMIC_READ");
        method28352(35050, "GL15.GL_DYNAMIC_COPY");
        method28352(35000, "GL15.GL_READ_ONLY");
        method28352(35001, "GL15.GL_WRITE_ONLY");
        method28352(35002, "GL15.GL_READ_WRITE");
        method28352(34660, "GL15.GL_BUFFER_SIZE");
        method28352(34661, "GL15.GL_BUFFER_USAGE");
        method28352(35003, "GL15.GL_BUFFER_ACCESS");
        method28352(35004, "GL15.GL_BUFFER_MAPPED");
        method28352(35005, "GL15.GL_BUFFER_MAP_POINTER");
        method28352(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
        method28352(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
        method28352(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
    }
}

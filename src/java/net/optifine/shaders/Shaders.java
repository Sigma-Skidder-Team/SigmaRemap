package net.optifine.shaders;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.FramebufferConstants;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.StringTextComponent;
import net.optifine.Config;
import net.optifine.render.GlAlphaState;
import net.optifine.render.GlBlendState;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.*;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shaders {
    public static Minecraft field40591;
    public static GameRenderer field40592;
    public static boolean field40593 = false;
    public static boolean field40594 = false;
    public static GLCapabilities field40595;
    public static String field40596;
    public static String field40597;
    public static String field40598;
    public static boolean field40599 = false;
    public static int field40600 = 0;
    private static int field40601 = 0;
    private static int field40602 = 0;
    public static int field40603 = 0;
    public static int field40604 = 0;
    public static boolean field40605 = false;
    public static boolean field40606 = false;
    public static boolean field40607 = false;
    public static boolean field40608 = false;
    public static boolean isShadowPass = false;
    public static boolean field40610 = false;
    public static boolean field40611;
    private static boolean field40612;
    private static boolean field40613;
    private static boolean field40614;
    private static boolean field40615;
    private static boolean field40616;
    public static boolean field40617 = false;
    public static boolean field40618 = false;
    public static boolean field40619 = false;
    public static float[] field40620 = new float[4];
    public static float[] field40621 = new float[4];
    public static float[] field40622 = new float[4];
    public static float[] field40623 = new float[4];
    public static float[] field40624 = new float[4];
    public static float[] field40625 = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
    public static float[] field40626 = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
    public static float[] field40627 = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
    private static float[] field40628 = new float[16];
    public static float field40629;
    public static float field40630;
    public static float field40631;
    public static float field40632;
    public static float field40633;
    public static float field40634;
    public static long field40635 = 0L;
    public static long field40636 = 0L;
    public static long field40637 = 0L;
    public static float field40638 = 0.0F;
    public static float field40639 = 0.0F;
    public static float field40640 = 0.0F;
    public static int field40641 = 0;
    public static long field40642 = 0L;
    public static long field40643 = 0L;
    public static long field40644 = 0L;
    public static int field40645 = 0;
    public static float field40646 = 0.0F;
    public static float field40647 = 0.0F;
    public static int field40648 = 0;
    public static float field40649 = 0.0F;
    public static float field40650 = 0.0F;
    public static float field40651 = 600.0F;
    public static float field40652 = 200.0F;
    public static float field40653 = 10.0F;
    public static boolean field40654 = false;
    public static int field40655 = 0;
    public static int field40656 = 0;
    public static float field40657 = 0.0F;
    public static float field40658 = 0.0F;
    public static float field40659 = 0.0F;
    public static float field40660 = 0.0F;
    public static float field40661 = 0.0F;
    public static float field40662 = 1.0F;
    public static boolean field40663 = false;
    public static int field40664 = 1;
    public static float field40665 = 0.0F;
    public static float field40666 = 0.0F;
    public static boolean field40667 = false;
    public static boolean field40668 = true;
    private static int field40669 = 11;
    public static int field40670 = field40669 + 0;
    public static int field40671 = field40669 + 1;
    public static int field40672 = field40669 + 2;
    public static boolean field40673 = false;
    public static boolean field40674 = false;
    public static boolean field40675 = false;
    public static boolean field40676 = false;
    public static boolean field40677 = false;
    public static boolean field40678 = false;
    private static boolean field40679 = false;
    private static int field40680 = 3;
    private static boolean field40681 = false;
    public static int field40682 = 0;
    public static int field40683 = 0;
    private static Class8304 field40684 = new Class8304();
    public static Class3613 field40685 = field40684.method29050("entityColor");
    public static Class3617 field40686 = field40684.method29045("entityId");
    public static Class3617 field40687 = field40684.method29045("blockEntityId");
    public static Class3617 field40688 = field40684.method29045("texture");
    public static Class3617 field40689 = field40684.method29045("lightmap");
    public static Class3617 field40690 = field40684.method29045("normals");
    public static Class3617 field40691 = field40684.method29045("specular");
    public static Class3617 field40692 = field40684.method29045("shadow");
    public static Class3617 field40693 = field40684.method29045("watershadow");
    public static Class3617 field40694 = field40684.method29045("shadowtex0");
    public static Class3617 field40695 = field40684.method29045("shadowtex1");
    public static Class3617 field40696 = field40684.method29045("depthtex0");
    public static Class3617 field40697 = field40684.method29045("depthtex1");
    public static Class3617 field40698 = field40684.method29045("shadowcolor");
    public static Class3617 field40699 = field40684.method29045("shadowcolor0");
    public static Class3617 field40700 = field40684.method29045("shadowcolor1");
    public static Class3617 field40701 = field40684.method29045("noisetex");
    public static Class3617 field40702 = field40684.method29045("gcolor");
    public static Class3617 field40703 = field40684.method29045("gdepth");
    public static Class3617 field40704 = field40684.method29045("gnormal");
    public static Class3617 field40705 = field40684.method29045("composite");
    public static Class3617 field40706 = field40684.method29045("gaux1");
    public static Class3617 field40707 = field40684.method29045("gaux2");
    public static Class3617 field40708 = field40684.method29045("gaux3");
    public static Class3617 field40709 = field40684.method29045("gaux4");
    public static Class3617 field40710 = field40684.method29045("colortex0");
    public static Class3617 field40711 = field40684.method29045("colortex1");
    public static Class3617 field40712 = field40684.method29045("colortex2");
    public static Class3617 field40713 = field40684.method29045("colortex3");
    public static Class3617 field40714 = field40684.method29045("colortex4");
    public static Class3617 field40715 = field40684.method29045("colortex5");
    public static Class3617 field40716 = field40684.method29045("colortex6");
    public static Class3617 field40717 = field40684.method29045("colortex7");
    public static Class3617 field40718 = field40684.method29045("gdepthtex");
    public static Class3617 field40719 = field40684.method29045("depthtex2");
    public static Class3617 field40720 = field40684.method29045("tex");
    public static Class3617 field40721 = field40684.method29045("heldItemId");
    public static Class3617 field40722 = field40684.method29045("heldBlockLightValue");
    public static Class3617 field40723 = field40684.method29045("heldItemId2");
    public static Class3617 field40724 = field40684.method29045("heldBlockLightValue2");
    public static Class3617 field40725 = field40684.method29045("fogMode");
    public static Class3620 field40726 = field40684.method29048("fogDensity");
    public static Class3618 field40727 = field40684.method29049("fogColor");
    public static Class3618 field40728 = field40684.method29049("skyColor");
    public static Class3617 field40729 = field40684.method29045("worldTime");
    public static Class3617 field40730 = field40684.method29045("worldDay");
    public static Class3617 field40731 = field40684.method29045("moonPhase");
    public static Class3617 field40732 = field40684.method29045("frameCounter");
    public static Class3620 field40733 = field40684.method29048("frameTime");
    public static Class3620 field40734 = field40684.method29048("frameTimeCounter");
    public static Class3620 field40735 = field40684.method29048("sunAngle");
    public static Class3620 field40736 = field40684.method29048("shadowAngle");
    public static Class3620 field40737 = field40684.method29048("rainStrength");
    public static Class3620 field40738 = field40684.method29048("aspectRatio");
    public static Class3620 field40739 = field40684.method29048("viewWidth");
    public static Class3620 field40740 = field40684.method29048("viewHeight");
    public static Class3620 field40741 = field40684.method29048("near");
    public static Class3620 field40742 = field40684.method29048("far");
    public static Class3618 field40743 = field40684.method29049("sunPosition");
    public static Class3618 field40744 = field40684.method29049("moonPosition");
    public static Class3618 field40745 = field40684.method29049("shadowLightPosition");
    public static Class3618 field40746 = field40684.method29049("upPosition");
    public static Class3618 field40747 = field40684.method29049("previousCameraPosition");
    public static Class3618 field40748 = field40684.method29049("cameraPosition");
    public static Class3615 field40749 = field40684.method29051("gbufferModelView");
    public static Class3615 field40750 = field40684.method29051("gbufferModelViewInverse");
    public static Class3615 field40751 = field40684.method29051("gbufferPreviousProjection");
    public static Class3615 field40752 = field40684.method29051("gbufferProjection");
    public static Class3615 field40753 = field40684.method29051("gbufferProjectionInverse");
    public static Class3615 field40754 = field40684.method29051("gbufferPreviousModelView");
    public static Class3615 field40755 = field40684.method29051("shadowProjection");
    public static Class3615 field40756 = field40684.method29051("shadowProjectionInverse");
    public static Class3615 field40757 = field40684.method29051("shadowModelView");
    public static Class3615 field40758 = field40684.method29051("shadowModelViewInverse");
    public static Class3620 field40759 = field40684.method29048("wetness");
    public static Class3620 field40760 = field40684.method29048("eyeAltitude");
    public static Class3621 field40761 = field40684.method29046("eyeBrightness");
    public static Class3621 field40762 = field40684.method29046("eyeBrightnessSmooth");
    public static Class3621 field40763 = field40684.method29046("terrainTextureSize");
    public static Class3617 field40764 = field40684.method29045("terrainIconSize");
    public static Class3617 field40765 = field40684.method29045("isEyeInWater");
    public static Class3620 field40766 = field40684.method29048("nightVision");
    public static Class3620 field40767 = field40684.method29048("blindness");
    public static Class3620 field40768 = field40684.method29048("screenBrightness");
    public static Class3617 field40769 = field40684.method29045("hideGUI");
    public static Class3620 field40770 = field40684.method29048("centerDepthSmooth");
    public static Class3621 field40771 = field40684.method29046("atlasSize");
    public static Class3616 field40772 = field40684.method29047("blendFunc");
    public static Class3617 field40773 = field40684.method29045("instanceId");
    public static Class3620 field40774 = field40684.method29048("playerMood");
    public static double field40775;
    public static double field40776;
    public static double field40777;
    public static double field40778;
    public static double field40779;
    public static double field40780;
    public static int field40781;
    public static int field40782;
    public static int field40783 = 0;
    public static boolean field40784 = false;
    public static int field40785 = 1024;
    public static int field40786 = 1024;
    public static int field40787 = 1024;
    public static int field40788 = 1024;
    public static float field40789 = 90.0F;
    public static float field40790 = 160.0F;
    public static boolean field40791 = true;
    public static float field40792 = -1.0F;
    public static int field40793 = 0;
    public static boolean field40794 = false;
    public static boolean field40795 = false;
    public static final int field40796 = 8;
    public static final int field40797 = 8;
    public static final int field40798 = 3;
    public static final int field40799 = 8;
    public static final int field40800 = 2;
    public static int field40801 = 0;
    public static int field40802 = 0;
    public static int field40803 = 0;
    public static int field40804 = 0;
    public static int field40805 = 0;
    public static int field40806 = 0;
    public static int field40807 = 0;
    public static int field40808 = 0;
    private static int[] field40809 = new int[8];
    public static boolean[] field40810 = new boolean[8];
    public static Class7755[] field40811 = new Class7755[8];
    private static Class9270 field40812 = new Class9270();
    public static final Class7906 field40813 = field40812.method34916();
    public static final Class7906 field40814 = field40812.method34912("shadow", field40813);
    public static final Class7906 field40815 = field40812.method34912("shadow_solid", field40814);
    public static final Class7906 field40816 = field40812.method34912("shadow_cutout", field40814);
    public static final Class7906 field40817 = field40812.method34909("gbuffers_basic", field40813);
    public static final Class7906 field40818 = field40812.method34909("gbuffers_textured", field40817);
    public static final Class7906 field40819 = field40812.method34909("gbuffers_textured_lit", field40818);
    public static final Class7906 field40820 = field40812.method34909("gbuffers_skybasic", field40817);
    public static final Class7906 field40821 = field40812.method34909("gbuffers_skytextured", field40818);
    public static final Class7906 field40822 = field40812.method34909("gbuffers_clouds", field40818);
    public static final Class7906 field40823 = field40812.method34909("gbuffers_terrain", field40819);
    public static final Class7906 field40824 = field40812.method34909("gbuffers_terrain_solid", field40823);
    public static final Class7906 field40825 = field40812.method34909("gbuffers_terrain_cutout_mip", field40823);
    public static final Class7906 field40826 = field40812.method34909("gbuffers_terrain_cutout", field40823);
    public static final Class7906 field40827 = field40812.method34909("gbuffers_damagedblock", field40823);
    public static final Class7906 field40828 = field40812.method34909("gbuffers_block", field40823);
    public static final Class7906 field40829 = field40812.method34909("gbuffers_beaconbeam", field40818);
    public static final Class7906 field40830 = field40812.method34909("gbuffers_item", field40819);
    public static final Class7906 field40831 = field40812.method34909("gbuffers_entities", field40819);
    public static final Class7906 field40832 = field40812.method34909("gbuffers_entities_glowing", field40831);
    public static final Class7906 field40833 = field40812.method34909("gbuffers_armor_glint", field40818);
    public static final Class7906 field40834 = field40812.method34909("gbuffers_spidereyes", field40818);
    public static final Class7906 field40835 = field40812.method34909("gbuffers_hand", field40819);
    public static final Class7906 field40836 = field40812.method34909("gbuffers_weather", field40819);
    public static final Class7906 field40837 = field40812.method34913("deferred_pre");
    public static final Class7906[] field40838 = field40812.method34915("deferred", 16);
    public static final Class7906 field40839 = field40838[0];
    public static final Class7906 field40840 = field40812.method34909("gbuffers_water", field40823);
    public static final Class7906 field40841 = field40812.method34909("gbuffers_hand_water", field40835);
    public static final Class7906 field40842 = field40812.method34913("composite_pre");
    public static final Class7906[] field40843 = field40812.method34914("composite", 16);
    public static final Class7906 field40844 = field40843[0];
    public static final Class7906 field40845 = field40812.method34910("final");
    public static final int field40846 = field40812.method34917();
    public static final Class7906[] field40847 = field40812.method34920();
    public static Class7906 field40848 = field40813;
    public static int field40849 = 0;
    private static Class7866 field40850 = new Class7866();
    private static boolean field40851 = false;
    public static IntBuffer field40852 = null;
    private static int field40853 = 0;
    public static Properties field40854 = null;
    public static Properties field40855 = null;
    public static Texture field40856 = null;
    public static boolean[] field40857 = new boolean[2];
    public static boolean[] field40858 = new boolean[2];
    public static boolean[] field40859 = new boolean[2];
    public static boolean[] field40860 = new boolean[8];
    public static boolean[] field40861 = new boolean[8];
    public static boolean field40862 = false;
    public static boolean field40863 = false;
    public static float field40864 = 0.125F;
    public static float field40865 = 1.0F;
    public static float field40866 = 1.0F;
    public static int field40867 = 0;
    public static int field40868 = 0;
    public static int field40869 = 0;
    public static int field40870 = 0;
    public static int field40871 = 0;
    public static int field40872 = 0;
    public static boolean field40873 = true;
    public static boolean field40874 = true;
    public static boolean field40875 = true;
    public static Class8007 field40876 = new Class8007("oldLighting", "Classic Lighting", 0);
    public static Class8007 field40877 = new Class8007("oldHandLight", "Old Hand Light", 0);
    public static int field40878 = 0;
    public static final int field40879 = 3;
    public static final int field40880 = 2;
    public static final String[] field40881 = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
    public static final String[] field40882 = new String[]{"Nearest", "Linear"};
    public static final int[] field40883 = new int[]{9728, 9984, 9986};
    public static final int[] field40884 = new int[]{9728, 9729};
    private static Class4671 field40885 = null;
    public static boolean field40886 = false;
    public static String field40887;
    public static final String field40888 = "OFF";
    public static final String field40889 = "(internal)";
    public static final String field40890 = "shaderpacks";
    public static final String field40891 = "optionsshaders.txt";
    public static final File field40892 = new File(Minecraft.getInstance().gameDir, "shaderpacks");
    public static File field40893 = new File(Minecraft.getInstance().gameDir, "optionsshaders.txt");
    private static Class6679[] field40894 = null;
    private static Set<String> field40895 = null;
    public static Class9458[] field40896 = null;
    public static Map<String, Class8504> field40897 = null;
    public static Map<String, Class1876> field40898 = new HashMap<String, Class1876>();
    public static final String field40899 = "/shaders/shaders.properties";
    public static Class8009 field40900 = new Class8009("clouds", "Clouds", 0);
    public static Class8007 field40901 = new Class8007("oldLighting", "Classic Lighting", 0);
    public static Class8007 field40902 = new Class8007("oldHandLight", "Old Hand Light", 0);
    public static Class8007 field40903 = new Class8007("dynamicHandLight", "Dynamic Hand Light", 0);
    public static Class8007 field40904 = new Class8007("shadowTranslucent", "Shadow Translucent", 0);
    public static Class8007 field40905 = new Class8007("underwaterOverlay", "Underwater Overlay", 0);
    public static Class8007 field40906 = new Class8007("sun", "Sun", 0);
    public static Class8007 field40907 = new Class8007("moon", "Moon", 0);
    public static Class8007 field40908 = new Class8007("vignette", "Vignette", 0);
    public static Class8007 field40909 = new Class8007("backFace.solid", "Back-face Solid", 0);
    public static Class8007 field40910 = new Class8007("backFace.cutout", "Back-face Cutout", 0);
    public static Class8007 field40911 = new Class8007("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
    public static Class8007 field40912 = new Class8007("backFace.translucent", "Back-face Translucent", 0);
    public static Class8007 field40913 = new Class8007("rain.depth", "Rain Depth", 0);
    public static Class8007 field40914 = new Class8007("beacon.beam.depth", "Rain Depth", 0);
    public static Class8007 field40915 = new Class8007("separateAo", "Separate AO", 0);
    public static Class8007 field40916 = new Class8007("frustum.culling", "Frustum Culling", 0);
    private static Map<String, String> field40917 = new HashMap<String, String>();
    private static ClientWorld field40918 = null;
    private static List<Integer> field40919 = new ArrayList<Integer>();
    private static Class6627[] field40920 = null;
    private static Class6627[] field40921 = null;
    private static Class6627[] field40922 = null;
    private static String field40923 = null;
    private static Class8594 field40924 = null;
    private static final int field40925 = 0;
    private static final int field40926 = 1;
    private static final int field40927 = 2;
    private static final String[] field40928 = new String[] {"gbuffers", "composite", "deferred"};
    public static final boolean field40929 = true;
    private static final boolean field40930 = true;
    public static final boolean field40931 = System.getProperty("shaders.debug.save", "false").equals("true");
    public static float field40932 = 0.5F;
    public static float field40933 = 0.6F;
    public static float field40934 = 0.8F;
    public static float field40935 = -1.0F;
    public static float field40936 = 0.0F;
    public static float field40937 = 0.0F;
    public static int field40938 = 0;
    public static float field40939 = 0.0F;
    public static float field40940;
    public static float field40941;
    public static float field40942;
    public static float field40943 = 2.0F;
    public static int field40944 = 16;
    public static int[] field40945 = new int[2];
    private static Class6627 field40946;
    private static boolean field40947 = false;
    private static int field40948 = 256;
    public static final int[] field40949 = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
    private static final int field40950 = (285 + 8 * field40846) * 4;
    private static final ByteBuffer field40951 = (ByteBuffer) ((Buffer) BufferUtils.createByteBuffer(field40950)).limit(0);
    public static final float[] field40952 = new float[16];
    public static final float[] field40953 = new float[16];
    public static final float[] field40954 = new float[16];
    public static final float[] field40955 = new float[16];
    public static final float[] field40956 = new float[16];
    public static final float[] field40957 = new float[16];
    public static final float[] field40958 = new float[16];
    public static final float[] field40959 = new float[16];
    public static final FloatBuffer field40960 = method32946(16);
    public static final FloatBuffer field40961 = method32946(16);
    public static final FloatBuffer field40962 = method32946(16);
    public static final FloatBuffer field40963 = method32946(16);
    public static final FloatBuffer field40964 = method32946(16);
    public static final FloatBuffer field40965 = method32946(16);
    public static final FloatBuffer field40966 = method32946(16);
    public static final FloatBuffer field40967 = method32946(16);
    public static final FloatBuffer field40968 = method32946(16);
    public static final FloatBuffer field40969 = method32946(16);
    public static final FloatBuffer field40970 = method32946(16);
    public static final FloatBuffer field40971 = method32946(16);
    public static final IntBuffer field40972 = method32945(16);
    public static final IntBuffer field40973 = method32945(3);
    public static final IntBuffer field40974 = method32945(8);
    public static final IntBuffer field40975 = method32945(2);
    public static final IntBuffer field40976 = method32945(8);
    public static final IntBuffer field40977 = method32945(8);
    public static final IntBuffer field40978 = (IntBuffer) ((Buffer) method32945(8)).limit(0);
    public static final IntBuffer field40979 = (IntBuffer) ((Buffer) method32945(8).put(36064)).position(0).limit(1);
    public static final Class9844 field40980 = new Class9844(field40972, 8);
    public static Map<Block, Integer> field40981;
    private static final String[] field40982 = new String[]{
            "R8",
            "RG8",
            "RGB8",
            "RGBA8",
            "R8_SNORM",
            "RG8_SNORM",
            "RGB8_SNORM",
            "RGBA8_SNORM",
            "R16",
            "RG16",
            "RGB16",
            "RGBA16",
            "R16_SNORM",
            "RG16_SNORM",
            "RGB16_SNORM",
            "RGBA16_SNORM",
            "R16F",
            "RG16F",
            "RGB16F",
            "RGBA16F",
            "R32F",
            "RG32F",
            "RGB32F",
            "RGBA32F",
            "R32I",
            "RG32I",
            "RGB32I",
            "RGBA32I",
            "R32UI",
            "RG32UI",
            "RGB32UI",
            "RGBA32UI",
            "R3_G3_B2",
            "RGB5_A1",
            "RGB10_A2",
            "R11F_G11F_B10F",
            "RGB9_E5"
    };
    private static final int[] field40983 = new int[]{
            33321,
            33323,
            32849,
            32856,
            36756,
            36757,
            36758,
            36759,
            33322,
            33324,
            32852,
            32859,
            36760,
            36761,
            36762,
            36763,
            33325,
            33327,
            34843,
            34842,
            33326,
            33328,
            34837,
            34836,
            33333,
            33339,
            36227,
            36226,
            33334,
            33340,
            36209,
            36208,
            10768,
            32855,
            32857,
            35898,
            35901
    };
    private static final Pattern field40984 = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
    public static int[] field40985 = new int[32];
    public static int field40986 = 0;

    private Shaders() {
    }

    private static ByteBuffer method32944(int var0) {
        ByteBuffer var1 = field40951;
        int var2 = var1.limit();
        ((Buffer) var1).position(var2).limit(var2 + var0);
        return var1.slice();
    }

    public static IntBuffer method32945(int var0) {
        ByteBuffer var1 = field40951;
        int var2 = var1.limit();
        ((Buffer) var1).position(var2).limit(var2 + var0 * 4);
        return var1.asIntBuffer();
    }

    private static FloatBuffer method32946(int var0) {
        ByteBuffer var1 = field40951;
        int var2 = var1.limit();
        ((Buffer) var1).position(var2).limit(var2 + var0 * 4);
        return var1.asFloatBuffer();
    }

    private static IntBuffer[] method32947(int var0, int var1) {
        IntBuffer[] var2 = new IntBuffer[var0];

        for (int var3 = 0; var3 < var0; var3++) {
            var2[var3] = method32945(var1);
        }

        return var2;
    }

    public static void method32948() {
        Class7399.method23634("Load shaders configuration.");

        try {
            if (!field40892.exists()) {
                field40892.mkdir();
            }
        } catch (Exception var8) {
            Class7399.method23632("Failed to open the shaderpacks directory: " + field40892);
        }

        field40855 = new Class20();
        field40855.setProperty(Class2160.field14157.method8878(), "");
        if (field40893.exists()) {
            try {
                FileReader var0 = new FileReader(field40893);
                field40855.load(var0);
                var0.close();
            } catch (Exception var7) {
            }
        }

        if (!field40893.exists()) {
            try {
                method32950();
            } catch (Exception var6) {
            }
        }

        Class2160[] var9 = Class2160.values();

        for (int var1 = 0; var1 < var9.length; var1++) {
            Class2160 var2 = var9[var1];
            String var3 = var2.method8878();
            String var4 = var2.method8879();
            String var5 = field40855.getProperty(var3, var4);
            method32949(var2, var5);
        }

        method32953();
    }

    private static void method32949(Class2160 var0, String var1) {
        if (var1 == null) {
            var1 = var0.method8879();
        }

        switch (Class6662.field29231[var0.ordinal()]) {
            case 1:
                field40878 = Config.method26899(var1, 0);
                break;
            case 2:
                field40874 = Config.method26901(var1, true);
                break;
            case 3:
                field40875 = Config.method26901(var1, true);
                break;
            case 4:
                field40865 = Config.method26900(var1, 1.0F);
                break;
            case 5:
                field40866 = Config.method26900(var1, 1.0F);
                break;
            case 6:
                field40864 = Config.method26900(var1, 0.125F);
                break;
            case 7:
                field40863 = Config.method26901(var1, true);
                break;
            case 8:
                field40877.method27380(var1);
                break;
            case 9:
                field40876.method27380(var1);
                break;
            case 10:
                field40887 = var1;
                break;
            case 11:
                field40862 = Config.method26901(var1, true);
                break;
            case 12:
                field40873 = Config.method26901(var1, true);
                break;
            case 13:
                field40867 = Config.method26899(var1, 0);
                break;
            case 14:
                field40868 = Config.method26899(var1, 0);
                break;
            case 15:
                field40869 = Config.method26899(var1, 0);
                break;
            case 16:
                field40870 = Config.method26899(var1, 0);
                break;
            case 17:
                field40870 = Config.method26899(var1, 0);
                break;
            case 18:
                field40870 = Config.method26899(var1, 0);
                break;
            default:
                throw new IllegalArgumentException("Unknown option: " + var0);
        }
    }

    public static void method32950() {
        Class7399.method23634("Save shaders configuration.");
        if (field40855 == null) {
            field40855 = new Class20();
        }

        Class2160[] var0 = Class2160.values();

        for (int var1 = 0; var1 < var0.length; var1++) {
            Class2160 var2 = var0[var1];
            String var3 = var2.method8878();
            String var4 = method32951(var2);
            field40855.setProperty(var3, var4);
        }

        try {
            FileWriter var6 = new FileWriter(field40893);
            field40855.store(var6, (String) null);
            var6.close();
        } catch (Exception var5) {
            Class7399.method23632("Error saving configuration: " + var5.getClass().getName() + ": " + var5.getMessage());
        }
    }

    public static String method32951(Class2160 var0) {
        switch (Class6662.field29231[var0.ordinal()]) {
            case 1:
                return Integer.toString(field40878);
            case 2:
                return Boolean.toString(field40874);
            case 3:
                return Boolean.toString(field40875);
            case 4:
                return Float.toString(field40865);
            case 5:
                return Float.toString(field40866);
            case 6:
                return Float.toString(field40864);
            case 7:
                return Boolean.toString(field40863);
            case 8:
                return field40877.method27384();
            case 9:
                return field40876.method27384();
            case 10:
                return field40887;
            case 11:
                return Boolean.toString(field40862);
            case 12:
                return Boolean.toString(field40873);
            case 13:
                return Integer.toString(field40867);
            case 14:
                return Integer.toString(field40868);
            case 15:
                return Integer.toString(field40869);
            case 16:
                return Integer.toString(field40870);
            case 17:
                return Integer.toString(field40870);
            case 18:
                return Integer.toString(field40870);
            default:
                throw new IllegalArgumentException("Unknown option: " + var0);
        }
    }

    public static void method32952(String var0) {
        field40887 = var0;
        field40855.setProperty(Class2160.field14157.method8878(), var0);
        method32953();
    }

    public static void method32953() {
        boolean var0 = field40886;
        boolean var1 = method32995();
        if (field40591.worldRenderer != null) {
            field40591.worldRenderer.method933();
        }

        field40886 = false;
        if (field40885 != null) {
            field40885.method14638();
            field40885 = null;
            field40917.clear();
            field40919.clear();
            field40894 = null;
            field40895 = null;
            field40896 = null;
            field40897 = null;
            field40898.clear();
            field40900.method27387();
            field40902.method27387();
            field40903.method27387();
            field40901.method27387();
            method32966();
            field40923 = null;
        }

        boolean var2 = false;
        if (Config.isAntialiasing()) {
            Class7399.method23634("Shaders can not be loaded, Antialiasing is enabled: " + Config.getAntialiasingLevel() + "x");
            var2 = true;
        }

        if (Config.isAnisotropicFiltering()) {
            Class7399.method23634("Shaders can not be loaded, Anisotropic Filtering is enabled: " + Config.method26889() + "x");
            var2 = true;
        }

        if (Config.method26819()) {
            Class7399.method23634("Shaders can not be loaded, Fabulous Graphics is enabled.");
            var2 = true;
        }

        String var3 = field40855.getProperty(Class2160.field14157.method8878(), "(internal)");
        if (!var2) {
            field40885 = method32954(var3);
            field40886 = field40885 != null;
        }

        if (field40886) {
            Class7399.method23634("Loaded shaderpack: " + method33137());
        } else {
            Class7399.method23634("No shaderpack loaded.");
            field40885 = new Class4670();
        }

        if (field40931) {
            method33017(new File(field40892, "debug"));
        }

        method33142();
        method32956();
        field40894 = method32978();
        method32957();
        boolean var4 = field40886 != var0;
        boolean var5 = method32995() != var1;
        if (var4 || var5) {
            DefaultVertexFormats.method35343();
            if (Reflector.field42960.method20245()) {
                Reflector.field42961.method20236(null);
                Reflector.field42962.method20236(null);
            }

            method32992();
        }

        if (field40591.getResourceManager() != null) {
            Class7031.method21825();
        }

        if (field40591.worldRenderer != null) {
            field40591.worldRenderer.method934();
        }

        if ((var4 || var5) && field40591.getResourceManager() != null) {
            field40591.scheduleResourcesRefresh();
        }
    }

    public static Class4671 method32954(String var0) {
        if (var0 == null) {
            return null;
        } else {
            var0 = var0.trim();
            if (var0.isEmpty() || var0.equals("OFF")) {
                return null;
            } else if (var0.equals("(internal)")) {
                return new Class4674();
            } else {
                try {
                    File var1 = new File(field40892, var0);
                    if (var1.isDirectory()) {
                        return new Class4672(var0, var1);
                    } else {
                        return var1.isFile() && var0.toLowerCase().endsWith(".zip") ? new Class4673(var0, var1) : null;
                    }
                } catch (Exception var2) {
                    var2.printStackTrace();
                    return null;
                }
            }
        }
    }

    public static Class4671 method32955() {
        return field40885;
    }

    private static void method32956() {
        field40919.clear();

        for (int var0 = -128; var0 <= 128; var0++) {
            String var1 = "/shaders/world" + var0;
            if (field40885.method14640(var1)) {
                field40919.add(var0);
            }
        }

        if (field40919.size() > 0) {
            Integer[] var2 = field40919.<Integer>toArray(new Integer[field40919.size()]);
            Config.method26810("[Shaders] Worlds: " + Config.method26854(var2));
        }
    }

    private static void method32957() {
        field40900.method27387();
        field40902.method27387();
        field40903.method27387();
        field40901.method27387();
        field40904.method27387();
        field40905.method27387();
        field40906.method27387();
        field40907.method27387();
        field40908.method27387();
        field40909.method27387();
        field40910.method27387();
        field40911.method27387();
        field40912.method27387();
        field40913.method27387();
        field40914.method27387();
        field40915.method27387();
        field40916.method27387();
        Class9172.method34276();
        Class8715.method31440();
        Class9793.method38611();
        field40924 = null;

        for (int var0 = 0; var0 < field40847.length; var0++) {
            Class7906 var1 = field40847[var0];
            var1.method26477();
        }

        if (field40885 != null) {
            Class9172.method34265(field40885);
            Class8715.method31435(field40885);
            Class9793.method38606(field40885);
            String var4 = "/shaders/shaders.properties";

            try {
                InputStream var5 = field40885.method14639(var4);
                if (var5 == null) {
                    return;
                }

                var5 = Class9711.method38047(var5, var4);
                Class20 var2 = new Class20();
                var2.load(var5);
                var5.close();
                field40900.method27388(var2);
                field40902.method27388(var2);
                field40903.method27388(var2);
                field40901.method27388(var2);
                field40904.method27388(var2);
                field40905.method27388(var2);
                field40906.method27388(var2);
                field40908.method27388(var2);
                field40907.method27388(var2);
                field40909.method27388(var2);
                field40910.method27388(var2);
                field40911.method27388(var2);
                field40912.method27388(var2);
                field40913.method27388(var2);
                field40914.method27388(var2);
                field40915.method27388(var2);
                field40916.method27388(var2);
                field40895 = Class8440.method29668(var2, field40894);
                field40896 = Class8440.method29665(var2, field40894);
                field40897 = Class8440.method29670(var2, field40896, field40894);
                field40898 = Class8440.method29666(var2, field40894);
                field40920 = method32958(var2, 0);
                field40921 = method32958(var2, 1);
                field40922 = method32958(var2, 2);
                field40923 = var2.getProperty("texture.noise");
                if (field40923 != null) {
                    field40947 = true;
                }

                field40924 = Class8440.method29675(var2);
                Class8440.method29678(var2);
                Class8440.method29680(var2);
                Class8440.method29682(var2);
                Class8440.method29684(var2);
            } catch (IOException var3) {
                Config.method26811("[Shaders] Error reading: " + var4);
            }
        }
    }

    private static Class6627[] method32958(Properties var0, int var1) {
        String var2 = "texture." + field40928[var1] + ".";
        Set<String> var3 = (Set<String>) (Set<?>) var0.keySet();
        ArrayList<Class6627> var4 = new ArrayList();

        for (String var6 : var3) {
            if (var6.startsWith(var2)) {
                String var7 = Class9402.method35762(var6, var2);
                var7 = Class9402.method35769(var7, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
                String var8 = var0.getProperty(var6).trim();
                int var9 = method32964(var1, var7);
                if (var9 < 0) {
                    Class7399.method23633("Invalid texture name: " + var6);
                } else {
                    Class6627 var10 = method32959(var9, var8);
                    if (var10 != null) {
                        Class7399.method23634("Custom texture: " + var6 + " = " + var8);
                        var4.add(var10);
                    }
                }
            }
        }

        return var4.size() <= 0 ? null : var4.toArray(new Class6627[var4.size()]);
    }

    private static Class6627 method32959(int var0, String var1) {
        if (var1 == null) {
            return null;
        } else {
            var1 = var1.trim();
            if (var1.indexOf(58) >= 0) {
                return method32960(var0, var1);
            } else {
                return var1.indexOf(32) >= 0 ? method32961(var0, var1) : method32963(var0, var1);
            }
        }
    }

    private static Class6627 method32960(int var0, String var1) {
        String var2 = var1.trim();
        int var3 = 0;
        if (var2.startsWith("minecraft:textures/")) {
            var2 = Class9402.method35774(var2, ".png");
            if (var2.endsWith("_n.png")) {
                var2 = Class9402.method35764(var2, "_n.png", ".png");
                var3 = 1;
            } else if (var2.endsWith("_s.png")) {
                var2 = Class9402.method35764(var2, "_s.png", ".png");
                var3 = 2;
            }
        }

        if (var2.startsWith("minecraft:dynamic/lightmap_")) {
            var2 = var2.replace("lightmap", "light_map");
        }

        ResourceLocation var4 = new ResourceLocation(var2);
        return new Class6628(var0, var4, var3);
    }

    private static Class6627 method32961(int var0, String var1) {
        Class8896 var2 = new Class8896("Shaders");
        String[] var3 = Config.method26903(var1, " ");
        ArrayDeque var4 = new ArrayDeque<String>(Arrays.asList(var3));
        String var5 = (String) var4.poll();
        Class2292 var6 = (Class2292) var2.method32413((String) var4.poll(), Class2292.values(), "texture type");
        if (var6 == null) {
            Class7399.method23633("Invalid raw texture type: " + var1);
            return null;
        } else {
            Class2273 var7 = (Class2273) var2.method32413((String) var4.poll(), Class2273.values(), "internal format");
            if (var7 == null) {
                Class7399.method23633("Invalid raw texture internal format: " + var1);
                return null;
            } else {
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                switch (Class6662.field29232[var6.ordinal()]) {
                    case 1:
                        var8 = var2.method32398((String) var4.poll(), -1);
                        break;
                    case 2:
                        var8 = var2.method32398((String) var4.poll(), -1);
                        var9 = var2.method32398((String) var4.poll(), -1);
                        break;
                    case 3:
                        var8 = var2.method32398((String) var4.poll(), -1);
                        var9 = var2.method32398((String) var4.poll(), -1);
                        var10 = var2.method32398((String) var4.poll(), -1);
                        break;
                    case 4:
                        var8 = var2.method32398((String) var4.poll(), -1);
                        var9 = var2.method32398((String) var4.poll(), -1);
                        break;
                    default:
                        Class7399.method23633("Invalid raw texture type: " + var6);
                        return null;
                }

                if (var8 >= 0 && var9 >= 0 && var10 >= 0) {
                    Class2098 var11 = (Class2098) var2.method32413((String) var4.poll(), Class2098.values(), "pixel format");
                    if (var11 == null) {
                        Class7399.method23633("Invalid raw texture pixel format: " + var1);
                        return null;
                    } else {
                        Class2306 var12 = (Class2306) var2.method32413((String) var4.poll(), Class2306.values(), "pixel type");
                        if (var12 == null) {
                            Class7399.method23633("Invalid raw texture pixel type: " + var1);
                            return null;
                        } else if (!var4.isEmpty()) {
                            Class7399.method23633("Invalid raw texture, too many parameters: " + var1);
                            return null;
                        } else {
                            return method32962(var0, var1, var5, var6, var7, var8, var9, var10, var11, var12);
                        }
                    }
                } else {
                    Class7399.method23633("Invalid raw texture size: " + var1);
                    return null;
                }
            }
        }
    }

    private static Class6627 method32962(
            int var0, String var1, String var2, Class2292 var3, Class2273 var4, int var5, int var6, int var7, Class2098 var8, Class2306 var9
    ) {
        try {
            String var10 = "shaders/" + Class9402.method35762(var2, "/");
            InputStream var11 = field40885.method14639(var10);
            if (var11 == null) {
                Class7399.method23633("Raw texture not found: " + var2);
                return null;
            } else {
                byte[] var12 = Config.method26927(var11);
                IOUtils.closeQuietly(var11);
                ByteBuffer var13 = GLAllocation.method22266(var12.length);
                var13.put(var12);
                ((Buffer) var13).flip();
                Class9620 var14 = Class292.method1144(var10, new Class9620(true, true));
                return new Class6629(var3, var4, var5, var6, var7, var8, var9, var13, var0, var14.method37495(), var14.method37496());
            }
        } catch (IOException var15) {
            Class7399.method23633("Error loading raw texture: " + var2);
            Class7399.method23633("" + var15.getClass().getName() + ": " + var15.getMessage());
            return null;
        }
    }

    private static Class6627 method32963(int var0, String var1) {
        var1 = var1.trim();
        if (var1.indexOf(46) < 0) {
            var1 = var1 + ".png";
        }

        try {
            String var2 = "shaders/" + Class9402.method35762(var1, "/");
            InputStream var3 = field40885.method14639(var2);
            if (var3 == null) {
                Class7399.method23633("Texture not found: " + var1);
                return null;
            } else {
                IOUtils.closeQuietly(var3);
                Class292 var4 = new Class292(var2);
                var4.method1090(field40591.getResourceManager());
                return new Class6630(var0, var2, var4);
            }
        } catch (IOException var5) {
            Class7399.method23633("Error loading texture: " + var1);
            Class7399.method23633("" + var5.getClass().getName() + ": " + var5.getMessage());
            return null;
        }
    }

    private static int method32964(int var0, String var1) {
        if (var0 == 0) {
            if (var1.equals("texture")) {
                return 0;
            }

            if (var1.equals("lightmap")) {
                return 1;
            }

            if (var1.equals("normals")) {
                return 2;
            }

            if (var1.equals("specular")) {
                return 3;
            }

            if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
                return 4;
            }

            if (var1.equals("shadow")) {
                return field40795 ? 5 : 4;
            }

            if (var1.equals("shadowtex1")) {
                return 5;
            }

            if (var1.equals("depthtex0")) {
                return 6;
            }

            if (var1.equals("gaux1")) {
                return 7;
            }

            if (var1.equals("gaux2")) {
                return 8;
            }

            if (var1.equals("gaux3")) {
                return 9;
            }

            if (var1.equals("gaux4")) {
                return 10;
            }

            if (var1.equals("depthtex1")) {
                return 12;
            }

            if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
                return 13;
            }

            if (var1.equals("shadowcolor1")) {
                return 14;
            }

            if (var1.equals("noisetex")) {
                return 15;
            }
        }

        if (var0 == 1 || var0 == 2) {
            if (var1.equals("colortex0") || var1.equals("colortex0")) {
                return 0;
            }

            if (var1.equals("colortex1") || var1.equals("gdepth")) {
                return 1;
            }

            if (var1.equals("colortex2") || var1.equals("gnormal")) {
                return 2;
            }

            if (var1.equals("colortex3") || var1.equals("composite")) {
                return 3;
            }

            if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
                return 4;
            }

            if (var1.equals("shadow")) {
                return field40795 ? 5 : 4;
            }

            if (var1.equals("shadowtex1")) {
                return 5;
            }

            if (var1.equals("depthtex0") || var1.equals("gdepthtex")) {
                return 6;
            }

            if (var1.equals("colortex4") || var1.equals("gaux1")) {
                return 7;
            }

            if (var1.equals("colortex5") || var1.equals("gaux2")) {
                return 8;
            }

            if (var1.equals("colortex6") || var1.equals("gaux3")) {
                return 9;
            }

            if (var1.equals("colortex7") || var1.equals("gaux4")) {
                return 10;
            }

            if (var1.equals("depthtex1")) {
                return 11;
            }

            if (var1.equals("depthtex2")) {
                return 12;
            }

            if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
                return 13;
            }

            if (var1.equals("shadowcolor1")) {
                return 14;
            }

            if (var1.equals("noisetex")) {
                return 15;
            }
        }

        return -1;
    }

    private static void method32965(Class6627[] var0) {
        if (var0 != null) {
            for (int var1 = 0; var1 < var0.length; var1++) {
                Class6627 var2 = var0[var1];
                GlStateManager.activeTexture(33984 + var2.method20208());
                int var3 = var2.method20207();
                int var4 = var2.method20209();
                if (var4 == 3553) {
                    GlStateManager.bindTexture(var3);
                } else {
                    GL11.glBindTexture(var4, var3);
                }
            }
        }
    }

    private static void method32966() {
        method32967(field40920);
        method32967(field40921);
        method32967(field40922);
        field40920 = null;
        field40921 = null;
        field40922 = null;
    }

    private static void method32967(Class6627[] var0) {
        if (var0 != null) {
            for (int var1 = 0; var1 < var0.length; var1++) {
                Class6627 var2 = var0[var1];
                var2.method20203();
            }
        }
    }

    public static Class6679[] method32968(String var0) {
        Class6679[] var1 = (Class6679[]) field40894.clone();
        if (field40897 == null) {
            if (field40896 != null) {
                Class6684 var9 = new Class6684(field40896, var1);
                var1 = (Class6679[]) Config.method26949(var1, var9, 0);
            }

            return method32974(var1);
        } else {
            String var2 = var0 != null ? "screen." + var0 : "screen";
            Class8504 var3 = field40897.get(var2);
            if (var3 == null) {
                return new Class6679[0];
            } else {
                Class6679[] var4 = var3.method30106();
                ArrayList<Class6679> var5 = new ArrayList();

                for (int var6 = 0; var6 < var4.length; var6++) {
                    Class6679 var7 = var4[var6];
                    if (var7 == null) {
                        var5.add((Class6679) null);
                    } else if (var7 instanceof Class6680) {
                        Class6679[] var8 = method32970(field40897, var1);
                        var5.addAll(Arrays.asList(var8));
                    } else {
                        var5.add(var7);
                    }
                }

                return var5.toArray(new Class6679[var5.size()]);
            }
        }
    }

    public static int method32969(String var0, int var1) {
        String var2 = var0 != null ? "screen." + var0 : "screen";
        if (field40897 == null) {
            return var1;
        } else {
            Class8504 var3 = field40897.get(var2);
            return var3 == null ? var1 : var3.method30107();
        }
    }

    private static Class6679[] method32970(Map<String, Class8504> var0, Class6679[] var1) {
        HashSet var2 = new HashSet();

        for (String var4 : var0.keySet()) {
            Class8504 var5 = (Class8504) var0.get(var4);
            Class6679[] var6 = var5.method30106();

            for (int var7 = 0; var7 < var6.length; var7++) {
                Class6679 var8 = var6[var7];
                if (var8 != null) {
                    var2.add(var8.method20366());
                }
            }
        }

        ArrayList<Class6679> var9 = new ArrayList();

        for (int var10 = 0; var10 < var1.length; var10++) {
            Class6679 var11 = var1[var10];
            if (var11.method20382()) {
                String var12 = var11.method20366();
                if (!var2.contains(var12)) {
                    var9.add(var11);
                }
            }
        }

        return var9.toArray(new Class6679[var9.size()]);
    }

    public static Class6679 method32971(String var0) {
        return Class6817.method20782(var0, field40894);
    }

    public static Class6679[] method32972() {
        return field40894;
    }

    public static boolean method32973(String var0) {
        return field40895 == null ? false : field40895.contains(var0);
    }

    private static Class6679[] method32974(Class6679[] var0) {
        ArrayList<Class6679> var1 = new ArrayList();

        for (int var2 = 0; var2 < var0.length; var2++) {
            Class6679 var3 = var0[var2];
            if (var3.method20382()) {
                var1.add(var3);
            }
        }

        return var1.toArray(new Class6679[var1.size()]);
    }

    public static void method32975() {
        method32976(field40894, field40885);
    }

    private static void method32976(Class6679[] var0, Class4671 var1) {
        Class20 var2 = new Class20();
        if (field40894 != null) {
            for (int var3 = 0; var3 < var0.length; var3++) {
                Class6679 var4 = var0[var3];
                if (var4.method20381() && var4.method20379()) {
                    var2.setProperty(var4.method20366(), var4.method20370());
                }
            }
        }

        try {
            method32977(var1, var2);
        } catch (IOException var5) {
            Config.method26811("[Shaders] Error saving configuration for " + field40885.method14641());
            var5.printStackTrace();
        }
    }

    private static void method32977(Class4671 var0, Properties var1) throws IOException {
        String var2 = "shaderpacks/" + var0.method14641() + ".txt";
        File var3 = new File(Minecraft.getInstance().gameDir, var2);
        if (var1.isEmpty()) {
            var3.delete();
        } else {
            FileOutputStream var4 = new FileOutputStream(var3);
            var1.store(var4, (String) null);
            var4.flush();
            var4.close();
        }
    }

    private static Class6679[] method32978() {
        try {
            String[] var0 = field40812.method34919();
            Class6679[] var1 = Class8440.method29658(field40885, var0, field40919);
            Properties var2 = method32979(field40885);

            for (int var3 = 0; var3 < var1.length; var3++) {
                Class6679 var4 = var1[var3];
                String var5 = var2.getProperty(var4.method20366());
                if (var5 != null) {
                    var4.method20373();
                    if (!var4.method20371(var5)) {
                        Config.method26811("[Shaders] Invalid value, option: " + var4.method20366() + ", value: " + var5);
                    }
                }
            }

            return var1;
        } catch (IOException var6) {
            Config.method26811("[Shaders] Error reading configuration for " + field40885.method14641());
            var6.printStackTrace();
            return null;
        }
    }

    private static Properties method32979(Class4671 var0) throws IOException {
        Class20 var1 = new Class20();
        String var2 = "shaderpacks/" + var0.method14641() + ".txt";
        File var3 = new File(Minecraft.getInstance().gameDir, var2);
        if (var3.exists() && var3.isFile() && var3.canRead()) {
            FileInputStream var4 = new FileInputStream(var3);
            var1.load(var4);
            var4.close();
            return var1;
        } else {
            return var1;
        }
    }

    public static Class6679[] method32980(Class6679[] var0) {
        ArrayList<Class6679> var1 = new ArrayList();

        for (int var2 = 0; var2 < var0.length; var2++) {
            Class6679 var3 = var0[var2];
            if (var3.method20379() && var3.method20381()) {
                var1.add(var3);
            }
        }

        return var1.toArray(new Class6679[var1.size()]);
    }

    private static String method32981(String var0, Class6679[] var1) {
        if (var1 != null && var1.length > 0) {
            for (int var2 = 0; var2 < var1.length; var2++) {
                Class6679 var3 = var1[var2];
                if (var3.method20363(var0)) {
                    var0 = var3.method20360();
                    break;
                }
            }

            return var0;
        } else {
            return var0;
        }
    }

    public static ArrayList method32982() {
        ArrayList var0 = new ArrayList();
        var0.add("OFF");
        var0.add("(internal)");
        int var1 = var0.size();

        try {
            if (!field40892.exists()) {
                field40892.mkdir();
            }

            File[] var2 = field40892.listFiles();

            for (int var3 = 0; var3 < var2.length; var3++) {
                File var4 = var2[var3];
                String var5 = var4.getName();
                if (var4.isDirectory()) {
                    if (!var5.equals("debug")) {
                        File var6 = new File(var4, "shaders");
                        if (var6.exists() && var6.isDirectory()) {
                            var0.add(var5);
                        }
                    }
                } else if (var4.isFile() && var5.toLowerCase().endsWith(".zip")) {
                    var0.add(var5);
                }
            }
        } catch (Exception var7) {
        }

        List var8 = var0.subList(var1, var0.size());
        Collections.sort(var8, String.CASE_INSENSITIVE_ORDER);
        return var0;
    }

    public static int method32983(String var0) {
        int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (var1 != 36053) {
            System.err.format("FramebufferStatus 0x%04X at %s\n", var1, var0);
        }

        return var1;
    }

    public static int method32984(String var0) {
        int var1 = GlStateManager.method23859();
        if (var1 != 0 && Class9084.method33877(var1)) {
            String var2 = Config.method26985(var1);
            String var3 = method32985(var1, var0);
            String var4 = String.format("OpenGL error: %s (%s)%s, at: %s", var1, var2, var3, var0);
            Class7399.method23632(var4);
            if (Config.method26981() && Class4379.method13743("ShowGlErrorShaders", 10000L)) {
                String var5 = I18n.format("of.message.openglError", var1, var2);
                method32988(var5);
            }
        }

        return var1;
    }

    private static String method32985(int var0, String var1) {
        StringBuilder var2 = new StringBuilder();
        if (var0 == 1286) {
            int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            String var4 = method32987(var3);
            String var5 = ", fbStatus: " + var3 + " (" + var4 + ")";
            var2.append(var5);
        }

        String var6 = field40848.method26482();
        if (var6.isEmpty()) {
            var6 = "none";
        }

        var2.append(", program: " + var6);
        Class7906 var7 = method32986(field40849);
        if (var7 != field40848) {
            String var8 = var7.method26482();
            if (var8.isEmpty()) {
                var8 = "none";
            }

            var2.append(" (" + var8 + ")");
        }

        if (var1.equals("setDrawBuffers")) {
            var2.append(", drawBuffers: " + field40848.method26487());
        }

        return var2.toString();
    }

    private static Class7906 method32986(int var0) {
        for (int var1 = 0; var1 < field40847.length; var1++) {
            Class7906 var2 = field40847[var1];
            if (var2.method26485() == var0) {
                return var2;
            }
        }

        return field40813;
    }

    private static String method32987(int var0) {
        switch (var0) {
            case 33305:
                return "Undefined";
            case 36053:
                return "Complete";
            case 36054:
                return "Incomplete attachment";
            case 36055:
                return "Incomplete missing attachment";
            case 36059:
                return "Incomplete draw buffer";
            case 36060:
                return "Incomplete read buffer";
            case 36061:
                return "Unsupported";
            case 36182:
                return "Incomplete multisample";
            case 36264:
                return "Incomplete layer targets";
            default:
                return "Unknown";
        }
    }

    private static void method32988(String var0) {
        field40591.ingameGUI.getChatGUI().sendChatMessage(new StringTextComponent(var0));
    }

    private static void method32989(String var0) {
        Class7399.method23632(var0);
        field40591.ingameGUI.getChatGUI().sendChatMessage(new StringTextComponent(var0));
    }

    public static void method32990(String var0, IntBuffer var1) {
        StringBuilder var2 = new StringBuilder(128);
        var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
        int var3 = var1.limit();

        for (int var4 = 0; var4 < var3; var4++) {
            var2.append(" ").append(var1.get(var4));
        }

        var2.append("]");
        Class7399.method23634(var2.toString());
    }

    public static void startup(Minecraft var0) {
        method33140();
        field40591 = var0;
        var0 = Minecraft.getInstance();
        field40595 = GL.getCapabilities();
        field40596 = GL11.glGetString(7938);
        field40597 = GL11.glGetString(7936);
        field40598 = GL11.glGetString(7937);
        Class7399.method23634("OpenGL Version: " + field40596);
        Class7399.method23634("Vendor:  " + field40597);
        Class7399.method23634("Renderer: " + field40598);
        Class7399.method23634(
                "Capabilities: "
                        + (field40595.OpenGL20 ? " 2.0 " : " - ")
                        + (field40595.OpenGL21 ? " 2.1 " : " - ")
                        + (field40595.OpenGL30 ? " 3.0 " : " - ")
                        + (field40595.OpenGL32 ? " 3.2 " : " - ")
                        + (field40595.OpenGL40 ? " 4.0 " : " - ")
        );
        Class7399.method23634("GL_MAX_DRAW_BUFFERS: " + GL32.glGetInteger(34852));
        Class7399.method23634("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL32.glGetInteger(36063));
        Class7399.method23634("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL32.glGetInteger(34930));
        field40599 = field40595.OpenGL30;
        method32948();
    }

    public static void method32992() {
        if (method32995()) {
            field40932 = 0.5F;
            field40933 = 0.6F;
            field40934 = 0.8F;
        } else {
            field40932 = 1.0F;
            field40933 = 1.0F;
            field40934 = 1.0F;
        }
    }

    public static boolean method32993() {
        if (!field40877.method27377()) {
            return field40877.method27378();
        } else {
            return !field40902.method27377() ? field40902.method27378() : true;
        }
    }

    public static boolean method32994() {
        return !field40903.method27377() ? field40903.method27378() : true;
    }

    public static boolean method32995() {
        if (!field40876.method27377()) {
            return field40876.method27378();
        } else {
            return !field40901.method27377() ? field40901.method27378() : true;
        }
    }

    public static boolean method32996() {
        return !field40904.method27379();
    }

    public static boolean method32997() {
        return !field40905.method27379();
    }

    public static boolean method32998() {
        return !field40906.method27379();
    }

    public static boolean method32999() {
        return !field40907.method27379();
    }

    public static boolean method33000() {
        return !field40908.method27379();
    }

    public static boolean method33001(RenderType var0) {
        if (var0 == Class9025.field41288) {
            return field40909.method27378();
        } else if (var0 == Class9025.field41290) {
            return field40910.method27378();
        } else if (var0 == Class9025.field41289) {
            return field40911.method27378();
        } else {
            return var0 == Class9025.field41291 ? field40912.method27378() : false;
        }
    }

    public static boolean method33002() {
        return field40913.method27378();
    }

    public static boolean method33003() {
        return field40914.method27378();
    }

    public static boolean method33004() {
        return field40915.method27378();
    }

    public static boolean method33005() {
        return !field40916.method27379();
    }

    public static void method33006() {
        boolean var0;
        if (!field40593) {
            field40593 = true;
            var0 = true;
        } else {
            var0 = false;
        }

        if (!field40594) {
            method32984("Shaders.init pre");
            if (method33137() != null) {
            }

            if (!field40595.OpenGL20) {
                method32989("No OpenGL 2.0");
            }

            if (!field40595.GL_EXT_framebuffer_object) {
                method32989("No EXT_framebuffer_object");
            }

            ((Buffer) field40976).position(0).limit(8);
            ((Buffer) field40972).position(0).limit(16);
            ((Buffer) field40973).position(0).limit(3);
            ((Buffer) field40977).position(0).limit(8);
            ((Buffer) field40975).position(0).limit(2);
            ((Buffer) field40974).position(0).limit(8);
            field40801 = 4;
            field40802 = 1;
            field40803 = 0;
            field40804 = 0;
            field40805 = 1;
            field40806 = 1;
            Arrays.fill(field40809, 6408);
            Arrays.fill(field40810, true);
            Arrays.fill(field40811, null);
            Arrays.fill(field40857, false);
            Arrays.fill(field40858, false);
            Arrays.fill(field40859, false);
            Arrays.fill(field40860, false);
            Arrays.fill(field40861, false);
            field40663 = false;
            field40947 = false;
            field40936 = 0.0F;
            field40943 = 2.0F;
            field40785 = 1024;
            field40786 = 1024;
            field40787 = 1024;
            field40788 = 1024;
            field40789 = 90.0F;
            field40790 = 160.0F;
            field40791 = true;
            field40792 = -1.0F;
            field40935 = -1.0F;
            field40673 = false;
            field40674 = false;
            field40675 = false;
            field40795 = false;
            field40681 = false;
            method32992();
            Class9717.method38077();
            field40684.method29044();
            if (field40924 != null) {
                field40924.method30742();
            }

            Class9458 var1 = Class6817.method20783(field40896, field40894, false);
            String var2 = "";
            if (field40918 != null) {
                int var3 = Class8509.method30145(field40918.getDimensionKey());
                if (field40919.contains(var3)) {
                    var2 = "world" + var3 + "/";
                }
            }

            for (int var13 = 0; var13 < field40847.length; var13++) {
                Class7906 var4 = field40847[var13];
                var4.method26478();
                var4.method26479();
                if (var4.method26483() != Class2140.field14007) {
                    String var5 = var4.method26482();
                    String var6 = var2 + var5;
                    boolean var7 = true;
                    if (field40898.containsKey(var6)) {
                        var7 = var7 && field40898.get(var6).method8137();
                    }

                    if (var1 != null) {
                        var7 = var7 && !var1.method36410(var6);
                    }

                    if (!var7) {
                        Class7399.method23634("Program disabled: " + var6);
                        var5 = "<disabled>";
                        var6 = var2 + var5;
                    }

                    String var8 = "/shaders/" + var6;
                    String var9 = var8 + ".vsh";
                    String var10 = var8 + ".gsh";
                    String var11 = var8 + ".fsh";
                    method33011(var4, var9, var10, var11);
                    int var12 = var4.method26485();
                    if (var12 > 0) {
                        Class7399.method23634("Program loaded: " + var6);
                    }

                    method33007(var4);
                    method33009(var4);
                }
            }

            field40851 = false;

            for (int var14 = 0; var14 < field40838.length; var14++) {
                if (field40838[var14].method26485() != 0) {
                    field40851 = true;
                    break;
                }
            }

            field40805 = field40801;
            field40783 = field40804 > 0 ? 1 : 0;
            field40794 = field40804 > 0;
            Class7399.method23634("usedColorBuffers: " + field40801);
            Class7399.method23634("usedDepthBuffers: " + field40802);
            Class7399.method23634("usedShadowColorBuffers: " + field40803);
            Class7399.method23634("usedShadowDepthBuffers: " + field40804);
            Class7399.method23634("usedColorAttachs: " + field40805);
            Class7399.method23634("usedDrawBuffers: " + field40806);
            ((Buffer) field40976).position(0).limit(field40806);
            ((Buffer) field40972).position(0).limit(field40801 * 2);
            field40980.method38910();

            for (int var15 = 0; var15 < field40806; var15++) {
                field40976.put(var15, 36064 + var15);
            }

            int var16 = GL32.glGetInteger(34852);
            if (field40806 > var16) {
                method32989("[Shaders] Error: Not enough draw buffers, needed: " + field40806 + ", available: " + var16);
            }

            ((Buffer) field40977).position(0).limit(field40803);

            for (int var17 = 0; var17 < field40803; var17++) {
                field40977.put(var17, 36064 + var17);
            }

            for (int var18 = 0; var18 < field40847.length; var18++) {
                Class7906 var21 = field40847[var18];
                Class7906 var22 = var21;

                while (var22.method26485() == 0 && var22.method26484() != var22) {
                    var22 = var22.method26484();
                }

                if (var22 != var21 && var21 != field40814) {
                    var21.method26480(var22);
                }
            }

            method33036();
            method33037();
            if (field40947) {
                method33030();
            }

            if (field40856 == null) {
                field40856 = Class9336.method35319();
            }

            MatrixStack var19 = new MatrixStack();
            var19.rotate(Vector3f.YP.rotationDegrees(-90.0F));
            method33054(var19);
            method33055(var19);
            field40594 = true;
            method33031();
            method33010();
            if (!var0) {
            }

            method32984("Shaders.init");
        }
    }

    private static void method33007(Class7906 var0) {
        int var1 = GL32.glGetInteger(34852);
        Arrays.fill(var0.method26496(), false);
        if (var0 == field40845) {
            var0.method26500((IntBuffer) null);
        } else if (var0.method26485() == 0) {
            if (var0 == field40814) {
                var0.method26500(field40978);
            } else {
                var0.method26500(field40979);
            }
        } else {
            String var2 = var0.method26487();
            if (var2 == null) {
                if (var0 != field40814 && var0 != field40815 && var0 != field40816) {
                    var0.method26500(field40976);
                    field40806 = field40801;
                    Arrays.fill(var0.method26496(), 0, field40801, true);
                } else {
                    var0.method26500(field40977);
                }
            } else {
                IntBuffer var3 = var0.method26489();
                int var4 = var2.length();
                field40806 = Math.max(field40806, var4);
                var4 = Math.min(var4, var1);
                var0.method26500(var3);
                ((Buffer) var3).limit(var4);

                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = method33008(var0, var2, var5);
                    var3.put(var5, var6);
                }
            }
        }
    }

    private static int method33008(Class7906 var0, String var1, int var2) {
        int var3 = 0;
        if (var2 >= var1.length()) {
            return var3;
        } else {
            int var4 = var1.charAt(var2) - '0';
            if (var0 == field40814) {
                if (var4 >= 0 && var4 <= 1) {
                    var2 = var4 + 36064;
                    field40803 = Math.max(field40803, var4);
                }

                return var2;
            } else {
                if (var4 >= 0 && var4 <= 7) {
                    var0.method26496()[var4] = true;
                    var2 = var4 + 36064;
                    field40805 = Math.max(field40805, var4);
                    field40801 = Math.max(field40801, var4);
                }

                return var2;
            }
        }
    }

    private static void method33009(Class7906 var0) {
        boolean[] var1 = var0.method26496();
        Boolean[] var2 = var0.method26495();

        for (int var3 = 0; var3 < var2.length; var3++) {
            Boolean var4 = var2[var3];
            if (var4 != null) {
                var1[var3] = var4;
            }
        }
    }

    public static void method33010() {
        Class7399.method23634("Reset model renderers");
        field40600++;
        Class7399.method23634("Reset world renderers");
        field40591.worldRenderer.loadRenderers();
    }

    private static void method33011(Class7906 var0, String var1, String var2, String var3) {
        method32984("pre setupProgram");
        int var4 = ARBShaderObjects.glCreateProgramObjectARB();
        method32984("create");
        if (var4 != 0) {
            field40676 = false;
            field40677 = false;
            field40678 = false;
            int var5 = method33012(var0, var1);
            int var6 = method33013(var0, var2);
            int var7 = method33014(var0, var3);
            method32984("create");
            if (var5 == 0 && var6 == 0 && var7 == 0) {
                ARBShaderObjects.glDeleteObjectARB(var4);
                boolean var11 = false;
                var0.method26478();
            } else {
                if (var5 != 0) {
                    ARBShaderObjects.glAttachObjectARB(var4, var5);
                    method32984("attach");
                }

                if (var6 != 0) {
                    ARBShaderObjects.glAttachObjectARB(var4, var6);
                    method32984("attach");
                    if (field40679) {
                        ARBGeometryShader4.glProgramParameteriARB(var4, 36315, 4);
                        ARBGeometryShader4.glProgramParameteriARB(var4, 36316, 5);
                        ARBGeometryShader4.glProgramParameteriARB(var4, 36314, field40680);
                        method32984("arbGeometryShader4");
                    }

                    field40681 = true;
                }

                if (var7 != 0) {
                    ARBShaderObjects.glAttachObjectARB(var4, var7);
                    method32984("attach");
                }

                if (field40676) {
                    ARBVertexShader.glBindAttribLocationARB(var4, field40670, "mc_Entity");
                    method32984("mc_Entity");
                }

                if (field40677) {
                    ARBVertexShader.glBindAttribLocationARB(var4, field40671, "mc_midTexCoord");
                    method32984("mc_midTexCoord");
                }

                if (field40678) {
                    ARBVertexShader.glBindAttribLocationARB(var4, field40672, "at_tangent");
                    method32984("at_tangent");
                }

                ARBShaderObjects.glLinkProgramARB(var4);
                if (GL32.glGetProgrami(var4, 35714) != 1) {
                    Class7399.method23632("Error linking program: " + var4 + " (" + var0.method26482() + ")");
                }

                method33018(var4, var0.method26482());
                if (var5 != 0) {
                    ARBShaderObjects.glDetachObjectARB(var4, var5);
                    ARBShaderObjects.glDeleteObjectARB(var5);
                }

                if (var6 != 0) {
                    ARBShaderObjects.glDetachObjectARB(var4, var6);
                    ARBShaderObjects.glDeleteObjectARB(var6);
                }

                if (var7 != 0) {
                    ARBShaderObjects.glDetachObjectARB(var4, var7);
                    ARBShaderObjects.glDeleteObjectARB(var7);
                }

                var0.method26497(var4);
                var0.method26498(var4);
                method33021(var0);
                ARBShaderObjects.glValidateProgramARB(var4);
                method33021(field40813);
                method33018(var4, var0.method26482());
                int var8 = GL32.glGetProgrami(var4, 35715);
                if (var8 != 1) {
                    String var9 = "\"";
                    method32989("[Shaders] Error: Invalid program " + var9 + var0.method26482() + var9);
                    ARBShaderObjects.glDeleteObjectARB(var4);
                    boolean var10 = false;
                    var0.method26478();
                }
            }
        }
    }

    private static int method33012(Class7906 var0, String var1) {
        int var2 = ARBShaderObjects.glCreateShaderObjectARB(35633);
        if (var2 == 0) {
            return 0;
        } else {
            StringBuilder var3 = new StringBuilder(131072);
            BufferedReader var4 = null;

            try {
                var4 = new BufferedReader(method33015(var1));
            } catch (Exception var10) {
                ARBShaderObjects.glDeleteObjectARB(var2);
                return 0;
            }

            Class6679[] var5 = method32980(field40894);
            ArrayList var6 = new ArrayList();
            if (var4 != null) {
                try {
                    var4 = Class8440.method29672((BufferedReader) var4, var1, field40885, 0, var6, 0);
                    Class8152 var7 = new Class8152();

                    while (true) {
                        String var8 = var4.readLine();
                        if (var8 == null) {
                            var4.close();
                            break;
                        }

                        var8 = method32981(var8, var5);
                        var3.append(var8).append('\n');
                        if (var7.method28282(var8)) {
                            Class9090 var9 = Class8445.method29699(var8);
                            if (var9 != null) {
                                if (var9.method33891("mc_Entity")) {
                                    field40673 = true;
                                    field40676 = true;
                                } else if (var9.method33891("mc_midTexCoord")) {
                                    field40674 = true;
                                    field40677 = true;
                                } else if (var9.method33891("at_tangent")) {
                                    field40675 = true;
                                    field40678 = true;
                                }

                                if (var9.method33900("countInstances")) {
                                    var0.method26502(var9.method33913());
                                    Class7399.method23634("countInstances: " + var0.method26491());
                                }
                            }
                        }
                    }
                } catch (Exception var11) {
                    Class7399.method23632("Couldn't read " + var1 + "!");
                    var11.printStackTrace();
                    ARBShaderObjects.glDeleteObjectARB(var2);
                    return 0;
                }
            }

            if (field40931) {
                method33016(var1, var3.toString());
            }

            ARBShaderObjects.glShaderSourceARB(var2, var3);
            ARBShaderObjects.glCompileShaderARB(var2);
            if (GL32.glGetShaderi(var2, 35713) != 1) {
                Class7399.method23632("Error compiling vertex shader: " + var1);
            }

            method33019(var2, var1, var6);
            return var2;
        }
    }

    private static int method33013(Class7906 var0, String var1) {
        int var2 = ARBShaderObjects.glCreateShaderObjectARB(36313);
        if (var2 == 0) {
            return 0;
        } else {
            StringBuilder var3 = new StringBuilder(131072);
            BufferedReader var4 = null;

            try {
                var4 = new BufferedReader(method33015(var1));
            } catch (Exception var11) {
                ARBShaderObjects.glDeleteObjectARB(var2);
                return 0;
            }

            Class6679[] var5 = method32980(field40894);
            ArrayList var6 = new ArrayList();
            field40679 = false;
            field40680 = 3;
            if (var4 != null) {
                try {
                    var4 = Class8440.method29672((BufferedReader) var4, var1, field40885, 0, var6, 0);
                    Class8152 var7 = new Class8152();

                    while (true) {
                        String var8 = var4.readLine();
                        if (var8 == null) {
                            var4.close();
                            break;
                        }

                        var8 = method32981(var8, var5);
                        var3.append(var8).append('\n');
                        if (var7.method28282(var8)) {
                            Class9090 var9 = Class8445.method29699(var8);
                            if (var9 != null) {
                                if (var9.method33904("GL_ARB_geometry_shader4")) {
                                    String var10 = Config.method26946(var9.method33887());
                                    if (var10.equals("enable") || var10.equals("require") || var10.equals("warn")) {
                                        field40679 = true;
                                    }
                                }

                                if (var9.method33900("maxVerticesOut")) {
                                    field40680 = var9.method33913();
                                }
                            }
                        }
                    }
                } catch (Exception var12) {
                    Class7399.method23632("Couldn't read " + var1 + "!");
                    var12.printStackTrace();
                    ARBShaderObjects.glDeleteObjectARB(var2);
                    return 0;
                }
            }

            if (field40931) {
                method33016(var1, var3.toString());
            }

            ARBShaderObjects.glShaderSourceARB(var2, var3);
            ARBShaderObjects.glCompileShaderARB(var2);
            if (GL32.glGetShaderi(var2, 35713) != 1) {
                Class7399.method23632("Error compiling geometry shader: " + var1);
            }

            method33019(var2, var1, var6);
            return var2;
        }
    }

    private static int method33014(Class7906 var0, String var1) {
        int var2 = ARBShaderObjects.glCreateShaderObjectARB(35632);
        if (var2 == 0) {
            return 0;
        } else {
            StringBuilder var3 = new StringBuilder(131072);
            BufferedReader var4 = null;

            try {
                var4 = new BufferedReader(method33015(var1));
            } catch (Exception var14) {
                ARBShaderObjects.glDeleteObjectARB(var2);
                return 0;
            }

            Class6679[] var5 = method32980(field40894);
            ArrayList var6 = new ArrayList();
            if (var4 != null) {
                try {
                    var4 = Class8440.method29672((BufferedReader) var4, var1, field40885, 0, var6, 0);
                    Class8152 var7 = new Class8152();

                    while (true) {
                        String var8 = var4.readLine();
                        if (var8 == null) {
                            var4.close();
                            break;
                        }

                        var8 = method32981(var8, var5);
                        var3.append(var8).append('\n');
                        if (var7.method28282(var8)) {
                            Class9090 var9 = Class8445.method29699(var8);
                            if (var9 != null) {
                                if (var9.method33888()) {
                                    String var10 = var9.method33886();
                                    int var11;
                                    if ((var11 = Class8445.method29701(var10)) >= 0) {
                                        field40804 = Math.max(field40804, var11 + 1);
                                    } else if ((var11 = Class8445.method29702(var10)) >= 0) {
                                        field40803 = Math.max(field40803, var11 + 1);
                                    } else if ((var11 = Class8445.method29703(var10)) >= 0) {
                                        field40802 = Math.max(field40802, var11 + 1);
                                    } else if (var10.equals("gdepth") && field40809[1] == 6408) {
                                        field40809[1] = 34836;
                                    } else if ((var11 = Class8445.method29704(var10)) >= 0) {
                                        field40801 = Math.max(field40801, var11 + 1);
                                    } else if (var10.equals("centerDepthSmooth")) {
                                        field40663 = true;
                                    }
                                } else if (var9.method33900("shadowMapResolution") || var9.method33898("SHADOWRES")) {
                                    field40787 = field40788 = var9.method33913();
                                    field40785 = field40786 = Math.round((float) field40787 * field40866);
                                    Class7399.method23634("Shadow map resolution: " + field40787);
                                } else if (var9.method33902("shadowMapFov") || var9.method33898("SHADOWFOV")) {
                                    field40789 = var9.method33914();
                                    field40791 = false;
                                    Class7399.method23634("Shadow map field of view: " + field40789);
                                } else if (var9.method33902("shadowDistance") || var9.method33898("SHADOWHPL")) {
                                    field40790 = var9.method33914();
                                    field40791 = true;
                                    Class7399.method23634("Shadow map distance: " + field40790);
                                } else if (var9.method33902("shadowDistanceRenderMul")) {
                                    field40792 = var9.method33914();
                                    Class7399.method23634("Shadow distance render mul: " + field40792);
                                } else if (var9.method33902("shadowIntervalSize")) {
                                    field40943 = var9.method33914();
                                    Class7399.method23634("Shadow map interval size: " + field40943);
                                } else if (var9.method33909("generateShadowMipmap", true)) {
                                    Arrays.fill(field40858, true);
                                    Class7399.method23634("Generate shadow mipmap");
                                } else if (var9.method33909("generateShadowColorMipmap", true)) {
                                    Arrays.fill(field40860, true);
                                    Class7399.method23634("Generate shadow color mipmap");
                                } else if (var9.method33909("shadowHardwareFiltering", true)) {
                                    Arrays.fill(field40857, true);
                                    Class7399.method23634("Hardware shadow filtering enabled.");
                                } else if (var9.method33909("shadowHardwareFiltering0", true)) {
                                    field40857[0] = true;
                                    Class7399.method23634("shadowHardwareFiltering0");
                                } else if (var9.method33909("shadowHardwareFiltering1", true)) {
                                    field40857[1] = true;
                                    Class7399.method23634("shadowHardwareFiltering1");
                                } else if (var9.method33910("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    field40858[0] = true;
                                    Class7399.method23634("shadowtex0Mipmap");
                                } else if (var9.method33909("shadowtex1Mipmap", true)) {
                                    field40858[1] = true;
                                    Class7399.method23634("shadowtex1Mipmap");
                                } else if (var9.method33910("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    field40860[0] = true;
                                    Class7399.method23634("shadowcolor0Mipmap");
                                } else if (var9.method33910("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    field40860[1] = true;
                                    Class7399.method23634("shadowcolor1Mipmap");
                                } else if (var9.method33911("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    field40859[0] = true;
                                    Class7399.method23634("shadowtex0Nearest");
                                } else if (var9.method33910("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    field40859[1] = true;
                                    Class7399.method23634("shadowtex1Nearest");
                                } else if (var9.method33911("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    field40861[0] = true;
                                    Class7399.method23634("shadowcolor0Nearest");
                                } else if (var9.method33911("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    field40861[1] = true;
                                    Class7399.method23634("shadowcolor1Nearest");
                                } else if (var9.method33902("wetnessHalflife") || var9.method33898("WETNESSHL")) {
                                    field40651 = var9.method33914();
                                    Class7399.method23634("Wetness halflife: " + field40651);
                                } else if (var9.method33902("drynessHalflife") || var9.method33898("DRYNESSHL")) {
                                    field40652 = var9.method33914();
                                    Class7399.method23634("Dryness halflife: " + field40652);
                                } else if (var9.method33902("eyeBrightnessHalflife")) {
                                    field40653 = var9.method33914();
                                    Class7399.method23634("Eye brightness halflife: " + field40653);
                                } else if (var9.method33902("centerDepthHalflife")) {
                                    field40662 = var9.method33914();
                                    Class7399.method23634("Center depth halflife: " + field40662);
                                } else if (var9.method33902("sunPathRotation")) {
                                    field40936 = var9.method33914();
                                    Class7399.method23634("Sun path rotation: " + field40936);
                                } else if (var9.method33902("ambientOcclusionLevel")) {
                                    field40935 = Config.method26832(var9.method33914(), 0.0F, 1.0F);
                                    Class7399.method23634("AO Level: " + field40935);
                                } else if (var9.method33900("superSamplingLevel")) {
                                    int var19 = var9.method33913();
                                    if (var19 > 1) {
                                        Class7399.method23634("Super sampling level: " + var19 + "x");
                                        field40664 = var19;
                                    } else {
                                        field40664 = 1;
                                    }
                                } else if (var9.method33900("noiseTextureResolution")) {
                                    field40948 = var9.method33913();
                                    field40947 = true;
                                    Class7399.method23634("Noise texture enabled");
                                    Class7399.method23634("Noise texture resolution: " + field40948);
                                } else if (var9.method33901("Format")) {
                                    String var20 = Class9402.method35763(var9.method33886(), "Format");
                                    String var28 = var9.method33887();
                                    int var12 = method33028(var20);
                                    int var13 = method33029(var28);
                                    if (var12 >= 0 && var13 != 0) {
                                        field40809[var12] = var13;
                                        Class7399.method23638("%s format: %s", var20, var28);
                                    }
                                } else if (var9.method33906("Clear", false)) {
                                    if (Class8445.method29706(var1) || Class8445.method29705(var1)) {
                                        String var21 = Class9402.method35763(var9.method33886(), "Clear");
                                        int var29 = method33028(var21);
                                        if (var29 >= 0) {
                                            field40810[var29] = false;
                                            Class7399.method23638("%s clear disabled", var21);
                                        }
                                    }
                                } else if (var9.method33912("ClearColor")) {
                                    if (Class8445.method29706(var1) || Class8445.method29705(var1)) {
                                        String var22 = Class9402.method35763(var9.method33886(), "ClearColor");
                                        int var30 = method33028(var22);
                                        if (var30 >= 0) {
                                            Class7755 var32 = var9.method33915();
                                            if (var32 != null) {
                                                field40811[var30] = var32;
                                                Class7399.method23638(
                                                        "%s clear color: %s %s %s %s", var22, var32.method25701(), var32.method25702(), var32.method25703(), var32.method25704()
                                                );
                                            } else {
                                                Class7399.method23633("Invalid color value: " + var9.method33887());
                                            }
                                        }
                                    }
                                } else if (var9.method33899("GAUX4FORMAT", "RGBA32F")) {
                                    field40809[7] = 34836;
                                    Class7399.method23634("gaux4 format : RGB32AF");
                                } else if (var9.method33899("GAUX4FORMAT", "RGB32F")) {
                                    field40809[7] = 34837;
                                    Class7399.method23634("gaux4 format : RGB32F");
                                } else if (var9.method33899("GAUX4FORMAT", "RGB16")) {
                                    field40809[7] = 32852;
                                    Class7399.method23634("gaux4 format : RGB16");
                                } else if (var9.method33906("MipmapEnabled", true)) {
                                    if (Class8445.method29706(var1) || Class8445.method29705(var1) || Class8445.method29707(var1)) {
                                        String var23 = Class9402.method35763(var9.method33886(), "MipmapEnabled");
                                        int var31 = method33028(var23);
                                        if (var31 >= 0) {
                                            int var33 = var0.method26490();
                                            var33 |= 1 << var31;
                                            var0.method26501(var33);
                                            Class7399.method23638("%s mipmap enabled", var23);
                                        }
                                    }
                                } else if (var9.method33898("DRAWBUFFERS")) {
                                    String var24 = var9.method33887();
                                    if (Class8445.method29708(var24)) {
                                        var0.method26499(var24);
                                    } else {
                                        Class7399.method23633("Invalid draw buffers: " + var24);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception var15) {
                    Class7399.method23632("Couldn't read " + var1 + "!");
                    var15.printStackTrace();
                    ARBShaderObjects.glDeleteObjectARB(var2);
                    return 0;
                }
            }

            if (field40931) {
                method33016(var1, var3.toString());
            }

            ARBShaderObjects.glShaderSourceARB(var2, var3);
            ARBShaderObjects.glCompileShaderARB(var2);
            if (GL32.glGetShaderi(var2, 35713) != 1) {
                Class7399.method23632("Error compiling fragment shader: " + var1);
            }

            method33019(var2, var1, var6);
            return var2;
        }
    }

    private static Reader method33015(String var0) {
        return new InputStreamReader(field40885.method14639(var0));
    }

    public static void method33016(String var0, String var1) {
        try {
            File var2 = new File(field40892, "debug/" + var0);
            var2.getParentFile().mkdirs();
            Config.method26967(var2, var1);
        } catch (IOException var3) {
            Config.method26811("Error saving: " + var0);
            var3.printStackTrace();
        }
    }

    private static void method33017(File var0) {
        if (var0.exists() && var0.isDirectory()) {
            File[] var1 = var0.listFiles();
            if (var1 != null) {
                for (int var2 = 0; var2 < var1.length; var2++) {
                    File var3 = var1[var2];
                    if (var3.isDirectory()) {
                        method33017(var3);
                    }

                    var3.delete();
                }
            }
        }
    }

    private static boolean method33018(int var0, String var1) {
        IntBuffer var2 = BufferUtils.createIntBuffer(1);
        ARBShaderObjects.glGetObjectParameterivARB(var0, 35716, var2);
        int var3 = var2.get();
        if (var3 > 1) {
            ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
            ((Buffer) var2).flip();
            ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
            byte[] var5 = new byte[var3];
            var4.get(var5);
            if (var5[var3 - 1] == 0) {
                var5[var3 - 1] = 10;
            }

            String var6 = new String(var5, StandardCharsets.US_ASCII);
            var6 = Class9402.method35776(var6, " \n\r\t");
            Class7399.method23634("Info log: " + var1 + "\n" + var6);
            return false;
        } else {
            return true;
        }
    }

    private static boolean method33019(int var0, String var1, List<String> var2) {
        IntBuffer var3 = BufferUtils.createIntBuffer(1);
        int var4 = GL32.glGetShaderi(var0, 35716);
        if (var4 <= 1) {
            return true;
        } else {
            for (int var5 = 0; var5 < var2.size(); var5++) {
                String var6 = (String) var2.get(var5);
                Class7399.method23634("File: " + (var5 + 1) + " = " + var6);
            }

            String var7 = GL32.glGetShaderInfoLog(var0, var4);
            var7 = Class9402.method35776(var7, " \n\r\t");
            Class7399.method23634("ShaderGroup info log: " + var1 + "\n" + var7);
            return false;
        }
    }

    public static void method33020(IntBuffer var0) {
        if (var0 == null) {
            var0 = field40978;
        }

        if (field40852 != var0) {
            field40852 = var0;
            GL32.glDrawBuffers(var0);
            method32984("setDrawBuffers");
        }
    }

    public static void method33021(Class7906 var0) {
        method32984("pre-useProgram");
        if (isShadowPass) {
            var0 = field40814;
        } else if (field40610) {
            var0 = field40832;
        }

        if (field40848 != var0) {
            method33171();
            method33022(field40848, var0);
            field40848 = var0;
            int var1 = var0.method26485();
            field40849 = var1;
            ARBShaderObjects.glUseProgramObjectARB(var1);
            if (method32984("useProgram") != 0) {
                var0.method26497(0);
                var1 = var0.method26485();
                field40849 = var1;
                ARBShaderObjects.glUseProgramObjectARB(var1);
            }

            field40684.method29043(var1);
            if (field40924 != null) {
                field40924.method30739(var1);
            }

            if (var1 != 0) {
                IntBuffer var2 = var0.method26488();
                if (field40608) {
                    method33020(var2);
                }

                field40853 = var0.method26490();
                switch (Class6662.field29233[var0.method26483().ordinal()]) {
                    case 1:
                        method33023(field40688, 0);
                        method33023(field40689, 2);
                        method33023(field40690, 1);
                        method33023(field40691, 3);
                        method33023(field40692, field40795 ? 5 : 4);
                        method33023(field40693, 4);
                        method33023(field40694, 4);
                        method33023(field40695, 5);
                        method33023(field40696, 6);
                        if (field40920 != null || field40851) {
                            method33023(field40706, 7);
                            method33023(field40707, 8);
                            method33023(field40708, 9);
                            method33023(field40709, 10);
                        }

                        method33023(field40697, 11);
                        method33023(field40698, 13);
                        method33023(field40699, 13);
                        method33023(field40700, 14);
                        method33023(field40701, 15);
                        break;
                    case 2:
                    case 3:
                        method33023(field40702, 0);
                        method33023(field40703, 1);
                        method33023(field40704, 2);
                        method33023(field40705, 3);
                        method33023(field40706, 7);
                        method33023(field40707, 8);
                        method33023(field40708, 9);
                        method33023(field40709, 10);
                        method33023(field40710, 0);
                        method33023(field40711, 1);
                        method33023(field40712, 2);
                        method33023(field40713, 3);
                        method33023(field40714, 7);
                        method33023(field40715, 8);
                        method33023(field40716, 9);
                        method33023(field40717, 10);
                        method33023(field40692, field40795 ? 5 : 4);
                        method33023(field40693, 4);
                        method33023(field40694, 4);
                        method33023(field40695, 5);
                        method33023(field40718, 6);
                        method33023(field40696, 6);
                        method33023(field40697, 11);
                        method33023(field40719, 12);
                        method33023(field40698, 13);
                        method33023(field40699, 13);
                        method33023(field40700, 14);
                        method33023(field40701, 15);
                        break;
                    case 4:
                        method33023(field40720, 0);
                        method33023(field40688, 0);
                        method33023(field40689, 2);
                        method33023(field40690, 1);
                        method33023(field40691, 3);
                        method33023(field40692, field40795 ? 5 : 4);
                        method33023(field40693, 4);
                        method33023(field40694, 4);
                        method33023(field40695, 5);
                        if (field40920 != null) {
                            method33023(field40706, 7);
                            method33023(field40707, 8);
                            method33023(field40708, 9);
                            method33023(field40709, 10);
                        }

                        method33023(field40698, 13);
                        method33023(field40699, 13);
                        method33023(field40700, 14);
                        method33023(field40701, 15);
                }

                ItemStack var3 = field40591.player != null ? field40591.player.getHeldItemMainhand() : null;
                Item var4 = var3 != null ? var3.getItem() : null;
                int var5 = -1;
                Block var6 = null;
                if (var4 != null) {
                    var5 = Registry.ITEM.getId(var4);
                    if (var4 instanceof Class3292) {
                        var6 = ((Class3292) var4).method11845();
                    }

                    var5 = Class8715.method31433(var5);
                }

                int var7 = var6 != null ? var6.getDefaultState().getLightValue() : 0;
                ItemStack var8 = field40591.player != null ? field40591.player.getHeldItemOffhand() : null;
                Item var9 = var8 != null ? var8.getItem() : null;
                int var10 = -1;
                Block var11 = null;
                if (var9 != null) {
                    var10 = Registry.ITEM.getId(var9);
                    if (var9 instanceof Class3292) {
                        var11 = ((Class3292) var9).method11845();
                    }

                    var10 = Class8715.method31433(var10);
                }

                int var12 = var11 != null ? var11.getDefaultState().getLightValue() : 0;
                if (method32993() && var12 > var7) {
                    var5 = var10;
                    var7 = var12;
                }

                float var13 = field40591.player != null ? field40591.player.method5387() : 0.0F;
                method33023(field40721, var5);
                method33023(field40722, var7);
                method33023(field40723, var10);
                method33023(field40724, var12);
                method33023(field40725, field40668 ? field40938 : 0);
                method33025(field40726, field40668 ? field40939 : 0.0F);
                method33026(field40727, field40940, field40941, field40942);
                method33026(field40728, field40632, field40633, field40634);
                method33023(field40729, (int) (field40635 % 24000L));
                method33023(field40730, (int) (field40635 / 24000L));
                method33023(field40731, field40641);
                method33023(field40732, field40645);
                method33025(field40733, field40646);
                method33025(field40734, field40647);
                method33025(field40735, field40639);
                method33025(field40736, field40640);
                method33025(field40737, field40649);
                method33025(field40738, (float) field40603 / (float) field40604);
                method33025(field40739, (float) field40603);
                method33025(field40740, (float) field40604);
                method33025(field40741, 0.05F);
                method33025(field40742, (float) (field40591.gameSettings.renderDistanceChunks * 16));
                method33026(field40743, field40620[0], field40620[1], field40620[2]);
                method33026(field40744, field40621[0], field40621[1], field40621[2]);
                method33026(field40745, field40622[0], field40622[1], field40622[2]);
                method33026(field40746, field40623[0], field40623[1], field40623[2]);
                method33026(field40747, (float) field40775, (float) field40776, (float) field40777);
                method33026(field40748, (float) field40778, (float) field40779, (float) field40780);
                method33027(field40749, false, field40962);
                method33027(field40750, false, field40963);
                method33027(field40751, false, field40968);
                method33027(field40752, false, field40960);
                method33027(field40753, false, field40961);
                method33027(field40754, false, field40969);
                if (field40804 > 0) {
                    method33027(field40755, false, field40964);
                    method33027(field40756, false, field40965);
                    method33027(field40757, false, field40966);
                    method33027(field40758, false, field40967);
                }

                method33025(field40759, field40650);
                method33025(field40760, field40659);
                method33024(field40761, field40656 & 65535, field40656 >> 16);
                method33024(field40762, Math.round(field40657), Math.round(field40658));
                method33024(field40763, field40945[0], field40945[1]);
                method33023(field40764, field40944);
                method33023(field40765, field40655);
                method33025(field40766, field40665);
                method33025(field40767, field40666);
                method33025(field40768, (float) field40591.gameSettings.gamma);
                method33023(field40769, field40591.gameSettings.hideGUI ? 1 : 0);
                method33025(field40770, field40661);
                method33024(field40771, field40682, field40683);
                method33025(field40774, var13);
                if (field40924 != null) {
                    field40924.method30740();
                }

                method32984("end useProgram");
            }
        }
    }

    private static void method33022(Class7906 var0, Class7906 var1) {
        if (var0.method26492() != null) {
            GlStateManager.method23871();
        }

        if (var0.method26493() != null) {
            GlStateManager.method23875();
        }

        GlAlphaState var2 = var1.method26492();
        if (var2 != null) {
            GlStateManager.method23870(var2);
        }

        GlBlendState var3 = var1.method26493();
        if (var3 != null) {
            GlStateManager.method23874(var3);
        }
    }

    private static void method33023(Class3617 var0, int var1) {
        var0.method12251(var1);
    }

    private static void method33024(Class3621 var0, int var1, int var2) {
        var0.method12259(var1, var2);
    }

    private static void method33025(Class3620 var0, float var1) {
        var0.method12257(var1);
    }

    private static void method33026(Class3618 var0, float var1, float var2, float var3) {
        var0.method12253(var1, var2, var3);
    }

    private static void method33027(Class3615 var0, boolean var1, FloatBuffer var2) {
        var0.method12247(var1, var2);
    }

    public static int method33028(String var0) {
        if (var0.equals("colortex0") || var0.equals("gcolor")) {
            return 0;
        } else if (var0.equals("colortex1") || var0.equals("gdepth")) {
            return 1;
        } else if (var0.equals("colortex2") || var0.equals("gnormal")) {
            return 2;
        } else if (var0.equals("colortex3") || var0.equals("composite")) {
            return 3;
        } else if (var0.equals("colortex4") || var0.equals("gaux1")) {
            return 4;
        } else if (var0.equals("colortex5") || var0.equals("gaux2")) {
            return 5;
        } else if (!var0.equals("colortex6") && !var0.equals("gaux3")) {
            return !var0.equals("colortex7") && !var0.equals("gaux4") ? -1 : 7;
        } else {
            return 6;
        }
    }

    private static int method33029(String var0) {
        var0 = var0.trim();

        for (int var1 = 0; var1 < field40982.length; var1++) {
            String var2 = field40982[var1];
            if (var0.equals(var2)) {
                return field40983[var1];
            }
        }

        return 0;
    }

    private static void method33030() {
        if (field40946 == null && field40923 != null) {
            field40946 = method32959(15, field40923);
        }

        if (field40946 == null) {
            field40946 = new Class6626(field40948, field40948);
        }
    }

    private static void method33031() {
        field40981 = new IdentityHashMap<Block, Integer>(300);
        if (field40981.isEmpty()) {
            for (ResourceLocation var1 : Registry.BLOCK.method9190()) {
                Block var2 = Registry.BLOCK.getOrDefault(var1);
                int var3 = Registry.BLOCK.getId(var2);
                field40981.put(var2, var3);
            }
        }

        BufferedReader var11 = null;

        try {
            var11 = new BufferedReader(new InputStreamReader(field40885.method14639("/mc_Entity_x.txt")));
        } catch (Exception var9) {
        }

        if (var11 != null) {
            String var12;
            try {
                while ((var12 = var11.readLine()) != null) {
                    Matcher var13 = field40984.matcher(var12);
                    if (var13.matches()) {
                        String var14 = var13.group(1);
                        String var4 = var13.group(2);
                        int var5 = Integer.parseInt(var4);
                        ResourceLocation var6 = new ResourceLocation(var14);
                        if (Registry.BLOCK.method9193(var6)) {
                            Block var7 = Registry.BLOCK.getOrDefault(var6);
                            field40981.put(var7, var5);
                        } else {
                            Class7399.method23637("Unknown block name %s", var14);
                        }
                    } else {
                        Class7399.method23637("unmatched %s\n", var12);
                    }
                }
            } catch (Exception var10) {
                Class7399.method23633("Error parsing mc_Entity_x.txt");
            }
        }

        if (var11 != null) {
            try {
                var11.close();
            } catch (Exception var8) {
            }
        }
    }

    private static IntBuffer method33032(IntBuffer var0) {
        int var1 = var0.limit();

        for (int var2 = var0.position(); var2 < var1; var2++) {
            var0.put(var2, 0);
        }

        return var0;
    }

    public static void method33033() {
        if (field40594) {
            method32984("Shaders.uninit pre");

            for (int var0 = 0; var0 < field40847.length; var0++) {
                Class7906 var1 = field40847[var0];
                if (var1.method26486() != 0) {
                    ARBShaderObjects.glDeleteObjectARB(var1.method26486());
                    method32984("del programRef");
                }

                var1.method26498(0);
                var1.method26497(0);
                var1.method26499((String) null);
                var1.method26500((IntBuffer) null);
                var1.method26501(0);
            }

            field40851 = false;
            if (field40807 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(field40807);
                field40807 = 0;
                method32984("del dfb");
            }

            if (field40808 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(field40808);
                field40808 = 0;
                method32984("del sfb");
            }

            if (field40973 != null) {
                GlStateManager.method23867(field40973);
                method33032(field40973);
                method32984("del dfbDepthTextures");
            }

            if (field40972 != null) {
                GlStateManager.method23867(field40972);
                method33032(field40972);
                method32984("del dfbTextures");
            }

            if (field40975 != null) {
                GlStateManager.method23867(field40975);
                method33032(field40975);
                method32984("del shadow depth");
            }

            if (field40974 != null) {
                GlStateManager.method23867(field40974);
                method33032(field40974);
                method32984("del shadow color");
            }

            if (field40976 != null) {
                method33032(field40976);
            }

            if (field40946 != null) {
                field40946.method20203();
                field40946 = null;
            }

            Class7399.method23634("Uninit");
            field40783 = 0;
            field40794 = false;
            field40594 = false;
            method32984("Shaders.uninit");
        }
    }

    public static void method33034() {
        field40602 = 0;
    }

    public static void method33035() {
        field40784 = true;
    }

    private static void method33036() {
        field40601 = field40591.getMainWindow().getFramebufferWidth();
        field40602 = field40591.getMainWindow().getFramebufferHeight();
        field40603 = Math.round((float) field40601 * field40865);
        field40604 = Math.round((float) field40602 * field40865);
        method33038();
    }

    private static void method33037() {
        field40784 = false;
        field40785 = Math.round((float) field40787 * field40866);
        field40786 = Math.round((float) field40788 * field40866);
        method33040();
    }

    private static void method33038() {
        if (field40807 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(field40807);
            GlStateManager.method23867(field40973);
            GlStateManager.method23867(field40972);
        }

        field40807 = EXTFramebufferObject.glGenFramebuffersEXT();
        GL32.glGenTextures((IntBuffer) ((Buffer) field40973).clear().limit(field40802));
        GL32.glGenTextures((IntBuffer) ((Buffer) field40972).clear().limit(16));
        ((Buffer) field40973).position(0);
        ((Buffer) field40972).position(0);
        EXTFramebufferObject.glBindFramebufferEXT(36160, field40807);
        GL32.glDrawBuffers(0);
        GL32.glReadBuffer(0);

        for (int var0 = 0; var0 < field40802; var0++) {
            GlStateManager.bindTexture(field40973.get(var0));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9728);
            GL32.glTexParameteri(3553, 10240, 9728);
            GL32.glTexParameteri(3553, 34891, 6409);
            GL32.glTexImage2D(3553, 0, 6402, field40603, field40604, 0, 6402, 5126, (FloatBuffer) null);
        }

        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field40973.get(0), 0);
        GL32.glDrawBuffers(field40976);
        GL32.glReadBuffer(0);
        method32984("FT d");

        for (int var2 = 0; var2 < field40801; var2++) {
            GlStateManager.bindTexture(field40980.method38905(var2));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9729);
            GL32.glTexParameteri(3553, 10240, 9729);
            GL32.glTexImage2D(3553, 0, field40809[var2], field40603, field40604, 0, method33039(field40809[var2]), 33639, (ByteBuffer) null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, field40980.method38905(var2), 0);
            method32984("FT c");
        }

        for (int var3 = 0; var3 < field40801; var3++) {
            GlStateManager.bindTexture(field40980.method38906(var3));
            GL32.glTexParameteri(3553, 10242, 33071);
            GL32.glTexParameteri(3553, 10243, 33071);
            GL32.glTexParameteri(3553, 10241, 9729);
            GL32.glTexParameteri(3553, 10240, 9729);
            GL32.glTexImage2D(3553, 0, field40809[var3], field40603, field40604, 0, method33039(field40809[var3]), 33639, (ByteBuffer) null);
            method32984("FT ca");
        }

        int var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (var4 == 36058) {
            method32989("[Shaders] Error: Failed framebuffer incomplete formats");

            for (int var1 = 0; var1 < field40801; var1++) {
                GlStateManager.bindTexture(field40980.method38905(var1));
                GL32.glTexImage2D(3553, 0, 6408, field40603, field40604, 0, 32993, 33639, (ByteBuffer) null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var1, 3553, field40980.method38905(var1), 0);
                method32984("FT c");
            }

            var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (var4 == 36053) {
                Class7399.method23634("complete");
            }
        }

        GlStateManager.bindTexture(0);
        if (var4 != 36053) {
            method32989("[Shaders] Error: Failed creating framebuffer! (Status " + var4 + ")");
        } else {
            Class7399.method23634("Framebuffer created.");
        }
    }

    private static int method33039(int var0) {
        switch (var0) {
            case 33333:
            case 33334:
            case 33339:
            case 33340:
            case 36208:
            case 36209:
            case 36226:
            case 36227:
                return 36251;
            default:
                return 32993;
        }
    }

    private static void method33040() {
        if (field40804 != 0) {
            if (field40808 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(field40808);
                GlStateManager.method23867(field40975);
                GlStateManager.method23867(field40974);
            }

            field40808 = EXTFramebufferObject.glGenFramebuffersEXT();
            EXTFramebufferObject.glBindFramebufferEXT(36160, field40808);
            GL32.glDrawBuffer(0);
            GL32.glReadBuffer(0);
            GL32.glGenTextures((IntBuffer) ((Buffer) field40975).clear().limit(field40804));
            GL32.glGenTextures((IntBuffer) ((Buffer) field40974).clear().limit(field40803));
            ((Buffer) field40975).position(0);
            ((Buffer) field40974).position(0);

            for (int var0 = 0; var0 < field40804; var0++) {
                GlStateManager.bindTexture(field40975.get(var0));
                GL32.glTexParameterf(3553, 10242, 33071.0F);
                GL32.glTexParameterf(3553, 10243, 33071.0F);
                int var1 = field40859[var0] ? 9728 : 9729;
                GL32.glTexParameteri(3553, 10241, var1);
                GL32.glTexParameteri(3553, 10240, var1);
                if (field40857[var0]) {
                    GL32.glTexParameteri(3553, 34892, 34894);
                }

                GL32.glTexImage2D(3553, 0, 6402, field40785, field40786, 0, 6402, 5126, (FloatBuffer) null);
            }

            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field40975.get(0), 0);
            method32984("FT sd");

            for (int var2 = 0; var2 < field40803; var2++) {
                GlStateManager.bindTexture(field40974.get(var2));
                GL32.glTexParameterf(3553, 10242, 33071.0F);
                GL32.glTexParameterf(3553, 10243, 33071.0F);
                int var4 = field40861[var2] ? 9728 : 9729;
                GL32.glTexParameteri(3553, 10241, var4);
                GL32.glTexParameteri(3553, 10240, var4);
                GL32.glTexImage2D(3553, 0, 6408, field40785, field40786, 0, 32993, 33639, (ByteBuffer) null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, field40974.get(var2), 0);
                method32984("FT sc");
            }

            GlStateManager.bindTexture(0);
            if (field40803 > 0) {
                GL32.glDrawBuffers(field40977);
            }

            int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (var3 != 36053) {
                method32989("[Shaders] Error: Failed creating shadow framebuffer! (Status " + var3 + ")");
            } else {
                Class7399.method23634("Shadow framebuffer created.");
            }
        }
    }

    public static void beginRender(Minecraft var0, ActiveRenderInfo var1, float var2, long var3) {
        method32984("pre beginRender");
        checkWorldChanged(field40591.world);
        field40591 = var0;
        field40591.getProfiler().startSection("init");
        field40592 = field40591.gameRenderer;
        if (!field40594) {
            try {
                method33006();
            } catch (IllegalStateException var14) {
                if (Config.method26946(var14.getMessage()).equals("Function is not supported")) {
                    method32989("[Shaders] Error: " + var14.getMessage());
                    var14.printStackTrace();
                    method32952("OFF");
                    return;
                }
            }
        }

        if (field40591.getMainWindow().getFramebufferWidth() != field40601 || field40591.getMainWindow().getFramebufferHeight() != field40602) {
            method33036();
        }

        if (field40784) {
            method33037();
        }

        field40645++;
        if (field40645 >= 720720) {
            field40645 = 0;
        }

        field40642 = System.currentTimeMillis();
        if (field40643 == 0L) {
            field40643 = field40642;
        }

        field40644 = field40642 - field40643;
        field40643 = field40642;
        field40646 = (float) field40644 / 1000.0F;
        field40647 = field40647 + field40646;
        field40647 %= 3600.0F;
        GlStateManager.pushMatrix();
        ShadersRender.method17161(var1, var0, var2);
        GlStateManager.popMatrix();
        ClientWorld var5 = field40591.world;
        if (var5 != null) {
            field40635 = var5.method6784();
            field40637 = (field40635 - field40636) % 24000L;
            if (field40637 < 0L) {
                field40637 += 24000L;
            }

            field40636 = field40635;
            field40641 = var5.method7002();
            field40649 = var5.method6792(var2);
            float var6 = (float) field40644 * 0.01F;
            float var7 = (float) Math.exp(Math.log(0.5) * (double) var6 / (double) (field40650 < field40649 ? field40652 : field40651));
            field40650 = field40650 * var7 + field40649 * (1.0F - var7);
            Entity var8 = var1.getRenderViewEntity();
            if (var8 != null) {
                field40611 = var8 instanceof LivingEntity && ((LivingEntity) var8).isSleeping();
                field40659 = (float) var1.getPos().getY();
                field40656 = field40591.getRenderManager().method32208(var8, var2);
                float var9 = (float) field40644 * 0.01F;
                float var10 = (float) Math.exp(Math.log(0.5) * (double) var9 / (double) field40653);
                field40657 = field40657 * var10 + (float) (field40656 & 65535) * (1.0F - var10);
                field40658 = field40658 * var10 + (float) (field40656 >> 16) * (1.0F - var10);
                FluidState var11 = var1.method37512();
                if (var11.method23486(FluidTags.field40469)) {
                    field40655 = 1;
                } else if (var11.method23486(FluidTags.field40470)) {
                    field40655 = 2;
                } else {
                    field40655 = 0;
                }

                if (var8 instanceof LivingEntity) {
                    LivingEntity var12 = (LivingEntity) var8;
                    field40665 = 0.0F;
                    if (var12.isPotionActive(Effects.NIGHT_VISION)) {
                        GameRenderer var13 = field40592;
                        field40665 = GameRenderer.method750(var12, var2);
                    }

                    field40666 = 0.0F;
                    if (var12.isPotionActive(Effects.BLINDNESS)) {
                        int var18 = var12.getActivePotionEffect(Effects.BLINDNESS).method8628();
                        field40666 = Config.method26832((float) var18 / 20.0F, 0.0F, 1.0F);
                    }
                }

                Vector3d var16 = var5.method6873(var8.getPosition(), var2);
                var16 = Class9680.method37877(var16, var5, var8, var2);
                field40632 = (float) var16.x;
                field40633 = (float) var16.y;
                field40634 = (float) var16.z;
            }
        }

        field40605 = true;
        field40607 = false;
        isShadowPass = false;
        field40613 = false;
        field40614 = false;
        field40615 = false;
        field40616 = false;
        method33042();
        field40775 = field40778;
        field40776 = field40779;
        field40777 = field40780;
        ((Buffer) field40968).position(0);
        ((Buffer) field40960).position(0);
        field40968.put(field40960);
        ((Buffer) field40968).position(0);
        ((Buffer) field40960).position(0);
        ((Buffer) field40969).position(0);
        ((Buffer) field40962).position(0);
        field40969.put(field40962);
        ((Buffer) field40969).position(0);
        ((Buffer) field40962).position(0);
        method32984("beginRender");
        ShadersRender.method17160(field40592, var1, 0, var2, var3);
        field40591.getProfiler().endSection();
        EXTFramebufferObject.glBindFramebufferEXT(36160, field40807);

        for (int var15 = 0; var15 < field40801; var15++) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var15, 3553, field40980.method38905(var15), 0);
        }

        method32984("end beginRender");
    }

    private static void method33042() {
        if (field40804 >= 1) {
            GlStateManager.activeTexture(33988);
            GlStateManager.bindTexture(field40975.get(0));
            if (field40804 >= 2) {
                GlStateManager.activeTexture(33989);
                GlStateManager.bindTexture(field40975.get(1));
            }
        }

        GlStateManager.activeTexture(33984);

        for (int var0 = 0; var0 < field40801; var0++) {
            GlStateManager.bindTexture(field40980.method38905(var0));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
            GlStateManager.bindTexture(field40980.method38906(var0));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
        }

        GlStateManager.bindTexture(0);

        for (int var1 = 0; var1 < 4 && 4 + var1 < field40801; var1++) {
            GlStateManager.activeTexture(33991 + var1);
            GlStateManager.bindTexture(field40980.method38905(4 + var1));
        }

        GlStateManager.activeTexture(33990);
        GlStateManager.bindTexture(field40973.get(0));
        if (field40802 >= 2) {
            GlStateManager.activeTexture(33995);
            GlStateManager.bindTexture(field40973.get(1));
            if (field40802 >= 3) {
                GlStateManager.activeTexture(33996);
                GlStateManager.bindTexture(field40973.get(2));
            }
        }

        for (int var2 = 0; var2 < field40803; var2++) {
            GlStateManager.activeTexture(33997 + var2);
            GlStateManager.bindTexture(field40974.get(var2));
        }

        if (field40947) {
            GlStateManager.activeTexture(33984 + field40946.method20208());
            GlStateManager.bindTexture(field40946.method20207());
        }

        method32965(field40920);
        GlStateManager.activeTexture(33984);
    }

    public static void checkWorldChanged(ClientWorld var0) {
        if (field40918 != var0) {
            ClientWorld var1 = field40918;
            field40918 = var0;
            method33052(field40591.getRenderViewEntity());
            int var2 = Class8509.method30144(var1);
            int var3 = Class8509.method30144(var0);
            if (var3 != var2) {
                boolean var4 = field40919.contains(var2);
                boolean var5 = field40919.contains(var3);
                if (var4 || var5) {
                    method33033();
                }
            }

            Class9717.method38077();
        }
    }

    public static void beginRenderPass(float var0, long var1) {
        if (!isShadowPass) {
            EXTFramebufferObject.glBindFramebufferEXT(36160, field40807);
            GL11.glViewport(0, 0, field40603, field40604);
            field40852 = null;
            Class9336.method35312(field40856.method1135());
            method33021(field40818);
            method32984("end beginRenderPass");
        }
    }

    public static void method33045(int var0, int var1, int var2, int var3) {
        GlStateManager.colorMask(true, true, true, true);
        if (isShadowPass) {
            GL11.glViewport(0, 0, field40785, field40786);
        } else {
            GL11.glViewport(0, 0, field40603, field40604);
            EXTFramebufferObject.glBindFramebufferEXT(36160, field40807);
            field40608 = true;
            GlStateManager.method23787();
            GlStateManager.enableDepthTest();
            method33020(field40978);
            method33021(field40818);
            method32984("beginRenderPass");
        }
    }

    public static void method33046(int var0) {
        field40938 = var0;
        if (field40668) {
            method33023(field40725, var0);
        }
    }

    public static void method33047(float var0, float var1, float var2) {
        field40940 = var0;
        field40941 = var1;
        field40942 = var2;
        method33026(field40727, field40940, field40941, field40942);
    }

    public static void method33048(float var0, float var1, float var2, float var3) {
        field40629 = var0;
        field40630 = var1;
        field40631 = var2;
    }

    public static void method33049() {
        if (isShadowPass) {
            method32984("shadow clear pre");
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field40975.get(0), 0);
            GL32.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            GL32.glDrawBuffers(field40814.method26488());
            method32983("shadow clear");
            GL32.glClear(16640);
            method32984("shadow clear");
        } else {
            method32984("clear pre");
            if (field40810[0]) {
                Class7755 var0 = field40811[0];
                if (var0 != null) {
                    GL32.glClearColor(var0.method25701(), var0.method25702(), var0.method25703(), var0.method25704());
                }

                if (field40980.method38909(0)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, field40980.method38906(0), 0);
                    GL32.glDrawBuffers(36064);
                    GL32.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, field40980.method38905(0), 0);
                }

                GL32.glDrawBuffers(36064);
                GL32.glClear(16384);
            }

            if (field40810[1]) {
                GL32.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
                Class7755 var2 = field40811[1];
                if (var2 != null) {
                    GL32.glClearColor(var2.method25701(), var2.method25702(), var2.method25703(), var2.method25704());
                }

                if (field40980.method38909(1)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, field40980.method38906(1), 0);
                    GL32.glDrawBuffers(36065);
                    GL32.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, field40980.method38905(1), 0);
                }

                GL32.glDrawBuffers(36065);
                GL32.glClear(16384);
            }

            for (int var3 = 2; var3 < field40801; var3++) {
                if (field40810[var3]) {
                    GL32.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                    Class7755 var1 = field40811[var3];
                    if (var1 != null) {
                        GL32.glClearColor(var1.method25701(), var1.method25702(), var1.method25703(), var1.method25704());
                    }

                    if (field40980.method38909(var3)) {
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var3, 3553, field40980.method38906(var3), 0);
                        GL32.glDrawBuffers(36064 + var3);
                        GL32.glClear(16384);
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var3, 3553, field40980.method38905(var3), 0);
                    }

                    GL32.glDrawBuffers(36064 + var3);
                    GL32.glClear(16384);
                }
            }

            method33020(field40976);
            method32983("clear");
            method32984("clear");
        }
    }

    public static void method33050(MatrixStack var0, ActiveRenderInfo var1, float var2) {
        Entity var3 = var1.getRenderViewEntity();
        Vector3d var4 = var1.getPos();
        double var5 = var4.x;
        double var7 = var4.y;
        double var9 = var4.z;
        method33051(var3);
        field40778 = var5 - (double) field40781;
        field40779 = var7;
        field40780 = var9 - (double) field40782;
        GL32.glGetFloatv(2983, (FloatBuffer) ((Buffer) field40960).position(0));
        Class7759.method25730((FloatBuffer) ((Buffer) field40961).position(0), (FloatBuffer) ((Buffer) field40960).position(0), field40953, field40952);
        ((Buffer) field40960).position(0);
        ((Buffer) field40961).position(0);
        Matrix4f var11 = var0.getLast().getMatrix();
        Matrix4f var12 = new Matrix4f(var11);
        var12.method35506();
        var12.method35524(field40628);
        ((Buffer) field40962).position(0);
        field40962.put(field40628);
        Class7759.method25730((FloatBuffer) ((Buffer) field40963).position(0), (FloatBuffer) ((Buffer) field40962).position(0), field40955, field40954);
        ((Buffer) field40962).position(0);
        ((Buffer) field40963).position(0);
        method32984("setCamera");
    }

    private static void method33051(Entity var0) {
        double var1 = Math.abs(field40778 - field40775);
        double var3 = Math.abs(field40780 - field40777);
        double var5 = Math.abs(field40778);
        double var7 = Math.abs(field40780);
        if (var1 > 1000.0 || var3 > 1000.0 || var5 > 1000000.0 || var7 > 1000000.0) {
            method33052(var0);
        }
    }

    private static void method33052(Entity var0) {
        if (var0 == null) {
            field40781 = 0;
            field40782 = 0;
        } else {
            field40781 = (int) var0.getPosX() / 1000 * 1000;
            field40782 = (int) var0.getPosZ() / 1000 * 1000;
        }
    }

    public static void method33053(MatrixStack var0, ActiveRenderInfo var1, float var2) {
        Entity var3 = var1.getRenderViewEntity();
        Vector3d var4 = var1.getPos();
        double var5 = var4.x;
        double var7 = var4.y;
        double var9 = var4.z;
        method33051(var3);
        field40778 = var5 - (double) field40781;
        field40779 = var7;
        field40780 = var9 - (double) field40782;
        GL32.glViewport(0, 0, field40785, field40786);
        GL32.glMatrixMode(5889);
        GL32.glLoadIdentity();
        if (field40791) {
            GL32.glOrtho((double) (-field40790), (double) field40790, (double) (-field40790), (double) field40790, 0.05F, 256.0);
        } else {
            GlStateManager.multMatrix(Matrix4f.method35511((double) field40789, (float) field40785 / (float) field40786, 0.05F, 256.0F));
        }

        var0.translate(0.0, 0.0, -100.0);
        var0.rotate(Vector3f.XP.rotationDegrees(90.0F));
        field40638 = field40591.world.method7001(var2);
        field40639 = field40638 < 0.75F ? field40638 + 0.25F : field40638 - 0.75F;
        float var11 = field40638 * -360.0F;
        float var12 = field40937 > 0.0F ? var11 % field40937 - field40937 * 0.5F : 0.0F;
        if ((double) field40639 <= 0.5) {
            var0.rotate(Vector3f.ZP.rotationDegrees(var11 - var12));
            var0.rotate(Vector3f.XP.rotationDegrees(field40936));
            field40640 = field40639;
        } else {
            var0.rotate(Vector3f.ZP.rotationDegrees(var11 + 180.0F - var12));
            var0.rotate(Vector3f.XP.rotationDegrees(field40936));
            field40640 = field40639 - 0.5F;
        }

        if (field40791) {
            float var13 = field40943;
            float var14 = var13 / 2.0F;
            var0.translate((double) ((float) var5 % var13 - var14), (double) ((float) var7 % var13 - var14), (double) ((float) var9 % var13 - var14));
        }

        float var21 = field40639 * (float) (Math.PI * 2);
        float var22 = (float) Math.cos((double) var21);
        float var15 = (float) Math.sin((double) var21);
        float var16 = field40936 * (float) (Math.PI * 2);
        float var17 = var22;
        float var18 = var15 * (float) Math.cos((double) var16);
        float var19 = var15 * (float) Math.sin((double) var16);
        if ((double) field40639 > 0.5) {
            var17 = -var22;
            var18 = -var18;
            var19 = -var19;
        }

        field40624[0] = var17;
        field40624[1] = var18;
        field40624[2] = var19;
        field40624[3] = 0.0F;
        GL32.glGetFloatv(2983, (FloatBuffer) ((Buffer) field40964).position(0));
        Class7759.method25730((FloatBuffer) ((Buffer) field40965).position(0), (FloatBuffer) ((Buffer) field40964).position(0), field40957, field40956);
        ((Buffer) field40964).position(0);
        ((Buffer) field40965).position(0);
        Matrix4f var20 = var0.getLast().getMatrix();
        var20.write((FloatBuffer) ((Buffer) field40966).position(0));
        Class7759.method25730((FloatBuffer) ((Buffer) field40967).position(0), (FloatBuffer) ((Buffer) field40966).position(0), field40959, field40958);
        ((Buffer) field40966).position(0);
        ((Buffer) field40967).position(0);
        method33027(field40752, false, field40960);
        method33027(field40753, false, field40961);
        method33027(field40751, false, field40968);
        method33027(field40749, false, field40962);
        method33027(field40750, false, field40963);
        method33027(field40754, false, field40969);
        method33027(field40755, false, field40964);
        method33027(field40756, false, field40965);
        method33027(field40757, false, field40966);
        method33027(field40758, false, field40967);
        method32984("setCamera");
    }

    public static void method33054(MatrixStack var0) {
        var0.rotate(Vector3f.ZP.rotationDegrees(field40936 * 1.0F));
        method32984("preCelestialRotate");
    }

    public static void method33055(MatrixStack var0) {
        Matrix4f var1 = var0.getLast().getMatrix();
        Matrix4f var2 = new Matrix4f(var1);
        var2.method35506();
        var2.method35524(field40628);
        Class7759.method25728(field40620, field40628, field40626);
        Class7759.method25728(field40621, field40628, field40627);
        System.arraycopy(field40640 == field40639 ? field40620 : field40621, 0, field40622, 0, 3);
        method33026(field40743, field40620[0], field40620[1], field40620[2]);
        method33026(field40744, field40621[0], field40621[1], field40621[2]);
        method33026(field40745, field40622[0], field40622[1], field40622[2]);
        if (field40924 != null) {
            field40924.method30740();
        }

        method32984("postCelestialRotate");
    }

    public static void method33056(MatrixStack var0) {
        Matrix4f var1 = var0.getLast().getMatrix();
        Matrix4f var2 = new Matrix4f(var1);
        var2.method35506();
        var2.method35524(field40628);
        Class7759.method25728(field40623, field40628, field40625);
        method33026(field40746, field40623[0], field40623[1], field40623[2]);
        if (field40924 != null) {
            field40924.method30740();
        }
    }

    public static void method33057() {
        if (field40599) {
            for (int var0 = 0; var0 < field40801; var0++) {
                if ((field40853 & 1 << var0) != 0) {
                    GlStateManager.activeTexture(33984 + field40949[var0]);
                    GL32.glTexParameteri(3553, 10241, 9987);
                    GL32.glGenerateMipmap(3553);
                }
            }

            GlStateManager.activeTexture(33984);
        }
    }

    public static void method33058() {
        GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        method33059();
        int var0 = field40848.method26491();
        if (var0 > 1) {
            for (int var1 = 1; var1 < var0; var1++) {
                field40773.method12251(var1);
                method33059();
            }

            field40773.method12251(0);
        }
    }

    private static void method33059() {
        if (!method33167()) {
            GL32.glBegin(5);
            GL32.glTexCoord2f(0.0F, 0.0F);
            GL32.glVertex3f(0.0F, 0.0F, 0.0F);
            GL32.glTexCoord2f(1.0F, 0.0F);
            GL32.glVertex3f(1.0F, 0.0F, 0.0F);
            GL32.glTexCoord2f(0.0F, 1.0F);
            GL32.glVertex3f(0.0F, 1.0F, 0.0F);
            GL32.glTexCoord2f(1.0F, 1.0F);
            GL32.glVertex3f(1.0F, 1.0F, 0.0F);
            GL32.glEnd();
        } else {
            GL32.glBegin(7);
            GL32.glTexCoord2f(0.0F, 0.0F);
            GL32.glVertex3f(0.0F, 0.0F, 0.0F);
            GL32.glTexCoord2f(1.0F, 0.0F);
            GL32.glVertex3f(1.0F, 0.0F, 0.0F);
            GL32.glTexCoord2f(1.0F, 1.0F);
            GL32.glVertex3f(1.0F, 1.0F, 0.0F);
            GL32.glTexCoord2f(0.0F, 1.0F);
            GL32.glVertex3f(0.0F, 1.0F, 0.0F);
            GL32.glEnd();
        }
    }

    public static void method33060() {
        if (!isShadowPass) {
            boolean var0 = method33062(field40837);
            if (field40851) {
                method32984("pre-render Deferred");
                method33063(field40838, false);
                var0 = true;
            }

            if (var0) {
                method33042();

                for (int var1 = 0; var1 < field40801; var1++) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var1, 3553, field40980.method38905(var1), 0);
                }

                if (field40840.method26488() != null) {
                    method33020(field40840.method26488());
                } else {
                    method33020(field40976);
                }

                GlStateManager.activeTexture(33984);
                field40591.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
            }
        }
    }

    public static void renderCompositeFinal() {
        if (!isShadowPass) {
            method33062(field40842);
            method32984("pre-render CompositeFinal");
            method33063(field40843, true);
        }
    }

    private static boolean method33062(Class7906 var0) {
        boolean var1 = false;
        Boolean[] var2 = var0.method26495();

        for (int var3 = 0; var3 < field40801; var3++) {
            if (Config.method26987(var2[var3])) {
                field40980.method38908(var3);
                var1 = true;
            }
        }

        return var1;
    }

    private static void method33063(Class7906[] var0, boolean var1) {
        if (!isShadowPass) {
            GL32.glPushMatrix();
            GL32.glLoadIdentity();
            GL32.glMatrixMode(5889);
            GL32.glPushMatrix();
            GL32.glLoadIdentity();
            GL32.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
            GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.enableTexture();
            GlStateManager.disableAlphaTest();
            GlStateManager.disableBlend();
            GlStateManager.enableDepthTest();
            GlStateManager.depthFunc(519);
            GlStateManager.depthMask(false);
            GlStateManager.disableLighting();
            if (field40804 >= 1) {
                GlStateManager.activeTexture(33988);
                GlStateManager.bindTexture(field40975.get(0));
                if (field40804 >= 2) {
                    GlStateManager.activeTexture(33989);
                    GlStateManager.bindTexture(field40975.get(1));
                }
            }

            for (int var2 = 0; var2 < field40801; var2++) {
                GlStateManager.activeTexture(33984 + field40949[var2]);
                GlStateManager.bindTexture(field40980.method38905(var2));
            }

            GlStateManager.activeTexture(33990);
            GlStateManager.bindTexture(field40973.get(0));
            if (field40802 >= 2) {
                GlStateManager.activeTexture(33995);
                GlStateManager.bindTexture(field40973.get(1));
                if (field40802 >= 3) {
                    GlStateManager.activeTexture(33996);
                    GlStateManager.bindTexture(field40973.get(2));
                }
            }

            for (int var5 = 0; var5 < field40803; var5++) {
                GlStateManager.activeTexture(33997 + var5);
                GlStateManager.bindTexture(field40974.get(var5));
            }

            if (field40947) {
                GlStateManager.activeTexture(33984 + field40946.method20208());
                GlStateManager.bindTexture(field40946.method20207());
            }

            if (var1) {
                method32965(field40921);
            } else {
                method32965(field40922);
            }

            GlStateManager.activeTexture(33984);

            for (int var6 = 0; var6 < field40801; var6++) {
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var6, 3553, field40980.method38906(var6), 0);
            }

            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field40973.get(0), 0);
            GL32.glDrawBuffers(field40976);
            method32984("pre-composite");

            for (int var7 = 0; var7 < var0.length; var7++) {
                Class7906 var3 = var0[var7];
                if (var3.method26485() != 0) {
                    method33021(var3);
                    method32984(var3.method26482());
                    if (field40853 != 0) {
                        method33057();
                    }

                    method33064();
                    method33058();
                    method33065();

                    for (int var4 = 0; var4 < field40801; var4++) {
                        if (var3.method26496()[var4]) {
                            field40980.method38908(var4);
                            GlStateManager.activeTexture(33984 + field40949[var4]);
                            GlStateManager.bindTexture(field40980.method38905(var4));
                            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var4, 3553, field40980.method38906(var4), 0);
                        }
                    }

                    GlStateManager.activeTexture(33984);
                }
            }

            method32984("composite");
            if (var1) {
                method33066();
                field40607 = true;
            }

            GlStateManager.enableLighting();
            GlStateManager.enableTexture();
            GlStateManager.enableAlphaTest();
            GlStateManager.enableBlend();
            GlStateManager.depthFunc(515);
            GlStateManager.depthMask(true);
            GL32.glPopMatrix();
            GL32.glMatrixMode(5888);
            GL32.glPopMatrix();
            method33021(field40813);
        }
    }

    private static void method33064() {
        Class7125 var0 = field40848.method26494();
        if (var0 != null) {
            int var1 = (int) ((float) field40603 * var0.method22232());
            int var2 = (int) ((float) field40604 * var0.method22233());
            int var3 = (int) ((float) field40603 * var0.method22231());
            int var4 = (int) ((float) field40604 * var0.method22231());
            GL32.glViewport(var1, var2, var3, var4);
        }
    }

    private static void method33065() {
        Class7125 var0 = field40848.method26494();
        if (var0 != null) {
            GL32.glViewport(0, 0, field40603, field40604);
        }
    }

    private static void method33066() {
        field40608 = false;
        field40591.getFramebuffer().bindFramebuffer(true);
        GlStateManager.framebufferTexture2D(FramebufferConstants.GL_FRAMEBUFFER, FramebufferConstants.GL_COLOR_ATTACHMENT0, 3553, field40591.getFramebuffer().getFramebufferTexture(), 0);
        GL32.glViewport(0, 0, field40591.getMainWindow().getFramebufferWidth(), field40591.getMainWindow().getFramebufferHeight());
        GlStateManager.depthMask(true);
        GL32.glClearColor(field40629, field40630, field40631, 1.0F);
        GL32.glClear(16640);
        GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.enableTexture();
        GlStateManager.disableAlphaTest();
        GlStateManager.disableBlend();
        GlStateManager.enableDepthTest();
        GlStateManager.depthFunc(519);
        GlStateManager.depthMask(false);
        method32984("pre-final");
        method33021(field40845);
        method32984("final");
        if (field40853 != 0) {
            method33057();
        }

        method33058();
        method32984("renderCompositeFinal");
    }

    public static void endRender() {
        if (isShadowPass) {
            method32984("shadow endRender");
        } else {
            if (!field40607) {
                renderCompositeFinal();
            }

            field40605 = false;
            GlStateManager.colorMask(true, true, true, true);
            method33021(field40813);
            RenderHelper.disableStandardItemLighting();
            method32984("endRender end");
        }
    }

    public static void method33068() {
        field40606 = true;
        field40668 = true;
        method33020(field40976);
        method33021(field40821);
        method33132(-2, 0);
    }

    public static void method33069(Vector3d var0) {
        field40632 = (float) var0.x;
        field40633 = (float) var0.y;
        field40634 = (float) var0.z;
        method33026(field40728, field40632, field40633, field40634);
    }

    public static void method33070(MatrixStack var0) {
        BufferBuilder var1 = Tessellator.getInstance().getBuffer();
        float var2 = (float) (field40591.gameSettings.renderDistanceChunks * 16);
        double var3 = (double) var2 * 0.9238;
        double var5 = (double) var2 * 0.3826;
        double var7 = -var5;
        double var9 = -var3;
        double var11 = 16.0;
        double var13 = -field40779 + field40918.getWorldInfo().method20052() + 12.0 - 16.0;
        if (field40779 < field40918.getWorldInfo().method20052()) {
            var13 = -4.0;
        }

        GlStateManager.pushMatrix();
        GlStateManager.multMatrix(var0.getLast().getMatrix());
        var1.begin(7, DefaultVertexFormats.field43341);
        var1.pos(var7, var13, var9).endVertex();
        var1.pos(var7, var11, var9).endVertex();
        var1.pos(var9, var11, var7).endVertex();
        var1.pos(var9, var13, var7).endVertex();
        var1.pos(var9, var13, var7).endVertex();
        var1.pos(var9, var11, var7).endVertex();
        var1.pos(var9, var11, var5).endVertex();
        var1.pos(var9, var13, var5).endVertex();
        var1.pos(var9, var13, var5).endVertex();
        var1.pos(var9, var11, var5).endVertex();
        var1.pos(var7, var11, var3).endVertex();
        var1.pos(var7, var13, var3).endVertex();
        var1.pos(var7, var13, var3).endVertex();
        var1.pos(var7, var11, var3).endVertex();
        var1.pos(var5, var11, var3).endVertex();
        var1.pos(var5, var13, var3).endVertex();
        var1.pos(var5, var13, var3).endVertex();
        var1.pos(var5, var11, var3).endVertex();
        var1.pos(var3, var11, var5).endVertex();
        var1.pos(var3, var13, var5).endVertex();
        var1.pos(var3, var13, var5).endVertex();
        var1.pos(var3, var11, var5).endVertex();
        var1.pos(var3, var11, var7).endVertex();
        var1.pos(var3, var13, var7).endVertex();
        var1.pos(var3, var13, var7).endVertex();
        var1.pos(var3, var11, var7).endVertex();
        var1.pos(var5, var11, var9).endVertex();
        var1.pos(var5, var13, var9).endVertex();
        var1.pos(var5, var13, var9).endVertex();
        var1.pos(var5, var11, var9).endVertex();
        var1.pos(var7, var11, var9).endVertex();
        var1.pos(var7, var13, var9).endVertex();
        var1.pos(var9, var13, var9).endVertex();
        var1.pos(var9, var13, var3).endVertex();
        var1.pos(var3, var13, var3).endVertex();
        var1.pos(var3, var13, var9).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.popMatrix();
    }

    public static void method33071(MatrixStack var0) {
        method33056(var0);
        GL11.glColor3f(field40940, field40941, field40942);
        method33070(var0);
        GL11.glColor3f(field40632, field40633, field40634);
    }

    public static void method33072() {
        field40606 = false;
        method33020(field40976);
        method33021(field40667 ? field40819 : field40818);
        method33135();
    }

    public static void method33073() {
        method32984("beginUpdateChunks1");
        method32983("beginUpdateChunks1");
        if (!isShadowPass) {
            method33021(field40823);
        }

        method32984("beginUpdateChunks2");
        method32983("beginUpdateChunks2");
    }

    public static void method33074() {
        method32984("endUpdateChunks1");
        method32983("endUpdateChunks1");
        if (!isShadowPass) {
            method33021(field40823);
        }

        method32984("endUpdateChunks2");
        method32983("endUpdateChunks2");
    }

    public static boolean method33075(GameSettings var0) {
        if (!field40886) {
            return true;
        } else {
            method32984("shouldRenderClouds");
            return isShadowPass ? field40863 : var0.cloudOption != CloudOption.OFF;
        }
    }

    public static void method33076() {
        field40668 = true;
        method33132(-3, 0);
        method33021(field40822);
    }

    public static void method33077() {
        method33122();
        method33135();
        method33021(field40667 ? field40819 : field40818);
    }

    public static void method33078() {
        if (field40605) {
            method33021(field40831);
        }
    }

    public static void method33079(Entity var0) {
        if (field40605) {
            if (var0.isGlowing()) {
                method33021(field40832);
            } else {
                method33021(field40831);
            }

            method33080(var0);
        }
    }

    public static void method33080(Entity var0) {
        if (field40686.method12242()) {
            int var1 = Class9115.method33998(var0);
            int var2 = Class9793.method38604(var1);
            field40686.method12251(var2);
        }
    }

    public static void method33081() {
        if (field40605 && field40834.method26485() != field40813.method26485()) {
            method33021(field40834);
            GlStateManager.enableAlphaTest();
            GlStateManager.alphaFunc(516, 0.0F);
            GlStateManager.blendFunc(770, 771);
        }
    }

    public static void method33082() {
        if (field40605 && field40834.method26485() != field40813.method26485()) {
            method33021(field40831);
            GlStateManager.disableAlphaTest();
        }
    }

    public static void endEntities() {
        if (field40605) {
            method33080((Entity) null);
            method33021(field40667 ? field40819 : field40818);
        }
    }

    public static void method33084() {
        if (field40605) {
            field40610 = true;
        }
    }

    public static void method33085() {
        if (field40605) {
            field40610 = false;
        }
    }

    public static void method33086(float var0, float var1, float var2, float var3) {
        if (field40605 && !isShadowPass) {
            field40685.method12233(var0, var1, var2, var3);
        }
    }

    public static void method33087() {
        if (field40605) {
            Class9336.method35315(field40856);
            if (!isShadowPass) {
                method33020(field40979);
            }
        }
    }

    public static void method33088() {
        if (field40605 && !isShadowPass) {
            method33020(field40831.method26488());
        }
    }

    public static void beginBlockEntities() {
        if (field40605) {
            method32984("beginBlockEntities");
            method33021(field40828);
        }
    }

    public static void nextBlockEntity(TileEntity var0) {
        if (field40605) {
            method32984("nextBlockEntity");
            method33021(field40828);
            method33091(var0);
        }
    }

    public static void method33091(TileEntity var0) {
        if (field40687.method12242()) {
            int var1 = method33092(var0);
            field40687.method12251(var1);
        }
    }

    private static int method33092(TileEntity var0) {
        if (var0 == null) {
            return -1;
        } else {
            BlockState var1 = var0.getBlockState();
            return Class9172.method34259(var1);
        }
    }

    public static void method33093() {
        if (field40605) {
            method32984("endBlockEntities");
            method33091((TileEntity) null);
            method33021(field40667 ? field40819 : field40818);
            Class9336.method35312(field40856.method1135());
        }
    }

    public static void method33094() {
        method33021(field40819);
    }

    public static void method33095() {
        method33021(field40818);
    }

    public static void method33096() {
        method33021(field40819);
    }

    public static void method33097() {
        if (!isShadowPass && field40663) {
            ((Buffer) field40971).clear();
            GL32.glReadPixels(field40603 / 2, field40604 / 2, 1, 1, 6402, 5126, field40971);
            field40660 = field40971.get(0);
            float var0 = (float) field40644 * 0.01F;
            float var1 = (float) Math.exp(Math.log(0.5) * (double) var0 / (double) field40662);
            field40661 = field40661 * var1 + field40660 * (1.0F - var1);
        }
    }

    public static void method33098() {
        if (!isShadowPass) {
            GlStateManager.enableDepthTest();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(770, 771);
            GlStateManager.enableAlphaTest();
            method33021(field40836);
        }
    }

    public static void method33099() {
        GlStateManager.disableBlend();
        method33021(field40819);
    }

    public static void method33100() {
        if (!isShadowPass && field40802 >= 3) {
            GlStateManager.activeTexture(33996);
            GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, field40603, field40604);
            GlStateManager.activeTexture(33984);
        }
    }

    public static void method33101() {
        if (field40802 >= 2) {
            GlStateManager.activeTexture(33995);
            method32984("pre copy depth");
            GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, field40603, field40604);
            method32984("copy depth");
            GlStateManager.activeTexture(33984);
        }

        Class9336.method35312(field40856.method1135());
    }

    public static void method33102() {
        if (field40605) {
            if (!isShadowPass) {
                method33060();
                method33021(field40840);
                GlStateManager.enableBlend();
                GlStateManager.depthMask(true);
            } else {
                GlStateManager.depthMask(true);
            }
        }
    }

    public static void method33103() {
        if (field40605) {
            if (isShadowPass) {
            }

            method33021(field40667 ? field40819 : field40818);
        }
    }

    public static void method33104(MatrixStack var0) {
        if ((double) field40864 != 1.0) {
            var0.scale(1.0F, 1.0F, field40864);
        }
    }

    public static void method33105(MatrixStack var0, boolean var1) {
        GL32.glMatrixMode(5888);
        GL32.glPushMatrix();
        GL32.glMatrixMode(5889);
        GL32.glPushMatrix();
        GL32.glMatrixMode(5888);
        var0.push();
        if (var1) {
            method33021(field40841);
        } else {
            method33021(field40835);
        }

        method32984("beginHand");
        method32983("beginHand");
    }

    public static void method33106(MatrixStack var0) {
        method32984("pre endHand");
        method32983("pre endHand");
        var0.pop();
        GL32.glMatrixMode(5889);
        GL32.glPopMatrix();
        GL32.glMatrixMode(5888);
        GL32.glPopMatrix();
        GlStateManager.blendFunc(770, 771);
        method32984("endHand");
    }

    public static void method33107() {
        GlStateManager.disableLighting();
        GlStateManager.disableBlend();
    }

    public static void method33108() {
    }

    public static void method33109(int var0) {
        GL32.glEnable(var0);
        if (var0 == 3553) {
            method33115();
        } else if (var0 == 2912) {
            method33121();
        }
    }

    public static void method33110(int var0) {
        GL32.glDisable(var0);
        if (var0 == 3553) {
            method33116();
        } else if (var0 == 2912) {
            method33122();
        }
    }

    public static void method33111(int var0) {
        GL32.glEnable(var0);
        method33115();
    }

    public static void method33112(int var0) {
        GL32.glDisable(var0);
        method33116();
    }

    public static void method33113(int var0) {
        GL32.glEnable(var0);
        method33121();
    }

    public static void method33114(int var0) {
        GL32.glDisable(var0);
        method33122();
    }

    public static void method33115() {
        if (field40606) {
            method33021(field40821);
        } else if (field40848 == field40817) {
            method33021(field40667 ? field40819 : field40818);
        }
    }

    public static void method33116() {
        if (field40606) {
            method33021(field40820);
        } else if (field40848 == field40818 || field40848 == field40819) {
            method33021(field40817);
        }
    }

    public static void method33117() {
        field40850.method26359(field40848);
    }

    public static void method33118() {
        Class7906 var0 = field40850.method26360();
        method33021(var0);
    }

    public static void method33119() {
        method33117();
        method33021(field40817);
    }

    public static void method33120() {
        method33118();
    }

    public static void method33121() {
        field40668 = true;
        method33023(field40725, field40938);
        method33025(field40726, field40939);
    }

    public static void method33122() {
        field40668 = false;
        method33023(field40725, 0);
    }

    public static void method33123(Class2135 var0) {
        method33046(var0.field13987);
    }

    public static void method33124(float var0) {
        field40939 = var0;
        if (field40668) {
            method33025(field40726, var0);
        }
    }

    public static void method33125(int var0, int var1) {
        GL11.glFogi(var0, var1);
        if (var0 == 2917) {
            field40938 = var1;
            if (field40668) {
                method33023(field40725, field40938);
            }
        }
    }

    public static void method33126() {
        field40667 = true;
        if (field40848 == field40818) {
            method33021(field40819);
        }
    }

    public static void method33127() {
        field40667 = false;
        if (field40848 == field40819) {
            method33021(field40818);
        }
    }

    public static int method33128() {
        return field40985[field40986 * 2];
    }

    public static int method33129() {
        return field40985[field40986 * 2 + 1];
    }

    public static int method33130(int var0) {
        field40985[field40986 * 2] = field40985[field40986 * 2] & 65535 | var0 << 16;
        return var0;
    }

    public static int method33131(int var0) {
        field40985[field40986 * 2 + 1] = field40985[field40986 * 2 + 1] & -65536 | var0 & 65535;
        return var0;
    }

    public static void method33132(int var0, int var1) {
        field40986++;
        field40985[field40986 * 2] = var0 & 65535 | var1 << 16;
        field40985[field40986 * 2 + 1] = 0;
    }

    public static void method33133(int var0) {
        field40986++;
        field40985[field40986 * 2] = var0 & 65535;
        field40985[field40986 * 2 + 1] = 0;
    }

    public static void method33134(Block var0) {
        field40986++;
        int var1 = var0.method11526(var0.getDefaultState()).ordinal();
        field40985[field40986 * 2] = Registry.BLOCK.getId(var0) & 65535 | var1 << 16;
        field40985[field40986 * 2 + 1] = 0;
    }

    public static void method33135() {
        field40985[field40986 * 2] = 0;
        field40985[field40986 * 2 + 1] = 0;
        field40986--;
    }

    public static void method33136() {
        field40591.getProfiler().endSection();
    }

    public static String method33137() {
        if (field40885 == null) {
            return null;
        } else {
            return field40885 instanceof Class4670 ? null : field40885.method14641();
        }
    }

    public static InputStream method33138(String var0) {
        return field40885 == null ? null : field40885.method14639(var0);
    }

    public static void method33139(boolean var0) {
        if (var0) {
            field40878 += 2;
            if (field40878 > 4) {
                field40878 = 0;
            }
        } else {
            field40878 -= 2;
            if (field40878 < 0) {
                field40878 = 4;
            }
        }

        field40878 = field40878 / 2 * 2;
        field40878 = Config.method26830(field40878, 0, 4);
    }

    public static void method33140() {
        try {
            Class var0 = Class.forName("shadersmod.transform.SMCClassTransformer");
        } catch (Throwable var1) {
            return;
        }

        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }

    public static void method33141() {
        method33142();
        if (field40886) {
            Class9172.method34264();
            Class8715.method31434();
            Class9793.method38605();
        }
    }

    private static void method33142() {
        field40917 = new HashMap<String, String>();
        if (field40886) {
            List<String> var0 = new ArrayList();
            String var1 = "/shaders/lang/";
            String var2 = "en_us";
            String var3 = ".lang";
            var0.add(var1 + var2 + var3);
            var0.add(var1 + method33143(var2) + var3);
            if (!Config.method26928().language.equals(var2)) {
                String var4 = Config.method26928().language;
                var0.add(var1 + var4 + var3);
                var0.add(var1 + method33143(var4) + var3);
            }

            try {
                for (String var5 : var0) {
                    InputStream var6 = field40885.method14639(var5);
                    if (var6 != null) {
                        Class20 var7 = new Class20();
                        Class8043.method27617(var6, var7);
                        var6.close();

                        for (String var9 : (Set<String>) (Set<?>) var7.keySet()) {
                            String var10 = var7.getProperty(var9);
                            field40917.put(var9, var10);
                        }
                    }
                }
            } catch (IOException var11) {
                var11.printStackTrace();
            }
        }
    }

    private static String method33143(String var0) {
        int var1 = var0.indexOf(95);
        return var1 < 0 ? var0 : var0.substring(0, var1) + var0.substring(var1).toUpperCase(Locale.ROOT);
    }

    public static String method33144(String var0, String var1) {
        String var2 = field40917.get(var0);
        return var2 == null ? var1 : var2;
    }

    public static boolean method33145(String var0) {
        if (var0 == null) {
            return false;
        } else if (var0.length() <= 0) {
            return false;
        } else {
            int var1 = var0.lastIndexOf("/");
            if (var1 >= 0) {
                var0 = var0.substring(var1 + 1);
            }

            Class7906 var2 = method33146(var0);
            return var2 != null;
        }
    }

    public static Class7906 method33146(String var0) {
        return field40812.method34918(var0);
    }

    public static void method33147(ItemStack var0) {
        field40618 = method33152(var0);
    }

    public static void method33148(ItemStack var0) {
        field40619 = method33152(var0);
    }

    public static boolean method33149() {
        return field40618;
    }

    public static boolean method33150() {
        return field40619;
    }

    public static boolean method33151() {
        return field40613 && field40614;
    }

    private static boolean method33152(ItemStack var0) {
        if (var0 == null) {
            return false;
        } else {
            Item var1 = var0.getItem();
            if (var1 == null) {
                return false;
            } else if (!(var1 instanceof Class3292)) {
                return false;
            } else {
                Class3292 var2 = (Class3292) var1;
                Block var3 = var2.method11845();
                if (var3 == null) {
                    return false;
                } else {
                    RenderType var4 = Class8928.method32630(var3.getDefaultState());
                    return var4 == Class9025.field41291;
                }
            }
        }
    }

    public static boolean method33153(Hand var0) {
        return var0 == Hand.MAIN_HAND && field40615 ? true : var0 == Hand.OFF_HAND && field40616;
    }

    public static boolean method33154() {
        return !field40615 && !field40616;
    }

    public static void method33155(boolean var0, boolean var1) {
        field40615 = var0;
        field40616 = var1;
    }

    public static void method33156(boolean var0, boolean var1) {
        field40613 = var0;
        field40614 = var1;
    }

    public static boolean method33157() {
        return field40613;
    }

    public static boolean method33158() {
        return field40614;
    }

    public static float method33159() {
        return field40792 < 0.0F ? -1.0F : field40790 * field40792;
    }

    public static void method33160(boolean var0) {
        field40612 = var0;
    }

    public static boolean method33161() {
        return field40612;
    }

    public static void method33162() {
        if (field40605) {
            method33021(field40829);
        }
    }

    public static void method33163() {
        if (field40605) {
            method33021(field40828);
        }
    }

    public static ClientWorld method33164() {
        return field40918;
    }

    public static BlockPos method33165() {
        return new BlockPos(field40778, field40779, field40780);
    }

    public static boolean method33166() {
        return field40924 != null;
    }

    public static boolean method33167() {
        return field40681 ? field40595.GL_NV_geometry_shader4 : true;
    }

    public static boolean method33168() {
        return field40886;
    }

    public static boolean method33169() {
        return field40886;
    }

    public static boolean isEffectsModelView() {
        return field40886;
    }

    public static void method33171() {
        Class8496.method30084();
    }
}

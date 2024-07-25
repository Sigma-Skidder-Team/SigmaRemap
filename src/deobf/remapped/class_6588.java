package remapped;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GLCapabilities;

public class class_6588 {
   public static MinecraftClient field_33837;
   public static GameRenderer field_33681;
   public static boolean field_33664 = false;
   public static boolean field_33648 = false;
   public static GLCapabilities field_33895;
   public static String field_33589;
   public static String field_33717;
   public static String field_33661;
   public static boolean field_33761 = false;
   public static int field_33662 = 0;
   private static int field_33676 = 0;
   private static int field_33969 = 0;
   public static int field_33803 = 0;
   public static int field_33764 = 0;
   public static boolean field_33804 = false;
   public static boolean field_33638 = false;
   public static boolean field_33834 = false;
   public static boolean field_33890 = false;
   public static boolean field_33945 = false;
   public static boolean field_33851 = false;
   public static boolean field_33874;
   private static boolean field_33726;
   private static boolean field_33919;
   private static boolean field_33682;
   private static boolean field_33953;
   private static boolean field_33902;
   public static boolean field_33830 = false;
   public static boolean field_33617 = false;
   public static boolean field_33799 = false;
   public static float[] field_33906 = new float[4];
   public static float[] field_33787 = new float[4];
   public static float[] field_33939 = new float[4];
   public static float[] field_33944 = new float[4];
   public static float[] field_33854 = new float[4];
   public static float[] field_33729 = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   public static float[] field_33882 = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   public static float[] field_33867 = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   private static float[] field_33819 = new float[16];
   public static float field_33699;
   public static float field_33959;
   public static float field_33888;
   public static float field_33797;
   public static float field_33668;
   public static float field_33670;
   public static long field_33773 = 0L;
   public static long field_33875 = 0L;
   public static long field_33937 = 0L;
   public static float field_33974 = 0.0F;
   public static float field_33808 = 0.0F;
   public static float field_33625 = 0.0F;
   public static int field_33678 = 0;
   public static long field_33626 = 0L;
   public static long field_33656 = 0L;
   public static long field_33903 = 0L;
   public static int field_33860 = 0;
   public static float field_33843 = 0.0F;
   public static float field_33704 = 0.0F;
   public static int field_33942 = 0;
   public static float field_33961 = 0.0F;
   public static float field_33829 = 0.0F;
   public static float field_33636 = 600.0F;
   public static float field_33649 = 200.0F;
   public static float field_33610 = 10.0F;
   public static boolean field_33821 = false;
   public static int field_33725 = 0;
   public static int field_33757 = 0;
   public static float field_33738 = 0.0F;
   public static float field_33659 = 0.0F;
   public static float field_33816 = 0.0F;
   public static float field_33880 = 0.0F;
   public static float field_33973 = 0.0F;
   public static float field_33818 = 1.0F;
   public static boolean field_33665 = false;
   public static int field_33853 = 1;
   public static float field_33933 = 0.0F;
   public static float field_33718 = 0.0F;
   public static boolean field_33735 = false;
   public static boolean field_33947 = true;
   private static int field_33912 = 11;
   public static int field_33899 = field_33912 + 0;
   public static int field_33801 = field_33912 + 1;
   public static int field_33817 = field_33912 + 2;
   public static boolean field_33608 = false;
   public static boolean field_33622 = false;
   public static boolean field_33827 = false;
   public static boolean field_33932 = false;
   public static boolean field_33759 = false;
   public static boolean field_33865 = false;
   private static boolean field_33838 = false;
   private static int field_33917 = 3;
   private static boolean field_33881 = false;
   public static int field_33946 = 0;
   public static int field_33639 = 0;
   private static class_4198 field_33600 = new class_4198();
   public static class_85 field_33596 = field_33600.method_19531("entityColor");
   public static class_8800 field_33848 = field_33600.method_19530("entityId");
   public static class_8800 field_33762 = field_33600.method_19530("blockEntityId");
   public static class_8800 field_33767 = field_33600.method_19530(field_33700[62]);
   public static class_8800 field_33840 = field_33600.method_19530(field_33700[42]);
   public static class_8800 field_33612 = field_33600.method_19530(field_33700[63]);
   public static class_8800 field_33872 = field_33600.method_19530(field_33700[64]);
   public static class_8800 field_33714 = field_33600.method_19530(field_33700[67]);
   public static class_8800 field_33733 = field_33600.method_19530(field_33700[66]);
   public static class_8800 field_33960 = field_33600.method_19530(field_33700[65]);
   public static class_8800 field_33667 = field_33600.method_19530(field_33700[68]);
   public static class_8800 field_33883 = field_33600.method_19530(field_33700[69]);
   public static class_8800 field_33807 = field_33600.method_19530(field_33700[74]);
   public static class_8800 field_33835 = field_33600.method_19530(field_33700[76]);
   public static class_8800 field_33887 = field_33600.method_19530(field_33700[75]);
   public static class_8800 field_33702 = field_33600.method_19530(field_33700[77]);
   public static class_8800 field_33792 = field_33600.method_19530(field_33700[78]);
   public static class_8800 field_33896 = field_33600.method_19530(field_33700[271]);
   public static class_8800 field_33931 = field_33600.method_19530(field_33700[81]);
   public static class_8800 field_33977 = field_33600.method_19530(field_33700[83]);
   public static class_8800 field_33719 = field_33600.method_19530(field_33700[85]);
   public static class_8800 field_33839 = field_33600.method_19530(field_33700[70]);
   public static class_8800 field_33771 = field_33600.method_19530(field_33700[71]);
   public static class_8800 field_33908 = field_33600.method_19530(field_33700[72]);
   public static class_8800 field_33675 = field_33600.method_19530(field_33700[73]);
   public static class_8800 field_33615 = field_33600.method_19530(field_33700[79]);
   public static class_8800 field_33930 = field_33600.method_19530(field_33700[80]);
   public static class_8800 field_33778 = field_33600.method_19530(field_33700[82]);
   public static class_8800 field_33978 = field_33600.method_19530(field_33700[84]);
   public static class_8800 field_33927 = field_33600.method_19530(field_33700[87]);
   public static class_8800 field_33715 = field_33600.method_19530(field_33700[88]);
   public static class_8800 field_33692 = field_33600.method_19530(field_33700[89]);
   public static class_8800 field_33653 = field_33600.method_19530(field_33700[90]);
   public static class_8800 field_33852 = field_33600.method_19530(field_33700[86]);
   public static class_8800 field_33716 = field_33600.method_19530(field_33700[91]);
   public static class_8800 field_33734 = field_33600.method_19530("tex");
   public static class_8800 field_33940 = field_33600.method_19530("heldItemId");
   public static class_8800 field_33772 = field_33600.method_19530("heldBlockLightValue");
   public static class_8800 field_33918 = field_33600.method_19530("heldItemId2");
   public static class_8800 field_33766 = field_33600.method_19530("heldBlockLightValue2");
   public static class_8800 field_33894 = field_33600.method_19530("fogMode");
   public static class_2296 field_33879 = field_33600.method_19532("fogDensity");
   public static class_6777 field_33637 = field_33600.method_19538("fogColor");
   public static class_6777 field_33891 = field_33600.method_19538("skyColor");
   public static class_8800 field_33870 = field_33600.method_19530("worldTime");
   public static class_8800 field_33657 = field_33600.method_19530("worldDay");
   public static class_8800 field_33663 = field_33600.method_19530("moonPhase");
   public static class_8800 field_33672 = field_33600.method_19530("frameCounter");
   public static class_2296 field_33878 = field_33600.method_19532("frameTime");
   public static class_2296 field_33768 = field_33600.method_19532("frameTimeCounter");
   public static class_2296 field_33858 = field_33600.method_19532("sunAngle");
   public static class_2296 field_33979 = field_33600.method_19532("shadowAngle");
   public static class_2296 field_33815 = field_33600.method_19532("rainStrength");
   public static class_2296 field_33673 = field_33600.method_19532("aspectRatio");
   public static class_2296 field_33921 = field_33600.method_19532("viewWidth");
   public static class_2296 field_33855 = field_33600.method_19532("viewHeight");
   public static class_2296 field_33674 = field_33600.method_19532("near");
   public static class_2296 field_33754 = field_33600.method_19532("far");
   public static class_6777 field_33752 = field_33600.method_19538("sunPosition");
   public static class_6777 field_33786 = field_33600.method_19538("moonPosition");
   public static class_6777 field_33820 = field_33600.method_19538("shadowLightPosition");
   public static class_6777 field_33833 = field_33600.method_19538("upPosition");
   public static class_6777 field_33813 = field_33600.method_19538("previousCameraPosition");
   public static class_6777 field_33703 = field_33600.method_19538("cameraPosition");
   public static class_4701 field_33712 = field_33600.method_19536("gbufferModelView");
   public static class_4701 field_33920 = field_33600.method_19536("gbufferModelViewInverse");
   public static class_4701 field_33951 = field_33600.method_19536("gbufferPreviousProjection");
   public static class_4701 field_33889 = field_33600.method_19536("gbufferProjection");
   public static class_4701 field_33777 = field_33600.method_19536("gbufferProjectionInverse");
   public static class_4701 field_33669 = field_33600.method_19536("gbufferPreviousModelView");
   public static class_4701 field_33967 = field_33600.method_19536("shadowProjection");
   public static class_4701 field_33864 = field_33600.method_19536("shadowProjectionInverse");
   public static class_4701 field_33643 = field_33600.method_19536("shadowModelView");
   public static class_4701 field_33686 = field_33600.method_19536("shadowModelViewInverse");
   public static class_2296 field_33683 = field_33600.method_19532("wetness");
   public static class_2296 field_33965 = field_33600.method_19532("eyeAltitude");
   public static class_7836 field_33958 = field_33600.method_19535("eyeBrightness");
   public static class_7836 field_33728 = field_33600.method_19535("eyeBrightnessSmooth");
   public static class_7836 field_33708 = field_33600.method_19535("terrainTextureSize");
   public static class_8800 field_33607 = field_33600.method_19530("terrainIconSize");
   public static class_8800 field_33914 = field_33600.method_19530("isEyeInWater");
   public static class_2296 field_33925 = field_33600.method_19532("nightVision");
   public static class_2296 field_33693 = field_33600.method_19532("blindness");
   public static class_2296 field_33789 = field_33600.method_19532("screenBrightness");
   public static class_8800 field_33836 = field_33600.method_19530("hideGUI");
   public static class_2296 field_33632 = field_33600.method_19532(field_33700[183]);
   public static class_7836 field_33740 = field_33600.method_19535("atlasSize");
   public static class_799 field_33850 = field_33600.method_19534("blendFunc");
   public static class_8800 field_33776 = field_33600.method_19530("instanceId");
   public static class_2296 field_33796 = field_33600.method_19532("playerMood");
   public static double field_33633;
   public static double field_33736;
   public static double field_33913;
   public static double field_33915;
   public static double field_33769;
   public static double field_33641;
   public static int field_33593;
   public static int field_33701;
   public static int field_33897 = 0;
   public static boolean field_33859 = false;
   public static int field_33976 = 1024;
   public static int field_33907 = 1024;
   public static int field_33685 = 1024;
   public static int field_33924 = 1024;
   public static float field_33857 = 90.0F;
   public static float field_33935 = 160.0F;
   public static boolean field_33651 = true;
   public static float field_33654 = -1.0F;
   public static int field_33861 = 0;
   public static boolean field_33671 = false;
   public static boolean field_33845 = false;
   public static final int field_33957 = 8;
   public static final int field_33775 = 8;
   public static final int field_33898 = 3;
   public static final int field_33805 = 8;
   public static final int field_33856 = 2;
   public static int field_33893 = 0;
   public static int field_33595 = 0;
   public static int field_33722 = 0;
   public static int field_33846 = 0;
   public static int field_33720 = 0;
   public static int field_33677 = 0;
   public static int field_33619 = 0;
   public static int field_33779 = 0;
   private static int[] field_33755 = new int[8];
   public static boolean[] field_33605 = new boolean[8];
   public static class_2637[] field_33706 = new class_2637[8];
   private static class_7743 field_33948 = new class_7743();
   public static final class_3009 field_33936 = field_33948.method_35042();
   public static final class_3009 field_33598 = field_33948.method_35047(field_33700[67], field_33936);
   public static final class_3009 field_33616 = field_33948.method_35047("shadow_solid", field_33598);
   public static final class_3009 field_33696 = field_33948.method_35047("shadow_cutout", field_33598);
   public static final class_3009 field_33748 = field_33948.method_35041("gbuffers_basic", field_33936);
   public static final class_3009 field_33587 = field_33948.method_35041("gbuffers_textured", field_33748);
   public static final class_3009 field_33784 = field_33948.method_35041("gbuffers_textured_lit", field_33587);
   public static final class_3009 field_33628 = field_33948.method_35041("gbuffers_skybasic", field_33748);
   public static final class_3009 field_33650 = field_33948.method_35041("gbuffers_skytextured", field_33587);
   public static final class_3009 field_33810 = field_33948.method_35041("gbuffers_clouds", field_33587);
   public static final class_3009 field_33884 = field_33948.method_35041("gbuffers_terrain", field_33784);
   public static final class_3009 field_33609 = field_33948.method_35041("gbuffers_terrain_solid", field_33884);
   public static final class_3009 field_33900 = field_33948.method_35041("gbuffers_terrain_cutout_mip", field_33884);
   public static final class_3009 field_33604 = field_33948.method_35041("gbuffers_terrain_cutout", field_33884);
   public static final class_3009 field_33901 = field_33948.method_35041("gbuffers_damagedblock", field_33884);
   public static final class_3009 field_33956 = field_33948.method_35041("gbuffers_block", field_33884);
   public static final class_3009 field_33963 = field_33948.method_35041("gbuffers_beaconbeam", field_33587);
   public static final class_3009 field_33721 = field_33948.method_35041("gbuffers_item", field_33784);
   public static final class_3009 field_33713 = field_33948.method_35041("gbuffers_entities", field_33784);
   public static final class_3009 field_33802 = field_33948.method_35041("gbuffers_entities_glowing", field_33713);
   public static final class_3009 field_33812 = field_33948.method_35041("gbuffers_armor_glint", field_33587);
   public static final class_3009 field_33822 = field_33948.method_35041("gbuffers_spidereyes", field_33587);
   public static final class_3009 field_33790 = field_33948.method_35041("gbuffers_hand", field_33784);
   public static final class_3009 field_33645 = field_33948.method_35041("gbuffers_weather", field_33784);
   public static final class_3009 field_33620 = field_33948.method_35056("deferred_pre");
   public static final class_3009[] field_33707 = field_33948.method_35050("deferred", 16);
   public static final class_3009 field_33710 = field_33707[0];
   public static final class_3009 field_33975 = field_33948.method_35041("gbuffers_water", field_33884);
   public static final class_3009 field_33828 = field_33948.method_35041("gbuffers_hand_water", field_33790);
   public static final class_3009 field_33618 = field_33948.method_35056("composite_pre");
   public static final class_3009[] field_33624 = field_33948.method_35054(field_33700[85], 16);
   public static final class_3009 field_33606 = field_33624[0];
   public static final class_3009 field_33862 = field_33948.method_35055(field_33700[316]);
   public static final int field_33594 = field_33948.method_35049();
   public static final class_3009[] field_33972 = field_33948.method_35043();
   public static class_3009 field_33770 = field_33936;
   public static int field_33869 = 0;
   private static class_2935 field_33709 = new class_2935();
   private static boolean field_33926 = false;
   public static IntBuffer field_33601 = null;
   private static int field_33695 = 0;
   public static Properties field_33697 = null;
   public static Properties field_33950 = null;
   public static class_8143 field_33690 = null;
   public static boolean[] field_33756 = new boolean[2];
   public static boolean[] field_33795 = new boolean[2];
   public static boolean[] field_33746 = new boolean[2];
   public static boolean[] field_33841 = new boolean[8];
   public static boolean[] field_33629 = new boolean[8];
   public static boolean field_33794 = false;
   public static boolean field_33964 = false;
   public static float field_33751 = 0.125F;
   public static float field_33825 = 1.0F;
   public static float field_33763 = 1.0F;
   public static int field_33621 = 0;
   public static int field_33785 = 0;
   public static int field_33611 = 0;
   public static int field_33747 = 0;
   public static int field_33922 = 0;
   public static int field_33750 = 0;
   public static boolean field_33962 = true;
   public static boolean field_33603 = true;
   public static boolean field_33634 = true;
   public static class_3350 field_33723 = new class_3350("oldLighting", "Classic Lighting", 0);
   public static class_3350 field_33652 = new class_3350("oldHandLight", "Old Hand Light", 0);
   public static int field_33631 = 0;
   public static final int field_33646 = 3;
   public static final int field_33640 = 2;
   public static final String[] field_33954 = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
   public static final String[] field_33885 = new String[]{"Nearest", "Linear"};
   public static final int[] field_33782 = new int[]{9728, 9984, 9986};
   public static final int[] field_33644 = new int[]{9728, 9729};
   private static class_8591 field_33602 = null;
   public static boolean field_33724 = false;
   public static String field_33597;
   public static final String field_33586 = "OFF";
   public static final String field_33943 = "(internal)";
   public static final String field_33952 = "shaderpacks";
   public static final String field_33982 = "optionsshaders.txt";
   public static final File field_33909 = new File(MinecraftClient.getInstance().runDirectory, "shaderpacks");
   public static File field_33911 = new File(MinecraftClient.getInstance().runDirectory, "optionsshaders.txt");
   private static class_6843[] field_33658 = null;
   private static Set<String> field_33760 = null;
   public static class_8471[] field_33730 = null;
   public static Map<String, class_4842> field_33623 = null;
   public static Map<String, class_1342> field_33863 = new HashMap<String, class_1342>();
   public static final String field_33691 = "/shaders/shaders.properties";
   public static class_5315 field_33590 = new class_5315("clouds", "Clouds", 0);
   public static class_3350 field_33731 = new class_3350("oldLighting", "Classic Lighting", 0);
   public static class_3350 field_33823 = new class_3350("oldHandLight", "Old Hand Light", 0);
   public static class_3350 field_33642 = new class_3350("dynamicHandLight", "Dynamic Hand Light", 0);
   public static class_3350 field_33774 = new class_3350("shadowTranslucent", "Shadow Translucent", 0);
   public static class_3350 field_33970 = new class_3350("underwaterOverlay", "Underwater Overlay", 0);
   public static class_3350 field_33868 = new class_3350("sun", "Sun", 0);
   public static class_3350 field_33655 = new class_3350("moon", "Moon", 0);
   public static class_3350 field_33781 = new class_3350("vignette", "Vignette", 0);
   public static class_3350 field_33929 = new class_3350("backFace.solid", "Back-face Solid", 0);
   public static class_3350 field_33613 = new class_3350("backFace.cutout", "Back-face Cutout", 0);
   public static class_3350 field_33660 = new class_3350("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
   public static class_3350 field_33871 = new class_3350("backFace.translucent", "Back-face Translucent", 0);
   public static class_3350 field_33814 = new class_3350("rain.depth", "Rain Depth", 0);
   public static class_3350 field_33765 = new class_3350("beacon.beam.depth", "Rain Depth", 0);
   public static class_3350 field_33614 = new class_3350("separateAo", "Separate AO", 0);
   public static class_3350 field_33791 = new class_3350("frustum.culling", "Frustum Culling", 0);
   private static Map<String, String> field_33749 = new HashMap<String, String>();
   private static ClientWorld field_33680 = null;
   private static List<Integer> field_33591 = new ArrayList<Integer>();
   private static class_8147[] field_33886 = null;
   private static class_8147[] field_33980 = null;
   private static class_8147[] field_33934 = null;
   private static String field_33966 = null;
   private static class_5142 field_33873 = null;
   private static final int field_33684 = 0;
   private static final int field_33938 = 1;
   private static final int field_33588 = 2;
   private static final String[] field_33783 = new String[]{"gbuffers", field_33700[85], "deferred"};
   public static final boolean field_33928 = true;
   private static final boolean field_33904 = true;
   public static final boolean field_33905 = System.getProperty("shaders.debug.save", "false").equals("true");
   public static float field_33971 = 0.5F;
   public static float field_33689 = 0.6F;
   public static float field_33844 = 0.8F;
   public static float field_33599 = -1.0F;
   public static float field_33824 = 0.0F;
   public static float field_33981 = 0.0F;
   public static int field_33847 = 0;
   public static float field_33698 = 0.0F;
   public static float field_33780;
   public static float field_33923;
   public static float field_33753;
   public static float field_33849 = 2.0F;
   public static int field_33647 = 16;
   public static int[] field_33955 = new int[2];
   private static class_8147 field_33744;
   private static boolean field_33811 = false;
   private static int field_33666 = 256;
   public static final int[] field_33711 = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
   private static final int field_33809 = (285 + 8 * field_33594) * 4;
   private static final ByteBuffer field_33866 = (ByteBuffer)((Buffer)BufferUtils.createByteBuffer(field_33809)).limit(0);
   public static final float[] field_33741 = new float[16];
   public static final float[] field_33941 = new float[16];
   public static final float[] field_33635 = new float[16];
   public static final float[] field_33743 = new float[16];
   public static final float[] field_33800 = new float[16];
   public static final float[] field_33876 = new float[16];
   public static final float[] field_33832 = new float[16];
   public static final float[] field_33877 = new float[16];
   public static final FloatBuffer field_33968 = method_30124(16);
   public static final FloatBuffer field_33758 = method_30124(16);
   public static final FloatBuffer field_33727 = method_30124(16);
   public static final FloatBuffer field_33916 = method_30124(16);
   public static final FloatBuffer field_33630 = method_30124(16);
   public static final FloatBuffer field_33592 = method_30124(16);
   public static final FloatBuffer field_33793 = method_30124(16);
   public static final FloatBuffer field_33892 = method_30124(16);
   public static final FloatBuffer field_33737 = method_30124(16);
   public static final FloatBuffer field_33732 = method_30124(16);
   public static final FloatBuffer field_33687 = method_30124(16);
   public static final FloatBuffer field_33705 = method_30124(16);
   public static final IntBuffer field_33826 = method_30186(16);
   public static final IntBuffer field_33910 = method_30186(3);
   public static final IntBuffer field_33739 = method_30186(8);
   public static final IntBuffer field_33788 = method_30186(2);
   public static final IntBuffer field_33831 = method_30186(8);
   public static final IntBuffer field_33742 = method_30186(8);
   public static final IntBuffer field_33745 = (IntBuffer)((Buffer)method_30186(8)).limit(0);
   public static final IntBuffer field_33694 = (IntBuffer)((Buffer)method_30186(8).put(36064)).position(0).limit(1);
   public static final class_9894 field_33842 = new class_9894(field_33826, 8);
   public static Map<class_6414, Integer> field_33806;
   private static final String[] field_33688 = new String[]{
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
      field_33700[249],
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
      field_33700[247],
      field_33700[245],
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
   private static final int[] field_33627 = new int[]{
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
   private static final Pattern field_33949 = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
   public static int[] field_33798 = new int[32];
   public static int field_33679 = 0;

   private class_6588() {
   }

   private static ByteBuffer method_30221(int var0) {
      ByteBuffer var1 = field_33866;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0);
      return var1.slice();
   }

   public static IntBuffer method_30186(int var0) {
      ByteBuffer var1 = field_33866;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asIntBuffer();
   }

   private static FloatBuffer method_30124(int var0) {
      ByteBuffer var1 = field_33866;
      int var2 = var1.limit();
      ((Buffer)var1).position(var2).limit(var2 + var0 * 4);
      return var1.asFloatBuffer();
   }

   private static IntBuffer[] method_30144(int var0, int var1) {
      IntBuffer[] var2 = new IntBuffer[var0];

      for (int var3 = 0; var3 < var0; var3++) {
         var2[var3] = method_30186(var1);
      }

      return var2;
   }

   public static void method_30322() {
      class_1910.method_8671("Load shaders configuration.");

      try {
         if (!field_33909.exists()) {
            field_33909.mkdir();
         }
      } catch (Exception var8) {
         class_1910.method_8673("Failed to open the shaderpacks directory: " + field_33909);
      }

      field_33950 = new class_8407();
      field_33950.setProperty(class_4368.field_21406.method_20252(), "");
      if (field_33911.exists()) {
         try {
            FileReader var0 = new FileReader(field_33911);
            field_33950.load(var0);
            var0.close();
         } catch (Exception var7) {
         }
      }

      if (!field_33911.exists()) {
         try {
            method_30272();
         } catch (Exception var6) {
         }
      }

      class_4368[] var9 = class_4368.values();

      for (int var1 = 0; var1 < var9.length; var1++) {
         class_4368 var2 = var9[var1];
         String var3 = var2.method_20252();
         String var4 = var2.method_20251();
         String var5 = field_33950.getProperty(var3, var4);
         method_30306(var2, var5);
      }

      method_30295();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void method_30306(class_4368 var0, String var1) {
      if (var1 == null) {
         var1 = var0.method_20251();
      }

      switch (var0) {
         case field_21421:
            field_33631 = Config.method_14361(var1, 0);
            break;
         case field_21408:
            field_33603 = Config.method_14257(var1, true);
            break;
         case field_21419:
            field_33634 = Config.method_14257(var1, true);
            break;
         case field_21420:
            field_33825 = Config.method_14445(var1, 1.0F);
            break;
         case field_21418:
            field_33763 = Config.method_14445(var1, 1.0F);
            break;
         case field_21407:
            field_33751 = Config.method_14445(var1, 0.125F);
            break;
         case field_21413:
            field_33964 = Config.method_14257(var1, true);
            break;
         case field_21404:
            field_33652.method_28241(var1);
            break;
         case field_21411:
            field_33723.method_28241(var1);
            break;
         case field_21406:
            field_33597 = var1;
            break;
         case field_21425:
            field_33794 = Config.method_14257(var1, true);
            break;
         case field_21410:
            field_33962 = Config.method_14257(var1, true);
            break;
         case field_21416:
            field_33621 = Config.method_14361(var1, 0);
            break;
         case field_21403:
            field_33785 = Config.method_14361(var1, 0);
            break;
         case field_21414:
            field_33611 = Config.method_14361(var1, 0);
            break;
         case field_21423:
            field_33747 = Config.method_14361(var1, 0);
            break;
         case field_21417:
            field_33747 = Config.method_14361(var1, 0);
            break;
         case field_21405:
            field_33747 = Config.method_14361(var1, 0);
            break;
         default:
            throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   public static void method_30272() {
      class_1910.method_8671("Save shaders configuration.");
      if (field_33950 == null) {
         field_33950 = new class_8407();
      }

      class_4368[] var0 = class_4368.values();

      for (int var1 = 0; var1 < var0.length; var1++) {
         class_4368 var2 = var0[var1];
         String var3 = var2.method_20252();
         String var4 = method_30119(var2);
         field_33950.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(field_33911);
         field_33950.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         class_1910.method_8673("Error saving configuration: " + var5.getClass().getName() + ": " + var5.getMessage());
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String method_30119(class_4368 var0) {
      switch (var0) {
         case field_21421:
            return Integer.toString(field_33631);
         case field_21408:
            return Boolean.toString(field_33603);
         case field_21419:
            return Boolean.toString(field_33634);
         case field_21420:
            return Float.toString(field_33825);
         case field_21418:
            return Float.toString(field_33763);
         case field_21407:
            return Float.toString(field_33751);
         case field_21413:
            return Boolean.toString(field_33964);
         case field_21404:
            return field_33652.method_28238();
         case field_21411:
            return field_33723.method_28238();
         case field_21406:
            return field_33597;
         case field_21425:
            return Boolean.toString(field_33794);
         case field_21410:
            return Boolean.toString(field_33962);
         case field_21416:
            return Integer.toString(field_33621);
         case field_21403:
            return Integer.toString(field_33785);
         case field_21414:
            return Integer.toString(field_33611);
         case field_21423:
            return Integer.toString(field_33747);
         case field_21417:
            return Integer.toString(field_33747);
         case field_21405:
            return Integer.toString(field_33747);
         default:
            throw new IllegalArgumentException("Unknown option: " + var0);
      }
   }

   public static void method_30319(String var0) {
      field_33597 = var0;
      field_33950.setProperty(class_4368.field_21406.method_20252(), var0);
      method_30295();
   }

   public static void method_30295() {
      boolean var0 = field_33724;
      boolean var1 = method_30109();
      if (field_33837.worldRenderer != null) {
         field_33837.worldRenderer.method_20028();
      }

      field_33724 = false;
      if (field_33602 != null) {
         field_33602.method_39508();
         field_33602 = null;
         field_33749.clear();
         field_33591.clear();
         field_33658 = null;
         field_33760 = null;
         field_33730 = null;
         field_33623 = null;
         field_33863.clear();
         field_33590.method_28235();
         field_33823.method_28235();
         field_33642.method_28235();
         field_33731.method_28235();
         method_30309();
         field_33966 = null;
      }

      boolean var2 = false;
      if (Config.method_14248()) {
         class_1910.method_8671("Shaders can not be loaded, Antialiasing is enabled: " + Config.method_14447() + "x");
         var2 = true;
      }

      if (Config.method_14423()) {
         class_1910.method_8671("Shaders can not be loaded, Anisotropic Filtering is enabled: " + Config.method_14412() + "x");
         var2 = true;
      }

      if (Config.method_14355()) {
         class_1910.method_8671("Shaders can not be loaded, Fabulous Graphics is enabled.");
         var2 = true;
      }

      String var3 = field_33950.getProperty(class_4368.field_21406.method_20252(), "(internal)");
      if (!var2) {
         field_33602 = method_30121(var3);
         field_33724 = field_33602 != null;
      }

      if (field_33724) {
         class_1910.method_8671("Loaded shaderpack: " + method_30235());
      } else {
         class_1910.method_8671("No shaderpack loaded.");
         field_33602 = new class_185();
      }

      if (field_33905) {
         method_30308(new File(field_33909, "debug"));
      }

      method_30122();
      method_30269();
      field_33658 = method_30129();
      method_30210();
      boolean var4 = field_33724 != var0;
      boolean var5 = method_30109() != var1;
      if (var4 || var5) {
         class_7985.method_36237();
         if (class_7860.field_40023.method_45472()) {
            class_7860.field_40214.method_7981(null);
            class_7860.field_39960.method_7981(null);
         }

         method_30268();
      }

      if (field_33837.method_8498() != null) {
         class_1303.method_5951();
      }

      if (field_33837.worldRenderer != null) {
         field_33837.worldRenderer.method_20047();
      }

      if ((var4 || var5) && field_33837.method_8498() != null) {
         field_33837.reloadResourcesConcurrently();
      }
   }

   public static class_8591 method_30121(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         if (var0.isEmpty() || var0.equals("OFF")) {
            return null;
         } else if (var0.equals("(internal)")) {
            return new class_802();
         } else {
            try {
               File var1 = new File(field_33909, var0);
               if (var1.isDirectory()) {
                  return new class_1639(var0, var1);
               } else {
                  return var1.isFile() && var0.toLowerCase().endsWith(".zip") ? new class_5125(var0, var1) : null;
               }
            } catch (Exception var2) {
               var2.printStackTrace();
               return null;
            }
         }
      }
   }

   public static class_8591 method_30120() {
      return field_33602;
   }

   private static void method_30269() {
      field_33591.clear();

      for (int var0 = -128; var0 <= 128; var0++) {
         String var1 = "/shaders/world" + var0;
         if (field_33602.method_39506(var1)) {
            field_33591.add(var0);
         }
      }

      if (field_33591.size() > 0) {
         Integer[] var2 = field_33591.<Integer>toArray(new Integer[field_33591.size()]);
         Config.method_14277("[Shaders] Worlds: " + Config.method_14289(var2));
      }
   }

   private static void method_30210() {
      field_33590.method_28235();
      field_33823.method_28235();
      field_33642.method_28235();
      field_33731.method_28235();
      field_33774.method_28235();
      field_33970.method_28235();
      field_33868.method_28235();
      field_33655.method_28235();
      field_33781.method_28235();
      field_33929.method_28235();
      field_33613.method_28235();
      field_33660.method_28235();
      field_33871.method_28235();
      field_33814.method_28235();
      field_33765.method_28235();
      field_33614.method_28235();
      field_33791.method_28235();
      class_7330.method_33402();
      class_5644.method_25554();
      class_9713.method_44863();
      field_33873 = null;

      for (int var0 = 0; var0 < field_33972.length; var0++) {
         class_3009 var1 = field_33972[var0];
         var1.method_13736();
      }

      if (field_33602 != null) {
         class_7330.method_33404(field_33602);
         class_5644.method_25553(field_33602);
         class_9713.method_44866(field_33602);
         String var4 = "/shaders/shaders.properties";

         try {
            InputStream var5 = field_33602.method_39505(var4);
            if (var5 == null) {
               return;
            }

            var5 = class_9441.method_43672(var5, var4);
            class_8407 var2 = new class_8407();
            var2.load(var5);
            var5.close();
            field_33590.method_28242(var2);
            field_33823.method_28242(var2);
            field_33642.method_28242(var2);
            field_33731.method_28242(var2);
            field_33774.method_28242(var2);
            field_33970.method_28242(var2);
            field_33868.method_28242(var2);
            field_33781.method_28242(var2);
            field_33655.method_28242(var2);
            field_33929.method_28242(var2);
            field_33613.method_28242(var2);
            field_33660.method_28242(var2);
            field_33871.method_28242(var2);
            field_33814.method_28242(var2);
            field_33765.method_28242(var2);
            field_33614.method_28242(var2);
            field_33791.method_28242(var2);
            field_33760 = class_4593.method_21266(var2, field_33658);
            field_33730 = class_4593.method_21264(var2, field_33658);
            field_33623 = class_4593.method_21271(var2, field_33730, field_33658);
            field_33863 = class_4593.method_21268(var2, field_33658);
            field_33886 = method_30102(var2, 0);
            field_33980 = method_30102(var2, 1);
            field_33934 = method_30102(var2, 2);
            field_33966 = var2.getProperty("texture.noise");
            if (field_33966 != null) {
               field_33811 = true;
            }

            field_33873 = class_4593.method_21288(var2);
            class_4593.method_21285(var2);
            class_4593.method_21282(var2);
            class_4593.method_21269(var2);
            class_4593.method_21273(var2);
         } catch (IOException var3) {
            Config.method_14317("[Shaders] Error reading: " + var4);
         }
      }
   }

   private static class_8147[] method_30102(Properties var0, int var1) {
      String var2 = "texture." + field_33783[var1] + ".";
      Set var3 = var0.keySet();
      ArrayList var4 = new ArrayList();

      for (String var6 : var3) {
         if (var6.startsWith(var2)) {
            String var7 = class_8251.method_37832(var6, var2);
            var7 = class_8251.method_37823(var7, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String var8 = var0.getProperty(var6).trim();
            int var9 = method_30200(var1, var7);
            if (var9 < 0) {
               class_1910.method_8669("Invalid texture name: " + var6);
            } else {
               class_8147 var10 = method_30179(var9, var8);
               if (var10 != null) {
                  class_1910.method_8671("Custom texture: " + var6 + " = " + var8);
                  var4.add(var10);
               }
            }
         }
      }

      return var4.size() <= 0 ? null : var4.<class_8147>toArray(new class_8147[var4.size()]);
   }

   private static class_8147 method_30179(int var0, String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         if (var1.indexOf(58) >= 0) {
            return method_30270(var0, var1);
         } else {
            return var1.indexOf(32) >= 0 ? method_30232(var0, var1) : method_30196(var0, var1);
         }
      }
   }

   private static class_8147 method_30270(int var0, String var1) {
      String var2 = var1.trim();
      byte var3 = 0;
      if (var2.startsWith("minecraft:textures/")) {
         var2 = class_8251.method_37817(var2, ".png");
         if (var2.endsWith("_n.png")) {
            var2 = class_8251.method_37836(var2, "_n.png", ".png");
            var3 = 1;
         } else if (var2.endsWith("_s.png")) {
            var2 = class_8251.method_37836(var2, "_s.png", ".png");
            var3 = 2;
         }
      }

      if (var2.startsWith("minecraft:dynamic/lightmap_")) {
         var2 = var2.replace("lightmap", "light_map");
      }

      Identifier var4 = new Identifier(var2);
      return new class_2345(var0, var4, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class_8147 method_30232(int var0, String var1) {
      class_6284 var2 = new class_6284("Shaders");
      String[] var3 = Config.method_14302(var1, " ");
      ArrayDeque var4 = new ArrayDeque<String>(Arrays.asList(var3));
      String var5 = (String)var4.poll();
      class_7705 var6 = (class_7705)var2.method_28652((String)var4.poll(), class_7705.values(), "texture type");
      if (var6 == null) {
         class_1910.method_8669("Invalid raw texture type: " + var1);
         return null;
      } else {
         class_6351 var7 = (class_6351)var2.method_28652((String)var4.poll(), class_6351.values(), "internal format");
         if (var7 == null) {
            class_1910.method_8669("Invalid raw texture internal format: " + var1);
            return null;
         } else {
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            switch (var6) {
               case field_39094:
                  var8 = var2.method_28676((String)var4.poll(), -1);
                  break;
               case field_39095:
                  var8 = var2.method_28676((String)var4.poll(), -1);
                  var9 = var2.method_28676((String)var4.poll(), -1);
                  break;
               case field_39092:
                  var8 = var2.method_28676((String)var4.poll(), -1);
                  var9 = var2.method_28676((String)var4.poll(), -1);
                  var10 = var2.method_28676((String)var4.poll(), -1);
                  break;
               case field_39093:
                  var8 = var2.method_28676((String)var4.poll(), -1);
                  var9 = var2.method_28676((String)var4.poll(), -1);
                  break;
               default:
                  class_1910.method_8669("Invalid raw texture type: " + var6);
                  return null;
            }

            if (var8 >= 0 && var9 >= 0 && var10 >= 0) {
               class_8581 var11 = (class_8581)var2.method_28652((String)var4.poll(), class_8581.values(), "pixel format");
               if (var11 == null) {
                  class_1910.method_8669("Invalid raw texture pixel format: " + var1);
                  return null;
               } else {
                  class_4788 var12 = (class_4788)var2.method_28652((String)var4.poll(), class_4788.values(), "pixel type");
                  if (var12 == null) {
                     class_1910.method_8669("Invalid raw texture pixel type: " + var1);
                     return null;
                  } else if (!var4.isEmpty()) {
                     class_1910.method_8669("Invalid raw texture, too many parameters: " + var1);
                     return null;
                  } else {
                     return method_30233(var0, var1, var5, var6, var7, var8, var9, var10, var11, var12);
                  }
               }
            } else {
               class_1910.method_8669("Invalid raw texture size: " + var1);
               return null;
            }
         }
      }
   }

   private static class_8147 method_30233(
      int var0, String var1, String var2, class_7705 var3, class_6351 var4, int var5, int var6, int var7, class_8581 var8, class_4788 var9
   ) {
      try {
         String var10 = "shaders/" + class_8251.method_37832(var2, "/");
         InputStream var11 = field_33602.method_39505(var10);
         if (var11 == null) {
            class_1910.method_8669("Raw texture not found: " + var2);
            return null;
         } else {
            byte[] var12 = Config.method_14250(var11);
            IOUtils.closeQuietly(var11);
            ByteBuffer var13 = class_1423.method_6528(var12.length);
            var13.put(var12);
            ((Buffer)var13).flip();
            class_9051 var14 = class_5406.method_24601(var10, new class_9051(true, true));
            return new class_9157(var3, var4, var5, var6, var7, var8, var9, var13, var0, var14.method_41588(), var14.method_41589());
         }
      } catch (IOException var15) {
         class_1910.method_8669("Error loading raw texture: " + var2);
         class_1910.method_8669("" + var15.getClass().getName() + ": " + var15.getMessage());
         return null;
      }
   }

   private static class_8147 method_30196(int var0, String var1) {
      var1 = var1.trim();
      if (var1.indexOf(46) < 0) {
         var1 = var1 + ".png";
      }

      try {
         String var2 = "shaders/" + class_8251.method_37832(var1, "/");
         InputStream var3 = field_33602.method_39505(var2);
         if (var3 == null) {
            class_1910.method_8669("Texture not found: " + var1);
            return null;
         } else {
            IOUtils.closeQuietly(var3);
            class_5406 var4 = new class_5406(var2);
            var4.method_37053(field_33837.method_8498());
            return new class_984(var0, var2, var4);
         }
      } catch (IOException var5) {
         class_1910.method_8669("Error loading texture: " + var1);
         class_1910.method_8669("" + var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      }
   }

   private static int method_30200(int var0, String var1) {
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
            return field_33845 ? 5 : 4;
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
            return field_33845 ? 5 : 4;
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

   private static void method_30252(class_8147[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            class_8147 var2 = var0[var1];
            GlStateManager.method_8899(33984 + var2.method_37400());
            int var3 = var2.method_37397();
            int var4 = var2.method_37398();
            if (var4 == 3553) {
               GlStateManager.method_8791(var3);
            } else {
               GL11.glBindTexture(var4, var3);
            }
         }
      }
   }

   private static void method_30309() {
      method_30220(field_33886);
      method_30220(field_33980);
      method_30220(field_33934);
      field_33886 = null;
      field_33980 = null;
      field_33934 = null;
   }

   private static void method_30220(class_8147[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            class_8147 var2 = var0[var1];
            var2.method_37399();
         }
      }
   }

   public static class_6843[] method_30314(String var0) {
      class_6843[] var1 = (class_6843[])field_33658.clone();
      if (field_33623 == null) {
         if (field_33730 != null) {
            class_4058 var9 = new class_4058(field_33730, var1);
            var1 = (class_6843[]) Config.method_14442(var1, var9, 0);
         }

         return method_30183(var1);
      } else {
         String var2 = var0 != null ? "screen." + var0 : "screen";
         class_4842 var3 = field_33623.get(var2);
         if (var3 == null) {
            return new class_6843[0];
         } else {
            class_6843[] var4 = var3.method_22277();
            ArrayList var5 = new ArrayList();

            for (int var6 = 0; var6 < var4.length; var6++) {
               class_6843 var7 = var4[var6];
               if (var7 == null) {
                  var5.add((class_6843)null);
               } else if (var7 instanceof class_2725) {
                  class_6843[] var8 = method_30149(field_33623, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            return var5.<class_6843>toArray(new class_6843[var5.size()]);
         }
      }
   }

   public static int method_30147(String var0, int var1) {
      String var2 = var0 != null ? "screen." + var0 : "screen";
      if (field_33623 == null) {
         return var1;
      } else {
         class_4842 var3 = field_33623.get(var2);
         return var3 == null ? var1 : var3.method_22279();
      }
   }

   private static class_6843[] method_30149(Map<String, class_4842> var0, class_6843[] var1) {
      HashSet var2 = new HashSet();

      for (String var4 : var0.keySet()) {
         class_4842 var5 = (class_4842)var0.get(var4);
         class_6843[] var6 = var5.method_22277();

         for (int var7 = 0; var7 < var6.length; var7++) {
            class_6843 var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.method_31405());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for (int var10 = 0; var10 < var1.length; var10++) {
         class_6843 var11 = var1[var10];
         if (var11.method_31394()) {
            String var12 = var11.method_31405();
            if (!var2.contains(var12)) {
               var9.add(var11);
            }
         }
      }

      return var9.<class_6843>toArray(new class_6843[var9.size()]);
   }

   public static class_6843 method_30148(String var0) {
      return class_1001.method_4342(var0, field_33658);
   }

   public static class_6843[] method_30313() {
      return field_33658;
   }

   public static boolean method_30237(String var0) {
      return field_33760 == null ? false : field_33760.contains(var0);
   }

   private static class_6843[] method_30183(class_6843[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         class_6843 var3 = var0[var2];
         if (var3.method_31394()) {
            var1.add(var3);
         }
      }

      return var1.<class_6843>toArray(new class_6843[var1.size()]);
   }

   public static void method_30153() {
      method_30154(field_33658, field_33602);
   }

   private static void method_30154(class_6843[] var0, class_8591 var1) {
      class_8407 var2 = new class_8407();
      if (field_33658 != null) {
         for (int var3 = 0; var3 < var0.length; var3++) {
            class_6843 var4 = var0[var3];
            if (var4.method_31396() && var4.method_31389()) {
               var2.setProperty(var4.method_31405(), var4.method_31403());
            }
         }
      }

      try {
         method_30145(var1, var2);
      } catch (IOException var5) {
         Config.method_14317("[Shaders] Error saving configuration for " + field_33602.method_39507());
         var5.printStackTrace();
      }
   }

   private static void method_30145(class_8591 var0, Properties var1) throws IOException {
      String var2 = "shaderpacks/" + var0.method_39507() + ".txt";
      File var3 = new File(MinecraftClient.getInstance().runDirectory, var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }
   }

   private static class_6843[] method_30129() {
      try {
         String[] var0 = field_33948.method_35051();
         class_6843[] var1 = class_4593.method_21286(field_33602, var0, field_33591);
         Properties var2 = method_30188(field_33602);

         for (int var3 = 0; var3 < var1.length; var3++) {
            class_6843 var4 = var1[var3];
            String var5 = var2.getProperty(var4.method_31405());
            if (var5 != null) {
               var4.method_31401();
               if (!var4.method_31398(var5)) {
                  Config.method_14317("[Shaders] Invalid value, option: " + var4.method_31405() + ", value: " + var5);
               }
            }
         }

         return var1;
      } catch (IOException var6) {
         Config.method_14317("[Shaders] Error reading configuration for " + field_33602.method_39507());
         var6.printStackTrace();
         return null;
      }
   }

   private static Properties method_30188(class_8591 var0) throws IOException {
      class_8407 var1 = new class_8407();
      String var2 = "shaderpacks/" + var0.method_39507() + ".txt";
      File var3 = new File(MinecraftClient.getInstance().runDirectory, var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
         return var1;
      } else {
         return var1;
      }
   }

   public static class_6843[] method_30225(class_6843[] var0) {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < var0.length; var2++) {
         class_6843 var3 = var0[var2];
         if (var3.method_31389() && var3.method_31396()) {
            var1.add(var3);
         }
      }

      return var1.<class_6843>toArray(new class_6843[var1.size()]);
   }

   private static String method_30175(String var0, class_6843[] var1) {
      if (var1 != null && var1.length > 0) {
         for (int var2 = 0; var2 < var1.length; var2++) {
            class_6843 var3 = var1[var2];
            if (var3.method_31407(var0)) {
               var0 = var3.method_31391();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static ArrayList method_30243() {
      ArrayList var0 = new ArrayList();
      var0.add("OFF");
      var0.add("(internal)");
      int var1 = var0.size();

      try {
         if (!field_33909.exists()) {
            field_33909.mkdir();
         }

         File[] var2 = field_33909.listFiles();

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

   public static int method_30142(String var0) {
      int var1 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var1 != 36053) {
         System.err.format("FramebufferStatus 0x%04X at %s\n", var1, var0);
      }

      return var1;
   }

   public static int method_30273(String var0) {
      int var1 = GlStateManager.method_8925();
      if (var1 != 0 && class_6941.method_31754(var1)) {
         String var2 = Config.method_14316(var1);
         String var3 = method_30280(var1, var0);
         String var4 = String.format("OpenGL error: %s (%s)%s, at: %s", var1, var2, var3, var0);
         class_1910.method_8673(var4);
         if (Config.method_14294() && class_124.method_386("ShowGlErrorShaders", 10000L)) {
            String var5 = class_6956.method_31803("of.message.openglError", var1, var2);
            method_30158(var5);
         }
      }

      return var1;
   }

   private static String method_30280(int var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      if (var0 == 1286) {
         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         String var4 = method_30323(var3);
         String var5 = ", fbStatus: " + var3 + " (" + var4 + ")";
         var2.append(var5);
      }

      String var6 = field_33770.method_13763();
      if (var6.isEmpty()) {
         var6 = "none";
      }

      var2.append(", program: " + var6);
      class_3009 var7 = method_30187(field_33869);
      if (var7 != field_33770) {
         String var8 = var7.method_13763();
         if (var8.isEmpty()) {
            var8 = "none";
         }

         var2.append(" (" + var8 + ")");
      }

      if (var1.equals("setDrawBuffers")) {
         var2.append(", drawBuffers: " + field_33770.method_13751());
      }

      return var2.toString();
   }

   private static class_3009 method_30187(int var0) {
      for (int var1 = 0; var1 < field_33972.length; var1++) {
         class_3009 var2 = field_33972[var1];
         if (var2.method_13759() == var0) {
            return var2;
         }
      }

      return field_33936;
   }

   private static String method_30323(int var0) {
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

   private static void method_30158(String var0) {
      field_33837.field_9614.method_13991().method_18676(new StringTextComponent(var0));
   }

   private static void method_30112(String var0) {
      class_1910.method_8673(var0);
      field_33837.field_9614.method_13991().method_18676(new StringTextComponent(var0));
   }

   public static void method_30296(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
      int var3 = var1.limit();

      for (int var4 = 0; var4 < var3; var4++) {
         var2.append(" ").append(var1.get(var4));
      }

      var2.append("]");
      class_1910.method_8671(var2.toString());
   }

   public static void method_30297(MinecraftClient var0) {
      method_30166();
      field_33837 = var0;
      var0 = MinecraftClient.getInstance();
      field_33895 = GL.getCapabilities();
      field_33589 = GL11.glGetString(7938);
      field_33717 = GL11.glGetString(7936);
      field_33661 = GL11.glGetString(7937);
      class_1910.method_8671("OpenGL Version: " + field_33589);
      class_1910.method_8671("Vendor:  " + field_33717);
      class_1910.method_8671("Renderer: " + field_33661);
      class_1910.method_8671(
         "Capabilities: "
            + (field_33895.OpenGL20 ? " 2.0 " : " - ")
            + (field_33895.OpenGL21 ? " 2.1 " : " - ")
            + (field_33895.OpenGL30 ? " 3.0 " : " - ")
            + (field_33895.OpenGL32 ? " 3.2 " : " - ")
            + (field_33895.OpenGL40 ? " 4.0 " : " - ")
      );
      class_1910.method_8671("GL_MAX_DRAW_BUFFERS: " + GL32.glGetInteger(34852));
      class_1910.method_8671("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL32.glGetInteger(36063));
      class_1910.method_8671("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL32.glGetInteger(34930));
      field_33761 = field_33895.OpenGL30;
      method_30322();
   }

   public static void method_30268() {
      if (method_30109()) {
         field_33971 = 0.5F;
         field_33689 = 0.6F;
         field_33844 = 0.8F;
      } else {
         field_33971 = 1.0F;
         field_33689 = 1.0F;
         field_33844 = 1.0F;
      }
   }

   public static boolean method_30164() {
      if (!field_33652.method_15356()) {
         return field_33652.method_15355();
      } else {
         return !field_33823.method_15356() ? field_33823.method_15355() : true;
      }
   }

   public static boolean method_30107() {
      return !field_33642.method_15356() ? field_33642.method_15355() : true;
   }

   public static boolean method_30109() {
      if (!field_33723.method_15356()) {
         return field_33723.method_15355();
      } else {
         return !field_33731.method_15356() ? field_33731.method_15355() : true;
      }
   }

   public static boolean method_30172() {
      return !field_33774.method_15354();
   }

   public static boolean method_30165() {
      return !field_33970.method_15354();
   }

   public static boolean method_30282() {
      return !field_33868.method_15354();
   }

   public static boolean method_30108() {
      return !field_33655.method_15354();
   }

   public static boolean method_30245() {
      return !field_33781.method_15354();
   }

   public static boolean method_30222(RenderLayer var0) {
      if (var0 == class_6727.field_34745) {
         return field_33929.method_15355();
      } else if (var0 == class_6727.field_34743) {
         return field_33613.method_15355();
      } else if (var0 == class_6727.field_34746) {
         return field_33660.method_15355();
      } else {
         return var0 == class_6727.field_34740 ? field_33871.method_15355() : false;
      }
   }

   public static boolean method_30318() {
      return field_33814.method_15355();
   }

   public static boolean method_30277() {
      return field_33765.method_15355();
   }

   public static boolean method_30317() {
      return field_33614.method_15355();
   }

   public static boolean method_30227() {
      return !field_33791.method_15354();
   }

   public static void method_30098() {
      boolean var0;
      if (!field_33664) {
         field_33664 = true;
         var0 = true;
      } else {
         var0 = false;
      }

      if (!field_33648) {
         method_30273("Shaders.init pre");
         if (method_30235() != null) {
         }

         if (!field_33895.OpenGL20) {
            method_30112("No OpenGL 2.0");
         }

         if (!field_33895.GL_EXT_framebuffer_object) {
            method_30112("No EXT_framebuffer_object");
         }

         ((Buffer)field_33831).position(0).limit(8);
         ((Buffer)field_33826).position(0).limit(16);
         ((Buffer)field_33910).position(0).limit(3);
         ((Buffer)field_33742).position(0).limit(8);
         ((Buffer)field_33788).position(0).limit(2);
         ((Buffer)field_33739).position(0).limit(8);
         field_33893 = 4;
         field_33595 = 1;
         field_33722 = 0;
         field_33846 = 0;
         field_33720 = 1;
         field_33677 = 1;
         Arrays.fill(field_33755, 6408);
         Arrays.fill(field_33605, true);
         Arrays.fill(field_33706, null);
         Arrays.fill(field_33756, false);
         Arrays.fill(field_33795, false);
         Arrays.fill(field_33746, false);
         Arrays.fill(field_33841, false);
         Arrays.fill(field_33629, false);
         field_33665 = false;
         field_33811 = false;
         field_33824 = 0.0F;
         field_33849 = 2.0F;
         field_33976 = 1024;
         field_33907 = 1024;
         field_33685 = 1024;
         field_33924 = 1024;
         field_33857 = 90.0F;
         field_33935 = 160.0F;
         field_33651 = true;
         field_33654 = -1.0F;
         field_33599 = -1.0F;
         field_33608 = false;
         field_33622 = false;
         field_33827 = false;
         field_33845 = false;
         field_33881 = false;
         method_30268();
         class_9454.method_43722();
         field_33600.method_19537();
         if (field_33873 != null) {
            field_33873.method_23557();
         }

         class_8471 var1 = class_1001.method_4339(field_33730, field_33658, false);
         String var2 = "";
         if (field_33680 != null) {
            int var3 = class_4869.method_22374(field_33680.method_29545());
            if (field_33591.contains(var3)) {
               var2 = "world" + var3 + "/";
            }
         }

         for (int var13 = 0; var13 < field_33972.length; var13++) {
            class_3009 var4 = field_33972[var13];
            var4.method_13749();
            var4.method_13747();
            if (var4.method_13754() != class_4349.field_21310) {
               String var5 = var4.method_13763();
               String var6 = var2 + var5;
               boolean var7 = true;
               if (field_33863.containsKey(var6)) {
                  var7 = var7 && field_33863.get(var6).method_6191();
               }

               if (var1 != null) {
                  var7 = var7 && !var1.method_38981(var6);
               }

               if (!var7) {
                  class_1910.method_8671("Program disabled: " + var6);
                  var5 = "<disabled>";
                  var6 = var2 + var5;
               }

               String var8 = "/shaders/" + var6;
               String var9 = var8 + ".vsh";
               String var10 = var8 + ".gsh";
               String var11 = var8 + ".fsh";
               method_30161(var4, var9, var10, var11);
               int var12 = var4.method_13759();
               if (var12 > 0) {
                  class_1910.method_8671("Program loaded: " + var6);
               }

               method_30146(var4);
               method_30134(var4);
            }
         }

         field_33926 = false;

         for (int var14 = 0; var14 < field_33707.length; var14++) {
            if (field_33707[var14].method_13759() != 0) {
               field_33926 = true;
               break;
            }
         }

         field_33720 = field_33893;
         field_33897 = field_33846 > 0 ? 1 : 0;
         field_33671 = field_33846 > 0;
         class_1910.method_8671("usedColorBuffers: " + field_33893);
         class_1910.method_8671("usedDepthBuffers: " + field_33595);
         class_1910.method_8671("usedShadowColorBuffers: " + field_33722);
         class_1910.method_8671("usedShadowDepthBuffers: " + field_33846);
         class_1910.method_8671("usedColorAttachs: " + field_33720);
         class_1910.method_8671("usedDrawBuffers: " + field_33677);
         ((Buffer)field_33831).position(0).limit(field_33677);
         ((Buffer)field_33826).position(0).limit(field_33893 * 2);
         field_33842.method_45575();

         for (int var15 = 0; var15 < field_33677; var15++) {
            field_33831.put(var15, 36064 + var15);
         }

         int var16 = GL32.glGetInteger(34852);
         if (field_33677 > var16) {
            method_30112("[Shaders] Error: Not enough draw buffers, needed: " + field_33677 + ", available: " + var16);
         }

         ((Buffer)field_33742).position(0).limit(field_33722);

         for (int var17 = 0; var17 < field_33722; var17++) {
            field_33742.put(var17, 36064 + var17);
         }

         for (int var18 = 0; var18 < field_33972.length; var18++) {
            class_3009 var21 = field_33972[var18];
            class_3009 var22 = var21;

            while (var22.method_13759() == 0 && var22.method_13757() != var22) {
               var22 = var22.method_13757();
            }

            if (var22 != var21 && var21 != field_33598) {
               var21.method_13753(var22);
            }
         }

         method_30140();
         method_30105();
         if (field_33811) {
            method_30201();
         }

         if (field_33690 == null) {
            field_33690 = class_7977.method_36153();
         }

         class_7966 var19 = new class_7966();
         var19.method_36060(class_2426.field_12074.method_11074(-90.0F));
         method_30212(var19);
         method_30312(var19);
         field_33648 = true;
         method_30173();
         method_30199();
         if (!var0) {
         }

         method_30273("Shaders.init");
      }
   }

   private static void method_30146(class_3009 var0) {
      int var1 = GL32.glGetInteger(34852);
      Arrays.fill(var0.method_13764(), false);
      if (var0 == field_33862) {
         var0.method_13746((IntBuffer)null);
      } else if (var0.method_13759() == 0) {
         if (var0 == field_33598) {
            var0.method_13746(field_33745);
         } else {
            var0.method_13746(field_33694);
         }
      } else {
         String var2 = var0.method_13751();
         if (var2 == null) {
            if (var0 != field_33598 && var0 != field_33616 && var0 != field_33696) {
               var0.method_13746(field_33831);
               field_33677 = field_33893;
               Arrays.fill(var0.method_13764(), 0, field_33893, true);
            } else {
               var0.method_13746(field_33742);
            }
         } else {
            IntBuffer var3 = var0.method_13739();
            int var4 = var2.length();
            field_33677 = Math.max(field_33677, var4);
            var4 = Math.min(var4, var1);
            var0.method_13746(var3);
            ((Buffer)var3).limit(var4);

            for (int var5 = 0; var5 < var4; var5++) {
               int var6 = method_30113(var0, var2, var5);
               var3.put(var5, var6);
            }
         }
      }
   }

   private static int method_30113(class_3009 var0, String var1, int var2) {
      byte var3 = 0;
      if (var2 >= var1.length()) {
         return var3;
      } else {
         int var4 = var1.charAt(var2) - '0';
         if (var0 == field_33598) {
            if (var4 >= 0 && var4 <= 1) {
               var2 = var4 + 36064;
               field_33722 = Math.max(field_33722, var4);
            }

            return var2;
         } else {
            if (var4 >= 0 && var4 <= 7) {
               var0.method_13764()[var4] = true;
               var2 = var4 + 36064;
               field_33720 = Math.max(field_33720, var4);
               field_33893 = Math.max(field_33893, var4);
            }

            return var2;
         }
      }
   }

   private static void method_30134(class_3009 var0) {
      boolean[] var1 = var0.method_13764();
      Boolean[] var2 = var0.method_13748();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Boolean var4 = var2[var3];
         if (var4 != null) {
            var1[var3] = var4;
         }
      }
   }

   public static void method_30199() {
      class_1910.method_8671("Reset model renderers");
      field_33662++;
      class_1910.method_8671("Reset world renderers");
      field_33837.worldRenderer.method_19998();
   }

   private static void method_30161(class_3009 var0, String var1, String var2, String var3) {
      method_30273("pre setupProgram");
      int var4 = ARBShaderObjects.glCreateProgramObjectARB();
      method_30273("create");
      if (var4 != 0) {
         field_33932 = false;
         field_33759 = false;
         field_33865 = false;
         int var5 = method_30264(var0, var1);
         int var6 = method_30171(var0, var2);
         int var7 = method_30184(var0, var3);
         method_30273("create");
         if (var5 == 0 && var6 == 0 && var7 == 0) {
            ARBShaderObjects.glDeleteObjectARB(var4);
            boolean var11 = false;
            var0.method_13749();
         } else {
            if (var5 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var5);
               method_30273("attach");
            }

            if (var6 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var6);
               method_30273("attach");
               if (field_33838) {
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36315, 4);
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36316, 5);
                  ARBGeometryShader4.glProgramParameteriARB(var4, 36314, field_33917);
                  method_30273("arbGeometryShader4");
               }

               field_33881 = true;
            }

            if (var7 != 0) {
               ARBShaderObjects.glAttachObjectARB(var4, var7);
               method_30273("attach");
            }

            if (field_33932) {
               ARBVertexShader.glBindAttribLocationARB(var4, field_33899, "mc_Entity");
               method_30273("mc_Entity");
            }

            if (field_33759) {
               ARBVertexShader.glBindAttribLocationARB(var4, field_33801, "mc_midTexCoord");
               method_30273("mc_midTexCoord");
            }

            if (field_33865) {
               ARBVertexShader.glBindAttribLocationARB(var4, field_33817, "at_tangent");
               method_30273("at_tangent");
            }

            ARBShaderObjects.glLinkProgramARB(var4);
            if (GL32.glGetProgrami(var4, 35714) != 1) {
               class_1910.method_8673("Error linking program: " + var4 + " (" + var0.method_13763() + ")");
            }

            method_30143(var4, var0.method_13763());
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

            var0.method_13758(var4);
            var0.method_13755(var4);
            method_30236(var0);
            ARBShaderObjects.glValidateProgramARB(var4);
            method_30236(field_33936);
            method_30143(var4, var0.method_13763());
            int var8 = GL32.glGetProgrami(var4, 35715);
            if (var8 != 1) {
               String var9 = "\"";
               method_30112("[Shaders] Error: Invalid program " + var9 + var0.method_13763() + var9);
               ARBShaderObjects.glDeleteObjectARB(var4);
               boolean var10 = false;
               var0.method_13749();
            }
         }
      }
   }

   private static int method_30264(class_3009 var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35633);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(method_30289(var1));
         } catch (Exception var10) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         class_6843[] var5 = method_30225(field_33658);
         ArrayList var6 = new ArrayList();
         if (var4 != null) {
            try {
               var4 = class_4593.method_21267((BufferedReader)var4, var1, field_33602, 0, var6, 0);
               class_3751 var7 = new class_3751();

               while (true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = method_30175(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.method_17362(var8)) {
                     class_6964 var9 = class_4603.method_21324(var8);
                     if (var9 != null) {
                        if (var9.method_31825("mc_Entity")) {
                           field_33608 = true;
                           field_33932 = true;
                        } else if (var9.method_31825("mc_midTexCoord")) {
                           field_33622 = true;
                           field_33759 = true;
                        } else if (var9.method_31825("at_tangent")) {
                           field_33827 = true;
                           field_33865 = true;
                        }

                        if (var9.method_31823("countInstances")) {
                           var0.method_13745(var9.method_31841());
                           class_1910.method_8671("countInstances: " + var0.method_13756());
                        }
                     }
                  }
               }
            } catch (Exception var11) {
               class_1910.method_8673("Couldn't read " + var1 + "!");
               var11.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (field_33905) {
            method_30307(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL32.glGetShaderi(var2, 35713) != 1) {
            class_1910.method_8673("Error compiling vertex shader: " + var1);
         }

         method_30213(var2, var1, var6);
         return var2;
      }
   }

   private static int method_30171(class_3009 var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(36313);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(method_30289(var1));
         } catch (Exception var11) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         class_6843[] var5 = method_30225(field_33658);
         ArrayList var6 = new ArrayList();
         field_33838 = false;
         field_33917 = 3;
         if (var4 != null) {
            try {
               var4 = class_4593.method_21267((BufferedReader)var4, var1, field_33602, 0, var6, 0);
               class_3751 var7 = new class_3751();

               while (true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = method_30175(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.method_17362(var8)) {
                     class_6964 var9 = class_4603.method_21324(var8);
                     if (var9 != null) {
                        if (var9.method_31843("GL_ARB_geometry_shader4")) {
                           String var10 = Config.method_14305(var9.method_31833());
                           if (var10.equals("enable") || var10.equals("require") || var10.equals("warn")) {
                              field_33838 = true;
                           }
                        }

                        if (var9.method_31823("maxVerticesOut")) {
                           field_33917 = var9.method_31841();
                        }
                     }
                  }
               }
            } catch (Exception var12) {
               class_1910.method_8673("Couldn't read " + var1 + "!");
               var12.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (field_33905) {
            method_30307(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL32.glGetShaderi(var2, 35713) != 1) {
            class_1910.method_8673("Error compiling geometry shader: " + var1);
         }

         method_30213(var2, var1, var6);
         return var2;
      }
   }

   private static int method_30184(class_3009 var0, String var1) {
      int var2 = ARBShaderObjects.glCreateShaderObjectARB(35632);
      if (var2 == 0) {
         return 0;
      } else {
         StringBuilder var3 = new StringBuilder(131072);
         BufferedReader var4 = null;

         try {
            var4 = new BufferedReader(method_30289(var1));
         } catch (Exception var14) {
            ARBShaderObjects.glDeleteObjectARB(var2);
            return 0;
         }

         class_6843[] var5 = method_30225(field_33658);
         ArrayList var6 = new ArrayList();
         if (var4 != null) {
            try {
               var4 = class_4593.method_21267((BufferedReader)var4, var1, field_33602, 0, var6, 0);
               class_3751 var7 = new class_3751();

               while (true) {
                  String var8 = var4.readLine();
                  if (var8 == null) {
                     var4.close();
                     break;
                  }

                  var8 = method_30175(var8, var5);
                  var3.append(var8).append('\n');
                  if (var7.method_17362(var8)) {
                     class_6964 var9 = class_4603.method_21324(var8);
                     if (var9 != null) {
                        if (var9.method_31839()) {
                           String var10 = var9.method_31844();
                           int var11;
                           if ((var11 = class_4603.method_21328(var10)) >= 0) {
                              field_33846 = Math.max(field_33846, var11 + 1);
                           } else if ((var11 = class_4603.method_21323(var10)) >= 0) {
                              field_33722 = Math.max(field_33722, var11 + 1);
                           } else if ((var11 = class_4603.method_21326(var10)) >= 0) {
                              field_33595 = Math.max(field_33595, var11 + 1);
                           } else if (var10.equals("gdepth") && field_33755[1] == 6408) {
                              field_33755[1] = 34836;
                           } else if ((var11 = class_4603.method_21327(var10)) >= 0) {
                              field_33893 = Math.max(field_33893, var11 + 1);
                           } else if (var10.equals("centerDepthSmooth")) {
                              field_33665 = true;
                           }
                        } else if (var9.method_31823("shadowMapResolution") || var9.method_31847("SHADOWRES")) {
                           field_33685 = field_33924 = var9.method_31841();
                           field_33976 = field_33907 = Math.round((float)field_33685 * field_33763);
                           class_1910.method_8671("Shadow map resolution: " + field_33685);
                        } else if (var9.method_31850("shadowMapFov") || var9.method_31847("SHADOWFOV")) {
                           field_33857 = var9.method_31845();
                           field_33651 = false;
                           class_1910.method_8671("Shadow map field of view: " + field_33857);
                        } else if (var9.method_31850("shadowDistance") || var9.method_31847("SHADOWHPL")) {
                           field_33935 = var9.method_31845();
                           field_33651 = true;
                           class_1910.method_8671("Shadow map distance: " + field_33935);
                        } else if (var9.method_31850("shadowDistanceRenderMul")) {
                           field_33654 = var9.method_31845();
                           class_1910.method_8671("Shadow distance render mul: " + field_33654);
                        } else if (var9.method_31850("shadowIntervalSize")) {
                           field_33849 = var9.method_31845();
                           class_1910.method_8671("Shadow map interval size: " + field_33849);
                        } else if (var9.method_31832("generateShadowMipmap", true)) {
                           Arrays.fill(field_33795, true);
                           class_1910.method_8671("Generate shadow mipmap");
                        } else if (var9.method_31832("generateShadowColorMipmap", true)) {
                           Arrays.fill(field_33841, true);
                           class_1910.method_8671("Generate shadow color mipmap");
                        } else if (var9.method_31832("shadowHardwareFiltering", true)) {
                           Arrays.fill(field_33756, true);
                           class_1910.method_8671("Hardware shadow filtering enabled.");
                        } else if (var9.method_31832("shadowHardwareFiltering0", true)) {
                           field_33756[0] = true;
                           class_1910.method_8671("shadowHardwareFiltering0");
                        } else if (var9.method_31832("shadowHardwareFiltering1", true)) {
                           field_33756[1] = true;
                           class_1910.method_8671("shadowHardwareFiltering1");
                        } else if (var9.method_31831("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                           field_33795[0] = true;
                           class_1910.method_8671("shadowtex0Mipmap");
                        } else if (var9.method_31832("shadowtex1Mipmap", true)) {
                           field_33795[1] = true;
                           class_1910.method_8671("shadowtex1Mipmap");
                        } else if (var9.method_31831("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                           field_33841[0] = true;
                           class_1910.method_8671("shadowcolor0Mipmap");
                        } else if (var9.method_31831("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                           field_33841[1] = true;
                           class_1910.method_8671("shadowcolor1Mipmap");
                        } else if (var9.method_31830("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                           field_33746[0] = true;
                           class_1910.method_8671("shadowtex0Nearest");
                        } else if (var9.method_31831("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                           field_33746[1] = true;
                           class_1910.method_8671("shadowtex1Nearest");
                        } else if (var9.method_31830("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                           field_33629[0] = true;
                           class_1910.method_8671("shadowcolor0Nearest");
                        } else if (var9.method_31830("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                           field_33629[1] = true;
                           class_1910.method_8671("shadowcolor1Nearest");
                        } else if (var9.method_31850("wetnessHalflife") || var9.method_31847("WETNESSHL")) {
                           field_33636 = var9.method_31845();
                           class_1910.method_8671("Wetness halflife: " + field_33636);
                        } else if (var9.method_31850("drynessHalflife") || var9.method_31847("DRYNESSHL")) {
                           field_33649 = var9.method_31845();
                           class_1910.method_8671("Dryness halflife: " + field_33649);
                        } else if (var9.method_31850("eyeBrightnessHalflife")) {
                           field_33610 = var9.method_31845();
                           class_1910.method_8671("Eye brightness halflife: " + field_33610);
                        } else if (var9.method_31850("centerDepthHalflife")) {
                           field_33818 = var9.method_31845();
                           class_1910.method_8671("Center depth halflife: " + field_33818);
                        } else if (var9.method_31850("sunPathRotation")) {
                           field_33824 = var9.method_31845();
                           class_1910.method_8671("Sun path rotation: " + field_33824);
                        } else if (var9.method_31850("ambientOcclusionLevel")) {
                           field_33599 = Config.method_14262(var9.method_31845(), 0.0F, 1.0F);
                           class_1910.method_8671("AO Level: " + field_33599);
                        } else if (var9.method_31823("superSamplingLevel")) {
                           int var19 = var9.method_31841();
                           if (var19 > 1) {
                              class_1910.method_8671("Super sampling level: " + var19 + "x");
                              field_33853 = var19;
                           } else {
                              field_33853 = 1;
                           }
                        } else if (var9.method_31823("noiseTextureResolution")) {
                           field_33666 = var9.method_31841();
                           field_33811 = true;
                           class_1910.method_8671("Noise texture enabled");
                           class_1910.method_8671("Noise texture resolution: " + field_33666);
                        } else if (var9.method_31820("Format")) {
                           String var20 = class_8251.method_37822(var9.method_31844(), "Format");
                           String var28 = var9.method_31833();
                           int var12 = method_30167(var20);
                           int var13 = method_30202(var28);
                           if (var12 >= 0 && var13 != 0) {
                              field_33755[var12] = var13;
                              class_1910.method_8672("%s format: %s", var20, var28);
                           }
                        } else if (var9.method_31837("Clear", false)) {
                           if (class_4603.method_21331(var1) || class_4603.method_21330(var1)) {
                              String var21 = class_8251.method_37822(var9.method_31844(), "Clear");
                              int var29 = method_30167(var21);
                              if (var29 >= 0) {
                                 field_33605[var29] = false;
                                 class_1910.method_8672("%s clear disabled", var21);
                              }
                           }
                        } else if (var9.method_31819("ClearColor")) {
                           if (class_4603.method_21331(var1) || class_4603.method_21330(var1)) {
                              String var22 = class_8251.method_37822(var9.method_31844(), "ClearColor");
                              int var30 = method_30167(var22);
                              if (var30 >= 0) {
                                 class_2637 var32 = var9.method_31821();
                                 if (var32 != null) {
                                    field_33706[var30] = var32;
                                    class_1910.method_8672(
                                       "%s clear color: %s %s %s %s",
                                       var22,
                                       var32.method_11923(),
                                       var32.method_11922(),
                                       var32.method_11927(),
                                       var32.method_11924()
                                    );
                                 } else {
                                    class_1910.method_8669("Invalid color value: " + var9.method_31833());
                                 }
                              }
                           }
                        } else if (var9.method_31848("GAUX4FORMAT", "RGBA32F")) {
                           field_33755[7] = 34836;
                           class_1910.method_8671("gaux4 format : RGB32AF");
                        } else if (var9.method_31848("GAUX4FORMAT", "RGB32F")) {
                           field_33755[7] = 34837;
                           class_1910.method_8671("gaux4 format : RGB32F");
                        } else if (var9.method_31848("GAUX4FORMAT", "RGB16")) {
                           field_33755[7] = 32852;
                           class_1910.method_8671("gaux4 format : RGB16");
                        } else if (var9.method_31837("MipmapEnabled", true)) {
                           if (class_4603.method_21331(var1) || class_4603.method_21330(var1) || class_4603.method_21329(var1)) {
                              String var23 = class_8251.method_37822(var9.method_31844(), "MipmapEnabled");
                              int var31 = method_30167(var23);
                              if (var31 >= 0) {
                                 int var33 = var0.method_13752();
                                 var33 |= 1 << var31;
                                 var0.method_13741(var33);
                                 class_1910.method_8672("%s mipmap enabled", var23);
                              }
                           }
                        } else if (var9.method_31847("DRAWBUFFERS")) {
                           String var24 = var9.method_31833();
                           if (class_4603.method_21322(var24)) {
                              var0.method_13740(var24);
                           } else {
                              class_1910.method_8669("Invalid draw buffers: " + var24);
                           }
                        }
                     }
                  }
               }
            } catch (Exception var15) {
               class_1910.method_8673("Couldn't read " + var1 + "!");
               var15.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var2);
               return 0;
            }
         }

         if (field_33905) {
            method_30307(var1, var3.toString());
         }

         ARBShaderObjects.glShaderSourceARB(var2, var3);
         ARBShaderObjects.glCompileShaderARB(var2);
         if (GL32.glGetShaderi(var2, 35713) != 1) {
            class_1910.method_8673("Error compiling fragment shader: " + var1);
         }

         method_30213(var2, var1, var6);
         return var2;
      }
   }

   private static Reader method_30289(String var0) {
      return new InputStreamReader(field_33602.method_39505(var0));
   }

   public static void method_30307(String var0, String var1) {
      try {
         File var2 = new File(field_33909, "debug/" + var0);
         var2.getParentFile().mkdirs();
         Config.method_14234(var2, var1);
      } catch (IOException var3) {
         Config.method_14317("Error saving: " + var0);
         var3.printStackTrace();
      }
   }

   private static void method_30308(File var0) {
      if (var0.exists() && var0.isDirectory()) {
         File[] var1 = var0.listFiles();
         if (var1 != null) {
            for (int var2 = 0; var2 < var1.length; var2++) {
               File var3 = var1[var2];
               if (var3.isDirectory()) {
                  method_30308(var3);
               }

               var3.delete();
            }
         }
      }
   }

   private static boolean method_30143(int var0, String var1) {
      IntBuffer var2 = BufferUtils.createIntBuffer(1);
      ARBShaderObjects.glGetObjectParameterivARB(var0, 35716, var2);
      int var3 = var2.get();
      if (var3 > 1) {
         ByteBuffer var4 = BufferUtils.createByteBuffer(var3);
         ((Buffer)var2).flip();
         ARBShaderObjects.glGetInfoLogARB(var0, var2, var4);
         byte[] var5 = new byte[var3];
         var4.get(var5);
         if (var5[var3 - 1] == 0) {
            var5[var3 - 1] = 10;
         }

         String var6 = new String(var5, StandardCharsets.US_ASCII);
         var6 = class_8251.method_37830(var6, " \n\r\t");
         class_1910.method_8671("Info log: " + var1 + "\n" + var6);
         return false;
      } else {
         return true;
      }
   }

   private static boolean method_30213(int var0, String var1, List<String> var2) {
      IntBuffer var3 = BufferUtils.createIntBuffer(1);
      int var4 = GL32.glGetShaderi(var0, 35716);
      if (var4 <= 1) {
         return true;
      } else {
         for (int var5 = 0; var5 < var2.size(); var5++) {
            String var6 = (String)var2.get(var5);
            class_1910.method_8671("File: " + (var5 + 1) + " = " + var6);
         }

         String var7 = GL32.glGetShaderInfoLog(var0, var4);
         var7 = class_8251.method_37830(var7, " \n\r\t");
         class_1910.method_8671("Shader info log: " + var1 + "\n" + var7);
         return false;
      }
   }

   public static void method_30190(IntBuffer var0) {
      if (var0 == null) {
         var0 = field_33745;
      }

      if (field_33601 != var0) {
         field_33601 = var0;
         GL32.glDrawBuffers(var0);
         method_30273("setDrawBuffers");
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_30236(class_3009 var0) {
      method_30273("pre-useProgram");
      if (field_33945) {
         var0 = field_33598;
      } else if (field_33851) {
         var0 = field_33802;
      }

      if (field_33770 != var0) {
         method_30320();
         method_30174(field_33770, var0);
         field_33770 = var0;
         int var1 = var0.method_13759();
         field_33869 = var1;
         ARBShaderObjects.glUseProgramObjectARB(var1);
         if (method_30273("useProgram") != 0) {
            var0.method_13758(0);
            var1 = var0.method_13759();
            field_33869 = var1;
            ARBShaderObjects.glUseProgramObjectARB(var1);
         }

         field_33600.method_19533(var1);
         if (field_33873 != null) {
            field_33873.method_23556(var1);
         }

         if (var1 != 0) {
            IntBuffer var2 = var0.method_13766();
            if (field_33890) {
               method_30190(var2);
            }

            field_33695 = var0.method_13752();
            switch (var0.method_13754()) {
               case field_21309:
                  method_30211(field_33767, 0);
                  method_30211(field_33840, 2);
                  method_30211(field_33612, 1);
                  method_30211(field_33872, 3);
                  method_30211(field_33714, field_33845 ? 5 : 4);
                  method_30211(field_33733, 4);
                  method_30211(field_33960, 4);
                  method_30211(field_33667, 5);
                  method_30211(field_33883, 6);
                  if (field_33886 != null || field_33926) {
                     method_30211(field_33839, 7);
                     method_30211(field_33771, 8);
                     method_30211(field_33908, 9);
                     method_30211(field_33675, 10);
                  }

                  method_30211(field_33807, 11);
                  method_30211(field_33835, 13);
                  method_30211(field_33887, 13);
                  method_30211(field_33702, 14);
                  method_30211(field_33792, 15);
                  break;
               case field_21314:
               case field_21312:
                  method_30211(field_33896, 0);
                  method_30211(field_33931, 1);
                  method_30211(field_33977, 2);
                  method_30211(field_33719, 3);
                  method_30211(field_33839, 7);
                  method_30211(field_33771, 8);
                  method_30211(field_33908, 9);
                  method_30211(field_33675, 10);
                  method_30211(field_33615, 0);
                  method_30211(field_33930, 1);
                  method_30211(field_33778, 2);
                  method_30211(field_33978, 3);
                  method_30211(field_33927, 7);
                  method_30211(field_33715, 8);
                  method_30211(field_33692, 9);
                  method_30211(field_33653, 10);
                  method_30211(field_33714, field_33845 ? 5 : 4);
                  method_30211(field_33733, 4);
                  method_30211(field_33960, 4);
                  method_30211(field_33667, 5);
                  method_30211(field_33852, 6);
                  method_30211(field_33883, 6);
                  method_30211(field_33807, 11);
                  method_30211(field_33716, 12);
                  method_30211(field_33835, 13);
                  method_30211(field_33887, 13);
                  method_30211(field_33702, 14);
                  method_30211(field_33792, 15);
                  break;
               case field_21311:
                  method_30211(field_33734, 0);
                  method_30211(field_33767, 0);
                  method_30211(field_33840, 2);
                  method_30211(field_33612, 1);
                  method_30211(field_33872, 3);
                  method_30211(field_33714, field_33845 ? 5 : 4);
                  method_30211(field_33733, 4);
                  method_30211(field_33960, 4);
                  method_30211(field_33667, 5);
                  if (field_33886 != null) {
                     method_30211(field_33839, 7);
                     method_30211(field_33771, 8);
                     method_30211(field_33908, 9);
                     method_30211(field_33675, 10);
                  }

                  method_30211(field_33835, 13);
                  method_30211(field_33887, 13);
                  method_30211(field_33702, 14);
                  method_30211(field_33792, 15);
            }

            ItemStack var3 = field_33837.thePlayer != null ? field_33837.thePlayer.method_26446() : null;
            class_2451 var4 = var3 != null ? var3.method_27960() : null;
            int var5 = -1;
            class_6414 var6 = null;
            if (var4 != null) {
               var5 = class_8669.field_44382.method_14041(var4);
               if (var4 instanceof class_6201) {
                  var6 = ((class_6201)var4).method_28392();
               }

               var5 = class_5644.method_25548(var5);
            }

            int var7 = var6 != null ? var6.method_29260().method_8339() : 0;
            ItemStack var8 = field_33837.thePlayer != null ? field_33837.thePlayer.method_26568() : null;
            class_2451 var9 = var8 != null ? var8.method_27960() : null;
            int var10 = -1;
            class_6414 var11 = null;
            if (var9 != null) {
               var10 = class_8669.field_44382.method_14041(var9);
               if (var9 instanceof class_6201) {
                  var11 = ((class_6201)var9).method_28392();
               }

               var10 = class_5644.method_25548(var10);
            }

            int var12 = var11 != null ? var11.method_29260().method_8339() : 0;
            if (method_30164() && var12 > var7) {
               var5 = var10;
               var7 = var12;
            }

            float var13 = field_33837.thePlayer != null ? field_33837.thePlayer.method_27306() : 0.0F;
            method_30211(field_33940, var5);
            method_30211(field_33772, var7);
            method_30211(field_33918, var10);
            method_30211(field_33766, var12);
            method_30211(field_33894, field_33947 ? field_33847 : 0);
            method_30207(field_33879, field_33947 ? field_33698 : 0.0F);
            method_30301(field_33637, field_33780, field_33923, field_33753);
            method_30301(field_33891, field_33797, field_33668, field_33670);
            method_30211(field_33870, (int)(field_33773 % 24000L));
            method_30211(field_33657, (int)(field_33773 / 24000L));
            method_30211(field_33663, field_33678);
            method_30211(field_33672, field_33860);
            method_30207(field_33878, field_33843);
            method_30207(field_33768, field_33704);
            method_30207(field_33858, field_33808);
            method_30207(field_33979, field_33625);
            method_30207(field_33815, field_33961);
            method_30207(field_33673, (float)field_33803 / (float)field_33764);
            method_30207(field_33921, (float)field_33803);
            method_30207(field_33855, (float)field_33764);
            method_30207(field_33674, 0.05F);
            method_30207(field_33754, (float)(field_33837.gameOptions.field_45537 * 16));
            method_30301(field_33752, field_33906[0], field_33906[1], field_33906[2]);
            method_30301(field_33786, field_33787[0], field_33787[1], field_33787[2]);
            method_30301(field_33820, field_33939[0], field_33939[1], field_33939[2]);
            method_30301(field_33833, field_33944[0], field_33944[1], field_33944[2]);
            method_30301(field_33813, (float)field_33633, (float)field_33736, (float)field_33913);
            method_30301(field_33703, (float)field_33915, (float)field_33769, (float)field_33641);
            method_30253(field_33712, false, field_33727);
            method_30253(field_33920, false, field_33916);
            method_30253(field_33951, false, field_33737);
            method_30253(field_33889, false, field_33968);
            method_30253(field_33777, false, field_33758);
            method_30253(field_33669, false, field_33732);
            if (field_33846 > 0) {
               method_30253(field_33967, false, field_33630);
               method_30253(field_33864, false, field_33592);
               method_30253(field_33643, false, field_33793);
               method_30253(field_33686, false, field_33892);
            }

            method_30207(field_33683, field_33829);
            method_30207(field_33965, field_33816);
            method_30111(field_33958, field_33757 & 65535, field_33757 >> 16);
            method_30111(field_33728, Math.round(field_33738), Math.round(field_33659));
            method_30111(field_33708, field_33955[0], field_33955[1]);
            method_30211(field_33607, field_33647);
            method_30211(field_33914, field_33725);
            method_30207(field_33925, field_33933);
            method_30207(field_33693, field_33718);
            method_30207(field_33789, (float)field_33837.gameOptions.brightnessGamma);
            method_30211(field_33836, field_33837.gameOptions.hideGUI ? 1 : 0);
            method_30207(field_33632, field_33973);
            method_30111(field_33740, field_33946, field_33639);
            method_30207(field_33796, var13);
            if (field_33873 != null) {
               field_33873.method_23560();
            }

            method_30273("end useProgram");
         }
      }
   }

   private static void method_30174(class_3009 var0, class_3009 var1) {
      if (var0.method_13738() != null) {
         GlStateManager.method_8777();
      }

      if (var0.method_13762() != null) {
         GlStateManager.method_8855();
      }

      class_2412 var2 = var1.method_13738();
      if (var2 != null) {
         GlStateManager.method_8756(var2);
      }

      class_3525 var3 = var1.method_13762();
      if (var3 != null) {
         GlStateManager.method_8831(var3);
      }
   }

   private static void method_30211(class_8800 var0, int var1) {
      var0.method_40456(var1);
   }

   private static void method_30111(class_7836 var0, int var1, int var2) {
      var0.method_35465(var1, var2);
   }

   private static void method_30207(class_2296 var0, float var1) {
      var0.method_10563(var1);
   }

   private static void method_30301(class_6777 var0, float var1, float var2, float var3) {
      var0.method_31090(var1, var2, var3);
   }

   private static void method_30253(class_4701 var0, boolean var1, FloatBuffer var2) {
      var0.method_21675(var1, var2);
   }

   public static int method_30167(String var0) {
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

   private static int method_30202(String var0) {
      var0 = var0.trim();

      for (int var1 = 0; var1 < field_33688.length; var1++) {
         String var2 = field_33688[var1];
         if (var0.equals(var2)) {
            return field_33627[var1];
         }
      }

      return 0;
   }

   private static void method_30201() {
      if (field_33744 == null && field_33966 != null) {
         field_33744 = method_30179(15, field_33966);
      }

      if (field_33744 == null) {
         field_33744 = new class_816(field_33666, field_33666);
      }
   }

   private static void method_30173() {
      field_33806 = new IdentityHashMap<class_6414, Integer>(300);
      if (field_33806.isEmpty()) {
         for (Identifier var1 : class_8669.field_44462.method_39805()) {
            class_6414 var2 = class_8669.field_44462.method_39806(var1);
            int var3 = class_8669.field_44462.method_14041(var2);
            field_33806.put(var2, var3);
         }
      }

      BufferedReader var11 = null;

      try {
         var11 = new BufferedReader(new InputStreamReader(field_33602.method_39505("/mc_Entity_x.txt")));
      } catch (Exception var9) {
      }

      if (var11 != null) {
         String var12;
         try {
            while ((var12 = var11.readLine()) != null) {
               Matcher var13 = field_33949.matcher(var12);
               if (var13.matches()) {
                  String var14 = var13.group(1);
                  String var4 = var13.group(2);
                  int var5 = Integer.parseInt(var4);
                  Identifier var6 = new Identifier(var14);
                  if (class_8669.field_44462.method_39814(var6)) {
                     class_6414 var7 = class_8669.field_44462.method_39806(var6);
                     field_33806.put(var7, var5);
                  } else {
                     class_1910.method_8670("Unknown block name %s", var14);
                  }
               } else {
                  class_1910.method_8670("unmatched %s\n", var12);
               }
            }
         } catch (Exception var10) {
            class_1910.method_8669("Error parsing mc_Entity_x.txt");
         }
      }

      if (var11 != null) {
         try {
            var11.close();
         } catch (Exception var8) {
         }
      }
   }

   private static IntBuffer method_30178(IntBuffer var0) {
      int var1 = var0.limit();

      for (int var2 = var0.position(); var2 < var1; var2++) {
         var0.put(var2, 0);
      }

      return var0;
   }

   public static void method_30259() {
      if (field_33648) {
         method_30273("Shaders.uninit pre");

         for (int var0 = 0; var0 < field_33972.length; var0++) {
            class_3009 var1 = field_33972[var0];
            if (var1.method_13760() != 0) {
               ARBShaderObjects.glDeleteObjectARB(var1.method_13760());
               method_30273("del programRef");
            }

            var1.method_13755(0);
            var1.method_13758(0);
            var1.method_13740((String)null);
            var1.method_13746((IntBuffer)null);
            var1.method_13741(0);
         }

         field_33926 = false;
         if (field_33619 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(field_33619);
            field_33619 = 0;
            method_30273("del dfb");
         }

         if (field_33779 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(field_33779);
            field_33779 = 0;
            method_30273("del sfb");
         }

         if (field_33910 != null) {
            GlStateManager.method_8890(field_33910);
            method_30178(field_33910);
            method_30273("del dfbDepthTextures");
         }

         if (field_33826 != null) {
            GlStateManager.method_8890(field_33826);
            method_30178(field_33826);
            method_30273("del dfbTextures");
         }

         if (field_33788 != null) {
            GlStateManager.method_8890(field_33788);
            method_30178(field_33788);
            method_30273("del shadow depth");
         }

         if (field_33739 != null) {
            GlStateManager.method_8890(field_33739);
            method_30178(field_33739);
            method_30273("del shadow color");
         }

         if (field_33831 != null) {
            method_30178(field_33831);
         }

         if (field_33744 != null) {
            field_33744.method_37399();
            field_33744 = null;
         }

         class_1910.method_8671("Uninit");
         field_33897 = 0;
         field_33671 = false;
         field_33648 = false;
         method_30273("Shaders.uninit");
      }
   }

   public static void method_30229() {
      field_33969 = 0;
   }

   public static void method_30285() {
      field_33859 = true;
   }

   private static void method_30140() {
      field_33676 = field_33837.getMainWindow().method_43178();
      field_33969 = field_33837.getMainWindow().method_43198();
      field_33803 = Math.round((float)field_33676 * field_33825);
      field_33764 = Math.round((float)field_33969 * field_33825);
      method_30290();
   }

   private static void method_30105() {
      field_33859 = false;
      field_33976 = Math.round((float)field_33685 * field_33763);
      field_33907 = Math.round((float)field_33924 * field_33763);
      method_30231();
   }

   private static void method_30290() {
      if (field_33619 != 0) {
         EXTFramebufferObject.glDeleteFramebuffersEXT(field_33619);
         GlStateManager.method_8890(field_33910);
         GlStateManager.method_8890(field_33826);
      }

      field_33619 = EXTFramebufferObject.glGenFramebuffersEXT();
      GL32.glGenTextures((IntBuffer)((Buffer)field_33910).clear().limit(field_33595));
      GL32.glGenTextures((IntBuffer)((Buffer)field_33826).clear().limit(16));
      ((Buffer)field_33910).position(0);
      ((Buffer)field_33826).position(0);
      EXTFramebufferObject.glBindFramebufferEXT(36160, field_33619);
      GL32.glDrawBuffers(0);
      GL32.glReadBuffer(0);

      for (int var0 = 0; var0 < field_33595; var0++) {
         GlStateManager.method_8791(field_33910.get(var0));
         GL32.glTexParameteri(3553, 10242, 33071);
         GL32.glTexParameteri(3553, 10243, 33071);
         GL32.glTexParameteri(3553, 10241, 9728);
         GL32.glTexParameteri(3553, 10240, 9728);
         GL32.glTexParameteri(3553, 34891, 6409);
         GL32.glTexImage2D(3553, 0, 6402, field_33803, field_33764, 0, 6402, 5126, (FloatBuffer)null);
      }

      EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field_33910.get(0), 0);
      GL32.glDrawBuffers(field_33831);
      GL32.glReadBuffer(0);
      method_30273("FT d");

      for (int var2 = 0; var2 < field_33893; var2++) {
         GlStateManager.method_8791(field_33842.method_45577(var2));
         GL32.glTexParameteri(3553, 10242, 33071);
         GL32.glTexParameteri(3553, 10243, 33071);
         GL32.glTexParameteri(3553, 10241, 9729);
         GL32.glTexParameteri(3553, 10240, 9729);
         GL32.glTexImage2D(3553, 0, field_33755[var2], field_33803, field_33764, 0, method_30138(field_33755[var2]), 33639, (ByteBuffer)null);
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, field_33842.method_45577(var2), 0);
         method_30273("FT c");
      }

      for (int var3 = 0; var3 < field_33893; var3++) {
         GlStateManager.method_8791(field_33842.method_45576(var3));
         GL32.glTexParameteri(3553, 10242, 33071);
         GL32.glTexParameteri(3553, 10243, 33071);
         GL32.glTexParameteri(3553, 10241, 9729);
         GL32.glTexParameteri(3553, 10240, 9729);
         GL32.glTexImage2D(3553, 0, field_33755[var3], field_33803, field_33764, 0, method_30138(field_33755[var3]), 33639, (ByteBuffer)null);
         method_30273("FT ca");
      }

      int var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
      if (var4 == 36058) {
         method_30112("[Shaders] Error: Failed framebuffer incomplete formats");

         for (int var1 = 0; var1 < field_33893; var1++) {
            GlStateManager.method_8791(field_33842.method_45577(var1));
            GL32.glTexImage2D(3553, 0, 6408, field_33803, field_33764, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var1, 3553, field_33842.method_45577(var1), 0);
            method_30273("FT c");
         }

         var4 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var4 == 36053) {
            class_1910.method_8671("complete");
         }
      }

      GlStateManager.method_8791(0);
      if (var4 != 36053) {
         method_30112("[Shaders] Error: Failed creating framebuffer! (Status " + var4 + ")");
      } else {
         class_1910.method_8671("Framebuffer created.");
      }
   }

   private static int method_30138(int var0) {
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

   private static void method_30231() {
      if (field_33846 != 0) {
         if (field_33779 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(field_33779);
            GlStateManager.method_8890(field_33788);
            GlStateManager.method_8890(field_33739);
         }

         field_33779 = EXTFramebufferObject.glGenFramebuffersEXT();
         EXTFramebufferObject.glBindFramebufferEXT(36160, field_33779);
         GL32.glDrawBuffer(0);
         GL32.glReadBuffer(0);
         GL32.glGenTextures((IntBuffer)((Buffer)field_33788).clear().limit(field_33846));
         GL32.glGenTextures((IntBuffer)((Buffer)field_33739).clear().limit(field_33722));
         ((Buffer)field_33788).position(0);
         ((Buffer)field_33739).position(0);

         for (int var0 = 0; var0 < field_33846; var0++) {
            GlStateManager.method_8791(field_33788.get(var0));
            GL32.glTexParameterf(3553, 10242, 33071.0F);
            GL32.glTexParameterf(3553, 10243, 33071.0F);
            int var1 = field_33746[var0] ? 9728 : 9729;
            GL32.glTexParameteri(3553, 10241, var1);
            GL32.glTexParameteri(3553, 10240, var1);
            if (field_33756[var0]) {
               GL32.glTexParameteri(3553, 34892, 34894);
            }

            GL32.glTexImage2D(3553, 0, 6402, field_33976, field_33907, 0, 6402, 5126, (FloatBuffer)null);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field_33788.get(0), 0);
         method_30273("FT sd");

         for (int var2 = 0; var2 < field_33722; var2++) {
            GlStateManager.method_8791(field_33739.get(var2));
            GL32.glTexParameterf(3553, 10242, 33071.0F);
            GL32.glTexParameterf(3553, 10243, 33071.0F);
            int var4 = field_33629[var2] ? 9728 : 9729;
            GL32.glTexParameteri(3553, 10241, var4);
            GL32.glTexParameteri(3553, 10240, var4);
            GL32.glTexImage2D(3553, 0, 6408, field_33976, field_33907, 0, 32993, 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var2, 3553, field_33739.get(var2), 0);
            method_30273("FT sc");
         }

         GlStateManager.method_8791(0);
         if (field_33722 > 0) {
            GL32.glDrawBuffers(field_33742);
         }

         int var3 = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
         if (var3 != 36053) {
            method_30112("[Shaders] Error: Failed creating shadow framebuffer! (Status " + var3 + ")");
         } else {
            class_1910.method_8671("Shadow framebuffer created.");
         }
      }
   }

   public static void method_30311(MinecraftClient var0, Camera var1, float var2, long var3) {
      method_30273("pre beginRender");
      method_30223(field_33837.theWorld);
      field_33837 = var0;
      field_33837.getProfiler().startSection("init");
      field_33681 = field_33837.gameRenderer;
      if (!field_33648) {
         try {
            method_30098();
         } catch (IllegalStateException var14) {
            if (Config.method_14305(var14.getMessage()).equals("Function is not supported")) {
               method_30112("[Shaders] Error: " + var14.getMessage());
               var14.printStackTrace();
               method_30319("OFF");
               return;
            }
         }
      }

      if (field_33837.getMainWindow().method_43178() != field_33676 || field_33837.getMainWindow().method_43198() != field_33969) {
         method_30140();
      }

      if (field_33859) {
         method_30105();
      }

      field_33860++;
      if (field_33860 >= 720720) {
         field_33860 = 0;
      }

      field_33626 = System.currentTimeMillis();
      if (field_33656 == 0L) {
         field_33656 = field_33626;
      }

      field_33903 = field_33626 - field_33656;
      field_33656 = field_33626;
      field_33843 = (float)field_33903 / 1000.0F;
      field_33704 = field_33704 + field_33843;
      field_33704 %= 3600.0F;
      GlStateManager.method_8757();
      class_293.method_1309(var1, var0, var2);
      GlStateManager.method_8761();
      ClientWorld var5 = field_33837.theWorld;
      if (var5 != null) {
         field_33773 = var5.method_29584();
         field_33937 = (field_33773 - field_33875) % 24000L;
         if (field_33937 < 0L) {
            field_33937 += 24000L;
         }

         field_33875 = field_33773;
         field_33678 = var5.method_13575();
         field_33961 = var5.method_29578(var2);
         float var6 = (float)field_33903 * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5) * (double)var6 / (double)(field_33829 < field_33961 ? field_33649 : field_33636));
         field_33829 = field_33829 * var7 + field_33961 * (1.0F - var7);
         Entity var8 = var1.method_41633();
         if (var8 != null) {
            field_33874 = var8 instanceof class_5834 && ((class_5834)var8).method_26507();
            field_33816 = (float)var1.method_41627().method_60();
            field_33757 = field_33837.method_8587().method_28120(var8, var2);
            float var9 = (float)field_33903 * 0.01F;
            float var10 = (float)Math.exp(Math.log(0.5) * (double)var9 / (double)field_33610);
            field_33738 = field_33738 * var10 + (float)(field_33757 & 65535) * (1.0F - var10);
            field_33659 = field_33659 * var10 + (float)(field_33757 >> 16) * (1.0F - var10);
            class_4774 var11 = var1.method_41626();
            if (var11.method_22007(class_6503.field_33094)) {
               field_33725 = 1;
            } else if (var11.method_22007(class_6503.field_33095)) {
               field_33725 = 2;
            } else {
               field_33725 = 0;
            }

            if (var8 instanceof class_5834) {
               class_5834 var12 = (class_5834)var8;
               field_33933 = 0.0F;
               if (var12.isPotionActive(Effects.field_19746)) {
                  GameRenderer var13 = field_33681;
                  field_33933 = GameRenderer.method_35954(var12, var2);
               }

               field_33718 = 0.0F;
               if (var12.isPotionActive(Effects.field_19736)) {
                  int var18 = var12.method_26553(Effects.field_19736).method_10347();
                  field_33718 = Config.method_14262((float)var18 / 20.0F, 0.0F, 1.0F);
               }
            }

            class_1343 var16 = var5.method_750(var8.method_37075(), var2);
            var16 = class_9300.method_42927(var16, var5, var8, var2);
            field_33797 = (float)var16.field_7336;
            field_33668 = (float)var16.field_7333;
            field_33670 = (float)var16.field_7334;
         }
      }

      field_33804 = true;
      field_33834 = false;
      field_33945 = false;
      field_33919 = false;
      field_33682 = false;
      field_33953 = false;
      field_33902 = false;
      method_30310();
      field_33633 = field_33915;
      field_33736 = field_33769;
      field_33913 = field_33641;
      ((Buffer)field_33737).position(0);
      ((Buffer)field_33968).position(0);
      field_33737.put(field_33968);
      ((Buffer)field_33737).position(0);
      ((Buffer)field_33968).position(0);
      ((Buffer)field_33732).position(0);
      ((Buffer)field_33727).position(0);
      field_33732.put(field_33727);
      ((Buffer)field_33732).position(0);
      ((Buffer)field_33727).position(0);
      method_30273("beginRender");
      class_293.method_1322(field_33681, var1, 0, var2, var3);
      field_33837.getProfiler().endSection();
      EXTFramebufferObject.glBindFramebufferEXT(36160, field_33619);

      for (int var15 = 0; var15 < field_33893; var15++) {
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var15, 3553, field_33842.method_45577(var15), 0);
      }

      method_30273("end beginRender");
   }

   private static void method_30310() {
      if (field_33846 >= 1) {
         GlStateManager.method_8899(33988);
         GlStateManager.method_8791(field_33788.get(0));
         if (field_33846 >= 2) {
            GlStateManager.method_8899(33989);
            GlStateManager.method_8791(field_33788.get(1));
         }
      }

      GlStateManager.method_8899(33984);

      for (int var0 = 0; var0 < field_33893; var0++) {
         GlStateManager.method_8791(field_33842.method_45577(var0));
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
         GlStateManager.method_8791(field_33842.method_45576(var0));
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10241, 9729);
      }

      GlStateManager.method_8791(0);

      for (int var1 = 0; var1 < 4 && 4 + var1 < field_33893; var1++) {
         GlStateManager.method_8899(33991 + var1);
         GlStateManager.method_8791(field_33842.method_45577(4 + var1));
      }

      GlStateManager.method_8899(33990);
      GlStateManager.method_8791(field_33910.get(0));
      if (field_33595 >= 2) {
         GlStateManager.method_8899(33995);
         GlStateManager.method_8791(field_33910.get(1));
         if (field_33595 >= 3) {
            GlStateManager.method_8899(33996);
            GlStateManager.method_8791(field_33910.get(2));
         }
      }

      for (int var2 = 0; var2 < field_33722; var2++) {
         GlStateManager.method_8899(33997 + var2);
         GlStateManager.method_8791(field_33739.get(var2));
      }

      if (field_33811) {
         GlStateManager.method_8899(33984 + field_33744.method_37400());
         GlStateManager.method_8791(field_33744.method_37397());
      }

      method_30252(field_33886);
      GlStateManager.method_8899(33984);
   }

   public static void method_30223(ClientWorld var0) {
      if (field_33680 != var0) {
         ClientWorld var1 = field_33680;
         field_33680 = var0;
         method_30130(field_33837.getRenderViewEntity());
         int var2 = class_4869.method_22375(var1);
         int var3 = class_4869.method_22375(var0);
         if (var3 != var2) {
            boolean var4 = field_33591.contains(var2);
            boolean var5 = field_33591.contains(var3);
            if (var4 || var5) {
               method_30259();
            }
         }

         class_9454.method_43722();
      }
   }

   public static void method_30139(float var0, long var1) {
      if (!field_33945) {
         EXTFramebufferObject.glBindFramebufferEXT(36160, field_33619);
         GL11.glViewport(0, 0, field_33803, field_33764);
         field_33601 = null;
         class_7977.method_36178(field_33690.method_37050());
         method_30236(field_33587);
         method_30273("end beginRenderPass");
      }
   }

   public static void method_30316(int var0, int var1, int var2, int var3) {
      GlStateManager.method_8895(true, true, true, true);
      if (field_33945) {
         GL11.glViewport(0, 0, field_33976, field_33907);
      } else {
         GL11.glViewport(0, 0, field_33803, field_33764);
         EXTFramebufferObject.glBindFramebufferEXT(36160, field_33619);
         field_33890 = true;
         GlStateManager.method_8903();
         GlStateManager.method_8745();
         method_30190(field_33745);
         method_30236(field_33587);
         method_30273("beginRenderPass");
      }
   }

   public static void method_30218(int var0) {
      field_33847 = var0;
      if (field_33947) {
         method_30211(field_33894, var0);
      }
   }

   public static void method_30291(float var0, float var1, float var2) {
      field_33780 = var0;
      field_33923 = var1;
      field_33753 = var2;
      method_30301(field_33637, field_33780, field_33923, field_33753);
   }

   public static void method_30228(float var0, float var1, float var2, float var3) {
      field_33699 = var0;
      field_33959 = var1;
      field_33888 = var2;
   }

   public static void method_30182() {
      if (field_33945) {
         method_30273("shadow clear pre");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field_33788.get(0), 0);
         GL32.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL32.glDrawBuffers(field_33598.method_13766());
         method_30142("shadow clear");
         GL32.glClear(16640);
         method_30273("shadow clear");
      } else {
         method_30273("clear pre");
         if (field_33605[0]) {
            class_2637 var0 = field_33706[0];
            if (var0 != null) {
               GL32.glClearColor(var0.method_11923(), var0.method_11922(), var0.method_11927(), var0.method_11924());
            }

            if (field_33842.method_45580(0)) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, field_33842.method_45576(0), 0);
               GL32.glDrawBuffers(36064);
               GL32.glClear(16384);
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, field_33842.method_45577(0), 0);
            }

            GL32.glDrawBuffers(36064);
            GL32.glClear(16384);
         }

         if (field_33605[1]) {
            GL32.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            class_2637 var2 = field_33706[1];
            if (var2 != null) {
               GL32.glClearColor(var2.method_11923(), var2.method_11922(), var2.method_11927(), var2.method_11924());
            }

            if (field_33842.method_45580(1)) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, field_33842.method_45576(1), 0);
               GL32.glDrawBuffers(36065);
               GL32.glClear(16384);
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, field_33842.method_45577(1), 0);
            }

            GL32.glDrawBuffers(36065);
            GL32.glClear(16384);
         }

         for (int var3 = 2; var3 < field_33893; var3++) {
            if (field_33605[var3]) {
               GL32.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               class_2637 var1 = field_33706[var3];
               if (var1 != null) {
                  GL32.glClearColor(var1.method_11923(), var1.method_11922(), var1.method_11927(), var1.method_11924());
               }

               if (field_33842.method_45580(var3)) {
                  EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var3, 3553, field_33842.method_45576(var3), 0);
                  GL32.glDrawBuffers(36064 + var3);
                  GL32.glClear(16384);
                  EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var3, 3553, field_33842.method_45577(var3), 0);
               }

               GL32.glDrawBuffers(36064 + var3);
               GL32.glClear(16384);
            }
         }

         method_30190(field_33831);
         method_30142("clear");
         method_30273("clear");
      }
   }

   public static void method_30194(class_7966 var0, Camera var1, float var2) {
      Entity var3 = var1.method_41633();
      class_1343 var4 = var1.method_41627();
      double var5 = var4.field_7336;
      double var7 = var4.field_7333;
      double var9 = var4.field_7334;
      method_30294(var3);
      field_33915 = var5 - (double)field_33593;
      field_33769 = var7;
      field_33641 = var9 - (double)field_33701;
      GL32.glGetFloatv(2983, (FloatBuffer)((Buffer)field_33968).position(0));
      class_2643.method_11955((FloatBuffer)((Buffer)field_33758).position(0), (FloatBuffer)((Buffer)field_33968).position(0), field_33941, field_33741);
      ((Buffer)field_33968).position(0);
      ((Buffer)field_33758).position(0);
      class_8107 var11 = var0.method_36058().method_28620();
      class_8107 var12 = new class_8107(var11);
      var12.method_36807();
      var12.method_36828(field_33819);
      ((Buffer)field_33727).position(0);
      field_33727.put(field_33819);
      class_2643.method_11955((FloatBuffer)((Buffer)field_33916).position(0), (FloatBuffer)((Buffer)field_33727).position(0), field_33743, field_33635);
      ((Buffer)field_33727).position(0);
      ((Buffer)field_33916).position(0);
      method_30273("setCamera");
   }

   private static void method_30294(Entity var0) {
      double var1 = Math.abs(field_33915 - field_33633);
      double var3 = Math.abs(field_33641 - field_33913);
      double var5 = Math.abs(field_33915);
      double var7 = Math.abs(field_33641);
      if (var1 > 1000.0 || var3 > 1000.0 || var5 > 1000000.0 || var7 > 1000000.0) {
         method_30130(var0);
      }
   }

   private static void method_30130(Entity var0) {
      if (var0 == null) {
         field_33593 = 0;
         field_33701 = 0;
      } else {
         field_33593 = (int)var0.getPosX() / 1000 * 1000;
         field_33701 = (int)var0.getPosZ() / 1000 * 1000;
      }
   }

   public static void method_30214(class_7966 var0, Camera var1, float var2) {
      Entity var3 = var1.method_41633();
      class_1343 var4 = var1.method_41627();
      double var5 = var4.field_7336;
      double var7 = var4.field_7333;
      double var9 = var4.field_7334;
      method_30294(var3);
      field_33915 = var5 - (double)field_33593;
      field_33769 = var7;
      field_33641 = var9 - (double)field_33701;
      GL32.glViewport(0, 0, field_33976, field_33907);
      GL32.glMatrixMode(5889);
      GL32.glLoadIdentity();
      if (field_33651) {
         GL32.glOrtho((double)(-field_33935), (double)field_33935, (double)(-field_33935), (double)field_33935, 0.05F, 256.0);
      } else {
         GlStateManager.method_8838(class_8107.method_36820((double)field_33857, (float)field_33976 / (float)field_33907, 0.05F, 256.0F));
      }

      var0.method_36065(0.0, 0.0, -100.0);
      var0.method_36060(class_2426.field_12080.method_11074(90.0F));
      field_33974 = field_33837.theWorld.method_13578(var2);
      field_33808 = field_33974 < 0.75F ? field_33974 + 0.25F : field_33974 - 0.75F;
      float var11 = field_33974 * -360.0F;
      float var12 = field_33981 > 0.0F ? var11 % field_33981 - field_33981 * 0.5F : 0.0F;
      if ((double)field_33808 <= 0.5) {
         var0.method_36060(class_2426.field_12076.method_11074(var11 - var12));
         var0.method_36060(class_2426.field_12080.method_11074(field_33824));
         field_33625 = field_33808;
      } else {
         var0.method_36060(class_2426.field_12076.method_11074(var11 + 180.0F - var12));
         var0.method_36060(class_2426.field_12080.method_11074(field_33824));
         field_33625 = field_33808 - 0.5F;
      }

      if (field_33651) {
         float var13 = field_33849;
         float var14 = var13 / 2.0F;
         var0.method_36065((double)((float)var5 % var13 - var14), (double)((float)var7 % var13 - var14), (double)((float)var9 % var13 - var14));
      }

      float var21 = field_33808 * (float) (Math.PI * 2);
      float var22 = (float)Math.cos((double)var21);
      float var15 = (float)Math.sin((double)var21);
      float var16 = field_33824 * (float) (Math.PI * 2);
      float var17 = var22;
      float var18 = var15 * (float)Math.cos((double)var16);
      float var19 = var15 * (float)Math.sin((double)var16);
      if ((double)field_33808 > 0.5) {
         var17 = -var22;
         var18 = -var18;
         var19 = -var19;
      }

      field_33854[0] = var17;
      field_33854[1] = var18;
      field_33854[2] = var19;
      field_33854[3] = 0.0F;
      GL32.glGetFloatv(2983, (FloatBuffer)((Buffer)field_33630).position(0));
      class_2643.method_11955((FloatBuffer)((Buffer)field_33592).position(0), (FloatBuffer)((Buffer)field_33630).position(0), field_33876, field_33800);
      ((Buffer)field_33630).position(0);
      ((Buffer)field_33592).position(0);
      class_8107 var20 = var0.method_36058().method_28620();
      var20.method_36827((FloatBuffer)((Buffer)field_33793).position(0));
      class_2643.method_11955((FloatBuffer)((Buffer)field_33892).position(0), (FloatBuffer)((Buffer)field_33793).position(0), field_33877, field_33832);
      ((Buffer)field_33793).position(0);
      ((Buffer)field_33892).position(0);
      method_30253(field_33889, false, field_33968);
      method_30253(field_33777, false, field_33758);
      method_30253(field_33951, false, field_33737);
      method_30253(field_33712, false, field_33727);
      method_30253(field_33920, false, field_33916);
      method_30253(field_33669, false, field_33732);
      method_30253(field_33967, false, field_33630);
      method_30253(field_33864, false, field_33592);
      method_30253(field_33643, false, field_33793);
      method_30253(field_33686, false, field_33892);
      method_30273("setCamera");
   }

   public static void method_30212(class_7966 var0) {
      var0.method_36060(class_2426.field_12076.method_11074(field_33824 * 1.0F));
      method_30273("preCelestialRotate");
   }

   public static void method_30312(class_7966 var0) {
      class_8107 var1 = var0.method_36058().method_28620();
      class_8107 var2 = new class_8107(var1);
      var2.method_36807();
      var2.method_36828(field_33819);
      class_2643.method_11953(field_33906, field_33819, field_33882);
      class_2643.method_11953(field_33787, field_33819, field_33867);
      System.arraycopy(field_33625 == field_33808 ? field_33906 : field_33787, 0, field_33939, 0, 3);
      method_30301(field_33752, field_33906[0], field_33906[1], field_33906[2]);
      method_30301(field_33786, field_33787[0], field_33787[1], field_33787[2]);
      method_30301(field_33820, field_33939[0], field_33939[1], field_33939[2]);
      if (field_33873 != null) {
         field_33873.method_23560();
      }

      method_30273("postCelestialRotate");
   }

   public static void method_30262(class_7966 var0) {
      class_8107 var1 = var0.method_36058().method_28620();
      class_8107 var2 = new class_8107(var1);
      var2.method_36807();
      var2.method_36828(field_33819);
      class_2643.method_11953(field_33944, field_33819, field_33729);
      method_30301(field_33833, field_33944[0], field_33944[1], field_33944[2]);
      if (field_33873 != null) {
         field_33873.method_23560();
      }
   }

   public static void method_30133() {
      if (field_33761) {
         for (int var0 = 0; var0 < field_33893; var0++) {
            if ((field_33695 & 1 << var0) != 0) {
               GlStateManager.method_8899(33984 + field_33711[var0]);
               GL32.glTexParameteri(3553, 10241, 9987);
               GL32.glGenerateMipmap(3553);
            }
         }

         GlStateManager.method_8899(33984);
      }
   }

   public static void method_30193() {
      GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      method_30125();
      int var0 = field_33770.method_13756();
      if (var0 > 1) {
         for (int var1 = 1; var1 < var0; var1++) {
            field_33776.method_40456(var1);
            method_30125();
         }

         field_33776.method_40456(0);
      }
   }

   private static void method_30125() {
      if (!method_30287()) {
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

   public static void method_30106() {
      if (!field_33945) {
         boolean var0 = method_30255(field_33620);
         if (field_33926) {
            method_30273("pre-render Deferred");
            method_30324(field_33707, false);
            var0 = true;
         }

         if (var0) {
            method_30310();

            for (int var1 = 0; var1 < field_33893; var1++) {
               EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var1, 3553, field_33842.method_45577(var1), 0);
            }

            if (field_33975.method_13766() != null) {
               method_30190(field_33975.method_13766());
            } else {
               method_30190(field_33831);
            }

            GlStateManager.method_8899(33984);
            field_33837.getTextureManager().bindTexture(class_8359.field_42824);
         }
      }
   }

   public static void method_30169() {
      if (!field_33945) {
         method_30255(field_33618);
         method_30273("pre-render CompositeFinal");
         method_30324(field_33624, true);
      }
   }

   private static boolean method_30255(class_3009 var0) {
      boolean var1 = false;
      Boolean[] var2 = var0.method_13748();

      for (int var3 = 0; var3 < field_33893; var3++) {
         if (Config.method_14416(var2[var3])) {
            field_33842.method_45579(var3);
            var1 = true;
         }
      }

      return var1;
   }

   private static void method_30324(class_3009[] var0, boolean var1) {
      if (!field_33945) {
         GL32.glPushMatrix();
         GL32.glLoadIdentity();
         GL32.glMatrixMode(5889);
         GL32.glPushMatrix();
         GL32.glLoadIdentity();
         GL32.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
         GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GlStateManager.method_8843();
         GlStateManager.method_8801();
         GlStateManager.method_8775();
         GlStateManager.method_8745();
         GlStateManager.method_8862(519);
         GlStateManager.method_8867(false);
         GlStateManager.method_8912();
         if (field_33846 >= 1) {
            GlStateManager.method_8899(33988);
            GlStateManager.method_8791(field_33788.get(0));
            if (field_33846 >= 2) {
               GlStateManager.method_8899(33989);
               GlStateManager.method_8791(field_33788.get(1));
            }
         }

         for (int var2 = 0; var2 < field_33893; var2++) {
            GlStateManager.method_8899(33984 + field_33711[var2]);
            GlStateManager.method_8791(field_33842.method_45577(var2));
         }

         GlStateManager.method_8899(33990);
         GlStateManager.method_8791(field_33910.get(0));
         if (field_33595 >= 2) {
            GlStateManager.method_8899(33995);
            GlStateManager.method_8791(field_33910.get(1));
            if (field_33595 >= 3) {
               GlStateManager.method_8899(33996);
               GlStateManager.method_8791(field_33910.get(2));
            }
         }

         for (int var5 = 0; var5 < field_33722; var5++) {
            GlStateManager.method_8899(33997 + var5);
            GlStateManager.method_8791(field_33739.get(var5));
         }

         if (field_33811) {
            GlStateManager.method_8899(33984 + field_33744.method_37400());
            GlStateManager.method_8791(field_33744.method_37397());
         }

         if (var1) {
            method_30252(field_33980);
         } else {
            method_30252(field_33934);
         }

         GlStateManager.method_8899(33984);

         for (int var6 = 0; var6 < field_33893; var6++) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var6, 3553, field_33842.method_45576(var6), 0);
         }

         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, field_33910.get(0), 0);
         GL32.glDrawBuffers(field_33831);
         method_30273("pre-composite");

         for (int var7 = 0; var7 < var0.length; var7++) {
            class_3009 var3 = var0[var7];
            if (var3.method_13759() != 0) {
               method_30236(var3);
               method_30273(var3.method_13763());
               if (field_33695 != 0) {
                  method_30133();
               }

               method_30099();
               method_30193();
               method_30257();

               for (int var4 = 0; var4 < field_33893; var4++) {
                  if (var3.method_13764()[var4]) {
                     field_33842.method_45579(var4);
                     GlStateManager.method_8899(33984 + field_33711[var4]);
                     GlStateManager.method_8791(field_33842.method_45577(var4));
                     EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + var4, 3553, field_33842.method_45576(var4), 0);
                  }
               }

               GlStateManager.method_8899(33984);
            }
         }

         method_30273("composite");
         if (var1) {
            method_30286();
            field_33834 = true;
         }

         GlStateManager.method_8927();
         GlStateManager.method_8843();
         GlStateManager.enableAlphaTest();
         GlStateManager.method_8829();
         GlStateManager.method_8862(515);
         GlStateManager.method_8867(true);
         GL32.glPopMatrix();
         GL32.glMatrixMode(5888);
         GL32.glPopMatrix();
         method_30236(field_33936);
      }
   }

   private static void method_30099() {
      class_1400 var0 = field_33770.method_13742();
      if (var0 != null) {
         int var1 = (int)((float)field_33803 * var0.method_6472());
         int var2 = (int)((float)field_33764 * var0.method_6473());
         int var3 = (int)((float)field_33803 * var0.method_6471());
         int var4 = (int)((float)field_33764 * var0.method_6471());
         GL32.glViewport(var1, var2, var3, var4);
      }
   }

   private static void method_30257() {
      class_1400 var0 = field_33770.method_13742();
      if (var0 != null) {
         GL32.glViewport(0, 0, field_33803, field_33764);
      }
   }

   private static void method_30286() {
      field_33890 = false;
      field_33837.method_8584().method_19717(true);
      GlStateManager.method_8747(class_6024.field_30769, class_6024.field_30770, 3553, field_33837.method_8584().method_19724(), 0);
      GL32.glViewport(0, 0, field_33837.getMainWindow().method_43178(), field_33837.getMainWindow().method_43198());
      GlStateManager.method_8867(true);
      GL32.glClearColor(field_33699, field_33959, field_33888, 1.0F);
      GL32.glClear(16640);
      GL32.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GlStateManager.method_8843();
      GlStateManager.method_8801();
      GlStateManager.method_8775();
      GlStateManager.method_8745();
      GlStateManager.method_8862(519);
      GlStateManager.method_8867(false);
      method_30273("pre-final");
      method_30236(field_33862);
      method_30273("final");
      if (field_33695 != 0) {
         method_30133();
      }

      method_30193();
      method_30273("renderCompositeFinal");
   }

   public static void method_30103() {
      if (field_33945) {
         method_30273("shadow endRender");
      } else {
         if (!field_33834) {
            method_30169();
         }

         field_33804 = false;
         GlStateManager.method_8895(true, true, true, true);
         method_30236(field_33936);
         class_2083.method_9719();
         method_30273("endRender end");
      }
   }

   public static void method_30204() {
      field_33638 = true;
      field_33947 = true;
      method_30190(field_33831);
      method_30236(field_33650);
      method_30241(-2, 0);
   }

   public static void method_30238(class_1343 var0) {
      field_33797 = (float)var0.field_7336;
      field_33668 = (float)var0.field_7333;
      field_33670 = (float)var0.field_7334;
      method_30301(field_33891, field_33797, field_33668, field_33670);
   }

   public static void method_30250(class_7966 var0) {
      class_9633 var1 = class_8042.method_36499().method_36501();
      float var2 = (float)(field_33837.gameOptions.field_45537 * 16);
      double var3 = (double)var2 * 0.9238;
      double var5 = (double)var2 * 0.3826;
      double var7 = -var5;
      double var9 = -var3;
      double var11 = 16.0;
      double var13 = -field_33769 + field_33680.method_749().method_3496() + 12.0 - 16.0;
      if (field_33769 < field_33680.method_749().method_3496()) {
         var13 = -4.0;
      }

      GlStateManager.method_8757();
      GlStateManager.method_8838(var0.method_36058().method_28620());
      var1.method_44471(7, class_7985.field_40915);
      var1.method_35761(var7, var13, var9).method_35735();
      var1.method_35761(var7, var11, var9).method_35735();
      var1.method_35761(var9, var11, var7).method_35735();
      var1.method_35761(var9, var13, var7).method_35735();
      var1.method_35761(var9, var13, var7).method_35735();
      var1.method_35761(var9, var11, var7).method_35735();
      var1.method_35761(var9, var11, var5).method_35735();
      var1.method_35761(var9, var13, var5).method_35735();
      var1.method_35761(var9, var13, var5).method_35735();
      var1.method_35761(var9, var11, var5).method_35735();
      var1.method_35761(var7, var11, var3).method_35735();
      var1.method_35761(var7, var13, var3).method_35735();
      var1.method_35761(var7, var13, var3).method_35735();
      var1.method_35761(var7, var11, var3).method_35735();
      var1.method_35761(var5, var11, var3).method_35735();
      var1.method_35761(var5, var13, var3).method_35735();
      var1.method_35761(var5, var13, var3).method_35735();
      var1.method_35761(var5, var11, var3).method_35735();
      var1.method_35761(var3, var11, var5).method_35735();
      var1.method_35761(var3, var13, var5).method_35735();
      var1.method_35761(var3, var13, var5).method_35735();
      var1.method_35761(var3, var11, var5).method_35735();
      var1.method_35761(var3, var11, var7).method_35735();
      var1.method_35761(var3, var13, var7).method_35735();
      var1.method_35761(var3, var13, var7).method_35735();
      var1.method_35761(var3, var11, var7).method_35735();
      var1.method_35761(var5, var11, var9).method_35735();
      var1.method_35761(var5, var13, var9).method_35735();
      var1.method_35761(var5, var13, var9).method_35735();
      var1.method_35761(var5, var11, var9).method_35735();
      var1.method_35761(var7, var11, var9).method_35735();
      var1.method_35761(var7, var13, var9).method_35735();
      var1.method_35761(var9, var13, var9).method_35735();
      var1.method_35761(var9, var13, var3).method_35735();
      var1.method_35761(var3, var13, var3).method_35735();
      var1.method_35761(var3, var13, var9).method_35735();
      class_8042.method_36499().method_36500();
      GlStateManager.method_8761();
   }

   public static void method_30168(class_7966 var0) {
      method_30262(var0);
      GL11.glColor3f(field_33780, field_33923, field_33753);
      method_30250(var0);
      GL11.glColor3f(field_33797, field_33668, field_33670);
   }

   public static void method_30209() {
      field_33638 = false;
      method_30190(field_33831);
      method_30236(field_33735 ? field_33784 : field_33587);
      method_30176();
   }

   public static void method_30162() {
      method_30273("beginUpdateChunks1");
      method_30142("beginUpdateChunks1");
      if (!field_33945) {
         method_30236(field_33884);
      }

      method_30273("beginUpdateChunks2");
      method_30142("beginUpdateChunks2");
   }

   public static void method_30152() {
      method_30273("endUpdateChunks1");
      method_30142("endUpdateChunks1");
      if (!field_33945) {
         method_30236(field_33884);
      }

      method_30273("endUpdateChunks2");
      method_30142("endUpdateChunks2");
   }

   public static boolean method_30136(GameOptions var0) {
      if (!field_33724) {
         return true;
      } else {
         method_30273("shouldRenderClouds");
         return field_33945 ? field_33964 : var0.field_45551 != class_9655.field_49168;
      }
   }

   public static void method_30170() {
      field_33947 = true;
      method_30241(-3, 0);
      method_30236(field_33810);
   }

   public static void method_30198() {
      method_30180();
      method_30176();
      method_30236(field_33735 ? field_33784 : field_33587);
   }

   public static void method_30305() {
      if (field_33804) {
         method_30236(field_33713);
      }
   }

   public static void method_30181(Entity var0) {
      if (field_33804) {
         if (var0.method_37116()) {
            method_30236(field_33802);
         } else {
            method_30236(field_33713);
         }

         method_30261(var0);
      }
   }

   public static void method_30261(Entity var0) {
      if (field_33848.method_27601()) {
         int var1 = class_7070.method_32561(var0);
         int var2 = class_9713.method_44861(var1);
         field_33848.method_40456(var2);
      }
   }

   public static void method_30278() {
      if (field_33804 && field_33822.method_13759() != field_33936.method_13759()) {
         method_30236(field_33822);
         GlStateManager.enableAlphaTest();
         GlStateManager.method_8785(516, 0.0F);
         GlStateManager.method_8787(770, 771);
      }
   }

   public static void method_30249() {
      if (field_33804 && field_33822.method_13759() != field_33936.method_13759()) {
         method_30236(field_33713);
         GlStateManager.method_8801();
      }
   }

   public static void method_30260() {
      if (field_33804) {
         method_30261((Entity)null);
         method_30236(field_33735 ? field_33784 : field_33587);
      }
   }

   public static void method_30203() {
      if (field_33804) {
         field_33851 = true;
      }
   }

   public static void method_30266() {
      if (field_33804) {
         field_33851 = false;
      }
   }

   public static void method_30135(float var0, float var1, float var2, float var3) {
      if (field_33804 && !field_33945) {
         field_33596.method_207(var0, var1, var2, var3);
      }
   }

   public static void method_30150() {
      if (field_33804) {
         class_7977.method_36161(field_33690);
         if (!field_33945) {
            method_30190(field_33694);
         }
      }
   }

   public static void method_30224() {
      if (field_33804 && !field_33945) {
         method_30190(field_33713.method_13766());
      }
   }

   public static void method_30189() {
      if (field_33804) {
         method_30273("beginBlockEntities");
         method_30236(field_33956);
      }
   }

   public static void method_30117(class_3757 var0) {
      if (field_33804) {
         method_30273("nextBlockEntity");
         method_30236(field_33956);
         method_30300(var0);
      }
   }

   public static void method_30300(class_3757 var0) {
      if (field_33762.method_27601()) {
         int var1 = method_30226(var0);
         field_33762.method_40456(var1);
      }
   }

   private static int method_30226(class_3757 var0) {
      if (var0 == null) {
         return -1;
      } else {
         class_2522 var1 = var0.method_17403();
         return class_7330.method_33396(var1);
      }
   }

   public static void method_30256() {
      if (field_33804) {
         method_30273("endBlockEntities");
         method_30300((class_3757)null);
         method_30236(field_33735 ? field_33784 : field_33587);
         class_7977.method_36178(field_33690.method_37050());
      }
   }

   public static void method_30275() {
      method_30236(field_33784);
   }

   public static void method_30163() {
      method_30236(field_33587);
   }

   public static void method_30192() {
      method_30236(field_33784);
   }

   public static void method_30141() {
      if (!field_33945 && field_33665) {
         ((Buffer)field_33705).clear();
         GL32.glReadPixels(field_33803 / 2, field_33764 / 2, 1, 1, 6402, 5126, field_33705);
         field_33880 = field_33705.get(0);
         float var0 = (float)field_33903 * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5) * (double)var0 / (double)field_33818);
         field_33973 = field_33973 * var1 + field_33880 * (1.0F - var1);
      }
   }

   public static void method_30101() {
      if (!field_33945) {
         GlStateManager.method_8745();
         GlStateManager.method_8829();
         GlStateManager.method_8787(770, 771);
         GlStateManager.enableAlphaTest();
         method_30236(field_33645);
      }
   }

   public static void method_30217() {
      GlStateManager.method_8775();
      method_30236(field_33784);
   }

   public static void method_30137() {
      if (!field_33945 && field_33595 >= 3) {
         GlStateManager.method_8899(33996);
         GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, field_33803, field_33764);
         GlStateManager.method_8899(33984);
      }
   }

   public static void method_30326() {
      if (field_33595 >= 2) {
         GlStateManager.method_8899(33995);
         method_30273("pre copy depth");
         GL32.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, field_33803, field_33764);
         method_30273("copy depth");
         GlStateManager.method_8899(33984);
      }

      class_7977.method_36178(field_33690.method_37050());
   }

   public static void method_30157() {
      if (field_33804) {
         if (!field_33945) {
            method_30106();
            method_30236(field_33975);
            GlStateManager.method_8829();
            GlStateManager.method_8867(true);
         } else {
            GlStateManager.method_8867(true);
         }
      }
   }

   public static void method_30177() {
      if (field_33804) {
         if (field_33945) {
         }

         method_30236(field_33735 ? field_33784 : field_33587);
      }
   }

   public static void method_30197(class_7966 var0) {
      if ((double)field_33751 != 1.0) {
         var0.method_36062(1.0F, 1.0F, field_33751);
      }
   }

   public static void method_30116(class_7966 var0, boolean var1) {
      GL32.glMatrixMode(5888);
      GL32.glPushMatrix();
      GL32.glMatrixMode(5889);
      GL32.glPushMatrix();
      GL32.glMatrixMode(5888);
      var0.method_36063();
      if (var1) {
         method_30236(field_33828);
      } else {
         method_30236(field_33790);
      }

      method_30273("beginHand");
      method_30142("beginHand");
   }

   public static void method_30100(class_7966 var0) {
      method_30273("pre endHand");
      method_30142("pre endHand");
      var0.method_36064();
      GL32.glMatrixMode(5889);
      GL32.glPopMatrix();
      GL32.glMatrixMode(5888);
      GL32.glPopMatrix();
      GlStateManager.method_8787(770, 771);
      method_30273("endHand");
   }

   public static void method_30239() {
      GlStateManager.method_8912();
      GlStateManager.method_8775();
   }

   public static void method_30128() {
   }

   public static void method_30263(int var0) {
      GL32.glEnable(var0);
      if (var0 == 3553) {
         method_30248();
      } else if (var0 == 2912) {
         method_30159();
      }
   }

   public static void method_30302(int var0) {
      GL32.glDisable(var0);
      if (var0 == 3553) {
         method_30299();
      } else if (var0 == 2912) {
         method_30180();
      }
   }

   public static void method_30284(int var0) {
      GL32.glEnable(var0);
      method_30248();
   }

   public static void method_30160(int var0) {
      GL32.glDisable(var0);
      method_30299();
   }

   public static void method_30258(int var0) {
      GL32.glEnable(var0);
      method_30159();
   }

   public static void method_30151(int var0) {
      GL32.glDisable(var0);
      method_30180();
   }

   public static void method_30248() {
      if (field_33638) {
         method_30236(field_33650);
      } else if (field_33770 == field_33748) {
         method_30236(field_33735 ? field_33784 : field_33587);
      }
   }

   public static void method_30299() {
      if (field_33638) {
         method_30236(field_33628);
      } else if (field_33770 == field_33587 || field_33770 == field_33784) {
         method_30236(field_33748);
      }
   }

   public static void method_30315() {
      field_33709.method_13439(field_33770);
   }

   public static void method_30118() {
      class_3009 var0 = field_33709.method_13441();
      method_30236(var0);
   }

   public static void method_30195() {
      method_30315();
      method_30236(field_33748);
   }

   public static void method_30104() {
      method_30118();
   }

   public static void method_30159() {
      field_33947 = true;
      method_30211(field_33894, field_33847);
      method_30207(field_33879, field_33698);
   }

   public static void method_30180() {
      field_33947 = false;
      method_30211(field_33894, 0);
   }

   public static void method_30219(class_5084 var0) {
      method_30218(var0.field_26253);
   }

   public static void method_30131(float var0) {
      field_33698 = var0;
      if (field_33947) {
         method_30207(field_33879, var0);
      }
   }

   public static void method_30216(int var0, int var1) {
      GL11.glFogi(var0, var1);
      if (var0 == 2917) {
         field_33847 = var1;
         if (field_33947) {
            method_30211(field_33894, field_33847);
         }
      }
   }

   public static void method_30292() {
      field_33735 = true;
      if (field_33770 == field_33587) {
         method_30236(field_33784);
      }
   }

   public static void method_30325() {
      field_33735 = false;
      if (field_33770 == field_33784) {
         method_30236(field_33587);
      }
   }

   public static int method_30127() {
      return field_33798[field_33679 * 2];
   }

   public static int method_30206() {
      return field_33798[field_33679 * 2 + 1];
   }

   public static int method_30114(int var0) {
      field_33798[field_33679 * 2] = field_33798[field_33679 * 2] & 65535 | var0 << 16;
      return var0;
   }

   public static int method_30304(int var0) {
      field_33798[field_33679 * 2 + 1] = field_33798[field_33679 * 2 + 1] & -65536 | var0 & 65535;
      return var0;
   }

   public static void method_30241(int var0, int var1) {
      field_33679++;
      field_33798[field_33679 * 2] = var0 & 65535 | var1 << 16;
      field_33798[field_33679 * 2 + 1] = 0;
   }

   public static void method_30240(int var0) {
      field_33679++;
      field_33798[field_33679 * 2] = var0 & 65535;
      field_33798[field_33679 * 2 + 1] = 0;
   }

   public static void method_30242(class_6414 var0) {
      field_33679++;
      int var1 = var0.method_10788(var0.method_29260()).ordinal();
      field_33798[field_33679 * 2] = class_8669.field_44462.method_14041(var0) & 65535 | var1 << 16;
      field_33798[field_33679 * 2 + 1] = 0;
   }

   public static void method_30176() {
      field_33798[field_33679 * 2] = 0;
      field_33798[field_33679 * 2 + 1] = 0;
      field_33679--;
   }

   public static void method_30205() {
      field_33837.getProfiler().endSection();
   }

   public static String method_30235() {
      if (field_33602 == null) {
         return null;
      } else {
         return field_33602 instanceof class_185 ? null : field_33602.method_39507();
      }
   }

   public static InputStream method_30208(String var0) {
      return field_33602 == null ? null : field_33602.method_39505(var0);
   }

   public static void method_30267(boolean var0) {
      if (var0) {
         field_33631 += 2;
         if (field_33631 > 4) {
            field_33631 = 0;
         }
      } else {
         field_33631 -= 2;
         if (field_33631 < 0) {
            field_33631 = 4;
         }
      }

      field_33631 = field_33631 / 2 * 2;
      field_33631 = Config.method_14263(field_33631, 0, 4);
   }

   public static void method_30166() {
      try {
         Class var0 = Class.forName("shadersmod.transform.SMCClassTransformer");
      } catch (Throwable var1) {
         return;
      }

      throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
   }

   public static void method_30303() {
      method_30122();
      if (field_33724) {
         class_7330.method_33392();
         class_5644.method_25555();
         class_9713.method_44867();
      }
   }

   private static void method_30122() {
      field_33749 = new HashMap<String, String>();
      if (field_33724) {
         ArrayList var0 = new ArrayList();
         String var1 = "/shaders/lang/";
         String var2 = "en_us";
         String var3 = ".lang";
         var0.add(var1 + var2 + var3);
         var0.add(var1 + method_30274(var2) + var3);
         if (!Config.method_14310().field_45437.equals(var2)) {
            String var4 = Config.method_14310().field_45437;
            var0.add(var1 + var4 + var3);
            var0.add(var1 + method_30274(var4) + var3);
         }

         try {
            for (String var5 : var0) {
               InputStream var6 = field_33602.method_39505(var5);
               if (var6 != null) {
                  class_8407 var7 = new class_8407();
                  class_3458.method_15905(var6, var7);
                  var6.close();

                  for (String var9 : var7.keySet()) {
                     String var10 = var7.getProperty(var9);
                     field_33749.put(var9, var10);
                  }
               }
            }
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }
   }

   private static String method_30274(String var0) {
      int var1 = var0.indexOf(95);
      return var1 < 0 ? var0 : var0.substring(0, var1) + var0.substring(var1).toUpperCase(Locale.ROOT);
   }

   public static String method_30244(String var0, String var1) {
      String var2 = field_33749.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static boolean method_30155(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf("/");
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         class_3009 var2 = method_30288(var0);
         return var2 != null;
      }
   }

   public static class_3009 method_30288(String var0) {
      return field_33948.method_35046(var0);
   }

   public static void method_30156(ItemStack var0) {
      field_33617 = method_30110(var0);
   }

   public static void method_30271(ItemStack var0) {
      field_33799 = method_30110(var0);
   }

   public static boolean method_30123() {
      return field_33617;
   }

   public static boolean method_30246() {
      return field_33799;
   }

   public static boolean method_30321() {
      return field_33919 && field_33682;
   }

   private static boolean method_30110(ItemStack var0) {
      if (var0 == null) {
         return false;
      } else {
         class_2451 var1 = var0.method_27960();
         if (var1 == null) {
            return false;
         } else if (!(var1 instanceof class_6201)) {
            return false;
         } else {
            class_6201 var2 = (class_6201)var1;
            class_6414 var3 = var2.method_28392();
            if (var3 == null) {
               return false;
            } else {
               RenderLayer var4 = class_6416.method_29330(var3.method_29260());
               return var4 == class_6727.field_34740;
            }
         }
      }
   }

   public static boolean method_30230(Hand var0) {
      return var0 == Hand.MAIN_HAND && field_33953 ? true : var0 == Hand.OFF_HAND && field_33902;
   }

   public static boolean method_30279() {
      return !field_33953 && !field_33902;
   }

   public static void method_30234(boolean var0, boolean var1) {
      field_33953 = var0;
      field_33902 = var1;
   }

   public static void method_30254(boolean var0, boolean var1) {
      field_33919 = var0;
      field_33682 = var1;
   }

   public static boolean method_30281() {
      return field_33919;
   }

   public static boolean method_30298() {
      return field_33682;
   }

   public static float method_30251() {
      return field_33654 < 0.0F ? -1.0F : field_33935 * field_33654;
   }

   public static void method_30276(boolean var0) {
      field_33726 = var0;
   }

   public static boolean method_30247() {
      return field_33726;
   }

   public static void method_30185() {
      if (field_33804) {
         method_30236(field_33963);
      }
   }

   public static void method_30283() {
      if (field_33804) {
         method_30236(field_33956);
      }
   }

   public static ClientWorld method_30215() {
      return field_33680;
   }

   public static BlockPos method_30293() {
      return new BlockPos(field_33915, field_33769, field_33641);
   }

   public static boolean method_30265() {
      return field_33873 != null;
   }

   public static boolean method_30287() {
      return field_33881 ? field_33895.GL_NV_geometry_shader4 : true;
   }

   public static boolean method_30191() {
      return field_33724;
   }

   public static boolean method_30126() {
      return field_33724;
   }

   public static boolean method_30132() {
      return field_33724;
   }

   public static void method_30320() {
      class_4811.method_22179();
   }
}

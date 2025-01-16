// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7677
{
    private static String field30476;
    public static final String field30477 = "MC_VERSION";
    public static final String field30478 = "MC_GL_VERSION";
    public static final String field30479 = "MC_GLSL_VERSION";
    public static final String field30480 = "MC_OS_WINDOWS";
    public static final String field30481 = "MC_OS_MAC";
    public static final String field30482 = "MC_OS_LINUX";
    public static final String field30483 = "MC_OS_OTHER";
    public static final String field30484 = "MC_GL_VENDOR_ATI";
    public static final String field30485 = "MC_GL_VENDOR_INTEL";
    public static final String field30486 = "MC_GL_VENDOR_NVIDIA";
    public static final String field30487 = "MC_GL_VENDOR_XORG";
    public static final String field30488 = "MC_GL_VENDOR_OTHER";
    public static final String field30489 = "MC_GL_RENDERER_RADEON";
    public static final String field30490 = "MC_GL_RENDERER_GEFORCE";
    public static final String field30491 = "MC_GL_RENDERER_QUADRO";
    public static final String field30492 = "MC_GL_RENDERER_INTEL";
    public static final String field30493 = "MC_GL_RENDERER_GALLIUM";
    public static final String field30494 = "MC_GL_RENDERER_MESA";
    public static final String field30495 = "MC_GL_RENDERER_OTHER";
    public static final String field30496 = "MC_FXAA_LEVEL";
    public static final String field30497 = "MC_NORMAL_MAP";
    public static final String field30498 = "MC_SPECULAR_MAP";
    public static final String field30499 = "MC_RENDER_QUALITY";
    public static final String field30500 = "MC_SHADOW_QUALITY";
    public static final String field30501 = "MC_HAND_DEPTH";
    public static final String field30502 = "MC_OLD_HAND_LIGHT";
    public static final String field30503 = "MC_OLD_LIGHTING";
    private static Class8573[] field30504;
    
    public static String method24367() {
        switch (Class7783.field31861[Util.method27845().ordinal()]) {
            case 1: {
                return "MC_OS_WINDOWS";
            }
            case 2: {
                return "MC_OS_MAC";
            }
            case 3: {
                return "MC_OS_LINUX";
            }
            default: {
                return "MC_OS_OTHER";
            }
        }
    }
    
    public static String method24368() {
        final String field36020 = Config.field36020;
        if (field36020 == null) {
            return "MC_GL_VENDOR_OTHER";
        }
        final String lowerCase = field36020.toLowerCase();
        if (lowerCase.startsWith("ati")) {
            return "MC_GL_VENDOR_ATI";
        }
        if (lowerCase.startsWith("intel")) {
            return "MC_GL_VENDOR_INTEL";
        }
        if (!lowerCase.startsWith("nvidia")) {
            return lowerCase.startsWith("x.org") ? "MC_GL_VENDOR_XORG" : "MC_GL_VENDOR_OTHER";
        }
        return "MC_GL_VENDOR_NVIDIA";
    }
    
    public static String method24369() {
        final String field36019 = Config.field36019;
        if (field36019 == null) {
            return "MC_GL_RENDERER_OTHER";
        }
        final String lowerCase = field36019.toLowerCase();
        if (lowerCase.startsWith("amd")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (lowerCase.startsWith("ati")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (lowerCase.startsWith("radeon")) {
            return "MC_GL_RENDERER_RADEON";
        }
        if (lowerCase.startsWith("gallium")) {
            return "MC_GL_RENDERER_GALLIUM";
        }
        if (lowerCase.startsWith("intel")) {
            return "MC_GL_RENDERER_INTEL";
        }
        if (lowerCase.startsWith("geforce")) {
            return "MC_GL_RENDERER_GEFORCE";
        }
        if (lowerCase.startsWith("nvidia")) {
            return "MC_GL_RENDERER_GEFORCE";
        }
        if (lowerCase.startsWith("quadro")) {
            return "MC_GL_RENDERER_QUADRO";
        }
        if (!lowerCase.startsWith("nvs")) {
            return lowerCase.startsWith("mesa") ? "MC_GL_RENDERER_MESA" : "MC_GL_RENDERER_OTHER";
        }
        return "MC_GL_RENDERER_QUADRO";
    }
    
    public static String method24370() {
        return Class7677.field30476;
    }
    
    public static Class8573[] method24371() {
        if (Class7677.field30504 == null) {
            final String[] method28830 = Config.method28830();
            final Class8573[] field30504 = new Class8573[method28830.length];
            for (int i = 0; i < method28830.length; ++i) {
                field30504[i] = new Class8573(Class7677.field30476 + method28830[i], "");
            }
            Class7677.field30504 = field30504;
        }
        return Class7677.field30504;
    }
    
    public static String method24372() {
        final StringBuilder sb = new StringBuilder();
        method24374(sb, "MC_VERSION", Config.method28824());
        method24376(sb, "MC_GL_VERSION " + Config.method28827().method19200());
        method24376(sb, "MC_GLSL_VERSION " + Config.method28828().method19200());
        method24376(sb, method24367());
        method24376(sb, method24368());
        method24376(sb, method24369());
        return sb.toString();
    }
    
    public static String method24373() {
        final StringBuilder sb = new StringBuilder();
        if (Class9216.field39317 > 0) {
            method24374(sb, "MC_FXAA_LEVEL", Class9216.field39317);
        }
        if (Class9216.field39313) {
            method24376(sb, "MC_NORMAL_MAP");
        }
        if (Class9216.field39314) {
            method24376(sb, "MC_SPECULAR_MAP");
        }
        method24375(sb, "MC_RENDER_QUALITY", Class9216.field39304);
        method24375(sb, "MC_SHADOW_QUALITY", Class9216.field39305);
        method24375(sb, "MC_HAND_DEPTH", Class9216.field39303);
        if (Class9216.method33748()) {
            method24376(sb, "MC_OLD_HAND_LIGHT");
        }
        if (Class9216.method33750()) {
            method24376(sb, "MC_OLD_LIGHTING");
        }
        return sb.toString();
    }
    
    private static void method24374(final StringBuilder sb, final String str, final int i) {
        sb.append("#define ");
        sb.append(str);
        sb.append(" ");
        sb.append(i);
        sb.append("\n");
    }
    
    private static void method24375(final StringBuilder sb, final String str, final float f) {
        sb.append("#define ");
        sb.append(str);
        sb.append(" ");
        sb.append(f);
        sb.append("\n");
    }
    
    private static void method24376(final StringBuilder sb, final String str) {
        sb.append("#define ");
        sb.append(str);
        sb.append("\n");
    }
    
    static {
        Class7677.field30476 = "MC_";
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.CharArrayReader;
import java.util.LinkedHashSet;
import java.io.CharArrayWriter;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.Properties;
import java.util.HashSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Class7528
{
    private static final Pattern field29889;
    private static final Pattern field29890;
    private static final Set<String> field29891;
    private static final Map<String, Integer> field29892;
    private static final Map<String, Integer> field29893;
    
    public static Class5601[] method23548(final Class7038 class7038, final String[] array, final List<Integer> list) {
        if (class7038 != null) {
            final HashMap hashMap = new HashMap();
            method23549(class7038, "/shaders", array, hashMap);
            final Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                method23549(class7038, "/shaders/world" + (int)iterator.next(), array, hashMap);
            }
            final Collection values = hashMap.values();
            final Class5601[] a = (Class5601[])values.toArray(new Class5601[values.size()]);
            Arrays.sort(a, new Class4454());
            return a;
        }
        return new Class5601[0];
    }
    
    private static void method23549(final Class7038 class7038, final String s, final String[] array, final Map<String, Class5601> map) {
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (!s2.equals("")) {
                final String string = s + "/" + s2 + ".vsh";
                final String string2 = s + "/" + s2 + ".fsh";
                method23550(class7038, string, map);
                method23550(class7038, string2, map);
            }
        }
    }
    
    private static void method23550(final Class7038 class7038, final String s, final Map<String, Class5601> map) {
        final String[] method23552 = method23552(class7038, s);
        for (int i = 0; i < method23552.length; ++i) {
            final Class5601 method23553 = method23553(method23552[i], s);
            if (method23553 != null) {
                if (!method23553.method16860().startsWith(Class7677.method24370())) {
                    if (!method23553.method16881() || method23551(method23553, method23552)) {
                        final String method23554 = method23553.method16860();
                        final Class5601 class7039 = map.get(method23554);
                        if (class7039 == null) {
                            map.put(method23554, method23553);
                        }
                        else {
                            if (!Class8571.equals(class7039.method16865(), method23553.method16865())) {
                                Class8571.method28848("Ambiguous shader option: " + method23553.method16860());
                                Class8571.method28848(" - in " + Class8571.method28888(class7039.method16870()) + ": " + class7039.method16865());
                                Class8571.method28848(" - in " + Class8571.method28888(method23553.method16870()) + ": " + method23553.method16865());
                                class7039.method16873(false);
                            }
                            if (class7039.method16861() == null || class7039.method16861().length() <= 0) {
                                class7039.method16862(method23553.method16861());
                            }
                            class7039.method16871(method23553.method16870());
                        }
                    }
                }
            }
        }
    }
    
    private static boolean method23551(final Class5601 class5601, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (class5601.method16882(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    private static String[] method23552(final Class7038 class7038, final String s) {
        try {
            final String method23564 = method23564(s, class7038, 0, new ArrayList<String>(), 0);
            if (method23564 == null) {
                return new String[0];
            }
            return Class8571.method28957(new ByteArrayInputStream(method23564.getBytes()));
        }
        catch (final IOException ex) {
            Class8571.method28847(ex.getClass().getName() + ": " + ex.getMessage());
            return new String[0];
        }
    }
    
    private static Class5601 method23553(final String s, final String s2) {
        Class5601 class5601 = null;
        if (class5601 == null) {
            class5601 = Class5604.method16894(s, s2);
        }
        if (class5601 == null) {
            class5601 = Class5606.method16896(s, s2);
        }
        if (class5601 == null) {
            if (class5601 == null) {
                class5601 = Class5605.method16894(s, s2);
            }
            if (class5601 == null) {
                class5601 = Class5607.method16896(s, s2);
            }
            return (class5601 != null && Class7528.field29891.contains(class5601.method16860())) ? class5601 : null;
        }
        return class5601;
    }
    
    private static Set<String> method23554() {
        final HashSet set = new HashSet();
        set.add("shadowMapResolution");
        set.add("shadowMapFov");
        set.add("shadowDistance");
        set.add("shadowDistanceRenderMul");
        set.add("shadowIntervalSize");
        set.add("generateShadowMipmap");
        set.add("generateShadowColorMipmap");
        set.add("shadowHardwareFiltering");
        set.add("shadowHardwareFiltering0");
        set.add("shadowHardwareFiltering1");
        set.add("shadowtex0Mipmap");
        set.add("shadowtexMipmap");
        set.add("shadowtex1Mipmap");
        set.add("shadowcolor0Mipmap");
        set.add("shadowColor0Mipmap");
        set.add("shadowcolor1Mipmap");
        set.add("shadowColor1Mipmap");
        set.add("shadowtex0Nearest");
        set.add("shadowtexNearest");
        set.add("shadow0MinMagNearest");
        set.add("shadowtex1Nearest");
        set.add("shadow1MinMagNearest");
        set.add("shadowcolor0Nearest");
        set.add("shadowColor0Nearest");
        set.add("shadowColor0MinMagNearest");
        set.add("shadowcolor1Nearest");
        set.add("shadowColor1Nearest");
        set.add("shadowColor1MinMagNearest");
        set.add("wetnessHalflife");
        set.add("drynessHalflife");
        set.add("eyeBrightnessHalflife");
        set.add("centerDepthHalflife");
        set.add("sunPathRotation");
        set.add("ambientOcclusionLevel");
        set.add("superSamplingLevel");
        set.add("noiseTextureResolution");
        return set;
    }
    
    public static Class9319[] method23555(final Properties properties, final Class5601[] array) {
        final String prefix = "profile.";
        final ArrayList list = new ArrayList();
        for (final String key : properties.keySet()) {
            if (!key.startsWith(prefix)) {
                continue;
            }
            final String substring = key.substring(prefix.length());
            properties.getProperty(key);
            final Class9319 method23559 = method23559(substring, properties, new HashSet<String>(), array);
            if (method23559 == null) {
                continue;
            }
            list.add(method23559);
        }
        if (list.size() > 0) {
            return (Class9319[])list.toArray(new Class9319[list.size()]);
        }
        return null;
    }
    
    public static Map<String, Class326> method23556(final Properties properties, final Class5601[] array) {
        final Pattern compile = Pattern.compile("program\\.([^.]+)\\.enabled");
        final HashMap hashMap = new HashMap();
        for (final String str : properties.keySet()) {
            final Matcher matcher = compile.matcher(str);
            if (!matcher.matches()) {
                continue;
            }
            final String group = matcher.group(1);
            final Class326 method23557 = method23557(properties.getProperty(str).trim(), array);
            if (method23557 != null) {
                hashMap.put(group, method23557);
            }
            else {
                Class8885.method31270("Error parsing program condition: " + str);
            }
        }
        return hashMap;
    }
    
    private static Class326 method23557(final String s, final Class5601[] array) {
        try {
            return new Class7186(new Class5105(array)).method22031(s);
        }
        catch (final Class2327 class2327) {
            Class8885.method31271(class2327.getClass().getName() + ": " + class2327.getMessage());
            return null;
        }
    }
    
    public static Set<String> method23558(final Properties properties, final Class5601[] array) {
        final HashSet set = new HashSet();
        final String property = properties.getProperty("sliders");
        if (property != null) {
            final String[] method28937 = Class8571.method28937(property, " ");
            for (int i = 0; i < method28937.length; ++i) {
                final String str = method28937[i];
                if (Class7510.method23440(str, array) != null) {
                    set.add(str);
                }
                else {
                    Class8571.method28848("Invalid shader option: " + str);
                }
            }
            return set;
        }
        return set;
    }
    
    private static Class9319 method23559(final String s, final Properties properties, final Set<String> set, final Class5601[] array) {
        final String s2 = "profile.";
        final String string = s2 + s;
        if (!set.contains(string)) {
            set.add(s);
            final Class9319 class9319 = new Class9319(s);
            final String[] method28937 = Class8571.method28937(properties.getProperty(string), " ");
            for (int i = 0; i < method28937.length; ++i) {
                final String str = method28937[i];
                if (!str.startsWith(s2)) {
                    final String[] method28938 = Class8571.method28937(str, ":=");
                    if (method28938.length != 1) {
                        if (method28938.length == 2) {
                            final String s3 = method28938[0];
                            final String s4 = method28938[1];
                            final Class5601 method28939 = Class7510.method23440(s3, array);
                            if (method28939 != null) {
                                if (method28939.method16877(s4)) {
                                    method28939.method16876(true);
                                    class9319.method34501(s3, s4);
                                }
                                else {
                                    Class8571.method28848("[Shaders] Invalid value: " + str);
                                }
                            }
                            else {
                                Class8571.method28848("[Shaders] Invalid option: " + str);
                            }
                        }
                        else {
                            Class8571.method28848("[Shaders] Invalid option value: " + str);
                        }
                    }
                    else {
                        String substring = method28938[0];
                        boolean b = true;
                        if (substring.startsWith("!")) {
                            b = false;
                            substring = substring.substring(1);
                        }
                        final String prefix = "program.";
                        if (!substring.startsWith(prefix)) {
                            final Class5601 method28940 = Class7510.method23440(substring, array);
                            if (method28940 instanceof Class5604) {
                                class9319.method34501(substring, String.valueOf(b));
                                method28940.method16876(true);
                            }
                            else {
                                Class8571.method28848("[Shaders] Invalid option: " + substring);
                            }
                        }
                        else {
                            final String substring2 = substring.substring(prefix.length());
                            if (Class9216.method33899(substring2)) {
                                if (!b) {
                                    class9319.method34506(substring2);
                                }
                                else {
                                    class9319.method34507(substring2);
                                }
                            }
                            else {
                                Class8571.method28848("Invalid program: " + substring2 + " in profile: " + class9319.method34500());
                            }
                        }
                    }
                }
                else {
                    final Class9319 method28941 = method23559(str.substring(s2.length()), properties, set, array);
                    if (class9319 != null) {
                        class9319.method34502(method28941);
                        class9319.method34509(method28941.method34508());
                    }
                }
            }
            return class9319;
        }
        Class8571.method28848("[Shaders] Profile already parsed: " + s);
        return null;
    }
    
    public static Map<String, Class9442> method23560(final Properties properties, final Class9319[] array, final Class5601[] array2) {
        final HashMap hashMap = new HashMap();
        method23561("screen", properties, hashMap, array, array2);
        return hashMap.isEmpty() ? null : hashMap;
    }
    
    private static boolean method23561(final String str, final Properties properties, final Map<String, Class9442> map, final Class9319[] array, final Class5601[] array2) {
        final String property = properties.getProperty(str);
        if (property != null) {
            final ArrayList list = new ArrayList();
            final HashSet set = new HashSet();
            final String[] method28937 = Class8571.method28937(property, " ");
            for (int i = 0; i < method28937.length; ++i) {
                final String str2 = method28937[i];
                if (!str2.equals("<empty>")) {
                    if (!set.contains(str2)) {
                        set.add(str2);
                        if (!str2.equals("<profile>")) {
                            if (!str2.equals("*")) {
                                if (str2.startsWith("[") && str2.endsWith("]")) {
                                    final String method28938 = Class9518.method35527(str2, "[", "]");
                                    if (method28938.matches("^[a-zA-Z0-9_]+$")) {
                                        if (method23561("screen." + method28938, properties, map, array, array2)) {
                                            list.add(new Class5600(method28938));
                                        }
                                        else {
                                            Class8571.method28848("[Shaders] Invalid screen: " + str2 + ", key: " + str);
                                        }
                                    }
                                    else {
                                        Class8571.method28848("[Shaders] Invalid screen: " + str2 + ", key: " + str);
                                    }
                                }
                                else {
                                    final Class5601 method28939 = Class7510.method23440(str2, array2);
                                    if (method28939 != null) {
                                        method28939.method16876(true);
                                        list.add(method28939);
                                    }
                                    else {
                                        Class8571.method28848("[Shaders] Invalid option: " + str2 + ", key: " + str);
                                        list.add(null);
                                    }
                                }
                            }
                            else {
                                list.add(new Class5602("<rest>"));
                            }
                        }
                        else if (array != null) {
                            list.add(new Class5603(array, array2));
                        }
                        else {
                            Class8571.method28848("[Shaders] Option profile can not be used, no profiles defined: " + str2 + ", key: " + str);
                        }
                    }
                    else {
                        Class8571.method28848("[Shaders] Duplicate option: " + str2 + ", key: " + str);
                    }
                }
                else {
                    list.add(null);
                }
            }
            map.put(str, new Class9442(str, (Class5601[])list.toArray(new Class5601[list.size()]), Class8571.method28933(properties.getProperty(str + ".columns"), 2)));
            return true;
        }
        return false;
    }
    
    public static BufferedReader method23562(final BufferedReader bufferedReader, final String str, final Class7038 class7038, final int n, final List<String> list, final int n2) throws IOException {
        String substring = "/";
        final int lastIndex = str.lastIndexOf("/");
        if (lastIndex >= 0) {
            substring = str.substring(0, lastIndex);
        }
        final CharArrayWriter charArrayWriter = new CharArrayWriter();
        int offset = -1;
        final LinkedHashSet set = new LinkedHashSet();
        int n3 = 1;
        while (true) {
            String str2 = bufferedReader.readLine();
            if (str2 == null) {
                char[] array = charArrayWriter.toCharArray();
                if (offset >= 0) {
                    if (set.size() > 0) {
                        final StringBuilder sb = new StringBuilder();
                        for (final Class8573 class7039 : set) {
                            sb.append("#define ");
                            sb.append(class7039.method29024());
                            sb.append(" ");
                            sb.append(class7039.method29025());
                            sb.append("\n");
                        }
                        final String string = sb.toString();
                        final StringBuilder sb2 = new StringBuilder(new String(array));
                        sb2.insert(offset, string);
                        array = sb2.toString().toCharArray();
                    }
                }
                return new BufferedReader(new CharArrayReader(array));
            }
            if (offset < 0) {
                if (Class7528.field29889.matcher(str2).matches()) {
                    final String string2 = str2 + "\n" + (Class7677.method24372() + Class7677.method24373());
                    str2 = string2 + ("#line " + (n3 + 1) + " " + n);
                    offset = charArrayWriter.size() + string2.length();
                }
            }
            final Matcher matcher = Class7528.field29890.matcher(str2);
            if (matcher.matches()) {
                final String group = matcher.group(1);
                final String s = group.startsWith("/") ? ("/shaders" + group) : (substring + "/" + group);
                if (!list.contains(s)) {
                    list.add(s);
                }
                final int i = list.indexOf(s) + 1;
                String str3 = method23564(s, class7038, i, list, n2);
                if (str3 == null) {
                    throw new IOException("Included file not found: " + str);
                }
                if (str3.endsWith("\n")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                String string3 = "#line 1 " + i + "\n";
                if (str3.startsWith("#version ")) {
                    string3 = "";
                }
                str2 = string3 + str3 + "\n#line " + (n3 + 1) + " " + n;
            }
            if (offset >= 0) {
                if (str2.contains(Class7677.method24370())) {
                    final Class8573[] method23563 = method23563(str2, Class7677.method24371());
                    for (int j = 0; j < method23563.length; ++j) {
                        set.add(method23563[j]);
                    }
                }
            }
            if (Class9216.method33923()) {
                final String replace = str2.replace("gl_TextureMatrix[1]", "gl_TextureMatrix[2]").replace("gl_MultiTexCoord1", "gl_MultiTexCoord2");
                if (!replace.equals(str2)) {
                    str2 = replace + " // Legacy fix, replaced TU 1 with 2";
                }
            }
            charArrayWriter.write(str2);
            charArrayWriter.write("\n");
            ++n3;
        }
    }
    
    private static Class8573[] method23563(final String s, final Class8573[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            final Class8573 class8573 = array[i];
            if (s.contains(class8573.method29024())) {
                list.add(class8573);
            }
        }
        return (Class8573[])list.toArray(new Class8573[list.size()]);
    }
    
    private static String method23564(final String str, final Class7038 class7038, final int n, final List<String> list, int i) throws IOException {
        if (i >= 10) {
            throw new IOException("#include depth exceeded: " + i + ", file: " + str);
        }
        ++i;
        final InputStream method21531 = class7038.method21531(str);
        if (method21531 != null) {
            final BufferedReader method21532 = method23562(new BufferedReader(new InputStreamReader(method21531, "ASCII")), str, class7038, n, list, i);
            final CharArrayWriter charArrayWriter = new CharArrayWriter();
            while (true) {
                final String line = method21532.readLine();
                if (line == null) {
                    break;
                }
                charArrayWriter.write(line);
                charArrayWriter.write("\n");
            }
            return charArrayWriter.toString();
        }
        return null;
    }
    
    public static Class6891 method23565(final Properties properties) {
        final String s = "uniform";
        final String anObject = "variable";
        new StringBuilder().append(s).append(".").toString();
        new StringBuilder().append(anObject).append(".").toString();
        final HashMap hashMap = new HashMap();
        final ArrayList list = new ArrayList();
        for (final String key : properties.keySet()) {
            final String[] method28937 = Class8571.method28937(key, ".");
            if (method28937.length != 3) {
                continue;
            }
            final String str = method28937[0];
            final String s2 = method28937[1];
            final String s3 = method28937[2];
            final String trim = properties.getProperty(key).trim();
            if (!hashMap.containsKey(s3)) {
                if (!str.equals(s) && !str.equals(anObject)) {
                    continue;
                }
                Class8885.method31272("Custom " + str + ": " + s3);
                final Class8541 method28938 = method23566(str, s3, s2, trim, hashMap);
                if (method28938 == null) {
                    continue;
                }
                hashMap.put(s3, method28938.method28654());
                if (str.equals(anObject)) {
                    continue;
                }
                list.add(method28938);
            }
            else {
                Class8885.method31271("Expression already defined: " + s3);
            }
        }
        if (list.size() > 0) {
            return new Class6891((Class8541[])list.toArray(new Class8541[list.size()]), hashMap);
        }
        return null;
    }
    
    private static Class8541 method23566(final String str, final String str2, final String s, final String s2, final Map<String, Class327> map) {
        try {
            final Class2114 method8250 = Class2114.method8250(s);
            if (method8250 == null) {
                Class8885.method31271("Unknown " + str + " type: " + method8250);
                return null;
            }
            final Class327 method8251 = new Class7186(new Class5107(map)).method22032(s2);
            final Class2212 method8252 = method8251.method1008();
            if (!method8250.method8249(method8252)) {
                Class8885.method31271("Expression type does not match " + str + " type, expression: " + method8252 + ", " + str + ": " + method8250 + " " + str2);
                return null;
            }
            return new Class8541(str2, method8250, method23567(method8251));
        }
        catch (final Class2327 class2327) {
            Class8885.method31271(class2327.getClass().getName() + ": " + class2327.getMessage());
            return null;
        }
    }
    
    private static Class327 method23567(final Class327 class327) {
        if (!(class327 instanceof Class328)) {
            return (class327 instanceof Class335) ? new Class334((Class335)class327) : class327;
        }
        return new Class332((Class328)class327);
    }
    
    public static void method23568(final Properties properties) {
        for (final String key : properties.keySet()) {
            final String[] method28937 = Class8571.method28937(key, ".");
            if (method28937.length != 2) {
                continue;
            }
            final String s = method28937[0];
            final String str = method28937[1];
            if (!s.equals("alphaTest")) {
                continue;
            }
            final Class9023 method28938 = Class9216.method33900(str);
            if (method28938 != null) {
                final Class6684 method28939 = method23569(properties.getProperty(key).trim());
                if (method28939 == null) {
                    continue;
                }
                method28938.method32347(method28939);
            }
            else {
                Class8885.method31270("Invalid program name: " + str);
            }
        }
    }
    
    private static Class6684 method23569(final String str) {
        final String[] method28937 = Class8571.method28937(str, " ");
        if (method28937.length != 1) {
            if (method28937.length == 2) {
                final String s = method28937[0];
                final String s2 = method28937[1];
                final Integer n = Class7528.field29892.get(s);
                final float method28938 = Class8571.method28934(s2, -1.0f);
                if (n != null) {
                    if (method28938 >= 0.0f) {
                        return new Class6684(true, n, method28938);
                    }
                }
            }
        }
        else {
            final String s3 = method28937[0];
            if (s3.equals("off") || s3.equals("false")) {
                return new Class6684(false);
            }
        }
        Class8885.method31270("Invalid alpha test: " + str);
        return null;
    }
    
    public static void method23570(final Properties properties) {
        for (final String key : properties.keySet()) {
            final String[] method28937 = Class8571.method28937(key, ".");
            if (method28937.length != 2) {
                continue;
            }
            final String s = method28937[0];
            final String str = method28937[1];
            if (!s.equals("blend")) {
                continue;
            }
            final Class9023 method28938 = Class9216.method33900(str);
            if (method28938 != null) {
                final Class9075 method28939 = method23571(properties.getProperty(key).trim());
                if (method28939 == null) {
                    continue;
                }
                method28938.method32348(method28939);
            }
            else {
                Class8885.method31270("Invalid program name: " + str);
            }
        }
    }
    
    private static Class9075 method23571(final String str) {
        final String[] method28937 = Class8571.method28937(str, " ");
        if (method28937.length != 1) {
            if (method28937.length == 2 || method28937.length == 4) {
                final String s = method28937[0];
                final String s2 = method28937[1];
                String s3 = s;
                String s4 = s2;
                if (method28937.length == 4) {
                    s3 = method28937[2];
                    s4 = method28937[3];
                }
                final Integer n = Class7528.field29893.get(s);
                final Integer n2 = Class7528.field29893.get(s2);
                final Integer n3 = Class7528.field29893.get(s3);
                final Integer n4 = Class7528.field29893.get(s4);
                if (n != null) {
                    if (n2 != null) {
                        if (n3 != null) {
                            if (n4 != null) {
                                return new Class9075(true, n, n2, n3, n4);
                            }
                        }
                    }
                }
            }
        }
        else {
            final String s5 = method28937[0];
            if (s5.equals("off") || s5.equals("false")) {
                return new Class9075(false);
            }
        }
        Class8885.method31270("Invalid blend mode: " + str);
        return null;
    }
    
    public static void method23572(final Properties properties) {
        for (final String key : properties.keySet()) {
            final String[] method28937 = Class8571.method28937(key, ".");
            if (method28937.length != 2) {
                continue;
            }
            final String s = method28937[0];
            final String str = method28937[1];
            if (!s.equals("scale")) {
                continue;
            }
            final Class9023 method28938 = Class9216.method33900(str);
            if (method28938 != null) {
                final Class9529 method28939 = method23573(properties.getProperty(key).trim());
                if (method28939 == null) {
                    continue;
                }
                method28938.method32349(method28939);
            }
            else {
                Class8885.method31270("Invalid program name: " + str);
            }
        }
    }
    
    private static Class9529 method23573(final String s) {
        final String[] method28937 = Class8571.method28937(s, " ");
        final float method28938 = Class8571.method28934(method28937[0], -1.0f);
        float method28939 = 0.0f;
        float method28940 = 0.0f;
        if (method28937.length > 1) {
            if (method28937.length != 3) {
                Class8885.method31270("Invalid render scale: " + s);
                return null;
            }
            method28939 = Class8571.method28934(method28937[1], -1.0f);
            method28940 = Class8571.method28934(method28937[2], -1.0f);
        }
        if (Class8571.method28930(method28938, 0.0f, 1.0f)) {
            if (Class8571.method28930(method28939, 0.0f, 1.0f)) {
                if (Class8571.method28930(method28940, 0.0f, 1.0f)) {
                    return new Class9529(method28938, method28939, method28940);
                }
            }
        }
        Class8885.method31270("Invalid render scale: " + s);
        return null;
    }
    
    public static void method23574(final Properties properties) {
        for (final String key : properties.keySet()) {
            final String[] method28937 = Class8571.method28937(key, ".");
            if (method28937.length != 3) {
                continue;
            }
            final String s = method28937[0];
            final String str = method28937[1];
            final String str2 = method28937[2];
            if (!s.equals("flip")) {
                continue;
            }
            final Class9023 method28938 = Class9216.method33900(str);
            if (method28938 != null) {
                final Boolean[] method28939 = method28938.method32339();
                final int method28940 = Class9216.method33783(str2);
                if (method28940 >= 0 && method28940 < method28939.length) {
                    final String trim = properties.getProperty(key).trim();
                    final Boolean method28941 = Class8571.method28936(trim, null);
                    if (method28941 != null) {
                        method28939[method28940] = method28941;
                    }
                    else {
                        Class8885.method31270("Invalid boolean value: " + trim);
                    }
                }
                else {
                    Class8885.method31270("Invalid buffer name: " + str2);
                }
            }
            else {
                Class8885.method31270("Invalid program name: " + str);
            }
        }
    }
    
    private static Map<String, Integer> method23575() {
        final HashMap m = new HashMap();
        m.put("NEVER", new Integer(512));
        m.put("LESS", new Integer(513));
        m.put("EQUAL", new Integer(514));
        m.put("LEQUAL", new Integer(515));
        m.put("GREATER", new Integer(516));
        m.put("NOTEQUAL", new Integer(517));
        m.put("GEQUAL", new Integer(518));
        m.put("ALWAYS", new Integer(519));
        return (Map<String, Integer>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private static Map<String, Integer> method23576() {
        final HashMap m = new HashMap();
        m.put("ZERO", new Integer(0));
        m.put("ONE", new Integer(1));
        m.put("SRC_COLOR", new Integer(768));
        m.put("ONE_MINUS_SRC_COLOR", new Integer(769));
        m.put("DST_COLOR", new Integer(774));
        m.put("ONE_MINUS_DST_COLOR", new Integer(775));
        m.put("SRC_ALPHA", new Integer(770));
        m.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
        m.put("DST_ALPHA", new Integer(772));
        m.put("ONE_MINUS_DST_ALPHA", new Integer(773));
        m.put("CONSTANT_COLOR", new Integer(32769));
        m.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
        m.put("CONSTANT_ALPHA", new Integer(32771));
        m.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
        m.put("SRC_ALPHA_SATURATE", new Integer(776));
        return (Map<String, Integer>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    static {
        field29889 = Pattern.compile("^\\s*#version\\s+.*$");
        field29890 = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
        field29891 = method23554();
        field29892 = method23575();
        field29893 = method23576();
    }
}

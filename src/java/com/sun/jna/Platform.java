// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;

public final class Platform
{
    public static final int UNSPECIFIED = -1;
    public static final int MAC = 0;
    public static final int LINUX = 1;
    public static final int WINDOWS = 2;
    public static final int SOLARIS = 3;
    public static final int FREEBSD = 4;
    public static final int OPENBSD = 5;
    public static final int WINDOWSCE = 6;
    public static final int AIX = 7;
    public static final int ANDROID = 8;
    public static final int GNU = 9;
    public static final int KFREEBSD = 10;
    public static final int NETBSD = 11;
    public static final boolean RO_FIELDS;
    public static final boolean HAS_BUFFERS;
    public static final boolean HAS_AWT;
    public static final boolean HAS_JAWT;
    public static final String MATH_LIBRARY_NAME;
    public static final String C_LIBRARY_NAME;
    public static final boolean HAS_DLL_CALLBACKS;
    public static final String RESOURCE_PREFIX;
    private static final int osType;
    public static final String ARCH;
    
    private Platform() {
    }
    
    public static final int getOSType() {
        return Platform.osType;
    }
    
    public static final boolean isMac() {
        return Platform.osType == 0;
    }
    
    public static final boolean isAndroid() {
        return Platform.osType == 8;
    }
    
    public static final boolean isLinux() {
        return Platform.osType == 1;
    }
    
    public static final boolean isAIX() {
        return Platform.osType == 7;
    }
    
    @Deprecated
    public static final boolean isAix() {
        return isAIX();
    }
    
    public static final boolean isWindowsCE() {
        return Platform.osType == 6;
    }
    
    public static final boolean isWindows() {
        return Platform.osType == 2 || Platform.osType == 6;
    }
    
    public static final boolean isSolaris() {
        return Platform.osType == 3;
    }
    
    public static final boolean isFreeBSD() {
        return Platform.osType == 4;
    }
    
    public static final boolean isOpenBSD() {
        return Platform.osType == 5;
    }
    
    public static final boolean isNetBSD() {
        return Platform.osType == 11;
    }
    
    public static final boolean isGNU() {
        return Platform.osType == 9;
    }
    
    public static final boolean iskFreeBSD() {
        return Platform.osType == 10;
    }
    
    public static final boolean isX11() {
        return !isWindows() && !isMac();
    }
    
    public static final boolean hasRuntimeExec() {
        return !isWindowsCE() || !"J9".equals(System.getProperty("java.vm.name"));
    }
    
    public static final boolean is64Bit() {
        final String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        return "x86-64".equals(Platform.ARCH) || "ia64".equals(Platform.ARCH) || "ppc64".equals(Platform.ARCH) || "ppc64le".equals(Platform.ARCH) || "sparcv9".equals(Platform.ARCH) || "amd64".equals(Platform.ARCH) || Native.POINTER_SIZE == 8;
    }
    
    public static final boolean isIntel() {
        return Platform.ARCH.startsWith("x86");
    }
    
    public static final boolean isPPC() {
        return Platform.ARCH.startsWith("ppc");
    }
    
    public static final boolean isARM() {
        return Platform.ARCH.startsWith("arm");
    }
    
    public static final boolean isSPARC() {
        return Platform.ARCH.startsWith("sparc");
    }
    
    public static String getCanonicalArchitecture(String arch, final boolean softfloat) {
        arch = arch.toLowerCase().trim();
        if ("powerpc".equals(arch)) {
            arch = "ppc";
        }
        else if ("powerpc64".equals(arch)) {
            arch = "ppc64";
        }
        else if ("i386".equals(arch) || "i686".equals(arch)) {
            arch = "x86";
        }
        else if ("x86_64".equals(arch) || "amd64".equals(arch)) {
            arch = "x86-64";
        }
        if ("ppc64".equals(arch) && "little".equals(System.getProperty("sun.cpu.endian"))) {
            arch = "ppc64le";
        }
        if ("arm".equals(arch) && softfloat) {
            arch = "armel";
        }
        return arch;
    }
    
    private static boolean isSoftFloat() {
        try {
            return ELFAnalyser.analyse(new File("/proc/self/exe").getCanonicalPath()).isArmSoftFloat();
        }
        catch (final IOException thrown) {
            Logger.getLogger(Platform.class.getName()).log(Level.FINE, null, thrown);
            return false;
        }
    }
    
    public static String getNativeLibraryResourcePrefix() {
        final String property = System.getProperty("jna.prefix");
        if (property != null) {
            return property;
        }
        return getNativeLibraryResourcePrefix(getOSType(), System.getProperty("os.arch"), System.getProperty("os.name"));
    }
    
    public static String getNativeLibraryResourcePrefix(final int osType, final String arch, final String name) {
        return getNativeLibraryResourcePrefix(osType, arch, name, isSoftFloat());
    }
    
    public static String getNativeLibraryResourcePrefix(final int osType, final String arch, final String name, final boolean isSoftfloat) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_3         /* isSoftfloat */
        //     2: invokestatic    com/sun/jna/Platform.getCanonicalArchitecture:(Ljava/lang/String;Z)Ljava/lang/String;
        //     5: astore_1        /* arch */
        //     6: iload_0         /* osType */
        //     7: tableswitch {
        //                0: 152
        //                1: 159
        //                2: 104
        //                3: 184
        //                4: 209
        //                5: 234
        //                6: 128
        //                7: 309
        //                8: 68
        //                9: 309
        //               10: 284
        //               11: 259
        //          default: 309
        //        }
        //    68: aload_1         /* arch */
        //    69: ldc             "arm"
        //    71: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    74: ifeq            80
        //    77: ldc             "arm"
        //    79: astore_1        /* arch */
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: ldc             "android-"
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: aload_1         /* arch */
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    99: astore          6
        //   101: goto            368
        //   104: new             Ljava/lang/StringBuilder;
        //   107: dup            
        //   108: invokespecial   java/lang/StringBuilder.<init>:()V
        //   111: ldc             "win32-"
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   116: aload_1         /* arch */
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   123: astore          6
        //   125: goto            368
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: invokespecial   java/lang/StringBuilder.<init>:()V
        //   135: ldc             "w32ce-"
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload_1         /* arch */
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: astore          6
        //   149: goto            368
        //   152: ldc             "darwin"
        //   154: astore          6
        //   156: goto            368
        //   159: new             Ljava/lang/StringBuilder;
        //   162: dup            
        //   163: invokespecial   java/lang/StringBuilder.<init>:()V
        //   166: ldc_w           "linux-"
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: aload_1         /* arch */
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   179: astore          6
        //   181: goto            368
        //   184: new             Ljava/lang/StringBuilder;
        //   187: dup            
        //   188: invokespecial   java/lang/StringBuilder.<init>:()V
        //   191: ldc_w           "sunos-"
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: aload_1         /* arch */
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   204: astore          6
        //   206: goto            368
        //   209: new             Ljava/lang/StringBuilder;
        //   212: dup            
        //   213: invokespecial   java/lang/StringBuilder.<init>:()V
        //   216: ldc_w           "freebsd-"
        //   219: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: aload_1         /* arch */
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   229: astore          6
        //   231: goto            368
        //   234: new             Ljava/lang/StringBuilder;
        //   237: dup            
        //   238: invokespecial   java/lang/StringBuilder.<init>:()V
        //   241: ldc_w           "openbsd-"
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: aload_1         /* arch */
        //   248: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   251: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   254: astore          6
        //   256: goto            368
        //   259: new             Ljava/lang/StringBuilder;
        //   262: dup            
        //   263: invokespecial   java/lang/StringBuilder.<init>:()V
        //   266: ldc_w           "netbsd-"
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   272: aload_1         /* arch */
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   279: astore          6
        //   281: goto            368
        //   284: new             Ljava/lang/StringBuilder;
        //   287: dup            
        //   288: invokespecial   java/lang/StringBuilder.<init>:()V
        //   291: ldc_w           "kfreebsd-"
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: aload_1         /* arch */
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: astore          6
        //   306: goto            368
        //   309: aload_2         /* name */
        //   310: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   313: astore          6
        //   315: aload           6
        //   317: ldc_w           " "
        //   320: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   323: istore          7
        //   325: iload           7
        //   327: iconst_m1      
        //   328: if_icmpeq       341
        //   331: aload           space
        //   333: iconst_0       
        //   334: iload           7
        //   336: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   339: astore          space
        //   341: new             Ljava/lang/StringBuilder;
        //   344: dup            
        //   345: invokespecial   java/lang/StringBuilder.<init>:()V
        //   348: aload           space
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   353: ldc_w           "-"
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: aload_1         /* arch */
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   366: astore          space
        //   368: aload           space
        //   370: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2945)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        final String property = System.getProperty("os.name");
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
                osType = 8;
                System.setProperty("jna.nounpack", "true");
            }
            else {
                osType = 1;
            }
        }
        else if (property.startsWith("AIX")) {
            osType = 7;
        }
        else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            osType = 0;
        }
        else if (property.startsWith("Windows CE")) {
            osType = 6;
        }
        else if (property.startsWith("Windows")) {
            osType = 2;
        }
        else if (property.startsWith("Solaris") || property.startsWith("SunOS")) {
            osType = 3;
        }
        else if (property.startsWith("FreeBSD")) {
            osType = 4;
        }
        else if (property.startsWith("OpenBSD")) {
            osType = 5;
        }
        else if (property.equalsIgnoreCase("gnu")) {
            osType = 9;
        }
        else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
            osType = 10;
        }
        else if (property.equalsIgnoreCase("netbsd")) {
            osType = 11;
        }
        else {
            osType = -1;
        }
        boolean has_BUFFERS = false;
        try {
            Class.forName("java.nio.Buffer");
            has_BUFFERS = true;
        }
        catch (final ClassNotFoundException ex) {}
        HAS_AWT = (Platform.osType != 6 && Platform.osType != 8 && Platform.osType != 7);
        HAS_JAWT = (Platform.HAS_AWT && Platform.osType != 0);
        HAS_BUFFERS = has_BUFFERS;
        RO_FIELDS = (Platform.osType != 6);
        C_LIBRARY_NAME = ((Platform.osType == 2) ? "msvcrt" : ((Platform.osType == 6) ? "coredll" : "c"));
        MATH_LIBRARY_NAME = ((Platform.osType == 2) ? "msvcrt" : ((Platform.osType == 6) ? "coredll" : "m"));
        HAS_DLL_CALLBACKS = (Platform.osType == 2);
        ARCH = getCanonicalArchitecture(System.getProperty("os.arch"), isSoftFloat());
        RESOURCE_PREFIX = getNativeLibraryResourcePrefix();
    }
}

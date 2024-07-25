package com.sun.jna;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Platform {
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
      return osType;
   }

   public static final boolean isMac() {
      return osType == 0;
   }

   public static final boolean isAndroid() {
      return osType == 8;
   }

   public static final boolean isLinux() {
      return osType == 1;
   }

   public static final boolean isAIX() {
      return osType == 7;
   }

   /** @deprecated */
   public static final boolean isAix() {
      return isAIX();
   }

   public static final boolean isWindowsCE() {
      return osType == 6;
   }

   public static final boolean isWindows() {
      return osType == 2 || osType == 6;
   }

   public static final boolean isSolaris() {
      return osType == 3;
   }

   public static final boolean isFreeBSD() {
      return osType == 4;
   }

   public static final boolean isOpenBSD() {
      return osType == 5;
   }

   public static final boolean isNetBSD() {
      return osType == 11;
   }

   public static final boolean isGNU() {
      return osType == 9;
   }

   public static final boolean iskFreeBSD() {
      return osType == 10;
   }

   public static final boolean isX11() {
      return !isWindows() && !isMac();
   }

   public static final boolean hasRuntimeExec() {
      return !isWindowsCE() || !"J9".equals(System.getProperty("java.vm.name"));
   }

   public static final boolean is64Bit() {
      String var2 = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
      if (var2 != null) {
         return "64".equals(var2);
      } else {
         return !"x86-64".equals(ARCH)
               && !"ia64".equals(ARCH)
               && !"ppc64".equals(ARCH)
               && !"ppc64le".equals(ARCH)
               && !"sparcv9".equals(ARCH)
               && !"amd64".equals(ARCH)
            ? Native.POINTER_SIZE == 8
            : true;
      }
   }

   public static final boolean isIntel() {
      return ARCH.startsWith("x86");
   }

   public static final boolean isPPC() {
      return ARCH.startsWith("ppc");
   }

   public static final boolean isARM() {
      return ARCH.startsWith("arm");
   }

   public static final boolean isSPARC() {
      return ARCH.startsWith("sparc");
   }

   public static String getCanonicalArchitecture(String arch, boolean softfloat) {
      arch = arch.toLowerCase().trim();
      if ("powerpc".equals(arch)) {
         arch = "ppc";
      } else if ("powerpc64".equals(arch)) {
         arch = "ppc64";
      } else if ("i386".equals(arch) || "i686".equals(arch)) {
         arch = "x86";
      } else if ("x86_64".equals(arch) || "amd64".equals(arch)) {
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
         File ahfd = new File("/proc/self/exe");
         ELFAnalyser var3 = ELFAnalyser.analyse(ahfd.getCanonicalPath());
         return var3.isArmSoftFloat();
      } catch (IOException var4) {
         Logger.getLogger(Platform.class.getName()).log(Level.FINE, null, var4);
         return false;
      }
   }

   public static String getNativeLibraryResourcePrefix() {
      String var2 = System.getProperty("jna.prefix");
      return var2 != null ? var2 : getNativeLibraryResourcePrefix(getOSType(), System.getProperty("os.arch"), System.getProperty("os.name"));
   }

   public static String getNativeLibraryResourcePrefix(int osType, String arch, String name) {
      return getNativeLibraryResourcePrefix(osType, arch, name, isSoftFloat());
   }

   public static String getNativeLibraryResourcePrefix(int osType, String arch, String name, boolean isSoftfloat) {
      arch = getCanonicalArchitecture(arch, isSoftfloat);
      String space;
      switch (osType) {
         case 0:
            space = "darwin";
            break;
         case 1:
            space = "linux-" + arch;
            break;
         case 2:
            space = "win32-" + arch;
            break;
         case 3:
            space = "sunos-" + arch;
            break;
         case 4:
            space = "freebsd-" + arch;
            break;
         case 5:
            space = "openbsd-" + arch;
            break;
         case 6:
            space = "w32ce-" + arch;
            break;
         case 7:
         case 9:
         default:
            space = name.toLowerCase();
            int var7 = space.indexOf(" ");
            if (var7 != -1) {
               space = space.substring(0, var7);
            }

            space = space + "-" + arch;
            break;
         case 8:
            if (arch.startsWith("arm")) {
               arch = "arm";
            }

            space = "android-" + arch;
            break;
         case 10:
            space = "kfreebsd-" + arch;
            break;
         case 11:
            space = "netbsd-" + arch;
      }

      return space;
   }

   static {
      String hasBuffers = System.getProperty("os.name");
      if (hasBuffers.startsWith("Linux")) {
         if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
            osType = 8;
            System.setProperty("jna.nounpack", "true");
         } else {
            osType = 1;
         }
      } else if (hasBuffers.startsWith("AIX")) {
         osType = 7;
      } else if (hasBuffers.startsWith("Mac") || hasBuffers.startsWith("Darwin")) {
         osType = 0;
      } else if (hasBuffers.startsWith("Windows CE")) {
         osType = 6;
      } else if (hasBuffers.startsWith("Windows")) {
         osType = 2;
      } else if (hasBuffers.startsWith("Solaris") || hasBuffers.startsWith("SunOS")) {
         osType = 3;
      } else if (hasBuffers.startsWith("FreeBSD")) {
         osType = 4;
      } else if (hasBuffers.startsWith("OpenBSD")) {
         osType = 5;
      } else if (hasBuffers.equalsIgnoreCase("gnu")) {
         osType = 9;
      } else if (hasBuffers.equalsIgnoreCase("gnu/kfreebsd")) {
         osType = 10;
      } else if (hasBuffers.equalsIgnoreCase("netbsd")) {
         osType = 11;
      } else {
         osType = -1;
      }

      boolean var3 = false;

      try {
         Class.forName("java.nio.Buffer");
         var3 = true;
      } catch (ClassNotFoundException var5) {
      }

      HAS_AWT = osType != 6 && osType != 8 && osType != 7;
      HAS_JAWT = HAS_AWT && osType != 0;
      HAS_BUFFERS = var3;
      RO_FIELDS = osType != 6;
      C_LIBRARY_NAME = osType == 2 ? "msvcrt" : (osType == 6 ? "coredll" : "c");
      MATH_LIBRARY_NAME = osType == 2 ? "msvcrt" : (osType == 6 ? "coredll" : "m");
      HAS_DLL_CALLBACKS = osType == 2;
      ARCH = getCanonicalArchitecture(System.getProperty("os.arch"), isSoftFloat());
      RESOURCE_PREFIX = getNativeLibraryResourcePrefix();
   }
}

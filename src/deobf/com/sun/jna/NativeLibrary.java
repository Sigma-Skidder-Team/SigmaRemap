package com.sun.jna;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class NativeLibrary {
   private long handle;
   private final String libraryName;
   private final String libraryPath;
   private final Map<String, Function> functions = new HashMap<String, Function>();
   public final int callFlags;
   private String encoding;
   public final Map<String, ?> options;
   private static final Map<String, Reference<NativeLibrary>> libraries = new HashMap<String, Reference<NativeLibrary>>();
   private static final Map<String, List<String>> searchPaths = Collections.<String, List<String>>synchronizedMap(new HashMap<String, List<String>>());
   private static final List<String> librarySearchPath = new ArrayList<String>();
   private static final int DEFAULT_OPEN_OPTIONS = -1;

   private static String functionKey(String name, int flags, String encoding) {
      return name + "|" + flags + "|" + encoding;
   }

   private NativeLibrary(String libraryName, String libraryPath, long handle, Map<String, ?> options) {
      this.libraryName = this.getLibraryName(libraryName);
      this.libraryPath = libraryPath;
      this.handle = handle;
      Object callingConvention = options.get("calling-convention");
      int var9 = callingConvention instanceof Number ? ((Number)callingConvention).intValue() : 0;
      this.callFlags = var9;
      this.options = options;
      this.encoding = (String)options.get("string-encoding");
      if (this.encoding == null) {
         this.encoding = Native.getDefaultStringEncoding();
      }

      if (Platform.isWindows() && "kernel32".equals(this.libraryName.toLowerCase())) {
         synchronized (this.functions) {
            NativeLibrary$1 var11 = new NativeLibrary$1(this, this, "GetLastError", 63, this.encoding);
            this.functions.put(functionKey("GetLastError", this.callFlags, this.encoding), var11);
         }
      }
   }

   private static int openFlags(Map<String, ?> options) {
      Object var3 = options.get("open-flags");
      return var3 instanceof Number ? ((Number)var3).intValue() : -1;
   }

   private static NativeLibrary loadLibrary(String libraryName, Map<String, ?> options) {
      if (Native.DEBUG_LOAD) {
         System.out.println("Looking for library '" + libraryName + "'");
      }

      boolean searchPath = new File(libraryName).isAbsolute();
      ArrayList openFlags = new ArrayList();
      int webstartPath = openFlags(options);
      String customPaths = Native.getWebStartLibraryPath(libraryName);
      if (customPaths != null) {
         if (Native.DEBUG_LOAD) {
            System.out.println("Adding web start path " + customPaths);
         }

         openFlags.add(customPaths);
      }

      List libraryPath = searchPaths.get(libraryName);
      if (libraryPath != null) {
         synchronized (libraryPath) {
            openFlags.addAll(0, libraryPath);
         }
      }

      if (Native.DEBUG_LOAD) {
         System.out.println("Adding paths from jna.library.path: " + System.getProperty("jna.library.path"));
      }

      openFlags.addAll(initPaths("jna.library.path"));
      String var9 = findLibraryPath(libraryName, openFlags);
      long var11 = 0L;

      try {
         if (Native.DEBUG_LOAD) {
            System.out.println("Trying " + var9);
         }

         var11 = Native.open(var9, webstartPath);
      } catch (UnsatisfiedLinkError var33) {
         if (Native.DEBUG_LOAD) {
            System.out.println("Adding system paths: " + librarySearchPath);
         }

         openFlags.addAll(librarySearchPath);
      }

      try {
         if (var11 == 0L) {
            var9 = findLibraryPath(libraryName, openFlags);
            if (Native.DEBUG_LOAD) {
               System.out.println("Trying " + var9);
            }

            var11 = Native.open(var9, webstartPath);
            if (var11 == 0L) {
               throw new UnsatisfiedLinkError("Failed to load library '" + libraryName + "'");
            }
         }
      } catch (UnsatisfiedLinkError var32) {
         UnsatisfiedLinkError e2 = var32;
         if (Platform.isAndroid()) {
            try {
               if (Native.DEBUG_LOAD) {
                  System.out.println("Preload (via System.loadLibrary) " + libraryName);
               }

               System.loadLibrary(libraryName);
               var11 = Native.open(var9, webstartPath);
            } catch (UnsatisfiedLinkError var28) {
               e2 = var28;
            }
         } else if (!Platform.isLinux() && !Platform.isFreeBSD()) {
            if (Platform.isMac() && !libraryName.endsWith(".dylib")) {
               if (Native.DEBUG_LOAD) {
                  System.out.println("Looking for matching frameworks");
               }

               var9 = matchFramework(libraryName);
               if (var9 != null) {
                  try {
                     if (Native.DEBUG_LOAD) {
                        System.out.println("Trying " + var9);
                     }

                     var11 = Native.open(var9, webstartPath);
                  } catch (UnsatisfiedLinkError var26) {
                     e2 = var26;
                  }
               }
            } else if (Platform.isWindows() && !searchPath) {
               if (Native.DEBUG_LOAD) {
                  System.out.println("Looking for lib- prefix");
               }

               var9 = findLibraryPath("lib" + libraryName, openFlags);
               if (var9 != null) {
                  if (Native.DEBUG_LOAD) {
                     System.out.println("Trying " + var9);
                  }

                  try {
                     var11 = Native.open(var9, webstartPath);
                  } catch (UnsatisfiedLinkError var25) {
                     e2 = var25;
                  }
               }
            }
         } else {
            if (Native.DEBUG_LOAD) {
               System.out.println("Looking for version variants");
            }

            var9 = matchLibrary(libraryName, openFlags);
            if (var9 != null) {
               if (Native.DEBUG_LOAD) {
                  System.out.println("Trying " + var9);
               }

               try {
                  var11 = Native.open(var9, webstartPath);
               } catch (UnsatisfiedLinkError var27) {
                  e2 = var27;
               }
            }
         }

         if (var11 == 0L) {
            try {
               File var14 = Native.extractFromResourcePath(libraryName, (ClassLoader)options.get("classloader"));

               try {
                  var11 = Native.open(var14.getAbsolutePath(), webstartPath);
                  var9 = var14.getAbsolutePath();
               } finally {
                  if (Native.isUnpacked(var14)) {
                     Native.deleteLibrary(var14);
                  }
               }
            } catch (IOException var31) {
               e2 = new UnsatisfiedLinkError(var31.getMessage());
            }
         }

         if (var11 == 0L) {
            throw new UnsatisfiedLinkError("Unable to load library '" + libraryName + "': " + e2.getMessage());
         }
      }

      if (Native.DEBUG_LOAD) {
         System.out.println("Found library '" + libraryName + "' at " + var9);
      }

      return new NativeLibrary(libraryName, var9, var11, options);
   }

   public static String matchFramework(String libraryName) {
      File PREFIXES = new File(libraryName);
      if (PREFIXES.isAbsolute()) {
         if (libraryName.indexOf(".framework") != -1 && PREFIXES.exists()) {
            return PREFIXES.getAbsolutePath();
         }

         PREFIXES = new File(new File(PREFIXES.getParentFile(), PREFIXES.getName() + ".framework"), PREFIXES.getName());
         if (PREFIXES.exists()) {
            return PREFIXES.getAbsolutePath();
         }
      } else {
         String[] suffix = new String[]{System.getProperty("user.home"), "", "/System"};
         String i = libraryName.indexOf(".framework") == -1 ? libraryName + ".framework/" + libraryName : libraryName;

         for (int libraryPath = 0; libraryPath < suffix.length; libraryPath++) {
            String var7 = suffix[libraryPath] + "/Library/Frameworks/" + i;
            if (new File(var7).exists()) {
               return var7;
            }
         }
      }

      return null;
   }

   private String getLibraryName(String libraryName) {
      String BASE = libraryName;
      String template = "---";
      String prefixEnd = mapSharedLibraryName("---");
      int suffix = prefixEnd.indexOf("---");
      if (suffix > 0 && libraryName.startsWith(prefixEnd.substring(0, suffix))) {
         BASE = libraryName.substring(suffix);
      }

      String suffixStart = prefixEnd.substring(suffix + "---".length());
      int var9 = BASE.indexOf(suffixStart);
      if (var9 != -1) {
         BASE = BASE.substring(0, var9);
      }

      return BASE;
   }

   public static final NativeLibrary getInstance(String libraryName) {
      return getInstance(libraryName, Collections.emptyMap());
   }

   public static final NativeLibrary getInstance(String libraryName, ClassLoader classLoader) {
      return getInstance(libraryName, Collections.<String, ClassLoader>singletonMap("classloader", classLoader));
   }

   public static final NativeLibrary getInstance(String libraryName, Map<String, ?> libraryOptions) {
      HashMap var4 = new HashMap(libraryOptions);
      if (var4.get("calling-convention") == null) {
         var4.put("calling-convention", 0);
      }

      if ((Platform.isLinux() || Platform.isFreeBSD() || Platform.isAIX()) && Platform.C_LIBRARY_NAME.equals(libraryName)) {
         libraryName = null;
      }

      synchronized (libraries) {
         Reference library = libraries.get(libraryName + var4);
         NativeLibrary file = library != null ? (NativeLibrary)library.get() : null;
         if (file == null) {
            if (libraryName == null) {
               file = new NativeLibrary("<process>", null, Native.open(null, openFlags(var4)), var4);
            } else {
               file = loadLibrary(libraryName, var4);
            }

            NativeLibrary var11 = new WeakReference<NativeLibrary>(file);
            libraries.put(file.getName() + var4, var11);
            File var8 = file.getFile();
            if (var8 != null) {
               libraries.put(var8.getAbsolutePath() + var4, var11);
               libraries.put(var8.getName() + var4, var11);
            }
         }

         return file;
      }
   }

   public static final synchronized NativeLibrary getProcess() {
      return getInstance(null);
   }

   public static final synchronized NativeLibrary getProcess(Map<String, ?> options) {
      return getInstance(null, options);
   }

   public static final void addSearchPath(String libraryName, String path) {
      synchronized (searchPaths) {
         List var5 = searchPaths.get(libraryName);
         if (var5 == null) {
            var5 = Collections.synchronizedList(new ArrayList());
            searchPaths.put(libraryName, var5);
         }

         var5.add(path);
      }
   }

   public Function getFunction(String functionName) {
      return this.getFunction(functionName, this.callFlags);
   }

   public Function getFunction(String name, Method method) {
      FunctionMapper prefix = (FunctionMapper)this.options.get("function-mapper");
      if (prefix != null) {
         name = prefix.getFunctionName(this, method);
      }

      String flags = System.getProperty("jna.profiler.prefix", "$$YJP$$");
      if (name.startsWith(flags)) {
         name = name.substring(flags.length());
      }

      int etypes = this.callFlags;
      Class[] i = method.getExceptionTypes();

      for (int var9 = 0; var9 < i.length; var9++) {
         if (LastErrorException.class.isAssignableFrom(i[var9])) {
            etypes |= 64;
         }
      }

      return this.getFunction(name, etypes);
   }

   public Function getFunction(String functionName, int callFlags) {
      return this.getFunction(functionName, callFlags, this.encoding);
   }

   public Function getFunction(String functionName, int callFlags, String encoding) {
      if (functionName == null) {
         throw new NullPointerException("Function name may not be null");
      } else {
         synchronized (this.functions) {
            String function = functionKey(functionName, callFlags, encoding);
            Function var8 = this.functions.get(function);
            if (var8 == null) {
               var8 = new Function(this, functionName, callFlags, encoding);
               this.functions.put(function, var8);
            }

            return var8;
         }
      }
   }

   public Map<String, ?> getOptions() {
      return this.options;
   }

   public Pointer getGlobalVariableAddress(String symbolName) {
      try {
         return new Pointer(this.getSymbolAddress(symbolName));
      } catch (UnsatisfiedLinkError var5) {
         throw new UnsatisfiedLinkError("Error looking up '" + symbolName + "': " + var5.getMessage());
      }
   }

   public long getSymbolAddress(String name) {
      if (this.handle == 0L) {
         throw new UnsatisfiedLinkError("Library has been unloaded");
      } else {
         return Native.findSymbol(this.handle, name);
      }
   }

   @Override
   public String toString() {
      return "Native Library <" + this.libraryPath + "@" + this.handle + ">";
   }

   public String getName() {
      return this.libraryName;
   }

   public File getFile() {
      return this.libraryPath == null ? null : new File(this.libraryPath);
   }

   @Override
   public void finalize() {
      this.dispose();
   }

   public static void disposeAll() {
      LinkedHashSet ref;
      synchronized (libraries) {
         ref = new LinkedHashSet<Reference<NativeLibrary>>(libraries.values());
      }

      for (Reference lib : ref) {
         NativeLibrary var5 = (NativeLibrary)lib.get();
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public void dispose() {
      HashSet var3 = new HashSet();
      synchronized (libraries) {
         for (Entry ref : libraries.entrySet()) {
            Reference var7 = (Reference)ref.getValue();
            if (var7.get() == this) {
               var3.add(ref.getKey());
            }
         }

         for (String var13 : var3) {
            libraries.remove(var13);
         }
      }

      synchronized (this) {
         if (this.handle != 0L) {
            Native.close(this.handle);
            this.handle = 0L;
         }
      }
   }

   private static List<String> initPaths(String key) {
      String st = System.getProperty(key, "");
      if ("".equals(st)) {
         return Collections.<String>emptyList();
      } else {
         StringTokenizer list = new StringTokenizer(st, File.pathSeparator);
         ArrayList path = new ArrayList();

         while (list.hasMoreTokens()) {
            String var6 = list.nextToken();
            if (!"".equals(var6)) {
               path.add(var6);
            }
         }

         return path;
      }
   }

   private static String findLibraryPath(String libName, List<String> searchPath) {
      if (new File(libName).isAbsolute()) {
         return libName;
      } else {
         String var4 = mapSharedLibraryName(libName);

         for (String file : searchPath) {
            File var7 = new File(file, var4);
            if (var7.exists()) {
               return var7.getAbsolutePath();
            }

            if (Platform.isMac() && var4.endsWith(".dylib")) {
               var7 = new File(file, var4.substring(0, var4.lastIndexOf(".dylib")) + ".jnilib");
               if (var7.exists()) {
                  return var7.getAbsolutePath();
               }
            }
         }

         return var4;
      }
   }

   public static String mapSharedLibraryName(String libName) {
      if (Platform.isMac()) {
         if (!libName.startsWith("lib") || !libName.endsWith(".dylib") && !libName.endsWith(".jnilib")) {
            String var3 = System.mapLibraryName(libName);
            return var3.endsWith(".jnilib") ? var3.substring(0, var3.lastIndexOf(".jnilib")) + ".dylib" : var3;
         } else {
            return libName;
         }
      } else {
         if (!Platform.isLinux() && !Platform.isFreeBSD()) {
            if (Platform.isAIX()) {
               if (libName.startsWith("lib")) {
                  return libName;
               }
            } else if (Platform.isWindows() && (libName.endsWith(".drv") || libName.endsWith(".dll"))) {
               return libName;
            }
         } else if (isVersionedName(libName) || libName.endsWith(".so")) {
            return libName;
         }

         return System.mapLibraryName(libName);
      }
   }

   private static boolean isVersionedName(String name) {
      if (name.startsWith("lib")) {
         int i = name.lastIndexOf(".so.");
         if (i != -1 && i + 4 < name.length()) {
            for (int ch = i + 4; ch < name.length(); ch++) {
               char var5 = name.charAt(ch);
               if (!Character.isDigit(var5) && var5 != '.') {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   public static String matchLibrary(String libName, List<String> searchPath) {
      File filter = new File(libName);
      if (filter.isAbsolute()) {
         searchPath = Arrays.<String>asList(filter.getParent());
      }

      NativeLibrary$2 matches = new NativeLibrary$2(libName);
      LinkedList var6 = new LinkedList();

      for (String bestMatch : searchPath) {
         File[] bestVersion = new File(bestMatch).listFiles(matches);
         if (bestVersion != null && bestVersion.length > 0) {
            var6.addAll(Arrays.asList(bestVersion));
         }
      }

      double var10 = -1.0;
      double var18 = null;

      for (File path : var6) {
         String ver = path.getAbsolutePath();
         String version = ver.substring(ver.lastIndexOf(".so.") + 4);
         double var16 = parseVersion(version);
         if (var16 > var10) {
            var10 = var16;
            var18 = ver;
         }
      }

      return var18;
   }

   public static double parseVersion(String ver) {
      double var3 = 0.0;
      double var5 = 1.0;

      for (int num = ver.indexOf("."); ver != null; var5 *= 100.0) {
         String e;
         if (num != -1) {
            e = ver.substring(0, num);
            ver = ver.substring(num + 1);
            num = ver.indexOf(".");
         } else {
            e = ver;
            ver = null;
         }

         try {
            var3 += (double)Integer.parseInt(e) / var5;
         } catch (NumberFormatException var10) {
            return 0.0;
         }
      }

      return var3;
   }

   private static String getMultiArchPath() {
      String kernel = Platform.ARCH;
      String libc = Platform.iskFreeBSD() ? "-kfreebsd" : (Platform.isGNU() ? "" : "-linux");
      String var4 = "-gnu";
      if (Platform.isIntel()) {
         kernel = Platform.is64Bit() ? "x86_64" : "i386";
      } else if (Platform.isPPC()) {
         kernel = Platform.is64Bit() ? "powerpc64" : "powerpc";
      } else if (Platform.isARM()) {
         kernel = "arm";
         var4 = "-gnueabi";
      }

      return kernel + libc + var4;
   }

   private static ArrayList<String> getLinuxLdPaths() {
      ArrayList process = new ArrayList();

      try {
         Process reader = Runtime.getRuntime().exec("/sbin/ldconfig -p");
         BufferedReader buffer = new BufferedReader(new InputStreamReader(reader.getInputStream()));
         String startPath = "";

         while ((startPath = buffer.readLine()) != null) {
            int endPath = startPath.indexOf(" => ");
            int path = startPath.lastIndexOf(47);
            if (endPath != -1 && path != -1 && endPath < path) {
               String var8 = startPath.substring(endPath + 4, path);
               if (!process.contains(var8)) {
                  process.add(var8);
               }
            }
         }

         buffer.close();
      } catch (Exception var9) {
      }

      return process;
   }

   static {
      if (Native.POINTER_SIZE == 0) {
         throw new Error("Native library not initialized");
      } else {
         String platformPath = Native.getWebStartLibraryPath("jnidispatch");
         if (platformPath != null) {
            librarySearchPath.add(platformPath);
         }

         if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
            String sep = "";
            String archPath = "";
            String paths = "";
            if (Platform.isLinux() || Platform.isSolaris() || Platform.isFreeBSD() || Platform.iskFreeBSD()) {
               paths = (Platform.isSolaris() ? "/" : "") + Pointer.SIZE * 8;
            }

            String[] i = new String[]{"/usr/lib" + paths, "/lib" + paths, "/usr/lib", "/lib"};
            if (Platform.isLinux() || Platform.iskFreeBSD() || Platform.isGNU()) {
               String dir = getMultiArchPath();
               i = new String[]{"/usr/lib/" + dir, "/lib/" + dir, "/usr/lib" + paths, "/lib" + paths, "/usr/lib", "/lib"};
            }

            if (Platform.isLinux()) {
               ArrayList var10 = getLinuxLdPaths();

               for (int found = i.length - 1; 0 <= found; found--) {
                  int var9 = var10.indexOf(i[found]);
                  if (var9 != -1) {
                     var10.remove(var9);
                  }

                  var10.add(0, i[found]);
               }

               i = var10.<String>toArray(new String[var10.size()]);
            }

            for (int var11 = 0; var11 < i.length; var11++) {
               File var12 = new File(i[var11]);
               if (var12.exists() && var12.isDirectory()) {
                  sep = sep + archPath + i[var11];
                  archPath = File.pathSeparator;
               }
            }

            if (!"".equals(sep)) {
               System.setProperty("jna.platform.library.path", sep);
            }
         }

         librarySearchPath.addAll(initPaths("jna.platform.library.path"));
      }
   }
}

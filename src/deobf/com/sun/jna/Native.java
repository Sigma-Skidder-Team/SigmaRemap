package com.sun.jna;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public final class Native implements Version {
   public static final String DEFAULT_ENCODING = Charset.defaultCharset().name();
   public static boolean DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
   public static boolean DEBUG_JNA_LOAD = Boolean.getBoolean("jna.debug_load.jna");
   public static String jnidispatchPath = null;
   private static final Map<Class<?>, Map<String, Object>> typeOptions = new WeakHashMap<Class<?>, Map<String, Object>>();
   private static final Map<Class<?>, Reference<?>> libraries = new WeakHashMap<Class<?>, Reference<?>>();
   private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
   private static final Callback$class_5 DEFAULT_HANDLER = new Native$1();
   private static Callback$class_5 callbackExceptionHandler = DEFAULT_HANDLER;
   public static final int POINTER_SIZE;
   public static final int LONG_SIZE;
   public static final int WCHAR_SIZE;
   public static final int SIZE_T_SIZE;
   public static final int BOOL_SIZE;
   private static final int TYPE_VOIDP = 0;
   private static final int TYPE_LONG = 1;
   private static final int TYPE_WCHAR_T = 2;
   private static final int TYPE_SIZE_T = 3;
   private static final int TYPE_BOOL = 4;
   public static final int MAX_ALIGNMENT;
   public static final int MAX_PADDING;
   private static final Object finalizer;
   public static final String JNA_TMPLIB_PREFIX = "jna";
   private static Map<Class<?>, long[]> registeredClasses;
   private static Map<Class<?>, NativeLibrary> registeredLibraries;
   public static final int CB_HAS_INITIALIZER = 1;
   private static final int CVT_UNSUPPORTED = -1;
   private static final int CVT_DEFAULT = 0;
   private static final int CVT_POINTER = 1;
   private static final int CVT_STRING = 2;
   private static final int CVT_STRUCTURE = 3;
   private static final int CVT_STRUCTURE_BYVAL = 4;
   private static final int CVT_BUFFER = 5;
   private static final int CVT_ARRAY_BYTE = 6;
   private static final int CVT_ARRAY_SHORT = 7;
   private static final int CVT_ARRAY_CHAR = 8;
   private static final int CVT_ARRAY_INT = 9;
   private static final int CVT_ARRAY_LONG = 10;
   private static final int CVT_ARRAY_FLOAT = 11;
   private static final int CVT_ARRAY_DOUBLE = 12;
   private static final int CVT_ARRAY_BOOLEAN = 13;
   private static final int CVT_BOOLEAN = 14;
   private static final int CVT_CALLBACK = 15;
   private static final int CVT_FLOAT = 16;
   private static final int CVT_NATIVE_MAPPED = 17;
   private static final int CVT_NATIVE_MAPPED_STRING = 18;
   private static final int CVT_NATIVE_MAPPED_WSTRING = 19;
   private static final int CVT_WSTRING = 20;
   private static final int CVT_INTEGER_TYPE = 21;
   private static final int CVT_POINTER_TYPE = 22;
   private static final int CVT_TYPE_MAPPER = 23;
   private static final int CVT_TYPE_MAPPER_STRING = 24;
   private static final int CVT_TYPE_MAPPER_WSTRING = 25;
   public static final int CB_OPTION_DIRECT = 1;
   public static final int CB_OPTION_IN_DLL = 2;
   private static final ThreadLocal<Memory> nativeThreadTerminationFlag;
   private static final Map<Thread, Pointer> nativeThreads;

   @Deprecated
   public static float parseVersion(String v) {
      return Float.parseFloat(v.substring(0, v.lastIndexOf(".")));
   }

   public static boolean isCompatibleVersion(String expectedVersion, String nativeVersion) {
      String[] nativeVersionParts = expectedVersion.split("\\.");
      String[] expectedMajor = nativeVersion.split("\\.");
      if (nativeVersionParts.length >= 3 && expectedMajor.length >= 3) {
         int nativeMajor = Integer.parseInt(nativeVersionParts[0]);
         int expectedMinor = Integer.parseInt(expectedMajor[0]);
         int nativeMinor = Integer.parseInt(nativeVersionParts[1]);
         int var9 = Integer.parseInt(expectedMajor[1]);
         return nativeMajor != expectedMinor ? false : nativeMinor <= var9;
      } else {
         return false;
      }
   }

   private static void dispose() {
      CallbackReference.disposeAll();
      Memory.disposeAll();
      NativeLibrary.disposeAll();
      unregisterAll();
      jnidispatchPath = null;
      System.setProperty("jna.loaded", "false");
   }

   public static boolean deleteLibrary(File lib) {
      if (lib.delete()) {
         return true;
      } else {
         markTemporaryFile(lib);
         return false;
      }
   }

   private Native() {
   }

   private static native void initIDs();

   public static synchronized native void setProtected(boolean var0);

   public static synchronized native boolean isProtected();

   @Deprecated
   public static void setPreserveLastError(boolean enable) {
   }

   @Deprecated
   public static boolean getPreserveLastError() {
      return true;
   }

   public static long getWindowID(Window w) throws HeadlessException {
      return Native$class_16.getWindowID(w);
   }

   public static long getComponentID(Component c) throws HeadlessException {
      return Native$class_16.getComponentID(c);
   }

   public static Pointer getWindowPointer(Window w) throws HeadlessException {
      return new Pointer(Native$class_16.getWindowID(w));
   }

   public static Pointer getComponentPointer(Component c) throws HeadlessException {
      return new Pointer(Native$class_16.getComponentID(c));
   }

   public static native long getWindowHandle0(Component var0);

   public static Pointer getDirectBufferPointer(Buffer b) {
      long var3 = _getDirectBufferPointer(b);
      return var3 == 0L ? null : new Pointer(var3);
   }

   private static native long _getDirectBufferPointer(Buffer var0);

   public static String toString(byte[] buf) {
      return toString(buf, getDefaultStringEncoding());
   }

   public static String toString(byte[] buf, String encoding) {
      int e = buf.length;

      for (int var5 = 0; var5 < e; var5++) {
         if (buf[var5] == 0) {
            e = var5;
            break;
         }
      }

      if (e == 0) {
         return "";
      } else {
         if (encoding != null) {
            try {
               return new String(buf, 0, e, encoding);
            } catch (UnsupportedEncodingException var6) {
               System.err.println("JNA Warning: Encoding '" + encoding + "' is unsupported");
            }
         }

         System.err.println("JNA Warning: Decoding with fallback " + System.getProperty("file.encoding"));
         return new String(buf, 0, e);
      }
   }

   public static String toString(char[] buf) {
      int index = buf.length;

      for (int var4 = 0; var4 < index; var4++) {
         if (buf[var4] == 0) {
            index = var4;
            break;
         }
      }

      return index == 0 ? "" : new String(buf, 0, index);
   }

   public static List<String> toStringList(char[] buf) {
      return toStringList(buf, 0, buf.length);
   }

   public static List<String> toStringList(char[] buf, int offset, int len) {
      ArrayList lastPos = new ArrayList();
      int maxPos = offset;
      int value = offset + len;

      for (int valuex = offset; valuex < value; valuex++) {
         if (buf[valuex] == 0) {
            if (maxPos == valuex) {
               return lastPos;
            }

            String var9 = new String(buf, maxPos, valuex - maxPos);
            lastPos.add(var9);
            maxPos = valuex + 1;
         }
      }

      if (maxPos < value) {
         String var10 = new String(buf, maxPos, value - maxPos);
         lastPos.add(var10);
      }

      return lastPos;
   }

   public static <T> T loadLibrary(Class<T> interfaceClass) {
      return loadLibrary(null, interfaceClass);
   }

   public static <T> T loadLibrary(Class<T> interfaceClass, Map<String, ?> options) {
      return loadLibrary(null, interfaceClass, options);
   }

   public static <T> T loadLibrary(String name, Class<T> interfaceClass) {
      return loadLibrary(name, interfaceClass, Collections.emptyMap());
   }

   public static <T> T loadLibrary(String name, Class<T> interfaceClass, Map<String, ?> options) {
      if (!Library.class.isAssignableFrom(interfaceClass)) {
         throw new IllegalArgumentException(
            "Interface (" + interfaceClass.getSimpleName() + ") of library=" + name + " does not extend " + Library.class.getSimpleName()
         );
      } else {
         Library$class_13 loader = new Library$class_13(name, interfaceClass, options);
         ClassLoader proxy = interfaceClass.getClassLoader();
         Object var7 = Proxy.newProxyInstance(proxy, new Class[]{interfaceClass}, loader);
         cacheOptions(interfaceClass, options, var7);
         return interfaceClass.cast(var7);
      }
   }

   private static void loadLibraryInstance(Class<?> cls) {
      synchronized (libraries) {
         if (cls != null && !libraries.containsKey(cls)) {
            try {
               Field[] i = cls.getFields();

               for (int field = 0; field < i.length; field++) {
                  Field var6 = i[field];
                  if (var6.getType() == cls && Modifier.isStatic(var6.getModifiers())) {
                     libraries.put(cls, new WeakReference<Object>(var6.get(null)));
                     break;
                  }
               }
            } catch (Exception var8) {
               throw new IllegalArgumentException("Could not access instance of " + cls + " (" + var8 + ")");
            }
         }
      }
   }

   public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
      if (cls == null) {
         return null;
      } else {
         synchronized (libraries) {
            if (typeOptions.containsKey(cls)) {
               Map var9 = typeOptions.get(cls);
               Class var5 = (Class)var9.get("enclosing-library");
               if (var5 != null) {
                  return var5;
               }

               return cls;
            }
         }

         if (Library.class.isAssignableFrom(cls)) {
            return cls;
         } else {
            if (Callback.class.isAssignableFrom(cls)) {
               cls = CallbackReference.findCallbackClass(cls);
            }

            Class var8 = cls.getDeclaringClass();
            Class enclosingClass = findEnclosingLibraryClass(var8);
            return enclosingClass != null ? enclosingClass : findEnclosingLibraryClass(cls.getSuperclass());
         }
      }
   }

   public static Map<String, Object> getLibraryOptions(Class<?> type) {
      synchronized (libraries) {
         Map var4 = typeOptions.get(type);
         if (var4 != null) {
            return var4;
         }
      }

      Map<String, Object> var12 = findEnclosingLibraryClass(type);
      if (var12 != null) {
         loadLibraryInstance(var12);
      } else {
         var12 = type;
      }

      synchronized (libraries) {
         Map var13 = typeOptions.get(var12);
         if (var13 != null) {
            typeOptions.put(type, var13);
            return var13;
         } else {
            try {
               Field var6 = var12.getField("OPTIONS");
               var6.setAccessible(true);
               var13 = (Map)var6.get(null);
               if (var13 == null) {
                  throw new IllegalStateException("Null options field");
               }
            } catch (NoSuchFieldException var8) {
               var13 = Collections.emptyMap();
            } catch (Exception var9) {
               throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + var9 + "): " + var12);
            }

            HashMap var15 = new HashMap(var13);
            if (!var15.containsKey("type-mapper")) {
               var15.put("type-mapper", lookupField(var12, "TYPE_MAPPER", TypeMapper.class));
            }

            if (!var15.containsKey("structure-alignment")) {
               var15.put("structure-alignment", lookupField(var12, "STRUCTURE_ALIGNMENT", Integer.class));
            }

            if (!var15.containsKey("string-encoding")) {
               var15.put("string-encoding", lookupField(var12, "STRING_ENCODING", String.class));
            }

            var13 = cacheOptions(var12, var15, null);
            if (type != var12) {
               typeOptions.put(type, var13);
            }

            return var13;
         }
      }
   }

   private static Object lookupField(Class<?> mappingClass, String fieldName, Class<?> resultClass) {
      try {
         Field var5 = mappingClass.getField(fieldName);
         var5.setAccessible(true);
         return var5.get(null);
      } catch (NoSuchFieldException var6) {
         return null;
      } catch (Exception var7) {
         throw new IllegalArgumentException(fieldName + " must be a public field of type " + resultClass.getName() + " (" + var7 + "): " + mappingClass);
      }
   }

   public static TypeMapper getTypeMapper(Class<?> cls) {
      Map var3 = getLibraryOptions(cls);
      return (TypeMapper)var3.get("type-mapper");
   }

   public static String getStringEncoding(Class<?> cls) {
      Map encoding = getLibraryOptions(cls);
      String var4 = (String)encoding.get("string-encoding");
      return var4 != null ? var4 : getDefaultStringEncoding();
   }

   public static String getDefaultStringEncoding() {
      return System.getProperty("jna.encoding", DEFAULT_ENCODING);
   }

   public static int getStructureAlignment(Class<?> cls) {
      Integer var3 = (Integer)getLibraryOptions(cls).get("structure-alignment");
      return var3 == null ? 0 : var3;
   }

   public static byte[] getBytes(String s) {
      return getBytes(s, getDefaultStringEncoding());
   }

   public static byte[] getBytes(String s, String encoding) {
      if (encoding != null) {
         try {
            return s.getBytes(encoding);
         } catch (UnsupportedEncodingException var5) {
            System.err.println("JNA Warning: Encoding '" + encoding + "' is unsupported");
         }
      }

      System.err.println("JNA Warning: Encoding with fallback " + System.getProperty("file.encoding"));
      return s.getBytes();
   }

   public static byte[] toByteArray(String s) {
      return toByteArray(s, getDefaultStringEncoding());
   }

   public static byte[] toByteArray(String s, String encoding) {
      byte[] buf = getBytes(s, encoding);
      byte[] var5 = new byte[buf.length + 1];
      System.arraycopy(buf, 0, var5, 0, buf.length);
      return var5;
   }

   public static char[] toCharArray(String s) {
      char[] buf = s.toCharArray();
      char[] var4 = new char[buf.length + 1];
      System.arraycopy(buf, 0, var4, 0, buf.length);
      return var4;
   }

   private static void loadNativeDispatchLibrary() {
      if (!Boolean.getBoolean("jna.nounpack")) {
         try {
            removeTemporaryFiles();
         } catch (IOException var11) {
            System.err.println("JNA Warning: IOException removing temporary files: " + var11.getMessage());
         }
      }

      String bootPath = System.getProperty("jna.boot.library.name", "jnidispatch");
      String dirs = System.getProperty("jna.boot.library.path");
      if (dirs != null) {
         StringTokenizer dir = new StringTokenizer(dirs, File.pathSeparator);

         while (dir.hasMoreTokens()) {
            String file = dir.nextToken();
            File path = new File(new File(file), System.mapLibraryName(bootPath).replace(".dylib", ".jnilib"));
            String orig = path.getAbsolutePath();
            if (DEBUG_JNA_LOAD) {
               System.out.println("Looking in " + orig);
            }

            if (path.exists()) {
               try {
                  if (DEBUG_JNA_LOAD) {
                     System.out.println("Trying " + orig);
                  }

                  System.setProperty("jnidispatch.path", orig);
                  System.load(orig);
                  jnidispatchPath = orig;
                  if (DEBUG_JNA_LOAD) {
                     System.out.println("Found jnidispatch at " + orig);
                  }

                  return;
               } catch (UnsatisfiedLinkError var14) {
               }
            }

            if (Platform.isMac()) {
               String ext;
               String ex;
               if (orig.endsWith("dylib")) {
                  ext = "dylib";
                  ex = "jnilib";
               } else {
                  ext = "jnilib";
                  ex = "dylib";
               }

               orig = orig.substring(0, orig.lastIndexOf(ext)) + ex;
               if (DEBUG_JNA_LOAD) {
                  System.out.println("Looking in " + orig);
               }

               if (new File(orig).exists()) {
                  try {
                     if (DEBUG_JNA_LOAD) {
                        System.out.println("Trying " + orig);
                     }

                     System.setProperty("jnidispatch.path", orig);
                     System.load(orig);
                     jnidispatchPath = orig;
                     if (DEBUG_JNA_LOAD) {
                        System.out.println("Found jnidispatch at " + orig);
                     }

                     return;
                  } catch (UnsatisfiedLinkError var13) {
                     System.err.println("File found at " + orig + " but not loadable: " + var13.getMessage());
                  }
               }
            }
         }
      }

      if (!Boolean.getBoolean("jna.nosys")) {
         try {
            if (DEBUG_JNA_LOAD) {
               System.out.println("Trying (via loadLibrary) " + bootPath);
            }

            System.loadLibrary(bootPath);
            if (DEBUG_JNA_LOAD) {
               System.out.println("Found jnidispatch on system path");
            }

            return;
         } catch (UnsatisfiedLinkError var12) {
         }
      }

      if (!Boolean.getBoolean("jna.noclasspath")) {
         loadNativeDispatchLibraryFromClasspath();
      } else {
         throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
      }
   }

   private static void loadNativeDispatchLibraryFromClasspath() {
      try {
         String lib = "/com/sun/jna/" + Platform.RESOURCE_PREFIX + "/" + System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
         File var3 = extractFromResourcePath(lib, Native.class.getClassLoader());
         if (var3 == null && var3 == null) {
            throw new UnsatisfiedLinkError("Could not find JNA native support");
         } else {
            if (DEBUG_JNA_LOAD) {
               System.out.println("Trying " + var3.getAbsolutePath());
            }

            System.setProperty("jnidispatch.path", var3.getAbsolutePath());
            System.load(var3.getAbsolutePath());
            jnidispatchPath = var3.getAbsolutePath();
            if (DEBUG_JNA_LOAD) {
               System.out.println("Found jnidispatch at " + jnidispatchPath);
            }

            if (isUnpacked(var3) && !Boolean.getBoolean("jnidispatch.preserve")) {
               deleteLibrary(var3);
            }
         }
      } catch (IOException var4) {
         throw new UnsatisfiedLinkError(var4.getMessage());
      }
   }

   public static boolean isUnpacked(File file) {
      return file.getName().startsWith("jna");
   }

   public static File extractFromResourcePath(String name) throws IOException {
      return extractFromResourcePath(name, null);
   }

   public static File extractFromResourcePath(String name, ClassLoader loader) throws IOException {
      boolean libname = DEBUG_LOAD || DEBUG_JNA_LOAD && name.indexOf("jnidispatch") != -1;
      if (loader == null) {
         loader = Thread.currentThread().getContextClassLoader();
         if (loader == null) {
            loader = Native.class.getClassLoader();
         }
      }

      if (libname) {
         System.out.println("Looking in classpath from " + loader + " for " + name);
      }

      String resourcePath = name.startsWith("/") ? name : NativeLibrary.mapSharedLibraryName(name);
      String url = name.startsWith("/") ? name : Platform.RESOURCE_PREFIX + "/" + resourcePath;
      if (url.startsWith("/")) {
         url = url.substring(1);
      }

      URL lib = loader.getResource(url);
      if (lib == null && url.startsWith(Platform.RESOURCE_PREFIX)) {
         lib = loader.getResource(resourcePath);
      }

      if (lib == null) {
         String var28 = System.getProperty("java.class.path");
         if (loader instanceof URLClassLoader) {
            var28 = Arrays.<URL>asList(((URLClassLoader)loader).getURLs()).toString();
         }

         throw new IOException("Native library (" + url + ") not found in resource path (" + var28 + ")");
      } else {
         if (libname) {
            System.out.println("Found library resource at " + lib);
         }

         File is = null;
         if (lib.getProtocol().toLowerCase().equals("file")) {
            try {
               is = new File(new URI(lib.toString()));
            } catch (URISyntaxException var25) {
               is = new File(lib.getPath());
            }

            if (libname) {
               System.out.println("Looking in " + is.getAbsolutePath());
            }

            if (!is.exists()) {
               throw new IOException("File URL " + lib + " could not be properly decoded");
            }
         } else if (!Boolean.getBoolean("jna.nounpack")) {
            InputStream fos = loader.getResourceAsStream(url);
            if (fos == null) {
               throw new IOException("Can't obtain InputStream for " + url);
            }

            FileOutputStream e = null;

            try {
               File buf = getTempDir();
               is = File.createTempFile("jna", Platform.isWindows() ? ".dll" : null, buf);
               if (!Boolean.getBoolean("jnidispatch.preserve")) {
                  is.deleteOnExit();
               }

               e = new FileOutputStream(is);
               byte[] count = new byte[1024];

               int var13;
               while ((var13 = fos.read(count, 0, count.length)) > 0) {
                  e.write(count, 0, var13);
               }
            } catch (IOException var26) {
               throw new IOException("Failed to create temporary file for " + name + " library: " + var26.getMessage());
            } finally {
               try {
                  fos.close();
               } catch (IOException var24) {
               }

               if (e != null) {
                  try {
                     e.close();
                  } catch (IOException var23) {
                  }
               }
            }
         }

         return is;
      }
   }

   private static native int sizeof(int var0);

   private static native String getNativeVersion();

   private static native String getAPIChecksum();

   public static native int getLastError();

   public static native void setLastError(int var0);

   public static Library synchronizedLibrary(Library library) {
      Class ih = library.getClass();
      if (!Proxy.isProxyClass(ih)) {
         throw new IllegalArgumentException("Library must be a proxy class");
      } else {
         InvocationHandler handler = Proxy.getInvocationHandler(library);
         if (!(handler instanceof Library$class_13)) {
            throw new IllegalArgumentException("Unrecognized proxy handler: " + handler);
         } else {
            Library$class_13 newHandler = (Library$class_13)handler;
            Native$3 var6 = new Native$3(newHandler, library);
            return (Library)Proxy.newProxyInstance(ih.getClassLoader(), ih.getInterfaces(), var6);
         }
      }
   }

   public static String getWebStartLibraryPath(String libName) {
      if (System.getProperty("javawebstart.version") == null) {
         return null;
      } else {
         try {
            ClassLoader m = Native.class.getClassLoader();
            Method libpath = AccessController.<Method>doPrivileged(new Native$4());
            String var5 = (String)libpath.invoke(m, libName);
            return var5 != null ? new File(var5).getParent() : null;
         } catch (Exception var6) {
            return null;
         }
      }
   }

   public static void markTemporaryFile(File file) {
      try {
         File var3 = new File(file.getParentFile(), file.getName() + ".x");
         var3.createNewFile();
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   public static File getTempDir() throws IOException {
      String jnatmp = System.getProperty("jna.tmpdir");
      File tmp;
      if (jnatmp != null) {
         tmp = new File(jnatmp);
         tmp.mkdirs();
      } else {
         File var4 = new File(System.getProperty("java.io.tmpdir"));
         tmp = new File(var4, "jna-" + System.getProperty("user.name").hashCode());
         tmp.mkdirs();
         if (!tmp.exists() || !tmp.canWrite()) {
            tmp = var4;
         }
      }

      if (!tmp.exists()) {
         throw new IOException("JNA temporary directory '" + tmp + "' does not exist");
      } else if (!tmp.canWrite()) {
         throw new IOException("JNA temporary directory '" + tmp + "' is not writable");
      } else {
         return tmp;
      }
   }

   public static void removeTemporaryFiles() throws IOException {
      File filter = getTempDir();
      Native$5 files = new Native$5();
      File[] i = filter.listFiles(files);

      for (int marker = 0; i != null && marker < i.length; marker++) {
         File name = i[marker];
         String target = name.getName();
         target = target.substring(0, target.length() - 2);
         File var8 = new File(name.getParentFile(), target);
         if (!var8.exists() || var8.delete()) {
            name.delete();
         }
      }
   }

   public static int getNativeSize(Class<?> type, Object value) {
      if (type.isArray()) {
         int o = Array.getLength(value);
         if (o > 0) {
            Object var5 = Array.get(value, 0);
            return o * getNativeSize(type.getComponentType(), var5);
         } else {
            throw new IllegalArgumentException("Arrays of length zero not allowed: " + type);
         }
      } else if (Structure.class.isAssignableFrom(type) && !Structure$class_22.class.isAssignableFrom(type)) {
         return Structure.size(type, (Structure)value);
      } else {
         try {
            return getNativeSize(type);
         } catch (IllegalArgumentException var6) {
            throw new IllegalArgumentException("The type \"" + type.getName() + "\" is not supported: " + var6.getMessage());
         }
      }
   }

   public static int getNativeSize(Class<?> cls) {
      if (NativeMapped.class.isAssignableFrom(cls)) {
         cls = NativeMappedConverter.getInstance(cls).nativeType();
      }

      if (cls == boolean.class || cls == Boolean.class) {
         return 4;
      } else if (cls == byte.class || cls == Byte.class) {
         return 1;
      } else if (cls == short.class || cls == Short.class) {
         return 2;
      } else if (cls == char.class || cls == Character.class) {
         return WCHAR_SIZE;
      } else if (cls == int.class || cls == Integer.class) {
         return 4;
      } else if (cls == long.class || cls == Long.class) {
         return 8;
      } else if (cls == float.class || cls == Float.class) {
         return 4;
      } else if (cls == double.class || cls == Double.class) {
         return 8;
      } else if (Structure.class.isAssignableFrom(cls)) {
         return Structure$class_23.class.isAssignableFrom(cls) ? Structure.size(cls) : POINTER_SIZE;
      } else if (!Pointer.class.isAssignableFrom(cls)
         && (!Platform.HAS_BUFFERS || !Native$class_17.isBuffer(cls))
         && !Callback.class.isAssignableFrom(cls)
         && String.class != cls
         && WString.class != cls) {
         throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
      } else {
         return POINTER_SIZE;
      }
   }

   public static boolean isSupportedNativeType(Class<?> cls) {
      if (Structure.class.isAssignableFrom(cls)) {
         return true;
      } else {
         try {
            return getNativeSize(cls) != 0;
         } catch (IllegalArgumentException var4) {
            return false;
         }
      }
   }

   public static void setCallbackExceptionHandler(Callback$class_5 eh) {
      callbackExceptionHandler = eh == null ? DEFAULT_HANDLER : eh;
   }

   public static Callback$class_5 getCallbackExceptionHandler() {
      return callbackExceptionHandler;
   }

   public static void register(String libName) {
      register(findDirectMappedClass(getCallingClass()), libName);
   }

   public static void register(NativeLibrary lib) {
      register(findDirectMappedClass(getCallingClass()), lib);
   }

   public static Class<?> findDirectMappedClass(Class<?> cls) {
      Method[] idx = cls.getDeclaredMethods();

      for (Method var7 : idx) {
         if ((var7.getModifiers() & 256) != 0) {
            return cls;
         }
      }

      int var9 = cls.getName().lastIndexOf("$");
      if (var9 != -1) {
         String var10 = cls.getName().substring(0, var9);

         try {
            return findDirectMappedClass(Class.forName(var10, true, cls.getClassLoader()));
         } catch (ClassNotFoundException var8) {
         }
      }

      throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + cls + ")");
   }

   public static Class<?> getCallingClass() {
      Class[] var2 = new Native$6().getClassContext();
      if (var2 == null) {
         throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
      } else if (var2.length < 4) {
         throw new IllegalStateException("This method must be called from the static initializer of a class");
      } else {
         return var2[3];
      }
   }

   public static void setCallbackThreadInitializer(Callback cb, CallbackThreadInitializer initializer) {
      CallbackReference.setCallbackThreadInitializer(cb, initializer);
   }

   private static void unregisterAll() {
      synchronized (registeredClasses) {
         for (Entry var4 : registeredClasses.entrySet()) {
            unregister((Class<?>)var4.getKey(), (long[])var4.getValue());
         }

         registeredClasses.clear();
      }
   }

   public static void unregister() {
      unregister(findDirectMappedClass(getCallingClass()));
   }

   public static void unregister(Class<?> cls) {
      synchronized (registeredClasses) {
         long[] var4 = registeredClasses.get(cls);
         if (var4 != null) {
            unregister(cls, var4);
            registeredClasses.remove(cls);
            registeredLibraries.remove(cls);
         }
      }
   }

   public static boolean registered(Class<?> cls) {
      synchronized (registeredClasses) {
         return registeredClasses.containsKey(cls);
      }
   }

   private static native void unregister(Class<?> var0, long[] var1);

   public static String getSignature(Class<?> cls) {
      if (cls.isArray()) {
         return "[" + getSignature(cls.getComponentType());
      } else {
         if (cls.isPrimitive()) {
            if (cls == void.class) {
               return "V";
            }

            if (cls == boolean.class) {
               return "Z";
            }

            if (cls == byte.class) {
               return "B";
            }

            if (cls == short.class) {
               return "S";
            }

            if (cls == char.class) {
               return "C";
            }

            if (cls == int.class) {
               return "I";
            }

            if (cls == long.class) {
               return "J";
            }

            if (cls == float.class) {
               return "F";
            }

            if (cls == double.class) {
               return "D";
            }
         }

         return "L" + replace(".", "/", cls.getName()) + ";";
      }
   }

   public static String replace(String s1, String s2, String str) {
      StringBuilder idx = new StringBuilder();

      while (true) {
         int var6 = str.indexOf(s1);
         if (var6 == -1) {
            idx.append(str);
            return idx.toString();
         }

         idx.append(str.substring(0, var6));
         idx.append(s2);
         str = str.substring(var6 + s1.length());
      }
   }

   private static int getConversion(Class<?> type, TypeMapper mapper) {
      if (type == Boolean.class) {
         type = boolean.class;
      } else if (type == Byte.class) {
         type = byte.class;
      } else if (type == Short.class) {
         type = short.class;
      } else if (type == Character.class) {
         type = char.class;
      } else if (type == Integer.class) {
         type = int.class;
      } else if (type == Long.class) {
         type = long.class;
      } else if (type == Float.class) {
         type = float.class;
      } else if (type == Double.class) {
         type = double.class;
      } else if (type == Void.class) {
         type = void.class;
      }

      if (mapper != null) {
         FromNativeConverter toNative = mapper.getFromNativeConverter(type);
         ToNativeConverter nativeType = mapper.getToNativeConverter(type);
         if (toNative != null) {
            Class var8 = toNative.nativeType();
            if (var8 == String.class) {
               return 24;
            }

            if (var8 == WString.class) {
               return 25;
            }

            return 23;
         }

         if (nativeType != null) {
            Class var6 = nativeType.nativeType();
            if (var6 == String.class) {
               return 24;
            }

            if (var6 == WString.class) {
               return 25;
            }

            return 23;
         }
      }

      if (Pointer.class.isAssignableFrom(type)) {
         return 1;
      } else if (String.class == type) {
         return 2;
      } else if (WString.class.isAssignableFrom(type)) {
         return 20;
      } else if (Platform.HAS_BUFFERS && Native$class_17.isBuffer(type)) {
         return 5;
      } else if (Structure.class.isAssignableFrom(type)) {
         return Structure$class_23.class.isAssignableFrom(type) ? 4 : 3;
      } else {
         if (type.isArray()) {
            switch (type.getName().charAt(1)) {
               case 'B':
                  return 6;
               case 'C':
                  return 8;
               case 'D':
                  return 12;
               case 'E':
               case 'G':
               case 'H':
               case 'K':
               case 'L':
               case 'M':
               case 'N':
               case 'O':
               case 'P':
               case 'Q':
               case 'R':
               case 'T':
               case 'U':
               case 'V':
               case 'W':
               case 'X':
               case 'Y':
               default:
                  break;
               case 'F':
                  return 11;
               case 'I':
                  return 9;
               case 'J':
                  return 10;
               case 'S':
                  return 7;
               case 'Z':
                  return 13;
            }
         }

         if (type.isPrimitive()) {
            return type == boolean.class ? 14 : 0;
         } else if (Callback.class.isAssignableFrom(type)) {
            return 15;
         } else if (IntegerType.class.isAssignableFrom(type)) {
            return 21;
         } else if (PointerType.class.isAssignableFrom(type)) {
            return 22;
         } else if (NativeMapped.class.isAssignableFrom(type)) {
            Class var7 = NativeMappedConverter.getInstance(type).nativeType();
            if (var7 == String.class) {
               return 18;
            } else {
               return var7 == WString.class ? 19 : 17;
            }
         } else {
            return -1;
         }
      }
   }

   public static void register(Class<?> cls, String libName) {
      NativeLibrary var4 = NativeLibrary.getInstance(libName, Collections.<String, ClassLoader>singletonMap("classloader", cls.getClassLoader()));
      register(cls, var4);
   }

   public static void register(Class<?> cls, NativeLibrary lib) {
      Method[] mlist = cls.getDeclaredMethods();
      ArrayList options = new ArrayList();
      Map mapper = lib.getOptions();
      TypeMapper handles = (TypeMapper)mapper.get("type-mapper");
      mapper = cacheOptions(cls, mapper, null);

      for (Method rclass : mlist) {
         if ((rclass.getModifiers() & 256) != 0) {
            options.add(rclass);
         }
      }

      long[] var32 = new long[options.size()];

      for (int var33 = 0; var33 < var32.length; var33++) {
         Method var35 = (Method)options.get(var33);
         String var36 = "(";
         Class ptypes = var35.getReturnType();
         Class[] atypes = var35.getParameterTypes();
         long[] closure_atypes = new long[atypes.length];
         long[] cvt = new long[atypes.length];
         int[] toNative = new int[atypes.length];
         ToNativeConverter[] fromNative = new ToNativeConverter[atypes.length];
         FromNativeConverter rcvt = null;
         int throwLastError = getConversion(ptypes, handles);
         boolean closure_rtype = false;
         long var21;
         long var23;
         switch (throwLastError) {
            case -1:
               throw new IllegalArgumentException(ptypes + " is not a supported return type (in method " + var35.getName() + " in " + cls + ")");
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 20:
            default:
               var21 = var23 = Structure$class_24.get(ptypes).peer;
               break;
            case 3:
               var21 = var23 = Structure$class_24.get(Pointer.class).peer;
               break;
            case 4:
               var21 = Structure$class_24.get(Pointer.class).peer;
               var23 = Structure$class_24.get(ptypes).peer;
               break;
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
               var21 = Structure$class_24.get(Pointer.class).peer;
               var23 = Structure$class_24.get(NativeMappedConverter.getInstance(ptypes).nativeType()).peer;
               break;
            case 23:
            case 24:
            case 25:
               rcvt = handles.getFromNativeConverter(ptypes);
               var21 = Structure$class_24.get(ptypes.isPrimitive() ? ptypes : Pointer.class).peer;
               var23 = Structure$class_24.get(rcvt.nativeType()).peer;
         }

         for (int f = 0; f < atypes.length; f++) {
            Class e = atypes[f];
            var36 = var36 + getSignature(e);
            int var27 = getConversion(e, handles);
            toNative[f] = var27;
            if (var27 == -1) {
               throw new IllegalArgumentException(e + " is not a supported argument type (in method " + var35.getName() + " in " + cls + ")");
            }

            if (var27 == 17 || var27 == 18 || var27 == 19 || var27 == 21) {
               e = NativeMappedConverter.getInstance(e).nativeType();
            } else if (var27 == 23 || var27 == 24 || var27 == 25) {
               fromNative[f] = handles.getToNativeConverter(e);
            }

            switch (var27) {
               case 0:
                  cvt[f] = closure_atypes[f] = Structure$class_24.get(e).peer;
                  break;
               case 1:
               case 2:
               case 3:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 20:
               default:
                  cvt[f] = closure_atypes[f] = Structure$class_24.get(Pointer.class).peer;
                  break;
               case 4:
               case 17:
               case 18:
               case 19:
               case 21:
               case 22:
                  closure_atypes[f] = Structure$class_24.get(e).peer;
                  cvt[f] = Structure$class_24.get(Pointer.class).peer;
                  break;
               case 23:
               case 24:
               case 25:
                  cvt[f] = Structure$class_24.get(e.isPrimitive() ? e : Pointer.class).peer;
                  closure_atypes[f] = Structure$class_24.get(fromNative[f].nativeType()).peer;
            }
         }

         var36 = var36 + ")";
         var36 = var36 + getSignature(ptypes);
         Class[] var39 = var35.getExceptionTypes();

         for (int var40 = 0; var40 < var39.length; var40++) {
            if (LastErrorException.class.isAssignableFrom(var39[var40])) {
               closure_rtype = true;
               break;
            }
         }

         Function var41 = lib.getFunction(var35.getName(), var35);

         try {
            var32[var33] = registerMethod(
               cls,
               var35.getName(),
               var36,
               toNative,
               cvt,
               closure_atypes,
               throwLastError,
               var21,
               var23,
               var35,
               var41.peer,
               var41.getCallingConvention(),
               closure_rtype,
               fromNative,
               rcvt,
               var41.encoding
            );
         } catch (NoSuchMethodError var30) {
            throw new UnsatisfiedLinkError("No method " + var35.getName() + " with signature " + var36 + " in " + cls);
         }
      }

      synchronized (registeredClasses) {
         registeredClasses.put(cls, var32);
         registeredLibraries.put(cls, lib);
      }
   }

   private static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> options, Object proxy) {
      HashMap var5 = new HashMap(options);
      var5.put("enclosing-library", cls);
      synchronized (libraries) {
         typeOptions.put(cls, var5);
         if (proxy != null) {
            libraries.put(cls, new WeakReference<Object>(proxy));
         }

         if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            Class[] var7 = cls.getInterfaces();

            for (Class var11 : var7) {
               if (Library.class.isAssignableFrom(var11)) {
                  cacheOptions(var11, var5, proxy);
                  break;
               }
            }
         }

         return var5;
      }
   }

   private static native long registerMethod(
      Class<?> var0,
      String var1,
      String var2,
      int[] var3,
      long[] var4,
      long[] var5,
      int var6,
      long var7,
      long var9,
      Method var11,
      long var12,
      int var14,
      boolean var15,
      ToNativeConverter[] var16,
      FromNativeConverter var17,
      String var18
   );

   private static NativeMapped fromNative(Class<?> cls, Object value) {
      return (NativeMapped)NativeMappedConverter.getInstance(cls).fromNative(value, new FromNativeContext(cls));
   }

   private static NativeMapped fromNative(Method m, Object value) {
      Class var4 = m.getReturnType();
      return (NativeMapped)NativeMappedConverter.getInstance(var4).fromNative(value, new MethodResultContext(var4, null, null, m));
   }

   private static Class<?> nativeType(Class<?> cls) {
      return NativeMappedConverter.getInstance(cls).nativeType();
   }

   private static Object toNative(ToNativeConverter cvt, Object o) {
      return cvt.toNative(o, new ToNativeContext());
   }

   private static Object fromNative(FromNativeConverter cvt, Object o, Method m) {
      return cvt.fromNative(o, new MethodResultContext(m.getReturnType(), null, null, m));
   }

   public static native long ffi_prep_cif(int var0, int var1, long var2, long var4);

   public static native void ffi_call(long var0, long var2, long var4, long var6);

   public static native long ffi_prep_closure(long var0, Native$class_18 var2);

   public static native void ffi_free_closure(long var0);

   public static native int initialize_ffi_type(long var0);

   public static void main(String[] args) {
      String DEFAULT_VERSION = "Java Native Access (JNA)";
      String DEFAULT_BUILD = "4.4.0";
      String pkg = "4.4.0 (package information missing)";
      Package title = Native.class.getPackage();
      String version = title != null ? title.getSpecificationTitle() : "Java Native Access (JNA)";
      if (version == null) {
         version = "Java Native Access (JNA)";
      }

      String var8 = title != null ? title.getSpecificationVersion() : "4.4.0";
      if (var8 == null) {
         var8 = "4.4.0";
      }

      version = version + " API Version " + var8;
      System.out.println(version);
      var8 = title != null ? title.getImplementationVersion() : "4.4.0 (package information missing)";
      if (var8 == null) {
         var8 = "4.4.0 (package information missing)";
      }

      System.out.println("Version: " + var8);
      System.out.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");
      System.out.println(" Prefix: " + Platform.RESOURCE_PREFIX);
   }

   public static synchronized native void freeNativeCallback(long var0);

   public static synchronized native long createNativeCallback(Callback var0, Method var1, Class<?>[] var2, Class<?> var3, int var4, int var5, String var6);

   public static native int invokeInt(Function var0, long var1, int var3, Object[] var4);

   public static native long invokeLong(Function var0, long var1, int var3, Object[] var4);

   public static native void invokeVoid(Function var0, long var1, int var3, Object[] var4);

   public static native float invokeFloat(Function var0, long var1, int var3, Object[] var4);

   public static native double invokeDouble(Function var0, long var1, int var3, Object[] var4);

   public static native long invokePointer(Function var0, long var1, int var3, Object[] var4);

   private static native void invokeStructure(Function var0, long var1, int var3, Object[] var4, long var5, long var7);

   public static Structure invokeStructure(Function function, long fp, int callFlags, Object[] args, Structure s) {
      invokeStructure(function, fp, callFlags, args, s.getPointer().peer, s.getTypeInfo().peer);
      return s;
   }

   public static native Object invokeObject(Function var0, long var1, int var3, Object[] var4);

   public static long open(String name) {
      return open(name, -1);
   }

   public static native long open(String var0, int var1);

   public static native void close(long var0);

   public static native long findSymbol(long var0, String var2);

   public static native long indexOf(Pointer var0, long var1, long var3, byte var5);

   public static native void read(Pointer var0, long var1, long var3, byte[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, short[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, char[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, int[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, long[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, float[] var5, int var6, int var7);

   public static native void read(Pointer var0, long var1, long var3, double[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, byte[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, short[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, char[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, int[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, long[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, float[] var5, int var6, int var7);

   public static native void write(Pointer var0, long var1, long var3, double[] var5, int var6, int var7);

   public static native byte getByte(Pointer var0, long var1, long var3);

   public static native char getChar(Pointer var0, long var1, long var3);

   public static native short getShort(Pointer var0, long var1, long var3);

   public static native int getInt(Pointer var0, long var1, long var3);

   public static native long getLong(Pointer var0, long var1, long var3);

   public static native float getFloat(Pointer var0, long var1, long var3);

   public static native double getDouble(Pointer var0, long var1, long var3);

   public static Pointer getPointer(long addr) {
      long var4 = _getPointer(addr);
      return var4 == 0L ? null : new Pointer(var4);
   }

   private static native long _getPointer(long var0);

   public static native String getWideString(Pointer var0, long var1, long var3);

   public static String getString(Pointer pointer, long offset) {
      return getString(pointer, offset, getDefaultStringEncoding());
   }

   public static String getString(Pointer pointer, long offset, String encoding) {
      byte[] var6 = getStringBytes(pointer, pointer.peer, offset);
      if (encoding != null) {
         try {
            return new String(var6, encoding);
         } catch (UnsupportedEncodingException var8) {
         }
      }

      return new String(var6);
   }

   public static native byte[] getStringBytes(Pointer var0, long var1, long var3);

   public static native void setMemory(Pointer var0, long var1, long var3, long var5, byte var7);

   public static native void setByte(Pointer var0, long var1, long var3, byte var5);

   public static native void setShort(Pointer var0, long var1, long var3, short var5);

   public static native void setChar(Pointer var0, long var1, long var3, char var5);

   public static native void setInt(Pointer var0, long var1, long var3, int var5);

   public static native void setLong(Pointer var0, long var1, long var3, long var5);

   public static native void setFloat(Pointer var0, long var1, long var3, float var5);

   public static native void setDouble(Pointer var0, long var1, long var3, double var5);

   public static native void setPointer(Pointer var0, long var1, long var3, long var5);

   public static native void setWideString(Pointer var0, long var1, long var3, String var5);

   public static native ByteBuffer getDirectByteBuffer(Pointer var0, long var1, long var3, long var5);

   public static native long malloc(long var0);

   public static native void free(long var0);

   @Deprecated
   public static native ByteBuffer getDirectByteBuffer(long var0, long var2);

   public static void detach(boolean detach) {
      Thread p = Thread.currentThread();
      if (detach) {
         nativeThreads.remove(p);
         Pointer var4 = nativeThreadTerminationFlag.get();
         setDetachState(true, 0L);
      } else if (!nativeThreads.containsKey(p)) {
         Pointer var5 = nativeThreadTerminationFlag.get();
         nativeThreads.put(p, var5);
         setDetachState(false, var5.peer);
      }
   }

   public static Pointer getTerminationFlag(Thread t) {
      return nativeThreads.get(t);
   }

   private static native void setDetachState(boolean var0, long var1);

   static {
      loadNativeDispatchLibrary();
      if (!isCompatibleVersion("5.1.0", getNativeVersion())) {
         String var2 = System.getProperty("line.separator");
         throw new Error(
            var2
               + var2
               + "There is an incompatible JNA native library installed on this system"
               + var2
               + "Expected: "
               + "5.1.0"
               + var2
               + "Found:    "
               + getNativeVersion()
               + var2
               + (jnidispatchPath != null ? "(at " + jnidispatchPath + ")" : System.getProperty("java.library.path"))
               + "."
               + var2
               + "To resolve this issue you may do one of the following:"
               + var2
               + " - remove or uninstall the offending library"
               + var2
               + " - set the system property jna.nosys=true"
               + var2
               + " - set jna.boot.library.path to include the path to the version of the "
               + var2
               + "   jnidispatch library included with the JNA jar file you are using"
               + var2
         );
      } else {
         POINTER_SIZE = sizeof(0);
         LONG_SIZE = sizeof(1);
         WCHAR_SIZE = sizeof(2);
         SIZE_T_SIZE = sizeof(3);
         BOOL_SIZE = sizeof(4);
         initIDs();
         if (Boolean.getBoolean("jna.protected")) {
            setProtected(true);
         }

         MAX_ALIGNMENT = !Platform.isSPARC()
               && !Platform.isWindows()
               && (!Platform.isLinux() || !Platform.isARM() && !Platform.isPPC())
               && !Platform.isAIX()
               && !Platform.isAndroid()
            ? LONG_SIZE
            : 8;
         MAX_PADDING = Platform.isMac() && Platform.isPPC() ? 8 : MAX_ALIGNMENT;
         System.setProperty("jna.loaded", "true");
         finalizer = new Native$2();
         registeredClasses = new WeakHashMap<Class<?>, long[]>();
         registeredLibraries = new WeakHashMap<Class<?>, NativeLibrary>();
         nativeThreadTerminationFlag = new Native$7();
         nativeThreads = Collections.<Thread, Pointer>synchronizedMap(new WeakHashMap<Thread, Pointer>());
      }
   }
}

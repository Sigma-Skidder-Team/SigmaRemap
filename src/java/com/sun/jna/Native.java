// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.WeakHashMap;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.nio.Buffer;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.lang.ref.Reference;
import java.util.Map;

public final class Native implements Version
{
    public static final String DEFAULT_ENCODING;
    public static boolean DEBUG_LOAD;
    public static boolean DEBUG_JNA_LOAD;
    public static String jnidispatchPath;
    private static final Map<Class<?>, Map<String, Object>> typeOptions;
    private static final Map<Class<?>, Reference<?>> libraries;
    private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    private static final Callback$UncaughtExceptionHandler DEFAULT_HANDLER;
    private static Callback$UncaughtExceptionHandler callbackExceptionHandler;
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
    public static float parseVersion(final String v) {
        return Float.parseFloat(v.substring(0, v.lastIndexOf(".")));
    }
    
    public static boolean isCompatibleVersion(final String expectedVersion, final String nativeVersion) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "\\."
        //     3: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //     6: astore          4
        //     8: aload_1         /* nativeVersion */
        //     9: ldc             "\\."
        //    11: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    14: astore          5
        //    16: aload           nativeVersionParts
        //    18: arraylength    
        //    19: iconst_3       
        //    20: if_icmplt       30
        //    23: aload           5
        //    25: arraylength    
        //    26: iconst_3       
        //    27: if_icmpge       32
        //    30: iconst_0       
        //    31: ireturn        
        //    32: aload           nativeVersionParts
        //    34: iconst_0       
        //    35: aaload         
        //    36: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    39: istore          6
        //    41: aload           expectedMajor
        //    43: iconst_0       
        //    44: aaload         
        //    45: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    48: istore          7
        //    50: aload           nativeVersionParts
        //    52: iconst_1       
        //    53: aaload         
        //    54: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    57: istore          8
        //    59: aload           expectedMajor
        //    61: iconst_1       
        //    62: aaload         
        //    63: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    66: istore          9
        //    68: iload           nativeMajor
        //    70: iload           expectedMinor
        //    72: if_icmpeq       77
        //    75: iconst_0       
        //    76: ireturn        
        //    77: iload           nativeMinor
        //    79: iload           9
        //    81: if_icmple       86
        //    84: iconst_0       
        //    85: ireturn        
        //    86: iconst_1       
        //    87: ireturn        
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
    
    private static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        Native.jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }
    
    public static boolean deleteLibrary(final File lib) {
        if (lib.delete()) {
            return true;
        }
        markTemporaryFile(lib);
        return false;
    }
    
    private Native() {
    }
    
    private static native void initIDs();
    
    public static synchronized native void setProtected(final boolean p0);
    
    public static synchronized native boolean isProtected();
    
    @Deprecated
    public static void setPreserveLastError(final boolean enable) {
    }
    
    @Deprecated
    public static boolean getPreserveLastError() {
        return true;
    }
    
    public static long getWindowID(final Window w) throws HeadlessException {
        return Native$AWT.getWindowID(w);
    }
    
    public static long getComponentID(final Component c) throws HeadlessException {
        return Native$AWT.getComponentID(c);
    }
    
    public static Pointer getWindowPointer(final Window w) throws HeadlessException {
        return new Pointer(Native$AWT.getWindowID(w));
    }
    
    public static Pointer getComponentPointer(final Component c) throws HeadlessException {
        return new Pointer(Native$AWT.getComponentID(c));
    }
    
    public static native long getWindowHandle0(final Component p0);
    
    public static Pointer getDirectBufferPointer(final Buffer b) {
        final long getDirectBufferPointer = _getDirectBufferPointer(b);
        return (getDirectBufferPointer == 0L) ? null : new Pointer(getDirectBufferPointer);
    }
    
    private static native long _getDirectBufferPointer(final Buffer p0);
    
    public static String toString(final byte[] buf) {
        return toString(buf, getDefaultStringEncoding());
    }
    
    public static String toString(final byte[] buf, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore          4
        //     4: iconst_0       
        //     5: istore          5
        //     7: iload           5
        //     9: iload           index
        //    11: if_icmpge       34
        //    14: aload_0         /* buf */
        //    15: iload           5
        //    17: baload         
        //    18: ifne            28
        //    21: iload           5
        //    23: istore          index
        //    25: goto            34
        //    28: iinc            5, 1
        //    31: goto            7
        //    34: iload           index
        //    36: ifne            43
        //    39: ldc_w           ""
        //    42: areturn        
        //    43: aload_1         /* encoding */
        //    44: ifnull          94
        //    47: new             Ljava/lang/String;
        //    50: dup            
        //    51: aload_0         /* buf */
        //    52: iconst_0       
        //    53: iload           4
        //    55: aload_1         /* encoding */
        //    56: invokespecial   java/lang/String.<init>:([BIILjava/lang/String;)V
        //    59: areturn        
        //    60: astore          5
        //    62: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //    65: new             Ljava/lang/StringBuilder;
        //    68: dup            
        //    69: invokespecial   java/lang/StringBuilder.<init>:()V
        //    72: ldc_w           "JNA Warning: Encoding '"
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: aload_1         /* encoding */
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: ldc_w           "' is unsupported"
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    91: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    94: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: ldc_w           "JNA Warning: Decoding with fallback "
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: ldc_w           "file.encoding"
        //   113: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   125: new             Ljava/lang/String;
        //   128: dup            
        //   129: aload_0         /* buf */
        //   130: iconst_0       
        //   131: iload           4
        //   133: invokespecial   java/lang/String.<init>:([BII)V
        //   136: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  47     59     60     94     Ljava/io/UnsupportedEncodingException;
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
    
    public static String toString(final char[] buf) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore_3       
        //     3: iconst_0       
        //     4: istore          4
        //     6: iload           4
        //     8: iload_3        
        //     9: if_icmpge       31
        //    12: aload_0         /* buf */
        //    13: iload           4
        //    15: caload         
        //    16: ifne            25
        //    19: iload           4
        //    21: istore_3       
        //    22: goto            31
        //    25: iinc            4, 1
        //    28: goto            6
        //    31: iload_3        
        //    32: ifne            39
        //    35: ldc_w           ""
        //    38: areturn        
        //    39: new             Ljava/lang/String;
        //    42: dup            
        //    43: aload_0         /* buf */
        //    44: iconst_0       
        //    45: iload_3        
        //    46: invokespecial   java/lang/String.<init>:([CII)V
        //    49: areturn        
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
    
    public static List<String> toStringList(final char[] buf) {
        return toStringList(buf, 0, buf.length);
    }
    
    public static List<String> toStringList(final char[] buf, final int offset, final int len) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          5
        //     9: iload_1         /* offset */
        //    10: istore          6
        //    12: iload_1         /* offset */
        //    13: iload_2         /* len */
        //    14: iadd           
        //    15: istore          7
        //    17: iload_1         /* offset */
        //    18: istore          8
        //    20: iload           8
        //    22: iload           curPos
        //    24: if_icmpge       86
        //    27: aload_0         /* buf */
        //    28: iload           8
        //    30: caload         
        //    31: ifeq            37
        //    34: goto            80
        //    37: iload           maxPos
        //    39: iload           8
        //    41: if_icmpne       47
        //    44: aload           lastPos
        //    46: areturn        
        //    47: new             Ljava/lang/String;
        //    50: dup            
        //    51: aload_0         /* buf */
        //    52: iload           maxPos
        //    54: iload           8
        //    56: iload           maxPos
        //    58: isub           
        //    59: invokespecial   java/lang/String.<init>:([CII)V
        //    62: astore          9
        //    64: aload           lastPos
        //    66: aload           9
        //    68: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    73: pop            
        //    74: iload           value
        //    76: iconst_1       
        //    77: iadd           
        //    78: istore          maxPos
        //    80: iinc            value, 1
        //    83: goto            20
        //    86: iload           maxPos
        //    88: iload           7
        //    90: if_icmpge       120
        //    93: new             Ljava/lang/String;
        //    96: dup            
        //    97: aload_0         /* buf */
        //    98: iload           maxPos
        //   100: iload           7
        //   102: iload           maxPos
        //   104: isub           
        //   105: invokespecial   java/lang/String.<init>:([CII)V
        //   108: astore          8
        //   110: aload           lastPos
        //   112: aload           8
        //   114: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: aload           lastPos
        //   122: areturn        
        //    Signature:
        //  ([CII)Ljava/util/List<Ljava/lang/String;>;
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
    
    public static <T> T loadLibrary(final Class<T> interfaceClass) {
        return loadLibrary(null, interfaceClass);
    }
    
    public static <T> T loadLibrary(final Class<T> interfaceClass, final Map<String, ?> options) {
        return loadLibrary(null, interfaceClass, options);
    }
    
    public static <T> T loadLibrary(final String name, final Class<T> interfaceClass) {
        return loadLibrary(name, interfaceClass, Collections.emptyMap());
    }
    
    public static <T> T loadLibrary(final String name, final Class<T> interfaceClass, final Map<String, ?> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1         /* interfaceClass */
        //     4: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //     7: ifne            66
        //    10: new             Ljava/lang/IllegalArgumentException;
        //    13: dup            
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: invokespecial   java/lang/StringBuilder.<init>:()V
        //    21: ldc_w           "Interface ("
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_1         /* interfaceClass */
        //    28: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: ldc_w           ") of library="
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: aload_0         /* name */
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: ldc_w           " does not extend "
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: ldc_w           Lcom/sun/jna/Library;.class
        //    53: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    62: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    65: athrow         
        //    66: new             Lcom/sun/jna/Library$Handler;
        //    69: dup            
        //    70: aload_0         /* name */
        //    71: aload_1         /* interfaceClass */
        //    72: aload_2         /* options */
        //    73: invokespecial   com/sun/jna/Library$Handler.<init>:(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)V
        //    76: astore          5
        //    78: aload_1         /* interfaceClass */
        //    79: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    82: astore          6
        //    84: aload           6
        //    86: iconst_1       
        //    87: anewarray       Ljava/lang/Class;
        //    90: dup            
        //    91: iconst_0       
        //    92: aload_1         /* interfaceClass */
        //    93: aastore        
        //    94: aload           loader
        //    96: invokestatic    java/lang/reflect/Proxy.newProxyInstance:(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
        //    99: astore          7
        //   101: aload_1         /* interfaceClass */
        //   102: aload_2         /* options */
        //   103: aload           7
        //   105: invokestatic    com/sun/jna/Native.cacheOptions:(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;
        //   108: pop            
        //   109: aload_1         /* interfaceClass */
        //   110: aload           7
        //   112: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   115: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;*>;)TT;
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
    
    private static void loadLibraryInstance(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_3       
        //     5: monitorenter   
        //     6: aload_0         /* cls */
        //     7: ifnull          148
        //    10: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //    13: aload_0         /* cls */
        //    14: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    19: ifne            148
        //    22: aload_0         /* cls */
        //    23: invokevirtual   java/lang/Class.getFields:()[Ljava/lang/reflect/Field;
        //    26: astore          4
        //    28: iconst_0       
        //    29: istore          5
        //    31: iload           5
        //    33: aload           i
        //    35: arraylength    
        //    36: if_icmpge       98
        //    39: aload           i
        //    41: iload           5
        //    43: aaload         
        //    44: astore          6
        //    46: aload           6
        //    48: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    51: aload_0         /* cls */
        //    52: if_acmpne       92
        //    55: aload           6
        //    57: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    60: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //    63: ifeq            92
        //    66: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //    69: aload_0         /* cls */
        //    70: new             Ljava/lang/ref/WeakReference;
        //    73: dup            
        //    74: aload           6
        //    76: aconst_null    
        //    77: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    80: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //    83: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    88: pop            
        //    89: goto            98
        //    92: iinc            field, 1
        //    95: goto            31
        //    98: goto            148
        //   101: astore          4
        //   103: new             Ljava/lang/IllegalArgumentException;
        //   106: dup            
        //   107: new             Ljava/lang/StringBuilder;
        //   110: dup            
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: ldc_w           "Could not access instance of "
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: aload_0         /* cls */
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   124: ldc_w           " ("
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload           4
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   135: ldc_w           ")"
        //   138: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   144: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   147: athrow         
        //   148: aload_3         /* e */
        //   149: monitorexit    
        //   150: goto            160
        //   153: astore          7
        //   155: aload_3        
        //   156: monitorexit    
        //   157: aload           7
        //   159: athrow         
        //   160: return         
        //    Signature:
        //  (Ljava/lang/Class<*>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  22     98     101    148    Ljava/lang/Exception;
        //  6      150    153    160    Any
        //  153    157    153    160    Any
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
    
    public static Class<?> findEnclosingLibraryClass(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //     9: dup            
        //    10: astore_3       
        //    11: monitorenter   
        //    12: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //    15: aload_0         /* cls */
        //    16: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    21: ifeq            66
        //    24: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //    27: aload_0         /* cls */
        //    28: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       Ljava/util/Map;
        //    36: astore          4
        //    38: aload           4
        //    40: ldc             "enclosing-library"
        //    42: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    47: checkcast       Ljava/lang/Class;
        //    50: astore          5
        //    52: aload           5
        //    54: ifnull          62
        //    57: aload           5
        //    59: aload_3         /* libOptions */
        //    60: monitorexit    
        //    61: areturn        
        //    62: aload_0         /* cls */
        //    63: aload_3         /* libOptions */
        //    64: monitorexit    
        //    65: areturn        
        //    66: aload_3         /* libOptions */
        //    67: monitorexit    
        //    68: goto            78
        //    71: astore          6
        //    73: aload_3        
        //    74: monitorexit    
        //    75: aload           6
        //    77: athrow         
        //    78: ldc_w           Lcom/sun/jna/Library;.class
        //    81: aload_0         /* cls */
        //    82: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    85: ifeq            90
        //    88: aload_0         /* cls */
        //    89: areturn        
        //    90: ldc_w           Lcom/sun/jna/Callback;.class
        //    93: aload_0         /* cls */
        //    94: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    97: ifeq            105
        //   100: aload_0         /* cls */
        //   101: invokestatic    com/sun/jna/CallbackReference.findCallbackClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   104: astore_0        /* cls */
        //   105: aload_0         /* cls */
        //   106: invokevirtual   java/lang/Class.getDeclaringClass:()Ljava/lang/Class;
        //   109: astore_3       
        //   110: aload_3        
        //   111: invokestatic    com/sun/jna/Native.findEnclosingLibraryClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   114: astore          4
        //   116: aload           4
        //   118: ifnull          124
        //   121: aload           4
        //   123: areturn        
        //   124: aload_0         /* cls */
        //   125: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   128: invokestatic    com/sun/jna/Native.findEnclosingLibraryClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   131: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/Class<*>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     61     71     78     Any
        //  62     65     71     78     Any
        //  66     68     71     78     Any
        //  71     75     71     78     Any
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
    
    public static Map<String, Object> getLibraryOptions(final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_3       
        //     5: monitorenter   
        //     6: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //     9: aload_0         /* type */
        //    10: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Ljava/util/Map;
        //    18: astore          4
        //    20: aload           4
        //    22: ifnull          30
        //    25: aload           4
        //    27: aload_3         /* libraryOptions */
        //    28: monitorexit    
        //    29: areturn        
        //    30: aload_3         /* libraryOptions */
        //    31: monitorexit    
        //    32: goto            42
        //    35: astore          5
        //    37: aload_3        
        //    38: monitorexit    
        //    39: aload           5
        //    41: athrow         
        //    42: aload_0         /* type */
        //    43: invokestatic    com/sun/jna/Native.findEnclosingLibraryClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    46: astore_3        /* libraryOptions */
        //    47: aload_3         /* libraryOptions */
        //    48: ifnull          58
        //    51: aload_3         /* libraryOptions */
        //    52: invokestatic    com/sun/jna/Native.loadLibraryInstance:(Ljava/lang/Class;)V
        //    55: goto            60
        //    58: aload_0         /* type */
        //    59: astore_3        /* libraryOptions */
        //    60: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //    63: dup            
        //    64: astore          5
        //    66: monitorenter   
        //    67: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //    70: aload_3         /* libraryOptions */
        //    71: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    76: checkcast       Ljava/util/Map;
        //    79: astore          4
        //    81: aload           4
        //    83: ifnull          104
        //    86: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //    89: aload_0         /* type */
        //    90: aload           4
        //    92: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    97: pop            
        //    98: aload           4
        //   100: aload           5
        //   102: monitorexit    
        //   103: areturn        
        //   104: aload_3         /* libraryOptions */
        //   105: ldc_w           "OPTIONS"
        //   108: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   111: astore          6
        //   113: aload           6
        //   115: iconst_1       
        //   116: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   119: aload           6
        //   121: aconst_null    
        //   122: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   125: checkcast       Ljava/util/Map;
        //   128: astore          4
        //   130: aload           4
        //   132: ifnonnull       146
        //   135: new             Ljava/lang/IllegalStateException;
        //   138: dup            
        //   139: ldc_w           "Null options field"
        //   142: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   145: athrow         
        //   146: goto            200
        //   149: astore          6
        //   151: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //   154: astore          4
        //   156: goto            200
        //   159: astore          6
        //   161: new             Ljava/lang/IllegalArgumentException;
        //   164: dup            
        //   165: new             Ljava/lang/StringBuilder;
        //   168: dup            
        //   169: invokespecial   java/lang/StringBuilder.<init>:()V
        //   172: ldc_w           "OPTIONS must be a public field of type java.util.Map ("
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: aload           6
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   183: ldc_w           "): "
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_3         /* libraryOptions */
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   199: athrow         
        //   200: new             Ljava/util/HashMap;
        //   203: dup            
        //   204: aload           4
        //   206: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   209: astore          4
        //   211: aload           4
        //   213: ldc_w           "type-mapper"
        //   216: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   221: ifne            245
        //   224: aload           4
        //   226: ldc_w           "type-mapper"
        //   229: aload_3         /* libraryOptions */
        //   230: ldc_w           "TYPE_MAPPER"
        //   233: ldc_w           Lcom/sun/jna/TypeMapper;.class
        //   236: invokestatic    com/sun/jna/Native.lookupField:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   239: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   244: pop            
        //   245: aload           4
        //   247: ldc_w           "structure-alignment"
        //   250: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   255: ifne            278
        //   258: aload           4
        //   260: ldc_w           "structure-alignment"
        //   263: aload_3         /* libraryOptions */
        //   264: ldc_w           "STRUCTURE_ALIGNMENT"
        //   267: ldc             Ljava/lang/Integer;.class
        //   269: invokestatic    com/sun/jna/Native.lookupField:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   272: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   277: pop            
        //   278: aload           4
        //   280: ldc_w           "string-encoding"
        //   283: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   288: ifne            311
        //   291: aload           4
        //   293: ldc_w           "string-encoding"
        //   296: aload_3         /* libraryOptions */
        //   297: ldc_w           "STRING_ENCODING"
        //   300: ldc             Ljava/lang/String;.class
        //   302: invokestatic    com/sun/jna/Native.lookupField:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   305: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   310: pop            
        //   311: aload_3         /* libraryOptions */
        //   312: aload           4
        //   314: aconst_null    
        //   315: invokestatic    com/sun/jna/Native.cacheOptions:(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;
        //   318: astore          4
        //   320: aload_0         /* type */
        //   321: aload_3         /* libraryOptions */
        //   322: if_acmpeq       337
        //   325: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //   328: aload_0         /* type */
        //   329: aload           4
        //   331: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   336: pop            
        //   337: aload           4
        //   339: aload           5
        //   341: monitorexit    
        //   342: areturn        
        //   343: astore          7
        //   345: aload           5
        //   347: monitorexit    
        //   348: aload           7
        //   350: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      29     35     42     Any
        //  30     32     35     42     Any
        //  35     39     35     42     Any
        //  104    146    149    159    Ljava/lang/NoSuchFieldException;
        //  104    146    159    200    Ljava/lang/Exception;
        //  67     103    343    351    Any
        //  104    342    343    351    Any
        //  343    348    343    351    Any
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
    
    private static Object lookupField(final Class<?> mappingClass, final String fieldName, final Class<?> resultClass) {
        try {
            final Field field = mappingClass.getField(fieldName);
            field.setAccessible(true);
            return field.get(null);
        }
        catch (final NoSuchFieldException ex) {
            return null;
        }
        catch (final Exception obj) {
            throw new IllegalArgumentException(fieldName + " must be a public field of type " + resultClass.getName() + " (" + obj + "): " + mappingClass);
        }
    }
    
    public static TypeMapper getTypeMapper(final Class<?> cls) {
        return getLibraryOptions(cls).get("type-mapper");
    }
    
    public static String getStringEncoding(final Class<?> cls) {
        final String s = getLibraryOptions(cls).get("string-encoding");
        return (s != null) ? s : getDefaultStringEncoding();
    }
    
    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", Native.DEFAULT_ENCODING);
    }
    
    public static int getStructureAlignment(final Class<?> cls) {
        final Integer n = getLibraryOptions(cls).get("structure-alignment");
        return (n == null) ? 0 : n;
    }
    
    public static byte[] getBytes(final String s) {
        return getBytes(s, getDefaultStringEncoding());
    }
    
    public static byte[] getBytes(final String s, final String encoding) {
        if (encoding != null) {
            try {
                return s.getBytes(encoding);
            }
            catch (final UnsupportedEncodingException ex) {
                System.err.println("JNA Warning: Encoding '" + encoding + "' is unsupported");
            }
        }
        System.err.println("JNA Warning: Encoding with fallback " + System.getProperty("file.encoding"));
        return s.getBytes();
    }
    
    public static byte[] toByteArray(final String s) {
        return toByteArray(s, getDefaultStringEncoding());
    }
    
    public static byte[] toByteArray(final String s, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* encoding */
        //     2: invokestatic    com/sun/jna/Native.getBytes:(Ljava/lang/String;Ljava/lang/String;)[B
        //     5: astore          4
        //     7: aload           4
        //     9: arraylength    
        //    10: iconst_1       
        //    11: iadd           
        //    12: newarray        B
        //    14: astore          5
        //    16: aload           buf
        //    18: iconst_0       
        //    19: aload           5
        //    21: iconst_0       
        //    22: aload           buf
        //    24: arraylength    
        //    25: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    28: aload           5
        //    30: areturn        
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
    
    public static char[] toCharArray(final String s) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/String.toCharArray:()[C
        //     4: astore_3       
        //     5: aload_3        
        //     6: arraylength    
        //     7: iconst_1       
        //     8: iadd           
        //     9: newarray        C
        //    11: astore          4
        //    13: aload_3        
        //    14: iconst_0       
        //    15: aload           4
        //    17: iconst_0       
        //    18: aload_3        
        //    19: arraylength    
        //    20: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    23: aload           4
        //    25: areturn        
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
    
    private static void loadNativeDispatchLibrary() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    java/lang/Boolean.getBoolean:(Ljava/lang/String;)Z
        //     6: ifne            45
        //     9: invokestatic    com/sun/jna/Native.removeTemporaryFiles:()V
        //    12: goto            45
        //    15: astore_2       
        //    16: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //    19: new             Ljava/lang/StringBuilder;
        //    22: dup            
        //    23: invokespecial   java/lang/StringBuilder.<init>:()V
        //    26: ldc_w           "JNA Warning: IOException removing temporary files: "
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload_2        
        //    33: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    42: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    45: ldc_w           "jna.boot.library.name"
        //    48: ldc_w           "jnidispatch"
        //    51: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    54: astore_2       
        //    55: ldc_w           "jna.boot.library.path"
        //    58: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    61: astore_3       
        //    62: aload_3        
        //    63: ifnull          514
        //    66: new             Ljava/util/StringTokenizer;
        //    69: dup            
        //    70: aload_3        
        //    71: getstatic       java/io/File.pathSeparator:Ljava/lang/String;
        //    74: invokespecial   java/util/StringTokenizer.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    77: astore          4
        //    79: aload           4
        //    81: invokevirtual   java/util/StringTokenizer.hasMoreTokens:()Z
        //    84: ifeq            514
        //    87: aload           4
        //    89: invokevirtual   java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        //    92: astore          5
        //    94: new             Ljava/io/File;
        //    97: dup            
        //    98: new             Ljava/io/File;
        //   101: dup            
        //   102: aload           5
        //   104: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   107: aload_2         /* bootPath */
        //   108: invokestatic    java/lang/System.mapLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //   111: ldc_w           ".dylib"
        //   114: ldc_w           ".jnilib"
        //   117: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   120: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   123: astore          6
        //   125: aload           6
        //   127: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   130: astore          7
        //   132: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   135: ifeq            165
        //   138: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   141: new             Ljava/lang/StringBuilder;
        //   144: dup            
        //   145: invokespecial   java/lang/StringBuilder.<init>:()V
        //   148: ldc_w           "Looking in "
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: aload           7
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   162: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   165: aload           path
        //   167: invokevirtual   java/io/File.exists:()Z
        //   170: ifeq            261
        //   173: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   176: ifeq            206
        //   179: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   182: new             Ljava/lang/StringBuilder;
        //   185: dup            
        //   186: invokespecial   java/lang/StringBuilder.<init>:()V
        //   189: ldc_w           "Trying "
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: aload           7
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   203: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   206: ldc_w           "jnidispatch.path"
        //   209: aload           7
        //   211: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   214: pop            
        //   215: aload           7
        //   217: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   220: aload           7
        //   222: putstatic       com/sun/jna/Native.jnidispatchPath:Ljava/lang/String;
        //   225: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   228: ifeq            258
        //   231: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   234: new             Ljava/lang/StringBuilder;
        //   237: dup            
        //   238: invokespecial   java/lang/StringBuilder.<init>:()V
        //   241: ldc_w           "Found jnidispatch at "
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: aload           7
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   258: return         
        //   259: astore          8
        //   261: invokestatic    com/sun/jna/Platform.isMac:()Z
        //   264: ifeq            511
        //   267: aload           7
        //   269: ldc_w           "dylib"
        //   272: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   275: ifeq            291
        //   278: ldc_w           "dylib"
        //   281: astore          8
        //   283: ldc_w           "jnilib"
        //   286: astore          9
        //   288: goto            301
        //   291: ldc_w           "jnilib"
        //   294: astore          8
        //   296: ldc_w           "dylib"
        //   299: astore          9
        //   301: new             Ljava/lang/StringBuilder;
        //   304: dup            
        //   305: invokespecial   java/lang/StringBuilder.<init>:()V
        //   308: aload           orig
        //   310: iconst_0       
        //   311: aload           orig
        //   313: aload           ext
        //   315: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   318: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   321: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   324: aload           9
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   332: astore          orig
        //   334: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   337: ifeq            367
        //   340: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   343: new             Ljava/lang/StringBuilder;
        //   346: dup            
        //   347: invokespecial   java/lang/StringBuilder.<init>:()V
        //   350: ldc_w           "Looking in "
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: aload           orig
        //   358: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   361: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   364: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   367: new             Ljava/io/File;
        //   370: dup            
        //   371: aload           orig
        //   373: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   376: invokevirtual   java/io/File.exists:()Z
        //   379: ifeq            511
        //   382: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   385: ifeq            415
        //   388: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   391: new             Ljava/lang/StringBuilder;
        //   394: dup            
        //   395: invokespecial   java/lang/StringBuilder.<init>:()V
        //   398: ldc_w           "Trying "
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: aload           orig
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   412: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   415: ldc_w           "jnidispatch.path"
        //   418: aload           orig
        //   420: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   423: pop            
        //   424: aload           orig
        //   426: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   429: aload           orig
        //   431: putstatic       com/sun/jna/Native.jnidispatchPath:Ljava/lang/String;
        //   434: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   437: ifeq            467
        //   440: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   443: new             Ljava/lang/StringBuilder;
        //   446: dup            
        //   447: invokespecial   java/lang/StringBuilder.<init>:()V
        //   450: ldc_w           "Found jnidispatch at "
        //   453: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   456: aload           orig
        //   458: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   461: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   464: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   467: return         
        //   468: astore          10
        //   470: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   473: new             Ljava/lang/StringBuilder;
        //   476: dup            
        //   477: invokespecial   java/lang/StringBuilder.<init>:()V
        //   480: ldc_w           "File found at "
        //   483: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   486: aload           orig
        //   488: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   491: ldc_w           " but not loadable: "
        //   494: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   497: aload           10
        //   499: invokevirtual   java/lang/UnsatisfiedLinkError.getMessage:()Ljava/lang/String;
        //   502: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   505: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   508: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   511: goto            79
        //   514: ldc_w           "jna.nosys"
        //   517: invokestatic    java/lang/Boolean.getBoolean:(Ljava/lang/String;)Z
        //   520: ifne            577
        //   523: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   526: ifeq            555
        //   529: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   532: new             Ljava/lang/StringBuilder;
        //   535: dup            
        //   536: invokespecial   java/lang/StringBuilder.<init>:()V
        //   539: ldc_w           "Trying (via loadLibrary) "
        //   542: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   545: aload_2         /* bootPath */
        //   546: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   549: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   552: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   555: aload_2         /* bootPath */
        //   556: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //   559: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //   562: ifeq            574
        //   565: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   568: ldc_w           "Found jnidispatch on system path"
        //   571: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   574: return         
        //   575: astore          4
        //   577: ldc_w           "jna.noclasspath"
        //   580: invokestatic    java/lang/Boolean.getBoolean:(Ljava/lang/String;)Z
        //   583: ifne            592
        //   586: invokestatic    com/sun/jna/Native.loadNativeDispatchLibraryFromClasspath:()V
        //   589: goto            603
        //   592: new             Ljava/lang/UnsatisfiedLinkError;
        //   595: dup            
        //   596: ldc_w           "Unable to locate JNA native support library"
        //   599: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   602: athrow         
        //   603: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      12     15     45     Ljava/io/IOException;
        //  173    258    259    261    Ljava/lang/UnsatisfiedLinkError;
        //  382    467    468    511    Ljava/lang/UnsatisfiedLinkError;
        //  523    574    575    577    Ljava/lang/UnsatisfiedLinkError;
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
    
    private static void loadNativeDispatchLibraryFromClasspath() {
        try {
            final File fromResourcePath = extractFromResourcePath("/com/sun/jna/" + Platform.RESOURCE_PREFIX + "/" + System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib"), Native.class.getClassLoader());
            if (fromResourcePath == null && fromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            if (Native.DEBUG_JNA_LOAD) {
                System.out.println("Trying " + fromResourcePath.getAbsolutePath());
            }
            System.setProperty("jnidispatch.path", fromResourcePath.getAbsolutePath());
            System.load(fromResourcePath.getAbsolutePath());
            Native.jnidispatchPath = fromResourcePath.getAbsolutePath();
            if (Native.DEBUG_JNA_LOAD) {
                System.out.println("Found jnidispatch at " + Native.jnidispatchPath);
            }
            if (isUnpacked(fromResourcePath) && !Boolean.getBoolean("jnidispatch.preserve")) {
                deleteLibrary(fromResourcePath);
            }
        }
        catch (final IOException ex) {
            throw new UnsatisfiedLinkError(ex.getMessage());
        }
    }
    
    public static boolean isUnpacked(final File file) {
        return file.getName().startsWith("jna");
    }
    
    public static File extractFromResourcePath(final String name) throws IOException {
        return extractFromResourcePath(name, null);
    }
    
    public static File extractFromResourcePath(final String name, final ClassLoader loader) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            23
        //     6: getstatic       com/sun/jna/Native.DEBUG_JNA_LOAD:Z
        //     9: ifeq            27
        //    12: aload_0         /* name */
        //    13: ldc_w           "jnidispatch"
        //    16: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    19: iconst_m1      
        //    20: if_icmpeq       27
        //    23: iconst_1       
        //    24: goto            28
        //    27: iconst_0       
        //    28: istore          4
        //    30: aload_1         /* loader */
        //    31: ifnonnull       51
        //    34: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    37: invokevirtual   java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
        //    40: astore_1        /* loader */
        //    41: aload_1         /* loader */
        //    42: ifnonnull       51
        //    45: ldc             Lcom/sun/jna/Native;.class
        //    47: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    50: astore_1        /* loader */
        //    51: iload           4
        //    53: ifeq            92
        //    56: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    59: new             Ljava/lang/StringBuilder;
        //    62: dup            
        //    63: invokespecial   java/lang/StringBuilder.<init>:()V
        //    66: ldc_w           "Looking in classpath from "
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: aload_1         /* loader */
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    76: ldc_w           " for "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_0         /* name */
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    89: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    92: aload_0         /* name */
        //    93: ldc_w           "/"
        //    96: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    99: ifeq            106
        //   102: aload_0         /* name */
        //   103: goto            110
        //   106: aload_0         /* name */
        //   107: invokestatic    com/sun/jna/NativeLibrary.mapSharedLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //   110: astore          5
        //   112: aload_0         /* name */
        //   113: ldc_w           "/"
        //   116: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   119: ifeq            126
        //   122: aload_0         /* name */
        //   123: goto            153
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: getstatic       com/sun/jna/Platform.RESOURCE_PREFIX:Ljava/lang/String;
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: ldc_w           "/"
        //   142: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   145: aload           5
        //   147: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   150: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   153: astore          6
        //   155: aload           6
        //   157: ldc_w           "/"
        //   160: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   163: ifeq            174
        //   166: aload           6
        //   168: iconst_1       
        //   169: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   172: astore          6
        //   174: aload_1         /* loader */
        //   175: aload           6
        //   177: invokevirtual   java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
        //   180: astore          7
        //   182: aload           7
        //   184: ifnonnull       206
        //   187: aload           url
        //   189: getstatic       com/sun/jna/Platform.RESOURCE_PREFIX:Ljava/lang/String;
        //   192: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   195: ifeq            206
        //   198: aload_1         /* loader */
        //   199: aload           resourcePath
        //   201: invokevirtual   java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
        //   204: astore          7
        //   206: aload           7
        //   208: ifnonnull       287
        //   211: ldc_w           "java.class.path"
        //   214: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   217: astore          8
        //   219: aload_1         /* loader */
        //   220: instanceof      Ljava/net/URLClassLoader;
        //   223: ifeq            241
        //   226: aload_1         /* loader */
        //   227: checkcast       Ljava/net/URLClassLoader;
        //   230: invokevirtual   java/net/URLClassLoader.getURLs:()[Ljava/net/URL;
        //   233: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   236: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   239: astore          8
        //   241: new             Ljava/io/IOException;
        //   244: dup            
        //   245: new             Ljava/lang/StringBuilder;
        //   248: dup            
        //   249: invokespecial   java/lang/StringBuilder.<init>:()V
        //   252: ldc_w           "Native library ("
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: aload           url
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: ldc_w           ") not found in resource path ("
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: aload           8
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: ldc_w           ")"
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   283: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   286: athrow         
        //   287: iload           libname
        //   289: ifeq            319
        //   292: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   295: new             Ljava/lang/StringBuilder;
        //   298: dup            
        //   299: invokespecial   java/lang/StringBuilder.<init>:()V
        //   302: ldc_w           "Found library resource at "
        //   305: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   308: aload           7
        //   310: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   313: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   316: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   319: aconst_null    
        //   320: astore          8
        //   322: aload           lib
        //   324: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   327: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   330: ldc_w           "file"
        //   333: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   336: ifeq            457
        //   339: new             Ljava/io/File;
        //   342: dup            
        //   343: new             Ljava/net/URI;
        //   346: dup            
        //   347: aload           lib
        //   349: invokevirtual   java/net/URL.toString:()Ljava/lang/String;
        //   352: invokespecial   java/net/URI.<init>:(Ljava/lang/String;)V
        //   355: invokespecial   java/io/File.<init>:(Ljava/net/URI;)V
        //   358: astore          8
        //   360: goto            379
        //   363: astore          9
        //   365: new             Ljava/io/File;
        //   368: dup            
        //   369: aload           lib
        //   371: invokevirtual   java/net/URL.getPath:()Ljava/lang/String;
        //   374: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   377: astore          e
        //   379: iload           libname
        //   381: ifeq            414
        //   384: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   387: new             Ljava/lang/StringBuilder;
        //   390: dup            
        //   391: invokespecial   java/lang/StringBuilder.<init>:()V
        //   394: ldc_w           "Looking in "
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: aload           8
        //   402: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   405: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   408: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   411: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   414: aload           8
        //   416: invokevirtual   java/io/File.exists:()Z
        //   419: ifne            702
        //   422: new             Ljava/io/IOException;
        //   425: dup            
        //   426: new             Ljava/lang/StringBuilder;
        //   429: dup            
        //   430: invokespecial   java/lang/StringBuilder.<init>:()V
        //   433: ldc_w           "File URL "
        //   436: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   439: aload           lib
        //   441: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   444: ldc_w           " could not be properly decoded"
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   453: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   456: athrow         
        //   457: ldc_w           "jna.nounpack"
        //   460: invokestatic    java/lang/Boolean.getBoolean:(Ljava/lang/String;)Z
        //   463: ifne            702
        //   466: aload_1         /* loader */
        //   467: aload           url
        //   469: invokevirtual   java/lang/ClassLoader.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   472: astore          9
        //   474: aload           9
        //   476: ifnonnull       508
        //   479: new             Ljava/io/IOException;
        //   482: dup            
        //   483: new             Ljava/lang/StringBuilder;
        //   486: dup            
        //   487: invokespecial   java/lang/StringBuilder.<init>:()V
        //   490: ldc_w           "Can't obtain InputStream for "
        //   493: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   496: aload           url
        //   498: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   501: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   504: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   507: athrow         
        //   508: aconst_null    
        //   509: astore          10
        //   511: invokestatic    com/sun/jna/Native.getTempDir:()Ljava/io/File;
        //   514: astore          11
        //   516: ldc             "jna"
        //   518: invokestatic    com/sun/jna/Platform.isWindows:()Z
        //   521: ifeq            530
        //   524: ldc_w           ".dll"
        //   527: goto            531
        //   530: aconst_null    
        //   531: aload           11
        //   533: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
        //   536: astore          is
        //   538: ldc_w           "jnidispatch.preserve"
        //   541: invokestatic    java/lang/Boolean.getBoolean:(Ljava/lang/String;)Z
        //   544: ifne            552
        //   547: aload           is
        //   549: invokevirtual   java/io/File.deleteOnExit:()V
        //   552: new             Ljava/io/FileOutputStream;
        //   555: dup            
        //   556: aload           is
        //   558: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   561: astore          dir
        //   563: sipush          1024
        //   566: newarray        B
        //   568: astore          12
        //   570: aload           fos
        //   572: aload           12
        //   574: iconst_0       
        //   575: aload           12
        //   577: arraylength    
        //   578: invokevirtual   java/io/InputStream.read:([BII)I
        //   581: dup            
        //   582: istore          13
        //   584: ifle            600
        //   587: aload           dir
        //   589: aload           count
        //   591: iconst_0       
        //   592: iload           13
        //   594: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   597: goto            570
        //   600: aload           fos
        //   602: invokevirtual   java/io/InputStream.close:()V
        //   605: goto            610
        //   608: astore          11
        //   610: aload           10
        //   612: ifnull          702
        //   615: aload           10
        //   617: invokevirtual   java/io/FileOutputStream.close:()V
        //   620: goto            702
        //   623: astore          11
        //   625: goto            702
        //   628: astore          11
        //   630: new             Ljava/io/IOException;
        //   633: dup            
        //   634: new             Ljava/lang/StringBuilder;
        //   637: dup            
        //   638: invokespecial   java/lang/StringBuilder.<init>:()V
        //   641: ldc_w           "Failed to create temporary file for "
        //   644: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   647: aload_0         /* name */
        //   648: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   651: ldc_w           " library: "
        //   654: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   657: aload           11
        //   659: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   662: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   665: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   668: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   671: athrow         
        //   672: astore          14
        //   674: aload           fos
        //   676: invokevirtual   java/io/InputStream.close:()V
        //   679: goto            684
        //   682: astore          15
        //   684: aload           10
        //   686: ifnull          699
        //   689: aload           10
        //   691: invokevirtual   java/io/FileOutputStream.close:()V
        //   694: goto            699
        //   697: astore          15
        //   699: aload           14
        //   701: athrow         
        //   702: aload           is
        //   704: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  339    360    363    379    Ljava/net/URISyntaxException;
        //  600    605    608    610    Ljava/io/IOException;
        //  615    620    623    628    Ljava/io/IOException;
        //  511    600    628    672    Ljava/io/IOException;
        //  511    600    672    702    Any
        //  674    679    682    684    Ljava/io/IOException;
        //  689    694    697    699    Ljava/io/IOException;
        //  628    674    672    702    Any
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
    
    private static native int sizeof(final int p0);
    
    private static native String getNativeVersion();
    
    private static native String getAPIChecksum();
    
    public static native int getLastError();
    
    public static native void setLastError(final int p0);
    
    public static Library synchronizedLibrary(final Library library) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokestatic    java/lang/reflect/Proxy.isProxyClass:(Ljava/lang/Class;)Z
        //     9: ifne            23
        //    12: new             Ljava/lang/IllegalArgumentException;
        //    15: dup            
        //    16: ldc_w           "Library must be a proxy class"
        //    19: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    22: athrow         
        //    23: aload_0         /* library */
        //    24: invokestatic    java/lang/reflect/Proxy.getInvocationHandler:(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
        //    27: astore          4
        //    29: aload           4
        //    31: instanceof      Lcom/sun/jna/Library$Handler;
        //    34: ifne            66
        //    37: new             Ljava/lang/IllegalArgumentException;
        //    40: dup            
        //    41: new             Ljava/lang/StringBuilder;
        //    44: dup            
        //    45: invokespecial   java/lang/StringBuilder.<init>:()V
        //    48: ldc_w           "Unrecognized proxy handler: "
        //    51: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    54: aload           4
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    59: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    62: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    65: athrow         
        //    66: aload           4
        //    68: checkcast       Lcom/sun/jna/Library$Handler;
        //    71: astore          5
        //    73: new             Lcom/sun/jna/Native$3;
        //    76: dup            
        //    77: aload           5
        //    79: aload_0         /* library */
        //    80: invokespecial   com/sun/jna/Native$3.<init>:(Lcom/sun/jna/Library$Handler;Lcom/sun/jna/Library;)V
        //    83: astore          6
        //    85: aload_3         /* ih */
        //    86: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    89: aload_3         /* ih */
        //    90: invokevirtual   java/lang/Class.getInterfaces:()[Ljava/lang/Class;
        //    93: aload           6
        //    95: invokestatic    java/lang/reflect/Proxy.newProxyInstance:(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
        //    98: checkcast       Lcom/sun/jna/Library;
        //   101: areturn        
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
    
    public static String getWebStartLibraryPath(final String libName) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //     6: ifnonnull       11
        //     9: aconst_null    
        //    10: areturn        
        //    11: ldc             Lcom/sun/jna/Native;.class
        //    13: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    16: astore_3       
        //    17: new             Lcom/sun/jna/Native$4;
        //    20: dup            
        //    21: invokespecial   com/sun/jna/Native$4.<init>:()V
        //    24: invokestatic    java/security/AccessController.doPrivileged:(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/reflect/Method;
        //    30: astore          4
        //    32: aload           4
        //    34: aload_3         /* m */
        //    35: iconst_1       
        //    36: anewarray       Ljava/lang/Object;
        //    39: dup            
        //    40: iconst_0       
        //    41: aload_0         /* libName */
        //    42: aastore        
        //    43: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    46: checkcast       Ljava/lang/String;
        //    49: astore          5
        //    51: aload           5
        //    53: ifnull          69
        //    56: new             Ljava/io/File;
        //    59: dup            
        //    60: aload           5
        //    62: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    65: invokevirtual   java/io/File.getParent:()Ljava/lang/String;
        //    68: areturn        
        //    69: aconst_null    
        //    70: areturn        
        //    71: astore_3        /* m */
        //    72: aconst_null    
        //    73: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     68     71     74     Ljava/lang/Exception;
        //  69     70     71     74     Ljava/lang/Exception;
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
    
    public static void markTemporaryFile(final File file) {
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static File getTempDir() throws IOException {
        final String property = System.getProperty("jna.tmpdir");
        File file;
        File tmp = null;
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        }
        else {
            final File parent = new File(System.getProperty("java.io.tmpdir"));
            tmp = new File(parent, "jna-" + System.getProperty("user.name").hashCode());
            tmp.mkdirs();
            if (!tmp.exists() || !tmp.canWrite()) {
                tmp = parent;
            }
        }
        if (!tmp.exists()) {
            throw new IOException("JNA temporary directory '" + file + "' does not exist");
        }
        if (!file.canWrite()) {
            throw new IOException("JNA temporary directory '" + file + "' is not writable");
        }
        return file;
    }
    
    public static void removeTemporaryFiles() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: new             Lcom/sun/jna/Native$5;
        //     7: dup            
        //     8: invokespecial   com/sun/jna/Native$5.<init>:()V
        //    11: astore_3       
        //    12: aload_2         /* filter */
        //    13: aload_3        
        //    14: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    17: astore          4
        //    19: iconst_0       
        //    20: istore          5
        //    22: aload           i
        //    24: ifnull          108
        //    27: iload           5
        //    29: aload           i
        //    31: arraylength    
        //    32: if_icmpge       108
        //    35: aload           i
        //    37: iload           5
        //    39: aaload         
        //    40: astore          6
        //    42: aload           6
        //    44: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    47: astore          7
        //    49: aload           7
        //    51: iconst_0       
        //    52: aload           7
        //    54: invokevirtual   java/lang/String.length:()I
        //    57: iconst_2       
        //    58: isub           
        //    59: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    62: astore          7
        //    64: new             Ljava/io/File;
        //    67: dup            
        //    68: aload           name
        //    70: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    73: aload           7
        //    75: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    78: astore          8
        //    80: aload           8
        //    82: invokevirtual   java/io/File.exists:()Z
        //    85: ifeq            96
        //    88: aload           8
        //    90: invokevirtual   java/io/File.delete:()Z
        //    93: ifeq            102
        //    96: aload           name
        //    98: invokevirtual   java/io/File.delete:()Z
        //   101: pop            
        //   102: iinc            marker, 1
        //   105: goto            22
        //   108: return         
        //    Exceptions:
        //  throws java.io.IOException
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
    
    public static int getNativeSize(final Class<?> type, final Object value) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.isArray:()Z
        //     4: ifeq            66
        //     7: aload_1         /* value */
        //     8: invokestatic    java/lang/reflect/Array.getLength:(Ljava/lang/Object;)I
        //    11: istore          4
        //    13: iload           4
        //    15: ifle            38
        //    18: aload_1         /* value */
        //    19: iconst_0       
        //    20: invokestatic    java/lang/reflect/Array.get:(Ljava/lang/Object;I)Ljava/lang/Object;
        //    23: astore          5
        //    25: iload           o
        //    27: aload_0         /* type */
        //    28: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //    31: aload           5
        //    33: invokestatic    com/sun/jna/Native.getNativeSize:(Ljava/lang/Class;Ljava/lang/Object;)I
        //    36: imul           
        //    37: ireturn        
        //    38: new             Ljava/lang/IllegalArgumentException;
        //    41: dup            
        //    42: new             Ljava/lang/StringBuilder;
        //    45: dup            
        //    46: invokespecial   java/lang/StringBuilder.<init>:()V
        //    49: ldc_w           "Arrays of length zero not allowed: "
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_0         /* type */
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    59: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    62: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    65: athrow         
        //    66: ldc_w           Lcom/sun/jna/Structure;.class
        //    69: aload_0         /* type */
        //    70: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    73: ifeq            95
        //    76: ldc_w           Lcom/sun/jna/Structure$ByReference;.class
        //    79: aload_0         /* type */
        //    80: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    83: ifne            95
        //    86: aload_0         /* type */
        //    87: aload_1         /* value */
        //    88: checkcast       Lcom/sun/jna/Structure;
        //    91: invokestatic    com/sun/jna/Structure.size:(Ljava/lang/Class;Lcom/sun/jna/Structure;)I
        //    94: ireturn        
        //    95: aload_0         /* type */
        //    96: invokestatic    com/sun/jna/Native.getNativeSize:(Ljava/lang/Class;)I
        //    99: ireturn        
        //   100: astore          4
        //   102: new             Ljava/lang/IllegalArgumentException;
        //   105: dup            
        //   106: new             Ljava/lang/StringBuilder;
        //   109: dup            
        //   110: invokespecial   java/lang/StringBuilder.<init>:()V
        //   113: ldc_w           "The type \""
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_0         /* type */
        //   120: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: ldc_w           "\" is not supported: "
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: aload           4
        //   134: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   143: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   146: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;Ljava/lang/Object;)I
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  95     99     100    147    Ljava/lang/IllegalArgumentException;
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
    
    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 2;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return Native.WCHAR_SIZE;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 8;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return 4;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return 8;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            if (Structure$ByValue.class.isAssignableFrom(cls)) {
                return Structure.size(cls);
            }
            return Native.POINTER_SIZE;
        }
        else {
            if (Pointer.class.isAssignableFrom(cls) || (Platform.HAS_BUFFERS && Native$Buffers.isBuffer(cls)) || Callback.class.isAssignableFrom(cls) || String.class == cls || WString.class == cls) {
                return Native.POINTER_SIZE;
            }
            throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
        }
    }
    
    public static boolean isSupportedNativeType(final Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            return getNativeSize(cls) != 0;
        }
        catch (final IllegalArgumentException ex) {
            return false;
        }
    }
    
    public static void setCallbackExceptionHandler(final Callback$UncaughtExceptionHandler eh) {
        Native.callbackExceptionHandler = ((eh == null) ? Native.DEFAULT_HANDLER : eh);
    }
    
    public static Callback$UncaughtExceptionHandler getCallbackExceptionHandler() {
        return Native.callbackExceptionHandler;
    }
    
    public static void register(final String libName) {
        register(findDirectMappedClass(getCallingClass()), libName);
    }
    
    public static void register(final NativeLibrary lib) {
        register(findDirectMappedClass(getCallingClass()), lib);
    }
    
    public static Class<?> findDirectMappedClass(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //     4: astore_3       
        //     5: aload_3        
        //     6: astore          4
        //     8: aload           4
        //    10: arraylength    
        //    11: istore          5
        //    13: iconst_0       
        //    14: istore          6
        //    16: iload           6
        //    18: iload           5
        //    20: if_icmpge       50
        //    23: aload           4
        //    25: iload           6
        //    27: aaload         
        //    28: astore          7
        //    30: aload           7
        //    32: invokevirtual   java/lang/reflect/Method.getModifiers:()I
        //    35: sipush          256
        //    38: iand           
        //    39: ifeq            44
        //    42: aload_0         /* cls */
        //    43: areturn        
        //    44: iinc            m, 1
        //    47: goto            16
        //    50: aload_0         /* cls */
        //    51: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    54: ldc_w           "$"
        //    57: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //    60: istore          4
        //    62: iload           4
        //    64: iconst_m1      
        //    65: if_icmpeq       96
        //    68: aload_0         /* cls */
        //    69: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    72: iconst_0       
        //    73: iload           4
        //    75: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    78: astore          5
        //    80: aload           5
        //    82: iconst_1       
        //    83: aload_0         /* cls */
        //    84: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    87: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    90: invokestatic    com/sun/jna/Native.findDirectMappedClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    93: areturn        
        //    94: astore          6
        //    96: new             Ljava/lang/IllegalArgumentException;
        //    99: dup            
        //   100: new             Ljava/lang/StringBuilder;
        //   103: dup            
        //   104: invokespecial   java/lang/StringBuilder.<init>:()V
        //   107: ldc_w           "Can't determine class with native methods from the current context ("
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload_0         /* cls */
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   117: ldc_w           ")"
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   129: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/Class<*>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  80     93     94     96     Ljava/lang/ClassNotFoundException;
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
    
    public static Class<?> getCallingClass() {
        final Class<?>[] classContext = new Native$6().getClassContext();
        if (classContext == null) {
            throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length < 4) {
            throw new IllegalStateException("This method must be called from the static initializer of a class");
        }
        return classContext[3];
    }
    
    public static void setCallbackThreadInitializer(final Callback cb, final CallbackThreadInitializer initializer) {
        CallbackReference.setCallbackThreadInitializer(cb, initializer);
    }
    
    private static void unregisterAll() {
        synchronized (Native.registeredClasses) {
            for (final Map.Entry entry : Native.registeredClasses.entrySet()) {
                unregister((Class<?>)entry.getKey(), (long[])entry.getValue());
            }
            Native.registeredClasses.clear();
        }
    }
    
    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }
    
    public static void unregister(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_3       
        //     5: monitorenter   
        //     6: getstatic       com/sun/jna/Native.registeredClasses:Ljava/util/Map;
        //     9: aload_0         /* cls */
        //    10: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       [J
        //    18: astore          4
        //    20: aload           4
        //    22: ifnull          51
        //    25: aload_0         /* cls */
        //    26: aload           4
        //    28: invokestatic    com/sun/jna/Native.unregister:(Ljava/lang/Class;[J)V
        //    31: getstatic       com/sun/jna/Native.registeredClasses:Ljava/util/Map;
        //    34: aload_0         /* cls */
        //    35: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    40: pop            
        //    41: getstatic       com/sun/jna/Native.registeredLibraries:Ljava/util/Map;
        //    44: aload_0         /* cls */
        //    45: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: pop            
        //    51: aload_3        
        //    52: monitorexit    
        //    53: goto            63
        //    56: astore          5
        //    58: aload_3        
        //    59: monitorexit    
        //    60: aload           5
        //    62: athrow         
        //    63: return         
        //    Signature:
        //  (Ljava/lang/Class<*>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      53     56     63     Any
        //  56     60     56     63     Any
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
    
    public static boolean registered(final Class<?> cls) {
        synchronized (Native.registeredClasses) {
            return Native.registeredClasses.containsKey(cls);
        }
    }
    
    private static native void unregister(final Class<?> p0, final long[] p1);
    
    public static String getSignature(final Class<?> cls) {
        if (cls.isArray()) {
            return "[" + getSignature(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return "V";
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return "S";
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        return "L" + replace(".", "/", cls.getName()) + ";";
    }
    
    public static String replace(final String s1, final String s2, final String str) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore          5
        //     9: aload_2         /* str */
        //    10: aload_0         /* s1 */
        //    11: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    14: istore          6
        //    16: iload           6
        //    18: iconst_m1      
        //    19: if_icmpne       32
        //    22: aload           idx
        //    24: aload_2         /* str */
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: pop            
        //    29: goto            67
        //    32: aload           idx
        //    34: aload_2         /* str */
        //    35: iconst_0       
        //    36: iload           6
        //    38: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload           idx
        //    47: aload_1         /* s2 */
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: aload_2         /* str */
        //    53: iload           6
        //    55: aload_0         /* s1 */
        //    56: invokevirtual   java/lang/String.length:()I
        //    59: iadd           
        //    60: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    63: astore_2        /* str */
        //    64: goto            9
        //    67: aload           5
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: areturn        
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
    
    private static int getConversion(final Class<?> type, final TypeMapper mapper) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           Ljava/lang/Boolean;.class
        //     4: if_acmpne       14
        //     7: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    10: astore_0        /* type */
        //    11: goto            121
        //    14: aload_0         /* type */
        //    15: ldc_w           Ljava/lang/Byte;.class
        //    18: if_acmpne       28
        //    21: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //    24: astore_0        /* type */
        //    25: goto            121
        //    28: aload_0         /* type */
        //    29: ldc_w           Ljava/lang/Short;.class
        //    32: if_acmpne       42
        //    35: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //    38: astore_0        /* type */
        //    39: goto            121
        //    42: aload_0         /* type */
        //    43: ldc_w           Ljava/lang/Character;.class
        //    46: if_acmpne       56
        //    49: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //    52: astore_0        /* type */
        //    53: goto            121
        //    56: aload_0         /* type */
        //    57: ldc             Ljava/lang/Integer;.class
        //    59: if_acmpne       69
        //    62: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    65: astore_0        /* type */
        //    66: goto            121
        //    69: aload_0         /* type */
        //    70: ldc_w           Ljava/lang/Long;.class
        //    73: if_acmpne       83
        //    76: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //    79: astore_0        /* type */
        //    80: goto            121
        //    83: aload_0         /* type */
        //    84: ldc             Ljava/lang/Float;.class
        //    86: if_acmpne       96
        //    89: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //    92: astore_0        /* type */
        //    93: goto            121
        //    96: aload_0         /* type */
        //    97: ldc_w           Ljava/lang/Double;.class
        //   100: if_acmpne       110
        //   103: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   106: astore_0        /* type */
        //   107: goto            121
        //   110: aload_0         /* type */
        //   111: ldc_w           Ljava/lang/Void;.class
        //   114: if_acmpne       121
        //   117: getstatic       java/lang/Void.TYPE:Ljava/lang/Class;
        //   120: astore_0        /* type */
        //   121: aload_1         /* mapper */
        //   122: ifnull          219
        //   125: aload_1         /* mapper */
        //   126: aload_0         /* type */
        //   127: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   132: astore          4
        //   134: aload_1         /* mapper */
        //   135: aload_0         /* type */
        //   136: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //   141: astore          5
        //   143: aload           toNative
        //   145: ifnull          181
        //   148: aload           toNative
        //   150: invokeinterface com/sun/jna/FromNativeConverter.nativeType:()Ljava/lang/Class;
        //   155: astore          6
        //   157: aload           6
        //   159: ldc             Ljava/lang/String;.class
        //   161: if_acmpne       167
        //   164: bipush          24
        //   166: ireturn        
        //   167: aload           6
        //   169: ldc_w           Lcom/sun/jna/WString;.class
        //   172: if_acmpne       178
        //   175: bipush          25
        //   177: ireturn        
        //   178: bipush          23
        //   180: ireturn        
        //   181: aload           nativeType
        //   183: ifnull          219
        //   186: aload           5
        //   188: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //   193: astore          6
        //   195: aload           6
        //   197: ldc             Ljava/lang/String;.class
        //   199: if_acmpne       205
        //   202: bipush          24
        //   204: ireturn        
        //   205: aload           6
        //   207: ldc_w           Lcom/sun/jna/WString;.class
        //   210: if_acmpne       216
        //   213: bipush          25
        //   215: ireturn        
        //   216: bipush          23
        //   218: ireturn        
        //   219: ldc             Lcom/sun/jna/Pointer;.class
        //   221: aload_0         /* type */
        //   222: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   225: ifeq            230
        //   228: iconst_1       
        //   229: ireturn        
        //   230: ldc             Ljava/lang/String;.class
        //   232: aload_0         /* type */
        //   233: if_acmpne       238
        //   236: iconst_2       
        //   237: ireturn        
        //   238: ldc_w           Lcom/sun/jna/WString;.class
        //   241: aload_0         /* type */
        //   242: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   245: ifeq            251
        //   248: bipush          20
        //   250: ireturn        
        //   251: getstatic       com/sun/jna/Platform.HAS_BUFFERS:Z
        //   254: ifeq            266
        //   257: aload_0         /* type */
        //   258: invokestatic    com/sun/jna/Native$Buffers.isBuffer:(Ljava/lang/Class;)Z
        //   261: ifeq            266
        //   264: iconst_5       
        //   265: ireturn        
        //   266: ldc_w           Lcom/sun/jna/Structure;.class
        //   269: aload_0         /* type */
        //   270: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   273: ifeq            290
        //   276: ldc_w           Lcom/sun/jna/Structure$ByValue;.class
        //   279: aload_0         /* type */
        //   280: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   283: ifeq            288
        //   286: iconst_4       
        //   287: ireturn        
        //   288: iconst_3       
        //   289: ireturn        
        //   290: aload_0         /* type */
        //   291: invokevirtual   java/lang/Class.isArray:()Z
        //   294: ifeq            444
        //   297: aload_0         /* type */
        //   298: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   301: iconst_1       
        //   302: invokevirtual   java/lang/String.charAt:(I)C
        //   305: tableswitch {
        //              132: 423
        //              133: 429
        //              134: 441
        //              135: 444
        //              136: 438
        //              137: 444
        //              138: 444
        //              139: 432
        //              140: 435
        //              141: 444
        //              142: 444
        //              143: 444
        //              144: 444
        //              145: 444
        //              146: 444
        //              147: 444
        //              148: 444
        //              149: 426
        //              150: 444
        //              151: 444
        //              152: 444
        //              153: 444
        //              154: 444
        //              155: 444
        //              156: 420
        //          default: 444
        //        }
        //   420: bipush          13
        //   422: ireturn        
        //   423: bipush          6
        //   425: ireturn        
        //   426: bipush          7
        //   428: ireturn        
        //   429: bipush          8
        //   431: ireturn        
        //   432: bipush          9
        //   434: ireturn        
        //   435: bipush          10
        //   437: ireturn        
        //   438: bipush          11
        //   440: ireturn        
        //   441: bipush          12
        //   443: ireturn        
        //   444: aload_0         /* type */
        //   445: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   448: ifeq            465
        //   451: aload_0         /* type */
        //   452: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   455: if_acmpne       463
        //   458: bipush          14
        //   460: goto            464
        //   463: iconst_0       
        //   464: ireturn        
        //   465: ldc_w           Lcom/sun/jna/Callback;.class
        //   468: aload_0         /* type */
        //   469: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   472: ifeq            478
        //   475: bipush          15
        //   477: ireturn        
        //   478: ldc_w           Lcom/sun/jna/IntegerType;.class
        //   481: aload_0         /* type */
        //   482: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   485: ifeq            491
        //   488: bipush          21
        //   490: ireturn        
        //   491: ldc_w           Lcom/sun/jna/PointerType;.class
        //   494: aload_0         /* type */
        //   495: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   498: ifeq            504
        //   501: bipush          22
        //   503: ireturn        
        //   504: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   507: aload_0         /* type */
        //   508: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   511: ifeq            547
        //   514: aload_0         /* type */
        //   515: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   518: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   521: astore          4
        //   523: aload           4
        //   525: ldc             Ljava/lang/String;.class
        //   527: if_acmpne       533
        //   530: bipush          18
        //   532: ireturn        
        //   533: aload           4
        //   535: ldc_w           Lcom/sun/jna/WString;.class
        //   538: if_acmpne       544
        //   541: bipush          19
        //   543: ireturn        
        //   544: bipush          17
        //   546: ireturn        
        //   547: iconst_m1      
        //   548: ireturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Lcom/sun/jna/TypeMapper;)I
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
    
    public static void register(final Class<?> cls, final String libName) {
        register(cls, NativeLibrary.getInstance(libName, Collections.singletonMap("classloader", cls.getClassLoader())));
    }
    
    public static void register(final Class<?> cls, final NativeLibrary lib) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //     4: astore          4
        //     6: new             Ljava/util/ArrayList;
        //     9: dup            
        //    10: invokespecial   java/util/ArrayList.<init>:()V
        //    13: astore          5
        //    15: aload_1         /* lib */
        //    16: invokevirtual   com/sun/jna/NativeLibrary.getOptions:()Ljava/util/Map;
        //    19: astore          6
        //    21: aload           6
        //    23: ldc_w           "type-mapper"
        //    26: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    31: checkcast       Lcom/sun/jna/TypeMapper;
        //    34: astore          7
        //    36: aload_0         /* cls */
        //    37: aload           mapper
        //    39: aconst_null    
        //    40: invokestatic    com/sun/jna/Native.cacheOptions:(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;
        //    43: astore          mapper
        //    45: aload           mlist
        //    47: astore          8
        //    49: aload           8
        //    51: arraylength    
        //    52: istore          9
        //    54: iconst_0       
        //    55: istore          10
        //    57: iload           10
        //    59: iload           9
        //    61: if_icmpge       99
        //    64: aload           8
        //    66: iload           10
        //    68: aaload         
        //    69: astore          11
        //    71: aload           11
        //    73: invokevirtual   java/lang/reflect/Method.getModifiers:()I
        //    76: sipush          256
        //    79: iand           
        //    80: ifeq            93
        //    83: aload           options
        //    85: aload           11
        //    87: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    92: pop            
        //    93: iinc            m, 1
        //    96: goto            57
        //    99: aload           options
        //   101: invokeinterface java/util/List.size:()I
        //   106: newarray        J
        //   108: astore          8
        //   110: iconst_0       
        //   111: istore          9
        //   113: iload           9
        //   115: aload           i
        //   117: arraylength    
        //   118: if_icmpge       1170
        //   121: aload           options
        //   123: iload           9
        //   125: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   130: checkcast       Ljava/lang/reflect/Method;
        //   133: astore          10
        //   135: ldc_w           "("
        //   138: astore          11
        //   140: aload           sig
        //   142: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   145: astore          12
        //   147: aload           sig
        //   149: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   152: astore          13
        //   154: aload           13
        //   156: arraylength    
        //   157: newarray        J
        //   159: astore          14
        //   161: aload           atypes
        //   163: arraylength    
        //   164: newarray        J
        //   166: astore          15
        //   168: aload           atypes
        //   170: arraylength    
        //   171: newarray        I
        //   173: astore          16
        //   175: aload           atypes
        //   177: arraylength    
        //   178: anewarray       Lcom/sun/jna/ToNativeConverter;
        //   181: astore          17
        //   183: aconst_null    
        //   184: astore          18
        //   186: aload           ptypes
        //   188: aload           handles
        //   190: invokestatic    com/sun/jna/Native.getConversion:(Ljava/lang/Class;Lcom/sun/jna/TypeMapper;)I
        //   193: istore          19
        //   195: iconst_0       
        //   196: istore          20
        //   198: iload           throwLastError
        //   200: tableswitch {
        //               -2: 324
        //               -1: 497
        //                0: 497
        //                1: 497
        //                2: 458
        //                3: 474
        //                4: 497
        //                5: 497
        //                6: 497
        //                7: 497
        //                8: 497
        //                9: 497
        //               10: 497
        //               11: 497
        //               12: 497
        //               13: 497
        //               14: 497
        //               15: 497
        //               16: 429
        //               17: 429
        //               18: 429
        //               19: 497
        //               20: 429
        //               21: 429
        //               22: 377
        //               23: 377
        //               24: 377
        //          default: 497
        //        }
        //   324: new             Ljava/lang/IllegalArgumentException;
        //   327: dup            
        //   328: new             Ljava/lang/StringBuilder;
        //   331: dup            
        //   332: invokespecial   java/lang/StringBuilder.<init>:()V
        //   335: aload           ptypes
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   340: ldc_w           " is not a supported return type (in method "
        //   343: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   346: aload           sig
        //   348: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   354: ldc_w           " in "
        //   357: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   360: aload_0         /* cls */
        //   361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   364: ldc_w           ")"
        //   367: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   370: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   373: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   376: athrow         
        //   377: aload           handles
        //   379: aload           ptypes
        //   381: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   386: astore          rcvt
        //   388: aload           ptypes
        //   390: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   393: ifeq            401
        //   396: aload           ptypes
        //   398: goto            403
        //   401: ldc             Lcom/sun/jna/Pointer;.class
        //   403: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   406: getfield        com/sun/jna/Pointer.peer:J
        //   409: lstore          21
        //   411: aload           rcvt
        //   413: invokeinterface com/sun/jna/FromNativeConverter.nativeType:()Ljava/lang/Class;
        //   418: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   421: getfield        com/sun/jna/Pointer.peer:J
        //   424: lstore          23
        //   426: goto            510
        //   429: ldc             Lcom/sun/jna/Pointer;.class
        //   431: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   434: getfield        com/sun/jna/Pointer.peer:J
        //   437: lstore          21
        //   439: aload           ptypes
        //   441: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   444: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   447: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   450: getfield        com/sun/jna/Pointer.peer:J
        //   453: lstore          23
        //   455: goto            510
        //   458: ldc             Lcom/sun/jna/Pointer;.class
        //   460: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   463: getfield        com/sun/jna/Pointer.peer:J
        //   466: dup2           
        //   467: lstore          23
        //   469: lstore          21
        //   471: goto            510
        //   474: ldc             Lcom/sun/jna/Pointer;.class
        //   476: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   479: getfield        com/sun/jna/Pointer.peer:J
        //   482: lstore          21
        //   484: aload           ptypes
        //   486: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   489: getfield        com/sun/jna/Pointer.peer:J
        //   492: lstore          23
        //   494: goto            510
        //   497: aload           ptypes
        //   499: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   502: getfield        com/sun/jna/Pointer.peer:J
        //   505: dup2           
        //   506: lstore          23
        //   508: lstore          21
        //   510: iconst_0       
        //   511: istore          25
        //   513: iload           25
        //   515: aload           atypes
        //   517: arraylength    
        //   518: if_icmpge       950
        //   521: aload           atypes
        //   523: iload           25
        //   525: aaload         
        //   526: astore          26
        //   528: new             Ljava/lang/StringBuilder;
        //   531: dup            
        //   532: invokespecial   java/lang/StringBuilder.<init>:()V
        //   535: aload           rclass
        //   537: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   540: aload           26
        //   542: invokestatic    com/sun/jna/Native.getSignature:(Ljava/lang/Class;)Ljava/lang/String;
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   548: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   551: astore          rclass
        //   553: aload           26
        //   555: aload           handles
        //   557: invokestatic    com/sun/jna/Native.getConversion:(Ljava/lang/Class;Lcom/sun/jna/TypeMapper;)I
        //   560: istore          27
        //   562: aload           toNative
        //   564: iload           type
        //   566: iload           27
        //   568: iastore        
        //   569: iload           27
        //   571: iconst_m1      
        //   572: if_icmpne       628
        //   575: new             Ljava/lang/IllegalArgumentException;
        //   578: dup            
        //   579: new             Ljava/lang/StringBuilder;
        //   582: dup            
        //   583: invokespecial   java/lang/StringBuilder.<init>:()V
        //   586: aload           conversionType
        //   588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   591: ldc_w           " is not a supported argument type (in method "
        //   594: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   597: aload           sig
        //   599: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   602: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   605: ldc_w           " in "
        //   608: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   611: aload_0         /* cls */
        //   612: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   615: ldc_w           ")"
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   624: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   627: athrow         
        //   628: iload           27
        //   630: bipush          17
        //   632: if_icmpeq       656
        //   635: iload           27
        //   637: bipush          18
        //   639: if_icmpeq       656
        //   642: iload           27
        //   644: bipush          19
        //   646: if_icmpeq       656
        //   649: iload           27
        //   651: bipush          21
        //   653: if_icmpne       669
        //   656: aload           conversionType
        //   658: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   661: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   664: astore          conversionType
        //   666: goto            704
        //   669: iload           27
        //   671: bipush          23
        //   673: if_icmpeq       690
        //   676: iload           27
        //   678: bipush          24
        //   680: if_icmpeq       690
        //   683: iload           27
        //   685: bipush          25
        //   687: if_icmpne       704
        //   690: aload           fromNative
        //   692: iload           type
        //   694: aload           handles
        //   696: aload           conversionType
        //   698: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //   703: aastore        
        //   704: iload           27
        //   706: tableswitch {
        //                0: 903
        //                1: 925
        //                2: 925
        //                3: 925
        //                4: 824
        //                5: 925
        //                6: 925
        //                7: 925
        //                8: 925
        //                9: 925
        //               10: 925
        //               11: 925
        //               12: 925
        //               13: 925
        //               14: 925
        //               15: 925
        //               16: 925
        //               17: 824
        //               18: 824
        //               19: 824
        //               20: 925
        //               21: 824
        //               22: 824
        //               23: 853
        //               24: 853
        //               25: 853
        //          default: 925
        //        }
        //   824: aload           closure_atypes
        //   826: iload           type
        //   828: aload           conversionType
        //   830: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   833: getfield        com/sun/jna/Pointer.peer:J
        //   836: lastore        
        //   837: aload           cvt
        //   839: iload           type
        //   841: ldc             Lcom/sun/jna/Pointer;.class
        //   843: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   846: getfield        com/sun/jna/Pointer.peer:J
        //   849: lastore        
        //   850: goto            944
        //   853: aload           cvt
        //   855: iload           type
        //   857: aload           conversionType
        //   859: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   862: ifeq            870
        //   865: aload           conversionType
        //   867: goto            872
        //   870: ldc             Lcom/sun/jna/Pointer;.class
        //   872: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   875: getfield        com/sun/jna/Pointer.peer:J
        //   878: lastore        
        //   879: aload           closure_atypes
        //   881: iload           type
        //   883: aload           fromNative
        //   885: iload           type
        //   887: aaload         
        //   888: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //   893: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   896: getfield        com/sun/jna/Pointer.peer:J
        //   899: lastore        
        //   900: goto            944
        //   903: aload           cvt
        //   905: iload           type
        //   907: aload           closure_atypes
        //   909: iload           type
        //   911: aload           conversionType
        //   913: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   916: getfield        com/sun/jna/Pointer.peer:J
        //   919: dup2_x2        
        //   920: lastore        
        //   921: lastore        
        //   922: goto            944
        //   925: aload           cvt
        //   927: iload           type
        //   929: aload           closure_atypes
        //   931: iload           type
        //   933: ldc             Lcom/sun/jna/Pointer;.class
        //   935: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   938: getfield        com/sun/jna/Pointer.peer:J
        //   941: dup2_x2        
        //   942: lastore        
        //   943: lastore        
        //   944: iinc            type, 1
        //   947: goto            513
        //   950: new             Ljava/lang/StringBuilder;
        //   953: dup            
        //   954: invokespecial   java/lang/StringBuilder.<init>:()V
        //   957: aload           rclass
        //   959: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   962: ldc_w           ")"
        //   965: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   968: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   971: astore          rclass
        //   973: new             Ljava/lang/StringBuilder;
        //   976: dup            
        //   977: invokespecial   java/lang/StringBuilder.<init>:()V
        //   980: aload           rclass
        //   982: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   985: aload           ptypes
        //   987: invokestatic    com/sun/jna/Native.getSignature:(Ljava/lang/Class;)Ljava/lang/String;
        //   990: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   993: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   996: astore          rclass
        //   998: aload           sig
        //  1000: invokevirtual   java/lang/reflect/Method.getExceptionTypes:()[Ljava/lang/Class;
        //  1003: astore          25
        //  1005: iconst_0       
        //  1006: istore          26
        //  1008: iload           26
        //  1010: aload           e
        //  1012: arraylength    
        //  1013: if_icmpge       1042
        //  1016: ldc_w           Lcom/sun/jna/LastErrorException;.class
        //  1019: aload           e
        //  1021: iload           26
        //  1023: aaload         
        //  1024: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //  1027: ifeq            1036
        //  1030: iconst_1       
        //  1031: istore          closure_rtype
        //  1033: goto            1042
        //  1036: iinc            26, 1
        //  1039: goto            1008
        //  1042: aload_1         /* lib */
        //  1043: aload           sig
        //  1045: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //  1048: aload           sig
        //  1050: invokevirtual   com/sun/jna/NativeLibrary.getFunction:(Ljava/lang/String;Ljava/lang/reflect/Method;)Lcom/sun/jna/Function;
        //  1053: astore          26
        //  1055: aload           i
        //  1057: iload           method
        //  1059: aload_0         /* cls */
        //  1060: aload           sig
        //  1062: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //  1065: aload           rclass
        //  1067: aload           toNative
        //  1069: aload           cvt
        //  1071: aload           closure_atypes
        //  1073: iload           throwLastError
        //  1075: lload           21
        //  1077: lload           23
        //  1079: aload           sig
        //  1081: aload           26
        //  1083: getfield        com/sun/jna/Function.peer:J
        //  1086: aload           26
        //  1088: invokevirtual   com/sun/jna/Function.getCallingConvention:()I
        //  1091: iload           closure_rtype
        //  1093: aload           fromNative
        //  1095: aload           rcvt
        //  1097: aload           26
        //  1099: getfield        com/sun/jna/Function.encoding:Ljava/lang/String;
        //  1102: invokestatic    com/sun/jna/Native.registerMethod:(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[I[J[JIJJLjava/lang/reflect/Method;JIZ[Lcom/sun/jna/ToNativeConverter;Lcom/sun/jna/FromNativeConverter;Ljava/lang/String;)J
        //  1105: lastore        
        //  1106: goto            1164
        //  1109: astore          27
        //  1111: new             Ljava/lang/UnsatisfiedLinkError;
        //  1114: dup            
        //  1115: new             Ljava/lang/StringBuilder;
        //  1118: dup            
        //  1119: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1122: ldc_w           "No method "
        //  1125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1128: aload           sig
        //  1130: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //  1133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1136: ldc_w           " with signature "
        //  1139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1142: aload           rclass
        //  1144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1147: ldc_w           " in "
        //  1150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1153: aload_0         /* cls */
        //  1154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1157: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1160: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //  1163: athrow         
        //  1164: iinc            method, 1
        //  1167: goto            113
        //  1170: getstatic       com/sun/jna/Native.registeredClasses:Ljava/util/Map;
        //  1173: dup            
        //  1174: astore          9
        //  1176: monitorenter   
        //  1177: getstatic       com/sun/jna/Native.registeredClasses:Ljava/util/Map;
        //  1180: aload_0         /* cls */
        //  1181: aload           8
        //  1183: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1188: pop            
        //  1189: getstatic       com/sun/jna/Native.registeredLibraries:Ljava/util/Map;
        //  1192: aload_0         /* cls */
        //  1193: aload_1         /* lib */
        //  1194: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1199: pop            
        //  1200: aload           9
        //  1202: monitorexit    
        //  1203: goto            1214
        //  1206: astore          28
        //  1208: aload           9
        //  1210: monitorexit    
        //  1211: aload           28
        //  1213: athrow         
        //  1214: return         
        //    Signature:
        //  (Ljava/lang/Class<*>;Lcom/sun/jna/NativeLibrary;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  1055   1106   1109   1164   Ljava/lang/NoSuchMethodError;
        //  1177   1203   1206   1214   Any
        //  1206   1211   1206   1214   Any
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
    
    private static Map<String, Object> cacheOptions(final Class<?> cls, final Map<String, ?> options, final Object proxy) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1         /* options */
        //     5: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //     8: astore          5
        //    10: aload           5
        //    12: ldc             "enclosing-library"
        //    14: aload_0         /* cls */
        //    15: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    20: pop            
        //    21: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //    24: dup            
        //    25: astore          6
        //    27: monitorenter   
        //    28: getstatic       com/sun/jna/Native.typeOptions:Ljava/util/Map;
        //    31: aload_0         /* cls */
        //    32: aload           5
        //    34: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    39: pop            
        //    40: aload_2         /* proxy */
        //    41: ifnull          62
        //    44: getstatic       com/sun/jna/Native.libraries:Ljava/util/Map;
        //    47: aload_0         /* cls */
        //    48: new             Ljava/lang/ref/WeakReference;
        //    51: dup            
        //    52: aload_2         /* proxy */
        //    53: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //    56: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    61: pop            
        //    62: aload_0         /* cls */
        //    63: invokevirtual   java/lang/Class.isInterface:()Z
        //    66: ifne            140
        //    69: ldc_w           Lcom/sun/jna/Library;.class
        //    72: aload_0         /* cls */
        //    73: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    76: ifeq            140
        //    79: aload_0         /* cls */
        //    80: invokevirtual   java/lang/Class.getInterfaces:()[Ljava/lang/Class;
        //    83: astore          7
        //    85: aload           7
        //    87: astore          8
        //    89: aload           8
        //    91: arraylength    
        //    92: istore          9
        //    94: iconst_0       
        //    95: istore          10
        //    97: iload           10
        //    99: iload           9
        //   101: if_icmpge       140
        //   104: aload           8
        //   106: iload           10
        //   108: aaload         
        //   109: astore          11
        //   111: ldc_w           Lcom/sun/jna/Library;.class
        //   114: aload           11
        //   116: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   119: ifeq            134
        //   122: aload           11
        //   124: aload           5
        //   126: aload_2         /* proxy */
        //   127: invokestatic    com/sun/jna/Native.cacheOptions:(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;
        //   130: pop            
        //   131: goto            140
        //   134: iinc            ifc, 1
        //   137: goto            97
        //   140: aload           ifaces
        //   142: monitorexit    
        //   143: goto            154
        //   146: astore          12
        //   148: aload           6
        //   150: monitorexit    
        //   151: aload           12
        //   153: athrow         
        //   154: aload           5
        //   156: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Ljava/util/Map<Ljava/lang/String;*>;Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  28     143    146    154    Any
        //  146    151    146    154    Any
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
    
    private static native long registerMethod(final Class<?> p0, final String p1, final String p2, final int[] p3, final long[] p4, final long[] p5, final int p6, final long p7, final long p8, final Method p9, final long p10, final int p11, final boolean p12, final ToNativeConverter[] p13, final FromNativeConverter p14, final String p15);
    
    private static NativeMapped fromNative(final Class<?> cls, final Object value) {
        return (NativeMapped)NativeMappedConverter.getInstance(cls).fromNative(value, new FromNativeContext(cls));
    }
    
    private static NativeMapped fromNative(final Method m, final Object value) {
        final Class<?> returnType = m.getReturnType();
        return (NativeMapped)NativeMappedConverter.getInstance(returnType).fromNative(value, new MethodResultContext(returnType, null, null, m));
    }
    
    private static Class<?> nativeType(final Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }
    
    private static Object toNative(final ToNativeConverter cvt, final Object o) {
        return cvt.toNative(o, new ToNativeContext());
    }
    
    private static Object fromNative(final FromNativeConverter cvt, final Object o, final Method m) {
        return cvt.fromNative(o, new MethodResultContext(m.getReturnType(), null, null, m));
    }
    
    public static native long ffi_prep_cif(final int p0, final int p1, final long p2, final long p3);
    
    public static native void ffi_call(final long p0, final long p1, final long p2, final long p3);
    
    public static native long ffi_prep_closure(final long p0, final Native$ffi_callback p1);
    
    public static native void ffi_free_closure(final long p0);
    
    public static native int initialize_ffi_type(final long p0);
    
    public static void main(final String[] args) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: ldc_w           "4.4.0"
        //     7: astore          4
        //     9: ldc_w           "4.4.0 (package information missing)"
        //    12: astore          5
        //    14: ldc             Lcom/sun/jna/Native;.class
        //    16: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    19: astore          6
        //    21: aload           6
        //    23: ifnull          34
        //    26: aload           6
        //    28: invokevirtual   java/lang/Package.getSpecificationTitle:()Ljava/lang/String;
        //    31: goto            37
        //    34: ldc_w           "Java Native Access (JNA)"
        //    37: astore          7
        //    39: aload           7
        //    41: ifnonnull       49
        //    44: ldc_w           "Java Native Access (JNA)"
        //    47: astore          7
        //    49: aload           title
        //    51: ifnull          62
        //    54: aload           title
        //    56: invokevirtual   java/lang/Package.getSpecificationVersion:()Ljava/lang/String;
        //    59: goto            65
        //    62: ldc_w           "4.4.0"
        //    65: astore          8
        //    67: aload           8
        //    69: ifnonnull       77
        //    72: ldc_w           "4.4.0"
        //    75: astore          8
        //    77: new             Ljava/lang/StringBuilder;
        //    80: dup            
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: aload           version
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: ldc_w           " API Version "
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: aload           8
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   103: astore          version
        //   105: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   108: aload           version
        //   110: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   113: aload           title
        //   115: ifnull          126
        //   118: aload           title
        //   120: invokevirtual   java/lang/Package.getImplementationVersion:()Ljava/lang/String;
        //   123: goto            129
        //   126: ldc_w           "4.4.0 (package information missing)"
        //   129: astore          8
        //   131: aload           8
        //   133: ifnonnull       141
        //   136: ldc_w           "4.4.0 (package information missing)"
        //   139: astore          8
        //   141: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: ldc_w           "Version: "
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: aload           8
        //   159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   162: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   165: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   168: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: ldc_w           " Native: "
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: invokestatic    com/sun/jna/Native.getNativeVersion:()Ljava/lang/String;
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: ldc_w           " ("
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokestatic    com/sun/jna/Native.getAPIChecksum:()Ljava/lang/String;
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: ldc_w           ")"
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   211: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   214: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   217: new             Ljava/lang/StringBuilder;
        //   220: dup            
        //   221: invokespecial   java/lang/StringBuilder.<init>:()V
        //   224: ldc_w           " Prefix: "
        //   227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   230: getstatic       com/sun/jna/Platform.RESOURCE_PREFIX:Ljava/lang/String;
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   239: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   242: return         
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
    
    public static synchronized native void freeNativeCallback(final long p0);
    
    public static synchronized native long createNativeCallback(final Callback p0, final Method p1, final Class<?>[] p2, final Class<?> p3, final int p4, final int p5, final String p6);
    
    public static native int invokeInt(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static native long invokeLong(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static native void invokeVoid(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static native float invokeFloat(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static native double invokeDouble(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static native long invokePointer(final Function p0, final long p1, final int p2, final Object[] p3);
    
    private static native void invokeStructure(final Function p0, final long p1, final int p2, final Object[] p3, final long p4, final long p5);
    
    public static Structure invokeStructure(final Function function, final long fp, final int callFlags, final Object[] args, final Structure s) {
        invokeStructure(function, fp, callFlags, args, s.getPointer().peer, s.getTypeInfo().peer);
        return s;
    }
    
    public static native Object invokeObject(final Function p0, final long p1, final int p2, final Object[] p3);
    
    public static long open(final String name) {
        return open(name, -1);
    }
    
    public static native long open(final String p0, final int p1);
    
    public static native void close(final long p0);
    
    public static native long findSymbol(final long p0, final String p1);
    
    public static native long indexOf(final Pointer p0, final long p1, final long p2, final byte p3);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final byte[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final short[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final char[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final int[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final long[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final float[] p3, final int p4, final int p5);
    
    public static native void read(final Pointer p0, final long p1, final long p2, final double[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final byte[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final short[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final char[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final int[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final long[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final float[] p3, final int p4, final int p5);
    
    public static native void write(final Pointer p0, final long p1, final long p2, final double[] p3, final int p4, final int p5);
    
    public static native byte getByte(final Pointer p0, final long p1, final long p2);
    
    public static native char getChar(final Pointer p0, final long p1, final long p2);
    
    public static native short getShort(final Pointer p0, final long p1, final long p2);
    
    public static native int getInt(final Pointer p0, final long p1, final long p2);
    
    public static native long getLong(final Pointer p0, final long p1, final long p2);
    
    public static native float getFloat(final Pointer p0, final long p1, final long p2);
    
    public static native double getDouble(final Pointer p0, final long p1, final long p2);
    
    public static Pointer getPointer(final long addr) {
        final long getPointer = _getPointer(addr);
        return (getPointer == 0L) ? null : new Pointer(getPointer);
    }
    
    private static native long _getPointer(final long p0);
    
    public static native String getWideString(final Pointer p0, final long p1, final long p2);
    
    public static String getString(final Pointer pointer, final long offset) {
        return getString(pointer, offset, getDefaultStringEncoding());
    }
    
    public static String getString(final Pointer pointer, final long offset, final String encoding) {
        final byte[] stringBytes = getStringBytes(pointer, pointer.peer, offset);
        if (encoding != null) {
            try {
                return new String(stringBytes, encoding);
            }
            catch (final UnsupportedEncodingException ex) {}
        }
        return new String(stringBytes);
    }
    
    public static native byte[] getStringBytes(final Pointer p0, final long p1, final long p2);
    
    public static native void setMemory(final Pointer p0, final long p1, final long p2, final long p3, final byte p4);
    
    public static native void setByte(final Pointer p0, final long p1, final long p2, final byte p3);
    
    public static native void setShort(final Pointer p0, final long p1, final long p2, final short p3);
    
    public static native void setChar(final Pointer p0, final long p1, final long p2, final char p3);
    
    public static native void setInt(final Pointer p0, final long p1, final long p2, final int p3);
    
    public static native void setLong(final Pointer p0, final long p1, final long p2, final long p3);
    
    public static native void setFloat(final Pointer p0, final long p1, final long p2, final float p3);
    
    public static native void setDouble(final Pointer p0, final long p1, final long p2, final double p3);
    
    public static native void setPointer(final Pointer p0, final long p1, final long p2, final long p3);
    
    public static native void setWideString(final Pointer p0, final long p1, final long p2, final String p3);
    
    public static native ByteBuffer getDirectByteBuffer(final Pointer p0, final long p1, final long p2, final long p3);
    
    public static native long malloc(final long p0);
    
    public static native void free(final long p0);
    
    @Deprecated
    public static native ByteBuffer getDirectByteBuffer(final long p0, final long p1);
    
    public static void detach(final boolean detach) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: iload_0         /* detach */
        //     5: ifeq            37
        //     8: getstatic       com/sun/jna/Native.nativeThreads:Ljava/util/Map;
        //    11: aload_3        
        //    12: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    17: pop            
        //    18: getstatic       com/sun/jna/Native.nativeThreadTerminationFlag:Ljava/lang/ThreadLocal;
        //    21: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    24: checkcast       Lcom/sun/jna/Pointer;
        //    27: astore          4
        //    29: iconst_1       
        //    30: lconst_0       
        //    31: invokestatic    com/sun/jna/Native.setDetachState:(ZJ)V
        //    34: goto            81
        //    37: getstatic       com/sun/jna/Native.nativeThreads:Ljava/util/Map;
        //    40: aload_3        
        //    41: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    46: ifne            81
        //    49: getstatic       com/sun/jna/Native.nativeThreadTerminationFlag:Ljava/lang/ThreadLocal;
        //    52: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    55: checkcast       Lcom/sun/jna/Pointer;
        //    58: astore          4
        //    60: getstatic       com/sun/jna/Native.nativeThreads:Ljava/util/Map;
        //    63: aload_3         /* p */
        //    64: aload           4
        //    66: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    71: pop            
        //    72: iconst_0       
        //    73: aload           4
        //    75: getfield        com/sun/jna/Pointer.peer:J
        //    78: invokestatic    com/sun/jna/Native.setDetachState:(ZJ)V
        //    81: return         
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
    
    public static Pointer getTerminationFlag(final Thread t) {
        return Native.nativeThreads.get(t);
    }
    
    private static native void setDetachState(final boolean p0, final long p1);
    
    static {
        DEFAULT_ENCODING = Charset.defaultCharset().name();
        Native.DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
        Native.DEBUG_JNA_LOAD = Boolean.getBoolean("jna.debug_load.jna");
        Native.jnidispatchPath = null;
        typeOptions = new WeakHashMap<Class<?>, Map<String, Object>>();
        libraries = new WeakHashMap<Class<?>, Reference<?>>();
        DEFAULT_HANDLER = new Native$1();
        Native.callbackExceptionHandler = Native.DEFAULT_HANDLER;
        loadNativeDispatchLibrary();
        if (!isCompatibleVersion("5.1.0", getNativeVersion())) {
            final String property = System.getProperty("line.separator");
            throw new Error(property + property + "There is an incompatible JNA native library installed on this system" + property + "Expected: " + "5.1.0" + property + "Found:    " + getNativeVersion() + property + ((Native.jnidispatchPath != null) ? ("(at " + Native.jnidispatchPath + ")") : System.getProperty("java.library.path")) + "." + property + "To resolve this issue you may do one of the following:" + property + " - remove or uninstall the offending library" + property + " - set the system property jna.nosys=true" + property + " - set jna.boot.library.path to include the path to the version of the " + property + "   jnidispatch library included with the JNA jar file you are using" + property);
        }
        POINTER_SIZE = sizeof(0);
        LONG_SIZE = sizeof(1);
        WCHAR_SIZE = sizeof(2);
        SIZE_T_SIZE = sizeof(3);
        BOOL_SIZE = sizeof(4);
        initIDs();
        if (Boolean.getBoolean("jna.protected")) {
            setProtected(true);
        }
        MAX_ALIGNMENT = ((Platform.isSPARC() || Platform.isWindows() || (Platform.isLinux() && (Platform.isARM() || Platform.isPPC())) || Platform.isAIX() || Platform.isAndroid()) ? 8 : Native.LONG_SIZE);
        MAX_PADDING = ((Platform.isMac() && Platform.isPPC()) ? 8 : Native.MAX_ALIGNMENT);
        System.setProperty("jna.loaded", "true");
        finalizer = new Native$2();
        Native.registeredClasses = new WeakHashMap<Class<?>, long[]>();
        Native.registeredLibraries = new WeakHashMap<Class<?>, NativeLibrary>();
        nativeThreadTerminationFlag = new Native$7();
        nativeThreads = Collections.synchronizedMap(new WeakHashMap<Thread, Pointer>());
    }
}

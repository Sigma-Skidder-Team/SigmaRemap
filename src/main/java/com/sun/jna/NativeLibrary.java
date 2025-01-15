// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.lang.ref.Reference;
import java.util.Map;

public class NativeLibrary
{
    private long handle;
    private final String libraryName;
    private final String libraryPath;
    private final Map<String, Function> functions;
    public final int callFlags;
    private String encoding;
    public final Map<String, ?> options;
    private static final Map<String, Reference<NativeLibrary>> libraries;
    private static final Map<String, List<String>> searchPaths;
    private static final List<String> librarySearchPath;
    private static final int DEFAULT_OPEN_OPTIONS = -1;
    
    private static String functionKey(final String name, final int flags, final String encoding) {
        return name + "|" + flags + "|" + encoding;
    }
    
    private NativeLibrary(final String libraryName, final String libraryPath, final long handle, final Map<String, ?> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0         /* this */
        //     5: new             Ljava/util/HashMap;
        //     8: dup            
        //     9: invokespecial   java/util/HashMap.<init>:()V
        //    12: putfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //    15: aload_0         /* this */
        //    16: aload_0         /* this */
        //    17: aload_1         /* libraryName */
        //    18: invokespecial   com/sun/jna/NativeLibrary.getLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //    21: putfield        com/sun/jna/NativeLibrary.libraryName:Ljava/lang/String;
        //    24: aload_0         /* this */
        //    25: aload_2         /* libraryPath */
        //    26: putfield        com/sun/jna/NativeLibrary.libraryPath:Ljava/lang/String;
        //    29: aload_0         /* this */
        //    30: lload_3         /* handle */
        //    31: putfield        com/sun/jna/NativeLibrary.handle:J
        //    34: aload           options
        //    36: ldc             "calling-convention"
        //    38: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: astore          8
        //    45: aload           8
        //    47: instanceof      Ljava/lang/Number;
        //    50: ifeq            64
        //    53: aload           8
        //    55: checkcast       Ljava/lang/Number;
        //    58: invokevirtual   java/lang/Number.intValue:()I
        //    61: goto            65
        //    64: iconst_0       
        //    65: istore          9
        //    67: aload_0         /* this */
        //    68: iload           9
        //    70: putfield        com/sun/jna/NativeLibrary.callFlags:I
        //    73: aload_0         /* this */
        //    74: aload           options
        //    76: putfield        com/sun/jna/NativeLibrary.options:Ljava/util/Map;
        //    79: aload_0         /* this */
        //    80: aload           options
        //    82: ldc             "string-encoding"
        //    84: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    89: checkcast       Ljava/lang/String;
        //    92: putfield        com/sun/jna/NativeLibrary.encoding:Ljava/lang/String;
        //    95: aload_0         /* this */
        //    96: getfield        com/sun/jna/NativeLibrary.encoding:Ljava/lang/String;
        //    99: ifnonnull       109
        //   102: aload_0         /* this */
        //   103: invokestatic    com/sun/jna/Native.getDefaultStringEncoding:()Ljava/lang/String;
        //   106: putfield        com/sun/jna/NativeLibrary.encoding:Ljava/lang/String;
        //   109: invokestatic    com/sun/jna/Platform.isWindows:()Z
        //   112: ifeq            196
        //   115: ldc             "kernel32"
        //   117: aload_0         /* this */
        //   118: getfield        com/sun/jna/NativeLibrary.libraryName:Ljava/lang/String;
        //   121: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   124: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   127: ifeq            196
        //   130: aload_0         /* this */
        //   131: getfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //   134: dup            
        //   135: astore          10
        //   137: monitorenter   
        //   138: new             Lcom/sun/jna/NativeLibrary$1;
        //   141: dup            
        //   142: aload_0         /* this */
        //   143: aload_0         /* this */
        //   144: ldc             "GetLastError"
        //   146: bipush          63
        //   148: aload_0         /* this */
        //   149: getfield        com/sun/jna/NativeLibrary.encoding:Ljava/lang/String;
        //   152: invokespecial   com/sun/jna/NativeLibrary$1.<init>:(Lcom/sun/jna/NativeLibrary;Lcom/sun/jna/NativeLibrary;Ljava/lang/String;ILjava/lang/String;)V
        //   155: astore          11
        //   157: aload_0         /* this */
        //   158: getfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //   161: ldc             "GetLastError"
        //   163: aload_0         /* this */
        //   164: getfield        com/sun/jna/NativeLibrary.callFlags:I
        //   167: aload_0         /* this */
        //   168: getfield        com/sun/jna/NativeLibrary.encoding:Ljava/lang/String;
        //   171: invokestatic    com/sun/jna/NativeLibrary.functionKey:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        //   174: aload           11
        //   176: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   181: pop            
        //   182: aload           f
        //   184: monitorexit    
        //   185: goto            196
        //   188: astore          12
        //   190: aload           10
        //   192: monitorexit    
        //   193: aload           12
        //   195: athrow         
        //   196: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/String;JLjava/util/Map<Ljava/lang/String;*>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  138    185    188    196    Any
        //  188    193    188    196    Any
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private static int openFlags(final Map<String, ?> options) {
        final Object value = options.get("open-flags");
        if (value instanceof Number) {
            return ((Number)value).intValue();
        }
        return -1;
    }
    
    private static NativeLibrary loadLibrary(final String libraryName, final Map<String, ?> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            36
        //     6: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: invokespecial   java/lang/StringBuilder.<init>:()V
        //    16: ldc             "Looking for library '"
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_0         /* libraryName */
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: ldc             "'"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    33: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //    36: new             Ljava/io/File;
        //    39: dup            
        //    40: aload_0         /* libraryName */
        //    41: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    44: invokevirtual   java/io/File.isAbsolute:()Z
        //    47: istore          4
        //    49: new             Ljava/util/ArrayList;
        //    52: dup            
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: astore          5
        //    58: aload_1         /* options */
        //    59: invokestatic    com/sun/jna/NativeLibrary.openFlags:(Ljava/util/Map;)I
        //    62: istore          6
        //    64: aload_0         /* libraryName */
        //    65: invokestatic    com/sun/jna/Native.getWebStartLibraryPath:(Ljava/lang/String;)Ljava/lang/String;
        //    68: astore          7
        //    70: aload           7
        //    72: ifnull          117
        //    75: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //    78: ifeq            107
        //    81: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: ldc             "Adding web start path "
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: aload           7
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   104: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   107: aload           openFlags
        //   109: aload           7
        //   111: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   116: pop            
        //   117: getstatic       com/sun/jna/NativeLibrary.searchPaths:Ljava/util/Map;
        //   120: aload_0         /* libraryName */
        //   121: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   126: checkcast       Ljava/util/List;
        //   129: astore          8
        //   131: aload           8
        //   133: ifnull          167
        //   136: aload           8
        //   138: dup            
        //   139: astore          9
        //   141: monitorenter   
        //   142: aload           openFlags
        //   144: iconst_0       
        //   145: aload           8
        //   147: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //   152: pop            
        //   153: aload           9
        //   155: monitorexit    
        //   156: goto            167
        //   159: astore          10
        //   161: aload           9
        //   163: monitorexit    
        //   164: aload           10
        //   166: athrow         
        //   167: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   170: ifeq            202
        //   173: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: ldc             "Adding paths from jna.library.path: "
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: ldc             "jna.library.path"
        //   190: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   202: aload           openFlags
        //   204: ldc             "jna.library.path"
        //   206: invokestatic    com/sun/jna/NativeLibrary.initPaths:(Ljava/lang/String;)Ljava/util/List;
        //   209: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   214: pop            
        //   215: aload_0         /* libraryName */
        //   216: aload           openFlags
        //   218: invokestatic    com/sun/jna/NativeLibrary.findLibraryPath:(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
        //   221: astore          9
        //   223: lconst_0       
        //   224: lstore          11
        //   226: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   229: ifeq            258
        //   232: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   235: new             Ljava/lang/StringBuilder;
        //   238: dup            
        //   239: invokespecial   java/lang/StringBuilder.<init>:()V
        //   242: ldc             "Trying "
        //   244: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   247: aload           9
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   258: aload           9
        //   260: iload           webstartPath
        //   262: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   265: lstore          11
        //   267: goto            316
        //   270: astore          13
        //   272: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   275: ifeq            305
        //   278: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   281: new             Ljava/lang/StringBuilder;
        //   284: dup            
        //   285: invokespecial   java/lang/StringBuilder.<init>:()V
        //   288: ldc             "Adding system paths: "
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: getstatic       com/sun/jna/NativeLibrary.librarySearchPath:Ljava/util/List;
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   299: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   302: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   305: aload           openFlags
        //   307: getstatic       com/sun/jna/NativeLibrary.librarySearchPath:Ljava/util/List;
        //   310: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   315: pop            
        //   316: lload           11
        //   318: lconst_0       
        //   319: lcmp           
        //   320: ifne            411
        //   323: aload_0         /* libraryName */
        //   324: aload           openFlags
        //   326: invokestatic    com/sun/jna/NativeLibrary.findLibraryPath:(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
        //   329: astore          9
        //   331: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   334: ifeq            363
        //   337: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   340: new             Ljava/lang/StringBuilder;
        //   343: dup            
        //   344: invokespecial   java/lang/StringBuilder.<init>:()V
        //   347: ldc             "Trying "
        //   349: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   352: aload           9
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   360: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   363: aload           9
        //   365: iload           webstartPath
        //   367: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   370: lstore          11
        //   372: lload           11
        //   374: lconst_0       
        //   375: lcmp           
        //   376: ifne            411
        //   379: new             Ljava/lang/UnsatisfiedLinkError;
        //   382: dup            
        //   383: new             Ljava/lang/StringBuilder;
        //   386: dup            
        //   387: invokespecial   java/lang/StringBuilder.<init>:()V
        //   390: ldc             "Failed to load library '"
        //   392: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   395: aload_0         /* libraryName */
        //   396: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   399: ldc             "'"
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   407: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   410: athrow         
        //   411: goto            920
        //   414: astore          13
        //   416: invokestatic    com/sun/jna/Platform.isAndroid:()Z
        //   419: ifeq            478
        //   422: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   425: ifeq            453
        //   428: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   431: new             Ljava/lang/StringBuilder;
        //   434: dup            
        //   435: invokespecial   java/lang/StringBuilder.<init>:()V
        //   438: ldc             "Preload (via System.loadLibrary) "
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: aload_0         /* libraryName */
        //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   447: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   450: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   453: aload_0         /* libraryName */
        //   454: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //   457: aload           9
        //   459: iload           webstartPath
        //   461: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   464: lstore          11
        //   466: goto            772
        //   469: astore          14
        //   471: aload           14
        //   473: astore          e2
        //   475: goto            772
        //   478: invokestatic    com/sun/jna/Platform.isLinux:()Z
        //   481: ifne            490
        //   484: invokestatic    com/sun/jna/Platform.isFreeBSD:()Z
        //   487: ifeq            570
        //   490: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   493: ifeq            504
        //   496: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   499: ldc             "Looking for version variants"
        //   501: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   504: aload_0         /* libraryName */
        //   505: aload           openFlags
        //   507: invokestatic    com/sun/jna/NativeLibrary.matchLibrary:(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
        //   510: astore          9
        //   512: aload           9
        //   514: ifnull          772
        //   517: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   520: ifeq            549
        //   523: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   526: new             Ljava/lang/StringBuilder;
        //   529: dup            
        //   530: invokespecial   java/lang/StringBuilder.<init>:()V
        //   533: ldc             "Trying "
        //   535: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   538: aload           9
        //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   543: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   546: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   549: aload           9
        //   551: iload           webstartPath
        //   553: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   556: lstore          11
        //   558: goto            772
        //   561: astore          14
        //   563: aload           14
        //   565: astore          e2
        //   567: goto            772
        //   570: invokestatic    com/sun/jna/Platform.isMac:()Z
        //   573: ifeq            664
        //   576: aload_0         /* libraryName */
        //   577: ldc             ".dylib"
        //   579: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   582: ifne            664
        //   585: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   588: ifeq            600
        //   591: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   594: ldc_w           "Looking for matching frameworks"
        //   597: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   600: aload_0         /* libraryName */
        //   601: invokestatic    com/sun/jna/NativeLibrary.matchFramework:(Ljava/lang/String;)Ljava/lang/String;
        //   604: astore          9
        //   606: aload           9
        //   608: ifnull          772
        //   611: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   614: ifeq            643
        //   617: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   620: new             Ljava/lang/StringBuilder;
        //   623: dup            
        //   624: invokespecial   java/lang/StringBuilder.<init>:()V
        //   627: ldc             "Trying "
        //   629: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   632: aload           9
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   637: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   640: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   643: aload           9
        //   645: iload           webstartPath
        //   647: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   650: lstore          11
        //   652: goto            772
        //   655: astore          14
        //   657: aload           14
        //   659: astore          e2
        //   661: goto            772
        //   664: invokestatic    com/sun/jna/Platform.isWindows:()Z
        //   667: ifeq            772
        //   670: iload           searchPath
        //   672: ifne            772
        //   675: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   678: ifeq            690
        //   681: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   684: ldc_w           "Looking for lib- prefix"
        //   687: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   690: new             Ljava/lang/StringBuilder;
        //   693: dup            
        //   694: invokespecial   java/lang/StringBuilder.<init>:()V
        //   697: ldc_w           "lib"
        //   700: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   703: aload_0         /* libraryName */
        //   704: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   707: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   710: aload           openFlags
        //   712: invokestatic    com/sun/jna/NativeLibrary.findLibraryPath:(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
        //   715: astore          9
        //   717: aload           9
        //   719: ifnull          772
        //   722: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   725: ifeq            754
        //   728: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   731: new             Ljava/lang/StringBuilder;
        //   734: dup            
        //   735: invokespecial   java/lang/StringBuilder.<init>:()V
        //   738: ldc             "Trying "
        //   740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   743: aload           9
        //   745: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   748: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   751: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   754: aload           9
        //   756: iload           webstartPath
        //   758: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   761: lstore          11
        //   763: goto            772
        //   766: astore          14
        //   768: aload           14
        //   770: astore          e2
        //   772: lload           11
        //   774: lconst_0       
        //   775: lcmp           
        //   776: ifne            871
        //   779: aload_0         /* libraryName */
        //   780: aload_1         /* options */
        //   781: ldc_w           "classloader"
        //   784: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   789: checkcast       Ljava/lang/ClassLoader;
        //   792: invokestatic    com/sun/jna/Native.extractFromResourcePath:(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/io/File;
        //   795: astore          14
        //   797: aload           14
        //   799: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   802: iload           webstartPath
        //   804: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   807: lstore          11
        //   809: aload           14
        //   811: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   814: astore          9
        //   816: aload           14
        //   818: invokestatic    com/sun/jna/Native.isUnpacked:(Ljava/io/File;)Z
        //   821: ifeq            852
        //   824: aload           14
        //   826: invokestatic    com/sun/jna/Native.deleteLibrary:(Ljava/io/File;)Z
        //   829: pop            
        //   830: goto            852
        //   833: astore          15
        //   835: aload           14
        //   837: invokestatic    com/sun/jna/Native.isUnpacked:(Ljava/io/File;)Z
        //   840: ifeq            849
        //   843: aload           14
        //   845: invokestatic    com/sun/jna/Native.deleteLibrary:(Ljava/io/File;)Z
        //   848: pop            
        //   849: aload           15
        //   851: athrow         
        //   852: goto            871
        //   855: astore          14
        //   857: new             Ljava/lang/UnsatisfiedLinkError;
        //   860: dup            
        //   861: aload           14
        //   863: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   866: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   869: astore          e2
        //   871: lload           11
        //   873: lconst_0       
        //   874: lcmp           
        //   875: ifne            920
        //   878: new             Ljava/lang/UnsatisfiedLinkError;
        //   881: dup            
        //   882: new             Ljava/lang/StringBuilder;
        //   885: dup            
        //   886: invokespecial   java/lang/StringBuilder.<init>:()V
        //   889: ldc_w           "Unable to load library '"
        //   892: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   895: aload_0         /* libraryName */
        //   896: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   899: ldc_w           "': "
        //   902: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   905: aload           13
        //   907: invokevirtual   java/lang/UnsatisfiedLinkError.getMessage:()Ljava/lang/String;
        //   910: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   913: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   916: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   919: athrow         
        //   920: getstatic       com/sun/jna/Native.DEBUG_LOAD:Z
        //   923: ifeq            963
        //   926: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   929: new             Ljava/lang/StringBuilder;
        //   932: dup            
        //   933: invokespecial   java/lang/StringBuilder.<init>:()V
        //   936: ldc_w           "Found library '"
        //   939: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   942: aload_0         /* libraryName */
        //   943: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   946: ldc_w           "' at "
        //   949: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   952: aload           9
        //   954: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   957: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   960: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   963: new             Lcom/sun/jna/NativeLibrary;
        //   966: dup            
        //   967: aload_0         /* libraryName */
        //   968: aload           9
        //   970: lload           11
        //   972: aload_1         /* options */
        //   973: invokespecial   com/sun/jna/NativeLibrary.<init>:(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
        //   976: areturn        
        //    Signature:
        //  (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;*>;)Lcom/sun/jna/NativeLibrary;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  142    156    159    167    Any
        //  159    164    159    167    Any
        //  226    267    270    316    Ljava/lang/UnsatisfiedLinkError;
        //  316    411    414    920    Ljava/lang/UnsatisfiedLinkError;
        //  422    466    469    478    Ljava/lang/UnsatisfiedLinkError;
        //  549    558    561    570    Ljava/lang/UnsatisfiedLinkError;
        //  611    652    655    664    Ljava/lang/UnsatisfiedLinkError;
        //  754    763    766    772    Ljava/lang/UnsatisfiedLinkError;
        //  797    816    833    852    Any
        //  833    835    833    852    Any
        //  779    852    855    871    Ljava/io/IOException;
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
    
    public static String matchFramework(final String libraryName) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0         /* libraryName */
        //     5: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //     8: astore_3       
        //     9: aload_3        
        //    10: invokevirtual   java/io/File.isAbsolute:()Z
        //    13: ifeq            97
        //    16: aload_0         /* libraryName */
        //    17: ldc_w           ".framework"
        //    20: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    23: iconst_m1      
        //    24: if_icmpeq       39
        //    27: aload_3        
        //    28: invokevirtual   java/io/File.exists:()Z
        //    31: ifeq            39
        //    34: aload_3        
        //    35: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    38: areturn        
        //    39: new             Ljava/io/File;
        //    42: dup            
        //    43: new             Ljava/io/File;
        //    46: dup            
        //    47: aload_3        
        //    48: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //    51: new             Ljava/lang/StringBuilder;
        //    54: dup            
        //    55: invokespecial   java/lang/StringBuilder.<init>:()V
        //    58: aload_3        
        //    59: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: ldc_w           ".framework"
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    77: aload_3        
        //    78: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    81: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    84: astore_3       
        //    85: aload_3        
        //    86: invokevirtual   java/io/File.exists:()Z
        //    89: ifeq            231
        //    92: aload_3        
        //    93: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    96: areturn        
        //    97: iconst_3       
        //    98: anewarray       Ljava/lang/String;
        //   101: dup            
        //   102: iconst_0       
        //   103: ldc_w           "user.home"
        //   106: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   109: aastore        
        //   110: dup            
        //   111: iconst_1       
        //   112: ldc_w           ""
        //   115: aastore        
        //   116: dup            
        //   117: iconst_2       
        //   118: ldc_w           "/System"
        //   121: aastore        
        //   122: astore          4
        //   124: aload_0         /* libraryName */
        //   125: ldc_w           ".framework"
        //   128: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   131: iconst_m1      
        //   132: if_icmpne       162
        //   135: new             Ljava/lang/StringBuilder;
        //   138: dup            
        //   139: invokespecial   java/lang/StringBuilder.<init>:()V
        //   142: aload_0         /* libraryName */
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: ldc_w           ".framework/"
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: aload_0         /* libraryName */
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   159: goto            163
        //   162: aload_0         /* libraryName */
        //   163: astore          5
        //   165: iconst_0       
        //   166: istore          6
        //   168: iload           6
        //   170: aload           suffix
        //   172: arraylength    
        //   173: if_icmpge       231
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: aload           suffix
        //   185: iload           6
        //   187: aaload         
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: ldc_w           "/Library/Frameworks/"
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: aload           i
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   202: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   205: astore          7
        //   207: new             Ljava/io/File;
        //   210: dup            
        //   211: aload           7
        //   213: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   216: invokevirtual   java/io/File.exists:()Z
        //   219: ifeq            225
        //   222: aload           7
        //   224: areturn        
        //   225: iinc            libraryPath, 1
        //   228: goto            168
        //   231: aconst_null    
        //   232: areturn        
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
    
    private String getLibraryName(final String libraryName) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: ldc_w           "---"
        //     6: astore          5
        //     8: ldc_w           "---"
        //    11: invokestatic    com/sun/jna/NativeLibrary.mapSharedLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //    14: astore          6
        //    16: aload           6
        //    18: ldc_w           "---"
        //    21: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    24: istore          7
        //    26: iload           7
        //    28: ifle            56
        //    31: aload           BASE
        //    33: aload           prefixEnd
        //    35: iconst_0       
        //    36: iload           7
        //    38: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    41: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    44: ifeq            56
        //    47: aload           BASE
        //    49: iload           7
        //    51: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    54: astore          BASE
        //    56: aload           prefixEnd
        //    58: iload           7
        //    60: ldc_w           "---"
        //    63: invokevirtual   java/lang/String.length:()I
        //    66: iadd           
        //    67: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    70: astore          8
        //    72: aload           BASE
        //    74: aload           8
        //    76: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    79: istore          9
        //    81: iload           9
        //    83: iconst_m1      
        //    84: if_icmpeq       97
        //    87: aload           BASE
        //    89: iconst_0       
        //    90: iload           9
        //    92: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    95: astore          BASE
        //    97: aload           BASE
        //    99: areturn        
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
    
    public static final NativeLibrary getInstance(final String libraryName) {
        return getInstance(libraryName, Collections.emptyMap());
    }
    
    public static final NativeLibrary getInstance(final String libraryName, final ClassLoader classLoader) {
        return getInstance(libraryName, Collections.singletonMap("classloader", classLoader));
    }
    
    public static final NativeLibrary getInstance(final String libraryName, final Map<String, ?> libraryOptions) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1         /* libraryOptions */
        //     5: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //     8: astore          4
        //    10: aload           4
        //    12: ldc             "calling-convention"
        //    14: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    19: ifnonnull       36
        //    22: aload           4
        //    24: ldc             "calling-convention"
        //    26: iconst_0       
        //    27: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    30: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    35: pop            
        //    36: invokestatic    com/sun/jna/Platform.isLinux:()Z
        //    39: ifne            54
        //    42: invokestatic    com/sun/jna/Platform.isFreeBSD:()Z
        //    45: ifne            54
        //    48: invokestatic    com/sun/jna/Platform.isAIX:()Z
        //    51: ifeq            66
        //    54: getstatic       com/sun/jna/Platform.C_LIBRARY_NAME:Ljava/lang/String;
        //    57: aload_0         /* libraryName */
        //    58: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    61: ifeq            66
        //    64: aconst_null    
        //    65: astore_0        /* libraryName */
        //    66: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    69: dup            
        //    70: astore          5
        //    72: monitorenter   
        //    73: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    76: new             Ljava/lang/StringBuilder;
        //    79: dup            
        //    80: invokespecial   java/lang/StringBuilder.<init>:()V
        //    83: aload_0         /* libraryName */
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: aload           4
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   100: checkcast       Ljava/lang/ref/Reference;
        //   103: astore          6
        //   105: aload           6
        //   107: ifnull          121
        //   110: aload           6
        //   112: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //   115: checkcast       Lcom/sun/jna/NativeLibrary;
        //   118: goto            122
        //   121: aconst_null    
        //   122: astore          7
        //   124: aload           7
        //   126: ifnonnull       293
        //   129: aload_0         /* libraryName */
        //   130: ifnonnull       160
        //   133: new             Lcom/sun/jna/NativeLibrary;
        //   136: dup            
        //   137: ldc_w           "<process>"
        //   140: aconst_null    
        //   141: aconst_null    
        //   142: aload           4
        //   144: invokestatic    com/sun/jna/NativeLibrary.openFlags:(Ljava/util/Map;)I
        //   147: invokestatic    com/sun/jna/Native.open:(Ljava/lang/String;I)J
        //   150: aload           4
        //   152: invokespecial   com/sun/jna/NativeLibrary.<init>:(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V
        //   155: astore          7
        //   157: goto            168
        //   160: aload_0         /* libraryName */
        //   161: aload           4
        //   163: invokestatic    com/sun/jna/NativeLibrary.loadLibrary:(Ljava/lang/String;Ljava/util/Map;)Lcom/sun/jna/NativeLibrary;
        //   166: astore          7
        //   168: new             Ljava/lang/ref/WeakReference;
        //   171: dup            
        //   172: aload           7
        //   174: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   177: astore          library
        //   179: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //   182: new             Ljava/lang/StringBuilder;
        //   185: dup            
        //   186: invokespecial   java/lang/StringBuilder.<init>:()V
        //   189: aload           7
        //   191: invokevirtual   com/sun/jna/NativeLibrary.getName:()Ljava/lang/String;
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: aload           4
        //   199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   202: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   205: aload           library
        //   207: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   212: pop            
        //   213: aload           7
        //   215: invokevirtual   com/sun/jna/NativeLibrary.getFile:()Ljava/io/File;
        //   218: astore          8
        //   220: aload           8
        //   222: ifnull          293
        //   225: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: aload           8
        //   237: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: aload           4
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   248: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   251: aload           library
        //   253: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   258: pop            
        //   259: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //   262: new             Ljava/lang/StringBuilder;
        //   265: dup            
        //   266: invokespecial   java/lang/StringBuilder.<init>:()V
        //   269: aload           8
        //   271: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: aload           4
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   282: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   285: aload           library
        //   287: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   292: pop            
        //   293: aload           file
        //   295: aload           ref
        //   297: monitorexit    
        //   298: areturn        
        //   299: astore          9
        //   301: aload           5
        //   303: monitorexit    
        //   304: aload           9
        //   306: athrow         
        //    Signature:
        //  (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;*>;)Lcom/sun/jna/NativeLibrary;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  73     298    299    307    Any
        //  299    304    299    307    Any
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
    
    public static final synchronized NativeLibrary getProcess() {
        return getInstance(null);
    }
    
    public static final synchronized NativeLibrary getProcess(final Map<String, ?> options) {
        return getInstance(null, options);
    }
    
    public static final void addSearchPath(final String libraryName, final String path) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore          4
        //     6: monitorenter   
        //     7: getstatic       com/sun/jna/NativeLibrary.searchPaths:Ljava/util/Map;
        //    10: aload_0         /* libraryName */
        //    11: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    16: checkcast       Ljava/util/List;
        //    19: astore          5
        //    21: aload           5
        //    23: ifnonnull       50
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: invokespecial   java/util/ArrayList.<init>:()V
        //    33: invokestatic    java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        //    36: astore          5
        //    38: getstatic       com/sun/jna/NativeLibrary.searchPaths:Ljava/util/Map;
        //    41: aload_0         /* libraryName */
        //    42: aload           5
        //    44: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    49: pop            
        //    50: aload           5
        //    52: aload_1         /* path */
        //    53: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    58: pop            
        //    59: aload           customPaths
        //    61: monitorexit    
        //    62: goto            73
        //    65: astore          6
        //    67: aload           4
        //    69: monitorexit    
        //    70: aload           6
        //    72: athrow         
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      62     65     73     Any
        //  65     70     65     73     Any
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
    
    public Function getFunction(final String functionName) {
        return this.getFunction(functionName, this.callFlags);
    }
    
    public Function getFunction(final String name, final Method method) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/NativeLibrary.options:Ljava/util/Map;
        //     4: ldc_w           "function-mapper"
        //     7: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    12: checkcast       Lcom/sun/jna/FunctionMapper;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          32
        //    22: aload           5
        //    24: aload_0         /* this */
        //    25: aload_2         /* method */
        //    26: invokeinterface com/sun/jna/FunctionMapper.getFunctionName:(Lcom/sun/jna/NativeLibrary;Ljava/lang/reflect/Method;)Ljava/lang/String;
        //    31: astore_1        /* name */
        //    32: ldc_w           "jna.profiler.prefix"
        //    35: ldc_w           "$$YJP$$"
        //    38: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    41: astore          6
        //    43: aload_1         /* name */
        //    44: aload           6
        //    46: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    49: ifeq            62
        //    52: aload_1         /* name */
        //    53: aload           6
        //    55: invokevirtual   java/lang/String.length:()I
        //    58: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    61: astore_1        /* name */
        //    62: aload_0         /* this */
        //    63: getfield        com/sun/jna/NativeLibrary.callFlags:I
        //    66: istore          7
        //    68: aload_2         /* method */
        //    69: invokevirtual   java/lang/reflect/Method.getExceptionTypes:()[Ljava/lang/Class;
        //    72: astore          8
        //    74: iconst_0       
        //    75: istore          9
        //    77: iload           9
        //    79: aload           i
        //    81: arraylength    
        //    82: if_icmpge       112
        //    85: ldc_w           Lcom/sun/jna/LastErrorException;.class
        //    88: aload           i
        //    90: iload           9
        //    92: aaload         
        //    93: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    96: ifeq            106
        //    99: iload           etypes
        //   101: bipush          64
        //   103: ior            
        //   104: istore          etypes
        //   106: iinc            9, 1
        //   109: goto            77
        //   112: aload_0         /* this */
        //   113: aload_1         /* name */
        //   114: iload           etypes
        //   116: invokevirtual   com/sun/jna/NativeLibrary.getFunction:(Ljava/lang/String;I)Lcom/sun/jna/Function;
        //   119: areturn        
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
    
    public Function getFunction(final String functionName, final int callFlags) {
        return this.getFunction(functionName, callFlags, this.encoding);
    }
    
    public Function getFunction(final String functionName, final int callFlags, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       15
        //     4: new             Ljava/lang/NullPointerException;
        //     7: dup            
        //     8: ldc_w           "Function name may not be null"
        //    11: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    14: athrow         
        //    15: aload_0         /* this */
        //    16: getfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //    19: dup            
        //    20: astore          6
        //    22: monitorenter   
        //    23: aload_1         /* functionName */
        //    24: iload_2         /* callFlags */
        //    25: aload_3         /* encoding */
        //    26: invokestatic    com/sun/jna/NativeLibrary.functionKey:(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        //    29: astore          7
        //    31: aload_0         /* this */
        //    32: getfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //    35: aload           7
        //    37: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    42: checkcast       Lcom/sun/jna/Function;
        //    45: astore          8
        //    47: aload           8
        //    49: ifnonnull       79
        //    52: new             Lcom/sun/jna/Function;
        //    55: dup            
        //    56: aload_0         /* this */
        //    57: aload_1         /* functionName */
        //    58: iload_2         /* callFlags */
        //    59: aload_3         /* encoding */
        //    60: invokespecial   com/sun/jna/Function.<init>:(Lcom/sun/jna/NativeLibrary;Ljava/lang/String;ILjava/lang/String;)V
        //    63: astore          8
        //    65: aload_0         /* this */
        //    66: getfield        com/sun/jna/NativeLibrary.functions:Ljava/util/Map;
        //    69: aload           function
        //    71: aload           8
        //    73: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    78: pop            
        //    79: aload           8
        //    81: aload           key
        //    83: monitorexit    
        //    84: areturn        
        //    85: astore          9
        //    87: aload           6
        //    89: monitorexit    
        //    90: aload           9
        //    92: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     84     85     93     Any
        //  85     90     85     93     Any
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
    
    public Map<String, ?> getOptions() {
        return this.options;
    }
    
    public Pointer getGlobalVariableAddress(final String symbolName) {
        try {
            return new Pointer(this.getSymbolAddress(symbolName));
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new UnsatisfiedLinkError("Error looking up '" + symbolName + "': " + unsatisfiedLinkError.getMessage());
        }
    }
    
    public long getSymbolAddress(final String name) {
        if (this.handle == 0L) {
            throw new UnsatisfiedLinkError("Library has been unloaded");
        }
        return Native.findSymbol(this.handle, name);
    }
    
    @Override
    public String toString() {
        return "Native Library <" + this.libraryPath + "@" + this.handle + ">";
    }
    
    public String getName() {
        return this.libraryName;
    }
    
    public File getFile() {
        if (this.libraryPath == null) {
            return null;
        }
        return new File(this.libraryPath);
    }
    
    public void finalize() {
        this.dispose();
    }
    
    public static void disposeAll() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_2       
        //     5: monitorenter   
        //     6: new             Ljava/util/LinkedHashSet;
        //     9: dup            
        //    10: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    13: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //    18: invokespecial   java/util/LinkedHashSet.<init>:(Ljava/util/Collection;)V
        //    21: astore_3       
        //    22: aload_2         /* values */
        //    23: monitorexit    
        //    24: goto            34
        //    27: astore          4
        //    29: aload_2        
        //    30: monitorexit    
        //    31: aload           4
        //    33: athrow         
        //    34: aload_3        
        //    35: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    40: astore_2        /* values */
        //    41: aload_2         /* values */
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            84
        //    50: aload_2         /* values */
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ljava/lang/ref/Reference;
        //    59: astore          4
        //    61: aload           4
        //    63: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    66: checkcast       Lcom/sun/jna/NativeLibrary;
        //    69: astore          5
        //    71: aload           5
        //    73: ifnull          81
        //    76: aload           5
        //    78: invokevirtual   com/sun/jna/NativeLibrary.dispose:()V
        //    81: goto            41
        //    84: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      24     27     34     Any
        //  27     31     27     34     Any
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
    
    public void dispose() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/HashSet.<init>:()V
        //     7: astore_3       
        //     8: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    11: dup            
        //    12: astore          4
        //    14: monitorenter   
        //    15: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    18: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    23: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    28: astore          5
        //    30: aload           5
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            90
        //    40: aload           5
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: checkcast       Ljava/util/Map$Entry;
        //    50: astore          6
        //    52: aload           6
        //    54: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    59: checkcast       Ljava/lang/ref/Reference;
        //    62: astore          7
        //    64: aload           7
        //    66: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    69: aload_0         /* this */
        //    70: if_acmpne       87
        //    73: aload_3        
        //    74: aload           ref
        //    76: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    81: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    86: pop            
        //    87: goto            30
        //    90: aload_3        
        //    91: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    96: astore          5
        //    98: aload           5
        //   100: invokeinterface java/util/Iterator.hasNext:()Z
        //   105: ifeq            134
        //   108: aload           5
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: checkcast       Ljava/lang/String;
        //   118: astore          6
        //   120: getstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //   123: aload           6
        //   125: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   130: pop            
        //   131: goto            98
        //   134: aload           4
        //   136: monitorexit    
        //   137: goto            148
        //   140: astore          8
        //   142: aload           4
        //   144: monitorexit    
        //   145: aload           8
        //   147: athrow         
        //   148: aload_0         /* this */
        //   149: dup            
        //   150: astore          4
        //   152: monitorenter   
        //   153: aload_0         /* this */
        //   154: getfield        com/sun/jna/NativeLibrary.handle:J
        //   157: lconst_0       
        //   158: lcmp           
        //   159: ifeq            174
        //   162: aload_0         /* this */
        //   163: getfield        com/sun/jna/NativeLibrary.handle:J
        //   166: invokestatic    com/sun/jna/Native.close:(J)V
        //   169: aload_0         /* this */
        //   170: lconst_0       
        //   171: putfield        com/sun/jna/NativeLibrary.handle:J
        //   174: aload           4
        //   176: monitorexit    
        //   177: goto            188
        //   180: astore          9
        //   182: aload           4
        //   184: monitorexit    
        //   185: aload           9
        //   187: athrow         
        //   188: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     137    140    148    Any
        //  140    145    140    148    Any
        //  153    177    180    188    Any
        //  180    185    180    188    Any
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
    
    private static List<String> initPaths(final String key) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           ""
        //     4: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //     7: astore_3       
        //     8: ldc_w           ""
        //    11: aload_3        
        //    12: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    15: ifeq            22
        //    18: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    21: areturn        
        //    22: new             Ljava/util/StringTokenizer;
        //    25: dup            
        //    26: aload_3        
        //    27: getstatic       java/io/File.pathSeparator:Ljava/lang/String;
        //    30: invokespecial   java/util/StringTokenizer.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    33: astore          4
        //    35: new             Ljava/util/ArrayList;
        //    38: dup            
        //    39: invokespecial   java/util/ArrayList.<init>:()V
        //    42: astore          5
        //    44: aload           list
        //    46: invokevirtual   java/util/StringTokenizer.hasMoreTokens:()Z
        //    49: ifeq            83
        //    52: aload           list
        //    54: invokevirtual   java/util/StringTokenizer.nextToken:()Ljava/lang/String;
        //    57: astore          6
        //    59: ldc_w           ""
        //    62: aload           6
        //    64: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    67: ifne            80
        //    70: aload           path
        //    72: aload           6
        //    74: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    79: pop            
        //    80: goto            44
        //    83: aload           5
        //    85: areturn        
        //    Signature:
        //  (Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;
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
    
    private static String findLibraryPath(final String libName, final List<String> searchPath) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0         /* libName */
        //     5: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //     8: invokevirtual   java/io/File.isAbsolute:()Z
        //    11: ifeq            16
        //    14: aload_0         /* libName */
        //    15: areturn        
        //    16: aload_0         /* libName */
        //    17: invokestatic    com/sun/jna/NativeLibrary.mapSharedLibraryName:(Ljava/lang/String;)Ljava/lang/String;
        //    20: astore          4
        //    22: aload_1         /* searchPath */
        //    23: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    28: astore          5
        //    30: aload           5
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            155
        //    40: aload           5
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: checkcast       Ljava/lang/String;
        //    50: astore          6
        //    52: new             Ljava/io/File;
        //    55: dup            
        //    56: aload           6
        //    58: aload           4
        //    60: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    63: astore          7
        //    65: aload           7
        //    67: invokevirtual   java/io/File.exists:()Z
        //    70: ifeq            79
        //    73: aload           7
        //    75: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    78: areturn        
        //    79: invokestatic    com/sun/jna/Platform.isMac:()Z
        //    82: ifeq            152
        //    85: aload           4
        //    87: ldc             ".dylib"
        //    89: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    92: ifeq            152
        //    95: new             Ljava/io/File;
        //    98: dup            
        //    99: aload           file
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: invokespecial   java/lang/StringBuilder.<init>:()V
        //   108: aload           4
        //   110: iconst_0       
        //   111: aload           4
        //   113: ldc             ".dylib"
        //   115: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   118: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: ldc_w           ".jnilib"
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   133: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   136: astore          7
        //   138: aload           7
        //   140: invokevirtual   java/io/File.exists:()Z
        //   143: ifeq            152
        //   146: aload           7
        //   148: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   151: areturn        
        //   152: goto            30
        //   155: aload           4
        //   157: areturn        
        //    Signature:
        //  (Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Ljava/lang/String;
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
    
    public static String mapSharedLibraryName(final String libName) {
        if (!Platform.isMac()) {
            if (Platform.isLinux() || Platform.isFreeBSD()) {
                if (isVersionedName(libName) || libName.endsWith(".so")) {
                    return libName;
                }
            }
            else if (Platform.isAIX()) {
                if (libName.startsWith("lib")) {
                    return libName;
                }
            }
            else if (Platform.isWindows() && (libName.endsWith(".drv") || libName.endsWith(".dll"))) {
                return libName;
            }
            return System.mapLibraryName(libName);
        }
        if (libName.startsWith("lib") && (libName.endsWith(".dylib") || libName.endsWith(".jnilib"))) {
            return libName;
        }
        final String mapLibraryName = System.mapLibraryName(libName);
        if (mapLibraryName.endsWith(".jnilib")) {
            return mapLibraryName.substring(0, mapLibraryName.lastIndexOf(".jnilib")) + ".dylib";
        }
        return mapLibraryName;
    }
    
    private static boolean isVersionedName(final String name) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "lib"
        //     4: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //     7: ifeq            80
        //    10: aload_0         /* name */
        //    11: ldc_w           ".so."
        //    14: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //    17: istore_3       
        //    18: iload_3        
        //    19: iconst_m1      
        //    20: if_icmpeq       80
        //    23: iload_3        
        //    24: iconst_4       
        //    25: iadd           
        //    26: aload_0         /* name */
        //    27: invokevirtual   java/lang/String.length:()I
        //    30: if_icmpge       80
        //    33: iload_3        
        //    34: iconst_4       
        //    35: iadd           
        //    36: istore          4
        //    38: iload           4
        //    40: aload_0         /* name */
        //    41: invokevirtual   java/lang/String.length:()I
        //    44: if_icmpge       78
        //    47: aload_0         /* name */
        //    48: iload           4
        //    50: invokevirtual   java/lang/String.charAt:(I)C
        //    53: istore          5
        //    55: iload           5
        //    57: invokestatic    java/lang/Character.isDigit:(C)Z
        //    60: ifne            72
        //    63: iload           5
        //    65: bipush          46
        //    67: if_icmpeq       72
        //    70: iconst_0       
        //    71: ireturn        
        //    72: iinc            ch, 1
        //    75: goto            38
        //    78: iconst_1       
        //    79: ireturn        
        //    80: iconst_0       
        //    81: ireturn        
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
    
    public static String matchLibrary(final String libName, final List<String> searchPath) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0         /* libName */
        //     5: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //     8: astore          4
        //    10: aload           4
        //    12: invokevirtual   java/io/File.isAbsolute:()Z
        //    15: ifeq            34
        //    18: iconst_1       
        //    19: anewarray       Ljava/lang/String;
        //    22: dup            
        //    23: iconst_0       
        //    24: aload           4
        //    26: invokevirtual   java/io/File.getParent:()Ljava/lang/String;
        //    29: aastore        
        //    30: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    33: astore_1        /* searchPath */
        //    34: new             Lcom/sun/jna/NativeLibrary$2;
        //    37: dup            
        //    38: aload_0         /* libName */
        //    39: invokespecial   com/sun/jna/NativeLibrary$2.<init>:(Ljava/lang/String;)V
        //    42: astore          5
        //    44: new             Ljava/util/LinkedList;
        //    47: dup            
        //    48: invokespecial   java/util/LinkedList.<init>:()V
        //    51: astore          6
        //    53: aload_1         /* searchPath */
        //    54: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    59: astore          7
        //    61: aload           7
        //    63: invokeinterface java/util/Iterator.hasNext:()Z
        //    68: ifeq            126
        //    71: aload           7
        //    73: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    78: checkcast       Ljava/lang/String;
        //    81: astore          8
        //    83: new             Ljava/io/File;
        //    86: dup            
        //    87: aload           8
        //    89: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    92: aload           matches
        //    94: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    97: astore          9
        //    99: aload           9
        //   101: ifnull          123
        //   104: aload           9
        //   106: arraylength    
        //   107: ifle            123
        //   110: aload           6
        //   112: aload           9
        //   114: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   117: invokeinterface java/util/Collection.addAll:(Ljava/util/Collection;)Z
        //   122: pop            
        //   123: goto            61
        //   126: ldc2_w          -1.0
        //   129: dstore          10
        //   131: aconst_null    
        //   132: astore          bestVersion
        //   134: aload           6
        //   136: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   141: astore          12
        //   143: aload           12
        //   145: invokeinterface java/util/Iterator.hasNext:()Z
        //   150: ifeq            215
        //   153: aload           12
        //   155: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   160: checkcast       Ljava/io/File;
        //   163: astore          13
        //   165: aload           13
        //   167: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   170: astore          14
        //   172: aload           14
        //   174: aload           14
        //   176: ldc_w           ".so."
        //   179: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   182: iconst_4       
        //   183: iadd           
        //   184: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   187: astore          15
        //   189: aload           15
        //   191: invokestatic    com/sun/jna/NativeLibrary.parseVersion:(Ljava/lang/String;)D
        //   194: dstore          16
        //   196: dload           16
        //   198: dload           10
        //   200: dcmpl          
        //   201: ifle            212
        //   204: dload           16
        //   206: dstore          10
        //   208: aload           ver
        //   210: astore          bestVersion
        //   212: goto            143
        //   215: aload           bestVersion
        //   217: areturn        
        //    Signature:
        //  (Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Ljava/lang/String;
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
    
    public static double parseVersion(String ver) {
        double n = 0.0;
        double n2 = 1.0;
        final int index = ver.indexOf(".");
        while (ver != null) {
            String substring;
            if (index != -1) {
                substring = ver.substring(0, index);
                final String num;
                ver = ver.substring((int)(num + 1));
                num = (String)ver.indexOf(".");
            }
            else {
                substring = ver;
                ver = null;
            }
            try {
                n += Integer.parseInt(substring) / n2;
            }
            catch (final NumberFormatException ex) {
                return 0.0;
            }
            n2 *= 100.0;
        }
        return n;
    }
    
    private static String getMultiArchPath() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: invokestatic    com/sun/jna/Platform.iskFreeBSD:()Z
        //     7: ifeq            16
        //    10: ldc_w           "-kfreebsd"
        //    13: goto            31
        //    16: invokestatic    com/sun/jna/Platform.isGNU:()Z
        //    19: ifeq            28
        //    22: ldc_w           ""
        //    25: goto            31
        //    28: ldc_w           "-linux"
        //    31: astore_3       
        //    32: ldc_w           "-gnu"
        //    35: astore          4
        //    37: invokestatic    com/sun/jna/Platform.isIntel:()Z
        //    40: ifeq            62
        //    43: invokestatic    com/sun/jna/Platform.is64Bit:()Z
        //    46: ifeq            55
        //    49: ldc_w           "x86_64"
        //    52: goto            58
        //    55: ldc_w           "i386"
        //    58: astore_2        /* kernel */
        //    59: goto            102
        //    62: invokestatic    com/sun/jna/Platform.isPPC:()Z
        //    65: ifeq            87
        //    68: invokestatic    com/sun/jna/Platform.is64Bit:()Z
        //    71: ifeq            80
        //    74: ldc_w           "powerpc64"
        //    77: goto            83
        //    80: ldc_w           "powerpc"
        //    83: astore_2        /* kernel */
        //    84: goto            102
        //    87: invokestatic    com/sun/jna/Platform.isARM:()Z
        //    90: ifeq            102
        //    93: ldc_w           "arm"
        //    96: astore_2        /* kernel */
        //    97: ldc_w           "-gnueabi"
        //   100: astore          4
        //   102: new             Ljava/lang/StringBuilder;
        //   105: dup            
        //   106: invokespecial   java/lang/StringBuilder.<init>:()V
        //   109: aload_2         /* kernel */
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload_3        
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload           4
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: areturn        
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
    
    private static ArrayList<String> getLinuxLdPaths() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //    11: ldc_w           "/sbin/ldconfig -p"
        //    14: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //    17: astore_3       
        //    18: new             Ljava/io/BufferedReader;
        //    21: dup            
        //    22: new             Ljava/io/InputStreamReader;
        //    25: dup            
        //    26: aload_3        
        //    27: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //    30: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    33: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    36: astore          4
        //    38: ldc_w           ""
        //    41: astore          5
        //    43: aload           buffer
        //    45: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    48: dup            
        //    49: astore          5
        //    51: ifnull          124
        //    54: aload           5
        //    56: ldc_w           " => "
        //    59: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    62: istore          6
        //    64: aload           startPath
        //    66: bipush          47
        //    68: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //    71: istore          7
        //    73: iload           endPath
        //    75: iconst_m1      
        //    76: if_icmpeq       121
        //    79: iload           7
        //    81: iconst_m1      
        //    82: if_icmpeq       121
        //    85: iload           endPath
        //    87: iload           7
        //    89: if_icmpge       121
        //    92: aload           startPath
        //    94: iload           endPath
        //    96: iconst_4       
        //    97: iadd           
        //    98: iload           7
        //   100: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   103: astore          8
        //   105: aload_2         /* process */
        //   106: aload           8
        //   108: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   111: ifne            121
        //   114: aload_2         /* process */
        //   115: aload           8
        //   117: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: goto            43
        //   124: aload           buffer
        //   126: invokevirtual   java/io/BufferedReader.close:()V
        //   129: goto            133
        //   132: astore_3       
        //   133: aload_2        
        //   134: areturn        
        //    Signature:
        //  ()Ljava/util/ArrayList<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      129    132    133    Ljava/lang/Exception;
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
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/HashMap.<init>:()V
        //     7: putstatic       com/sun/jna/NativeLibrary.libraries:Ljava/util/Map;
        //    10: new             Ljava/util/HashMap;
        //    13: dup            
        //    14: invokespecial   java/util/HashMap.<init>:()V
        //    17: invokestatic    java/util/Collections.synchronizedMap:(Ljava/util/Map;)Ljava/util/Map;
        //    20: putstatic       com/sun/jna/NativeLibrary.searchPaths:Ljava/util/Map;
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: invokespecial   java/util/ArrayList.<init>:()V
        //    30: putstatic       com/sun/jna/NativeLibrary.librarySearchPath:Ljava/util/List;
        //    33: getstatic       com/sun/jna/Native.POINTER_SIZE:I
        //    36: ifne            50
        //    39: new             Ljava/lang/Error;
        //    42: dup            
        //    43: ldc_w           "Native library not initialized"
        //    46: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;)V
        //    49: athrow         
        //    50: ldc_w           "jnidispatch"
        //    53: invokestatic    com/sun/jna/Native.getWebStartLibraryPath:(Ljava/lang/String;)Ljava/lang/String;
        //    56: astore_2       
        //    57: aload_2        
        //    58: ifnull          71
        //    61: getstatic       com/sun/jna/NativeLibrary.librarySearchPath:Ljava/util/List;
        //    64: aload_2        
        //    65: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    70: pop            
        //    71: ldc_w           "jna.platform.library.path"
        //    74: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    77: ifnonnull       550
        //    80: invokestatic    com/sun/jna/Platform.isWindows:()Z
        //    83: ifne            550
        //    86: ldc_w           ""
        //    89: astore_3       
        //    90: ldc_w           ""
        //    93: astore          4
        //    95: ldc_w           ""
        //    98: astore          5
        //   100: invokestatic    com/sun/jna/Platform.isLinux:()Z
        //   103: ifne            124
        //   106: invokestatic    com/sun/jna/Platform.isSolaris:()Z
        //   109: ifne            124
        //   112: invokestatic    com/sun/jna/Platform.isFreeBSD:()Z
        //   115: ifne            124
        //   118: invokestatic    com/sun/jna/Platform.iskFreeBSD:()Z
        //   121: ifeq            163
        //   124: new             Ljava/lang/StringBuilder;
        //   127: dup            
        //   128: invokespecial   java/lang/StringBuilder.<init>:()V
        //   131: invokestatic    com/sun/jna/Platform.isSolaris:()Z
        //   134: ifeq            143
        //   137: ldc_w           "/"
        //   140: goto            146
        //   143: ldc_w           ""
        //   146: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   149: getstatic       com/sun/jna/Pointer.SIZE:I
        //   152: bipush          8
        //   154: imul           
        //   155: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: astore          5
        //   163: iconst_4       
        //   164: anewarray       Ljava/lang/String;
        //   167: dup            
        //   168: iconst_0       
        //   169: new             Ljava/lang/StringBuilder;
        //   172: dup            
        //   173: invokespecial   java/lang/StringBuilder.<init>:()V
        //   176: ldc_w           "/usr/lib"
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: aload           5
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: aastore        
        //   191: dup            
        //   192: iconst_1       
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: ldc_w           "/lib"
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: aload           5
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   214: aastore        
        //   215: dup            
        //   216: iconst_2       
        //   217: ldc_w           "/usr/lib"
        //   220: aastore        
        //   221: dup            
        //   222: iconst_3       
        //   223: ldc_w           "/lib"
        //   226: aastore        
        //   227: astore          6
        //   229: invokestatic    com/sun/jna/Platform.isLinux:()Z
        //   232: ifne            247
        //   235: invokestatic    com/sun/jna/Platform.iskFreeBSD:()Z
        //   238: ifne            247
        //   241: invokestatic    com/sun/jna/Platform.isGNU:()Z
        //   244: ifeq            367
        //   247: invokestatic    com/sun/jna/NativeLibrary.getMultiArchPath:()Ljava/lang/String;
        //   250: astore          7
        //   252: bipush          6
        //   254: anewarray       Ljava/lang/String;
        //   257: dup            
        //   258: iconst_0       
        //   259: new             Ljava/lang/StringBuilder;
        //   262: dup            
        //   263: invokespecial   java/lang/StringBuilder.<init>:()V
        //   266: ldc_w           "/usr/lib/"
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   272: aload           7
        //   274: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   277: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   280: aastore        
        //   281: dup            
        //   282: iconst_1       
        //   283: new             Ljava/lang/StringBuilder;
        //   286: dup            
        //   287: invokespecial   java/lang/StringBuilder.<init>:()V
        //   290: ldc_w           "/lib/"
        //   293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   296: aload           7
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: aastore        
        //   305: dup            
        //   306: iconst_2       
        //   307: new             Ljava/lang/StringBuilder;
        //   310: dup            
        //   311: invokespecial   java/lang/StringBuilder.<init>:()V
        //   314: ldc_w           "/usr/lib"
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: aload           paths
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   328: aastore        
        //   329: dup            
        //   330: iconst_3       
        //   331: new             Ljava/lang/StringBuilder;
        //   334: dup            
        //   335: invokespecial   java/lang/StringBuilder.<init>:()V
        //   338: ldc_w           "/lib"
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   344: aload           paths
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   352: aastore        
        //   353: dup            
        //   354: iconst_4       
        //   355: ldc_w           "/usr/lib"
        //   358: aastore        
        //   359: dup            
        //   360: iconst_5       
        //   361: ldc_w           "/lib"
        //   364: aastore        
        //   365: astore          multiArchPath
        //   367: invokestatic    com/sun/jna/Platform.isLinux:()Z
        //   370: ifeq            452
        //   373: invokestatic    com/sun/jna/NativeLibrary.getLinuxLdPaths:()Ljava/util/ArrayList;
        //   376: astore          7
        //   378: aload           ldPaths
        //   380: arraylength    
        //   381: iconst_1       
        //   382: isub           
        //   383: istore          8
        //   385: iconst_0       
        //   386: iload           8
        //   388: if_icmpgt       434
        //   391: aload           i
        //   393: aload           ldPaths
        //   395: iload           8
        //   397: aaload         
        //   398: invokevirtual   java/util/ArrayList.indexOf:(Ljava/lang/Object;)I
        //   401: istore          9
        //   403: iload           9
        //   405: iconst_m1      
        //   406: if_icmpeq       417
        //   409: aload           i
        //   411: iload           9
        //   413: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   416: pop            
        //   417: aload           i
        //   419: iconst_0       
        //   420: aload           ldPaths
        //   422: iload           found
        //   424: aaload         
        //   425: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   428: iinc            found, -1
        //   431: goto            385
        //   434: aload           i
        //   436: aload           7
        //   438: invokevirtual   java/util/ArrayList.size:()I
        //   441: anewarray       Ljava/lang/String;
        //   444: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   447: checkcast       [Ljava/lang/String;
        //   450: astore          ldPaths
        //   452: iconst_0       
        //   453: istore          7
        //   455: iload           7
        //   457: aload           i
        //   459: arraylength    
        //   460: if_icmpge       532
        //   463: new             Ljava/io/File;
        //   466: dup            
        //   467: aload           i
        //   469: iload           7
        //   471: aaload         
        //   472: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   475: astore          8
        //   477: aload           8
        //   479: invokevirtual   java/io/File.exists:()Z
        //   482: ifeq            526
        //   485: aload           8
        //   487: invokevirtual   java/io/File.isDirectory:()Z
        //   490: ifeq            526
        //   493: new             Ljava/lang/StringBuilder;
        //   496: dup            
        //   497: invokespecial   java/lang/StringBuilder.<init>:()V
        //   500: aload_3         /* sep */
        //   501: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   504: aload           archPath
        //   506: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   509: aload           i
        //   511: iload           dir
        //   513: aaload         
        //   514: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   517: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   520: astore_3        /* sep */
        //   521: getstatic       java/io/File.pathSeparator:Ljava/lang/String;
        //   524: astore          archPath
        //   526: iinc            dir, 1
        //   529: goto            455
        //   532: ldc_w           ""
        //   535: aload_3         /* sep */
        //   536: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   539: ifne            550
        //   542: ldc_w           "jna.platform.library.path"
        //   545: aload_3         /* sep */
        //   546: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   549: pop            
        //   550: getstatic       com/sun/jna/NativeLibrary.librarySearchPath:Ljava/util/List;
        //   553: ldc_w           "jna.platform.library.path"
        //   556: invokestatic    com/sun/jna/NativeLibrary.initPaths:(Ljava/lang/String;)Ljava/util/List;
        //   559: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   564: pop            
        //   565: return         
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
}

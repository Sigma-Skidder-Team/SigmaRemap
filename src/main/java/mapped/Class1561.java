// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1561 implements Runnable
{
    public final /* synthetic */ Class7671 field8734;
    public final /* synthetic */ Class8867 field8735;
    public final /* synthetic */ Class7782 field8736;
    public final /* synthetic */ Class5008 field8737;
    
    public Class1561(final Class5008 field8737, final Class7671 field8738, final Class8867 field8739, final Class7782 field8740) {
        this.field8737 = field8737;
        this.field8734 = field8738;
        this.field8735 = field8739;
        this.field8736 = field8740;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: new             Ljava/net/URL;
        //     5: dup            
        //     6: ldc             "https://dump.viaversion.com/documents"
        //     8: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    11: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    14: checkcast       Ljava/net/HttpURLConnection;
        //    17: astore_3       
        //    18: goto            74
        //    21: athrow         
        //    22: astore          4
        //    24: aload_0        
        //    25: getfield        mapped/Class1561.field8734:Lmapped/Class7671;
        //    28: new             Ljava/lang/StringBuilder;
        //    31: dup            
        //    32: invokespecial   java/lang/StringBuilder.<init>:()V
        //    35: getstatic       mapped/Class300.field1730:Lmapped/Class300;
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    41: ldc             "Failed to dump, please check the console for more information"
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    49: invokeinterface mapped/Class7671.method24351:(Ljava/lang/String;)V
        //    54: invokestatic    mapped/Class8563.method28793:()Lmapped/Class9366;
        //    57: invokeinterface mapped/Class9366.method34742:()Ljava/util/logging/Logger;
        //    62: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //    65: ldc             "Could not paste ViaVersion dump to ViaVersion Dump"
        //    67: aload           4
        //    69: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    72: return         
        //    73: athrow         
        //    74: aload_3        
        //    75: ldc             "Content-Type"
        //    77: ldc             "text/plain"
        //    79: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    82: aload_3        
        //    83: ldc             "User-Agent"
        //    85: new             Ljava/lang/StringBuilder;
        //    88: dup            
        //    89: invokespecial   java/lang/StringBuilder.<init>:()V
        //    92: ldc             "ViaVersion/"
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload_0        
        //    98: getfield        mapped/Class1561.field8735:Lmapped/Class8867;
        //   101: invokevirtual   mapped/Class8867.method31146:()Ljava/lang/String;
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   110: invokevirtual   java/net/HttpURLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   113: aload_3        
        //   114: ldc             "POST"
        //   116: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   119: aload_3        
        //   120: iconst_1       
        //   121: invokevirtual   java/net/HttpURLConnection.setDoOutput:(Z)V
        //   124: aload_3        
        //   125: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   128: astore          4
        //   130: aload           4
        //   132: invokestatic    mapped/Class8557.method28751:()Lcom/google/gson/GsonBuilder;
        //   135: invokevirtual   com/google/gson/GsonBuilder.setPrettyPrinting:()Lcom/google/gson/GsonBuilder;
        //   138: invokevirtual   com/google/gson/GsonBuilder.create:()Lcom/google/gson/Gson;
        //   141: aload_0        
        //   142: getfield        mapped/Class1561.field8736:Lmapped/Class7782;
        //   145: invokevirtual   com/google/gson/Gson.toJson:(Ljava/lang/Object;)Ljava/lang/String;
        //   148: ldc             "UTF-8"
        //   150: invokestatic    java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
        //   153: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   156: invokevirtual   java/io/OutputStream.write:([B)V
        //   159: aload           4
        //   161: invokevirtual   java/io/OutputStream.close:()V
        //   164: aload_3        
        //   165: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   168: sipush          429
        //   171: if_icmpne       206
        //   174: aload_0        
        //   175: getfield        mapped/Class1561.field8734:Lmapped/Class7671;
        //   178: new             Ljava/lang/StringBuilder;
        //   181: dup            
        //   182: invokespecial   java/lang/StringBuilder.<init>:()V
        //   185: getstatic       mapped/Class300.field1730:Lmapped/Class300;
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   191: ldc             "You can only paste ones every minute to protect our systems."
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokeinterface mapped/Class7671.method24351:(Ljava/lang/String;)V
        //   204: return         
        //   205: athrow         
        //   206: new             Ljava/io/InputStreamReader;
        //   209: dup            
        //   210: aload_3        
        //   211: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   214: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   217: invokestatic    com/google/common/io/CharStreams.toString:(Ljava/lang/Readable;)Ljava/lang/String;
        //   220: astore          5
        //   222: aload_3        
        //   223: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   226: invokevirtual   java/io/InputStream.close:()V
        //   229: invokestatic    mapped/Class8557.method28750:()Lcom/google/gson/Gson;
        //   232: aload           5
        //   234: ldc             Lcom/google/gson/JsonObject;.class
        //   236: invokevirtual   com/google/gson/Gson.fromJson:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   239: checkcast       Lcom/google/gson/JsonObject;
        //   242: astore          6
        //   244: aload           6
        //   246: ldc             "key"
        //   248: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   251: ifne            265
        //   254: new             Ljava/io/InvalidObjectException;
        //   257: dup            
        //   258: ldc             "Key is not given in Hastebin output"
        //   260: invokespecial   java/io/InvalidObjectException.<init>:(Ljava/lang/String;)V
        //   263: athrow         
        //   264: athrow         
        //   265: aload_0        
        //   266: getfield        mapped/Class1561.field8734:Lmapped/Class7671;
        //   269: new             Ljava/lang/StringBuilder;
        //   272: dup            
        //   273: invokespecial   java/lang/StringBuilder.<init>:()V
        //   276: getstatic       mapped/Class300.field1728:Lmapped/Class300;
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   282: ldc             "We've made a dump with useful information, report your issue and provide this url: "
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: aload_0        
        //   288: getfield        mapped/Class1561.field8737:Lmapped/Class5008;
        //   291: aload           6
        //   293: ldc             "key"
        //   295: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   298: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   301: invokestatic    mapped/Class5008.method15229:(Lmapped/Class5008;Ljava/lang/String;)Ljava/lang/String;
        //   304: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   307: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   310: invokeinterface mapped/Class7671.method24351:(Ljava/lang/String;)V
        //   315: goto            470
        //   318: athrow         
        //   319: astore          4
        //   321: aload_0        
        //   322: getfield        mapped/Class1561.field8734:Lmapped/Class7671;
        //   325: new             Ljava/lang/StringBuilder;
        //   328: dup            
        //   329: invokespecial   java/lang/StringBuilder.<init>:()V
        //   332: getstatic       mapped/Class300.field1730:Lmapped/Class300;
        //   335: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   338: ldc             "Failed to dump, please check the console for more information"
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   343: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   346: invokeinterface mapped/Class7671.method24351:(Ljava/lang/String;)V
        //   351: invokestatic    mapped/Class8563.method28793:()Lmapped/Class9366;
        //   354: invokeinterface mapped/Class9366.method34742:()Ljava/util/logging/Logger;
        //   359: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   362: ldc             "Could not paste ViaVersion dump to Hastebin"
        //   364: aload           4
        //   366: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   369: aload_3        
        //   370: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   373: sipush          200
        //   376: if_icmplt       389
        //   379: aload_3        
        //   380: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   383: sipush          400
        //   386: if_icmple       446
        //   389: new             Ljava/io/InputStreamReader;
        //   392: dup            
        //   393: aload_3        
        //   394: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   397: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   400: invokestatic    com/google/common/io/CharStreams.toString:(Ljava/lang/Readable;)Ljava/lang/String;
        //   403: astore          5
        //   405: aload_3        
        //   406: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   409: invokevirtual   java/io/InputStream.close:()V
        //   412: invokestatic    mapped/Class8563.method28793:()Lmapped/Class9366;
        //   415: invokeinterface mapped/Class9366.method34742:()Ljava/util/logging/Logger;
        //   420: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   423: new             Ljava/lang/StringBuilder;
        //   426: dup            
        //   427: invokespecial   java/lang/StringBuilder.<init>:()V
        //   430: ldc             "Page returned: "
        //   432: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   435: aload           5
        //   437: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   440: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   443: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;)V
        //   446: goto            470
        //   449: athrow         
        //   450: astore          5
        //   452: invokestatic    mapped/Class8563.method28793:()Lmapped/Class9366;
        //   455: invokeinterface mapped/Class9366.method34742:()Ljava/util/logging/Logger;
        //   460: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   463: ldc             "Failed to capture further info"
        //   465: aload           5
        //   467: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   470: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      18     22     73     Ljava/io/IOException;
        //  74     204    319    449    Ljava/lang/Exception;
        //  206    264    319    449    Ljava/lang/Exception;
        //  265    315    319    449    Ljava/lang/Exception;
        //  369    446    450    470    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0389:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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

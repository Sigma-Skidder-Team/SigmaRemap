// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Map;

public enum Class2208
{
    public static final enum Class2208 field13454;
    public static final enum Class2208 field13455;
    public static final enum Class2208 field13456;
    public static final enum Class2208 field13457;
    private static final Class2208[] field13458;
    private static final Map<Class<? extends IPacket<?>>, Class2208> field13459;
    private final int field13460;
    private final Map<Class2060, ? extends Class7719<?>> field13461;
    
    private static Class7720 method8386() {
        return new Class7720(null);
    }
    
    private Class2208(final int field13460, final Class7720 class7720) {
        this.field13460 = field13460;
        this.field13461 = Class7720.method24651(class7720);
    }
    
    @Nullable
    public Integer method8387(final Class2060 class2060, final IPacket<?> class2061) {
        return ((Class7719)this.field13461.get(class2060)).method24646(class2061.getClass());
    }
    
    @Nullable
    public IPacket<?> method8388(final Class2060 class2060, final int n) {
        return ((Class7719)this.field13461.get(class2060)).method24647(n);
    }
    
    public int method8389() {
        return this.field13460;
    }
    
    @Nullable
    public static Class2208 method8390(final int n) {
        return (n >= -1 && n <= 2) ? Class2208.field13458[n + 1] : null;
    }
    
    public static Class2208 method8391(final IPacket<?> class4252) {
        return Class2208.field13459.get(class4252.getClass());
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc             15
        //     5: ifeq            10
        //     8: nop            
        //     9: nop            
        //    10: ldc             14
        //    12: ifeq            9
        //    15: iconst_2       
        //    16: ifne            19
        //    19: invokestatic    java/util/Base64.getDecoder:()Ljava/util/Base64$Decoder;
        //    22: ldc             "gHT06HT4ci5cAPTyHpDs8Jr2GuwCivQAeAwa+ojw6hh29B4QBoDk/nZSCv5qEigEGpokTDa28vAY4Bj+Dg6+vMq2ABCO+OLkUBIoBBqaJE6cogIOoPTm5Bzq8Nq85ubsgCwqaJwC9olzZXvG"
        //    24: invokevirtual   java/util/Base64$Decoder.decode:(Ljava/lang/String;)[B
        //    27: dup            
        //    28: astore_2       
        //    29: dup            
        //    30: arraylength    
        //    31: dup            
        //    32: ifne            2087
        //    35: pop            
        //    36: dup            
        //    37: astore_2       
        //    38: dup            
        //    39: arraylength    
        //    40: dup            
        //    41: ifne            2131
        //    44: pop            
        //    45: dup            
        //    46: astore_2       
        //    47: dup            
        //    48: arraylength    
        //    49: dup            
        //    50: ifne            2199
        //    53: pop            
        //    54: dup            
        //    55: astore_2       
        //    56: dup            
        //    57: arraylength    
        //    58: iconst_m1      
        //    59: iadd           
        //    60: dup            
        //    61: ifne            2256
        //    64: pop            
        //    65: astore_3       
        //    66: new             Ljava/lang/String;
        //    69: dup            
        //    70: aload_3        
        //    71: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //    74: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
        //    77: astore_3       
        //    78: bipush          8
        //    80: anewarray       LLjava/lang/String;
        //    83: bipush          8
        //    85: anewarray       LLjava/lang/String;
        //    88: dup            
        //    89: iconst_2       
        //    90: aload_3        
        //    91: iconst_0       
        //    92: bipush          21
        //    94: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    97: aastore        
        //    98: dup            
        //    99: iconst_1       
        //   100: aload_3        
        //   101: bipush          21
        //   103: bipush          54
        //   105: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   108: aastore        
        //   109: swap           
        //   110: dup            
        //   111: iconst_3       
        //   112: aload_3        
        //   113: bipush          54
        //   115: bipush          65
        //   117: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   120: aastore        
        //   121: swap           
        //   122: swap           
        //   123: dup            
        //   124: bipush          7
        //   126: aload_3        
        //   127: bipush          65
        //   129: bipush          85
        //   131: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   134: aastore        
        //   135: swap           
        //   136: swap           
        //   137: dup            
        //   138: bipush          6
        //   140: aload_3        
        //   141: bipush          85
        //   143: bipush          90
        //   145: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   148: aastore        
        //   149: swap           
        //   150: swap           
        //   151: dup            
        //   152: iconst_4       
        //   153: aload_3        
        //   154: bipush          90
        //   156: bipush          94
        //   158: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   161: aastore        
        //   162: swap           
        //   163: dup            
        //   164: iconst_0       
        //   165: aload_3        
        //   166: bipush          94
        //   168: bipush          101
        //   170: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   173: aastore        
        //   174: swap           
        //   175: dup            
        //   176: iconst_5       
        //   177: aload_3        
        //   178: bipush          101
        //   180: bipush          107
        //   182: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   185: aastore        
        //   186: swap           
        //   187: putstatic       mapped/Class2208.\u3f9b\u63ae\u11e9\ub0ad\uc29e\uf9ba:[Ljava/lang/String;
        //   190: astore_3       
        //   191: new             Lmapped/Class2208;
        //   194: dup            
        //   195: ldc             "HANDSHAKING"
        //   197: iconst_0       
        //   198: iconst_m1      
        //   199: invokestatic    mapped/Class2208.method8386:()Lmapped/Class7720;
        //   202: getstatic       mapped/Class2060.field11779:Lmapped/Class2060;
        //   205: new             Lmapped/Class7719;
        //   208: dup            
        //   209: aconst_null    
        //   210: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //   213: ldc             Lmapped/Class4398;.class
        //   215: invokedynamic   BootstrapMethod #1, get:()Ljava/util/function/Supplier;
        //   220: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   223: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //   226: invokespecial   mapped/Class2208.<init>:(Ljava/lang/String;IILmapped/Class7720;)V
        //   229: putstatic       mapped/Class2208.field13454:Lmapped/Class2208;
        //   232: new             Lmapped/Class2208;
        //   235: dup            
        //   236: ldc             "PLAY"
        //   238: iconst_1       
        //   239: iconst_0       
        //   240: invokestatic    mapped/Class2208.method8386:()Lmapped/Class7720;
        //   243: getstatic       mapped/Class2060.field11780:Lmapped/Class2060;
        //   246: new             Lmapped/Class7719;
        //   249: dup            
        //   250: aconst_null    
        //   251: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //   254: ldc             Lmapped/Class4339;.class
        //   256: invokedynamic   BootstrapMethod #2, get:()Ljava/util/function/Supplier;
        //   261: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   264: ldc             Lmapped/Class4375;.class
        //   266: invokedynamic   BootstrapMethod #3, get:()Ljava/util/function/Supplier;
        //   271: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   274: ldc             Lmapped/Class4318;.class
        //   276: invokedynamic   BootstrapMethod #4, get:()Ljava/util/function/Supplier;
        //   281: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   284: ldc             Lmapped/Class4276;.class
        //   286: invokedynamic   BootstrapMethod #5, get:()Ljava/util/function/Supplier;
        //   291: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   294: ldc_w           Lmapped/Class4293;.class
        //   297: invokedynamic   BootstrapMethod #6, get:()Ljava/util/function/Supplier;
        //   302: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   305: ldc_w           Lmapped/Class4361;.class
        //   308: invokedynamic   BootstrapMethod #7, get:()Ljava/util/function/Supplier;
        //   313: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   316: ldc_w           Lmapped/Class4289;.class
        //   319: invokedynamic   BootstrapMethod #8, get:()Ljava/util/function/Supplier;
        //   324: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   327: ldc_w           Lmapped/Class4279;.class
        //   330: invokedynamic   BootstrapMethod #9, get:()Ljava/util/function/Supplier;
        //   335: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   338: ldc_w           Lmapped/Class4320;.class
        //   341: invokedynamic   BootstrapMethod #10, get:()Ljava/util/function/Supplier;
        //   346: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   349: ldc_w           Lmapped/Class4310;.class
        //   352: invokedynamic   BootstrapMethod #11, get:()Ljava/util/function/Supplier;
        //   357: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   360: ldc_w           Lmapped/Class4357;.class
        //   363: invokedynamic   BootstrapMethod #12, get:()Ljava/util/function/Supplier;
        //   368: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   371: ldc_w           Lmapped/Class4363;.class
        //   374: invokedynamic   BootstrapMethod #13, get:()Ljava/util/function/Supplier;
        //   379: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   382: ldc_w           Lmapped/Class4271;.class
        //   385: invokedynamic   BootstrapMethod #14, get:()Ljava/util/function/Supplier;
        //   390: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   393: ldc_w           Lmapped/Class4301;.class
        //   396: invokedynamic   BootstrapMethod #15, get:()Ljava/util/function/Supplier;
        //   401: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   404: ldc_w           Lmapped/Class4315;.class
        //   407: invokedynamic   BootstrapMethod #16, get:()Ljava/util/function/Supplier;
        //   412: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   415: ldc_w           Lmapped/Class4378;.class
        //   418: invokedynamic   BootstrapMethod #17, get:()Ljava/util/function/Supplier;
        //   423: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   426: ldc_w           Lmapped/Class4312;.class
        //   429: invokedynamic   BootstrapMethod #18, get:()Ljava/util/function/Supplier;
        //   434: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   437: ldc_w           Lmapped/Class4337;.class
        //   440: invokedynamic   BootstrapMethod #19, get:()Ljava/util/function/Supplier;
        //   445: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   448: ldc_w           Lmapped/Class4369;.class
        //   451: invokedynamic   BootstrapMethod #20, get:()Ljava/util/function/Supplier;
        //   456: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   459: ldc_w           Lmapped/Class4393;.class
        //   462: invokedynamic   BootstrapMethod #21, get:()Ljava/util/function/Supplier;
        //   467: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   470: ldc_w           Lmapped/Class4284;.class
        //   473: invokedynamic   BootstrapMethod #22, get:()Ljava/util/function/Supplier;
        //   478: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   481: ldc_w           Lmapped/Class4365;.class
        //   484: invokedynamic   BootstrapMethod #23, get:()Ljava/util/function/Supplier;
        //   489: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   492: ldc_w           Lmapped/Class4311;.class
        //   495: invokedynamic   BootstrapMethod #24, get:()Ljava/util/function/Supplier;
        //   500: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   503: ldc_w           Lmapped/Class4272;.class
        //   506: invokedynamic   BootstrapMethod #25, get:()Ljava/util/function/Supplier;
        //   511: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   514: ldc_w           Lmapped/Class4391;.class
        //   517: invokedynamic   BootstrapMethod #26, get:()Ljava/util/function/Supplier;
        //   522: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   525: ldc_w           Lmapped/Class4376;.class
        //   528: invokedynamic   BootstrapMethod #27, get:()Ljava/util/function/Supplier;
        //   533: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   536: ldc_w           Lmapped/Class4342;.class
        //   539: invokedynamic   BootstrapMethod #28, get:()Ljava/util/function/Supplier;
        //   544: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   547: ldc_w           Lmapped/Class4262;.class
        //   550: invokedynamic   BootstrapMethod #29, get:()Ljava/util/function/Supplier;
        //   555: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   558: ldc_w           Lmapped/Class4264;.class
        //   561: invokedynamic   BootstrapMethod #30, get:()Ljava/util/function/Supplier;
        //   566: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   569: ldc_w           Lmapped/Class4394;.class
        //   572: invokedynamic   BootstrapMethod #31, get:()Ljava/util/function/Supplier;
        //   577: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   580: ldc_w           Lmapped/Class4288;.class
        //   583: invokedynamic   BootstrapMethod #32, get:()Ljava/util/function/Supplier;
        //   588: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   591: ldc_w           Lmapped/Class4306;.class
        //   594: invokedynamic   BootstrapMethod #33, get:()Ljava/util/function/Supplier;
        //   599: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   602: ldc_w           Lmapped/Class4259;.class
        //   605: invokedynamic   BootstrapMethod #34, get:()Ljava/util/function/Supplier;
        //   610: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   613: ldc_w           Lmapped/Class4396;.class
        //   616: invokedynamic   BootstrapMethod #35, get:()Ljava/util/function/Supplier;
        //   621: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   624: ldc_w           Lmapped/Class4298;.class
        //   627: invokedynamic   BootstrapMethod #36, get:()Ljava/util/function/Supplier;
        //   632: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   635: ldc_w           Lmapped/Class4395;.class
        //   638: invokedynamic   BootstrapMethod #37, get:()Ljava/util/function/Supplier;
        //   643: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   646: ldc_w           Lmapped/Class4278;.class
        //   649: invokedynamic   BootstrapMethod #38, get:()Ljava/util/function/Supplier;
        //   654: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   657: ldc_w           Lmapped/Class4349;.class
        //   660: invokedynamic   BootstrapMethod #39, get:()Ljava/util/function/Supplier;
        //   665: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   668: ldc_w           Lmapped/Class4383;.class
        //   671: invokedynamic   BootstrapMethod #40, get:()Ljava/util/function/Supplier;
        //   676: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   679: ldc_w           Lmapped/Class4333;.class
        //   682: invokedynamic   BootstrapMethod #41, get:()Ljava/util/function/Supplier;
        //   687: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   690: ldc_w           Lmapped/Class4346;.class
        //   693: invokedynamic   BootstrapMethod #42, get:()Ljava/util/function/Supplier;
        //   698: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   701: ldc_w           Lmapped/Class4372;.class
        //   704: invokedynamic   BootstrapMethod #43, get:()Ljava/util/function/Supplier;
        //   709: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   712: ldc_w           Lmapped/Class4371;.class
        //   715: invokedynamic   BootstrapMethod #44, get:()Ljava/util/function/Supplier;
        //   720: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   723: ldc_w           Lmapped/Class4373;.class
        //   726: invokedynamic   BootstrapMethod #45, get:()Ljava/util/function/Supplier;
        //   731: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   734: ldc_w           Lmapped/Class4370;.class
        //   737: invokedynamic   BootstrapMethod #46, get:()Ljava/util/function/Supplier;
        //   742: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   745: ldc_w           Lmapped/Class4263;.class
        //   748: invokedynamic   BootstrapMethod #47, get:()Ljava/util/function/Supplier;
        //   753: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   756: ldc_w           Lmapped/Class4316;.class
        //   759: invokedynamic   BootstrapMethod #48, get:()Ljava/util/function/Supplier;
        //   764: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   767: ldc_w           Lmapped/Class4308;.class
        //   770: invokedynamic   BootstrapMethod #49, get:()Ljava/util/function/Supplier;
        //   775: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   778: ldc_w           Lmapped/Class4350;.class
        //   781: invokedynamic   BootstrapMethod #50, get:()Ljava/util/function/Supplier;
        //   786: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   789: ldc_w           Lmapped/Class4257;.class
        //   792: invokedynamic   BootstrapMethod #51, get:()Ljava/util/function/Supplier;
        //   797: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   800: ldc_w           Lmapped/Class4300;.class
        //   803: invokedynamic   BootstrapMethod #52, get:()Ljava/util/function/Supplier;
        //   808: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   811: ldc_w           Lmapped/Class4260;.class
        //   814: invokedynamic   BootstrapMethod #53, get:()Ljava/util/function/Supplier;
        //   819: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   822: ldc_w           Lmapped/Class4330;.class
        //   825: invokedynamic   BootstrapMethod #54, get:()Ljava/util/function/Supplier;
        //   830: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   833: ldc_w           Lmapped/Class4280;.class
        //   836: invokedynamic   BootstrapMethod #55, get:()Ljava/util/function/Supplier;
        //   841: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   844: ldc_w           Lmapped/Class4328;.class
        //   847: invokedynamic   BootstrapMethod #56, get:()Ljava/util/function/Supplier;
        //   852: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   855: ldc_w           Lmapped/Class4331;.class
        //   858: invokedynamic   BootstrapMethod #57, get:()Ljava/util/function/Supplier;
        //   863: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   866: ldc_w           Lmapped/Class4325;.class
        //   869: invokedynamic   BootstrapMethod #58, get:()Ljava/util/function/Supplier;
        //   874: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   877: ldc_w           Lmapped/Class4295;.class
        //   880: invokedynamic   BootstrapMethod #59, get:()Ljava/util/function/Supplier;
        //   885: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   888: ldc_w           Lmapped/Class4283;.class
        //   891: invokedynamic   BootstrapMethod #60, get:()Ljava/util/function/Supplier;
        //   896: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   899: ldc_w           Lmapped/Class4359;.class
        //   902: invokedynamic   BootstrapMethod #61, get:()Ljava/util/function/Supplier;
        //   907: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   910: ldc_w           Lmapped/Class4364;.class
        //   913: invokedynamic   BootstrapMethod #62, get:()Ljava/util/function/Supplier;
        //   918: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   921: ldc_w           Lmapped/Class4269;.class
        //   924: invokedynamic   BootstrapMethod #63, get:()Ljava/util/function/Supplier;
        //   929: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   932: ldc_w           Lmapped/Class4340;.class
        //   935: invokedynamic   BootstrapMethod #64, get:()Ljava/util/function/Supplier;
        //   940: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   943: ldc_w           Lmapped/Class4343;.class
        //   946: invokedynamic   BootstrapMethod #65, get:()Ljava/util/function/Supplier;
        //   951: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   954: ldc_w           Lmapped/Class4388;.class
        //   957: invokedynamic   BootstrapMethod #66, get:()Ljava/util/function/Supplier;
        //   962: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   965: ldc_w           Lmapped/Class4379;.class
        //   968: invokedynamic   BootstrapMethod #67, get:()Ljava/util/function/Supplier;
        //   973: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   976: ldc_w           Lmapped/Class4332;.class
        //   979: invokedynamic   BootstrapMethod #68, get:()Ljava/util/function/Supplier;
        //   984: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   987: ldc_w           Lmapped/Class4253;.class
        //   990: invokedynamic   BootstrapMethod #69, get:()Ljava/util/function/Supplier;
        //   995: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //   998: ldc_w           Lmapped/Class4268;.class
        //  1001: invokedynamic   BootstrapMethod #70, get:()Ljava/util/function/Supplier;
        //  1006: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1009: ldc_w           Lmapped/Class4305;.class
        //  1012: invokedynamic   BootstrapMethod #71, get:()Ljava/util/function/Supplier;
        //  1017: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1020: ldc_w           Lmapped/Class4273;.class
        //  1023: invokedynamic   BootstrapMethod #72, get:()Ljava/util/function/Supplier;
        //  1028: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1031: ldc_w           Lmapped/Class4402;.class
        //  1034: invokedynamic   BootstrapMethod #73, get:()Ljava/util/function/Supplier;
        //  1039: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1042: ldc_w           Lmapped/Class4313;.class
        //  1045: invokedynamic   BootstrapMethod #74, get:()Ljava/util/function/Supplier;
        //  1050: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1053: ldc_w           Lmapped/Class4292;.class
        //  1056: invokedynamic   BootstrapMethod #75, get:()Ljava/util/function/Supplier;
        //  1061: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1064: ldc_w           Lmapped/Class4400;.class
        //  1067: invokedynamic   BootstrapMethod #76, get:()Ljava/util/function/Supplier;
        //  1072: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1075: ldc_w           Lmapped/Class4286;.class
        //  1078: invokedynamic   BootstrapMethod #77, get:()Ljava/util/function/Supplier;
        //  1083: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1086: ldc_w           Lmapped/Class4290;.class
        //  1089: invokedynamic   BootstrapMethod #78, get:()Ljava/util/function/Supplier;
        //  1094: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1097: ldc_w           Lmapped/Class4377;.class
        //  1100: invokedynamic   BootstrapMethod #79, get:()Ljava/util/function/Supplier;
        //  1105: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1108: ldc_w           Lmapped/Class4335;.class
        //  1111: invokedynamic   BootstrapMethod #80, get:()Ljava/util/function/Supplier;
        //  1116: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1119: ldc_w           Lmapped/Class4345;.class
        //  1122: invokedynamic   BootstrapMethod #81, get:()Ljava/util/function/Supplier;
        //  1127: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1130: ldc_w           Lmapped/Class4352;.class
        //  1133: invokedynamic   BootstrapMethod #82, get:()Ljava/util/function/Supplier;
        //  1138: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1141: ldc_w           Lmapped/Class4351;.class
        //  1144: invokedynamic   BootstrapMethod #83, get:()Ljava/util/function/Supplier;
        //  1149: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1152: ldc_w           Lmapped/Class4282;.class
        //  1155: invokedynamic   BootstrapMethod #84, get:()Ljava/util/function/Supplier;
        //  1160: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1163: ldc_w           Lmapped/Class4382;.class
        //  1166: invokedynamic   BootstrapMethod #85, get:()Ljava/util/function/Supplier;
        //  1171: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1174: ldc_w           Lmapped/Class4374;.class
        //  1177: invokedynamic   BootstrapMethod #86, get:()Ljava/util/function/Supplier;
        //  1182: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1185: ldc_w           Lmapped/Class4296;.class
        //  1188: invokedynamic   BootstrapMethod #87, get:()Ljava/util/function/Supplier;
        //  1193: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1196: ldc_w           Lmapped/Class4304;.class
        //  1199: invokedynamic   BootstrapMethod #88, get:()Ljava/util/function/Supplier;
        //  1204: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1207: ldc_w           Lmapped/Class4258;.class
        //  1210: invokedynamic   BootstrapMethod #89, get:()Ljava/util/function/Supplier;
        //  1215: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1218: ldc_w           Lmapped/Class4385;.class
        //  1221: invokedynamic   BootstrapMethod #90, get:()Ljava/util/function/Supplier;
        //  1226: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1229: ldc_w           Lmapped/Class4347;.class
        //  1232: invokedynamic   BootstrapMethod #91, get:()Ljava/util/function/Supplier;
        //  1237: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1240: ldc_w           Lmapped/Class4384;.class
        //  1243: invokedynamic   BootstrapMethod #92, get:()Ljava/util/function/Supplier;
        //  1248: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1251: ldc_w           Lmapped/Class4281;.class
        //  1254: invokedynamic   BootstrapMethod #93, get:()Ljava/util/function/Supplier;
        //  1259: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1262: ldc_w           Lmapped/Class4297;.class
        //  1265: invokedynamic   BootstrapMethod #94, get:()Ljava/util/function/Supplier;
        //  1270: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1273: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  1276: getstatic       mapped/Class2060.field11779:Lmapped/Class2060;
        //  1279: new             Lmapped/Class7719;
        //  1282: dup            
        //  1283: aconst_null    
        //  1284: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //  1287: ldc_w           Lmapped/Class4348;.class
        //  1290: invokedynamic   BootstrapMethod #95, get:()Ljava/util/function/Supplier;
        //  1295: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1298: ldc_w           Lmapped/Class4275;.class
        //  1301: invokedynamic   BootstrapMethod #96, get:()Ljava/util/function/Supplier;
        //  1306: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1309: ldc_w           Lmapped/Class4338;.class
        //  1312: invokedynamic   BootstrapMethod #97, get:()Ljava/util/function/Supplier;
        //  1317: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1320: ldc_w           Lmapped/Class4317;.class
        //  1323: invokedynamic   BootstrapMethod #98, get:()Ljava/util/function/Supplier;
        //  1328: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1331: ldc_w           Lmapped/Class4323;.class
        //  1334: invokedynamic   BootstrapMethod #99, get:()Ljava/util/function/Supplier;
        //  1339: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1342: ldc_w           Lmapped/Class4386;.class
        //  1345: invokedynamic   BootstrapMethod #100, get:()Ljava/util/function/Supplier;
        //  1350: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1353: ldc_w           Lmapped/Class4265;.class
        //  1356: invokedynamic   BootstrapMethod #101, get:()Ljava/util/function/Supplier;
        //  1361: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1364: ldc_w           Lmapped/Class4255;.class
        //  1367: invokedynamic   BootstrapMethod #102, get:()Ljava/util/function/Supplier;
        //  1372: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1375: ldc_w           Lmapped/Class4366;.class
        //  1378: invokedynamic   BootstrapMethod #103, get:()Ljava/util/function/Supplier;
        //  1383: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1386: ldc_w           Lmapped/Class4256;.class
        //  1389: invokedynamic   BootstrapMethod #104, get:()Ljava/util/function/Supplier;
        //  1394: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1397: ldc_w           Lmapped/Class4389;.class
        //  1400: invokedynamic   BootstrapMethod #105, get:()Ljava/util/function/Supplier;
        //  1405: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1408: ldc_w           Lmapped/Class4326;.class
        //  1411: invokedynamic   BootstrapMethod #106, get:()Ljava/util/function/Supplier;
        //  1416: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1419: ldc_w           Lmapped/Class4314;.class
        //  1422: invokedynamic   BootstrapMethod #107, get:()Ljava/util/function/Supplier;
        //  1427: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1430: ldc_w           Lmapped/Class4261;.class
        //  1433: invokedynamic   BootstrapMethod #108, get:()Ljava/util/function/Supplier;
        //  1438: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1441: ldc_w           Lmapped/Class4381;.class
        //  1444: invokedynamic   BootstrapMethod #109, get:()Ljava/util/function/Supplier;
        //  1449: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1452: ldc_w           Lmapped/Class4303;.class
        //  1455: invokedynamic   BootstrapMethod #110, get:()Ljava/util/function/Supplier;
        //  1460: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1463: ldc_w           Lmapped/Class4291;.class
        //  1466: invokedynamic   BootstrapMethod #111, get:()Ljava/util/function/Supplier;
        //  1471: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1474: ldc_w           Lmapped/Class4354;.class
        //  1477: invokedynamic   BootstrapMethod #112, get:()Ljava/util/function/Supplier;
        //  1482: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1485: ldc_w           Lmapped/Class4355;.class
        //  1488: invokedynamic   BootstrapMethod #113, get:()Ljava/util/function/Supplier;
        //  1493: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1496: ldc_w           Lmapped/Class4356;.class
        //  1499: invokedynamic   BootstrapMethod #114, get:()Ljava/util/function/Supplier;
        //  1504: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1507: ldc_w           Lmapped/Class4353;.class
        //  1510: invokedynamic   BootstrapMethod #115, get:()Ljava/util/function/Supplier;
        //  1515: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1518: ldc_w           Lmapped/Class4251;.class
        //  1521: invokedynamic   BootstrapMethod #116, get:()Ljava/util/function/Supplier;
        //  1526: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1529: ldc_w           Lmapped/Class4302;.class
        //  1532: invokedynamic   BootstrapMethod #117, get:()Ljava/util/function/Supplier;
        //  1537: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1540: ldc_w           Lmapped/Class4267;.class
        //  1543: invokedynamic   BootstrapMethod #118, get:()Ljava/util/function/Supplier;
        //  1548: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1551: ldc_w           Lmapped/Class4387;.class
        //  1554: invokedynamic   BootstrapMethod #119, get:()Ljava/util/function/Supplier;
        //  1559: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1562: ldc_w           Lmapped/Class4358;.class
        //  1565: invokedynamic   BootstrapMethod #120, get:()Ljava/util/function/Supplier;
        //  1570: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1573: ldc_w           Lmapped/Class4399;.class
        //  1576: invokedynamic   BootstrapMethod #121, get:()Ljava/util/function/Supplier;
        //  1581: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1584: ldc_w           Lmapped/Class4336;.class
        //  1587: invokedynamic   BootstrapMethod #122, get:()Ljava/util/function/Supplier;
        //  1592: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1595: ldc_w           Lmapped/Class4254;.class
        //  1598: invokedynamic   BootstrapMethod #123, get:()Ljava/util/function/Supplier;
        //  1603: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1606: ldc_w           Lmapped/Class4397;.class
        //  1609: invokedynamic   BootstrapMethod #124, get:()Ljava/util/function/Supplier;
        //  1614: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1617: ldc_w           Lmapped/Class4362;.class
        //  1620: invokedynamic   BootstrapMethod #125, get:()Ljava/util/function/Supplier;
        //  1625: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1628: ldc_w           Lmapped/Class4285;.class
        //  1631: invokedynamic   BootstrapMethod #126, get:()Ljava/util/function/Supplier;
        //  1636: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1639: ldc_w           Lmapped/Class4334;.class
        //  1642: invokedynamic   BootstrapMethod #127, get:()Ljava/util/function/Supplier;
        //  1647: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1650: ldc_w           Lmapped/Class4324;.class
        //  1653: invokedynamic   BootstrapMethod #128, get:()Ljava/util/function/Supplier;
        //  1658: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1661: ldc_w           Lmapped/Class4368;.class
        //  1664: invokedynamic   BootstrapMethod #129, get:()Ljava/util/function/Supplier;
        //  1669: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1672: ldc_w           Lmapped/Class4321;.class
        //  1675: invokedynamic   BootstrapMethod #130, get:()Ljava/util/function/Supplier;
        //  1680: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1683: ldc_w           Lmapped/Class4266;.class
        //  1686: invokedynamic   BootstrapMethod #131, get:()Ljava/util/function/Supplier;
        //  1691: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1694: ldc_w           Lmapped/Class4401;.class
        //  1697: invokedynamic   BootstrapMethod #132, get:()Ljava/util/function/Supplier;
        //  1702: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1705: ldc_w           Lmapped/Class4287;.class
        //  1708: invokedynamic   BootstrapMethod #133, get:()Ljava/util/function/Supplier;
        //  1713: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1716: ldc_w           Lmapped/Class4270;.class
        //  1719: invokedynamic   BootstrapMethod #134, get:()Ljava/util/function/Supplier;
        //  1724: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1727: ldc_w           Lmapped/Class4360;.class
        //  1730: invokedynamic   BootstrapMethod #135, get:()Ljava/util/function/Supplier;
        //  1735: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1738: ldc_w           Lmapped/Class4344;.class
        //  1741: invokedynamic   BootstrapMethod #136, get:()Ljava/util/function/Supplier;
        //  1746: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1749: ldc_w           Lmapped/Class4380;.class
        //  1752: invokedynamic   BootstrapMethod #137, get:()Ljava/util/function/Supplier;
        //  1757: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1760: ldc_w           Lmapped/Class4294;.class
        //  1763: invokedynamic   BootstrapMethod #138, get:()Ljava/util/function/Supplier;
        //  1768: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1771: ldc_w           Lmapped/Class4329;.class
        //  1774: invokedynamic   BootstrapMethod #139, get:()Ljava/util/function/Supplier;
        //  1779: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1782: ldc_w           Lmapped/Class4307;.class
        //  1785: invokedynamic   BootstrapMethod #140, get:()Ljava/util/function/Supplier;
        //  1790: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1793: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  1796: invokespecial   mapped/Class2208.<init>:(Ljava/lang/String;IILmapped/Class7720;)V
        //  1799: putstatic       mapped/Class2208.field13455:Lmapped/Class2208;
        //  1802: new             Lmapped/Class2208;
        //  1805: dup            
        //  1806: ldc_w           "STATUS"
        //  1809: iconst_2       
        //  1810: iconst_1       
        //  1811: invokestatic    mapped/Class2208.method8386:()Lmapped/Class7720;
        //  1814: getstatic       mapped/Class2060.field11779:Lmapped/Class2060;
        //  1817: new             Lmapped/Class7719;
        //  1820: dup            
        //  1821: aconst_null    
        //  1822: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //  1825: ldc_w           Lmapped/Class4392;.class
        //  1828: invokedynamic   BootstrapMethod #141, get:()Ljava/util/function/Supplier;
        //  1833: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1836: ldc_w           Lmapped/Class4319;.class
        //  1839: invokedynamic   BootstrapMethod #142, get:()Ljava/util/function/Supplier;
        //  1844: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1847: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  1850: getstatic       mapped/Class2060.field11780:Lmapped/Class2060;
        //  1853: new             Lmapped/Class7719;
        //  1856: dup            
        //  1857: aconst_null    
        //  1858: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //  1861: ldc_w           Lmapped/Class4403;.class
        //  1864: invokedynamic   BootstrapMethod #143, get:()Ljava/util/function/Supplier;
        //  1869: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1872: ldc_w           Lmapped/Class4274;.class
        //  1875: invokedynamic   BootstrapMethod #144, get:()Ljava/util/function/Supplier;
        //  1880: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1883: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  1886: invokespecial   mapped/Class2208.<init>:(Ljava/lang/String;IILmapped/Class7720;)V
        //  1889: putstatic       mapped/Class2208.field13456:Lmapped/Class2208;
        //  1892: new             Lmapped/Class2208;
        //  1895: dup            
        //  1896: ldc_w           "LOGIN"
        //  1899: iconst_3       
        //  1900: iconst_2       
        //  1901: invokestatic    mapped/Class2208.method8386:()Lmapped/Class7720;
        //  1904: getstatic       mapped/Class2060.field11780:Lmapped/Class2060;
        //  1907: new             Lmapped/Class7719;
        //  1910: dup            
        //  1911: aconst_null    
        //  1912: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //  1915: ldc_w           Lmapped/Class4277;.class
        //  1918: invokedynamic   BootstrapMethod #145, get:()Ljava/util/function/Supplier;
        //  1923: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1926: ldc_w           Lmapped/Class4309;.class
        //  1929: invokedynamic   BootstrapMethod #146, get:()Ljava/util/function/Supplier;
        //  1934: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1937: ldc_w           Lmapped/Class4367;.class
        //  1940: invokedynamic   BootstrapMethod #147, get:()Ljava/util/function/Supplier;
        //  1945: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1948: ldc_w           Lmapped/Class4322;.class
        //  1951: invokedynamic   BootstrapMethod #148, get:()Ljava/util/function/Supplier;
        //  1956: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1959: ldc_w           Lmapped/Class4299;.class
        //  1962: invokedynamic   BootstrapMethod #149, get:()Ljava/util/function/Supplier;
        //  1967: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1970: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  1973: getstatic       mapped/Class2060.field11779:Lmapped/Class2060;
        //  1976: new             Lmapped/Class7719;
        //  1979: dup            
        //  1980: aconst_null    
        //  1981: invokespecial   mapped/Class7719.<init>:(Lmapped/Class9069;)V
        //  1984: ldc_w           Lmapped/Class4327;.class
        //  1987: invokedynamic   BootstrapMethod #150, get:()Ljava/util/function/Supplier;
        //  1992: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  1995: ldc_w           Lmapped/Class4341;.class
        //  1998: invokedynamic   BootstrapMethod #151, get:()Ljava/util/function/Supplier;
        //  2003: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  2006: ldc_w           Lmapped/Class4390;.class
        //  2009: invokedynamic   BootstrapMethod #152, get:()Ljava/util/function/Supplier;
        //  2014: invokevirtual   mapped/Class7719.method24645:(Ljava/lang/Class;Ljava/util/function/Supplier;)Lmapped/Class7719;
        //  2017: invokevirtual   mapped/Class7720.method24650:(Lmapped/Class2060;Lmapped/Class7719;)Lmapped/Class7720;
        //  2020: invokespecial   mapped/Class2208.<init>:(Ljava/lang/String;IILmapped/Class7720;)V
        //  2023: putstatic       mapped/Class2208.field13457:Lmapped/Class2208;
        //  2026: iconst_4       
        //  2027: anewarray       Lmapped/Class2208;
        //  2030: dup            
        //  2031: iconst_0       
        //  2032: getstatic       mapped/Class2208.field13454:Lmapped/Class2208;
        //  2035: aastore        
        //  2036: dup            
        //  2037: iconst_1       
        //  2038: getstatic       mapped/Class2208.field13455:Lmapped/Class2208;
        //  2041: aastore        
        //  2042: dup            
        //  2043: iconst_2       
        //  2044: getstatic       mapped/Class2208.field13456:Lmapped/Class2208;
        //  2047: aastore        
        //  2048: dup            
        //  2049: iconst_3       
        //  2050: getstatic       mapped/Class2208.field13457:Lmapped/Class2208;
        //  2053: aastore        
        //  2054: putstatic       mapped/Class2208.field13462:[Lmapped/Class2208;
        //  2057: iconst_4       
        //  2058: anewarray       Lmapped/Class2208;
        //  2061: putstatic       mapped/Class2208.field13458:[Lmapped/Class2208;
        //  2064: invokestatic    com/google/common/collect/Maps.newHashMap:()Ljava/util/HashMap;
        //  2067: putstatic       mapped/Class2208.field13459:Ljava/util/Map;
        //  2070: invokestatic    mapped/Class2208.values:()[Lmapped/Class2208;
        //  2073: astore          4
        //  2075: aload           4
        //  2077: arraylength    
        //  2078: istore          5
        //  2080: iconst_0       
        //  2081: istore          6
        //  2083: goto            2310
        //  2086: athrow         
        //  2087: dup            
        //  2088: istore          7
        //  2090: dup            
        //  2091: newarray        B
        //  2093: astore_3       
        //  2094: istore          8
        //  2096: iload           8
        //  2098: iconst_m1      
        //  2099: iadd           
        //  2100: istore          8
        //  2102: dup            
        //  2103: iload           8
        //  2105: baload         
        //  2106: bipush          10
        //  2108: ixor           
        //  2109: aload_3        
        //  2110: swap           
        //  2111: iload           8
        //  2113: swap           
        //  2114: bastore        
        //  2115: iload           8
        //  2117: ifeq            2124
        //  2120: goto            2096
        //  2123: athrow         
        //  2124: pop            
        //  2125: aload_3        
        //  2126: iconst_0       
        //  2127: goto            35
        //  2130: athrow         
        //  2131: dup            
        //  2132: istore          7
        //  2134: dup            
        //  2135: newarray        B
        //  2137: astore_3       
        //  2138: istore          8
        //  2140: iload           8
        //  2142: iconst_m1      
        //  2143: iadd           
        //  2144: istore          8
        //  2146: dup            
        //  2147: iload           8
        //  2149: baload         
        //  2150: iload           8
        //  2152: bipush          4
        //  2154: iadd           
        //  2155: iload           7
        //  2157: ineg           
        //  2158: iadd           
        //  2159: iflt            2169
        //  2162: bipush          4
        //  2164: iadd           
        //  2165: goto            2177
        //  2168: athrow         
        //  2169: aload_3        
        //  2170: iload           8
        //  2172: bipush          4
        //  2174: iadd           
        //  2175: baload         
        //  2176: iadd           
        //  2177: aload_3        
        //  2178: swap           
        //  2179: iload           8
        //  2181: swap           
        //  2182: bastore        
        //  2183: iload           8
        //  2185: ifeq            2192
        //  2188: goto            2140
        //  2191: athrow         
        //  2192: pop            
        //  2193: aload_3        
        //  2194: iconst_0       
        //  2195: goto            44
        //  2198: athrow         
        //  2199: dup            
        //  2200: istore          7
        //  2202: dup            
        //  2203: newarray        B
        //  2205: astore_3       
        //  2206: istore          8
        //  2208: iload           8
        //  2210: iconst_m1      
        //  2211: iadd           
        //  2212: istore          8
        //  2214: dup            
        //  2215: iload           8
        //  2217: baload         
        //  2218: dup            
        //  2219: iconst_4       
        //  2220: ishl           
        //  2221: bipush          -16
        //  2223: iand           
        //  2224: swap           
        //  2225: iconst_4       
        //  2226: ishr           
        //  2227: bipush          15
        //  2229: iand           
        //  2230: ior            
        //  2231: bipush          83
        //  2233: iadd           
        //  2234: aload_3        
        //  2235: swap           
        //  2236: iload           8
        //  2238: swap           
        //  2239: bastore        
        //  2240: iload           8
        //  2242: ifeq            2249
        //  2245: goto            2208
        //  2248: athrow         
        //  2249: pop            
        //  2250: aload_3        
        //  2251: iconst_0       
        //  2252: goto            53
        //  2255: athrow         
        //  2256: dup            
        //  2257: newarray        B
        //  2259: astore_3       
        //  2260: istore          8
        //  2262: iload           8
        //  2264: iconst_m1      
        //  2265: iadd           
        //  2266: istore          8
        //  2268: dup            
        //  2269: iload           8
        //  2271: baload         
        //  2272: bipush          3
        //  2274: ishl           
        //  2275: aload_2        
        //  2276: iload           8
        //  2278: iconst_1       
        //  2279: iadd           
        //  2280: baload         
        //  2281: bipush          5
        //  2283: ishr           
        //  2284: bipush          7
        //  2286: iand           
        //  2287: iadd           
        //  2288: aload_3        
        //  2289: swap           
        //  2290: iload           8
        //  2292: swap           
        //  2293: bastore        
        //  2294: iload           8
        //  2296: ifeq            2303
        //  2299: goto            2262
        //  2302: athrow         
        //  2303: pop            
        //  2304: aload_3        
        //  2305: iconst_0       
        //  2306: goto            64
        //  2309: athrow         
        //  2310: iload           6
        //  2312: iload           5
        //  2314: if_icmplt       2319
        //  2317: return         
        //  2318: athrow         
        //  2319: aload           4
        //  2321: iload           6
        //  2323: aaload         
        //  2324: astore          9
        //  2326: aload           9
        //  2328: invokevirtual   mapped/Class2208.method8389:()I
        //  2331: istore          10
        //  2333: iload           10
        //  2335: iconst_m1      
        //  2336: if_icmpge       2372
        //  2339: new             Ljava/lang/Error;
        //  2342: dup            
        //  2343: new             Ljava/lang/StringBuilder;
        //  2346: dup            
        //  2347: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2350: ldc_w           "Invalid protocol ID "
        //  2353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2356: iload           10
        //  2358: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  2361: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2364: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2367: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;)V
        //  2370: athrow         
        //  2371: athrow         
        //  2372: iload           10
        //  2374: iconst_2       
        //  2375: if_icmpgt       2412
        //  2378: getstatic       mapped/Class2208.field13458:[Lmapped/Class2208;
        //  2381: iload           10
        //  2383: iconst_m1      
        //  2384: isub           
        //  2385: aload           9
        //  2387: aastore        
        //  2388: aload           9
        //  2390: getfield        mapped/Class2208.field13461:Ljava/util/Map;
        //  2393: aload           9
        //  2395: invokedynamic   BootstrapMethod #153, accept:(Lmapped/Class2208;)Ljava/util/function/BiConsumer;
        //  2400: invokeinterface java/util/Map.forEach:(Ljava/util/function/BiConsumer;)V
        //  2405: iinc            6, 1
        //  2408: goto            2310
        //  2411: athrow         
        //  2412: goto            2339
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
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

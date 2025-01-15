// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.apache.commons.codec.digest.DigestUtils;
import java.io.InputStream;

public class Class7853
{
    public static Class7776 field32155;
    public static Class7776 field32156;
    public static Class7776 field32157;
    public static Class7776 field32158;
    public static Class7776 field32159;
    public static Class7776 field32160;
    public static Class7776 field32161;
    public static Class7776 field32162;
    public static Class7776 field32163;
    public static Class7776[] field32164;
    public static Class7776 field32165;
    public static Class7776 field32166;
    public static Class7776 field32167;
    public static Class7776 field32168;
    public static Class7776 field32169;
    public static Class7776 field32170;
    public static Class7776 field32171;
    public static Class7776 field32172;
    public static Class7776 field32173;
    public static Class7776 field32174;
    public static Class7776 field32175;
    public static Class7776 field32176;
    public static Class7776 field32177;
    public static Class7776 field32178;
    public static Class7776 field32179;
    public static Class7776 field32180;
    public static Class7776 field32181;
    public static Class7776 field32182;
    public static Class7776 field32183;
    public static Class7776 field32184;
    public static Class7776 field32185;
    public static Class7776 field32186;
    public static Class7776 field32187;
    public static Class7776 field32188;
    public static Class7776 field32189;
    public static Class7776 field32190;
    public static Class7776 field32191;
    public static Class7776 field32192;
    public static Class7776 field32193;
    public static Class7776 field32194;
    public static Class7776 field32195;
    public static Class7776 field32196;
    public static Class7776 field32197;
    public static Class7776 field32198;
    public static Class7776 field32199;
    public static Class7776 field32200;
    public static Class7776 field32201;
    public static Class7776 field32202;
    public static Class7776 field32203;
    public static Class7776 field32204;
    public static Class7776 field32205;
    public static Class7776 field32206;
    public static Class7776 field32207;
    public static Class7776 field32208;
    public static Class7776 field32209;
    public static Class7776 field32210;
    public static Class7776 field32211;
    public static Class7776 field32212;
    public static Class7776 field32213;
    public static Class7776 field32214;
    public static Class7776 field32215;
    public static Class7776 field32216;
    public static Class7776 field32217;
    public static Class7776 field32218;
    public static Class7776 field32219;
    public static Class7776 field32220;
    public static Class7776 field32221;
    public static Class7776 field32222;
    public static Class7776 field32223;
    public static Class7776 field32224;
    public static Class7776 field32225;
    private static byte[] field32226;
    private static byte[] field32227;
    public static final String field32228 = "com/mentalfrostbyte/gui/resources/";
    
    public static void method25391() {
        Class7853.field32155 = method25392("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
        Class7853.field32156 = method25392("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
        Class7853.field32157 = method25392("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
        Class7853.field32158 = method25392("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
        Class7853.field32159 = method25392("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
        Class7853.field32164[0] = method25392("com/mentalfrostbyte/gui/resources/" + method25397());
        Class7853.field32160 = method25392("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
        Class7853.field32161 = method25392("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
        Class7853.field32169 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
        Class7853.field32170 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
        Class7853.field32171 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
        Class7853.field32172 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
        Class7853.field32173 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
        Class7853.field32174 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
        Class7853.field32175 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
        Class7853.field32176 = method25392("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
        Class7853.field32195 = method25392("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
        Class7853.field32194 = method25392("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
        Class7853.field32162 = method25392("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
        Class7853.field32163 = method25392("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
        Class7853.field32165 = method25392("com/mentalfrostbyte/gui/resources/component/check.png");
        Class7853.field32212 = method25392("com/mentalfrostbyte/gui/resources/component/waypoint.png");
        Class7853.field32166 = method25392("com/mentalfrostbyte/gui/resources/component/trashcan.png");
        Class7853.field32219 = method25392("com/mentalfrostbyte/gui/resources/sigma/gem.png");
        Class7853.field32167 = method25392("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
        Class7853.field32168 = method25392("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
        Class7853.field32178 = method25392("com/mentalfrostbyte/gui/resources/music/play.png");
        Class7853.field32179 = method25392("com/mentalfrostbyte/gui/resources/music/pause.png");
        Class7853.field32180 = method25392("com/mentalfrostbyte/gui/resources/music/forwards.png");
        Class7853.field32181 = method25392("com/mentalfrostbyte/gui/resources/music/backwards.png");
        Class7853.field32182 = method25392("com/mentalfrostbyte/gui/resources/music/bg.png");
        Class7853.field32183 = method25392("com/mentalfrostbyte/gui/resources/music/artwork.png");
        Class7853.field32184 = method25392("com/mentalfrostbyte/gui/resources/music/particle.png");
        Class7853.field32185 = method25392("com/mentalfrostbyte/gui/resources/music/repeat.png");
        Class7853.field32186 = method25392("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
        Class7853.field32187 = method25392("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
        Class7853.field32188 = method25392("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
        Class7853.field32189 = method25392("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
        Class7853.field32190 = method25392("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
        Class7853.field32191 = method25392("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
        Class7853.field32192 = method25392("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
        Class7853.field32193 = method25392("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
        Class7853.field32196 = method25392("com/mentalfrostbyte/gui/resources/alt/cercle.png");
        Class7853.field32197 = method25392("com/mentalfrostbyte/gui/resources/alt/select.png");
        Class7853.field32198 = method25392("com/mentalfrostbyte/gui/resources/alt/active.png");
        Class7853.field32199 = method25392("com/mentalfrostbyte/gui/resources/alt/errors.png");
        Class7853.field32200 = method25392("com/mentalfrostbyte/gui/resources/alt/shadow.png");
        Class7853.field32201 = method25392("com/mentalfrostbyte/gui/resources/alt/img.png");
        Class7853.field32202 = method25392("com/mentalfrostbyte/gui/resources/alt/skin.png");
        Class7853.field32213 = method25392("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
        Class7853.field32214 = method25392("com/mentalfrostbyte/gui/resources/loading/jello.png");
        Class7853.field32215 = method25392("com/mentalfrostbyte/gui/resources/loading/sigma.png");
        Class7853.field32203 = method25392("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
        Class7853.field32216 = method25392("com/mentalfrostbyte/gui/resources/jello/search.png");
        Class7853.field32217 = method25392("com/mentalfrostbyte/gui/resources/jello/options.png");
        Class7853.field32204 = method25392("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
        Class7853.field32205 = method25392("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
        Class7853.field32206 = method25392("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
        Class7853.field32207 = method25392("com/mentalfrostbyte/gui/resources/sigma/andro.png");
        Class7853.field32208 = method25392("com/mentalfrostbyte/gui/resources/sigma/lp.png");
        Class7853.field32209 = method25392("com/mentalfrostbyte/gui/resources/user/cx.png");
        Class7853.field32210 = method25392("com/mentalfrostbyte/gui/resources/user/cody.png");
        Class7853.field32211 = method25392("com/mentalfrostbyte/gui/resources/jello/account.png");
        Class7853.field32220 = method25392("com/mentalfrostbyte/gui/resources/background/foreground.png");
        Class7853.field32221 = method25392("com/mentalfrostbyte/gui/resources/background/background.png");
        Class7853.field32222 = method25392("com/mentalfrostbyte/gui/resources/background/middle.png");
        Class7853.field32223 = method25392("com/mentalfrostbyte/gui/resources/loading/youtube.png");
        Class7853.field32224 = method25392("com/mentalfrostbyte/gui/resources/loading/guilded.png");
        Class7853.field32225 = method25392("com/mentalfrostbyte/gui/resources/loading/reddit.png");
        Class7853.field32218 = method25392("com/mentalfrostbyte/gui/resources/jello/dvd.png");
        Class7853.field32177 = method25395("com/mentalfrostbyte/gui/resources/" + method25397(), 0.25f, 30);
    }
    
    public static Class7776 method25392(final String str) {
        try {
            return method25393(str, str.substring(str.lastIndexOf(".") + 1).toUpperCase());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            Class9463.method35173().method35187().method20242("Unable to load texture " + str + ". Please make sure it is a valid path and has a valid extension or load it directly from the load(name, type) function.");
            throw ex;
        }
    }
    
    public static Class7776 method25393(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: invokestatic    mapped/Class7853.method25394:(Ljava/lang/String;)Ljava/io/InputStream;
        //     5: invokestatic    mapped/Class9577.method35873:(Ljava/lang/String;Ljava/io/InputStream;)Lmapped/Class7776;
        //     8: areturn        
        //     9: athrow         
        //    10: astore          4
        //    12: aload_0        
        //    13: invokestatic    mapped/Class7853.method25394:(Ljava/lang/String;)Ljava/io/InputStream;
        //    16: astore          5
        //    18: aconst_null    
        //    19: astore          6
        //    21: bipush          8
        //    23: newarray        B
        //    25: astore          7
        //    27: aload           5
        //    29: aload           7
        //    31: invokevirtual   java/io/InputStream.read:([B)I
        //    34: pop            
        //    35: new             Ljava/lang/StringBuilder;
        //    38: dup            
        //    39: invokespecial   java/lang/StringBuilder.<init>:()V
        //    42: astore          8
        //    44: aload           7
        //    46: astore          9
        //    48: aload           9
        //    50: arraylength    
        //    51: istore          10
        //    53: iconst_0       
        //    54: istore          11
        //    56: iload           11
        //    58: iload           10
        //    60: if_icmpge       91
        //    63: aload           9
        //    65: iload           11
        //    67: baload         
        //    68: istore          12
        //    70: aload           8
        //    72: ldc_w           " "
        //    75: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    78: iload           12
        //    80: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    83: pop            
        //    84: iinc            11, 1
        //    87: goto            56
        //    90: athrow         
        //    91: new             Ljava/lang/IllegalStateException;
        //    94: dup            
        //    95: new             Ljava/lang/StringBuilder;
        //    98: dup            
        //    99: invokespecial   java/lang/StringBuilder.<init>:()V
        //   102: ldc_w           "Unable to load texture "
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: aload_0        
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: ldc_w           " header"
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: aload           8
        //   120: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   129: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   132: athrow         
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: astore          6
        //   140: aload           7
        //   142: athrow         
        //   143: athrow         
        //   144: astore          13
        //   146: aload           5
        //   148: ifnull          183
        //   151: aload           6
        //   153: ifnull          178
        //   156: aload           5
        //   158: invokevirtual   java/io/InputStream.close:()V
        //   161: goto            183
        //   164: athrow         
        //   165: astore          14
        //   167: aload           6
        //   169: aload           14
        //   171: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   174: goto            183
        //   177: athrow         
        //   178: aload           5
        //   180: invokevirtual   java/io/InputStream.close:()V
        //   183: aload           13
        //   185: athrow         
        //   186: athrow         
        //   187: astore          5
        //   189: new             Ljava/lang/IllegalStateException;
        //   192: dup            
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: invokespecial   java/lang/StringBuilder.<init>:()V
        //   200: ldc_w           "Unable to load texture "
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: aload_0        
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   210: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   213: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   216: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      8      10     186    Ljava/io/IOException;
        //  21     90     134    143    Ljava/lang/Throwable;
        //  91     133    134    143    Ljava/lang/Throwable;
        //  156    161    165    177    Ljava/lang/Throwable;
        //  21     90     144    186    Any
        //  91     133    144    186    Any
        //  134    143    144    186    Any
        //  144    146    144    186    Any
        //  12     90     187    217    Ljava/io/IOException;
        //  91     133    187    217    Ljava/io/IOException;
        //  134    143    187    217    Ljava/io/IOException;
        //  144    164    187    217    Ljava/io/IOException;
        //  165    177    187    217    Ljava/io/IOException;
        //  178    186    187    217    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    
    public static InputStream method25394(final String s) {
        try {
            final String string = DigestUtils.sha1Hex(s) + ".bmp";
            if (Class9463.method35173().getClass().getClassLoader().getResource(string) != null) {
                try (final InputStream resourceAsStream = Class9463.method35173().getClass().getClassLoader().getResourceAsStream(string);
                     final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
                    final byte[] array = new byte[4096];
                    int n = 0;
                    int read;
                    while ((read = resourceAsStream.read(array)) > -1) {
                        for (int i = 0; i < read; ++i) {
                            final byte[] array2 = array;
                            final int n2 = i;
                            array2[n2] ^= Class7853.field32227[n++ % Class7853.field32227.length];
                        }
                        byteArrayOutputStream.write(array, 0, read);
                    }
                    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
            }
            return Class9463.method35173().getClass().getClassLoader().getResourceAsStream(s);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + s + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static Class7776 method25395(final String str, final float n, final int n2) {
        try {
            final BufferedImage read = ImageIO.read(method25394(str));
            final BufferedImage bufferedImage = new BufferedImage((int)(n * read.getWidth(null)), (int)(n * read.getHeight(null)), 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.scale(n, n);
            graphics2D.drawImage(read, 0, 0, null);
            graphics2D.dispose();
            return Class9399.method34928(str, Class6804.method20836(Class6804.method20826(bufferedImage, n2), 0.0f, 1.3f, -0.35f));
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + str + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static Class7776 method25396(final String str, final float n, final int n2) {
        try {
            final BufferedImage read = ImageIO.read(method25394(str));
            final BufferedImage bufferedImage = new BufferedImage((int)(n * read.getWidth(null)), (int)(n * read.getHeight(null)), 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.scale(n, n);
            graphics2D.drawImage(read, 0, 0, null);
            graphics2D.dispose();
            return Class9399.method34928(str, Class6804.method20836(Class6804.method20826(Class6804.method20835(bufferedImage, n2), n2), 0.0f, 1.1f, 0.0f));
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + str + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static String method25397() {
        return "background/panorama5.png";
    }
    
    static {
        Class7853.field32164 = new Class7776[1];
        Class7853.field32226 = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        Class7853.field32227 = new byte[] { 89, -73, -35, -84, 17, -87, -79, -44 };
    }
}

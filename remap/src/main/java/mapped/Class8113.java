// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.regex.Matcher;
import java.io.BufferedOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

import java.io.OutputStream;
import java.io.FileOutputStream;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class8113
{
    private static final Logger field33430;
    private volatile boolean field33431;
    private volatile boolean field33432;
    private volatile boolean field33433;
    private volatile boolean field33434;
    private volatile File field33435;
    private volatile File field33436;
    private volatile HttpGet field33437;
    private Thread field33438;
    private final RequestConfig field33439;
    private static final String[] field33440;
    
    public Class8113() {
        this.field33439 = RequestConfig.custom().setSocketTimeout(120000).setConnectTimeout(120000).build();
    }
    
    public long method26666(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aconst_null    
        //     4: astore          5
        //     6: new             Lorg/apache/http/client/methods/HttpGet;
        //     9: dup            
        //    10: aload_1        
        //    11: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //    14: astore          5
        //    16: invokestatic    org/apache/http/impl/client/HttpClientBuilder.create:()Lorg/apache/http/impl/client/HttpClientBuilder;
        //    19: aload_0        
        //    20: getfield        mapped/Class8113.field33439:Lorg/apache/http/client/config/RequestConfig;
        //    23: invokevirtual   org/apache/http/impl/client/HttpClientBuilder.setDefaultRequestConfig:(Lorg/apache/http/client/config/RequestConfig;)Lorg/apache/http/impl/client/HttpClientBuilder;
        //    26: invokevirtual   org/apache/http/impl/client/HttpClientBuilder.build:()Lorg/apache/http/impl/client/CloseableHttpClient;
        //    29: astore          4
        //    31: aload           4
        //    33: aload           5
        //    35: invokevirtual   org/apache/http/impl/client/CloseableHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/client/methods/CloseableHttpResponse;
        //    38: astore          6
        //    40: aload           6
        //    42: ldc             "Content-Length"
        //    44: invokeinterface org/apache/http/client/methods/CloseableHttpResponse.getFirstHeader:(Ljava/lang/String;)Lorg/apache/http/Header;
        //    49: invokeinterface org/apache/http/Header.getValue:()Ljava/lang/String;
        //    54: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    57: lstore          7
        //    59: lload           7
        //    61: lstore          9
        //    63: aload           5
        //    65: ifnull          73
        //    68: aload           5
        //    70: invokevirtual   org/apache/http/client/methods/HttpGet.releaseConnection:()V
        //    73: aload           4
        //    75: ifnull          101
        //    78: aload           4
        //    80: invokevirtual   org/apache/http/impl/client/CloseableHttpClient.close:()V
        //    83: goto            101
        //    86: athrow         
        //    87: astore          11
        //    89: getstatic       mapped/Class8113.field33430:Lorg/apache/logging/log4j/Logger;
        //    92: ldc             "Could not close http client"
        //    94: aload           11
        //    96: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   101: lload           9
        //   103: lreturn        
        //   104: athrow         
        //   105: astore          6
        //   107: getstatic       mapped/Class8113.field33430:Lorg/apache/logging/log4j/Logger;
        //   110: ldc             "Unable to get content length for download"
        //   112: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;)V
        //   117: lconst_0       
        //   118: lstore          7
        //   120: aload           5
        //   122: ifnull          130
        //   125: aload           5
        //   127: invokevirtual   org/apache/http/client/methods/HttpGet.releaseConnection:()V
        //   130: aload           4
        //   132: ifnull          206
        //   135: aload           4
        //   137: invokevirtual   org/apache/http/impl/client/CloseableHttpClient.close:()V
        //   140: goto            206
        //   143: athrow         
        //   144: astore          6
        //   146: getstatic       mapped/Class8113.field33430:Lorg/apache/logging/log4j/Logger;
        //   149: ldc             "Could not close http client"
        //   151: aload           6
        //   153: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   158: goto            206
        //   161: athrow         
        //   162: astore          12
        //   164: aload           5
        //   166: ifnull          174
        //   169: aload           5
        //   171: invokevirtual   org/apache/http/client/methods/HttpGet.releaseConnection:()V
        //   174: aload           4
        //   176: ifnull          202
        //   179: aload           4
        //   181: invokevirtual   org/apache/http/impl/client/CloseableHttpClient.close:()V
        //   184: goto            202
        //   187: athrow         
        //   188: astore          13
        //   190: getstatic       mapped/Class8113.field33430:Lorg/apache/logging/log4j/Logger;
        //   193: ldc             "Could not close http client"
        //   195: aload           13
        //   197: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   202: aload           12
        //   204: athrow         
        //   205: athrow         
        //   206: lload           7
        //   208: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  78     83     87     101    Ljava/io/IOException;
        //  6      63     105    209    Ljava/lang/Throwable;
        //  135    140    144    161    Ljava/io/IOException;
        //  6      63     162    205    Any
        //  105    120    162    205    Any
        //  179    184    188    202    Ljava/io/IOException;
        //  162    164    162    205    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 83 out of bounds for length 83
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:365)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:428)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
    
    public void method26667(final Class7431 class7431, final String s, final Class8091 class7432, final Class7417 class7433) {
        if (this.field33438 == null) {
            (this.field33438 = new Thread(() -> {
                try {
                    this.field33435 = File.createTempFile("backup", ".tar.gz");
                    this.field33437 = new HttpGet(class7434.field28659);
                    HttpClientBuilder.create().setDefaultRequestConfig(this.field33439).build();
                    final CloseableHttpClient closeableHttpClient;
                    closeableHttpClient.execute((HttpUriRequest)this.field33437);
                    final HttpResponse httpResponse;
                    class7435.field33323 = Long.parseLong(httpResponse.getFirstHeader("Content-Length").getValue());
                    if (httpResponse.getStatusLine().getStatusCode() == 200) {
                        final FileOutputStream fileOutputStream = new FileOutputStream(this.field33435);
                        final Class7050 class7437 = new Class7050(this, s2.trim(), this.field33435, class7436, class7435, class7434, null);
                        final Class1719 class7438 = new Class1719(this, fileOutputStream);
                        class7438.method6070(class7437);
                        IOUtils.copy(httpResponse.getEntity().getContent(), (OutputStream)class7438);
                    }
                    else {
                        this.field33433 = true;
                        this.field33437.abort();
                    }
                }
                catch (final Exception ex) {
                    Class8113.field33430.error("Caught exception while downloading: " + ex.getMessage());
                    this.field33433 = true;
                }
                finally {
                    this.field33437.releaseConnection();
                    if (this.field33435 != null) {
                        this.field33435.delete();
                    }
                    final CloseableHttpClient closeableHttpClient;
                    if (!this.field33433) {
                        if (!class7434.field28660.isEmpty() && !class7434.field28661.isEmpty()) {
                            try {
                                this.field33435 = File.createTempFile("resources", ".tar.gz");
                                this.field33437 = new HttpGet(class7434.field28660);
                                closeableHttpClient.execute((HttpUriRequest)this.field33437);
                                final HttpResponse httpResponse2;
                                class7435.field33323 = Long.parseLong(httpResponse2.getFirstHeader("Content-Length").getValue());
                                if (httpResponse2.getStatusLine().getStatusCode() != 200) {
                                    this.field33433 = true;
                                    this.field33437.abort();
                                    return;
                                }
                                else {
                                    final FileOutputStream fileOutputStream2 = new FileOutputStream(this.field33435);
                                    final Class7048 class7439 = new Class7048(this, this.field33435, class7435, class7434, null);
                                    final Class1719 class7440 = new Class1719(this, fileOutputStream2);
                                    class7440.method6070(class7439);
                                    IOUtils.copy(httpResponse2.getEntity().getContent(), (OutputStream)class7440);
                                }
                            }
                            catch (final Exception ex2) {
                                Class8113.field33430.error("Caught exception while downloading: " + ex2.getMessage());
                                this.field33433 = true;
                            }
                            finally {
                                this.field33437.releaseConnection();
                                if (this.field33435 != null) {
                                    this.field33435.delete();
                                }
                            }
                        }
                        else {
                            this.field33432 = true;
                        }
                    }
                    if (closeableHttpClient != null) {
                        try {
                            closeableHttpClient.close();
                        }
                        catch (final IOException ex3) {
                            Class8113.field33430.error("Failed to close Realms download client");
                        }
                    }
                }
                return;
            })).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8236(Class8113.field33430));
            this.field33438.start();
        }
    }
    
    public void method26668() {
        if (this.field33437 != null) {
            this.field33437.abort();
        }
        if (this.field33435 != null) {
            this.field33435.delete();
        }
        this.field33431 = true;
    }
    
    public boolean method26669() {
        return this.field33432;
    }
    
    public boolean method26670() {
        return this.field33433;
    }
    
    public boolean method26671() {
        return this.field33434;
    }
    
    public static String method26672(String str) {
        str = str.replaceAll("[\\./\"]", "_");
        final String[] field33440 = Class8113.field33440;
        for (int length = field33440.length, i = 0; i < length; ++i) {
            if (str.equalsIgnoreCase(field33440[i])) {
                str = "_" + str + "_";
            }
        }
        return str;
    }
    
    private void method26673(String s, final File file, final Class7417 class7417) throws IOException {
        final Pattern compile = Pattern.compile(".*-([0-9]+)$");
        int intValue = 1;
        final char[] field37874 = Class8985.field37874;
        for (int length = field37874.length, i = 0; i < length; ++i) {
            s = s.replace(field37874[i], '_');
        }
        if (StringUtils.isEmpty((CharSequence)s)) {
            s = "Realm";
        }
        s = method26672(s);
        try {
            for (final Class1951 class7418 : class7417.method22830()) {
                if (class7418.method7933().toLowerCase(Locale.ROOT).startsWith(s.toLowerCase(Locale.ROOT))) {
                    final Matcher matcher = compile.matcher(class7418.method7933());
                    if (matcher.matches()) {
                        if (Integer.valueOf(matcher.group(1)) <= intValue) {
                            continue;
                        }
                        intValue = Integer.valueOf(matcher.group(1));
                    }
                    else {
                        ++intValue;
                    }
                }
            }
        }
        catch (final Exception ex) {
            Class8113.field33430.error("Error getting level list", (Throwable)ex);
            this.field33433 = true;
            return;
        }
        String str;
        if (class7417.method22827(s) && intValue <= 1) {
            str = s;
        }
        else {
            str = s + ((intValue == 1) ? "" : ("-" + intValue));
            if (!class7417.method22827(str)) {
                for (int j = 0; j == 0; j = 1) {
                    ++intValue;
                    str = s + ((intValue == 1) ? "" : ("-" + intValue));
                    if (class7417.method22827(str)) {}
                }
            }
        }
        TarArchiveInputStream tarArchiveInputStream = null;
        final File parent = new File(Realms.method25364(), "saves");
        try {
            parent.mkdir();
            tarArchiveInputStream = new TarArchiveInputStream((InputStream)new GzipCompressorInputStream((InputStream)new BufferedInputStream(new FileInputStream(file))));
            for (TarArchiveEntry tarArchiveEntry = tarArchiveInputStream.getNextTarEntry(); tarArchiveEntry != null; tarArchiveEntry = tarArchiveInputStream.getNextTarEntry()) {
                final File file2 = new File(parent, tarArchiveEntry.getName().replace("world", str));
                if (tarArchiveEntry.isDirectory()) {
                    file2.mkdirs();
                }
                else {
                    file2.createNewFile();
                    final byte[] b = new byte[1024];
                    final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    int read;
                    while ((read = tarArchiveInputStream.read(b)) != -1) {
                        bufferedOutputStream.write(b, 0, read);
                    }
                    bufferedOutputStream.close();
                }
            }
        }
        catch (final Exception ex2) {
            Class8113.field33430.error("Error extracting world", (Throwable)ex2);
            this.field33433 = true;
        }
        finally {
            if (tarArchiveInputStream != null) {
                tarArchiveInputStream.close();
            }
            if (file != null) {
                file.delete();
            }
            class7417.method22829(str, str.trim());
            Realms.method25374(new File(parent, str + File.separator + "level.dat"));
            this.field33436 = new File(parent, str + File.separator + "resources.zip");
        }
    }
    
    static {
        field33430 = LogManager.getLogger();
        field33440 = new String[] { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
    }
}

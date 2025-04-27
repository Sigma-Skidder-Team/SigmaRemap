// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Class910 extends Thread
{
    private Class6794 field4865;
    private static final Charset field4866;
    private static final String field4867 = "Content-Length";
    private static final char field4868 = '\r';
    private static final char field4869 = '\n';
    
    public Class910(final Class6794 field4865) {
        super("HttpPipelineReceiver");
        this.field4865 = null;
        this.field4865 = field4865;
    }
    
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            Class8821 method20803 = null;
            try {
                method20803 = this.field4865.method20803();
                this.field4865.method20808(method20803, this.method5410(this.field4865.method20801()));
            }
            catch (final InterruptedException ex) {}
            catch (final Exception ex2) {
                this.field4865.method20813(method20803, ex2);
            }
        }
    }
    
    private Class8215 method5410(final InputStream inputStream) throws IOException {
        final String method5413 = this.method5413(inputStream);
        final String[] method5414 = Config.method28937(method5413, " ");
        if (method5414.length >= 3) {
            final String s = method5414[0];
            final int method5415 = Config.method28933(method5414[1], 0);
            final String s2 = method5414[2];
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                final String method5416 = this.method5413(inputStream);
                if (method5416.length() <= 0) {
                    break;
                }
                final int index = method5416.indexOf(":");
                if (index <= 0) {
                    continue;
                }
                linkedHashMap.put(method5416.substring(0, index).trim(), method5416.substring(index + 1).trim());
            }
            byte[] method5417 = null;
            final String s3 = (String)linkedHashMap.get("Content-Length");
            if (s3 == null) {
                if (Config.equals(linkedHashMap.get("Transfer-Encoding"), "chunked")) {
                    method5417 = this.method5411(inputStream);
                }
            }
            else {
                final int method5418 = Config.method28933(s3, -1);
                if (method5418 > 0) {
                    method5417 = new byte[method5418];
                    this.method5412(method5417, inputStream);
                }
            }
            return new Class8215(method5415, method5413, linkedHashMap, method5417);
        }
        throw new IOException("Invalid status line: " + method5413);
    }
    
    private byte[] method5411(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int int1;
        do {
            int1 = Integer.parseInt(Config.method28937(this.method5413(inputStream), "; ")[0], 16);
            final byte[] b = new byte[int1];
            this.method5412(b, inputStream);
            byteArrayOutputStream.write(b);
            this.method5413(inputStream);
        } while (int1 != 0);
        return byteArrayOutputStream.toByteArray();
    }
    
    private void method5412(final byte[] b, final InputStream inputStream) throws IOException {
        int read;
        for (int i = 0; i < b.length; i += read) {
            read = inputStream.read(b, i, b.length - i);
            if (read < 0) {
                throw new EOFException();
            }
        }
    }
    
    private String method5413(final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = -1;
        boolean b = false;
        while (true) {
            final int read = inputStream.read();
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(read);
            if (n == 13 && read == 10) {
                b = true;
                break;
            }
            n = read;
        }
        String substring = new String(byteArrayOutputStream.toByteArray(), Class910.field4866);
        if (b) {
            substring = substring.substring(0, substring.length() - 2);
        }
        return substring;
    }
    
    static {
        field4866 = StandardCharsets.US_ASCII;
    }
}

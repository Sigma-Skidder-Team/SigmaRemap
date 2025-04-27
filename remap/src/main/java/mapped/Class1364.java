// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.io.BufferedInputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import org.apache.logging.log4j.Logger;

public class Class1364 extends Class1361
{
    private static final Logger field7459;
    private boolean field7489;
    private Socket field7490;
    private final byte[] field7491;
    private final String field7492;
    
    public Class1364(final Class396 class396, final String field7492, final Socket field7493) {
        super(class396, "RCON Client");
        this.field7491 = new byte[1460];
        this.field7490 = field7493;
        try {
            this.field7490.setSoTimeout(0);
        }
        catch (final Exception ex) {
            this.field7461 = false;
        }
        this.field7492 = field7492;
        this.method5633("Rcon connection from: " + field7493.getInetAddress());
    }
    
    @Override
    public void run() {
        try {
            while (this.field7461) {
                final int read = new BufferedInputStream(this.field7490.getInputStream()).read(this.field7491, 0, 1460);
                if (10 <= read) {
                    final int n = 0;
                    if (Class8277.method27514(this.field7491, 0, read) != read - 4) {
                        return;
                    }
                    final int n2 = n + 4;
                    final int method27514 = Class8277.method27514(this.field7491, n2, read);
                    final int n3 = n2 + 4;
                    final int method27515 = Class8277.method27513(this.field7491, n3);
                    final int n4 = n3 + 4;
                    switch (method27515) {
                        case 2: {
                            if (this.field7489) {
                                final String method27516 = Class8277.method27512(this.field7491, n4, read);
                                try {
                                    this.method5656(method27514, this.field7462.method1628(method27516));
                                }
                                catch (final Exception ex) {
                                    this.method5656(method27514, "Error executing: " + method27516 + " (" + ex.getMessage() + ")");
                                }
                                continue;
                            }
                            this.method5655();
                            continue;
                        }
                        case 3: {
                            final String method27517 = Class8277.method27512(this.field7491, n4, read);
                            final int n5 = n4 + method27517.length();
                            if (!method27517.isEmpty() && method27517.equals(this.field7492)) {
                                this.field7489 = true;
                                this.method5654(method27514, 2, "");
                                continue;
                            }
                            this.field7489 = false;
                            this.method5655();
                            continue;
                        }
                        default: {
                            this.method5656(method27514, String.format("Unknown request %s", Integer.toHexString(method27515)));
                            continue;
                        }
                    }
                }
            }
        }
        catch (final SocketTimeoutException ex2) {}
        catch (final IOException ex3) {}
        catch (final Exception ex4) {
            Class1364.field7459.error("Exception whilst parsing RCON input", ex4);
        }
        finally {
            this.method5657();
        }
    }
    
    private void method5654(final int i, final int j, final String s) throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream(1248);
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        final byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(Integer.reverseBytes(bytes.length + 10));
        dataOutputStream.writeInt(Integer.reverseBytes(i));
        dataOutputStream.writeInt(Integer.reverseBytes(j));
        dataOutputStream.write(bytes);
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        this.field7490.getOutputStream().write(out.toByteArray());
    }
    
    private void method5655() throws IOException {
        this.method5654(-1, 2, "");
    }
    
    private void method5656(final int n, String substring) throws IOException {
        int n2 = substring.length();
        do {
            final int n3 = (4096 > n2) ? n2 : 4096;
            this.method5654(n, 0, substring.substring(0, n3));
            substring = substring.substring(n3);
            n2 = substring.length();
        } while (n2);
    }
    
    @Override
    public void method5630() {
        super.method5630();
        this.method5657();
    }
    
    private void method5657() {
        if (null != this.field7490) {
            try {
                this.field7490.close();
            }
            catch (final IOException ex) {
                this.method5634("IO: " + ex.getMessage());
            }
            this.field7490 = null;
        }
    }
    
    static {
        field7459 = LogManager.getLogger();
    }
}

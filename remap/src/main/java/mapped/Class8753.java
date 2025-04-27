// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.FileOutputStream;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.util.logging.Logger;

public final class Class8753
{
    public static final Logger field36764;
    
    private Class8753() {
    }
    
    public static Class1681 method30275(final Class1682 class1682) {
        return new Class1700(class1682);
    }
    
    public static Class1679 method30276(final Class1676 class1676) {
        return new Class1701(class1676);
    }
    
    public static Class1676 method30277(final OutputStream outputStream) {
        return method30278(outputStream, new Class8020());
    }
    
    private static Class1676 method30278(final OutputStream outputStream, final Class8020 class8020) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (class8020 != null) {
            return new Class1713(class8020, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }
    
    public static Class1676 method30279(final Socket socket) throws IOException {
        if (socket != null) {
            final Class8019 method30289 = method30289(socket);
            return method30289.method26291(method30278(socket.getOutputStream(), method30289));
        }
        throw new IllegalArgumentException("socket == null");
    }
    
    public static Class1682 method30280(final InputStream inputStream) {
        return method30281(inputStream, new Class8020());
    }
    
    private static Class1682 method30281(final InputStream inputStream, final Class8020 class8020) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (class8020 != null) {
            return new Class1683(class8020, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }
    
    public static Class1682 method30282(final File file) throws FileNotFoundException {
        if (file != null) {
            return method30280(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }
    
    @IgnoreJRERequirement
    public static Class1682 method30283(final Path path, final OpenOption... options) throws IOException {
        if (path != null) {
            return method30280(Files.newInputStream(path, options));
        }
        throw new IllegalArgumentException("path == null");
    }
    
    public static Class1676 method30284(final File file) throws FileNotFoundException {
        if (file != null) {
            return method30277(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }
    
    public static Class1676 method30285(final File file) throws FileNotFoundException {
        if (file != null) {
            return method30277(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }
    
    @IgnoreJRERequirement
    public static Class1676 method30286(final Path path, final OpenOption... options) throws IOException {
        if (path != null) {
            return method30277(Files.newOutputStream(path, options));
        }
        throw new IllegalArgumentException("path == null");
    }
    
    public static Class1676 method30287() {
        return new Class1715();
    }
    
    public static Class1682 method30288(final Socket socket) throws IOException {
        if (socket != null) {
            final Class8019 method30289 = method30289(socket);
            return method30289.method26292(method30281(socket.getInputStream(), method30289));
        }
        throw new IllegalArgumentException("socket == null");
    }
    
    private static Class8019 method30289(final Socket socket) {
        return new Class8023(socket);
    }
    
    public static boolean method30290(final AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            if (assertionError.getMessage() != null) {
                return assertionError.getMessage().contains("getsockname failed");
            }
        }
        return false;
    }
    
    static {
        field36764 = Logger.getLogger(Class8753.class.getName());
    }
}

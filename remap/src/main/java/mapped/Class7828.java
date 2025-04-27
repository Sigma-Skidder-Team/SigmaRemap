// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.List;

public class Class7828
{
    private final Class9131 field32051;
    private final List<Class3746> field32052;
    private Class2213 field32053;
    private Class2213 field32054;
    private Class2213[] field32055;
    private Class3766 field32056;
    private Class3702 field32057;
    private Class3746 field32058;
    private Class6476 field32059;
    
    public Class7828(final InputStream inputStream) throws IOException {
        this.field32051 = new Class9131(inputStream);
        this.field32052 = new ArrayList<Class3746>();
        this.method25290();
    }
    
    public Class7828(final RandomAccessFile randomAccessFile) throws IOException {
        this.field32051 = new Class9131(randomAccessFile);
        this.field32052 = new ArrayList<Class3746>();
        this.method25290();
    }
    
    private void method25290() throws IOException {
        boolean b = false;
        while (this.field32051.method33149()) {
            final Class3746 method12377 = Class4144.method12377(null, this.field32051);
            if (this.field32052.isEmpty() && method12377.method11492() != 1718909296L) {
                throw new Class2351("no MP4 signature found");
            }
            this.field32052.add(method12377);
            final long method12378 = method12377.method11492();
            if (method12378 != 1718909296L) {
                if (method12378 != 1836019574L) {
                    if (method12378 != 1885628782L) {
                        if (method12378 != 1835295092L) {
                            continue;
                        }
                        if (b) {
                            break;
                        }
                        if (this.field32051.method33148()) {
                            continue;
                        }
                        throw new Class2351("movie box at end of file, need random access");
                    }
                    else {
                        if (this.field32057 != null) {
                            continue;
                        }
                        this.field32057 = (Class3702)method12377;
                    }
                }
                else {
                    if (this.field32059 == null) {
                        this.field32058 = method12377;
                    }
                    b = true;
                }
            }
            else {
                if (this.field32056 != null) {
                    continue;
                }
                this.field32056 = (Class3766)method12377;
            }
        }
    }
    
    public Class2213 method25291() {
        if (this.field32053 == null) {
            this.field32053 = Class2213.method8394(this.field32056.method11569());
        }
        return this.field32053;
    }
    
    public Class2213 method25292() {
        if (this.field32054 == null) {
            this.field32054 = Class2213.method8394(this.field32056.method11569());
        }
        return this.field32054;
    }
    
    public Class2213[] method25293() {
        if (this.field32055 == null) {
            final String[] method11571 = this.field32056.method11571();
            this.field32055 = new Class2213[method11571.length];
            for (int i = 0; i < method11571.length; ++i) {
                this.field32055[i] = Class2213.method8394(method11571[i]);
            }
        }
        return this.field32055;
    }
    
    public Class6476 method25294() {
        if (this.field32058 != null) {
            if (this.field32059 == null) {
                this.field32059 = new Class6476(this.field32058, this.field32051);
            }
            return this.field32059;
        }
        return null;
    }
    
    public List<Class3746> method25295() {
        return Collections.unmodifiableList(this.field32052);
    }
    
    static {
        final Logger logger = Logger.getLogger("MP4 API");
        final Handler[] handlers = logger.getHandlers();
        for (int length = handlers.length, i = 0; i < length; ++i) {
            logger.removeHandler(handlers[i]);
        }
        logger.setLevel(Level.WARNING);
        final ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
    }
}

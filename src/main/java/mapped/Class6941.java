// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public final class Class6941 implements Class6940
{
    @Override
    public Class1682 method21313(final File file) throws FileNotFoundException {
        return Class8753.method30282(file);
    }
    
    @Override
    public Class1676 method21314(final File file) throws FileNotFoundException {
        try {
            return Class8753.method30284(file);
        }
        catch (final FileNotFoundException ex) {
            file.getParentFile().mkdirs();
            return Class8753.method30284(file);
        }
    }
    
    @Override
    public Class1676 method21315(final File file) throws FileNotFoundException {
        try {
            return Class8753.method30285(file);
        }
        catch (final FileNotFoundException ex) {
            file.getParentFile().mkdirs();
            return Class8753.method30285(file);
        }
    }
    
    @Override
    public void method21316(final File obj) throws IOException {
        if (!obj.delete() && obj.exists()) {
            throw new IOException("failed to delete " + obj);
        }
    }
    
    @Override
    public boolean method21317(final File file) {
        return file.exists();
    }
    
    @Override
    public long method21318(final File file) {
        return file.length();
    }
    
    @Override
    public void method21319(final File obj, final File file) throws IOException {
        this.method21316(file);
        if (obj.renameTo(file)) {
            return;
        }
        throw new IOException("failed to rename " + obj + " to " + file);
    }
    
    @Override
    public void method21320(final File obj) throws IOException {
        final File[] listFiles = obj.listFiles();
        if (listFiles != null) {
            for (final File obj2 : listFiles) {
                if (obj2.isDirectory()) {
                    this.method21320(obj2);
                }
                if (!obj2.delete()) {
                    throw new IOException("failed to delete " + obj2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + obj);
    }
}

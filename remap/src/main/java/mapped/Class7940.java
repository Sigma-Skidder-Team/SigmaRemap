// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.Map;
import java.io.File;
import java.io.FileFilter;

public class Class7940 implements Class7938
{
    private static final FileFilter field32615;
    private final File field32616;
    
    public Class7940(final File field32616) {
        this.field32616 = field32616;
    }
    
    @Override
    public <T extends Class1921> void method25739(final Map<String, T> map, final Class6712<T> class6712) {
        if (!this.field32616.isDirectory()) {
            this.field32616.mkdirs();
        }
        final File[] listFiles = this.field32616.listFiles(Class7940.field32615);
        if (listFiles != null) {
            for (final File file : listFiles) {
                final String string = "file/" + file.getName();
                final Class1921 method7615 = Class1921.method7615(string, false, this.method25755(file), class6712, Class2043.field11642);
                if (method7615 != null) {
                    map.put(string, (T)method7615);
                }
            }
        }
    }
    
    private Supplier<Class1727> method25755(final File file) {
        return (Supplier<Class1727>)(file.isDirectory() ? (() -> new Class1735(file2)) : (() -> new Class1733(file3)));
    }
    
    static {
        field32615 = (parent -> {
            final boolean b = parent.isFile() && parent.getName().endsWith(".zip");
            Label_0063_1: {
                if (parent.isDirectory()) {
                    if (new File(parent, "pack.mcmeta").isFile()) {
                        break Label_0063_1;
                    }
                }
            }
            final boolean b2;
            return b || b2;
        });
    }
}

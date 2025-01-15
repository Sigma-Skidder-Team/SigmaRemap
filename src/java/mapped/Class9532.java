// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import java.io.FileOutputStream;
import java.io.File;

public class Class9532
{
    public static boolean field41028;
    
    public static void method35585(final Class4405 class4405, final File file) throws IOException {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOUtils.write(class4405.toString(0), (OutputStream)fileOutputStream);
        fileOutputStream.close();
    }
    
    public static Class4405 method35586(final File file) throws IOException {
        Class4405 class4405 = new Class4405();
        if (file.exists()) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final String string = IOUtils.toString((InputStream)fileInputStream);
            if (string == null) {
                fileInputStream.close();
                return new Class4405();
            }
            if (!string.isEmpty()) {
                try {
                    class4405 = new Class4405(string);
                }
                catch (final Class2381 class4406) {
                    if (Class9463.method35173().method35187() != null) {
                        Class9463.method35173().method35187().method20241("Error when reading json from config. Continuing, but no preferences will be loaded.");
                    }
                    class4406.printStackTrace();
                }
            }
            else if (Class9463.method35173().method35187() != null) {
                Class9463.method35173().method35187().method20241("Empty config file");
            }
            fileInputStream.close();
        }
        else {
            if (Class9463.method35173().method35187() != null) {
                Class9463.method35173().method35187().method20240("Config does not exist... creating new config file...");
            }
            Class9532.field41028 = true;
            file.createNewFile();
        }
        return class4405;
    }
    
    static {
        Class9532.field41028 = false;
    }
}

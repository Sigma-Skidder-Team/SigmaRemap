// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;
import java.io.FileOutputStream;
import java.io.File;

public class Class9532
{
    public static boolean field41028;
    
    public static void method35585(final JSONObject JSONObject, final File file) throws IOException {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOUtils.write(JSONObject.toString(0), (OutputStream)fileOutputStream);
        fileOutputStream.close();
    }
    
    public static JSONObject method35586(final File file) throws IOException {
        JSONObject JSONObject = new JSONObject();
        if (file.exists()) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final String string = IOUtils.toString((InputStream)fileInputStream);
            if (string == null) {
                fileInputStream.close();
                return new JSONObject();
            }
            if (!string.isEmpty()) {
                try {
                    JSONObject = new JSONObject(string);
                }
                catch (final JSONException class4406) {
                    if (Client.getInstance().method35187() != null) {
                        Client.getInstance().method35187().method20241("Error when reading json from config. Continuing, but no preferences will be loaded.");
                    }
                    class4406.printStackTrace();
                }
            }
            else if (Client.getInstance().method35187() != null) {
                Client.getInstance().method35187().method20241("Empty config file");
            }
            fileInputStream.close();
        }
        else {
            if (Client.getInstance().method35187() != null) {
                Client.getInstance().method35187().method20240("Config does not exist... creating new config file...");
            }
            Class9532.field41028 = true;
            file.createNewFile();
        }
        return JSONObject;
    }
    
    static {
        Class9532.field41028 = false;
    }
}

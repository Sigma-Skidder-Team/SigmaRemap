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
import totalcross.json.JSONObject;

import java.io.FileOutputStream;
import java.io.File;

public class ConfigJsonUtil {
    public static boolean field41028;

    public static void saveJSONToFile(final JSONObject JSONObject, final File file) throws IOException {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOUtils.write(JSONObject.toString(0), fileOutputStream);
        fileOutputStream.close();
    }

    public static JSONObject method35586(final File file) throws IOException {
        JSONObject JSONObject = new JSONObject();
        if (file.exists()) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            final String string = IOUtils.toString(fileInputStream);
            if (string == null) {
                fileInputStream.close();
                return new JSONObject();
            }
            if (!string.isEmpty()) {
                try {
                    JSONObject = new JSONObject(string);
                } catch (final JSONException class4406) {
                    if (Client.getInstance().getLogger() != null) {
                        Client.getInstance().getLogger().warn("Error when reading json from config. Continuing, but no preferences will be loaded.");
                    }
                    class4406.printStackTrace();
                }
            } else if (Client.getInstance().getLogger() != null) {
                Client.getInstance().getLogger().warn("Empty config file");
            }
            fileInputStream.close();
        } else {
            if (Client.getInstance().getLogger() != null) {
                Client.getInstance().getLogger().info("Config does not exist... creating new config file...");
            }
            ConfigJsonUtil.field41028 = true;
            file.createNewFile();
        }
        return JSONObject;
    }

    static {
        ConfigJsonUtil.field41028 = false;
    }
}

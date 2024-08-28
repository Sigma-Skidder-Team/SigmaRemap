package com.mentalfrostbyte.jello.util;

import com.mentalfrostbyte.jello.Client;
import mapped.Class2499;
import mapped.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
    public static boolean field25727 = false;

    public static void method18362(JSONObject var0, File var1) throws IOException {
        FileOutputStream var4 = new FileOutputStream(var1);
        IOUtils.write(var0.toString(0), var4);
        var4.close();
    }

    public static JSONObject method18363(File var0) throws IOException {
        JSONObject var3 = new JSONObject();
        if (var0.exists()) {
            FileInputStream var4 = new FileInputStream(var0);
            String var5 = IOUtils.toString(var4);
            if (var5 == null) {
                var4.close();
                return new JSONObject();
            }

            if (!var5.isEmpty()) {
                try {
                    var3 = new JSONObject(var5);
                } catch (Class2499 var7) {
                    if (Client.getInstance().getLogger() != null) {
                        Client.getInstance().getLogger().method20357("Error when reading json from config. Continuing, but no preferences will be loaded.");
                    }

                    var7.printStackTrace();
                }
            } else if (Client.getInstance().getLogger() != null) {
                Client.getInstance().getLogger().method20357("Empty config file");
            }

            var4.close();
        } else {
            if (Client.getInstance().getLogger() != null) {
                Client.getInstance().getLogger().info("Config does not exist... creating new config file...");
            }

            field25727 = true;
            var0.createNewFile();
        }

        return var3;
    }
}

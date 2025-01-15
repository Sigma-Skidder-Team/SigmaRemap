// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.gson.Gson;
import java.io.File;

public class Class8584
{
    public static Class8907 method29061() {
        final File file = new File(Class7847.method25364(), "realms_persistence.json");
        final Gson gson = new Gson();
        try {
            return (Class8907)gson.fromJson(FileUtils.readFileToString(file), (Class)Class8907.class);
        }
        catch (final IOException ex) {
            return new Class8907(null);
        }
    }
    
    public static void method29062(final Class8907 class8907) {
        final File file = new File(Class7847.method25364(), "realms_persistence.json");
        final String json = new Gson().toJson((Object)class8907);
        try {
            FileUtils.writeStringToFile(file, json);
        }
        catch (final IOException ex) {}
    }
}

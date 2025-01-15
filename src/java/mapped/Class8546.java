// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;

public class Class8546
{
    private static final Logger field35891;
    private final Path field35892;
    private final boolean field35893;
    
    public Class8546(final Path field35892) {
        this.field35892 = field35892;
        this.field35893 = (Class9528.field41021 || this.method28690());
    }
    
    private boolean method28690() {
        try (final InputStream inputStream = Files.newInputStream(this.field35892, new OpenOption[0])) {
            final Properties properties = new Properties();
            properties.load(inputStream);
            return Boolean.parseBoolean(properties.getProperty("eula", "false"));
        }
        catch (final Exception ex) {
            Class8546.field35891.warn("Failed to load {}", (Object)this.field35892);
            this.method28692();
            return false;
        }
    }
    
    public boolean method28691() {
        return this.field35893;
    }
    
    private void method28692() {
        if (!Class9528.field41021) {
            try (final OutputStream outputStream = Files.newOutputStream(this.field35892, new OpenOption[0])) {
                final Properties properties = new Properties();
                properties.setProperty("eula", "false");
                properties.store(outputStream, "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).");
            }
            catch (final Exception ex) {
                Class8546.field35891.warn("Failed to save {}", (Object)this.field35892, (Object)ex);
            }
        }
    }
    
    static {
        field35891 = LogManager.getLogger();
    }
}

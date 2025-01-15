// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import org.apache.logging.log4j.Logger;

public abstract class Class6354
{
    private static final Logger field25416;
    private final String field25417;
    private boolean field25418;
    
    public Class6354(final String field25417) {
        this.field25417 = field25417;
    }
    
    public abstract void method18901(final Class51 p0);
    
    public abstract Class51 method18902(final Class51 p0);
    
    public void method18903() {
        this.method18904(true);
    }
    
    public void method18904(final boolean field25418) {
        this.field25418 = field25418;
    }
    
    public boolean method18905() {
        return this.field25418;
    }
    
    public String method18906() {
        return this.field25417;
    }
    
    public void method18907(final File file) {
        if (this.method18905()) {
            final Class51 class51 = new Class51();
            class51.method295("data", this.method18902(new Class51()));
            class51.method298("DataVersion", Class9528.method35579().getWorldVersion());
            try (final FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                Class8097.method26591(class51, fileOutputStream);
            }
            catch (final IOException ex) {
                Class6354.field25416.error("Could not save data {}", (Object)this, (Object)ex);
            }
            this.method18904(false);
        }
    }
    
    static {
        field25416 = LogManager.getLogger();
    }
}

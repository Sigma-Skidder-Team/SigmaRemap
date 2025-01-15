// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.awt.Image;

public class Class7231
{
    private Class2150 field28034;
    private byte[] field28035;
    private Image field28036;
    
    public Class7231(final Class2150 field28034, final byte[] field28035) {
        this.field28034 = field28034;
        this.field28035 = field28035;
    }
    
    public Class2150 method22128() {
        return this.field28034;
    }
    
    public byte[] method22129() {
        return this.field28035;
    }
    
    public Image method22130() throws IOException {
        try {
            if (this.field28036 == null) {
                this.field28036 = ImageIO.read(new ByteArrayInputStream(this.field28035));
            }
            return this.field28036;
        }
        catch (final IOException ex) {
            Logger.getLogger("MP4 API").log(Level.SEVERE, "Artwork.getImage failed: {0}", ex.toString());
            throw ex;
        }
    }
}

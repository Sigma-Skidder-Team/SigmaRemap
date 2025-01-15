// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Class6899 implements Class6898
{
    private static String[] field27049;
    private BufferedImageOp field27050;
    
    public Class6899() {
    }
    
    public Class6899(final BufferedImageOp field27050) {
        this.field27050 = field27050;
    }
    
    @Override
    public void method21195(final BufferedImage bufferedImage, final Graphics2D graphics2D, final Class7522 class7522, final Class8274 class7523) {
        final BufferedImage method22543 = Class7340.method22543();
        this.field27050.filter(bufferedImage, method22543);
        bufferedImage.getGraphics().drawImage(method22543, 0, 0, null);
    }
    
    public BufferedImageOp method21239() {
        return this.field27050;
    }
    
    public void method21240(final BufferedImageOp field27050) {
        this.field27050 = field27050;
    }
}

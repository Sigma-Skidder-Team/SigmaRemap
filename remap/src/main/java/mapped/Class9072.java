// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Class9072
{
    public static Class7776 method32684(final String name, final BufferedImage bufferedImage) {
        try {
            final BufferedImage read = ImageIO.read(Class9463.method35173().getClass().getClassLoader().getResourceAsStream(name));
            final BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), read.getType());
            for (int i = 0; i < read.getHeight(); ++i) {
                for (int j = 0; j < read.getWidth(); ++j) {
                    final Color color = new Color(read.getRGB(j, i), true);
                    System.out.println(color.getAlpha());
                    bufferedImage2.setRGB(j, i, Class6430.method19118(bufferedImage.getRGB(j, i), color.getAlpha() / 255.0f));
                }
            }
            return Class9399.method34928("mask", bufferedImage2);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static Class7776 method32685(final BufferedImage bufferedImage) {
        return method32684("com/mentalfrostbyte/gui/resources/user/mask.png", bufferedImage);
    }
}

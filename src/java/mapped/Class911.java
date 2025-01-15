// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.HttpURLConnection;
import java.awt.image.BufferedImage;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import org.apache.commons.io.IOUtils;
import javax.imageio.ImageIO;
import java.net.URL;
import java.net.URLConnection;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;

public final class Class911 extends Thread
{
    public final /* synthetic */ String field4870;
    
    public Class911(final String name, final String field4870) {
        this.field4870 = field4870;
        super(name);
    }
    
    @Override
    public void run() {
        final Map<MinecraftProfileTexture$Type, MinecraftProfileTexture> method28147 = Class8428.method28147(this.field4870);
        if (method28147.containsKey(MinecraftProfileTexture$Type.SKIN)) {
            final String url = method28147.get(MinecraftProfileTexture$Type.SKIN).getUrl();
            URLConnection urlConnection = null;
            Class8952.method31763().debug("Downloading http texture from {}", (Object)url);
            try {
                urlConnection = new URL(url).openConnection(Class7847.method25352());
                urlConnection.setDoInput(true);
                urlConnection.setDoOutput(false);
                urlConnection.connect();
                if (((HttpURLConnection)urlConnection).getResponseCode() / 100 == 2) {
                    BufferedImage read;
                    try {
                        read = ImageIO.read(urlConnection.getInputStream());
                    }
                    catch (final Exception ex) {
                        Class8952.method31764().remove(this.field4870);
                        return;
                    }
                    finally {
                        IOUtils.closeQuietly(urlConnection.getInputStream());
                    }
                    final BufferedImage method28148 = new Class8978().method31919(read);
                    final ByteArrayOutputStream output = new ByteArrayOutputStream();
                    ImageIO.write(method28148, "png", output);
                    Class8952.method31765().put(this.field4870, new Base64().encodeToString(output.toByteArray()));
                    Class8952.method31764().put(this.field4870, true);
                    return;
                }
                Class8952.method31764().remove(this.field4870);
            }
            catch (final Exception ex2) {
                Class8952.method31763().error("Couldn't download http texture", (Throwable)ex2);
                Class8952.method31764().remove(this.field4870);
            }
            finally {
                if (urlConnection != null) {
                    ((HttpURLConnection)urlConnection).disconnect();
                }
            }
        }
        else {
            Class8952.method31764().put(this.field4870, true);
        }
    }
}

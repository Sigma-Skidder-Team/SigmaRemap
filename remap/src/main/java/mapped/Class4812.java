// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;

import com.mentalfrostbyte.jello.ClientFonts;
import org.apache.http.HttpEntity;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import totalcross.json.JSONArray;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class Class4812 extends CustomGuiScreen
{
    public Animation animation;
    public ScrollablePane field20582;
    private static JSONArray cachedChangelog;
    
    public Class4812(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.animation = new Animation(380, 200, Direction.FORWARDS);
        this.setListening(false);
        (this.field20582 = new ScrollablePane(this, "scroll", 100, 200, n3 - 200, n4 - 200)).method14397(true);
        this.method14242(this.field20582);
        new Thread(() -> this.method14363(this.getChangelog())).start();
    }
    
    public void method14363(final JSONArray JSONArray) {
        if (JSONArray != null) {
            this.getParent().runThisOnDimensionUpdate(new Class998(this, JSONArray));
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20582 == null) {
            return;
        }
        if (this.isHovered() && this.method14296()) {
            for (final CustomGuiScreen class4805 : this.field20582.method14396().method14250()) {
                class4805.field20497.method35855(Direction.BACKWARDS);
                if (class4805.field20522.method35858() >= 0.5) {
                    continue;
                }
                break;
            }
            return;
        }
        final Iterator<CustomGuiScreen> iterator2 = this.field20582.method14396().method14250().iterator();
        while (iterator2.hasNext()) {
            ((Class4805)iterator2.next()).field20522.changeDirection(Direction.FORWARDS);
        }
    }
    
    @Override
    public void draw(float partialTicks) {
        this.animation.changeDirection(this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
        partialTicks *= this.animation.calcPercent();
        float fadeFactor = MathUtils.lerp(this.animation.calcPercent(), 0.17, 1.0, 0.51, 1.0);
        if (this.animation.getDirection() == Direction.FORWARDS) {
            fadeFactor = 1.0f;
        }
        this.drawBackground((int)(150.0f * (1.0f - fadeFactor)));
        this.translate();
        RenderUtil.drawString(ClientFonts.JelloLight36, 100.0f, 100.0f, "Changelog", AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks));
        RenderUtil.drawString(ClientFonts.JelloLight25, 100.0f, 150.0f, "You're currently using Sigma 5.0.0", AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.6f * partialTicks));
        super.draw(partialTicks);
    }
    
    public JSONArray getChangelog() {
        if (cachedChangelog != null) {
            return cachedChangelog;
        }

        try {
            HttpEntity entity = HttpClients.createDefault().execute(new HttpGet("https://jelloconnect.sigmaclient.info/changelog.php?v=5.0.0b6")).getEntity();
            if (entity != null) {
                try (InputStream content = entity.getContent()) {
                    return cachedChangelog = new JSONArray(IOUtils.toString(content, StandardCharsets.UTF_8));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}

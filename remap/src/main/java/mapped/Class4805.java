// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class Class4805 extends CustomGuiScreen
{
    public Animation field20522;
    
    public Class4805(final CustomGuiScreen customGuiScreen, final String s, final JSONObject class4804) {
        super(customGuiScreen, s);
        this.field20522 = new Animation(370, 150, Direction.FORWARDS);
        this.method14277(this.getParent().method14276());
        int n = 0;
        if (class4804.has("deprecated")) {
            GL11.glTexEnvi(8960, 8704, 260);
        }
        final String method13268 = class4804.getString("title");
        final JSONArray method13269 = class4804.getJSONArray("changes");
        this.addToList(new Class4834(this, "title", 0, n, 0, 0, ColorHelper.field25964, method13268, ClientFonts.JelloMedium40));
        n += 55;
        for (int i = 0; i < method13269.length(); ++i) {
            this.addToList(new Class4834(this, "change" + i, 0, n, 0, 0, new ColorHelper(0, 0, 0, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f)), " - " + method13269.getString(i), ClientFonts.JelloLight20));
            n += 22;
        }
        n += 75;
        this.method14279(n);
    }
    
    @Override
    public void draw(float partialTicks) {
        this.drawBackground((int)((1.0f - MathUtils.lerp(this.field20522.calcPercent(), 0.17, 1.0, 0.51, 1.0)) * 100.0f));
        this.translate();
        partialTicks *= this.field20522.calcPercent();
        super.draw(partialTicks);
    }
}

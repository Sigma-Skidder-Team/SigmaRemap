// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.TrueTypeFont;

import java.util.Collections;
import java.util.ArrayList;

public class ClassicMainMenu extends Class4800
{
    public final Class4825 field21186;
    public final Class4825 field21187;
    private final int field21188;
    private final int field21189;
    private final boolean field21190;
    private Class4897 field21191;
    private Animation field21192;
    private final Animation field21193;
    private final Class4920 field21194;
    private final Class4814 field21195;
    private float field21196;
    private float field21197;
    private static long field21198;
    
    private int method14859(int n) {
        final int n2 = 4;
        final int n3 = -6;
        final int n4 = 122 * n2 + n2 * n3;
        if (n < n2) {
            return this.method14276() / 2 - n4 / 2 + (n * 122 + n * n3);
        }
        n -= n2;
        final int n5 = 3;
        final int n6 = 6;
        return this.method14276() / 2 - (122 * n5 + n5 * n6) / 2 + (n * 122 + n * n6);
    }
    
    private int method14860() {
        return this.method14278() / 2 - 100;
    }
    
    public ClassicMainMenu() {
        super("Main Screen");
        this.field21188 = 0;
        this.field21189 = 0;
        this.field21190 = true;
        this.field21192 = new Animation(325, 325);
        this.field21193 = new Animation(800, 800);
        this.setListening(false);
        (this.field21192 = new Animation(175, 325)).changeDirection(Direction.BACKWARDS);
        this.field21193.changeDirection(Direction.FORWARDS);
        final TrueTypeFont field40807 = ClassicAssets.field40807;
        final String s = "© Sigma Prod";
        final StringBuilder append = new StringBuilder().append("Sigma ");
        Client.getInstance();
        final String string = append.append("5.0.0b6").append(" for Minecraft 1.8 to 1.15").toString();
        this.addToList(this.field21194 = new Class4920(this, "particles"));
        final int n = 480;
        this.addToList(this.field21195 = new Class4814(this, "group", (this.method14276() - n) / 2, this.method14278() / 2 - 230, n, 480));
        this.addToList(this.field21187 = new Class4834(this, "Copyright", 10, 8, field40807.getWidth(s), 140, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), s, ClientFonts.JelloLight18));
        final ColorHelper colorHelper = new ColorHelper(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f));
        colorHelper.method19734(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f));
        final ArrayList list = new ArrayList();
        list.add("LeakedPvP");
        list.add("Tomygames");
        list.add("Omikron");
        Collections.shuffle(list);
        this.addToList(new Class4834(this, "names", 130, 9, field40807.getWidth(s), 140, colorHelper, "by " + list.get(0) + ", " + list.get(1) + ", " + list.get(2), ClassicAssets.field40808));
        this.addToList(this.field21186 = new Class4834(this, "Version", this.method14276() - field40807.getWidth(string) - 9, this.method14278() - 31, 114, 140, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), string, field40807));
        this.addToList(new Class4834(this, "Hello", 10, this.method14278() - 55, 114, 140, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), "Hello,", field40807));
        this.addToList(new Class4834(this, "Latest", 10, this.method14278() - 31, 114, 140, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), "You are using the latest version", field40807));
        this.field21196 = (float)(this.method14276() / 2);
        this.field21197 = (float)(this.method14278() / 2);
    }
    
    public void method14861(final Screen class527) {
        Minecraft.getInstance().displayGuiScreen(class527);
        this.method14863();
    }
    
    public void method14862(final Class4800 class4800) {
        Client.getInstance().getScreenManager().method32156(class4800);
        this.method14863();
    }
    
    public void method14863() {
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final float n3 = n - this.field21196;
        final float n4 = n2 - this.field21197;
        this.field21196 += n3 * 0.055f;
        this.field21197 += n4 * 0.055f;
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        final int round = Math.round((1.0f - Class7791.method25030(this.field21192.calcPercent(), 0.0f, 1.0f, 1.0f)) * 5.0f);
        this.drawBackground(round);
        this.method14228();
        GL11.glPushMatrix();
        GL11.glTranslated((int)(-this.method14276() / 200 + this.field21196 / 200.0f), (int)(-this.method14278() / 100 + this.field21197 / 100.0f) - round, 0.0);
        RenderUtil.method26905(-10.0f, -10.0f, (float)(this.method14276() + 20), (float)(this.method14278() + 20), ClassicAssets.field40801);
        GL11.glPopMatrix();
        this.field21195.method14295((int)(-this.method14276() / 40 + this.field21196 / 40.0f), (int)(-this.method14278() / 40 + this.field21197 / 40.0f) + round);
        this.field21194.method14295((int)(-this.method14276() / 12 + this.field21196 / 12.0f), (int)(-this.method14278() / 12 + this.field21197 / 12.0f));
        super.draw(n);
    }
    
    static {
        ClassicMainMenu.field21198 = System.nanoTime();
    }
}

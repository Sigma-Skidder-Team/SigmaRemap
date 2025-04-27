// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import org.newdawn.slick.Texture;
import org.newdawn.slick.TrueTypeFont;

public class Class4811 extends CustomGuiScreen
{
    private final Class4868 field20570;
    private final Class4868 field20571;
    private final Class4868 field20572;
    private final Class4868 field20573;
    private final Class4868 field20574;
    private final Class4839 field20575;
    private final Class4825 field20576;
    private final Class4825 field20577;
    private final Class4897 field20578;
    private final UIButton field20579;
    public int field20580;
    
    public Class4811(final CustomGuiScreen \u9b60\u9e09\uaf2e\u7263\u3ead1, final String string2, final int i3, final int i4, final int i5, final int i6) {
        super(\u9b60\u9e09\uaf2e\u7263\u3ead1, string2, i3, i4, i5, i6);
        this.field20580 = 0;
        this.setListening(false);
        final int i7 = 0;
        final int i8 = 0;
        final int i9 = 2;
        final int i10 = 2;
        final int i11 = 128;
        final int i12 = 128;
        final TrueTypeFont v15 = ClientFonts.JelloLight20;
        final TrueTypeFont v16 = ClientFonts.JelloLight18;
        int i13 = 0;
        final int i14 = 80;
        final int i15 = 10;
        final String v17 = "© Sigma Prod";
        final StringBuilder append = new StringBuilder().append("Jello for Sigma ");
        Client.getInstance();
        final String v18 = append.append("5.0.0b6").toString();
        this.addToList(this.field20570 = new Class4871(this, "Singleplayer", this.method14352(i13++), this.method14353(), 128, 128, ClientAssets.singeplayer, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color)));
        this.addToList(this.field20571 = new Class4871(this, "Multiplayer", this.method14352(i13++), this.method14353(), 128, 128, ClientAssets.multiplayer, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color)));
        this.addToList(this.field20572 = new Class4871(this, "Realms", this.method14352(i13++), this.method14353(), 128, 128, ClientAssets.shop, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color)));
        this.addToList(this.field20573 = new Class4871(this, "Options", this.method14352(i13++), this.method14353(), 128, 128, ClientAssets.options, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color)));
        this.addToList(this.field20574 = new Class4871(this, "Alt Manager", this.method14352(i13++), this.method14353(), 128, 128, ClientAssets.alt, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color)));
        this.addToList(this.field20577 = new Class4834(this, "Copyright", 10, this.method14278() - 31, v15.getWidth(v17), 128, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), v17, v15));
        this.addToList(this.field20576 = new Class4834(this, "Version", this.method14276() - v15.getWidth(v18) - 9, this.method14278() - 31, 128, 128, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), v18, v15));
        this.addToList(this.field20579 = new UIButton(this, "changelog", 232, 24, 110, 50, new ColorHelper(ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.7f)), "                                                                                                        Changelog                                                                   ", ClientFonts.JelloLight20));
        this.field20579.doThis((class4803, n) -> ((MainMenuScreen)this.getParent()).method14791());
        this.addToList(this.field20578 = new Class4897(this, "Account", 0, i15, 0, i14, "Log in"));
        this.addToList(this.field20575 = new Class4839(this, "pre", 0, 0, 240, 100));
        this.field20575.method14256((class4803, n) -> {
            if (Client.getInstance().getNetworkManager().getEncryptor() != null) {
                ((MainMenuScreen)this.getParent()).method14792();
            }
            else {
                this.method14351(new RegisterScreen());
            }
        });
        this.field20570.doThis((class4803, n) -> this.method14350(new Class544(Minecraft.getInstance().currentScreen)));
        this.field20571.doThis((class4803, n) -> this.method14350(new Class721(Minecraft.getInstance().currentScreen)));
        this.field20573.doThis((class4803, n) -> this.method14350(new Class550(Minecraft.getInstance().currentScreen, Minecraft.getInstance().gameSettings)));
        this.field20574.doThis((class4803, n) -> this.method14351(new Class4934()));
        this.field20572.doThis((class4803, n) -> this.method14348());
        this.field20578.doThis((class4803, n) -> {
            if (Client.getInstance().getNetworkManager().getEncryptor() != null) {
                ((MainMenuScreen)this.getParent()).method14794();
            }
            else {
                this.method14351(new RegisterScreen());
            }
        });
        this.field20577.doThis((class4803, n) -> {
            if (this.field20580++ > 8) {
                Client.getInstance().getScreenManager().method32156(new Class4928());
            }
        });
    }
    
    public void method14348() {
        new Class5052().method15490(new MainMenu());
        this.method14349();
    }
    
    @Override
    public void draw(final float n) {
        this.method14227();
        final Texture field32160 = ClientAssets.logo_large;
        final int method24918 = field32160.getImageWidth();
        final int method24919 = field32160.getImageHeight();
        if (ScreenManager.guiScale > 1.0f) {
            final Texture field32161 = ClientAssets.logo_large2x;
        }
        RenderUtil.drawImage((float)(this.method14276() / 2 - method24918 / 2), (float)(this.method14278() / 2 - method24919), (float)method24918, (float)method24919, ClientAssets.logo_large, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        super.draw(n);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20575.setEnabled(!Client.getInstance().getNetworkManager().isPremium());
        this.field20579.method14273(Client.getInstance().getNetworkManager().isPremium() ? 30 : 232);
        super.method14200(n, n2);
    }
    
    public void method14349() {
        Client.getInstance().getAudioManager().method32830("clicksound");
    }
    
    public void method14350(final Screen class527) {
        Minecraft.getInstance().displayGuiScreen(class527);
        this.method14349();
    }
    
    public void method14351(final Class4800 class4800) {
        Client.getInstance().getScreenManager().method32156(class4800);
        this.method14349();
    }
    
    private int method14352(final int n) {
        return this.method14276() / 2 - 305 + (n * 128 + n * -6);
    }
    
    private int method14353() {
        return this.method14278() / 2 + 14;
    }
}

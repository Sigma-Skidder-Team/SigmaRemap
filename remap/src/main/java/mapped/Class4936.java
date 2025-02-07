// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Class4936 extends Class4800
{
    private int field21167;
    private float field21168;
    private float field21169;
    private boolean field21170;
    public UIButton field21171;
    private Class4823 field21172;
    private Class4907 field21173;
    private Class4907 field21174;
    private float field21175;
    private float field21176;
    private int field21177;
    public Class7861 field21178;
    private Texture field21179;
    private float field21180;
    private Class225 field21181;
    private boolean field21182;
    private Class4832 field21183;
    private Class4810 field21184;
    private String field21185;
    
    public Class4936() {
        super("Alt Manager");
        this.field21169 = 0.75f;
        this.field21170 = true;
        this.field21175 = 0.65f;
        this.field21176 = 1.0f - this.field21175;
        this.field21177 = 30;
        this.field21178 = Client.getInstance().method35198();
        this.field21181 = Class225.field793;
        this.field21182 = false;
        this.field21185 = "§7Idle...";
        this.setListening(false);
        final Class4920 class4920;
        this.addToList(class4920 = new Class4920(this, "particles"));
        class4920.method14303(true);
        final ArrayList list = new ArrayList();
        final Class9295 class4921 = new Class9295(Minecraft.method5277());
        class4921.method34331();
        for (int method34336 = class4921.method34336(), i = 0; i < method34336; ++i) {
            final ServerData method34337 = class4921.method34333(i);
            if (!list.contains(method34337.field41613)) {
                list.add(method34337.field41613);
            }
        }
        final int n = 790;
        this.addToList(this.field21183 = new Class4832(this, "textbox", (Minecraft.method5277().window.method7694() - n) / 2 - 140, this.method14278() - 40, 140, 32, TextField.field20670, "", "Search...", ClientFonts.JelloLight18));
        this.field21183.setFont(ClientFonts.Default);
        this.field21183.method14473(class4831 -> this.method14851());
        this.method14852();
        this.addToList(this.field21184 = new Class4810(this, "toolbar", (Minecraft.method5277().window.method7694() - n) / 2 + 16, this.method14278() - 94));
        this.field21184.method14305(false);
    }
    
    private void method14844(final Class7971 class7971) {
        final int n = 52;
        final Class4836 class7972;
        this.field21172.addToList(class7972 = new Class4836(this.field21172, class7971.method25888(), 4, n * this.method14849() + 4, this.field21172.method14276() - 8, n, class7971));
        class7972.doThis((class4837, n) -> {
            if (n == 0) {
                final Class4836 method14855 = this.method14855();
                if (method14855 != null) {
                    method14855.method14505(false);
                }
                class7972.method14505(true);
                this.field21184.method14305(true);
                if (method14855 != null) {
                    if (method14855.equals(class7972)) {
                        this.method14847(class7972);
                    }
                }
            }
        });
    }
    
    public void method14845() {
        final Class4836 method14855 = this.method14855();
        if (method14855 != null) {
            this.method14847(method14855);
        }
    }
    
    public void method14846() {
        final Class4836 method14855 = this.method14855();
        if (method14855 != null) {
            this.field21178.method25460(method14855.field20723);
            this.field21184.method14305(false);
            this.method14851();
        }
    }
    
    public void method14847(final Class4836 class4836) {
        this.method14848(class4836.field20723);
    }
    
    public void method14848(final Class7971 class7971) {
        this.field21185 = "§bLogging in...";
        new Thread(() -> {
            if (!this.field21178.method25463(class7972)) {
                this.field21185 = "§cLogin Failed!";
            }
            else {
                this.field21185 = "§aLogged in. (" + class7972.method25890() + (class7972.method25912() ? " - offline name" : "") + ")";
            }
        }).start();
    }
    
    @Override
    public void draw(final float n) {
        this.method14850();
        super.draw(n);
        RenderUtil.drawString(ClientFonts.Default, 20.0f, 20.0f, Minecraft.method5277().method5287().method33692(), -2236963);
        RenderUtil.method26890(ClientFonts.Default, (float)(this.method14276() / 2), 20.0f, "Account Manager - " + this.method14849() + " alts", ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734);
        RenderUtil.method26891(ClientFonts.Default, (float)(this.method14276() / 2), 40.0f, this.field21185, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11734, false);
    }
    
    private int method14849() {
        int n = 0;
        for (final CustomGuiScreen customGuiScreen : this.field21172.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    ++n;
                }
            }
        }
        return n;
    }
    
    private void method14850() {
        RenderUtil.method26905(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class9493.field40801);
        RenderUtil.method26874(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.23f));
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Minecraft.method5277().displayGuiScreen(new Class548());
        }
    }
    
    @Override
    public JSONObject method14202(final JSONObject JSONObject) {
        this.field21178.method25467();
        return JSONObject;
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        for (final CustomGuiScreen class4406 : this.field21172.method14250()) {
            if (!(class4406 instanceof Class4827)) {
                final Iterator<CustomGuiScreen> iterator2 = class4406.method14250().iterator();
                while (iterator2.hasNext()) {
                    this.field21172.method14243(iterator2.next());
                }
            }
        }
        this.method14851();
    }
    
    public void method14851() {
        this.runThisOnDimensionUpdate(new Class1418(this));
    }
    
    public void method14852() {
        final List<Class7971> method24356 = Class7673.method24356(this.field21178.method25466(), Class225.field793, "", this.field21183.getTypedText());
        int method24357 = 0;
        if (this.field21172 != null) {
            method24357 = this.field21172.method14392();
            this.method14245(this.field21172);
        }
        final CustomGuiScreen method24358 = this.method14224("alts");
        if (method24358 != null) {
            this.method14245(method24358);
        }
        final int n = Minecraft.method5277().window.method7694() - 200;
        this.method14242(this.field21172 = new Class4823(this, "alts", (this.method14276() - n) / 2, 69, n, Minecraft.method5277().window.method7695() - 169));
        final Iterator<Class7971> iterator = method24356.iterator();
        while (iterator.hasNext()) {
            this.method14844(iterator.next());
        }
        this.field21172.method14391(method24357);
        this.field21172.setListening(false);
        this.field21172.method14394(true);
        this.field21172.method14251();
    }
    
    private void method14853(final Object o) {
    }
    
    public int method14854() {
        return Minecraft.method5277().window.method7695() / 12 + 280 + Minecraft.method5277().window.method7695() / 12;
    }
    
    public Class4836 method14855() {
        for (final CustomGuiScreen customGuiScreen : this.field21172.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    if (!(class4804 instanceof Class4836)) {
                        continue;
                    }
                    final Class4836 class4805 = (Class4836)class4804;
                    if (!class4805.method14507()) {
                        continue;
                    }
                    return class4805;
                }
            }
        }
        return null;
    }
}

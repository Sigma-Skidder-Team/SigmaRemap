// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.io.IOException;
import java.util.ArrayList;

public class Class4934 extends Class4800
{
    private int field21134;
    private float field21135;
    private float field21136;
    private boolean field21137;
    public UIButton field21138;
    private Class4817 field21139;
    private Class4817 field21140;
    private Class4907 field21141;
    private Class4907 field21142;
    private float field21143;
    private float field21144;
    private int field21145;
    private Class4837 field21146;
    private Class4826 field21147;
    public Class7861 field21148;
    private Texture field21149;
    private float field21150;
    private UIButton field21151;
    private Class225 field21152;
    private String field21153;
    private boolean field21154;
    private TextField field21155;
    
    public Class4934() {
        super("Alt Manager");
        this.field21136 = 0.75f;
        this.field21137 = true;
        this.field21143 = 0.65f;
        this.field21144 = 1.0f - this.field21143;
        this.field21145 = 30;
        this.field21148 = Client.getInstance().method35198();
        this.field21152 = Class225.field793;
        this.field21153 = "";
        this.setListening(this.field21154 = false);
        final ArrayList list = new ArrayList();
        list.add("Alphabetical");
        list.add("Bans");
        list.add("Date Added");
        list.add("Last Used");
        list.add("Use count");
        final ArrayList list2 = new ArrayList();
        final Class9295 class9295 = new Class9295(Minecraft.method5277());
        class9295.method34331();
        for (int method34336 = class9295.method34336(), i = 0; i < method34336; ++i) {
            final ServerData method34337 = class9295.method34333(i);
            if (!list2.contains(method34337.field41613)) {
                list2.add(method34337.field41613);
            }
        }
        this.method14813();
        this.method14814();
        this.addToList(this.field21139 = new Class4817(this, "alts", 0, 114, (int)(Minecraft.method5277().window.method7694() * this.field21143) - 4, Minecraft.method5277().window.method7695() - 119 - this.field21145));
        this.addToList(this.field21140 = new Class4817(this, "altView", (int)(Minecraft.method5277().window.method7694() * this.field21143), 114, (int)(Minecraft.method5277().window.method7694() * this.field21144) - this.field21145, Minecraft.method5277().window.method7695() - 119 - this.field21145));
        this.field21139.setListening(false);
        this.field21140.setListening(false);
        this.field21139.method14394(false);
        this.field21140.addToList(this.field21146 = new Class4837(this.field21140, "", (int)(Minecraft.method5277().window.method7694() * this.field21144 - (int)(Minecraft.method5277().window.method7694() * this.field21144)) / 2 - 10, Minecraft.method5277().window.method7695() / 12, (int)(Minecraft.method5277().window.method7694() * this.field21144), 350, "steve"));
        this.field21140.addToList(this.field21147 = new Class4826(this.field21140, "info", (int)(Minecraft.method5277().window.method7694() * this.field21144 - (int)(Minecraft.method5277().window.method7694() * this.field21144)) / 2 - 10, this.method14825(), (int)(Minecraft.method5277().window.method7694() * this.field21144), 500));
        final Class4894 class9296 = new Class4894(this, "drop", (int)(Minecraft.method5277().window.method7694() * this.field21143) - 220, 44, 200, 32, list, 0);
        class9296.method14681(list2, 1);
        class9296.method14694(2);
        this.addToList(class9296);
        class9296.method14516(class4895 -> {
            switch (class9296.method14693()) {
                case 0: {
                    this.field21152 = Class225.field791;
                    break;
                }
                case 1: {
                    this.field21152 = Class225.field792;
                    this.field21153 = class9296.method14683(1).method14526().get(class9296.method14683(1).method14530());
                    break;
                }
                case 2: {
                    this.field21152 = Class225.field793;
                    break;
                }
                case 3: {
                    this.field21152 = Class225.field794;
                    break;
                }
                case 4: {
                    this.field21152 = Class225.field795;
                    break;
                }
            }
            this.method14823(false);
        });
        this.addToList(this.field21155 = new TextField(this, "textbox", (int)(Minecraft.method5277().window.method7694() * this.field21143), 44, 150, 32, TextField.field20670, "", "Search...", ClientFonts.JelloLight18));
        this.field21155.setFont(ClientFonts.JelloLight18);
        this.field21155.method14473(class4831 -> this.method14823(false));
        this.addToList(this.field21151 = new UIButton(this, "btnt", this.method14276() - 90, 43, 70, 30, ColorHelper.field25964, "Add +", ClientFonts.JelloLight25));
        this.field21139.method14251();
        this.field21151.doThis((class4803, n) -> {
            if (this.method14820()) {
                this.field21141.method14744(!this.field21141.isHovered());
            }
        });
    }
    
    private void method14811(final Class7971 class7971, final boolean b) {
        final Class4917 class7972;
        this.field21139.addToList(class7972 = new Class4917(this.field21139, class7971.method25888(), this.field21145, (100 + this.field21145 / 2) * this.method14821(), this.field21139.method14276() - this.field21145 * 2 + 4, 100, class7971));
        if (!b) {
            class7972.field21038 = new Animation(0, 0);
        }
        if (this.field21148.method25470(class7971)) {
            class7972.method14767(true);
        }
        class7972.method14256((class4918, n) -> {
            if (n != 0) {
                this.field21142.method14516(class4918 -> {
                    this.field21148.method25465(class7972.field21031);
                    this.field21147.method14455(null);
                    this.field21146.method14512(null);
                    this.method14823(false);
                });
                this.field21142.method14307(true);
                this.field21142.method14744(true);
            }
            else {
                if (this.field21146.field20738 == class7972.field21031 && class7972.method14763()) {
                    this.method14812(class7972);
                }
                else {
                    this.field21140.method14391(0);
                }
                this.field21146.method14512(class7972.field21031);
                this.field21147.method14455(class7972.field21031);
                for (final CustomGuiScreen class4919 : this.field21139.method14250()) {
                    if (!(class4919 instanceof Class4827)) {
                        final Iterator<CustomGuiScreen> iterator2 = class4919.method14250().iterator();
                        while (iterator2.hasNext()) {
                            ((Class4917)iterator2.next()).method14761(false);
                        }
                    }
                }
                class7972.method14761(true);
            }
        });
        if (Client.getInstance().method35198().method25470(class7971)) {
            this.field21146.method14512(class7972.field21031);
            this.field21147.method14455(class7972.field21031);
            class7972.method14762(true, true);
        }
    }
    
    private void method14812(final Class4917 class4917) {
        class4917.method14769(true);
        new Thread(() -> {
            if (!this.field21148.method25463(class4918.field21031)) {
                class4918.method14768(114);
                Client.getInstance().method35196().method32830("error");
            }
            else {
                this.method14819();
                class4918.method14767(true);
                Client.getInstance().method35196().method32830("connect");
                this.method14823(false);
            }
            class4918.method14769(false);
        }).start();
    }
    
    private void method14813() {
        this.addToList(this.field21141 = new Class4907(this, "Testt", true, "Add Alt", new Class7976[] { new Class7976(Class294.field1678, "Add Alt", 50), new Class7976(Class294.field1675, "Login with your minecraft", 15), new Class7976(Class294.field1675, "account here!", 25), new Class7976(Class294.field1676, "Email", 50), new Class7976(Class294.field1676, "Password", 50), new Class7976(Class294.field1679, "", 15), new Class7976(Class294.field1677, "Add alt", 50) }));
        this.field21141.method14516(class4841 -> {
            if (!this.field21141.method14741().get("Email").contains(":")) {
                final Class7971 class4842 = new Class7971(this.field21141.method14741().get("Email"), this.field21141.method14741().get("Password"));
                if (!this.field21148.method25461(class4842)) {
                    this.field21148.method25459(class4842);
                }
                this.method14823(false);
                return;
            }
            final String[] split = this.field21141.method14741().get("Email").replace("\r", "\n").replace("\n\n", "\n").split("\n");
            for (int length = split.length, i = 0; i < length; ++i) {
                final String[] split2 = split[i].split(":");
                if (split2.length == 2) {
                    final Class7971 class4843 = new Class7971(split2[0], split2[1]);
                    if (!this.field21148.method25461(class4843)) {
                        this.field21148.method25459(class4843);
                    }
                }
            }
            this.method14823(false);
        });
    }
    
    private void method14814() {
        this.addToList(this.field21142 = new Class4907(this, "delete", true, "Delete", new Class7976[] { new Class7976(Class294.field1678, "Delete?", 50), new Class7976(Class294.field1675, "Are you sure you want", 15), new Class7976(Class294.field1675, "to delete this alt?", 40), new Class7976(Class294.field1677, "Delete", 50) }));
    }
    
    @Override
    public void draw(final float n) {
        this.method14822();
        RenderUtil.method26915((int)(Minecraft.method5277().window.method7694() * this.field21143), 114, (int)(Minecraft.method5277().window.method7694() * this.field21144) - this.field21145, Minecraft.method5277().window.method7695() - 119 - this.field21145, ClientColors.LIGHT_GREYISH_BLUE.color);
        this.method14816();
        this.method14818();
        this.method14817();
        super.draw(n);
    }
    
    private void method14815() {
        if (this.field21150 != this.field21139.method14392()) {
            try {
                this.field21149 = Class9399.method34928("blur", BufferedImage.method20832(0, 0, (int)(Minecraft.method5277().window.method7694() * this.field21143) - 15, 114, 4, 40, -921102));
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        final float n = (this.field21150 < 25.0f) ? (this.field21150 / 25.0f) : 1.0f;
        GL11.glTexParameteri(3553, 10241, 9728);
        if (this.field21149 != null) {
            RenderUtil.drawImage(0.0f, 0.0f, (float)((int)(Minecraft.method5277().window.method7694() * this.field21143) - 15), 114.0f, this.field21149, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        }
        this.field21150 = (float)this.field21139.method14392();
    }
    
    private void method14816() {
    }
    
    private void method14817() {
        final int n = this.x + this.field21145;
        final int n2 = this.y + this.field21145;
        final int method19118 = ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.8f);
        RenderUtil.drawString(ClientFonts.JelloLight40, (float)n, (float)n2, "Jello", method19118);
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)(n + 87), (float)(n2 + 15), "Alt Manager", method19118);
    }
    
    private void method14818() {
        float method35858 = 1.0f;
        for (final CustomGuiScreen customGuiScreen : this.field21139.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    if (!(class4804 instanceof Class4917)) {
                        continue;
                    }
                    final Class4917 class4805 = (Class4917)class4804;
                    if (class4804.method14274() <= Minecraft.method5277().window.method7695() && this.field21139.method14392() == 0) {
                        if (method35858 > 0.2f) {
                            class4805.field21038.changeDirection(Direction.BACKWARDS);
                        }
                        class4805.method14293((int)(-((1.0f - MathUtils.lerp(class4805.field21038.calcPercent(), 0.51, 0.82, 0.0, 0.99)) * (class4804.method14276() + 30))));
                        method35858 = class4805.field21038.calcPercent();
                    }
                    else {
                        class4805.method14293(0);
                        class4805.field21038.changeDirection(Direction.BACKWARDS);
                    }
                }
            }
        }
    }
    
    private void method14819() {
        for (final CustomGuiScreen customGuiScreen : this.field21139.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                final Iterator<CustomGuiScreen> iterator2 = customGuiScreen.method14250().iterator();
                while (iterator2.hasNext()) {
                    ((Class4917)iterator2.next()).method14767(false);
                }
            }
        }
    }
    
    private boolean method14820() {
        for (final CustomGuiScreen customGuiScreen : this.field21139.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    if (class4804.method14289() != 0 && class4804.method14272() > this.field20480) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private int method14821() {
        int n = 0;
        for (final CustomGuiScreen customGuiScreen : this.field21139.method14250()) {
            if (!(customGuiScreen instanceof Class4827)) {
                for (final CustomGuiScreen class4804 : customGuiScreen.method14250()) {
                    ++n;
                }
            }
        }
        return n;
    }
    
    private void method14822() {
        final int field21134 = this.method14320() * -1;
        final float n = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21137) {
            this.field21135 = (float)(int)n;
            this.field21134 = field21134;
            this.field21137 = false;
        }
        final float n2 = n - this.field21135;
        final float n3 = (float)(field21134 - this.field21134);
        RenderUtil.method26905((float)this.field21134, this.field21135, (float)(this.method14276() * 2), (float)(this.method14278() + 114), ClientAssets.getBlurredPanorama);
        final float n4 = 0.5f;
        if (n != this.field21135) {
            this.field21135 += n2 * n4;
        }
        if (field21134 != this.field21134) {
            this.field21134 += (int)(n3 * n4);
        }
        RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.95f));
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
        this.field21148.method25467();
        return JSONObject;
    }
    
    @Override
    public void method14203(final JSONObject JSONObject) {
        for (final CustomGuiScreen class4406 : this.field21139.method14250()) {
            if (!(class4406 instanceof Class4827)) {
                final Iterator<CustomGuiScreen> iterator2 = class4406.method14250().iterator();
                while (iterator2.hasNext()) {
                    this.field21139.method14243(iterator2.next());
                }
            }
        }
        this.method14823(true);
    }
    
    public void method14823(final boolean b) {
        this.runThisOnDimensionUpdate(new Class1114(this, this, Class7673.method24356(this.field21148.method25466(), this.field21152, this.field21153, this.field21155.getTypedText()), b));
    }
    
    private void method14824(final Object o) {
    }
    
    public int method14825() {
        return Minecraft.method5277().window.method7695() / 12 + 280 + Minecraft.method5277().window.method7695() / 12;
    }
}

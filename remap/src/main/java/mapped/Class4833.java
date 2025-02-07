// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

import java.util.LinkedHashMap;
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.net.CookieManager;
import java.util.Map;
import java.net.URL;

public class Class4833 extends Class4825
{
    private int field20689;
    private int field20690;
    private int field20691;
    private int field20692;
    private String field20693;
    public static URL field20694;
    private Class4817 field20695;
    private Class4817 field20696;
    private CustomGuiScreen field20697;
    private Class7643 field20698;
    public static Map<String, Class9175> field20699;
    public static String field20700;
    public static Class9175 field20701;
    private Class4868 field20702;
    private Class4868 field20703;
    private Class4868 field20704;
    private Class4868 field20705;
    private Class4865 field20706;
    private int field20707;
    private Texture field20708;
    private CustomGuiScreen field20709;
    public Class4838 field20710;
    public Class4842 field20711;
    public static Class9175[] field20712;
    private static CookieManager field20713;
    public static long field20714;
    public float field20715;
    public float field20716;
    private Animation field20717;
    public boolean field20718;
    
    public Class4833(final CustomGuiScreen customGuiScreen, final String s) {
        super(customGuiScreen, s, 875, 55, 800, 600, false);
        this.field20689 = 250;
        this.field20690 = 40;
        this.field20691 = 64;
        this.field20692 = 94;
        this.field20693 = "Music Player";
        this.field20698 = Client.getInstance().method35199();
        this.field20715 = 0.0f;
        this.field20716 = 0.0f;
        this.field20717 = new Animation(80, 150, Direction.FORWARDS);
        this.field20718 = false;
        Class4833.field20714 = System.nanoTime();
        this.method14277(800);
        this.method14279(600);
        this.method14273(Math.abs(this.method14272()));
        this.method14275(Math.abs(this.method14274()));
        this.addToList(this.field20695 = new Class4817(this, "musictabs", 0, this.field20691 + 14, this.field20689, this.method14278() - 64 - this.field20692));
        this.addToList(this.field20697 = new Class4817(this, "musiccontrols", this.field20689, this.method14278() - this.field20692, this.method14276() - this.field20689, this.field20692));
        this.addToList(this.field20709 = new CustomGuiScreen(this, "reShowView", 0, 0, 1, this.method14278()));
        final Class4906 class4804;
        this.addToList(class4804 = new Class4906(this, "spectrumButton", 15, this.field20481 - 140, 40, 40, this.field20698.method24178()));
        class4804.method14301(true);
        class4804.doThis((class4803, n) -> {
            this.field20698.method24177(!this.field20698.method24178());
            ((Class4906)class4803).method14738(this.field20698.method24178());
        });
        this.field20695.setListening(false);
        class4804.setListening(false);
        this.field20697.setListening(false);
        this.field20709.setListening(false);
        new ColorHelper(1250067, -15329770).method19734(ClientColors.LIGHT_GREYISH_BLUE.color).method19738(Class2056.field11738);
        final ArrayList list = new ArrayList();
        for (int length = Class4833.field20712.length, n2 = 0; n2 < length; ++n2) {
            list.add(new Thread(() -> {
                final int n2;
                final Class9175[] array;
                final Object o = array[n2];
                if (!Class4833.field20699.containsKey(class4806.field38864)) {
                    if (!class4806.field38867) {
                        class4806.field38867 = (1 != 0);
                        class4806.method33499();
                        Class4833.field20699.put(class4806.field38864, class4806);
                    }
                }
                this.runThisOnDimensionUpdate(new Class1136(this, class4806, class4807, class4808));
                return;
            }));
            ((Thread)list.get(list.size() - 1)).start();
        }
        final int n = (this.method14276() - this.field20689 - 38) / 2;
        this.field20697.addToList(this.field20702 = new Class4873(this.field20697, "play", n, 27, 38, 38, ClientAssets.playmusic, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), null));
        this.field20697.addToList(this.field20703 = new Class4873(this.field20697, "pause", n, 27, 38, 38, ClientAssets.pause, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), null));
        this.field20697.addToList(this.field20704 = new Class4873(this.field20697, "forwards", n + 114, 23, 46, 46, ClientAssets.forwards, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), null));
        this.field20697.addToList(this.field20705 = new Class4873(this.field20697, "backwards", n - 114, 23, 46, 46, ClientAssets.backwards, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color), null));
        this.field20697.addToList(this.field20706 = new Class4865(this.field20697, "volume", this.method14276() - this.field20689 - 19, 14, 4, 40));
        final Class4860 class4805;
        this.field20697.addToList(class4805 = new Class4860(this.field20697, "repeat", 14, 34, 27, 20, this.field20698.method24169()));
        class4805.method14516(class4861 -> this.field20698.method24168(class4805.method14577()));
        this.addToList(this.field20711 = new Class4842(this, "progress", this.field20689, this.method14278() - 5, this.method14276() - this.field20689, 5));
        this.field20711.method14301(true);
        this.field20711.setListening(false);
        this.field20709.method14301(true);
        this.field20709.method14256((class4803, n) -> {
            this.field20718 = true;
            this.field20715 = (float)this.method14272();
            this.field20716 = (float)this.method14274();
        });
        this.field20703.setEnabled(false);
        this.field20702.setEnabled(false);
        this.field20702.doThis((class4803, n) -> this.field20698.method24175(true));
        this.field20703.doThis((class4803, n) -> this.field20698.method24175(false));
        this.field20704.doThis((class4803, n) -> this.field20698.method24181());
        this.field20705.doThis((class4803, n) -> this.field20698.method24180());
        this.field20706.method14594(class4865 -> this.field20698.method24176((int)((1.0f - this.field20706.method14592()) * 100.0f)));
        this.field20706.method14593(1.0f - this.field20698.method24179() / 100.0f);
        this.addToList(this.field20710 = new Class4838(this, "search", this.field20689, 0, this.method14276() - this.field20689, this.method14278() - this.field20692, "Search..."));
        this.field20710.setEnabled(true);
        this.field20710.setListening(false);
    }
    
    private void method14479(final Class4817 field20696) {
        if (this.field20696 != null) {
            this.field20696.setEnabled(false);
        }
        field20696.setEnabled(true);
        this.field20693 = field20696.getTypedText();
        this.field20696 = field20696;
        this.field20710.setEnabled(false);
        this.field20696.field20613 = 65;
    }
    
    private void method14480(final Class9175 field20701, final Class8681 class8681) {
        if (!((Class4801)this.getParent()).method14208()) {
            this.field20698.method24182(field20701, class8681);
            Class4833.field20701 = field20701;
        }
    }
    
    private void method14481(final Class8681 class8681) {
        Class4833.field20700 = class8681.field36487;
        Class4833.field20700 = Class4833.field20700.replaceAll("\\(.*\\)", "");
        Class4833.field20700 = Class4833.field20700.replaceAll("\\[.*\\]", "");
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final float min = Math.min(10.0f, Math.max(0.0f, (System.nanoTime() - Class4833.field20714) / 1.810361E7f));
        Class4833.field20714 = System.nanoTime();
        super.method14200(n, n2);
        if (this.field20475 instanceof Class4801) {
            if (!this.method14386()) {
                if (this.field20492 || this.field20718) {
                    if (!this.method14384()) {
                        if (!this.method14386()) {
                            this.field20718 = true;
                            final int n3 = this.field20475.method14276() - 20 - this.method14276();
                            final int n4 = (this.field20475.method14278() - this.method14278()) / 2;
                            final float n5 = this.field20715 - n3;
                            this.field20715 = Math.max(this.field20715 - (this.field20715 - n3) * 0.25f * min, (float)n3);
                            if (this.field20716 - n4 <= 0.0f) {
                                Math.min(this.field20716 -= (this.field20716 - n4) * 0.2f * min, (float)n4);
                            }
                            else {
                                Math.max(this.field20716 -= (this.field20716 - n4) * 0.2f * min, (float)n4);
                            }
                            if (this.field20715 - n3 >= 0.0f) {
                                if (this.field20715 - n3 - this.method14276() > 0.0f) {
                                    this.field20715 = (float)n3;
                                }
                            }
                            else {
                                this.field20715 = (float)n3;
                            }
                            this.method14273((int)this.field20715);
                            this.method14275((int)this.field20716);
                            if (Math.abs(this.field20715 - n3) < 2.0f) {
                                if (Math.abs(this.field20716 - n4) < 2.0f) {
                                    this.method14385(true);
                                    this.field20718 = false;
                                }
                            }
                            return;
                        }
                    }
                }
                if (this.method14272() + this.method14276() <= this.field20475.method14276()) {
                    if (this.method14272() >= 0) {
                        if (this.method14274() >= 0) {
                            return;
                        }
                    }
                }
                if (this.field20715 == 0.0f || this.field20716 == 0.0f) {
                    this.field20715 = (float)this.method14272();
                    this.field20716 = (float)this.method14274();
                }
                final int n6 = this.field20475.method14276() - 40;
                final int n7 = (this.field20475.method14278() - this.method14278()) / 2;
                this.field20715 = Math.min(this.field20715 - (this.field20715 - n6) * 0.25f * min, (float)n6);
                if (this.field20716 - n7 <= 0.0f) {
                    Math.min(this.field20716 -= (this.field20716 - n7) * 0.2f * min, (float)n7);
                }
                else {
                    Math.max(this.field20716 -= (this.field20716 - n7) * 0.2f * min, (float)n7);
                }
                if (this.field20715 - n6 <= 0.0f) {
                    if (this.field20715 - n6 + this.method14276() < 0.0f) {
                        this.field20715 = (float)n6;
                    }
                }
                else {
                    this.field20715 = (float)n6;
                }
                if (Math.abs(this.field20715 - n6) < 2.0f) {
                    if (Math.abs(this.field20716 - n7) < 2.0f) {
                        this.field20715 = (float)this.method14272();
                        this.field20716 = (float)this.method14274();
                    }
                }
                this.method14273((int)this.field20715);
                this.method14275((int)this.field20716);
                this.method14385(false);
                this.method14387(false);
            }
            else {
                final int n8 = n - this.field20596 - ((this.field20475 == null) ? 0 : this.field20475.method14280());
                final int n9 = 200;
                if (n8 + this.method14276() > this.field20475.method14276() + n9) {
                    if (n - this.field20594 > 70) {
                        this.method14273((int)(this.method14272() + (n8 - this.method14272() - n9) * 0.5f));
                        this.field20715 = (float)this.method14272();
                        this.field20716 = (float)this.method14274();
                    }
                }
            }
        }
    }
    
    @Override
    public void draw(float n) {
        super.method14227();
        super.method14228();
        this.field20709.method14277((this.method14272() + this.method14276() <= this.field20475.method14276()) ? 0 : 41);
        this.field20717.changeDirection((this.method14272() + this.method14276() > this.field20475.method14276() && !this.field20718) ? Direction.BACKWARDS : Direction.FORWARDS);
        n *= 0.5f + (1.0f - this.field20717.calcPercent()) * 0.5f;
        if (this.field20698.method24184()) {
            this.field20702.setEnabled(false);
            this.field20703.setEnabled(true);
        }
        else {
            this.field20702.setEnabled(true);
            this.field20703.setEnabled(false);
        }
        RenderUtil.method26876((float)(this.method14272() + this.field20689), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() - this.field20692), ColorUtils.applyAlpha(-14277082, n * 0.8f));
        RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.field20689), (float)(this.method14274() + this.method14278() - this.field20692), ColorUtils.applyAlpha(-16777216, n * 0.95f));
        this.method14483(n);
        this.method14484(n);
        this.method14482(n);
        final int n2 = 55;
        RenderUtil.drawString(ClientFonts.JelloLight40, (float)(n2 + this.method14272()), (float)(this.method14274() + 20), "Jello", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        RenderUtil.drawString(ClientFonts.JelloLight20, (float)(n2 + this.method14272() + 80), (float)(this.method14274() + 40), "music", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        RenderUtil.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), 14.0f, n);
        super.draw(n);
        if (this.field20696 != null) {
            this.method14486(n);
        }
    }
    
    private void method14482(final float n) {
        final int n2 = (int)this.field20698.method24186();
        final int method24192 = this.field20698.method24192();
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + this.field20689 + 14), this.method14274() + this.method14278() - 10 - 22.0f * n, Class5031.method15312(n2), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
        RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.method14272() + this.method14276() - 14 - ClientFonts.JelloLight14.getWidth(Class5031.method15312(method24192))), this.method14274() + this.method14278() - 10 - 22.0f * n, Class5031.method15312(method24192), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
    }
    
    private void method14483(final float n) {
        final Texture method24191 = this.field20698.method24191();
        final Texture method24192 = this.field20698.method24190();
        if (method24191 != null && method24192 != null) {
            RenderUtil.drawImage((float)this.method14272(), (float)(this.method14274() + this.method14278() - this.field20692), (float)this.method14276(), (float)this.field20692, method24192, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
            RenderUtil.method26876((float)this.method14272(), (float)(this.method14274() + this.method14278() - this.field20692), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() - 5), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
            RenderUtil.method26876((float)this.method14272(), (float)(this.method14274() + this.method14278() - 5), (float)(this.method14272() + this.field20689), (float)(this.method14274() + this.method14278()), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
            RenderUtil.drawImage((float)(this.method14272() + (this.field20689 - 114) / 2), (float)(this.method14274() + this.method14278() - 170), 114.0f, 114.0f, method24191, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
            RenderUtil.method26913((float)(this.method14272() + (this.field20689 - 114) / 2), (float)(this.method14274() + this.method14278() - 170), 114.0f, 114.0f, 14.0f, n);
        }
        else {
            RenderUtil.drawImage((float)this.method14272(), (float)(this.method14274() + this.method14278() - this.field20692), (float)this.method14276(), (float)this.field20692, ClientAssets.bg, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
            RenderUtil.method26876((float)this.method14272(), (float)(this.method14274() + this.method14278() - this.field20692), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() - 5), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
            RenderUtil.method26876((float)this.method14272(), (float)(this.method14274() + this.method14278() - 5), (float)(this.method14272() + this.field20689), (float)(this.method14274() + this.method14278()), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
            RenderUtil.drawImage((float)(this.method14272() + (this.field20689 - 114) / 2), (float)(this.method14274() + this.method14278() - 170), 114.0f, 114.0f, ClientAssets.artwork, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
            RenderUtil.method26913((float)(this.method14272() + (this.field20689 - 114) / 2), (float)(this.method14274() + this.method14278() - 170), 114.0f, 114.0f, 14.0f, n);
        }
    }
    
    private void method14484(final float n) {
        if (this.field20698.method24189() != null) {
            final String[] split = this.field20698.method24189().split(" - ");
            final int n2 = 30;
            if (split.length <= 1) {
                this.method14485(n, (split[0].length() != 0) ? split[0] : "Jello Music", this.field20689 - n2 * 2, 12, 0);
            }
            else {
                this.method14485(n, split[1], this.field20689 - n2 * 2, 0, 0);
                this.method14485(n, split[0], this.field20689 - n2 * 2, 20, -1000);
            }
        }
    }
    
    private void method14485(final float n, final String s, final int a, final int n2, final int n3) {
        final float n4 = (new Date().getTime() + n3) % 8500L / 8500.0f;
        float n5;
        if (n4 >= 0.4f) {
            n5 = (float)((n4 - 0.4f) * 1.6666666666666667);
        }
        else {
            n5 = 0.0f;
        }
        float method25031 = Class7791.method25031(n5, 0.0f, 1.0f, 1.0f);
        final int method25032 = ClientFonts.JelloLight14.getWidth(s);
        final int min = Math.min(a, method25032);
        final int method25033 = ClientFonts.JelloLight14.getHeight();
        final int n6 = this.method14272() + (this.field20689 - min) / 2;
        final int n7 = this.method14274() + this.method14278() - 50 + n2;
        final int n8 = Math.max(0, method25032 - min) * 2;
        if (method25032 <= a) {
            method25031 = 0.0f;
        }
        RenderUtil.method26871(n6, n7, n6 + min, n7 + method25033, true);
        RenderUtil.drawString(ClientFonts.JelloLight14, n6 - method25032 * method25031 - 50.0f * method25031, (float)n7, s, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n * Math.min(1.0f, Math.max(0.0f, 1.0f - method25031 * 0.75f))));
        if (method25031 > 0.0f) {
            RenderUtil.drawString(ClientFonts.JelloLight14, n6 - method25032 * method25031 + method25032, (float)n7, s, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
        }
        RenderUtil.endScissor();
    }
    
    private void method14486(final float n) {
        this.field20696.method14301(false);
        if (this.field20707 != this.field20696.method14392()) {
            try {
                if (this.field20708 != null) {
                    this.field20708.release();
                }
                this.field20708 = Class9399.method34928("blur", BufferedImage.method20831(this.method14272() + this.field20689, this.method14274(), this.method14276() - this.field20689, this.field20691, 10, 10));
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        final float n2 = (this.field20707 < 50) ? (this.field20707 / 50.0f) : 1.0f;
        if (this.field20708 != null) {
            RenderUtil.method26898((float)this.field20689, 0.0f, (float)(this.method14276() - this.field20689), (float)this.field20691, this.field20708, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2 * n));
        }
        RenderUtil.method26876((float)this.field20689, 0.0f, (float)this.method14276(), (float)this.field20691, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2 * n * 0.2f));
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)((this.method14276() - ClientFonts.JelloLight25.getWidth(this.field20693) + this.field20689) / 2), 16.0f + (1.0f - n2) * 14.0f, this.field20693, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2));
        RenderUtil.drawString(ClientFonts.JelloMedium25, (float)((this.method14276() - ClientFonts.JelloMedium25.getWidth(this.field20693) + this.field20689) / 2), 16.0f + (1.0f - n2) * 14.0f, this.field20693, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 1.0f - n2));
        RenderUtil.drawImage((float)this.field20689, (float)this.field20691, (float)(this.method14276() - this.field20689), 20.0f, ClientAssets.shadow_bottom, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2 * n * 0.5f));
        this.field20707 = this.field20696.method14392();
    }
    
    static {
        Class4833.field20699 = new LinkedHashMap<String, Class9175>();
        Class4833.field20712 = new Class9175[] { new Class9175("Trap Nation", "UUa10nxShhzNrCE1o2ZOPztg", Class2057.field11740), new Class9175("Chill Nation", "UUM9KEEuzacwVlkt9JfJad7g", Class2057.field11740), new Class9175("VEVO", "PL9tY0BWXOZFu8MzzbNVtUvHs0cQ_gZ03m", Class2057.field11740), new Class9175("Rap Nation", "UU8QfB1wbfrNwNFHQxfyNJsw", Class2057.field11740), new Class9175("MrSuicideSheep", "UU5nc_ZtjKW1htCVZVRxlQAQ", Class2057.field11740), new Class9175("Trap City", "UU65afEgL62PGFWXY7n6CUbA", Class2057.field11740), new Class9175("CloudKid", "UUSa8IUd1uEjlREMa21I3ZPQ", Class2057.field11740), new Class9175("NCS", "UU_aEa8K-EOJ3D6gOs7HcyNg", Class2057.field11740) };
        Class4833.field20713 = new CookieManager();
        Class4833.field20714 = 0L;
    }
}

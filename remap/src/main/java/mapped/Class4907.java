// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.util.system.network.ImageUtil;
import slick2d.Texture;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Class4907 extends Class4841
{
    public CustomGuiScreen field20987;
    public String field20988;
    public Texture field20989;
    private final Animation field20990;
    public boolean field20991;
    public int field20992;
    public int field20993;
    private Map<String, String> field20994;
    private final List<Class8214> field20995;
    
    public Class4907(final CustomGuiScreen customGuiScreen, final String s, final boolean field20991, final String field20992, final Class7976... array) {
        super(customGuiScreen, s, 0, 0, Minecraft.getInstance().window.method7694(), Minecraft.getInstance().window.method7695(), false);
        this.field20990 = new Animation(285, 100);
        this.field20992 = 240;
        this.field20993 = 0;
        this.field20995 = new ArrayList<Class8214>();
        this.field20991 = field20991;
        this.field20988 = field20992;
        this.method14305(false);
        this.method14301(false);
        this.method14252();
        TextField class4804 = null;
        TextField class4805 = null;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field20993 += array[i].field32813 + 10;
        }
        this.field20993 -= 10;
        this.addToList(this.field20987 = new CustomGuiScreen(this, "modalContent", (this.field20480 - this.field20992) / 2, (this.field20481 - this.field20993) / 2, this.field20992, this.field20993));
        int n = 0;
        int n2 = 0;
        for (final Class7976 class4806 : array) {
            ++n;
            if (class4806.field32811 != Class294.field1675) {
                if (class4806.field32811 != Class294.field1676) {
                    if (class4806.field32811 != Class294.field1677) {
                        if (class4806.field32811 == Class294.field1678) {
                            this.field20987.addToList(new Class4834(this.field20987, "Item" + n, 0, n2, this.field20992, class4806.field32813, new ColorHelper(ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color, ClientColors.DEEP_TEAL.color), class4806.field32812, ClientFonts.JelloLight36));
                        }
                    }
                    else {
                        final Class4868 class4807;
                        this.field20987.addToList(class4807 = new Class4868(this.field20987, "Item" + n, 0, n2, this.field20992, class4806.field32813, ColorHelper.field25964, class4806.field32812));
                        class4807.field20847 = 4;
                        class4807.doThis((class4803, n) -> this.method14742());
                    }
                }
                else {
                    final TextField class4808;
                    this.field20987.addToList(class4808 = new TextField(this.field20987, "Item" + n, 0, n2, this.field20992, class4806.field32813, TextField.field20670, "", class4806.field32812));
                    if (!class4806.field32812.contains("Password")) {
                        if (class4806.field32812.contains("Email")) {
                            class4804 = class4808;
                        }
                    }
                    else {
                        class4805 = class4808;
                        class4808.method14477(true);
                    }
                }
            }
            else {
                this.field20987.addToList(new Class4834(this.field20987, "Item" + n, 0, n2, this.field20992, class4806.field32813, new ColorHelper(ClientColors.MID_GREY.color, ClientColors.MID_GREY.color, ClientColors.MID_GREY.color, ClientColors.MID_GREY.color), class4806.field32812, ClientFonts.JelloLight20));
            }
            n2 += class4806.field32813 + 10;
        }
        if (class4804 != null) {
            if (class4805 != null) {
                class4804.method14473(class4832 -> {
                    final String method14314 = class4832.getTypedText();
                    if (method14314 != null) {
                        if (method14314.contains(":")) {
                            final String[] split = method14314.split(":");
                            if (split.length <= 2) {
                                if (split.length > 0) {
                                    class4832.setTypedText(split[0].replace("\n", ""));
                                    if (split.length == 2) {
                                        class4805.setTypedText(split[1].replace("\n", ""));
                                    }
                                }
                            }
                            else {
                                this.method14742();
                            }
                        }
                    }
                });
            }
        }
    }
    
    @Override
    public void method14305(final boolean b) {
        if (b) {
            for (final CustomGuiScreen customGuiScreen : this.field20987.method14250()) {
                if (!(customGuiScreen instanceof TextField)) {
                    continue;
                }
                customGuiScreen.setTypedText("");
                ((TextField) customGuiScreen).method14469();
            }
        }
        this.field20990.changeDirection(b ? Direction.BACKWARDS : Direction.FORWARDS);
        super.method14305(b);
    }
    
    public CustomGuiScreen method14739() {
        return this.field20987;
    }
    
    private Map<String, String> method14740() {
        final HashMap hashMap = new HashMap();
        for (final Class4825 class4825 : this.field20987.method14250()) {
            if (!(class4825 instanceof TextField)) {
                continue;
            }
            final TextField class4826 = (TextField)class4825;
            hashMap.put(class4826.method14475(), class4826.getTypedText());
        }
        return hashMap;
    }
    
    public Map<String, String> method14741() {
        return this.field20994;
    }
    
    public void method14742() {
        this.field20994 = this.method14740();
        this.method14744(false);
        this.method14517();
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        super.method14234(n, n2, n3);
    }
    
    public float method14743(final float n, final float n2) {
        if (this.field20990.getDirection() != Direction.FORWARDS) {
            return (float)(Math.pow(2.0, -10.0f * n) * Math.sin((n - n2 / 4.0f) * 6.283185307179586 / n2) + 1.0);
        }
        return 0.5f + Class7791.method25030(n, 0.0f, 1.0f, 1.0f) * 0.5f;
    }
    
    @Override
    public void draw(final float n) {
        if (this.field20990.calcPercent() != 0.0f) {
            final int n2 = this.field20992 + 60;
            final int n3 = this.field20993 + 60;
            final float n4 = this.isHovered() ? Math.min(this.field20990.calcPercent() / 0.25f, 1.0f) : this.field20990.calcPercent();
            final float method14743 = this.method14743(this.field20990.calcPercent(), 1.0f);
            final int n5 = (int)(n2 * method14743);
            final int n6 = (int)(n3 * method14743);
            RenderUtil.method26898(-5.0f, -5.0f, (float)(this.method14276() + 10), (float)(this.method14278() + 10), this.field20989, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4));
            RenderUtil.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.1f * n4));
            if (n5 > 0) {
                RenderUtil.method26915((this.field20480 - n5) / 2, (this.field20481 - n6) / 2, n5, n6, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n4));
            }
            super.method14288(method14743, method14743);
            super.method14227();
            super.draw(n4);
            return;
        }
        if (this.method14306()) {
            this.method14307(false);
            this.setEnabled(false);
            this.method14252();
        }
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (!super.method14211(n, n2, n3)) {
            final int n4 = this.field20992 + 60;
            final int n5 = this.field20993 + 60;
            if (n > (this.field20480 - n4) / 2) {
                if (n < (this.field20480 - n4) / 2 + n4) {
                    if (n2 > (this.field20481 - n5) / 2) {
                        if (n2 < (this.field20481 - n5) / 2 + n5) {
                            return false;
                        }
                    }
                }
            }
            this.method14744(false);
            return false;
        }
        return true;
    }
    
    public void method14744(final boolean b) {
        if (b && !this.isHovered()) {
            try {
                if (this.field20989 != null) {
                    this.field20989.release();
                }
                this.field20989 = BufferedImageUtil.getTexture("blur", ImageUtil.method20830(0, 0, this.method14276(), this.method14278(), 5, 10, ClientColors.LIGHT_GREYISH_BLUE.color, true));
            }
            catch (final IOException ex) {
                Client.getInstance().getLogger().error(ex.getMessage());
            }
        }
        if (this.isHovered() != b && !b) {
            this.method14746();
        }
        this.method14305(b);
        if (b) {
            this.setEnabled(true);
        }
        this.method14301(b);
    }
    
    protected void finalize() throws Throwable {
        try {
            if (this.field20989 != null) {
                Client.getInstance().addTexture(this.field20989);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public final void method14745(final Class8214 class8214) {
        this.field20995.add(class8214);
    }
    
    public final void method14746() {
        final Iterator<Class8214> iterator = this.field20995.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27215(this);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4850 extends Class4841
{
    private List<Class4868> field20785;
    private final int field20786;
    private final Animation field20787;
    private boolean field20788;
    private final List<Class9031> field20789;
    private final List<Class5257> field20790;
    
    public Class4850(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int field20786, final String s2) {
        super(customGuiScreen, s, n - 125, n2, 250, 330, ColorHelper.field25964, s2, false);
        this.field20785 = new ArrayList<Class4868>();
        this.field20788 = false;
        this.field20789 = new ArrayList<Class9031>();
        this.field20790 = new ArrayList<Class5257>();
        if (this.y + this.field20481 <= Minecraft.getInstance().window.method7695()) {
            this.y += 10;
        }
        else {
            this.y -= 400;
            this.field20788 = true;
        }
        this.field20786 = field20786;
        this.field20787 = new Animation(250, 0);
        this.method14301(true);
        this.setListening(false);
        this.method14549();
        final UIButton class4804;
        this.addToList(class4804 = new UIButton(this, "addButton", this.field20480 - 70, this.field20481 - 70, ClientFonts.JelloLight25.getWidth("Add"), 70, ColorHelper.field25964, "Add", ClientFonts.JelloLight25));
        class4804.doThis((class4803, n) -> this.method14551());
    }
    
    public void method14548() {
        this.method14553();
    }
    
    public void method14549() {
        int n = 1;
        final ArrayList list = new ArrayList();
        for (final CustomGuiScreen customGuiScreen : this.method14250()) {
            if (customGuiScreen.method14278() == 0) {
                continue;
            }
            list.add(customGuiScreen.method14266());
        }
        this.method14251();
        this.method14307(true);
        this.method14247();
        for (final Class8799 class4804 : Class4940.method14874()) {
            if (class4804.method30705() != this.field20786) {
                continue;
            }
            final Class4896 class4805;
            this.addToList(class4805 = new Class4896(this, class4804.method30702(), 0, 20 + 55 * n, this.field20480, 55, class4804, n++));
            class4805.method14516(class8800 -> {
                class4804.method30704(0);
                this.method14517();
            });
            if (list.size() <= 0) {
                continue;
            }
            if (list.contains(class4804.method30702())) {
                continue;
            }
            class4805.method14703();
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final HashMap hashMap = new HashMap();
        for (final CustomGuiScreen customGuiScreen : this.method14250()) {
            if (!(customGuiScreen instanceof Class4896)) {
                continue;
            }
            final Class4896 value = (Class4896) customGuiScreen;
            hashMap.put(value.field20940, value);
        }
        int n3 = 75;
        for (final Map.Entry<K, Class4896> entry : hashMap.entrySet()) {
            entry.getValue().method14275(n3);
            n3 += entry.getValue().method14278();
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(float method35858) {
        method35858 = this.field20787.calcPercent();
        final float method35859 = Class7707.method24584(method35858, 0.0f, 1.0f, 1.0f);
        this.method14288(0.8f + method35859 * 0.2f, 0.8f + method35859 * 0.2f);
        this.method14293((int)(this.field20480 * 0.2f * (1.0f - method35859)) * (this.field20788 ? -1 : 1));
        super.method14227();
        final int n = 10;
        final int method35860 = ColorUtils.applyAlpha(-723724, Class7791.method25030(method35858, 0.0f, 1.0f, 1.0f));
        RenderUtil.method26913((float)(this.x + n / 2), (float)(this.y + n / 2), (float)(this.field20480 - n), (float)(this.field20481 - n), 35.0f, method35858);
        RenderUtil.method26876((float)(this.x + n / 2), (float)(this.y + n / 2), (float)(this.x - n / 2 + this.field20480), (float)(this.y - n / 2 + this.field20481), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, method35858 * 0.25f));
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, (float)n, method35860);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.x, (float)this.y, 0.0f);
        GL11.glRotatef(this.field20788 ? 90.0f : -90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-this.x), (float)(-this.y), 0.0f);
        RenderUtil.drawImage((float)(this.x + (this.field20788 ? this.field20481 : 0)), this.y + (this.field20480 - 47) / 2 * (this.field20788 ? -1.5f : 1.0f), 18.0f, 47.0f, ClientAssets.select, method35860);
        GL11.glPopMatrix();
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)(this.x + 25), (float)(this.y + 20), this.field20495 + " Key", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.8f * method35858));
        RenderUtil.method26876((float)(this.x + 25), (float)(this.y + 68), (float)(this.x + this.field20480 - 25), (float)(this.y + 69), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.05f * method35858));
        super.draw(method35858);
    }
    
    public final void method14550(final Class9031 class9031) {
        this.field20789.add(class9031);
    }
    
    public final void method14551() {
        final Iterator<Class9031> iterator = this.field20789.iterator();
        while (iterator.hasNext()) {
            iterator.next().method32432(this);
        }
    }
    
    public final void method14552(final Class5257 class5257) {
        this.field20790.add(class5257);
    }
    
    public final void method14553() {
        final Iterator<Class5257> iterator = this.field20790.iterator();
        while (iterator.hasNext()) {
            iterator.next().method16375(this);
        }
    }
}

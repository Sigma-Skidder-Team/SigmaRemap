// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.Module;

import java.util.ArrayList;

public class Class4899 extends Class4841
{
    public TextField field20954;
    public String field20955;
    
    public Class4899(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        super(customGuiScreen, s, n, n2, n3, n4, b);
        this.addToList(this.field20954 = new TextField(this, "search", 50, 0, n3 - 60, n4 - 2, TextField.field20670, "", "Search..."));
        this.field20954.method14478(false);
        this.field20954.method14473(class4831 -> this.field20955 = this.field20954.getTypedText());
    }
    
    @Override
    public void draw(final float n) {
        this.field20954.method14307(true);
        final int n2 = 10;
        RenderUtil.method26913((float)(this.x + n2 / 2), (float)(this.y + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 9.0f, n * 0.9f);
        RenderUtil.method26913((float)(this.x + n2 / 2), (float)(this.y + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 30.0f, n * 0.4f);
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, (float)n2, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.97f));
        RenderUtil.drawImage((float)(this.x + 20), (float)(this.y + 20), 20.0f, 20.0f, ClientAssets.search, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f));
        final ArrayList<Module> method14713 = this.method14713();
        if (method14713.size() > 0) {
            if (this.method14715(this.field20955, method14713.get(0).getName())) {
                RenderUtil.drawString(this.field20954.method14316(), (float)(this.x + 54), (float)(this.y + 14), this.field20955 + method14713.get(0).getName().substring(this.field20955.length(), method14713.get(0).getName().length()) + (method14713.get(0).isEnabled() ? " - Enabled" : " - Disabled"), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.25f));
            }
        }
        super.draw(n);
    }
    
    public ArrayList<Module> method14713() {
        final ArrayList list = new ArrayList();
        if (this.field20955 != null && this.field20955.length() != 0) {
            for (final Module e : Client.getInstance().moduleManager().getModuleMap().values()) {
                if (!this.method14715(this.field20955, e.getName())) {
                    continue;
                }
                list.add(e);
            }
            return list;
        }
        return list;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 257) {
            final ArrayList<Module> method14713 = this.method14713();
            if (method14713.size() > 0) {
                method14713.get(0).method9910();
            }
            Minecraft.getInstance().displayGuiScreen(null);
        }
    }
    
    private boolean method14714(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().contains(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    private boolean method14715(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().startsWith(s.toLowerCase());
                }
            }
        }
        return true;
    }
}

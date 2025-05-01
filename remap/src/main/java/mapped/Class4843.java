// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4843 extends Panel
{
    private final List<Class4868> field20750;
    public int field20751;
    public Class4901 field20752;
    public Class4818 field20753;
    public int field20754;
    private final List<Class8383> field20755;
    
    public Class4843(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20750 = new ArrayList<Class4868>();
        this.field20755 = new ArrayList<Class8383>();
        this.field20754 = 260;
        this.addToList(this.field20753 = new Class4818(this, "waypointList", 0, 65, this.field20754, this.field20481 - 65));
        for (final Class8124 class4804 : Client.getInstance().getWaypointManager().method24262()) {
            this.field20753.method14398(class4804.field33468, new Vec3i(class4804.field33469, 64, class4804.field33470), class4804.field33471);
        }
        this.addToList(this.field20752 = new Class4901(this, "mapFrame", this.field20754, 0, this.field20480 - this.field20754, this.field20481));
        this.setListening(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            Client.getInstance().getWaypointManager().field30406.clear();
        }
    }
    
    @Override
    public void draw(final float partialTicks) {
        final int n2 = 14;
        RenderUtil.method26913((float)(this.x + n2 / 2), (float)(this.y + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 20.0f, partialTicks * 0.9f);
        float n3 = 0.88f;
        if (!Client.getInstance().getScreenManager().method32144()) {
            n3 = 0.95f;
        }
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 14.0f, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n3));
        RenderUtil.method26924((float)(this.x + this.field20754), (float)this.y, (float)(this.field20480 - this.field20754), (float)this.field20481, 14.0f, -7687425);
        RenderUtil.method26926();
        RenderUtil.method26924((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 14.0f, ClientColors.LIGHT_GREYISH_BLUE.color);
        RenderUtil.method26927(Class2225.field13694);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20753.draw(partialTicks);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20752.draw(partialTicks);
        GL11.glPopMatrix();
        RenderUtil.method26928();
        RenderUtil.method26874((float)(this.x + this.field20754), (float)(this.y), 1.0f, (float)this.field20481, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.14f));
        AllUtils.applyAlpha(AllUtils.method19121(-7687425, 0.2f), 0.8f);
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)(this.x + 30), (float)(this.y + 25), "Waypoints", AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.6f));
        RenderUtil.drawString(ClientFonts.JelloMedium40, (float)this.x, (float)((this.field20475.method14278() - this.field20481) / 2 - 70), "Jello Maps", ClientColors.LIGHT_GREYISH_BLUE.color);
        final String replace = Client.getInstance().getWaypointManager().method24271().replace("/", " - ");
        RenderUtil.drawString(ClientFonts.JelloLight24, (float)(this.x + this.field20480 - ClientFonts.JelloLight24.getWidth(replace) - 10), (float)((this.field20475.method14278() - this.field20481) / 2 - 62), replace, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f));
    }
    
    public final void method14520(final Class8383 class8383) {
        this.field20755.add(class8383);
    }
    
    public final void method14521(final int n, final int n2, final Class1941 class1941) {
        final Iterator<Class8383> iterator = this.field20755.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27939(this, n, n2, class1941);
        }
    }
}

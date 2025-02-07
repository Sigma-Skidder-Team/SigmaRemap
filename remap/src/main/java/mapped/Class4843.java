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

public class Class4843 extends Class4841
{
    private List<Class4868> field20750;
    public int field20751;
    public Class4901 field20752;
    public Class4818 field20753;
    public int field20754;
    private final List<Class8383> field20755;
    
    public Class4843(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20750 = new ArrayList<Class4868>();
        this.field20755 = new ArrayList<Class8383>();
        this.field20754 = 260;
        this.addVisualThing(this.field20753 = new Class4818(this, "waypointList", 0, 65, this.field20754, this.field20481 - 65));
        for (final Class8124 class4804 : Client.getInstance().method35200().method24262()) {
            this.field20753.method14398(class4804.field33468, new Vec3i(class4804.field33469, 64, class4804.field33470), class4804.field33471);
        }
        this.addVisualThing(this.field20752 = new Class4901(this, "mapFrame", this.field20754, 0, this.field20480 - this.field20754, this.field20481));
        this.method14311(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            Client.getInstance().method35200().field30406.clear();
        }
    }
    
    @Override
    public void draw(final float n) {
        final int n2 = 14;
        RenderUtil.method26913((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 20.0f, n * 0.9f);
        float n3 = 0.88f;
        if (!Client.getInstance().getGuimanager().method32144()) {
            n3 = 0.95f;
        }
        RenderUtil.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n3));
        RenderUtil.method26924((float)(this.field20478 + this.field20754), (float)this.field20479, (float)(this.field20480 - this.field20754), (float)this.field20481, 14.0f, -7687425);
        RenderUtil.method26926();
        RenderUtil.method26924((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, ClientColors.LIGHT_GREYISH_BLUE.color);
        RenderUtil.method26927(Class2225.field13694);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20753.draw(n);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20752.draw(n);
        GL11.glPopMatrix();
        RenderUtil.method26928();
        RenderUtil.method26874((float)(this.field20478 + this.field20754), (float)(this.field20479 + 0), 1.0f, (float)this.field20481, ColorUtils.applyAlpha(ClientColors.field1273.color, 0.14f));
        ColorUtils.applyAlpha(ColorUtils.method19121(-7687425, 0.2f), 0.8f);
        RenderUtil.drawString(ClientFonts.JelloLight25, (float)(this.field20478 + 30), (float)(this.field20479 + 25), "Waypoints", ColorUtils.applyAlpha(ClientColors.field1273.color, 0.6f));
        RenderUtil.drawString(ClientFonts.JelloMedium40, (float)this.field20478, (float)((this.field20475.method14278() - this.field20481) / 2 - 70), "Jello Maps", ClientColors.LIGHT_GREYISH_BLUE.color);
        final String replace = Client.getInstance().method35200().method24271().replace("/", " - ");
        RenderUtil.drawString(ClientFonts.JelloLight24, (float)(this.field20478 + this.field20480 - ClientFonts.JelloLight24.getWidth(replace) - 10), (float)((this.field20475.method14278() - this.field20481) / 2 - 62), replace, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f));
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

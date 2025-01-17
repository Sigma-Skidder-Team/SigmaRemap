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
        for (final Class8124 class4804 : Client.method35173().method35200().method24262()) {
            this.field20753.method14398(class4804.field33468, new Vec3i(class4804.field33469, 64, class4804.field33470), class4804.field33471);
        }
        this.addVisualThing(this.field20752 = new Class4901(this, "mapFrame", this.field20754, 0, this.field20480 - this.field20754, this.field20481));
        this.method14311(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            Client.method35173().method35200().field30406.clear();
        }
    }
    
    @Override
    public void method14205(final float n) {
        final int n2 = 14;
        Class8154.method26913((float)(this.field20478 + n2 / 2), (float)(this.field20479 + n2 / 2), (float)(this.field20480 - n2), (float)(this.field20481 - n2), 20.0f, n * 0.9f);
        float n3 = 0.88f;
        if (!Client.method35173().method35193().method32144()) {
            n3 = 0.95f;
        }
        Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, Class6430.method19118(Class265.field1278.field1292, n3));
        Class8154.method26924((float)(this.field20478 + this.field20754), (float)this.field20479, (float)(this.field20480 - this.field20754), (float)this.field20481, 14.0f, -7687425);
        Class8154.method26926();
        Class8154.method26924((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, Class265.field1278.field1292);
        Class8154.method26927(Class2225.field13694);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20753.method14205(n);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)this.method14272(), (float)this.method14274(), 0.0f);
        this.field20752.method14205(n);
        GL11.glPopMatrix();
        Class8154.method26928();
        Class8154.method26874((float)(this.field20478 + this.field20754), (float)(this.field20479 + 0), 1.0f, (float)this.field20481, Class6430.method19118(Class265.field1273.field1292, 0.14f));
        Class6430.method19118(Class6430.method19121(-7687425, 0.2f), 0.8f);
        Class8154.method26889(ClientFonts.JelloLight25, (float)(this.field20478 + 30), (float)(this.field20479 + 25), "Waypoints", Class6430.method19118(Class265.field1273.field1292, 0.6f));
        Class8154.method26889(ClientFonts.JelloMedium40, (float)this.field20478, (float)((this.field20475.method14278() - this.field20481) / 2 - 70), "Jello Maps", Class265.field1278.field1292);
        final String replace = Client.method35173().method35200().method24271().replace("/", " - ");
        Class8154.method26889(ClientFonts.JelloLight24, (float)(this.field20478 + this.field20480 - ClientFonts.JelloLight24.getWidth(replace) - 10), (float)((this.field20475.method14278() - this.field20481) / 2 - 62), replace, Class6430.method19118(Class265.field1278.field1292, 0.5f));
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

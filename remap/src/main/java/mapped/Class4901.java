// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.mentalfrostbyte.Client;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.List;

public class Class4901 extends Class4841
{
    private List<Class4868> field20957;
    public int field20958;
    public Class4847 field20959;
    public ChunkPos field20960;
    public int field20961;
    public float field20962;
    public float field20963;
    public int field20964;
    public int field20965;
    public Class7666 field20966;
    public int field20967;
    public float field20968;
    public float field20969;
    public ChunkPos field20970;
    private final List<Class8058> field20971;
    private final List<Class8345> field20972;
    
    public Class4901(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20957 = new ArrayList<Class4868>();
        this.field20961 = 8;
        this.field20962 = 0.0f;
        this.field20963 = 0.0f;
        this.field20971 = new ArrayList<Class8058>();
        this.field20972 = new ArrayList<Class8345>();
        final int n5 = 90;
        final int n6 = 40;
        this.method14239(this.field20959 = new Class4847(this, "zoom", n3 - n6 - 10, n4 - n5 - 10, n6, n5));
        this.field20960 = Minecraft.method5277().world.method6965(Minecraft.method5277().player.method1894()).method7019();
        this.method14311(false);
    }
    
    public void method14717(final boolean b) {
        this.field20961 = Math.max(3, Math.min(33, b ? (this.field20961 - 1) : (this.field20961 + 1)));
        this.method14722();
    }
    
    @Override
    public void method14200(final int field20964, final int field20965) {
        super.method14200(field20964, field20965);
        if (this.field20492) {
            final int n = field20964 - this.field20964;
            final int n2 = field20965 - this.field20965;
            final float n3 = this.field20480 / (this.field20961 * 2.0f * ((this.field20961 - 1.0f) / this.field20961));
            this.field20963 += n / n3;
            this.field20962 += n2 / n3;
        }
        this.field20964 = field20964;
        this.field20965 = field20965;
    }
    
    public void method14718(final int n, final int n2) {
        this.field20960 = new ChunkPos(n / 16, n2 / 16);
        this.field20963 = -0.5f;
        this.field20962 = -0.5f;
        this.field20959.field20770 = true;
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (this.method14308() && n3 == 1) {
            final int max = Math.max(this.field20480, this.field20481);
            final float n4 = (this.field20480 - max) / 2.0f;
            final float n5 = n - (this.method14280() + (this.field20481 - max) / 2.0f + max / 2);
            final float n6 = Minecraft.method5277().field4632.method7695() - n2 - (this.method14281() + n4 + max / 2);
            final float n7 = max / ((this.field20961 - 1) * 2.0f);
            final float n8 = this.field20960.field32290 * 16 - this.field20963 * 16.0f;
            final float n9 = this.field20960.field32291 * 16 - this.field20962 * 16.0f;
            final float a = n8 + n5 / n7 * 16.0f;
            final float a2 = n9 - n6 / n7 * 16.0f;
            System.out.println(n6 / n7 + " : " + n5 / n7);
            this.method14720(n, n2, new Vec3i(Math.round(a), 0, Math.round(a2)));
            return false;
        }
        this.method14722();
        return super.method14211(n, n2, n3);
    }
    
    @Override
    public void method14235(final float n) {
        super.method14235(n);
        if (this.method14308()) {
            this.field20961 = Math.round(Math.max(3.0f, Math.min(33.0f, this.field20961 + n / 10.0f)));
            this.method14722();
        }
    }
    
    @Override
    public void method14205(final float n) {
        final Minecraft method5277 = Minecraft.method5277();
        final ChunkPos class7859;
        final ChunkPos field20970 = class7859 = new ChunkPos(this.field20960.field32290, this.field20960.field32291);
        class7859.field32290 -= (int)Math.floor(this.field20963);
        final ChunkPos class7860 = field20970;
        class7860.field32291 -= (int)Math.floor(this.field20962);
        if (n != 1.0f) {
            this.field20959.field20770 = true;
        }
        Label_0145: {
            if (this.field20966 != null) {
                if (this.field20961 == this.field20967) {
                    if (this.field20970.equals(field20970)) {
                        break Label_0145;
                    }
                }
            }
            this.field20966 = Client.method35173().method35200().method24276(field20970, this.field20961 * 2);
        }
        Label_0211: {
            if (this.field20966 != null) {
                if (this.field20961 == this.field20967) {
                    if (this.field20963 == this.field20969) {
                        if (this.field20962 == this.field20968) {
                            break Label_0211;
                        }
                    }
                }
            }
            this.field20959.field20770 = true;
        }
        final int max = Math.max(this.field20480, this.field20481);
        final int n2 = (this.field20480 - max) / 2;
        final int n3 = (this.field20481 - max) / 2;
        final float n4 = this.field20961 / (this.field20961 - 1.0f);
        final float n5 = max / (this.field20961 * 2.0f);
        final double n6 = (this.field20962 - Math.floor(this.field20962)) * n5;
        final double n7 = (this.field20963 - Math.floor(this.field20963)) * n5;
        final Class1663 method5278 = method5277.method5290();
        method5277.method5290();
        method5278.method5849(Class1663.field9428);
        Class8154.method26871(this.field20478, this.field20479, this.field20478 + this.field20480, this.field20479 + this.field20481, true);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), 0.0f);
        GL11.glScalef(n4, n4, 0.0f);
        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-this.field20478 - this.field20480 / 2), (float)(-this.field20479 - this.field20481 / 2), 0.0f);
        GL11.glTranslated(-n6, n7, 0.0);
        Class8154.method26903((float)(this.field20478 + n2), (float)(this.field20479 + n3), (float)max, (float)max, this.field20966.field30451, Class265.field1278.field1292, 0.0f, 0.0f, (float)this.field20966.field30449, (float)this.field20966.field30450, true, false);
        GL11.glPopMatrix();
        for (final Class8124 class7861 : Client.method35173().method35200().method24262()) {
            final float n8 = this.field20960.field32290 * 16 - this.field20963 * 16.0f;
            final float n9 = this.field20960.field32291 * 16 - this.field20962 * 16.0f;
            final float n10 = class7861.field33469 - n8 + 1.0f;
            final float n11 = class7861.field33470 - n9 + 1.0f;
            final float n12 = max / ((this.field20961 - 1) * 2.0f);
            Class8154.method26899((float)(this.field20478 + Math.round(n10 * n12 / 16.0f) + this.field20480 / 2 - 16), (float)(this.field20479 + Math.round(n11 * n12 / 16.0f) + this.field20481 / 2 - 42), 32.0f, 46.0f, ClientAssets.waypoint, class7861.field33471);
        }
        Class8154.method26872();
        final String string = Math.round(this.field20960.field32290 * 16 - this.field20963 * 16.0f) + "  " + Math.round(this.field20960.field32291 * 16 - this.field20962 * 16.0f);
        Class8154.method26889(ClientFonts.JelloLight14, (float)(this.field20478 - ClientFonts.JelloLight14.getWidth(string) - 23), (float)(this.field20479 + 35), string, Class6430.method19118(Class265.field1273.field1292, 0.4f));
        this.field20968 = this.field20962;
        this.field20969 = this.field20963;
        this.field20967 = this.field20961;
        this.field20970 = field20970;
        super.method14205(n);
    }
    
    public final void method14719(final Class8058 class8058) {
        this.field20971.add(class8058);
    }
    
    public final void method14720(final int n, final int n2, final Vec3i class352) {
        final Iterator<Class8058> iterator = this.field20971.iterator();
        while (iterator.hasNext()) {
            iterator.next().method26437(this, n, n2, class352);
        }
    }
    
    public final void method14721(final Class8345 class8345) {
        this.field20972.add(class8345);
    }
    
    public final void method14722() {
        final Iterator<Class8345> iterator = this.field20972.iterator();
        while (iterator.hasNext()) {
            iterator.next().method27813(this);
        }
    }
}

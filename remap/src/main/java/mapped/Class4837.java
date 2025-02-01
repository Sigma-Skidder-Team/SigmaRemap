// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import com.mojang.authlib.GameProfile;

import java.util.UUID;

import net.minecraft.world.dimension.DimensionType;
import org.lwjgl.opengl.GL11;

public class Class4837 extends Class4825
{
    public static Class6523 field20733;
    public String field20734;
    private PlayerEntity field20735;
    private Minecraft field20736;
    private static Class1848 field20737;
    public Class7971 field20738;
    private Class1773 field20739;
    private Class758 field20740;
    
    public Class4837(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String field20734) {
        super(class4803, s, n, n2, n3, n4, Class4837.field20733, false);
        this.field20734 = null;
        this.field20736 = Minecraft.method5277();
        this.field20734 = field20734;
    }
    
    @Override
    public void draw(final float n) {
        if (this.field20738 == null) {
            return;
        }
        GL11.glEnable(2929);
        Class8317.method27608();
        RenderSystem.disableDepthTest();
        RenderSystem.method30029();
        RenderSystem.method30059();
        RenderSystem.method30065((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 - this.field20481 / 4), -200.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        RenderSystem.method30062(180.0f, 1.0f, 0.0f, 0.0f);
        RenderSystem.method30062(180.0f, 0.0f, 0.0f, 1.0f);
        final float n2 = (float)(this.field20736.field4632.method7695() - this.method14321() - this.field20736.field4632.method7695() / 2);
        final float n3 = (float)(this.field20736.field4632.method7694() - this.method14320() - this.field20736.field4632.method7694() / 2);
        final float n4 = (float)Math.atan(n2 / (this.field20736.field4632.method7695() / 2)) * 20.0f;
        final float n5 = (float)Math.atan(n3 / (this.field20736.field4632.method7694() / 2)) * 20.0f;
        RenderSystem.method30062(-n4, 1.0f, 0.0f, 0.0f);
        RenderSystem.method30062(-n5, 0.0f, 1.0f, 0.0f);
        final Class9206 class9206 = new Class9206(this);
        final UUID fromString = UUID.fromString(this.field20738.method25891().equals("steve") ? "123e4567-e89b-12d3-a456-556642440000" : this.field20738.method25891());
        if (Class4837.field20737 == null) {
            Class4837.field20737 = new Class1848(this.field20736.method5269(), new Class8511(1L, Class101.field299, false, false, Class9505.field40893), DimensionType.field2223, 1, new Class5030(0L, class9206, false), null);
        }
        if (this.field20740 == null) {
            this.field20740 = new Class758(Class4837.field20737, new GameProfile(fromString, this.field20738.method25889()));
        }
        this.field20740.method1864(fromString);
        if (this.field20735 == null) {
            this.field20735 = new Class755(Class4837.field20737, new GameProfile(fromString, this.field20738.method25889()));
        }
        final ResourceLocation method4102 = Class754.method4102(this.field20738.method25889());
        if (this.field20739 != null && this.field20736.method5290().method5853(method4102) != null) {
            this.field20736.method5290().method5849(method4102);
        }
        else {
            this.field20736.method5290().method5849(Class7634.method24004(fromString));
        }
        final float n6 = (float)Math.sin(System.currentTimeMillis() % 1750L / 278.52115f);
        final float n7 = (float)Math.sin(System.currentTimeMillis() % 14000L / 2228.1692f);
        final float n8 = (float)Math.sin(System.currentTimeMillis() % 30000L / 4774.648f);
        final Class5860 class9207 = new Class5860(0.0f, false);
        if (this.field20738 != null) {
            final Class4711 class9208 = new Class4711(this.field20736.method5306());
            Minecraft.method5277().method5333().method11006();
            final MatrixStack class9209 = new MatrixStack();
            RenderSystem.method30059();
            this.field20736.method5306().method28702(false);
            Class8317.method27612();
            RenderSystem.method30001();
            RenderSystem.enableDepthTest();
            if (this.field20736.method5306().field35906 == null) {
                this.field20736.method5306().field35906 = new Class6092();
            }
            this.field20740.field2946 = n6 * 0.5f;
            Class518.method2999(0, 390, 160, 0.0f, 0.0f, this.field20740);
            this.field20736.method5306().method28702(true);
            RenderSystem.method30060();
        }
        RenderSystem.method30060();
        Class8317.method27609();
        RenderSystem.disableRescaleNormal();
        RenderSystem.method30039(33985);
        RenderSystem.disableTexture();
        RenderSystem.method30039(33984);
        GL11.glDisable(2929);
        if (this.field20738.method25900() != null) {
            try {
                Class9399.method34928("sf", this.field20738.method25900());
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void method14512(final Class7971 field20738) {
        this.field20738 = field20738;
        this.field20739 = null;
    }
    
    static {
        Class4837.field20733 = new Class6523(ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, Class2056.field11734, Class2056.field11738);
    }
}

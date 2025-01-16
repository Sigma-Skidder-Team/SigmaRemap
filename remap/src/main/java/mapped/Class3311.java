// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class3311 extends Class3167
{
    private List<Class3167> field15890;
    public int field15891;
    public int field15892;
    public HashMap<Class3167, Class9572> field15893;
    public Class7524 field15894;
    
    public Class3311() {
        super(Class8013.field32991, "ActiveMods", "Renders active mods");
        this.field15890 = new ArrayList<Class3167>();
        this.field15891 = 0;
        this.field15893 = new HashMap<Class3167, Class9572>();
        this.field15894 = Class9400.field40313;
        this.method9881(new Class5001("Size", "The font size", 0, new String[] { "Normal", "Small", "Tiny" }));
        this.method9881(new Class4999("Animations", "Scale in animation", true));
        this.method9881(new Class4999("Sound", "Toggle sound", true));
        this.method9899().get("Size").method15195(class4997 -> this.method10476());
        this.method9915(false);
    }
    
    @Override
    public void method9879() {
        this.method10476();
    }
    
    public void method10476() {
        final String method9887 = this.method9887("Size");
        switch (method9887) {
            case "Normal": {
                this.field15894 = Class9400.field40313;
                break;
            }
            case "Small": {
                this.field15894 = Class9400.field40312;
                break;
            }
            default: {
                this.field15894 = Class9400.field40311;
                break;
            }
        }
    }
    
    @Override
    public void method9917() {
        this.field15890.clear();
        for (final Class3167 class3167 : Class9463.method35173().method35189().method21553().values()) {
            if (class3167.method9903() != Class8013.field32991) {
                this.field15890.add(class3167);
                this.field15893.put(class3167, new Class9572(150, 150, Class2186.field12965));
                if (!this.method9883("Animations")) {
                    continue;
                }
                this.field15893.get(class3167).method35855(class3167.method9906() ? Class2186.field12964 : Class2186.field12965);
            }
        }
        Collections.sort(this.field15890, new Class4466(this));
    }
    
    @Class6753
    private void method10477(final Class5726 class5726) {
        if (this.method9906() && Class3311.field15514.field4684 != null) {
            if (!class5726.method17000()) {
                Class8933.method31642(0.0f, (float)(-this.field15892), 0.0f);
            }
            else {
                final Class6516 method6782 = Class3311.field15514.world.method6782();
                Class9290 method6783 = null;
                final Class6749 method6784 = method6782.method19651(Class3311.field15514.field4684.method1867());
                if (method6784 != null) {
                    final int method6785 = method6784.getColor().getColorIndex();
                    if (method6785 >= 0) {
                        method6783 = method6782.method19644(3 + method6785);
                    }
                }
                final Collection<Class7628> method6786 = method6782.method19637((method6783 == null) ? method6782.method19644(1) : method6783);
                int n = 0;
                final Iterator<Class3167> iterator = this.field15890.iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().method9906()) {
                        continue;
                    }
                    ++n;
                }
                final int n2 = 23 + n * (this.field15894.method23539() + 1);
                final int size = method6786.size();
                final int n3 = Minecraft.method5277().field4632.method7695() / 2;
                Class3311.field15514.fontRenderer.getClass();
                final int n4 = n3 - (9 + 5) * (size - 3 + 2);
                if (n2 <= n4) {
                    this.field15892 = 0;
                }
                else {
                    this.field15892 = (n2 - n4) / 2;
                    Class8933.method31642(0.0f, (float)this.field15892, 0.0f);
                }
            }
        }
    }
    
    @Class6753
    private void method10478(final Class5740 class5740) {
        if (!this.method9906() || Class3311.field15514.field4684 == null) {
            return;
        }
        for (final Class3167 key : this.field15893.keySet()) {
            if (!this.method9883("Animations")) {
                continue;
            }
            this.field15893.get(key).method35855(key.method9906() ? Class2186.field12964 : Class2186.field12965);
        }
        if (!Minecraft.method5277().field4648.field23464) {
            int n = 10;
            final int n2 = 1;
            final int method7694 = Minecraft.method5277().field4632.method7694();
            final Class7524 field15894 = this.field15894;
            int field15895 = n - 4;
            if (this.field15894 == Class9400.field40311) {
                n -= 3;
            }
            if (Minecraft.method5277().field4648.field23466) {
                field15895 = (int)(Class3311.field15514.field4647.field3763.field3801.size() * 9 * Class3311.field15514.field4632.method7700() + 7.0);
            }
            int n3 = 0;
            final int method7695 = Class6430.method19118(-1, 0.95f);
            for (final Class3167 key2 : this.field15890) {
                float n4 = 1.0f;
                float method7696 = 1.0f;
                if (!this.method9883("Animations")) {
                    if (!key2.method9906()) {
                        continue;
                    }
                }
                else {
                    final Class9572 class5741 = this.field15893.get(key2);
                    if (class5741.method35858() == 0.0f) {
                        continue;
                    }
                    method7696 = class5741.method35858();
                    n4 = 0.86f + 0.14f * method7696;
                }
                final String method7697 = key2.method9900();
                GL11.glAlphaFunc(519, 0.0f);
                GL11.glPushMatrix();
                final int n5 = method7694 - n - field15894.method23505(method7697) / 2;
                final int n6 = field15895 + 12;
                GL11.glTranslatef((float)n5, (float)n6, 0.0f);
                GL11.glScalef(n4, n4, 1.0f);
                GL11.glTranslatef((float)(-n5), (float)(-n6), 0.0f);
                Class8154.method26899(method7694 - field15894.method23505(method7697) * 1.5f - n - 20.0f, (float)(field15895 - 20), field15894.method23505(method7697) * 3.0f, (float)(field15894.method23539() + n2 + 40), Class7853.field32200, Class6430.method19118(Class265.field1278.field1292, 0.36f * method7696 * (float)Math.sqrt(Math.min(1.2f, field15894.method23505(method7697) / 63.0f))));
                Class8154.method26889(field15894, (float)(method7694 - n - field15894.method23505(method7697)), (float)field15895, method7697, (method7696 != 1.0f) ? Class6430.method19118(-1, method7696 * 0.95f) : method7695);
                GL11.glPopMatrix();
                n3 -= 100;
                field15895 += (int)((field15894.method23539() + n2) * Class7791.method25031(method7696, 0.0f, 1.0f, 1.0f));
            }
            this.field15891 = field15895;
        }
    }
    
    public int method10479() {
        return this.field15891;
    }
    
    private Color method10480(final int n, final int n2, final Color color) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3);
        GL11.glPixelStorei(3317, 1);
        GL11.glReadPixels(n, Minecraft.method5277().field4632.method7695() - n2, 1, 1, 6407, 5120, allocateDirect);
        Color method19109 = new Color(allocateDirect.get(0) * 2, allocateDirect.get(1) * 2, allocateDirect.get(2) * 2, 1);
        if (color != null) {
            method19109 = Class6430.method19109(method19109, color, 0.08f);
        }
        return method19109;
    }
}

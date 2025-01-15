// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import java.util.Map;
import java.awt.Color;
import java.util.Comparator;
import java.util.TreeMap;

public class Class3315 extends Class3167
{
    private TreeMap<Class3167, Class9572> field15896;
    private Class7524 field15897;
    private Class7524 field15898;
    private Class9572 field15899;
    
    public Class3315() {
        super(Class8013.field32984, "ActiveMods", "Shows active mods");
        this.field15896 = new TreeMap<Class3167, Class9572>();
        this.method9881(new Class5001("Outline", "Outline", 0, new String[] { "All", "Left", "Right", "None" }));
        this.method9881(new Class5001("Animation", "Animation", 0, new String[] { "Smooth", "Slide", "Both", "None" }));
        this.method9881(new Class4999("Sound", "Toggle sound", true));
    }
    
    @Override
    public void method9917() {
        this.method10487();
        this.method10486();
    }
    
    private void method10486() {
        this.field15899 = new Class9572(2000, 2000, Class2186.field12964);
    }
    
    private void method10487() {
        this.field15896.clear();
        this.field15897 = Class9493.field40812;
        this.field15898 = Class9493.field40813;
        this.field15896 = new TreeMap<Class3167, Class9572>(new Class4462(this));
    }
    
    @Class6753
    private void method10488(final Class5740 class5740) {
        if (this.method9906() && Class3315.field15514.field4684 != null) {
            final String method9887 = this.method9887("Animation");
            final String method9888 = this.method9887("Outline");
            this.method10489();
            if (this.field15899.method35858() == 1.0f) {
                this.field15899.method35856(0.0f);
            }
            int n = -2;
            final int n2 = Class869.method5277().field4632.method7694() - 2;
            final int n3 = -2;
            new Color(0, 192, 255, 255).getRGB();
            int n4 = new Color(0, 192, 255, 255).getRGB();
            int n5 = -7;
            float method9889 = this.field15899.method35858();
            for (final Map.Entry<K, Class9572> entry : this.field15896.entrySet()) {
                final Class9572 class5741 = entry.getValue();
                final Class3167 class5742 = (Class3167)entry.getKey();
                if (!class5742.method9906()) {
                    if (class5741.method35858() == 1.0f) {
                        continue;
                    }
                    if (method9887.equalsIgnoreCase("None")) {
                        continue;
                    }
                }
                final int hsBtoRGB = Color.HSBtoRGB(method9889, 1.0f, 1.0f);
                n4 = Color.HSBtoRGB(method9889, 1.0f, 1.0f);
                final int method9890 = this.method10491(class5742);
                int n6 = this.field15897.method23506(class5742.method9900()) + n3;
                final float n7 = 1.0f - Class7791.method25030(class5741.method35858(), 0.0f, 1.0f, 1.0f);
                if (method9887.equalsIgnoreCase("Smooth") || method9887.equalsIgnoreCase("Both")) {
                    n6 *= (int)n7;
                }
                Class8726.method30059();
                if (method9888.equalsIgnoreCase("Right")) {
                    GL11.glTranslated(-3.0, 0.0, 0.0);
                }
                Class8154.method26876((float)(n2 - method9890 - 3), (float)(n + 1), (float)(n2 + 2), (float)(n + n6 + 1), new Color(0, 0, 0, 150).getRGB());
                if (!method9888.equalsIgnoreCase("None")) {
                    if (!method9888.equalsIgnoreCase("All")) {
                        if (!method9888.equalsIgnoreCase("Left")) {
                            if (method9888.equalsIgnoreCase("Right")) {
                                Class8154.method26876((float)(n2 + 2), (float)(n + 1), (float)(n2 + 7), (float)(n + 1 + n6), n4);
                            }
                        }
                        else {
                            Class8154.method26876((float)(n2 - method9890 - 6), (float)(n + 1), (float)(n2 - method9890 - 3), (float)(n + 1 + n6), n4);
                        }
                    }
                    else {
                        Class8154.method26876((float)(n2 - method9890 - 5), (float)(n + 1), (float)(n2 - method9890 - 3), (float)(n + 1 + n6), n4);
                        Class8154.method26876((float)(n2 - method9890 - 3), (float)(n + 1), (float)(n2 - n5 - 5), (float)(n + 3), n4);
                    }
                }
                Class8726.method30070();
                Class8726.method30011();
                if (method9887.equalsIgnoreCase("Slide") || method9887.equalsIgnoreCase("Both")) {
                    GL11.glTranslated((double)(method9890 * Class7791.method25030(class5741.method35858(), 0.0f, 1.0f, 1.0f)), 0.0, 0.0);
                }
                Class8154.method26868((float)(n2 - method9890 - 3), (float)(n + 1), (float)n2, n + n6 - Class7791.method25030(class5741.method35858(), 0.0f, 1.0f, 1.0f));
                this.field15897.method23501((float)(n2 - method9890), (float)n, class5742.method9900(), new Class2427(hsBtoRGB));
                this.field15898.method23501((float)(n2 - this.field15898.method23505(this.method10490(class5742))), n + 1.6f, this.method10490(class5742), new Class2427(160, 160, 160));
                Class8154.method26872();
                Class8726.method30012();
                n += n6;
                Class8726.method30060();
                n5 = method9890;
                method9889 += (float)0.0196078431372549;
                if (method9889 <= 1.0f) {
                    continue;
                }
                method9889 = 0.0f;
            }
            if (method9888.equalsIgnoreCase("All")) {
                if (n5 > 0) {
                    Class8154.method26876((float)(n2 - n5 - 5), (float)(n + 1), (float)(n2 + 2), (float)(n + 3), n4);
                }
            }
        }
    }
    
    private void method10489() {
        if (this.field15896.isEmpty()) {
            this.field15896.clear();
            for (final Class3167 key : Class9463.method35173().method35189().method21553().values()) {
                if (key == this) {
                    continue;
                }
                if (key.method9905() == Class8013.field32991) {
                    continue;
                }
                final Class9572 value = new Class9572(200, 200, key.method9906() ? Class2186.field12965 : Class2186.field12964);
                value.method35856(key.method9906() ? 0.0f : 1.0f);
                this.field15896.put(key, value);
                final Class4997 class4997 = key.method9899().get("Type");
                if (class4997 == null) {
                    final Class4997 class4998 = key.method9899().get("Mode");
                    if (class4998 == null) {
                        continue;
                    }
                    class4998.method15195(class4997 -> this.method10487());
                }
                else {
                    class4997.method15195(class4997 -> this.method10487());
                }
            }
        }
        for (final Map.Entry entry : this.field15896.entrySet()) {
            ((Class9572)entry.getValue()).method35855(((Class3167)entry.getKey()).method9906() ? Class2186.field12965 : Class2186.field12964);
        }
    }
    
    private String method10490(final Class3167 class3167) {
        String s = "";
        if (class3167.method9887("Type") == null) {
            if (class3167.method9887("Mode") != null) {
                s = s + " " + class3167.method9887("Mode");
            }
        }
        else {
            s = s + " " + class3167.method9887("Type");
        }
        return s;
    }
    
    private int method10491(final Class3167 class3167) {
        return this.field15897.method23505(class3167.method9900()) + this.field15898.method23505(this.method10490(class3167));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import java.util.Map;
import java.util.HashMap;

public class Class3277 extends Class3167
{
    private HashMap<Class512, Vec2f> field15776;
    public static Class3277 field15777;
    
    public Class3277() {
        super(Class8013.field32984, "NameTags", "Render better name tags");
        this.field15776 = new HashMap<Class512, Vec2f>();
        Class3277.field15777 = this;
    }
    
    @Class6753
    public void method10324(final Class5734 class5734) {
        if (this.method9906()) {
            final int n = 20;
            final int n2 = 32;
            for (final Map.Entry<Class512, V> entry : this.field15776.entrySet()) {
                final Class512 class5735 = entry.getKey();
                if (!class5735.method1823()) {
                    final Vec2f class5736 = (Vec2f)entry.getValue();
                    final String method8459 = class5735.getName().getUnformattedComponentText();
                    final int n3 = Class9493.field40813.method23505(method8459) + 8;
                    final int round = Math.round(class5736.x);
                    final int round2 = Math.round(class5736.y);
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)(-n3 / 2), (float)(-n), 0.0f);
                    Class8154.method26874((float)round, (float)round2, (float)n3, 20.0f, Class6430.method19118(Class265.field1273.field1292, 0.5f));
                    Class8154.method26889(Class9493.field40813, (float)(round + 3), (float)round2, method8459, Class6430.method19118(Class265.field1273.field1292, 0.5f));
                    Class8154.method26889(Class9493.field40813, (float)(round + 3), (float)(round2 - 1), method8459, Class265.field1278.field1292);
                    GL11.glPopMatrix();
                    final List<ItemStack> method8460 = Class8639.method29374(class5735);
                    if (method8460.size() == 0) {
                        continue;
                    }
                    final int n4 = n2 * method8460.size();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)(-n4 / 2), (float)(-n - n2 - 2), 0.0f);
                    for (int i = 0; i < method8460.size(); ++i) {
                        final ItemStack class5737 = method8460.get(i);
                        final Class52 method8461 = class5737.method27662();
                        final int n5 = round2 - Math.max(0, method8461.size() - 4) * 8 - 2;
                        for (int j = 0; j < method8461.size(); ++j) {
                            Class90.field209.method506(Class1932.method7795(method8461.method346(j).method323("id"))).ifPresent(class5739 -> {
                                class5739.method18599(1).getUnformattedComponentText();
                                final String s;
                                new StringBuilder().append("§f").append(s.substring(0, Math.min(2, s.length()))).toString();
                                int method8462 = 0;
                                if (!(!class5738.method315("lvl"))) {
                                    method8462 = class5738.method319("lvl");
                                }
                                String str = null;
                                if (method8462 <= 3) {
                                    if (method8462 > 2) {
                                        str = "§6";
                                    }
                                }
                                else {
                                    str = "§c";
                                }
                                final String str2;
                                new StringBuilder().append(str2).append(str).append(method8462).toString();
                                return;
                            });
                        }
                        final int n6 = class5737.method27631() ? (class5737.method27634() - class5737.method27632()) : class5737.method27634();
                        if (n6 / (float)class5737.method27634() >= 0.2f) {
                            if (n6 / (float)class5737.method27634() >= 0.5f) {}
                        }
                    }
                    GL11.glPopMatrix();
                }
            }
        }
    }
    
    @Class6753
    public void method10325(final Class5739 class5739) {
        if (this.method9906()) {
            this.field15776.clear();
            for (final Entity class5740 : Class3277.field15514.field4683.method6806()) {
                if (!(class5740 instanceof Class512)) {
                    continue;
                }
                if (class5740 instanceof Class756) {
                    continue;
                }
                final Class512 key = (Class512)class5740;
                final Class9172 method29094 = Class8591.method29094(key);
                final double[] method29095 = Class8154.method26931(method29094.field38854, method29094.field38855 + key.method1931() + 0.30000001192092896, method29094.field38856);
                if (method29095 == null) {
                    continue;
                }
                if (method29095[2] < 0.0) {
                    continue;
                }
                if (method29095[2] >= 1.0) {
                    continue;
                }
                this.field15776.put(key, new Vec2f((float)method29095[0], (float)method29095[1]));
            }
        }
    }
    
    @Class6753
    public void method10326(final Class5749 class5749) {
        if (this.method9906()) {
            if (class5749.method17056() instanceof Class512) {
                class5749.method16961(true);
            }
        }
    }
}

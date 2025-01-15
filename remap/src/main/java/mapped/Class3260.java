// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.Arrays;
import java.util.List;

public class Class3260 extends Class3247
{
    public static List<Class3833> field15749;
    public int field15750;
    public Class9572 field15751;
    public int field15752;
    
    public Class3260() {
        super(Class8013.field32990, "BlockFly", "Allows you to automatically bridge", new Class3167[] { new Class3204(), new Class3212(), new Class3236() });
        this.field15751 = new Class9572(114, 114, Class2186.field12965);
        this.field15752 = 0;
        this.method9881(new Class5001("ItemSpoof", "Item spoofing mode", 2, new String[] { "None", "Switch", "Spoof", "LiteSpoof" }));
        this.method9881(new Class5001("Tower Mode", "Tower mode", 1, new String[] { "None", "NCP", "AAC", "Cubecraft" }).method15211("Cubecraft"));
        this.method9881(new Class5001("Picking mode", "The way you will pick blocks in your inventory.", 0, new String[] { "Basic", "FakeInv", "OpenInv" }));
        this.method9881(new Class4999("Tower while moving", "Allows you to tower while moving.", false));
        this.method9881(new Class4999("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
        this.method9881(new Class4999("NoSwing", "Removes the swing animation.", true));
        this.method9881(new Class4999("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
        this.method9881(new Class4999("No Sprint", "Disable sprint.", false));
        Class3260.field15749 = Arrays.asList(Class7521.field29147, Class7521.field29173, Class7521.field29174, Class7521.field29398, Class7521.field29545, Class7521.field29382, Class7521.field29381, Class7521.field29330, Class7521.field29548, Class7521.field29292, Class7521.field29468, Class7521.field29287, Class7521.field29465, Class7521.field29468, Class7521.field29220, Class7521.field29335, Class7521.field29283, Class7521.field29293, Class7521.field29316, Class7521.field29418, Class7521.field29336, Class7521.field29553, Class7521.field29411, Class7521.field29410, Class7521.field29308, Class7521.field29393, Class7521.field29279, Class7521.field29278, Class7521.field29388, Class7521.field29366, Class7521.field29307, Class7521.field29299, Class7521.field29175, Class7521.field29332, Class7521.field29216, Class7521.field29481, Class7521.field29296, Class7521.field29240, Class7521.field29337, Class7521.field29170);
    }
    
    public boolean method10278() {
        return this.method9883("No Sprint") && this.method9906();
    }
    
    public static boolean method10279(final Class3820 class3820) {
        if (!(class3820 instanceof Class4036)) {
            return false;
        }
        final Class3833 method12240 = ((Class4036)class3820).method12240();
        if (!Class3260.field15749.contains(method12240)) {
            if (!(method12240 instanceof Class3905)) {
                if (!(method12240 instanceof Class3874)) {
                    if (!(method12240 instanceof Class3894)) {
                        if (!(method12240 instanceof Class4000)) {
                            if (!(method12240 instanceof Class3989)) {
                                if (!(method12240 instanceof Class3992)) {
                                    if (!(method12240 instanceof Class3936)) {
                                        if (!(method12240 instanceof Class3900)) {
                                            if (!(method12240 instanceof Class3841)) {
                                                if (!(method12240 instanceof Class3865)) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public void method10280() {
        try {
            int i = 36;
            while (i < 45) {
                final int n = i - 36;
                if (Class3260.field15514.field4684.field3008.method10878(i).method20054() && method10279(Class3260.field15514.field4684.field3008.method10878(i).method20053().method27622()) && Class3260.field15514.field4684.field3008.method10878(i).method20053().field34176 != 0) {
                    if (Class3260.field15514.field4684.field3006.field2743 == n) {
                        return;
                    }
                    Class3260.field15514.field4684.field3006.field2743 = n;
                    if (this.method9887("ItemSpoof").equals("LiteSpoof") && (this.field15750 < 0 || this.field15750 != n)) {
                        Class3260.field15514.method5269().method17369().method11174(new Class4321(n));
                        this.field15750 = n;
                        break;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public int method10281() {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (Class3260.field15514.field4684.field3008.method10878(i).method20054()) {
                final ItemStack method20053 = Class3260.field15514.field4684.field3008.method10878(i).method20053();
                if (method10279(method20053.method27622())) {
                    n += method20053.field34176;
                }
            }
        }
        return n;
    }
    
    public void method10282() {
        final String method9887 = this.method9887("Picking mode");
        if ((!method9887.equals("OpenInv") || Class3260.field15514.field4700 instanceof Class518) && this.method10281() != 0) {
            int n = 43;
            if (!this.method9883("Intelligent Block Picker")) {
                if (!this.method10284()) {
                    int n2 = -1;
                    for (int i = 9; i < 36; ++i) {
                        if (Class3260.field15514.field4684.field3008.method10878(i).method20054() && method10279(Class3260.field15514.field4684.field3008.method10878(i).method20053().method27622())) {
                            n2 = i;
                            break;
                        }
                    }
                    for (int j = 36; j < 45; ++j) {
                        if (!Class3260.field15514.field4684.field3008.method10878(j).method20054()) {
                            n = j;
                            break;
                        }
                    }
                    if (n2 >= 0) {
                        if (!(Class3260.field15514.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                Class3260.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                            }
                        }
                        this.method10286(n2, n - 36);
                        if (!(Class3260.field15514.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                Class3260.field15514.method5269().method17292(new Class4389(-1));
                            }
                        }
                    }
                }
            }
            else {
                final int method9888 = this.method10283();
                if (!this.method10284()) {
                    for (int k = 36; k < 45; ++k) {
                        if (!Class3260.field15514.field4684.field3008.method10878(k).method20054()) {
                            n = k;
                            break;
                        }
                    }
                }
                else {
                    int l = 36;
                    while (l < 45) {
                        if (Class3260.field15514.field4684.field3008.method10878(l).method20054() && method10279(Class3260.field15514.field4684.field3008.method10878(l).method20053().method27622())) {
                            n = l;
                            if (Class3260.field15514.field4684.field3008.method10878(n).method20053().field34176 != Class3260.field15514.field4684.field3008.method10878(method9888).method20053().field34176) {
                                break;
                            }
                            n = -1;
                            break;
                        }
                        else {
                            ++l;
                        }
                    }
                }
                if (n >= 0) {
                    if (Class3260.field15514.field4684.field3008.method10878(n).field26174 != method9888) {
                        if (!(Class3260.field15514.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                Class3260.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                            }
                        }
                        this.method10286(method9888, n - 36);
                        if (!(Class3260.field15514.field4700 instanceof Class518)) {
                            if (method9887.equals("FakeInv")) {
                                Class3260.field15514.method5269().method17292(new Class4389(-1));
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int method10283() {
        int n = -1;
        int field34176 = 0;
        if (this.method10281() != 0) {
            for (int i = 9; i < 45; ++i) {
                if (Class3260.field15514.field4684.field3008.method10878(i).method20054()) {
                    final Class3820 method27622 = Class3260.field15514.field4684.field3008.method10878(i).method20053().method27622();
                    final ItemStack method27623 = Class3260.field15514.field4684.field3008.method10878(i).method20053();
                    if (method10279(method27622)) {
                        if (method27623.field34176 > field34176) {
                            field34176 = method27623.field34176;
                            n = i;
                        }
                    }
                }
            }
            return n;
        }
        return -1;
    }
    
    public boolean method10284() {
        for (int i = 36; i < 45; ++i) {
            if (Class3260.field15514.field4684.field3008.method10878(i).method20054() && method10279(Class3260.field15514.field4684.field3008.method10878(i).method20053().method27622())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method10285(final Class316 class316) {
        if (!this.method9914().method9887("ItemSpoof").equals("None")) {
            if (this.method10281() == 0) {
                return false;
            }
        }
        else if (!method10279(Class3260.field15514.field4684.method2715(class316).method27622())) {
            return false;
        }
        return true;
    }
    
    public void method10286(final int n, final int n2) {
        Class3260.field15514.field4682.method27324(Class3260.field15514.field4684.field3008.field16154, n, n2, Class2133.field12439, Class3260.field15514.field4684);
    }
    
    public void method10287(final Class5717 class5717) {
        if (Class9463.method35173().method35189().method21551(Class3256.class).method9906() && !Class3347.field15955) {
            return;
        }
        if (Class3260.field15514.field4633.field26532 == 0.8038576f) {
            Class3260.field15514.field4633.field26532 = 1.0f;
        }
        if (this.method10281() != 0 && (!Class3260.field15514.field4684.field2406 || this.method9887("Tower Mode").equalsIgnoreCase("Cubecraft"))) {
            if (!Class6430.method19114() || this.method9883("Tower while moving")) {
                final String method9887 = this.method9887("Tower Mode");
                switch (method9887) {
                    case "NCP": {
                        if (class5717.method16974() > 0.0) {
                            if (Class7482.method23140() == 0) {
                                if (class5717.method16974() > 0.247 && class5717.method16974() < 0.249) {
                                    class5717.method16975((int)(Class3260.field15514.field4684.field2396 + class5717.method16974()) - Class3260.field15514.field4684.field2396);
                                }
                            }
                            else {
                                final double n2 = (int)(Class3260.field15514.field4684.field2396 + class5717.method16974());
                                if (n2 != (int)Class3260.field15514.field4684.field2396 && Class3260.field15514.field4684.field2396 + class5717.method16974() - n2 < 0.15) {
                                    class5717.method16975(n2 - Class3260.field15514.field4684.field2396);
                                }
                            }
                        }
                        if (Class3260.field15514.field4684.field2396 != (int)Class3260.field15514.field4684.field2396 || !Class6430.method19160(Class3260.field15514.field4684, 0.001f)) {
                            break;
                        }
                        if (Class3260.field15514.field4648.field23439.field2162) {
                            if (!Class6430.method19114()) {
                                Class7482.method23151(0.0);
                                Class7482.method23149(class5717, 0.0);
                            }
                            class5717.method16975(Class7482.method23141());
                            break;
                        }
                        class5717.method16975(-1.0E-5);
                        break;
                    }
                    case "AAC": {
                        if (class5717.method16974() > 0.247 && class5717.method16974() < 0.249) {
                            class5717.method16975((int)(Class3260.field15514.field4684.field2396 + class5717.method16974()) - Class3260.field15514.field4684.field2396);
                            if (Class3260.field15514.field4648.field23439.field2162 && !Class6430.method19114()) {
                                Class7482.method23151(0.0);
                                Class7482.method23149(class5717, 0.0);
                                break;
                            }
                            break;
                        }
                        else {
                            if (Class3260.field15514.field4684.field2396 == (int)Class3260.field15514.field4684.field2396 && Class6430.method19160(Class3260.field15514.field4684, 0.001f)) {
                                class5717.method16975(-1.0E-10);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case "Cubecraft": {
                        if (Class3260.field15514.field4648.field23439.field2162 && Class6430.method19160(Class3260.field15514.field4684, 0.001f) && Class3260.field15514.field4683.method6981(Class3260.field15514.field4684, Class3260.field15514.field4684.field2403.method18499(0.0, 1.0, 0.0)).count() == 0L) {
                            Class3260.field15514.field4684.method1656(Class3260.field15514.field4684.field2395, Class3260.field15514.field4684.field2396 + 1.0, Class3260.field15514.field4684.field2397);
                            class5717.method16975(0.0);
                            Class7482.method23149(class5717, 0.0);
                            Class3260.field15514.field4633.field26532 = 0.8038576f;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        else if (this.method9887("Tower Mode").equals("AAC") && Class6430.method19160(Class3260.field15514.field4684, 0.001f) && Class3260.field15514.field4648.field23439.field2162) {
            if (!Class6430.method19114() || this.method9883("Tower while moving")) {
                Class3260.field15514.field4684.field2985 = 0;
                Class3260.field15514.field4684.method2725();
                Class7482.method23149(class5717, Class7482.method23136());
                Class7482.method23151(Class7482.method23136());
            }
        }
        else if (!this.method9887("Tower Mode").equals("NCP") && !this.method9887("Tower Mode").equals("Cubecraft") && Class6430.method19160(Class3260.field15514.field4684, 0.001f) && Class3260.field15514.field4648.field23439.field2162) {
            Class3260.field15514.field4684.field2985 = 20;
            class5717.method16975(Class7482.method23141());
        }
        if (!this.method9887("Tower Mode").equalsIgnoreCase("Cubecraft")) {
            Class6430.method19155(class5717.method16974());
        }
    }
    
    @Override
    public String method9900() {
        if (Class9463.method35173().method35209() != Class2209.field13465) {
            return super.method9900();
        }
        return "Scaffold";
    }
    
    @Class6753
    public void method10288(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (this.method9883("Show Block Amount")) {
            this.field15752 = this.method10281();
        }
    }
    
    @Override
    public void method9897() {
        this.field15751.method35855(Class2186.field12965);
        super.method9897();
    }
    
    @Class6753
    public void method10289(final Class5740 class5740) {
        this.field15751.method35855(Class2186.field12964);
        if (this.field15751.method35858() == 0.0f) {
            return;
        }
        if (this.method9883("Show Block Amount")) {
            if (Class9463.method35173().method35209() != Class2209.field13464) {
                this.method10290(Class3260.field15514.field4632.method7694() / 2, Class3260.field15514.field4632.method7695() / 2 + 15 - (int)(10.0f * this.field15751.method35858()), this.field15751.method35858());
            }
            else {
                this.method10291(Class3260.field15514.field4632.method7694() / 2, Class3260.field15514.field4632.method7695() - 138 - (int)(25.0f * Class8468.method28270(this.field15751.method35858(), 0.0f, 1.0f, 1.0f)), this.field15751.method35858());
            }
        }
    }
    
    public void method10290(final int n, final int n2, float n3) {
        n3 = (float)(0.5 + 0.5 * n3);
        GL11.glAlphaFunc(518, 0.1f);
        Class8154.method26889(Class9493.field40815, (float)(n + 10), (float)(n2 + 5), this.field15752 + " Blocks", Class6430.method19118(Class265.field1273.field1292, n3 * 0.3f));
        Class8154.method26889(Class9493.field40815, (float)(n + 10), (float)(n2 + 4), this.field15752 + " Blocks", Class6430.method19118(Class265.field1278.field1292, n3 * 0.8f));
        GL11.glAlphaFunc(519, 0.0f);
    }
    
    public void method10291(int n, int n2, final float n3) {
        final int n4 = 0;
        final int n5 = Class9400.field40312.method23505(this.field15752 + "") + 3;
        final int n6 = n4 + n5 + Class9400.field40311.method23505("Blocks") + 20;
        final int n7 = 32;
        n -= n6 / 2;
        GL11.glPushMatrix();
        Class8154.method26915(n, n2, n6, n7, Class6430.method19118(-15461356, 0.8f * n3));
        Class8154.method26889(Class9400.field40312, (float)(n + 10), (float)(n2 + 4), this.field15752 + "", Class6430.method19118(Class265.field1278.field1292, n3));
        Class8154.method26889(Class9400.field40311, (float)(n + 10 + n5), (float)(n2 + 8), "Blocks", Class6430.method19118(Class265.field1278.field1292, 0.6f * n3));
        n += 11 + n6 / 2;
        n2 += n7;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n, (float)n2, 0.0f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n), (float)(-n2), 0.0f);
        Class8154.method26899((float)n, (float)n2, 9.0f, 23.0f, Class7853.field32197, Class6430.method19118(-15461356, 0.8f * n3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}

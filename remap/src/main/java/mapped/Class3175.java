// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;

public class Class3175 extends Class3167
{
    public int field15538;
    public int field15539;
    public ArrayList<Class9151> field15540;
    
    public Class3175() {
        super(Class8013.field32991, "KeyStrokes", "Shows what keybind you are pressing");
        this.field15538 = 10;
        this.field15539 = 260;
        this.field15540 = new ArrayList<Class9151>();
        this.method9915(false);
    }
    
    public Class2090 method9949(final int n) {
        if (n == Class3175.field15514.gameSettings.field23436.field2161.field32860) {
            return Class2090.field12082;
        }
        if (n == Class3175.field15514.gameSettings.field23438.field2161.field32860) {
            return Class2090.field12083;
        }
        if (n == Class3175.field15514.gameSettings.field23435.field2161.field32860) {
            return Class2090.field12084;
        }
        if (n == Class3175.field15514.gameSettings.field23437.field2161.field32860) {
            return Class2090.field12085;
        }
        if (n == Class3175.field15514.gameSettings.field23446.field2161.field32860) {
            return Class2090.field12086;
        }
        if (n != Class3175.field15514.gameSettings.field23445.field2161.field32860) {
            return null;
        }
        return Class2090.field12087;
    }
    
    @Class6753
    private void method9950(final Class5740 class5740) {
        if (!this.method9906() || Class3175.field15514.player == null) {
            return;
        }
        if (Minecraft.method5277().gameSettings.field23466) {
            return;
        }
        if (!Minecraft.method5277().gameSettings.field23464) {
            this.field15539 = class5740.method17028();
            if (Class9463.method35173().method35193().method32146()) {
                for (final Class2090 class5741 : Class2090.values()) {
                    final Class8883 method8208 = class5741.method8208();
                    final Class8883 method8209 = class5741.method8209();
                    Class8154.method26870(this.field15538 + method8208.field37368, this.field15539 + method8208.field37369, this.field15538 + method8208.field37368 + method8209.field37368, this.field15539 + method8208.field37369 + method8209.field37369);
                    Class8707.method29896(this.field15538 + method8208.field37368, this.field15539 + method8208.field37369, method8209.field37368, method8209.field37369);
                    Class8707.method29899();
                    Class8154.method26872();
                }
            }
            for (final Class2090 class5742 : Class2090.values()) {
                final Class8883 method8210 = class5742.method8208();
                final Class8883 method8211 = class5742.method8209();
                float n = 1.0f;
                float n2 = 1.0f;
                if (Class9463.method35173().method35193().method32146()) {
                    n2 = 0.5f;
                    n = 0.5f;
                }
                String method8212 = Class6430.method19166(class5742.field12093.field2161.field32860);
                if (class5742.field12093 != Class3175.field15514.gameSettings.field23446) {
                    if (class5742.field12093 == Class3175.field15514.gameSettings.field23445) {
                        method8212 = "R";
                    }
                }
                else {
                    method8212 = "L";
                }
                Class8154.method26876((float)(this.field15538 + method8210.field37368), (float)(this.field15539 + method8210.field37369), (float)(this.field15538 + method8210.field37368 + method8211.field37368), (float)(this.field15539 + method8210.field37369 + method8211.field37369), Class6430.method19118(Class265.field1273.field1292, 0.5f * n));
                Class8154.method26913((float)(this.field15538 + method8210.field37368), (float)(this.field15539 + method8210.field37369), (float)method8211.field37368, (float)method8211.field37369, 10.0f, 0.75f * n2);
                Class8154.method26889(Class9400.field40312, (float)(this.field15538 + method8210.field37368 + (method8211.field37368 - Class9400.field40312.method23505(method8212)) / 2), (float)(this.field15539 + method8210.field37369 + 12), method8212, Class265.field1278.field1292);
            }
            final Iterator<Class9151> iterator = this.field15540.iterator();
            while (iterator.hasNext()) {
                final Class9151 class5743 = iterator.next();
                final Class2090 field38781 = class5743.field38781;
                final Class8883 method8213 = field38781.method8208();
                final Class8883 method8214 = field38781.method8209();
                Class8154.method26870(this.field15538 + method8213.field37368, this.field15539 + method8213.field37369, this.field15538 + method8213.field37368 + method8214.field37368, this.field15539 + method8213.field37369 + method8214.field37369);
                final float n3 = 0.7f;
                int n4 = 0;
                final Iterator<Class9151> iterator2 = this.field15540.iterator();
                while (iterator2.hasNext()) {
                    if (!iterator2.next().field38781.equals(field38781)) {
                        continue;
                    }
                    ++n4;
                }
                if (field38781.method8210().method1056()) {
                    if (class5743.field38782.method35858() >= n3) {
                        if (n4 < 2) {
                            class5743.field38782.method35856(n3);
                        }
                    }
                }
                final float method8215 = class5743.field38782.method35858();
                int n5 = Class6430.method19118(-5658199, (1.0f - method8215 * (0.5f + method8215 * 0.5f)) * 0.8f);
                if (Class9463.method35173().method35193().method32146()) {
                    n5 = Class6430.method19118(-1, (1.0f - method8215 * (0.5f + method8215 * 0.5f)) * 0.8f);
                }
                Class8154.method26886((float)(this.field15538 + method8213.field37368 + method8214.method31267() / 2), (float)(this.field15539 + method8213.field37369 + method8214.field37369 / 2), (method8214.method31267() - 4) * method8215 + 4.0f, n5);
                Class8154.method26872();
                if (class5743.field38782.method35858() != 1.0f) {
                    continue;
                }
                iterator.remove();
            }
            class5740.method17030(160);
        }
    }
    
    @Class6753
    private void method9951(final Class5752 class5752) {
        if (this.method9906() && Class3175.field15514.player != null) {
            if (this.method9949(class5752.method17061()) != null) {
                if (!class5752.method17062()) {
                    this.field15540.add(new Class9151(this, this.method9949(class5752.method17061())));
                }
            }
        }
    }
    
    @Class6753
    private void method9952(final Class5748 class5748) {
        if (this.method9906() && Class3175.field15514.player != null) {
            return;
        }
    }
}

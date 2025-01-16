// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class7951
{
    private static String[] field32653;
    public Minecraft field32654;
    private List<Class6224> field32655;
    private int field32656;
    private int field32657;
    private int field32658;
    private int field32659;
    private int field32660;
    private int field32661;
    private int field32662;
    private int field32663;
    private Class7524 field32664;
    private Class7524 field32665;
    
    public Class7951() {
        this.field32654 = Minecraft.method5277();
        this.field32655 = new ArrayList<Class6224>();
        this.field32656 = 20;
        this.field32657 = 1;
        this.field32658 = 200;
        this.field32659 = 340;
        this.field32660 = 64;
        this.field32661 = 10;
        this.field32662 = 10;
        this.field32663 = 10;
        this.field32664 = Class9400.field40311;
        this.field32665 = Class9400.field40313;
    }
    
    public void method25776(final Class6224 class6224) {
        for (final Class6224 class6225 : this.field32655) {
            if (!class6225.equals(class6224)) {
                continue;
            }
            class6225.field25089.method23936(Math.min(class6225.field25089.method23935(), this.field32658 + 1));
            class6225.field25086 = class6224.field25086;
            final Class6224 class6226 = class6225;
            ++class6226.field25092;
            class6225.field25087 = class6224.field25087;
            return;
        }
        this.field32655.add(class6224);
    }
    
    public float method25777(final Class6224 class6224) {
        final float n = (float)Math.min(class6224.field25089.method23935(), class6224.field25088);
        if (n < this.field32658 * 1.4f) {
            return Class7791.method25030(n / (this.field32658 * 1.4f), 0.0f, 1.0f, 1.0f);
        }
        if (n <= class6224.field25088 - (float)this.field32658) {
            return 1.0f;
        }
        return Class7791.method25029((class6224.field25088 - n) / this.field32658, 0.0f, 1.0f, 1.0f);
    }
    
    public float method25778(final int n) {
        float n2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            n2 += this.method25777(this.field32655.get(i));
        }
        return n2 / n;
    }
    
    @Class6753
    private void method25779(final Class5740 class5740) {
        if (!Minecraft.method5277().field4648.field23464) {
            final int n = 6;
            final Minecraft field32654 = this.field32654;
            this.field32657 = Math.max(Math.round((float)(n - Minecraft.method5338() / 10)), 1);
            for (int i = 0; i < this.field32655.size(); ++i) {
                final Class6224 class5741 = this.field32655.get(i);
                final float method25777 = this.method25777(class5741);
                final int n2 = Minecraft.method5277().field4632.method7694() - this.field32662 - (int)(this.field32659 * method25777 * method25777);
                final int n3 = this.field32654.field4632.method7695() - this.field32660 - this.field32661 - i * (int)(this.field32660 * this.method25778(i) + this.field32663 * this.method25778(i));
                final float min = Math.min(1.0f, method25777);
                final int rgb = new Color(0.14f, 0.14f, 0.14f, min * 0.93f).getRGB();
                final int rgb2 = new Color(0.0f, 0.0f, 0.0f, Math.min(method25777 * 0.075f, 1.0f)).getRGB();
                final int rgb3 = new Color(1.0f, 1.0f, 1.0f, min).getRGB();
                Class8154.method26913((float)n2, (float)n3, (float)this.field32659, (float)this.field32660, 10.0f, min);
                Class8154.method26876((float)n2, (float)n3, (float)(n2 + this.field32659), (float)(n3 + this.field32660), rgb);
                Class8154.method26876((float)n2, (float)n3, (float)(n2 + this.field32659), (float)(n3 + 1), rgb2);
                Class8154.method26876((float)n2, (float)(n3 + this.field32660 - 1), (float)(n2 + this.field32659), (float)(n3 + this.field32660), rgb2);
                Class8154.method26876((float)n2, (float)(n3 + 1), (float)(n2 + 1), (float)(n3 + this.field32660 - 1), rgb2);
                Class8154.method26876((float)(n2 + this.field32659 - 1), (float)(n3 + 1), (float)(n2 + this.field32659), (float)(n3 + this.field32660 - 1), rgb2);
                Class8154.method26870(n2, n3, n2 + this.field32659 - this.field32663, n3 + this.field32660);
                Class8154.method26889(this.field32665, (float)(n2 + this.field32660 + this.field32663 - 2), (float)(n3 + this.field32663), class5741.field25085, rgb3);
                Class8154.method26889(this.field32664, (float)(n2 + this.field32660 + this.field32663 - 2), (float)(n3 + this.field32663 + this.field32665.method23506(class5741.field25085)), class5741.field25086, rgb3);
                Class8154.method26872();
                Class8154.method26905((float)(n2 + this.field32663 / 2), (float)(n3 + this.field32663 / 2), (float)(this.field32660 - this.field32663), (float)(this.field32660 - this.field32663), class5741.field25087);
            }
        }
    }
    
    @Class6753
    private void method25780(final Class5743 class5743) {
        final Iterator<Class6224> iterator = this.field32655.iterator();
        while (iterator.hasNext()) {
            final Class6224 class5744 = iterator.next();
            if (class5744.field25089.method23935() <= class5744.field25088) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Class6753
    private void method25781(final Class5739 class5739) {
        if (this.field32654.field4684 != null) {
            return;
        }
    }
    
    private void method25782() {
        for (int i = 0; i < this.field32655.size(); ++i) {
            final Class6224 class6224 = this.field32655.get(i);
            final float method25777 = this.method25777(class6224);
            final int n = Minecraft.method5277().field4632.method7694() - this.field32662 - (int)(this.field32659 * method25777 * method25777);
            final int n2 = this.field32654.field4632.method7695() - this.field32660 - this.field32661 - i * (int)(this.field32660 * this.method25778(i) + this.field32663 * this.method25778(i));
            for (int j = 0; j < 3; ++j) {
                class6224.field25090[j] = Class8154.method26930(n + this.field32659 / 3 * j, n2, class6224.field25090[j]);
                class6224.field25091[j] = Class8154.method26930(n + this.field32659 / 3 * j, n2 + this.field32660, class6224.field25091[j]);
            }
        }
    }
    
    public void method25783() {
        Class9463.method35173().method35188().method21094(this);
    }
}

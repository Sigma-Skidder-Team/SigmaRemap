// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class4826 extends Class4825
{
    private static String[] field20591;
    private Class7971 field20647;
    private final List<Class4916> field20648;
    private float field20649;
    
    public Class4826(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20647 = null;
        this.field20648 = new ArrayList<Class4916>();
        this.field20649 = 0.0f;
    }
    
    public void method14455(final Class7971 field20647) {
        this.field20647 = field20647;
        final Iterator<Class4916> iterator = this.field20648.iterator();
        while (iterator.hasNext()) {
            this.method14243(iterator.next());
        }
        if (field20647 != null) {
            final ArrayList list = new ArrayList();
            final Iterator<Class8848> iterator2 = field20647.method25887().iterator();
            while (iterator2.hasNext()) {
                list.add(iterator2.next());
            }
            Collections.reverse(list);
            int n = 0;
            final int n2 = 90;
            final int n3 = 14;
            for (final Class8848 class8848 : list) {
                if (class8848.method30982() != null) {
                    if (class8848.method30982().method35869() == null) {
                        continue;
                    }
                    final Class4916 class8849 = new Class4916(this, ((Class8848)list.get(n)).method30980(), 40, 100 + n * (n2 + n3), this.field20480 - 90, n2, class8848);
                    this.addToList(class8849);
                    this.field20648.add(class8849);
                    ++n;
                }
            }
            this.method14279(n * (n2 + n3) + 116);
        }
    }
    
    @Override
    public void draw(final float partialTicks) {
        this.translate();
        this.field20649 += (float)(this.method14296() ? 0.33 : -0.33);
        this.field20649 = Math.min(1.0f, Math.max(0.0f, this.field20649));
        if (this.field20647 == null) {
            final int n2 = this.field20480 - 30;
            RenderUtil.drawImage((float)(this.x + 5), (float)((Minecraft.getInstance().window.method7695() - n2 * 342 / 460) / 2 - 60), (float)n2, (float)(n2 * 342 / 460), ClientAssets.img);
        }
        if (this.field20647 != null) {
            AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.2f);
            RenderUtil.drawString(ClientFonts.JelloLight36, (float)(this.x + (this.field20480 - ClientFonts.JelloLight36.getWidth(this.field20647.method25889())) / 2), (float)this.y, this.field20647.method25889(), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.7f));
            super.draw(partialTicks);
        }
    }
}

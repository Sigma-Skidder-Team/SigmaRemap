// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.List;

public class Class6868 implements Class6866
{
    private final Class8863 field26906;
    private boolean field26907;
    
    public Class6868(final Class8863 field26906) {
        this.field26906 = field26906;
    }
    
    @Override
    public Class2204 method20978(final Class690 class690, final long n) {
        class690.method3853().method5290().method5849(Class6868.field26901);
        RenderSystem.method30069(1.0f, 1.0f, 1.0f);
        final Class7339 method31036 = this.field26906.method31036();
        class690.blit(0, 0, 0, 0, 160, 32);
        if (method31036 == null) {
            return Class2204.field13418;
        }
        final List<String> method31037 = class690.method3853().fontRenderer.method6626(method31036.method22527().getFormattedText(), 125);
        final int n2 = (method31036.method22531() != Class1993.field11163) ? 16776960 : 16746751;
        if (method31037.size() != 1) {
            if (n >= 1500L) {
                final int n3 = MathHelper.method35642(MathHelper.clamp((n - 1500L) / 300.0f, 0.0f, 1.0f) * 252.0f) << 24 | 0x4000000;
                int n4 = 16 - method31037.size() * 9 / 2;
                final Iterator iterator = method31037.iterator();
                while (iterator.hasNext()) {
                    class690.method3853().fontRenderer.method6610((String)iterator.next(), 30.0f, (float)n4, 0xFFFFFF | n3);
                    n4 += 9;
                }
            }
            else {
                class690.method3853().fontRenderer.method6610(Class8822.method30773("advancements.toast." + method31036.method22531().method8015()), 30.0f, 11.0f, n2 | (MathHelper.method35642(MathHelper.clamp((1500L - n) / 300.0f, 0.0f, 1.0f) * 255.0f) << 24 | 0x4000000));
            }
        }
        else {
            class690.method3853().fontRenderer.method6610(Class8822.method30773("advancements.toast." + method31036.method22531().method8015()), 30.0f, 7.0f, n2 | 0xFF000000);
            class690.method3853().fontRenderer.method6610(method31036.method22527().getFormattedText(), 30.0f, 18.0f, -1);
        }
        if (!this.field26907) {
            if (n > 0L) {
                this.field26907 = true;
                if (method31036.method22531() == Class1993.field11163) {
                    class690.method3853().method5299().method6422(Class6836.method20934(Class8520.field35668, 1.0f, 1.0f));
                }
            }
        }
        class690.method3853().getItemRenderer().method6541(null, method31036.method22529(), 8, 8);
        return (n < 5000L) ? Class2204.field13417 : Class2204.field13418;
    }
}

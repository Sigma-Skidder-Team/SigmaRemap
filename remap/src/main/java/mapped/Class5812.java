// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class Class5812 implements Class5811
{
    private boolean field23848;
    private boolean field23849;
    private long field23850;
    public final /* synthetic */ Class3641 field23851;
    public final /* synthetic */ Class9575 field23852;
    public final /* synthetic */ Class8115 field23853;
    
    public Class5812(final Class8115 field23853, final Class3641 field23854, final Class9575 field23855) {
        this.field23853 = field23853;
        this.field23851 = field23854;
        this.field23852 = field23855;
    }
    
    @Override
    public void method17415(final Class4403 class4403) {
        if (!this.field23849) {
            this.field23849 = true;
            final Class7787 method13250 = class4403.method13250();
            if (method13250.method24990() == null) {
                this.field23852.field41615 = "";
            }
            else {
                this.field23852.field41615 = method13250.method24990().method8461();
            }
            if (method13250.method24994() == null) {
                this.field23852.field41618 = Class8822.method30773("multiplayer.status.old", new Object[0]);
                this.field23852.field41617 = 0;
            }
            else {
                this.field23852.field41618 = method13250.method24994().method34475();
                this.field23852.field41617 = method13250.method24994().method34476();
            }
            if (method13250.method24992() == null) {
                this.field23852.field41614 = Class2116.field12317 + Class8822.method30773("multiplayer.status.unknown", new Object[0]);
            }
            else {
                this.field23852.field41614 = Class2116.field12316 + "" + method13250.method24992().method28398() + "" + Class2116.field12317 + "/" + Class2116.field12316 + method13250.method24992().method28397();
                if (ArrayUtils.isNotEmpty((Object[])method13250.method24992().method28399())) {
                    final StringBuilder sb = new StringBuilder();
                    for (final GameProfile gameProfile : method13250.method24992().method28399()) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(gameProfile.getName());
                    }
                    if (method13250.method24992().method28399().length < method13250.method24992().method28398()) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(Class8822.method30773("multiplayer.status.and_more", method13250.method24992().method28398() - method13250.method24992().method28399().length));
                    }
                    this.field23852.field41620 = sb.toString();
                }
            }
            if (method13250.method24997() == null) {
                this.field23852.method35870(null);
            }
            else {
                final String method13252 = method13250.method24997();
                if (!method13252.startsWith("data:image/png;base64,")) {
                    Class8115.method26698().error("Invalid server icon (unknown format)");
                }
                else {
                    this.field23852.method35870(method13252.substring("data:image/png;base64,".length()));
                }
            }
            this.field23850 = Class8349.method27837();
            this.field23851.method11174(new Class4319(this.field23850));
            this.field23848 = true;
        }
        else {
            this.field23851.method11181(new Class2259("multiplayer.status.unrequested", new Object[0]));
        }
    }
    
    @Override
    public void method17416(final Class4274 class4274) {
        this.field23852.field41616 = Class8349.method27837() - this.field23850;
        this.field23851.method11181(new Class2259("multiplayer.status.finished", new Object[0]));
    }
    
    @Override
    public void method17291(final ITextComponent class2250) {
        if (!this.field23848) {
            Class8115.method26698().error("Can't ping {}: {}", (Object)this.field23852.field41613, (Object)class2250.getString());
            this.field23852.field41615 = Class2116.field12313 + Class8822.method30773("multiplayer.status.cannot_connect", new Object[0]);
            this.field23852.field41614 = "";
            Class8115.method26699(this.field23853, this.field23852);
        }
    }
    
    @Override
    public Class3641 method17369() {
        return this.field23851;
    }
}

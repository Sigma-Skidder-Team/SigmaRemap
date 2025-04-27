// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public class Class2557 extends Class2466
{
    public final /* synthetic */ Class3078 field14591;
    
    public Class2557(final Class3078 field14591) {
        this.field14591 = field14591;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        if (!s.equalsIgnoreCase("MC|StopSound")) {
            String method30244;
            if (!s.equalsIgnoreCase("MC|TrList")) {
                final String str = s;
                method30244 = Class8748.method30244(s);
                if (method30244 == null) {
                    if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                        Class8563.method28793().method34742().warning("Ignoring outgoing plugin message with channel: " + str);
                    }
                    class8699.method29839();
                    return;
                }
                if (method30244.equals("minecraft:register") || method30244.equals("minecraft:unregister")) {
                    final String[] split = new String(class8699.method29822(Class5260.field22291), StandardCharsets.UTF_8).split("\u0000");
                    final ArrayList list = new ArrayList();
                    for (int i = 0; i < split.length; ++i) {
                        final String method30245 = Class8748.method30244(split[i]);
                        if (method30245 == null) {
                            if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                                Class8563.method28793().method34742().warning("Ignoring plugin channel in outgoing REGISTER: " + split[i]);
                            }
                        }
                        else {
                            list.add(method30245);
                        }
                    }
                    if (list.isEmpty()) {
                        class8699.method29839();
                        return;
                    }
                    class8699.method29823(Class5260.field22291, Joiner.on('\0').join(list).getBytes(StandardCharsets.UTF_8));
                }
            }
            else {
                method30244 = "minecraft:trader_list";
                class8699.method29824(Class5260.field22296);
                for (short shortValue = class8699.method29824(Class5260.field22292), n = 0; n < shortValue; ++n) {
                    final Class7562 class8700 = class8699.method29822(Class5260.field22328);
                    Class8748.method30243(class8700);
                    class8699.method29823(Class5260.field22333, class8700);
                    final Class7562 class8701 = class8699.method29822(Class5260.field22328);
                    Class8748.method30243(class8701);
                    class8699.method29823(Class5260.field22333, class8701);
                    if (class8699.method29824(Class5260.field22294)) {
                        final Class7562 class8702 = class8699.method29822(Class5260.field22328);
                        Class8748.method30243(class8702);
                        class8699.method29823(Class5260.field22333, class8702);
                    }
                    class8699.method29824(Class5260.field22294);
                    class8699.method29824(Class5260.field22296);
                    class8699.method29824(Class5260.field22296);
                }
            }
            class8699.method29821(Class5260.field22308, 0, method30244);
            return;
        }
        final String str2 = class8699.method29822(Class5260.field22308);
        final String s2 = class8699.method29822(Class5260.field22308);
        class8699.method29828();
        class8699.method29847(76);
        byte b = 0;
        class8699.method29823(Class5260.field22289, b);
        if (!str2.isEmpty()) {
            b |= 0x1;
            Optional optional = Class345.method1025(str2);
            if (!optional.isPresent()) {
                if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                    Class8563.method28793().method34742().info("Could not handle unknown sound source " + str2 + " falling back to default: master");
                }
                optional = Optional.of((Object)Class345.field2124);
            }
            class8699.method29823(Class5260.field22312, ((Class345)optional.get()).method1027());
        }
        if (!s2.isEmpty()) {
            b |= 0x2;
            class8699.method29823(Class5260.field22308, s2);
        }
        class8699.method29821(Class5260.field22289, 0, b);
    }
}

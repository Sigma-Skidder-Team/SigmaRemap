// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public class Class2724 extends Class2466
{
    public final /* synthetic */ Class2927 field14899;
    
    public Class2724(final Class2927 field14899) {
        this.field14899 = field14899;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String str;
        final String method30246 = Class8748.method30246(str = class8699.method29818(Class5260.field22308, 0));
        if (method30246 != null) {
            if (method30246.equals("REGISTER") || method30246.equals("UNREGISTER")) {
                final String[] split = new String(class8699.method29822(Class5260.field22291), StandardCharsets.UTF_8).split("\u0000");
                final ArrayList list = new ArrayList();
                for (int i = 0; i < split.length; ++i) {
                    final String method30247 = Class8748.method30246(split[i]);
                    if (method30247 == null) {
                        if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                            Class8563.method28793().method34742().warning("Ignoring plugin channel in incoming REGISTER: " + split[i]);
                        }
                    }
                    else {
                        list.add(method30247);
                    }
                }
                class8699.method29823(Class5260.field22291, Joiner.on('\0').join(list).getBytes(StandardCharsets.UTF_8));
            }
            class8699.method29821(Class5260.field22308, 0, method30246);
            return;
        }
        if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
            Class8563.method28793().method34742().warning("Ignoring incoming plugin message with channel: " + str);
        }
        class8699.method29839();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Class6478 implements Class6477
{
    private final Map<String, Class7345> field25837;
    
    public Class6478() {
        (this.field25837 = new ConcurrentHashMap<String, Class7345>()).put("minecraft:flower_pot", new Class7344());
        this.field25837.put("minecraft:bed", new Class7346());
        this.field25837.put("minecraft:banner", new Class7349());
        this.field25837.put("minecraft:skull", new Class7348());
        this.field25837.put("minecraft:mob_spawner", new Class7350());
        this.field25837.put("minecraft:command_block", new Class7347());
    }
    
    public int method19502(final Class6108 class6108, final Class8322 class6109, final Class74 obj, final boolean b) throws Exception {
        if (!obj.method418("id")) {
            return -1;
        }
        final String str = (String)obj.method419("id").method374();
        final Class7345 class6110 = this.field25837.get(str);
        if (class6110 != null) {
            final int method22560 = class6110.method22560(class6108, obj);
            if (b) {
                if (method22560 != -1) {
                    this.method19503(class6108, class6109, method22560);
                }
            }
            return method22560;
        }
        if (Class8563.method28794().method33559()) {
            Class8563.method28793().method34742().warning("Unhandled BlockEntity " + str + " full tag: " + obj);
        }
        return -1;
    }
    
    private void method19503(final Class6108 class6108, final Class8322 class6109, final int i) throws Exception {
        final Class8699 class6110 = new Class8699(11, null, class6108);
        class6110.method29823(Class5260.field22318, class6109);
        class6110.method29823(Class5260.field22312, i);
        class6110.method29831(Class5215.class, true, true);
    }
}

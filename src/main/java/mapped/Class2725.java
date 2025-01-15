// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Joiner;
import java.util.logging.Level;
import java.util.UUID;

public class Class2725 extends Class2466
{
    public final /* synthetic */ Class3061 field14900;
    
    public Class2725(final Class3061 field14900) {
        this.field14900 = field14900;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6651 class8700 = class8699.method29841().method18207(Class6651.class);
        class8700.method20212(Class2044.field11648);
        String method16331 = class8699.method29818(Class5260.field22308, 0);
        if (method16331.length() == 32) {
            method16331 = Class5216.method16331(method16331);
        }
        class8700.method20216(UUID.fromString(method16331));
        class8700.method20215(class8699.method29818(Class5260.field22308, 1));
        Class8563.method28794().method33553(class8699.method29841());
        if (class8700.method20211().method16337().size() == 2) {
            if (class8700.method20211().method16337().get(1).getClass() == Class5216.class) {
                if (class8700.method20211().method16337().get(0).getClass() == Class5218.class) {
                    class8699.method29841().method18234(false);
                }
            }
        }
        if (Class8563.method28794().method33559()) {
            Class8563.method28793().method34742().log(Level.INFO, "{0} logged in with protocol {1}, Route: {2}", new Object[] { class8699.method29818(Class5260.field22308, 1), class8700.method20207(), Joiner.on(", ").join((Object)class8700.method20211().method16337(), (Object)", ", new Object[0]) });
        }
    }
}

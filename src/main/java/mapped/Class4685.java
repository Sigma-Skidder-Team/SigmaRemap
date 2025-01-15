// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;

public class Class4685 implements Class4659
{
    public final /* synthetic */ Class4963[] field20230;
    public final /* synthetic */ Class4659 field20231;
    public final /* synthetic */ String field20232;
    public final /* synthetic */ Class4968 field20233;
    public final /* synthetic */ Class4968 field20234;
    
    public Class4685(final Class4968 field20234, final Class4963[] field20235, final Class4659 field20236, final String field20237, final Class4968 field20238) {
        this.field20234 = field20234;
        this.field20230 = field20235;
        this.field20231 = field20236;
        this.field20232 = field20237;
        this.field20233 = field20238;
    }
    
    @Override
    public void method13945(final Object... array) {
        final Object o = array[0];
        Class2347 class2347;
        if (!(o instanceof Exception)) {
            if (!(o instanceof String)) {
                class2347 = new Class2347("probe error");
            }
            else {
                class2347 = new Class2347("probe error: " + (String)o);
            }
        }
        else {
            class2347 = new Class2347("probe error", (Throwable)o);
        }
        class2347.field14130 = this.field20230[0].field21319;
        this.field20231.method13945(new Object[0]);
        if (Class4968.method15143().isLoggable(Level.FINE)) {
            Class4968.method15143().fine(String.format("probe transport \"%s\" failed because of error: %s", this.field20232, o));
        }
        this.field20233.method14942("upgradeError", class2347);
    }
}

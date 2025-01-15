// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class3320 extends Class3167
{
    private ArrayList<Class8438> field15921;
    
    public Class3320() {
        super(Class8013.field32989, "PingSpoof", "Makes you lagggy.");
        this.field15921 = new ArrayList<Class8438>();
        this.method9881(new Class4996("Lag", "Your ping (ms)", 1000.0f, Float.class, 50.0f, 10000.0f, 10.0f));
    }
    
    @Class6753
    public void method10515(final Class5732 class5732) {
        Label_0007: {
            if (!this.method9906()) {
                final Class3247 class5733 = (Class3247)Class9463.method35173().method35189().method21551(Class3251.class);
                if (class5733.method9906()) {
                    if (class5733.method9887("Type").equalsIgnoreCase("TP")) {
                        if (class5733.method10260().method9883("Ping spoof")) {
                            break Label_0007;
                        }
                    }
                }
                return;
            }
        }
        this.field15921.clear();
    }
    
    @Class6753
    public void method10516(final Class5743 class5743) {
        Label_0007: {
            if (!this.method9906()) {
                final Class3247 class5744 = (Class3247)Class9463.method35173().method35189().method21551(Class3251.class);
                if (class5744.method9906()) {
                    if (class5744.method9887("Type").equalsIgnoreCase("TP")) {
                        if (class5744.method10260().method9883("Ping spoof")) {
                            break Label_0007;
                        }
                    }
                }
                return;
            }
        }
        if (Class3320.field15514.field4684 != null && Class3320.field15514.method5282() != null) {
            if (Class3320.field15514.field4684.field2424 <= 1) {
                this.field15921.clear();
            }
            if (!this.field15921.isEmpty()) {
                for (int i = 0; i < this.field15921.size(); ++i) {
                    final Class8438 class5745 = this.field15921.get(i);
                    if (class5745.method28168()) {
                        Class3320.field15514.method5269().method17292(class5745.method28169());
                        this.field15921.remove(i);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10517(final Class5723 class5723) {
        Label_0007: {
            if (!this.method9906()) {
                final Class3247 class5724 = (Class3247)Class9463.method35173().method35189().method21551(Class3251.class);
                if (class5724.method9906()) {
                    if (class5724.method9887("Type").equalsIgnoreCase("TP")) {
                        if (class5724.method10260().method9883("Ping spoof")) {
                            break Label_0007;
                        }
                    }
                }
                return;
            }
        }
        if (Class3320.field15514.method5282() != null) {
            final Class4252 method16998 = class5723.method16998();
            if (method16998 instanceof Class4396) {
                this.field15921.add(new Class8438(new Class4303(((Class4396)method16998).method13223()), (long)this.method9886("Lag")));
                class5723.method16961(true);
            }
            if (method16998 instanceof Class4393) {
                final Class4393 class5725 = (Class4393)method16998;
                this.field15921.add(new Class8438(new Class4255(class5725.method13208(), class5725.method13209(), class5725.method13210()), (long)this.method9886("Lag")));
                class5723.method16961(true);
            }
        }
    }
}

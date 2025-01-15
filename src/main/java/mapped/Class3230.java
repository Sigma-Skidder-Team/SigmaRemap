// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class3230 extends Class3167
{
    public Class3230() {
        super(Class8013.field32984, "NameProtect", "Useful for recording/streaming");
        this.method9881(new Class4998("Username", "The name which your username is replaced with", "Me"));
    }
    
    @Class6753
    public void method10183(final Class5727 class5727) {
        if (this.method9906()) {
            class5727.method17002(class5727.method17001().replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username")));
        }
    }
    
    @Class6753
    public void method10184(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (method16998 instanceof Class4377) {
                final Class4377 class5724 = (Class4377)method16998;
                if (class5724.method13163() == Class2142.field12614) {
                    final String method16999 = class5724.method13160();
                    if (method16999.contains(Class3230.field15514.method5287().method33692())) {
                        class5723.method16999(new Class4377(class5724.method13163(), class5724.method13161(), method16999.replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username")), class5724.method13162()));
                    }
                }
            }
            if (method16998 instanceof Class4378) {
                final Class4378 class5725 = (Class4378)method16998;
                final String method17000 = class5725.method13164().method8461();
                if (method17000 != null) {
                    if (method17000.contains(Class3230.field15514.method5287().method33692())) {
                        class5723.method16999(new Class4378(new Class2260(method17000.replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username"))), class5725.method13166()));
                    }
                }
            }
            if (method16998 instanceof Class4330) {
                final Class4330 class5726 = (Class4330)method16998;
                final List<Class4646> method17001 = class5726.method13001();
                for (int i = 0; i < method17001.size(); ++i) {
                    final Class4646 class5727 = method17001.get(i);
                    if (class5727.method13872() != null) {
                        final String method17002 = class5727.method13872().method8461();
                        if (method17002.contains(Class3230.field15514.method5287().method33692())) {
                            class5727.field20115 = new Class2260(method17002.replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username")));
                        }
                    }
                }
                class5726.field19388 = method17001;
            }
            if (method16998 instanceof Class4301) {
                final Class4301 class5728 = (Class4301)method16998;
                if (class5728.method12933() == null) {
                    return;
                }
                final String method17003 = class5728.method12933().method8461();
                if (method17003.contains(Class3230.field15514.method5287().method33692())) {
                    class5728.field19289 = new Class2260(method17003.replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username")));
                }
            }
            if (method16998 instanceof Class4352) {
                final Class4352 class5729 = (Class4352)method16998;
                if (class5729.method13074() == null) {
                    return;
                }
                final String method17004 = class5729.method13074().method8461();
                if (method17004.contains(Class3230.field15514.method5287().method33692())) {
                    class5723.method16999(new Class4352(class5729.method13073(), new Class2260(method17004.replaceAll(Class3230.field15514.method5287().method33692(), this.method9887("Username"))), class5729.method13075(), class5729.method13076(), class5729.method13077()));
                }
            }
        }
    }
}

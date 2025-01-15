// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4737 extends Class4712<Class792, Class5900<Class792>>
{
    private static final Class1932 field20346;
    private static final Class1932 field20347;
    private static final Class1932 field20348;
    private static final Class1932 field20349;
    private static final Class1932 field20350;
    private static final Class1932 field20351;
    private static final Class1932 field20352;
    private static final Class1932 field20353;
    
    public Class4737(final Class8551 class8551) {
        super(class8551, new Class5900(), 0.3f);
    }
    
    public Class1932 method14058(final Class792 class792) {
        final String method8259 = Class2116.method8259(class792.method1841().getString());
        if (method8259 != null && "Toast".equals(method8259)) {
            return Class4737.field20352;
        }
        switch (class792.method4444()) {
            default: {
                return Class4737.field20346;
            }
            case 1: {
                return Class4737.field20347;
            }
            case 2: {
                return Class4737.field20348;
            }
            case 3: {
                return Class4737.field20351;
            }
            case 4: {
                return Class4737.field20349;
            }
            case 5: {
                return Class4737.field20350;
            }
            case 99: {
                return Class4737.field20353;
            }
        }
    }
    
    static {
        field20346 = new Class1932("textures/entity/rabbit/brown.png");
        field20347 = new Class1932("textures/entity/rabbit/white.png");
        field20348 = new Class1932("textures/entity/rabbit/black.png");
        field20349 = new Class1932("textures/entity/rabbit/gold.png");
        field20350 = new Class1932("textures/entity/rabbit/salt.png");
        field20351 = new Class1932("textures/entity/rabbit/white_splotched.png");
        field20352 = new Class1932("textures/entity/rabbit/toast.png");
        field20353 = new Class1932("textures/entity/rabbit/caerbannog.png");
    }
}

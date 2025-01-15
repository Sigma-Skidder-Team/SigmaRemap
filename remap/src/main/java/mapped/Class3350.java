// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3350 extends Class3167
{
    private Class7617 field15964;
    private boolean field15965;
    public static boolean field15966;
    public boolean field15967;
    public boolean field15968;
    
    public Class3350() {
        super(Class8013.field32992, "AutoArmor", "Automaticly equips your armor");
        this.field15964 = new Class7617();
        this.field15967 = false;
        this.field15968 = false;
        this.method9881(new Class4999("Fake Items", "Bypass for fake items (AAC).", false));
        this.method9881(new Class4996("Delay", "Inventory clicks delay", 0.3f, Float.class, 0.0f, 1.0f, 0.01f));
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "Basic", "OpenInv", "FakeInv" }));
        this.method9881(new Class5001("Elytra", "Elytra Equip Mode", 0, new String[] { "Ignore", "Equip", "On Use" }));
    }
    
    @Override
    public void method9879() {
        if (!this.field15964.method23937()) {
            this.field15964.method23932();
        }
        this.field15965 = (Class3350.field15514.field4700 instanceof Class518);
        Class3350.field15966 = false;
    }
    
    @Override
    public void method9897() {
        Class3350.field15966 = false;
    }
    
    @Class6753
    @Class6757
    public void method10601(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (!this.field15964.method23937()) {
            this.field15964.method23932();
        }
        if (this.method9887("Mode").equals("OpenInv") && !(Class3350.field15514.field4700 instanceof Class518)) {
            return;
        }
        final long n = (long)(this.method9886("Delay") * 1000.0f);
        final String method9887 = this.method9887("Elytra");
        switch (method9887) {
            case "Ignore": {
                this.field15967 = false;
                break;
            }
            case "Equip": {
                this.field15967 = true;
                break;
            }
            case "On Use": {
                if (!Class3350.field15514.field4684.field2404 && Class3350.field15514.field4684.field2985 == 0 && Class3350.field15514.field4684.field2967 && !this.field15968) {
                    this.field15967 = true;
                    break;
                }
                if (Class3350.field15514.field4684.field2404) {
                    this.field15967 = false;
                    break;
                }
                break;
            }
        }
        this.field15968 = Class3350.field15514.field4684.field2967;
        if (Class3350.field15514.field4700 instanceof Class518) {
            this.field15965 = false;
        }
        if ((Class3350.field15514.field4700 == null || Class3350.field15514.field4700 instanceof Class518 || Class3350.field15514.field4700 instanceof Class535) && this.field15964.method23935() > n) {
            Class3350.field15966 = false;
            this.method10602(this.method9887("Mode").equalsIgnoreCase("FakeInv"));
        }
        for (final Class2215 class5744 : Class2215.values()) {
            if (Class3350.field15514.field4684.field3008.method10878(8 - class5744.method8402()).method20054()) {
                if (Class8639.method29344(8 - class5744.method8402())) {
                    return;
                }
            }
            else if (this.method10604(class5744)) {
                return;
            }
        }
        if (!this.field15965 && !(Class3350.field15514.field4700 instanceof Class518) && this.field15964.method23935() > 0L) {
            this.field15965 = true;
            Class3350.field15514.method5269().method17292(new Class4389(-1));
        }
    }
    
    private void method10602(final boolean b) {
        for (final Class2215 class2215 : Class2215.values()) {
            Label_0107: {
                if (Class3350.field15514.field4684.field3008.method10878(8 - class2215.method8402()).method20054()) {
                    if (Class8639.method29369(Class3350.field15514.field4684.field3008.method10878(8 - class2215.method8402()).method20053())) {
                        if (!this.field15967) {
                            break Label_0107;
                        }
                        if (class2215 != Class2215.field13604) {
                            break Label_0107;
                        }
                    }
                }
                for (int j = 9; j < 45; ++j) {
                    if (Class3350.field15514.field4684.field3008.method10878(j).method20054()) {
                        final ItemStack method20053 = Class3350.field15514.field4684.field3008.method10878(j).method20053();
                        if (method20053.method27622() instanceof Class4080) {
                            if (this.field15967) {
                                if (!(Class3350.field15514.field4684.field3006.method2157(36 + Class2215.field13604.method8402()).method27622() instanceof Class4080)) {
                                    final Class4080 class2216 = (Class4080)method20053.method27622();
                                    if (Class2215.field13604 == class2215) {
                                        if (!Class9463.method35173().method35189().method21551(Class3350.class).method9883("Fake Items") || Class9463.method35173().method35195().method28162(j) >= 1500L) {
                                            this.method10603(b);
                                            if (!(Class3350.field15514.field4684.field3006.method2157(36 + class2215.method8402()).method27622() instanceof Class4099)) {
                                                Class8639.method29323(8 - class2215.method8402(), 0, true);
                                            }
                                            Class8639.method29367(Class3350.field15514.field4684.field3008.field16154, j, 0, Class2133.field12438, Class3350.field15514.field4684, true);
                                            this.field15964.method23934();
                                            Class3350.field15966 = true;
                                            if (this.method9887("Elytra").equals("On Use")) {
                                                Class3350.field15514.method5269().method17292(new Class4336(Class3350.field15514.field4684, Class287.field1599));
                                                Class3350.field15514.field4684.method1830(7, true);
                                            }
                                            if (Class9463.method35173().method35189().method21551(Class3350.class).method9886("Delay") > 0.0f) {
                                                return;
                                            }
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                        if (method20053.method27622() instanceof Class4055) {
                            if (!this.field15967) {
                                final Class4055 class2217 = (Class4055)method20053.method27622();
                                if (class2217.method12257() == class2215) {
                                    if (Class8639.method29369(method20053)) {
                                        if (Class8639.method29347(method20053) > 0) {
                                            if (!Class9463.method35173().method35189().method21551(Class3350.class).method9883("Fake Items") || Class9463.method35173().method35195().method28162(j) >= 1500L) {
                                                this.method10603(b);
                                                final Class3820 method20054 = Class3350.field15514.field4684.field3006.method2157(36 + class2217.method12257().method8402()).method27622();
                                                if (!(method20054 instanceof Class4080)) {
                                                    if (!(method20054 instanceof Class4099)) {
                                                        Class8639.method29368(8 - class2217.method12257().method8402());
                                                    }
                                                }
                                                else {
                                                    Class8639.method29323(8 - class2215.method8402(), 0, true);
                                                }
                                                System.out.println("swap" + method20054);
                                                Class8639.method29367(Class3350.field15514.field4684.field3008.field16154, j, 0, Class2133.field12438, Class3350.field15514.field4684, true);
                                                this.field15964.method23934();
                                                Class3350.field15966 = true;
                                                if (Class9463.method35173().method35189().method21551(Class3350.class).method9886("Delay") > 0.0f) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method10603(final boolean b) {
        if (b) {
            if (this.field15965) {
                if (!(Class3350.field15514.field4700 instanceof Class518)) {
                    Class3350.field15514.method5269().method17292(new Class4323(Class2218.field13623));
                    this.field15965 = false;
                }
            }
        }
    }
    
    private boolean method10604(final Class2215 class2215) {
        for (int i = 9; i < 45; ++i) {
            if (Class3350.field15514.field4684.field3008.method10878(i).method20054()) {
                final Class3820 method27622 = Class3350.field15514.field4684.field3008.method10878(i).method20053().method27622();
                if (method27622 instanceof Class4055) {
                    if (class2215 == ((Class4055)method27622).method12257()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Multimap;

public class Class4077 extends Class4071
{
    private final float field18181;
    private final float field18182;
    
    public Class4077(final Class2038 class2038, final int n, final float field18182, final Class8959 class2039) {
        super(class2038, class2039);
        this.field18182 = field18182;
        this.field18181 = n + class2038.method8111();
    }
    
    public float method12281() {
        return this.field18181;
    }
    
    @Override
    public boolean method11703(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099) {
        return !class7099.method2889();
    }
    
    @Override
    public float method11706(final Class8321 class8321, final Class7096 class8322) {
        if (class8322.method21696() != Class7521.field29240) {
            final Class8059 method21697 = class8322.method21697();
            if (method21697 != Class8059.field33157) {
                if (method21697 != Class8059.field33159) {
                    if (method21697 != Class8059.field33191) {
                        if (!class8322.method21755(Class7188.field27907)) {
                            if (method21697 != Class8059.field33192) {
                                return 1.0f;
                            }
                        }
                    }
                }
            }
            return 1.5f;
        }
        return 15.0f;
    }
    
    @Override
    public boolean method11711(final Class8321 class8321, final Class511 class8322, final Class511 class8323) {
        class8321.method27636(1, class8323, class8324 -> class8324.method2794(Class2215.field13600));
        return true;
    }
    
    @Override
    public boolean method11712(final Class8321 class8321, final Class1847 class8322, final Class7096 class8323, final Class354 class8324, final Class511 class8325) {
        if (class8323.method21718(class8322, class8324) != 0.0f) {
            class8321.method27636(2, class8325, class8326 -> class8326.method2794(Class2215.field13600));
        }
        return true;
    }
    
    @Override
    public boolean method11713(final Class7096 class7096) {
        return class7096.method21696() == Class7521.field29240;
    }
    
    @Override
    public Multimap<String, Class7919> method11739(final Class2215 class2215) {
        final Multimap<String, Class7919> method11739 = super.method11739(class2215);
        if (class2215 == Class2215.field13600) {
            method11739.put((Object)Class8107.field33410.method29978(), (Object)new Class7919(Class4077.field17361, "Weapon modifier", this.field18181, Class2157.field12809));
            method11739.put((Object)Class8107.field33412.method29978(), (Object)new Class7919(Class4077.field17362, "Weapon modifier", this.field18182, Class2157.field12809));
        }
        return method11739;
    }
}

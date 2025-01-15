// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class3600 extends Class3446
{
    private static String[] field16767;
    private final Class787 field16768;
    
    public Class3600(final Class787 field16768) {
        this.field16768 = field16768;
    }
    
    @Override
    public boolean method11013() {
        return this.field16768.field2404 && !this.field16768.field2391.method6702(new Class354(this.field16768)).method21793(Class7324.field28319);
    }
    
    @Override
    public void method11015() {
        Class352 class352 = null;
        for (final Class354 class353 : Class354.method1158(Class9546.method35644(this.field16768.method1938() - 2.0), Class9546.method35644(this.field16768.method1941() - 2.0), Class9546.method35644(this.field16768.method1945() - 2.0), Class9546.method35644(this.field16768.method1938() + 2.0), Class9546.method35644(this.field16768.method1941()), Class9546.method35644(this.field16768.method1945() + 2.0))) {
            if (!this.field16768.field2391.method6702(class353).method21793(Class7324.field28319)) {
                continue;
            }
            class352 = class353;
            break;
        }
        if (class352 != null) {
            this.field16768.method4148().method19907(class352.method1074(), class352.method1075(), class352.method1076(), 1.0);
        }
    }
}

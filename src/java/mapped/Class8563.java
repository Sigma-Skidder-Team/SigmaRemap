// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Preconditions;

public class Class8563
{
    private static Class9366 field35987;
    private static Class9183 field35988;
    
    public static void method28790(final Class9183 field35988) {
        Class8563.field35987 = field35988.method33558();
        Class8563.field35988 = field35988;
    }
    
    public static Class8948 method28791() {
        Preconditions.checkArgument(Class8563.field35987 != null, (Object)"ViaVersion has not loaded the Platform");
        return Class8563.field35987.method34755();
    }
    
    public static Class7493 method28792() {
        Preconditions.checkArgument(Class8563.field35987 != null, (Object)"ViaVersion has not loaded the Platform");
        return Class8563.field35987.method34756();
    }
    
    public static Class9366 method28793() {
        return Class8563.field35987;
    }
    
    public static Class9183 method28794() {
        return Class8563.field35988;
    }
}

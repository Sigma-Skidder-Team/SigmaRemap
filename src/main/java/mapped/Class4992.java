// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;

public class Class4992 implements Class4974
{
    private static String[] field21468;
    public final /* synthetic */ Class7508 field21469;
    
    private Class4992(final Class7508 field21469) {
        this.field21469 = field21469;
    }
    
    @Override
    public Class6287 method15159() {
        if (this.field21469.field29105.method23631(Class2207.field13435, Class2207.field13437, Class2207.field13445)) {
            return new Class4990(this.field21469, null).method15159();
        }
        Class7508.method23431(this.field21469, new Class8342(null, Class7508.method23432()));
        final Class2314 method16348 = this.field21469.field29105.method23632().method16348();
        final Class6291 class6291 = new Class6291(method16348, method16348, false, null, null);
        Class7508.method23433(this.field21469).method24253(new Class4981(this.field21469, null));
        Class7508.method23430(this.field21469, new Class4977(this.field21469, null));
        return class6291;
    }
}

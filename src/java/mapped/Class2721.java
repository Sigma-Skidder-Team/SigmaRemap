// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2721 extends Class2466
{
    public final /* synthetic */ Class3027 field14894;
    
    public Class2721(final Class3027 field14894) {
        this.field14894 = field14894;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        if (s.equalsIgnoreCase("MC|BSign")) {
            final Class7562 class8700 = class8699.method29824(Class5260.field22328);
            if (class8700 != null) {
                class8700.method23744(387);
                Class8458.method28225(class8700);
            }
        }
        if (s.equalsIgnoreCase("MC|AutoCmd")) {
            class8699.method29821(Class5260.field22308, 0, "MC|AdvCdm");
            class8699.method29823(Class5260.field22289, (Byte)0);
            class8699.method29824(Class5260.field22296);
            class8699.method29824(Class5260.field22296);
            class8699.method29824(Class5260.field22296);
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22294);
            class8699.method29827();
        }
        if (s.equalsIgnoreCase("MC|AdvCmd")) {
            class8699.method29821(Class5260.field22308, 0, "MC|AdvCdm");
        }
    }
}

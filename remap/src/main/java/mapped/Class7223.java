// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7223 implements Class7220
{
    public final /* synthetic */ Class3645 field28018;
    
    public Class7223(final Class3645 field28018) {
        this.field28018 = field28018;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if ("minecraft:redstone_wire".equals(class9223.method34010())) {
            Class3645.method11214().add(class9223.method34011());
            Class8881.field37361.put(class9223.method34011(), this.field28018);
            Class3645.method11216().put(Class3645.method11215(class9223), class9223.method34011());
            Class3645.method11217().put(class9223.method34011(), Integer.valueOf(class9223.method34008("power")));
        }
    }
}

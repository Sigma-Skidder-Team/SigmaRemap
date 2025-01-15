// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7230 implements Class7220
{
    public final /* synthetic */ String field28031;
    public final /* synthetic */ Class3651 field28032;
    public final /* synthetic */ Class3651 field28033;
    
    public Class7230(final Class3651 field28033, final String field28034, final Class3651 field28035) {
        this.field28033 = field28033;
        this.field28031 = field28034;
        this.field28032 = field28035;
    }
    
    @Override
    public void method22127(final Class9223 class9223) {
        if (this.field28031.equals(class9223.method34010())) {
            if (class9223.method34009("waterlogged") && class9223.method34008("waterlogged").equals("true")) {
                return;
            }
            Class3651.method11242(this.field28033).add(class9223.method34011());
            Class8881.field37361.put(class9223.method34011(), this.field28032);
            Class3651.method11243(this.field28033).put(this.field28033.method11238(class9223), class9223.method34011());
        }
    }
}

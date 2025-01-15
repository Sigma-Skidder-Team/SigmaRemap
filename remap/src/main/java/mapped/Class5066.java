// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5066 extends Class5053
{
    private static String[] field21716;
    private final Class575 field21717;
    private final String field21718;
    private final int field21719;
    private final int field21720;
    private final int field21721;
    
    public Class5066(final String field21718, final int field21719, final int field21720, final int field21721) {
        this.field21717 = new Class575(this);
        this.field21718 = field21718;
        this.field21719 = field21719;
        this.field21720 = field21720;
        this.field21721 = field21721;
    }
    
    public void method15593(final Class5046 class5046) {
        class5046.method15405(this.field21718, this.field21719, this.field21720, this.field21721);
    }
    
    @Override
    public Class574 method15448() {
        return this.field21717;
    }
    
    public String method15594() {
        return this.field21718;
    }
}

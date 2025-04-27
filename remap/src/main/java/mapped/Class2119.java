// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2119
{
    field12350("all", 1, 11), 
    field12351("fire", 10, 8), 
    field12352("fall", 5, 6), 
    field12353("explosion", 5, 8), 
    field12354("projectile", 3, 6);
    
    private final String field12355;
    private final int field12356;
    private final int field12357;
    
    Class2119(final String field12355, final int field12356, final int field12357) {
        this.field12355 = field12355;
        this.field12356 = field12356;
        this.field12357 = field12357;
    }
    
    public int method8266() {
        return this.field12356;
    }
    
    public int method8267() {
        return this.field12357;
    }
}

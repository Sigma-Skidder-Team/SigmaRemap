// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class107 implements Class103
{
    field332("floor"), 
    field333("wall"), 
    field334("ceiling");
    
    private final String field335;
    
    private Class107(final String field335) {
        this.field335 = field335;
    }
    
    @Override
    public String method596() {
        return this.field335;
    }
}

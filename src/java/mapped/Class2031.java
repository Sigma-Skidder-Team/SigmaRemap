// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2031
{
    field11575(Character.valueOf('\"')), 
    field11576(Character.valueOf('\'')), 
    field11577(Character.valueOf('|')), 
    field11578(Character.valueOf('>')), 
    field11579((Character)null);
    
    private Character field11580;
    
    private Class2031(final Character field11580) {
        this.field11580 = field11580;
    }
    
    public Character method8089() {
        return this.field11580;
    }
    
    @Override
    public String toString() {
        return "Scalar style: '" + this.field11580 + "'";
    }
    
    public static Class2031 method8090(final Character obj) {
        if (obj == null) {
            return Class2031.field11579;
        }
        switch ((char)obj) {
            case '\"': {
                return Class2031.field11575;
            }
            case '\'': {
                return Class2031.field11576;
            }
            case '|': {
                return Class2031.field11577;
            }
            case '>': {
                return Class2031.field11578;
            }
            default: {
                throw new Class2386("Unknown scalar style character: " + obj);
            }
        }
    }
}

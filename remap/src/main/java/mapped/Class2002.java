// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2002
{
    field11219(-1, "unknown", false), 
    field11220(1, "AAC Main Profile", true), 
    field11221(2, "AAC Low Complexity", true), 
    field11222(3, "AAC Scalable Sample Rate", false), 
    field11223(4, "AAC Long Term Prediction", false), 
    field11224(5, "AAC SBR", true), 
    field11225(6, "Scalable AAC", false), 
    field11226(7, "TwinVQ", false), 
    field11227(11, "AAC Low Delay", false), 
    field11228(17, "Error Resilient AAC Low Complexity", true), 
    field11229(18, "Error Resilient AAC SSR", false), 
    field11230(19, "Error Resilient AAC Long Term Prediction", false), 
    field11231(20, "Error Resilient Scalable AAC", false), 
    field11232(21, "Error Resilient TwinVQ", false), 
    field11233(22, "Error Resilient BSAC", false), 
    field11234(23, "Error Resilient AAC Low Delay", false);
    
    private static final Class2002[] field11235;
    private final int field11236;
    private final String field11237;
    private final boolean field11238;
    
    public static Class2002 method8025(final int n) {
        Class2002 field11219;
        if (n > 0 && n <= Class2002.field11235.length) {
            field11219 = Class2002.field11235[n - 1];
        }
        else {
            field11219 = Class2002.field11219;
        }
        return field11219;
    }
    
    Class2002(final int field11236, final String field11237, final boolean field11238) {
        this.field11236 = field11236;
        this.field11237 = field11237;
        this.field11238 = field11238;
    }
    
    public int method8026() {
        return this.field11236;
    }
    
    public String method8027() {
        return this.field11237;
    }
    
    @Override
    public String toString() {
        return this.field11237;
    }
    
    public boolean method8028() {
        return this.field11238;
    }
    
    public boolean method8029() {
        return this.field11236 > 16;
    }
    
    static {
        field11235 = new Class2002[] { Class2002.field11220, Class2002.field11221, Class2002.field11222, Class2002.field11223, Class2002.field11224, Class2002.field11225, Class2002.field11226, null, null, null, Class2002.field11227, null, null, null, null, null, Class2002.field11228, Class2002.field11229, Class2002.field11230, Class2002.field11231, Class2002.field11232, Class2002.field11233, Class2002.field11234 };
    }
}

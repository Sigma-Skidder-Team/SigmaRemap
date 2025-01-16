// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2187
{
    field12967("tx"), 
    field12968("ty"), 
    field12969("tz"), 
    field12970("rx"), 
    field12971("ry"), 
    field12972("rz"), 
    field12973("sx"), 
    field12974("sy"), 
    field12975("sz");
    
    private String field12976;
    public static Class2187[] field12977;
    
    private Class2187(final String field12976) {
        this.field12976 = field12976;
    }
    
    public String method8353() {
        return this.field12976;
    }
    
    public float method8354(final Class6300 class6300) {
        switch (Class6719.field26453[this.ordinal()]) {
            case 1: {
                return class6300.field25180;
            }
            case 2: {
                return class6300.field25181;
            }
            case 3: {
                return class6300.field25182;
            }
            case 4: {
                return class6300.field25183;
            }
            case 5: {
                return class6300.field25184;
            }
            case 6: {
                return class6300.field25185;
            }
            case 7: {
                return class6300.field25192;
            }
            case 8: {
                return class6300.field25193;
            }
            case 9: {
                return class6300.field25194;
            }
            default: {
                Config.warn("GetFloat not supported for: " + this);
                return 0.0f;
            }
        }
    }
    
    public void method8355(final Class6300 class6300, final float field25194) {
        switch (Class6719.field26453[this.ordinal()]) {
            case 1: {
                class6300.field25180 = field25194;
                return;
            }
            case 2: {
                class6300.field25181 = field25194;
                return;
            }
            case 3: {
                class6300.field25182 = field25194;
                return;
            }
            case 4: {
                class6300.field25183 = field25194;
                return;
            }
            case 5: {
                class6300.field25184 = field25194;
                return;
            }
            case 6: {
                class6300.field25185 = field25194;
                return;
            }
            case 7: {
                class6300.field25192 = field25194;
                return;
            }
            case 8: {
                class6300.field25193 = field25194;
                return;
            }
            case 9: {
                class6300.field25194 = field25194;
                return;
            }
            default: {
                Config.warn("SetFloat not supported for: " + this);
            }
        }
    }
    
    public static Class2187 method8356(final String anObject) {
        for (int i = 0; i < Class2187.field12977.length; ++i) {
            final Class2187 class2187 = Class2187.field12977[i];
            if (class2187.method8353().equals(anObject)) {
                return class2187;
            }
        }
        return null;
    }
    
    static {
        Class2187.field12977 = values();
    }
}

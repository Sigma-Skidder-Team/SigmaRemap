// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2001
{
    field11207(-1, "invalid"), 
    field11208(0, "No channel"), 
    field11209(1, "Mono"), 
    field11210(2, "Stereo"), 
    field11211(3, "Stereo+Center"), 
    field11212(4, "Stereo+Center+Rear"), 
    field11213(5, "Five channels"), 
    field11214(6, "Five channels+LF"), 
    field11215(8, "Seven channels+LF");
    
    private final int field11216;
    private final String field11217;
    
    public static Class2001 method8022(final int n) {
        Class2001 class2001 = null;
        switch (n) {
            case 0: {
                class2001 = Class2001.field11208;
                break;
            }
            case 1: {
                class2001 = Class2001.field11209;
                break;
            }
            case 2: {
                class2001 = Class2001.field11210;
                break;
            }
            case 3: {
                class2001 = Class2001.field11211;
                break;
            }
            case 4: {
                class2001 = Class2001.field11212;
                break;
            }
            case 5: {
                class2001 = Class2001.field11213;
                break;
            }
            case 6: {
                class2001 = Class2001.field11214;
                break;
            }
            case 7:
            case 8: {
                class2001 = Class2001.field11215;
                break;
            }
            default: {
                class2001 = Class2001.field11207;
                break;
            }
        }
        return class2001;
    }
    
    Class2001(final int field11216, final String field11217) {
        this.field11216 = field11216;
        this.field11217 = field11217;
    }
    
    public int method8023() {
        return this.field11216;
    }
    
    public String method8024() {
        return this.field11217;
    }
    
    @Override
    public String toString() {
        return this.field11217;
    }
}

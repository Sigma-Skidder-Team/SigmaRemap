// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7840
{
    public static final int field32094 = 1;
    public static final int field32095 = 2;
    public static final int field32096 = 3;
    public static final int field32097 = 4;
    private static Class6448 field32098;
    private static Class6020 field32099;
    
    public static void method25326(final int i) {
        switch (i) {
            case 1: {
                method25329(new Class6447());
                return;
            }
            case 2: {
                method25329(new Class6446());
                return;
            }
            default: {
                throw new RuntimeException("Unknown renderer type: " + i);
            }
        }
    }
    
    public static void method25327(final int i) {
        switch (i) {
            case 3: {
                method25328(new Class6021());
                return;
            }
            case 4: {
                method25328(new Class6019());
                return;
            }
            default: {
                throw new RuntimeException("Unknown line strip renderer type: " + i);
            }
        }
    }
    
    public static void method25328(final Class6020 field32099) {
        Class7840.field32099 = field32099;
    }
    
    public static void method25329(final Class6448 field32098) {
        Class7840.field32098 = field32098;
    }
    
    public static Class6448 method25330() {
        return Class7840.field32098;
    }
    
    public static Class6020 method25331() {
        return Class7840.field32099;
    }
    
    static {
        Class7840.field32098 = new Class6447();
        Class7840.field32099 = new Class6021();
    }
}

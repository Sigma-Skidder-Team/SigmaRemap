// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8864
{
    public static void main(final String[] array) throws Exception {
        final Class1963[] values = Class1963.values();
        for (int i = 0; i < values.length; ++i) {
            final Class1963 obj = values[i];
            method31047("******** " + obj + " ***********");
            method31046(obj, false);
        }
    }
    
    private static void method31046(final Class1963 class1963, final boolean field41105) {
        Class9546.field41105 = field41105;
        double n = 0.0;
        double n2 = 0.0;
        switch (Class9195.field38972[class1963.ordinal()]) {
            case 1:
            case 2: {
                n = -Class9546.field41099;
                n2 = Class9546.field41099;
                break;
            }
            case 3:
            case 4: {
                n = -1.0;
                n2 = 1.0;
                break;
            }
            default: {
                return;
            }
        }
        for (int n3 = 10, i = 0; i <= n3; ++i) {
            final double d = n + i * (n2 - n) / n3;
            float f = 0.0f;
            float f2 = 0.0f;
            switch (Class9195.field38972[class1963.ordinal()]) {
                case 1: {
                    f = (float)Math.sin(d);
                    f2 = Class9546.method35638((float)d);
                    break;
                }
                case 2: {
                    f = (float)Math.cos(d);
                    f2 = Class9546.method35639((float)d);
                    break;
                }
                case 3: {
                    f = (float)Math.asin(d);
                    f2 = Class8500.method28401((float)d);
                    break;
                }
                case 4: {
                    f = (float)Math.acos(d);
                    f2 = Class8500.method28402((float)d);
                    break;
                }
                default: {
                    return;
                }
            }
            method31047(String.format("%.2f, Math: %f, Helper: %f, diff: %f", d, f, f2, Math.abs(f - f2)));
        }
    }
    
    public static void method31047(final String x) {
        System.out.println(x);
    }
}

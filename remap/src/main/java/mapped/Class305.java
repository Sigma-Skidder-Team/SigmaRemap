// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.HashMap;
import java.util.Map;

public enum Class305
{
    field1773(10, Class2212.field13483, "+", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1774(10, Class2212.field13483, "-", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1775(11, Class2212.field13483, "*", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1776(11, Class2212.field13483, "/", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1777(11, Class2212.field13483, "%", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1778(12, Class2212.field13483, "neg", new Class2212[] { Class2212.field13483 }), 
    field1779(Class2212.field13483, "pi", new Class2212[0]), 
    field1780(Class2212.field13483, "sin", new Class2212[] { Class2212.field13483 }), 
    field1781(Class2212.field13483, "cos", new Class2212[] { Class2212.field13483 }), 
    field1782(Class2212.field13483, "asin", new Class2212[] { Class2212.field13483 }), 
    field1783(Class2212.field13483, "acos", new Class2212[] { Class2212.field13483 }), 
    field1784(Class2212.field13483, "tan", new Class2212[] { Class2212.field13483 }), 
    field1785(Class2212.field13483, "atan", new Class2212[] { Class2212.field13483 }), 
    field1786(Class2212.field13483, "atan2", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1787(Class2212.field13483, "torad", new Class2212[] { Class2212.field13483 }), 
    field1788(Class2212.field13483, "todeg", new Class2212[] { Class2212.field13483 }), 
    field1789(Class2212.field13483, "min", (Class7693)new Class7694().method24473(Class2212.field13483).method24474(Class2212.field13483)), 
    field1790(Class2212.field13483, "max", (Class7693)new Class7694().method24473(Class2212.field13483).method24474(Class2212.field13483)), 
    field1791(Class2212.field13483, "clamp", new Class2212[] { Class2212.field13483, Class2212.field13483, Class2212.field13483 }), 
    field1792(Class2212.field13483, "abs", new Class2212[] { Class2212.field13483 }), 
    field1793(Class2212.field13483, "floor", new Class2212[] { Class2212.field13483 }), 
    field1794(Class2212.field13483, "ceil", new Class2212[] { Class2212.field13483 }), 
    field1795(Class2212.field13483, "exp", new Class2212[] { Class2212.field13483 }), 
    field1796(Class2212.field13483, "frac", new Class2212[] { Class2212.field13483 }), 
    field1797(Class2212.field13483, "log", new Class2212[] { Class2212.field13483 }), 
    field1798(Class2212.field13483, "pow", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1799(Class2212.field13483, "random", new Class2212[0]), 
    field1800(Class2212.field13483, "round", new Class2212[] { Class2212.field13483 }), 
    field1801(Class2212.field13483, "signum", new Class2212[] { Class2212.field13483 }), 
    field1802(Class2212.field13483, "sqrt", new Class2212[] { Class2212.field13483 }), 
    field1803(Class2212.field13483, "fmod", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1804(Class2212.field13483, "time", new Class2212[0]), 
    field1805(Class2212.field13483, "if", (Class7693)new Class7694().method24473(Class2212.field13485, Class2212.field13483).method24474(Class2212.field13485, Class2212.field13483).method24475(Class2212.field13483)), 
    field1806(12, Class2212.field13485, "!", new Class2212[] { Class2212.field13485 }), 
    field1807(3, Class2212.field13485, "&&", new Class2212[] { Class2212.field13485, Class2212.field13485 }), 
    field1808(2, Class2212.field13485, "||", new Class2212[] { Class2212.field13485, Class2212.field13485 }), 
    field1809(8, Class2212.field13485, ">", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1810(8, Class2212.field13485, ">=", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1811(8, Class2212.field13485, "<", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1812(8, Class2212.field13485, "<=", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1813(7, Class2212.field13485, "==", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1814(7, Class2212.field13485, "!=", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1815(7, Class2212.field13485, "between", new Class2212[] { Class2212.field13483, Class2212.field13483, Class2212.field13483 }), 
    field1816(7, Class2212.field13485, "equals", new Class2212[] { Class2212.field13483, Class2212.field13483, Class2212.field13483 }), 
    field1817(Class2212.field13485, "in", (Class7693)new Class7694().method24473(Class2212.field13483).method24474(Class2212.field13483).method24475(Class2212.field13483)), 
    field1818(Class2212.field13483, "smooth", (Class7693)new Class7694().method24473(Class2212.field13483).method24474(Class2212.field13483).method24476(4)), 
    field1819(Class2212.field13485, "true", new Class2212[0]), 
    field1820(Class2212.field13485, "false", new Class2212[0]), 
    field1821(Class2212.field13484, "vec2", new Class2212[] { Class2212.field13483, Class2212.field13483 }), 
    field1822(Class2212.field13484, "vec3", new Class2212[] { Class2212.field13483, Class2212.field13483, Class2212.field13483 }), 
    field1823(Class2212.field13484, "vec4", new Class2212[] { Class2212.field13483, Class2212.field13483, Class2212.field13483, Class2212.field13483 });
    
    private int field1824;
    private Class2212 field1825;
    private String field1826;
    private Class7693 field1827;
    public static Class305[] field1828;
    private static final Map<Integer, Float> field1829;
    
    private Class305(final Class2212 class2212, final String s2, final Class2212[] array) {
        this(0, class2212, s2, array);
    }
    
    private Class305(final int n2, final Class2212 class2212, final String s2, final Class2212[] array) {
        this(n2, class2212, s2, new Class7695(array));
    }
    
    private Class305(final Class2212 class2212, final String s2, final Class7693 class2213) {
        this(0, class2212, s2, class2213);
    }
    
    private Class305(final int field1824, final Class2212 field1825, final String field1826, final Class7693 field1827) {
        this.field1824 = field1824;
        this.field1825 = field1825;
        this.field1826 = field1826;
        this.field1827 = field1827;
    }
    
    public String method962() {
        return this.field1826;
    }
    
    public int method963() {
        return this.field1824;
    }
    
    public Class2212 method964() {
        return this.field1825;
    }
    
    public Class7693 method965() {
        return this.field1827;
    }
    
    public int method966(final Class327[] array) {
        return this.field1827.method24467(array).length;
    }
    
    public Class2212[] method967(final Class327[] array) {
        return this.field1827.method24467(array);
    }
    
    public float method968(final Class327[] array) {
        switch (Class6513.field25890[this.ordinal()]) {
            case 1: {
                return method971(array, 0) + method971(array, 1);
            }
            case 2: {
                return method971(array, 0) - method971(array, 1);
            }
            case 3: {
                return method971(array, 0) * method971(array, 1);
            }
            case 4: {
                return method971(array, 0) / method971(array, 1);
            }
            case 5: {
                final float method971 = method971(array, 0);
                final float method972 = method971(array, 1);
                return method971 - method972 * (int)(method971 / method972);
            }
            case 6: {
                return -method971(array, 0);
            }
            case 7: {
                return MathHelper.field41099;
            }
            case 8: {
                return MathHelper.sin(method971(array, 0));
            }
            case 9: {
                return MathHelper.cos(method971(array, 0));
            }
            case 10: {
                return Class8500.method28401(method971(array, 0));
            }
            case 11: {
                return Class8500.method28402(method971(array, 0));
            }
            case 12: {
                return (float)Math.tan(method971(array, 0));
            }
            case 13: {
                return (float)Math.atan(method971(array, 0));
            }
            case 14: {
                return (float) MathHelper.method35693(method971(array, 0), method971(array, 1));
            }
            case 15: {
                return Class8500.method28408(method971(array, 0));
            }
            case 16: {
                return Class8500.method28407(method971(array, 0));
            }
            case 17: {
                return this.method969(array);
            }
            case 18: {
                return this.method970(array);
            }
            case 19: {
                return MathHelper.clamp(method971(array, 0), method971(array, 1), method971(array, 2));
            }
            case 20: {
                return MathHelper.method35647(method971(array, 0));
            }
            case 21: {
                return (float)Math.exp(method971(array, 0));
            }
            case 22: {
                return (float) MathHelper.method35642(method971(array, 0));
            }
            case 23: {
                return (float) MathHelper.method35649(method971(array, 0));
            }
            case 24: {
                return MathHelper.method35686(method971(array, 0));
            }
            case 25: {
                return (float)Math.log(method971(array, 0));
            }
            case 26: {
                return (float)Math.pow(method971(array, 0), method971(array, 1));
            }
            case 27: {
                return (float)Math.random();
            }
            case 28: {
                return (float)Math.round(method971(array, 0));
            }
            case 29: {
                return Math.signum(method971(array, 0));
            }
            case 30: {
                return MathHelper.method35640(method971(array, 0));
            }
            case 31: {
                final float method973 = method971(array, 0);
                final float method974 = method971(array, 1);
                return method973 - method974 * MathHelper.method35642(method973 / method974);
            }
            case 32: {
                final Class869 method975 = Class869.method5277();
                final Class1848 field4683 = method975.field4683;
                if (field4683 == null) {
                    return 0.0f;
                }
                return field4683.method6754() % 24000L + method975.method5314();
            }
            case 33: {
                final int n = (array.length - 1) / 2;
                for (int i = 0; i < n; ++i) {
                    final int n2 = i * 2;
                    if (method973(array, n2)) {
                        return method971(array, n2 + 1);
                    }
                }
                return method971(array, n * 2);
            }
            case 34: {
                final int n3 = (int)method971(array, 0);
                final float method976 = method971(array, 1);
                final float n4 = (array.length > 2) ? method971(array, 2) : 1.0f;
                return Class7901.method25570(n3, method976, n4, (array.length > 3) ? method971(array, 3) : n4);
            }
            default: {
                Class8571.method28848("Unknown function type: " + this);
                return 0.0f;
            }
        }
    }
    
    private float method969(final Class327[] array) {
        if (array.length != 2) {
            float method971 = method971(array, 0);
            for (int i = 1; i < array.length; ++i) {
                final float method972 = method971(array, i);
                if (method972 < method971) {
                    method971 = method972;
                }
            }
            return method971;
        }
        return Math.min(method971(array, 0), method971(array, 1));
    }
    
    private float method970(final Class327[] array) {
        if (array.length != 2) {
            float method971 = method971(array, 0);
            for (int i = 1; i < array.length; ++i) {
                final float method972 = method971(array, i);
                if (method972 > method971) {
                    method971 = method972;
                }
            }
            return method971;
        }
        return Math.max(method971(array, 0), method971(array, 1));
    }
    
    private static float method971(final Class327[] array, final int n) {
        return ((Class328)array[n]).method1009();
    }
    
    public boolean method972(final Class327[] array) {
        switch (Class6513.field25890[this.ordinal()]) {
            case 35: {
                return true;
            }
            case 36: {
                return false;
            }
            case 37: {
                return !method973(array, 0);
            }
            case 38: {
                return method973(array, 0) && method973(array, 1);
            }
            case 39: {
                return method973(array, 0) || method973(array, 1);
            }
            case 40: {
                return method971(array, 0) > method971(array, 1);
            }
            case 41: {
                return method971(array, 0) >= method971(array, 1);
            }
            case 42: {
                return method971(array, 0) < method971(array, 1);
            }
            case 43: {
                return method971(array, 0) <= method971(array, 1);
            }
            case 44: {
                return method971(array, 0) == method971(array, 1);
            }
            case 45: {
                return method971(array, 0) != method971(array, 1);
            }
            case 46: {
                final float method971 = method971(array, 0);
                return method971 >= method971(array, 1) && method971 <= method971(array, 2);
            }
            case 47: {
                return Math.abs(method971(array, 0) - method971(array, 1)) <= method971(array, 2);
            }
            case 48: {
                final float method972 = method971(array, 0);
                for (int i = 1; i < array.length; ++i) {
                    if (method972 == method971(array, i)) {
                        return true;
                    }
                }
                return false;
            }
            default: {
                Class8571.method28848("Unknown function type: " + this);
                return false;
            }
        }
    }
    
    private static boolean method973(final Class327[] array, final int n) {
        return ((Class326)array[n]).method1006();
    }
    
    public float[] method974(final Class327[] array) {
        switch (Class6513.field25890[this.ordinal()]) {
            case 49: {
                return new float[] { method971(array, 0), method971(array, 1) };
            }
            case 50: {
                return new float[] { method971(array, 0), method971(array, 1), method971(array, 2) };
            }
            case 51: {
                return new float[] { method971(array, 0), method971(array, 1), method971(array, 2), method971(array, 3) };
            }
            default: {
                Class8571.method28848("Unknown function type: " + this);
                return null;
            }
        }
    }
    
    public static Class305 method975(final String anObject) {
        for (int i = 0; i < Class305.field1828.length; ++i) {
            final Class305 class305 = Class305.field1828[i];
            if (class305.method962().equals(anObject)) {
                return class305;
            }
        }
        return null;
    }
    
    static {
        Class305.field1828 = values();
        field1829 = new HashMap<Integer, Float>();
    }
}

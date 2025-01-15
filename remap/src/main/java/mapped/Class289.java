// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class289
{
    field1606("biome"), 
    field1607("biome_category"), 
    field1608("biome_precipitation"), 
    field1609("temperature"), 
    field1610("rainfall"), 
    field1611((Class5147)Class9216.field39161), 
    field1612((Class5147)Class9216.field39162), 
    field1613((Class5147)Class9216.field39163), 
    field1614((Class5147)Class9216.field39164), 
    field1615((Class5147)Class9216.field39169), 
    field1616((Class5147)Class9216.field39170), 
    field1617((Class5147)Class9216.field39171), 
    field1618((Class5147)Class9216.field39172), 
    field1619((Class5147)Class9216.field39173), 
    field1620((Class5147)Class9216.field39174), 
    field1621((Class5147)Class9216.field39175), 
    field1622((Class5147)Class9216.field39176), 
    field1623((Class5147)Class9216.field39177), 
    field1624((Class5147)Class9216.field39178), 
    field1625((Class5147)Class9216.field39179), 
    field1626((Class5147)Class9216.field39180), 
    field1627((Class5147)Class9216.field39181), 
    field1628((Class5147)Class9216.field39182), 
    field1629((Class5147)Class9216.field39199), 
    field1630((Class5147)Class9216.field39200), 
    field1631((Class5147)Class9216.field39201, new String[] { "x", "y" }), 
    field1632((Class5147)Class9216.field39203, new String[] { "x", "y" }), 
    field1633((Class5147)Class9216.field39204), 
    field1634((Class5147)Class9216.field39205), 
    field1635((Class5147)Class9216.field39206), 
    field1636((Class5147)Class9216.field39207), 
    field1637((Class5147)Class9216.field39208), 
    field1638((Class5147)Class9216.field39209), 
    field1639((Class5147)Class9216.field39210), 
    field1640((Class5147)Class9216.field39211, new String[] { "x", "y" }), 
    field1641((Class5147)Class9216.field39188, new String[] { "x", "y", "z" }), 
    field1642((Class5147)Class9216.field39187, new String[] { "x", "y", "z" }), 
    field1643((Class5147)Class9216.field39183, new String[] { "x", "y", "z" }), 
    field1644((Class5147)Class9216.field39184, new String[] { "x", "y", "z" }), 
    field1645((Class5147)Class9216.field39185, new String[] { "x", "y", "z" }), 
    field1646((Class5147)Class9216.field39186, new String[] { "x", "y", "z" }), 
    field1647((Class5147)Class9216.field39168, new String[] { "r", "g", "b" }), 
    field1648((Class5147)Class9216.field39192, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1649((Class5147)Class9216.field39193, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1650((Class5147)Class9216.field39191, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1651((Class5147)Class9216.field39189, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1652((Class5147)Class9216.field39190, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1653((Class5147)Class9216.field39194, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1654((Class5147)Class9216.field39195, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1655((Class5147)Class9216.field39196, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1656((Class5147)Class9216.field39197, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" }), 
    field1657((Class5147)Class9216.field39198, new String[] { "0", "1", "2", "3" }, new String[] { "0", "1", "2", "3" });
    
    private String field1658;
    private Class5147 field1659;
    private String[] field1660;
    private String[] field1661;
    
    private Class289(final String field1658) {
        this.field1658 = field1658;
    }
    
    private Class289(final Class5147 field1659) {
        this.field1658 = field1659.method16081();
        this.field1659 = field1659;
        if (method942(field1659, Class5154.class, Class5153.class)) {
            return;
        }
        throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + field1659.getClass().getName());
    }
    
    private Class289(final Class5147 field1659, final String[] field1660) {
        this.field1658 = field1659.method16081();
        this.field1659 = field1659;
        this.field1660 = field1660;
        if (method942(field1659, Class5148.class, Class5149.class, Class5151.class, Class5155.class)) {
            return;
        }
        throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + field1659.getClass().getName());
    }
    
    private Class289(final Class5147 field1659, final String[] field1660, final String[] field1661) {
        this.field1658 = field1659.method16081();
        this.field1659 = field1659;
        this.field1660 = field1660;
        this.field1661 = field1661;
        if (method942(field1659, Class5150.class)) {
            return;
        }
        throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + field1659.getClass().getName());
    }
    
    public String method937() {
        return this.field1658;
    }
    
    public Class5147 method938() {
        return this.field1659;
    }
    
    public String[] method939() {
        return this.field1660;
    }
    
    public String[] method940() {
        return this.field1661;
    }
    
    public float method941(final int i, final int j) {
        if (this.field1660 != null && (i < 0 || i > this.field1660.length)) {
            Class8571.method28848("Invalid index1, parameter: " + this + ", index: " + i);
            return 0.0f;
        }
        if (this.field1661 != null && (j < 0 || j > this.field1661.length)) {
            Class8571.method28848("Invalid index2, parameter: " + this + ", index: " + j);
            return 0.0f;
        }
        switch (Class8103.field33366[this.ordinal()]) {
            case 1: {
                return (float)Class90.field217.method504(Class9216.method33918().method6959(Class9216.method33919()));
            }
            case 2: {
                final Class3090 method6959 = Class9216.method33918().method6959(Class9216.method33919());
                return (method6959 != null) ? ((float)method6959.method9870().ordinal()) : 0.0f;
            }
            case 3: {
                final Class3090 method6960 = Class9216.method33918().method6959(Class9216.method33919());
                return (method6960 != null) ? ((float)method6960.method9841().ordinal()) : 0.0f;
            }
            case 4: {
                final BlockPos method6961 = Class9216.method33919();
                final Class3090 method6962 = Class9216.method33918().method6959(method6961);
                return (method6962 != null) ? method6962.method9845(method6961) : 0.0f;
            }
            case 5: {
                final Class3090 method6963 = Class9216.method33918().method6959(Class9216.method33919());
                return (method6963 != null) ? method6963.method9863() : 0.0f;
            }
            default: {
                if (this.field1659 instanceof Class5154) {
                    return ((Class5154)this.field1659).method16102();
                }
                if (this.field1659 instanceof Class5153) {
                    return (float)((Class5153)this.field1659).method16100();
                }
                if (this.field1659 instanceof Class5148) {
                    return (float)((Class5148)this.field1659).method16090()[i];
                }
                if (this.field1659 instanceof Class5149) {
                    return ((Class5149)this.field1659).method16092()[i];
                }
                if (this.field1659 instanceof Class5151) {
                    return ((Class5151)this.field1659).method16096()[i];
                }
                if (this.field1659 instanceof Class5155) {
                    return ((Class5155)this.field1659).method16104()[i];
                }
                if (this.field1659 instanceof Class5150) {
                    return ((Class5150)this.field1659).method16094(i, j);
                }
                throw new IllegalArgumentException("Unknown uniform type: " + this);
            }
        }
    }
    
    private static boolean method942(final Object o, final Class... array) {
        if (o != null) {
            final Class<?> class1 = o.getClass();
            for (int i = 0; i < array.length; ++i) {
                if (array[i].isAssignableFrom(class1)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

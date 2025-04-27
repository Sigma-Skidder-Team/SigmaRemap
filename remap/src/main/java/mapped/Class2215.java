// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2215
{
    field13600(Group.field1681, 0, 0, "mainhand"),
    field13601(Group.field1681, 1, 5, "offhand"),
    field13602(Group.field1682, 0, 1, "feet"),
    field13603(Group.field1682, 1, 2, "legs"),
    field13604(Group.field1682, 2, 3, "chest"),
    field13605(Group.field1682, 3, 4, "head");
    
    private final Group field13606;
    private final int field13607;
    private final int field13608;
    private final String field13609;
    
    Class2215(final Group field13606, final int field13607, final int field13608, final String field13609) {
        this.field13606 = field13606;
        this.field13607 = field13607;
        this.field13608 = field13608;
        this.field13609 = field13609;
    }
    
    public Group getSlotType() {
        return this.field13606;
    }
    
    public int getIndex() {
        return this.field13607;
    }
    
    public int method8403() {
        return this.field13608;
    }
    
    public String method8404() {
        return this.field13609;
    }
    
    public static Class2215 method8405(final String s) {
        for (final Class2215 class2215 : values()) {
            if (class2215.method8404().equals(s)) {
                return class2215;
            }
        }
        throw new IllegalArgumentException("Invalid slot '" + s + "'");
    }
    
    public static Class2215 method8406(final Group obj, final int i) {
        for (final Class2215 class2215 : values()) {
            if (class2215.getSlotType() == obj && class2215.getIndex() == i) {
                return class2215;
            }
        }
        throw new IllegalArgumentException("Invalid slot '" + obj + "': " + i);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class242
{
    field1190("ALL", 0) {
        public Class248(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            for (final Class242 class3821 : Class242.values()) {
                if (class3821 != Class242.field1190 && class3821.method894(class3820)) {
                    return true;
                }
            }
            return false;
        }
    }, 
    field1191("ARMOR", 1) {
        public Class256(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4055;
        }
    }, 
    field1192("ARMOR_FEET", 2) {
        public Class246(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4055 && ((Class4055)class3820).method12257() == Class2215.field13602;
        }
    }, 
    field1193("ARMOR_LEGS", 3) {
        public Class245(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4055 && ((Class4055)class3820).method12257() == Class2215.field13603;
        }
    }, 
    field1194("ARMOR_CHEST", 4) {
        public Class250(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4055 && ((Class4055)class3820).method12257() == Class2215.field13604;
        }
    }, 
    field1195("ARMOR_HEAD", 5) {
        public Class253(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4055 && ((Class4055)class3820).method12257() == Class2215.field13605;
        }
    }, 
    field1196("WEAPON", 6) {
        public Class251(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4077;
        }
    }, 
    field1197("DIGGER", 7) {
        public Class244(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4072;
        }
    }, 
    field1198("FISHING_ROD", 8) {
        public Class254(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4047;
        }
    }, 
    field1199("TRIDENT", 9) {
        public Class252(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4102;
        }
    }, 
    field1200("BREAKABLE", 10) {
        public Class247(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820.method11710();
        }
    }, 
    field1201("BOW", 11) {
        public Class249(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4087;
        }
    }, 
    field1202("WEARABLE", 12) {
        public Class243(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            final Class3833 method11776 = Class3833.method11776(class3820);
            if (!(class3820 instanceof Class4055)) {
                if (!(class3820 instanceof Class4080)) {
                    if (!(method11776 instanceof Class3932)) {
                        if (!(method11776 instanceof Class3901)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }, 
    field1203("CROSSBOW", 13) {
        public Class255(final String s, final int n) {
        }
        
        @Override
        public boolean method894(final Class3820 class3820) {
            return class3820 instanceof Class4086;
        }
    };
    
    public abstract boolean method894(final Class3820 p0);
}

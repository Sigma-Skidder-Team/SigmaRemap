// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.BitSet;

public class Class9145
{
    private static String[] field38736;
    private Class7096 field38737;
    private Class354 field38738;
    private int field38739;
    private int field38740;
    private int field38741;
    private int field38742;
    private float[] field38743;
    private BitSet field38744;
    private Class9436 field38745;
    private Class384 field38746;
    private boolean[] field38747;
    private boolean[] field38748;
    private boolean[] field38749;
    private Class179[] field38750;
    private List<Class8754> field38751;
    private List<Class8754> field38752;
    private Class8754[] field38753;
    private Class8754[] field38754;
    private Class8754[] field38755;
    private Class8754[] field38756;
    private Class9226 field38757;
    private Class8040[] field38758;
    private boolean field38759;
    private Long2ByteLinkedOpenHashMap field38760;
    private static final int field38761 = -1;
    private static final int field38762 = 0;
    private static final int field38763 = 1;
    
    public Class9145(final Class7096 field38737, final Class354 field38738) {
        this.field38739 = -1;
        this.field38740 = -1;
        this.field38741 = -1;
        this.field38742 = -1;
        this.field38743 = new float[Class179.field524.length * 2];
        this.field38744 = new BitSet(3);
        this.field38745 = new Class9436();
        this.field38746 = null;
        this.field38747 = null;
        this.field38748 = null;
        this.field38749 = null;
        this.field38750 = null;
        this.field38751 = new ArrayList<Class8754>();
        this.field38752 = new ArrayList<Class8754>();
        this.field38753 = new Class8754[1];
        this.field38754 = new Class8754[2];
        this.field38755 = new Class8754[3];
        this.field38756 = new Class8754[4];
        this.field38757 = null;
        this.field38758 = new Class8040[Class6332.field25344.length];
        this.field38759 = false;
        this.field38760 = new Long2ByteLinkedOpenHashMap();
        this.field38737 = field38737;
        this.field38738 = field38738;
    }
    
    public void method33373(final Class7096 field38737, final Class354 field38738) {
        if (this.field38737 != field38737 || this.field38738 != field38738) {
            this.field38737 = field38737;
            this.field38738 = field38738;
            this.field38739 = -1;
            this.field38740 = -1;
            this.field38741 = -1;
            this.field38742 = -1;
            this.field38744.clear();
        }
    }
    
    public int method33374() {
        if (this.field38739 < 0) {
            this.field38739 = this.field38737.method21691();
        }
        return this.field38739;
    }
    
    public int method33375() {
        if (this.field38740 < 0) {
            this.field38740 = this.field38737.method21692();
        }
        return this.field38740;
    }
    
    public float[] method33376() {
        return this.field38743;
    }
    
    public BitSet method33377() {
        return this.field38744;
    }
    
    public Class9436 method33378() {
        return this.field38745;
    }
    
    public boolean method33379(final List list) {
        if (this.field38741 == -1) {
            if (list.size() > 0) {
                if (!(list.get(0) instanceof Class8755)) {
                    this.field38741 = 0;
                }
                else {
                    this.field38741 = 1;
                }
            }
        }
        return this.field38741 == 1;
    }
    
    public boolean method33380(final Class8754 class8754) {
        if (this.field38741 < 0) {
            if (!(class8754 instanceof Class8755)) {
                this.field38741 = 0;
            }
            else {
                this.field38741 = 1;
            }
        }
        return this.field38741 == 1;
    }
    
    public boolean method33381() {
        return this.field38741 == 1;
    }
    
    public Class7096 method33382() {
        return this.field38737;
    }
    
    public Class384 method33383() {
        if (this.field38746 == null) {
            this.field38746 = new Class384(0, 0, 0);
        }
        return this.field38746;
    }
    
    public boolean[] method33384() {
        if (this.field38747 == null) {
            this.field38747 = new boolean[4];
        }
        return this.field38747;
    }
    
    public boolean[] method33385() {
        if (this.field38748 == null) {
            this.field38748 = new boolean[4];
        }
        return this.field38748;
    }
    
    public boolean[] method33386() {
        if (this.field38749 == null) {
            this.field38749 = new boolean[4];
        }
        return this.field38749;
    }
    
    public Class179[] method33387() {
        if (this.field38750 == null) {
            this.field38750 = new Class179[4];
        }
        return this.field38750;
    }
    
    public Class179[] method33388(final Class179 class179, final Class179 class180, final Class179 class181, final Class179 class182) {
        final Class179[] method33387 = this.method33387();
        method33387[0] = class179;
        method33387[1] = class180;
        method33387[2] = class181;
        method33387[3] = class182;
        return method33387;
    }
    
    public boolean method33389() {
        if (this.field38742 == -1) {
            if (Class8571.method28862() && this.field38737.method21696() instanceof Class3972) {
                this.field38742 = 1;
            }
            else {
                this.field38742 = 0;
            }
        }
        return this.field38742 == 1;
    }
    
    public List<Class8754> method33390() {
        return this.field38751;
    }
    
    public Class8754[] method33391(final Class8754 class8754) {
        this.field38753[0] = class8754;
        return this.field38753;
    }
    
    public Class8754[] method33392(final Class8754 class8754, final Class8754 class8755) {
        this.field38754[0] = class8754;
        this.field38754[1] = class8755;
        return this.field38754;
    }
    
    public Class8754[] method33393(final Class8754 class8754, final Class8754 class8755, final Class8754 class8756) {
        this.field38755[0] = class8754;
        this.field38755[1] = class8755;
        this.field38755[2] = class8756;
        return this.field38755;
    }
    
    public Class8754[] method33394(final Class8754 class8754, final Class8754 class8755, final Class8754 class8756, final Class8754 class8757) {
        this.field38756[0] = class8754;
        this.field38756[1] = class8755;
        this.field38756[2] = class8756;
        this.field38756[3] = class8757;
        return this.field38756;
    }
    
    public List<Class8754> method33395(final Class8754[] array) {
        this.field38752.clear();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                this.field38752.add(array[i]);
            }
        }
        return this.field38752;
    }
    
    public Class9226 method33396() {
        return this.field38757;
    }
    
    public void method33397(final Class9226 field38757) {
        this.field38757 = field38757;
    }
    
    public Class8040 method33398(final Class6332 class6332) {
        Class8040 class6333 = this.field38758[class6332.method18759()];
        if (class6333 == null) {
            class6333 = new Class8040();
            this.field38758[class6332.method18759()] = class6333;
        }
        return class6333;
    }
    
    public boolean method33399() {
        return this.field38759;
    }
    
    public void method33400(final boolean field38759) {
        this.field38759 = field38759;
    }
    
    public Long2ByteLinkedOpenHashMap method33401() {
        return this.field38760;
    }
}

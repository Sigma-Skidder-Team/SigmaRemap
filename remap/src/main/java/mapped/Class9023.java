// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.nio.IntBuffer;

public class Class9023
{
    private final int field38139;
    private final String field38140;
    private final Class2219 field38141;
    private final Class9023 field38142;
    private Class6684 field38143;
    private Class9075 field38144;
    private Class9529 field38145;
    private final Boolean[] field38146;
    private int field38147;
    private int field38148;
    private String field38149;
    private IntBuffer field38150;
    private IntBuffer field38151;
    private int field38152;
    private int field38153;
    private final boolean[] field38154;
    
    public Class9023(final int field38139, final String field38140, final Class2219 field38141, final Class9023 field38142) {
        this.field38146 = new Boolean[8];
        this.field38154 = new boolean[8];
        this.field38139 = field38139;
        this.field38140 = field38140;
        this.field38141 = field38141;
        this.field38142 = field38142;
    }
    
    public Class9023(final int field38139, final String field38140, final Class2219 field38141, final boolean b) {
        this.field38146 = new Boolean[8];
        this.field38154 = new boolean[8];
        this.field38139 = field38139;
        this.field38140 = field38140;
        this.field38141 = field38141;
        this.field38142 = (b ? this : null);
    }
    
    public void method32321() {
        this.field38143 = null;
        this.field38144 = null;
        this.field38145 = null;
        Arrays.fill(this.field38146, null);
    }
    
    public void method32322() {
        this.field38147 = 0;
        this.field38148 = 0;
    }
    
    public void method32323() {
        this.field38149 = null;
        this.field38152 = 0;
        this.field38153 = 0;
        if (this.field38151 == null) {
            this.field38151 = Class9216.method33700(8);
        }
    }
    
    public void method32324(final Class9023 class9023) {
        this.field38147 = class9023.method32329();
        this.field38143 = class9023.method32336();
        this.field38144 = class9023.method32337();
        this.field38145 = class9023.method32338();
        System.arraycopy(class9023.method32339(), 0, this.field38146, 0, this.field38146.length);
        this.field38149 = class9023.method32331();
        this.field38150 = class9023.method32332();
        this.field38152 = class9023.method32334();
        this.field38153 = class9023.method32335();
        System.arraycopy(class9023.method32340(), 0, this.field38154, 0, this.field38154.length);
    }
    
    public int method32325() {
        return this.field38139;
    }
    
    public String method32326() {
        return this.field38140;
    }
    
    public Class2219 method32327() {
        return this.field38141;
    }
    
    public Class9023 method32328() {
        return this.field38142;
    }
    
    public int method32329() {
        return this.field38147;
    }
    
    public int method32330() {
        return this.field38148;
    }
    
    public String method32331() {
        return this.field38149;
    }
    
    public IntBuffer method32332() {
        return this.field38150;
    }
    
    public IntBuffer method32333() {
        return this.field38151;
    }
    
    public int method32334() {
        return this.field38152;
    }
    
    public int method32335() {
        return this.field38153;
    }
    
    public Class6684 method32336() {
        return this.field38143;
    }
    
    public Class9075 method32337() {
        return this.field38144;
    }
    
    public Class9529 method32338() {
        return this.field38145;
    }
    
    public Boolean[] method32339() {
        return this.field38146;
    }
    
    public boolean[] method32340() {
        return this.field38154;
    }
    
    public void method32341(final int field38147) {
        this.field38147 = field38147;
    }
    
    public void method32342(final int field38148) {
        this.field38148 = field38148;
    }
    
    public void method32343(final String field38149) {
        this.field38149 = field38149;
    }
    
    public void method32344(final IntBuffer field38150) {
        this.field38150 = field38150;
    }
    
    public void method32345(final int field38152) {
        this.field38152 = field38152;
    }
    
    public void method32346(final int field38153) {
        this.field38153 = field38153;
    }
    
    public void method32347(final Class6684 field38143) {
        this.field38143 = field38143;
    }
    
    public void method32348(final Class9075 field38144) {
        this.field38144 = field38144;
    }
    
    public void method32349(final Class9529 field38145) {
        this.field38145 = field38145;
    }
    
    public String method32350() {
        if (this.field38147 != 0) {
            Class9023 method32328;
            for (method32328 = this; method32328.method32330() != this.field38147; method32328 = method32328.method32328()) {
                if (method32328.method32328() == null || method32328.method32328() == method32328) {
                    return "unknown";
                }
            }
            return method32328.method32326();
        }
        return "none";
    }
    
    @Override
    public String toString() {
        return "name: " + this.field38140 + ", id: " + this.field38147 + ", ref: " + this.field38148 + ", real: " + this.method32350();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.List;

public class Class6560 implements Class6562
{
    public int field26053;
    public int field26054;
    public boolean field26055;
    public int field26056;
    public Class7668[] field26057;
    public int[] field26058;
    public Class74 field26059;
    public List<Class74> field26060;
    
    public Class6560(final int field26053, final int field26054, final boolean field26055, final int field26056, final Class7668[] field26057, final int[] field26058, final List<Class74> field26059) {
        this.field26053 = field26053;
        this.field26054 = field26054;
        this.field26055 = field26055;
        this.field26056 = field26056;
        this.field26057 = field26057;
        this.field26058 = field26058;
        this.field26060 = field26059;
    }
    
    @Override
    public boolean method19884() {
        return this.field26058 != null;
    }
    
    public Class6560(final int field26053, final int field26054, final boolean field26055, final int field26056, final Class7668[] field26057, final int[] field26058, final Class74 field26059, final List<Class74> field26060) {
        this.field26053 = field26053;
        this.field26054 = field26054;
        this.field26055 = field26055;
        this.field26056 = field26056;
        this.field26057 = field26057;
        this.field26058 = field26058;
        this.field26059 = field26059;
        this.field26060 = field26060;
    }
    
    @Override
    public int method19885() {
        return this.field26053;
    }
    
    @Override
    public int method19886() {
        return this.field26054;
    }
    
    @Override
    public boolean method19887() {
        return this.field26055;
    }
    
    @Override
    public int method19888() {
        return this.field26056;
    }
    
    @Override
    public Class7668[] method19889() {
        return this.field26057;
    }
    
    @Override
    public int[] method19890() {
        return this.field26058;
    }
    
    @Override
    public Class74 method19891() {
        return this.field26059;
    }
    
    @Override
    public List<Class74> method19892() {
        return this.field26060;
    }
    
    public void method19893(final int field26053) {
        this.field26053 = field26053;
    }
    
    public void method19894(final int field26054) {
        this.field26054 = field26054;
    }
    
    public void method19895(final boolean field26055) {
        this.field26055 = field26055;
    }
    
    public void method19896(final int field26056) {
        this.field26056 = field26056;
    }
    
    public void method19897(final Class7668[] field26057) {
        this.field26057 = field26057;
    }
    
    @Override
    public void method19898(final int[] field26058) {
        this.field26058 = field26058;
    }
    
    @Override
    public void method19899(final Class74 field26059) {
        this.field26059 = field26059;
    }
    
    public void method19900(final List<Class74> field26060) {
        this.field26060 = field26060;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class6560)) {
            return false;
        }
        final Class6560 class6560 = (Class6560)o;
        if (!class6560.method19901(this)) {
            return false;
        }
        if (this.method19885() != class6560.method19885()) {
            return false;
        }
        if (this.method19886() != class6560.method19886()) {
            return false;
        }
        if (this.method19887() != class6560.method19887()) {
            return false;
        }
        if (this.method19888() != class6560.method19888()) {
            return false;
        }
        if (!Arrays.deepEquals(this.method19889(), class6560.method19889())) {
            return false;
        }
        if (Arrays.equals(this.method19890(), class6560.method19890())) {
            final Class74 method19891 = this.method19891();
            final Class74 method19892 = class6560.method19891();
            if (method19891 != null) {
                if (!method19891.equals(method19892)) {
                    return false;
                }
            }
            else if (method19892 != null) {
                return false;
            }
            final List<Class74> method19893 = this.method19892();
            final List<Class74> method19894 = class6560.method19892();
            if (method19893 != null) {
                if (!method19893.equals(method19894)) {
                    return false;
                }
            }
            else if (method19894 != null) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public boolean method19901(final Object o) {
        return o instanceof Class6560;
    }
    
    @Override
    public int hashCode() {
        final int n = (((((1 * 59 + this.method19885()) * 59 + this.method19886()) * 59 + (this.method19887() ? 79 : 97)) * 59 + this.method19888()) * 59 + Arrays.deepHashCode(this.method19889())) * 59 + Arrays.hashCode(this.method19890());
        final Class74 method19891 = this.method19891();
        final int n2 = n * 59 + ((method19891 != null) ? method19891.hashCode() : 43);
        final List<Class74> method19892 = this.method19892();
        return n2 * 59 + ((method19892 != null) ? method19892.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "BaseChunk(x=" + this.method19885() + ", z=" + this.method19886() + ", groundUp=" + this.method19887() + ", bitmask=" + this.method19888() + ", sections=" + Arrays.deepToString(this.method19889()) + ", biomeData=" + Arrays.toString(this.method19890()) + ", heightMap=" + this.method19891() + ", blockEntities=" + this.method19892() + ")";
    }
}

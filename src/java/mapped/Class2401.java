// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class2401 extends Class2400
{
    private ArrayList field14224;
    private float field14225;
    private Class2400 field14226;
    private Class2400 field14227;
    
    public Class2401(final Class2400 field14227) {
        (this.field14224 = new ArrayList()).add(field14227);
        this.field14212 = new float[field14227.field14212.length];
        this.field14226 = field14227;
        this.field14227 = field14227;
    }
    
    public void method9560(final Class2400 e) {
        if (e.field14212.length == this.field14212.length) {
            final Class2400 e2 = this.field14224.get(this.field14224.size() - 1);
            if (!this.method9561(e2, e)) {
                this.field14224.add(e);
            }
            else {
                this.field14224.add(e2);
            }
            if (this.field14224.size() == 2) {
                this.field14227 = this.field14224.get(1);
            }
            return;
        }
        throw new RuntimeException("Attempt to morph between two shapes with different vertex counts");
    }
    
    private boolean method9561(final Class2400 class2400, final Class2400 class2401) {
        class2400.method9552();
        class2401.method9552();
        for (int i = 0; i < class2400.field14212.length; ++i) {
            if (class2400.field14212[i] != class2401.field14212[i]) {
                return false;
            }
        }
        return true;
    }
    
    public void method9562(final float n) {
        final int n2 = (int)n;
        this.method9566(this.method9565(n2), this.method9565(n2 + 1), n - n2);
    }
    
    public void method9563(final float n) {
        this.field14225 += n;
        if (this.field14225 >= 0.0f) {
            if (this.field14225 <= 1.0f) {
                this.field14221 = true;
            }
            else {
                int index = this.field14224.indexOf(this.field14227);
                if (index < 1) {
                    index = 0;
                }
                this.method9566(index, this.method9565(index + 1), this.field14225);
                --this.field14225;
            }
        }
        else {
            int index2 = this.field14224.indexOf(this.field14226);
            if (index2 < 0) {
                index2 = this.field14224.size() - 1;
            }
            this.method9566(index2, this.method9565(index2 + 1), this.field14225);
            ++this.field14225;
        }
    }
    
    public void method9564(final Class2400 field14226) {
        this.field14226 = field14226;
        this.field14227 = this.field14224.get(0);
        this.field14225 = 0.0f;
    }
    
    private int method9565(int i) {
        while (i >= this.field14224.size()) {
            i -= this.field14224.size();
        }
        while (i < 0) {
            i += this.field14224.size();
        }
        return i;
    }
    
    private void method9566(final int index, final int index2, final float field14225) {
        this.field14226 = this.field14224.get(index);
        this.field14227 = this.field14224.get(index2);
        this.field14225 = field14225;
        this.field14221 = true;
    }
    
    @Override
    public void method9520() {
        if (this.field14226 != this.field14227) {
            final float[] field14212 = this.field14226.field14212;
            final float[] field14213 = this.field14227.field14212;
            for (int i = 0; i < this.field14212.length; ++i) {
                this.field14212[i] = field14212[i] * (1.0f - this.field14225);
                final float[] field14214 = this.field14212;
                final int n = i;
                field14214[n] += field14213[i] * this.field14225;
            }
            return;
        }
        System.arraycopy(this.field14226.field14212, 0, this.field14212, 0, this.field14212.length);
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        this.method9520();
        return new Class2410(this.field14212);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8407 extends Class8406 implements Class8404
{
    private static String[] field34510;
    
    @Override
    public void method28050() {
        if (this.field34517 != 3) {
            if (this.field34517 != 1) {
                for (int i = 0; i < this.field34518; ++i) {
                    this.field34519[i] = new Class5707(i);
                }
            }
            else {
                int j;
                for (j = 0; j < this.field34512.method29667(); ++j) {
                    this.field34519[j] = new Class5707(j);
                }
                while (j < this.field34518) {
                    this.field34519[j] = new Class5708(j);
                    ++j;
                }
            }
        }
        else {
            for (int k = 0; k < this.field34518; ++k) {
                this.field34519[k] = new Class5706(k);
            }
        }
    }
    
    @Override
    public void method28052() {
        for (int i = 0; i < this.field34518; ++i) {
            ((Class5706)this.field34519[i]).method16960(this.field34511, this.field34520);
        }
    }
}

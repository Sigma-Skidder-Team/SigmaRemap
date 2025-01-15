// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import jaco.mp3.resources.DecoderException;

public class Class8406 implements Class8404
{
    private static String[] field34510;
    public Class2341 field34511;
    public Class8664 field34512;
    public Class8560 field34513;
    public Class8560 field34514;
    public Class7037 field34515;
    public int field34516;
    public int field34517;
    public int field34518;
    public Class5705[] field34519;
    public Class9410 field34520;
    
    public Class8406() {
        this.field34520 = null;
        this.field34520 = new Class9410();
    }
    
    public void method28049(final Class2341 field34511, final Class8664 field34512, final Class8560 field34513, final Class8560 field34514, final Class7037 field34515, final int field34516) {
        this.field34511 = field34511;
        this.field34512 = field34512;
        this.field34513 = field34513;
        this.field34514 = field34514;
        this.field34515 = field34515;
        this.field34516 = field34516;
    }
    
    @Override
    public void method28031() throws DecoderException {
        this.field34518 = this.field34512.method29666();
        this.field34519 = new Class5705[32];
        this.field34517 = this.field34512.method29642();
        this.method28050();
        this.method28051();
        this.method28052();
        if (this.field34520 != null || this.field34512.method29649()) {
            this.method28053();
            this.method28054();
        }
    }
    
    public void method28050() {
        if (this.field34517 != 3) {
            if (this.field34517 != 1) {
                for (int i = 0; i < this.field34518; ++i) {
                    this.field34519[i] = new Class5710(i);
                }
            }
            else {
                int j;
                for (j = 0; j < this.field34512.method29667(); ++j) {
                    this.field34519[j] = new Class5710(j);
                }
                while (j < this.field34518) {
                    this.field34519[j] = new Class5711(j);
                    ++j;
                }
            }
        }
        else {
            for (int k = 0; k < this.field34518; ++k) {
                this.field34519[k] = new Class5709(k);
            }
        }
    }
    
    public void method28051() throws DecoderException {
        for (int i = 0; i < this.field34518; ++i) {
            this.field34519[i].method16954(this.field34511, this.field34512, this.field34520);
        }
    }
    
    public void method28052() {
    }
    
    public void method28053() {
        for (int i = 0; i < this.field34518; ++i) {
            this.field34519[i].method16955(this.field34511, this.field34512);
        }
    }
    
    public void method28054() {
        boolean method16956 = false;
        boolean method16957 = false;
        final int method16958 = this.field34512.method29642();
        while (true) {
            for (int i = 0; i < this.field34518; ++i) {
                method16956 = this.field34519[i].method16956(this.field34511);
            }
            do {
                for (int j = 0; j < this.field34518; ++j) {
                    method16957 = this.field34519[j].method16957(this.field34516, this.field34513, this.field34514);
                }
                this.field34513.method28775(this.field34515);
                if (this.field34516 == 0) {
                    if (method16958 != 3) {
                        this.field34514.method28775(this.field34515);
                    }
                }
            } while (!method16957);
            if (!method16956) {
                continue;
            }
            break;
        }
    }
}

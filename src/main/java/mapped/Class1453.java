// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1453 implements Runnable
{
    public final /* synthetic */ Class273 field8053;
    public final /* synthetic */ long field8054;
    public final /* synthetic */ long field8055;
    public final /* synthetic */ Class11 field8056;
    public final /* synthetic */ Class11 field8057;
    
    public Class1453(final Class273 field8053, final long field8054, final long field8055, final Class11 field8056, final Class11 field8057) {
        this.field8053 = field8053;
        this.field8054 = field8054;
        this.field8055 = field8055;
        this.field8056 = field8056;
        this.field8057 = field8057;
    }
    
    @Override
    public void run() {
        switch (Class9207.field39004[this.field8053.ordinal()]) {
            case 2: {
                for (long field8054 = this.field8054; field8054 < this.field8055; ++field8054) {
                    this.field8056.method159(field8054, this.field8057.method125(field8054));
                }
                break;
            }
            case 12: {
                for (long field8055 = this.field8054; field8055 < this.field8055; ++field8055) {
                    this.field8056.method161(field8055, this.field8057.method127(field8055));
                }
                break;
            }
            case 3: {
                for (long field8056 = this.field8054; field8056 < this.field8055; ++field8056) {
                    this.field8056.method163(field8056, this.field8057.method129(field8056));
                }
                break;
            }
            case 4: {
                for (long field8057 = this.field8054; field8057 < this.field8055; ++field8057) {
                    this.field8056.method165(field8057, this.field8057.method131(field8057));
                }
                break;
            }
            case 5: {
                for (long field8058 = this.field8054; field8058 < this.field8055; ++field8058) {
                    this.field8056.method167(field8058, this.field8057.method133(field8058));
                }
                break;
            }
            case 6: {
                for (long field8059 = this.field8054; field8059 < this.field8055; ++field8059) {
                    this.field8056.method169(field8059, this.field8057.method135(field8059));
                }
                break;
            }
            case 7: {
                for (long field8060 = this.field8054; field8060 < this.field8055; ++field8060) {
                    this.field8056.method171(field8060, this.field8057.method137(field8060));
                }
                break;
            }
            case 8: {
                if (this.field8057.method119() == Class273.field1493) {
                    for (long field8061 = this.field8054; field8061 < this.field8055; ++field8061) {
                        ((Class14)this.field8056).method198(field8061, ((Class21)this.field8057).method222(field8061));
                    }
                    break;
                }
                for (long field8062 = this.field8054; field8062 < this.field8055; ++field8062) {
                    this.field8056.method169(field8062, this.field8057.method135(field8062));
                }
                break;
            }
            case 9: {
                if (this.field8057.method119() == Class273.field1492) {
                    for (long field8063 = this.field8054; field8063 < this.field8055; ++field8063) {
                        ((Class21)this.field8056).method226(field8063, ((Class14)this.field8057).method192(field8063));
                    }
                    break;
                }
                for (long field8064 = this.field8054; field8064 < this.field8055; ++field8064) {
                    this.field8056.method171(field8064, this.field8057.method137(field8064));
                }
                break;
            }
            case 10: {
                for (long field8065 = this.field8054; field8065 < this.field8055; ++field8065) {
                    this.field8056.method154(field8065, this.field8057.method120(field8065).toString());
                }
                break;
            }
            case 11: {
                for (long field8066 = this.field8054; field8066 < this.field8055; ++field8066) {
                    this.field8056.method154(field8066, this.field8057.method120(field8066));
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3366 extends Class3355
{
    private int field16026;
    private int field16027;
    private int field16028;
    private int field16029;
    
    public Class3366() {
        super("Hypixel", "Hypixel bypass", Class8013.field32985);
        this.method9881(new Class4999("Fire resistance potions", "Automatically drink fire pots", true));
        this.field16026 = -1;
        this.field16029 = -1;
    }
    
    @Override
    public void method9879() {
        this.field16026 = -1;
        this.field16028 = 20;
        this.field16029 = -1;
    }
    
    @Class6753
    public void method10697(final Class5744 class5744) {
        if (this.method9906()) {
            if (class5744.method17046()) {
                if (!(Class3366.field15514.field4700 instanceof Class726)) {
                    if (this.field16028 < 20) {
                        ++this.field16028;
                    }
                    if (this.field16029 == -1) {
                        if (this.field16028 >= 20) {
                            if (this.field16026 == -1) {
                                if (Class3366.field15514.field4684.method2664() <= this.method9914().method9886("Health") * 2.0f) {
                                    if (Class3366.field15514.field4684.method2750() == 0.0f) {
                                        this.field16029 = ((Class3263)this.method9914()).method10292(false);
                                        if (this.field16029 >= 0) {
                                            this.field16026 = 0;
                                            this.field16028 = 0;
                                        }
                                    }
                                }
                                if (this.field16026 == -1) {
                                    if (this.method9883("Fire resistance potions")) {
                                        if (!Class3366.field15514.field4684.method2653(Class5328.method16450(12))) {
                                            this.field16029 = ((Class3263)this.method9914()).method10292(true);
                                            if (this.field16029 >= 0) {
                                                this.field16026 = 0;
                                                this.field16028 = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field16029 >= 0) {
                        if (this.field16026 >= 0) {
                            ++this.field16026;
                            if (this.field16026 == 2) {
                                class5744.method17041(class5744.method17040() + 1.0f);
                            }
                            if (this.field16026 != 1) {
                                if (this.field16026 >= 3) {
                                    Class3366.field15514.method5269().method17292(new Class4307(Class316.field1877));
                                    Class3366.field15514.method5269().method17292(new Class4321(this.field16029 + ((this.field16029 != 8) ? 1 : -1)));
                                    Class3366.field15514.method5269().method17292(new Class4321(this.field16029));
                                    Class3366.field15514.field4684.field3006.field2743 = this.field16027;
                                    this.field16027 = -1;
                                    this.field16026 = -1;
                                    this.field16029 = -1;
                                }
                            }
                            else {
                                this.field16027 = Class3366.field15514.field4684.field3006.field2743;
                                Class3366.field15514.field4684.field3006.field2743 = this.field16029;
                            }
                        }
                    }
                }
            }
        }
    }
}

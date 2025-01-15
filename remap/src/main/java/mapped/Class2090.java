// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2090
{
    field12082(0.0f, 1.0f, Class3175.method9953().field4648.field23436), 
    field12083(2.0f, 1.0f, Class3175.method9954().field4648.field23438), 
    field12084(1.0f, 0.0f, Class3175.method9955().field4648.field23435), 
    field12085(1.0f, 1.0f, Class3175.method9956().field4648.field23437), 
    field12086(0.0f, 2.0f, 74, Class3175.method9957().field4648.field23446), 
    field12087(1.02f, 2.0f, 73, Class3175.method9958().field4648.field23445);
    
    public float field12088;
    public float field12089;
    public int field12090;
    public int field12091;
    public int field12092;
    public Class350 field12093;
    
    private Class2090(final float field12088, final float field12089, final Class350 field12090) {
        this.field12090 = 48;
        this.field12091 = 48;
        this.field12092 = 3;
        this.field12088 = field12088;
        this.field12089 = field12089;
        this.field12093 = field12090;
    }
    
    private Class2090(final float field12088, final float field12089, final int field12090, final Class350 field12091) {
        this.field12090 = 48;
        this.field12091 = 48;
        this.field12092 = 3;
        this.field12088 = field12088;
        this.field12089 = field12089;
        this.field12093 = field12091;
        this.field12090 = field12090;
    }
    
    public Class8883 method8208() {
        return new Class8883(this, (int)(this.field12088 * (this.field12090 + this.field12092)), (int)(this.field12089 * (this.field12091 + this.field12092)));
    }
    
    public Class8883 method8209() {
        return new Class8883(this, this.field12090, this.field12091);
    }
    
    public Class350 method8210() {
        if (this == Class2090.field12082) {
            return Class3175.method9959().field4648.field23436;
        }
        if (this == Class2090.field12083) {
            return Class3175.method9960().field4648.field23438;
        }
        if (this == Class2090.field12084) {
            return Class3175.method9961().field4648.field23435;
        }
        if (this == Class2090.field12085) {
            return Class3175.method9962().field4648.field23437;
        }
        if (this == Class2090.field12086) {
            return Class3175.method9963().field4648.field23446;
        }
        if (this != Class2090.field12087) {
            return null;
        }
        return Class3175.method9964().field4648.field23445;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6999
{
    public boolean field27301;
    public boolean field27302;
    public boolean field27303;
    public boolean field27304;
    public boolean field27305;
    private float field27306;
    private float field27307;
    
    public Class6999() {
        this.field27305 = true;
        this.field27306 = 0.05f;
        this.field27307 = 0.1f;
    }
    
    public void method21423(final CompoundNBT class51) {
        final CompoundNBT class52 = new CompoundNBT();
        class52.putBoolean("invulnerable", this.field27301);
        class52.putBoolean("flying", this.field27302);
        class52.putBoolean("mayfly", this.field27303);
        class52.putBoolean("instabuild", this.field27304);
        class52.putBoolean("mayBuild", this.field27305);
        class52.putFloat("flySpeed", this.field27306);
        class52.putFloat("walkSpeed", this.field27307);
        class51.put("abilities", class52);
    }
    
    public void method21424(final CompoundNBT class51) {
        if (class51.contains("abilities", 10)) {
            final CompoundNBT method327 = class51.getCompound("abilities");
            this.field27301 = method327.getBoolean("invulnerable");
            this.field27302 = method327.getBoolean("flying");
            this.field27303 = method327.getBoolean("mayfly");
            this.field27304 = method327.getBoolean("instabuild");
            if (method327.contains("flySpeed", 99)) {
                this.field27306 = method327.getFloat("flySpeed");
                this.field27307 = method327.getFloat("walkSpeed");
            }
            if (method327.contains("mayBuild", 1)) {
                this.field27305 = method327.getBoolean("mayBuild");
            }
        }
    }
    
    public float method21425() {
        return this.field27306;
    }
    
    public void method21426(final float field27306) {
        this.field27306 = field27306;
    }
    
    public float method21427() {
        return this.field27307;
    }
    
    public void method21428(final float field27307) {
        this.field27307 = field27307;
    }
}

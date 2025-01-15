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
    
    public void method21423(final Class51 class51) {
        final Class51 class52 = new Class51();
        class52.method312("invulnerable", this.field27301);
        class52.method312("flying", this.field27302);
        class52.method312("mayfly", this.field27303);
        class52.method312("instabuild", this.field27304);
        class52.method312("mayBuild", this.field27305);
        class52.method304("flySpeed", this.field27306);
        class52.method304("walkSpeed", this.field27307);
        class51.method295("abilities", class52);
    }
    
    public void method21424(final Class51 class51) {
        if (class51.method316("abilities", 10)) {
            final Class51 method327 = class51.method327("abilities");
            this.field27301 = method327.method329("invulnerable");
            this.field27302 = method327.method329("flying");
            this.field27303 = method327.method329("mayfly");
            this.field27304 = method327.method329("instabuild");
            if (method327.method316("flySpeed", 99)) {
                this.field27306 = method327.method321("flySpeed");
                this.field27307 = method327.method321("walkSpeed");
            }
            if (method327.method316("mayBuild", 1)) {
                this.field27305 = method327.method329("mayBuild");
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

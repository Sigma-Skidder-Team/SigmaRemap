// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class Class7929
{
    public static final Class7929 field32562;
    public static final Class7929 field32563;
    public static final Class7929 field32564;
    public static final Class7929 field32565;
    public static final Class7929 field32566;
    public static final Class7929 field32567;
    public static final Class7929 field32568;
    public static final Class7929 field32569;
    public static final Class7929 field32570;
    public static final Class7929 field32571;
    public static final Class7929 field32572;
    public static final Class7929 field32573;
    public static final Class7929 field32574;
    public static final Class7929 field32575;
    public static final Class7929 field32576;
    public static final Class7929 field32577;
    public static final Class7929 field32578;
    public static final Class7929 field32579;
    public static final Class7929 field32580;
    public static final Class7929 field32581;
    public static final Class7929 field32582;
    public static final Class7929 field32583;
    private boolean field32584;
    private boolean field32585;
    private boolean field32586;
    private float field32587;
    private boolean field32588;
    private boolean field32589;
    private boolean field32590;
    private boolean field32591;
    private boolean field32592;
    public final String field32593;
    
    public static Class7929 method25692(final Class511 class511) {
        return new Class7930("sting", class511);
    }
    
    public static Class7929 method25693(final Class511 class511) {
        return new Class7930("mob", class511);
    }
    
    public static Class7929 method25694(final Entity class399, final Class511 class400) {
        return new Class7931("mob", class399, class400);
    }
    
    public static Class7929 method25695(final Class512 class512) {
        return new Class7930("player", class512);
    }
    
    public static Class7929 method25696(final Class402 class402, final Entity class403) {
        return new Class7931("arrow", class402, class403).method25706();
    }
    
    public static Class7929 method25697(final Entity class399, final Entity class400) {
        return new Class7931("trident", class399, class400).method25706();
    }
    
    public static Class7929 method25698(final Class419 class419, final Entity class420) {
        return (class420 != null) ? new Class7931("fireball", class419, class420).method25718().method25706() : new Class7931("onFire", class419, class419).method25718().method25706();
    }
    
    public static Class7929 method25699(final Entity class399, final Entity class400) {
        return new Class7931("thrown", class399, class400).method25706();
    }
    
    public static Class7929 method25700(final Entity class399, final Entity class400) {
        return new Class7931("indirectMagic", class399, class400).method25715().method25724();
    }
    
    public static Class7929 method25701(final Entity class399) {
        return new Class7930("thorns", class399).method25727().method25724();
    }
    
    public static Class7929 method25702(final Class6154 class6154) {
        return (class6154 != null && class6154.method18414() != null) ? new Class7930("explosion.player", class6154.method18414()).method25721().method25708() : new Class7929("explosion").method25721().method25708();
    }
    
    public static Class7929 method25703(final Class511 class511) {
        return (class511 == null) ? new Class7929("explosion").method25721().method25708() : new Class7930("explosion.player", class511).method25721().method25708();
    }
    
    public static Class7929 method25704() {
        return new Class7928();
    }
    
    public boolean method25705() {
        return this.field32589;
    }
    
    public Class7929 method25706() {
        this.field32589 = true;
        return this;
    }
    
    public boolean method25707() {
        return this.field32592;
    }
    
    public Class7929 method25708() {
        this.field32592 = true;
        return this;
    }
    
    public boolean method25709() {
        return this.field32584;
    }
    
    public float method25710() {
        return this.field32587;
    }
    
    public boolean method25711() {
        return this.field32585;
    }
    
    public boolean method25712() {
        return this.field32586;
    }
    
    public Class7929(final String field32593) {
        this.field32587 = 0.1f;
        this.field32593 = field32593;
    }
    
    @Nullable
    public Entity method25713() {
        return this.method25714();
    }
    
    @Nullable
    public Entity method25714() {
        return null;
    }
    
    public Class7929 method25715() {
        this.field32584 = true;
        this.field32587 = 0.0f;
        return this;
    }
    
    public Class7929 method25716() {
        this.field32585 = true;
        return this;
    }
    
    public Class7929 method25717() {
        this.field32586 = true;
        this.field32587 = 0.0f;
        return this;
    }
    
    public Class7929 method25718() {
        this.field32588 = true;
        return this;
    }
    
    public ITextComponent method25690(final Class511 class511) {
        final Class511 method2700 = class511.method2700();
        final String string = "death.attack." + this.field32593;
        final String string2 = string + ".player";
        return (method2700 == null) ? new Class2259(string, new Object[] { class511.getDisplayName() }) : new Class2259(string2, new Object[] { class511.getDisplayName(), method2700.getDisplayName() });
    }
    
    public boolean method25719() {
        return this.field32588;
    }
    
    public String method25720() {
        return this.field32593;
    }
    
    public Class7929 method25721() {
        this.field32590 = true;
        return this;
    }
    
    public boolean method25722() {
        return this.field32590;
    }
    
    public boolean method25723() {
        return this.field32591;
    }
    
    public Class7929 method25724() {
        this.field32591 = true;
        return this;
    }
    
    public boolean method25725() {
        final Entity method25714 = this.method25714();
        return method25714 instanceof Class512 && ((Class512)method25714).field3025.field27304;
    }
    
    @Nullable
    public Vec3d method25726() {
        return null;
    }
    
    static {
        field32562 = new Class7929("inFire").method25718();
        field32563 = new Class7929("lightningBolt");
        field32564 = new Class7929(Class7929.\u4628\u4407\u7e3a\uaf2e\ucb49\ub327[5]).method25715().method25718();
        field32565 = new Class7929("lava").method25718();
        field32566 = new Class7929("hotFloor").method25718();
        field32567 = new Class7929("inWall").method25715();
        field32568 = new Class7929("cramming").method25715();
        field32569 = new Class7929("drown").method25715();
        field32570 = new Class7929("starve").method25715().method25717();
        field32571 = new Class7929("cactus");
        field32572 = new Class7929("fall").method25715();
        field32573 = new Class7929("flyIntoWall").method25715();
        field32574 = new Class7929("outOfWorld").method25715().method25716();
        field32575 = new Class7929("generic").method25715();
        field32576 = new Class7929("magic").method25715().method25724();
        field32577 = new Class7929("wither").method25715();
        field32578 = new Class7929("anvil");
        field32579 = new Class7929("fallingBlock");
        field32580 = new Class7929("dragonBreath").method25715();
        field32581 = new Class7929("fireworks").method25708();
        field32582 = new Class7929("dryout");
        field32583 = new Class7929("sweetBerryBush");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class DamageSource
{
    public static final DamageSource field32562;
    public static final DamageSource LIGHTNING_BOLT;
    public static final DamageSource field32564;
    public static final DamageSource field32565;
    public static final DamageSource field32566;
    public static final DamageSource field32567;
    public static final DamageSource field32568;
    public static final DamageSource field32569;
    public static final DamageSource field32570;
    public static final DamageSource field32571;
    public static final DamageSource field32572;
    public static final DamageSource field32573;
    public static final DamageSource field32574;
    public static final DamageSource field32575;
    public static final DamageSource field32576;
    public static final DamageSource field32577;
    public static final DamageSource field32578;
    public static final DamageSource field32579;
    public static final DamageSource field32580;
    public static final DamageSource field32581;
    public static final DamageSource field32582;
    public static final DamageSource field32583;
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
    
    public static DamageSource method25692(final LivingEntity class511) {
        return new Class7930("sting", class511);
    }
    
    public static DamageSource method25693(final LivingEntity class511) {
        return new Class7930("mob", class511);
    }
    
    public static DamageSource method25694(final Entity class399, final LivingEntity class400) {
        return new Class7931("mob", class399, class400);
    }
    
    public static DamageSource method25695(final Class512 class512) {
        return new Class7930("player", class512);
    }
    
    public static DamageSource method25696(final Class402 class402, final Entity class403) {
        return new Class7931("arrow", class402, class403).method25706();
    }
    
    public static DamageSource method25697(final Entity class399, final Entity class400) {
        return new Class7931("trident", class399, class400).method25706();
    }
    
    public static DamageSource method25698(final Class419 class419, final Entity class420) {
        return (class420 != null) ? new Class7931("fireball", class419, class420).method25718().method25706() : new Class7931("onFire", class419, class419).method25718().method25706();
    }
    
    public static DamageSource method25699(final Entity class399, final Entity class400) {
        return new Class7931("thrown", class399, class400).method25706();
    }
    
    public static DamageSource method25700(final Entity class399, final Entity class400) {
        return new Class7931("indirectMagic", class399, class400).method25715().method25724();
    }
    
    public static DamageSource method25701(final Entity class399) {
        return new Class7930("thorns", class399).method25727().method25724();
    }
    
    public static DamageSource method25702(final Explosion explosion) {
        return (explosion != null && explosion.method18414() != null) ? new Class7930("explosion.player", explosion.method18414()).method25721().method25708() : new DamageSource("explosion").method25721().method25708();
    }
    
    public static DamageSource method25703(final LivingEntity class511) {
        return (class511 == null) ? new DamageSource("explosion").method25721().method25708() : new Class7930("explosion.player", class511).method25721().method25708();
    }
    
    public static DamageSource method25704() {
        return new Class7928();
    }
    
    public boolean method25705() {
        return this.field32589;
    }
    
    public DamageSource method25706() {
        this.field32589 = true;
        return this;
    }
    
    public boolean method25707() {
        return this.field32592;
    }
    
    public DamageSource method25708() {
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
    
    public DamageSource(final String field32593) {
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
    
    public DamageSource method25715() {
        this.field32584 = true;
        this.field32587 = 0.0f;
        return this;
    }
    
    public DamageSource method25716() {
        this.field32585 = true;
        return this;
    }
    
    public DamageSource method25717() {
        this.field32586 = true;
        this.field32587 = 0.0f;
        return this;
    }
    
    public DamageSource method25718() {
        this.field32588 = true;
        return this;
    }
    
    public ITextComponent method25690(final LivingEntity class511) {
        final LivingEntity method2700 = class511.method2700();
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
    
    public DamageSource method25721() {
        this.field32590 = true;
        return this;
    }
    
    public boolean method25722() {
        return this.field32590;
    }
    
    public boolean method25723() {
        return this.field32591;
    }
    
    public DamageSource method25724() {
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
        field32562 = new DamageSource("inFire").method25718();
        LIGHTNING_BOLT = new DamageSource("lightningBolt");
        field32564 = new DamageSource(DamageSource.\u4628\u4407\u7e3a\uaf2e\ucb49\ub327[5]).method25715().method25718();
        field32565 = new DamageSource("lava").method25718();
        field32566 = new DamageSource("hotFloor").method25718();
        field32567 = new DamageSource("inWall").method25715();
        field32568 = new DamageSource("cramming").method25715();
        field32569 = new DamageSource("drown").method25715();
        field32570 = new DamageSource("starve").method25715().method25717();
        field32571 = new DamageSource("cactus");
        field32572 = new DamageSource("fall").method25715();
        field32573 = new DamageSource("flyIntoWall").method25715();
        field32574 = new DamageSource("outOfWorld").method25715().method25716();
        field32575 = new DamageSource("generic").method25715();
        field32576 = new DamageSource("magic").method25715().method25724();
        field32577 = new DamageSource("wither").method25715();
        field32578 = new DamageSource("anvil");
        field32579 = new DamageSource("fallingBlock");
        field32580 = new DamageSource("dragonBreath").method25715();
        field32581 = new DamageSource("fireworks").method25708();
        field32582 = new DamageSource("dryout");
        field32583 = new DamageSource("sweetBerryBush");
    }
}

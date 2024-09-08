package net.minecraft.util;

import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DamageSource {
   public static final DamageSource field38992 = new DamageSource("inFire").method31137().method31140();
   public static final DamageSource field38993 = new DamageSource("lightningBolt");
   public static final DamageSource field38994 = new DamageSource("onFire").method31137().method31140();
   public static final DamageSource field38995 = new DamageSource("lava").method31140();
   public static final DamageSource field38996 = new DamageSource("hotFloor").method31140();
   public static final DamageSource field38997 = new DamageSource("inWall").method31137();
   public static final DamageSource field38998 = new DamageSource("cramming").method31137();
   public static final DamageSource field38999 = new DamageSource("drown").method31137();
   public static final DamageSource field39000 = new DamageSource("starve").method31137().method31139();
   public static final DamageSource field39001 = new DamageSource("cactus");
   public static final DamageSource field39002 = new DamageSource("fall").method31137();
   public static final DamageSource field39003 = new DamageSource("flyIntoWall").method31137();
   public static final DamageSource field39004 = new DamageSource("outOfWorld").method31137().method31138();
   public static final DamageSource field39005 = new DamageSource("generic").method31137();
   public static final DamageSource field39006 = new DamageSource("magic").method31137().method31145();
   public static final DamageSource field39007 = new DamageSource("wither").method31137();
   public static final DamageSource field39008 = new DamageSource("anvil");
   public static final DamageSource field39009 = new DamageSource("fallingBlock");
   public static final DamageSource field39010 = new DamageSource("dragonBreath").method31137();
   public static final DamageSource field39011 = new DamageSource("dryout");
   public static final DamageSource field39012 = new DamageSource("sweetBerryBush");
   private boolean field39013;
   private boolean field39014;
   private boolean field39015;
   private float field39016 = 0.1F;
   private boolean field39017;
   private boolean field39018;
   private boolean field39019;
   private boolean field39020;
   private boolean field39021;
   public final String field39022;

   public static DamageSource method31114(LivingEntity var0) {
      return new Class8652("sting", var0);
   }

   public static DamageSource method31115(LivingEntity var0) {
      return new Class8652("mob", var0);
   }

   public static DamageSource method31116(Entity var0, LivingEntity var1) {
      return new Class8653("mob", var0, var1);
   }

   public static DamageSource method31117(PlayerEntity var0) {
      return new Class8652("player", var0);
   }

   public static DamageSource method31118(AbstractArrowEntity var0, Entity var1) {
      return new Class8653("arrow", var0, var1).method31130();
   }

   public static DamageSource method31119(Entity var0, Entity var1) {
      return new Class8653("trident", var0, var1).method31130();
   }

   public static DamageSource method31120(Class888 var0, Entity var1) {
      return new Class8653("fireworks", var0, var1).method31132();
   }

   public static DamageSource method31121(Class898 var0, Entity var1) {
      return var1 != null ? new Class8653("fireball", var0, var1).method31140().method31130() : new Class8653("onFire", var0, var0).method31140().method31130();
   }

   public static DamageSource method31122(Class902 var0, Entity var1) {
      return new Class8653("witherSkull", var0, var1).method31130();
   }

   public static DamageSource method31123(Entity var0, Entity var1) {
      return new Class8653("thrown", var0, var1).method31130();
   }

   public static DamageSource method31124(Entity var0, Entity var1) {
      return new Class8653("indirectMagic", var0, var1).method31137().method31145();
   }

   public static DamageSource method31125(Entity var0) {
      return new Class8652("thorns", var0).method31107().method31145();
   }

   public static DamageSource method31126(Class7782 var0) {
      return method31127(var0 == null ? null : var0.method25789());
   }

   public static DamageSource method31127(LivingEntity var0) {
      return var0 == null ? new DamageSource("explosion").method31143().method31132() : new Class8652("explosion.player", var0).method31143().method31132();
   }

   public static DamageSource method31128() {
      return new Class8655();
   }

   @Override
   public String toString() {
      return "DamageSource (" + this.field39022 + ")";
   }

   public boolean method31129() {
      return this.field39018;
   }

   public DamageSource method31130() {
      this.field39018 = true;
      return this;
   }

   public boolean method31131() {
      return this.field39021;
   }

   public DamageSource method31132() {
      this.field39021 = true;
      return this;
   }

   public boolean method31133() {
      return this.field39013;
   }

   public float method31134() {
      return this.field39016;
   }

   public boolean method31135() {
      return this.field39014;
   }

   public boolean method31136() {
      return this.field39015;
   }

   public DamageSource(String var1) {
      this.field39022 = var1;
   }

   @Nullable
   public Entity method31113() {
      return this.method31109();
   }

   @Nullable
   public Entity method31109() {
      return null;
   }

   public DamageSource method31137() {
      this.field39013 = true;
      this.field39016 = 0.0F;
      return this;
   }

   public DamageSource method31138() {
      this.field39014 = true;
      return this;
   }

   public DamageSource method31139() {
      this.field39015 = true;
      this.field39016 = 0.0F;
      return this;
   }

   public DamageSource method31140() {
      this.field39017 = true;
      return this;
   }

   public ITextComponent method31110(LivingEntity var1) {
      LivingEntity var4 = var1.method3074();
      String var5 = "death.attack." + this.field39022;
      String var6 = var5 + ".player";
      return var4 == null ? new TranslationTextComponent(var5, var1.getDisplayName()) : new TranslationTextComponent(var6, var1.getDisplayName(), var4.getDisplayName());
   }

   public boolean method31141() {
      return this.field39017;
   }

   public String method31142() {
      return this.field39022;
   }

   public DamageSource method31143() {
      this.field39019 = true;
      return this;
   }

   public boolean method31111() {
      return this.field39019;
   }

   public boolean method31144() {
      return this.field39020;
   }

   public DamageSource method31145() {
      this.field39020 = true;
      return this;
   }

   public boolean method31146() {
      Entity var3 = this.method31109();
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.isCreativeMode;
   }

   @Nullable
   public Vector3d method31112() {
      return null;
   }
}

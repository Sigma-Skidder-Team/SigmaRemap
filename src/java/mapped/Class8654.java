package mapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8654 {
   public static final Class8654 field38992 = new Class8654("inFire").method31137().method31140();
   public static final Class8654 field38993 = new Class8654("lightningBolt");
   public static final Class8654 field38994 = new Class8654("onFire").method31137().method31140();
   public static final Class8654 field38995 = new Class8654("lava").method31140();
   public static final Class8654 field38996 = new Class8654("hotFloor").method31140();
   public static final Class8654 field38997 = new Class8654("inWall").method31137();
   public static final Class8654 field38998 = new Class8654("cramming").method31137();
   public static final Class8654 field38999 = new Class8654("drown").method31137();
   public static final Class8654 field39000 = new Class8654("starve").method31137().method31139();
   public static final Class8654 field39001 = new Class8654("cactus");
   public static final Class8654 field39002 = new Class8654("fall").method31137();
   public static final Class8654 field39003 = new Class8654("flyIntoWall").method31137();
   public static final Class8654 field39004 = new Class8654("outOfWorld").method31137().method31138();
   public static final Class8654 field39005 = new Class8654("generic").method31137();
   public static final Class8654 field39006 = new Class8654("magic").method31137().method31145();
   public static final Class8654 field39007 = new Class8654("wither").method31137();
   public static final Class8654 field39008 = new Class8654("anvil");
   public static final Class8654 field39009 = new Class8654("fallingBlock");
   public static final Class8654 field39010 = new Class8654("dragonBreath").method31137();
   public static final Class8654 field39011 = new Class8654("dryout");
   public static final Class8654 field39012 = new Class8654("sweetBerryBush");
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

   public static Class8654 method31114(Class880 var0) {
      return new Class8652("sting", var0);
   }

   public static Class8654 method31115(Class880 var0) {
      return new Class8652("mob", var0);
   }

   public static Class8654 method31116(Entity var0, Class880 var1) {
      return new Class8653("mob", var0, var1);
   }

   public static Class8654 method31117(PlayerEntity var0) {
      return new Class8652("player", var0);
   }

   public static Class8654 method31118(AbstractArrowEntity var0, Entity var1) {
      return new Class8653("arrow", var0, var1).method31130();
   }

   public static Class8654 method31119(Entity var0, Entity var1) {
      return new Class8653("trident", var0, var1).method31130();
   }

   public static Class8654 method31120(Class888 var0, Entity var1) {
      return new Class8653("fireworks", var0, var1).method31132();
   }

   public static Class8654 method31121(Class898 var0, Entity var1) {
      return var1 != null ? new Class8653("fireball", var0, var1).method31140().method31130() : new Class8653("onFire", var0, var0).method31140().method31130();
   }

   public static Class8654 method31122(Class902 var0, Entity var1) {
      return new Class8653("witherSkull", var0, var1).method31130();
   }

   public static Class8654 method31123(Entity var0, Entity var1) {
      return new Class8653("thrown", var0, var1).method31130();
   }

   public static Class8654 method31124(Entity var0, Entity var1) {
      return new Class8653("indirectMagic", var0, var1).method31137().method31145();
   }

   public static Class8654 method31125(Entity var0) {
      return new Class8652("thorns", var0).method31107().method31145();
   }

   public static Class8654 method31126(Class7782 var0) {
      return method31127(var0 == null ? null : var0.method25789());
   }

   public static Class8654 method31127(Class880 var0) {
      return var0 == null ? new Class8654("explosion").method31143().method31132() : new Class8652("explosion.player", var0).method31143().method31132();
   }

   public static Class8654 method31128() {
      return new Class8655();
   }

   @Override
   public String toString() {
      return "DamageSource (" + this.field39022 + ")";
   }

   public boolean method31129() {
      return this.field39018;
   }

   public Class8654 method31130() {
      this.field39018 = true;
      return this;
   }

   public boolean method31131() {
      return this.field39021;
   }

   public Class8654 method31132() {
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

   public Class8654(String var1) {
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

   public Class8654 method31137() {
      this.field39013 = true;
      this.field39016 = 0.0F;
      return this;
   }

   public Class8654 method31138() {
      this.field39014 = true;
      return this;
   }

   public Class8654 method31139() {
      this.field39015 = true;
      this.field39016 = 0.0F;
      return this;
   }

   public Class8654 method31140() {
      this.field39017 = true;
      return this;
   }

   public ITextComponent method31110(Class880 var1) {
      Class880 var4 = var1.method3074();
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

   public Class8654 method31143() {
      this.field39019 = true;
      return this;
   }

   public boolean method31111() {
      return this.field39019;
   }

   public boolean method31144() {
      return this.field39020;
   }

   public Class8654 method31145() {
      this.field39020 = true;
      return this;
   }

   public boolean method31146() {
      Entity var3 = this.method31109();
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).field4919.field29609;
   }

   @Nullable
   public Vector3d method31112() {
      return null;
   }
}

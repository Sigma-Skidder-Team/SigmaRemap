package mapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.File;

public abstract class Class7042 extends Class7039 implements Class7041 {
   private boolean field30380;
   private boolean field30381;
   private boolean field30382;
   private boolean field30383;
   private boolean field30384;
   private boolean field30385;
   private boolean field30386;
   private boolean field30387;
   private boolean field30388;
   private boolean field30389;
   private double field30390;
   private int field30391;
   private String field30392;
   private int field30393;
   private int field30394;
   private int field30395;
   private String field30396;
   private boolean field30397;
   private boolean field30398;
   private boolean field30399;
   private boolean field30400;
   private boolean field30401;
   private int field30402;
   private boolean field30403;
   private boolean field30404;
   private boolean field30405;
   private IntSet field30406;
   private String field30407;
   private String field30408;
   private boolean field30409;
   private boolean field30410;
   private boolean field30411;
   private boolean field30412;
   private boolean field30413;
   private boolean field30414;
   private boolean field30415;
   private boolean field30416;
   private boolean field30417;
   private boolean field30418;
   private int field30419;
   private boolean field30420;
   private boolean field30421;
   private boolean field30422;
   private boolean field30423;
   private boolean field30424;
   private boolean field30425;

   public Class7042(File var1) {
      super(var1);
   }

   @Override
   public void method21881() {
      super.method21881();
      this.method21945();
   }

   public void method21945() {
      this.field30380 = this.method21884("checkforupdates", true);
      this.field30381 = this.method21884("prevent-collision", true);
      this.field30382 = this.method21884("use-new-effect-indicator", true);
      this.field30383 = this.method21884("use-new-deathmessages", true);
      this.field30384 = this.method21884("suppress-metadata-errors", false);
      this.field30385 = this.method21884("shield-blocking", true);
      this.field30386 = this.method21884("hologram-patch", false);
      this.field30387 = this.method21884("piston-animation-patch", false);
      this.field30388 = this.method21884("bossbar-patch", true);
      this.field30389 = this.method21884("bossbar-anti-flicker", false);
      this.field30390 = this.method21887("hologram-y", -0.96);
      this.field30391 = this.method21886("max-pps", 800);
      this.field30392 = this.method21885("max-pps-kick-msg", "Sending packets too fast? lag?");
      this.field30393 = this.method21886("tracking-period", 6);
      this.field30394 = this.method21886("tracking-warning-pps", 120);
      this.field30395 = this.method21886("tracking-max-warnings", 3);
      this.field30396 = this.method21885("tracking-max-kick-msg", "You are sending too many packets, :(");
      this.field30397 = this.method21884("send-supported-versions", false);
      this.field30398 = this.method21884("simulate-pt", true);
      this.field30399 = this.method21884("item-cache", true);
      this.field30400 = this.method21884("nms-player-ticking", true);
      this.field30401 = this.method21884("replace-pistons", false);
      this.field30402 = this.method21886("replacement-piston-id", 0);
      this.field30403 = this.method21884("auto-team", true);
      this.field30404 = this.method21884("force-json-transform", false);
      this.field30405 = this.method21884("chat-nbt-fix", true);
      this.field30406 = new IntOpenHashSet(this.method21888("block-protocols"));
      this.field30407 = this.method21885("block-disconnect-msg", "You are using an unsupported Minecraft version!");
      this.field30408 = this.method21885("reload-disconnect-msg", "Server reload, please rejoin!");
      this.field30411 = this.method21884("minimize-cooldown", true);
      this.field30412 = this.method21884("team-colour-fix", true);
      this.field30409 = this.method21884("suppress-conversion-warnings", false);
      this.field30410 = this.method21884("disable-1_13-auto-complete", false);
      this.field30413 = this.method21884("serverside-blockconnections", true);
      this.field30414 = this.method21884("reduce-blockstorage-memory", false);
      this.field30415 = this.method21884("flowerstem-when-block-above", false);
      this.field30416 = this.method21884("vine-climb-fix", false);
      this.field30417 = this.method21884("fix-low-snow-collision", false);
      this.field30418 = this.method21884("fix-infested-block-breaking", true);
      this.field30419 = this.method21886("1_13-tab-complete-delay", 0);
      this.field30420 = this.method21884("truncate-1_14-books", false);
      this.field30421 = this.method21884("left-handed-handling", true);
      this.field30422 = this.method21884("fix-non-full-blocklight", false);
      this.field30423 = this.method21884("fix-1_14-health-nan", true);
      this.field30424 = this.method21884("use-1_15-instant-respawn", false);
      this.field30425 = this.method21884("ignore-long-1_16-channel-names", true);
   }

   @Override
   public boolean method21890() {
      return this.field30380;
   }

   @Override
   public void method21944(boolean var1) {
      this.field30380 = var1;
      this.method21879("checkforupdates", Boolean.valueOf(var1));
   }

   @Override
   public boolean method21891() {
      return this.field30381;
   }

   @Override
   public boolean method21892() {
      return this.field30382;
   }

   @Override
   public boolean method21893() {
      return this.field30383;
   }

   @Override
   public boolean method21894() {
      return this.field30384;
   }

   @Override
   public boolean method21895() {
      return this.field30385;
   }

   @Override
   public boolean method21896() {
      return this.field30386;
   }

   @Override
   public boolean method21897() {
      return this.field30387;
   }

   @Override
   public boolean method21898() {
      return this.field30388;
   }

   @Override
   public boolean method21899() {
      return this.field30389;
   }

   @Override
   public double method21900() {
      return this.field30390;
   }

   @Override
   public int method21901() {
      return this.field30391;
   }

   @Override
   public String method21902() {
      return this.field30392;
   }

   @Override
   public int method21903() {
      return this.field30393;
   }

   @Override
   public int method21904() {
      return this.field30394;
   }

   @Override
   public int method21905() {
      return this.field30395;
   }

   @Override
   public String method21906() {
      return this.field30396;
   }

   @Override
   public boolean method21907() {
      return false;
   }

   @Override
   public boolean method21908() {
      return this.field30397;
   }

   @Override
   public boolean method21940() {
      return this.field30398;
   }

   @Override
   public boolean method21909() {
      return this.field30399;
   }

   @Override
   public boolean method21910() {
      return this.field30400;
   }

   @Override
   public boolean method21911() {
      return this.field30401;
   }

   @Override
   public int method21912() {
      return this.field30402;
   }

   @Override
   public boolean method21913() {
      return this.field30381 && this.field30403;
   }

   @Override
   public boolean method21914() {
      return this.field30404;
   }

   @Override
   public boolean method21915() {
      return this.field30405;
   }

   @Override
   public boolean method21916() {
      return false;
   }

   @Override
   public IntSet method21942() {
      return this.field30406;
   }

   @Override
   public String method21917() {
      return this.field30407;
   }

   @Override
   public String method21918() {
      return this.field30408;
   }

   @Override
   public boolean method21919() {
      return this.field30411;
   }

   @Override
   public boolean method21923() {
      return this.field30412;
   }

   @Override
   public boolean method21941() {
      return this.field30409;
   }

   @Override
   public boolean method21924() {
      return this.field30410;
   }

   @Override
   public boolean method21925() {
      return this.field30413;
   }

   @Override
   public String method21926() {
      return "packet";
   }

   @Override
   public boolean method21927() {
      return this.field30414;
   }

   @Override
   public boolean method21928() {
      return this.field30415;
   }

   @Override
   public boolean method21939() {
      return this.field30416;
   }

   @Override
   public boolean method21929() {
      return this.field30417;
   }

   @Override
   public boolean method21938() {
      return this.field30418;
   }

   @Override
   public int method21930() {
      return this.field30419;
   }

   @Override
   public boolean method21931() {
      return this.field30420;
   }

   @Override
   public boolean method21932() {
      return this.field30421;
   }

   @Override
   public boolean method21933() {
      return false;
   }

   @Override
   public boolean method21934() {
      return false;
   }

   @Override
   public boolean method21935() {
      return this.field30422;
   }

   @Override
   public boolean method21936() {
      return this.field30423;
   }

   @Override
   public boolean method21937() {
      return this.field30424;
   }

   @Override
   public boolean method21943() {
      return this.field30425;
   }
}

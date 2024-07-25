package remapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.File;

public abstract class class_4357 extends class_1316 implements class_5714 {
   private boolean field_21362;
   private boolean field_21377;
   private boolean field_21361;
   private boolean field_21347;
   private boolean field_21357;
   private boolean field_21371;
   private boolean field_21359;
   private boolean field_21355;
   private boolean field_21374;
   private boolean field_21354;
   private double field_21351;
   private int field_21344;
   private String field_21368;
   private int field_21367;
   private int field_21364;
   private int field_21349;
   private String field_21376;
   private boolean field_21350;
   private boolean field_21370;
   private boolean field_21384;
   private boolean field_21365;
   private boolean field_21363;
   private int field_21379;
   private boolean field_21369;
   private boolean field_21382;
   private boolean field_21353;
   private IntSet field_21360;
   private String field_21348;
   private String field_21358;
   private boolean field_21381;
   private boolean field_21380;
   private boolean field_21383;
   private boolean field_21345;
   private boolean field_21343;
   private boolean field_21342;
   private boolean field_21385;
   private boolean field_21378;
   private boolean field_21346;
   private boolean field_21356;
   private int field_21372;
   private boolean field_21340;
   private boolean field_21366;
   private boolean field_21375;
   private boolean field_21373;
   private boolean field_21341;
   private boolean field_21352;

   public class_4357(File var1) {
      super(var1);
   }

   @Override
   public void 鶊ᔎ哺葫롤䬾() {
      super.鶊ᔎ哺葫롤䬾();
      this.method_20218();
   }

   public void method_20218() {
      this.field_21362 = this.method_6016("checkforupdates", true);
      this.field_21377 = this.method_6016("prevent-collision", true);
      this.field_21361 = this.method_6016("use-new-effect-indicator", true);
      this.field_21347 = this.method_6016("use-new-deathmessages", true);
      this.field_21357 = this.method_6016("suppress-metadata-errors", false);
      this.field_21371 = this.method_6016("shield-blocking", true);
      this.field_21359 = this.method_6016("hologram-patch", false);
      this.field_21355 = this.method_6016("piston-animation-patch", false);
      this.field_21374 = this.method_6016("bossbar-patch", true);
      this.field_21354 = this.method_6016("bossbar-anti-flicker", false);
      this.field_21351 = this.method_6014("hologram-y", -0.96);
      this.field_21344 = this.method_6009("max-pps", 800);
      this.field_21368 = this.method_6017("max-pps-kick-msg", "Sending packets too fast? lag?");
      this.field_21367 = this.method_6009("tracking-period", 6);
      this.field_21364 = this.method_6009("tracking-warning-pps", 120);
      this.field_21349 = this.method_6009("tracking-max-warnings", 3);
      this.field_21376 = this.method_6017("tracking-max-kick-msg", "You are sending too many packets, :(");
      this.field_21350 = this.method_6016("send-supported-versions", false);
      this.field_21370 = this.method_6016("simulate-pt", true);
      this.field_21384 = this.method_6016("item-cache", true);
      this.field_21365 = this.method_6016("nms-player-ticking", true);
      this.field_21363 = this.method_6016("replace-pistons", false);
      this.field_21379 = this.method_6009("replacement-piston-id", 0);
      this.field_21369 = this.method_6016("auto-team", true);
      this.field_21382 = this.method_6016("force-json-transform", false);
      this.field_21353 = this.method_6016("chat-nbt-fix", true);
      this.field_21360 = new IntOpenHashSet(this.method_6018("block-protocols"));
      this.field_21348 = this.method_6017("block-disconnect-msg", "You are using an unsupported Minecraft version!");
      this.field_21358 = this.method_6017("reload-disconnect-msg", "Server reload, please rejoin!");
      this.field_21383 = this.method_6016("minimize-cooldown", true);
      this.field_21345 = this.method_6016("team-colour-fix", true);
      this.field_21381 = this.method_6016("suppress-conversion-warnings", false);
      this.field_21380 = this.method_6016("disable-1_13-auto-complete", false);
      this.field_21343 = this.method_6016("serverside-blockconnections", true);
      this.field_21342 = this.method_6016("reduce-blockstorage-memory", false);
      this.field_21385 = this.method_6016("flowerstem-when-block-above", false);
      this.field_21378 = this.method_6016("vine-climb-fix", false);
      this.field_21346 = this.method_6016("fix-low-snow-collision", false);
      this.field_21356 = this.method_6016("fix-infested-block-breaking", true);
      this.field_21372 = this.method_6009("1_13-tab-complete-delay", 0);
      this.field_21340 = this.method_6016("truncate-1_14-books", false);
      this.field_21366 = this.method_6016("left-handed-handling", true);
      this.field_21375 = this.method_6016("fix-non-full-blocklight", false);
      this.field_21373 = this.method_6016("fix-1_14-health-nan", true);
      this.field_21341 = this.method_6016("use-1_15-instant-respawn", false);
      this.field_21352 = this.method_6016("ignore-long-1_16-channel-names", true);
   }

   public boolean 驋洝䎰훔ꁈ䩜() {
      return this.field_21362;
   }

   public void 㼜䎰圭曞娍ぶ(boolean var1) {
      this.field_21362 = var1;
      this.筕湗䬾䴂岋놣("checkforupdates", Boolean.valueOf(var1));
   }

   public boolean 挐㮃鶊躚㹔ꁈ() {
      return this.field_21377;
   }

   public boolean 웨꿩䣓浣괠娍() {
      return this.field_21361;
   }

   public boolean 㠠缰ᜄ甐侃鶲() {
      return this.field_21347;
   }

   public boolean 葫㞈䆧ꈍ圭뎫() {
      return this.field_21357;
   }

   public boolean ᢻ酋陬㐈䡸捉() {
      return this.field_21371;
   }

   public boolean 놣붛塱浣쥦쥦() {
      return this.field_21359;
   }

   public boolean 侃姮묙塱欫韤() {
      return this.field_21355;
   }

   public boolean 呓缰뫤卫퉧藸() {
      return this.field_21374;
   }

   public boolean 埙韤롤浣펊顸() {
      return this.field_21354;
   }

   public double ᢻ쿨셴Ꮀ䢶ꈍ() {
      return this.field_21351;
   }

   public int 쬷햖쇼缰웨쬫() {
      return this.field_21344;
   }

   public String 娍轐ꁈᙽ洝좯() {
      return this.field_21368;
   }

   public int 嶗釒属ኞ阢陂() {
      return this.field_21367;
   }

   public int ꈍ鶲낛圭걾螜() {
      return this.field_21364;
   }

   public int Ⱋ侃놣쇽ಽ쬷() {
      return this.field_21349;
   }

   public String 姮ꦱ堧钘鶊郝() {
      return this.field_21376;
   }

   public boolean 쇽褕蛊쇽圭䩜() {
      return false;
   }

   public boolean 㐖뎫钘펊刃㔢() {
      return this.field_21350;
   }

   public boolean 䂷釒훔渺㝛酋() {
      return this.field_21370;
   }

   public boolean 㠠䴂웨ศ쥦䆧() {
      return this.field_21384;
   }

   public boolean 姮瀳岋댠훔塱() {
      return this.field_21365;
   }

   public boolean ᔎᜄ筕셴弻陬() {
      return this.field_21363;
   }

   public int 㼜뗴낛훔曞鱀() {
      return this.field_21379;
   }

   public boolean 㼜觯待呓錌ᙽ() {
      return this.field_21377 && this.field_21369;
   }

   public boolean 䣓䩉藸埙陬䆧() {
      return this.field_21382;
   }

   public boolean ᔎ䴂뵯酭쬫曞() {
      return this.field_21353;
   }

   public boolean 阢㦖뼢ꁈᙽ阢() {
      return false;
   }

   public IntSet 驋骰玑筕骰Ⱋ() {
      return this.field_21360;
   }

   public String 陬缰鷏綋佉䖼() {
      return this.field_21348;
   }

   public String ᙽ쟗뼢㐖堍Ꮺ() {
      return this.field_21358;
   }

   public boolean 粤錌值酋늦蕃() {
      return this.field_21383;
   }

   public boolean 樽缰亟츚哝睬() {
      return this.field_21345;
   }

   public boolean 딨柿卫蚳㦖曞() {
      return this.field_21381;
   }

   public boolean 侃玑曞侃浣䎰() {
      return this.field_21380;
   }

   public boolean ᙽ롤곻酭躚睬() {
      return this.field_21343;
   }

   public String 眓댠哝睬浦쬷() {
      return "packet";
   }

   public boolean 㕠셴汌韤댠瀧() {
      return this.field_21342;
   }

   public boolean 葫쇼鷏贞뚔Ꮤ() {
      return this.field_21385;
   }

   public boolean 卫䬾ꈍ뚔ศぶ() {
      return this.field_21378;
   }

   public boolean 掬蛊ꪕ㻣佉㻣() {
      return this.field_21346;
   }

   public boolean 卒픓퉧缰挐蛊() {
      return this.field_21356;
   }

   public int 콗圭Ꮤ卫佉Ⱋ() {
      return this.field_21372;
   }

   public boolean 㹔좯ࡅ睬鷏딨() {
      return this.field_21340;
   }

   public boolean 뵯浣䬹浣ၝ轐() {
      return this.field_21366;
   }

   public boolean 呓㢸㥇筕ꈍ葫() {
      return false;
   }

   public boolean 핇쥦䢶瀧䁞韤() {
      return false;
   }

   public boolean 蒕ใ綋郝躚㔢() {
      return this.field_21375;
   }

   public boolean 䆧室㹔陬쿨贞() {
      return this.field_21373;
   }

   public boolean 㞈聛뼢쇽捉啖() {
      return this.field_21341;
   }

   public boolean 묙睬䬾瀧ᢻ걾() {
      return this.field_21352;
   }
}

package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6610 implements Class6608, Class6611 {
   private static final Logger field29063 = LogManager.getLogger();
   private Class8898 field29064;
   private final Class7846 field29065;
   private final Lifecycle field29066;
   private int field29067;
   private int field29068;
   private int field29069;
   private float field29070;
   private long field29071;
   private long field29072;
   private final DataFixer field29073;
   private final int field29074;
   private boolean field29075;
   private Class39 field29076;
   private final int field29077;
   private int field29078;
   private boolean field29079;
   private int field29080;
   private boolean field29081;
   private int field29082;
   private boolean field29083;
   private boolean field29084;
   private Class7235 field29085;
   private Class39 field29086;
   private Class39 field29087;
   private int field29088;
   private int field29089;
   private UUID field29090;
   private final Set<String> field29091;
   private boolean field29092;
   private final Class8559<MinecraftServer> field29093;

   private Class6610(
      DataFixer var1,
      int var2,
      Class39 var3,
      boolean var4,
      int var5,
      int var6,
      int var7,
      float var8,
      long var9,
      long var11,
      int var13,
      int var14,
      int var15,
      boolean var16,
      int var17,
      boolean var18,
      boolean var19,
      boolean var20,
      Class7235 var21,
      int var22,
      int var23,
      UUID var24,
      LinkedHashSet<String> var25,
      Class8559<MinecraftServer> var26,
      Class39 var27,
      Class39 var28,
      Class8898 var29,
      Class7846 var30,
      Lifecycle var31
   ) {
      this.field29073 = var1;
      this.field29092 = var4;
      this.field29067 = var5;
      this.field29068 = var6;
      this.field29069 = var7;
      this.field29070 = var8;
      this.field29071 = var9;
      this.field29072 = var11;
      this.field29077 = var13;
      this.field29078 = var14;
      this.field29080 = var15;
      this.field29079 = var16;
      this.field29082 = var17;
      this.field29081 = var18;
      this.field29083 = var19;
      this.field29084 = var20;
      this.field29085 = var21;
      this.field29088 = var22;
      this.field29089 = var23;
      this.field29090 = var24;
      this.field29091 = var25;
      this.field29076 = var3;
      this.field29074 = var2;
      this.field29093 = var26;
      this.field29087 = var27;
      this.field29086 = var28;
      this.field29064 = var29;
      this.field29065 = var30;
      this.field29066 = var31;
   }

   public Class6610(Class8898 var1, Class7846 var2, Lifecycle var3) {
      this(
         (DataFixer)null,
         SharedConstants.method34773().getWorldVersion(),
         (Class39)null,
         false,
         0,
         0,
         0,
         0.0F,
         0L,
         0L,
         19133,
         0,
         0,
         false,
         0,
         false,
         false,
         false,
         Class7522.field32267,
         0,
         0,
         (UUID)null,
         Sets.newLinkedHashSet(),
         new Class8559<MinecraftServer>(Class6062.field26300),
         (Class39)null,
         new Class39(),
         var1.clone(),
         var2,
         var3
      );
   }

   public static Class6610 method20079(
      Dynamic<Class30> var0, DataFixer var1, int var2, Class39 var3, Class8898 var4, Class8519 var5, Class7846 var6, Lifecycle var7
   ) {
      long var10 = var0.get("Time").asLong(0L);
      Class39 var12 = (Class39)var0.get("DragonFight")
         .result()
         .<Class30>map(Dynamic::getValue)
         .orElseGet(() -> (Class30)var0.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
      return new Class6610(
         var1,
         var2,
         var3,
         var0.get("WasModded").asBoolean(false),
         var0.get("SpawnX").asInt(0),
         var0.get("SpawnY").asInt(0),
         var0.get("SpawnZ").asInt(0),
         var0.get("SpawnAngle").asFloat(0.0F),
         var10,
         var0.get("DayTime").asLong(var10),
         var5.method30182(),
         var0.get("clearWeatherTime").asInt(0),
         var0.get("rainTime").asInt(0),
         var0.get("raining").asBoolean(false),
         var0.get("thunderTime").asInt(0),
         var0.get("thundering").asBoolean(false),
         var0.get("initialized").asBoolean(true),
         var0.get("DifficultyLocked").asBoolean(false),
         Class7235.method22719(var0, Class7522.field32267),
         var0.get("WanderingTraderSpawnDelay").asInt(0),
         var0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)var0.get("WanderingTraderId").read(Class8749.field39430).result().orElse((UUID)null),
         var0.get("ServerBrands")
            .asStream()
            .<String>flatMap(var0x -> Util.method38511(var0x.asString().result()))
            .collect(Collectors.<String, LinkedHashSet<String>>toCollection(Sets::newLinkedHashSet)),
         new Class8559<MinecraftServer>(Class6062.field26300, var0.get("ScheduledEvents").asStream()),
         (Class39)var0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         var12,
         var4,
         var6,
         var7
      );
   }

   @Override
   public Class39 method20080(Class8904 var1, Class39 var2) {
      this.method20082();
      if (var2 == null) {
         var2 = this.field29076;
      }

      Class39 var5 = new Class39();
      this.method20081(var1, var5, var2);
      return var5;
   }

   @Override
   public boolean method20045() {
      return false;
   }

   private void method20081(Class8904 var1, Class39 var2, Class39 var3) {
      Class41 var6 = new Class41();
      this.field29091.stream().<Class40>map(Class40::method150).forEach(var6::add);
      var2.method99("ServerBrands", var6);
      var2.method115("WasModded", this.field29092);
      Class39 var7 = new Class39();
      var7.method109("Name", SharedConstants.method34773().getName());
      var7.method102("Id", SharedConstants.method34773().getWorldVersion());
      var7.method115("Snapshot", !SharedConstants.method34773().isStable());
      var2.method99("Version", var7);
      var2.method102("DataVersion", SharedConstants.method34773().getWorldVersion());
      Class6713<Class30> var8 = Class6713.method20491(Class8063.field34602, var1);
      Class7846.field33650
         .encodeStart(var8, this.field29065)
         .resultOrPartial(Util.method38529("WorldGenSettings: ", field29063::error))
         .ifPresent(var1x -> var2.method99("WorldGenSettings", var1x));
      var2.method102("GameType", this.field29064.method32427().method8152());
      var2.method102("SpawnX", this.field29067);
      var2.method102("SpawnY", this.field29068);
      var2.method102("SpawnZ", this.field29069);
      var2.method107("SpawnAngle", this.field29070);
      var2.method103("Time", this.field29071);
      var2.method103("DayTime", this.field29072);
      var2.method103("LastPlayed", Util.method38489());
      var2.method109("LevelName", this.field29064.method32426());
      var2.method102("version", 19133);
      var2.method102("clearWeatherTime", this.field29078);
      var2.method102("rainTime", this.field29080);
      var2.method115("raining", this.field29079);
      var2.method102("thunderTime", this.field29082);
      var2.method115("thundering", this.field29081);
      var2.method115("hardcore", this.field29064.method32428());
      var2.method115("allowCommands", this.field29064.method32430());
      var2.method115("initialized", this.field29083);
      this.field29085.method22720(var2);
      var2.method100("Difficulty", (byte)this.field29064.method32429().method8905());
      var2.method115("DifficultyLocked", this.field29084);
      var2.method99("GameRules", this.field29064.method32431().method17129());
      var2.method99("DragonFight", this.field29086);
      if (var3 != null) {
         var2.method99("Player", var3);
      }

      Class7818.field33532.encodeStart(Class8063.field34602, this.field29064.method32432()).result().ifPresent(var1x -> var2.method99("DataPacks", var1x));
      if (this.field29087 != null) {
         var2.method99("CustomBossEvents", this.field29087);
      }

      var2.method99("ScheduledEvents", this.field29093.method30540());
      var2.method102("WanderingTraderSpawnDelay", this.field29088);
      var2.method102("WanderingTraderSpawnChance", this.field29089);
      if (this.field29090 != null) {
         var2.method104("WanderingTraderId", this.field29090);
      }
   }

   @Override
   public int method20029() {
      return this.field29067;
   }

   @Override
   public int method20030() {
      return this.field29068;
   }

   @Override
   public int method20031() {
      return this.field29069;
   }

   @Override
   public float method20032() {
      return this.field29070;
   }

   @Override
   public long method20033() {
      return this.field29071;
   }

   @Override
   public long method20034() {
      return this.field29072;
   }

   private void method20082() {
      if (!this.field29075 && this.field29076 != null) {
         if (this.field29074 < SharedConstants.method34773().getWorldVersion()) {
            if (this.field29073 == null) {
               throw (NullPointerException) Util.method38516(
                  new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded.")
               );
            }

            this.field29076 = Class8354.method29289(this.field29073, Class2108.field13749, this.field29076, this.field29074);
         }

         this.field29075 = true;
      }
   }

   @Override
   public Class39 method20083() {
      this.method20082();
      return this.field29076;
   }

   @Override
   public void method20035(int var1) {
      this.field29067 = var1;
   }

   @Override
   public void method20036(int var1) {
      this.field29068 = var1;
   }

   @Override
   public void method20037(int var1) {
      this.field29069 = var1;
   }

   @Override
   public void method20038(float var1) {
      this.field29070 = var1;
   }

   @Override
   public void method20075(long var1) {
      this.field29071 = var1;
   }

   @Override
   public void method20076(long var1) {
      this.field29072 = var1;
   }

   @Override
   public void method20041(BlockPos var1, float var2) {
      this.field29067 = var1.method8304();
      this.field29068 = var1.getY();
      this.field29069 = var1.method8306();
      this.field29070 = var2;
   }

   @Override
   public String method20054() {
      return this.field29064.method32426();
   }

   @Override
   public int method20084() {
      return this.field29077;
   }

   @Override
   public int method20060() {
      return this.field29078;
   }

   @Override
   public void method20061(int var1) {
      this.field29078 = var1;
   }

   @Override
   public boolean method20042() {
      return this.field29081;
   }

   @Override
   public void method20055(boolean var1) {
      this.field29081 = var1;
   }

   @Override
   public int method20059() {
      return this.field29082;
   }

   @Override
   public void method20058(int var1) {
      this.field29082 = var1;
   }

   @Override
   public boolean method20043() {
      return this.field29079;
   }

   @Override
   public void method20044(boolean var1) {
      this.field29079 = var1;
   }

   @Override
   public int method20056() {
      return this.field29080;
   }

   @Override
   public void method20057(int var1) {
      this.field29080 = var1;
   }

   @Override
   public Class1894 method20067() {
      return this.field29064.method32427();
   }

   @Override
   public void method20073(Class1894 var1) {
      this.field29064 = this.field29064.method32433(var1);
   }

   @Override
   public boolean isHardcore() {
      return this.field29064.method32428();
   }

   @Override
   public boolean method20072() {
      return this.field29064.method32430();
   }

   @Override
   public boolean method20070() {
      return this.field29083;
   }

   @Override
   public void method20071(boolean var1) {
      this.field29083 = var1;
   }

   @Override
   public Class5462 method20046() {
      return this.field29064.method32431();
   }

   @Override
   public Class7235 method20069() {
      return this.field29085;
   }

   @Override
   public void method20068(Class7235 var1) {
      this.field29085 = var1;
   }

   @Override
   public Class2197 method20047() {
      return this.field29064.method32429();
   }

   @Override
   public void method20085(Class2197 var1) {
      this.field29064 = this.field29064.method32434(var1);
   }

   @Override
   public boolean method20048() {
      return this.field29084;
   }

   @Override
   public void method20086(boolean var1) {
      this.field29084 = var1;
   }

   @Override
   public Class8559<MinecraftServer> method20074() {
      return this.field29093;
   }

   @Override
   public void method20049(Class8965 var1) {
      Class6608.super.method20049(var1);
      Class6611.super.method20049(var1);
   }

   @Override
   public Class7846 method20087() {
      return this.field29065;
   }

   @Override
   public Lifecycle method20088() {
      return this.field29066;
   }

   @Override
   public Class39 method20089() {
      return this.field29086;
   }

   @Override
   public void method20090(Class39 var1) {
      this.field29086 = var1;
   }

   @Override
   public Class7818 method20091() {
      return this.field29064.method32432();
   }

   @Override
   public void method20092(Class7818 var1) {
      this.field29064 = this.field29064.method32435(var1);
   }

   @Nullable
   @Override
   public Class39 method20093() {
      return this.field29087;
   }

   @Override
   public void method20094(Class39 var1) {
      this.field29087 = var1;
   }

   @Override
   public int method20062() {
      return this.field29088;
   }

   @Override
   public void method20063(int var1) {
      this.field29088 = var1;
   }

   @Override
   public int method20064() {
      return this.field29089;
   }

   @Override
   public void method20065(int var1) {
      this.field29089 = var1;
   }

   @Override
   public void method20066(UUID var1) {
      this.field29090 = var1;
   }

   @Override
   public void method20095(String var1, boolean var2) {
      this.field29091.add(var1);
      this.field29092 |= var2;
   }

   @Override
   public boolean method20096() {
      return this.field29092;
   }

   @Override
   public Set<String> method20097() {
      return ImmutableSet.copyOf(this.field29091);
   }

   @Override
   public Class6608 method20098() {
      return this;
   }

   @Override
   public Class8898 method20099() {
      return this.field29064.clone();
   }
}
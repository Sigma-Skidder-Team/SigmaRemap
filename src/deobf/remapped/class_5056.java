package remapped;

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

public class class_5056 implements class_7203, class_5684 {
   private static final Logger field_26153 = LogManager.getLogger();
   private class_6292 field_26154;
   private final class_2904 field_26134;
   private final Lifecycle field_26140;
   private int field_26152;
   private int field_26135;
   private int field_26138;
   private float field_26137;
   private long field_26142;
   private long field_26160;
   private final DataFixer field_26136;
   private final int field_26158;
   private boolean field_26148;
   private CompoundNBT field_26155;
   private final int field_26147;
   private int field_26143;
   private boolean field_26133;
   private int field_26159;
   private boolean field_26150;
   private int field_26132;
   private boolean field_26139;
   private boolean field_26149;
   private class_1572 field_26162;
   private CompoundNBT field_26157;
   private CompoundNBT field_26163;
   private int field_26151;
   private int field_26146;
   private UUID field_26145;
   private final Set<String> field_26144;
   private boolean field_26161;
   private final class_5026<class_341> field_26141;

   private class_5056(
      DataFixer var1,
      int var2,
      CompoundNBT var3,
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
      class_1572 var21,
      int var22,
      int var23,
      UUID var24,
      LinkedHashSet<String> var25,
      class_5026<class_341> var26,
      CompoundNBT var27,
      CompoundNBT var28,
      class_6292 var29,
      class_2904 var30,
      Lifecycle var31
   ) {
      this.field_26136 = var1;
      this.field_26161 = var4;
      this.field_26152 = var5;
      this.field_26135 = var6;
      this.field_26138 = var7;
      this.field_26137 = var8;
      this.field_26142 = var9;
      this.field_26160 = var11;
      this.field_26147 = var13;
      this.field_26143 = var14;
      this.field_26159 = var15;
      this.field_26133 = var16;
      this.field_26132 = var17;
      this.field_26150 = var18;
      this.field_26139 = var19;
      this.field_26149 = var20;
      this.field_26162 = var21;
      this.field_26151 = var22;
      this.field_26146 = var23;
      this.field_26145 = var24;
      this.field_26144 = var25;
      this.field_26155 = var3;
      this.field_26158 = var2;
      this.field_26141 = var26;
      this.field_26163 = var27;
      this.field_26157 = var28;
      this.field_26154 = var29;
      this.field_26134 = var30;
      this.field_26140 = var31;
   }

   public class_5056(class_6292 var1, class_2904 var2, Lifecycle var3) {
      this(
         (DataFixer)null,
         class_7665.method_34674().getWorldVersion(),
         (CompoundNBT)null,
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
         class_2098.field_10526,
         0,
         0,
         (UUID)null,
         Sets.newLinkedHashSet(),
         new class_5026<class_341>(class_455.field_1893),
         (CompoundNBT)null,
         new CompoundNBT(),
         var1.clone(),
         var2,
         var3
      );
   }

   public static class_5056 method_23310(
           Dynamic<class_8406> var0, DataFixer var1, int var2, CompoundNBT var3, class_6292 var4, class_4922 var5, class_2904 var6, Lifecycle var7
   ) {
      long var10 = var0.get("Time").asLong(0L);
      CompoundNBT var12 = (CompoundNBT)var0.get("DragonFight")
         .result()
         .<class_8406>map(Dynamic::getValue)
         .orElseGet(() -> (class_8406)var0.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
      return new class_5056(
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
         var5.method_22540(),
         var0.get("clearWeatherTime").asInt(0),
         var0.get("rainTime").asInt(0),
         var0.get("raining").asBoolean(false),
         var0.get("thunderTime").asInt(0),
         var0.get("thundering").asBoolean(false),
         var0.get("initialized").asBoolean(true),
         var0.get("DifficultyLocked").asBoolean(false),
         class_1572.method_7097(var0, class_2098.field_10526),
         var0.get("WanderingTraderSpawnDelay").asInt(0),
         var0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)var0.get("WanderingTraderId").read(class_5753.field_29117).result().orElse((UUID)null),
         var0.get("ServerBrands")
            .asStream()
            .<String>flatMap(var0x -> Util.method_44689(var0x.asString().result()))
            .collect(Collectors.<String, LinkedHashSet<String>>toCollection(Sets::newLinkedHashSet)),
         new class_5026<class_341>(class_455.field_1893, var0.get("ScheduledEvents").asStream()),
         (CompoundNBT)var0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         var12,
         var4,
         var6,
         var7
      );
   }

   @Override
   public CompoundNBT method_25713(class_6322 var1, CompoundNBT var2) {
      this.method_23313();
      if (var2 == null) {
         var2 = this.field_26155;
      }

      CompoundNBT var5 = new CompoundNBT();
      this.method_23312(var1, var5, var2);
      return var5;
   }

   private void method_23312(class_6322 var1, CompoundNBT var2, CompoundNBT var3) {
      class_3416 var6 = new class_3416();
      this.field_26144.stream().<class_473>map(class_473::method_2261).forEach(var6::add);
      var2.method_25946("ServerBrands", var6);
      var2.method_25934("WasModded", this.field_26161);
      CompoundNBT var7 = new CompoundNBT();
      var7.method_25941("Name", class_7665.method_34674().getName());
      var7.method_25931("Id", class_7665.method_34674().getWorldVersion());
      var7.method_25934("Snapshot", !class_7665.method_34674().isStable());
      var2.method_25946("Version", var7);
      var2.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());
      class_8876 var8 = class_8876.method_40843(class_3504.field_17178, var1);
      class_2904.field_14169
         .encodeStart(var8, this.field_26134)
         .resultOrPartial(Util.method_44690("WorldGenSettings: ", field_26153::error))
         .ifPresent(var1x -> var2.method_25946("WorldGenSettings", var1x));
      var2.method_25931("GameType", this.field_26154.method_28720().getID());
      var2.method_25931("SpawnX", this.field_26152);
      var2.method_25931("SpawnY", this.field_26135);
      var2.method_25931("SpawnZ", this.field_26138);
      var2.method_25920("SpawnAngle", this.field_26137);
      var2.method_25949("Time", this.field_26142);
      var2.method_25949("DayTime", this.field_26160);
      var2.method_25949("LastPlayed", Util.getEpochTimeMs());
      var2.method_25941("LevelName", this.field_26154.method_28716());
      var2.method_25931("version", 19133);
      var2.method_25931("clearWeatherTime", this.field_26143);
      var2.method_25931("rainTime", this.field_26159);
      var2.method_25934("raining", this.field_26133);
      var2.method_25931("thunderTime", this.field_26132);
      var2.method_25934("thundering", this.field_26150);
      var2.method_25934("hardcore", this.field_26154.method_28712());
      var2.method_25934("allowCommands", this.field_26154.method_28719());
      var2.method_25934("initialized", this.field_26139);
      this.field_26162.method_7093(var2);
      var2.method_25921("Difficulty", (byte)this.field_26154.method_28710().method_2097());
      var2.method_25934("DifficultyLocked", this.field_26149);
      var2.method_25946("GameRules", this.field_26154.method_28709().method_1284());
      var2.method_25946("DragonFight", this.field_26157);
      if (var3 != null) {
         var2.method_25946("Player", var3);
      }

      class_2805.field_13767
         .encodeStart(class_3504.field_17178, this.field_26154.method_28713())
         .result()
         .ifPresent(var1x -> var2.method_25946("DataPacks", var1x));
      if (this.field_26163 != null) {
         var2.method_25946("CustomBossEvents", this.field_26163);
      }

      var2.method_25946("ScheduledEvents", this.field_26141.method_23181());
      var2.method_25931("WanderingTraderSpawnDelay", this.field_26151);
      var2.method_25931("WanderingTraderSpawnChance", this.field_26146);
      if (this.field_26145 != null) {
         var2.method_25964("WanderingTraderId", this.field_26145);
      }
   }

   @Override
   public int method_8654() {
      return this.field_26152;
   }

   @Override
   public int method_8660() {
      return this.field_26135;
   }

   @Override
   public int method_8655() {
      return this.field_26138;
   }

   @Override
   public float method_8657() {
      return this.field_26137;
   }

   @Override
   public long method_8658() {
      return this.field_26142;
   }

   @Override
   public long method_8666() {
      return this.field_26160;
   }

   private void method_23313() {
      if (!this.field_26148 && this.field_26155 != null) {
         if (this.field_26158 < class_7665.method_34674().getWorldVersion()) {
            if (this.field_26136 == null) {
               throw (NullPointerException) Util.method_44658(
                  new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded.")
               );
            }

            this.field_26155 = class_4338.method_20179(this.field_26136, class_5397.field_27553, this.field_26155, this.field_26158);
         }

         this.field_26148 = true;
      }
   }

   @Override
   public CompoundNBT method_25712() {
      this.method_23313();
      return this.field_26155;
   }

   @Override
   public void method_4989(int var1) {
      this.field_26152 = var1;
   }

   @Override
   public void method_4987(int var1) {
      this.field_26135 = var1;
   }

   @Override
   public void method_4986(int var1) {
      this.field_26138 = var1;
   }

   @Override
   public void method_4985(float var1) {
      this.field_26137 = var1;
   }

   @Override
   public void method_32979(long var1) {
      this.field_26142 = var1;
   }

   @Override
   public void method_32983(long var1) {
      this.field_26160 = var1;
   }

   @Override
   public void method_4988(class_1331 var1, float var2) {
      this.field_26152 = var1.method_12173();
      this.field_26135 = var1.method_12165();
      this.field_26138 = var1.method_12185();
      this.field_26137 = var2;
   }

   @Override
   public String method_25716() {
      return this.field_26154.method_28716();
   }

   @Override
   public int method_25704() {
      return this.field_26147;
   }

   @Override
   public int method_32984() {
      return this.field_26143;
   }

   @Override
   public void method_32977(int var1) {
      this.field_26143 = var1;
   }

   @Override
   public boolean method_8663() {
      return this.field_26150;
   }

   @Override
   public void method_32978(boolean var1) {
      this.field_26150 = var1;
   }

   @Override
   public int method_32972() {
      return this.field_26132;
   }

   @Override
   public void method_32980(int var1) {
      this.field_26132 = var1;
   }

   @Override
   public boolean method_8664() {
      return this.field_26133;
   }

   @Override
   public void method_8665(boolean var1) {
      this.field_26133 = var1;
   }

   @Override
   public int method_32975() {
      return this.field_26159;
   }

   @Override
   public void method_32971(int var1) {
      this.field_26159 = var1;
   }

   @Override
   public GameType method_25709() {
      return this.field_26154.method_28720();
   }

   @Override
   public void method_25711(GameType var1) {
      this.field_26154 = this.field_26154.method_28711(var1);
   }

   @Override
   public boolean method_8659() {
      return this.field_26154.method_28712();
   }

   @Override
   public boolean method_25714() {
      return this.field_26154.method_28719();
   }

   @Override
   public boolean method_32973() {
      return this.field_26139;
   }

   @Override
   public void method_32985(boolean var1) {
      this.field_26139 = var1;
   }

   @Override
   public class_291 method_8653() {
      return this.field_26154.method_28709();
   }

   @Override
   public class_1572 method_32974() {
      return this.field_26162;
   }

   @Override
   public void method_32981(class_1572 var1) {
      this.field_26162 = var1;
   }

   @Override
   public class_423 method_8661() {
      return this.field_26154.method_28710();
   }

   @Override
   public void method_25702(class_423 var1) {
      this.field_26154 = this.field_26154.method_28718(var1);
   }

   @Override
   public boolean method_8662() {
      return this.field_26149;
   }

   @Override
   public void method_25707(boolean var1) {
      this.field_26149 = var1;
   }

   @Override
   public class_5026<class_341> method_32969() {
      return this.field_26141;
   }

   @Override
   public void method_8656(class_6544 var1) {
      class_7203.super.method_8656(var1);
      class_5684.super.method_8656(var1);
   }

   @Override
   public class_2904 method_25703() {
      return this.field_26134;
   }

   @Override
   public Lifecycle method_25710() {
      return this.field_26140;
   }

   @Override
   public CompoundNBT method_25717() {
      return this.field_26157;
   }

   @Override
   public void method_25705(CompoundNBT var1) {
      this.field_26157 = var1;
   }

   @Override
   public class_2805 method_25697() {
      return this.field_26154.method_28713();
   }

   @Override
   public void method_25695(class_2805 var1) {
      this.field_26154 = this.field_26154.method_28717(var1);
   }

   @Nullable
   @Override
   public CompoundNBT method_25708() {
      return this.field_26163;
   }

   @Override
   public void method_25698(CompoundNBT var1) {
      this.field_26163 = var1;
   }

   @Override
   public int method_32968() {
      return this.field_26151;
   }

   @Override
   public void method_32976(int var1) {
      this.field_26151 = var1;
   }

   @Override
   public int method_32982() {
      return this.field_26146;
   }

   @Override
   public void method_32970(int var1) {
      this.field_26146 = var1;
   }

   @Override
   public void method_32967(UUID var1) {
      this.field_26145 = var1;
   }

   @Override
   public void method_25715(String var1, boolean var2) {
      this.field_26144.add(var1);
      this.field_26161 |= var2;
   }

   @Override
   public boolean method_25700() {
      return this.field_26161;
   }

   @Override
   public Set<String> method_25701() {
      return ImmutableSet.copyOf(this.field_26144);
   }

   @Override
   public class_7203 method_25706() {
      return this;
   }

   @Override
   public class_6292 method_25699() {
      return this.field_26154.clone();
   }
}

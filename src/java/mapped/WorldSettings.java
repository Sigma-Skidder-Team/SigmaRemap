package mapped;

import com.mojang.serialization.Dynamic;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;

public final class WorldSettings {
   private final String field40268;
   private final GameType field40269;
   private final boolean field40270;
   private final Difficulty field40271;
   private final boolean field40272;
   private final GameRules field40273;
   private final DatapackCodec field40274;

   public WorldSettings(String var1, GameType var2, boolean var3, Difficulty var4, boolean var5, GameRules var6, DatapackCodec var7) {
      this.field40268 = var1;
      this.field40269 = var2;
      this.field40270 = var3;
      this.field40271 = var4;
      this.field40272 = var5;
      this.field40273 = var6;
      this.field40274 = var7;
   }

   public static WorldSettings method32425(Dynamic<?> var0, DatapackCodec var1) {
      GameType var4 = GameType.getByID(var0.get("GameType").asInt(0));
      return new WorldSettings(
         var0.get("LevelName").asString(""),
         var4,
         var0.get("hardcore").asBoolean(false),
         var0.get("Difficulty").asNumber().map(var0x -> Difficulty.byId(var0x.byteValue())).result().orElse(Difficulty.NORMAL),
         var0.get("allowCommands").asBoolean(var4 == GameType.field11103),
         new GameRules(var0.get("GameRules")),
         var1
      );
   }

   public String method32426() {
      return this.field40268;
   }

   public GameType method32427() {
      return this.field40269;
   }

   public boolean method32428() {
      return this.field40270;
   }

   public Difficulty method32429() {
      return this.field40271;
   }

   public boolean method32430() {
      return this.field40272;
   }

   public GameRules method32431() {
      return this.field40273;
   }

   public DatapackCodec getDatapackCodec() {
      return this.field40274;
   }

   public WorldSettings method32433(GameType var1) {
      return new WorldSettings(this.field40268, var1, this.field40270, this.field40271, this.field40272, this.field40273, this.field40274);
   }

   public WorldSettings method32434(Difficulty var1) {
      return new WorldSettings(this.field40268, this.field40269, this.field40270, var1, this.field40272, this.field40273, this.field40274);
   }

   public WorldSettings method32435(DatapackCodec var1) {
      return new WorldSettings(this.field40268, this.field40269, this.field40270, this.field40271, this.field40272, this.field40273, var1);
   }

   public WorldSettings clone() {
      return new WorldSettings(this.field40268, this.field40269, this.field40270, this.field40271, this.field40272, this.field40273.clone(), this.field40274);
   }
}

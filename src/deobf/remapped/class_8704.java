package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_8704 {
   public static final File field_44615 = new File("banned-players.json");
   public static final File field_44620 = new File("banned-ips.json");
   public static final File field_44612 = new File("ops.json");
   public static final File field_44618 = new File("whitelist.json");
   private static final Logger field_44623 = LogManager.getLogger();
   private static final SimpleDateFormat field_44628 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final class_341 field_44631;
   private final List<class_9359> field_44632 = Lists.newArrayList();
   private final Map<UUID, class_9359> field_44619 = Maps.newHashMap();
   private final class_161 field_44630 = new class_161(field_44615);
   private final class_9065 field_44629 = new class_9065(field_44620);
   private final class_8053 field_44624 = new class_8053(field_44612);
   private final class_5686 field_44613 = new class_5686(field_44618);
   private final Map<UUID, class_7909> field_44622 = Maps.newHashMap();
   private final Map<UUID, class_3362> field_44614 = Maps.newHashMap();
   private final class_5645 field_44616;
   private boolean field_44621;
   private final class_7522 field_44627;
   public final int field_44634;
   private int field_44617;
   private GameType field_44625;
   private boolean field_44633;
   private int field_44626;

   public class_8704(class_341 var1, class_7522 var2, class_5645 var3, int var4) {
      this.field_44631 = var1;
      this.field_44627 = var2;
      this.field_44634 = var4;
      this.field_44616 = var3;
   }

   public void method_39954(class_5121 var1, class_9359 var2) {
      GameProfile var5 = var2.method_3247();
      class_5969 var6 = this.field_44631.method_1647();
      GameProfile var7 = var6.method_27254(var5.getId());
      String var8 = var7 != null ? var7.getName() : var5.getName();
      var6.method_27258(var5);
      class_5734 var9 = this.method_39975(var2);
      class_5621 var10 = var9 == null
         ? World.field_33048
         : class_8760.method_40243(new Dynamic(class_3504.field_17178, var9.method_25929("Dimension")))
            .resultOrPartial(field_44623::error)
            .orElse(World.field_33048);
      class_6331 var11 = this.field_44631.method_1697(var10);
      class_6331 var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         field_44623.warn("Unknown respawn dimension {}, defaulting to overworld", var10);
         var12 = this.field_44631.method_1736();
      }

      var2.method_37120(var12);
      var2.field_47807.method_39527((class_6331)var2.field_41768);
      String var13 = "local";
      if (var1.method_23494() != null) {
         var13 = var1.method_23494().toString();
      }

      field_44623.info(
         "{}[{}] logged in with entity id {} at ({}, {}, {})",
         var2.method_45509().getString(),
         var13,
         var2.method_37145(),
         var2.method_37302(),
         var2.method_37309(),
         var2.method_37156()
      );
      class_1906 var14 = var12.method_43366();
      this.method_39980(var2, (class_9359)null, var12);
      class_948 var15 = new class_948(this.field_44631, var1, var2);
      class_291 var16 = var12.method_29537();
      boolean var17 = var16.method_1285(class_291.field_1046);
      boolean var18 = var16.method_1285(class_291.field_1026);
      var15.method_4156(
         new class_1992(
            var2.method_37145(),
            var2.field_47807.method_39517(),
            var2.field_47807.method_39524(),
            class_859.method_3728(var12.method_3133()),
            var14.method_8659(),
            this.field_44631.method_1659(),
            this.field_44627,
            var12.method_22572(),
            var12.method_29545(),
            this.method_39963(),
            this.field_44617,
            var18,
            !var17,
            var12.method_29581(),
            var12.method_28943()
         )
      );
      var15.method_4156(new class_6197(class_6197.field_31656, new class_8248(Unpooled.buffer()).method_37760(this.method_39974().method_1728())));
      var15.method_4156(new class_9275(var14.method_8661(), var14.method_8662()));
      var15.method_4156(new class_3727(var2.field_3876));
      var15.method_4156(new class_4020(var2.inventory.field_36404));
      var15.method_4156(new class_6621(this.field_44631.method_1705().method_23141()));
      var15.method_4156(new class_5042(this.field_44631.method_1754()));
      this.method_39976(var2);
      var2.method_43271().method_35774();
      var2.method_43266().method_14035(var2);
      this.method_39992(var12.method_28959(), var2);
      this.field_44631.method_1717();
      TranslationTextComponent var19;
      if (!var2.method_3247().getName().equalsIgnoreCase(var8)) {
         var19 = new TranslationTextComponent("multiplayer.player.joined.renamed", var2.method_19839(), var8);
      } else {
         var19 = new TranslationTextComponent("multiplayer.player.joined", var2.method_19839());
      }

      this.method_39983(var19.mergeStyle(TextFormatting.YELLOW), ChatType.SYSTEM, Util.NIL_UUID);
      var15.method_4170(var2.method_37302(), var2.method_37309(), var2.method_37156(), var2.field_41701, var2.field_41755);
      this.field_44632.add(var2);
      this.field_44619.put(var2.method_37328(), var2);
      this.method_39972(new class_7867(class_2236.field_11144, var2));

      for (int var20 = 0; var20 < this.field_44632.size(); var20++) {
         var2.field_47794.method_4156(new class_7867(class_2236.field_11144, this.field_44632.get(var20)));
      }

      var12.method_28931(var2);
      this.field_44631.method_1699().method_21076(var2);
      this.method_39955(var2, var12);
      if (!this.field_44631.method_1627().isEmpty()) {
         var2.method_43283(this.field_44631.method_1627(), this.field_44631.method_1613());
      }

      for (class_2250 var21 : var2.method_26503()) {
         var15.method_4156(new class_1661(var2.method_37145(), var21));
      }

      if (var9 != null && var9.method_25939("RootVehicle", 10)) {
         class_5734 var26 = var9.method_25937("RootVehicle");
         Entity var27 = class_6629.method_30455(var26.method_25937("Entity"), var12, var1x -> var12.method_28972(var1x) ? var1x : null);
         if (var27 != null) {
            UUID var22;
            if (!var26.method_25954("Attach")) {
               var22 = null;
            } else {
               var22 = var26.method_25926("Attach");
            }

            if (!var27.method_37328().equals(var22)) {
               for (Entity var24 : var27.method_37379()) {
                  if (var24.method_37328().equals(var22)) {
                     var2.method_37354(var24, true);
                     break;
                  }
               }
            } else {
               var2.method_37354(var27, true);
            }

            if (!var2.method_37070()) {
               field_44623.warn("Couldn't reattach entity to player");
               var12.method_28977(var27);

               for (Entity var29 : var27.method_37379()) {
                  var12.method_28977(var29);
               }
            }
         }
      }

      var2.method_43243();
   }

   public void method_39992(class_2917 var1, class_9359 var2) {
      HashSet var5 = Sets.newHashSet();

      for (class_3903 var7 : var1.method_4841()) {
         var2.field_47794.method_4156(new class_8077(var7, 0));
      }

      for (int var10 = 0; var10 < 19; var10++) {
         class_4399 var11 = var1.method_4833(var10);
         if (var11 != null && !var5.contains(var11)) {
            for (Packet var9 : var1.method_13354(var11)) {
               var2.field_47794.method_4156(var9);
            }

            var5.add(var11);
         }
      }
   }

   public void method_39999(class_6331 var1) {
      var1.method_6673().method_9833(new class_1320(this));
   }

   @Nullable
   public class_5734 method_39975(class_9359 var1) {
      class_5734 var4 = this.field_44631.method_1601().method_25712();
      class_5734 var5;
      if (var1.method_45509().getString().equals(this.field_44631.method_1674()) && var4 != null) {
         var5 = var4;
         var1.method_37393(var4);
         field_44623.debug("loading single player");
      } else {
         var5 = this.field_44616.method_25558(var1);
      }

      return var5;
   }

   public void method_39967(class_9359 var1) {
      this.field_44616.method_25559(var1);
      class_7909 var4 = this.field_44622.get(var1.method_37328());
      if (var4 != null) {
         var4.method_35775();
      }

      class_3362 var5 = this.field_44614.get(var1.method_37328());
      if (var5 != null) {
         var5.method_15398();
      }
   }

   public void method_39973(class_9359 var1) {
      class_6331 var4 = var1.method_43235();
      var1.method_3209(class_6234.field_31854);
      this.method_39967(var1);
      if (var1.method_37070()) {
         Entity var5 = var1.method_37240();
         if (var5.method_37172()) {
            field_44623.debug("Removing player mount");
            var1.method_37390();
            var4.method_28977(var5);
            var5.field_41751 = true;

            for (Entity var7 : var5.method_37379()) {
               var4.method_28977(var7);
               var7.field_41751 = true;
            }

            var4.method_29554(var1.field_41742, var1.field_41714).method_11992();
         }
      }

      var1.method_37269();
      var4.method_28964(var1);
      var1.method_43253().method_15388();
      this.field_44632.remove(var1);
      this.field_44631.method_1699().method_21083(var1);
      UUID var8 = var1.method_37328();
      class_9359 var9 = this.field_44619.get(var8);
      if (var9 == var1) {
         this.field_44619.remove(var8);
         this.field_44622.remove(var8);
         this.field_44614.remove(var8);
      }

      this.method_39972(new class_7867(class_2236.field_11143, var1));
   }

   @Nullable
   public ITextComponent method_39948(SocketAddress var1, GameProfile var2) {
      if (this.field_44630.method_653(var2)) {
         class_937 var7 = this.field_44630.method_19927(var2);
         TranslationTextComponent var8 = new TranslationTextComponent("multiplayer.disconnect.banned.reason", var7.method_20564());
         if (var7.method_20563() != null) {
            var8.append(new TranslationTextComponent("multiplayer.disconnect.banned.expiration", field_44628.format(var7.method_20563())));
         }

         return var8;
      } else if (this.method_39959(var2)) {
         if (this.field_44629.method_41616(var1)) {
            class_4513 var5 = this.field_44629.method_41614(var1);
            TranslationTextComponent var6 = new TranslationTextComponent("multiplayer.disconnect.banned_ip.reason", var5.method_20564());
            if (var5.method_20563() != null) {
               var6.append(new TranslationTextComponent("multiplayer.disconnect.banned_ip.expiration", field_44628.format(var5.method_20563())));
            }

            return var6;
         } else {
            return this.field_44632.size() >= this.field_44634 && !this.method_39995(var2)
               ? new TranslationTextComponent("multiplayer.disconnect.server_full")
               : null;
         }
      } else {
         return new TranslationTextComponent("multiplayer.disconnect.not_whitelisted");
      }
   }

   public class_9359 method_40000(GameProfile var1) {
      UUID var4 = class_704.method_3242(var1);
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < this.field_44632.size(); var6++) {
         class_9359 var7 = this.field_44632.get(var6);
         if (var7.method_37328().equals(var4)) {
            var5.add(var7);
         }
      }

      class_9359 var9 = this.field_44619.get(var1.getId());
      if (var9 != null && !var5.contains(var9)) {
         var5.add(var9);
      }

      for (class_9359 var8 : var5) {
         var8.field_47794.method_4161(new TranslationTextComponent("multiplayer.disconnect.duplicate_login"));
      }

      class_6331 var11 = this.field_44631.method_1736();
      Object var12;
      if (!this.field_44631.method_1691()) {
         var12 = new class_8598(var11);
      } else {
         var12 = new class_6936(var11);
      }

      return new class_9359(this.field_44631, var11, var1, (class_8598)var12);
   }

   public class_9359 method_39984(class_9359 var1, boolean var2) {
      this.field_44632.remove(var1);
      var1.method_43235().method_28964(var1);
      class_1331 var5 = var1.method_43279();
      float var6 = var1.method_43270();
      boolean var7 = var1.method_43268();
      class_6331 var8 = this.field_44631.method_1697(var1.method_43259());
      Optional var9;
      if (var8 != null && var5 != null) {
         var9 = class_704.method_3167(var8, var5, var6, var7, var2);
      } else {
         var9 = Optional.empty();
      }

      class_6331 var10 = var8 != null && var9.isPresent() ? var8 : this.field_44631.method_1736();
      Object var11;
      if (!this.field_44631.method_1691()) {
         var11 = new class_8598(var10);
      } else {
         var11 = new class_6936(var10);
      }

      class_9359 var12 = new class_9359(this.field_44631, var10, var1.method_3247(), (class_8598)var11);
      var12.field_47794 = var1.field_47794;
      var12.method_43273(var1, var2);
      var12.method_37091(var1.method_37145());
      var12.method_3206(var1.method_26432());

      for (String var14 : var1.method_37293()) {
         var12.method_37292(var14);
      }

      this.method_39980(var12, var1, var10);
      boolean var19 = false;
      if (!var9.isPresent()) {
         if (var5 != null) {
            var12.field_47794.method_4156(new class_2161(class_2161.field_10779, 0.0F));
         }
      } else {
         class_2522 var20 = var10.method_28262(var5);
         boolean var15 = var20.method_8350(class_4783.field_23807);
         class_1343 var16 = (class_1343)var9.get();
         float var18;
         if (!var20.method_8349(class_2351.field_11784) && !var15) {
            var18 = var6;
         } else {
            class_1343 var17 = class_1343.method_6200(var5).method_6194(var16).method_6213();
            var18 = (float)class_9299.method_42809(class_9299.method_42821(var17.field_7334, var17.field_7336) * 180.0F / (float)Math.PI - 90.0);
         }

         var12.method_37144(var16.field_7336, var16.field_7333, var16.field_7334, var18, 0.0F);
         var12.method_43248(var10.method_29545(), var5, var6, var7, false);
         var19 = !var2 && var15;
      }

      while (!var10.method_6682(var12) && var12.method_37309() < 256.0) {
         var12.method_37256(var12.method_37302(), var12.method_37309() + 1.0, var12.method_37156());
      }

      class_1906 var21 = var12.field_41768.method_43366();
      var12.field_47794
         .method_4156(
            new class_7786(
               var12.field_41768.method_22572(),
               var12.field_41768.method_29545(),
               class_859.method_3728(var12.method_43235().method_3133()),
               var12.field_47807.method_39517(),
               var12.field_47807.method_39524(),
               var12.method_43235().method_29581(),
               var12.method_43235().method_28943(),
               var2
            )
         );
      var12.field_47794.method_4170(var12.method_37302(), var12.method_37309(), var12.method_37156(), var12.field_41701, var12.field_41755);
      var12.field_47794.method_4156(new class_2073(var10.method_28998(), var10.method_28988()));
      var12.field_47794.method_4156(new class_9275(var21.method_8661(), var21.method_8662()));
      var12.field_47794.method_4156(new class_8175(var12.field_3842, var12.field_3862, var12.field_3840));
      this.method_39955(var12, var10);
      this.method_39976(var12);
      var10.method_28946(var12);
      this.field_44632.add(var12);
      this.field_44619.put(var12.method_37328(), var12);
      var12.method_43243();
      var12.method_26456(var12.method_26551());
      if (var19) {
         var12.field_47794
            .method_4156(
               new class_3740(
                  class_463.field_2464, class_562.field_3322, (double)var5.method_12173(), (double)var5.method_12165(), (double)var5.method_12185(), 1.0F, 1.0F
               )
            );
      }

      return var12;
   }

   public void method_39976(class_9359 var1) {
      GameProfile var4 = var1.method_3247();
      int var5 = this.field_44631.method_1685(var4);
      this.method_39960(var1, var5);
   }

   public void method_39977() {
      if (++this.field_44626 > 600) {
         this.method_39972(new class_7867(class_2236.field_11141, this.field_44632));
         this.field_44626 = 0;
      }
   }

   public void method_39972(Packet<?> var1) {
      for (int var4 = 0; var4 < this.field_44632.size(); var4++) {
         this.field_44632.get(var4).field_47794.method_4156(var1);
      }
   }

   public void method_39958(Packet<?> var1, class_5621<World> var2) {
      for (int var5 = 0; var5 < this.field_44632.size(); var5++) {
         class_9359 var6 = this.field_44632.get(var5);
         if (var6.field_41768.method_29545() == var2) {
            var6.field_47794.method_4156(var1);
         }
      }
   }

   public void method_39990(class_704 var1, ITextComponent var2) {
      class_5086 var5 = var1.method_37095();
      if (var5 != null) {
         for (String var7 : var5.method_23378()) {
            class_9359 var8 = this.method_39993(var7);
            if (var8 != null && var8 != var1) {
               var8.method_26286(var2, var1.method_37328());
            }
         }
      }
   }

   public void method_39965(class_704 var1, ITextComponent var2) {
      class_5086 var5 = var1.method_37095();
      if (var5 != null) {
         for (int var6 = 0; var6 < this.field_44632.size(); var6++) {
            class_9359 var7 = this.field_44632.get(var6);
            if (var7.method_37095() != var5) {
               var7.method_26286(var2, var1.method_37328());
            }
         }
      } else {
         this.method_39983(var2, ChatType.SYSTEM, var1.method_37328());
      }
   }

   public String[] method_39968() {
      String[] var3 = new String[this.field_44632.size()];

      for (int var4 = 0; var4 < this.field_44632.size(); var4++) {
         var3[var4] = this.field_44632.get(var4).method_3247().getName();
      }

      return var3;
   }

   public class_161 method_39988() {
      return this.field_44630;
   }

   public class_9065 method_39952() {
      return this.field_44629;
   }

   public void method_39966(GameProfile var1) {
      this.field_44624.method_19928(new class_3791(var1, this.field_44631.method_1675(), this.field_44624.method_36526(var1)));
      class_9359 var4 = this.method_39982(var1.getId());
      if (var4 != null) {
         this.method_39976(var4);
      }
   }

   public void method_39989(GameProfile var1) {
      this.field_44624.method_19925(var1);
      class_9359 var4 = this.method_39982(var1.getId());
      if (var4 != null) {
         this.method_39976(var4);
      }
   }

   private void method_39960(class_9359 var1, int var2) {
      if (var1.field_47794 != null) {
         byte var5;
         if (var2 > 0) {
            if (var2 < 4) {
               var5 = (byte)(24 + var2);
            } else {
               var5 = 28;
            }
         } else {
            var5 = 24;
         }

         var1.field_47794.method_4156(new class_295(var1, var5));
      }

      this.field_44631.method_1631().method_2233(var1);
   }

   public boolean method_39959(GameProfile var1) {
      return !this.field_44621 || this.field_44624.method_19933(var1) || this.field_44613.method_19933(var1);
   }

   public boolean method_39962(GameProfile var1) {
      return this.field_44624.method_19933(var1) || this.field_44631.method_1610(var1) && this.field_44631.method_1601().method_25714() || this.field_44633;
   }

   @Nullable
   public class_9359 method_39993(String var1) {
      for (class_9359 var5 : this.field_44632) {
         if (var5.method_3247().getName().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method_39996(class_704 var1, double var2, double var4, double var6, double var8, class_5621<World> var10, Packet<?> var11) {
      for (int var14 = 0; var14 < this.field_44632.size(); var14++) {
         class_9359 var15 = this.field_44632.get(var14);
         if (var15 != var1 && var15.field_41768.method_29545() == var10) {
            double var16 = var2 - var15.method_37302();
            double var18 = var4 - var15.method_37309();
            double var20 = var6 - var15.method_37156();
            if (var16 * var16 + var18 * var18 + var20 * var20 < var8 * var8) {
               var15.field_47794.method_4156(var11);
            }
         }
      }
   }

   public void method_39964() {
      for (int var3 = 0; var3 < this.field_44632.size(); var3++) {
         this.method_39967(this.field_44632.get(var3));
      }
   }

   public class_5686 method_39979() {
      return this.field_44613;
   }

   public String[] method_39994() {
      return this.field_44613.method_19929();
   }

   public class_8053 method_39947() {
      return this.field_44624;
   }

   public String[] method_39986() {
      return this.field_44624.method_19929();
   }

   public void method_39969() {
   }

   public void method_39955(class_9359 var1, class_6331 var2) {
      class_2098 var5 = this.field_44631.method_1736().method_6673();
      var1.field_47794.method_4156(new class_1388(var5, class_1534.field_8136));
      var1.field_47794.method_4156(new class_8508(var2.method_29546(), var2.method_29584(), var2.method_29537().method_1285(class_291.field_1037)));
      var1.field_47794.method_4156(new class_2073(var2.method_28998(), var2.method_28988()));
      if (var2.method_29561()) {
         var1.field_47794.method_4156(new class_2161(class_2161.field_10786, 0.0F));
         var1.field_47794.method_4156(new class_2161(class_2161.field_10777, var2.method_29578(1.0F)));
         var1.field_47794.method_4156(new class_2161(class_2161.field_10789, var2.method_29601(1.0F)));
      }
   }

   public void method_39971(class_9359 var1) {
      var1.method_43264(var1.field_3869);
      var1.method_43236();
      var1.field_47794.method_4156(new class_4020(var1.inventory.field_36404));
   }

   public int method_39998() {
      return this.field_44632.size();
   }

   public int method_39963() {
      return this.field_44634;
   }

   public boolean method_39997() {
      return this.field_44621;
   }

   public void method_39956(boolean var1) {
      this.field_44621 = var1;
   }

   public List<class_9359> method_39985(String var1) {
      ArrayList var4 = Lists.newArrayList();

      for (class_9359 var6 : this.field_44632) {
         if (var6.method_43255().equals(var1)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public int method_39970() {
      return this.field_44617;
   }

   public class_341 method_39974() {
      return this.field_44631;
   }

   public class_5734 method_39949() {
      return null;
   }

   public void method_39991(GameType var1) {
      this.field_44625 = var1;
   }

   private void method_39980(class_9359 var1, class_9359 var2, class_6331 var3) {
      if (var2 == null) {
         if (this.field_44625 != null) {
            var1.field_47807.method_39516(this.field_44625, GameType.field_22762);
         }
      } else {
         var1.field_47807.method_39516(var2.field_47807.method_39517(), var2.field_47807.method_39524());
      }

      var1.field_47807.method_39521(var3.method_29522().method_1601().method_25709());
   }

   public void method_39946(boolean var1) {
      this.field_44633 = var1;
   }

   public void method_39987() {
      for (int var3 = 0; var3 < this.field_44632.size(); var3++) {
         this.field_44632.get(var3).field_47794.method_4161(new TranslationTextComponent("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void method_39983(ITextComponent var1, ChatType var2, UUID var3) {
      this.field_44631.method_26286(var1, var3);
      this.method_39972(new class_5182(var1, var2, var3));
   }

   public class_7909 method_39957(class_704 var1) {
      UUID var4 = var1.method_37328();
      class_7909 var5 = var4 != null ? this.field_44622.get(var4) : null;
      if (var5 == null) {
         File var6 = this.field_44631.method_1649(class_263.field_933).toFile();
         File var7 = new File(var6, var4 + ".json");
         if (!var7.exists()) {
            File var8 = new File(var6, var1.method_45509().getString() + ".json");
            if (var8.exists() && var8.isFile()) {
               var8.renameTo(var7);
            }
         }

         var5 = new class_7909(this.field_44631, var7);
         this.field_44622.put(var4, var5);
      }

      return var5;
   }

   public class_3362 method_39950(class_9359 var1) {
      UUID var4 = var1.method_37328();
      class_3362 var5 = this.field_44614.get(var4);
      if (var5 == null) {
         File var6 = this.field_44631.method_1649(class_263.field_929).toFile();
         File var7 = new File(var6, var4 + ".json");
         var5 = new class_3362(this.field_44631.method_1607(), this, this.field_44631.method_1703(), var7, var1);
         this.field_44614.put(var4, var5);
      }

      var5.method_15407(var1);
      return var5;
   }

   public void method_39961(int var1) {
      this.field_44617 = var1;
      this.method_39972(new class_3767(var1));

      for (class_6331 var5 : this.field_44631.method_1719()) {
         if (var5 != null) {
            var5.method_28945().method_10199(var1);
         }
      }
   }

   public List<class_9359> method_39951() {
      return this.field_44632;
   }

   @Nullable
   public class_9359 method_39982(UUID var1) {
      return this.field_44619.get(var1);
   }

   public boolean method_39995(GameProfile var1) {
      return false;
   }

   public void method_39981() {
      for (class_3362 var4 : this.field_44614.values()) {
         var4.method_15394(this.field_44631.method_1703());
      }

      this.method_39972(new class_5042(this.field_44631.method_1754()));
      class_6621 var6 = new class_6621(this.field_44631.method_1705().method_23141());

      for (class_9359 var5 : this.field_44632) {
         var5.field_47794.method_4156(var6);
         var5.method_43266().method_14035(var5);
      }
   }

   public boolean method_39978() {
      return this.field_44633;
   }
}

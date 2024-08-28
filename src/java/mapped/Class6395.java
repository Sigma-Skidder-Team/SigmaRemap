package mapped;

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

public abstract class Class6395 {
   public static final File field27984 = new File("banned-players.json");
   public static final File field27985 = new File("banned-ips.json");
   public static final File field27986 = new File("ops.json");
   public static final File field27987 = new File("whitelist.json");
   private static final Logger field27988 = LogManager.getLogger();
   private static final SimpleDateFormat field27989 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final Class314 field27990;
   private final List<Class878> field27991 = Lists.newArrayList();
   private final Map<UUID, Class878> field27992 = Maps.newHashMap();
   private final Class4528 field27993 = new Class4528(field27984);
   private final Class4532 field27994 = new Class4532(field27985);
   private final Class4530 field27995 = new Class4530(field27986);
   private final Class4531 field27996 = new Class4531(field27987);
   private final Map<UUID, Class8287> field27997 = Maps.newHashMap();
   private final Map<UUID, Class8019> field27998 = Maps.newHashMap();
   private final Class8716 field27999;
   private boolean field28000;
   private final Class8905 field28001;
   public final int field28002;
   private int field28003;
   private Class1894 field28004;
   private boolean field28005;
   private int field28006;

   public Class6395(Class314 var1, Class8905 var2, Class8716 var3, int var4) {
      this.field27990 = var1;
      this.field28001 = var2;
      this.field28002 = var4;
      this.field27999 = var3;
   }

   public void method19445(Class8586 var1, Class878 var2) {
      GameProfile var5 = var2.method2906();
      Class8805 var6 = this.field27990.method1386();
      GameProfile var7 = var6.method31793(var5.getId());
      String var8 = var7 != null ? var7.getName() : var5.getName();
      var6.method31790(var5);
      Class39 var9 = this.method19448(var2);
      Class8705 var10 = var9 == null
         ? Class1655.field8999
         : Class9535.method36867(new Dynamic(Class8063.field34602, var9.method116("Dimension"))).resultOrPartial(field27988::error).orElse(Class1655.field8999);
      Class1657 var11 = this.field27990.method1318(var10);
      Class1657 var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         field27988.warn("Unknown respawn dimension {}, defaulting to overworld", var10);
         var12 = this.field27990.method1317();
      }

      var2.method3268(var12);
      var2.field4857.method33871((Class1657)var2.field5024);
      String var13 = "local";
      if (var1.method30700() != null) {
         var13 = var1.method30700().toString();
      }

      field27988.info(
         "{}[{}] logged in with entity id {} at ({}, {}, {})",
         var2.method2941().getString(),
         var13,
         var2.method3205(),
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ()
      );
      Class6612 var14 = var12.method6788();
      this.method19481(var2, (Class878)null, var12);
      Class5111 var15 = new Class5111(this.field27990, var1, var2);
      Class5462 var16 = var12.method6789();
      boolean var17 = var16.method17135(Class5462.field24248);
      boolean var18 = var16.method17135(Class5462.field24237);
      var15.method15671(
         new Class5499(
            var2.method3205(),
            var2.field4857.method33863(),
            var2.field4857.method33864(),
            Class6668.method20321(var12.method6967()),
            var14.method20045(),
            this.field27990.method1319(),
            this.field28001,
            var12.method6812(),
            var12.method6813(),
            this.method19475(),
            this.field28003,
            var18,
            !var17,
            var12.method6823(),
            var12.method6966()
         )
      );
      var15.method15671(new Class5532(Class5532.field24537, new PacketBuffer(Unpooled.buffer()).method35729(this.method19444().method1325())));
      var15.method15671(new Class5535(var14.method20047(), var14.method20048()));
      var15.method15671(new Class5599(var2.field4919));
      var15.method15671(new Class5608(var2.field4902.field5443));
      var15.method15671(new Class5512(this.field27990.method1407().method1036()));
      var15.method15671(new Class5611(this.field27990.method1408()));
      this.method19454(var2);
      var2.method2809().method28969();
      var2.method2810().method21382(var2);
      this.method19446(var12.method6805(), var2);
      this.field27990.method1388();
      TranslationTextComponent var19;
      if (!var2.method2906().getName().equalsIgnoreCase(var8)) {
         var19 = new TranslationTextComponent("multiplayer.player.joined.renamed", var2.method2954(), var8);
      } else {
         var19 = new TranslationTextComponent("multiplayer.player.joined", var2.method2954());
      }

      this.method19484(var19.mergeStyle(TextFormatting.YELLOW), ChatType.SYSTEM, Util.field45724);
      var15.method15668(var2.getPosX(), var2.getPosY(), var2.getPosZ(), var2.field5031, var2.field5032);
      this.field27991.add(var2);
      this.field27992.put(var2.method3375(), var2);
      this.method19456(new Class5503(Class2176.field14281, var2));

      for (int var20 = 0; var20 < this.field27991.size(); var20++) {
         var2.field4855.method15671(new Class5503(Class2176.field14281, this.field27991.get(var20)));
      }

      var12.method6921(var2);
      this.field27990.method1414().method29607(var2);
      this.method19472(var2, var12);
      if (!this.field27990.method1344().isEmpty()) {
         var2.method2806(this.field27990.method1344(), this.field27990.method1345());
      }

      for (Class2023 var21 : var2.method3031()) {
         var15.method15671(new Class5537(var2.method3205(), var21));
      }

      if (var9 != null && var9.method119("RootVehicle", 10)) {
         Class39 var26 = var9.method130("RootVehicle");
         Entity var27 = Class8992.method33223(var26.method130("Entity"), var12, var1x -> var12.method6917(var1x) ? var1x : null);
         if (var27 != null) {
            UUID var22;
            if (!var26.method106("Attach")) {
               var22 = null;
            } else {
               var22 = var26.method105("Attach");
            }

            if (!var27.method3375().equals(var22)) {
               for (Entity var24 : var27.method3411()) {
                  if (var24.method3375().equals(var22)) {
                     var2.method2758(var24, true);
                     break;
                  }
               }
            } else {
               var2.method2758(var27, true);
            }

            if (!var2.method3328()) {
               field27988.warn("Couldn't reattach entity to player");
               var12.method6932(var27);

               for (Entity var29 : var27.method3411()) {
                  var12.method6932(var29);
               }
            }
         }
      }

      var2.method2729();
   }

   public void method19446(Class6887 var1, Class878 var2) {
      HashSet var5 = Sets.newHashSet();

      for (Class8218 var7 : var1.method20997()) {
         var2.field4855.method15671(new Class5581(var7, 0));
      }

      for (int var10 = 0; var10 < 19; var10++) {
         Class8375 var11 = var1.method20989(var10);
         if (var11 != null && !var5.contains(var11)) {
            for (Packet var9 : var1.method21023(var11)) {
               var2.field4855.method15671(var9);
            }

            var5.add(var11);
         }
      }
   }

   public void method19447(Class1657 var1) {
      var1.method6810().method24543(new Class7046(this));
   }

   @Nullable
   public Class39 method19448(Class878 var1) {
      Class39 var4 = this.field27990.method1436().method20083();
      Class39 var5;
      if (var1.method2941().getString().equals(this.field27990.method1332()) && var4 != null) {
         var5 = var4;
         var1.method3295(var4);
         field27988.debug("loading single player");
      } else {
         var5 = this.field27999.method31442(var1);
      }

      return var5;
   }

   public void method19449(Class878 var1) {
      this.field27999.method31441(var1);
      Class8287 var4 = this.field27997.get(var1.method3375());
      if (var4 != null) {
         var4.method28962();
      }

      Class8019 var5 = this.field27998.get(var1.method3375());
      if (var5 != null) {
         var5.method27409();
      }
   }

   public void method19450(Class878 var1) {
      Class1657 var4 = var1.method2798();
      var1.method2911(Class8876.field40105);
      this.method19449(var1);
      if (var1.method3328()) {
         Entity var5 = var1.method3415();
         if (var5.method3413()) {
            field27988.debug("Removing player mount");
            var1.method2759();
            var4.method6932(var5);
            var5.field5041 = true;

            for (Entity var7 : var5.method3411()) {
               var4.method6932(var7);
               var7.field5041 = true;
            }

            var4.method6824(var1.field5072, var1.field5074).method7137();
         }
      }

      var1.method3200();
      var4.method6934(var1);
      var1.method2823().method27403();
      this.field27991.remove(var1);
      this.field27990.method1414().method29608(var1);
      UUID var8 = var1.method3375();
      Class878 var9 = this.field27992.get(var8);
      if (var9 == var1) {
         this.field27992.remove(var8);
         this.field27997.remove(var8);
         this.field27998.remove(var8);
      }

      this.method19456(new Class5503(Class2176.field14285, var1));
   }

   @Nullable
   public ITextComponent method19451(SocketAddress var1, GameProfile var2) {
      if (this.field27993.method14431(var2)) {
         Class6786 var7 = this.field27993.method14437(var2);
         TranslationTextComponent var8 = new TranslationTextComponent("multiplayer.disconnect.banned.reason", var7.method20683());
         if (var7.method20682() != null) {
            var8.append(new TranslationTextComponent("multiplayer.disconnect.banned.expiration", field27989.format(var7.method20682())));
         }

         return var8;
      } else if (this.method19441(var2)) {
         if (this.field27994.method14449(var1)) {
            Class6788 var5 = this.field27994.method14451(var1);
            TranslationTextComponent var6 = new TranslationTextComponent("multiplayer.disconnect.banned_ip.reason", var5.method20683());
            if (var5.method20682() != null) {
               var6.append(new TranslationTextComponent("multiplayer.disconnect.banned_ip.expiration", field27989.format(var5.method20682())));
            }

            return var6;
         } else {
            return this.field27991.size() >= this.field28002 && !this.method19443(var2)
               ? new TranslationTextComponent("multiplayer.disconnect.server_full")
               : null;
         }
      } else {
         return new TranslationTextComponent("multiplayer.disconnect.not_whitelisted");
      }
   }

   public Class878 method19452(GameProfile var1) {
      UUID var4 = PlayerEntity.method2960(var1);
      List<Class878> var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < this.field27991.size(); var6++) {
         Class878 var7 = this.field27991.get(var6);
         if (var7.method3375().equals(var4)) {
            var5.add(var7);
         }
      }

      Class878 var9 = this.field27992.get(var1.getId());
      if (var9 != null && !var5.contains(var9)) {
         var5.add(var9);
      }

      for (Class878 var8 : var5) {
         var8.field4855.method15658(new TranslationTextComponent("multiplayer.disconnect.duplicate_login"));
      }

      Class1657 var11 = this.field27990.method1317();
      Object var12;
      if (!this.field27990.method1342()) {
         var12 = new Class9081(var11);
      } else {
         var12 = new Class9080(var11);
      }

      return new Class878(this.field27990, var11, var1, (Class9081)var12);
   }

   public Class878 method19453(Class878 var1, boolean var2) {
      this.field27991.remove(var1);
      var1.method2798().method6934(var1);
      BlockPos var5 = var1.method2825();
      float var6 = var1.method2826();
      boolean var7 = var1.method2828();
      Class1657 var8 = this.field27990.method1318(var1.method2827());
      Optional var9;
      if (var8 != null && var5 != null) {
         var9 = PlayerEntity.method2908(var8, var5, var6, var7, var2);
      } else {
         var9 = Optional.empty();
      }

      Class1657 var10 = var8 != null && var9.isPresent() ? var8 : this.field27990.method1317();
      Object var11;
      if (!this.field27990.method1342()) {
         var11 = new Class9081(var10);
      } else {
         var11 = new Class9080(var10);
      }

      Class878 var12 = new Class878(this.field27990, var10, var1.method2906(), (Class9081)var11);
      var12.field4855 = var1.field4855;
      var12.method2789(var1, var2);
      var12.method3206(var1.method3205());
      var12.method2968(var1.method2967());

      for (String var14 : var1.method3207()) {
         var12.method3208(var14);
      }

      this.method19481(var12, var1, var10);
      boolean var19 = false;
      if (!var9.isPresent()) {
         if (var5 != null) {
            var12.field4855.method15671(new Class5534(Class5534.field24560, 0.0F));
         }
      } else {
         Class7380 var20 = var10.method6738(var5);
         boolean var15 = var20.method23448(Blocks.field37124);
         Vector3d var16 = (Vector3d)var9.get();
         float var18;
         if (!var20.method23446(Class7645.field32770) && !var15) {
            var18 = var6;
         } else {
            Vector3d var17 = Vector3d.method11330(var5).method11336(var16).method11333();
            var18 = (float)Class9679.method37793(Class9679.method37814(var17.field18050, var17.field18048) * 180.0F / (float)Math.PI - 90.0);
         }

         var12.method3273(var16.field18048, var16.field18049, var16.field18050, var18, 0.0F);
         var12.method2829(var10.method6813(), var5, var6, var7, false);
         var19 = !var2 && var15;
      }

      while (!var10.method7052(var12) && var12.getPosY() < 256.0) {
         var12.method3215(var12.getPosX(), var12.getPosY() + 1.0, var12.getPosZ());
      }

      Class6612 var21 = var12.field5024.method6788();
      var12.field4855
         .method15671(
            new Class5545(
               var12.field5024.method6812(),
               var12.field5024.method6813(),
               Class6668.method20321(var12.method2798().method6967()),
               var12.field4857.method33863(),
               var12.field4857.method33864(),
               var12.method2798().method6823(),
               var12.method2798().method6966(),
               var2
            )
         );
      var12.field4855.method15668(var12.getPosX(), var12.getPosY(), var12.getPosZ(), var12.field5031, var12.field5032);
      var12.field4855.method15671(new Class5525(var10.method6947(), var10.method6948()));
      var12.field4855.method15671(new Class5535(var21.method20047(), var21.method20048()));
      var12.field4855.method15671(new Class5507(var12.field4922, var12.field4921, var12.field4920));
      this.method19472(var12, var10);
      this.method19454(var12);
      var10.method6922(var12);
      this.field27991.add(var12);
      this.field27992.put(var12.method3375(), var12);
      var12.method2729();
      var12.method3043(var12.method3042());
      if (var19) {
         var12.field4855
            .method15671(
               new Class5584(
                  Class6067.field27014, Class2266.field14732, (double)var5.method8304(), (double)var5.getY(), (double)var5.method8306(), 1.0F, 1.0F
               )
            );
      }

      return var12;
   }

   public void method19454(Class878 var1) {
      GameProfile var4 = var1.method2906();
      int var5 = this.field27990.method1418(var4);
      this.method19463(var1, var5);
   }

   public void method19455() {
      if (++this.field28006 > 600) {
         this.method19456(new Class5503(Class2176.field14283, this.field27991));
         this.field28006 = 0;
      }
   }

   public void method19456(Packet<?> var1) {
      for (int var4 = 0; var4 < this.field27991.size(); var4++) {
         this.field27991.get(var4).field4855.method15671(var1);
      }
   }

   public void method19457(Packet<?> var1, Class8705<Class1655> var2) {
      for (int var5 = 0; var5 < this.field27991.size(); var5++) {
         Class878 var6 = this.field27991.get(var5);
         if (var6.field5024.method6813() == var2) {
            var6.field4855.method15671(var1);
         }
      }
   }

   public void method19458(PlayerEntity var1, ITextComponent var2) {
      Class8219 var5 = var1.method3344();
      if (var5 != null) {
         for (String var7 : var5.method28575()) {
            Class878 var8 = this.method19465(var7);
            if (var8 != null && var8 != var1) {
               var8.method1328(var2, var1.method3375());
            }
         }
      }
   }

   public void method19459(PlayerEntity var1, ITextComponent var2) {
      Class8219 var5 = var1.method3344();
      if (var5 != null) {
         for (int var6 = 0; var6 < this.field27991.size(); var6++) {
            Class878 var7 = this.field27991.get(var6);
            if (var7.method3344() != var5) {
               var7.method1328(var2, var1.method3375());
            }
         }
      } else {
         this.method19484(var2, ChatType.SYSTEM, var1.method3375());
      }
   }

   public String[] method19460() {
      String[] var3 = new String[this.field27991.size()];

      for (int var4 = 0; var4 < this.field27991.size(); var4++) {
         var3[var4] = this.field27991.get(var4).method2906().getName();
      }

      return var3;
   }

   public Class4528 method19461() {
      return this.field27993;
   }

   public Class4532 method19462() {
      return this.field27994;
   }

   public void method19430(GameProfile var1) {
      this.field27995.method14436(new Class6790(var1, this.field27990.method1288(), this.field27995.method14447(var1)));
      Class878 var4 = this.method19489(var1.getId());
      if (var4 != null) {
         this.method19454(var4);
      }
   }

   public void method19431(GameProfile var1) {
      this.field27995.method14438(var1);
      Class878 var4 = this.method19489(var1.getId());
      if (var4 != null) {
         this.method19454(var4);
      }
   }

   private void method19463(Class878 var1, int var2) {
      if (var1.field4855 != null) {
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

         var1.field4855.method15671(new Class5464(var1, var5));
      }

      this.field27990.method1403().method18837(var1);
   }

   public boolean method19441(GameProfile var1) {
      return !this.field28000 || this.field27995.method14441(var1) || this.field27996.method14441(var1);
   }

   public boolean method19464(GameProfile var1) {
      return this.field27995.method14441(var1) || this.field27990.method1421(var1) && this.field27990.method1436().method20072() || this.field28005;
   }

   @Nullable
   public Class878 method19465(String var1) {
      for (Class878 var5 : this.field27991) {
         if (var5.method2906().getName().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method19466(PlayerEntity var1, double var2, double var4, double var6, double var8, Class8705<Class1655> var10, Packet<?> var11) {
      for (int var14 = 0; var14 < this.field27991.size(); var14++) {
         Class878 var15 = this.field27991.get(var14);
         if (var15 != var1 && var15.field5024.method6813() == var10) {
            double var16 = var2 - var15.getPosX();
            double var18 = var4 - var15.getPosY();
            double var20 = var6 - var15.getPosZ();
            if (var16 * var16 + var18 * var18 + var20 * var20 < var8 * var8) {
               var15.field4855.method15671(var11);
            }
         }
      }
   }

   public void method19467() {
      for (int var3 = 0; var3 < this.field27991.size(); var3++) {
         this.method19449(this.field27991.get(var3));
      }
   }

   public Class4531 method19468() {
      return this.field27996;
   }

   public String[] method19469() {
      return this.field27996.method14432();
   }

   public Class4530 method19470() {
      return this.field27995;
   }

   public String[] method19471() {
      return this.field27995.method14432();
   }

   public void method19432() {
   }

   public void method19472(Class878 var1, Class1657 var2) {
      Class7522 var5 = this.field27990.method1317().method6810();
      var1.field4855.method15671(new Class5474(var5, Class1864.field10036));
      var1.field4855.method15671(new Class5577(var2.method6783(), var2.method6784(), var2.method6789().method17135(Class5462.field24232)));
      var1.field4855.method15671(new Class5525(var2.method6947(), var2.method6948()));
      if (var2.method6795()) {
         var1.field4855.method15671(new Class5534(Class5534.field24561, 0.0F));
         var1.field4855.method15671(new Class5534(Class5534.field24567, var2.method6792(1.0F)));
         var1.field4855.method15671(new Class5534(Class5534.field24568, var2.method6790(1.0F)));
      }
   }

   public void method19473(Class878 var1) {
      var1.method2771(var1.field4904);
      var1.method2784();
      var1.field4855.method15671(new Class5608(var1.field4902.field5443));
   }

   public int method19474() {
      return this.field27991.size();
   }

   public int method19475() {
      return this.field28002;
   }

   public boolean method19476() {
      return this.field28000;
   }

   public void method19429(boolean var1) {
      this.field28000 = var1;
   }

   public List<Class878> method19477(String var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Class878 var6 : this.field27991) {
         if (var6.method2803().equals(var1)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public int method19478() {
      return this.field28003;
   }

   public Class314 method19444() {
      return this.field27990;
   }

   public Class39 method19479() {
      return null;
   }

   public void method19480(Class1894 var1) {
      this.field28004 = var1;
   }

   private void method19481(Class878 var1, Class878 var2, Class1657 var3) {
      if (var2 == null) {
         if (this.field28004 != null) {
            var1.field4857.method33862(this.field28004, Class1894.field11101);
         }
      } else {
         var1.field4857.method33862(var2.field4857.method33863(), var2.field4857.method33864());
      }

      var1.field4857.method33867(var3.method6715().method1436().method20067());
   }

   public void method19482(boolean var1) {
      this.field28005 = var1;
   }

   public void method19483() {
      for (int var3 = 0; var3 < this.field27991.size(); var3++) {
         this.field27991.get(var3).field4855.method15658(new TranslationTextComponent("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void method19484(ITextComponent var1, ChatType var2, UUID var3) {
      this.field27990.method1328(var1, var3);
      this.method19456(new Class5616(var1, var2, var3));
   }

   public Class8287 method19485(PlayerEntity var1) {
      UUID var4 = var1.method3375();
      Class8287 var5 = var4 != null ? this.field27997.get(var4) : null;
      if (var5 == null) {
         File var6 = this.field27990.method1433(Class5137.field23347).toFile();
         File var7 = new File(var6, var4 + ".json");
         if (!var7.exists()) {
            File var8 = new File(var6, var1.method2941().getString() + ".json");
            if (var8.exists() && var8.isFile()) {
               var8.renameTo(var7);
            }
         }

         var5 = new Class8287(this.field27990, var7);
         this.field27997.put(var4, var5);
      }

      return var5;
   }

   public Class8019 method19486(Class878 var1) {
      UUID var4 = var1.method3375();
      Class8019 var5 = this.field27998.get(var4);
      if (var5 == null) {
         File var6 = this.field27990.method1433(Class5137.field23346).toFile();
         File var7 = new File(var6, var4 + ".json");
         var5 = new Class8019(this.field27990.method1394(), this, this.field27990.method1396(), var7, var1);
         this.field27998.put(var4, var5);
      }

      var5.method27402(var1);
      return var5;
   }

   public void method19487(int var1) {
      this.field28003 = var1;
      this.method19456(new Class5502(var1));

      for (Class1657 var5 : this.field27990.method1320()) {
         if (var5 != null) {
            var5.method6883().method7381(var1);
         }
      }
   }

   public List<Class878> method19488() {
      return this.field27991;
   }

   @Nullable
   public Class878 method19489(UUID var1) {
      return this.field27992.get(var1);
   }

   public boolean method19443(GameProfile var1) {
      return false;
   }

   public void method19490() {
      for (Class8019 var4 : this.field27998.values()) {
         var4.method27404(this.field27990.method1396());
      }

      this.method19456(new Class5611(this.field27990.method1408()));
      Class5512 var6 = new Class5512(this.field27990.method1407().method1036());

      for (Class878 var5 : this.field27991) {
         var5.field4855.method15671(var6);
         var5.method2810().method21382(var5);
      }
   }

   public boolean method19491() {
      return this.field28005;
   }
}

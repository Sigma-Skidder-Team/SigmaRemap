package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;

public class Class1335 extends Screen {
   private static final Logger field7060 = LogManager.getLogger();
   private static final ITextComponent field7061 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field7062 = new TranslationTextComponent("selectWorld.enterSeed");
   private static final ITextComponent field7063 = new TranslationTextComponent("selectWorld.seedInfo");
   private static final ITextComponent field7064 = new TranslationTextComponent("selectWorld.enterName");
   private static final ITextComponent field7065 = new TranslationTextComponent("selectWorld.resultFolder");
   private static final ITextComponent field7066 = new TranslationTextComponent("selectWorld.allowCommands.info");
   private final Screen field7067;
   private Class1189 field7068;
   private String field7069;
   private Class2079 field7070 = Class2079.field13539;
   private Class2079 field7071;
   private Class2197 field7072 = Class2197.field14353;
   private Class2197 field7073 = Class2197.field14353;
   private boolean field7074;
   private boolean field7075;
   public boolean field7076;
   public Class7818 field7077;
   private Path field7078;
   private Class313 field7079;
   private boolean field7080;
   private Class1206 field7081;
   private Class1206 field7082;
   private Class1206 field7083;
   private Class1206 field7084;
   private Class1206 field7085;
   private Class1206 field7086;
   private Class1206 field7087;
   private ITextComponent field7088;
   private ITextComponent field7089;
   private String field7090;
   private Class5462 field7091 = new Class5462();
   public final Class1221 field7092;

   public Class1335(Screen var1, Class8898 var2, Class7846 var3, Path var4, Class7818 var5, Class8905 var6) {
      this(var1, var5, new Class1221(var6, var3, Class5970.method18504(var3), OptionalLong.of(var3.method26259())));
      this.field7090 = var2.method32426();
      this.field7074 = var2.method32430();
      this.field7075 = true;
      this.field7072 = var2.method32429();
      this.field7073 = this.field7072;
      this.field7091.method17133(var2.method32431(), (Class314)null);
      if (!var2.method32428()) {
         if (!var2.method32427().method8158()) {
            if (var2.method32427().method8157()) {
               this.field7070 = Class2079.field13541;
            }
         } else {
            this.field7070 = Class2079.field13539;
         }
      } else {
         this.field7070 = Class2079.field13540;
      }

      this.field7078 = var4;
   }

   public static Class1335 method6353(Screen var0) {
      Class8905 var3 = Class8904.method32457();
      return new Class1335(
         var0,
         Class7818.field33531,
         new Class1221(
            var3,
            Class7846.method26257(
               var3.<Class9535>method32453(Class2348.field16066),
               var3.<Class8907>method32453(Class2348.field16106),
               var3.<Class9309>method32453(Class2348.field16099)
            ),
            Optional.<Class5970>of(Class5970.field26025),
            OptionalLong.empty()
         )
      );
   }

   private Class1335(Screen var1, Class7818 var2, Class1221 var3) {
      super(new TranslationTextComponent("selectWorld.create"));
      this.field7067 = var1;
      this.field7090 = Class9088.method33883("selectWorld.newWorld");
      this.field7077 = var2;
      this.field7092 = var3;
   }

   @Override
   public void method1919() {
      this.field7068.method5633();
      this.field7092.method1919();
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field7068 = new Class1302(this, this.field4568, this.field4564 / 2 - 100, 60, 200, 20, new TranslationTextComponent("selectWorld.enterName"));
      this.field7068.method5635(this.field7090);
      this.field7068.method5631(var1 -> {
         this.field7090 = var1;
         this.field7081.field6482 = !this.field7068.method5636().isEmpty();
         this.method6355();
      });
      this.field4561.add(this.field7068);
      int var3 = this.field4564 / 2 - 155;
      int var4 = this.field4564 / 2 + 5;
      this.field7082 = this.<Class1206>method2455(new Class1241(this, var3, 100, 150, 20, StringTextComponent.EMPTY, var1 -> {
         switch (Class9406.field43641[this.field7070.ordinal()]) {
            case 1:
               this.method6358(Class2079.field13540);
               break;
            case 2:
               this.method6358(Class2079.field13541);
               break;
            case 3:
               this.method6358(Class2079.field13539);
         }

         var1.method5744(250);
      }));
      this.field7083 = this.<Class1206>method2455(new Class1223(this, var4, 100, 150, 20, new TranslationTextComponent("options.difficulty"), var1 -> {
         this.field7072 = this.field7072.method8910();
         this.field7073 = this.field7072;
         var1.method5744(250);
      }));
      this.field7087 = this.<Class1206>method2455(new Class1217(this, var3, 151, 150, 20, new TranslationTextComponent("selectWorld.allowCommands"), var1 -> {
         this.field7075 = true;
         this.field7074 = !this.field7074;
         var1.method5744(250);
      }));
      this.field7086 = this.<Class1206>method2455(
         new Class1206(var4, 151, 150, 20, new TranslationTextComponent("selectWorld.dataPacks"), var1 -> this.method6364())
      );
      this.field7085 = this.<Class1206>method2455(
         new Class1206(
            var3,
            185,
            150,
            20,
            new TranslationTextComponent("selectWorld.gameRules"),
            var1 -> this.field4562.displayGuiScreen(new Class1127(this.field7091.clone(), var1x -> {
                  this.field4562.displayGuiScreen(this);
                  var1x.ifPresent(var1xx -> this.field7091 = var1xx);
               }))
         )
      );
      this.field7092.method5780(this, this.field4562, this.field4568);
      this.field7084 = this.<Class1206>method2455(
         new Class1206(var4, 185, 150, 20, new TranslationTextComponent("selectWorld.moreWorldOptions"), var1 -> this.method6357())
      );
      this.field7081 = this.<Class1206>method2455(
         new Class1206(var3, this.field4565 - 28, 150, 20, new TranslationTextComponent("selectWorld.create"), var1 -> this.method6356())
      );
      this.field7081.field6482 = !this.field7090.isEmpty();
      this.<Class1206>method2455(new Class1206(var4, this.field4565 - 28, 150, 20, Class7127.field30659, var1 -> this.method6361()));
      this.method6359();
      this.method5536(this.field7068);
      this.method6358(this.field7070);
      this.method6355();
   }

   private void method6354() {
      this.field7088 = new TranslationTextComponent("selectWorld.gameMode." + Class2079.method8734(this.field7070) + ".line1");
      this.field7089 = new TranslationTextComponent("selectWorld.gameMode." + Class2079.method8734(this.field7070) + ".line2");
   }

   private void method6355() {
      this.field7069 = this.field7068.method5636().trim();
      if (this.field7069.isEmpty()) {
         this.field7069 = "World";
      }

      try {
         this.field7069 = Class8950.method32695(this.field4562.method1472().method38466(), this.field7069, "");
      } catch (Exception var6) {
         this.field7069 = "World";

         try {
            this.field7069 = Class8950.method32695(this.field4562.method1472().method38466(), this.field7069, "");
         } catch (Exception var5) {
            throw new RuntimeException("Could not create save folder", var5);
         }
      }
   }

   @Override
   public void method1931() {
      this.field4562.field1302.method36347(false);
   }

   private void method6356() {
      this.field4562.method1508(new Class1310(new TranslationTextComponent("createWorld.preparing")));
      if (this.method6368()) {
         this.method6362();
         Class7846 var3 = this.field7092.method5785(this.field7076);
         Class8898 var5;
         if (var3.method26267()) {
            Class5462 var4 = new Class5462();
            var4.<Class7466>method17128(Class5462.field24232).method24175(false, (Class314)null);
            var5 = new Class8898(this.field7068.method5636().trim(), Class1894.field11105, false, Class2197.field14351, true, var4, Class7818.field33531);
         } else {
            var5 = new Class8898(
               this.field7068.method5636().trim(),
               Class2079.method8735(this.field7070),
               this.field7076,
               this.field7073,
               this.field7074 && !this.field7076,
               this.field7091,
               this.field7077
            );
         }

         this.field4562.method1500(this.field7069, var5, this.field7092.method5789(), var3);
      }
   }

   private void method6357() {
      this.method6360(!this.field7080);
   }

   private void method6358(Class2079 var1) {
      if (!this.field7075) {
         this.field7074 = var1 == Class2079.field13541;
      }

      if (var1 != Class2079.field13540) {
         this.field7076 = false;
         this.field7087.field6482 = true;
         this.field7092.field6558.field6482 = true;
         this.field7073 = this.field7072;
         this.field7083.field6482 = true;
      } else {
         this.field7076 = true;
         this.field7087.field6482 = false;
         this.field7092.field6558.field6482 = false;
         this.field7073 = Class2197.field14354;
         this.field7083.field6482 = false;
      }

      this.field7070 = var1;
      this.method6354();
   }

   public void method6359() {
      this.method6360(this.field7080);
   }

   private void method6360(boolean var1) {
      this.field7080 = var1;
      this.field7082.field6483 = !this.field7080;
      this.field7083.field6483 = !this.field7080;
      if (!this.field7092.method5787()) {
         this.field7082.field6482 = true;
         if (this.field7071 != null) {
            this.method6358(this.field7071);
         }

         this.field7087.field6483 = !this.field7080;
         this.field7086.field6483 = !this.field7080;
      } else {
         this.field7086.field6483 = false;
         this.field7082.field6482 = false;
         if (this.field7071 == null) {
            this.field7071 = this.field7070;
         }

         this.method6358(Class2079.field13542);
         this.field7087.field6483 = false;
      }

      this.field7092.method5788(this.field7080);
      this.field7068.method5671(!this.field7080);
      if (!this.field7080) {
         this.field7084.method5743(new TranslationTextComponent("selectWorld.moreWorldOptions"));
      } else {
         this.field7084.method5743(Class7127.field30658);
      }

      this.field7085.field6483 = !this.field7080;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (!super.method1920(var1, var2, var3)) {
         if (var1 != 257 && var1 != 335) {
            return false;
         } else {
            this.method6356();
            return true;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method1945() {
      if (!this.field7080) {
         this.method6361();
      } else {
         this.method6360(false);
      }
   }

   public void method6361() {
      this.field4562.displayGuiScreen(this.field7067);
      this.method6362();
   }

   private void method6362() {
      if (this.field7079 != null) {
         this.field7079.close();
      }

      this.method6366();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 20, -1);
      if (!this.field7080) {
         method5693(var1, this.field4568, field7064, this.field4564 / 2 - 100, 47, -6250336);
         method5693(
            var1,
            this.field4568,
            new StringTextComponent("").append(field7065).appendString(" ").appendString(this.field7069),
            this.field4564 / 2 - 100,
            85,
            -6250336
         );
         this.field7068.method1923(var1, var2, var3, var4);
         method5693(var1, this.field4568, this.field7088, this.field4564 / 2 - 150, 122, -6250336);
         method5693(var1, this.field4568, this.field7089, this.field4564 / 2 - 150, 134, -6250336);
         if (this.field7087.field6483) {
            method5693(var1, this.field4568, field7066, this.field4564 / 2 - 150, 172, -6250336);
         }
      } else {
         method5693(var1, this.field4568, field7062, this.field4564 / 2 - 100, 47, -6250336);
         method5693(var1, this.field4568, field7063, this.field4564 / 2 - 100, 85, -6250336);
         this.field7092.method1923(var1, var2, var3, var4);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public <T extends Class1152> T method2456(T var1) {
      return super.<T>method2456((T)var1);
   }

   @Override
   public <T extends Class1197> T method2455(T var1) {
      return super.<T>method2455((T)var1);
   }

   @Nullable
   public Path method6363() {
      if (this.field7078 == null) {
         try {
            this.field7078 = Files.createTempDirectory("mcworld-");
         } catch (IOException var4) {
            field7060.warn("Failed to create temporary dir", var4);
            Class7603.method24910(this.field4562, this.field7069);
            this.method6361();
         }
      }

      return this.field7078;
   }

   private void method6364() {
      Pair var3 = this.method6370();
      if (var3 != null) {
         this.field4562
            .displayGuiScreen(
               new Class1336(this, (Class313)var3.getSecond(), this::method6365, (File)var3.getFirst(), new TranslationTextComponent("dataPack.title"))
            );
      }
   }

   private void method6365(Class313 var1) {
      ImmutableList var4 = ImmutableList.copyOf(var1.method1269());
      List var5 = var1.method1267().stream().filter(var1x -> !var4.contains(var1x)).collect(ImmutableList.toImmutableList());
      Class7818 var6 = new Class7818(var4, var5);
      if (!var4.equals(this.field7077.method26104())) {
         this.field4562.method1641(() -> this.field4562.displayGuiScreen(new Class1310(new TranslationTextComponent("dataPack.validation.working"))));
         Class1701.method7338(var1.method1273(), Class2085.field13577, 2, Util.method38492(), this.field4562)
            .handle(
               (var2, var3) -> {
                  if (var3 == null) {
                     this.field4562.method1641(() -> {
                        this.field7077 = var6;
                        this.field7092.method5790(var2);
                        var2.close();
                        this.field4562.displayGuiScreen(this);
                     });
                  } else {
                     field7060.warn("Failed to validate datapack", var3);
                     this.field4562
                        .method1641(
                           () -> this.field4562
                                 .displayGuiScreen(
                                    new Class829(
                                       var1xx -> {
                                          if (!var1xx) {
                                             this.field7077 = Class7818.field33531;
                                             this.field4562.displayGuiScreen(this);
                                          } else {
                                             this.method6364();
                                          }
                                       },
                                       new TranslationTextComponent("dataPack.validation.failed"),
                                       StringTextComponent.EMPTY,
                                       new TranslationTextComponent("dataPack.validation.back"),
                                       new TranslationTextComponent("dataPack.validation.reset")
                                    )
                                 )
                        );
                  }

                  return null;
               }
            );
      } else {
         this.field7077 = var6;
      }
   }

   private void method6366() {
      if (this.field7078 != null) {
         try (Stream var3 = Files.walk(this.field7078)) {
            var3.sorted(Comparator.reverseOrder()).forEach(var0 -> {
               try {
                  Files.delete((Path) var0);
               } catch (IOException var4) {
                  field7060.warn("Failed to remove temporary file {}", var0, var4);
               }
            });
         } catch (IOException var16) {
            field7060.warn("Failed to list temporary dir {}", this.field7078);
         }

         this.field7078 = null;
      }
   }

   private static void method6367(Path var0, Path var1, Path var2) {
      try {
         Util.method38532(var0, var1, var2);
      } catch (IOException var6) {
         field7060.warn("Failed to copy datapack file from {} to {}", var2, var1);
         throw new Class2469(var6);
      }
   }

   private boolean method6368() {
      if (this.field7078 != null) {
         try (
            Class1814 var3 = this.field4562.method1472().method38468(this.field7069);
            Stream var5 = Files.walk(this.field7078);
         ) {
            Path var7 = var3.method7991(Class5137.field23352);
            Files.createDirectories(var7);
            var5.filter(var1 -> !var1.equals(this.field7078)).forEach(var2 -> method6367(this.field7078, var7, (Path) var2));
         } catch (IOException | Class2469 var35) {
            field7060.warn("Failed to copy datapacks to world {}", this.field7069, var35);
            Class7603.method24910(this.field4562, this.field7069);
            this.method6361();
            return false;
         }
      }

      return true;
   }

   @Nullable
   public static Path method6369(Path var0, Minecraft var1) {
      MutableObject var4 = new MutableObject();

      try (Stream var5 = Files.walk(var0)) {
         var5.filter(var1x -> !var1x.equals(var0)).forEach(var2 -> {
            Path var5x = (Path)var4.getValue();
            if (var5x == null) {
               try {
                  var5x = Files.createTempDirectory("mcworld-");
               } catch (IOException var7) {
                  field7060.warn("Failed to create temporary dir");
                  throw new Class2469(var7);
               }

               var4.setValue(var5x);
            }

            method6367(var0, var5x, (Path) var2);
         });
      } catch (IOException | Class2469 var18) {
         field7060.warn("Failed to copy datapacks from world {}", var0, var18);
         Class7603.method24910(var1, var0.toString());
         return null;
      }

      return (Path)var4.getValue();
   }

   @Nullable
   private Pair<File, Class313> method6370() {
      Path var3 = this.method6363();
      if (var3 == null) {
         return null;
      } else {
         File var4 = var3.toFile();
         if (this.field7079 == null) {
            this.field7079 = new Class313(new Class7650(), new Class7652(var4, Class7725.field33170));
            this.field7079.method1262();
         }

         this.field7079.method1264(this.field7077.method26104());
         return Pair.of(var4, this.field7079);
      }
   }

   // $VF: synthetic method
   public static String method6393(Class1335 var0) {
      return var0.field7069;
   }

   // $VF: synthetic method
   public static ITextComponent method6394() {
      return field7061;
   }

   // $VF: synthetic method
   public static Class2079 method6395(Class1335 var0) {
      return var0.field7070;
   }

   // $VF: synthetic method
   public static ITextComponent method6396(Class1335 var0) {
      return var0.field7089;
   }

   // $VF: synthetic method
   public static ITextComponent method6397(Class1335 var0) {
      return var0.field7088;
   }

   // $VF: synthetic method
   public static Class2197 method6398(Class1335 var0) {
      return var0.field7073;
   }

   // $VF: synthetic method
   public static boolean method6399(Class1335 var0) {
      return var0.field7074;
   }
}

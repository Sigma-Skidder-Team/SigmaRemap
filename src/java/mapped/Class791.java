package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.screens.RealmsLongRunningMcoTaskScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

public class Class791 extends Class789 {
   private final RealmsServer field4138;
   private final Screen field4139;
   private final RealmsMainScreen field4140;
   private final ReentrantLock field4141;

   public Class791(RealmsMainScreen var1, Screen var2, RealmsServer var3, ReentrantLock var4) {
      this.field4139 = var2;
      this.field4140 = var1;
      this.field4138 = var3;
      this.field4141 = var4;
   }

   @Override
   public void run() {
      this.method1908(new TranslationTextComponent("mco.connect.connecting"));
      Class4624 var3 = Class4624.method14543();
      boolean var4 = false;
      boolean var5 = false;
      int var6 = 5;
      Class6127 var7 = null;
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = 0; var10 < 40 && !this.method1909(); var10++) {
         try {
            var7 = var3.method14550(this.field4138.field27443);
            var4 = true;
         } catch (Class2436 var13) {
            var6 = var13.field16476;
         } catch (Class2435 var14) {
            if (var14.field16474 == 6002) {
               var8 = true;
            } else if (var14.field16474 == 6006) {
               var9 = true;
            } else {
               var5 = true;
               this.method1918(var14.toString());
               field4133.error("Couldn't connect to world", var14);
            }
            break;
         } catch (Exception var15) {
            var5 = true;
            field4133.error("Couldn't connect to world", var15);
            this.method1918(var15.getLocalizedMessage());
            break;
         }

         if (var4) {
            break;
         }

         this.method1914(var6);
      }

      if (var8) {
         method1905(new Class817(this.field4139, this.field4140, this.field4138));
      } else if (var9) {
         if (this.field4138.field27449.equals(Minecraft.getInstance().getSession().getPlayerID())) {
            method1905(new Class819(this.field4139, this.field4140, this.field4138.field27443, this.field4138.field27455 == Class2049.field13370));
         } else {
            method1905(
               new Class821(
                  new TranslationTextComponent("mco.brokenworld.nonowner.title"),
                  new TranslationTextComponent("mco.brokenworld.nonowner.error"),
                  this.field4139
               )
            );
         }
      } else if (!this.method1909() && !var5) {
         if (var4) {
            Class6127 var16 = var7;
            if (var16.field27440 != null && var16.field27441 != null) {
               TranslationTextComponent var11 = new TranslationTextComponent("mco.configure.world.resourcepack.question.line1");
               TranslationTextComponent var12 = new TranslationTextComponent("mco.configure.world.resourcepack.question.line2");
               method1905(
                  new Class808(
                     var2 -> {
                        try {
                           if (var2) {
                              Function var5x = var1x -> {
                                 Minecraft.getInstance().getPackFinder().clearResourcePack();
                                 field4133.error(var1x);
                                 method1905(new Class821(new StringTextComponent("Failed to download resource pack!"), this.field4139));
                                 return null;
                              };

                              try {
                                 Minecraft.getInstance()
                                    .getPackFinder()
                                    .downloadResourcePack(var16.field27440, var16.field27441)
                                    .thenRun(() -> this.method1906(new RealmsLongRunningMcoTaskScreen(this.field4139, new Class793(this.field4139, this.field4138, var16))))
                                    .exceptionally(var5x);
                              } catch (Exception var10x) {
                                 var5x.apply(var10x);
                              }
                           } else {
                              method1905(this.field4139);
                           }
                        } finally {
                           if (this.field4141 != null && this.field4141.isHeldByCurrentThread()) {
                              this.field4141.unlock();
                           }
                        }
                     },
                     Class2134.field13980,
                     var11,
                     var12,
                     true
                  )
               );
            } else {
               this.method1906(new RealmsLongRunningMcoTaskScreen(this.field4139, new Class793(this.field4139, this.field4138, var16)));
            }
         } else {
            this.method1907(new TranslationTextComponent("mco.errorMessage.connectionFailure"));
         }
      }
   }

   private void method1914(int var1) {
      
   }
}

package remapped;

import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3226 extends class_5875 {
   private final class_7675 field_16065;
   private final Screen field_16067;
   private final class_7039 field_16064;
   private final ReentrantLock field_16068;

   public class_3226(class_7039 var1, Screen var2, class_7675 var3, ReentrantLock var4) {
      this.field_16067 = var2;
      this.field_16064 = var1;
      this.field_16065 = var3;
      this.field_16068 = var4;
   }

   @Override
   public void run() {
      this.method_26756(new TranslationTextComponent("mco.connect.connecting"));
      class_176 var3 = class_176.method_777();
      boolean var4 = false;
      boolean var5 = false;
      int var6 = 5;
      class_7798 var7 = null;
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = 0; var10 < 40 && !this.method_26759(); var10++) {
         try {
            var7 = var3.method_788(this.field_16065.field_39016);
            var4 = true;
         } catch (class_5954 var13) {
            var6 = var13.field_30351;
         } catch (class_3900 var14) {
            if (var14.field_18957 == 6002) {
               var8 = true;
            } else if (var14.field_18957 == 6006) {
               var9 = true;
            } else {
               var5 = true;
               this.method_38114(var14.toString());
               field_29831.error("Couldn't connect to world", var14);
            }
            break;
         } catch (Exception var15) {
            var5 = true;
            field_29831.error("Couldn't connect to world", var15);
            this.method_38114(var15.getLocalizedMessage());
            break;
         }

         if (var4) {
            break;
         }

         this.method_14783(var6);
      }

      if (var8) {
         method_26755(new class_9016(this.field_16067, this.field_16064, this.field_16065));
      } else if (var9) {
         if (this.field_16065.field_39014.equals(MinecraftClient.getInstance().method_8502().method_5367())) {
            method_26755(
               new class_5747(this.field_16067, this.field_16064, this.field_16065.field_39016, this.field_16065.field_39015 == class_8840.field_45209)
            );
         } else {
            method_26755(
               new class_9306(
                  new TranslationTextComponent("mco.brokenworld.nonowner.title"),
                  new TranslationTextComponent("mco.brokenworld.nonowner.error"),
                  this.field_16067
               )
            );
         }
      } else if (!this.method_26759() && !var5) {
         if (var4) {
            class_7798 var16 = var7;
            if (var16.field_39501 != null && var16.field_39503 != null) {
               TranslationTextComponent var11 = new TranslationTextComponent("mco.configure.world.resourcepack.question.line1");
               TranslationTextComponent var12 = new TranslationTextComponent("mco.configure.world.resourcepack.question.line2");
               method_26755(
                  new class_2238(
                     var2 -> {
                        try {
                           if (var2) {
                              Function var5x = var1x -> {
                                 MinecraftClient.getInstance().method_8606().method_25058();
                                 field_29831.error(var1x);
                                 method_26755(new class_9306(new StringTextComponent("Failed to download resource pack!"), this.field_16067));
                                 return null;
                              };

                              try {
                                 MinecraftClient.getInstance()
                                    .method_8606()
                                    .method_25055(var16.field_39501, var16.field_39503)
                                    .thenRun(
                                       () -> this.method_26753(new class_1065(this.field_16067, new class_4758(this.field_16067, this.field_16065, var16)))
                                    )
                                    .exceptionally(var5x);
                              } catch (Exception var10x) {
                                 var5x.apply(var10x);
                              }
                           } else {
                              method_26755(this.field_16067);
                           }
                        } finally {
                           if (this.field_16068 != null && this.field_16068.isHeldByCurrentThread()) {
                              this.field_16068.unlock();
                           }
                        }
                     },
                     class_1542.field_8150,
                     var11,
                     var12,
                     true
                  )
               );
            } else {
               this.method_26753(new class_1065(this.field_16067, new class_4758(this.field_16067, this.field_16065, var16)));
            }
         } else {
            this.method_38113(new TranslationTextComponent("mco.errorMessage.connectionFailure"));
         }
      }
   }

   private void method_14783(int var1) {
      try {
         Thread.sleep((long)(var1 * 1000));
      } catch (InterruptedException var5) {
         field_29831.warn(var5.getLocalizedMessage());
      }
   }
}

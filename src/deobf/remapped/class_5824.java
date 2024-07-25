package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5824 extends class_7875 {
   private static final Logger field_29554 = LogManager.getLogger();
   private final Screen field_29551;
   private final class_7675 field_29546;
   private class_8949 field_29563;
   private class_8949 field_29567;
   private ITextComponent field_29556 = new TranslationTextComponent("mco.reset.world.title");
   private ITextComponent field_29545 = new TranslationTextComponent("mco.reset.world.warning");
   private ITextComponent field_29553 = class_1402.field_7633;
   private int field_29555 = 16711680;
   private static final class_4639 field_29552 = new class_4639("realms", "textures/gui/realms/slot_frame.png");
   private static final class_4639 field_29549 = new class_4639("realms", "textures/gui/realms/upload.png");
   private static final class_4639 field_29543 = new class_4639("realms", "textures/gui/realms/adventure.png");
   private static final class_4639 field_29560 = new class_4639("realms", "textures/gui/realms/survival_spawn.png");
   private static final class_4639 field_29557 = new class_4639("realms", "textures/gui/realms/new_world.png");
   private static final class_4639 field_29559 = new class_4639("realms", "textures/gui/realms/experience.png");
   private static final class_4639 field_29562 = new class_4639("realms", "textures/gui/realms/inspiration.png");
   private class_480 field_29544;
   private class_480 field_29561;
   private class_480 field_29569;
   private class_480 field_29558;
   public int field_29566 = -1;
   private class_9147 field_29542 = class_9147.field_46785;
   private class_1317 field_29550;
   private class_2496 field_29548;
   private ITextComponent field_29547;
   private final Runnable field_29564;
   private final Runnable field_29568;

   public class_5824(Screen var1, class_7675 var2, Runnable var3, Runnable var4) {
      this.field_29551 = var1;
      this.field_29546 = var2;
      this.field_29564 = var3;
      this.field_29568 = var4;
   }

   public class_5824(Screen var1, class_7675 var2, ITextComponent var3, ITextComponent var4, int var5, ITextComponent var6, Runnable var7, Runnable var8) {
      this(var1, var2, var7, var8);
      this.field_29556 = var3;
      this.field_29545 = var4;
      this.field_29555 = var5;
      this.field_29553 = var6;
   }

   public void method_26369(int var1) {
      this.field_29566 = var1;
   }

   public void method_26362(ITextComponent var1) {
      this.field_29547 = var1;
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 40, method_4819(14) - 10, 80, 20, this.field_29553, var1 -> this.field_943.method_8609(this.field_29551))
      );
      new class_3640(this, "Realms-reset-world-fetcher").start();
      this.field_29563 = this.<class_8949>method_1159(new class_8949(this.field_29556, this.field_941 / 2, 7, 16777215));
      this.field_29567 = this.<class_8949>method_1159(new class_8949(this.field_29545, this.field_941 / 2, 22, this.field_29555));
      this.<class_9496>method_1186(
         new class_9496(
            this,
            this.method_26367(1),
            method_4819(0) + 10,
            new TranslationTextComponent("mco.reset.world.generate"),
            field_29557,
            var1 -> this.field_943.method_8609(new class_6758(this, this.field_29556))
         )
      );
      this.<class_9496>method_1186(
         new class_9496(
            this,
            this.method_26367(2),
            method_4819(0) + 10,
            new TranslationTextComponent("mco.reset.world.upload"),
            field_29549,
            var1 -> {
               class_9656 var4 = new class_9656(
                  this.field_29546.field_39016, this.field_29566 == -1 ? this.field_29546.field_39007 : this.field_29566, this, this.field_29568
               );
               this.field_943.method_8609(var4);
            }
         )
      );
      this.<class_9496>method_1186(
         new class_9496(this, this.method_26367(3), method_4819(0) + 10, new TranslationTextComponent("mco.reset.world.template"), field_29560, var1 -> {
            class_1991 var4 = new class_1991(this, class_8840.field_45205, this.field_29544);
            var4.method_9187(new TranslationTextComponent("mco.reset.world.template"));
            this.field_943.method_8609(var4);
         })
      );
      this.<class_9496>method_1186(
         new class_9496(this, this.method_26367(1), method_4819(6) + 20, new TranslationTextComponent("mco.reset.world.adventure"), field_29543, var1 -> {
            class_1991 var4 = new class_1991(this, class_8840.field_45210, this.field_29561);
            var4.method_9187(new TranslationTextComponent("mco.reset.world.adventure"));
            this.field_943.method_8609(var4);
         })
      );
      this.<class_9496>method_1186(
         new class_9496(this, this.method_26367(2), method_4819(6) + 20, new TranslationTextComponent("mco.reset.world.experience"), field_29559, var1 -> {
            class_1991 var4 = new class_1991(this, class_8840.field_45211, this.field_29569);
            var4.method_9187(new TranslationTextComponent("mco.reset.world.experience"));
            this.field_943.method_8609(var4);
         })
      );
      this.<class_9496>method_1186(
         new class_9496(this, this.method_26367(3), method_4819(6) + 20, new TranslationTextComponent("mco.reset.world.inspiration"), field_29562, var1 -> {
            class_1991 var4 = new class_1991(this, class_8840.field_45208, this.field_29558);
            var4.method_9187(new TranslationTextComponent("mco.reset.world.inspiration"));
            this.field_943.method_8609(var4);
         })
      );
      this.method_4820();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.field_943.method_8609(this.field_29551);
         return true;
      }
   }

   private int method_26367(int var1) {
      return this.field_941 / 2 - 130 + (var1 - 1) * 100;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_29563.method_41093(this, var1);
      this.field_29567.method_41093(this, var1);
      super.method_6767(var1, var2, var3, var4);
   }

   private void method_26361(class_7966 var1, int var2, int var3, ITextComponent var4, class_4639 var5, boolean var6, boolean var7) {
      this.field_943.method_8577().method_35674(var5);
      if (!var6) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
      }

      class_2089.method_9778(var1, var2 + 2, var3 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
      this.field_943.method_8577().method_35674(field_29552);
      if (!var6) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         class_3542.method_16480(0.56F, 0.56F, 0.56F, 1.0F);
      }

      class_2089.method_9778(var1, var2, var3 + 12, 0.0F, 0.0F, 60, 60, 60, 60);
      int var10 = !var6 ? 16777215 : 10526880;
      method_9788(var1, this.field_948, var4, var2 + 30, var3, var10);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_35633(class_2496 var1) {
      if (var1 != null) {
         if (this.field_29566 == -1) {
            this.method_26360(var1);
         } else {
            switch (var1.field_12419) {
               case field_43081:
                  this.field_29542 = class_9147.field_46778;
                  break;
               case field_43077:
                  this.field_29542 = class_9147.field_46786;
                  break;
               case field_43075:
                  this.field_29542 = class_9147.field_46784;
                  break;
               case field_43080:
                  this.field_29542 = class_9147.field_46783;
            }

            this.field_29548 = var1;
            this.method_26368();
         }
      }
   }

   private void method_26368() {
      this.method_26363(() -> {
         switch (this.field_29542) {
            case field_46786:
            case field_46778:
            case field_46784:
            case field_46783:
               if (this.field_29548 != null) {
                  this.method_26360(this.field_29548);
               }
               break;
            case field_46782:
               if (this.field_29550 != null) {
                  this.method_26364(this.field_29550);
               }
         }
      });
   }

   public void method_26363(Runnable var1) {
      this.field_943.method_8609(new class_1065(this.field_29551, new class_9007(this.field_29546.field_39016, this.field_29566, var1)));
   }

   public void method_26360(class_2496 var1) {
      this.method_26359((String)null, var1, -1, true);
   }

   private void method_26364(class_1317 var1) {
      this.method_26359(class_1317.method_6024(var1), (class_2496)null, class_1317.method_6021(var1), class_1317.method_6023(var1));
   }

   private void method_26359(String var1, class_2496 var2, int var3, boolean var4) {
      this.field_943
         .method_8609(
            new class_1065(this.field_29551, new class_7979(var1, var2, var3, var4, this.field_29546.field_39016, this.field_29547, this.field_29564))
         );
   }

   public void method_26355(class_1317 var1) {
      if (this.field_29566 != -1) {
         this.field_29542 = class_9147.field_46782;
         this.field_29550 = var1;
         this.method_26368();
      } else {
         this.method_26364(var1);
      }
   }
}

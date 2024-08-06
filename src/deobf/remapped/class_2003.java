package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_2003 extends class_1859 {
   public static final class_590 field_10174 = new class_590(1250067, -15329770)
      .method_2765(class_1255.field_6929.field_6917)
      .method_2775(class_6206.field_31726);
   public List<String> field_10171 = new ArrayList<String>();
   public int field_10172 = 0;
   public boolean field_10170;
   public boolean field_10173;

   public class_2003(class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field_10174, false);
      this.field_10171 = var7;
      this.field_10172 = var8;
      this.method_9302();
   }

   private void method_9302() {
      this.method_32134().clear();
      this.field_36258 = class_3054.field_15006;
      class_6220 var3;
      this.method_32148(var3 = new class_6220(this, "dropdownButton", 0, 0, this.method_32137(), this.method_32137(), this.field_36272));
      var3.method_32135((var1, var2) -> {
         var1.method_32175(0);
         var1.method_32117(0);
         var1.method_32142(this.method_32109());
         var1.method_32158(this.method_32137());
      });
      var3.method_32100((var1, var2) -> this.method_9305(!this.method_9301()));

      for (String var5 : this.field_10171) {
         class_6220 var6;
         this.method_32148(
            var6 = new class_6220(
               this,
               var5,
               0,
               this.method_32137(),
               this.method_32109(),
               17,
               new class_590(
                  -14540254,
                  this.field_36272.method_2764(),
                  this.field_36272.method_2764(),
                  class_1255.field_6918.field_6917,
                  class_6206.field_31724,
                  class_6206.field_31726
               ),
               var5,
               class_3054.field_14992
            )
         );
         var6.method_28444(8);
         var6.method_32100((var2, var3x) -> {
            int var6x = this.method_9311();
            this.method_9309(this.field_10171.indexOf(var5));
            this.method_9305(false);
            if (var6x != this.method_9311()) {
               this.method_8235();
            }
         });
      }

      this.method_32153(new class_8348(1));
   }

   private int method_9306() {
      return this.method_9303();
   }

   private int method_9303() {
      return this.method_9301() ? this.method_32137() * (this.field_10171.size() + 1) : this.method_32137();
   }

   private int method_9310() {
      return 0;
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (!this.method_32098() && this.method_9301()) {
         this.method_9305(false);
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137()),
         -14540254
      );
      FontManager.method_109(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137()),
         class_1255.field_6929.field_6917
      );
      if (this.method_32120(this.method_32189(), this.method_32129()) && this.method_32129() - this.method_32093() < this.method_32137()) {
         FontManager.method_109(
            (float)(this.method_32132() + 1),
            (float)(this.method_32173() + 1),
            (float)(this.method_32132() + this.method_32109() - 1),
            (float)(this.method_32173() + this.method_32137() - 1),
            class_314.method_1444(class_1255.field_6918.field_6917, 0.25F)
         );
      }

      int var4 = this.method_32132() + this.method_32109() - 11;
      int var5 = this.method_32173() + this.method_32137() - 12;
      if (!this.method_9301()) {
         FontManager.method_142((float)var4, (float)var5, (float)(var4 + 6), (float)var5, (float)(var4 + 3), (float)(var5 + 3), class_1255.field_6920.field_6917);
      } else {
         FontManager.method_142(
            (float)var4, (float)(var5 + 3), (float)(var4 + 6), (float)(var5 + 3), (float)(var4 + 3), (float)var5, class_1255.field_6920.field_6917
         );
      }

      for (class_7038 var7 : this.method_32134()) {
         if (!var7.method_32176().equals("dropdownButton")) {
            var7.method_32104(this.field_10170);
         }
      }

      if (this.method_32165() != null) {
         FontManager.method_151(this);
         FontManager.method_87(
            this.method_32097(),
            (float)(this.method_32132() + 7),
            (float)(this.method_32173() + (this.method_32137() - this.method_32097().method_15654()) / 2),
            this.method_32165(),
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * 0.5F)
         );
         FontManager.method_141();
      }

      if (!this.method_9301()) {
         FontManager.method_151(this);
      }

      super.method_32178(var1);
      if (!this.method_9301()) {
         FontManager.method_141();
      }
   }

   public List<String> method_9300() {
      return this.field_10171;
   }

   public void method_9308(String var1, int var2) {
      this.method_9300().add(var2, var1);
      this.method_9302();
   }

   public void method_9307(String var1) {
      this.method_9308(var1, this.field_10171.size());
   }

   public <E extends Enum<E>> void method_9304(Class<E> var1) {
      this.field_10171.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method_9308(var8, var7.ordinal());
      }
   }

   public int method_9311() {
      return this.field_10172;
   }

   public void method_9309(int var1) {
      this.field_10172 = var1;
   }

   public boolean method_9301() {
      return this.field_10170;
   }

   public void method_9305(boolean var1) {
      this.field_10170 = var1;
   }

   @Override
   public String method_32165() {
      return this.method_9300().size() <= 0 ? null : this.method_9300().get(this.method_9311());
   }

   @Override
   public boolean method_32120(int var1, int var2) {
      var1 -= this.method_32155();
      var2 -= this.method_32093();
      return var1 >= 0 && var1 <= this.method_32109() && var2 >= 0 && var2 <= this.method_9303();
   }
}

package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class class_3366 extends class_1859 {
   public static final class_590 field_16590 = new class_590(1250067, -15329770)
      .method_2765(class_1255.field_6929.field_6917)
      .method_2775(class_6206.field_31726);
   public List<String> field_16593 = new ArrayList<String>();
   public int field_16594 = 0;
   public boolean field_16592;
   public boolean field_16595;
   private class_2440 field_16589 = new class_2440(220, 220);
   private Map<Integer, class_6214> field_16588 = new HashMap<Integer, class_6214>();

   public class_3366(class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field_16590, false);
      this.field_16593 = var7;
      this.field_16594 = var8;
      this.method_15422();
   }

   public class_3366(class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, class_590 var9) {
      super(var1, var2, var3, var4, var5, var6, var9, false);
      this.field_16593 = var7;
      this.field_16594 = var8;
      this.method_15422();
   }

   public class_3366(class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, class_590 var9, String var10) {
      super(var1, var2, var3, var4, var5, var6, var9, var10, false);
      this.field_16593 = var7;
      this.field_16594 = var8;
      this.method_15422();
   }

   public class_3366(
      class_7038 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8, class_590 var9, String var10, class_3384 var11
   ) {
      super(var1, var2, var3, var4, var5, var6, var9, var10, var11, false);
      this.field_16593 = var7;
      this.field_16594 = var8;
      this.method_15422();
   }

   public void method_15421(List<String> var1, int var2) {
      class_6214 var5 = new class_6214(this, "sub" + var2, this.field_36278 + 10, this.method_32137() * (var2 + 1), 200, this.method_32137(), var1, 0);
      this.field_16588.put(var2, var5);
      var5.method_32104(false);
      var5.method_8236(var2x -> {
         this.method_15426(var2);
         this.method_15432(false);
         this.method_8235();
      });
      this.method_32148(var5);
   }

   public int method_15423(int var1) {
      class_6214 var4 = this.method_15418(var1);
      return var4 == null ? 0 : var4.field_31747;
   }

   public class_6214 method_15418(int var1) {
      for (Entry var5 : this.field_16588.entrySet()) {
         if ((Integer)var5.getKey() == var1) {
            return (class_6214)var5.getValue();
         }
      }

      return null;
   }

   private void method_15422() {
      this.method_32134().clear();
      this.field_36258 = class_5320.field_27139;
      class_6220 var3;
      this.method_32148(var3 = new class_6220(this, "dropdownButton", 0, 0, this.method_32137(), this.method_32137(), this.field_36272));
      var3.method_32135((var1, var2) -> {
         var1.method_32175(0);
         var1.method_32117(0);
         var1.method_32142(this.method_32109());
         var1.method_32158(this.method_32137());
      });
      var3.method_32100((var1, var2) -> this.method_15432(!this.method_15433()));

      for (String var5 : this.field_16593) {
         class_6220 var6;
         this.method_32148(
            var6 = new class_6220(
               this,
               var5,
               0,
               this.method_32137(),
               this.method_32109(),
               this.method_32137(),
               new class_590(
                  class_1255.field_6918.field_6917,
                  -1381654,
                  this.field_36272.method_2764(),
                  this.field_36272.method_2764(),
                  class_6206.field_31724,
                  class_6206.field_31726
               ),
               var5,
               this.method_32097()
            )
         );
         var6.method_28444(10);
         var6.method_32100((var2, var3x) -> {
            int var6x = this.method_15427();
            this.method_15426(this.field_16593.indexOf(var5));
            this.method_15432(false);
            if (var6x != this.method_15427()) {
               this.method_8235();
            }
         });
      }

      this.field_16589.method_11119(class_4043.field_19618);
      this.method_32153(new class_8348(1));
   }

   private int method_15431() {
      int var3 = this.method_15430();

      for (Entry var5 : this.field_16588.entrySet()) {
         if (((class_6214)var5.getValue()).method_32126()) {
            var3 = Math.max(
               var3,
               (((class_6214)var5.getValue()).field_31748.size() - 1) * ((class_6214)var5.getValue()).method_32137()
                  + ((class_6214)var5.getValue()).method_32173()
            );
         }
      }

      return var3;
   }

   private int method_15430() {
      float var3 = class_3483.method_15985(this.field_16589.method_11123(), 0.0F, 1.0F, 1.0F);
      if (this.field_16589.method_11128() != class_4043.field_19620) {
         var3 = class_9681.method_44757(this.field_16589.method_11123(), 0.0F, 1.0F, 1.0F);
      }

      return (int)((float)(this.method_32137() * this.field_16593.size() + 1) * var3);
   }

   public int method_15429() {
      return (int)((float)(this.method_32137() * this.field_16593.size() + 1));
   }

   private int method_15424() {
      int var3 = 0;

      for (Entry var5 : this.field_16588.entrySet()) {
         if (((class_6214)var5.getValue()).method_32126()) {
            var3 = Math.max(var3, ((class_6214)var5.getValue()).method_32109() + ((class_6214)var5.getValue()).method_32132() - this.method_32109());
         }
      }

      return var3;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (!this.method_32120(var1, var2) && this.field_16589.method_11128() == class_4043.field_19620) {
         this.method_15432(false);
      }

      int var5 = (var2 - this.method_32093()) / this.method_32137() - 1;
      if (var5 >= 0
         && var5 < this.field_16593.size()
         && this.field_16589.method_11128() == class_4043.field_19620
         && this.field_16589.method_11123() == 1.0F
         && var1 - this.method_32155() < this.method_32109()) {
         for (Entry var9 : this.field_16588.entrySet()) {
            ((class_6214)var9.getValue()).method_32104((Integer)var9.getKey() == var5);
         }
      } else if (!this.method_32120(var1, var2) || this.field_16589.method_11128() == class_4043.field_19618) {
         for (Entry var7 : this.field_16588.entrySet()) {
            ((class_6214)var7.getValue()).method_32104(false);
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137()),
         class_314.method_1444(class_1255.field_6918.field_6917, var1 * this.field_16589.method_11123())
      );
      class_73.method_128(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)(this.method_32137() + this.method_15430() - 1),
         6.0F,
         var1 * 0.1F * this.field_16589.method_11123()
      );
      class_73.method_128(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)(this.method_32137() + this.method_15430() - 1),
         20.0F,
         var1 * 0.2F * this.field_16589.method_11123()
      );
      if (this.method_32165() != null) {
         class_73.method_151(this);
         String var4 = "";

         for (Entry var6 : this.field_16588.entrySet()) {
            if (this.field_16594 == (Integer)var6.getKey()) {
               var4 = " (" + ((class_6214)var6.getValue()).field_31748.get(((class_6214)var6.getValue()).field_31747) + ")";
            }
         }

         class_73.method_87(
            this.method_32097(),
            (float)(this.method_32132() + 10),
            (float)(this.method_32173() + (this.method_32137() - this.method_32097().method_15654()) / 2 + 1),
            this.method_32165() + var4,
            class_314.method_1444(this.field_36272.method_2764(), var1 * 0.7F)
         );
         class_73.method_141();
      }

      boolean var8 = this.field_16589.method_11123() < 1.0F;
      if (var8) {
         class_73.method_149(
            this.method_32155(),
            this.method_32093(),
            this.method_32155() + this.method_32109() + 140,
            this.method_32093() + this.method_32137() + this.method_15431()
         );
      }

      GL11.glPushMatrix();
      if (this.field_16589.method_11123() > 0.0F) {
         super.method_32178(var1);
      }

      GL11.glPopMatrix();
      if (var8) {
         class_73.method_141();
      }

      int var9 = this.method_32109() - (int)((float)this.method_32137() / 2.0F + 0.5F);
      int var10 = (int)((float)this.method_32137() / 2.0F + 0.5F) + 1;
      int var7 = (int)((float)this.method_32137() / 6.0F + 0.5F);
      GL11.glTranslatef((float)(this.method_32132() + var9), (float)(this.method_32173() + var10), 0.0F);
      GL11.glRotatef(90.0F * this.field_16589.method_11123(), 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.method_32132() - var9), (float)(-this.method_32173() - var10), 0.0F);
      class_73.method_87(
         this.field_36258,
         (float)(this.method_32132() + var9 - 6),
         (float)(this.method_32173() + var10 - 14),
         ">",
         class_314.method_1444(this.field_36272.method_2764(), var1 * 0.7F * (!this.method_32120(this.method_32189(), this.method_32129()) ? 0.5F : 1.0F))
      );
   }

   public List<String> method_15428() {
      return this.field_16593;
   }

   public void method_15420(String var1, int var2) {
      this.method_15428().add(var2, var1);
      this.method_15422();
   }

   public void method_15419(String var1) {
      this.method_15420(var1, this.field_16593.size());
   }

   public <E extends Enum<E>> void method_15425(Class<E> var1) {
      this.field_16593.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method_15420(var8, var7.ordinal());
      }
   }

   public int method_15427() {
      return this.field_16594;
   }

   public void method_15426(int var1) {
      this.field_16594 = var1;
   }

   public boolean method_15433() {
      return this.field_16592;
   }

   public void method_15432(boolean var1) {
      this.field_16592 = var1;
      this.field_16589.method_11119(!this.method_15433() ? class_4043.field_19618 : class_4043.field_19620);
   }

   @Override
   public String method_32165() {
      return this.method_15428().size() <= 0 ? null : this.method_15428().get(this.method_15427());
   }

   @Override
   public boolean method_32120(int var1, int var2) {
      for (Entry var6 : this.field_16588.entrySet()) {
         if (((class_6214)var6.getValue()).method_32126() && ((class_6214)var6.getValue()).method_32120(var1, var2)) {
            return true;
         }
      }

      var1 -= this.method_32155();
      var2 -= this.method_32093();
      return var1 >= 0 && var1 <= this.method_32109() && var2 >= 0 && var2 <= this.method_32137() + this.method_15430();
   }
}

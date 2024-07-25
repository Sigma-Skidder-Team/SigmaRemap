package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

public class class_8914 extends class_1859 {
   public class_2440 field_45704;
   public int field_45703;
   public int field_45693;
   public int field_45701;
   public int field_45696;
   public String field_45700;
   public class_2612 field_45699;
   public class_1226 field_45694;
   public class_8343 field_45695;
   public boolean field_45702 = false;
   private final List<class_2965> field_45698 = new ArrayList<class_2965>();

   public class_8914(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_45701 = 500;
      this.field_45696 = 600;
      this.field_45693 = (var5 - this.field_45701) / 2;
      this.field_45703 = (var6 - this.field_45696) / 2;
      byte var9 = 30;
      class_3004 var10;
      this.method_32148(
         var10 = new class_3004(
            this, "search", this.field_45693 + var9, this.field_45703 + var9 + 50, this.field_45701 - var9 * 2, 60, class_3004.field_14738, "", "Search..."
         )
      );
      var10.method_13721(var2x -> {
         this.field_45700 = var10.method_32165();
         this.field_45699.method_11851(0);
      });
      var10.method_32162();
      this.method_32148(
         this.field_45699 = new class_2612(
            this, "mods", this.field_45693 + var9, this.field_45703 + var9 + 120, this.field_45701 - var9 * 2, this.field_45696 - var9 * 2 - 120
         )
      );
      int var11 = 10;

      for (Entry var13 : GUIManager.field_34911.entrySet()) {
         class_1226 var14 = new class_1226((Class<? extends Screen>)var13.getKey());
         class_590 var15 = new class_590(class_314.method_1444(class_1255.field_6929.field_6917, 0.02F), -986896)
            .method_2765(class_314.method_1444(class_1255.field_6929.field_6917, 0.5F))
            .method_2776(class_6206.field_31726);
         class_6220 var16;
         this.field_45699
            .method_32148(
               var16 = new class_6220(this.field_45699, var14.method_5460(), 0, var11++ * 55, this.field_45699.method_32109(), 55, var15, var14.method_5460())
            );
         var16.method_32100((var2x, var3x) -> {
            for (Entry var7 : GUIManager.field_34911.entrySet()) {
               class_1226 var8 = new class_1226((Class<? extends Screen>)var7.getKey());
               if (var8.method_5460().equals(var16.method_32176()) && !this.field_45702) {
                  this.field_45694 = var8;
                  this.field_45702 = true;
                  break;
               }
            }
         });
      }

      var11 += 50;

      for (Module var19 : SigmaMainClass.getInstance().getModuleManager().getModuleMap().values()) {
         class_590 var20 = new class_590(16777215, -986896).method_2765(class_1255.field_6929.field_6917).method_2776(class_6206.field_31724);
         class_6220 var21;
         this.field_45699
            .method_32148(
               var21 = new class_6220(
                  this.field_45699, var19.getName(), 0, var11++ * 40, this.field_45699.method_32109(), 40, var20, new class_1226(var19).method_5460()
               )
            );
         var21.method_28444(10);
         var21.method_32100((var2x, var3x) -> {
            for (Module var7 : SigmaMainClass.getInstance().getModuleManager().getModuleMap().values()) {
               if (var7.getName().equals(var21.method_32165()) && !this.field_45702) {
                  this.field_45694 = new class_1226(var7);
                  this.field_45702 = true;
                  break;
               }
            }
         });
      }

      this.field_45704 = new class_2440(200, 120);
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (this.method_32185()
         && (var1 < this.field_45693 || var2 < this.field_45703 || var1 > this.field_45693 + this.field_45701 || var2 > this.field_45703 + this.field_45696)) {
         this.field_45702 = true;
      }

      this.field_45704.method_11119(this.field_45702 ? class_4043.field_19618 : class_4043.field_19620);
      TreeMap var5 = new TreeMap();
      TreeMap var6 = new TreeMap();
      TreeMap var7 = new TreeMap();
      ArrayList var8 = new ArrayList();

      for (class_7038 var10 : this.field_45699.method_32134()) {
         if (!(var10 instanceof class_9568)) {
            for (class_7038 var12 : var10.method_32134()) {
               if (var12 instanceof class_6220) {
                  class_6220 var13 = (class_6220)var12;
                  boolean var14 = var13.method_32137() != 40;
                  if (!var14 || this.field_45700 != null && (this.field_45700 == null || this.field_45700.length() != 0)) {
                     if (!var14 && this.method_41005(this.field_45700, var13.method_32165())) {
                        var6.put(var13.method_32165(), var13);
                     } else if (!var14 && this.method_41003(this.field_45700, var13.method_32165())) {
                        var7.put(var13.method_32165(), var13);
                     } else {
                        var8.add(var13);
                     }
                  } else {
                     var5.put(var13.method_32165(), var13);
                  }
               }
            }
         }
      }

      int var15 = var5.size() <= 0 ? 0 : 10;

      for (class_6220 var20 : var5.values()) {
         var20.method_32104(true);
         var20.method_32117(var15);
         var15 += var20.method_32137();
      }

      if (var5.size() > 0) {
         var15 += 10;
      }

      for (class_6220 var21 : var6.values()) {
         var21.method_32104(true);
         var21.method_32117(var15);
         var15 += var21.method_32137();
      }

      for (class_6220 var22 : var7.values()) {
         var22.method_32104(true);
         var22.method_32117(var15);
         var15 += var22.method_32137();
      }

      for (class_6220 var23 : var8) {
         var23.method_32104(false);
      }

      super.method_32145(var1, var2);
   }

   private boolean method_41003(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().contains(var1.toLowerCase()) : true;
   }

   private boolean method_41005(String var1, String var2) {
      return var1 != null && var1 != "" && var2 != null ? var2.toLowerCase().startsWith(var1.toLowerCase()) : true;
   }

   @Override
   public void method_32178(float var1) {
      var1 = this.field_45704.method_11123();
      float var4 = class_9556.method_44073(var1, 0.0F, 1.0F, 1.0F);
      if (this.field_45702) {
         var4 = class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F);
      }

      this.method_32111(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      if (var1 == 0.0F && this.field_45702) {
         this.method_41004(this.field_45694);
      }

      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.3F * var1)
      );
      super.method_32190();
      class_73.method_108(
         (float)this.field_45693,
         (float)this.field_45703,
         (float)this.field_45701,
         (float)this.field_45696,
         10.0F,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      byte var5 = 30;
      class_73.method_87(
         class_5320.field_27140,
         (float)(var5 + this.field_45693),
         (float)(var5 + this.field_45703),
         "Select mod to bind",
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.7F)
      );
      super.method_32178(var1);
   }

   public final void method_41002(class_2965 var1) {
      this.field_45698.add(var1);
   }

   public final void method_41004(class_1226 var1) {
      for (class_2965 var5 : this.field_45698) {
         var5.method_13554(this, var1);
      }
   }
}

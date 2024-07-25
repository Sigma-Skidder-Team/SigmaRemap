package remapped;

import com.mentalfrostbyte.jello.mods.util.InDevelopment;
import java.util.ArrayList;
import java.util.List;

@InDevelopment
public class class_3620 extends Module {
   public Module[] field_17661;
   public Module field_17664;
   private List<String> field_17660 = new ArrayList<String>();
   public class_2826 field_17659;
   private final List<class_713> field_17662 = new ArrayList<class_713>();

   public class_3620(class_5664 var1, String var2, String var3, Module... var4) {
      super(var1, var2, var3);
      this.field_17661 = var4;

      for (Module var10 : this.field_17661) {
         SigmaMainClass.method_3328().method_3302().method_7908(var10);
         this.field_17660.add(var10.method_41992());
         var10.method_41995(this);
      }

      this.method_42010(this.field_17659 = new class_2826("Type", var2 + " mode", 0, this.field_17660.<String>toArray(new String[0])));
      this.field_17659.method_23029(var1x -> this.method_16866());
      this.method_16866();
   }

   public void method_16866() {
      this.method_16862();

      for (Module var6 : this.field_17661) {
         boolean var7 = this.method_42016("Type").equals(var6.field_46702);
         if (this.method_42015() && mcInstance.field_9632 != null) {
            var6.method_42023(var7);
            if (var7) {
               this.field_17664 = var6;
            }
         } else if (this.method_42015()) {
            var6.method_42018(var7);
         }

         this.method_16863(var6, var7);
      }
   }

   private void method_16862() {
      boolean var3 = false;

      for (Module var7 : this.field_17661) {
         if (this.method_42016("Type").equals(var7.field_46702)) {
            var3 = true;
         }
      }

      if (!var3) {
         this.method_42009("Type", this.field_17661[0].field_46702);
      }
   }

   public Module method_16864() {
      this.method_16862();

      for (Module var6 : this.field_17661) {
         if (this.method_42016("Type").equals(var6.field_46702)) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public boolean method_42003() {
      if (this.field_17664 == null) {
         this.method_16866();
      }

      return this.field_17664 != null ? this.field_17664.method_42003() : this.method_42015();
   }

   @Override
   public class_1293 method_42021(class_1293 var1) {
      class_1293 var4 = class_3332.method_15287(var1, "sub-options");
      if (var4 != null) {
         for (Module var8 : this.field_17661) {
            class_1336 var9 = class_3332.method_15293(var4, var8.method_41992());
            if (var9 != null) {
               for (int var10 = 0; var10 < var9.method_6142(); var10++) {
                  class_1293 var11 = var9.method_6143(var10);
                  String var12 = null;

                  try {
                     var12 = class_3332.method_15291(var11, "name", null);
                  } catch (class_7584 var17) {
                  }

                  for (class_5004 var14 : var8.field_46697.values()) {
                     if (var14.method_23032().equals(var12)) {
                        try {
                           var14.method_23042(var11);
                        } catch (class_7584 var16) {
                           SigmaMainClass.method_3328()
                              .method_3326()
                              .method_12862("Could not initialize settings of " + var8.method_41992() + "." + var14.method_23032() + " from config.");
                        }
                        break;
                     }
                  }
               }
            }
         }
      }

      class_1293 var18 = super.method_42021(var1);
      if (this.field_46700) {
         this.method_16866();
      }

      return var18;
   }

   @Override
   public class_1293 method_42014(class_1293 var1) {
      class_1293 var4 = new class_1293();

      for (Module var8 : this.field_17661) {
         class_1336 var9 = new class_1336();

         for (class_5004 var11 : var8.field_46697.values()) {
            var9.method_6159(var11.method_23035(new class_1293()));
         }

         var4.method_5820(var8.method_41992(), var9);
      }

      var1.method_5820("sub-options", var4);
      return super.method_42014(var1);
   }

   @Override
   public void method_42006() {
      this.method_16866();
      if (this.field_17664 instanceof class_367 && !SigmaMainClass.method_3328().method_3332().method_23084()) {
         this.method_42018(false);
      }
   }

   @Override
   public void method_42020() {
      for (Module var6 : this.field_17661) {
         var6.method_41991(false);
      }
   }

   @Override
   public void method_42019() {
      for (Module var6 : this.field_17661) {
         var6.method_42023(false);
      }

      super.method_42019();
   }

   public final class_3620 method_16865(class_713 var1) {
      this.field_17662.add(var1);
      return this;
   }

   public final void method_16863(Module var1, boolean var2) {
      for (class_713 var6 : this.field_17662) {
         var6.method_3268(this, var1, var2);
      }
   }

   @Override
   public void method_42012() {
      super.method_42012();

      for (Module var6 : this.field_17661) {
         var6.method_42012();
      }
   }
}

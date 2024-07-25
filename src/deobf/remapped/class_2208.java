package remapped;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public abstract class class_2208<T extends class_4088> extends class_266 implements class_4378<T> {
   public static final class_4639 field_10969 = new class_4639("textures/gui/container/inventory.png");
   public int field_10981 = 176;
   public int field_10973 = 166;
   public int field_10959;
   public int field_10971;
   public int field_10960;
   public int field_10958;
   public final T field_10956;
   public final class_7051 field_10967;
   public class_7934 field_10954;
   private class_7934 field_10975;
   private class_7934 field_10955;
   private class_7934 field_10985;
   private class_7934 field_10970;
   public int field_10984;
   public int field_10962;
   private boolean field_10953;
   private class_6098 field_10965 = class_6098.field_31203;
   private int field_10978;
   private int field_10972;
   private long field_10974;
   private class_6098 field_10979 = class_6098.field_31203;
   private long field_10963;
   public final Set<class_7934> field_10961 = Sets.newHashSet();
   public boolean field_10980;
   private int field_10977;
   private int field_10957;
   private boolean field_10982;
   private int field_10966;
   private long field_10983;
   private int field_10976;
   private boolean field_10964;
   private class_6098 field_10968 = class_6098.field_31203;

   public class_2208(T var1, class_7051 var2, ITextComponent var3) {
      super(var3);
      this.field_10956 = (T)var1;
      this.field_10967 = var2;
      this.field_10982 = true;
      this.field_10959 = 8;
      this.field_10971 = 6;
      this.field_10960 = 8;
      this.field_10958 = this.field_10973 - 94;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_10984 = (this.field_941 - this.field_10981) / 2;
      this.field_10962 = (this.field_940 - this.field_10973) / 2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_10223(var1, var4, var2, var3);
      class_3542.method_16443();
      class_3542.method_16491();
      super.method_6767(var1, var2, var3, var4);
      class_3542.method_16438();
      class_3542.method_16413((float)var7, (float)var8, 0.0F);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_3542.method_16381();
      this.field_10954 = null;
      short var9 = 240;
      short var10 = 240;
      class_3542.method_16420(33986, 240.0F, 240.0F);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < this.field_10956.field_19926.size(); var11++) {
         class_7934 var12 = this.field_10956.field_19926.get(var11);
         if (var12.method_35886()) {
            this.method_10213(var1, var12);
         }

         if (this.method_10218(var12, (double)var2, (double)var3) && var12.method_35886()) {
            this.field_10954 = var12;
            class_3542.method_16491();
            int var13 = var12.field_40589;
            int var14 = var12.field_40590;
            class_3542.method_16405(true, true, true, false);
            this.method_9772(var1, var13, var14, var13 + 16, var14 + 16, -2130706433, -2130706433);
            class_3542.method_16405(true, true, true, true);
            class_3542.method_16428();
         }
      }

      this.method_10221(var1, var2, var3);
      class_7051 var18 = this.field_943.field_9632.field_3853;
      class_6098 var19 = !this.field_10965.method_28022() ? this.field_10965 : var18.method_32424();
      if (!var19.method_28022()) {
         byte var20 = 8;
         int var22 = !this.field_10965.method_28022() ? 16 : 8;
         String var15 = null;
         if (!this.field_10965.method_28022() && this.field_10953) {
            var19 = var19.method_27973();
            var19.method_28017(class_9299.method_42816((float)var19.method_27997() / 2.0F));
         } else if (this.field_10980 && this.field_10961.size() > 1) {
            var19 = var19.method_27973();
            var19.method_28017(this.field_10966);
            if (var19.method_28022()) {
               var15 = "" + TextFormatting.YELLOW + "0";
            }
         }

         this.method_10216(var19, var2 - var7 - 8, var3 - var8 - var22, var15);
      }

      if (!this.field_10979.method_28022()) {
         float var21 = (float)(class_9665.method_44650() - this.field_10974) / 100.0F;
         if (var21 >= 1.0F) {
            var21 = 1.0F;
            this.field_10979 = class_6098.field_31203;
         }

         int var23 = this.field_10955.field_40589 - this.field_10978;
         int var24 = this.field_10955.field_40590 - this.field_10972;
         int var16 = this.field_10978 + (int)((float)var23 * var21);
         int var17 = this.field_10972 + (int)((float)var24 * var21);
         this.method_10216(this.field_10979, var16, var17, (String)null);
      }

      class_3542.method_16489();
      class_3542.method_16428();
   }

   public void method_10214(class_7966 var1, int var2, int var3) {
      if (this.field_943.field_9632.field_3853.method_32424().method_28022() && this.field_10954 != null && this.field_10954.method_35884()) {
         this.method_1177(var1, this.field_10954.method_35898(), var2, var3);
      }
   }

   private void method_10216(class_6098 var1, int var2, int var3, String var4) {
      class_3542.method_16413(0.0F, 0.0F, 32.0F);
      this.method_9776(200);
      this.field_945.field_44875 = 200.0F;
      this.field_945.method_40274(var1, var2, var3);
      this.field_945.method_40265(this.field_948, var1, var2, var3 - (!this.field_10965.method_28022() ? 8 : 0), var4);
      this.method_9776(0);
      this.field_945.field_44875 = 0.0F;
   }

   public void method_10221(class_7966 var1, int var2, int var3) {
      this.field_948.method_45378(var1, this.field_947, (float)this.field_10959, (float)this.field_10971, 4210752);
      this.field_948.method_45378(var1, this.field_10967.method_19839(), (float)this.field_10960, (float)this.field_10958, 4210752);
   }

   public abstract void method_10223(class_7966 var1, float var2, int var3, int var4);

   private void method_10213(class_7966 var1, class_7934 var2) {
      int var5 = var2.field_40589;
      int var6 = var2.field_40590;
      class_6098 var7 = var2.method_35898();
      boolean var8 = false;
      boolean var9 = var2 == this.field_10975 && !this.field_10965.method_28022() && !this.field_10953;
      class_6098 var10 = this.field_943.field_9632.field_3853.method_32424();
      String var11 = null;
      if (var2 == this.field_10975 && !this.field_10965.method_28022() && this.field_10953 && !var7.method_28022()) {
         var7 = var7.method_27973();
         var7.method_28017(var7.method_27997() / 2);
      } else if (this.field_10980 && this.field_10961.contains(var2) && !var10.method_28022()) {
         if (this.field_10961.size() == 1) {
            return;
         }

         if (class_4088.method_18856(var2, var10, true) && this.field_10956.method_18857(var2)) {
            var7 = var10.method_27973();
            var8 = true;
            class_4088.method_18875(this.field_10961, this.field_10977, var7, !var2.method_35898().method_28022() ? var2.method_35898().method_27997() : 0);
            int var12 = Math.min(var7.method_28016(), var2.method_35890(var7));
            if (var7.method_27997() > var12) {
               var11 = TextFormatting.YELLOW.toString() + var12;
               var7.method_28017(var12);
            }
         } else {
            this.field_10961.remove(var2);
            this.method_10219();
         }
      }

      this.method_9776(100);
      this.field_945.field_44875 = 100.0F;
      if (var7.method_28022() && var2.method_35886()) {
         Pair var14 = var2.method_35900();
         if (var14 != null) {
            class_5155 var13 = this.field_943.method_8490((class_4639)var14.getFirst()).apply((class_4639)var14.getSecond());
            this.field_943.method_8577().method_35674(var13.method_23608().method_38519());
            method_9782(var1, var5, var6, this.method_9777(), 16, 16, var13);
            var9 = true;
         }
      }

      if (!var9) {
         if (var8) {
            method_9774(var1, var5, var6, var5 + 16, var6 + 16, -2130706433);
         }

         class_3542.method_16428();
         this.field_945.method_40273(this.field_943.field_9632, var7, var5, var6);
         this.field_945.method_40265(this.field_948, var7, var5, var6, var11);
      }

      this.field_945.field_44875 = 0.0F;
      this.method_9776(0);
   }

   private void method_10219() {
      class_6098 var3 = this.field_943.field_9632.field_3853.method_32424();
      if (!var3.method_28022() && this.field_10980) {
         if (this.field_10977 != 2) {
            this.field_10966 = var3.method_27997();

            for (class_7934 var5 : this.field_10961) {
               class_6098 var6 = var3.method_27973();
               class_6098 var7 = var5.method_35898();
               int var8 = !var7.method_28022() ? var7.method_27997() : 0;
               class_4088.method_18875(this.field_10961, this.field_10977, var6, var8);
               int var9 = Math.min(var6.method_28016(), var5.method_35890(var6));
               if (var6.method_27997() > var9) {
                  var6.method_28017(var9);
               }

               this.field_10966 = this.field_10966 - (var6.method_27997() - var8);
            }
         } else {
            this.field_10966 = var3.method_28016();
         }
      }
   }

   @Nullable
   private class_7934 method_10224(double var1, double var3) {
      for (int var7 = 0; var7 < this.field_10956.field_19926.size(); var7++) {
         class_7934 var8 = this.field_10956.field_19926.get(var7);
         if (this.method_10218(var8, var1, var3) && var8.method_35886()) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (super.method_26940(var1, var3, var5)) {
         return true;
      } else {
         boolean var8 = this.field_943.field_9577.field_45541.method_27070(var5);
         class_7934 var9 = this.method_10224(var1, var3);
         long var10 = class_9665.method_44650();
         this.field_10964 = this.field_10970 == var9 && var10 - this.field_10983 < 250L && this.field_10976 == var5;
         this.field_10982 = false;
         if (var5 != 0 && var5 != 1 && !var8) {
            this.method_10225(var5);
         } else {
            int var12 = this.field_10984;
            int var13 = this.field_10962;
            boolean var14 = this.method_10215(var1, var3, var12, var13, var5);
            int var15 = -1;
            if (var9 != null) {
               var15 = var9.field_40588;
            }

            if (var14) {
               var15 = -999;
            }

            if (this.field_943.field_9577.field_45570 && var14 && this.field_943.field_9632.field_3853.method_32424().method_28022()) {
               this.field_943.method_8609((class_266)null);
               return true;
            }

            if (var15 != -1) {
               if (!this.field_943.field_9577.field_45570) {
                  if (!this.field_10980) {
                     if (!this.field_943.field_9632.field_3853.method_32424().method_28022()) {
                        this.field_10980 = true;
                        this.field_10957 = var5;
                        this.field_10961.clear();
                        if (var5 != 0) {
                           if (var5 != 1) {
                              if (this.field_943.field_9577.field_45541.method_27070(var5)) {
                                 this.field_10977 = 2;
                              }
                           } else {
                              this.field_10977 = 1;
                           }
                        } else {
                           this.field_10977 = 0;
                        }
                     } else {
                        if (this.field_943.field_9577.field_45541.method_27070(var5)) {
                           this.method_10217(var9, var15, var5, class_6269.field_32025);
                        } else {
                           boolean var16 = var15 != -999
                              && (
                                 class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 340)
                                    || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 344)
                              );
                           class_6269 var17 = class_6269.field_32027;
                           if (!var16) {
                              if (var15 == -999) {
                                 var17 = class_6269.field_32024;
                              }
                           } else {
                              this.field_10968 = var9 != null && var9.method_35884() ? var9.method_35898().method_27973() : class_6098.field_31203;
                              var17 = class_6269.field_32019;
                           }

                           this.method_10217(var9, var15, var5, var17);
                        }

                        this.field_10982 = true;
                     }
                  }
               } else if (var9 != null && var9.method_35884()) {
                  this.field_10975 = var9;
                  this.field_10965 = class_6098.field_31203;
                  this.field_10953 = var5 == 1;
               } else {
                  this.field_10975 = null;
               }
            }
         }

         this.field_10970 = var9;
         this.field_10983 = var10;
         this.field_10976 = var5;
         return true;
      }
   }

   private void method_10225(int var1) {
      if (this.field_10954 != null && this.field_943.field_9632.field_3853.method_32424().method_28022()) {
         if (this.field_943.field_9577.field_45415.method_27070(var1)) {
            this.method_10217(this.field_10954, this.field_10954.field_40588, 40, class_6269.field_32026);
            return;
         }

         for (int var4 = 0; var4 < 9; var4++) {
            if (this.field_943.field_9577.field_45393[var4].method_27070(var1)) {
               this.method_10217(this.field_10954, this.field_10954.field_40588, var4, class_6269.field_32026);
            }
         }
      }
   }

   public boolean method_10215(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.field_10981) || var3 >= (double)(var6 + this.field_10973);
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      class_7934 var12 = this.method_10224(var1, var3);
      class_6098 var13 = this.field_943.field_9632.field_3853.method_32424();
      if (this.field_10975 != null && this.field_943.field_9577.field_45570) {
         if (var5 == 0 || var5 == 1) {
            if (!this.field_10965.method_28022()) {
               if (this.field_10965.method_27997() > 1 && var12 != null && class_4088.method_18856(var12, this.field_10965, false)) {
                  long var14 = class_9665.method_44650();
                  if (this.field_10985 != var12) {
                     this.field_10985 = var12;
                     this.field_10963 = var14;
                  } else if (var14 - this.field_10963 > 500L) {
                     this.method_10217(this.field_10975, this.field_10975.field_40588, 0, class_6269.field_32027);
                     this.method_10217(var12, var12.field_40588, 1, class_6269.field_32027);
                     this.method_10217(this.field_10975, this.field_10975.field_40588, 0, class_6269.field_32027);
                     this.field_10963 = var14 + 750L;
                     this.field_10965.method_27970(1);
                  }
               }
            } else if (var12 != this.field_10975 && !this.field_10975.method_35898().method_28022()) {
               this.field_10965 = this.field_10975.method_35898().method_27973();
            }
         }
      } else if (this.field_10980
         && var12 != null
         && !var13.method_28022()
         && (var13.method_27997() > this.field_10961.size() || this.field_10977 == 2)
         && class_4088.method_18856(var12, var13, true)
         && var12.method_35889(var13)
         && this.field_10956.method_18857(var12)) {
         this.field_10961.add(var12);
         this.method_10219();
      }

      return true;
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      class_7934 var8 = this.method_10224(var1, var3);
      int var9 = this.field_10984;
      int var10 = this.field_10962;
      boolean var11 = this.method_10215(var1, var3, var9, var10, var5);
      int var12 = -1;
      if (var8 != null) {
         var12 = var8.field_40588;
      }

      if (var11) {
         var12 = -999;
      }

      if (this.field_10964 && var8 != null && var5 == 0 && this.field_10956.method_18873(class_6098.field_31203, var8)) {
         if (!method_1190()) {
            this.method_10217(var8, var12, var5, class_6269.field_32023);
         } else if (!this.field_10968.method_28022()) {
            for (class_7934 var18 : this.field_10956.field_19926) {
               if (var18 != null
                  && var18.method_35895(this.field_943.field_9632)
                  && var18.method_35884()
                  && var18.field_40591 == var8.field_40591
                  && class_4088.method_18856(var18, this.field_10968, true)) {
                  this.method_10217(var18, var18.field_40588, var5, class_6269.field_32019);
               }
            }
         }

         this.field_10964 = false;
         this.field_10983 = 0L;
      } else {
         if (this.field_10980 && this.field_10957 != var5) {
            this.field_10980 = false;
            this.field_10961.clear();
            this.field_10982 = true;
            return true;
         }

         if (this.field_10982) {
            this.field_10982 = false;
            return true;
         }

         if (this.field_10975 != null && this.field_943.field_9577.field_45570) {
            if (var5 == 0 || var5 == 1) {
               if (this.field_10965.method_28022() && var8 != this.field_10975) {
                  this.field_10965 = this.field_10975.method_35898();
               }

               boolean var16 = class_4088.method_18856(var8, this.field_10965, false);
               if (var12 != -1 && !this.field_10965.method_28022() && var16) {
                  this.method_10217(this.field_10975, this.field_10975.field_40588, var5, class_6269.field_32027);
                  this.method_10217(var8, var12, 0, class_6269.field_32027);
                  if (!this.field_943.field_9632.field_3853.method_32424().method_28022()) {
                     this.method_10217(this.field_10975, this.field_10975.field_40588, var5, class_6269.field_32027);
                     this.field_10978 = class_9299.method_42847(var1 - (double)var9);
                     this.field_10972 = class_9299.method_42847(var3 - (double)var10);
                     this.field_10955 = this.field_10975;
                     this.field_10979 = this.field_10965;
                     this.field_10974 = class_9665.method_44650();
                  } else {
                     this.field_10979 = class_6098.field_31203;
                  }
               } else if (!this.field_10965.method_28022()) {
                  this.field_10978 = class_9299.method_42847(var1 - (double)var9);
                  this.field_10972 = class_9299.method_42847(var3 - (double)var10);
                  this.field_10955 = this.field_10975;
                  this.field_10979 = this.field_10965;
                  this.field_10974 = class_9665.method_44650();
               }

               this.field_10965 = class_6098.field_31203;
               this.field_10975 = null;
            }
         } else if (this.field_10980 && !this.field_10961.isEmpty()) {
            this.method_10217((class_7934)null, -999, class_4088.method_18881(0, this.field_10977), class_6269.field_32022);

            for (class_7934 var14 : this.field_10961) {
               this.method_10217(var14, var14.field_40588, class_4088.method_18881(1, this.field_10977), class_6269.field_32022);
            }

            this.method_10217((class_7934)null, -999, class_4088.method_18881(2, this.field_10977), class_6269.field_32022);
         } else if (!this.field_943.field_9632.field_3853.method_32424().method_28022()) {
            if (!this.field_943.field_9577.field_45541.method_27070(var5)) {
               boolean var13 = var12 != -999
                  && (
                     class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 340)
                        || class_9732.method_44934(MinecraftClient.method_8510().method_8552().method_43181(), 344)
                  );
               if (var13) {
                  this.field_10968 = var8 != null && var8.method_35884() ? var8.method_35898().method_27973() : class_6098.field_31203;
               }

               this.method_10217(var8, var12, var5, !var13 ? class_6269.field_32027 : class_6269.field_32019);
            } else {
               this.method_10217(var8, var12, var5, class_6269.field_32025);
            }
         }
      }

      if (this.field_943.field_9632.field_3853.method_32424().method_28022()) {
         this.field_10983 = 0L;
      }

      this.field_10980 = false;
      return true;
   }

   private boolean method_10218(class_7934 var1, double var2, double var4) {
      return this.method_10222(var1.field_40589, var1.field_40590, 16, 16, var2, var4);
   }

   public boolean method_10222(int var1, int var2, int var3, int var4, double var5, double var7) {
      int var11 = this.field_10984;
      int var12 = this.field_10962;
      var5 -= (double)var11;
      var7 -= (double)var12;
      return var5 >= (double)(var1 - 1) && var5 < (double)(var1 + var3 + 1) && var7 >= (double)(var2 - 1) && var7 < (double)(var2 + var4 + 1);
   }

   public void method_10217(class_7934 var1, int var2, int var3, class_6269 var4) {
      if (var1 != null) {
         var2 = var1.field_40588;
      }

      this.field_943.field_9647.method_42134(this.field_10956.field_19925, var2, var3, var4, this.field_943.field_9632);
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (!this.field_943.field_9577.field_45575.method_27062(var1, var2)) {
            this.method_10220(var1, var2);
            if (this.field_10954 != null && this.field_10954.method_35884()) {
               if (!this.field_943.field_9577.field_45541.method_27062(var1, var2)) {
                  if (this.field_943.field_9577.field_45451.method_27062(var1, var2)) {
                     this.method_10217(this.field_10954, this.field_10954.field_40588, !method_1185() ? 0 : 1, class_6269.field_32024);
                  }
               } else {
                  this.method_10217(this.field_10954, this.field_10954.field_40588, 0, class_6269.field_32025);
               }
            }

            return true;
         } else {
            this.method_1156();
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method_10220(int var1, int var2) {
      if (this.field_943.field_9632.field_3853.method_32424().method_28022() && this.field_10954 != null) {
         if (this.field_943.field_9577.field_45415.method_27062(var1, var2)) {
            this.method_10217(this.field_10954, this.field_10954.field_40588, 40, class_6269.field_32026);
            return true;
         }

         for (int var5 = 0; var5 < 9; var5++) {
            if (this.field_943.field_9577.field_45393[var5].method_27062(var1, var2)) {
               this.method_10217(this.field_10954, this.field_10954.field_40588, var5, class_6269.field_32026);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void method_1162() {
      if (this.field_943.field_9632 != null) {
         this.field_10956.method_18876(this.field_943.field_9632);
      }
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   @Override
   public void method_5312() {
      super.method_5312();
      if (!this.field_943.field_9632.method_37330() || this.field_943.field_9632.field_41751) {
         this.field_943.field_9632.method_3207();
      }
   }

   @Override
   public T method_20393() {
      return this.field_10956;
   }

   @Override
   public void method_1156() {
      this.field_943.field_9632.method_3207();
      super.method_1156();
   }
}

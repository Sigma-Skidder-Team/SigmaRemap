package remapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum class_6814 implements class_3743, class_179 {
   field_35151;

   private static final Logger field_35148 = LogManager.getLogger();
   private static final Int2IntMap field_35149 = class_9665.<Int2IntMap>method_44659(new Int2IntOpenHashMap(), var0 -> {
      var0.put(1, 129);
      var0.put(2, 130);
      var0.put(3, 131);
      var0.put(4, 132);
      var0.put(5, 133);
      var0.put(6, 134);
      var0.put(12, 140);
      var0.put(21, 149);
      var0.put(23, 151);
      var0.put(27, 155);
      var0.put(28, 156);
      var0.put(29, 157);
      var0.put(30, 158);
      var0.put(32, 160);
      var0.put(33, 161);
      var0.put(34, 162);
      var0.put(35, 163);
      var0.put(36, 164);
      var0.put(37, 165);
      var0.put(38, 166);
      var0.put(39, 167);
   });

   @Override
   public int method_17352(class_2431 var1, class_2997 var2, class_2997 var3, int var4, int var5) {
      int var8 = var2.method_13700(this.method_34239(var4 + 1), this.method_34240(var5 + 1));
      int var9 = var3.method_13700(this.method_34239(var4 + 1), this.method_34240(var5 + 1));
      if (var8 > 255) {
         field_35148.debug("old! {}", var8);
      }

      int var10 = (var9 - 2) % 29;
      if (!class_7930.method_35854(var8) && var9 >= 2 && var10 == 1) {
         return field_35149.getOrDefault(var8, var8);
      } else {
         if (var1.method_11082(3) == 0 || var10 == 0) {
            int var11 = var8;
            if (var8 != 2) {
               if (var8 != 4) {
                  if (var8 != 27) {
                     if (var8 != 29) {
                        if (var8 != 5) {
                           if (var8 != 32) {
                              if (var8 != 30) {
                                 if (var8 != 1) {
                                    if (var8 != 12) {
                                       if (var8 != 21) {
                                          if (var8 != 168) {
                                             if (var8 != 0) {
                                                if (var8 != 45) {
                                                   if (var8 != 46) {
                                                      if (var8 != 10) {
                                                         if (var8 != 3) {
                                                            if (var8 != 35) {
                                                               if (!class_7930.method_35856(var8, 38)) {
                                                                  if ((var8 == 24 || var8 == 48 || var8 == 49 || var8 == 50) && var1.method_11082(3) == 0) {
                                                                     var11 = var1.method_11082(2) != 0 ? 4 : 1;
                                                                  }
                                                               } else {
                                                                  var11 = 37;
                                                               }
                                                            } else {
                                                               var11 = 36;
                                                            }
                                                         } else {
                                                            var11 = 34;
                                                         }
                                                      } else {
                                                         var11 = 50;
                                                      }
                                                   } else {
                                                      var11 = 49;
                                                   }
                                                } else {
                                                   var11 = 48;
                                                }
                                             } else {
                                                var11 = 24;
                                             }
                                          } else {
                                             var11 = 169;
                                          }
                                       } else {
                                          var11 = 22;
                                       }
                                    } else {
                                       var11 = 13;
                                    }
                                 } else {
                                    var11 = var1.method_11082(3) != 0 ? 4 : 18;
                                 }
                              } else {
                                 var11 = 31;
                              }
                           } else {
                              var11 = 33;
                           }
                        } else {
                           var11 = 19;
                        }
                     } else {
                        var11 = 1;
                     }
                  } else {
                     var11 = 28;
                  }
               } else {
                  var11 = 18;
               }
            } else {
               var11 = 17;
            }

            if (var10 == 0 && var11 != var8) {
               var11 = field_35149.getOrDefault(var11, var8);
            }

            if (var11 != var8) {
               int var12 = 0;
               if (class_7930.method_35856(var2.method_13700(this.method_34239(var4 + 1), this.method_34240(var5 + 0)), var8)) {
                  var12++;
               }

               if (class_7930.method_35856(var2.method_13700(this.method_34239(var4 + 2), this.method_34240(var5 + 1)), var8)) {
                  var12++;
               }

               if (class_7930.method_35856(var2.method_13700(this.method_34239(var4 + 0), this.method_34240(var5 + 1)), var8)) {
                  var12++;
               }

               if (class_7930.method_35856(var2.method_13700(this.method_34239(var4 + 1), this.method_34240(var5 + 2)), var8)) {
                  var12++;
               }

               if (var12 >= 3) {
                  return var11;
               }
            }
         }

         return var8;
      }
   }
}

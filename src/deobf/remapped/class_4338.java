package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class class_4338 {
   private static final Logger field_21085 = LogManager.getLogger();

   @Nullable
   public static GameProfile method_20184(CompoundNBT var0) {
      String var3 = null;
      UUID var4 = null;
      if (var0.contains("Name", 8)) {
         var3 = var0.method_25965("Name");
      }

      if (var0.method_25954("Id")) {
         var4 = var0.method_25926("Id");
      }

      try {
         GameProfile var5 = new GameProfile(var4, var3);
         if (var0.contains("Properties", 10)) {
            CompoundNBT var6 = var0.getCompound("Properties");

            for (String var8 : var6.method_25952()) {
               class_3416 var9 = var6.method_25927(var8, 10);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  CompoundNBT var11 = var9.method_15764(var10);
                  String var12 = var11.method_25965("Value");
                  if (var11.contains("Signature", 8)) {
                     var5.getProperties().put(var8, new Property(var8, var12, var11.method_25965("Signature")));
                  } else {
                     var5.getProperties().put(var8, new Property(var8, var12));
                  }
               }
            }
         }

         return var5;
      } catch (Throwable var13) {
         return null;
      }
   }

   public static CompoundNBT method_20177(CompoundNBT var0, GameProfile var1) {
      if (!class_6660.method_30576(var1.getName())) {
         var0.method_25941("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.method_25964("Id", var1.getId());
      }

      if (!var1.getProperties().isEmpty()) {
         CompoundNBT var4 = new CompoundNBT();

         for (String var6 : var1.getProperties().keySet()) {
            class_3416 var7 = new class_3416();

            for (Property var9 : var1.getProperties().get(var6)) {
               CompoundNBT var10 = new CompoundNBT();
               var10.method_25941("Value", var9.getValue());
               if (var9.hasSignature()) {
                  var10.method_25941("Signature", var9.getSignature());
               }

               var7.add(var10);
            }

            var4.put(var6, var7);
         }

         var0.put("Properties", var4);
      }

      return var0;
   }

   @VisibleForTesting
   public static boolean method_20182(class_8406 var0, class_8406 var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (!(var0 instanceof CompoundNBT)) {
         if (var0 instanceof class_3416 && var2) {
            class_3416 var11 = (class_3416)var0;
            class_3416 var12 = (class_3416)var1;
            if (var11.isEmpty()) {
               return var12.isEmpty();
            } else {
               for (int var13 = 0; var13 < var11.size(); var13++) {
                  class_8406 var14 = var11.get(var13);
                  boolean var15 = false;

                  for (int var10 = 0; var10 < var12.size(); var10++) {
                     if (method_20182(var14, var12.get(var10), var2)) {
                        var15 = true;
                        break;
                     }
                  }

                  if (!var15) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return var0.equals(var1);
         }
      } else {
         CompoundNBT var5 = (CompoundNBT)var0;
         CompoundNBT var6 = (CompoundNBT)var1;

         for (String var8 : var5.method_25952()) {
            class_8406 var9 = var5.method_25929(var8);
            if (!method_20182(var9, var6.method_25929(var8), var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static class_6222 method_20181(UUID var0) {
      return new class_6222(class_5753.method_26037(var0));
   }

   public static UUID method_20183(class_8406 var0) {
      if (var0.method_38709() == class_6222.field_31787) {
         int[] var3 = ((class_6222)var0).method_28446();
         if (var3.length == 4) {
            return class_5753.method_26038(var3);
         } else {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var3.length + ".");
         }
      } else {
         throw new IllegalArgumentException(
            "Expected UUID-Tag to be of type " + class_6222.field_31787.method_14892() + ", but found " + var0.method_38709().method_14892() + "."
         );
      }
   }

   public static BlockPos method_20189(CompoundNBT var0) {
      return new BlockPos(var0.method_25947("X"), var0.method_25947("Y"), var0.method_25947("Z"));
   }

   public static CompoundNBT method_20190(BlockPos var0) {
      CompoundNBT var3 = new CompoundNBT();
      var3.putInt("X", var0.getX());
      var3.putInt("Y", var0.getY());
      var3.putInt("Z", var0.getZ());
      return var3;
   }

   public static class_2522 method_20185(CompoundNBT var0) {
      if (!var0.contains("Name", 8)) {
         return class_4783.field_23184.method_29260();
      } else {
         class_6414 var3 = class_8669.field_44462.method_39806(new Identifier(var0.method_25965("Name")));
         class_2522 var4 = var3.method_29260();
         if (var0.contains("Properties", 10)) {
            CompoundNBT var5 = var0.getCompound("Properties");
            class_8021 var6 = var3.method_29306();

            for (String var8 : var5.method_25952()) {
               class_5019 var9 = var6.method_36440(var8);
               if (var9 != null) {
                  var4 = method_20186(var4, var9, var8, var5, var0);
               }
            }
         }

         return var4;
      }
   }

   private static <S extends class_2243<?, S>, T extends Comparable<T>> S method_20186(
           S var0, class_5019<T> var1, String var2, CompoundNBT var3, CompoundNBT var4
   ) {
      Optional var7 = var1.method_23108(var3.method_25965(var2));
      if (!var7.isPresent()) {
         field_21085.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.method_25965(var2), var4.toString());
         return (S)var0;
      } else {
         return (S)var0.method_10308(var1, (Comparable)var7.get());
      }
   }

   public static CompoundNBT method_20187(class_2522 var0) {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("Name", class_8669.field_44462.method_39797(var0.method_8360()).toString());
      ImmutableMap var4 = var0.method_10316();
      if (!var4.isEmpty()) {
         CompoundNBT var5 = new CompoundNBT();
         UnmodifiableIterator var6 = var4.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            class_5019 var8 = (class_5019)var7.getKey();
            var5.method_25941(var8.method_23109(), method_20188(var8, (Comparable<?>)var7.getValue()));
         }

         var3.put("Properties", var5);
      }

      return var3;
   }

   private static <T extends Comparable<T>> String method_20188(class_5019<T> var0, Comparable<?> var1) {
      return var0.method_23110((T)var1);
   }

   public static CompoundNBT method_20179(DataFixer var0, class_5397 var1, CompoundNBT var2, int var3) {
      return method_20180(var0, var1, var2, var3, class_7665.method_34674().getWorldVersion());
   }

   public static CompoundNBT method_20180(DataFixer var0, class_5397 var1, CompoundNBT var2, int var3, int var4) {
      return (CompoundNBT)var0.update(var1.method_24571(), new Dynamic(class_3504.field_17178, var2), var3, var4).getValue();
   }
}

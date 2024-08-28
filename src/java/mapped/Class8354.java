package mapped;

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

public final class Class8354 {
   private static final Logger field35896 = LogManager.getLogger();

   @Nullable
   public static GameProfile method29278(Class39 var0) {
      String var3 = null;
      UUID var4 = null;
      if (var0.method119("Name", 8)) {
         var3 = var0.method126("Name");
      }

      if (var0.method106("Id")) {
         var4 = var0.method105("Id");
      }

      try {
         GameProfile var5 = new GameProfile(var4, var3);
         if (var0.method119("Properties", 10)) {
            Class39 var6 = var0.method130("Properties");

            for (String var8 : var6.method97()) {
               Class41 var9 = var6.method131(var8, 10);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  Class39 var11 = var9.method153(var10);
                  String var12 = var11.method126("Value");
                  if (var11.method119("Signature", 8)) {
                     var5.getProperties().put(var8, new Property(var8, var12, var11.method126("Signature")));
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

   public static Class39 method29279(Class39 var0, GameProfile var1) {
      if (!Class9001.method33256(var1.getName())) {
         var0.method109("Name", var1.getName());
      }

      if (var1.getId() != null) {
         var0.method104("Id", var1.getId());
      }

      if (!var1.getProperties().isEmpty()) {
         Class39 var4 = new Class39();

         for (String var6 : var1.getProperties().keySet()) {
            Class41 var7 = new Class41();

            for (Property var9 : var1.getProperties().get(var6)) {
               Class39 var10 = new Class39();
               var10.method109("Value", var9.getValue());
               if (var9.hasSignature()) {
                  var10.method109("Signature", var9.getSignature());
               }

               var7.add(var10);
            }

            var4.method99(var6, var7);
         }

         var0.method99("Properties", var4);
      }

      return var0;
   }

   @VisibleForTesting
   public static boolean method29280(Class30 var0, Class30 var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (!(var0 instanceof Class39)) {
         if (var0 instanceof Class41 && var2) {
            Class41 var11 = (Class41)var0;
            Class41 var12 = (Class41)var1;
            if (var11.isEmpty()) {
               return var12.isEmpty();
            } else {
               for (int var13 = 0; var13 < var11.size(); var13++) {
                  Class30 var14 = var11.get(var13);
                  boolean var15 = false;

                  for (int var10 = 0; var10 < var12.size(); var10++) {
                     if (method29280(var14, var12.get(var10), var2)) {
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
         Class39 var5 = (Class39)var0;
         Class39 var6 = (Class39)var1;

         for (String var8 : var5.method97()) {
            Class30 var9 = var5.method116(var8);
            if (!method29280(var9, var6.method116(var8), var2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static Class28 method29281(UUID var0) {
      return new Class28(Class8749.method31564(var0));
   }

   public static UUID method29282(Class30 var0) {
      if (var0.method75() == Class28.field52) {
         int[] var3 = ((Class28)var0).method77();
         if (var3.length == 4) {
            return Class8749.method31563(var3);
         } else {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + var3.length + ".");
         }
      } else {
         throw new IllegalArgumentException(
            "Expected UUID-Tag to be of type " + Class28.field52.method21975() + ", but found " + var0.method75().method21975() + "."
         );
      }
   }

   public static BlockPos method29283(Class39 var0) {
      return new BlockPos(var0.method122("X"), var0.method122("Y"), var0.method122("Z"));
   }

   public static Class39 method29284(BlockPos var0) {
      Class39 var3 = new Class39();
      var3.method102("X", var0.method8304());
      var3.method102("Y", var0.getY());
      var3.method102("Z", var0.method8306());
      return var3;
   }

   public static Class7380 method29285(Class39 var0) {
      if (!var0.method119("Name", 8)) {
         return Blocks.AIR.method11579();
      } else {
         Block var3 = Class2348.field16072.method9184(new ResourceLocation(var0.method126("Name")));
         Class7380 var4 = var3.method11579();
         if (var0.method119("Properties", 10)) {
            Class39 var5 = var0.method130("Properties");
            Class9348 var6 = var3.method11577();

            for (String var8 : var5.method97()) {
               Class8550 var9 = var6.method35396(var8);
               if (var9 != null) {
                  var4 = method29286(var4, var9, var8, var5, var0);
               }
            }
         }

         return var4;
      }
   }

   private static <S extends Class7378<?, S>, T extends Comparable<T>> S method29286(S var0, Class8550<T> var1, String var2, Class39 var3, Class39 var4) {
      Optional<T> var7 = var1.method30476(var3.method126(var2));
      if (!var7.isPresent()) {
         field35896.warn("Unable to read property: {} with value: {} for blockstate: {}", var2, var3.method126(var2), var4.toString());
         return var0;
      } else {
         return var0.method23465(var1, var7.get());
      }
   }

   public static Class39 method29287(Class7380 var0) {
      Class39 var3 = new Class39();
      var3.method109("Name", Class2348.field16072.method9181(var0.method23383()).toString());
      ImmutableMap var4 = var0.method23468();
      if (!var4.isEmpty()) {
         Class39 var5 = new Class39();
         UnmodifiableIterator var6 = var4.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Class8550 var8 = (Class8550)var7.getKey();
            var5.method109(var8.method30472(), method29288(var8, (Comparable<?>)var7.getValue()));
         }

         var3.method99("Properties", var5);
      }

      return var3;
   }

   private static <T extends Comparable<T>> String method29288(Class8550<T> var0, Comparable<?> var1) {
      return var0.method30475((T)var1);
   }

   public static Class39 method29289(DataFixer var0, Class2108 var1, Class39 var2, int var3) {
      return method29290(var0, var1, var2, var3, Class9246.method34773().getWorldVersion());
   }

   public static Class39 method29290(DataFixer var0, Class2108 var1, Class39 var2, int var3, int var4) {
      return (Class39)var0.update(var1.method8778(), new Dynamic(Class8063.field34602, var2), var3, var4).getValue();
   }
}

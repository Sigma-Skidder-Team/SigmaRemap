package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_7867 implements Packet<class_392> {
   private class_2236 field_40275;
   public List<class_5902> field_40274 = Lists.newArrayList();

   public class_7867() {
   }

   public class_7867(class_2236 var1, class_9359... var2) {
      this.field_40275 = var1;

      for (class_9359 var8 : var2) {
         this.field_40274.add(new class_5902(var8.method_3247(), var8.field_47790, var8.field_47807.method_39517(), var8.method_43244()));
      }
   }

   public class_7867(class_2236 var1, Iterable<class_9359> var2) {
      this.field_40275 = var1;

      for (class_9359 var6 : var2) {
         this.field_40274.add(new class_5902(var6.method_3247(), var6.field_47790, var6.field_47807.method_39517(), var6.method_43244()));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_40275 = var1.<class_2236>method_37787(class_2236.class);
      int var4 = var1.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         GameProfile var6 = null;
         int var7 = 0;
         GameType var8 = null;
         ITextComponent var9 = null;
         switch (this.field_40275) {
            case field_11144:
               var6 = new GameProfile(var1.method_37753(), var1.method_37784(16));
               int var10 = var1.method_37778();
               int var11 = 0;

               for (; var11 < var10; var11++) {
                  String var12 = var1.method_37784(32767);
                  String var13 = var1.method_37784(32767);
                  if (var1.readBoolean()) {
                     var6.getProperties().put(var12, new Property(var12, var13, var1.method_37784(32767)));
                  } else {
                     var6.getProperties().put(var12, new Property(var12, var13));
                  }
               }

               var8 = GameType.method_21590(var1.method_37778());
               var7 = var1.method_37778();
               if (var1.readBoolean()) {
                  var9 = var1.method_37776();
               }
               break;
            case field_11147:
               var6 = new GameProfile(var1.method_37753(), (String)null);
               var8 = GameType.method_21590(var1.method_37778());
               break;
            case field_11141:
               var6 = new GameProfile(var1.method_37753(), (String)null);
               var7 = var1.method_37778();
               break;
            case field_11142:
               var6 = new GameProfile(var1.method_37753(), (String)null);
               if (var1.readBoolean()) {
                  var9 = var1.method_37776();
               }
               break;
            case field_11143:
               var6 = new GameProfile(var1.method_37753(), (String)null);
         }

         this.field_40274.add(new class_5902(var6, var7, var8, var9));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37750(this.field_40275);
      var1.method_37743(this.field_40274.size());

      for (class_5902 var5 : this.field_40274) {
         switch (this.field_40275) {
            case field_11144:
               var1.method_37746(var5.method_27005().getId());
               var1.method_37760(var5.method_27005().getName());
               var1.method_37743(var5.method_27005().getProperties().size());

               for (Property var7 : var5.method_27005().getProperties().values()) {
                  var1.method_37760(var7.getName());
                  var1.method_37760(var7.getValue());
                  if (var7.hasSignature()) {
                     var1.writeBoolean(true);
                     var1.method_37760(var7.getSignature());
                  } else {
                     var1.writeBoolean(false);
                  }
               }

               var1.method_37743(var5.method_27003().method_21589());
               var1.method_37743(var5.method_27002());
               if (var5.method_27001() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.method_37779(var5.method_27001());
               }
               break;
            case field_11147:
               var1.method_37746(var5.method_27005().getId());
               var1.method_37743(var5.method_27003().method_21589());
               break;
            case field_11141:
               var1.method_37746(var5.method_27005().getId());
               var1.method_37743(var5.method_27002());
               break;
            case field_11142:
               var1.method_37746(var5.method_27005().getId());
               if (var5.method_27001() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.method_37779(var5.method_27001());
               }
               break;
            case field_11143:
               var1.method_37746(var5.method_27005().getId());
         }
      }
   }

   public void method_35611(class_392 var1) {
      var1.method_1901(this);
   }

   public List<class_5902> method_35609() {
      return this.field_40274;
   }

   public class_2236 method_35608() {
      return this.field_40275;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.field_40275).add("entries", this.field_40274).toString();
   }
}

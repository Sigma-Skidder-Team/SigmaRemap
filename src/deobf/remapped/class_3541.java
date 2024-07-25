package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3541 extends class_2840<class_5408> {
   public static final class_2049 field_17316 = new class_2049("meta:missing_sound", 1.0F, 1.0F, 1, class_2031.field_10317, false, false, 16);
   private static final Logger field_17313 = LogManager.getLogger();
   private static final Gson field_17317 = new GsonBuilder()
      .registerTypeHierarchyAdapter(ITextComponent.class, new ITextComponent$class_40())
      .registerTypeAdapter(class_7874.class, new class_2834())
      .create();
   private static final TypeToken<Map<String, class_7874>> field_17315 = new class_1589();
   private final Map<Identifier, class_7633> field_17318 = Maps.newHashMap();
   private final class_132 field_17314;

   public class_3541(class_7832 var1, GameOptions var2) {
      this.field_17314 = new class_132(this, var2, var1);
   }

   public class_5408 method_16350(class_7832 var1, class_3492 var2) {
      class_5408 var5 = new class_5408();
      var2.method_16059();

      for (String var7 : var1.method_35455()) {
         var2.method_16056(var7);

         try {
            for (class_4038 var9 : var1.method_35457(new Identifier(var7, "sounds.json"))) {
               var2.method_16056(var9.method_18579());

               try (
                  InputStream var10 = var9.method_18576();
                  InputStreamReader var12 = new InputStreamReader(var10, StandardCharsets.UTF_8);
               ) {
                  var2.method_16056("parse");
                  Map var14 = class_6539.<Map>method_29764(field_17317, var12, field_17315);
                  var2.method_16050("register");

                  for (Entry var16 : var14.entrySet()) {
                     class_5408.method_24610(var5, new Identifier(var7, (String)var16.getKey()), (class_7874)var16.getValue(), var1);
                  }

                  var2.method_16054();
               } catch (RuntimeException var46) {
                  field_17313.warn("Invalid sounds.json in resourcepack: '{}'", var9.method_18579(), var46);
               }

               var2.method_16054();
            }
         } catch (IOException var47) {
         }

         var2.method_16054();
      }

      var2.method_16052();
      return var5;
   }

   public void method_16344(class_5408 var1, class_7832 var2, class_3492 var3) {
      var1.method_24614(this.field_17318, this.field_17314);

      for (Identifier var7 : this.field_17318.keySet()) {
         class_7633 var8 = this.field_17318.get(var7);
         if (var8.method_34585() instanceof TranslationTextComponent) {
            String var9 = ((TranslationTextComponent)var8.method_34585()).getKey();
            if (!class_6956.method_31804(var9)) {
               field_17313.debug("Missing subtitle {} for event: {}", var9, var7);
            }
         }
      }

      if (field_17313.isDebugEnabled()) {
         for (Identifier var11 : this.field_17318.keySet()) {
            if (!class_8669.field_44369.method_39814(var11)) {
               field_17313.debug("Not having sound event for: {}", var11);
            }
         }
      }

      this.field_17314.method_418();
   }

   private static boolean method_16339(class_2049 var0, Identifier var1, class_7832 var2) {
      Identifier var5 = var0.method_9577();
      if (var2.method_35456(var5)) {
         return true;
      } else {
         field_17313.warn("File {} does not exist, cannot add it to event {}", var5, var1);
         return false;
      }
   }

   @Nullable
   public class_7633 method_16334(Identifier var1) {
      return this.field_17318.get(var1);
   }

   public Collection<Identifier> method_16338() {
      return this.field_17318.keySet();
   }

   public void method_16351(class_6483 var1) {
      this.field_17314.method_425(var1);
   }

   public void method_16345(class_3560 var1) {
      this.field_17314.method_435(var1);
   }

   public void method_16342(class_3560 var1, int var2) {
      this.field_17314.method_429(var1, var2);
   }

   public void method_16348(Camera var1) {
      this.field_17314.method_437(var1);
   }

   public void method_16340() {
      this.field_17314.method_433();
   }

   public void method_16335() {
      this.field_17314.method_440();
   }

   public void method_16329() {
      this.field_17314.method_431();
   }

   public void method_16330(boolean var1) {
      this.field_17314.method_434(var1);
   }

   public void method_16346() {
      this.field_17314.method_419();
   }

   public void method_16349(class_562 var1, float var2) {
      if (var1 == class_562.field_3326 && var2 <= 0.0F) {
         this.method_16335();
      }

      this.field_17314.method_421(var1, var2);
   }

   public void method_16336(class_3560 var1) {
      this.field_17314.method_423(var1);
   }

   public boolean method_16331(class_3560 var1) {
      return this.field_17314.method_427(var1);
   }

   public void method_16343(class_4440 var1) {
      this.field_17314.method_436(var1);
   }

   public void method_16347(class_4440 var1) {
      this.field_17314.method_443(var1);
   }

   public void method_16337(Identifier var1, class_562 var2) {
      this.field_17314.method_424(var1, var2);
   }

   public String method_16332() {
      return this.field_17314.method_420();
   }
}

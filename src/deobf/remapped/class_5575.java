package remapped;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5575 implements class_5998 {
   private static final Logger field_28323 = LogManager.getLogger();
   private static final Gson field_28326 = new GsonBuilder().setPrettyPrinting().create();
   private final class_6901 field_28324;

   public class_5575(class_6901 var1) {
      this.field_28324 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      Path var4 = this.field_28324.method_31600();
      HashSet var5 = Sets.newHashSet();
      method_25325(
         var3 -> {
            if (var5.add(var3.method_19650())) {
               method_25307(
                  var1,
                  var3.method_19648(),
                  var4.resolve("data/" + var3.method_19650().method_21461() + "/recipes/" + var3.method_19650().method_21456() + ".json")
               );
               JsonObject var6 = var3.method_19649();
               if (var6 != null) {
                  method_25339(
                     var1, var6, var4.resolve("data/" + var3.method_19650().method_21461() + "/advancements/" + var3.method_19646().method_21456() + ".json")
                  );
               }
            } else {
               throw new IllegalStateException("Duplicate recipe " + var3.method_19650());
            }
         }
      );
      method_25339(
         var1,
         class_3321.method_15269().method_15272("impossible", new class_541()).method_15265(),
         var4.resolve("data/minecraft/advancements/recipes/root.json")
      );
   }

   private static void method_25307(class_4162 var0, JsonObject var1, Path var2) {
      try {
         String var5 = field_28326.toJson(var1);
         String var6 = field_30556.hashUnencodedChars(var5).toString();
         if (!Objects.equals(var0.method_19313(var2), var6) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var7 = Files.newBufferedWriter(var2)) {
               var7.write(var5);
            }
         }

         var0.method_19317(var2, var6);
      } catch (IOException var20) {
         field_28323.error("Couldn't save recipe {}", var2, var20);
      }
   }

   private static void method_25339(class_4162 var0, JsonObject var1, Path var2) {
      try {
         String var5 = field_28326.toJson(var1);
         String var6 = field_30556.hashUnencodedChars(var5).toString();
         if (!Objects.equals(var0.method_19313(var2), var6) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var7 = Files.newBufferedWriter(var2)) {
               var7.write(var5);
            }
         }

         var0.method_19317(var2, var6);
      } catch (IOException var20) {
         field_28323.error("Couldn't save recipe advancement {}", var2, var20);
      }
   }

   private static void method_25325(Consumer<class_4219> var0) {
      method_25317(var0, class_4783.field_23545, class_391.field_1629);
      method_25321(var0, class_4783.field_23503, class_391.field_1641);
      method_25321(var0, class_4783.field_23830, class_391.field_1625);
      method_25317(var0, class_4783.field_23916, class_391.field_1601);
      method_25321(var0, class_4783.field_23373, class_391.field_1647);
      method_25321(var0, class_4783.field_23893, class_391.field_1646);
      method_25321(var0, class_4783.field_23464, class_391.field_1592);
      method_25321(var0, class_4783.field_23248, class_391.field_1616);
      method_25332(var0, class_4783.field_23882, class_4783.field_23189);
      method_25332(var0, class_4783.field_23241, class_4783.field_23764);
      method_25332(var0, class_4783.field_23171, class_4783.field_23197);
      method_25332(var0, class_4783.field_23199, class_4783.field_23876);
      method_25332(var0, class_4783.field_23732, class_4783.field_23365);
      method_25332(var0, class_4783.field_23270, class_4783.field_23579);
      method_25332(var0, class_4783.field_23780, class_4783.field_23912);
      method_25332(var0, class_4783.field_23537, class_4783.field_23442);
      method_25332(var0, class_4783.field_23798, class_4783.field_23185);
      method_25332(var0, class_4783.field_23631, class_4783.field_23872);
      method_25332(var0, class_4783.field_23805, class_4783.field_23832);
      method_25332(var0, class_4783.field_23907, class_4783.field_23599);
      method_25332(var0, class_4783.field_23237, class_4783.field_23903);
      method_25332(var0, class_4783.field_23443, class_4783.field_23691);
      method_25332(var0, class_4783.field_23473, class_4783.field_23880);
      method_25332(var0, class_4783.field_23844, class_4783.field_23612);
      method_25312(var0, class_4897.field_25199, class_4783.field_23545);
      method_25312(var0, class_4897.field_24567, class_4783.field_23503);
      method_25312(var0, class_4897.field_25052, class_4783.field_23916);
      method_25312(var0, class_4897.field_24702, class_4783.field_23373);
      method_25312(var0, class_4897.field_25008, class_4783.field_23893);
      method_25312(var0, class_4897.field_24898, class_4783.field_23464);
      method_25324(var0, class_4783.field_23494, class_4783.field_23545);
      method_25340(var0, class_4783.field_23665, class_4783.field_23545);
      method_25334(var0, class_4783.field_23915, class_4783.field_23545);
      method_25337(var0, class_4783.field_23618, class_4783.field_23545);
      method_25338(var0, class_4783.field_23555, class_4783.field_23545);
      method_25323(var0, class_4783.field_23439, class_4783.field_23545);
      method_25331(var0, class_4783.field_23636, class_4783.field_23545);
      method_25318(var0, class_4783.field_23513, class_4783.field_23545);
      method_25333(var0, class_4783.field_23734, class_4783.field_23545);
      method_25324(var0, class_4783.field_23672, class_4783.field_23503);
      method_25340(var0, class_4783.field_23382, class_4783.field_23503);
      method_25334(var0, class_4783.field_23703, class_4783.field_23503);
      method_25337(var0, class_4783.field_23391, class_4783.field_23503);
      method_25338(var0, class_4783.field_23309, class_4783.field_23503);
      method_25323(var0, class_4783.field_23393, class_4783.field_23503);
      method_25331(var0, class_4783.field_23757, class_4783.field_23503);
      method_25318(var0, class_4783.field_23684, class_4783.field_23503);
      method_25333(var0, class_4783.field_23600, class_4783.field_23503);
      method_25324(var0, class_4783.field_23728, class_4783.field_23830);
      method_25340(var0, class_4783.field_23345, class_4783.field_23830);
      method_25334(var0, class_4783.field_23864, class_4783.field_23830);
      method_25337(var0, class_4783.field_23516, class_4783.field_23830);
      method_25338(var0, class_4783.field_23874, class_4783.field_23830);
      method_25323(var0, class_4783.field_23479, class_4783.field_23830);
      method_25331(var0, class_4783.field_23818, class_4783.field_23830);
      method_25318(var0, class_4783.field_23596, class_4783.field_23830);
      method_25333(var0, class_4783.field_23769, class_4783.field_23830);
      method_25324(var0, class_4783.field_23669, class_4783.field_23916);
      method_25340(var0, class_4783.field_23623, class_4783.field_23916);
      method_25334(var0, class_4783.field_23499, class_4783.field_23916);
      method_25337(var0, class_4783.field_23697, class_4783.field_23916);
      method_25338(var0, class_4783.field_23783, class_4783.field_23916);
      method_25323(var0, class_4783.field_23217, class_4783.field_23916);
      method_25331(var0, class_4783.field_23290, class_4783.field_23916);
      method_25318(var0, class_4783.field_23680, class_4783.field_23916);
      method_25333(var0, class_4783.field_23918, class_4783.field_23916);
      method_25324(var0, class_4783.field_23630, class_4783.field_23373);
      method_25340(var0, class_4783.field_23653, class_4783.field_23373);
      method_25334(var0, class_4783.field_23694, class_4783.field_23373);
      method_25337(var0, class_4783.field_23234, class_4783.field_23373);
      method_25338(var0, class_4783.field_23670, class_4783.field_23373);
      method_25323(var0, class_4783.field_23573, class_4783.field_23373);
      method_25331(var0, class_4783.field_23568, class_4783.field_23373);
      method_25318(var0, class_4783.field_23622, class_4783.field_23373);
      method_25333(var0, class_4783.field_23267, class_4783.field_23373);
      method_25324(var0, class_4783.field_23200, class_4783.field_23893);
      method_25340(var0, class_4783.field_23746, class_4783.field_23893);
      method_25334(var0, class_4783.field_23778, class_4783.field_23893);
      method_25337(var0, class_4783.field_23753, class_4783.field_23893);
      method_25338(var0, class_4783.field_23233, class_4783.field_23893);
      method_25323(var0, class_4783.field_23205, class_4783.field_23893);
      method_25331(var0, class_4783.field_23696, class_4783.field_23893);
      method_25318(var0, class_4783.field_23567, class_4783.field_23893);
      method_25333(var0, class_4783.field_23760, class_4783.field_23893);
      method_25324(var0, class_4783.field_23699, class_4783.field_23464);
      method_25340(var0, class_4783.field_23409, class_4783.field_23464);
      method_25334(var0, class_4783.field_23792, class_4783.field_23464);
      method_25337(var0, class_4783.field_23322, class_4783.field_23464);
      method_25338(var0, class_4783.field_23438, class_4783.field_23464);
      method_25323(var0, class_4783.field_23843, class_4783.field_23464);
      method_25331(var0, class_4783.field_23759, class_4783.field_23464);
      method_25318(var0, class_4783.field_23164, class_4783.field_23464);
      method_25333(var0, class_4783.field_23589, class_4783.field_23464);
      method_25324(var0, class_4783.field_23530, class_4783.field_23248);
      method_25340(var0, class_4783.field_23253, class_4783.field_23248);
      method_25334(var0, class_4783.field_23425, class_4783.field_23248);
      method_25337(var0, class_4783.field_23520, class_4783.field_23248);
      method_25338(var0, class_4783.field_23661, class_4783.field_23248);
      method_25323(var0, class_4783.field_23257, class_4783.field_23248);
      method_25331(var0, class_4783.field_23251, class_4783.field_23248);
      method_25318(var0, class_4783.field_23593, class_4783.field_23248);
      method_25333(var0, class_4783.field_23570, class_4783.field_23248);
      method_25335(var0, class_4783.field_23428, class_4897.field_24774);
      method_25316(var0, class_4783.field_23656, class_4783.field_23428);
      method_25314(var0, class_4783.field_23656, class_4897.field_24774);
      method_25336(var0, class_4897.field_25270, class_4783.field_23428);
      method_25315(var0, class_4897.field_25270, class_4897.field_24774);
      method_25319(var0, class_4897.field_24639, class_4783.field_23428);
      method_25335(var0, class_4783.field_23624, class_4897.field_24440);
      method_25316(var0, class_4783.field_23841, class_4783.field_23624);
      method_25314(var0, class_4783.field_23841, class_4897.field_24440);
      method_25336(var0, class_4897.field_25257, class_4783.field_23624);
      method_25315(var0, class_4897.field_25257, class_4897.field_24440);
      method_25319(var0, class_4897.field_24549, class_4783.field_23624);
      method_25335(var0, class_4783.field_23308, class_4897.field_24643);
      method_25316(var0, class_4783.field_23170, class_4783.field_23308);
      method_25314(var0, class_4783.field_23170, class_4897.field_24643);
      method_25336(var0, class_4897.field_24858, class_4783.field_23308);
      method_25315(var0, class_4897.field_24858, class_4897.field_24643);
      method_25319(var0, class_4897.field_24722, class_4783.field_23308);
      method_25335(var0, class_4783.field_23289, class_4897.field_25185);
      method_25316(var0, class_4783.field_23662, class_4783.field_23289);
      method_25314(var0, class_4783.field_23662, class_4897.field_25185);
      method_25336(var0, class_4897.field_24929, class_4783.field_23289);
      method_25315(var0, class_4897.field_24929, class_4897.field_25185);
      method_25319(var0, class_4897.field_24961, class_4783.field_23289);
      method_25335(var0, class_4783.field_23898, class_4897.field_25304);
      method_25316(var0, class_4783.field_23497, class_4783.field_23898);
      method_25314(var0, class_4783.field_23497, class_4897.field_25304);
      method_25336(var0, class_4897.field_24474, class_4783.field_23898);
      method_25315(var0, class_4897.field_24474, class_4897.field_25304);
      method_25319(var0, class_4897.field_25216, class_4783.field_23898);
      method_25335(var0, class_4783.field_23825, class_4897.field_25251);
      method_25316(var0, class_4783.field_23569, class_4783.field_23825);
      method_25314(var0, class_4783.field_23569, class_4897.field_25251);
      method_25336(var0, class_4897.field_25175, class_4783.field_23825);
      method_25315(var0, class_4897.field_25175, class_4897.field_25251);
      method_25319(var0, class_4897.field_25062, class_4783.field_23825);
      method_25335(var0, class_4783.field_23294, class_4897.field_24863);
      method_25316(var0, class_4783.field_23298, class_4783.field_23294);
      method_25314(var0, class_4783.field_23298, class_4897.field_24863);
      method_25336(var0, class_4897.field_24339, class_4783.field_23294);
      method_25315(var0, class_4897.field_24339, class_4897.field_24863);
      method_25319(var0, class_4897.field_25137, class_4783.field_23294);
      method_25335(var0, class_4783.field_23450, class_4897.field_25167);
      method_25316(var0, class_4783.field_23689, class_4783.field_23450);
      method_25314(var0, class_4783.field_23689, class_4897.field_25167);
      method_25336(var0, class_4897.field_25097, class_4783.field_23450);
      method_25315(var0, class_4897.field_25097, class_4897.field_25167);
      method_25319(var0, class_4897.field_24790, class_4783.field_23450);
      method_25335(var0, class_4783.field_23609, class_4897.field_24673);
      method_25316(var0, class_4783.field_23359, class_4783.field_23609);
      method_25314(var0, class_4783.field_23359, class_4897.field_24673);
      method_25336(var0, class_4897.field_24482, class_4783.field_23609);
      method_25315(var0, class_4897.field_24482, class_4897.field_24673);
      method_25319(var0, class_4897.field_24954, class_4783.field_23609);
      method_25335(var0, class_4783.field_23905, class_4897.field_25065);
      method_25316(var0, class_4783.field_23688, class_4783.field_23905);
      method_25314(var0, class_4783.field_23688, class_4897.field_25065);
      method_25336(var0, class_4897.field_25293, class_4783.field_23905);
      method_25315(var0, class_4897.field_25293, class_4897.field_25065);
      method_25319(var0, class_4897.field_24586, class_4783.field_23905);
      method_25335(var0, class_4783.field_23619, class_4897.field_24851);
      method_25316(var0, class_4783.field_23920, class_4783.field_23619);
      method_25314(var0, class_4783.field_23920, class_4897.field_24851);
      method_25336(var0, class_4897.field_24985, class_4783.field_23619);
      method_25315(var0, class_4897.field_24985, class_4897.field_24851);
      method_25319(var0, class_4897.field_24916, class_4783.field_23619);
      method_25335(var0, class_4783.field_23850, class_4897.field_25110);
      method_25316(var0, class_4783.field_23546, class_4783.field_23850);
      method_25314(var0, class_4783.field_23546, class_4897.field_25110);
      method_25336(var0, class_4897.field_24684, class_4783.field_23850);
      method_25315(var0, class_4897.field_24684, class_4897.field_25110);
      method_25319(var0, class_4897.field_24561, class_4783.field_23850);
      method_25335(var0, class_4783.field_23595, class_4897.field_24779);
      method_25316(var0, class_4783.field_23296, class_4783.field_23595);
      method_25314(var0, class_4783.field_23296, class_4897.field_24779);
      method_25336(var0, class_4897.field_24343, class_4783.field_23595);
      method_25315(var0, class_4897.field_24343, class_4897.field_24779);
      method_25319(var0, class_4897.field_24405, class_4783.field_23595);
      method_25335(var0, class_4783.field_23713, class_4897.field_25197);
      method_25316(var0, class_4783.field_23188, class_4783.field_23713);
      method_25314(var0, class_4783.field_23188, class_4897.field_25197);
      method_25336(var0, class_4897.field_24404, class_4783.field_23713);
      method_25315(var0, class_4897.field_24404, class_4897.field_25197);
      method_25319(var0, class_4897.field_25300, class_4783.field_23713);
      method_25316(var0, class_4783.field_23509, class_4783.field_23300);
      method_25336(var0, class_4897.field_24655, class_4783.field_23300);
      method_25319(var0, class_4897.field_24696, class_4783.field_23300);
      method_25335(var0, class_4783.field_23640, class_4897.field_24541);
      method_25316(var0, class_4783.field_23693, class_4783.field_23640);
      method_25314(var0, class_4783.field_23693, class_4897.field_24541);
      method_25336(var0, class_4897.field_25085, class_4783.field_23640);
      method_25315(var0, class_4897.field_25085, class_4897.field_24541);
      method_25319(var0, class_4897.field_24618, class_4783.field_23640);
      method_25326(var0, class_4783.field_23750, class_4897.field_24774);
      method_25327(var0, class_4783.field_23779, class_4783.field_23750);
      method_25330(var0, class_4783.field_23779, class_4897.field_24774);
      method_25326(var0, class_4783.field_23501, class_4897.field_24440);
      method_25327(var0, class_4783.field_23731, class_4783.field_23501);
      method_25330(var0, class_4783.field_23731, class_4897.field_24440);
      method_25326(var0, class_4783.field_23895, class_4897.field_24643);
      method_25327(var0, class_4783.field_23721, class_4783.field_23895);
      method_25330(var0, class_4783.field_23721, class_4897.field_24643);
      method_25326(var0, class_4783.field_23804, class_4897.field_25185);
      method_25327(var0, class_4783.field_23195, class_4783.field_23804);
      method_25330(var0, class_4783.field_23195, class_4897.field_25185);
      method_25326(var0, class_4783.field_23242, class_4897.field_25304);
      method_25327(var0, class_4783.field_23551, class_4783.field_23242);
      method_25330(var0, class_4783.field_23551, class_4897.field_25304);
      method_25326(var0, class_4783.field_23432, class_4897.field_25251);
      method_25327(var0, class_4783.field_23904, class_4783.field_23432);
      method_25330(var0, class_4783.field_23904, class_4897.field_25251);
      method_25326(var0, class_4783.field_23426, class_4897.field_24863);
      method_25327(var0, class_4783.field_23736, class_4783.field_23426);
      method_25330(var0, class_4783.field_23736, class_4897.field_24863);
      method_25326(var0, class_4783.field_23456, class_4897.field_25167);
      method_25327(var0, class_4783.field_23218, class_4783.field_23456);
      method_25330(var0, class_4783.field_23218, class_4897.field_25167);
      method_25326(var0, class_4783.field_23173, class_4897.field_24673);
      method_25327(var0, class_4783.field_23174, class_4783.field_23173);
      method_25330(var0, class_4783.field_23174, class_4897.field_24673);
      method_25326(var0, class_4783.field_23917, class_4897.field_25065);
      method_25327(var0, class_4783.field_23510, class_4783.field_23917);
      method_25330(var0, class_4783.field_23510, class_4897.field_25065);
      method_25326(var0, class_4783.field_23854, class_4897.field_24851);
      method_25327(var0, class_4783.field_23683, class_4783.field_23854);
      method_25330(var0, class_4783.field_23683, class_4897.field_24851);
      method_25326(var0, class_4783.field_23647, class_4897.field_25110);
      method_25327(var0, class_4783.field_23766, class_4783.field_23647);
      method_25330(var0, class_4783.field_23766, class_4897.field_25110);
      method_25326(var0, class_4783.field_23727, class_4897.field_24779);
      method_25327(var0, class_4783.field_23776, class_4783.field_23727);
      method_25330(var0, class_4783.field_23776, class_4897.field_24779);
      method_25326(var0, class_4783.field_23643, class_4897.field_25197);
      method_25327(var0, class_4783.field_23795, class_4783.field_23643);
      method_25330(var0, class_4783.field_23795, class_4897.field_25197);
      method_25326(var0, class_4783.field_23627, class_4897.field_24903);
      method_25327(var0, class_4783.field_23720, class_4783.field_23627);
      method_25330(var0, class_4783.field_23720, class_4897.field_24903);
      method_25326(var0, class_4783.field_23678, class_4897.field_24541);
      method_25327(var0, class_4783.field_23856, class_4783.field_23678);
      method_25330(var0, class_4783.field_23856, class_4897.field_24541);
      method_25311(var0, class_4783.field_23711, class_4897.field_24774);
      method_25311(var0, class_4783.field_23793, class_4897.field_24440);
      method_25311(var0, class_4783.field_23330, class_4897.field_24643);
      method_25311(var0, class_4783.field_23387, class_4897.field_25185);
      method_25311(var0, class_4783.field_23198, class_4897.field_25304);
      method_25311(var0, class_4783.field_23773, class_4897.field_25251);
      method_25311(var0, class_4783.field_23840, class_4897.field_24863);
      method_25311(var0, class_4783.field_23229, class_4897.field_25167);
      method_25311(var0, class_4783.field_23857, class_4897.field_24673);
      method_25311(var0, class_4783.field_23908, class_4897.field_25065);
      method_25311(var0, class_4783.field_23486, class_4897.field_24851);
      method_25311(var0, class_4783.field_23625, class_4897.field_25110);
      method_25311(var0, class_4783.field_23816, class_4897.field_24779);
      method_25311(var0, class_4783.field_23659, class_4897.field_25197);
      method_25311(var0, class_4783.field_23264, class_4897.field_24903);
      method_25311(var0, class_4783.field_23243, class_4897.field_24541);
      method_25320(var0, class_4783.field_23378, class_4897.field_24774);
      method_25320(var0, class_4783.field_23182, class_4897.field_24440);
      method_25320(var0, class_4783.field_23606, class_4897.field_24643);
      method_25320(var0, class_4783.field_23652, class_4897.field_25185);
      method_25320(var0, class_4783.field_23602, class_4897.field_25304);
      method_25320(var0, class_4783.field_23383, class_4897.field_25251);
      method_25320(var0, class_4783.field_23187, class_4897.field_24863);
      method_25320(var0, class_4783.field_23529, class_4897.field_25167);
      method_25320(var0, class_4783.field_23295, class_4897.field_24673);
      method_25320(var0, class_4783.field_23307, class_4897.field_25065);
      method_25320(var0, class_4783.field_23339, class_4897.field_24851);
      method_25320(var0, class_4783.field_23167, class_4897.field_25110);
      method_25320(var0, class_4783.field_23458, class_4897.field_24779);
      method_25320(var0, class_4783.field_23715, class_4897.field_25197);
      method_25320(var0, class_4783.field_23891, class_4897.field_24903);
      method_25320(var0, class_4783.field_23572, class_4897.field_24541);
      class_4951.method_22691(class_4783.field_23285, 6)
         .method_22694('#', class_4783.field_23834)
         .method_22694('S', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XSX")
         .method_22697("X#X")
         .method_22697("XSX")
         .method_22698("has_rail", method_25309(class_4783.field_23540))
         .method_22687(var0);
      class_6272.method_28589(class_4783.field_23271, 2)
         .method_28593(class_4783.field_23440)
         .method_28593(class_4783.field_23808)
         .method_28595("has_stone", method_25309(class_4783.field_23440))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23796)
         .method_22694('I', class_4783.field_23810)
         .method_22694('i', class_4897.field_25021)
         .method_22697("III")
         .method_22697(" i ")
         .method_22697("iii")
         .method_22698("has_iron_block", method_25309(class_4783.field_23810))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24960)
         .method_22694('/', class_4897.field_24413)
         .method_22694('_', class_4783.field_23547)
         .method_22697("///")
         .method_22697(" / ")
         .method_22697("/_/")
         .method_22698("has_stone_slab", method_25309(class_4783.field_23547))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_25024, 4)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24720)
         .method_22694('Y', class_4897.field_24922)
         .method_22697("X")
         .method_22697("#")
         .method_22697("Y")
         .method_22698("has_feather", method_25309(class_4897.field_24922))
         .method_22698("has_flint", method_25309(class_4897.field_24720))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23641, 1)
         .method_22692('P', class_391.field_1605)
         .method_22692('S', class_391.field_1596)
         .method_22697("PSP")
         .method_22697("P P")
         .method_22697("PSP")
         .method_22698("has_planks", method_25308(class_391.field_1605))
         .method_22698("has_wood_slab", method_25308(class_391.field_1596))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23862)
         .method_22694('S', class_4897.field_24381)
         .method_22694('G', class_4783.field_23434)
         .method_22694('O', class_4783.field_23881)
         .method_22697("GGG")
         .method_22697("GSG")
         .method_22697("OOO")
         .method_22698("has_nether_star", method_25309(class_4897.field_24381))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23338)
         .method_22692('P', class_391.field_1605)
         .method_22694('H', class_4897.field_24747)
         .method_22697("PPP")
         .method_22697("HHH")
         .method_22697("PPP")
         .method_22698("has_honeycomb", method_25309(class_4897.field_24747))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24890)
         .method_28593(class_4897.field_24454)
         .method_28594(class_4897.field_24362, 6)
         .method_28595("has_beetroot", method_25309(class_4897.field_24362))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24774)
         .method_28593(class_4897.field_24843)
         .method_28596("black_dye")
         .method_28595("has_ink_sac", method_25309(class_4897.field_24843))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24774)
         .method_28593(class_4783.field_23401)
         .method_28596("black_dye")
         .method_28595("has_black_flower", method_25309(class_4783.field_23401))
         .method_28598(var0, "black_dye_from_wither_rose");
      class_6272.method_28589(class_4897.field_24348, 2)
         .method_28593(class_4897.field_25294)
         .method_28595("has_blaze_rod", method_25309(class_4897.field_25294))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24440)
         .method_28593(class_4897.field_25047)
         .method_28596("blue_dye")
         .method_28595("has_lapis_lazuli", method_25309(class_4897.field_25047))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24440)
         .method_28593(class_4783.field_23892)
         .method_28596("blue_dye")
         .method_28595("has_blue_flower", method_25309(class_4783.field_23892))
         .method_28598(var0, "blue_dye_from_cornflower");
      class_4951.method_22690(class_4783.field_23437)
         .method_22694('#', class_4783.field_23829)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_packed_ice", method_25309(class_4783.field_23829))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23889)
         .method_22694('X', class_4897.field_24640)
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22698("has_bonemeal", method_25309(class_4897.field_24640))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24640, 3)
         .method_28593(class_4897.field_24384)
         .method_28596("bonemeal")
         .method_28595("has_bone", method_25309(class_4897.field_24384))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_24640, 9)
         .method_28593(class_4783.field_23889)
         .method_28596("bonemeal")
         .method_28595("has_bone_block", method_25309(class_4783.field_23889))
         .method_28598(var0, "bone_meal_from_bone_block");
      class_6272.method_28588(class_4897.field_24551)
         .method_28594(class_4897.field_24622, 3)
         .method_28593(class_4897.field_24808)
         .method_28595("has_paper", method_25309(class_4897.field_24622))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23313)
         .method_22692('#', class_391.field_1605)
         .method_22694('X', class_4897.field_24551)
         .method_22697("###")
         .method_22697("XXX")
         .method_22697("###")
         .method_22698("has_book", method_25309(class_4897.field_24551))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25206)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25259)
         .method_22697(" #X")
         .method_22697("# X")
         .method_22697(" #X")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24454, 4)
         .method_22692('#', class_391.field_1605)
         .method_22697("# #")
         .method_22697(" # ")
         .method_22698("has_brown_mushroom", method_25309(class_4783.field_23729))
         .method_22698("has_red_mushroom", method_25309(class_4783.field_23594))
         .method_22698("has_mushroom_stew", method_25309(class_4897.field_24719))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24456)
         .method_22694('#', class_4897.field_24813)
         .method_22697("###")
         .method_22698("has_wheat", method_25309(class_4897.field_24813))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23504)
         .method_22694('B', class_4897.field_25294)
         .method_22692('#', class_391.field_1620)
         .method_22697(" B ")
         .method_22697("###")
         .method_22698("has_blaze_rod", method_25309(class_4897.field_25294))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23422)
         .method_22694('#', class_4897.field_24755)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_brick", method_25309(class_4897.field_24755))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23676, 6)
         .method_22694('#', class_4783.field_23422)
         .method_22697("###")
         .method_22698("has_brick_block", method_25309(class_4783.field_23422))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23613, 4)
         .method_22694('#', class_4783.field_23422)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_brick_block", method_25309(class_4783.field_23422))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24643)
         .method_28593(class_4897.field_24645)
         .method_28596("brown_dye")
         .method_28595("has_cocoa_beans", method_25309(class_4897.field_24645))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_24548)
         .method_22694('#', class_4897.field_25021)
         .method_22697("# #")
         .method_22697(" # ")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23770)
         .method_22694('A', class_4897.field_24579)
         .method_22694('B', class_4897.field_24344)
         .method_22694('C', class_4897.field_24813)
         .method_22694('E', class_4897.field_24962)
         .method_22697("AAA")
         .method_22697("BEB")
         .method_22697("CCC")
         .method_22698("has_egg", method_25309(class_4897.field_24962))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23159)
         .method_22692('L', class_391.field_1638)
         .method_22694('S', class_4897.field_24413)
         .method_22692('C', class_391.field_1642)
         .method_22697(" S ")
         .method_22697("SCS")
         .method_22697("LLL")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22698("has_coal", method_25308(class_391.field_1642))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25186)
         .method_22694('#', class_4897.field_24505)
         .method_22694('X', class_4897.field_25136)
         .method_22697("# ")
         .method_22697(" X")
         .method_22698("has_carrot", method_25309(class_4897.field_25136))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24651)
         .method_22694('#', class_4897.field_24505)
         .method_22694('X', class_4897.field_24963)
         .method_22697("# ")
         .method_22697(" X")
         .method_22698("has_warped_fungus", method_25309(class_4897.field_24963))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23673)
         .method_22694('#', class_4897.field_25021)
         .method_22697("# #")
         .method_22697("# #")
         .method_22697("###")
         .method_22698("has_water_bucket", method_25309(class_4897.field_24999))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23274)
         .method_22692('#', class_391.field_1596)
         .method_22697("# #")
         .method_22697("# #")
         .method_22697("###")
         .method_22698("has_wood_slab", method_25308(class_391.field_1596))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23471)
         .method_22692('#', class_391.field_1605)
         .method_22697("###")
         .method_22697("# #")
         .method_22697("###")
         .method_22698(
            "has_lots_of_items",
            new class_6459(class_8938.field_45798, class_7781.method_35305(10), class_7781.field_39439, class_7781.field_39439, new class_5319[0])
         )
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24906)
         .method_22694('A', class_4783.field_23471)
         .method_22694('B', class_4897.field_24547)
         .method_22697("A")
         .method_22697("B")
         .method_22698("has_minecart", method_25309(class_4897.field_24547))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23457)
         .method_22694('#', class_4783.field_23737)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23614)
         .method_22694('#', class_4783.field_23506)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_chiseled_quartz_block", method_25309(class_4783.field_23614))
         .method_22698("has_quartz_block", method_25309(class_4783.field_23206))
         .method_22698("has_quartz_pillar", method_25309(class_4783.field_23735))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23543)
         .method_22694('#', class_4783.field_23449)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_stone_bricks", method_25308(class_391.field_1610))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23389)
         .method_22694('#', class_4897.field_24789)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_clay_ball", method_25309(class_4897.field_24789))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24565)
         .method_22694('#', class_4897.field_25108)
         .method_22694('X', class_4897.field_24791)
         .method_22697(" # ")
         .method_22697("#X#")
         .method_22697(" # ")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24917, 9)
         .method_28593(class_4783.field_23580)
         .method_28595("has_coal_block", method_25309(class_4783.field_23580))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23580)
         .method_22694('#', class_4897.field_24917)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_coal", method_25309(class_4897.field_24917))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23577, 4)
         .method_22694('D', class_4783.field_23592)
         .method_22694('G', class_4783.field_23709)
         .method_22697("DG")
         .method_22697("GD")
         .method_22698("has_gravel", method_25309(class_4783.field_23709))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23351, 6)
         .method_22694('#', class_4783.field_23808)
         .method_22697("###")
         .method_22698("has_cobblestone", method_25309(class_4783.field_23808))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23406, 6)
         .method_22694('#', class_4783.field_23808)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_cobblestone", method_25309(class_4783.field_23808))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23166)
         .method_22694('#', class_4783.field_23834)
         .method_22694('X', class_4897.field_24874)
         .method_22694('I', class_4783.field_23644)
         .method_22697(" # ")
         .method_22697("#X#")
         .method_22697("III")
         .method_22698("has_quartz", method_25309(class_4897.field_24874))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24830)
         .method_22694('#', class_4897.field_25021)
         .method_22694('X', class_4897.field_24791)
         .method_22697(" # ")
         .method_22697("#X#")
         .method_22697(" # ")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24763, 8)
         .method_22694('#', class_4897.field_24813)
         .method_22694('X', class_4897.field_24645)
         .method_22697("#X#")
         .method_22698("has_cocoa", method_25309(class_4897.field_24645))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23794)
         .method_22692('#', class_391.field_1605)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_planks", method_25308(class_391.field_1605))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25030)
         .method_22694('~', class_4897.field_25259)
         .method_22694('#', class_4897.field_24413)
         .method_22694('&', class_4897.field_25021)
         .method_22694('$', class_4783.field_23812)
         .method_22697("#&#")
         .method_22697("~$~")
         .method_22697(" # ")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22698("has_tripwire_hook", method_25309(class_4783.field_23812))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23853)
         .method_22692('#', class_391.field_1605)
         .method_22694('@', class_4897.field_25259)
         .method_22697("@@")
         .method_22697("##")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23236)
         .method_22694('#', class_4783.field_23911)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_22698("has_chiseled_red_sandstone", method_25309(class_4783.field_23236))
         .method_22698("has_cut_red_sandstone", method_25309(class_4783.field_23610))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23250)
         .method_22694('#', class_4783.field_23575)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_stone_slab", method_25309(class_4783.field_23575))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_25185, 2)
         .method_28593(class_4897.field_24440)
         .method_28593(class_4897.field_25251)
         .method_28595("has_green_dye", method_25309(class_4897.field_25251))
         .method_28595("has_blue_dye", method_25309(class_4897.field_24440))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23441)
         .method_22694('S', class_4897.field_24765)
         .method_22694('I', class_4897.field_24774)
         .method_22697("SSS")
         .method_22697("SIS")
         .method_22697("SSS")
         .method_22698("has_prismarine_shard", method_25309(class_4897.field_24765))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23921, 4)
         .method_22694('#', class_4783.field_23186)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_prismarine", method_25309(class_4783.field_23186))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23341, 4)
         .method_22694('#', class_4783.field_23536)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_prismarine_bricks", method_25309(class_4783.field_23536))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23607, 4)
         .method_22694('#', class_4783.field_23441)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_dark_prismarine", method_25309(class_4783.field_23441))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23220)
         .method_22694('Q', class_4897.field_24874)
         .method_22694('G', class_4783.field_23434)
         .method_22693('W', class_8137.method_37022(class_391.field_1596))
         .method_22697("GGG")
         .method_22697("QQQ")
         .method_22697("WWW")
         .method_22698("has_quartz", method_25309(class_4897.field_24874))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23517, 6)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4783.field_23820)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X X")
         .method_22697("X#X")
         .method_22697("XRX")
         .method_22698("has_rail", method_25309(class_4783.field_23540))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24481, 9)
         .method_28593(class_4783.field_23527)
         .method_28595("has_diamond_block", method_25309(class_4783.field_23527))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_24436)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24481)
         .method_22697("XX")
         .method_22697("X#")
         .method_22697(" #")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23527)
         .method_22694('#', class_4897.field_24481)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24588)
         .method_22694('X', class_4897.field_24481)
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24806)
         .method_22694('X', class_4897.field_24481)
         .method_22697("X X")
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24912)
         .method_22694('X', class_4897.field_24481)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24968)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24481)
         .method_22697("XX")
         .method_22697(" #")
         .method_22697(" #")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25051)
         .method_22694('X', class_4897.field_24481)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25101)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24481)
         .method_22697("XXX")
         .method_22697(" # ")
         .method_22697(" # ")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24902)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24481)
         .method_22697("X")
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24500)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24481)
         .method_22697("X")
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23440, 2)
         .method_22694('Q', class_4897.field_24874)
         .method_22694('C', class_4783.field_23808)
         .method_22697("CQ")
         .method_22697("QC")
         .method_22698("has_quartz", method_25309(class_4897.field_24874))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23304)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4783.field_23808)
         .method_22694('X', class_4897.field_25206)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("#R#")
         .method_22698("has_bow", method_25309(class_4897.field_25206))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23914)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4783.field_23808)
         .method_22697("###")
         .method_22697("# #")
         .method_22697("#R#")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24997, 9)
         .method_28593(class_4783.field_23897)
         .method_28595("has_emerald_block", method_25309(class_4783.field_23897))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23897)
         .method_22694('#', class_4897.field_24997)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_emerald", method_25309(class_4897.field_24997))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23815)
         .method_22694('B', class_4897.field_24551)
         .method_22694('#', class_4783.field_23881)
         .method_22694('D', class_4897.field_24481)
         .method_22697(" B ")
         .method_22697("D#D")
         .method_22697("###")
         .method_22698("has_obsidian", method_25309(class_4783.field_23881))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23492)
         .method_22694('#', class_4783.field_23881)
         .method_22694('E', class_4897.field_24519)
         .method_22697("###")
         .method_22697("#E#")
         .method_22697("###")
         .method_22698("has_ender_eye", method_25309(class_4897.field_24519))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24519)
         .method_28593(class_4897.field_24664)
         .method_28593(class_4897.field_24348)
         .method_28595("has_blaze_powder", method_25309(class_4897.field_24348))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23370, 4)
         .method_22694('#', class_4783.field_23894)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_end_stone", method_25309(class_4783.field_23894))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24665)
         .method_22694('T', class_4897.field_24831)
         .method_22694('E', class_4897.field_24519)
         .method_22694('G', class_4783.field_23434)
         .method_22697("GGG")
         .method_22697("GEG")
         .method_22697("GTG")
         .method_22698("has_ender_eye", method_25309(class_4897.field_24519))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23654, 4)
         .method_22694('#', class_4897.field_25140)
         .method_22694('/', class_4897.field_25294)
         .method_22697("/")
         .method_22697("#")
         .method_22698("has_chorus_fruit_popped", method_25309(class_4897.field_25140))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_25130)
         .method_28593(class_4897.field_24764)
         .method_28593(class_4783.field_23729)
         .method_28593(class_4897.field_24344)
         .method_28595("has_spider_eye", method_25309(class_4897.field_24764))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_24352, 3)
         .method_28593(class_4897.field_24581)
         .method_28593(class_4897.field_24348)
         .method_28591(class_8137.method_37019(class_4897.field_24917, class_4897.field_24862))
         .method_28595("has_blaze_powder", method_25309(class_4897.field_24348))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_24505)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25259)
         .method_22697("  #")
         .method_22697(" #X")
         .method_22697("# X")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_25188)
         .method_28593(class_4897.field_25021)
         .method_28593(class_4897.field_24720)
         .method_28595("has_flint", method_25309(class_4897.field_24720))
         .method_28595("has_obsidian", method_25309(class_4783.field_23881))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23660)
         .method_22694('#', class_4897.field_24755)
         .method_22697("# #")
         .method_22697(" # ")
         .method_22698("has_brick", method_25309(class_4897.field_24755))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23883)
         .method_22692('#', class_391.field_1620)
         .method_22697("###")
         .method_22697("# #")
         .method_22697("###")
         .method_22698("has_cobblestone", method_25308(class_391.field_1620))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24550)
         .method_22694('A', class_4783.field_23883)
         .method_22694('B', class_4897.field_24547)
         .method_22697("A")
         .method_22697("B")
         .method_22698("has_minecart", method_25309(class_4897.field_24547))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24812, 3)
         .method_22694('#', class_4783.field_23434)
         .method_22697("# #")
         .method_22697(" # ")
         .method_22698("has_glass", method_25309(class_4783.field_23434))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23786, 16)
         .method_22694('#', class_4783.field_23434)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_glass", method_25309(class_4783.field_23434))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23368)
         .method_22694('#', class_4897.field_24777)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_glowstone_dust", method_25309(class_4897.field_24777))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25037)
         .method_22694('#', class_4897.field_25108)
         .method_22694('X', class_4897.field_24753)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24373)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("XX")
         .method_22697("X#")
         .method_22697(" #")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25132)
         .method_22694('X', class_4897.field_25108)
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25070)
         .method_22694('#', class_4897.field_24659)
         .method_22694('X', class_4897.field_25136)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_gold_nugget", method_25309(class_4897.field_24659))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24849)
         .method_22694('X', class_4897.field_25108)
         .method_22697("X X")
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24338)
         .method_22694('X', class_4897.field_25108)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25214)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("XX")
         .method_22697(" #")
         .method_22697(" #")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25088)
         .method_22694('X', class_4897.field_25108)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25182)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("XXX")
         .method_22697(" # ")
         .method_22697(" # ")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23385, 6)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("X X")
         .method_22697("X#X")
         .method_22697("XRX")
         .method_22698("has_rail", method_25309(class_4783.field_23540))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25019)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("X")
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25057)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25108)
         .method_22697("X")
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23692)
         .method_22694('#', class_4897.field_25108)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_25108, 9)
         .method_28593(class_4783.field_23692)
         .method_28596("gold_ingot")
         .method_28595("has_gold_block", method_25309(class_4783.field_23692))
         .method_28598(var0, "gold_ingot_from_gold_block");
      class_4951.method_22690(class_4897.field_25108)
         .method_22694('#', class_4897.field_24659)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22695("gold_ingot")
         .method_22698("has_gold_nugget", method_25309(class_4897.field_24659))
         .method_22688(var0, "gold_ingot_from_nuggets");
      class_6272.method_28589(class_4897.field_24659, 9)
         .method_28593(class_4897.field_25108)
         .method_28595("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_28597(var0);
      class_6272.method_28588(class_4783.field_23695)
         .method_28593(class_4783.field_23440)
         .method_28593(class_4897.field_24874)
         .method_28595("has_quartz", method_25309(class_4897.field_24874))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_25304, 2)
         .method_28593(class_4897.field_24774)
         .method_28593(class_4897.field_24903)
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28595("has_black_dye", method_25309(class_4897.field_24774))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23429)
         .method_22694('#', class_4897.field_24813)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_wheat", method_25309(class_4897.field_24813))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23347)
         .method_22694('#', class_4897.field_25021)
         .method_22697("##")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24773, 4)
         .method_28593(class_4897.field_25291)
         .method_28594(class_4897.field_24812, 4)
         .method_28595("has_honey_block", method_25309(class_4783.field_23899))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23899, 1)
         .method_22694('S', class_4897.field_24773)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_honey_bottle", method_25309(class_4897.field_24773))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23574)
         .method_22694('H', class_4897.field_24747)
         .method_22697("HH")
         .method_22697("HH")
         .method_22698("has_honeycomb", method_25309(class_4897.field_24747))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23698)
         .method_22694('C', class_4783.field_23471)
         .method_22694('I', class_4897.field_25021)
         .method_22697("I I")
         .method_22697("ICI")
         .method_22697(" I ")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24473)
         .method_22694('A', class_4783.field_23698)
         .method_22694('B', class_4897.field_24547)
         .method_22697("A")
         .method_22697("B")
         .method_22698("has_minecart", method_25309(class_4897.field_24547))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24420)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XX")
         .method_22697("X#")
         .method_22697(" #")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23817, 16)
         .method_22694('#', class_4897.field_25021)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23810)
         .method_22694('#', class_4897.field_25021)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24576)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24708)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X X")
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23847, 3)
         .method_22694('#', class_4897.field_25021)
         .method_22697("##")
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24701)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24609)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XX")
         .method_22697(" #")
         .method_22697(" #")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_25021, 9)
         .method_28593(class_4783.field_23810)
         .method_28596("iron_ingot")
         .method_28595("has_iron_block", method_25309(class_4783.field_23810))
         .method_28598(var0, "iron_ingot_from_iron_block");
      class_4951.method_22690(class_4897.field_25021)
         .method_22694('#', class_4897.field_24426)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22695("iron_ingot")
         .method_22698("has_iron_nugget", method_25309(class_4897.field_24426))
         .method_22688(var0, "iron_ingot_from_nuggets");
      class_4951.method_22690(class_4897.field_25042)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24426, 9)
         .method_28593(class_4897.field_25021)
         .method_28595("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_25011)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("XXX")
         .method_22697(" # ")
         .method_22697(" # ")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24346)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X")
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25277)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X")
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23763)
         .method_22694('#', class_4897.field_25021)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24463)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24808)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23312)
         .method_22692('#', class_391.field_1605)
         .method_22694('X', class_4897.field_24481)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_diamond", method_25309(class_4897.field_24481))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23748, 3)
         .method_22694('#', class_4897.field_24413)
         .method_22697("# #")
         .method_22697("###")
         .method_22697("# #")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23803)
         .method_22694('#', class_4897.field_25047)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_lapis", method_25309(class_4897.field_25047))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_25047, 9)
         .method_28593(class_4783.field_23803)
         .method_28595("has_lapis_block", method_25309(class_4783.field_23803))
         .method_28597(var0);
      class_4951.method_22691(class_4897.field_25274, 2)
         .method_22694('~', class_4897.field_25259)
         .method_22694('O', class_4897.field_24592)
         .method_22697("~~ ")
         .method_22697("~O ")
         .method_22697("  ~")
         .method_22698("has_slime_ball", method_25309(class_4897.field_24592))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24808)
         .method_22694('#', class_4897.field_25004)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_rabbit_hide", method_25309(class_4897.field_25004))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24683)
         .method_22694('X', class_4897.field_24808)
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24671)
         .method_22694('X', class_4897.field_24808)
         .method_22697("X X")
         .method_22697("XXX")
         .method_22697("XXX")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24600)
         .method_22694('X', class_4897.field_24808)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24878)
         .method_22694('X', class_4897.field_24808)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22697("X X")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25035)
         .method_22694('X', class_4897.field_24808)
         .method_22697("X X")
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_leather", method_25309(class_4897.field_24808))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23566)
         .method_22692('S', class_391.field_1596)
         .method_22694('B', class_4783.field_23313)
         .method_22697("SSS")
         .method_22697(" B ")
         .method_22697(" S ")
         .method_22698("has_book", method_25309(class_4897.field_24551))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23806)
         .method_22694('#', class_4783.field_23808)
         .method_22694('X', class_4897.field_24413)
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_cobblestone", method_25309(class_4783.field_23808))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24863)
         .method_28593(class_4783.field_23379)
         .method_28596("light_blue_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23379))
         .method_28598(var0, "light_blue_dye_from_blue_orchid");
      class_6272.method_28589(class_4897.field_24863, 2)
         .method_28593(class_4897.field_24440)
         .method_28593(class_4897.field_24903)
         .method_28596("light_blue_dye")
         .method_28595("has_blue_dye", method_25309(class_4897.field_24440))
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28598(var0, "light_blue_dye_from_blue_white_dye");
      class_6272.method_28588(class_4897.field_25167)
         .method_28593(class_4783.field_23797)
         .method_28596("light_gray_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23797))
         .method_28598(var0, "light_gray_dye_from_azure_bluet");
      class_6272.method_28589(class_4897.field_25167, 2)
         .method_28593(class_4897.field_25304)
         .method_28593(class_4897.field_24903)
         .method_28596("light_gray_dye")
         .method_28595("has_gray_dye", method_25309(class_4897.field_25304))
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28598(var0, "light_gray_dye_from_gray_white_dye");
      class_6272.method_28589(class_4897.field_25167, 3)
         .method_28593(class_4897.field_24774)
         .method_28594(class_4897.field_24903, 2)
         .method_28596("light_gray_dye")
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28595("has_black_dye", method_25309(class_4897.field_24774))
         .method_28598(var0, "light_gray_dye_from_black_white_dye");
      class_6272.method_28588(class_4897.field_25167)
         .method_28593(class_4783.field_23282)
         .method_28596("light_gray_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23282))
         .method_28598(var0, "light_gray_dye_from_oxeye_daisy");
      class_6272.method_28588(class_4897.field_25167)
         .method_28593(class_4783.field_23528)
         .method_28596("light_gray_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23528))
         .method_28598(var0, "light_gray_dye_from_white_tulip");
      class_4951.method_22690(class_4783.field_23919)
         .method_22694('#', class_4897.field_25108)
         .method_22697("##")
         .method_22698("has_gold_ingot", method_25309(class_4897.field_25108))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24673, 2)
         .method_28593(class_4897.field_25251)
         .method_28593(class_4897.field_24903)
         .method_28595("has_green_dye", method_25309(class_4897.field_25251))
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23855)
         .method_22694('A', class_4783.field_23281)
         .method_22694('B', class_4783.field_23521)
         .method_22697("A")
         .method_22697("B")
         .method_22698("has_carved_pumpkin", method_25309(class_4783.field_23281))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_25065)
         .method_28593(class_4783.field_23275)
         .method_28596("magenta_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23275))
         .method_28598(var0, "magenta_dye_from_allium");
      class_6272.method_28589(class_4897.field_25065, 4)
         .method_28593(class_4897.field_24440)
         .method_28594(class_4897.field_25197, 2)
         .method_28593(class_4897.field_24903)
         .method_28596("magenta_dye")
         .method_28595("has_blue_dye", method_25309(class_4897.field_24440))
         .method_28595("has_rose_red", method_25309(class_4897.field_25197))
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28598(var0, "magenta_dye_from_blue_red_white_dye");
      class_6272.method_28589(class_4897.field_25065, 3)
         .method_28593(class_4897.field_24440)
         .method_28593(class_4897.field_25197)
         .method_28593(class_4897.field_25110)
         .method_28596("magenta_dye")
         .method_28595("has_pink_dye", method_25309(class_4897.field_25110))
         .method_28595("has_blue_dye", method_25309(class_4897.field_24440))
         .method_28595("has_red_dye", method_25309(class_4897.field_25197))
         .method_28598(var0, "magenta_dye_from_blue_red_pink");
      class_6272.method_28589(class_4897.field_25065, 2)
         .method_28593(class_4783.field_23690)
         .method_28596("magenta_dye")
         .method_28595("has_double_plant", method_25309(class_4783.field_23690))
         .method_28598(var0, "magenta_dye_from_lilac");
      class_6272.method_28589(class_4897.field_25065, 2)
         .method_28593(class_4897.field_24779)
         .method_28593(class_4897.field_25110)
         .method_28596("magenta_dye")
         .method_28595("has_pink_dye", method_25309(class_4897.field_25110))
         .method_28595("has_purple_dye", method_25309(class_4897.field_24779))
         .method_28598(var0, "magenta_dye_from_purple_and_pink");
      class_4951.method_22690(class_4783.field_23215)
         .method_22694('#', class_4897.field_24675)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_magma_cream", method_25309(class_4897.field_24675))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24675)
         .method_28593(class_4897.field_24348)
         .method_28593(class_4897.field_24592)
         .method_28595("has_blaze_powder", method_25309(class_4897.field_24348))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_25113)
         .method_22694('#', class_4897.field_24622)
         .method_22694('X', class_4897.field_24830)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_compass", method_25309(class_4897.field_24830))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23261)
         .method_22694('M', class_4897.field_24341)
         .method_22697("MMM")
         .method_22697("MMM")
         .method_22697("MMM")
         .method_22698("has_melon", method_25309(class_4897.field_24341))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24435)
         .method_28593(class_4897.field_24341)
         .method_28595("has_melon", method_25309(class_4897.field_24341))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_24547)
         .method_22694('#', class_4897.field_25021)
         .method_22697("# #")
         .method_22697("###")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23774)
         .method_28593(class_4783.field_23808)
         .method_28593(class_4783.field_23323)
         .method_28595("has_vine", method_25309(class_4783.field_23323))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23755, 6)
         .method_22694('#', class_4783.field_23774)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23657)
         .method_28593(class_4783.field_23355)
         .method_28593(class_4783.field_23323)
         .method_28595("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24719)
         .method_28593(class_4783.field_23729)
         .method_28593(class_4783.field_23594)
         .method_28593(class_4897.field_24454)
         .method_28595("has_mushroom_stew", method_25309(class_4897.field_24719))
         .method_28595("has_bowl", method_25309(class_4897.field_24454))
         .method_28595("has_brown_mushroom", method_25309(class_4783.field_23729))
         .method_28595("has_red_mushroom", method_25309(class_4783.field_23594))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23484)
         .method_22694('N', class_4897.field_24445)
         .method_22697("NN")
         .method_22697("NN")
         .method_22698("has_netherbrick", method_25309(class_4897.field_24445))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23587, 6)
         .method_22694('#', class_4783.field_23484)
         .method_22694('-', class_4897.field_24445)
         .method_22697("#-#")
         .method_22697("#-#")
         .method_22698("has_nether_brick", method_25309(class_4783.field_23484))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23737, 6)
         .method_22694('#', class_4783.field_23484)
         .method_22697("###")
         .method_22698("has_nether_brick", method_25309(class_4783.field_23484))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23204, 4)
         .method_22694('#', class_4783.field_23484)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_nether_brick", method_25309(class_4783.field_23484))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23273)
         .method_22694('#', class_4897.field_24573)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_nether_wart", method_25309(class_4897.field_24573))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23472)
         .method_22692('#', class_391.field_1605)
         .method_22694('X', class_4897.field_24791)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23367)
         .method_22694('Q', class_4897.field_24874)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4783.field_23808)
         .method_22697("###")
         .method_22697("RRQ")
         .method_22697("###")
         .method_22698("has_quartz", method_25309(class_4897.field_24874))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24851)
         .method_28593(class_4783.field_23260)
         .method_28596("orange_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23260))
         .method_28598(var0, "orange_dye_from_orange_tulip");
      class_6272.method_28589(class_4897.field_24851, 2)
         .method_28593(class_4897.field_25197)
         .method_28593(class_4897.field_24541)
         .method_28596("orange_dye")
         .method_28595("has_red_dye", method_25309(class_4897.field_25197))
         .method_28595("has_yellow_dye", method_25309(class_4897.field_24541))
         .method_28598(var0, "orange_dye_from_red_yellow");
      class_4951.method_22690(class_4897.field_24370)
         .method_22694('#', class_4897.field_24413)
         .method_22693('X', class_8137.method_37022(class_391.field_1597))
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_wool", method_25308(class_391.field_1597))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24622, 3)
         .method_22694('#', class_4783.field_23337)
         .method_22697("###")
         .method_22698("has_reeds", method_25309(class_4783.field_23337))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23735, 2)
         .method_22694('#', class_4783.field_23206)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_chiseled_quartz_block", method_25309(class_4783.field_23614))
         .method_22698("has_quartz_block", method_25309(class_4783.field_23206))
         .method_22698("has_quartz_pillar", method_25309(class_4783.field_23735))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23829)
         .method_28594(class_4783.field_23496, 9)
         .method_28595("has_ice", method_25309(class_4783.field_23496))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_25110, 2)
         .method_28593(class_4783.field_23213)
         .method_28596("pink_dye")
         .method_28595("has_double_plant", method_25309(class_4783.field_23213))
         .method_28598(var0, "pink_dye_from_peony");
      class_6272.method_28588(class_4897.field_25110)
         .method_28593(class_4783.field_23390)
         .method_28596("pink_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23390))
         .method_28598(var0, "pink_dye_from_pink_tulip");
      class_6272.method_28589(class_4897.field_25110, 2)
         .method_28593(class_4897.field_25197)
         .method_28593(class_4897.field_24903)
         .method_28596("pink_dye")
         .method_28595("has_white_dye", method_25309(class_4897.field_24903))
         .method_28595("has_red_dye", method_25309(class_4897.field_25197))
         .method_28598(var0, "pink_dye_from_red_white_dye");
      class_4951.method_22690(class_4783.field_23649)
         .method_22694('R', class_4897.field_24791)
         .method_22694('#', class_4783.field_23808)
         .method_22692('T', class_391.field_1605)
         .method_22694('X', class_4897.field_25021)
         .method_22697("TTT")
         .method_22697("#X#")
         .method_22697("#R#")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23642, 4)
         .method_22694('S', class_4783.field_23788)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_basalt", method_25309(class_4783.field_23788))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23716, 4)
         .method_22694('S', class_4783.field_23695)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_stone", method_25309(class_4783.field_23695))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23514, 4)
         .method_22694('S', class_4783.field_23440)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_stone", method_25309(class_4783.field_23440))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23582, 4)
         .method_22694('S', class_4783.field_23271)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_stone", method_25309(class_4783.field_23271))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23186)
         .method_22694('S', class_4897.field_24765)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_prismarine_shard", method_25309(class_4897.field_24765))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23536)
         .method_22694('S', class_4897.field_24765)
         .method_22697("SSS")
         .method_22697("SSS")
         .method_22697("SSS")
         .method_22698("has_prismarine_shard", method_25309(class_4897.field_24765))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23398, 6)
         .method_22694('#', class_4783.field_23186)
         .method_22697("###")
         .method_22698("has_prismarine", method_25309(class_4783.field_23186))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23194, 6)
         .method_22694('#', class_4783.field_23536)
         .method_22697("###")
         .method_22698("has_prismarine_bricks", method_25309(class_4783.field_23536))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23687, 6)
         .method_22694('#', class_4783.field_23441)
         .method_22697("###")
         .method_22698("has_dark_prismarine", method_25309(class_4783.field_23441))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_25148)
         .method_28593(class_4783.field_23871)
         .method_28593(class_4897.field_24344)
         .method_28593(class_4897.field_24962)
         .method_28595("has_carved_pumpkin", method_25309(class_4783.field_23281))
         .method_28595("has_pumpkin", method_25309(class_4783.field_23871))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_24480, 4)
         .method_28593(class_4783.field_23871)
         .method_28595("has_pumpkin", method_25309(class_4783.field_23871))
         .method_28597(var0);
      class_6272.method_28589(class_4897.field_24779, 2)
         .method_28593(class_4897.field_24440)
         .method_28593(class_4897.field_25197)
         .method_28595("has_blue_dye", method_25309(class_4897.field_24440))
         .method_28595("has_red_dye", method_25309(class_4897.field_25197))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23761)
         .method_22694('#', class_4783.field_23471)
         .method_22694('-', class_4897.field_24877)
         .method_22697("-")
         .method_22697("#")
         .method_22697("-")
         .method_22698("has_shulker_shell", method_25309(class_4897.field_24877))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23403, 4)
         .method_22694('F', class_4897.field_25140)
         .method_22697("FF")
         .method_22697("FF")
         .method_22698("has_chorus_fruit_popped", method_25309(class_4897.field_25140))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23724)
         .method_22694('#', class_4783.field_23828)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_purpur_block", method_25309(class_4783.field_23403))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23828, 6)
         .method_22693('#', class_8137.method_37019(class_4783.field_23403, class_4783.field_23724))
         .method_22697("###")
         .method_22698("has_purpur_block", method_25309(class_4783.field_23403))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23183, 4)
         .method_22693('#', class_8137.method_37019(class_4783.field_23403, class_4783.field_23724))
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_purpur_block", method_25309(class_4783.field_23403))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23206)
         .method_22694('#', class_4897.field_24874)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_quartz", method_25309(class_4897.field_24874))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23578, 4)
         .method_22694('#', class_4783.field_23206)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_quartz_block", method_25309(class_4783.field_23206))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23506, 6)
         .method_22693('#', class_8137.method_37019(class_4783.field_23614, class_4783.field_23206, class_4783.field_23735))
         .method_22697("###")
         .method_22698("has_chiseled_quartz_block", method_25309(class_4783.field_23614))
         .method_22698("has_quartz_block", method_25309(class_4783.field_23206))
         .method_22698("has_quartz_pillar", method_25309(class_4783.field_23735))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23343, 4)
         .method_22693('#', class_8137.method_37019(class_4783.field_23614, class_4783.field_23206, class_4783.field_23735))
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_chiseled_quartz_block", method_25309(class_4783.field_23614))
         .method_22698("has_quartz_block", method_25309(class_4783.field_23206))
         .method_22698("has_quartz_pillar", method_25309(class_4783.field_23735))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24907)
         .method_28593(class_4897.field_24397)
         .method_28593(class_4897.field_25117)
         .method_28593(class_4897.field_24454)
         .method_28593(class_4897.field_25136)
         .method_28593(class_4783.field_23729)
         .method_28596("rabbit_stew")
         .method_28595("has_cooked_rabbit", method_25309(class_4897.field_25117))
         .method_28598(var0, "rabbit_stew_from_brown_mushroom");
      class_6272.method_28588(class_4897.field_24907)
         .method_28593(class_4897.field_24397)
         .method_28593(class_4897.field_25117)
         .method_28593(class_4897.field_24454)
         .method_28593(class_4897.field_25136)
         .method_28593(class_4783.field_23594)
         .method_28596("rabbit_stew")
         .method_28595("has_cooked_rabbit", method_25309(class_4897.field_25117))
         .method_28598(var0, "rabbit_stew_from_red_mushroom");
      class_4951.method_22691(class_4783.field_23540, 16)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_25021)
         .method_22697("X X")
         .method_22697("X#X")
         .method_22697("X X")
         .method_22698("has_minecart", method_25309(class_4897.field_24547))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24791, 9)
         .method_28593(class_4783.field_23658)
         .method_28595("has_redstone_block", method_25309(class_4783.field_23658))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23658)
         .method_22694('#', class_4897.field_24791)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23541)
         .method_22694('R', class_4897.field_24791)
         .method_22694('G', class_4783.field_23368)
         .method_22697(" R ")
         .method_22697("RGR")
         .method_22697(" R ")
         .method_22698("has_glowstone", method_25309(class_4783.field_23368))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23834)
         .method_22694('#', class_4897.field_24413)
         .method_22694('X', class_4897.field_24791)
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_25197)
         .method_28593(class_4897.field_24362)
         .method_28596("red_dye")
         .method_28595("has_beetroot", method_25309(class_4897.field_24362))
         .method_28598(var0, "red_dye_from_beetroot");
      class_6272.method_28588(class_4897.field_25197)
         .method_28593(class_4783.field_23762)
         .method_28596("red_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23762))
         .method_28598(var0, "red_dye_from_poppy");
      class_6272.method_28589(class_4897.field_25197, 2)
         .method_28593(class_4783.field_23738)
         .method_28596("red_dye")
         .method_28595("has_double_plant", method_25309(class_4783.field_23738))
         .method_28598(var0, "red_dye_from_rose_bush");
      class_6272.method_28588(class_4897.field_25197)
         .method_28593(class_4783.field_23181)
         .method_28596("red_dye")
         .method_28595("has_red_flower", method_25309(class_4783.field_23181))
         .method_28598(var0, "red_dye_from_tulip");
      class_4951.method_22690(class_4783.field_23419)
         .method_22694('W', class_4897.field_24573)
         .method_22694('N', class_4897.field_24445)
         .method_22697("NW")
         .method_22697("WN")
         .method_22698("has_nether_wart", method_25309(class_4897.field_24573))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23160)
         .method_22694('#', class_4783.field_23814)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_sand", method_25309(class_4783.field_23814))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23911, 6)
         .method_22693('#', class_8137.method_37019(class_4783.field_23160, class_4783.field_23236))
         .method_22697("###")
         .method_22698("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_22698("has_chiseled_red_sandstone", method_25309(class_4783.field_23236))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23888, 6)
         .method_22694('#', class_4783.field_23610)
         .method_22697("###")
         .method_22698("has_cut_red_sandstone", method_25309(class_4783.field_23610))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23455, 4)
         .method_22693('#', class_8137.method_37019(class_4783.field_23160, class_4783.field_23236, class_4783.field_23610))
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_22698("has_chiseled_red_sandstone", method_25309(class_4783.field_23236))
         .method_22698("has_cut_red_sandstone", method_25309(class_4783.field_23610))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23350)
         .method_22694('#', class_4783.field_23834)
         .method_22694('X', class_4897.field_24791)
         .method_22694('I', class_4783.field_23644)
         .method_22697("#X#")
         .method_22697("III")
         .method_22698("has_redstone_torch", method_25309(class_4783.field_23834))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23459)
         .method_22694('#', class_4783.field_23216)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_sand", method_25309(class_4783.field_23216))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23575, 6)
         .method_22693('#', class_8137.method_37019(class_4783.field_23459, class_4783.field_23250))
         .method_22697("###")
         .method_22698("has_sandstone", method_25309(class_4783.field_23459))
         .method_22698("has_chiseled_sandstone", method_25309(class_4783.field_23250))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23532, 6)
         .method_22694('#', class_4783.field_23863)
         .method_22697("###")
         .method_22698("has_cut_sandstone", method_25309(class_4783.field_23863))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23859, 4)
         .method_22693('#', class_8137.method_37019(class_4783.field_23459, class_4783.field_23250, class_4783.field_23863))
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_sandstone", method_25309(class_4783.field_23459))
         .method_22698("has_chiseled_sandstone", method_25309(class_4783.field_23250))
         .method_22698("has_cut_sandstone", method_25309(class_4783.field_23863))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23329)
         .method_22694('S', class_4897.field_24765)
         .method_22694('C', class_4897.field_24810)
         .method_22697("SCS")
         .method_22697("CCC")
         .method_22697("SCS")
         .method_22698("has_prismarine_crystals", method_25309(class_4897.field_24810))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24853)
         .method_22694('#', class_4897.field_25021)
         .method_22697(" #")
         .method_22697("# ")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24840)
         .method_22692('W', class_391.field_1605)
         .method_22694('o', class_4897.field_25021)
         .method_22697("WoW")
         .method_22697("WWW")
         .method_22697(" W ")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23498)
         .method_22694('#', class_4897.field_24592)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_slime_ball", method_25309(class_4897.field_24592))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24592, 9)
         .method_28593(class_4783.field_23498)
         .method_28595("has_slime", method_25309(class_4783.field_23498))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23610, 4)
         .method_22694('#', class_4783.field_23160)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23863, 4)
         .method_22694('#', class_4783.field_23459)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_sandstone", method_25309(class_4783.field_23459))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23813)
         .method_22694('#', class_4897.field_24601)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_snowball", method_25309(class_4897.field_24601))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23552, 6)
         .method_22694('#', class_4783.field_23813)
         .method_22697("###")
         .method_22698("has_snowball", method_25309(class_4897.field_24601))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23511)
         .method_22692('L', class_391.field_1638)
         .method_22694('S', class_4897.field_24413)
         .method_22692('#', class_391.field_1602)
         .method_22697(" S ")
         .method_22697("S#S")
         .method_22697("LLL")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22698("has_soul_sand", method_25308(class_391.field_1602))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24459)
         .method_22694('#', class_4897.field_24659)
         .method_22694('X', class_4897.field_24341)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_melon", method_25309(class_4897.field_24341))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_25049, 2)
         .method_22694('#', class_4897.field_24777)
         .method_22694('X', class_4897.field_25024)
         .method_22697(" # ")
         .method_22697("#X#")
         .method_22697(" # ")
         .method_22698("has_glowstone_dust", method_25309(class_4897.field_24777))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24413, 4)
         .method_22692('#', class_391.field_1605)
         .method_22697("#")
         .method_22697("#")
         .method_22695("sticks")
         .method_22698("has_planks", method_25308(class_391.field_1605))
         .method_22687(var0);
      class_4951.method_22691(class_4897.field_24413, 1)
         .method_22694('#', class_4783.field_23886)
         .method_22697("#")
         .method_22697("#")
         .method_22695("sticks")
         .method_22698("has_bamboo", method_25309(class_4783.field_23886))
         .method_22688(var0, "stick_from_bamboo_item");
      class_4951.method_22690(class_4783.field_23861)
         .method_22694('P', class_4783.field_23649)
         .method_22694('S', class_4897.field_24592)
         .method_22697("S")
         .method_22697("P")
         .method_22698("has_slime_ball", method_25309(class_4897.field_24592))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23355, 4)
         .method_22694('#', class_4783.field_23644)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_stone", method_25309(class_4783.field_23644))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24571)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1623)
         .method_22697("XX")
         .method_22697("X#")
         .method_22697(" #")
         .method_22698("has_cobblestone", method_25308(class_391.field_1623))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23449, 6)
         .method_22694('#', class_4783.field_23355)
         .method_22697("###")
         .method_22698("has_stone_bricks", method_25308(class_391.field_1610))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23712, 4)
         .method_22694('#', class_4783.field_23355)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_stone_bricks", method_25308(class_391.field_1610))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23448)
         .method_28593(class_4783.field_23644)
         .method_28595("has_stone", method_25309(class_4783.field_23644))
         .method_28597(var0);
      class_4951.method_22690(class_4897.field_24711)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1623)
         .method_22697("XX")
         .method_22697(" #")
         .method_22697(" #")
         .method_22698("has_cobblestone", method_25308(class_391.field_1623))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25119)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1623)
         .method_22697("XXX")
         .method_22697(" # ")
         .method_22697(" # ")
         .method_22698("has_cobblestone", method_25308(class_391.field_1623))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23820)
         .method_22694('#', class_4783.field_23644)
         .method_22697("##")
         .method_22698("has_stone", method_25309(class_4783.field_23644))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24689)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1623)
         .method_22697("X")
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_cobblestone", method_25308(class_391.field_1623))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23326, 6)
         .method_22694('#', class_4783.field_23644)
         .method_22697("###")
         .method_22698("has_stone", method_25309(class_4783.field_23644))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23547, 6)
         .method_22694('#', class_4783.field_23468)
         .method_22697("###")
         .method_22698("has_smooth_stone", method_25309(class_4783.field_23468))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23364, 4)
         .method_22694('#', class_4783.field_23808)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_cobblestone", method_25309(class_4783.field_23808))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25247)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1623)
         .method_22697("X")
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_cobblestone", method_25308(class_391.field_1623))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23300)
         .method_22694('#', class_4897.field_25259)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22688(var0, "white_wool_from_string");
      class_6272.method_28588(class_4897.field_24344)
         .method_28593(class_4783.field_23337)
         .method_28596("sugar")
         .method_28595("has_reeds", method_25309(class_4783.field_23337))
         .method_28598(var0, "sugar_from_sugar_cane");
      class_6272.method_28589(class_4897.field_24344, 3)
         .method_28593(class_4897.field_24773)
         .method_28596("sugar")
         .method_28595("has_honey_bottle", method_25309(class_4897.field_24773))
         .method_28598(var0, "sugar_from_honey_bottle");
      class_4951.method_22690(class_4783.field_23302)
         .method_22694('H', class_4897.field_24742)
         .method_22694('R', class_4897.field_24791)
         .method_22697(" R ")
         .method_22697("RHR")
         .method_22697(" R ")
         .method_22698("has_redstone", method_25309(class_4897.field_24791))
         .method_22698("has_hay_block", method_25309(class_4783.field_23429))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23252)
         .method_22693('#', class_8137.method_37019(class_4783.field_23216, class_4783.field_23814))
         .method_22694('X', class_4897.field_24581)
         .method_22697("X#X")
         .method_22697("#X#")
         .method_22697("X#X")
         .method_22698("has_gunpowder", method_25309(class_4897.field_24581))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24375)
         .method_22694('A', class_4783.field_23252)
         .method_22694('B', class_4897.field_24547)
         .method_22697("A")
         .method_22697("B")
         .method_22698("has_minecart", method_25309(class_4897.field_24547))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23521, 4)
         .method_22694('#', class_4897.field_24413)
         .method_22693('X', class_8137.method_37019(class_4897.field_24917, class_4897.field_24862))
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_stone_pickaxe", method_25309(class_4897.field_25119))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23749, 4)
         .method_22693('X', class_8137.method_37019(class_4897.field_24917, class_4897.field_24862))
         .method_22694('#', class_4897.field_24413)
         .method_22692('S', class_391.field_1602)
         .method_22697("X")
         .method_22697("#")
         .method_22697("S")
         .method_22698("has_soul_sand", method_25308(class_391.field_1602))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23754)
         .method_22694('#', class_4897.field_24839)
         .method_22694('X', class_4897.field_24426)
         .method_22697("XXX")
         .method_22697("X#X")
         .method_22697("XXX")
         .method_22698("has_iron_nugget", method_25309(class_4897.field_24426))
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23538)
         .method_22694('#', class_4897.field_24824)
         .method_22694('X', class_4897.field_24426)
         .method_22697("XXX")
         .method_22697("X#X")
         .method_22697("XXX")
         .method_22698("has_soul_torch", method_25309(class_4897.field_24824))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23739)
         .method_28593(class_4783.field_23471)
         .method_28593(class_4783.field_23812)
         .method_28595("has_tripwire_hook", method_25309(class_4783.field_23812))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23812, 2)
         .method_22692('#', class_391.field_1605)
         .method_22694('S', class_4897.field_24413)
         .method_22694('I', class_4897.field_25021)
         .method_22697("I")
         .method_22697("S")
         .method_22697("#")
         .method_22698("has_string", method_25309(class_4897.field_25259))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25139)
         .method_22694('X', class_4897.field_24631)
         .method_22697("XXX")
         .method_22697("X X")
         .method_22698("has_scute", method_25309(class_4897.field_24631))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_24813, 9)
         .method_28593(class_4783.field_23429)
         .method_28595("has_hay_block", method_25309(class_4783.field_23429))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24903)
         .method_28593(class_4897.field_24640)
         .method_28596("white_dye")
         .method_28595("has_bone_meal", method_25309(class_4897.field_24640))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24903)
         .method_28593(class_4783.field_23553)
         .method_28596("white_dye")
         .method_28595("has_white_flower", method_25309(class_4783.field_23553))
         .method_28598(var0, "white_dye_from_lily_of_the_valley");
      class_4951.method_22690(class_4897.field_25168)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1605)
         .method_22697("XX")
         .method_22697("X#")
         .method_22697(" #")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24438)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1605)
         .method_22697("XX")
         .method_22697(" #")
         .method_22697(" #")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24595)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1605)
         .method_22697("XXX")
         .method_22697(" # ")
         .method_22697(" # ")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_24809)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1605)
         .method_22697("X")
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_4951.method_22690(class_4897.field_25211)
         .method_22694('#', class_4897.field_24413)
         .method_22692('X', class_391.field_1605)
         .method_22697("X")
         .method_22697("X")
         .method_22697("#")
         .method_22698("has_stick", method_25309(class_4897.field_24413))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24805)
         .method_28593(class_4897.field_24551)
         .method_28593(class_4897.field_24843)
         .method_28593(class_4897.field_24922)
         .method_28595("has_book", method_25309(class_4897.field_24551))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24541)
         .method_28593(class_4783.field_23410)
         .method_28596("yellow_dye")
         .method_28595("has_yellow_flower", method_25309(class_4783.field_23410))
         .method_28598(var0, "yellow_dye_from_dandelion");
      class_6272.method_28589(class_4897.field_24541, 2)
         .method_28593(class_4783.field_23554)
         .method_28596("yellow_dye")
         .method_28595("has_double_plant", method_25309(class_4783.field_23554))
         .method_28598(var0, "yellow_dye_from_sunflower");
      class_6272.method_28589(class_4897.field_24494, 9)
         .method_28593(class_4783.field_23848)
         .method_28595("has_dried_kelp_block", method_25309(class_4783.field_23848))
         .method_28597(var0);
      class_6272.method_28588(class_4783.field_23848)
         .method_28594(class_4897.field_24494, 9)
         .method_28595("has_dried_kelp", method_25309(class_4897.field_24494))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23906)
         .method_22694('#', class_4897.field_24828)
         .method_22694('X', class_4897.field_25000)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22698("has_nautilus_core", method_25309(class_4897.field_25000))
         .method_22698("has_nautilus_shell", method_25309(class_4897.field_24828))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23286, 4)
         .method_22694('#', class_4783.field_23716)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_polished_granite", method_25309(class_4783.field_23716))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23559, 4)
         .method_22694('#', class_4783.field_23743)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_smooth_red_sandstone", method_25309(class_4783.field_23743))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23276, 4)
         .method_22694('#', class_4783.field_23657)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23465, 4)
         .method_22694('#', class_4783.field_23514)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_polished_diorite", method_25309(class_4783.field_23514))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23675, 4)
         .method_22694('#', class_4783.field_23774)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23495, 4)
         .method_22694('#', class_4783.field_23370)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_end_stone_bricks", method_25309(class_4783.field_23370))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23502, 4)
         .method_22694('#', class_4783.field_23644)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_stone", method_25309(class_4783.field_23644))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23466, 4)
         .method_22694('#', class_4783.field_23505)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_smooth_sandstone", method_25309(class_4783.field_23505))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23255, 4)
         .method_22694('#', class_4783.field_23412)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_smooth_quartz", method_25309(class_4783.field_23412))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23583, 4)
         .method_22694('#', class_4783.field_23695)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_granite", method_25309(class_4783.field_23695))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23632, 4)
         .method_22694('#', class_4783.field_23271)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_andesite", method_25309(class_4783.field_23271))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23910, 4)
         .method_22694('#', class_4783.field_23419)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_red_nether_bricks", method_25309(class_4783.field_23419))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23396, 4)
         .method_22694('#', class_4783.field_23582)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_polished_andesite", method_25309(class_4783.field_23582))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23576, 4)
         .method_22694('#', class_4783.field_23440)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_diorite", method_25309(class_4783.field_23440))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23177, 6)
         .method_22694('#', class_4783.field_23716)
         .method_22697("###")
         .method_22698("has_polished_granite", method_25309(class_4783.field_23716))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23849, 6)
         .method_22694('#', class_4783.field_23743)
         .method_22697("###")
         .method_22698("has_smooth_red_sandstone", method_25309(class_4783.field_23743))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23869, 6)
         .method_22694('#', class_4783.field_23657)
         .method_22697("###")
         .method_22698("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23667, 6)
         .method_22694('#', class_4783.field_23514)
         .method_22697("###")
         .method_22698("has_polished_diorite", method_25309(class_4783.field_23514))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23550, 6)
         .method_22694('#', class_4783.field_23774)
         .method_22697("###")
         .method_22698("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23453, 6)
         .method_22694('#', class_4783.field_23370)
         .method_22697("###")
         .method_22698("has_end_stone_bricks", method_25309(class_4783.field_23370))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23620, 6)
         .method_22694('#', class_4783.field_23505)
         .method_22697("###")
         .method_22698("has_smooth_sandstone", method_25309(class_4783.field_23505))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23451, 6)
         .method_22694('#', class_4783.field_23412)
         .method_22697("###")
         .method_22698("has_smooth_quartz", method_25309(class_4783.field_23412))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23651, 6)
         .method_22694('#', class_4783.field_23695)
         .method_22697("###")
         .method_22698("has_granite", method_25309(class_4783.field_23695))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23191, 6)
         .method_22694('#', class_4783.field_23271)
         .method_22697("###")
         .method_22698("has_andesite", method_25309(class_4783.field_23271))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23354, 6)
         .method_22694('#', class_4783.field_23419)
         .method_22697("###")
         .method_22698("has_red_nether_bricks", method_25309(class_4783.field_23419))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23710, 6)
         .method_22694('#', class_4783.field_23582)
         .method_22697("###")
         .method_22698("has_polished_andesite", method_25309(class_4783.field_23582))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23836, 6)
         .method_22694('#', class_4783.field_23440)
         .method_22697("###")
         .method_22698("has_diorite", method_25309(class_4783.field_23440))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23480, 6)
         .method_22694('#', class_4783.field_23422)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_bricks", method_25309(class_4783.field_23422))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23292, 6)
         .method_22694('#', class_4783.field_23186)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_prismarine", method_25309(class_4783.field_23186))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23193, 6)
         .method_22694('#', class_4783.field_23160)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23561, 6)
         .method_22694('#', class_4783.field_23657)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23420, 6)
         .method_22694('#', class_4783.field_23695)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_granite", method_25309(class_4783.field_23695))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23333, 6)
         .method_22694('#', class_4783.field_23355)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23230, 6)
         .method_22694('#', class_4783.field_23484)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23604, 6)
         .method_22694('#', class_4783.field_23271)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_andesite", method_25309(class_4783.field_23271))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23767, 6)
         .method_22694('#', class_4783.field_23419)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_red_nether_bricks", method_25309(class_4783.field_23419))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23838, 6)
         .method_22694('#', class_4783.field_23459)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_sandstone", method_25309(class_4783.field_23459))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23866, 6)
         .method_22694('#', class_4783.field_23370)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_end_stone_bricks", method_25309(class_4783.field_23370))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23485, 6)
         .method_22694('#', class_4783.field_23440)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_diorite", method_25309(class_4783.field_23440))
         .method_22687(var0);
      class_6272.method_28588(class_4897.field_24421)
         .method_28593(class_4897.field_24622)
         .method_28593(class_4897.field_25069)
         .method_28595("has_creeper_head", method_25309(class_4897.field_25069))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24772)
         .method_28593(class_4897.field_24622)
         .method_28593(class_4897.field_24563)
         .method_28595("has_wither_skeleton_skull", method_25309(class_4897.field_24563))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_24355)
         .method_28593(class_4897.field_24622)
         .method_28593(class_4783.field_23282)
         .method_28595("has_oxeye_daisy", method_25309(class_4783.field_23282))
         .method_28597(var0);
      class_6272.method_28588(class_4897.field_25299)
         .method_28593(class_4897.field_24622)
         .method_28593(class_4897.field_24966)
         .method_28595("has_enchanted_golden_apple", method_25309(class_4897.field_24966))
         .method_28597(var0);
      class_4951.method_22691(class_4783.field_23348, 6)
         .method_22694('~', class_4897.field_25259)
         .method_22694('I', class_4783.field_23886)
         .method_22697("I~I")
         .method_22697("I I")
         .method_22697("I I")
         .method_22698("has_bamboo", method_25309(class_4783.field_23886))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23461)
         .method_22694('I', class_4897.field_24413)
         .method_22694('-', class_4783.field_23326)
         .method_22692('#', class_391.field_1605)
         .method_22697("I-I")
         .method_22697("# #")
         .method_22698("has_stone_slab", method_25309(class_4783.field_23326))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23557)
         .method_22694('#', class_4783.field_23468)
         .method_22694('X', class_4783.field_23883)
         .method_22694('I', class_4897.field_25021)
         .method_22697("III")
         .method_22697("IXI")
         .method_22697("###")
         .method_22698("has_smooth_stone", method_25309(class_4783.field_23468))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23203)
         .method_22692('#', class_391.field_1638)
         .method_22694('X', class_4783.field_23883)
         .method_22697(" # ")
         .method_22697("#X#")
         .method_22697(" # ")
         .method_22698("has_furnace", method_25309(class_4783.field_23883))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23431)
         .method_22692('#', class_391.field_1605)
         .method_22694('@', class_4897.field_24622)
         .method_22697("@@")
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_paper", method_25309(class_4897.field_24622))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23646)
         .method_22692('#', class_391.field_1605)
         .method_22694('@', class_4897.field_25021)
         .method_22697("@@")
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23280)
         .method_22692('#', class_391.field_1605)
         .method_22694('@', class_4897.field_24720)
         .method_22697("@@")
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_flint", method_25309(class_4897.field_24720))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23478)
         .method_22694('I', class_4897.field_25021)
         .method_22694('#', class_4783.field_23644)
         .method_22697(" I ")
         .method_22697("###")
         .method_22698("has_stone", method_25309(class_4783.field_23644))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23852)
         .method_22694('S', class_4897.field_25209)
         .method_22694('#', class_4897.field_25231)
         .method_22697("SSS")
         .method_22697("S#S")
         .method_22697("SSS")
         .method_22698("has_netherite_ingot", method_25309(class_4897.field_25231))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23211)
         .method_22694('#', class_4897.field_25231)
         .method_22697("###")
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_netherite_ingot", method_25309(class_4897.field_25231))
         .method_22687(var0);
      class_6272.method_28589(class_4897.field_25231, 9)
         .method_28593(class_4783.field_23211)
         .method_28596("netherite_ingot")
         .method_28595("has_netherite_block", method_25309(class_4783.field_23211))
         .method_28598(var0, "netherite_ingot_from_netherite_block");
      class_6272.method_28588(class_4897.field_25231)
         .method_28594(class_4897.field_25127, 4)
         .method_28594(class_4897.field_25108, 4)
         .method_28596("netherite_ingot")
         .method_28595("has_netherite_scrap", method_25309(class_4897.field_25127))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23807)
         .method_22694('O', class_4783.field_23222)
         .method_22694('G', class_4783.field_23368)
         .method_22697("OOO")
         .method_22697("GGG")
         .method_22697("OOO")
         .method_22698("has_obsidian", method_25309(class_4783.field_23222))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23361, 4)
         .method_22694('#', class_4783.field_23785)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_blackstone", method_25309(class_4783.field_23785))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23314, 4)
         .method_22694('#', class_4783.field_23534)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23214, 4)
         .method_22694('#', class_4783.field_23549)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22698("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23726, 6)
         .method_22694('#', class_4783.field_23785)
         .method_22697("###")
         .method_22698("has_blackstone", method_25309(class_4783.field_23785))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23395, 6)
         .method_22694('#', class_4783.field_23534)
         .method_22697("###")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23512, 6)
         .method_22694('#', class_4783.field_23549)
         .method_22697("###")
         .method_22698("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23534, 4)
         .method_22694('S', class_4783.field_23785)
         .method_22697("SS")
         .method_22697("SS")
         .method_22698("has_blackstone", method_25309(class_4783.field_23785))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23549, 4)
         .method_22694('#', class_4783.field_23534)
         .method_22697("##")
         .method_22697("##")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23751)
         .method_22694('#', class_4783.field_23395)
         .method_22697("#")
         .method_22697("#")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23884, 6)
         .method_22694('#', class_4783.field_23785)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_blackstone", method_25309(class_4783.field_23785))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23165, 6)
         .method_22694('#', class_4783.field_23534)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22691(class_4783.field_23388, 6)
         .method_22694('#', class_4783.field_23549)
         .method_22697("###")
         .method_22697("###")
         .method_22698("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_22687(var0);
      class_6272.method_28588(class_4783.field_23381)
         .method_28593(class_4783.field_23534)
         .method_28595("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_28597(var0);
      class_4951.method_22690(class_4783.field_23397)
         .method_22694('#', class_4783.field_23534)
         .method_22697("##")
         .method_22698("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_22687(var0);
      class_4951.method_22690(class_4783.field_23708)
         .method_22694('I', class_4897.field_25021)
         .method_22694('N', class_4897.field_24426)
         .method_22697("N")
         .method_22697("I")
         .method_22697("N")
         .method_22698("has_iron_nugget", method_25309(class_4897.field_24426))
         .method_22698("has_iron_ingot", method_25309(class_4897.field_25021))
         .method_22687(var0);
      class_2195.method_10153(class_2994.field_14717).method_10154(var0, "armor_dye");
      class_2195.method_10153(class_2994.field_14724).method_10154(var0, "banner_duplicate");
      class_2195.method_10153(class_2994.field_14723).method_10154(var0, "book_cloning");
      class_2195.method_10153(class_2994.field_14709).method_10154(var0, "firework_rocket");
      class_2195.method_10153(class_2994.field_14713).method_10154(var0, "firework_star");
      class_2195.method_10153(class_2994.field_14712).method_10154(var0, "firework_star_fade");
      class_2195.method_10153(class_2994.field_14714).method_10154(var0, "map_cloning");
      class_2195.method_10153(class_2994.field_14710).method_10154(var0, "map_extending");
      class_2195.method_10153(class_2994.field_14720).method_10154(var0, "repair_item");
      class_2195.method_10153(class_2994.field_14715).method_10154(var0, "shield_decoration");
      class_2195.method_10153(class_2994.field_14708).method_10154(var0, "shulker_box_coloring");
      class_2195.method_10153(class_2994.field_14722).method_10154(var0, "tipped_arrow");
      class_2195.method_10153(class_2994.field_14721).method_10154(var0, "suspicious_stew");
      class_308.method_1373(class_8137.method_37019(class_4897.field_25273), class_4897.field_24397, 0.35F, 200)
         .method_1366("has_potato", method_25309(class_4897.field_25273))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24789), class_4897.field_24755, 0.3F, 200)
         .method_1366("has_clay_ball", method_25309(class_4897.field_24789))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37022(class_391.field_1622), class_4897.field_24862, 0.15F, 200)
         .method_1366("has_log", method_25308(class_391.field_1622))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24517), class_4897.field_25140, 0.1F, 200)
         .method_1366("has_chorus_fruit", method_25309(class_4897.field_24517))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23867.method_10803()), class_4897.field_24917, 0.1F, 200)
         .method_1366("has_coal_ore", method_25309(class_4783.field_23867))
         .method_1368(var0, "coal_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4897.field_25017), class_4897.field_24913, 0.35F, 200)
         .method_1366("has_beef", method_25309(class_4897.field_25017))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24707), class_4897.field_24491, 0.35F, 200)
         .method_1366("has_chicken", method_25309(class_4897.field_24707))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24814), class_4897.field_24715, 0.35F, 200)
         .method_1366("has_cod", method_25309(class_4897.field_24814))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23325), class_4897.field_24494, 0.1F, 200)
         .method_1366("has_kelp", method_25309(class_4783.field_23325))
         .method_1368(var0, "dried_kelp_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4897.field_25201), class_4897.field_24731, 0.35F, 200)
         .method_1366("has_salmon", method_25309(class_4897.field_25201))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24390), class_4897.field_24661, 0.35F, 200)
         .method_1366("has_mutton", method_25309(class_4897.field_24390))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_25297), class_4897.field_24897, 0.35F, 200)
         .method_1366("has_porkchop", method_25309(class_4897.field_25297))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4897.field_24555), class_4897.field_25117, 0.35F, 200)
         .method_1366("has_rabbit", method_25309(class_4897.field_24555))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23681.method_10803()), class_4897.field_24481, 1.0F, 200)
         .method_1366("has_diamond_ore", method_25309(class_4783.field_23681))
         .method_1368(var0, "diamond_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4783.field_23584.method_10803()), class_4897.field_25047, 0.2F, 200)
         .method_1366("has_lapis_ore", method_25309(class_4783.field_23584))
         .method_1368(var0, "lapis_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4783.field_23463.method_10803()), class_4897.field_24997, 1.0F, 200)
         .method_1366("has_emerald_ore", method_25309(class_4783.field_23463))
         .method_1368(var0, "emerald_from_smelting");
      class_308.method_1373(class_8137.method_37022(class_391.field_1633), class_4783.field_23434.method_10803(), 0.1F, 200)
         .method_1366("has_sand", method_25308(class_391.field_1633))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37022(class_391.field_1635), class_4897.field_25108, 1.0F, 200)
         .method_1366("has_gold_ore", method_25308(class_391.field_1635))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23239.method_10803()), class_4897.field_24673, 0.1F, 200)
         .method_1366("has_sea_pickle", method_25309(class_4783.field_23239))
         .method_1368(var0, "lime_dye_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4783.field_23500.method_10803()), class_4897.field_25251, 1.0F, 200)
         .method_1366("has_cactus", method_25309(class_4783.field_23500))
         .method_1367(var0);
      class_308.method_1373(
            class_8137.method_37019(
               class_4897.field_25182,
               class_4897.field_25019,
               class_4897.field_24373,
               class_4897.field_25214,
               class_4897.field_25057,
               class_4897.field_24338,
               class_4897.field_24849,
               class_4897.field_25088,
               class_4897.field_25132,
               class_4897.field_24927
            ),
            class_4897.field_24659,
            0.1F,
            200
         )
         .method_1366("has_golden_pickaxe", method_25309(class_4897.field_25182))
         .method_1366("has_golden_shovel", method_25309(class_4897.field_25019))
         .method_1366("has_golden_axe", method_25309(class_4897.field_24373))
         .method_1366("has_golden_hoe", method_25309(class_4897.field_25214))
         .method_1366("has_golden_sword", method_25309(class_4897.field_25057))
         .method_1366("has_golden_helmet", method_25309(class_4897.field_24338))
         .method_1366("has_golden_chestplate", method_25309(class_4897.field_24849))
         .method_1366("has_golden_leggings", method_25309(class_4897.field_25088))
         .method_1366("has_golden_boots", method_25309(class_4897.field_25132))
         .method_1366("has_golden_horse_armor", method_25309(class_4897.field_24927))
         .method_1368(var0, "gold_nugget_from_smelting");
      class_308.method_1373(
            class_8137.method_37019(
               class_4897.field_25011,
               class_4897.field_24346,
               class_4897.field_24420,
               class_4897.field_24609,
               class_4897.field_25277,
               class_4897.field_24701,
               class_4897.field_24708,
               class_4897.field_25042,
               class_4897.field_24576,
               class_4897.field_24933,
               class_4897.field_24841,
               class_4897.field_25068,
               class_4897.field_24382,
               class_4897.field_24925
            ),
            class_4897.field_24426,
            0.1F,
            200
         )
         .method_1366("has_iron_pickaxe", method_25309(class_4897.field_25011))
         .method_1366("has_iron_shovel", method_25309(class_4897.field_24346))
         .method_1366("has_iron_axe", method_25309(class_4897.field_24420))
         .method_1366("has_iron_hoe", method_25309(class_4897.field_24609))
         .method_1366("has_iron_sword", method_25309(class_4897.field_25277))
         .method_1366("has_iron_helmet", method_25309(class_4897.field_24701))
         .method_1366("has_iron_chestplate", method_25309(class_4897.field_24708))
         .method_1366("has_iron_leggings", method_25309(class_4897.field_25042))
         .method_1366("has_iron_boots", method_25309(class_4897.field_24576))
         .method_1366("has_iron_horse_armor", method_25309(class_4897.field_24933))
         .method_1366("has_chainmail_helmet", method_25309(class_4897.field_24841))
         .method_1366("has_chainmail_chestplate", method_25309(class_4897.field_25068))
         .method_1366("has_chainmail_leggings", method_25309(class_4897.field_24382))
         .method_1366("has_chainmail_boots", method_25309(class_4897.field_24925))
         .method_1368(var0, "iron_nugget_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4783.field_23272.method_10803()), class_4897.field_25021, 0.7F, 200)
         .method_1366("has_iron_ore", method_25309(class_4783.field_23272.method_10803()))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23389), class_4783.field_23344.method_10803(), 0.35F, 200)
         .method_1366("has_clay_block", method_25309(class_4783.field_23389))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23700), class_4897.field_24445, 0.1F, 200)
         .method_1366("has_netherrack", method_25309(class_4783.field_23700))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23196), class_4897.field_24874, 0.2F, 200)
         .method_1366("has_nether_quartz_ore", method_25309(class_4783.field_23196))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23515), class_4897.field_24791, 0.7F, 200)
         .method_1366("has_redstone_ore", method_25309(class_4783.field_23515))
         .method_1368(var0, "redstone_from_smelting");
      class_308.method_1373(class_8137.method_37019(class_4783.field_23172), class_4783.field_23626.method_10803(), 0.15F, 200)
         .method_1366("has_wet_sponge", method_25309(class_4783.field_23172))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23808), class_4783.field_23644.method_10803(), 0.1F, 200)
         .method_1366("has_cobblestone", method_25309(class_4783.field_23808))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23644), class_4783.field_23468.method_10803(), 0.1F, 200)
         .method_1366("has_stone", method_25309(class_4783.field_23644))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23459), class_4783.field_23505.method_10803(), 0.1F, 200)
         .method_1366("has_sandstone", method_25309(class_4783.field_23459))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23160), class_4783.field_23743.method_10803(), 0.1F, 200)
         .method_1366("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23206), class_4783.field_23412.method_10803(), 0.1F, 200)
         .method_1366("has_quartz_block", method_25309(class_4783.field_23206))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23355), class_4783.field_23262.method_10803(), 0.1F, 200)
         .method_1366("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23711), class_4783.field_23225.method_10803(), 0.1F, 200)
         .method_1366("has_black_terracotta", method_25309(class_4783.field_23711))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23793), class_4783.field_23340.method_10803(), 0.1F, 200)
         .method_1366("has_blue_terracotta", method_25309(class_4783.field_23793))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23330), class_4783.field_23360.method_10803(), 0.1F, 200)
         .method_1366("has_brown_terracotta", method_25309(class_4783.field_23330))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23387), class_4783.field_23263.method_10803(), 0.1F, 200)
         .method_1366("has_cyan_terracotta", method_25309(class_4783.field_23387))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23198), class_4783.field_23901.method_10803(), 0.1F, 200)
         .method_1366("has_gray_terracotta", method_25309(class_4783.field_23198))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23773), class_4783.field_23202.method_10803(), 0.1F, 200)
         .method_1366("has_green_terracotta", method_25309(class_4783.field_23773))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23840), class_4783.field_23722.method_10803(), 0.1F, 200)
         .method_1366("has_light_blue_terracotta", method_25309(class_4783.field_23840))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23229), class_4783.field_23603.method_10803(), 0.1F, 200)
         .method_1366("has_light_gray_terracotta", method_25309(class_4783.field_23229))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23857), class_4783.field_23701.method_10803(), 0.1F, 200)
         .method_1366("has_lime_terracotta", method_25309(class_4783.field_23857))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23908), class_4783.field_23404.method_10803(), 0.1F, 200)
         .method_1366("has_magenta_terracotta", method_25309(class_4783.field_23908))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23486), class_4783.field_23178.method_10803(), 0.1F, 200)
         .method_1366("has_orange_terracotta", method_25309(class_4783.field_23486))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23625), class_4783.field_23277.method_10803(), 0.1F, 200)
         .method_1366("has_pink_terracotta", method_25309(class_4783.field_23625))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23816), class_4783.field_23581.method_10803(), 0.1F, 200)
         .method_1366("has_purple_terracotta", method_25309(class_4783.field_23816))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23659), class_4783.field_23477.method_10803(), 0.1F, 200)
         .method_1366("has_red_terracotta", method_25309(class_4783.field_23659))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23264), class_4783.field_23416.method_10803(), 0.1F, 200)
         .method_1366("has_white_terracotta", method_25309(class_4783.field_23264))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23243), class_4783.field_23548.method_10803(), 0.1F, 200)
         .method_1366("has_yellow_terracotta", method_25309(class_4783.field_23243))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23161), class_4897.field_25127, 2.0F, 200)
         .method_1366("has_ancient_debris", method_25309(class_4783.field_23161))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23549), class_4783.field_23787.method_10803(), 0.1F, 200)
         .method_1366("has_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_1367(var0);
      class_308.method_1373(class_8137.method_37019(class_4783.field_23484), class_4783.field_23560.method_10803(), 0.1F, 200)
         .method_1366("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_1367(var0);
      class_308.method_1370(class_8137.method_37019(class_4783.field_23272.method_10803()), class_4897.field_25021, 0.7F, 100)
         .method_1366("has_iron_ore", method_25309(class_4783.field_23272.method_10803()))
         .method_1368(var0, "iron_ingot_from_blasting");
      class_308.method_1370(class_8137.method_37022(class_391.field_1635), class_4897.field_25108, 1.0F, 100)
         .method_1366("has_gold_ore", method_25308(class_391.field_1635))
         .method_1368(var0, "gold_ingot_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23681.method_10803()), class_4897.field_24481, 1.0F, 100)
         .method_1366("has_diamond_ore", method_25309(class_4783.field_23681))
         .method_1368(var0, "diamond_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23584.method_10803()), class_4897.field_25047, 0.2F, 100)
         .method_1366("has_lapis_ore", method_25309(class_4783.field_23584))
         .method_1368(var0, "lapis_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23515), class_4897.field_24791, 0.7F, 100)
         .method_1366("has_redstone_ore", method_25309(class_4783.field_23515))
         .method_1368(var0, "redstone_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23867.method_10803()), class_4897.field_24917, 0.1F, 100)
         .method_1366("has_coal_ore", method_25309(class_4783.field_23867))
         .method_1368(var0, "coal_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23463.method_10803()), class_4897.field_24997, 1.0F, 100)
         .method_1366("has_emerald_ore", method_25309(class_4783.field_23463))
         .method_1368(var0, "emerald_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23196), class_4897.field_24874, 0.2F, 100)
         .method_1366("has_nether_quartz_ore", method_25309(class_4783.field_23196))
         .method_1368(var0, "quartz_from_blasting");
      class_308.method_1370(
            class_8137.method_37019(
               class_4897.field_25182,
               class_4897.field_25019,
               class_4897.field_24373,
               class_4897.field_25214,
               class_4897.field_25057,
               class_4897.field_24338,
               class_4897.field_24849,
               class_4897.field_25088,
               class_4897.field_25132,
               class_4897.field_24927
            ),
            class_4897.field_24659,
            0.1F,
            100
         )
         .method_1366("has_golden_pickaxe", method_25309(class_4897.field_25182))
         .method_1366("has_golden_shovel", method_25309(class_4897.field_25019))
         .method_1366("has_golden_axe", method_25309(class_4897.field_24373))
         .method_1366("has_golden_hoe", method_25309(class_4897.field_25214))
         .method_1366("has_golden_sword", method_25309(class_4897.field_25057))
         .method_1366("has_golden_helmet", method_25309(class_4897.field_24338))
         .method_1366("has_golden_chestplate", method_25309(class_4897.field_24849))
         .method_1366("has_golden_leggings", method_25309(class_4897.field_25088))
         .method_1366("has_golden_boots", method_25309(class_4897.field_25132))
         .method_1366("has_golden_horse_armor", method_25309(class_4897.field_24927))
         .method_1368(var0, "gold_nugget_from_blasting");
      class_308.method_1370(
            class_8137.method_37019(
               class_4897.field_25011,
               class_4897.field_24346,
               class_4897.field_24420,
               class_4897.field_24609,
               class_4897.field_25277,
               class_4897.field_24701,
               class_4897.field_24708,
               class_4897.field_25042,
               class_4897.field_24576,
               class_4897.field_24933,
               class_4897.field_24841,
               class_4897.field_25068,
               class_4897.field_24382,
               class_4897.field_24925
            ),
            class_4897.field_24426,
            0.1F,
            100
         )
         .method_1366("has_iron_pickaxe", method_25309(class_4897.field_25011))
         .method_1366("has_iron_shovel", method_25309(class_4897.field_24346))
         .method_1366("has_iron_axe", method_25309(class_4897.field_24420))
         .method_1366("has_iron_hoe", method_25309(class_4897.field_24609))
         .method_1366("has_iron_sword", method_25309(class_4897.field_25277))
         .method_1366("has_iron_helmet", method_25309(class_4897.field_24701))
         .method_1366("has_iron_chestplate", method_25309(class_4897.field_24708))
         .method_1366("has_iron_leggings", method_25309(class_4897.field_25042))
         .method_1366("has_iron_boots", method_25309(class_4897.field_24576))
         .method_1366("has_iron_horse_armor", method_25309(class_4897.field_24933))
         .method_1366("has_chainmail_helmet", method_25309(class_4897.field_24841))
         .method_1366("has_chainmail_chestplate", method_25309(class_4897.field_25068))
         .method_1366("has_chainmail_leggings", method_25309(class_4897.field_24382))
         .method_1366("has_chainmail_boots", method_25309(class_4897.field_24925))
         .method_1368(var0, "iron_nugget_from_blasting");
      class_308.method_1370(class_8137.method_37019(class_4783.field_23161), class_4897.field_25127, 2.0F, 100)
         .method_1366("has_ancient_debris", method_25309(class_4783.field_23161))
         .method_1368(var0, "netherite_scrap_from_blasting");
      method_25328(var0, "smoking", class_2994.field_14707, 100);
      method_25328(var0, "campfire_cooking", class_2994.field_14716, 600);
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23644), class_4783.field_23326, 2)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_slab_from_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23644), class_4783.field_23502)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_stairs_from_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23644), class_4783.field_23355)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_bricks_from_stone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23644), class_4783.field_23449, 2)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_brick_slab_from_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23644), class_4783.field_23712)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_brick_stairs_from_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23644), class_4783.field_23543)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "chiseled_stone_bricks_stone_from_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23644), class_4783.field_23333)
         .method_31593("has_stone", method_25309(class_4783.field_23644))
         .method_31589(var0, "stone_brick_walls_from_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23459), class_4783.field_23863)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "cut_sandstone_from_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23459), class_4783.field_23575, 2)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "sandstone_slab_from_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23459), class_4783.field_23532, 2)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "cut_sandstone_slab_from_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23863), class_4783.field_23532, 2)
         .method_31593("has_cut_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23459), class_4783.field_23859)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "sandstone_stairs_from_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23459), class_4783.field_23838)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "sandstone_wall_from_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23459), class_4783.field_23250)
         .method_31593("has_sandstone", method_25309(class_4783.field_23459))
         .method_31589(var0, "chiseled_sandstone_from_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23160), class_4783.field_23610)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "cut_red_sandstone_from_red_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23160), class_4783.field_23911, 2)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "red_sandstone_slab_from_red_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23160), class_4783.field_23888, 2)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23610), class_4783.field_23888, 2)
         .method_31593("has_cut_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23160), class_4783.field_23455)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "red_sandstone_stairs_from_red_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23160), class_4783.field_23193)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "red_sandstone_wall_from_red_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23160), class_4783.field_23236)
         .method_31593("has_red_sandstone", method_25309(class_4783.field_23160))
         .method_31589(var0, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23206), class_4783.field_23506, 2)
         .method_31593("has_quartz_block", method_25309(class_4783.field_23206))
         .method_31589(var0, "quartz_slab_from_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23206), class_4783.field_23343)
         .method_31593("has_quartz_block", method_25309(class_4783.field_23206))
         .method_31589(var0, "quartz_stairs_from_quartz_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23206), class_4783.field_23735)
         .method_31593("has_quartz_block", method_25309(class_4783.field_23206))
         .method_31589(var0, "quartz_pillar_from_quartz_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23206), class_4783.field_23614)
         .method_31593("has_quartz_block", method_25309(class_4783.field_23206))
         .method_31589(var0, "chiseled_quartz_block_from_quartz_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23206), class_4783.field_23578)
         .method_31593("has_quartz_block", method_25309(class_4783.field_23206))
         .method_31589(var0, "quartz_bricks_from_quartz_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23808), class_4783.field_23364)
         .method_31593("has_cobblestone", method_25309(class_4783.field_23808))
         .method_31589(var0, "cobblestone_stairs_from_cobblestone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23808), class_4783.field_23351, 2)
         .method_31593("has_cobblestone", method_25309(class_4783.field_23808))
         .method_31589(var0, "cobblestone_slab_from_cobblestone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23808), class_4783.field_23406)
         .method_31593("has_cobblestone", method_25309(class_4783.field_23808))
         .method_31589(var0, "cobblestone_wall_from_cobblestone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23355), class_4783.field_23449, 2)
         .method_31593("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_31589(var0, "stone_brick_slab_from_stone_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23355), class_4783.field_23712)
         .method_31593("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_31589(var0, "stone_brick_stairs_from_stone_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23355), class_4783.field_23333)
         .method_31593("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_31589(var0, "stone_brick_wall_from_stone_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23355), class_4783.field_23543)
         .method_31593("has_stone_bricks", method_25309(class_4783.field_23355))
         .method_31589(var0, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23422), class_4783.field_23676, 2)
         .method_31593("has_bricks", method_25309(class_4783.field_23422))
         .method_31589(var0, "brick_slab_from_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23422), class_4783.field_23613)
         .method_31593("has_bricks", method_25309(class_4783.field_23422))
         .method_31589(var0, "brick_stairs_from_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23422), class_4783.field_23480)
         .method_31593("has_bricks", method_25309(class_4783.field_23422))
         .method_31589(var0, "brick_wall_from_bricks_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23484), class_4783.field_23737, 2)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_31589(var0, "nether_brick_slab_from_nether_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23484), class_4783.field_23204)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_31589(var0, "nether_brick_stairs_from_nether_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23484), class_4783.field_23230)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_31589(var0, "nether_brick_wall_from_nether_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23484), class_4783.field_23457)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23484))
         .method_31589(var0, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23419), class_4783.field_23354, 2)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23419))
         .method_31589(var0, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23419), class_4783.field_23910)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23419))
         .method_31589(var0, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23419), class_4783.field_23767)
         .method_31593("has_nether_bricks", method_25309(class_4783.field_23419))
         .method_31589(var0, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23403), class_4783.field_23828, 2)
         .method_31593("has_purpur_block", method_25309(class_4783.field_23403))
         .method_31589(var0, "purpur_slab_from_purpur_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23403), class_4783.field_23183)
         .method_31593("has_purpur_block", method_25309(class_4783.field_23403))
         .method_31589(var0, "purpur_stairs_from_purpur_block_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23403), class_4783.field_23724)
         .method_31593("has_purpur_block", method_25309(class_4783.field_23403))
         .method_31589(var0, "purpur_pillar_from_purpur_block_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23186), class_4783.field_23398, 2)
         .method_31593("has_prismarine", method_25309(class_4783.field_23186))
         .method_31589(var0, "prismarine_slab_from_prismarine_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23186), class_4783.field_23921)
         .method_31593("has_prismarine", method_25309(class_4783.field_23186))
         .method_31589(var0, "prismarine_stairs_from_prismarine_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23186), class_4783.field_23292)
         .method_31593("has_prismarine", method_25309(class_4783.field_23186))
         .method_31589(var0, "prismarine_wall_from_prismarine_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23536), class_4783.field_23194, 2)
         .method_31593("has_prismarine_brick", method_25309(class_4783.field_23536))
         .method_31589(var0, "prismarine_brick_slab_from_prismarine_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23536), class_4783.field_23341)
         .method_31593("has_prismarine_brick", method_25309(class_4783.field_23536))
         .method_31589(var0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23441), class_4783.field_23687, 2)
         .method_31593("has_dark_prismarine", method_25309(class_4783.field_23441))
         .method_31589(var0, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23441), class_4783.field_23607)
         .method_31593("has_dark_prismarine", method_25309(class_4783.field_23441))
         .method_31589(var0, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23271), class_4783.field_23191, 2)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "andesite_slab_from_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23271), class_4783.field_23632)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "andesite_stairs_from_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23271), class_4783.field_23604)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "andesite_wall_from_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23271), class_4783.field_23582)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "polished_andesite_from_andesite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23271), class_4783.field_23710, 2)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "polished_andesite_slab_from_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23271), class_4783.field_23396)
         .method_31593("has_andesite", method_25309(class_4783.field_23271))
         .method_31589(var0, "polished_andesite_stairs_from_andesite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23582), class_4783.field_23710, 2)
         .method_31593("has_polished_andesite", method_25309(class_4783.field_23582))
         .method_31589(var0, "polished_andesite_slab_from_polished_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23582), class_4783.field_23396)
         .method_31593("has_polished_andesite", method_25309(class_4783.field_23582))
         .method_31589(var0, "polished_andesite_stairs_from_polished_andesite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23788), class_4783.field_23642)
         .method_31593("has_basalt", method_25309(class_4783.field_23788))
         .method_31589(var0, "polished_basalt_from_basalt_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23695), class_4783.field_23651, 2)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "granite_slab_from_granite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23695), class_4783.field_23583)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "granite_stairs_from_granite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23695), class_4783.field_23420)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "granite_wall_from_granite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23695), class_4783.field_23716)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "polished_granite_from_granite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23695), class_4783.field_23177, 2)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "polished_granite_slab_from_granite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23695), class_4783.field_23286)
         .method_31593("has_granite", method_25309(class_4783.field_23695))
         .method_31589(var0, "polished_granite_stairs_from_granite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23716), class_4783.field_23177, 2)
         .method_31593("has_polished_granite", method_25309(class_4783.field_23716))
         .method_31589(var0, "polished_granite_slab_from_polished_granite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23716), class_4783.field_23286)
         .method_31593("has_polished_granite", method_25309(class_4783.field_23716))
         .method_31589(var0, "polished_granite_stairs_from_polished_granite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23440), class_4783.field_23836, 2)
         .method_31593("has_diorite", method_25309(class_4783.field_23440))
         .method_31589(var0, "diorite_slab_from_diorite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23440), class_4783.field_23576)
         .method_31593("has_diorite", method_25309(class_4783.field_23440))
         .method_31589(var0, "diorite_stairs_from_diorite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23440), class_4783.field_23485)
         .method_31593("has_diorite", method_25309(class_4783.field_23440))
         .method_31589(var0, "diorite_wall_from_diorite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23440), class_4783.field_23514)
         .method_31593("has_diorite", method_25309(class_4783.field_23440))
         .method_31589(var0, "polished_diorite_from_diorite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23440), class_4783.field_23667, 2)
         .method_31593("has_diorite", method_25309(class_4783.field_23514))
         .method_31589(var0, "polished_diorite_slab_from_diorite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23440), class_4783.field_23465)
         .method_31593("has_diorite", method_25309(class_4783.field_23514))
         .method_31589(var0, "polished_diorite_stairs_from_diorite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23514), class_4783.field_23667, 2)
         .method_31593("has_polished_diorite", method_25309(class_4783.field_23514))
         .method_31589(var0, "polished_diorite_slab_from_polished_diorite_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23514), class_4783.field_23465)
         .method_31593("has_polished_diorite", method_25309(class_4783.field_23514))
         .method_31589(var0, "polished_diorite_stairs_from_polished_diorite_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23657), class_4783.field_23869, 2)
         .method_31593("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_31589(var0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23657), class_4783.field_23276)
         .method_31593("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_31589(var0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23657), class_4783.field_23561)
         .method_31593("has_mossy_stone_bricks", method_25309(class_4783.field_23657))
         .method_31589(var0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23774), class_4783.field_23550, 2)
         .method_31593("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_31589(var0, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23774), class_4783.field_23675)
         .method_31593("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_31589(var0, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23774), class_4783.field_23755)
         .method_31593("has_mossy_cobblestone", method_25309(class_4783.field_23774))
         .method_31589(var0, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23505), class_4783.field_23620, 2)
         .method_31593("has_smooth_sandstone", method_25309(class_4783.field_23505))
         .method_31589(var0, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23505), class_4783.field_23466)
         .method_31593("has_mossy_cobblestone", method_25309(class_4783.field_23505))
         .method_31589(var0, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23743), class_4783.field_23849, 2)
         .method_31593("has_smooth_red_sandstone", method_25309(class_4783.field_23743))
         .method_31589(var0, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23743), class_4783.field_23559)
         .method_31593("has_smooth_red_sandstone", method_25309(class_4783.field_23743))
         .method_31589(var0, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23412), class_4783.field_23451, 2)
         .method_31593("has_smooth_quartz", method_25309(class_4783.field_23412))
         .method_31589(var0, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23412), class_4783.field_23255)
         .method_31593("has_smooth_quartz", method_25309(class_4783.field_23412))
         .method_31589(var0, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23370), class_4783.field_23453, 2)
         .method_31593("has_end_stone_brick", method_25309(class_4783.field_23370))
         .method_31589(var0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23370), class_4783.field_23495)
         .method_31593("has_end_stone_brick", method_25309(class_4783.field_23370))
         .method_31589(var0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23370), class_4783.field_23866)
         .method_31593("has_end_stone_brick", method_25309(class_4783.field_23370))
         .method_31589(var0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23894), class_4783.field_23370)
         .method_31593("has_end_stone", method_25309(class_4783.field_23894))
         .method_31589(var0, "end_stone_bricks_from_end_stone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23894), class_4783.field_23453, 2)
         .method_31593("has_end_stone", method_25309(class_4783.field_23894))
         .method_31589(var0, "end_stone_brick_slab_from_end_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23894), class_4783.field_23495)
         .method_31593("has_end_stone", method_25309(class_4783.field_23894))
         .method_31589(var0, "end_stone_brick_stairs_from_end_stone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23894), class_4783.field_23866)
         .method_31593("has_end_stone", method_25309(class_4783.field_23894))
         .method_31589(var0, "end_stone_brick_wall_from_end_stone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23468), class_4783.field_23547, 2)
         .method_31593("has_smooth_stone", method_25309(class_4783.field_23468))
         .method_31589(var0, "smooth_stone_slab_from_smooth_stone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23785), class_4783.field_23726, 2)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "blackstone_slab_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23361)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "blackstone_stairs_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23884)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "blackstone_wall_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23534)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23165)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_wall_from_blackstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23785), class_4783.field_23395, 2)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_slab_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23314)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_stairs_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23751)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "chiseled_polished_blackstone_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23549)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_bricks_from_blackstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23785), class_4783.field_23512, 2)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23214)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23785), class_4783.field_23388)
         .method_31593("has_blackstone", method_25309(class_4783.field_23785))
         .method_31589(var0, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23534), class_4783.field_23395, 2)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23314)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23549)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23165)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23534), class_4783.field_23512, 2)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23214)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23388)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23534), class_4783.field_23751)
         .method_31593("has_polished_blackstone", method_25309(class_4783.field_23534))
         .method_31589(var0, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
      class_6896.method_31592(class_8137.method_37019(class_4783.field_23549), class_4783.field_23512, 2)
         .method_31593("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_31589(var0, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23549), class_4783.field_23214)
         .method_31593("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_31589(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
      class_6896.method_31591(class_8137.method_37019(class_4783.field_23549), class_4783.field_23388)
         .method_31593("has_polished_blackstone_bricks", method_25309(class_4783.field_23549))
         .method_31589(var0, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
      method_25329(var0, class_4897.field_24806, class_4897.field_24956);
      method_25329(var0, class_4897.field_25051, class_4897.field_24570);
      method_25329(var0, class_4897.field_24912, class_4897.field_24564);
      method_25329(var0, class_4897.field_24588, class_4897.field_24860);
      method_25329(var0, class_4897.field_24500, class_4897.field_25308);
      method_25329(var0, class_4897.field_24436, class_4897.field_24535);
      method_25329(var0, class_4897.field_25101, class_4897.field_24510);
      method_25329(var0, class_4897.field_24968, class_4897.field_25279);
      method_25329(var0, class_4897.field_24902, class_4897.field_25010);
   }

   private static void method_25329(Consumer<class_4219> var0, class_2451 var1, class_2451 var2) {
      class_9830.method_45318(class_8137.method_37019(var1), class_8137.method_37019(class_4897.field_25231), var2)
         .method_45316("has_netherite_ingot", method_25309(class_4897.field_25231))
         .method_45313(var0, class_8669.field_44382.method_39797(var2.method_10803()).method_21456() + "_smithing");
   }

   private static void method_25317(Consumer<class_4219> var0, class_8525 var1, class_2307<class_2451> var2) {
      class_6272.method_28589(var1, 4).method_28590(var2).method_28596("planks").method_28595("has_log", method_25308(var2)).method_28597(var0);
   }

   private static void method_25321(Consumer<class_4219> var0, class_8525 var1, class_2307<class_2451> var2) {
      class_6272.method_28589(var1, 4).method_28590(var2).method_28596("planks").method_28595("has_logs", method_25308(var2)).method_28597(var0);
   }

   private static void method_25332(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 3)
         .method_22694('#', var2)
         .method_22697("##")
         .method_22697("##")
         .method_22695("bark")
         .method_22698("has_log", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25312(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22690(var1)
         .method_22694('#', var2)
         .method_22697("# #")
         .method_22697("###")
         .method_22695("boat")
         .method_22698("in_water", method_25322(class_4783.field_23900))
         .method_22687(var0);
   }

   private static void method_25324(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_6272.method_28588(var1).method_28593(var2).method_28596("wooden_button").method_28595("has_planks", method_25309(var2)).method_28597(var0);
   }

   private static void method_25340(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 3)
         .method_22694('#', var2)
         .method_22697("##")
         .method_22697("##")
         .method_22697("##")
         .method_22695("wooden_door")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25334(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 3)
         .method_22694('#', class_4897.field_24413)
         .method_22694('W', var2)
         .method_22697("W#W")
         .method_22697("W#W")
         .method_22695("wooden_fence")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25337(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22690(var1)
         .method_22694('#', class_4897.field_24413)
         .method_22694('W', var2)
         .method_22697("#W#")
         .method_22697("#W#")
         .method_22695("wooden_fence_gate")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25338(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22690(var1)
         .method_22694('#', var2)
         .method_22697("##")
         .method_22695("wooden_pressure_plate")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25323(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 6)
         .method_22694('#', var2)
         .method_22697("###")
         .method_22695("wooden_slab")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25331(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 4)
         .method_22694('#', var2)
         .method_22697("#  ")
         .method_22697("## ")
         .method_22697("###")
         .method_22695("wooden_stairs")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25318(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 2)
         .method_22694('#', var2)
         .method_22697("###")
         .method_22697("###")
         .method_22695("wooden_trapdoor")
         .method_22698("has_planks", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25333(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22691(var1, 3)
         .method_22695("sign")
         .method_22694('#', var2)
         .method_22694('X', class_4897.field_24413)
         .method_22697("###")
         .method_22697("###")
         .method_22697(" X ")
         .method_22698("has_" + var5, method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25335(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_6272.method_28588(var1)
         .method_28593(var2)
         .method_28593(class_4783.field_23300)
         .method_28596("wool")
         .method_28595("has_white_wool", method_25309(class_4783.field_23300))
         .method_28597(var0);
   }

   private static void method_25316(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22691(var1, 3)
         .method_22694('#', var2)
         .method_22697("##")
         .method_22695("carpet")
         .method_22698("has_" + var5, method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25314(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var1.method_10803()).method_21456();
      String var6 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22691(var1, 8)
         .method_22694('#', class_4783.field_23509)
         .method_22694('$', var2)
         .method_22697("###")
         .method_22697("#$#")
         .method_22697("###")
         .method_22695("carpet")
         .method_22698("has_white_carpet", method_25309(class_4783.field_23509))
         .method_22698("has_" + var6, method_25309(var2))
         .method_22688(var0, var5 + "_from_white_carpet");
   }

   private static void method_25336(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22690(var1)
         .method_22694('#', var2)
         .method_22692('X', class_391.field_1605)
         .method_22697("###")
         .method_22697("XXX")
         .method_22695("bed")
         .method_22698("has_" + var5, method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25315(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var1.method_10803()).method_21456();
      class_6272.method_28588(var1)
         .method_28593(class_4897.field_24655)
         .method_28593(var2)
         .method_28596("dyed_bed")
         .method_28595("has_bed", method_25309(class_4897.field_24655))
         .method_28598(var0, var5 + "_from_white_bed");
   }

   private static void method_25319(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22690(var1)
         .method_22694('#', var2)
         .method_22694('|', class_4897.field_24413)
         .method_22697("###")
         .method_22697("###")
         .method_22697(" | ")
         .method_22695("banner")
         .method_22698("has_" + var5, method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25326(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 8)
         .method_22694('#', class_4783.field_23434)
         .method_22694('X', var2)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22695("stained_glass")
         .method_22698("has_glass", method_25309(class_4783.field_23434))
         .method_22687(var0);
   }

   private static void method_25327(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 16)
         .method_22694('#', var2)
         .method_22697("###")
         .method_22697("###")
         .method_22695("stained_glass_pane")
         .method_22698("has_glass", method_25309(var2))
         .method_22687(var0);
   }

   private static void method_25330(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      String var5 = class_8669.field_44382.method_39797(var1.method_10803()).method_21456();
      String var6 = class_8669.field_44382.method_39797(var2.method_10803()).method_21456();
      class_4951.method_22691(var1, 8)
         .method_22694('#', class_4783.field_23786)
         .method_22694('$', var2)
         .method_22697("###")
         .method_22697("#$#")
         .method_22697("###")
         .method_22695("stained_glass_pane")
         .method_22698("has_glass_pane", method_25309(class_4783.field_23786))
         .method_22698("has_" + var6, method_25309(var2))
         .method_22688(var0, var5 + "_from_glass_pane");
   }

   private static void method_25311(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_4951.method_22691(var1, 8)
         .method_22694('#', class_4783.field_23344)
         .method_22694('X', var2)
         .method_22697("###")
         .method_22697("#X#")
         .method_22697("###")
         .method_22695("stained_terracotta")
         .method_22698("has_terracotta", method_25309(class_4783.field_23344))
         .method_22687(var0);
   }

   private static void method_25320(Consumer<class_4219> var0, class_8525 var1, class_8525 var2) {
      class_6272.method_28589(var1, 8)
         .method_28593(var2)
         .method_28594(class_4783.field_23216, 4)
         .method_28594(class_4783.field_23709, 4)
         .method_28596("concrete_powder")
         .method_28595("has_sand", method_25309(class_4783.field_23216))
         .method_28595("has_gravel", method_25309(class_4783.field_23709))
         .method_28597(var0);
   }

   private static void method_25328(Consumer<class_4219> var0, String var1, class_705<?> var2, int var3) {
      class_308.method_1365(class_8137.method_37019(class_4897.field_25017), class_4897.field_24913, 0.35F, var3, var2)
         .method_1366("has_beef", method_25309(class_4897.field_25017))
         .method_1368(var0, "cooked_beef_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_24707), class_4897.field_24491, 0.35F, var3, var2)
         .method_1366("has_chicken", method_25309(class_4897.field_24707))
         .method_1368(var0, "cooked_chicken_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_24814), class_4897.field_24715, 0.35F, var3, var2)
         .method_1366("has_cod", method_25309(class_4897.field_24814))
         .method_1368(var0, "cooked_cod_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4783.field_23325), class_4897.field_24494, 0.1F, var3, var2)
         .method_1366("has_kelp", method_25309(class_4783.field_23325))
         .method_1368(var0, "dried_kelp_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_25201), class_4897.field_24731, 0.35F, var3, var2)
         .method_1366("has_salmon", method_25309(class_4897.field_25201))
         .method_1368(var0, "cooked_salmon_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_24390), class_4897.field_24661, 0.35F, var3, var2)
         .method_1366("has_mutton", method_25309(class_4897.field_24390))
         .method_1368(var0, "cooked_mutton_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_25297), class_4897.field_24897, 0.35F, var3, var2)
         .method_1366("has_porkchop", method_25309(class_4897.field_25297))
         .method_1368(var0, "cooked_porkchop_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_25273), class_4897.field_24397, 0.35F, var3, var2)
         .method_1366("has_potato", method_25309(class_4897.field_25273))
         .method_1368(var0, "baked_potato_from_" + var1);
      class_308.method_1365(class_8137.method_37019(class_4897.field_24555), class_4897.field_25117, 0.35F, var3, var2)
         .method_1366("has_rabbit", method_25309(class_4897.field_24555))
         .method_1368(var0, "cooked_rabbit_from_" + var1);
   }

   private static class_5483 method_25322(class_6414 var0) {
      return new class_5483(class_8938.field_45798, var0, class_1827.field_9269);
   }

   private static class_6459 method_25309(class_8525 var0) {
      return method_25310(class_9518.method_43918().method_43915(var0).method_43921());
   }

   private static class_6459 method_25308(class_2307<class_2451> var0) {
      return method_25310(class_9518.method_43918().method_43919(var0).method_43921());
   }

   private static class_6459 method_25310(class_5319... var0) {
      return new class_6459(class_8938.field_45798, class_7781.field_39439, class_7781.field_39439, class_7781.field_39439, var0);
   }

   @Override
   public String method_27387() {
      return "Recipes";
   }
}

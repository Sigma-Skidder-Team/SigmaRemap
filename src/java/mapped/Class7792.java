package mapped;

import net.minecraft.nbt.CompoundNBT;

import java.util.Locale;

public interface Class7792 {
   Class7792 field33425 = method25882(Class4191::new, "MSCorridor");
   Class7792 field33426 = method25882(Class4190::new, "MSCrossing");
   Class7792 field33427 = method25882(Class4189::new, "MSRoom");
   Class7792 field33428 = method25882(Class4192::new, "MSStairs");
   Class7792 field33429 = method25882(Class4174::new, "NeBCr");
   Class7792 field33430 = method25882(Class4171::new, "NeBEF");
   Class7792 field33431 = method25882(Class4168::new, "NeBS");
   Class7792 field33432 = method25882(Class4176::new, "NeCCS");
   Class7792 field33433 = method25882(Class4173::new, "NeCTB");
   Class7792 field33434 = method25882(Class4170::new, "NeCE");
   Class7792 field33435 = method25882(Class4166::new, "NeSCSC");
   Class7792 field33436 = method25882(Class4169::new, "NeSCLT");
   Class7792 field33437 = method25882(Class4226::new, "NeSC");
   Class7792 field33438 = method25882(Class4229::new, "NeSCRT");
   Class7792 field33439 = method25882(Class4172::new, "NeCSR");
   Class7792 field33440 = method25882(Class4227::new, "NeMT");
   Class7792 field33441 = method25882(Class4177::new, "NeRC");
   Class7792 field33442 = method25882(Class4228::new, "NeSR");
   Class7792 field33443 = method25882(Class4175::new, "NeStart");
   Class7792 field33444 = method25882(Class4206::new, "SHCC");
   Class7792 field33445 = method25882(Class4208::new, "SHFC");
   Class7792 field33446 = method25882(Class4200::new, "SH5C");
   Class7792 field33447 = method25882(Class4199::new, "SHLT");
   Class7792 field33448 = method25882(Class4202::new, "SHLi");
   Class7792 field33449 = method25882(Class4204::new, "SHPR");
   Class7792 field33450 = method25882(Class4207::new, "SHPH");
   Class7792 field33451 = method25882(Class4198::new, "SHRT");
   Class7792 field33452 = method25882(Class4205::new, "SHRC");
   Class7792 field33453 = method25882(Class4195::new, "SHSD");
   Class7792 field33454 = method25882(Class4196::new, "SHStart");
   Class7792 field33455 = method25882(Class4201::new, "SHS");
   Class7792 field33456 = method25882(Class4203::new, "SHSSD");
   Class7792 field33457 = method25882(Class4212::new, "TeJP");
   Class7792 field33458 = method25882(Class4183::new, "ORP");
   Class7792 field33459 = method25882(Class4185::new, "Iglu");
   Class7792 field33460 = method25882(Class4184::new, "RUPO");
   Class7792 field33461 = method25882(Class4210::new, "TeSH");
   Class7792 field33462 = method25882(Class4211::new, "TeDP");
   Class7792 field33463 = method25882(Class4224::new, "OMB");
   Class7792 field33464 = method25882(Class4215::new, "OMCR");
   Class7792 field33465 = method25882(Class4223::new, "OMDXR");
   Class7792 field33466 = method25882(Class4218::new, "OMDXYR");
   Class7792 field33467 = method25882(Class4221::new, "OMDYR");
   Class7792 field33468 = method25882(Class4220::new, "OMDYZR");
   Class7792 field33469 = method25882(Class4219::new, "OMDZR");
   Class7792 field33470 = method25882(Class4222::new, "OMEntry");
   Class7792 field33471 = method25882(Class4225::new, "OMPenthouse");
   Class7792 field33472 = method25882(Class4217::new, "OMSimple");
   Class7792 field33473 = method25882(Class4214::new, "OMSimpleT");
   Class7792 field33474 = method25882(Class4216::new, "OMWR");
   Class7792 field33475 = method25882(Class4186::new, "ECP");
   Class7792 field33476 = method25882(Class4187::new, "WMP");
   Class7792 field33477 = method25882(Class4179::new, "BTP");
   Class7792 field33478 = method25882(Class4181::new, "Shipwreck");
   Class7792 field33479 = method25882(Class4182::new, "NeFos");
   Class7792 field33480 = method25882(Class4193::new, "jigsaw");

   Class4178 method25881(Class8761 var1, CompoundNBT var2);

   static Class7792 method25882(Class7792 var0, String var1) {
      return Registry.<Class7792>method9194(Registry.field16116, var1.toLowerCase(Locale.ROOT), var0);
   }
}

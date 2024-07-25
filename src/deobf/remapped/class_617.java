package remapped;

public enum class_617 implements class_4530 {
   field_3517("harp", SoundEvents.field_2889),
   field_3513("basedrum", SoundEvents.field_2582),
   field_3500("snare", SoundEvents.field_2365),
   field_3511("hat", SoundEvents.field_2837),
   field_3508("bass", SoundEvents.field_2015),
   field_3509("flute", SoundEvents.field_2549),
   field_3501("bell", SoundEvents.field_1985),
   field_3519("guitar", SoundEvents.field_1930),
   field_3503("chime", SoundEvents.field_2728),
   field_3518("xylophone", SoundEvents.field_1934),
   field_3502("iron_xylophone", SoundEvents.field_2476),
   field_3505("cow_bell", SoundEvents.field_2826),
   field_3504("didgeridoo", SoundEvents.field_2320),
   field_3516("bit", SoundEvents.field_2820),
   field_3515("banjo", SoundEvents.field_2495),
   field_3512("pling", SoundEvents.field_2279);

   private final String field_3506;
   private final SoundEvent field_3507;

   private class_617(String var3, SoundEvent var4) {
      this.field_3506 = var3;
      this.field_3507 = var4;
   }

   @Override
   public String method_21049() {
      return this.field_3506;
   }

   public SoundEvent method_2881() {
      return this.field_3507;
   }

   public static class_617 method_2882(class_2522 var0) {
      if (!var0.method_8350(class_4783.field_23389)) {
         if (var0.method_8350(class_4783.field_23692)) {
            return field_3501;
         } else if (!var0.method_8349(class_2351.field_11738)) {
            if (var0.method_8350(class_4783.field_23829)) {
               return field_3503;
            } else if (!var0.method_8350(class_4783.field_23889)) {
               if (var0.method_8350(class_4783.field_23810)) {
                  return field_3502;
               } else if (!var0.method_8350(class_4783.field_23784)) {
                  if (var0.method_8350(class_4783.field_23871)) {
                     return field_3504;
                  } else if (!var0.method_8350(class_4783.field_23897)) {
                     if (var0.method_8350(class_4783.field_23429)) {
                        return field_3515;
                     } else if (!var0.method_8350(class_4783.field_23368)) {
                        class_5371 var3 = var0.method_8362();
                        if (var3 == class_5371.field_27438) {
                           return field_3513;
                        } else if (var3 != class_5371.field_27419) {
                           if (var3 == class_5371.field_27391) {
                              return field_3511;
                           } else {
                              return var3 != class_5371.field_27441 && var3 != class_5371.field_27389 ? field_3517 : field_3508;
                           }
                        } else {
                           return field_3500;
                        }
                     } else {
                        return field_3512;
                     }
                  } else {
                     return field_3516;
                  }
               } else {
                  return field_3505;
               }
            } else {
               return field_3518;
            }
         } else {
            return field_3519;
         }
      } else {
         return field_3509;
      }
   }
}

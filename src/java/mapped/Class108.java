package mapped;

public enum Class108 implements Class83 {
   field347("harp", Class6067.field26854),
   field348("basedrum", Class6067.field26848),
   field349("snare", Class6067.field26857),
   field350("hat", Class6067.field26855),
   field351("bass", Class6067.field26849),
   field352("flute", Class6067.field26852),
   field353("bell", Class6067.field26850),
   field354("guitar", Class6067.field26853),
   field355("chime", Class6067.field26851),
   field356("xylophone", Class6067.field26858),
   field357("iron_xylophone", Class6067.field26859),
   field358("cow_bell", Class6067.field26860),
   field359("didgeridoo", Class6067.field26861),
   field360("bit", Class6067.field26862),
   field361("banjo", Class6067.field26863),
   field362("pling", Class6067.field26856);

   private final String field363;
   private final Class9455 field364;
   private static final Class108[] field365 = new Class108[]{
      field347,
      field348,
      field349,
      field350,
      field351,
      field352,
      field353,
      field354,
      field355,
      field356,
      field357,
      field358,
      field359,
      field360,
      field361,
      field362
   };

   private Class108(String var3, Class9455 var4) {
      this.field363 = var3;
      this.field364 = var4;
   }

   @Override
   public String method257() {
      return this.field363;
   }

   public Class9455 method299() {
      return this.field364;
   }

   public static Class108 method300(Class7380 var0) {
      if (!var0.method23448(Blocks.CLAY)) {
         if (var0.method23448(Blocks.field36521)) {
            return field353;
         } else if (!var0.method23446(Class7645.field32734)) {
            if (var0.method23448(Blocks.PACKED_ICE)) {
               return field355;
            } else if (!var0.method23448(Blocks.field36893)) {
               if (var0.method23448(Blocks.field36522)) {
                  return field357;
               } else if (!var0.method23448(Blocks.SOUL_SAND)) {
                  if (var0.method23448(Blocks.PUMPKIN)) {
                     return field359;
                  } else if (!var0.method23448(Blocks.EMERALD_BLOCK)) {
                     if (var0.method23448(Blocks.field36777)) {
                        return field361;
                     } else if (!var0.method23448(Blocks.field36587)) {
                        Class8649 var3 = var0.method23384();
                        if (var3 == Class8649.field38966) {
                           return field348;
                        } else if (var3 != Class8649.field38953) {
                           if (var3 == Class8649.field38963) {
                              return field350;
                           } else {
                              return var3 != Class8649.field38956 && var3 != Class8649.field38957 ? field347 : field351;
                           }
                        } else {
                           return field349;
                        }
                     } else {
                        return field362;
                     }
                  } else {
                     return field360;
                  }
               } else {
                  return field358;
               }
            } else {
               return field356;
            }
         } else {
            return field354;
         }
      } else {
         return field352;
      }
   }
}

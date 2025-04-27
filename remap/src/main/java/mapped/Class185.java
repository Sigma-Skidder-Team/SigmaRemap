// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class185 implements IStringSerializable
{
    field579("harp", Class8520.field35394), 
    field580("basedrum", Class8520.field35388), 
    field581("snare", Class8520.field35397), 
    field582("hat", Class8520.field35395), 
    field583("bass", Class8520.field35389), 
    field584("flute", Class8520.field35392), 
    field585("bell", Class8520.field35390), 
    field586("guitar", Class8520.field35393), 
    field587("chime", Class8520.field35391), 
    field588("xylophone", Class8520.field35398), 
    field589("iron_xylophone", Class8520.field35399), 
    field590("cow_bell", Class8520.field35400), 
    field591("didgeridoo", Class8520.field35401), 
    field592("bit", Class8520.field35402), 
    field593("banjo", Class8520.field35403), 
    field594("pling", Class8520.field35396);
    
    private final String field595;
    private final Class7795 field596;
    
    Class185(final String field595, final Class7795 field596) {
        this.field595 = field595;
        this.field596 = field596;
    }
    
    @Override
    public String getName() {
        return this.field595;
    }
    
    public Class7795 method825() {
        return this.field596;
    }
    
    public static Class185 method826(final Class7096 class7096) {
        final Block method21696 = class7096.method21696();
        if (method21696 == Blocks.field29333) {
            return Class185.field584;
        }
        if (method21696 == Blocks.GOLD_BLOCK) {
            return Class185.field585;
        }
        if (method21696.method11785(Class7188.field27879)) {
            return Class185.field586;
        }
        if (method21696 == Blocks.field29548) {
            return Class185.field587;
        }
        if (method21696 == Blocks.BONE_BLOCK) {
            return Class185.field588;
        }
        if (method21696 == Blocks.IRON_BLOCK) {
            return Class185.field589;
        }
        if (method21696 == Blocks.field29339) {
            return Class185.field590;
        }
        if (method21696 == Blocks.field29337) {
            return Class185.field591;
        }
        if (method21696 == Blocks.field29412) {
            return Class185.field592;
        }
        if (method21696 == Blocks.field29529) {
            return Class185.field593;
        }
        if (method21696 == Blocks.field29340) {
            return Class185.field594;
        }
        final Material method21697 = class7096.method21697();
        if (method21697 == Material.ROCK) {
            return Class185.field580;
        }
        if (method21697 == Material.SAND) {
            return Class185.field581;
        }
        if (method21697 != Material.GLASS) {
            return (method21697 != Material.WOOD) ? Class185.field579 : Class185.field583;
        }
        return Class185.field582;
    }
}

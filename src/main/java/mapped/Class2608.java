// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2608 extends Class2466
{
    public final /* synthetic */ Class2951 field14683;
    
    public Class2608(final Class2951 field14683) {
        this.field14683 = field14683;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Short n = class8699.method29822(Class5260.field22292);
        final String str = class8699.method29822(Class5260.field22308);
        final String method27558 = Class8290.method27558(class8699.method29822(Class5260.field22308));
        final Short obj = class8699.method29822(Class5260.field22292);
        if (str.equals("EntityHorse")) {
            class8699.method29847(31);
            final int intValue = class8699.method29822(Class5260.field22296);
            class8699.method29823(Class5260.field22292, n);
            class8699.method29823(Class5260.field22312, (int)obj);
            class8699.method29823(Class5260.field22296, intValue);
        }
        else {
            class8699.method29847(46);
            class8699.method29823(Class5260.field22312, (int)n);
            final String s = str;
            int i = 0;
            switch (s) {
                case "minecraft:container":
                case "minecraft:chest": {
                    i = obj / 9 - 1;
                    break;
                }
                case "minecraft:crafting_table": {
                    i = 11;
                    break;
                }
                case "minecraft:furnace": {
                    i = 13;
                    break;
                }
                case "minecraft:dropper":
                case "minecraft:dispenser": {
                    i = 6;
                    break;
                }
                case "minecraft:enchanting_table": {
                    i = 12;
                    break;
                }
                case "minecraft:brewing_stand": {
                    i = 10;
                    break;
                }
                case "minecraft:villager": {
                    i = 18;
                    break;
                }
                case "minecraft:beacon": {
                    i = 8;
                    break;
                }
                case "minecraft:anvil": {
                    i = 7;
                    break;
                }
                case "minecraft:hopper": {
                    i = 15;
                    break;
                }
                case "minecraft:shulker_box": {
                    i = 19;
                    break;
                }
                default: {
                    i = obj / 9 - 1;
                    break;
                }
            }
            if (i == -1) {
                Class8563.method28793().method34742().warning("Can't open inventory for 1.14 player! Type: " + str + " Size: " + obj);
            }
            class8699.method29823(Class5260.field22312, i);
            class8699.method29823(Class5260.field22308, method27558);
        }
    }
}

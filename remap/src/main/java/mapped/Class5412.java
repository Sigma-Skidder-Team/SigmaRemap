// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.DataFixUtils;
import javax.annotation.Nullable;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.logging.log4j.Logger;

public class Class5412<T extends TileEntity>
{
    private static final Logger field22540;
    public static final Class5412<Class467> field22541;
    public static final Class5412<Class475> field22542;
    public static final Class5412<Class478> field22543;
    public static final Class5412<Class477> field22544;
    public static final Class5412<Class449> field22545;
    public static final Class5412<Class458> field22546;
    public static final Class5412<Class459> field22547;
    public static final Class5412<Class497> field22548;
    public static final Class5412<Class494> field22549;
    public static final Class5412<Class491> field22550;
    public static final Class5412<Class461> field22551;
    public static final Class5412<Class463> field22552;
    public static final Class5412<Class489> field22553;
    public static final Class5412<Class490> field22554;
    public static final Class5412<Class493> field22555;
    public static final Class5412<Class496> field22556;
    public static final Class5412<Class455> field22557;
    public static final Class5412<Class499> field22558;
    public static final Class5412<Class465> field22559;
    public static final Class5412<Class501> field22560;
    public static final Class5412<Class488> field22561;
    public static final Class5412<Class500> field22562;
    public static final Class5412<Class440> field22563;
    public static final Class5412<Class437> field22564;
    public static final Class5412<Class492> field22565;
    public static final Class5412<Class457> field22566;
    public static final Class5412<Class468> field22567;
    public static final Class5412<Class474> field22568;
    public static final Class5412<Class435> field22569;
    public static final Class5412<Class495> field22570;
    public static final Class5412<Class498> field22571;
    public static final Class5412<Class448> field22572;
    public static final Class5412<Class438> field22573;
    private final Supplier<? extends T> field22574;
    private final Set<Block> field22575;
    private final Type<?> field22576;
    
    @Nullable
    public static ResourceLocation method16520(final Class5412<?> class5412) {
        return Registry.field224.getKey(class5412);
    }
    
    private static <T extends TileEntity> Class5412<T> method16521(final String s, final Class8835<T> class8835) {
        Type choiceType = null;
        try {
            choiceType = Class5494.method16768().getSchema(DataFixUtils.makeKey(Class9528.method35579().getWorldVersion())).getChoiceType(Class9451.field40621, s);
        }
        catch (final IllegalArgumentException ex) {
            Class5412.field22540.error("No data fixer registered for block entity {}", (Object)s);
            if (Class9528.field41021) {
                throw ex;
            }
        }
        if (Class8835.method30856((Class8835<TileEntity>)class8835).isEmpty()) {
            Class5412.field22540.warn("Block entity type {} requires at least one valid block to be defined!", (Object)s);
        }
        return Registry.register(Registry.field224, s, class8835.method30855((Type<?>)choiceType));
    }
    
    public Class5412(final Supplier<? extends T> field22574, final Set<Block> field22575, final Type<?> field22576) {
        this.field22574 = field22574;
        this.field22575 = field22575;
        this.field22576 = field22576;
    }
    
    @Nullable
    public T method16522() {
        return (T)this.field22574.get();
    }
    
    public boolean method16523(final Block class3833) {
        return this.field22575.contains(class3833);
    }
    
    @Nullable
    public T method16524(final IBlockReader class1855, final BlockPos class1856) {
        final TileEntity method6727 = class1855.getTileEntity(class1856);
        return (T)((method6727 != null && method6727.getType() == this) ? method6727 : null);
    }
    
    static {
        field22540 = LogManager.getLogger();
        field22541 = method16521("furnace", Class8835.method30854((Supplier<? extends Class467>)Class467::new, new Block[] { Blocks.field29299 }));
        field22542 = method16521("chest", Class8835.method30854((Supplier<? extends Class475>)Class475::new, new Block[] { Blocks.CHEST}));
        field22543 = method16521("trapped_chest", Class8835.method30854((Supplier<? extends Class478>)Class478::new, new Block[] { Blocks.field29468 }));
        field22544 = method16521("ender_chest", Class8835.method30854((Supplier<? extends Class477>)Class477::new, new Block[] { Blocks.field29409 }));
        field22545 = method16521("jukebox", Class8835.method30854((Supplier<? extends Class449>)Class449::new, new Block[] { Blocks.field29335 }));
        field22546 = method16521("dispenser", Class8835.method30854((Supplier<? extends Class458>)Class458::new, new Block[] { Blocks.field29216 }));
        field22547 = method16521("dropper", Class8835.method30854((Supplier<? extends Class459>)Class459::new, new Block[] { Blocks.field29481 }));
        field22548 = method16521("sign", Class8835.method30854((Supplier<? extends Class497>)Class497::new, new Block[] { Blocks.field29300, Blocks.field29301, Blocks.field29302, Blocks.field29303, Blocks.field29304, Blocks.field29305, Blocks.field29310, Blocks.field29311, Blocks.field29312, Blocks.field29313, Blocks.field29314, Blocks.field29315 }));
        field22549 = method16521("mob_spawner", Class8835.method30854((Supplier<? extends Class494>)Class494::new, new Block[] { Blocks.SPAWNER}));
        field22550 = method16521("piston", Class8835.method30854((Supplier<? extends Class491>)Class491::new, new Block[] { Blocks.MOVING_PISTON}));
        field22551 = method16521("brewing_stand", Class8835.method30854((Supplier<? extends Class461>)Class461::new, new Block[] { Blocks.field29399 }));
        field22552 = method16521("enchanting_table", Class8835.method30854((Supplier<? extends Class463>)Class463::new, new Block[] { Blocks.field29398 }));
        field22553 = method16521("end_portal", Class8835.method30854((Supplier<? extends Class489>)Class489::new, new Block[] { Blocks.field29401 }));
        field22554 = method16521("beacon", Class8835.method30854((Supplier<? extends Class490>)Class490::new, new Block[] { Blocks.field29417 }));
        field22555 = method16521("skull", Class8835.method30854((Supplier<? extends Class493>)Class493::new, new Block[] { Blocks.field29453, Blocks.field29454, Blocks.field29461, Blocks.field29462, Blocks.field29463, Blocks.field29464, Blocks.field29457, Blocks.field29458, Blocks.field29455, Blocks.field29456, Blocks.field29459, Blocks.field29460 }));
        field22556 = method16521("daylight_detector", Class8835.method30854((Supplier<? extends Class496>)Class496::new, new Block[] { Blocks.field29472 }));
        field22557 = method16521("hopper", Class8835.method30854((Supplier<? extends Class455>)Class455::new, new Block[] { Blocks.field29475 }));
        field22558 = method16521("comparator", Class8835.method30854((Supplier<? extends Class499>)Class499::new, new Block[] { Blocks.field29471 }));
        field22559 = method16521("banner", Class8835.method30854((Supplier<? extends Class465>)Class465::new, new Block[] { Blocks.field29555, Blocks.field29556, Blocks.field29557, Blocks.field29558, Blocks.field29559, Blocks.field29560, Blocks.field29561, Blocks.field29562, Blocks.field29563, Blocks.field29564, Blocks.field29565, Blocks.field29566, Blocks.field29567, Blocks.field29568, Blocks.field29569, Blocks.field29570, Blocks.field29571, Blocks.field29572, Blocks.field29573, Blocks.field29574, Blocks.field29575, Blocks.field29576, Blocks.field29577, Blocks.field29578, Blocks.field29579, Blocks.field29580, Blocks.field29581, Blocks.field29582, Blocks.field29583, Blocks.field29584, Blocks.field29585, Blocks.field29586 }));
        field22560 = method16521("structure_block", Class8835.method30854((Supplier<? extends Class501>)Class501::new, new Block[] { Blocks.STRUCTURE_BLOCK}));
        field22561 = method16521("end_gateway", Class8835.method30854((Supplier<? extends Class488>)Class488::new, new Block[] { Blocks.END_GATEWAY}));
        field22562 = method16521("command_block", Class8835.method30854((Supplier<? extends Class500>)Class500::new, new Block[] { Blocks.field29416, Blocks.CHAIN_COMMAND_BLOCK, Blocks.REPEATING_COMMAND_BLOCK}));
        field22563 = method16521("shulker_box", Class8835.method30854((Supplier<? extends Class440>)Class440::new, new Block[] { Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX}));
        field22564 = method16521("bed", Class8835.method30854((Supplier<? extends Class437>)Class437::new, new Block[] { Blocks.field29235, Blocks.field29236, Blocks.field29232, Blocks.field29233, Blocks.field29230, Blocks.field29228, Blocks.field29234, Blocks.field29224, Blocks.field29229, Blocks.field29226, Blocks.field29223, Blocks.field29222, Blocks.field29227, Blocks.field29231, Blocks.field29221, Blocks.field29225 }));
        field22565 = method16521("conduit", Class8835.method30854((Supplier<? extends Class492>)Class492::new, new Block[] { Blocks.CONDUIT}));
        field22566 = method16521("barrel", Class8835.method30854((Supplier<? extends Class457>)Class457::new, new Block[] { Blocks.BARREL}));
        field22567 = method16521("smoker", Class8835.method30854((Supplier<? extends Class468>)Class468::new, new Block[] { Blocks.SMOKER}));
        field22568 = method16521("blast_furnace", Class8835.method30854((Supplier<? extends Class474>)Class474::new, new Block[] { Blocks.BLAST_FURNACE}));
        field22569 = method16521("lectern", Class8835.method30854((Supplier<? extends Class435>)Class435::new, new Block[] { Blocks.LECTERN}));
        field22570 = method16521("bell", Class8835.method30854((Supplier<? extends Class495>)Class495::new, new Block[] { Blocks.BELL}));
        field22571 = method16521("jigsaw", Class8835.method30854((Supplier<? extends Class498>)Class498::new, new Block[] { Blocks.JIGSAW}));
        field22572 = method16521("campfire", Class8835.method30854((Supplier<? extends Class448>)Class448::new, new Block[] { Blocks.CAMPFIRE}));
        field22573 = method16521("beehive", Class8835.method30854((Supplier<? extends Class438>)Class438::new, new Block[] { Blocks.BEE_NEST, Blocks.BEEHIVE}));
    }
}

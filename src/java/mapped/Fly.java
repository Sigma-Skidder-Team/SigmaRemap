package mapped;

import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Fly extends Class5325 {
    public Fly() {
        super(
                ModuleCategory.MOVEMENT,
                "Fly",
                "Allows you to fly like a bird",
                new VanillaFly(),
                new HypixelFly(),
                new MineplexFly(),
                new JetpackFly(),
                new Class5195(),
                new Class5271(),
                new Class5238(),
                new Class5159(),
                new Class5160(),
                new Class5352(),
                new Class5369(),
                new Class5354(),
                new Class5191(),
                new Class5225(),
                new Class5316()
        );
    }
}

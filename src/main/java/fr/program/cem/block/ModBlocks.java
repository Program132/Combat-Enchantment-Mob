package fr.program.cem.block;

import fr.program.cem.TutoMod;
import fr.program.cem.block.custom.Controller;
import fr.program.cem.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutoMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)  {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final RegistryObject<Block> ZOMB_DIRT = registerBlock("zomb_dirt",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIRT)
                    .sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<Block> SKEL_DIRT = registerBlock("skel_dirt",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIRT)
                    .sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<Block> BLAZE_DIRT = registerBlock("blaze_dirt",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DIRT)
                    .sound(SoundType.ROOTED_DIRT)));

    public static final RegistryObject<Block> CONTROLLER = registerBlock("controller",
            () -> new Controller(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.ANVIL)
            ));
}
